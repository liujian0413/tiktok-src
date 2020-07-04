package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.util.C15322e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@C6505uv
public final class aby implements buw {

    /* renamed from: a */
    private final Object f39960a = new Object();

    /* renamed from: b */
    private final acf f39961b;

    /* renamed from: c */
    private final abw f39962c;

    /* renamed from: d */
    private final abu f39963d;

    /* renamed from: e */
    private final HashSet<abl> f39964e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<abx> f39965f = new HashSet<>();

    public aby(String str, acf acf) {
        this.f39963d = new abu(str, acf);
        this.f39961b = acf;
        this.f39962c = new abw();
    }

    /* renamed from: a */
    public final void mo39122a(abx abx) {
        synchronized (this.f39960a) {
            this.f39965f.add(abx);
        }
    }

    /* renamed from: a */
    public final void mo39121a(abl abl) {
        synchronized (this.f39960a) {
            this.f39964e.add(abl);
        }
    }

    /* renamed from: a */
    public final void mo39124a(HashSet<abl> hashSet) {
        synchronized (this.f39960a) {
            this.f39964e.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public final Bundle mo39118a(Context context, abv abv) {
        HashSet hashSet = new HashSet();
        synchronized (this.f39960a) {
            hashSet.addAll(this.f39964e);
            this.f39964e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f39963d.mo39108a(context, this.f39962c.mo39113b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f39965f.iterator();
        while (it.hasNext()) {
            abx abx = (abx) it.next();
            bundle2.putBundle(abx.f39955a, abx.mo39114a());
        }
        bundle.putBundle("slots", bundle2);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((abl) it2.next()).mo39082d());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        abv.mo37606a(hashSet);
        return bundle;
    }

    /* renamed from: a */
    public final void mo39125a(boolean z) {
        long a = C14793ay.m42901g().mo38684a();
        if (z) {
            if (a - this.f39961b.mo39158j() > ((Long) bym.m50299d().mo41272a(C15585bw.f43757aD)).longValue()) {
                this.f39963d.f39943a = -1;
                return;
            }
            this.f39963d.f39943a = this.f39961b.mo39159k();
            return;
        }
        this.f39961b.mo39135a(a);
        this.f39961b.mo39139b(this.f39963d.f39943a);
    }

    /* renamed from: a */
    public final void mo39120a() {
        synchronized (this.f39960a) {
            this.f39963d.mo39109a();
        }
    }

    /* renamed from: b */
    public final void mo39126b() {
        synchronized (this.f39960a) {
            this.f39963d.mo39111b();
        }
    }

    /* renamed from: a */
    public final void mo39123a(zzyv zzyv, long j) {
        synchronized (this.f39960a) {
            this.f39963d.mo39110a(zzyv, j);
        }
    }

    /* renamed from: a */
    public final abl mo39119a(C15322e eVar, String str) {
        return new abl(eVar, this, this.f39962c.mo39112a(), str);
    }
}
