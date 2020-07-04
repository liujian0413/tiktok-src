package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f4454a;

    /* renamed from: b */
    Drawable f4455b;

    /* renamed from: c */
    Drawable f4456c;

    /* renamed from: d */
    boolean f4457d;

    /* renamed from: e */
    boolean f4458e;

    /* renamed from: f */
    private boolean f4459f;

    /* renamed from: g */
    private View f4460g;

    /* renamed from: h */
    private View f4461h;

    /* renamed from: i */
    private View f4462i;

    /* renamed from: j */
    private int f4463j;

    public View getTabContainer() {
        return this.f4460g;
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f4454a != null) {
            this.f4454a.jumpToCurrentState();
        }
        if (this.f4455b != null) {
            this.f4455b.jumpToCurrentState();
        }
        if (this.f4456c != null) {
            this.f4456c.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4461h = findViewById(R.id.a4);
        this.f4462i = findViewById(R.id.ad);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4454a != null && this.f4454a.isStateful()) {
            this.f4454a.setState(getDrawableState());
        }
        if (this.f4455b != null && this.f4455b.isStateful()) {
            this.f4455b.setState(getDrawableState());
        }
        if (this.f4456c != null && this.f4456c.isStateful()) {
            this.f4456c.setState(getDrawableState());
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4459f || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setTransitioning(boolean z) {
        int i;
        this.f4459f = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    /* renamed from: a */
    private static boolean m5453a(View view) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m5454b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void setTabContainer(C1355ap apVar) {
        if (this.f4460g != null) {
            removeView(this.f4460g);
        }
        this.f4460g = apVar;
        if (apVar != null) {
            addView(apVar);
            ViewGroup.LayoutParams layoutParams = apVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            apVar.setAllowCollapse(false);
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f4454a != null) {
            this.f4454a.setVisible(z, false);
        }
        if (this.f4455b != null) {
            this.f4455b.setVisible(z, false);
        }
        if (this.f4456c != null) {
            this.f4456c.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f4454a || this.f4457d) && ((drawable != this.f4455b || !this.f4458e) && ((drawable != this.f4456c || !this.f4457d) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.f4454a != null) {
            this.f4454a.setCallback(null);
            unscheduleDrawable(this.f4454a);
        }
        this.f4454a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4461h != null) {
                this.f4454a.setBounds(this.f4461h.getLeft(), this.f4461h.getTop(), this.f4461h.getRight(), this.f4461h.getBottom());
            }
        }
        boolean z = false;
        if (!this.f4457d ? this.f4454a == null && this.f4455b == null : this.f4456c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        if (this.f4456c != null) {
            this.f4456c.setCallback(null);
            unscheduleDrawable(this.f4456c);
        }
        this.f4456c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4457d && this.f4456c != null) {
                this.f4456c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f4457d ? this.f4454a == null && this.f4455b == null : this.f4456c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        if (this.f4455b != null) {
            this.f4455b.setCallback(null);
            unscheduleDrawable(this.f4455b);
        }
        this.f4455b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4458e && this.f4455b != null) {
                this.f4455b.setBounds(this.f4460g.getLeft(), this.f4460g.getTop(), this.f4460g.getRight(), this.f4460g.getBottom());
            }
        }
        boolean z = false;
        if (!this.f4457d ? this.f4454a == null && this.f4455b == null : this.f4456c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0991u.m4185a((View) this, (Drawable) new C1329a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBar);
        boolean z = false;
        this.f4454a = obtainStyledAttributes.getDrawable(0);
        this.f4455b = obtainStyledAttributes.getDrawable(2);
        this.f4463j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.d9j) {
            this.f4457d = true;
            this.f4456c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4457d ? this.f4454a == null && this.f4455b == null : this.f4456c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f4461h == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f4463j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.f4463j, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f4461h != null) {
            int mode = MeasureSpec.getMode(i2);
            if (!(this.f4460g == null || this.f4460g.getVisibility() == 8 || mode == 1073741824)) {
                if (!m5453a(this.f4461h)) {
                    i3 = m5454b(this.f4461h);
                } else if (!m5453a(this.f4462i)) {
                    i3 = m5454b(this.f4462i);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m5454b(this.f4460g), i4));
            }
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f4460g;
        boolean z3 = true;
        boolean z4 = false;
        if (view == null || view.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f4457d) {
            if (this.f4454a != null) {
                if (this.f4461h.getVisibility() == 0) {
                    this.f4454a.setBounds(this.f4461h.getLeft(), this.f4461h.getTop(), this.f4461h.getRight(), this.f4461h.getBottom());
                } else if (this.f4462i == null || this.f4462i.getVisibility() != 0) {
                    this.f4454a.setBounds(0, 0, 0, 0);
                } else {
                    this.f4454a.setBounds(this.f4462i.getLeft(), this.f4462i.getTop(), this.f4462i.getRight(), this.f4462i.getBottom());
                }
                z4 = true;
            }
            this.f4458e = z2;
            if (!z2 || this.f4455b == null) {
                z3 = z4;
            } else {
                this.f4455b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f4456c != null) {
            this.f4456c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z3 = false;
        }
        if (z3) {
            invalidate();
        }
    }
}
