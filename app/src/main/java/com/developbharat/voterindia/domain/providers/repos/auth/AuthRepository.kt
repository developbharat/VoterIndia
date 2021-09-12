package com.developbharat.voterindia.domain.providers.repos.auth

import com.developbharat.voterindia.domain.models.auth.User
import com.developbharat.voterindia.domain.providers.IAuthAPI
import javax.inject.Inject

class AuthRepository @Inject constructor(
    val api: IAuthAPI,
): IAuthRepository {
    override suspend fun isUserSignedIn(): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun createAccount(name: String, mobile: String): User {
        return api.createAccount(name=name, mobile=mobile).toUser()
    }

    override suspend fun sendPasscode(mobile: String): Boolean {
        return api.sendPasscode(mobile).success
    }

    override suspend fun isPasscodeValid(mobile: String, passcode: String): Boolean {
        return api.validatePasscode(mobile=mobile, passcode=mobile).success
    }

    override suspend fun isLicenceValid(mobile: String, licence: String): Boolean {
        return api.validateLicence(mobile=mobile, licence=licence).success
    }

    override suspend fun purchaseLicence(mobile: String): Boolean {
        return api.purchaseLicence(mobile = mobile).success
    }
}