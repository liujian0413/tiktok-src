package android.support.p022v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.p022v4.content.res.C0700e.C0701a;
import android.support.p022v4.content.res.FontResourcesParserCompat.C0693a;
import android.support.p022v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import android.support.p022v4.content.res.FontResourcesParserCompat.ProviderResourceEntry;
import android.support.p022v4.p025c.C0658b;
import android.support.p022v4.p025c.C0658b.C0664b;
import android.support.p022v4.util.C0894f;

/* renamed from: android.support.v4.graphics.c */
public final class C0725c {

    /* renamed from: a */
    private static final C0740f f2729a;

    /* renamed from: b */
    private static final C0894f<String, Typeface> f2730b = new C0894f<>(16);

    static {
        if (VERSION.SDK_INT >= 28) {
            f2729a = new TypefaceCompatApi28Impl();
        } else if (VERSION.SDK_INT >= 26) {
            f2729a = new TypefaceCompatApi26Impl();
        } else if (VERSION.SDK_INT >= 24 && C0739e.m3141a()) {
            f2729a = new C0739e();
        } else if (VERSION.SDK_INT >= 21) {
            f2729a = new C0726d();
        } else {
            f2729a = new C0740f();
        }
    }

    /* renamed from: a */
    public static Typeface m3087a(Resources resources, int i, int i2) {
        return (Typeface) f2730b.mo3341a(m3088b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m3088b(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public static Typeface m3085a(Context context, CancellationSignal cancellationSignal, C0664b[] bVarArr, int i) {
        return f2729a.mo2879a(context, (CancellationSignal) null, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m3084a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f2729a.mo2878a(context, resources, i, str, i2);
        if (a != null) {
            f2730b.mo3342a(m3088b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m3086a(Context context, C0693a aVar, Resources resources, int i, int i2, C0701a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        int i3;
        if (aVar instanceof ProviderResourceEntry) {
            ProviderResourceEntry providerResourceEntry = (ProviderResourceEntry) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : providerResourceEntry.f2653c == 0) {
                z2 = true;
            }
            if (z) {
                i3 = providerResourceEntry.f2652b;
            } else {
                i3 = -1;
            }
            typeface = C0658b.m2839a(context, providerResourceEntry.f2651a, aVar2, handler, z2, i3, i2);
        } else {
            typeface = f2729a.mo2880a(context, (FontFamilyFilesResourceEntry) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo2847a(typeface, handler);
                } else {
                    aVar2.mo2846a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f2730b.mo3342a(m3088b(resources, i, i2), typeface);
        }
        return typeface;
    }
}
