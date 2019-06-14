package com.example.democrud.controller;


import com.example.democrud.model.Persona;
import com.example.democrud.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonaController {

    @Autowired
    private PersonaServiceAPI personaServiceAPI;

    @RequestMapping ("/")
    public String index(Model model){
        model.addAttribute("List",personaServiceAPI.getAll() );
        return "index";
    }

    @GetMapping
    public String showSave(Persona persona, Model model){
        personaServiceAPI.save(persona);
        return "redirect:/";
    }

    public String delete(@PathVariable Long id, Model model){
    personaServiceAPI.delete(id);
    return "redirect:/";
    }

}
