package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.solver.widgets.C0199f;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    protected int[] f401a = new int[32];

    /* renamed from: b */
    protected int f402b;

    /* renamed from: c */
    protected Context f403c;

    /* renamed from: d */
    protected C0199f f404d;

    /* renamed from: e */
    protected boolean f405e;

    /* renamed from: f */
    private String f406f;

    /* renamed from: b */
    public void mo375b(ConstraintLayout constraintLayout) {
    }

    public void onDraw(Canvas canvas) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f401a, this.f402b);
    }

    /* renamed from: a */
    public final void mo372a() {
        if (this.f404d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f465al = this.f404d;
            }
        }
    }

    public ConstraintHelper(Context context) {
        super(context);
        this.f403c = context;
        mo374a((AttributeSet) null);
    }

    public void setReferencedIds(int[] iArr) {
        this.f402b = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m481a(str.substring(i));
                    return;
                } else {
                    m481a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo373a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f406f);
        }
        if (this.f404d != null) {
            this.f404d.mo575x();
            for (int i = 0; i < this.f402b; i++) {
                View findViewById = constraintLayout.findViewById(this.f401a[i]);
                if (findViewById != null) {
                    this.f404d.mo582a(constraintLayout.mo381a(findViewById));
                }
            }
        }
    }

    /* renamed from: a */
    private void m481a(String str) {
        int i;
        if (str != null && this.f403c != null) {
            String trim = str.trim();
            try {
                i = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f403c.getResources().getIdentifier(trim, "id", this.f403c.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) getParent()).mo383a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            if (i != 0) {
                setTag(i, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo374a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.f406f = obtainStyledAttributes.getString(index);
                    setIds(this.f406f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f405e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f403c = context;
        mo374a(attributeSet);
    }

    public void setTag(int i, Object obj) {
        if (this.f402b + 1 > this.f401a.length) {
            this.f401a = Arrays.copyOf(this.f401a, this.f401a.length * 2);
        }
        this.f401a[this.f402b] = i;
        this.f402b++;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f403c = context;
        mo374a(attributeSet);
    }
}
