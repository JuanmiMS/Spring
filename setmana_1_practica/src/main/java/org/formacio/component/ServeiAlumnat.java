package org.formacio.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ServeiAlumnat {

	
	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */

	@Autowired
	RepositoriAlumnes repoAlumnes;

    @PostConstruct
    public void init() {
        this.inicializarRepoAlumnos();
    }
    private void inicializarRepoAlumnos() {
        matricula(1, "Antonia");
        matricula(2, "Joan");

    }

	public boolean matricula (int id, String alumne) {
		if (alumne == null){
			return false;
		}
        repoAlumnes.altaAlumne(id, alumne);
        return true;
    }

    @Autowired
    public RepositoriAlumnes getRepoAlumnes() {
        return repoAlumnes;
    }

}
