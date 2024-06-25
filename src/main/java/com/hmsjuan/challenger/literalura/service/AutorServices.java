package com.hmsjuan.challenger.literalura.service;

import com.hmsjuan.challenger.literalura.models.Autor;
import com.hmsjuan.challenger.literalura.repositorio.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AutorServices {

    @Autowired
    private AutorRepository autorRepository;



    public List<Autor> getAutoresVivosPorAno(int year) {
        return autorRepository.findAutorByFecha(year);
    }


}
