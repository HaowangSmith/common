package com.base.mylibrary.common.util;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.base.mylibrary.common.CommonConstant;


/**
 * Created by WangHao
 *
 * @ 创建时间 2017/10/13  11:16
 */

public class ToastUtil {

    private ToastUtil() {
    }

    private static Toast toast = null;

    public static void showToast(Context context, String msg) {
        if (toast == null) {
            toast = Toast.makeText(context, CommonConstant.EMPTY, Toast.LENGTH_SHORT);
        }
        toast.setText(msg);
        toast.setGravity(Gravity.CENTER, 0, 500);
        toast.show();
    }
}
