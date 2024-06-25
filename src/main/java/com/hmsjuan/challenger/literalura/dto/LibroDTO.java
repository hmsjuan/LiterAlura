package com.hmsjuan.challenger.literalura.dto;



import com.hmsjuan.challenger.literalura.models.Autor;


public record LibroDTO(int idLibro,
                       String titulo,
                       Autor autor,
                       String idioma,
                       int numeroDeDescargas
) {
}

