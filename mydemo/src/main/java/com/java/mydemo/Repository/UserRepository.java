package com.java.mydemo.Repository;

import com.java.mydemo.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person,Long> {
}
