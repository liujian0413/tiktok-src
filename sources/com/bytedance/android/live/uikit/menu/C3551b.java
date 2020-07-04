package com.bytedance.android.live.uikit.menu;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.menu.SlidingMenu.C3542a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.uikit.menu.b */
public final class C3551b extends ViewGroup {

    /* renamed from: a */
    private int f10563a;

    /* renamed from: b */
    private C3548a f10564b;

    /* renamed from: c */
    private View f10565c;

    /* renamed from: d */
    private View f10566d;

    /* renamed from: e */
    private int f10567e;

    /* renamed from: f */
    private int f10568f;

    /* renamed from: g */
    private int f10569g;

    /* renamed from: h */
    private C3542a f10570h;

    /* renamed from: i */
    private boolean f10571i;

    /* renamed from: j */
    private int f10572j;

    /* renamed from: k */
    private boolean f10573k;

    /* renamed from: l */
    private final Paint f10574l;

    /* renamed from: m */
    private float f10575m;

    /* renamed from: n */
    private Drawable f10576n;

    /* renamed from: o */
    private Drawable f10577o;

    /* renamed from: p */
    private int f10578p;

    /* renamed from: q */
    private float f10579q;

    /* renamed from: r */
    private boolean f10580r;

    /* renamed from: s */
    private Bitmap f10581s;

    /* renamed from: t */
    private View f10582t;

    public final View getContent() {
        return this.f10565c;
    }

    public final int getMode() {
        return this.f10572j;
    }

    public final float getScrollScale() {
        return this.f10575m;
    }

    public final View getSecondaryContent() {
        return this.f10566d;
    }

    /* renamed from: a */
    public final boolean mo10783a(View view, int i, float f) {
        switch (this.f10563a) {
            case 0:
                return mo10788b(view, i, f);
            case 1:
                return true;
            default:
                return false;
        }
    }

    public final int getBehindWidth() {
        return this.f10565c.getWidth();
    }

    public final int getSecondaryBehindWidth() {
        return this.f10566d.getWidth();
    }

    private int getSelectorTop() {
        return this.f10582t.getTop() + ((this.f10582t.getHeight() - this.f10581s.getHeight()) / 2);
    }

    public final void setCanvasTransformer(C3542a aVar) {
        this.f10570h = aVar;
    }

    public final void setChildrenEnabled(boolean z) {
        this.f10571i = z;
    }

    public final void setCustomViewAbove(C3548a aVar) {
        this.f10564b = aVar;
    }

    public final void setFadeEnabled(boolean z) {
        this.f10573k = z;
    }

    public final void setScrollScale(float f) {
        this.f10575m = f;
    }

    public final void setSelectorEnabled(boolean z) {
        this.f10580r = z;
    }

    public final void setTouchMode(int i) {
        this.f10563a = i;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f10571i) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10571i) {
            return true;
        }
        return false;
    }

    public final void setSecondaryShadowDrawable(Drawable drawable) {
        this.f10577o = drawable;
        invalidate();
    }

    public final void setSecondaryWidthOffset(int i) {
        this.f10569g = i;
        requestLayout();
    }

    public final void setSelectorBitmap(Bitmap bitmap) {
        this.f10581s = bitmap;
        refreshDrawableState();
    }

    public final void setShadowDrawable(Drawable drawable) {
        this.f10576n = drawable;
        invalidate();
    }

    public final void setShadowWidth(int i) {
        this.f10578p = i;
        invalidate();
    }

    public final void setWidthOffset(int i) {
        this.f10568f = i;
        requestLayout();
    }

    /* renamed from: a */
    public final int mo10776a(int i) {
        if (i > 1) {
            i = 2;
        } else if (i <= 0) {
            i = 0;
        }
        if (this.f10572j == 0 && i > 1) {
            return 0;
        }
        if (this.f10572j != 1 || i > 0) {
            return i;
        }
        return 2;
    }

    /* renamed from: b */
    public final int mo10784b(View view) {
        if (this.f10572j == 0) {
            return view.getLeft();
        }
        if (this.f10572j == 1 || this.f10572j == 2) {
            return view.getLeft() + getSecondaryBehindWidth();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f10570h != null) {
            canvas.save();
            this.f10564b.getPercentOpen();
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void setContent(View view) {
        if (this.f10565c != null) {
            removeView(this.f10565c);
        }
        this.f10565c = view;
        addView(this.f10565c);
    }

    public final void setFadeDegree(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.f10579q = f;
    }

    public final void setMode(int i) {
        if (i == 0 || i == 1) {
            if (this.f10565c != null) {
                this.f10565c.setVisibility(0);
            }
            if (this.f10566d != null) {
                this.f10566d.setVisibility(4);
            }
        }
        this.f10572j = i;
    }

    public final void setSecondaryContent(View view) {
        if (this.f10566d != null) {
            removeView(this.f10566d);
        }
        this.f10566d = view;
        addView(this.f10566d);
    }

    /* renamed from: a */
    public final int mo10777a(View view) {
        if (this.f10572j == 0 || this.f10572j == 2) {
            return view.getLeft() - getBehindWidth();
        }
        if (this.f10572j == 1) {
            return view.getLeft();
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo10786b(float f) {
        if (this.f10572j == 0) {
            if (f < 0.0f) {
                return true;
            }
            return false;
        } else if (this.f10572j == 1) {
            if (f > 0.0f) {
                return true;
            }
            return false;
        } else if (this.f10572j == 2) {
            return true;
        } else {
            return false;
        }
    }

    public final void setSelectedView(View view) {
        if (this.f10582t != null) {
            this.f10582t.setTag(R.id.d2o, null);
            this.f10582t = null;
        }
        if (view != null && view.getParent() != null) {
            this.f10582t = view;
            this.f10582t.setTag(R.id.d2o, "CustomViewBehindSelectedView");
            invalidate();
        }
    }

    /* renamed from: a */
    public final boolean mo10782a(float f) {
        if (this.f10572j == 0) {
            if (f > 0.0f) {
                return true;
            }
            return false;
        } else if (this.f10572j == 1) {
            if (f < 0.0f) {
                return true;
            }
            return false;
        } else if (this.f10572j == 2) {
            return true;
        } else {
            return false;
        }
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        if (this.f10570h != null) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        int childMeasureSpec = getChildMeasureSpec(i, 0, defaultSize - this.f10568f);
        int childMeasureSpec2 = getChildMeasureSpec(i2, 0, defaultSize2);
        this.f10565c.measure(childMeasureSpec, childMeasureSpec2);
        if (this.f10566d != null) {
            this.f10566d.measure(getChildMeasureSpec(i, 0, defaultSize - this.f10569g), childMeasureSpec2);
        }
    }

    /* renamed from: a */
    public final int mo10778a(View view, int i) {
        if (this.f10572j == 0) {
            if (i == 0) {
                return view.getLeft() - getBehindWidth();
            }
            if (i == 2) {
                return view.getLeft();
            }
        } else if (this.f10572j == 1) {
            if (i == 0) {
                return view.getLeft();
            }
            if (i == 2) {
                return view.getLeft() + getSecondaryBehindWidth();
            }
        } else if (this.f10572j == 2) {
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
    public final boolean mo10787b(View view, int i) {
        int left = view.getLeft();
        int right = view.getRight();
        if (this.f10572j == 0) {
            if (i < left || i > this.f10567e + left) {
                return false;
            }
            return true;
        } else if (this.f10572j == 1) {
            if (i > right || i < right - this.f10567e) {
                return false;
            }
            return true;
        } else if (this.f10572j != 2) {
            return false;
        } else {
            if ((i < left || i > this.f10567e + left) && (i > right || i < right - this.f10567e)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final void mo10780a(View view, Canvas canvas) {
        int i;
        if (this.f10576n != null && this.f10578p > 0) {
            if (this.f10572j != 0) {
                if (this.f10572j == 1) {
                    i = view.getRight();
                } else if (this.f10572j != 2) {
                    i = 0;
                } else if (this.f10577o != null) {
                    int right = view.getRight();
                    this.f10577o.setBounds(right, 0, this.f10578p + right, getHeight());
                    this.f10577o.draw(canvas);
                }
                this.f10576n.setBounds(i, 0, this.f10578p + i, getHeight());
                this.f10576n.draw(canvas);
            }
            i = view.getLeft() - this.f10578p;
            this.f10576n.setBounds(i, 0, this.f10578p + i, getHeight());
            this.f10576n.draw(canvas);
        }
    }

    /* renamed from: b */
    public final void mo10785b(View view, Canvas canvas, float f) {
        if (this.f10580r && this.f10581s != null && this.f10582t != null && ((String) this.f10582t.getTag(R.id.d2o)).equals("CustomViewBehindSelectedView")) {
            canvas.save();
            int width = (int) (((float) this.f10581s.getWidth()) * f);
            if (this.f10572j == 0) {
                int left = view.getLeft();
                int i = left - width;
                canvas.clipRect(i, 0, left, getHeight());
                canvas.drawBitmap(this.f10581s, (float) i, (float) getSelectorTop(), null);
            } else if (this.f10572j == 1) {
                int right = view.getRight();
                int i2 = width + right;
                canvas.clipRect(right, 0, i2, getHeight());
                Bitmap bitmap = this.f10581s;
                canvas.drawBitmap(bitmap, (float) (i2 - bitmap.getWidth()), (float) getSelectorTop(), null);
            }
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo10779a(View view, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.f10572j == 0) {
            if (i >= view.getLeft()) {
                i5 = 4;
            }
            scrollTo((int) (((float) (i + getBehindWidth())) * this.f10575m), i2);
        } else if (this.f10572j == 1) {
            if (i <= view.getLeft()) {
                i5 = 4;
            }
            scrollTo((int) (((float) (getSecondaryBehindWidth() - getWidth())) + (((float) (i - getSecondaryBehindWidth())) * this.f10575m)), i2);
        } else if (this.f10572j == 2) {
            View view2 = this.f10565c;
            if (i >= view.getLeft()) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            view2.setVisibility(i3);
            View view3 = this.f10566d;
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
                scrollTo((int) (((float) (i + getBehindWidth())) * this.f10575m), i2);
            } else {
                scrollTo((int) (((float) (getSecondaryBehindWidth() - getWidth())) + (((float) (i - getSecondaryBehindWidth())) * this.f10575m)), i2);
            }
        }
        setVisibility(i5);
    }

    /* renamed from: b */
    public final boolean mo10788b(View view, int i, float f) {
        if (this.f10572j == 0 || (this.f10572j == 2 && i == 0)) {
            if (f >= ((float) view.getLeft())) {
                return true;
            }
            return false;
        } else if ((this.f10572j == 1 || (this.f10572j == 2 && i == 2)) && f <= ((float) view.getRight())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo10781a(View view, Canvas canvas, float f) {
        int i;
        if (this.f10573k) {
            int i2 = 0;
            this.f10574l.setColor(Color.argb((int) (this.f10579q * 255.0f * Math.abs(1.0f - f)), 0, 0, 0));
            if (this.f10572j == 0) {
                i2 = view.getLeft() - getBehindWidth();
                i = view.getLeft();
            } else if (this.f10572j == 1) {
                i2 = view.getRight();
                i = view.getRight() + getSecondaryBehindWidth();
            } else if (this.f10572j == 2) {
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) (view.getLeft() - getSecondaryBehindWidth()), 0.0f, (float) view.getLeft(), (float) getHeight(), this.f10574l);
                i2 = view.getRight();
                i = view.getRight() + getSecondaryBehindWidth();
            } else {
                i = 0;
            }
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f10574l);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.f10565c.layout(0, 0, i5 - this.f10568f, i6);
        if (this.f10566d != null) {
            this.f10566d.layout(0, 0, i5 - this.f10569g, i6);
        }
    }
}
