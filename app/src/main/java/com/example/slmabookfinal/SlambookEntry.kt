package com.example.slmabookfinal

import java.io.Serializable

data class SlambookEntry(
    var slambookName: String = "",
    var slambookTagline: String = "",
    var firstName: String = "",
    var lastName: String = "",
    var nickname: String = "",
    var avatarId: Int = R.drawable.avatar_placeholder,
    var gender: String? = null,
    var birthDate: Triple<Int, Int, Int>? = null,
    var age: Int? = null,
    var weight: String = "",
    var height: String = "",
    var email: String = "",
    var phone: String = "",
    var address: String = "",
    var facebookLink: String? = null,
    var instagramLink: String? = null,
    var twitterLink: String? = null
) : Serializable
