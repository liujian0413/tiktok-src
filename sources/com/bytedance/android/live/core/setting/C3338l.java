package com.bytedance.android.live.core.setting;

import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.core.setting.l */
public class C3338l<T> {

    /* renamed from: a */
    public final String f10092a;

    /* renamed from: b */
    public final String f10093b;

    /* renamed from: c */
    public final T f10094c;

    /* renamed from: d */
    public final T f10095d;

    /* renamed from: e */
    public final Type f10096e;

    /* renamed from: f */
    public final String[] f10097f;

    /* renamed from: a */
    public T mo10240a() {
        if (C3339m.m12452b()) {
            return this.f10095d;
        }
        return C3339m.m12446a("key_ttlive_sdk_setting", this.f10092a, this.f10096e, this.f10094c);
    }

    public C3338l(String str, Class<T> cls) {
        this(str, cls, "");
    }

    public C3338l(String str, T t) {
        this(str, t, "");
    }

    public C3338l(String str, T t, String str2) {
        this(str, str2, t, t);
    }

    public C3338l(String str, Class<T> cls, String str2) {
        this(str, cls, str2, (T) null, (T) null);
    }

    public C3338l(String str, T t, String str2, String... strArr) {
        this(str, str2, t, t, strArr);
    }

    public C3338l(String str, String str2, T t, T t2) {
        this(str, t.getClass(), str2, t, t2, null);
    }

    public C3338l(String str, Class<T> cls, String str2, T t, T t2) {
        this(str, cls, str2, null, null, null);
    }

    public C3338l(String str, String str2, T t, T t2, String... strArr) {
        this(str, t.getClass(), str2, t, t2, strArr);
    }

    private C3338l(String str, Class<T> cls, String str2, T t, T t2, String[] strArr) {
        this.f10092a = str;
        this.f10093b = str2;
        this.f10094c = t;
        this.f10095d = t2;
        this.f10096e = cls;
        this.f10097f = strArr;
    }
}
