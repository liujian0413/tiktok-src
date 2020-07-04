package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.bytedance.ies.web.jsbridge2.CallContext.HostType;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.NetworkUtils;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.f */
public final class C4166f extends C11155d<Object, C4167a> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.f$a */
    static class C4167a {
        @C6593c(mo15949a = "appName")

        /* renamed from: a */
        String f12213a;
        @C6593c(mo15949a = "aid")

        /* renamed from: b */
        int f12214b;
        @C6593c(mo15949a = "appVersion")

        /* renamed from: c */
        String f12215c;
        @C6593c(mo15949a = "versionCode")

        /* renamed from: d */
        String f12216d;
        @C6593c(mo15949a = "netType")

        /* renamed from: e */
        String f12217e;
        @C6593c(mo15949a = "orientation")

        /* renamed from: f */
        String f12218f;
        @C6593c(mo15949a = "device_id")

        /* renamed from: g */
        String f12219g;
        @C6593c(mo15949a = "user_id")

        /* renamed from: h */
        long f12220h;
        @C6593c(mo15949a = "screenWidth")

        /* renamed from: i */
        float f12221i;
        @C6593c(mo15949a = "screenHeight")

        /* renamed from: j */
        float f12222j;

        C4167a() {
        }
    }

    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14269a(obj, callContext);
    }

    /* renamed from: a */
    private static C4167a m14269a(Object obj, CallContext callContext) throws Exception {
        String str;
        C4167a aVar = new C4167a();
        IHostContext a = TTLiveSDKContext.getHostService().mo22360a();
        aVar.f12213a = a.appName();
        aVar.f12214b = a.appId();
        String customVersion = AppLog.getCustomVersion();
        if (TextUtils.isEmpty(customVersion)) {
            customVersion = a.getVersionCode();
        }
        aVar.f12215c = customVersion;
        aVar.f12216d = a.getVersionCode();
        aVar.f12217e = NetworkUtils.getNetworkAccessType(a.context());
        if (!(callContext.f30265a instanceof Activity)) {
            str = "vertical";
        } else if (((Activity) callContext.f30265a).getRequestedOrientation() == 1) {
            str = "vertical";
        } else {
            str = "horizontal";
        }
        aVar.f12218f = str;
        if (HostType.PRIVATE.equals(CallContext.m32636a())) {
            aVar.f12219g = AppLog.getServerDeviceId();
            aVar.f12220h = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        }
        aVar.f12221i = C3358ac.m12527e(C3358ac.m12523c());
        aVar.f12222j = C3358ac.m12527e(C3358ac.m12520b());
        return aVar;
    }
}
