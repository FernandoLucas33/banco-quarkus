package br.com.litebanco.service;

import br.com.litebanco.persistence.dao.PixDao;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class PixService {

    @Inject
    PixDao dao;


    
}
