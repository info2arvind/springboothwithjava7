package org.aks.springboot.repositories;

import org.aks.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
 
    User findByName(String name);
 
}
