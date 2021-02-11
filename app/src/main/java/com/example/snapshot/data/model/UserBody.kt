package com.example.snapshot.data.model

data class UserBody(val date_of_birth: String,
                    val email: String,
                    val first_name: String,
                    val last_name: String,
                    val password: String)

data class SignInBody(val email: String, val password: String)