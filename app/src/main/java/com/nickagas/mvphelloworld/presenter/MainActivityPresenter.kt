package com.nickagas.mvphelloworld.presenter

import android.view.View
import com.nickagas.mvphelloworld.contract.MainActivityContract
import com.nickagas.mvphelloworld.model.MainActivtyModel

/**
 * Created by sm on 3/15/18.
 */
class MainActivityPresenter(view: MainActivityContract.View): MainActivityContract.Presenter {

    var mView: MainActivityContract.View = view
    var mModel:MainActivtyModel= MainActivtyModel()
    init {
        initPresenter()
    }

    private fun initPresenter() {
        mView.initView()
    }

    override fun onClick(view: View) {

      var data=mModel.getDate()
        mView.setViewData(data)
    }





}