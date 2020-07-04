package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p029v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f5206a;

    /* renamed from: b */
    private int f5207b;

    /* renamed from: c */
    private WeakReference<View> f5208c;

    /* renamed from: d */
    private LayoutInflater f5209d;

    /* renamed from: e */
    private C1328a f5210e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C1328a {
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public final int getInflatedId() {
        return this.f5207b;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.f5209d;
    }

    public final int getLayoutResource() {
        return this.f5206a;
    }

    /* renamed from: a */
    public final View mo6224a() {
        LayoutInflater layoutInflater;
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f5206a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (this.f5209d != null) {
                layoutInflater = this.f5209d;
            } else {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f5206a, viewGroup, false);
            if (this.f5207b != -1) {
                inflate.setId(this.f5207b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f5208c = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void setInflatedId(int i) {
        this.f5207b = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f5209d = layoutInflater;
    }

    public final void setLayoutResource(int i) {
        this.f5206a = i;
    }

    public final void setOnInflateListener(C1328a aVar) {
        this.f5210e = aVar;
    }

    public final void setVisibility(int i) {
        if (this.f5208c != null) {
            View view = (View) this.f5208c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo6224a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewStubCompat, i, 0);
        this.f5207b = obtainStyledAttributes.getResourceId(2, -1);
        this.f5206a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
