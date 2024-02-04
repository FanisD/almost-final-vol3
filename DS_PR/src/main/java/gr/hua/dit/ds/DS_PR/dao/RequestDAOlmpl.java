package gr.hua.dit.ds.DS_PR.dao;

import gr.hua.dit.ds.DS_PR.entity.Request;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RequestDAOlmpl implements RequestDAO{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public List<Request> getRequests() {
        TypedQuery<Request> query = entityManager.createQuery("from Request", Request.class);
        return query.getResultList();
    }

    @Override
    public Request getRequest(Integer request_id) {
        return entityManager.find(Request.class, request_id);
    }

    @Override
    @Transactional
    public void saveRequest(Request request) {
        System.out.println("request "+ request.getId());
        if (request.getId() == null) {
            entityManager.persist(request);
        } else {
            entityManager.merge(request);
        }
    }

    @Override
    @Transactional
    public void deleteRequest(Integer request_id) {
        System.out.println("Deleting student with id: " + request_id);
        entityManager.remove(entityManager.find(Request.class, request_id));
    }

}
