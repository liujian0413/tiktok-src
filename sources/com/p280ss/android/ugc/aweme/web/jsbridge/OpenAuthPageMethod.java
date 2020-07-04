package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod */
public final class OpenAuthPageMethod implements C11093e, AuthClickCallBackWeb {
    public static final C43459a Companion = new C43459a(null);
    private final WeakReference<Context> contextRef;
    private final C11087a jsBridge;
    private String mCallbackId;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod$a */
    public static final class C43459a {
        private C43459a() {
        }

        public /* synthetic */ C43459a(C7571f fVar) {
            this();
        }
    }

    public final void onClick(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ticket", str);
        jSONObject.put("code", 1);
        jSONObject.put("response", jSONObject2);
        this.jsBridge.mo27030a(this.mCallbackId, jSONObject);
    }

    public OpenAuthPageMethod(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "jsBridge");
        this.contextRef = weakReference;
        this.jsBridge = aVar;
    }

    public final void onError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("errorCode", str);
        jSONObject.put("errorMsg", str2);
        this.jsBridge.mo27030a(this.mCallbackId, jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.web.p582a.C11097i r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            r8 = 0
            if (r7 == 0) goto L_0x0006
            java.lang.String r0 = r7.f30169b
            goto L_0x0007
        L_0x0006:
            r0 = r8
        L_0x0007:
            r6.mCallbackId = r0
            java.lang.String r0 = "1"
            if (r7 == 0) goto L_0x0018
            org.json.JSONObject r1 = r7.f30171d
            if (r1 == 0) goto L_0x0018
            java.lang.String r2 = "client_key"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0019
        L_0x0018:
            r1 = r8
        L_0x0019:
            if (r7 == 0) goto L_0x0024
            org.json.JSONObject r2 = r7.f30171d
            if (r2 == 0) goto L_0x0024
            java.lang.String r3 = "response_type"
            r2.getString(r3)
        L_0x0024:
            if (r7 == 0) goto L_0x0031
            org.json.JSONObject r2 = r7.f30171d
            if (r2 == 0) goto L_0x0031
            java.lang.String r3 = "scope"
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0032
        L_0x0031:
            r2 = r8
        L_0x0032:
            if (r7 == 0) goto L_0x003f
            org.json.JSONObject r3 = r7.f30171d
            if (r3 == 0) goto L_0x003f
            java.lang.String r4 = "state"
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0040
        L_0x003f:
            r3 = r8
        L_0x0040:
            if (r7 == 0) goto L_0x004d
            org.json.JSONObject r4 = r7.f30171d
            if (r4 == 0) goto L_0x004d
            java.lang.String r5 = "redirect_uri"
            java.lang.String r4 = r4.getString(r5)
            goto L_0x004e
        L_0x004d:
            r4 = r8
        L_0x004e:
            com.bytedance.sdk.account.b.c.c$a r5 = new com.bytedance.sdk.account.b.c.c$a
            r5.<init>()
            r5.f33741f = r2
            r5.f33736a = r3
            java.lang.String r2 = "wap_to_native"
            r5.f33739d = r2
            r5.f33737b = r4
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r5.toBundle(r2)
            java.lang.String r3 = "_bytedance_params_client_key"
            r2.putString(r3, r1)
            java.lang.String r1 = "__bytedance_base_caller_version"
            r2.putString(r1, r0)
            java.lang.String r0 = "_bytedance_params_type_caller_package"
            java.lang.ref.WeakReference<android.content.Context> r1 = r6.contextRef
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L_0x007f
            java.lang.String r8 = r1.getPackageName()
        L_0x007f:
            r2.putString(r0, r8)
            java.lang.String r8 = "_aweme_params_enter_from_flag"
            java.lang.String r0 = "ENTER_FROM_INNER_WEB"
            r2.putString(r8, r0)
            if (r7 == 0) goto L_0x008e
            r8 = 0
            r7.f30173f = r8
        L_0x008e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r7 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r8 = com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r7 = r7.getService(r8)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r7 = (com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r7
            java.lang.ref.WeakReference<android.content.Context> r8 = r6.contextRef
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            r0 = r6
            com.ss.android.ugc.aweme.web.jsbridge.AuthClickCallBackWeb r0 = (com.p280ss.android.ugc.aweme.web.jsbridge.AuthClickCallBackWeb) r0
            r7.startAuthNativeActivity(r8, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod.call(com.bytedance.ies.web.a.i, org.json.JSONObject):void");
    }
}
