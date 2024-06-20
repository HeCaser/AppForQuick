package com.panhe.appforquick

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.panhe.appforquick.util.StatusBarUtil


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        StatusBarUtil.hideStatusBar(this)

    }

}