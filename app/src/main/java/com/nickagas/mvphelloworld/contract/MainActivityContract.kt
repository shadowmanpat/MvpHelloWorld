package com.nickagas.mvphelloworld.contract

/**
 * Created by sm on 3/15/18.
 */
interface MainActivityContract {

    interface  View{
        fun initView()
        fun setViewData(data:String)
    }

    interface Model{
        fun getDate():String
    }

    interface Presenter{
        fun onClick(view: android.view.View)
    }
}