package com.example.unsplash.states

import android.net.Uri
import androidx.core.net.toUri
import net.openid.appauth.AuthorizationRequest
import net.openid.appauth.AuthorizationServiceConfiguration
import net.openid.appauth.ResponseTypeValues


object AuthConfiguration {
    const val AUTH_ENDPOINT = "https://unsplash.com/oauth/authorize"
    const val TOKEN_ENDPOINT = "https://unsplash.com/oauth/token"

    const val END_SESSION_URI = "https://unsplash.com/logout"
    const val REDIRECT_URI = "ru.arbonik.oauth://skillbox.ru/auth"
    const val RESPONSE_TYPE = ResponseTypeValues.CODE
    const val ACCESS_KEY = "e5VE1qefcf69ardn8_FJOzHPYDqhg7ZJsvIl_7fg6QA"
    const val SECRET_KEY = "f8ghbvvL9MwpS2a1SUHXQ3J1-QV5XxQNdQYQx29cSKU"
    const val SCOPE = "public " +
            "read_user " +
            "write_user " +
            "read_photos " +
            "write_photos " +
            "write_likes " +
            "write_followers " +
            "read_collections " +
            "write_collections"
}