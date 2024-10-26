package com.spark.dynamic.dynamic_query;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EntityManager entityManager;

    public User createUser(String name) {
        User user = new User(name);
        return userRepository.save(user);
    }

    public List<User> findUsersByCriteria(String name) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> user = query.from(User.class);

        if (name != null) {
            query.select(user).where(cb.equal(user.get("name"), name));
        } else {
            query.select(user);
        }

        return entityManager.createQuery(query).getResultList();
    }
}
