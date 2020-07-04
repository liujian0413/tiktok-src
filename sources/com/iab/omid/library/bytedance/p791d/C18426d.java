package com.iab.omid.library.bytedance.p791d;

import android.text.TextUtils;
import com.iab.omid.library.bytedance.C18391a;
import com.iab.omid.library.bytedance.adsession.C18403g;
import com.iab.omid.library.bytedance.adsession.Owner;

/* renamed from: com.iab.omid.library.bytedance.d.d */
public final class C18426d {
    /* renamed from: a */
    public static void m60666a() {
        if (!C18391a.m60533a()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m60667a(Owner owner) {
        if (owner.equals(Owner.NONE)) {
            throw new IllegalArgumentException("Impression owner is none");
        }
    }

    /* renamed from: a */
    public static void m60668a(C18403g gVar) {
        if (gVar.f49924b) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m60669a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m60670a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m60671b(C18403g gVar) {
        if (gVar.f49925c) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m60672c(C18403g gVar) {
        m60677h(gVar);
        m60671b(gVar);
    }

    /* renamed from: d */
    public static void m60673d(C18403g gVar) {
        if (gVar.mo47811d().f49968a != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m60674e(C18403g gVar) {
        if (gVar.mo47811d().f49969b != null) {
            throw new IllegalStateException("VideoEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m60675f(C18403g gVar) {
        if (!gVar.mo47815h()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m60676g(C18403g gVar) {
        if (!gVar.mo47816i()) {
            throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m60677h(C18403g gVar) {
        if (!gVar.f49924b) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
