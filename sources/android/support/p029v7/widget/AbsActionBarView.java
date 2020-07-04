package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p029v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.AbsActionBarView */
abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: a */
    protected final VisibilityAnimListener f4443a;

    /* renamed from: b */
    protected final Context f4444b;

    /* renamed from: c */
    protected ActionMenuView f4445c;

    /* renamed from: d */
    protected ActionMenuPresenter f4446d;

    /* renamed from: e */
    protected int f4447e;

    /* renamed from: f */
    protected C0998y f4448f;

    /* renamed from: g */
    private boolean f4449g;

    /* renamed from: h */
    private boolean f4450h;

    /* renamed from: android.support.v7.widget.AbsActionBarView$VisibilityAnimListener */
    protected class VisibilityAnimListener implements C1002z {

        /* renamed from: a */
        int f4451a;

        /* renamed from: c */
        private boolean f4453c;

        /* renamed from: c */
        public final void mo3628c(View view) {
            this.f4453c = true;
        }

        protected VisibilityAnimListener() {
        }

        /* renamed from: a */
        public final void mo3626a(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f4453c = false;
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            if (!this.f4453c) {
                AbsActionBarView.this.f4448f = null;
                AbsActionBarView.super.setVisibility(this.f4451a);
            }
        }

        /* renamed from: a */
        public final VisibilityAnimListener mo4976a(C0998y yVar, int i) {
            AbsActionBarView.this.f4448f = yVar;
            this.f4451a = i;
            return this;
        }
    }

    /* renamed from: a */
    protected static int m5442a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getContentHeight() {
        return this.f4447e;
    }

    public int getAnimatedVisibility() {
        if (this.f4448f != null) {
            return this.f4443a.f4451a;
        }
        return getVisibility();
    }

    /* renamed from: a */
    public boolean mo4968a() {
        if (this.f4446d != null) {
            return this.f4446d.mo5058e();
        }
        return false;
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    public void setContentHeight(int i) {
        this.f4447e = i;
        requestLayout();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4449g = false;
        }
        if (!this.f4449g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4449g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4449g = false;
        }
        return true;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f4448f != null) {
                this.f4448f.mo3804b();
            }
            super.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.ActionBar, R.attr.h, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        if (this.f4446d != null) {
            this.f4446d.mo5053a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4450h = false;
        }
        if (!this.f4450h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4450h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4450h = false;
        }
        return true;
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public C0998y mo4967a(int i, long j) {
        if (this.f4448f != null) {
            this.f4448f.mo3804b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0998y a = C0991u.m4238q(this).mo3797a(1.0f);
            a.mo3798a(j);
            a.mo3800a((C1002z) this.f4443a.mo4976a(a, i));
            return a;
        }
        C0998y a2 = C0991u.m4238q(this).mo3797a(0.0f);
        a2.mo3798a(j);
        a2.mo3800a((C1002z) this.f4443a.mo4976a(a2, i));
        return a2;
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4443a = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.e, typedValue, true) || typedValue.resourceId == 0) {
            this.f4444b = context;
        } else {
            this.f4444b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m5443a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* renamed from: a */
    protected static int m5444a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }
}
