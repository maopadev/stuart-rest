package com.maopa.studio.stuart.services.impl

import com.maopa.studio.stuart.entities.Release
import com.maopa.studio.stuart.repositories.ReleaseRepository
import com.maopa.studio.stuart.services.ReleaseService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ReleaseServiceImpl(val repository: ReleaseRepository) : ReleaseService {

    /**
     * Find all the releases
     * @return a list of releases
     */
    override fun findAll(): List<Release> {
        try {
            return repository.findAll().toList()
        } catch (e: Exception) {
            throw e.message?.let { Exception(it) }!!
        }
    }

    /**
     * Save a release
     * @param The release to save
     * @return OK
     */
    override fun save(release: Release): String {
        try {
            release.id = UUID.randomUUID().toString().split("-")[0]
            repository.save(release)
            return "OK"
        } catch (e: Exception) {
            throw e.message?.let { Exception(it) }!!
        }
    }


}