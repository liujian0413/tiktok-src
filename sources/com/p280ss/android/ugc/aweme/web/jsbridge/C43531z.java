package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.z */
public final class C43531z implements C11093e {

    /* renamed from: a */
    public static final C43532a f112698a = new C43532a(null);

    /* renamed from: c */
    private static final boolean f112699c = C7163a.m22363a();

    /* renamed from: b */
    private final WeakReference<Context> f112700b;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.z$a */
    public static final class C43532a {
        private C43532a() {
        }

        public /* synthetic */ C43532a(C7571f fVar) {
            this();
        }
    }

    public C43531z(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        this.f112700b = weakReference;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.web.p582a.C11097i r3, org.json.JSONObject r4) {
        /*
            r2 = this;
            r4 = 0
            if (r3 == 0) goto L_0x000e
            org.json.JSONObject r0 = r3.f30171d
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "phone_number"
            java.lang.String r0 = r0.getString(r1)
            goto L_0x000f
        L_0x000e:
            r0 = r4
        L_0x000f:
            if (r3 == 0) goto L_0x001b
            org.json.JSONObject r3 = r3.f30171d
            if (r3 == 0) goto L_0x001b
            java.lang.String r4 = "sms_content"
            java.lang.String r4 = r3.getString(r4)
        L_0x001b:
            java.lang.ref.WeakReference<android.content.Context> r3 = r2.f112700b
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            m138006a(r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.web.jsbridge.C43531z.call(com.bytedance.ies.web.a.i, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static void m138006a(Context context, String str, String str2) {
        Uri uri;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder("smsto:");
                sb.append(str);
                uri = Uri.parse(sb.toString());
            } else {
                uri = Uri.parse("smsto:");
            }
            Intent intent = new Intent("android.intent.action.SENDTO", uri);
            if (VERSION.SDK_INT >= 19) {
                String defaultSmsPackage = Sms.getDefaultSmsPackage(context);
                intent.putExtra("sms_body", str2);
                if (!TextUtils.isEmpty(defaultSmsPackage)) {
                    intent.setPackage(defaultSmsPackage);
                }
            } else {
                intent.putExtra("sms_body", str2);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }
}
