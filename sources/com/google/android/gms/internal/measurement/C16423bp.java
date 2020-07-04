package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.C15267r;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.measurement.bp */
public final class C16423bp {

    /* renamed from: a */
    private final String f45977a;

    /* renamed from: b */
    private final long f45978b;

    /* renamed from: c */
    private final /* synthetic */ C16421bn f45979c;

    private C16423bp(C16421bn bnVar, String str, long j) {
        this.f45979c = bnVar;
        C15267r.m44386a(str);
        C15267r.m44394b(j > 0);
        this.f45977a = str;
        this.f45978b = j;
    }

    /* renamed from: b */
    private final void m53522b() {
        long a = this.f45979c.mo43203g().mo38684a();
        Editor edit = this.f45979c.f45974c.edit();
        edit.remove(m53525e());
        edit.remove(m53526f());
        edit.putLong(m53524d(), a);
        edit.commit();
    }

    /* renamed from: a */
    public final void mo42557a(String str) {
        if (m53523c() == 0) {
            m53522b();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j = this.f45979c.f45974c.getLong(m53525e(), 0);
            if (j <= 0) {
                Editor edit = this.f45979c.f45974c.edit();
                edit.putString(m53526f(), str);
                edit.putLong(m53525e(), 1);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            boolean z = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2;
            Editor edit2 = this.f45979c.f45974c.edit();
            if (z) {
                edit2.putString(m53526f(), str);
            }
            edit2.putLong(m53525e(), j2);
            edit2.apply();
        }
    }

    /* renamed from: a */
    public final Pair<String, Long> mo42556a() {
        long j;
        long c = m53523c();
        if (c == 0) {
            j = 0;
        } else {
            j = Math.abs(c - this.f45979c.mo43203g().mo38684a());
        }
        if (j < this.f45978b) {
            return null;
        }
        if (j > (this.f45978b << 1)) {
            m53522b();
            return null;
        }
        String string = this.f45979c.f45974c.getString(m53526f(), null);
        long j2 = this.f45979c.f45974c.getLong(m53525e(), 0);
        m53522b();
        if (string == null || j2 <= 0) {
            return null;
        }
        return new Pair<>(string, Long.valueOf(j2));
    }

    /* renamed from: c */
    private final long m53523c() {
        return this.f45979c.f45974c.getLong(m53524d(), 0);
    }

    /* renamed from: d */
    private final String m53524d() {
        return String.valueOf(this.f45977a).concat(":start");
    }

    /* renamed from: e */
    private final String m53525e() {
        return String.valueOf(this.f45977a).concat(":count");
    }

    /* renamed from: f */
    private final String m53526f() {
        return String.valueOf(this.f45977a).concat(":value");
    }
}
