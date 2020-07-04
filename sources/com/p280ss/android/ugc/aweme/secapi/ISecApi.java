package com.p280ss.android.ugc.aweme.secapi;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.secapi.ISecApi */
public interface ISecApi {
    void initSec(Context context, String str, int i, String str2, String str3, boolean z, C37421b bVar);

    boolean isCaptchaUrl(String str);

    void loadSo();

    boolean needVerifyImage(int i);

    String onEvent();

    void popCaptcha(Activity activity, int i, C37420a aVar);

    void reportData(String str);

    void setParams();

    void updateDeviceIdAndInstallId(String str, String str2);
}
