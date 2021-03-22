package com.example.thefirstprojecttdtdemo.ui.activity

import android.os.Bundle
import android.widget.MediaController
import com.example.thefirstprojecttdtdemo.R
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(vvThirdActivity)
        vvThirdActivity.setMediaController(mediaController)
        vvThirdActivity.setVideoPath("http://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4");
        vvThirdActivity.start()
    }
}