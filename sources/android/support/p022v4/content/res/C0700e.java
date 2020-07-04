package android.support.p022v4.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.content.res.FontResourcesParserCompat.C0693a;
import android.support.p022v4.graphics.C0725c;
import android.support.p022v4.util.C0903j;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.res.e */
public final class C0700e {

    /* renamed from: android.support.v4.content.res.e$a */
    public static abstract class C0701a {
        /* renamed from: a */
        public abstract void mo1053a(int i);

        /* renamed from: a */
        public abstract void mo1054a(Typeface typeface);

        /* renamed from: a */
        public final void mo2846a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                    C0701a.this.mo1053a(i);
                }
            });
        }

        /* renamed from: a */
        public final void mo2847a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public final void run() {
                    C0701a.this.mo1054a(typeface);
                }
            });
        }
    }

    /* renamed from: a */
    public static Typeface m2977a(Context context, int i) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2979a(context, i, new TypedValue(), 0, null, null, false);
    }

    /* renamed from: a */
    public static Drawable m2981a(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    /* renamed from: b */
    public static int m2983b(Resources resources, int i, Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    /* renamed from: a */
    public static void m2982a(Context context, int i, C0701a aVar, Handler handler) throws NotFoundException {
        C0903j.m3840a(aVar);
        if (context.isRestricted()) {
            aVar.mo2846a(-4, (Handler) null);
            return;
        }
        m2979a(context, i, new TypedValue(), 0, aVar, null, false);
    }

    /* renamed from: a */
    public static Typeface m2978a(Context context, int i, TypedValue typedValue, int i2, C0701a aVar) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m2979a(context, i, typedValue, i2, aVar, null, true);
    }

    /* renamed from: a */
    private static Typeface m2979a(Context context, int i, TypedValue typedValue, int i2, C0701a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m2980a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* renamed from: a */
    private static Typeface m2980a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C0701a aVar, Handler handler, boolean z) {
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i3 = i;
        int i4 = i2;
        C0701a aVar2 = aVar;
        Handler handler2 = handler;
        if (typedValue2.string != null) {
            String charSequence = typedValue2.string.toString();
            if (!charSequence.startsWith("res/")) {
                if (aVar2 != null) {
                    aVar2.mo2846a(-3, handler2);
                }
                return null;
            }
            Typeface a = C0725c.m3087a(resources, i, i4);
            if (a != null) {
                if (aVar2 != null) {
                    aVar2.mo2847a(a, handler2);
                }
                return a;
            }
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    C0693a a2 = FontResourcesParserCompat.m2949a((XmlPullParser) resources.getXml(i), resources);
                    if (a2 != null) {
                        return C0725c.m3086a(context, a2, resources, i, i2, aVar, handler, z);
                    }
                    if (aVar2 != null) {
                        aVar2.mo2846a(-3, handler2);
                    }
                    return null;
                }
                Context context2 = context;
                Typeface a3 = C0725c.m3084a(context, resources, i, charSequence, i4);
                if (aVar2 != null) {
                    if (a3 != null) {
                        aVar2.mo2847a(a3, handler2);
                    } else {
                        aVar2.mo2846a(-3, handler2);
                    }
                }
                return a3;
            } catch (IOException | XmlPullParserException unused) {
                if (aVar2 != null) {
                    aVar2.mo2846a(-3, handler2);
                }
                return null;
            }
        } else {
            StringBuilder sb = new StringBuilder("Resource \"");
            sb.append(resources.getResourceName(i));
            sb.append("\" (");
            sb.append(Integer.toHexString(i));
            sb.append(") is not a Font: ");
            sb.append(typedValue);
            throw new NotFoundException(sb.toString());
        }
    }
}
