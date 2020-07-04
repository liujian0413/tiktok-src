package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.FieldNamingPolicy;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C46871i;
import com.twitter.sdk.android.core.internal.C46875m;
import com.twitter.sdk.android.core.internal.scribe.C46931v.C46932a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.a */
public class C46898a extends C46929t {

    /* renamed from: b */
    private static volatile ScheduledExecutorService f120257b;

    /* renamed from: c */
    private final C46939k<? extends C46938j<TwitterAuthToken>> f120258c;

    /* renamed from: d */
    private final String f120259d;

    /* renamed from: e */
    private final Context f120260e;

    /* renamed from: a */
    private C46938j m146695a() {
        return this.f120258c.mo117913a();
    }

    /* renamed from: c */
    private static C6600e m146699c() {
        return new C6607f().mo15984a(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).mo15992f();
    }

    /* renamed from: e */
    private static boolean m146702e() {
        if (!"release".equals("debug")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private String m146697b() {
        return this.f120260e.getResources().getConfiguration().locale.getLanguage();
    }

    /* renamed from: d */
    private static ScheduledExecutorService m146701d() {
        if (f120257b == null) {
            synchronized (C46898a.class) {
                if (f120257b == null) {
                    f120257b = C46871i.m146617b("scribe");
                }
            }
        }
        return f120257b;
    }

    /* renamed from: a */
    private static long m146693a(C46938j jVar) {
        if (jVar != null) {
            return jVar.f120357b;
        }
        return 0;
    }

    /* renamed from: a */
    private void m146696a(C46931v vVar) {
        super.mo118077a(vVar, m146693a(m146695a()));
    }

    /* renamed from: a */
    public final void mo118023a(C46908e... eVarArr) {
        for (int i = 0; i <= 0; i++) {
            mo118022a(eVarArr[0], Collections.emptyList());
        }
    }

    /* renamed from: c */
    private static String m146700c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return str;
    }

    /* renamed from: a */
    public static C46930u m146694a(String str, String str2) {
        C46930u uVar = new C46930u(m146702e(), m146700c("https://syndication.twitter.com", ""), C42323i.f110089f, "sdk", "", m146698b(str, str2), 100, 600);
        return uVar;
    }

    /* renamed from: b */
    private static String m146698b(String str, String str2) {
        StringBuilder sb = new StringBuilder("TwitterKit/");
        sb.append("3.0 (Android ");
        sb.append(VERSION.SDK_INT);
        sb.append(") ");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo118022a(C46908e eVar, List<ScribeItem> list) {
        String str = "";
        C46908e eVar2 = eVar;
        m146696a(C46933w.m146802a(eVar2, str, System.currentTimeMillis(), m146697b(), this.f120259d, list));
    }

    public C46898a(Context context, C46939k<? extends C46938j<TwitterAuthToken>> kVar, C46825e eVar, C46875m mVar, C46930u uVar) {
        this(context, C46969q.m146847a().f120513e, kVar, eVar, mVar, uVar);
    }

    private C46898a(Context context, TwitterAuthConfig twitterAuthConfig, C46939k<? extends C46938j<TwitterAuthToken>> kVar, C46825e eVar, C46875m mVar, C46930u uVar) {
        super(context, m146701d(), uVar, new C46932a(m146699c()), twitterAuthConfig, kVar, eVar, mVar);
        this.f120260e = context;
        this.f120258c = kVar;
        this.f120259d = mVar.mo117974b();
    }
}
