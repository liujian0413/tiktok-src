package com.bytedance.ies.p534b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.LruCache;
import com.bytedance.common.utility.p481c.C9721b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Set;

/* renamed from: com.bytedance.ies.b.b */
public final class C10296b {

    /* renamed from: b */
    private static LruCache<String, C10296b> f27954b = null;

    /* renamed from: d */
    private static String f27955d = "default_app_sp";

    /* renamed from: e */
    private static int f27956e = 3;

    /* renamed from: a */
    public final SharedPreferences f27957a;

    /* renamed from: c */
    private Editor f27958c;

    /* renamed from: com.bytedance.ies.b.b$a */
    enum C10298a {
        STRING,
        INTEGER,
        BOOLEAN,
        FLOAT,
        LONG,
        STRING_SET,
        ALL
    }

    /* renamed from: b */
    private void m30497b() {
        if (this.f27958c == null) {
            this.f27958c = this.f27957a.edit();
        }
    }

    /* renamed from: a */
    public final void mo25023a() {
        if (this.f27958c != null) {
            C9721b.m28656a(this.f27958c);
        }
    }

    /* renamed from: a */
    public static C10296b m30493a(Context context) {
        return m30494a(context, f27955d);
    }

    /* renamed from: b */
    public final void mo25025b(String str, Object obj) {
        mo25021a(str, obj);
        mo25023a();
    }

    private C10296b(Context context, String str) {
        this.f27957a = C7285c.m22838a(context, str, 0);
    }

    /* renamed from: a */
    public final int mo25019a(String str, int i) {
        return ((Integer) m30495a(str, C10298a.INTEGER, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static C10296b m30494a(Context context, String str) {
        if (context != null) {
            if (f27954b == null) {
                f27954b = new LruCache<>(f27956e);
            }
            C10296b bVar = (C10296b) f27954b.get(str);
            if (bVar != null) {
                return bVar;
            }
            C10296b bVar2 = new C10296b(context, str);
            f27954b.put(str, bVar2);
            return bVar2;
        }
        throw new NullPointerException("null context!!");
    }

    /* renamed from: a */
    public final long mo25020a(String str, long j) {
        return ((Long) m30495a(str, C10298a.LONG, Long.valueOf(0))).longValue();
    }

    /* renamed from: a */
    public final C10296b mo25021a(String str, Object obj) {
        m30497b();
        if (obj instanceof String) {
            this.f27958c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f27958c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f27958c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f27958c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f27958c.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            this.f27958c.putStringSet(str, (Set) obj);
        } else {
            this.f27958c.putString(str, String.valueOf(obj));
        }
        return this;
    }

    /* renamed from: a */
    public final String mo25022a(String str, String str2) {
        return (String) m30495a(str, C10298a.STRING, str2);
    }

    /* renamed from: a */
    public final boolean mo25024a(String str, boolean z) {
        return ((Boolean) m30495a(str, C10298a.BOOLEAN, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: a */
    private <T> T m30495a(String str, C10298a aVar, Object obj) {
        return m30496b(str, aVar, obj);
    }

    /* renamed from: b */
    private Object m30496b(String str, C10298a aVar, Object obj) {
        switch (aVar) {
            case STRING:
                return this.f27957a.getString(str, (String) obj);
            case INTEGER:
                return Integer.valueOf(this.f27957a.getInt(str, ((Integer) obj).intValue()));
            case BOOLEAN:
                return Boolean.valueOf(this.f27957a.getBoolean(str, ((Boolean) obj).booleanValue()));
            case FLOAT:
                return Float.valueOf(this.f27957a.getFloat(str, ((Float) obj).floatValue()));
            case LONG:
                return Long.valueOf(this.f27957a.getLong(str, ((Long) obj).longValue()));
            case STRING_SET:
                return this.f27957a.getStringSet(str, (Set) obj);
            case ALL:
                return this.f27957a.getAll();
            default:
                return obj;
        }
    }
}
