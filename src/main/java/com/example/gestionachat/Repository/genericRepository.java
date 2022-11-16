package com.example.gestionachat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface genericRepository <T,ID> extends JpaRepository<T,ID> {
}
