package com.codeclan.example.FileService.repositories;

import com.codeclan.example.FileService.models.File;
import com.codeclan.example.FileService.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long>  {
}
