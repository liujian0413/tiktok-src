package com.p280ss.android.pushmanager.client;

import android.content.Context;
import com.p280ss.android.pushmanager.setting.C20090b;

/* renamed from: com.ss.android.pushmanager.client.h */
public class C20070h {

    /* renamed from: a */
    private static volatile C20070h f54270a;

    /* renamed from: a */
    public static C20070h m66075a() {
        if (f54270a == null) {
            synchronized (C20070h.class) {
                if (f54270a == null) {
                    f54270a = new C20070h();
                }
            }
        }
        return f54270a;
    }

    /* renamed from: a */
    public static void m66076a(Context context, String str) {
        C20090b.m66187a().mo53758a(str);
    }

    /* renamed from: b */
    public static void m66078b(Context context, String str) {
        C20090b.m66187a().mo53762b(str);
    }

    /* renamed from: c */
    public static void m66080c(Context context, boolean z) {
        C20090b.m66187a().mo53759a(z);
    }

    /* renamed from: d */
    public static void m66081d(Context context, boolean z) {
        C20090b.m66187a().mo53774e(z);
    }

    /* renamed from: a */
    public static void m66077a(Context context, boolean z) {
        C20090b.m66187a().mo53763b(z);
    }

    /* renamed from: b */
    public static void m66079b(Context context, boolean z) {
        boolean u = C20090b.m66187a().mo53794u();
        C20090b.m66187a().mo53777f(z);
        if (!u && z) {
            MessageAppManager.inst().registerAllThirdPush(context);
            MessageAppManager.inst().registerSelfPush(context);
        }
    }
}
