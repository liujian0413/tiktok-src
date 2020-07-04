package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.bl */
public abstract class C15573bl<T> {

    /* renamed from: a */
    public final int f42433a;

    /* renamed from: b */
    public final String f42434b;

    /* renamed from: c */
    public final T f42435c;

    private C15573bl(int i, String str, T t) {
        this.f42433a = i;
        this.f42434b = str;
        this.f42435c = t;
        bym.m50298c().mo41183a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo40868a(SharedPreferences sharedPreferences);

    /* renamed from: a */
    public abstract T mo40869a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo40870a(JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo40871a(Editor editor, T t);

    /* renamed from: a */
    public static C15573bl<Boolean> m49160a(int i, String str, Boolean bool) {
        return new C15574bm(i, str, bool);
    }

    /* renamed from: a */
    public static C15573bl<Integer> m49158a(int i, String str, int i2) {
        return new C15575bn(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static C15573bl<Long> m49159a(int i, String str, long j) {
        return new C15576bo(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static C15573bl<Float> m49157a(int i, String str, float f) {
        return new C15578bp(i, str, Float.valueOf(f));
    }

    /* renamed from: a */
    public static C15573bl<String> m49161a(int i, String str, String str2) {
        return new C15579bq(i, str, str2);
    }

    /* renamed from: a */
    public static C15573bl<String> m49156a(int i, String str) {
        C15573bl<String> a = m49161a(i, str, (String) null);
        bym.m50298c().mo41185b(a);
        return a;
    }

    /* renamed from: b */
    public static C15573bl<String> m49162b(int i, String str) {
        C15573bl<String> a = m49161a(i, str, (String) null);
        bym.m50298c().mo41186c(a);
        return a;
    }

    /* synthetic */ C15573bl(int i, String str, Object obj, C15574bm bmVar) {
        this(i, str, obj);
    }
}
