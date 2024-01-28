package com.maopa.studio.stuart.repositories

import com.maopa.studio.stuart.entities.Release
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.stereotype.Repository

@Repository
@EnableMongoRepositories
interface ReleaseRepository : MongoRepository<Release, Long>