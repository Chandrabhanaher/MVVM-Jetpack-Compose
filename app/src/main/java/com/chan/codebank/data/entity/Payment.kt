package com.chan.codebank.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.Date


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */
@Entity(
    tableName="payments",
    indices = [
        Index("id", unique = true),
        Index("payment_category_id")
    ],
    foreignKeys = [
        ForeignKey(
            entity = Category::class,
            parentColumns = ["id"],
            childColumns = ["payment_category_id"],
            onUpdate = ForeignKey.CASCADE ,
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Payment(
    @PrimaryKey(autoGenerate = true)@ColumnInfo(name="id") val id: Long = 0,
    @ColumnInfo(name="payment_title") val paymentTitle: String,
    @ColumnInfo(name="payment_date") val paymentDate: Long,
    @ColumnInfo(name="payment_category_id") val paymentCategoryId: Long,
    @ColumnInfo(name="payment_amount") val paymentAmount: Double
)
