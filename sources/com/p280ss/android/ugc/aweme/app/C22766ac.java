package com.p280ss.android.ugc.aweme.app;

import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.util.C6772a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.app.ac */
public final class C22766ac {

    /* renamed from: a */
    private String f60455a = "";

    /* renamed from: b */
    private long f60456b;

    /* renamed from: com.ss.android.ugc.aweme.app.ac$a */
    static final class C22767a {

        /* renamed from: a */
        static final C22766ac f60457a = new C22766ac();
    }

    /* renamed from: a */
    public static C22766ac m75145a() {
        return C22767a.f60457a;
    }

    /* renamed from: c */
    private void m75146c() {
        C6772a.m20923a().f19270a = this.f60455a;
        C6772a.m20923a().mo16564a(true);
    }

    /* renamed from: d */
    private void m75147d() {
        C6772a.m20923a().f19270a = this.f60455a;
        C6772a.m20923a().mo16564a(false);
    }

    /* renamed from: b */
    public final String mo59819b() {
        if (System.currentTimeMillis() - this.f60456b > TimeUnit.DAYS.toMillis(2)) {
            this.f60455a = "";
            this.f60456b = 0;
        }
        return this.f60455a;
    }

    /* renamed from: a */
    public final void mo59818a(String str) {
        if (str != null && !str.equals(this.f60455a)) {
            this.f60455a = str;
            this.f60456b = System.currentTimeMillis();
        }
        if (C6319n.m19593a(str)) {
            m75147d();
        } else {
            m75146c();
        }
    }
}
