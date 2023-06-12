package com.petfood.Backend.Petfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petfood.Backend.Petfood.dto.PetshopDTO;
import com.petfood.Backend.Petfood.services.PetshopService;

@RestController
@RequestMapping("/petshop")
public class PetshopController {

    @Autowired
    private PetshopService petshopService;

    @GetMapping
    public ResponseEntity<Page<PetshopDTO>> getAllPetshops(Pageable pageable) {
        Page<PetshopDTO> list = petshopService.findAll(pageable);
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PetshopDTO> findById(@PathVariable long id) {
        PetshopDTO Petshop = petshopService.findById(id);
        return ResponseEntity.ok().body(Petshop);
    }

    @PostMapping
    public ResponseEntity<PetshopDTO> createPetshop(@RequestBody PetshopDTO PetshopDTO) {
        PetshopDTO Petshop = petshopService.insert(PetshopDTO);
        return ResponseEntity.ok().body(Petshop);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PetshopDTO> updatePetshop(@PathVariable long id, @RequestBody PetshopDTO PetshopDTO) {
        PetshopDTO PetshopDTO2 = petshopService.update(id, PetshopDTO);

        return ResponseEntity.ok().body(PetshopDTO2);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletePetshop(@PathVariable long id) {
        petshopService.deleteById(id);

        return ResponseEntity.noContent().build();
    }

}
