package fr.isen.boutellis.androiderestaurant.Models

import java.io.Serializable

class RegisterResult(val data: User) {}

class User(val id: Int): Serializable {}
