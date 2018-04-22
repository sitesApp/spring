package com.eci.cosw.springbootsecureapi.repositories;

import com.eci.cosw.springbootsecureapi.model.KeyWords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeyWordsRepository extends JpaRepository<KeyWords, String> {
}
