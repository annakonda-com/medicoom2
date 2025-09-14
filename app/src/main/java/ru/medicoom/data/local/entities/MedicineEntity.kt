package ru.medicoom.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medicines")
class MedicineEntity(
    @PrimaryKey(autoGenerate = true) var id: String,
    @ColumnInfo var name: String,
    @ColumnInfo var dosage: String,
    @ColumnInfo var amount: Int,
    @ColumnInfo var expiration: Int,
    @ColumnInfo var warningAmount: Int,
    @ColumnInfo var isDeleted: Boolean,
    @ColumnInfo val changed: Int)