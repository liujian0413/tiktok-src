package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.gson.BooleanDefaultFalseAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.gson.IntegerDefaultZeroAdater;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.m */
public final class C31913m {

    /* renamed from: a */
    private static C31870ap<C6600e> f83389a = new C31870ap<C6600e>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo18004a() {
            return m103669c();
        }

        /* renamed from: c */
        private static C6600e m103669c() {
            return new C6607f().mo15986a(Boolean.class, new BooleanDefaultFalseAdapter()).mo15986a(Integer.class, new IntegerDefaultZeroAdater()).mo15986a(Boolean.TYPE, new BooleanDefaultFalseAdapter()).mo15992f();
        }
    };

    /* renamed from: a */
    public static C6600e m103666a() {
        return (C6600e) f83389a.mo82721b();
    }

    /* renamed from: a */
    public static String m103668a(Object obj) {
        return ((C6600e) f83389a.mo82721b()).mo15979b(obj);
    }

    /* renamed from: a */
    public static <T> T m103667a(String str, Class<T> cls) {
        return ((C6600e) f83389a.mo82721b()).mo15974a(str, cls);
    }
}
