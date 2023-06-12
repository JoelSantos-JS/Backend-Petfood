package com.petfood.Backend.Petfood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petfood.Backend.Petfood.dto.PetshopDTO;
import com.petfood.Backend.Petfood.dto.PetshopDTO;
import com.petfood.Backend.Petfood.model.Petshop;
import com.petfood.Backend.Petfood.model.Petshop;

import com.petfood.Backend.Petfood.repository.PetshopRepository;
import com.petfood.Backend.Petfood.repository.ProductRepository;

@Service
public class PetshopService {

    @Autowired
    private PetshopRepository petshopRepository;

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Page<PetshopDTO> findAll(Pageable pageable) {
        Page<Petshop> Petshop = petshopRepository.findAll(pageable);

        return Petshop.map(e -> new PetshopDTO(e));

    }

    @Transactional(readOnly = true)
    public PetshopDTO findById(Long id) {
        Petshop Petshop = petshopRepository.getOne(id);
        return new PetshopDTO(Petshop);
    }

    @Transactional
    public PetshopDTO insert(PetshopDTO dto) {
        Petshop Petshop = new Petshop();

        Petshop.setName(dto.getName());
        Petshop.setCategory(dto.getCategory());
        Petshop.setEmphasis(dto.getEmphasis());
        Petshop.setLocation(dto.getLocation());
        Petshop.setLogo(dto.getLogo());

        Petshop = petshopRepository.save(Petshop);

        return new PetshopDTO(Petshop);

    }

    @Transactional
    public PetshopDTO update(Long id, PetshopDTO dto) {
        Petshop Petshop = petshopRepository.getById(id);
        Petshop.setName(dto.getName());
        Petshop.setCategory(dto.getCategory());
        Petshop.setEmphasis(dto.getEmphasis());
        Petshop.setLocation(dto.getLocation());
        Petshop.setLogo(dto.getLogo());

        Petshop = petshopRepository.save(Petshop);

        return new PetshopDTO(Petshop);

    }

    public void deleteById(Long id) {
        try {
            petshopRepository.deleteById(id);
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException("Não foi possivel deletar o produto");
        }

    }

}
