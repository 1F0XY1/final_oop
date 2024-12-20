package org.example.final_oop.service;

import org.example.final_oop.entity.Page;
import org.example.final_oop.exception.ResourceNotFoundException;
import org.example.final_oop.repository.PageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService {

    private final PageRepository pageRepository;

    public PageService(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    // Create a new page
    public Page createPage(Page page) {
        return pageRepository.save(page);
    }

    // Get page by ID
    public Page getPageById(Long id) {
        return pageRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Page not found with ID " + id));
    }

    // Get all pages
    public List<Page> getAllPages() {
        return pageRepository.findAll();
    }

    // Update an existing page
    public Page updatePage(Long id, Page updatedPage) {
        Page existingPage = getPageById(id); // Reuse getPageById to fetch the page
        existingPage.setTitle(updatedPage.getTitle());
        existingPage.setContent(updatedPage.getContent());
        existingPage.setLastModified(updatedPage.getLastModified());
        return pageRepository.save(existingPage);
    }

    // Delete a page by ID
    public void deletePage(Long id) {
        if (!pageRepository.existsById(id)) {
            throw new ResourceNotFoundException("Page not found with ID " + id);
        }
        pageRepository.deleteById(id);
    }
}
