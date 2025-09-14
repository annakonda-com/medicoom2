package ru.medicoom.data.model

class Medicine(
    var id: String,
    var name: String,
    var dosage: String,
    var amount: Int,
    var expiration: Int,
    var warningAmount: Int,
    var isDeleted: Boolean) {
}