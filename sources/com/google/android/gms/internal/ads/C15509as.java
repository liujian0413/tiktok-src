package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.as */
public final class C15509as {

    /* renamed from: a */
    public Date f40974a;

    /* renamed from: b */
    public String f40975b;

    /* renamed from: c */
    public int f40976c = -1;

    /* renamed from: d */
    public Location f40977d;

    /* renamed from: e */
    public boolean f40978e = false;

    /* renamed from: f */
    public String f40979f;

    /* renamed from: g */
    public String f40980g;

    /* renamed from: h */
    public boolean f40981h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final HashSet<String> f40982i = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Bundle f40983j = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final HashMap<Class<? extends Object>, Object> f40984k = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final HashSet<String> f40985l = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Bundle f40986m = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final HashSet<String> f40987n = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f40988o = -1;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f40989p = -1;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f40990q;

    /* renamed from: a */
    public final void mo39973a(String str) {
        this.f40982i.add(str);
    }

    /* renamed from: a */
    public final void mo39972a(Class<? extends Object> cls, Bundle bundle) {
        this.f40983j.putBundle(cls.getName(), bundle);
    }

    /* renamed from: b */
    public final void mo39976b(String str) {
        this.f40985l.add(str);
    }

    /* renamed from: c */
    public final void mo39977c(String str) {
        this.f40985l.remove(str);
    }

    /* renamed from: a */
    public final void mo39975a(boolean z) {
        this.f40988o = z ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo39974a(String str, String str2) {
        this.f40986m.putString(str, str2);
    }
}
