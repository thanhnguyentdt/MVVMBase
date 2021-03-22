package com.example.thefirstprojecttdtdemo.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.thefirstprojecttdtdemo.R
import com.example.thefirstprojecttdtdemo.ui.fragment.BaseFragment
import com.example.thefirstprojecttdtdemo.ui.fragment.ForthFragment
import com.example.thefirstprojecttdtdemo.ui.fragment.SecondFragment
import com.example.thefirstprojecttdtdemo.ui.fragment.ThirdFragment
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvNextScreen.setOnClickListener(this)
        tvShowThirdFragment.setOnClickListener(this)
        tvShowForthFragment.setOnClickListener(this)
//        initFragment(
//            SecondFragment.newInstance("SecondFragment_test1", "SecondFragment_test2"),
//            "SecondFragment"
//        )
    }

    private fun initFragment(newInstance: BaseFragment, tag: String, isRemove: Boolean = false) {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.secondActivityContainer, newInstance, tag)
            addToBackStack(null)
            setReorderingAllowed(true)
            commit()
        }
    }

    override fun onClick(v: View?) {
        super.onClick(v)
        when (v) {
            tvNextScreen -> startActivity(Intent(this, ThirdActivity::class.java))
            tvShowThirdFragment -> initFragment(
                ThirdFragment.newInstance("ThirdFragment_test1", "ThirdFragment_test2"),
                "ThirdFragment"
            )
            tvShowForthFragment -> initFragment(
                ForthFragment.newInstance("ForthFragment_test1", "ForthFragment_test2"),
                "ForthFragment", true
            )
        }
    }

}