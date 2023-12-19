package com.SpringSecuirty.JWT.config;

import java.io.IOException;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

/*
 * @notnull added so that the parameters shall not be null
 * @component added so that the spring will add this 
 * @RequiredArgconstructor added so that any final private variable willbe creted with the constructor
 */
/*
 * To process the userEmail a seperate class will be created 
 */

@Component
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(
			
			@NonNull HttpServletRequest request, 
			@NonNull HttpServletResponse response,
			@NonNull FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		 final String jwt;
		 
			final String authheader= request.getHeader("Authorization");
			if(authheader == null || !authheader.startsWith("Bearer ")) {
				filterChain.doFilter(request, response);
				return;
			}
			
			//it will check for the bearer and space name so total that will take 7 spacing so only 7 is used
			jwt=authheader.substring(7);
		
	}
	
	
	
	//now check for the bearer and null issue
	
	
}
