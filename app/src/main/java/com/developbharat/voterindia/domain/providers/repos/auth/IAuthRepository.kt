package com.developbharat.voterindia.domain.providers.repos.auth

import com.developbharat.voterindia.domain.models.auth.User
import com.developbharat.voterindia.domain.models.auth.UserAccountLicence


interface IAuthRepository {
    // Start Screen
    suspend fun isUserSignedIn(): Boolean

    // Sign up Screen
    suspend fun createAccount(name: String, mobile: String): User

    // Sign in Screen
    suspend fun sendPasscode(mobile: String): Boolean
    suspend fun isPasscodeValid(mobile: String, passcode: String): Boolean

    // Licence Screen
    suspend fun isLicenceValid(mobile: String, licence: String): Boolean
    suspend fun requestPurchaseLicence(mobile: String, upiId: String): Boolean
    suspend fun checkUpiStatus(mobile: String): UserAccountLicence
    // TODO: change it to support licence purchase via upi id.
}