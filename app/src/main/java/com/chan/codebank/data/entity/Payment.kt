package com.chan.codebank.data.entity

import java.util.Date


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */
data class Payment(
    val paymentId: Long,
    val paymentTitle: String,
    val paymentDate: Date?,
    val paymentCategory: String
)
