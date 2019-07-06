package com.a360celsius.nedstocks.retrofit.interfaces

import com.a360celsius.nedstocks.retrofit.model.Symbol
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiRequests {
    @GET( "/1.0/ref-data/symbols" )
    fun getSymbols () : Observable<List<Symbol>>
}