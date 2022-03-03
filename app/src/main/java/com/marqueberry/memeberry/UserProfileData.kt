package com.marqueberry.memeberry



data class UserProfileData(
    val fullName: String,
    val userName: String,
    val phoneNumber: String,
    val code: String,
    val gender: String,
    val profileImageUrl: String? = null,
)