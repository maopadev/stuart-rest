package com.maopa.studio.stuart.controllers

import com.maopa.studio.stuart.entities.Release
import com.maopa.studio.stuart.services.ReleaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/releases")
class ReleaseController (
    @Autowired val service: ReleaseService
){

    @GetMapping
    fun getAll(): ResponseEntity<List<Release>> {
        return ResponseEntity.ok(service.findAll())
    }

    @PostMapping
    fun save(@RequestBody release: Release): ResponseEntity<String> {
        return ResponseEntity.ok(service.save(release))
    }
}