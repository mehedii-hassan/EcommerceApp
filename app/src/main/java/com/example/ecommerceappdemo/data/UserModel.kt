package com.example.ecommerceappdemo.data

data class UserModel(
    val firstName: String,
    val lastName: String,
    val email: String,
    var imagePath: String = ""
) {
    constructor() : this("", "", "","")
}