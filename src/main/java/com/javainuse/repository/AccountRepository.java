package com.javainuse.repository;

import com.javainuse.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    @Query(value = "select * from account", nativeQuery = true)
    List<AccountEntity> getAllAccount();
}
