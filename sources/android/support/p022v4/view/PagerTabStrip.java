package android.support.p022v4.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.view.MotionEvent;

/* renamed from: android.support.v4.view.PagerTabStrip */
public class PagerTabStrip extends C0984p {

    /* renamed from: g */
    private int f3260g;

    /* renamed from: h */
    private int f3261h;

    /* renamed from: i */
    private int f3262i;

    /* renamed from: j */
    private int f3263j;

    /* renamed from: k */
    private int f3264k;

    /* renamed from: l */
    private int f3265l;

    /* renamed from: m */
    private final Paint f3266m;

    /* renamed from: n */
    private final Rect f3267n;

    /* renamed from: o */
    private int f3268o;

    /* renamed from: p */
    private boolean f3269p;

    /* renamed from: q */
    private boolean f3270q;

    /* renamed from: r */
    private int f3271r;

    /* renamed from: s */
    private boolean f3272s;

    /* renamed from: t */
    private float f3273t;

    /* renamed from: u */
    private float f3274u;

    /* renamed from: v */
    private int f3275v;

    public boolean getDrawFullUnderline() {
        return this.f3269p;
    }

    public int getTabIndicatorColor() {
        return this.f3260g;
    }

    /* access modifiers changed from: 0000 */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f3264k);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        boolean z;
        super.setBackgroundDrawable(drawable);
        if (!this.f3270q) {
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.f3269p = z;
        }
    }

    public void setBackgroundResource(int i) {
        boolean z;
        super.setBackgroundResource(i);
        if (!this.f3270q) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f3269p = z;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f3269p = z;
        this.f3270q = true;
        invalidate();
    }

    public void setTabIndicatorColor(int i) {
        this.f3260g = i;
        this.f3266m.setColor(this.f3260g);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(C0683b.m2912c(getContext(), i));
    }

    public void setTextSpacing(int i) {
        if (i < this.f3263j) {
            i = this.f3263j;
        }
        super.setTextSpacing(i);
    }

    public void setBackgroundColor(int i) {
        boolean z;
        super.setBackgroundColor(i);
        if (!this.f3270q) {
            if ((i & -16777216) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f3269p = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f3408c.getLeft() - this.f3265l;
        int right = this.f3408c.getRight() + this.f3265l;
        int i = height - this.f3261h;
        this.f3266m.setColor((this.f3268o << 24) | (this.f3260g & 16777215));
        float f = (float) height;
        canvas.drawRect((float) left, (float) i, (float) right, f, this.f3266m);
        if (this.f3269p) {
            this.f3266m.setColor(-16777216 | (this.f3260g & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f3271r), (float) (getWidth() - getPaddingRight()), f, this.f3266m);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f3272s) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f3273t = x;
                this.f3274u = y;
                this.f3272s = false;
                break;
            case 1:
                if (x >= ((float) (this.f3408c.getLeft() - this.f3265l))) {
                    if (x > ((float) (this.f3408c.getRight() + this.f3265l))) {
                        this.f3406a.setCurrentItem(this.f3406a.getCurrentItem() + 1);
                        break;
                    }
                } else {
                    this.f3406a.setCurrentItem(this.f3406a.getCurrentItem() - 1);
                    break;
                }
                break;
            case 2:
                if (Math.abs(x - this.f3273t) > ((float) this.f3275v) || Math.abs(y - this.f3274u) > ((float) this.f3275v)) {
                    this.f3272s = true;
                    break;
                }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3531a(int i, float f, boolean z) {
        Rect rect = this.f3267n;
        int height = getHeight();
        int i2 = height - this.f3261h;
        rect.set(this.f3408c.getLeft() - this.f3265l, i2, this.f3408c.getRight() + this.f3265l, height);
        super.mo3531a(i, f, z);
        this.f3268o = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f3408c.getLeft() - this.f3265l, i2, this.f3408c.getRight() + this.f3265l, height);
        invalidate(rect);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f3262i) {
            i4 = this.f3262i;
        }
        super.setPadding(i, i2, i3, i4);
    }
}
