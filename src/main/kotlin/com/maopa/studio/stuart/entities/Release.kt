package com.maopa.studio.stuart.entities

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Releases")
data class Release (
    @MongoId var id: String, /// Identifier
    var title: String,       /// Title
    var description: String? /// Description
)