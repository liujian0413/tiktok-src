package android.support.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.graphics.drawable.c */
public final class C0430c {
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.animation.Interpolator m1896a(android.content.Context r4, int r5) throws android.content.res.Resources.NotFoundException {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x000b
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r5)
            return r4
        L_0x000b:
            r0 = 0
            r1 = 17563663(0x10c000f, float:2.571398E-38)
            if (r5 != r1) goto L_0x001e
            android.support.v4.view.animation.FastOutLinearInInterpolator r4 = new android.support.v4.view.animation.FastOutLinearInInterpolator     // Catch:{ XmlPullParserException -> 0x001c, IOException -> 0x001a }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x001c, IOException -> 0x001a }
            return r4
        L_0x0017:
            r4 = move-exception
            goto L_0x008d
        L_0x001a:
            r4 = move-exception
            goto L_0x0057
        L_0x001c:
            r4 = move-exception
            goto L_0x0072
        L_0x001e:
            r1 = 17563661(0x10c000d, float:2.5713975E-38)
            if (r5 != r1) goto L_0x0029
            android.support.v4.view.animation.FastOutSlowInInterpolator r4 = new android.support.v4.view.animation.FastOutSlowInInterpolator     // Catch:{ XmlPullParserException -> 0x001c, IOException -> 0x001a }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x001c, IOException -> 0x001a }
            return r4
        L_0x0029:
            r1 = 17563662(0x10c000e, float:2.5713978E-38)
            if (r5 != r1) goto L_0x0034
            android.support.v4.view.animation.LinearOutSlowInInterpolator r4 = new android.support.v4.view.animation.LinearOutSlowInInterpolator     // Catch:{ XmlPullParserException -> 0x001c, IOException -> 0x001a }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x001c, IOException -> 0x001a }
            return r4
        L_0x0034:
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ XmlPullParserException -> 0x001c, IOException -> 0x001a }
            android.content.res.XmlResourceParser r1 = r1.getAnimation(r5)     // Catch:{ XmlPullParserException -> 0x001c, IOException -> 0x001a }
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ XmlPullParserException -> 0x0054, IOException -> 0x0051, all -> 0x004e }
            android.content.res.Resources$Theme r2 = r4.getTheme()     // Catch:{ XmlPullParserException -> 0x0054, IOException -> 0x0051, all -> 0x004e }
            android.view.animation.Interpolator r4 = m1897a(r4, r0, r2, r1)     // Catch:{ XmlPullParserException -> 0x0054, IOException -> 0x0051, all -> 0x004e }
            if (r1 == 0) goto L_0x004d
            r1.close()
        L_0x004d:
            return r4
        L_0x004e:
            r4 = move-exception
            r0 = r1
            goto L_0x008d
        L_0x0051:
            r4 = move-exception
            r0 = r1
            goto L_0x0057
        L_0x0054:
            r4 = move-exception
            r0 = r1
            goto L_0x0072
        L_0x0057:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0017 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "Can't load animation resource ID #0x"
            r2.<init>(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0017 }
            r2.append(r5)     // Catch:{ all -> 0x0017 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0017 }
            r1.<init>(r5)     // Catch:{ all -> 0x0017 }
            r1.initCause(r4)     // Catch:{ all -> 0x0017 }
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0072:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0017 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "Can't load animation resource ID #0x"
            r2.<init>(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0017 }
            r2.append(r5)     // Catch:{ all -> 0x0017 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0017 }
            r1.<init>(r5)     // Catch:{ all -> 0x0017 }
            r1.initCause(r4)     // Catch:{ all -> 0x0017 }
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            r0.close()
        L_0x0092:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0430c.m1896a(android.content.Context, int):android.view.animation.Interpolator");
    }

    /* renamed from: a */
    private static Interpolator m1897a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Interpolator fVar;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            fVar = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            fVar = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            fVar = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            fVar = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            fVar = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            fVar = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            fVar = new C0434f(context, asAttributeSet, xmlPullParser);
                        } else {
                            StringBuilder sb = new StringBuilder("Unknown interpolator name: ");
                            sb.append(xmlPullParser.getName());
                            throw new RuntimeException(sb.toString());
                        }
                        interpolator = fVar;
                    }
                }
            }
        }
        return interpolator;
    }
}
