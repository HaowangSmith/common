package com.base.mylibrary.common.exception;

/**
 * Created by WangHao
 *
 * @ 创建时间 2017/10/13  11:16
 */

public class ApiException extends BaseException {


    public ApiException(int resultCode) {
        super(resultCode);
    }


    public ApiException(int code, String displayMessage) {
        super(code, displayMessage);
    }
}
