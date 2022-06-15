package com.te.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.crud.dto.Categories;

public interface CatgRepository extends JpaRepository<Categories, Integer>  {

}
