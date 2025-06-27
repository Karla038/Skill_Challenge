package com.metaphorce.Shop.ShopMovie.repository;

import com.metaphorce.Shop.ShopMovie.entity.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPeliculaRepository extends JpaRepository<PeliculaEntity, Integer> {

    List<PeliculaEntity> findByDisponibleTrue();
    List<PeliculaEntity> findByDisponibleFalse();

}
