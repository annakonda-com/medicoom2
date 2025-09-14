package ru.medicoom.data.network.models

data class NetworkAppointment (
    val id: Int,
    val amountAtTime: Int,
    val isArchive: Boolean,
    val days: Int,
    val isDeleted: Boolean,
    val daysPeriod: Int,
    val recommended: String,
    val medId: Int,
    val hasNotifications: Boolean,
    val isOnPause: Boolean,
    val startDate: Int,
    val times: List<Int>,
    val weekDays: List<Int>){
}