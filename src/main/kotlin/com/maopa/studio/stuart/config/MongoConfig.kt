package com.maopa.studio.stuart.config

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate

@Configuration
class MongoConfig {

    @Value("\${spring.data.mongodb.host}")
    private val MONGO_DB_HOST: String? = null

    @Value("\${spring.data.mongodb.port}")
    private val MONGO_DB_PORT: String? = null

    @Value("\${spring.data.mongodb.database}")
    private final val MONGO_DB_NAME: String? = null

    @Value("\${spring.data.mongodb.username}")
    private final val MONGO_DB_USER: String? = null

    @Value("\${spring.data.mongodb.password}")
    private final val MONGO_DB_PASSWORD: String? = null

    @Bean
    fun mongo(): MongoClient {

        val uri: String = "$MONGO_DB_HOST:$MONGO_DB_PORT/$MONGO_DB_NAME"

        val connection =
            ConnectionString("mongodb://$MONGO_DB_USER:$MONGO_DB_PASSWORD@$uri?authSource=admin")

        val settings = MongoClientSettings.builder()
            .applyConnectionString(connection)
            .retryWrites(true)
            .build()

        return MongoClients.create(settings)
    }

    @Bean
    @Throws(Exception::class)
    fun mongoTemplate(): MongoTemplate {
        return MongoTemplate(mongo(), MONGO_DB_NAME!!)
    }
}