package com.p280ss.android.ugc.aweme.filter;

import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.h */
public final class C29297h {
    /* renamed from: b */
    public static final float m96119b(C29296g gVar, C29238ba baVar) {
        C7573i.m23587b(gVar, "$this$getSafeInternalDefaultIntensity");
        C7573i.m23587b(baVar, "getter");
        m96118a(gVar, baVar);
        return gVar.f77275j;
    }

    /* renamed from: a */
    public static final void m96118a(C29296g gVar, C29238ba baVar) {
        float f;
        C7573i.m23587b(gVar, "$this$setInternalDefaultIntensity");
        C7573i.m23587b(baVar, "getter");
        if (-1.0f == gVar.f77275j) {
            if (gVar.mo74978b() != null) {
                String b = gVar.mo74978b();
                C7573i.m23582a((Object) b, "filterFolder");
                f = baVar.mo74856a(b);
            } else {
                f = 0.8f;
            }
            gVar.f77275j = f;
            if (-1.0f == gVar.f77275j) {
                StringBuilder sb = new StringBuilder("[FilterBean.setInternalDefaultIntensity] filterFolder:");
                sb.append(gVar.mo74978b());
                sb.append(" internalDefaultIntensity == -1");
                C41530am.m132283b(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static final float m96116a(C29296g gVar, C29230az azVar, C29238ba baVar) {
        C7573i.m23587b(gVar, "$this$getStoreIntensity");
        C7573i.m23587b(azVar, "iFilterIntensityStore");
        C7573i.m23587b(baVar, "getter");
        return m96115a(gVar, azVar.mo74794a(gVar, baVar), baVar);
    }

    /* renamed from: a */
    public static final float m96115a(C29296g gVar, int i, C29238ba baVar) {
        double d;
        C7573i.m23587b(gVar, "$this$progress2Intensity");
        C7573i.m23587b(baVar, "getter");
        m96118a(gVar, baVar);
        if (gVar.f77275j == 1.0f) {
            double d2 = (double) i;
            Double.isNaN(d2);
            d = d2 / 100.0d;
        } else if (gVar.f77275j <= 0.8f) {
            double d3 = (double) gVar.f77275j;
            Double.isNaN(d3);
            double d4 = d3 / 80.0d;
            double d5 = (double) i;
            Double.isNaN(d5);
            d = d5 * d4;
        } else {
            double d6 = (double) gVar.f77275j;
            Double.isNaN(d6);
            double d7 = d6 / 80.0d;
            double d8 = (double) gVar.f77275j;
            Double.isNaN(d8);
            double d9 = (1.0d - d8) / 20.0d;
            if (i <= 80) {
                double d10 = (double) i;
                Double.isNaN(d10);
                d = d10 * d7;
            } else {
                double d11 = (double) gVar.f77275j;
                double d12 = (double) (i - 80);
                Double.isNaN(d12);
                double d13 = d9 * d12;
                Double.isNaN(d11);
                d = d11 + d13;
            }
        }
        return (float) d;
    }

    /* renamed from: a */
    public static final int m96117a(C29296g gVar, float f, C29238ba baVar) {
        C7573i.m23587b(gVar, "$this$intensity2Progress");
        C7573i.m23587b(baVar, "getter");
        m96118a(gVar, baVar);
        if (gVar.f77275j == 1.0f) {
            return (int) (f * 100.0f);
        }
        if (gVar.f77275j <= 0.8f) {
            return (int) (f / (gVar.f77275j / 80.0f));
        }
        float f2 = gVar.f77275j / 80.0f;
        float f3 = (1.0f - gVar.f77275j) / 20.0f;
        if (f <= gVar.f77275j) {
            return (int) (f / f2);
        }
        return ((int) ((f - gVar.f77275j) / f3)) + 80;
    }
}
