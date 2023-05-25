package com.chan.codebank.ui.categoryPayment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chan.codebank.data.Payment
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.Date


/**
 * Created by Chandrabhan Haribhau Aher on 25-05-2023.
 * chandrabhan99@gmail.com
 */
class CategoryPaymentViewModel : ViewModel() {

    private val _state = MutableStateFlow(PaymentViewState())

    val state: StateFlow<PaymentViewState>
        get() = _state

    init {
        val list = mutableListOf<Payment>()

        for (x in 1..20) {
            list.add(
                Payment(
                    paymentId = x.toLong(),
                    paymentTitle = "$x Payment",
                    paymentDate = Date(),
                    paymentCategory = "Food"
                )
            )
        }
        viewModelScope.launch {
            _state.value = PaymentViewState(payments = list)
        }
    }
}