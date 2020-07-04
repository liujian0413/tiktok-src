package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.CheckSmsAppMethod */
public final class CheckSmsAppMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C43452a f112542b = new C43452a(null);

    /* renamed from: a */
    public final WeakReference<Context> f112543a;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.CheckSmsAppMethod$a */
    public static final class C43452a {
        private C43452a() {
        }

        public /* synthetic */ C43452a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private static boolean m137896a(Context context) {
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.telephony");
            }
        }
        return false;
    }

    public CheckSmsAppMethod(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "bridge");
        super(aVar);
        this.f112543a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (m137896a((Context) this.f112543a.get())) {
            aVar.mo71363a((Object) new JSONObject());
        } else {
            aVar.mo71362a(-1, "Phone does not have available SMS app");
        }
    }
}
