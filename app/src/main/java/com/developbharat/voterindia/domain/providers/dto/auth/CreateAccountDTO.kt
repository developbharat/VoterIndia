package com.developbharat.voterindia.domain.providers.dto.auth

import com.developbharat.voterindia.domain.models.auth.User
import com.google.gson.annotations.SerializedName

data class CreateAccountDTO(
    val id: String,
    val mobile: String,
    val name: String,
    @SerializedName("is_licenced")
    val isLicenced: Boolean
){
    fun toUser(): User{
        return User(
            id = id,
            mobile = mobile,
            name = name,
            isLicenced = isLicenced
        )
    }
}