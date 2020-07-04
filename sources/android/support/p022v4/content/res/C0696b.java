package android.support.p022v4.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Shader;

/* renamed from: android.support.v4.content.res.b */
public final class C0696b {

    /* renamed from: a */
    public final Shader f2660a;

    /* renamed from: b */
    public int f2661b;

    /* renamed from: c */
    private final ColorStateList f2662c;

    /* renamed from: c */
    public final boolean mo2845c() {
        if (mo2842a() || this.f2661b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo2844b() {
        if (this.f2660a != null || this.f2662c == null || !this.f2662c.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo2842a() {
        if (this.f2660a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static C0696b m2961a(int i) {
        return new C0696b(null, null, i);
    }

    /* renamed from: a */
    private static C0696b m2962a(ColorStateList colorStateList) {
        return new C0696b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: a */
    private static C0696b m2964a(Shader shader) {
        return new C0696b(shader, null, 0);
    }

    /* renamed from: a */
    public final boolean mo2843a(int[] iArr) {
        if (mo2844b()) {
            int colorForState = this.f2662c.getColorForState(iArr, this.f2662c.getDefaultColor());
            if (colorForState != this.f2661b) {
                this.f2661b = colorForState;
                return true;
            }
        }
        return false;
    }

    private C0696b(Shader shader, ColorStateList colorStateList, int i) {
        this.f2660a = shader;
        this.f2662c = colorStateList;
        this.f2661b = i;
    }

    /* renamed from: a */
    public static C0696b m2963a(Resources resources, int i, Theme theme) {
        try {
            return m2965b(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r1.equals("gradient") != false) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p022v4.content.res.C0696b m2965b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r7)
        L_0x0008:
            int r1 = r7.next()
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L_0x0012
            if (r1 != r2) goto L_0x0008
        L_0x0012:
            if (r1 != r3) goto L_0x006f
            java.lang.String r1 = r7.getName()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 89650992(0x557f730, float:1.01546526E-35)
            if (r4 == r5) goto L_0x0032
            r2 = 1191572447(0x4705f3df, float:34291.87)
            if (r4 == r2) goto L_0x0028
            goto L_0x003b
        L_0x0028:
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x003b
            r2 = 0
            goto L_0x003c
        L_0x0032:
            java.lang.String r4 = "gradient"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r2 = -1
        L_0x003c:
            switch(r2) {
                case 0: goto L_0x0066;
                case 1: goto L_0x005d;
                default: goto L_0x003f;
            }
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r8.append(r7)
            java.lang.String r7 = ": unsupported complex color tag "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L_0x005d:
            android.graphics.Shader r6 = android.support.p022v4.content.res.C0697c.m2971a(r6, r7, r0, r8)
            android.support.v4.content.res.b r6 = m2964a(r6)
            return r6
        L_0x0066:
            android.content.res.ColorStateList r6 = android.support.p022v4.content.res.C0695a.m2958a(r6, r7, r0, r8)
            android.support.v4.content.res.b r6 = m2962a(r6)
            return r6
        L_0x006f:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.content.res.C0696b.m2965b(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.v4.content.res.b");
    }
}
