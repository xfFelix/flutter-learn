package com.example.asr_plugin;

import android.util.Log;

import io.flutter.plugin.common.MethodChannel;

public class ResultStateful implements MethodChannel.Result {

    private static final String TAG = "ResultStateful";

    private MethodChannel.Result result;

    private boolean called;

    public ResultStateful(MethodChannel.Result result) {
        this.result = result;
    }

    public static ResultStateful of(MethodChannel.Result result) {
        return new ResultStateful(result);
    }

    @Override
    public void success(Object o) {
        if (called) {

        }
    }

    @Override
    public void error(String s, String s1, Object o) {

    }

    @Override
    public void notImplemented() {

    }

    private void printError() {
        Log.e(TAG, "");
    }
}
