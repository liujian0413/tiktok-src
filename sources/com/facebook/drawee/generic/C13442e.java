package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import com.facebook.drawee.drawable.C13408c;
import com.facebook.drawee.drawable.C13412g;
import com.facebook.drawee.drawable.C13415j;
import com.facebook.drawee.drawable.C13416k;
import com.facebook.drawee.drawable.C13417l;
import com.facebook.drawee.drawable.C13419n;
import com.facebook.drawee.drawable.C13420o;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.generic.RoundingParams.RoundingMethod;
import com.facebook.imagepipeline.p725l.C13783b;

/* renamed from: com.facebook.drawee.generic.e */
public final class C13442e {

    /* renamed from: a */
    private static final Drawable f35648a = new ColorDrawable(0);

    /* renamed from: a */
    private static void m39489a(C13415j jVar, RoundingParams roundingParams) {
        jVar.mo32771a(roundingParams.f35612b);
        jVar.mo32772a(roundingParams.f35613c);
        jVar.mo32770a(roundingParams.f35616f, roundingParams.f35615e);
        jVar.mo32773b(roundingParams.f35617g);
        jVar.mo32774b(roundingParams.f35618h);
    }

    /* renamed from: a */
    private static C13408c m39484a(C13408c cVar) {
        while (true) {
            Drawable drawable = cVar.getDrawable();
            if (drawable == cVar || !(drawable instanceof C13408c)) {
                return cVar;
            }
            cVar = (C13408c) drawable;
        }
        return cVar;
    }

    /* renamed from: a */
    private static void m39488a(C13415j jVar) {
        jVar.mo32771a(false);
        jVar.mo32768a(0.0f);
        jVar.mo32770a(0, 0.0f);
        jVar.mo32773b(0.0f);
        jVar.mo32774b(false);
    }

    /* renamed from: a */
    static Drawable m39480a(Drawable drawable, C13423b bVar) {
        return m39481a(drawable, bVar, (PointF) null);
    }

    /* renamed from: a */
    static C13420o m39485a(C13408c cVar, C13423b bVar) {
        Drawable a = m39480a(cVar.setDrawable(f35648a), bVar);
        cVar.setDrawable(a);
        C13307g.m38941a(a, (Object) "Parent has no child drawable!");
        return (C13420o) a;
    }

    /* renamed from: a */
    static Drawable m39482a(Drawable drawable, RoundingParams roundingParams) {
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (!(drawable == null || roundingParams == null)) {
                if (roundingParams.f35611a == RoundingMethod.OVERLAY_COLOR) {
                    RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                    m39489a((C13415j) roundedCornersDrawable, roundingParams);
                    roundedCornersDrawable.mo32769a(roundingParams.f35614d);
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                    return roundedCornersDrawable;
                }
            }
            return drawable;
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* renamed from: a */
    static void m39486a(C13408c cVar, RoundingParams roundingParams) {
        Drawable drawable = cVar.getDrawable();
        if (roundingParams == null || roundingParams.f35611a != RoundingMethod.OVERLAY_COLOR) {
            if (drawable instanceof RoundedCornersDrawable) {
                cVar.setDrawable(((RoundedCornersDrawable) drawable).setCurrent(f35648a));
                f35648a.setCallback(null);
            }
        } else if (drawable instanceof RoundedCornersDrawable) {
            RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) drawable;
            m39489a((C13415j) roundedCornersDrawable, roundingParams);
            roundedCornersDrawable.mo32769a(roundingParams.f35614d);
        } else {
            cVar.setDrawable(m39482a(cVar.setDrawable(f35648a), roundingParams));
        }
    }

    /* renamed from: a */
    static Drawable m39481a(Drawable drawable, C13423b bVar, PointF pointF) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            return drawable;
        }
        C13420o oVar = new C13420o(drawable, bVar);
        if (pointF != null) {
            oVar.mo32862a(pointF);
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return oVar;
    }

    /* renamed from: b */
    private static Drawable m39490b(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C13416k kVar = new C13416k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m39489a((C13415j) kVar, roundingParams);
            return kVar;
        } else if (drawable instanceof NinePatchDrawable) {
            C13419n nVar = new C13419n((NinePatchDrawable) drawable);
            m39489a((C13415j) nVar, roundingParams);
            return nVar;
        } else if (!(drawable instanceof ColorDrawable) || VERSION.SDK_INT < 11) {
            C13286a.m38855b("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        } else {
            C13417l a = C13417l.m39359a((ColorDrawable) drawable);
            m39489a((C13415j) a, roundingParams);
            return a;
        }
    }

    /* renamed from: a */
    static Drawable m39483a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (!(drawable == null || roundingParams == null)) {
                if (roundingParams.f35611a == RoundingMethod.BITMAP_ONLY) {
                    if (drawable instanceof C13412g) {
                        C13408c a = m39484a((C13408c) (C13412g) drawable);
                        a.setDrawable(m39490b(a.setDrawable(f35648a), roundingParams, resources));
                        if (C13783b.m40665b()) {
                            C13783b.m40663a();
                        }
                        return drawable;
                    }
                    Drawable b = m39490b(drawable, roundingParams, resources);
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                    return b;
                }
            }
            return drawable;
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* renamed from: a */
    static void m39487a(C13408c cVar, RoundingParams roundingParams, Resources resources) {
        C13408c a = m39484a(cVar);
        Drawable drawable = a.getDrawable();
        if (roundingParams == null || roundingParams.f35611a != RoundingMethod.BITMAP_ONLY) {
            if (drawable instanceof C13415j) {
                m39488a((C13415j) drawable);
            }
        } else if (drawable instanceof C13415j) {
            m39489a((C13415j) drawable, roundingParams);
        } else if (drawable != null) {
            a.setDrawable(f35648a);
            a.setDrawable(m39490b(drawable, roundingParams, resources));
        }
    }
}
