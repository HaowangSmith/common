package com.base.mylibrary.common.util;

import android.content.Context;
import android.text.TextUtils;

import com.base.mylibrary.common.CommonConstant;


import java.util.Properties;

/**
 * Created by WangHao
 *
 * @ 创建时间 2017/10/13  11:16
 */

public class PropertyUtil {

    private PropertyUtil() {
    }

    public static boolean isLogAvailable(Context context) {
        if (context == null) {
            return false;
        } else {
            try {
                Properties pro = new Properties();
                pro.load(context.getAssets().open(CommonConstant.BOERMAN_PROPERTIES));
                String logAvailable = pro.getProperty(CommonConstant.TOGGLE_LOG_VISIBLE);
                if (!TextUtils.isEmpty(logAvailable)) {
                    return Boolean.parseBoolean(logAvailable);
                }
                return false;
            } catch (Exception ignored) {
                return false;
            }
        }
    }
}
