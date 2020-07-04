package android.support.p022v4.content.res;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.support.compat.R$styleable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.res.c */
final class C0697c {

    /* renamed from: android.support.v4.content.res.c$a */
    static final class C0698a {

        /* renamed from: a */
        final int[] f2663a;

        /* renamed from: b */
        final float[] f2664b;

        C0698a(int i, int i2) {
            this.f2663a = new int[]{i, i2};
            this.f2664b = new float[]{0.0f, 1.0f};
        }

        C0698a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2663a = new int[size];
            this.f2664b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f2663a[i] = ((Integer) list.get(i)).intValue();
                this.f2664b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        C0698a(int i, int i2, int i3) {
            this.f2663a = new int[]{i, i2, i3};
            this.f2664b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }

    /* renamed from: a */
    private static TileMode m2970a(int i) {
        switch (i) {
            case 1:
                return TileMode.REPEAT;
            case 2:
                return TileMode.MIRROR;
            default:
                return TileMode.CLAMP;
        }
    }

    /* renamed from: a */
    static Shader m2971a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Theme theme2 = theme;
            TypedArray a = C0704f.m2990a(resources, theme2, attributeSet, R$styleable.GradientColor);
            float a2 = C0704f.m2988a(a, xmlPullParser2, "startX", 8, 0.0f);
            float a3 = C0704f.m2988a(a, xmlPullParser2, "startY", 9, 0.0f);
            float a4 = C0704f.m2988a(a, xmlPullParser2, "endX", 10, 0.0f);
            float a5 = C0704f.m2988a(a, xmlPullParser2, "endY", 11, 0.0f);
            float a6 = C0704f.m2988a(a, xmlPullParser2, "centerX", 3, 0.0f);
            float a7 = C0704f.m2988a(a, xmlPullParser2, "centerY", 4, 0.0f);
            int a8 = C0704f.m2989a(a, xmlPullParser2, "type", 2, 0);
            int b = C0704f.m2995b(a, xmlPullParser2, "startColor", 0, 0);
            boolean a9 = C0704f.m2994a(xmlPullParser2, "centerColor");
            int b2 = C0704f.m2995b(a, xmlPullParser2, "centerColor", 7, 0);
            int b3 = C0704f.m2995b(a, xmlPullParser2, "endColor", 1, 0);
            int a10 = C0704f.m2989a(a, xmlPullParser2, "tileMode", 6, 0);
            float f = a5;
            float a11 = C0704f.m2988a(a, xmlPullParser2, "gradientRadius", 5, 0.0f);
            a.recycle();
            C0698a a12 = m2972a(m2973b(resources, xmlPullParser, attributeSet, theme), b, b3, a9, b2);
            switch (a8) {
                case 1:
                    if (a11 > 0.0f) {
                        int[] iArr = a12.f2663a;
                        RadialGradient radialGradient = new RadialGradient(a6, a7, a11, iArr, a12.f2664b, m2970a(a10));
                        return radialGradient;
                    }
                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                case 2:
                    return new SweepGradient(a6, a7, a12.f2663a, a12.f2664b);
                default:
                    LinearGradient linearGradient = new LinearGradient(a2, a3, a4, f, a12.f2663a, a12.f2664b, m2970a(a10));
                    return linearGradient;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p022v4.content.res.C0697c.C0698a m2973b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x007b
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x007b
        L_0x0021:
            r6 = 2
            if (r3 != r6) goto L_0x0012
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0012
            int[] r3 = android.support.compat.R$styleable.GradientColorItem
            android.content.res.TypedArray r3 = android.support.p022v4.content.res.C0704f.m2990a(r8, r11, r10, r3)
            r5 = 0
            boolean r6 = r3.hasValue(r5)
            boolean r7 = r3.hasValue(r1)
            if (r6 == 0) goto L_0x0060
            if (r7 == 0) goto L_0x0060
            int r5 = r3.getColor(r5, r5)
            r6 = 0
            float r6 = r3.getFloat(r1, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0060:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x007b:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0087
            android.support.v4.content.res.c$a r8 = new android.support.v4.content.res.c$a
            r8.<init>(r4, r2)
            return r8
        L_0x0087:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.content.res.C0697c.m2973b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.support.v4.content.res.c$a");
    }

    /* renamed from: a */
    private static C0698a m2972a(C0698a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C0698a(i, i3, i2);
        }
        return new C0698a(i, i2);
    }
}
