package com.chan.codebank.data.repository

import com.chan.codebank.data.entity.Category
import com.chan.codebank.data.entity.Payment
import com.chan.codebank.data.room.PaymentDao
import com.chan.codebank.data.room.PaymentToCategory
import kotlinx.coroutines.flow.Flow

class PaymentRepository(
    private val paymentDao: PaymentDao
) {

    /**
     * Return a flow containing the list of payments associated with the category with us
     * given [categoryId]
     */

    fun paymentsInCategory(categoryId: Long): Flow<List<PaymentToCategory>>{
        return paymentDao.getPaymentFromCategory(categoryId)
    }

    /**
     * add a new [Payment] to the payment store
     */

    suspend fun addPayment(payment: Payment) = paymentDao.insert(payment)
}