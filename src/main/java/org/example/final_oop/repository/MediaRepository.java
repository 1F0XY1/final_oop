package org.example.final_oop.repository;

import org.example.final_oop.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {

    // Custom query to find media by filename
    List<Media> findByFilename(String filename);
}
