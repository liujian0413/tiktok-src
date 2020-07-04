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
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.scene.ui.view.StatusBarView */
public final class StatusBarView extends View {

    /* renamed from: c */
    private static final int[] f33672c = {R.attr.g9};

    /* renamed from: a */
    public C0954ab f33673a;

    /* renamed from: b */
    public final Runnable f33674b = new Runnable() {
        public final void run() {
            StatusBarView.this.requestLayout();
        }
    };

    /* renamed from: d */
    private boolean f33675d = true;

    /* renamed from: e */
    private Drawable f33676e;

    public final Drawable getStatusBarBackgroundDrawable() {
        return this.f33676e;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m36883a() {
        C0991u.m4188a((View) this, (C0983o) new C0983o() {
            /* renamed from: a */
            public final C0954ab mo1183a(View view, C0954ab abVar) {
                if (StatusBarView.this.getVisibility() == 8) {
                    StatusBarView.this.f33673a = null;
                    return abVar;
                }
                if (!new C0954ab(abVar).equals(StatusBarView.this.f33673a)) {
                    StatusBarView.this.f33673a = new C0954ab(abVar);
                    StatusBarView.this.post(StatusBarView.this.f33674b);
                }
                return new C0954ab(abVar).mo3718a(abVar.mo3717a(), 0, abVar.mo3720c(), abVar.mo3721d());
            }
        });
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(f33672c);
        try {
            this.f33676e = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            C0991u.m4230k((View) this, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setStatusBarBackground(Drawable drawable) {
        this.f33676e = drawable;
        invalidate();
    }

    public final void setStatusBarBackgroundColor(int i) {
        this.f33676e = new ColorDrawable(i);
        invalidate();
    }

    public StatusBarView(Context context) {
        super(context);
        m36883a();
    }

    public final void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0683b.m2903a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f33676e = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f33675d && this.f33676e != null) {
            if (VERSION.SDK_INT < 21 || this.f33673a == null) {
                i = 0;
            } else {
                i = this.f33673a.mo3719b();
            }
            if (i > 0) {
                this.f33676e.setBounds(0, 0, getWidth(), i);
                this.f33676e.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private static int m36882a(int i, int i2) {
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
    private void m36884b(int i, int i2) {
        setMeasuredDimension(m36882a(getSuggestedMinimumWidth(), i), m36882a(getSuggestedMinimumHeight(), i2));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f33673a != null) {
            m36884b(i, MeasureSpec.makeMeasureSpec(this.f33673a.mo3719b(), 1073741824));
        } else {
            m36884b(i, i2);
        }
    }

    public StatusBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36883a();
    }

    public StatusBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36883a();
    }
}
