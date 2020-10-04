package com.example.palindrom.Repo;

import com.example.palindrom.Model.PalindromeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PalindromeRepo extends JpaRepository<PalindromeModel, Integer> {
}
