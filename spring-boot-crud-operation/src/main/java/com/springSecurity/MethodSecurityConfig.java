package com.springSecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
@EnableGlobalMethodSecurity(
  prePostEnabled = true, 
  securedEnabled = true, 
  jsr250Enabled = true)
public class MethodSecurityConfig 
  extends GlobalMethodSecurityConfiguration {
	
	
	@Secured("ROLE_VIEWER")
	public String getUsername() {
	    SecurityContext securityContext = SecurityContextHolder.getContext();
	    return securityContext.getAuthentication().getName();
	}
	@Secured({ "ROLE_VIEWER", "ROLE_EDITOR" })
	public boolean isValidUsername(String username) {
	    return userRoleRepository.isValidUsername(username);
	}
	
}
