package com.p280ss.android.ugc.aweme.p1216fe.p1218b;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25896d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lancet.ReactNativeException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.fe.b.e */
public final class C27873e {

    /* renamed from: a */
    public static final C27873e f73441a = new C27873e();

    private C27873e() {
    }

    /* renamed from: a */
    public final void mo71353a(Exception exc) {
        mo71355a("error", exc);
    }

    /* renamed from: a */
    public final void mo71355a(String str, Exception exc) {
        m91308a(str, exc, null, null, null);
    }

    /* renamed from: a */
    public static void m91306a(Exception exc, Map<String, ? extends Object> map) {
        C6869c a = C6869c.m21381a();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                a.mo16887a((String) entry.getKey(), entry.getValue().toString());
            }
        }
        if (exc != null) {
            a.mo16887a("msg_type", "error").mo16887a("error_desc", Log.getStackTraceString(exc));
        }
        C7573i.m23582a((Object) a, "build");
        HashMap<String, Object> hashMap = a.f19517a;
        C7573i.m23582a((Object) hashMap, "build.hasMap");
        if (!hashMap.isEmpty()) {
            C6877n.m21447a("aweme_rn_log", a.mo16888b());
            Throwable th = exc;
            C6921a.m21559a((Throwable) new ReactNativeException(th));
            C2077a.m9161a(th, "aweme_rn_log");
        }
    }

    /* renamed from: a */
    public final void mo71354a(Exception exc, String str, String str2) {
        m91308a("error", exc, null, str, str2);
    }

    /* renamed from: a */
    public static void m91307a(String str, long j, C25896d dVar) {
        String str2;
        C7573i.m23587b(str, "key");
        String str3 = "aweme_rn_performance";
        C6869c a = C6869c.m21381a().mo16886a(str, Long.valueOf(j));
        String str4 = "channel_name";
        String str5 = null;
        if (dVar != null) {
            str2 = dVar.mo67272a();
        } else {
            str2 = null;
        }
        C6869c a2 = a.mo16887a(str4, str2);
        String str6 = "module_name";
        if (dVar != null) {
            str5 = dVar.f68494e;
        }
        C6877n.m21447a(str3, a2.mo16887a(str6, str5).mo16888b());
    }

    /* renamed from: a */
    private static void m91308a(String str, Exception exc, String str2, String str3, String str4) {
        C6869c a = C6869c.m21381a();
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            a.mo16887a("msg_type", str);
        }
        if (exc != null) {
            a.mo16887a("error_desc", Log.getStackTraceString(exc));
        }
        if (!TextUtils.isEmpty(null)) {
            a.mo16887a("tag", (String) null);
        }
        if (!TextUtils.isEmpty(str3)) {
            a.mo16887a("channel_name", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            a.mo16887a("module_name", str4);
        }
        C7573i.m23582a((Object) a, "build");
        if (!a.f19517a.isEmpty()) {
            C6877n.m21447a("aweme_rn_log", a.mo16888b());
            if (TextUtils.equals(charSequence, "error")) {
                Throwable th = exc;
                C6921a.m21559a((Throwable) new ReactNativeException(th));
                C2077a.m9161a(th, "aweme_rn_log");
            }
        }
    }
}
