package com.nickagas.mvphelloworld.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nickagas.mvphelloworld.R
import com.nickagas.mvphelloworld.contract.MainActivityContract
import com.nickagas.mvphelloworld.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , MainActivityContract.View {

    lateinit var mPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter=MainActivityPresenter(this)


    }

    override fun initView(){
        button.setOnClickListener {view->
            mPresenter.onClick(view)
        }
    }
    override fun setViewData(data:String){
        textView.text=data
    }

}
