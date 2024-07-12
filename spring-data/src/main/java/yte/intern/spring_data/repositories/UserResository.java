package yte.intern.spring_data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yte.intern.spring_data.entities.User;

public interface UserResository extends JpaRepository<User,Long> {
    User findByName(String name);

}
