package com.example.Repository;

import com.example.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User , Integer> {
    public User findFirstByEmail(String newEmail);
}
