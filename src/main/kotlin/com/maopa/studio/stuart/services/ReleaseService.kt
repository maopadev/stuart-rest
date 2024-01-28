package com.maopa.studio.stuart.services

import com.maopa.studio.stuart.entities.Release
import org.springframework.stereotype.Service

@Service
interface ReleaseService {

    /**
     * Find all the releases
     * @return a list of releases
     */
    fun findAll(): List<Release>

    /**
     * Save a release
     * @param The release to save
     * @return OK
     */
    fun save(release: Release): String
}