package org.acme.dao;

import org.acme.model.Users;

import java.util.List;

public interface UsersDao extends BaseDao<Users, Long> {
    boolean save(Users entity);
    Users findById(Long id);
    List<Users> findAll();
    boolean update(Users entity);
    boolean deleteById(Long id);
}
