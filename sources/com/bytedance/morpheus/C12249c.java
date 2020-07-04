package com.bytedance.morpheus;

import android.content.Context;
import com.bytedance.morpheus.core.C12250a;
import com.bytedance.morpheus.core.C12251b;
import java.util.Map;

/* renamed from: com.bytedance.morpheus.c */
public final class C12249c {

    /* renamed from: a */
    private static C12248b f32562a;

    /* renamed from: b */
    private static Context f32563b;

    /* renamed from: c */
    private static C12235a f32564c;

    /* renamed from: d */
    private static boolean f32565d;

    /* renamed from: a */
    public static Context m35630a() {
        return f32563b;
    }

    /* renamed from: b */
    public static C12235a m35634b() {
        return f32564c;
    }

    /* renamed from: c */
    public static Map<String, C12250a> m35637c() {
        return f32562a.mo29997a();
    }

    /* renamed from: a */
    public static void m35632a(C12251b bVar) {
        C12253e.m35640a().mo30013a(bVar);
    }

    /* renamed from: b */
    public static C12250a m35635b(String str) {
        return f32562a.mo30000b(str);
    }

    /* renamed from: a */
    public static void m35633a(String str) {
        if (f32565d) {
            f32562a.mo29998a(str);
        }
    }

    /* renamed from: b */
    public static void m35636b(C12251b bVar) {
        C12253e.m35640a().mo30015b(bVar);
    }

    /* renamed from: a */
    public static synchronized void m35631a(C12235a aVar) {
        synchronized (C12249c.class) {
            if (!f32565d) {
                f32564c = aVar;
                f32563b = aVar.mo29993a();
                f32562a = C12252d.m35639a();
                f32565d = true;
            }
        }
    }
}
