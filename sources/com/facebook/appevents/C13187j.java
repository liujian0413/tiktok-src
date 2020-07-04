package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.appevents.j */
public final class C13187j {

    /* renamed from: a */
    private C13159g f34931a;

    /* renamed from: b */
    public final void mo32370b() {
        C13159g.m38467b();
    }

    /* renamed from: a */
    public static FlushBehavior m38542a() {
        return C13159g.m38459a();
    }

    /* renamed from: c */
    static Executor m38543c() {
        return C13159g.m38472f();
    }

    /* renamed from: d */
    static String m38544d() {
        return C13159g.m38470d();
    }

    public C13187j(Context context) {
        this.f34931a = new C13159g(context, (String) null, (AccessToken) null);
    }

    /* renamed from: a */
    public final void mo32364a(String str) {
        if (C13499h.m39728n()) {
            this.f34931a.mo32331a(str, (Double) null, (Bundle) null);
        }
    }

    /* renamed from: b */
    public final void mo32371b(String str, Bundle bundle) {
        if (C13499h.m39728n()) {
            this.f34931a.mo32331a(str, (Double) null, bundle);
        }
    }

    public C13187j(Context context, String str) {
        this.f34931a = new C13159g(context, str, (AccessToken) null);
    }

    /* renamed from: a */
    public final void mo32366a(String str, Bundle bundle) {
        if (C13499h.m39728n()) {
            this.f34931a.mo32330a(str, bundle);
        }
    }

    /* renamed from: a */
    public final void mo32365a(String str, double d, Bundle bundle) {
        if (C13499h.m39728n()) {
            this.f34931a.mo32329a(str, d, bundle);
        }
    }

    public C13187j(String str, String str2, AccessToken accessToken) {
        this.f34931a = new C13159g(str, str2, (AccessToken) null);
    }

    /* renamed from: a */
    public final void mo32367a(String str, Double d, Bundle bundle) {
        if (C13499h.m39728n()) {
            this.f34931a.mo32331a(str, (Double) null, bundle);
        }
    }

    /* renamed from: a */
    public final void mo32369a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C13499h.m39728n()) {
            this.f34931a.mo32333a(bigDecimal, currency, bundle);
        }
    }

    /* renamed from: a */
    public final void mo32368a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C13499h.m39728n()) {
            this.f34931a.mo32332a(str, bigDecimal, currency, bundle);
        }
    }
}
