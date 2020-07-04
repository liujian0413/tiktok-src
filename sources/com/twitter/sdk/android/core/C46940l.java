package com.twitter.sdk.android.core;

import android.content.Context;
import com.twitter.sdk.android.core.internal.C46849a;
import com.twitter.sdk.android.core.internal.C46869g;
import com.twitter.sdk.android.core.internal.C46871i;
import com.twitter.sdk.android.core.internal.C46875m;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.twitter.sdk.android.core.l */
public final class C46940l {

    /* renamed from: a */
    static final C46828g f120358a = new C46822c();

    /* renamed from: b */
    static volatile C46940l f120359b;

    /* renamed from: c */
    public final C46875m f120360c = new C46875m(this.f120364g);

    /* renamed from: d */
    public final ExecutorService f120361d;

    /* renamed from: e */
    public final TwitterAuthConfig f120362e;

    /* renamed from: f */
    public final C46849a f120363f = new C46849a(this.f120364g);

    /* renamed from: g */
    private final Context f120364g;

    /* renamed from: h */
    private final C46828g f120365h;

    /* renamed from: i */
    private final boolean f120366i;

    /* renamed from: e */
    private static void m146822e() {
        C46941m.m146824a();
    }

    /* renamed from: b */
    public static C46940l m146818b() {
        m146822e();
        return f120359b;
    }

    /* renamed from: a */
    public static void m146816a() {
        if (f120359b == null) {
            throw new IllegalStateException("Must initialize Twitter before using getInstance()");
        }
    }

    /* renamed from: c */
    public static boolean m146820c() {
        if (f120359b == null) {
            return false;
        }
        return f120359b.f120366i;
    }

    /* renamed from: d */
    public static C46828g m146821d() {
        if (f120359b == null) {
            return f120358a;
        }
        return f120359b.f120365h;
    }

    /* renamed from: a */
    public static void m146817a(C46966o oVar) {
        m146819b(oVar);
    }

    /* renamed from: b */
    private static synchronized C46940l m146819b(C46966o oVar) {
        synchronized (C46940l.class) {
            if (f120359b == null) {
                C46940l lVar = new C46940l(oVar);
                f120359b = lVar;
                return lVar;
            }
            C46940l lVar2 = f120359b;
            return lVar2;
        }
    }

    /* renamed from: a */
    public final Context mo118084a(String str) {
        Context context = this.f120364g;
        StringBuilder sb = new StringBuilder(".TwitterKit");
        sb.append(File.separator);
        sb.append(str);
        return new C7312p(context, str, sb.toString());
    }

    private C46940l(C46966o oVar) {
        this.f120364g = oVar.f120499a;
        if (oVar.f120501c == null) {
            this.f120362e = new TwitterAuthConfig(C46869g.m146600a(this.f120364g, "com.twitter.sdk.android.CONSUMER_KEY", ""), C46869g.m146600a(this.f120364g, "com.twitter.sdk.android.CONSUMER_SECRET", ""));
        } else {
            this.f120362e = oVar.f120501c;
        }
        if (oVar.f120502d == null) {
            this.f120361d = C46871i.m146613a("twitter-worker");
        } else {
            this.f120361d = oVar.f120502d;
        }
        if (oVar.f120500b == null) {
            this.f120365h = f120358a;
        } else {
            this.f120365h = oVar.f120500b;
        }
        if (oVar.f120503e == null) {
            this.f120366i = false;
        } else {
            this.f120366i = oVar.f120503e.booleanValue();
        }
    }
}
