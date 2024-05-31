package it.nextdevs.gestioneEventi.controller;

import it.nextdevs.gestioneEventi.model.Utente;
import it.nextdevs.gestioneEventi.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @GetMapping("/utenti")
    public Page<Utente> getAllUtenti(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "15") int size,
                                     @RequestParam(defaultValue = "id") String sortBy) {
        return utenteService.getAllUtenti(page, size, sortBy);
    }
}
