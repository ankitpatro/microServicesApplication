package com.abhiani.project.microServicesProject.repository;

import com.abhiani.project.microServicesProject.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
