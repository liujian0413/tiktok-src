package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.support.p022v4.content.res.C0704f;
import android.support.p022v4.graphics.C0722b;
import android.support.p022v4.graphics.C0722b.C0724b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.graphics.drawable.d */
public final class C0431d {

    /* renamed from: android.support.graphics.drawable.d$a */
    static class C0432a implements TypeEvaluator<C0724b[]> {

        /* renamed from: a */
        private C0724b[] f1868a;

        C0432a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0724b[] evaluate(float f, C0724b[] bVarArr, C0724b[] bVarArr2) {
            if (C0722b.m3073a(bVarArr, bVarArr2)) {
                if (this.f1868a == null || !C0722b.m3073a(this.f1868a, bVarArr)) {
                    this.f1868a = C0722b.m3075a(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f1868a[i].mo2883a(bVarArr[i], bVarArr2[i], f);
                }
                return this.f1868a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static boolean m1915a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    private static PropertyValuesHolder m1909a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !m1915a(i7)) && (!z2 || !m1915a(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0724b[] b = C0722b.m3077b(string);
            C0724b[] b2 = C0722b.m3077b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    C0432a aVar = new C0432a();
                    if (b2 == null) {
                        return PropertyValuesHolder.ofObject(str, aVar, new Object[]{b});
                    } else if (C0722b.m3073a(b, b2)) {
                        propertyValuesHolder = PropertyValuesHolder.ofObject(str, aVar, new Object[]{b, b2});
                    } else {
                        StringBuilder sb = new StringBuilder(" Can't morph from ");
                        sb.append(string);
                        sb.append(" to ");
                        sb.append(string2);
                        throw new InflateException(sb.toString());
                    }
                } else if (b2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, new C0432a(), new Object[]{b2});
                }
            }
            return propertyValuesHolder;
        }
        TypeEvaluator a = i == 3 ? C0433e.m1918a() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f2, f3});
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f2});
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{f});
            }
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (m1915a(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m1915a(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i5, i6});
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i5});
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (m1915a(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i4});
        }
        PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder;
        if (propertyValuesHolder2 == null || a == null) {
            return propertyValuesHolder2;
        }
        propertyValuesHolder2.setEvaluator(a);
        return propertyValuesHolder2;
    }

    /* renamed from: a */
    private static void m1912a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long a = (long) C0704f.m2989a(typedArray, xmlPullParser, "duration", 1, (int) C34943c.f91128x);
        long a2 = (long) C0704f.m2989a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a3 = C0704f.m2989a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0704f.m2994a(xmlPullParser, "valueFrom") && C0704f.m2994a(xmlPullParser, "valueTo")) {
            if (a3 == 4) {
                a3 = m1899a(typedArray, 5, 6);
            }
            PropertyValuesHolder a4 = m1909a(typedArray, a3, 5, 6, "");
            if (a4 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{a4});
            }
        }
        valueAnimator.setDuration(a);
        valueAnimator.setStartDelay(a2);
        valueAnimator.setRepeatCount(C0704f.m2989a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0704f.m2989a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m1911a(valueAnimator, typedArray2, a3, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    private static void m1911a(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String a = C0704f.m2992a(typedArray, xmlPullParser, "pathData", 1);
        if (a != null) {
            String a2 = C0704f.m2992a(typedArray, xmlPullParser, "propertyXName", 2);
            String a3 = C0704f.m2992a(typedArray, xmlPullParser, "propertyYName", 3);
            if (a2 == null && a3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            m1913a(C0722b.m3070a(a), objectAnimator, f * 0.5f, a2, a3);
            return;
        }
        objectAnimator.setPropertyName(C0704f.m2992a(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    private static void m1913a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] m1916a(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r6 = r20
            r7 = 0
            r8 = r7
        L_0x0004:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L_0x006c
            r10 = 1
            if (r0 == r10) goto L_0x006c
            r2 = 2
            if (r0 == r2) goto L_0x0016
            r20.next()
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0062
            int[] r0 = android.support.graphics.drawable.C0428a.f1864i
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = android.support.p022v4.content.res.C0704f.m2990a(r11, r12, r13, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = android.support.p022v4.content.res.C0704f.m2992a(r14, r6, r0, r1)
            java.lang.String r0 = "valueType"
            r1 = 4
            int r5 = android.support.p022v4.content.res.C0704f.m2989a(r14, r6, r0, r2, r1)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = m1908a(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0052
            r1 = r16
            android.animation.PropertyValuesHolder r0 = m1909a(r14, r1, r9, r10, r15)
        L_0x0052:
            if (r0 == 0) goto L_0x005e
            if (r8 != 0) goto L_0x005b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x005b:
            r8.add(r0)
        L_0x005e:
            r14.recycle()
            goto L_0x0068
        L_0x0062:
            r11 = r18
            r12 = r19
            r13 = r21
        L_0x0068:
            r20.next()
            goto L_0x0004
        L_0x006c:
            if (r8 == 0) goto L_0x0081
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L_0x0074:
            if (r9 >= r0) goto L_0x0081
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L_0x0074
        L_0x0081:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0431d.m1916a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m1908a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            r1 = r14
            r14 = r0
        L_0x0003:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r4 = 1
            if (r2 == r4) goto L_0x0041
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0003
            r2 = 4
            if (r1 != r2) goto L_0x0024
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r12)
            int r1 = m1898a(r10, r11, r1, r12)
        L_0x0024:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r1
            r7 = r12
            android.animation.Keyframe r2 = m1906a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003d
            if (r14 != 0) goto L_0x003a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x003a:
            r14.add(r2)
        L_0x003d:
            r12.next()
            goto L_0x0003
        L_0x0041:
            if (r14 == 0) goto L_0x00e9
            int r9 = r14.size()
            if (r9 <= 0) goto L_0x00e9
            r10 = 0
            java.lang.Object r11 = r14.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r14.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0078
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            r12.setFraction(r2)
            goto L_0x0078
        L_0x006b:
            int r0 = r14.size()
            android.animation.Keyframe r12 = m1905a(r12, r2)
            r14.add(r0, r12)
            int r9 = r9 + 1
        L_0x0078:
            float r12 = r11.getFraction()
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0088
            r11.setFraction(r4)
            goto L_0x0091
        L_0x0088:
            android.animation.Keyframe r11 = m1905a(r11, r4)
            r14.add(r10, r11)
            int r9 = r9 + 1
        L_0x0091:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r14.toArray(r11)
        L_0x0096:
            if (r10 >= r9) goto L_0x00dc
            r12 = r11[r10]
            float r14 = r12.getFraction()
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d9
            if (r10 != 0) goto L_0x00a8
            r12.setFraction(r4)
            goto L_0x00d9
        L_0x00a8:
            int r14 = r9 + -1
            if (r10 != r14) goto L_0x00b0
            r12.setFraction(r2)
            goto L_0x00d9
        L_0x00b0:
            int r12 = r10 + 1
            r0 = r10
        L_0x00b3:
            if (r12 >= r14) goto L_0x00c5
            r5 = r11[r12]
            float r5 = r5.getFraction()
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c5
            int r0 = r12 + 1
            r8 = r0
            r0 = r12
            r12 = r8
            goto L_0x00b3
        L_0x00c5:
            int r12 = r0 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r14 = r10 + -1
            r14 = r11[r14]
            float r14 = r14.getFraction()
            float r12 = r12 - r14
            m1914a(r11, r12, r10, r0)
        L_0x00d9:
            int r10 = r10 + 1
            goto L_0x0096
        L_0x00dc:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r1 != r3) goto L_0x00e9
            android.support.graphics.drawable.e r9 = android.support.graphics.drawable.C0433e.m1918a()
            r0.setEvaluator(r9)
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0431d.m1908a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static void m1914a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static ObjectAnimator m1907a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m1910a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    private static ValueAnimator m1910a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws NotFoundException {
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1862g);
        TypedArray a2 = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1866k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m1912a(valueAnimator, a, a2, f, xmlPullParser);
        int c = C0704f.m2997c(a, xmlPullParser, "interpolator", 0, 0);
        if (c > 0) {
            valueAnimator.setInterpolator(C0430c.m1896a(context, c));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    public static Animator m1900a(Context context, int i) throws NotFoundException {
        if (VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m1901a(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: a */
    private static Keyframe m1905a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static int m1899a(TypedArray typedArray, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        TypedValue peekValue = typedArray.peekValue(5);
        boolean z2 = true;
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = peekValue.type;
        } else {
            i3 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(6);
        if (peekValue2 == null) {
            z2 = false;
        }
        if (z2) {
            i4 = peekValue2.type;
        } else {
            i4 = 0;
        }
        if ((!z || !m1915a(i3)) && (!z2 || !m1915a(i4))) {
            return 0;
        }
        return 3;
    }

    /* renamed from: a */
    private static Animator m1901a(Context context, Resources resources, Theme theme, int i) throws NotFoundException {
        return m1902a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    private static int m1898a(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        boolean z;
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1865j);
        int i = 0;
        TypedValue b = C0704f.m2996b(a, xmlPullParser, "value", 0);
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && m1915a(b.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    private static Animator m1903a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return m1904a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m1902a(android.content.Context r1, android.content.res.Resources r2, android.content.res.Resources.Theme r3, int r4, float r5) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = 0
            android.content.res.XmlResourceParser r0 = r2.getAnimation(r4)     // Catch:{ XmlPullParserException -> 0x0038, IOException -> 0x001c }
            r5 = 1065353216(0x3f800000, float:1.0)
            android.animation.Animator r1 = m1903a(r1, r2, r3, r0, r5)     // Catch:{ XmlPullParserException -> 0x0017, IOException -> 0x0014, all -> 0x0011 }
            if (r0 == 0) goto L_0x0010
            r0.close()
        L_0x0010:
            return r1
        L_0x0011:
            r1 = move-exception
            r5 = r0
            goto L_0x0054
        L_0x0014:
            r1 = move-exception
            r5 = r0
            goto L_0x001d
        L_0x0017:
            r1 = move-exception
            r5 = r0
            goto L_0x0039
        L_0x001a:
            r1 = move-exception
            goto L_0x0054
        L_0x001c:
            r1 = move-exception
        L_0x001d:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x001a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x001a }
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r3.<init>(r0)     // Catch:{ all -> 0x001a }
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch:{ all -> 0x001a }
            r3.append(r4)     // Catch:{ all -> 0x001a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x001a }
            r2.<init>(r3)     // Catch:{ all -> 0x001a }
            r2.initCause(r1)     // Catch:{ all -> 0x001a }
            throw r2     // Catch:{ all -> 0x001a }
        L_0x0038:
            r1 = move-exception
        L_0x0039:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x001a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x001a }
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r3.<init>(r0)     // Catch:{ all -> 0x001a }
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch:{ all -> 0x001a }
            r3.append(r4)     // Catch:{ all -> 0x001a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x001a }
            r2.<init>(r3)     // Catch:{ all -> 0x001a }
            r2.initCause(r1)     // Catch:{ all -> 0x001a }
            throw r2     // Catch:{ all -> 0x001a }
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            r5.close()
        L_0x0059:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0431d.m1902a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m1906a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z;
        Keyframe keyframe;
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, C0428a.f1865j);
        float a2 = C0704f.m2988a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue b = C0704f.m2996b(a, xmlPullParser, "value", 0);
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (i == 4) {
            if (!z || !m1915a(b.type)) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (z) {
            if (i != 3) {
                switch (i) {
                    case 0:
                        keyframe = Keyframe.ofFloat(a2, C0704f.m2988a(a, xmlPullParser, "value", 0, 0.0f));
                        break;
                    case 1:
                        break;
                    default:
                        keyframe = null;
                        break;
                }
            }
            keyframe = Keyframe.ofInt(a2, C0704f.m2989a(a, xmlPullParser, "value", 0, 0));
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(a2);
        } else {
            keyframe = Keyframe.ofInt(a2);
        }
        int c = C0704f.m2997c(a, xmlPullParser, "interpolator", 1, 0);
        if (c > 0) {
            keyframe.setInterpolator(C0430c.m1896a(context, c));
        }
        a.recycle();
        return keyframe;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m1904a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00e1
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00e1
            r3 = 2
            if (r1 != r3) goto L_0x00dd
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0042
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m1907a(r0, r1, r2, r3, r4, r5)
        L_0x003e:
            r3 = r18
            goto L_0x00b5
        L_0x0042:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005c
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m1910a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003e
        L_0x005c:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0094
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = android.support.graphics.drawable.C0428a.f1863h
            r7 = r22
            android.content.res.TypedArray r6 = android.support.p022v4.content.res.C0704f.m2990a(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = android.support.p022v4.content.res.C0704f.m2989a(r6, r10, r0, r14, r14)
            r5 = r15
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r6
            r6 = r16
            r7 = r25
            m1904a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b5
        L_0x0094:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c5
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m1916a(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00b4
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b4
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b4:
            r14 = 1
        L_0x00b5:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00c0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00c0:
            r13.add(r0)
            goto L_0x000e
        L_0x00c5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r3 = r18
            goto L_0x000e
        L_0x00e1:
            if (r11 == 0) goto L_0x010a
            if (r13 == 0) goto L_0x010a
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00ef
        L_0x0101:
            if (r24 != 0) goto L_0x0107
            r11.playTogether(r1)
            goto L_0x010a
        L_0x0107:
            r11.playSequentially(r1)
        L_0x010a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0431d.m1904a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }
}
