package com.bytedance.ies.uikit.menu;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.menu.SlidingMenu.C11047a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.uikit.menu.b */
public final class C11056b extends ViewGroup {

    /* renamed from: a */
    private int f30022a;

    /* renamed from: b */
    private C11053a f30023b;

    /* renamed from: c */
    private View f30024c;

    /* renamed from: d */
    private View f30025d;

    /* renamed from: e */
    private int f30026e;

    /* renamed from: f */
    private int f30027f;

    /* renamed from: g */
    private int f30028g;

    /* renamed from: h */
    private C11047a f30029h;

    /* renamed from: i */
    private boolean f30030i;

    /* renamed from: j */
    private int f30031j;

    /* renamed from: k */
    private boolean f30032k;

    /* renamed from: l */
    private final Paint f30033l;

    /* renamed from: m */
    private float f30034m;

    /* renamed from: n */
    private Drawable f30035n;

    /* renamed from: o */
    private Drawable f30036o;

    /* renamed from: p */
    private int f30037p;

    /* renamed from: q */
    private float f30038q;

    /* renamed from: r */
    private boolean f30039r;

    /* renamed from: s */
    private Bitmap f30040s;

    /* renamed from: t */
    private View f30041t;

    public final View getContent() {
        return this.f30024c;
    }

    public final int getMode() {
        return this.f30031j;
    }

    public final float getScrollScale() {
        return this.f30034m;
    }

    public final View getSecondaryContent() {
        return this.f30025d;
    }

    /* renamed from: a */
    public final boolean mo26823a(View view, int i, float f) {
        switch (this.f30022a) {
            case 0:
                return mo26828b(view, i, f);
            case 1:
                return true;
            default:
                return false;
        }
    }

    public final int getBehindWidth() {
        return this.f30024c.getWidth();
    }

    public final int getSecondaryBehindWidth() {
        return this.f30025d.getWidth();
    }

    private int getSelectorTop() {
        return this.f30041t.getTop() + ((this.f30041t.getHeight() - this.f30040s.getHeight()) / 2);
    }

    public final void setCanvasTransformer(C11047a aVar) {
        this.f30029h = aVar;
    }

    public final void setChildrenEnabled(boolean z) {
        this.f30030i = z;
    }

    public final void setCustomViewAbove(C11053a aVar) {
        this.f30023b = aVar;
    }

    public final void setFadeEnabled(boolean z) {
        this.f30032k = z;
    }

    public final void setScrollScale(float f) {
        this.f30034m = f;
    }

    public final void setSelectorEnabled(boolean z) {
        this.f30039r = z;
    }

    public final void setTouchMode(int i) {
        this.f30022a = i;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f30030i) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30030i) {
            return true;
        }
        return false;
    }

    public final void setSecondaryShadowDrawable(Drawable drawable) {
        this.f30036o = drawable;
        invalidate();
    }

    public final void setSecondaryWidthOffset(int i) {
        this.f30028g = i;
        requestLayout();
    }

    public final void setSelectorBitmap(Bitmap bitmap) {
        this.f30040s = bitmap;
        refreshDrawableState();
    }

    public final void setShadowDrawable(Drawable drawable) {
        this.f30035n = drawable;
        invalidate();
    }

    public final void setShadowWidth(int i) {
        this.f30037p = i;
        invalidate();
    }

    public final void setWidthOffset(int i) {
        this.f30027f = i;
        requestLayout();
    }

    /* renamed from: a */
    public final int mo26816a(int i) {
        if (i > 1) {
            i = 2;
        } else if (i <= 0) {
            i = 0;
        }
        if (this.f30031j == 0 && i > 1) {
            return 0;
        }
        if (this.f30031j != 1 || i > 0) {
            return i;
        }
        return 2;
    }

    /* renamed from: b */
    public final int mo26824b(View view) {
        if (this.f30031j == 0) {
            return view.getLeft();
        }
        if (this.f30031j == 1 || this.f30031j == 2) {
            return view.getLeft() + getSecondaryBehindWidth();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f30029h != null) {
            canvas.save();
            this.f30023b.getPercentOpen();
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void setContent(View view) {
        if (this.f30024c != null) {
            removeView(this.f30024c);
        }
        this.f30024c = view;
        addView(this.f30024c);
    }

    public final void setFadeDegree(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.f30038q = f;
    }

    public final void setMode(int i) {
        if (i == 0 || i == 1) {
            if (this.f30024c != null) {
                this.f30024c.setVisibility(0);
            }
            if (this.f30025d != null) {
                this.f30025d.setVisibility(4);
            }
        }
        this.f30031j = i;
    }

    public final void setSecondaryContent(View view) {
        if (this.f30025d != null) {
            removeView(this.f30025d);
        }
        this.f30025d = view;
        addView(this.f30025d);
    }

    /* renamed from: a */
    public final int mo26817a(View view) {
        if (this.f30031j == 0 || this.f30031j == 2) {
            return view.getLeft() - getBehindWidth();
        }
        if (this.f30031j == 1) {
            return view.getLeft();
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo26826b(float f) {
        if (this.f30031j == 0) {
            if (f < 0.0f) {
                return true;
            }
            return false;
        } else if (this.f30031j == 1) {
            if (f > 0.0f) {
                return true;
            }
            return false;
        } else if (this.f30031j == 2) {
            return true;
        } else {
            return false;
        }
    }

    public final void setSelectedView(View view) {
        if (this.f30041t != null) {
            this.f30041t.setTag(R.id.d2o, null);
            this.f30041t = null;
        }
        if (view != null && view.getParent() != null) {
            this.f30041t = view;
            this.f30041t.setTag(R.id.d2o, "CustomViewBehindSelectedView");
            invalidate();
        }
    }

    /* renamed from: a */
    public final boolean mo26822a(float f) {
        if (this.f30031j == 0) {
            if (f > 0.0f) {
                return true;
            }
            return false;
        } else if (this.f30031j == 1) {
            if (f < 0.0f) {
                return true;
            }
            return false;
        } else if (this.f30031j == 2) {
            return true;
        } else {
            return false;
        }
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.f30029h != null) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        int childMeasureSpec = getChildMeasureSpec(i, 0, defaultSize - this.f30027f);
        int childMeasureSpec2 = getChildMeasureSpec(i2, 0, defaultSize2);
        this.f30024c.measure(childMeasureSpec, childMeasureSpec2);
        if (this.f30025d != null) {
            this.f30025d.measure(getChildMeasureSpec(i, 0, defaultSize - this.f30028g), childMeasureSpec2);
        }
    }

    /* renamed from: a */
    public final int mo26818a(View view, int i) {
        if (this.f30031j == 0) {
            if (i == 0) {
                return view.getLeft() - getBehindWidth();
            }
            if (i == 2) {
                return view.getLeft();
            }
        } else if (this.f30031j == 1) {
            if (i == 0) {
                return view.getLeft();
            }
            if (i == 2) {
                return view.getLeft() + getSecondaryBehindWidth();
            }
        } else if (this.f30031j == 2) {
            if (i == 0) {
                return view.getLeft() - getBehindWidth();
            }
            if (i == 2) {
                return view.getLeft() + getSecondaryBehindWidth();
            }
        }
        return view.getLeft();
    }

    /* renamed from: b */
    public final boolean mo26827b(View view, int i) {
        int left = view.getLeft();
        int right = view.getRight();
        if (this.f30031j == 0) {
            if (i < left || i > this.f30026e + left) {
                return false;
            }
            return true;
        } else if (this.f30031j == 1) {
            if (i > right || i < right - this.f30026e) {
                return false;
            }
            return true;
        } else if (this.f30031j != 2) {
            return false;
        } else {
            if ((i < left || i > this.f30026e + left) && (i > right || i < right - this.f30026e)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo26820a(View view, Canvas canvas) {
        int i;
        if (this.f30035n != null && this.f30037p > 0) {
            if (this.f30031j != 0) {
                if (this.f30031j == 1) {
                    i = view.getRight();
                } else if (this.f30031j != 2) {
                    i = 0;
                } else if (this.f30036o != null) {
                    int right = view.getRight();
                    this.f30036o.setBounds(right, 0, this.f30037p + right, getHeight());
                    this.f30036o.draw(canvas);
                }
                this.f30035n.setBounds(i, 0, this.f30037p + i, getHeight());
                this.f30035n.draw(canvas);
            }
            i = view.getLeft() - this.f30037p;
            this.f30035n.setBounds(i, 0, this.f30037p + i, getHeight());
            this.f30035n.draw(canvas);
        }
    }

    /* renamed from: b */
    public final void mo26825b(View view, Canvas canvas, float f) {
        if (this.f30039r && this.f30040s != null && this.f30041t != null && ((String) this.f30041t.getTag(R.id.d2o)).equals("CustomViewBehindSelectedView")) {
            canvas.save();
            int width = (int) (((float) this.f30040s.getWidth()) * f);
            if (this.f30031j == 0) {
                int left = view.getLeft();
                int i = left - width;
                canvas.clipRect(i, 0, left, getHeight());
                canvas.drawBitmap(this.f30040s, (float) i, (float) getSelectorTop(), null);
            } else if (this.f30031j == 1) {
                int right = view.getRight();
                int i2 = width + right;
                canvas.clipRect(right, 0, i2, getHeight());
                Bitmap bitmap = this.f30040s;
                canvas.drawBitmap(bitmap, (float) (i2 - bitmap.getWidth()), (float) getSelectorTop(), null);
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo26819a(View view, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.f30031j == 0) {
            if (i >= view.getLeft()) {
                i5 = 4;
            }
            scrollTo((int) (((float) (i + getBehindWidth())) * this.f30034m), i2);
        } else if (this.f30031j == 1) {
            if (i <= view.getLeft()) {
                i5 = 4;
            }
            scrollTo((int) (((float) (getSecondaryBehindWidth() - getWidth())) + (((float) (i - getSecondaryBehindWidth())) * this.f30034m)), i2);
        } else if (this.f30031j == 2) {
            View view2 = this.f30024c;
            if (i >= view.getLeft()) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            view2.setVisibility(i3);
            View view3 = this.f30025d;
            if (i <= view.getLeft()) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            view3.setVisibility(i4);
            if (i == 0) {
                i5 = 4;
            }
            if (i <= view.getLeft()) {
                scrollTo((int) (((float) (i + getBehindWidth())) * this.f30034m), i2);
            } else {
                scrollTo((int) (((float) (getSecondaryBehindWidth() - getWidth())) + (((float) (i - getSecondaryBehindWidth())) * this.f30034m)), i2);
            }
        }
        setVisibility(i5);
    }

    /* renamed from: b */
    public final boolean mo26828b(View view, int i, float f) {
        if (this.f30031j == 0 || (this.f30031j == 2 && i == 0)) {
            if (f >= ((float) view.getLeft())) {
                return true;
            }
            return false;
        } else if ((this.f30031j == 1 || (this.f30031j == 2 && i == 2)) && f <= ((float) view.getRight())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo26821a(View view, Canvas canvas, float f) {
        int i;
        if (this.f30032k) {
            int i2 = 0;
            this.f30033l.setColor(Color.argb((int) (this.f30038q * 255.0f * Math.abs(1.0f - f)), 0, 0, 0));
            if (this.f30031j == 0) {
                i2 = view.getLeft() - getBehindWidth();
                i = view.getLeft();
            } else if (this.f30031j == 1) {
                i2 = view.getRight();
                i = view.getRight() + getSecondaryBehindWidth();
            } else if (this.f30031j == 2) {
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) (view.getLeft() - getSecondaryBehindWidth()), 0.0f, (float) view.getLeft(), (float) getHeight(), this.f30033l);
                i2 = view.getRight();
                i = view.getRight() + getSecondaryBehindWidth();
            } else {
                i = 0;
            }
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f30033l);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.f30024c.layout(0, 0, i5 - this.f30027f, i6);
        if (this.f30025d != null) {
            this.f30025d.layout(0, 0, i5 - this.f30028g, i6);
        }
    }
}
