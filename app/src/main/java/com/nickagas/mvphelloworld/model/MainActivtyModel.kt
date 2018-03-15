package com.nickagas.mvphelloworld.model

import com.nickagas.mvphelloworld.contract.MainActivityContract

/**
 * Created by sm on 3/15/18.
 */
class MainActivtyModel : MainActivityContract.Model{
    override fun getDate(): String {
        return "Hello World"
    }
}