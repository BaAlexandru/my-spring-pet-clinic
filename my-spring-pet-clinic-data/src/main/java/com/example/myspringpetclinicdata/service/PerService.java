package com.example.myspringpetclinicdata.service;

import com.example.myspringpetclinicdata.model.Pet;

import java.util.Set;

public interface PerService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
