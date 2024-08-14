package com.example.todo.repositories;

import com.example.todo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer> {
//UserModel getusers(String email_id,String password );
//UserModel findByEmailid(String email_id);

    //@Query("SELECT * FROM users WHERE users.email_id = ?1")
    @Query("SELECT u FROM UserModel u WHERE u.email_id= :email")

    UserModel findUserByEmail(@Param("email") String email);
}
