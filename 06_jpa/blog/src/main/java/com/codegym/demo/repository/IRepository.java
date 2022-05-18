package com.codegym.demo.repository;

import com.codegym.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository<Blog,Integer> {

}
