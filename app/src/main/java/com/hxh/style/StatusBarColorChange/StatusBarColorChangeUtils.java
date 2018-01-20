package com.hxh.style.StatusBarColorChange;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

public class StatusBarColorChangeUtils
{
    /**
     * 改变系统标题栏颜色
     *
     * @param activity
     * @param color    color xml文件下的颜色
     */
    public static void setStatusBarColor(Activity activity, int color)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
        {
            setStatusBarTransparency(activity, true);
        }

        StatusBarColorManager manager = new StatusBarColorManager(activity);
        manager.setStatusBarTintEnabled(true);
        manager.setStatusBarTintResource(color);
    }

    /**
     * 设置系统标题栏的透明度
     *
     * @param activity
     * @param on
     */
    @TargetApi(19)
    private static void setStatusBarTransparency(Activity activity, boolean on)
    {
        Window window = activity.getWindow();
        WindowManager.LayoutParams params = window.getAttributes();

        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;

        if (on)
        {
            params.flags |= bits;
        }
        else
        {
            params.flags &= ~bits;
        }

        window.setAttributes(params);
    }
}
