package ru.medicoom.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "appointmentsOnDates")
data class AppointmentOnDateEntity (@PrimaryKey(autoGenerate = true) val id: Int,
                                    @ColumnInfo val date: Int,
                                    @ColumnInfo val time: Int,
                                    @ColumnInfo val appointmentId: Int,
                                    @ColumnInfo val gotTime: Int,
                                    @ColumnInfo val isGot: Boolean,
                                    @ColumnInfo val restToGet: Int,
                                    @ColumnInfo val comment: String,
                                    @ColumnInfo val changed: Int)