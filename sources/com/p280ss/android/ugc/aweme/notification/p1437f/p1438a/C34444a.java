package com.p280ss.android.ugc.aweme.notification.p1437f.p1438a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.notification.f.a.a */
public final class C34444a<T> {

    /* renamed from: a */
    protected T f89882a;

    /* renamed from: b */
    public String f89883b;

    /* renamed from: b */
    private static SharedPreferences m111402b() {
        return C7285c.m22838a(C6399b.m19921a(), "aweme-app", 0);
    }

    /* renamed from: a */
    public final T mo87756a() {
        T t;
        SharedPreferences b = m111402b();
        try {
            Class<Boolean> cls = this.f89882a.getClass();
            if (cls == String.class) {
                t = b.getString(this.f89883b, (String) this.f89882a);
            } else if (cls == Integer.class) {
                t = Integer.valueOf(b.getInt(this.f89883b, ((Integer) this.f89882a).intValue()));
            } else if (cls == Float.class) {
                t = Float.valueOf(b.getFloat(this.f89883b, ((Float) this.f89882a).floatValue()));
            } else if (cls == Long.class) {
                t = Long.valueOf(b.getLong(this.f89883b, ((Long) this.f89882a).longValue()));
            } else if (cls == Boolean.class) {
                t = Boolean.valueOf(b.getBoolean(this.f89883b, ((Boolean) this.f89882a).booleanValue()));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = b.getStringSet(this.f89883b, (Set) this.f89882a);
            } else {
                throw new AssertionError();
            }
            if (t == null) {
                m111403b(this.f89882a);
                t = this.f89882a;
            }
            if (t.getClass() != this.f89882a.getClass()) {
                t = this.f89882a;
            }
            return t;
        } catch (Exception unused) {
            return this.f89882a;
        }
    }

    /* renamed from: b */
    private void m111403b(T t) {
        m111401a(t, false);
    }

    /* renamed from: a */
    public final void mo87757a(T t) {
        m111404b(t, false);
    }

    public C34444a(String str, T t) {
        this.f89882a = t;
        this.f89883b = str;
    }

    /* renamed from: b */
    private void m111404b(T t, boolean z) {
        if (t != null) {
            m111401a(t, false);
        }
    }

    /* renamed from: a */
    private void m111401a(T t, boolean z) {
        if (t != null) {
            Editor edit = m111402b().edit();
            if (t instanceof String) {
                edit.putString(this.f89883b, (String) t);
            } else if (t instanceof Integer) {
                edit.putInt(this.f89883b, ((Integer) t).intValue());
            } else if (t instanceof Float) {
                edit.putFloat(this.f89883b, ((Float) t).floatValue());
            } else if (t instanceof Long) {
                edit.putLong(this.f89883b, ((Long) t).longValue());
            } else if (t instanceof Boolean) {
                edit.putBoolean(this.f89883b, ((Boolean) t).booleanValue());
            } else if (t instanceof Set) {
                edit.putStringSet(this.f89883b, (Set) t);
            }
            if (z) {
                edit.commit();
            } else {
                edit.apply();
            }
        }
    }
}
