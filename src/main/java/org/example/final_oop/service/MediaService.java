package org.example.final_oop.service;

import org.example.final_oop.entity.Media;
import org.example.final_oop.exception.ResourceNotFoundException;
import org.example.final_oop.repository.MediaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    private final MediaRepository mediaRepository;

    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    // Upload media
    public Media uploadMedia(Media media) {
        return mediaRepository.save(media);
    }

    // Get media by ID
    public Media getMediaById(Long id) {
        return mediaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Media not found with ID " + id));
    }

    // Get all media
    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    // Delete media by ID
    public void deleteMedia(Long id) {
        if (!mediaRepository.existsById(id)) {
            throw new ResourceNotFoundException("Media not found with ID " + id);
        }
        mediaRepository.deleteById(id);
    }
}
