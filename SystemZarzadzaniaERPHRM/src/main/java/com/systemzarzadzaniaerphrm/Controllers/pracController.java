package com.systemzarzadzaniaerphrm.Controllers;
import com.systemzarzadzaniaerphrm.DBconfig.DBrepo;
import com.systemzarzadzaniaerphrm.Entity.Pracownik;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ControllerAdvice
@AllArgsConstructor
@NoArgsConstructor
@RestController
public class pracController {

    @Autowired
    DBrepo HRMSrepo;


    @GetMapping("/pracownicy")
    public List<Pracownik> getPracownicy() {
        return (List<DaneTerytowe>) terytRepo.findAll();
    }
    @PostMapping("/pracownicy")
    public DaneTerytowe SaveTeryt(@RequestBody(required = false) DaneTerytowe daneTerytowe) {
        return terytRepo.save(daneTerytowe);
    }

    @PutMapping("/pracownicy/{id}")
    public DaneTerytowe UpdateTeryt (@PathVariable long id,@RequestBody(required = false) DaneTerytowe daneTerytowe){
        return terytRepo.save(daneTerytowe);
    }


    @DeleteMapping("/pracownicy/Delete/{id}")
    public String DeleteTeryt(@PathVariable (value= "id") long id) {
        Pracownik prac = HRMSrepo.findById(id)
                .orElseThrow(() -> new RuntimeException(("Nie znaleziono rekordu o podanym id:")+id));
        HRMSrepo.delete(prac);
        return "Pomyślnie usunięto rekord o podanym id:"+id;

    }}
