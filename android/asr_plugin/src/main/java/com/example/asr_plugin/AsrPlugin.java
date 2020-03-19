package com.example.asr_plugin;

import android.app.Activity;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

public class AsrPlugin implements MethodChannel.MethodCallHandler {

    private static final String TAG = "AsrPlugin";

    private final Activity activity;

    public AsrPlugin(PluginRegistry.Registrar registrar) {
        this.activity = registrar.activity();
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        MethodChannel channel = new MethodChannel(registrar.messenger(), "asr_plugin");
        AsrPlugin instance = new AsrPlugin(registrar);
        channel.setMethodCallHandler(instance);
    }
    @Override
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        switch (methodCall.method) {
            case "start":
                break;
            case "stop":
                break;
            case "cancel":
                break;
            default:
                result.notImplemented();
        }
    }
}
