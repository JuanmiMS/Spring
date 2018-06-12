package org.formacio.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/personal")
public class PersonalController {

    // no toqueu la declaracio de baseDeDades ni el metode getBaseDeDades
    //
    // als metodes que anau afegint, tracteu aquest array com si fos la base de dades
    //
    // per exemple, obtenir la persona amb id 1 sera fer baseDeDades.get(1), etc etc

    private List<String> baseDeDades = new ArrayList<>(Arrays.asList("Joana", "Antonia", "Pere"));

    public List<String> getBaseDeDades() {
        return baseDeDades;
    }

    // Poseu a partir d'aqui els vostre metodes
    @RequestMapping(path = "/info")
    @ResponseBody
    public String info() {
        return "Hi ha " + baseDeDades.size() + " persones";
    }

    @RequestMapping(path = "/consulta")
    @ResponseBody
    public String consulta(@RequestParam(name = "id",
            required = false,
            defaultValue = "0") int id) {

        return baseDeDades.get(id);
    }

    @RequestMapping(path = "/persona/{x}")
    @ResponseBody
    public String persona(@PathVariable int x) {
        return baseDeDades.get(x);
    }

    @RequestMapping(path = "/afegir", method = RequestMethod.POST)
    @ResponseBody
    public String añadir(@RequestParam(name = "nom", defaultValue = "0") String nom) {
        baseDeDades.add(nom);
        return "ok";
    }
}
