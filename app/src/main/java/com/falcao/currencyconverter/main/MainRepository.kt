package com.falcao.currencyconverter.main

import com.falcao.currencyconverter.data.models.CurrencyResponse
import com.falcao.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}