package ru.medicoom.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "appointments")
data class AppointmentEntity (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo val amountAtTime: Int,
    @ColumnInfo val isArchive: Boolean,
    @ColumnInfo val days: Int,
    @ColumnInfo val isDeleted: Boolean,
    @ColumnInfo val daysPeriod: Int,
    @ColumnInfo val recommended: String,
    @ColumnInfo val medId: Int,
    @ColumnInfo val hasNotifications: Boolean,
    @ColumnInfo val isOnPause: Boolean,
    @ColumnInfo val startDate: Int,
    @ColumnInfo val times: List<Int>,
    @ColumnInfo val weekDays: List<Int>,
    @ColumnInfo val changed:Int)