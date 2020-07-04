package com.bytedance.android.livesdk.utils.p425a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.utils.a.a */
public class C9023a {

    /* renamed from: a */
    private static volatile C9023a f24677a;

    /* renamed from: b */
    private C9027e f24678b;

    /* renamed from: c */
    private C7321c f24679c;

    /* renamed from: a */
    public static long m26968a() {
        if (f24677a == null || f24677a.f24678b == null || !f24677a.f24678b.f24685a) {
            return C9048ao.m27015a();
        }
        return f24677a.f24678b.mo22227b();
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m26969a(Long l) throws Exception {
        if (f24677a == null || f24677a.f24678b == null) {
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(f24677a.f24678b.mo22226a());
    }

    private C9023a(Context context) {
        String str = (String) LiveConfigSettingKeys.LIVE_NTP_SERVER_URL.mo10240a();
        if (!TextUtils.isEmpty(str)) {
            this.f24678b = C9027e.m26973a(context, str, 500);
            this.f24679c = C9057b.m27053a(60, TimeUnit.MINUTES).mo19305c(2147483647L).mo19304b(C7333a.m23042a()).mo19317d(C9024b.f24680a).mo19294a(C47549a.m148327a()).mo19280a(C9025c.f24681a, C9026d.f24682a);
        }
    }

    /* renamed from: a */
    public static void m26970a(Context context) {
        if (f24677a == null) {
            synchronized (C9023a.class) {
                if (f24677a == null) {
                    f24677a = new C9023a(context);
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m26971a(Boolean bool) throws Exception {
        StringBuilder sb = new StringBuilder("NTP time update result: ");
        sb.append(bool);
        C3166a.m11964c("LiveNtpUtil", sb.toString());
    }
}
