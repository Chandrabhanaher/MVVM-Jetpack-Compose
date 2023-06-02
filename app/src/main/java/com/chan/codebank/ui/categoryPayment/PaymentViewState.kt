package com.chan.codebank.ui.categoryPayment

import com.chan.codebank.data.entity.Payment


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */
data class PaymentViewState(
    val payments: List<Payment> = emptyList()
)
