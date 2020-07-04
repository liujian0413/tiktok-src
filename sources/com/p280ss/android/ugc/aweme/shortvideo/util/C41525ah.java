package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p280ss.android.medialib.p883d.C19719e;
import com.p280ss.android.ugc.aweme.filter.C29248bh;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38554a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ah */
public final class C41525ah {
    /* renamed from: a */
    public static void m132266a() {
        C29248bh.m95938a(C39810eq.f103468d, C39810eq.f103482r, C39810eq.f103485u, C39810eq.f103465a, C39810eq.f103466b);
        if (TextUtils.equals(Build.BRAND, "Xiaomi") && !m132268a("android.content.res.MiuiResourcesImpl", "sMiuiThemeEnabled", false)) {
            m132268a("android.content.res.MiuiResources", "sMiuiThemeEnabled", false);
        }
    }

    /* renamed from: b */
    private static void m132269b() {
        m132266a();
        C19719e eVar = new C19719e();
        Application b = C35574k.m114861b();
        for (int a : C38554a.f100198a) {
            eVar.mo52424a((Context) b, a, C39810eq.f103485u);
        }
        eVar.mo52424a((Context) b, (int) R.raw.facereshape_v2, C39810eq.f103485u);
    }

    /* renamed from: a */
    public static void m132267a(boolean z) {
        m132266a();
        m132270b(true);
        m132269b();
    }

    /* renamed from: b */
    private static void m132270b(boolean z) {
        m132266a();
        Application b = C35574k.m114861b();
        new C19719e().mo52424a((Context) b, C29248bh.f77165a, C39810eq.f103468d);
        int[] iArr = C38554a.f100199b;
        C19719e eVar = new C19719e();
        for (int a : iArr) {
            eVar.mo52424a((Context) b, a, C39810eq.f103482r);
        }
    }

    /* renamed from: a */
    private static boolean m132268a(String str, String str2, boolean z) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.setBoolean(null, false);
                z2 = true;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
        }
        return z2;
    }
}
