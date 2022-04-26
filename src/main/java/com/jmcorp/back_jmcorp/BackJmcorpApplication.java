
package com.jmcorp.back_jmcorp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.jmcorp.back_jmcorp.auth.JWTAuthorizationFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BackJmcorpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackJmcorpApplication.class, args);
	}

	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable().antMatcher("/**")
					.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
					.authorizeRequests().antMatchers(HttpMethod.GET, "/").permitAll()
					// PERSONA
					// .antMatchers(HttpMethod.POST, "/crearPersona").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarPersona").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarPersonaPorId/{id_persona}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarPersona/{id_persona}").permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarPersona/{id_persona}").permitAll()paplica
					// USUARIO
					// .antMatchers(HttpMethod.POST, "/crearUsuario").permitAll()
					.antMatchers(HttpMethod.GET, "/listarUsuario").permitAll()
					.antMatchers(HttpMethod.POST, "/crearimagen2").permitAll()
					.antMatchers(HttpMethod.GET, "/get/{id_imagen}").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarUsuarioPorId").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarUsuario/{id_usuario}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarUsuario").permitAll()
					.antMatchers(HttpMethod.PUT, "/actualizarToken").permitAll()
					// TIPO USUARIO
					// .antMatchers(HttpMethod.POST, "/crearTipoUsuario").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarTipoUsuario").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarTipoUsuarioPorId/{id_t_usuario}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarTipoUsuario/{id_t_usuario}").permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarTipoUsuario/{id_t_usuario}").permitAll()
					// PROVEEDOR
					// .antMatchers(HttpMethod.POST, "/crearProveedor").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarProveedor").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarProveedorPorId").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarProveedor/{id_proveedor}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarProveedor").permitAll()
					// EMPRESA
					// .antMatchers(HttpMethod.POST, "/crearEmpresa").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarEmpresa").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarEmpresaPorId/{id_empresa}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarEmpresa/{id_empresa}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarEmpresa/{id_empresa}").permitAll()
					// CLIENTE
					// .antMatchers(HttpMethod.POST, "/crearCliente").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarCliente").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarClientePorId/{id_cliente}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarCliente/{id_cliente}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarCliente/{id_cliente}").permitAll()
					// MEDIDA
					// .antMatchers(HttpMethod.POST, "/crearMedida").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarMedida").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarMedidaPorId/{id_medida}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarMedida/{id_medida}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarMedida/{id_medida}").permitAll()
					// LOCAL
					// .antMatchers(HttpMethod.POST,
					// "/crearLocal").permitAll().antMatchers(HttpMethod.GET, "/listarLocal")
					// .permitAll().antMatchers(HttpMethod.GET,
					// "/listarLocalPorId/{id_local}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarLocal/{id_local}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarLocal/{id_local}").permitAll()
					// BODEGA
					// .antMatchers(HttpMethod.POST, "/crearBodega").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarBodega").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarBodegaPorId/{id_bodega}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarBodega/{id_bodega}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarBodega/{id_bodega}").permitAll()
					// CATALOGO PRODUCTO
					// .antMatchers(HttpMethod.POST, "/crearCatalogoProducto").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarCatalogoProducto").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarCatalogoProductoPorId/{id_catalogo}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarCatalogoProducto/{id_catalogo}").permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarCatalogoProducto/{id_catalogo}").permitAll()
					// CATEGORIA ARTICULO
					// .antMatchers(HttpMethod.POST, "/crearCategoriaArticulo").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarCategoriaArticulo").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarCategoriaArticuloPorId/{id_cat_articulo}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarCategoriaArticulo/{id_cat_articulo}").permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarCategoriaArticulo/{id_cat_articulo}").permitAll()
					// CATEGORIA PRODUCTO
					// .antMatchers(HttpMethod.POST, "/crearCategoriaProducto").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarCategoriaProducto").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarCategoriaProductoPorId/{id_cat_producto}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarCategoriaProducto/{id_cat_producto}").permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarCategoriaProducto/{id_cat_producto}").permitAll()
					// TALLER
					// .antMatchers(HttpMethod.POST, "/crearTaller").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarTaller").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarTallerPorId/{id_taller}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarTaller/{id_taller}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarTaller/{id_taller}").permitAll()
					// ENVIOS
					// .antMatchers(HttpMethod.POST, "/crearEnvios").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarEnvios").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarEnviosPorId/{id_envios}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarEnvios/{id_envios}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarEnvios/{id_envios}").permitAll()
					// ARTICULOS
					// .antMatchers(HttpMethod.POST, "/crearArticulo").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarArticulo").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarArticuloPorId/{id_articulo}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarArticulo/{id_articulo}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarArticulo/{id_articulo}").permitAll()
					// PRODUCTO BODEGA
					// .antMatchers(HttpMethod.POST, "/crearProductoBodega").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarProductoBodega").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarProductoBodegaPorId/{id_producto_bodega}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarProductoBodega/{id_producto_bodega}").permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarProductoBodega/{id_producto_bodega}").permitAll()
					// PRODUCTO
					// .antMatchers(HttpMethod.POST, "/crearProducto").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarProducto").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarProductoPorId/{id_producto}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarProducto/{id_producto}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarProducto/{id_producto}").permitAll()
					// PRODUCTO COMPROMETIDO
					// .antMatchers(HttpMethod.PUT, "/actualizarPrecioProducto").permitAll()
					// .antMatchers(HttpMethod.POST, "/crearProductoComprometido").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarProductoComprometido").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarProductoComprometidoPorId/{id_producto_comprometido}")
					// .permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarProductoComprometido/{id_producto_comprometido}")
					// .permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarProductoComprometido/{id_producto_comprometido}")
					// .permitAll()
					// PEDIDO
					// .antMatchers(HttpMethod.POST, "/crearPedido").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarPedido").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarPedidoPorId/{id_pedido}").permitAll()
					// .antMatchers(HttpMethod.DELETE, "/eliminarPedido/{id_pedido}").permitAll()
					// .antMatchers(HttpMethod.PUT, "/actualizarPedido/{id_pedido}").permitAll()
					// DESTINATARIO
					// .antMatchers(HttpMethod.POST, "/crearDestinatario").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarDestinatario").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarDestinatarioPorId/{id_destinatario}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarDestinatario/{id_destinatario}").permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarDestinatario/{id_destinatario}").permitAll()
					// DETALLE PEDIDO
					// .antMatchers(HttpMethod.POST, "/crearDetallePedido").permitAll()
					// .antMatchers(HttpMethod.GET, "/listarDetallePedido").permitAll()
					// .antMatchers(HttpMethod.GET,
					// "/listarDetallePedidoPorId/{id_detalle_pedido}").permitAll()
					// .antMatchers(HttpMethod.DELETE,
					// "/eliminarDetallePedido/{id_detalle_pedido}").permitAll()
					// .antMatchers(HttpMethod.PUT,
					// "/actualizarDetallePedido/{id_detalle_pedido}").permitAll()
					.antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/**",
							"/swagger-ui.html", "/webjars/**")
					.permitAll().anyRequest().authenticated().and().cors();
		}

		@Bean
		public WebMvcConfigurer CORSConfigurer() {
			return new WebMvcConfigurer() {
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*")
							.allowedHeaders("*");
				}
			};
		}
	}
}
