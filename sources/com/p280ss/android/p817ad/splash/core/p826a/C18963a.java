package com.p280ss.android.p817ad.splash.core.p826a;

import android.content.Context;
import com.p280ss.android.p817ad.splash.core.p826a.C18964b.C18967c;

/* renamed from: com.ss.android.ad.splash.core.a.a */
public class C18963a extends C18964b {

    /* renamed from: c */
    private static volatile C18963a f51130c;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C18967c mo50389a() {
        return super.mo50389a();
    }

    private C18963a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static C18963a m61924a(Context context) {
        if (f51130c == null) {
            synchronized (C18963a.class) {
                if (f51130c == null) {
                    f51130c = new C18963a(context);
                }
            }
        }
        return f51130c;
    }
}
