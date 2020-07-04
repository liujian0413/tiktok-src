package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.res.C0700e;
import android.support.p022v4.content.res.C0700e.C0701a;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.av */
public final class C1365av {

    /* renamed from: a */
    private final Context f5347a;

    /* renamed from: b */
    private final TypedArray f5348b;

    /* renamed from: c */
    private TypedValue f5349c;

    /* renamed from: a */
    public final void mo6393a() {
        this.f5348b.recycle();
    }

    /* renamed from: c */
    public final CharSequence mo6398c(int i) {
        return this.f5348b.getText(i);
    }

    /* renamed from: d */
    public final String mo6400d(int i) {
        return this.f5348b.getString(i);
    }

    /* renamed from: f */
    public final CharSequence[] mo6404f(int i) {
        return this.f5348b.getTextArray(0);
    }

    /* renamed from: g */
    public final boolean mo6406g(int i) {
        return this.f5348b.hasValue(i);
    }

    /* renamed from: b */
    public final Drawable mo6396b(int i) {
        if (this.f5348b.hasValue(i)) {
            int resourceId = this.f5348b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1393g.m6901a().mo6488a(this.f5347a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final ColorStateList mo6402e(int i) {
        if (this.f5348b.hasValue(i)) {
            int resourceId = this.f5348b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C1065a.m4638a(this.f5347a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f5348b.getColorStateList(i);
    }

    /* renamed from: a */
    public final Drawable mo6392a(int i) {
        if (this.f5348b.hasValue(i)) {
            int resourceId = this.f5348b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1065a.m4641b(this.f5347a, resourceId);
            }
        }
        return this.f5348b.getDrawable(i);
    }

    private C1365av(Context context, TypedArray typedArray) {
        this.f5347a = context;
        this.f5348b = typedArray;
    }

    /* renamed from: a */
    public final float mo6389a(int i, float f) {
        return this.f5348b.getFloat(i, f);
    }

    /* renamed from: b */
    public final int mo6395b(int i, int i2) {
        return this.f5348b.getColor(i, i2);
    }

    /* renamed from: c */
    public final int mo6397c(int i, int i2) {
        return this.f5348b.getInteger(i, i2);
    }

    /* renamed from: d */
    public final int mo6399d(int i, int i2) {
        return this.f5348b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public final int mo6401e(int i, int i2) {
        return this.f5348b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public final int mo6403f(int i, int i2) {
        return this.f5348b.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public final int mo6405g(int i, int i2) {
        return this.f5348b.getResourceId(i, i2);
    }

    /* renamed from: a */
    public final int mo6390a(int i, int i2) {
        return this.f5348b.getInt(i, i2);
    }

    /* renamed from: a */
    public final boolean mo6394a(int i, boolean z) {
        return this.f5348b.getBoolean(i, z);
    }

    /* renamed from: a */
    public static C1365av m6742a(Context context, int i, int[] iArr) {
        return new C1365av(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C1365av m6743a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1365av(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public final Typeface mo6391a(int i, int i2, C0701a aVar) {
        int resourceId = this.f5348b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f5349c == null) {
            this.f5349c = new TypedValue();
        }
        return C0700e.m2978a(this.f5347a, resourceId, this.f5349c, i2, aVar);
    }

    /* renamed from: a */
    public static C1365av m6744a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1365av(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
