package com.example.ec.repositories;

import com.example.ec.dto.TourPackage;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TourPackageRepository extends CrudRepository<TourPackage, String > {
    Optional<TourPackage> findByName(String name);
}
