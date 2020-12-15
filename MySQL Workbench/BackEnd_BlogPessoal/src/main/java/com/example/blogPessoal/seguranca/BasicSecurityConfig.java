package com.example.blogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//habilitar a configuração web security
@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {
	//injeção de independencia
	@Autowired
	private UserDetailsService userDetailsService;

	//Deixar explicito que é uma subescrita de um método
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { //trows é uma tratativa de erros 
		auth.userDetailsService(userDetailsService);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Override 
	//estanciando o objeto HttpSecurity
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/usuarios/logar").permitAll()     //essa configuração libera endpoints, ou seja, alguns caminhos dentro do controller, para que tenha acesso sem passar uma chave Token
		.antMatchers("/usuarios/cadastrar").permitAll() //o endpoint que iremos liberar será "/usuarios/logar" e "/usuarios/cadastrar"
		.anyRequest().authenticated() 					//Todas as outras requisições deverão ser autenticadas, ou seja necessitará passar a chave
		.and().httpBasic()								//Utilizamos o padrão basic para gerar nossa chave Token
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) //Indica o tipo de sessão que iremos utilizar STATELESS = Não guarda sessão nenhuma
		.and().cors()									//Habilitar o cors
		.and().csrf().disable();						//Desabilitar o csrf, utilizarei todas as configurações padrão. não será uma cofiguração personalizada referente a essa arquitetura csrf
	}
}
