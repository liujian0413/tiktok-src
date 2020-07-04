package com.p280ss.android.vesdk.runtime.p1778a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.vesdk.runtime.a.a */
public final class C45342a {

    /* renamed from: a */
    private boolean f116790a;

    /* renamed from: b */
    private SharedPreferences f116791b;

    /* renamed from: c */
    private Editor f116792c;

    /* renamed from: com.ss.android.vesdk.runtime.a.a$a */
    enum C45344a {
        INSTANCE;
        

        /* renamed from: b */
        private C45342a f116795b;

        /* renamed from: a */
        public final C45342a mo108561a() {
            return this.f116795b;
        }
    }

    private C45342a() {
    }

    /* renamed from: a */
    public static C45342a m143305a() {
        return C45344a.INSTANCE.mo108561a();
    }

    /* renamed from: b */
    private synchronized void m143306b() {
        if (this.f116792c == null) {
            this.f116792c = this.f116791b.edit();
        }
    }

    /* renamed from: a */
    public final void mo108557a(Context context) {
        synchronized (this) {
            if (!this.f116790a) {
                this.f116791b = C7285c.m22838a(context, context.getPackageName(), 0);
                this.f116790a = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo108558a(String str, Object obj) {
        mo108559a(str, obj, false);
    }

    /* renamed from: b */
    public final <T> T mo108560b(String str, T t) {
        if (t instanceof String) {
            return this.f116791b.getString(str, (String) t);
        }
        if (t instanceof Integer) {
            return Integer.valueOf(this.f116791b.getInt(str, ((Integer) t).intValue()));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(this.f116791b.getBoolean(str, ((Boolean) t).booleanValue()));
        }
        if (t instanceof Float) {
            return Float.valueOf(this.f116791b.getFloat(str, ((Float) t).floatValue()));
        }
        if (t instanceof Long) {
            return Long.valueOf(this.f116791b.getLong(str, ((Long) t).longValue()));
        }
        return this.f116791b.getString(str, null);
    }

    /* renamed from: a */
    public final void mo108559a(String str, Object obj, boolean z) {
        m143306b();
        if (obj instanceof String) {
            this.f116792c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f116792c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f116792c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f116792c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f116792c.putLong(str, ((Long) obj).longValue());
        } else {
            this.f116792c.putString(str, obj.toString());
        }
        if (z) {
            this.f116792c.apply();
        } else {
            this.f116792c.commit();
        }
    }
}
