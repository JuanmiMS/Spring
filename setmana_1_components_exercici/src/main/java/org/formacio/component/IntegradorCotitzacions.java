package org.formacio.component;

import org.springframework.stereotype.Component;

public interface IntegradorCotitzacions {

	public float obteMitjanaDiariaCotitzacions();
	
	float obteCotitzacio(String empresa);
}
