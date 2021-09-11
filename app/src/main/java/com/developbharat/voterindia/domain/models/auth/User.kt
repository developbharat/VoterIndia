package com.developbharat.voterindia.domain.models.auth

data class User(
    val id: String,
    val name: String,
    val mobile: String,
    val isLicenced: Boolean,
)
