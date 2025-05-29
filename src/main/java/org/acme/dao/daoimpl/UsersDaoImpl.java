package org.acme.dao.daoimpl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.acme.dao.UsersDao;
import org.acme.model.Users;

@ApplicationScoped
public class UsersDaoImpl extends BaseDaoImpl<Users, Long> implements UsersDao {
    public UsersDaoImpl() {
        // Required by Quarkus CDI
        super(Users.class, null); // or pass a dummy/null EM; be cautious if BaseDaoImpl uses it immediately
    }

    @Inject
    public UsersDaoImpl(EntityManager entityManager) {
        super(Users.class, entityManager);
    }
}
