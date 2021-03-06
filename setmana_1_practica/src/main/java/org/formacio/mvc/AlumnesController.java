package org.formacio.mvc;

import org.formacio.component.RepositoriAlumnes;
import org.formacio.component.ServeiAlumnat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlumnesController {

    @Autowired
    private ServeiAlumnat Servei;

    @RequestMapping(path = "/alumnes")
    @ResponseBody
    public Integer nombreAlumnes() {
        return Servei.getRepoAlumnes().llistaAlumnes().size();
    }
}
