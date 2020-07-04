package com.bytedance.android.livesdkapi.service;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.p022v4.app.DialogFragment;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public interface IReactNativeHost {

    public interface Callback1<T> {
        void call(T t);
    }

    public interface Callback2<T1, T2> {
        void call(T1 t1, T2 t2);
    }

    Map<String, String> apiParam();

    JSONObject callJSBridge(String str, HashMap<String, Object> hashMap) throws Exception;

    void centerToast(String str);

    DialogFragment createWebDialogFragment(String str, int i, int i2, int i3, int i4, String str2);

    Activity currentActivity();

    int dp2Px(int i);

    void fetch(String str, String str2, Map<String, String> map, Callback2<String, Map<String, Object>> callback2);

    Application getApplication();

    String getOfflinePath(String str);

    <T> T getSettingValue(String str, Class<T> cls, T t);

    void openScheme(Context context, String str, String str2);

    void sendLogV3(String str, Map<String, String> map);

    void showDialog(String str, String str2, String str3, String str4, boolean z, Callback1<Boolean> callback1);
}
