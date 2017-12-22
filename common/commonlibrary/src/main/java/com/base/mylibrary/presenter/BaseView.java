package com.base.mylibrary.presenter;

/**
 * Created by Ivan on 2017/1/3.
 */
/**
 * Created by WangHao
 *
 * @ 创建时间 2017/10/13  11:16
 */

public interface BaseView {


    void showLoading();
    void  showError(String msg);
    void  dismissLoading();

    void onRequestPermissionSuccess();
    void onRequestPermissionReject();
}
