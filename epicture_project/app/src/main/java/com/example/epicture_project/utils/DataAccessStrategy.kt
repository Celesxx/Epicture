package com.example.epicture_project.utils

import com.example.epicture_project.utils.network.Resource
import kotlinx.coroutines.flow.flow


// TODO FINISH DATA ACCESS STRATEGY
//suspend fun <A> performGetOperation(networkCall: suspend () -> Resource<A>) =
//    flow {
//        emit(Resource.loading(null))
//        val responseStatus = networkCall()
//
//        if (responseStatus.status == Resource.Status.SUCCESS) {
//            responseStatus.data?.let {
//                emit(it)
//            }
//        }
//        else if (responseStatus.status == Resource.Status.ERROR)
//        {
//
//        }
//    }