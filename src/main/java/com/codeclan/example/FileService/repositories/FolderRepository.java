package com.codeclan.example.FileService.repositories;

import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
