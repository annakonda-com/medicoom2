package ru.medicoom.data.network.models

class NetworkMedicine(
    var id: String,
    var name: String,
    var dosage: String,
    var amount: Int,
    var expiration: Int,
    var warningAmount: Int,
    var isDeleted: Boolean) {
}