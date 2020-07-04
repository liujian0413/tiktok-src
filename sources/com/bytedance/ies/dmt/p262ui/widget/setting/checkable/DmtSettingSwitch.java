package com.bytedance.ies.dmt.p262ui.widget.setting.checkable;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import com.bytedance.ies.dmt.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch */
public class DmtSettingSwitch extends View {

    /* renamed from: d */
    private static final int[] f29182d = {R.attr.a3x};

    /* renamed from: l */
    private static final Property<DmtSettingSwitch, Float> f29183l = new Property<DmtSettingSwitch, Float>(Float.class, "thumbPos") {
        /* renamed from: a */
        private static Float m31701a(DmtSettingSwitch dmtSettingSwitch) {
            return Float.valueOf(dmtSettingSwitch.f29184a);
        }

        public final /* synthetic */ Object get(Object obj) {
            return m31701a((DmtSettingSwitch) obj);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m31702a((DmtSettingSwitch) obj, (Float) obj2);
        }

        /* renamed from: a */
        private static void m31702a(DmtSettingSwitch dmtSettingSwitch, Float f) {
            dmtSettingSwitch.setThumbPosition(f.floatValue());
        }
    };

    /* renamed from: a */
    public float f29184a;

    /* renamed from: b */
    public boolean f29185b;

    /* renamed from: c */
    ObjectAnimator f29186c;

    /* renamed from: e */
    private Drawable f29187e;

    /* renamed from: f */
    private int f29188f;

    /* renamed from: g */
    private int f29189g;

    /* renamed from: h */
    private int f29190h;

    /* renamed from: i */
    private Rect f29191i;

    /* renamed from: j */
    private RectF f29192j;

    /* renamed from: k */
    private ColorStateList f29193k;

    /* renamed from: m */
    private Paint f29194m;

    /* renamed from: n */
    private int f29195n;

    /* renamed from: o */
    private C10815a f29196o;

    /* renamed from: p */
    private int f29197p;

    /* renamed from: q */
    private VelocityTracker f29198q;

    /* renamed from: r */
    private int f29199r;

    /* renamed from: s */
    private float f29200s;

    /* renamed from: t */
    private float f29201t;

    /* renamed from: u */
    private boolean f29202u;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.checkable.DmtSettingSwitch$a */
    public interface C10815a {
    }

    /* renamed from: a */
    private static float m31696a(float f, float f2, float f3) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public Drawable getThumbDrawable() {
        return this.f29187e;
    }

    public Rect getThumbRect() {
        return this.f29191i;
    }

    public int getTrackPadding() {
        return this.f29189g;
    }

    public int getTrackRadius() {
        return this.f29190h;
    }

    public ColorStateList getTrackTintList() {
        return this.f29193k;
    }

    private int getThumbScrollRange() {
        return getMeasuredWidth() - this.f29188f;
    }

    private boolean getTargetCheckedState() {
        if (this.f29184a > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m31697a() {
        if (this.f29186c != null) {
            this.f29186c.cancel();
        }
    }

    private int getThumbOffset() {
        float f;
        if (C0991u.m4220h(this) == 1) {
            f = 1.0f - this.f29184a;
        } else {
            f = this.f29184a;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    public void setEnableTouch(boolean z) {
        this.f29202u = z;
    }

    public void setOnCheckedChangeListener(C10815a aVar) {
        this.f29196o = aVar;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.f29187e = drawable;
    }

    public void setThumbRect(Rect rect) {
        this.f29191i = rect;
    }

    public void setTrackPadding(int i) {
        this.f29189g = i;
    }

    public void setTrackRadius(int i) {
        this.f29190h = i;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f29193k = colorStateList;
    }

    public DmtSettingSwitch(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f29184a = f;
        invalidate();
    }

    /* renamed from: b */
    private void m31700b(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f29185b) {
            mergeDrawableStates(onCreateDrawableState, f29182d);
        }
        return onCreateDrawableState;
    }

    /* renamed from: a */
    private void m31699a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.f29186c = ObjectAnimator.ofFloat(this, f29183l, new float[]{f});
        this.f29186c.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f29186c.setAutoCancel(true);
        }
        this.f29186c.start();
    }

    public void setChecked(boolean z) {
        float f;
        if (this.f29185b != z) {
            this.f29185b = z;
        }
        refreshDrawableState();
        if (getWindowToken() == null || !C0991u.m4167D(this)) {
            m31697a();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            setThumbPosition(f);
            return;
        }
        m31699a(z);
    }

    /* renamed from: a */
    private void m31698a(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        this.f29199r = 0;
        boolean z3 = true;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z = false;
        } else {
            z = true;
        }
        boolean z4 = this.f29185b;
        if (z) {
            this.f29198q.computeCurrentVelocity(1000);
            float xVelocity = this.f29198q.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f29197p)) {
                if (C0991u.m4220h(this) != 1 ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z3 = false;
                }
                z2 = z3;
            } else {
                z2 = getTargetCheckedState();
            }
        } else {
            z2 = z4;
        }
        if (z2 != z4) {
            playSoundEffect(0);
        }
        setChecked(z2);
        m31700b(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int[] drawableState = getDrawableState();
        if (this.f29193k != null) {
            this.f29194m.setColor(this.f29193k.getColorForState(drawableState, -65536));
        }
        this.f29192j.left = 0.0f;
        this.f29192j.right = (float) getMeasuredWidth();
        this.f29192j.top = (float) this.f29189g;
        this.f29192j.bottom = (float) (getMeasuredHeight() - this.f29189g);
        canvas.drawRoundRect(this.f29192j, (float) this.f29190h, (float) this.f29190h, this.f29194m);
        this.f29191i.left = getThumbOffset();
        this.f29191i.right = this.f29191i.left + this.f29188f;
        if (this.f29187e != null) {
            this.f29187e.setBounds(this.f29191i);
            this.f29187e.setState(drawableState);
            this.f29187e.draw(canvas);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (!this.f29202u) {
            return false;
        }
        this.f29198q.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled()) {
                    this.f29199r = 1;
                    this.f29200s = x;
                    this.f29201t = y;
                    break;
                }
                break;
            case 1:
            case 3:
                if (this.f29199r != 2) {
                    this.f29199r = 0;
                    this.f29198q.clear();
                    break;
                } else {
                    m31698a(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
            case 2:
                switch (this.f29199r) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.f29200s) > ((float) this.f29195n) || Math.abs(y2 - this.f29201t) > ((float) this.f29195n)) {
                            this.f29199r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f29200s = x2;
                            this.f29201t = y2;
                            return true;
                        }
                    case 2:
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f2 = x3 - this.f29200s;
                        if (thumbScrollRange != 0) {
                            f = f2 / ((float) thumbScrollRange);
                        } else if (f2 > 0.0f) {
                            f = 1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (C0991u.m4220h(this) == 1) {
                            f = -f;
                        }
                        float a = m31696a(this.f29184a + f, 0.0f, 1.0f);
                        if (a != this.f29184a) {
                            this.f29200s = x3;
                            setThumbPosition(a);
                        }
                        return true;
                }
                break;
        }
        return true;
    }

    public DmtSettingSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f29187e == null) {
            super.onMeasure(i, i2);
            return;
        }
        int intrinsicWidth = this.f29187e.getIntrinsicWidth();
        int intrinsicHeight = this.f29187e.getIntrinsicHeight();
        this.f29191i.left = 0;
        this.f29191i.top = 0;
        this.f29191i.right = intrinsicWidth;
        this.f29188f = intrinsicWidth;
        this.f29191i.bottom = intrinsicHeight;
        this.f29187e.setBounds(this.f29191i);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            setMeasuredDimension(size, intrinsicHeight);
        } else {
            setMeasuredDimension(intrinsicWidth * 2, intrinsicHeight);
        }
    }

    public DmtSettingSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29194m = new Paint();
        this.f29198q = VelocityTracker.obtain();
        this.f29202u = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DmtSettingSwitch);
        this.f29187e = obtainStyledAttributes.getDrawable(0);
        this.f29193k = obtainStyledAttributes.getColorStateList(3);
        this.f29189g = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f29190h = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        obtainStyledAttributes.recycle();
        this.f29194m.setAntiAlias(true);
        this.f29191i = new Rect();
        this.f29192j = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f29195n = viewConfiguration.getScaledTouchSlop();
        this.f29197p = viewConfiguration.getScaledMinimumFlingVelocity();
    }
}
