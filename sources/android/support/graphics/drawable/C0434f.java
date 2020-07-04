package android.support.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p022v4.content.res.C0704f;
import android.support.p022v4.graphics.C0722b;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.graphics.drawable.f */
public final class C0434f implements Interpolator {

    /* renamed from: a */
    private float[] f1870a;

    /* renamed from: b */
    private float[] f1871b;

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f1870a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f1870a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f1870a[length] - this.f1870a[i];
        if (f2 == 0.0f) {
            return this.f1871b[i];
        }
        float f3 = (f - this.f1870a[i]) / f2;
        float f4 = this.f1871b[i];
        return f4 + (f3 * (this.f1871b[length] - f4));
    }

    /* renamed from: a */
    private void m1922a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f1870a = new float[min];
            this.f1871b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, null);
                this.f1870a[i2] = fArr[0];
                this.f1871b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f1870a[0])) <= 1.0E-5d && ((double) Math.abs(this.f1871b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f1870a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f1871b[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        int i5 = i4 + 1;
                        float f2 = this.f1870a[i4];
                        if (f2 >= f) {
                            this.f1870a[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            StringBuilder sb = new StringBuilder("The Path cannot loop back on itself, x :");
                            sb.append(f2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f1870a[0]);
            sb2.append(",");
            sb2.append(this.f1871b[0]);
            sb2.append(" end:");
            int i6 = min - 1;
            sb2.append(this.f1870a[i6]);
            sb2.append(",");
            sb2.append(this.f1871b[i6]);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("The Path has a invalid length ");
        sb3.append(length);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    private void m1919a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m1922a(path);
    }

    /* renamed from: a */
    private void m1921a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C0704f.m2994a(xmlPullParser, "pathData")) {
            String a = C0704f.m2992a(typedArray, xmlPullParser, "pathData", 4);
            Path a2 = C0722b.m3070a(a);
            if (a2 != null) {
                m1922a(a2);
                return;
            }
            StringBuilder sb = new StringBuilder("The path is null, which is created from ");
            sb.append(a);
            throw new InflateException(sb.toString());
        } else if (!C0704f.m2994a(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0704f.m2994a(xmlPullParser, "controlY1")) {
            float a3 = C0704f.m2988a(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float a4 = C0704f.m2988a(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean a5 = C0704f.m2994a(xmlPullParser, "controlX2");
            if (a5 != C0704f.m2994a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!a5) {
                m1919a(a3, a4);
            } else {
                m1920a(a3, a4, C0704f.m2988a(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C0704f.m2988a(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public C0434f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private C0434f(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1867l);
        m1921a(a, xmlPullParser);
        a.recycle();
    }

    /* renamed from: a */
    private void m1920a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m1922a(path);
    }
}
