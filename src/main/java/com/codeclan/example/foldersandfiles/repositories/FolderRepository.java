package com.codeclan.example.foldersandfiles.repositories;

import com.codeclan.example.foldersandfiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
