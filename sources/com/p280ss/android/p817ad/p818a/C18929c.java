package com.p280ss.android.p817ad.p818a;

import android.content.Context;
import com.p280ss.android.p817ad.p818a.p819a.C18914b;
import com.p280ss.android.p817ad.p818a.p819a.C18915c;
import com.p280ss.android.p817ad.p818a.p819a.C18917e;
import com.p280ss.android.p817ad.p818a.p819a.C18918f;
import com.p280ss.android.p817ad.p818a.p819a.C18919g;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.a.c */
public final class C18929c {

    /* renamed from: a */
    private static C18918f f51021a;

    /* renamed from: b */
    private static C18915c f51022b;

    /* renamed from: c */
    private static C18914b f51023c;

    /* renamed from: d */
    private static C18917e f51024d;

    /* renamed from: e */
    private static String f51025e;

    /* renamed from: f */
    private static C18919g f51026f;

    /* renamed from: g */
    private static Context f51027g;

    /* renamed from: h */
    private static int f51028h;

    /* renamed from: i */
    private static int f51029i;

    /* renamed from: j */
    private static int f51030j;

    /* renamed from: a */
    public static C18918f m61775a() {
        return f51021a;
    }

    /* renamed from: b */
    public static C18914b m61784b() {
        return f51023c;
    }

    /* renamed from: c */
    public static String m61785c() {
        return f51025e;
    }

    /* renamed from: d */
    public static C18917e m61786d() {
        return f51024d;
    }

    /* renamed from: e */
    public static C18919g m61787e() {
        return f51026f;
    }

    /* renamed from: f */
    public static int m61788f() {
        return f51028h;
    }

    /* renamed from: g */
    public static int m61789g() {
        return f51029i;
    }

    /* renamed from: h */
    public static int m61790h() {
        return f51030j;
    }

    /* renamed from: i */
    public static Context m61791i() {
        return f51027g;
    }

    /* renamed from: j */
    private static C18915c m61792j() {
        return f51022b;
    }

    /* renamed from: a */
    public static void m61776a(int i) {
        f51028h = i;
    }

    /* renamed from: a */
    public static void m61777a(Context context) {
        f51027g = context;
    }

    /* renamed from: a */
    public static void m61778a(C18914b bVar) {
        f51023c = bVar;
    }

    /* renamed from: a */
    public static void m61779a(C18915c cVar) {
        f51022b = cVar;
    }

    /* renamed from: a */
    public static void m61780a(C18918f fVar) {
        f51021a = fVar;
    }

    /* renamed from: a */
    public static void m61781a(C18919g gVar) {
        f51026f = gVar;
    }

    /* renamed from: a */
    public static void m61782a(String str) {
        f51025e = str;
    }

    /* renamed from: a */
    public static void m61783a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", "smartphone");
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("category", "umeng");
            m61792j().mo50291a(str, str2, str3, str4, jSONObject);
        } catch (Exception unused) {
        }
    }
}
