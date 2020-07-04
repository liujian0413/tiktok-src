package com.p280ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.secapi.C37420a;
import com.p280ss.android.ugc.aweme.secapi.C37421b;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sec.SecApiImpl */
public final class SecApiImpl implements ISecApi {
    public final void loadSo() {
        C37396a.m120000a();
    }

    public final void setParams() {
        C37396a.m120009b();
    }

    public final String onEvent() {
        return C37396a.m120012d();
    }

    public final boolean needVerifyImage(int i) {
        return C37396a.m120007a(i);
    }

    public final boolean isCaptchaUrl(String str) {
        C7573i.m23587b(str, "url");
        return C37396a.m120010b(str);
    }

    public final void reportData(String str) {
        C7573i.m23587b(str, "scene");
        C37396a.m120005a(str);
    }

    public final void updateDeviceIdAndInstallId(String str, String str2) {
        C7573i.m23587b(str, "deviceId");
        C7573i.m23587b(str2, "iid");
        C37396a.m120006a(str, str2);
    }

    public final void popCaptcha(Activity activity, int i, C37420a aVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aVar, "secCaptchaListener");
        C37396a.m120001a(i, activity, aVar);
    }

    public final void initSec(Context context, String str, int i, String str2, String str3, boolean z, C37421b bVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "language");
        C7573i.m23587b(str2, "appName");
        C7573i.m23587b(str3, "channel");
        C7573i.m23587b(bVar, "secGetDataCallBack");
        C37396a.m120002a(context, str, i, str2, str3, z, bVar);
    }
}
