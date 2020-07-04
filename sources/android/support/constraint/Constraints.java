package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public final class Constraints extends ViewGroup {

    /* renamed from: a */
    C0177b f493a;

    public static class LayoutParams extends android.support.constraint.ConstraintLayout.LayoutParams {

        /* renamed from: an */
        public float f494an = 1.0f;

        /* renamed from: ao */
        public boolean f495ao;

        /* renamed from: ap */
        public float f496ap;

        /* renamed from: aq */
        public float f497aq;

        /* renamed from: ar */
        public float f498ar;

        /* renamed from: as */
        public float f499as;

        /* renamed from: at */
        public float f500at = 1.0f;

        /* renamed from: au */
        public float f501au = 1.0f;

        /* renamed from: av */
        public float f502av;

        /* renamed from: aw */
        public float f503aw;

        /* renamed from: ax */
        public float f504ax;

        /* renamed from: ay */
        public float f505ay;

        /* renamed from: az */
        public float f506az;

        public LayoutParams(int i, int i2) {
            super(-2, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.f494an = obtainStyledAttributes.getFloat(index, this.f494an);
                } else if (index == 22) {
                    this.f496ap = obtainStyledAttributes.getFloat(index, this.f496ap);
                    this.f495ao = true;
                } else if (index == 17) {
                    this.f498ar = obtainStyledAttributes.getFloat(index, this.f498ar);
                } else if (index == 18) {
                    this.f499as = obtainStyledAttributes.getFloat(index, this.f499as);
                } else if (index == 16) {
                    this.f497aq = obtainStyledAttributes.getFloat(index, this.f497aq);
                } else if (index == 14) {
                    this.f500at = obtainStyledAttributes.getFloat(index, this.f500at);
                } else if (index == 15) {
                    this.f501au = obtainStyledAttributes.getFloat(index, this.f501au);
                } else if (index == 10) {
                    this.f502av = obtainStyledAttributes.getFloat(index, this.f502av);
                } else if (index == 11) {
                    this.f503aw = obtainStyledAttributes.getFloat(index, this.f503aw);
                } else if (index == 12) {
                    this.f504ax = obtainStyledAttributes.getFloat(index, this.f504ax);
                } else if (index == 13) {
                    this.f505ay = obtainStyledAttributes.getFloat(index, this.f505ay);
                } else if (index == 21) {
                    this.f504ax = obtainStyledAttributes.getFloat(index, this.f506az);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* renamed from: a */
    private static LayoutParams m502a() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m502a();
    }

    public final C0177b getConstraintSet() {
        if (this.f493a == null) {
            this.f493a = new C0177b();
        }
        this.f493a.mo429a(this);
        return this.f493a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.support.constraint.ConstraintLayout.LayoutParams(layoutParams);
    }
}
