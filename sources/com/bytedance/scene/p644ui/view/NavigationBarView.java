package com.bytedance.scene.p644ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0983o;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

/* renamed from: com.bytedance.scene.ui.view.NavigationBarView */
public final class NavigationBarView extends View {

    /* renamed from: a */
    public C0954ab f33666a;

    /* renamed from: b */
    public final Runnable f33667b = new Runnable() {
        public final void run() {
            NavigationBarView.this.requestLayout();
        }
    };

    /* renamed from: c */
    private boolean f33668c = true;

    /* renamed from: d */
    private Drawable f33669d;

    public final Drawable getNavigationBarBackgroundDrawable() {
        return this.f33669d;
    }

    /* renamed from: a */
    private void m36879a() {
        C0991u.m4188a((View) this, (C0983o) new C0983o() {
            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                if (NavigationBarView.this.getVisibility() == 8) {
                    NavigationBarView.this.f33666a = null;
                    return abVar;
                }
                if (!new C0954ab(abVar).equals(NavigationBarView.this.f33666a)) {
                    NavigationBarView.this.f33666a = new C0954ab(abVar);
                    NavigationBarView.this.post(NavigationBarView.this.f33667b);
                }
                return new C0954ab(abVar).mo3718a(abVar.mo3717a(), abVar.mo3719b(), abVar.mo3720c(), 0);
            }
        });
        if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843858});
            try {
                this.f33669d = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setNavigationBarBackground(Drawable drawable) {
        this.f33669d = drawable;
        invalidate();
    }

    public final void setNavigationBarBackgroundColor(int i) {
        this.f33669d = new ColorDrawable(i);
        invalidate();
    }

    public NavigationBarView(Context context) {
        super(context);
        m36879a();
    }

    public final void setNavigationBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0683b.m2903a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f33669d = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f33668c && this.f33669d != null) {
            if (VERSION.SDK_INT < 21 || this.f33666a == null) {
                i = 0;
            } else {
                i = this.f33666a.mo3721d();
            }
            if (i > 0) {
                this.f33669d.setBounds(0, getHeight() - i, getWidth(), getHeight());
                this.f33669d.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private static int m36878a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    /* renamed from: b */
    private void m36880b(int i, int i2) {
        setMeasuredDimension(m36878a(getSuggestedMinimumWidth(), i), m36878a(getSuggestedMinimumHeight(), i2));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f33666a != null) {
            m36880b(i, MeasureSpec.makeMeasureSpec(this.f33666a.mo3721d(), 1073741824));
        } else {
            m36880b(i, i2);
        }
    }

    public NavigationBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36879a();
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36879a();
    }
}
