package com.airbnb.lottie.p056d;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.p051a.p052a.C1686r;
import java.io.Closeable;

/* renamed from: com.airbnb.lottie.d.f */
public final class C1751f {

    /* renamed from: a */
    private static final PathMeasure f6304a = new PathMeasure();

    /* renamed from: b */
    private static final Path f6305b = new Path();

    /* renamed from: c */
    private static final Path f6306c = new Path();

    /* renamed from: d */
    private static final float[] f6307d = new float[4];

    /* renamed from: e */
    private static final float f6308e = ((float) Math.sqrt(2.0d));

    /* renamed from: f */
    private static float f6309f = -1.0f;

    /* renamed from: a */
    public static int m8369a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: a */
    public static boolean m8374a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    /* renamed from: a */
    public static float m8367a() {
        if (f6309f == -1.0f) {
            f6309f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f6309f;
    }

    /* renamed from: a */
    public static void m8373a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m8368a(Matrix matrix) {
        f6307d[0] = 0.0f;
        f6307d[1] = 0.0f;
        f6307d[2] = f6308e;
        f6307d[3] = f6308e;
        matrix.mapPoints(f6307d);
        return ((float) Math.hypot((double) (f6307d[2] - f6307d[0]), (double) (f6307d[3] - f6307d[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m8372a(Path path, C1686r rVar) {
        if (rVar != null) {
            m8371a(path, ((Float) rVar.f6227b.mo7151e()).floatValue() / 100.0f, ((Float) rVar.f6228c.mo7151e()).floatValue() / 100.0f, ((Float) rVar.f6229d.mo7151e()).floatValue() / 360.0f);
        }
    }

    /* renamed from: a */
    public static Path m8370a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: a */
    public static void m8371a(Path path, float f, float f2, float f3) {
        C1745d.m8324b("applyTrimPathIfNeeded");
        f6304a.setPath(path, false);
        float length = f6304a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C1745d.m8325c("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C1745d.m8325c("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C1750e.m8357a(min, length);
                max = (float) C1750e.m8357a(max, length);
            }
            if (min < 0.0f) {
                min = (float) C1750e.m8357a(min, length);
            }
            if (max < 0.0f) {
                max = (float) C1750e.m8357a(max, length);
            }
            if (min == max) {
                path.reset();
                C1745d.m8325c("applyTrimPathIfNeeded");
                return;
            }
            if (min >= max) {
                min -= length;
            }
            f6305b.reset();
            f6304a.getSegment(min, max, f6305b, true);
            if (max > length) {
                f6306c.reset();
                f6304a.getSegment(0.0f, max % length, f6306c, true);
                f6305b.addPath(f6306c);
            } else if (min < 0.0f) {
                f6306c.reset();
                f6304a.getSegment(min + length, length, f6306c, true);
                f6305b.addPath(f6306c);
            }
            path.set(f6305b);
            C1745d.m8325c("applyTrimPathIfNeeded");
        }
    }
}
