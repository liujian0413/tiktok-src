package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.p029v7.appcompat.R$styleable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.n */
final class C1420n {

    /* renamed from: c */
    private static final RectF f5536c = new RectF();

    /* renamed from: d */
    private static ConcurrentHashMap<String, Method> f5537d = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f5538a;

    /* renamed from: b */
    public int[] f5539b = new int[0];

    /* renamed from: e */
    private boolean f5540e;

    /* renamed from: f */
    private float f5541f = -1.0f;

    /* renamed from: g */
    private float f5542g = -1.0f;

    /* renamed from: h */
    private float f5543h = -1.0f;

    /* renamed from: i */
    private boolean f5544i;

    /* renamed from: j */
    private TextPaint f5545j;

    /* renamed from: k */
    private final TextView f5546k;

    /* renamed from: l */
    private final Context f5547l;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6573a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f5547l.obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f5538a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3)) {
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                m7049a(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!m7055i()) {
            this.f5538a = 0;
        } else if (this.f5538a == 1) {
            if (!this.f5544i) {
                DisplayMetrics displayMetrics = this.f5547l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m7048a(dimension2, dimension3, dimension);
            }
            m7053g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6570a(int i) {
        if (m7055i()) {
            switch (i) {
                case 0:
                    m7054h();
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f5547l.getResources().getDisplayMetrics();
                    m7048a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m7053g()) {
                        mo6577d();
                        return;
                    }
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown auto-size text type: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6572a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m7055i()) {
            DisplayMetrics displayMetrics = this.f5547l.getResources().getDisplayMetrics();
            m7048a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m7053g()) {
                mo6577d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6574a(int[] iArr, int i) throws IllegalArgumentException {
        if (m7055i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f5547l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f5539b = m7051a(iArr2);
                if (!m7052f()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f5544i = false;
            }
            if (m7053g()) {
                mo6577d();
            }
        }
    }

    /* renamed from: a */
    private static int[] m7051a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6571a(int i, float f) {
        Resources resources;
        if (this.f5547l == null) {
            resources = Resources.getSystem();
        } else {
            resources = this.f5547l.getResources();
        }
        m7047a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private boolean m7050a(int i, RectF rectF) {
        StaticLayout staticLayout;
        CharSequence text = this.f5546k.getText();
        TransformationMethod transformationMethod = this.f5546k.getTransformationMethod();
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f5546k);
            if (transformation != null) {
                text = transformation;
            }
        }
        int maxLines = VERSION.SDK_INT >= 16 ? this.f5546k.getMaxLines() : -1;
        if (this.f5545j == null) {
            this.f5545j = new TextPaint();
        } else {
            this.f5545j.reset();
        }
        this.f5545j.set(this.f5546k.getPaint());
        this.f5545j.setTextSize((float) i);
        Alignment alignment = (Alignment) m7045a((Object) this.f5546k, "getLayoutAlignment", (T) Alignment.ALIGN_NORMAL);
        if (VERSION.SDK_INT >= 23) {
            staticLayout = m7044a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            staticLayout = m7043a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo6569a() {
        return Math.round(this.f5541f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo6575b() {
        return Math.round(this.f5542g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo6576c() {
        return Math.round(this.f5543h);
    }

    /* renamed from: i */
    private boolean m7055i() {
        if (!(this.f5546k instanceof AppCompatEditText)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo6578e() {
        if (!m7055i() || this.f5538a == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m7054h() {
        this.f5538a = 0;
        this.f5542g = -1.0f;
        this.f5543h = -1.0f;
        this.f5541f = -1.0f;
        this.f5539b = new int[0];
        this.f5540e = false;
    }

    /* renamed from: f */
    private boolean m7052f() {
        boolean z;
        int length = this.f5539b.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f5544i = z;
        if (this.f5544i) {
            this.f5538a = 1;
            this.f5542g = (float) this.f5539b[0];
            this.f5543h = (float) this.f5539b[length - 1];
            this.f5541f = -1.0f;
        }
        return this.f5544i;
    }

    /* renamed from: g */
    private boolean m7053g() {
        if (!m7055i() || this.f5538a != 1) {
            this.f5540e = false;
        } else {
            if (!this.f5544i || this.f5539b.length == 0) {
                float round = (float) Math.round(this.f5542g);
                int i = 1;
                while (Math.round(this.f5541f + round) <= Math.round(this.f5543h)) {
                    i++;
                    round += this.f5541f;
                }
                int[] iArr = new int[i];
                float f = this.f5542g;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f5541f;
                }
                this.f5539b = m7051a(iArr);
            }
            this.f5540e = true;
        }
        return this.f5540e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo6577d() {
        int i;
        if (mo6578e()) {
            if (this.f5540e) {
                if (this.f5546k.getMeasuredHeight() > 0 && this.f5546k.getMeasuredWidth() > 0) {
                    if (((Boolean) m7045a((Object) this.f5546k, "getHorizontallyScrolling", (T) Boolean.valueOf(false))).booleanValue()) {
                        i = 1048576;
                    } else {
                        i = (this.f5546k.getMeasuredWidth() - this.f5546k.getTotalPaddingLeft()) - this.f5546k.getTotalPaddingRight();
                    }
                    int height = (this.f5546k.getHeight() - this.f5546k.getCompoundPaddingBottom()) - this.f5546k.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        synchronized (f5536c) {
                            f5536c.setEmpty();
                            f5536c.right = (float) i;
                            f5536c.bottom = (float) height;
                            float a = (float) m7042a(f5536c);
                            if (a != this.f5546k.getTextSize()) {
                                mo6571a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f5540e = true;
        }
    }

    C1420n(TextView textView) {
        this.f5546k = textView;
        this.f5547l = this.f5546k.getContext();
    }

    /* renamed from: a */
    private void m7049a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f5539b = m7051a(iArr);
            m7052f();
        }
    }

    /* renamed from: a */
    private int m7042a(RectF rectF) {
        int length = this.f5539b.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m7050a(this.f5539b[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f5539b[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private static Method m7046a(String str) {
        try {
            Method method = (Method) f5537d.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    f5537d.put(str, method);
                }
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m7047a(float f) {
        boolean z;
        if (f != this.f5546k.getPaint().getTextSize()) {
            this.f5546k.getPaint().setTextSize(f);
            if (VERSION.SDK_INT >= 18) {
                z = this.f5546k.isInLayout();
            } else {
                z = false;
            }
            if (this.f5546k.getLayout() != null) {
                this.f5540e = false;
                try {
                    Method a = m7046a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f5546k, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!z) {
                    this.f5546k.requestLayout();
                } else {
                    this.f5546k.forceLayout();
                }
                this.f5546k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private <T> T m7045a(Object obj, String str, T t) {
        try {
            return m7046a(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return t;
        }
    }

    /* renamed from: a */
    private StaticLayout m7043a(CharSequence charSequence, Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (VERSION.SDK_INT >= 16) {
            floatValue = this.f5546k.getLineSpacingMultiplier();
            floatValue2 = this.f5546k.getLineSpacingExtra();
            booleanValue = this.f5546k.getIncludeFontPadding();
        } else {
            floatValue = ((Float) m7045a((Object) this.f5546k, "getLineSpacingMultiplier", (T) Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) m7045a((Object) this.f5546k, "getLineSpacingExtra", (T) Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) m7045a((Object) this.f5546k, "getIncludeFontPadding", (T) Boolean.valueOf(true))).booleanValue();
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f5545j, i, alignment, floatValue, floatValue2, booleanValue);
        return staticLayout;
    }

    /* renamed from: a */
    private void m7048a(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f5538a = 1;
            this.f5542g = f;
            this.f5543h = f2;
            this.f5541f = f3;
            this.f5544i = false;
        } else {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    private StaticLayout m7044a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m7045a((Object) this.f5546k, "getTextDirectionHeuristic", (T) TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.f5545j, i).setAlignment(alignment).setLineSpacing(this.f5546k.getLineSpacingExtra(), this.f5546k.getLineSpacingMultiplier()).setIncludePad(this.f5546k.getIncludeFontPadding()).setBreakStrategy(this.f5546k.getBreakStrategy()).setHyphenationFrequency(this.f5546k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }
}
