package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.C15322e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@C6505uv
public final class abl {

    /* renamed from: a */
    public final String f39897a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15322e f39898b;

    /* renamed from: c */
    private final aby f39899c;

    /* renamed from: d */
    private final LinkedList<abm> f39900d;

    /* renamed from: e */
    private final Object f39901e = new Object();

    /* renamed from: f */
    private final String f39902f;

    /* renamed from: g */
    private long f39903g = -1;

    /* renamed from: h */
    private long f39904h = -1;

    /* renamed from: i */
    private boolean f39905i = false;

    /* renamed from: j */
    private long f39906j = -1;

    /* renamed from: k */
    private long f39907k = 0;

    /* renamed from: l */
    private long f39908l = -1;

    /* renamed from: m */
    private long f39909m = -1;

    abl(C15322e eVar, aby aby, String str, String str2) {
        this.f39898b = eVar;
        this.f39899c = aby;
        this.f39897a = str;
        this.f39902f = str2;
        this.f39900d = new LinkedList<>();
    }

    /* renamed from: a */
    public final void mo39076a(zzyv zzyv) {
        synchronized (this.f39901e) {
            this.f39908l = this.f39898b.mo38685b();
            this.f39899c.mo39123a(zzyv, this.f39908l);
        }
    }

    /* renamed from: a */
    public final void mo39075a(long j) {
        synchronized (this.f39901e) {
            this.f39909m = j;
            if (this.f39909m != -1) {
                this.f39899c.mo39121a(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo39079b(long j) {
        synchronized (this.f39901e) {
            if (this.f39909m != -1) {
                this.f39903g = j;
                this.f39899c.mo39121a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo39074a() {
        synchronized (this.f39901e) {
            if (this.f39909m != -1 && this.f39904h == -1) {
                this.f39904h = this.f39898b.mo38685b();
                this.f39899c.mo39121a(this);
            }
            this.f39899c.mo39126b();
        }
    }

    /* renamed from: b */
    public final void mo39078b() {
        synchronized (this.f39901e) {
            if (this.f39909m != -1) {
                abm abm = new abm(this);
                abm.mo39084b();
                this.f39900d.add(abm);
                this.f39907k++;
                this.f39899c.mo39120a();
                this.f39899c.mo39121a(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo39081c() {
        synchronized (this.f39901e) {
            if (this.f39909m != -1 && !this.f39900d.isEmpty()) {
                abm abm = (abm) this.f39900d.getLast();
                if (abm.f39910a == -1) {
                    abm.mo39083a();
                    this.f39899c.mo39121a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo39077a(boolean z) {
        synchronized (this.f39901e) {
            if (this.f39909m != -1) {
                this.f39906j = this.f39898b.mo38685b();
                if (!z) {
                    this.f39904h = this.f39906j;
                    this.f39899c.mo39121a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo39080b(boolean z) {
        synchronized (this.f39901e) {
            if (this.f39909m != -1) {
                this.f39905i = z;
                this.f39899c.mo39121a(this);
            }
        }
    }

    /* renamed from: d */
    public final Bundle mo39082d() {
        Bundle bundle;
        synchronized (this.f39901e) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f39897a);
            bundle.putString("slotid", this.f39902f);
            bundle.putBoolean("ismediation", this.f39905i);
            bundle.putLong("treq", this.f39908l);
            bundle.putLong("tresponse", this.f39909m);
            bundle.putLong("timp", this.f39904h);
            bundle.putLong("tload", this.f39906j);
            bundle.putLong("pcc", this.f39907k);
            bundle.putLong("tfetch", this.f39903g);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f39900d.iterator();
            while (it.hasNext()) {
                arrayList.add(((abm) it.next()).mo39085c());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
