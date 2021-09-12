package com.developbharat.voterindia.domain.providers

import com.developbharat.voterindia.domain.providers.dto.auth.*
import retrofit2.http.Field
import retrofit2.http.POST

interface IAuthAPI {
    // Sign up Screen
    @POST("/signup")
    suspend fun createAccount(
        @Field("name") name: String,
        @Field("mobile") mobile: String
    ): CreateAccountDTO

    // Sign in Screen
    @POST("/passcode")
    suspend fun sendPasscode(@Field("mobile") mobile: String): SendPasscodeDTO

    @POST("/authenticate")
    suspend fun validatePasscode(
        @Field("mobile") mobile: String,
        @Field("passcode") passcode: String
    ): ValidatePasscodeDTO

    // Licence Screen
    @POST("/validate-licence")
    suspend fun validateLicence(
        @Field("mobile") mobile: String,
        @Field("licence") licence: String
    ): ValidateLicenceDTO

    @POST("/purchase-licence")
    suspend fun purchaseLicence(@Field("mobile") mobile: String): PurchaseLicenceDTO
}