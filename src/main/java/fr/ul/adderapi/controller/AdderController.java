package fr.ul.adderapi.controller;

import fr.ul.adderapi.model.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class AdderController {
    private AdderService adderService;
    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }

    @GetMapping("/current")
    public int currentValue() {
        return adderService.getValue();
    }

    @PostMapping
    public int add(@RequestParam int value) {
        return adderService.add(value);
    }

    @GetMapping("/accumulate")
    @PostMapping
    public int accumulate(@RequestParam int value) {
        return adderService.accumulate(value);
    }


}
