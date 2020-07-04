package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.analytics.C14933l;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.google.android.gms.internal.measurement.bn */
public final class C16421bn extends C16695r {

    /* renamed from: b */
    public final C16423bp f45973b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SharedPreferences f45974c;

    /* renamed from: d */
    private long f45975d;

    /* renamed from: e */
    private long f45976e = -1;

    protected C16421bn(C16697t tVar) {
        super(tVar);
        C16423bp bpVar = new C16423bp(this, "monitoring", ((Long) C16406az.f45903D.f45945a).longValue());
        this.f45973b = bpVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
        this.f45974c = C7285c.m22838a(mo43204h(), "com.google.android.gms.analytics.prefs", 0);
    }

    /* renamed from: b */
    public final long mo42551b() {
        C14933l.m43382c();
        mo43214s();
        if (this.f45975d == 0) {
            long j = this.f45974c.getLong("first_run", 0);
            if (j != 0) {
                this.f45975d = j;
            } else {
                long a = mo43203g().mo38684a();
                Editor edit = this.f45974c.edit();
                edit.putLong("first_run", a);
                if (!edit.commit()) {
                    mo43200e("Failed to commit first run time");
                }
                this.f45975d = a;
            }
        }
        return this.f45975d;
    }

    /* renamed from: c */
    public final C16431bx mo42552c() {
        return new C16431bx(mo43203g(), mo42551b());
    }

    /* renamed from: d */
    public final long mo42553d() {
        C14933l.m43382c();
        mo43214s();
        if (this.f45976e == -1) {
            this.f45976e = this.f45974c.getLong("last_dispatch", 0);
        }
        return this.f45976e;
    }

    /* renamed from: e */
    public final void mo42554e() {
        C14933l.m43382c();
        mo43214s();
        long a = mo43203g().mo38684a();
        Editor edit = this.f45974c.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f45976e = a;
    }

    /* renamed from: f */
    public final String mo42555f() {
        C14933l.m43382c();
        mo43214s();
        String string = this.f45974c.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* renamed from: a */
    public final void mo42550a(String str) {
        C14933l.m43382c();
        mo43214s();
        Editor edit = this.f45974c.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            mo43200e("Failed to commit campaign data");
        }
    }
}
