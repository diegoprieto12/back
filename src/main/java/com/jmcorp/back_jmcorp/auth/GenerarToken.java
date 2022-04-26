package com.jmcorp.back_jmcorp.auth;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class GenerarToken {
	
	private static final String PREFIX = "Bearer ";
	private static final String SECRET = "clavesecreta ";
	
	public static String getJwtToken(String usuarioCedula) {
		List<GrantedAuthority> grantedauthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
		String token = Jwts
		.builder()
		.setId("jmcorp_token")
		.setSubject(usuarioCedula)
		.claim("authorities", grantedauthorities.stream()
		.map(GrantedAuthority :: getAuthority)
		.collect(Collectors.toList()))
		.setIssuedAt(new Date(System.currentTimeMillis()))
		.setExpiration(new Date(System.currentTimeMillis() + 43200000))
		.signWith(SignatureAlgorithm.HS512 , SECRET.getBytes())
		.compact();
		
		return PREFIX+token;
		//Bearer SHIUQEIBGIW34
	}
}
