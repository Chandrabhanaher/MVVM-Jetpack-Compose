package com.chan.codebank.ui.payment

import com.chan.codebank.data.entity.Payment


/**
 * Created by Chandrabhan Haribhau Aher on 04-06-2023
 * chandrabhan99@gmai.com
 */
data class PaymentsViewState(
    val payments: List<Payment> = emptyList()
)
