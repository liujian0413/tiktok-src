package com.bytedance.ies.ugc.appcontext;

import android.app.Application;
import com.bytedance.ies.ugc.appcontext.C6405d.C6408c;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.ugc.appcontext.c */
public final class C6403c {

    /* renamed from: m */
    public static final C6404a f18720m = new C6404a(null);

    /* renamed from: a */
    public Application f18721a;

    /* renamed from: b */
    public boolean f18722b;

    /* renamed from: c */
    public C6408c f18723c;

    /* renamed from: d */
    public String f18724d;

    /* renamed from: e */
    public Integer f18725e;

    /* renamed from: f */
    public String f18726f;

    /* renamed from: g */
    public String f18727g;

    /* renamed from: h */
    public String f18728h;

    /* renamed from: i */
    public long f18729i;

    /* renamed from: j */
    public String f18730j;

    /* renamed from: k */
    public int f18731k;

    /* renamed from: l */
    public int f18732l;

    /* renamed from: com.bytedance.ies.ugc.appcontext.c$a */
    public static final class C6404a {
        private C6404a() {
        }

        public /* synthetic */ C6404a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C6403c m19964a(Application application, C7562b<? super C6403c, C7581n> bVar) {
            C7573i.m23587b(application, "context");
            C7573i.m23587b(bVar, "init");
            return new C6403c(application, bVar);
        }
    }

    private C6403c() {
        this.f18729i = -1;
        this.f18731k = -1;
    }

    /* renamed from: a */
    public final Application mo15337a() {
        Application application = this.f18721a;
        if (application == null) {
            C7573i.m23583a("context");
        }
        return application;
    }

    /* renamed from: b */
    public final String mo15339b() {
        String str = this.f18726f;
        if (str == null) {
            C7573i.m23583a("appName");
        }
        return str;
    }

    /* renamed from: c */
    public final String mo15341c() {
        String str = this.f18727g;
        if (str == null) {
            C7573i.m23583a("versionName");
        }
        return str;
    }

    /* renamed from: d */
    public final String mo15343d() {
        String str = this.f18728h;
        if (str == null) {
            C7573i.m23583a("flavor");
        }
        return str;
    }

    /* renamed from: e */
    public final String mo15345e() {
        String str = this.f18730j;
        if (str == null) {
            C7573i.m23583a("feedbackAppKey");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo15338a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f18726f = str;
    }

    /* renamed from: b */
    public final void mo15340b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f18727g = str;
    }

    /* renamed from: c */
    public final void mo15342c(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f18728h = str;
    }

    /* renamed from: d */
    public final void mo15344d(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f18730j = str;
    }

    public C6403c(Application application, C7562b<? super C6403c, C7581n> bVar) {
        C7573i.m23587b(application, "context");
        C7573i.m23587b(bVar, "init");
        this();
        this.f18721a = application;
        bVar.invoke(this);
    }
}
