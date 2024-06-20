package com.panhe.appforquick.util

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.view.WindowManager

/**
 * @author: hepan
 * @date: 2024/6/20
 * @desc: Status相关工具类
 */
object StatusBarUtil {

    /**
     * 隐藏状态栏
     *  StatusBar 设置为透明背景, 并且 DecorView 会向上填充 StatusBar 位置
     */
    fun hideStatusBar(activity: Activity?) {
        activity?.window?.apply {
            addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
            statusBarColor = Color.TRANSPARENT
        }
    }

    /**
     * 获取状态栏高度
     */
    fun getStatusBarHeight(context: Context): Int {
        val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
        return if (resourceId > 0) context.resources.getDimensionPixelSize(resourceId) else 0
    }
}