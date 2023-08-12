package com.makler.platform.dao;

import com.makler.platform.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<Users, UUID> {

    List<Users> findByName(String name);
    Users findByEmail(String email);

    Users findByPhone(Long phone);

}
