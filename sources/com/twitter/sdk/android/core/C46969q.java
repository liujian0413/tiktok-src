package com.twitter.sdk.android.core;

import android.content.Context;
import com.twitter.sdk.android.core.C46823d.C46824a;
import com.twitter.sdk.android.core.internal.C46876n;
import com.twitter.sdk.android.core.internal.C46892r;
import com.twitter.sdk.android.core.internal.C46893s;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.p1846b.C46862c;
import com.twitter.sdk.android.core.internal.scribe.C46904ad;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.twitter.sdk.android.core.q */
public class C46969q {

    /* renamed from: a */
    static volatile C46969q f120509a;

    /* renamed from: b */
    public C46939k<C46972t> f120510b;

    /* renamed from: c */
    C46939k<C46823d> f120511c;

    /* renamed from: d */
    C46876n<C46972t> f120512d;

    /* renamed from: e */
    public final TwitterAuthConfig f120513e;

    /* renamed from: f */
    private final ConcurrentHashMap<C46938j, C46965n> f120514f;

    /* renamed from: g */
    private final Context f120515g;

    /* renamed from: h */
    private volatile C46965n f120516h;

    /* renamed from: i */
    private volatile C46825e f120517i;

    /* renamed from: b */
    public static String m146848b() {
        return "3.2.0.11";
    }

    /* renamed from: g */
    private static String m146851g() {
        return "com.twitter.sdk.android:twitter-core";
    }

    /* renamed from: j */
    private C46965n m146854j() {
        if (this.f120516h == null) {
            m146855k();
        }
        return this.f120516h;
    }

    /* renamed from: c */
    public final C46825e mo118104c() {
        if (this.f120517i == null) {
            m146853i();
        }
        return this.f120517i;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m146850f() {
        this.f120510b.mo117913a();
        this.f120511c.mo117913a();
        mo118104c();
        m146852h();
        this.f120512d.mo117976a(C46940l.m146818b().f120363f);
    }

    /* renamed from: h */
    private void m146852h() {
        C46904ad.m146706a(this.f120515g, this.f120510b, mo118104c(), C46940l.m146818b().f120360c, "TwitterCore", m146848b());
    }

    /* renamed from: i */
    private synchronized void m146853i() {
        if (this.f120517i == null) {
            this.f120517i = new C46825e(new OAuth2Service(this, new C46892r()), this.f120511c);
        }
    }

    /* renamed from: k */
    private synchronized void m146855k() {
        if (this.f120516h == null) {
            this.f120516h = new C46965n();
        }
    }

    /* renamed from: d */
    public final C46965n mo118105d() {
        C46972t tVar = (C46972t) this.f120510b.mo117913a();
        if (tVar == null) {
            return m146854j();
        }
        return mo118103a(tVar);
    }

    /* renamed from: a */
    public static C46969q m146847a() {
        if (f120509a == null) {
            synchronized (C46969q.class) {
                if (f120509a == null) {
                    f120509a = new C46969q(C46940l.m146818b().f120362e);
                    C46940l.m146818b().f120361d.execute(C46970r.f120518a);
                }
            }
        }
        return f120509a;
    }

    private C46969q(TwitterAuthConfig twitterAuthConfig) {
        this(twitterAuthConfig, new ConcurrentHashMap(), null);
    }

    /* renamed from: a */
    public final C46965n mo118103a(C46972t tVar) {
        if (!this.f120514f.containsKey(tVar)) {
            this.f120514f.putIfAbsent(tVar, new C46965n(tVar));
        }
        return (C46965n) this.f120514f.get(tVar);
    }

    private C46969q(TwitterAuthConfig twitterAuthConfig, ConcurrentHashMap<C46938j, C46965n> concurrentHashMap, C46965n nVar) {
        this.f120513e = twitterAuthConfig;
        this.f120514f = concurrentHashMap;
        this.f120516h = null;
        this.f120515g = C46940l.m146818b().mo118084a(m146851g());
        this.f120510b = new C46829h(new C46862c(this.f120515g, "session_store"), new C46973a(), "active_twittersession", "twittersession");
        this.f120511c = new C46829h(new C46862c(this.f120515g, "session_store"), new C46824a(), "active_guestsession", "guestsession");
        this.f120512d = new C46876n<>(this.f120510b, C46940l.m146818b().f120361d, new C46893s());
    }
}
