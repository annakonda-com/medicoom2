package ru.medicoom.dataClasses

data class AppointmentOnDate (val id: Int, val date: Int,
                              val time: Int, val appointmentId: Int,
                              val gotTime: Int, val isGot: Boolean,
                              val restToGet: Int, val comment: String){
}
