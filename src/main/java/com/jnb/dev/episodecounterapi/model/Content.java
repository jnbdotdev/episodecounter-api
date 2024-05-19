package com.jnb.dev.episodecounterapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data // Anotação do LomBok que gera automaticamente Getters, Setters, HashCode entre outros
@Entity // Quando anotamos a classe com @Entity, dizemos que a classe é uma entidade, e uma entidade é mapeada para uma tabela no banco de dados, ou seja, haverá uma tabela Content no banco de dados
public class Content {

    @Id // Com a anotação @Id nós identificamos a variável abaixo como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Deixamos como responsabilidade do banco de dados fazer o auto incremento
    
    private Long cod;
    private String name;
    private int temp;
    private int ep;
    private Date dtLanc;
    private Date dtUlt;
    private Date dtProx;
    private String statsContent;
    private String statsUser;
    private String type;

}
