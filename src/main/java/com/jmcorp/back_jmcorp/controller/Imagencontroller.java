package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.repository.ImagenRepository;
import com.jmcorp.back_jmcorp.service.ImagenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Imagencontroller {

    @Autowired
    ImagenService imagenService;

    @Autowired
    ImagenRepository imageRepository;

    @GetMapping("/listarImagen")
    public List<Timagen> listarImagen() {
        return imagenService.listarImagen();
    }

    @GetMapping("/listarImagenPorId")
    public Timagen listarImagenPorId(@RequestParam("id_imagen") Long id_imagen) {
		final Optional<Timagen> retrievedImage = imageRepository.findByName(id_imagen);
		Timagen img = new Timagen(retrievedImage.get().getname(), retrievedImage.get().gettype(),
				decompressBytes(retrievedImage.get().getpicByte()));
        //Timagen imagen = imagenService.listarPorIdImagen(id_imagen);
        //if (imagen != null) {
            return img;//imagen;
       // }
        //return new Timagen();
    }

    @PostMapping("/crearImagen")
    @ResponseBody
    public Timagen crearImagen(@RequestBody Timagen imagen) {
        return this.imagenService.crearImagen(imagen);
    }

    @DeleteMapping(value = "/eliminarImagen/{id_imagen}")
    public void eliminarImagen(@PathVariable Long id_imagen) {
        try {
            imagenService.eliminarImagen(id_imagen);
        } catch (Exception e) {
            System.out.println("Error al eliminar el imagen");
        }
    }

    @PutMapping("/actualizarImagen/{id_imagen}")
    public Timagen actualizarImagen(@RequestBody Timagen imagen) {
        Timagen actualizarImagen = imagenService.actualizarImagen(imagen.getId_imagen());
        actualizarImagen.setname(imagen.getname());
        actualizarImagen.settype(imagen.gettype());
        actualizarImagen.setpicByte(imagen.getpicByte());
        imagenService.crearImagen(actualizarImagen);
        return actualizarImagen;
    }



    @PostMapping("/crearimagen2")
	public BodyBuilder uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {

		System.out.println("Original Image Byte Size - " + file.getBytes().length);
		Timagen img = new Timagen(file.getOriginalFilename(), file.getContentType(),
				compressBytes(file.getBytes()));
		imageRepository.save(img);
		return ResponseEntity.status(HttpStatus.OK);
	}

	@GetMapping(path = { "/get/{id_imagen}" })
	public Timagen getImage(@PathVariable("id_imagen") Long id_imagen) throws IOException {

		final Optional<Timagen> retrievedImage = imageRepository.findById(id_imagen);
		Timagen img = new Timagen(retrievedImage.get().getname(), retrievedImage.get().gettype(),
				decompressBytes(retrievedImage.get().getpicByte()));
		return img;
	}

	// compress the image bytes before storing it in the database
	public static byte[] compressBytes(byte[] data) {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		} catch (IOException e) {
		}
		System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

		return outputStream.toByteArray();
	}

	// uncompress the image bytes before returning it to the angular application
	public static byte[] decompressBytes(byte[] data) {
		Inflater inflater = new Inflater();
		inflater.setInput(data);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		try {
			while (!inflater.finished()) {
				int count = inflater.inflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			outputStream.close();
		} catch (IOException ioe) {
		} catch (DataFormatException e) {
		}
		return outputStream.toByteArray();
	}
}
