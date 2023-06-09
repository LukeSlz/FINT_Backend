package com.example.fintbackend.repositories;

import com.example.fintbackend.models.Contents;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends CrudRepository<Contents, Integer> {
    //TODO: Content parameter is supposed to come from "models". Check this up.
}