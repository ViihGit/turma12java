package com.example.blogPessoal.seguranca;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.blogPessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails{
	
	private static final long SerialVersionUID =1L; //controle interno
	private String userName;
	private String passowrd;
	
	public UserDetailsImpl(Usuario user) { //construtor de classe recebendo como parametro o user
		this.userName = user.getUsuario();
		this.passowrd = user.getSenha(); //populando o user com login e senha
	}

	public UserDetailsImpl() {}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return passowrd;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
