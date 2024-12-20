package org.example.final_oop.controller;

import org.example.final_oop.entity.Page;
import org.example.final_oop.service.PageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pages")
public class PageController {

    private final PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @PostMapping
    public ResponseEntity<Page> createPage(@RequestBody Page page) {
        Page createdPage = pageService.createPage(page);
        return new ResponseEntity<>(createdPage, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Page> getPageById(@PathVariable Long id) {
        Page page = pageService.getPageById(id);
        return ResponseEntity.ok(page);
    }

    @GetMapping
    public ResponseEntity<List<Page>> getAllPages() {
        List<Page> pages = pageService.getAllPages();
        return ResponseEntity.ok(pages);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Page> updatePage(@PathVariable Long id, @RequestBody Page page) {
        Page updatedPage = pageService.updatePage(id, page);
        return ResponseEntity.ok(updatedPage);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePage(@PathVariable Long id) {
        pageService.deletePage(id);
        return ResponseEntity.noContent().build();
    }
}
