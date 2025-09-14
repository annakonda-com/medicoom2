package ru.medicoom.data.network.models

data class NetworkAppointmentOnDate (val id: Int, val date: Int,
                                     val time: Int, val appointmentId: Int,
                                     val gotTime: Int, val isGot: Boolean,
                                     val restToGet: Int, val comment: String){
}