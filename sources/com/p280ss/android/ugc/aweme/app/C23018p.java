package com.p280ss.android.ugc.aweme.app;

import com.p280ss.android.ugc.aweme.C21758j;
import com.p280ss.android.ugc.aweme.antiaddic.C22565d;
import com.p280ss.android.ugc.aweme.main.dialogmanager.C32985a;
import com.p280ss.android.ugc.aweme.splash.C41740e;
import com.p280ss.android.ugc.aweme.utils.permission.PermissionStateReporter;

/* renamed from: com.ss.android.ugc.aweme.app.p */
public class C23018p {

    /* renamed from: a */
    private static C23018p f60794a;

    /* renamed from: b */
    private C21758j f60795b;

    /* renamed from: b */
    public final boolean mo59989b() {
        return this.f60795b.f58270b;
    }

    /* renamed from: c */
    public final boolean mo59990c() {
        return this.f60795b.f58276h;
    }

    /* renamed from: d */
    public final long mo59991d() {
        return this.f60795b.f58275g;
    }

    /* renamed from: e */
    public final long mo59992e() {
        return this.f60795b.f58271c;
    }

    /* renamed from: a */
    public static C23018p m75672a() {
        if (f60794a == null) {
            synchronized (C23018p.class) {
                if (f60794a == null) {
                    f60794a = new C23018p();
                }
            }
        }
        return f60794a;
    }

    private C23018p() {
        AwemeApplication a = AwemeApplication.m21341a();
        if (a != null) {
            this.f60795b = new C21758j(a);
            C22565d.m74591d();
            C22565d.m74592e();
            C22565d.m74591d().mo59210a(PermissionStateReporter.m136859d());
            C22565d.m74591d().mo59210a(C32985a.f85948a);
            this.f60795b.f58272d = C22565d.m74591d();
            this.f60795b.f58273e = C41740e.f108634a;
        }
    }
}
