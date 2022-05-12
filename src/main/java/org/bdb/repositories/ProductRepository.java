package org.bdb.repositories;

import org.bdb.entities.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ProductRepository {
    @Inject
    EntityManager em;

    @Transactional
    public void createProduct(Product p){
        em.persist(p);
    }

    @Transactional
    public void deleteProduct(Product p){
        em.remove(p);
    }

    @Transactional
    public List<Product> listProduct(){ 
        List<Product> products = em.createQuery("select p from Product p").getResultList();
        return products;
    }
}
