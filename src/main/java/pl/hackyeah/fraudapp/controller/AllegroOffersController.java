package pl.hackyeah.fraudapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hackyeah.fraudapp.AllegroFacade;

@RestController
@RequestMapping("/offers")
public class AllegroOffersController {

    @GetMapping("")
    public void index(){
        AllegroFacade allegroFacade = new AllegroFacade();
        allegroFacade.doAll();
    }

}
