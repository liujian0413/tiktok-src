package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.solver.widgets.C0193a;
import android.util.AttributeSet;

/* renamed from: android.support.constraint.a */
public final class C0176a extends ConstraintHelper {

    /* renamed from: f */
    private int f507f;

    /* renamed from: g */
    private int f508g;

    /* renamed from: h */
    private C0193a f509h;

    public final int getType() {
        return this.f507f;
    }

    public C0176a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo374a(AttributeSet attributeSet) {
        super.mo374a(attributeSet);
        this.f509h = new C0193a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 5) {
                    this.f509h.f755b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f404d = this.f509h;
        mo372a();
    }

    public final void setType(int i) {
        boolean z;
        this.f507f = i;
        this.f508g = i;
        if (VERSION.SDK_INT >= 17) {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f507f == 5) {
                    this.f508g = 1;
                } else if (this.f507f == 6) {
                    this.f508g = 0;
                }
            } else if (this.f507f == 5) {
                this.f508g = 0;
            } else if (this.f507f == 6) {
                this.f508g = 1;
            }
        } else if (this.f507f == 5) {
            this.f508g = 0;
        } else if (this.f507f == 6) {
            this.f508g = 1;
        }
        this.f509h.f753a = this.f508g;
    }
}
