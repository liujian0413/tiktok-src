package android.support.p022v4.content.res;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.content.res.f */
public final class C0704f {
    /* renamed from: a */
    public static boolean m2994a(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static TypedValue m2996b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2994a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    /* renamed from: a */
    public static TypedArray m2990a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public static String m2992a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2994a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: a */
    public static float m2988a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m2994a(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static int m2995b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2994a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    /* renamed from: c */
    public static int m2997c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2994a(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    /* renamed from: a */
    public static int m2989a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m2994a(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static boolean m2993a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m2994a(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(5, z);
    }

    /* renamed from: a */
    public static C0696b m2991a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme, String str, int i, int i2) {
        if (m2994a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C0696b.m2961a(typedValue.data);
            }
            C0696b a = C0696b.m2963a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (a != null) {
                return a;
            }
        }
        return C0696b.m2961a(0);
    }
}
