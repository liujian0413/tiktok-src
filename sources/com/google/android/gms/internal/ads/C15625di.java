package com.google.android.gms.internal.ads;

import android.support.p022v4.util.C0904k;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.Arrays;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.di */
public final class C15625di extends C15683fl implements C15636ds {

    /* renamed from: a */
    private final C15612cw f44305a;

    /* renamed from: b */
    private final String f44306b;

    /* renamed from: c */
    private final C0904k<String, C15620dd> f44307c;

    /* renamed from: d */
    private final C0904k<String, String> f44308d;

    /* renamed from: e */
    private C15488ak f44309e;

    /* renamed from: f */
    private View f44310f;

    /* renamed from: g */
    private final Object f44311g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C15632dp f44312h;

    public C15625di(String str, C0904k<String, C15620dd> kVar, C0904k<String, String> kVar2, C15612cw cwVar, C15488ak akVar, View view) {
        this.f44306b = str;
        this.f44307c = kVar;
        this.f44308d = kVar2;
        this.f44305a = cwVar;
        this.f44309e = akVar;
        this.f44310f = view;
    }

    /* renamed from: b */
    public final String mo41481b() {
        return "3";
    }

    /* renamed from: a */
    public final String mo41531a(String str) {
        return (String) this.f44308d.get(str);
    }

    /* renamed from: b */
    public final C15658en mo41534b(String str) {
        return (C15658en) this.f44307c.get(str);
    }

    /* renamed from: a */
    public final List<String> mo41532a() {
        String[] strArr = new String[(this.f44307c.size() + this.f44308d.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f44307c.size()) {
            strArr[i3] = (String) this.f44307c.mo3417b(i2);
            i2++;
            i3++;
        }
        while (i < this.f44308d.size()) {
            strArr[i3] = (String) this.f44308d.mo3417b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: c */
    public final String mo41482c() {
        return this.f44306b;
    }

    /* renamed from: a */
    public final void mo41480a(C15632dp dpVar) {
        synchronized (this.f44311g) {
            this.f44312h = dpVar;
        }
    }

    /* renamed from: f */
    public final C15345b mo41536f() {
        return C15349d.m44668a(this.f44312h);
    }

    /* renamed from: d */
    public final C15612cw mo41483d() {
        return this.f44305a;
    }

    /* renamed from: g */
    public final C15488ak mo41537g() {
        return this.f44309e;
    }

    /* renamed from: a */
    public final boolean mo41533a(C15345b bVar) {
        if (this.f44312h == null) {
            afm.m45779c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f44310f == null) {
            return false;
        } else {
            FrameLayout frameLayout = (FrameLayout) C15349d.m44669a(bVar);
            this.f44312h.mo41594a((View) frameLayout, (C15630dn) new C15626dj(this));
            return true;
        }
    }

    /* renamed from: e */
    public final View mo41484e() {
        return this.f44310f;
    }

    /* renamed from: c */
    public final void mo41535c(String str) {
        synchronized (this.f44311g) {
            if (this.f44312h == null) {
                afm.m45779c("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.f44312h.mo41595a(null, str, null, null, null, false);
            }
        }
    }

    /* renamed from: h */
    public final void mo41538h() {
        synchronized (this.f44311g) {
            if (this.f44312h == null) {
                afm.m45779c("#002 Attempt to record impression before native ad initialized.");
            } else {
                this.f44312h.mo41574a((View) null, null);
            }
        }
    }

    /* renamed from: i */
    public final C15345b mo41539i() {
        return C15349d.m44668a(this.f44312h.mo41603p().getApplicationContext());
    }

    /* renamed from: j */
    public final void mo41540j() {
        acl.f40003a.post(new C15627dk(this));
        this.f44309e = null;
        this.f44310f = null;
    }
}
