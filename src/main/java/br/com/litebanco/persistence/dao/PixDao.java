package br.com.litebanco.persistence.dao;

import br.com.litebanco.persistence.models.Pix;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@RequestScoped
public class PixDao {

    EntityManager em;

    public PixDao(EntityManager em){
        this.em = em;
    }

    public Pix verificaChavePix(String cpf){
        String nameQuery = "CONSULTA_CHAVE_PIX";
        TypedQuery <Pix> query = em.createNamedQuery(nameQuery, Pix.class);
        query.setParameter("cpf", cpf);
        try{
            return query.getSingleResult(); 
        } catch(NoResultException e){
            return null;
        }
               
    }
    @Transactional
    public int inserPix(Pix pix){
        String nameQuery = "INSERI_PIX";
        Query query = em.createNamedQuery(nameQuery);
        query.setParameter("cpf", pix.getCpf());
        query.setParameter("nome", pix.getNome());
        query.setParameter("instituicao", pix.getInstituicao());
        query.setParameter("chave", pix.getChave());

        return query.executeUpdate();
    }
}
