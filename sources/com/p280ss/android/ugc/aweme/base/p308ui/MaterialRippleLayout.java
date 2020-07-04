package com.p280ss.android.ugc.aweme.base.p308ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import com.p280ss.android.ugc.aweme.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.base.ui.MaterialRippleLayout */
public class MaterialRippleLayout extends RelativeLayout {

    /* renamed from: A */
    private GestureDetector f61721A;

    /* renamed from: B */
    private C23424a f61722B;

    /* renamed from: C */
    private C23425b f61723C;

    /* renamed from: D */
    private SimpleOnGestureListener f61724D;

    /* renamed from: E */
    private Property<MaterialRippleLayout, Float> f61725E;

    /* renamed from: F */
    private Property<MaterialRippleLayout, Integer> f61726F;

    /* renamed from: a */
    public boolean f61727a;

    /* renamed from: b */
    public int f61728b;

    /* renamed from: c */
    public boolean f61729c;

    /* renamed from: d */
    public boolean f61730d;

    /* renamed from: e */
    public boolean f61731e;

    /* renamed from: f */
    public View f61732f;

    /* renamed from: g */
    public boolean f61733g;

    /* renamed from: h */
    public boolean f61734h;

    /* renamed from: i */
    private final Paint f61735i;

    /* renamed from: j */
    private final Rect f61736j;

    /* renamed from: k */
    private int f61737k;

    /* renamed from: l */
    private boolean f61738l;

    /* renamed from: m */
    private int f61739m;

    /* renamed from: n */
    private int f61740n;

    /* renamed from: o */
    private int f61741o;

    /* renamed from: p */
    private Drawable f61742p;

    /* renamed from: q */
    private float f61743q;

    /* renamed from: r */
    private float f61744r;

    /* renamed from: s */
    private AdapterView f61745s;

    /* renamed from: t */
    private AnimatorSet f61746t;

    /* renamed from: u */
    private ObjectAnimator f61747u;

    /* renamed from: v */
    private Point f61748v;

    /* renamed from: w */
    private Point f61749w;

    /* renamed from: x */
    private int f61750x;

    /* renamed from: y */
    private boolean f61751y;

    /* renamed from: z */
    private int f61752z;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.MaterialRippleLayout$a */
    class C23424a implements Runnable {
        public final void run() {
            if (!MaterialRippleLayout.this.f61734h) {
                if (MaterialRippleLayout.this.getParent() instanceof AdapterView) {
                    if (!MaterialRippleLayout.this.f61732f.performClick()) {
                        m76853a((AdapterView) MaterialRippleLayout.this.getParent());
                    }
                } else if (MaterialRippleLayout.this.f61731e) {
                    m76853a(MaterialRippleLayout.this.mo60948c());
                } else {
                    MaterialRippleLayout.this.f61732f.performClick();
                }
            }
        }

        private C23424a() {
        }

        /* renamed from: a */
        private void m76853a(AdapterView adapterView) {
            long j;
            int positionForView = adapterView.getPositionForView(MaterialRippleLayout.this);
            if (adapterView.getAdapter() != null) {
                j = adapterView.getAdapter().getItemId(positionForView);
            } else {
                j = 0;
            }
            if (positionForView != -1) {
                adapterView.performItemClick(MaterialRippleLayout.this, positionForView, j);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.MaterialRippleLayout$b */
    final class C23425b implements Runnable {

        /* renamed from: b */
        private final MotionEvent f61761b;

        public final void run() {
            MaterialRippleLayout.this.f61733g = false;
            MaterialRippleLayout.this.f61732f.setLongClickable(false);
            MaterialRippleLayout.this.f61732f.onTouchEvent(this.f61761b);
            MaterialRippleLayout.this.f61732f.setPressed(true);
            if (MaterialRippleLayout.this.f61727a) {
                MaterialRippleLayout.this.mo60947b();
            }
        }

        public C23425b(MotionEvent motionEvent) {
            this.f61761b = motionEvent;
        }
    }

    public <T extends View> T getChildView() {
        return this.f61732f;
    }

    public float getRadius() {
        return this.f61744r;
    }

    public boolean isInEditMode() {
        return true;
    }

    public int getRippleAlpha() {
        return this.f61735i.getAlpha();
    }

    /* renamed from: f */
    private void m76842f() {
        if (this.f61731e) {
            this.f61752z = mo60948c().getPositionForView(this);
        }
    }

    /* renamed from: d */
    private void m76840d() {
        if (this.f61746t != null) {
            this.f61746t.cancel();
            this.f61746t.removeAllListeners();
        }
        if (this.f61747u != null) {
            this.f61747u.cancel();
        }
    }

    /* renamed from: e */
    private boolean m76841e() {
        ViewParent parent = getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    /* renamed from: h */
    private void m76844h() {
        if (VERSION.SDK_INT <= 17) {
            if (this.f61743q != 0.0f) {
                this.f61750x = getLayerType();
                setLayerType(1, null);
                return;
            }
            setLayerType(this.f61750x, null);
        }
    }

    /* renamed from: a */
    public final void mo60944a() {
        if (this.f61723C != null) {
            removeCallbacks(this.f61723C);
            this.f61733g = false;
        }
    }

    /* renamed from: g */
    private boolean m76843g() {
        boolean z;
        if (!this.f61731e) {
            return false;
        }
        int positionForView = mo60948c().getPositionForView(this);
        if (positionForView != this.f61752z) {
            z = true;
        } else {
            z = false;
        }
        this.f61752z = positionForView;
        if (z) {
            mo60944a();
            m76840d();
            this.f61732f.setPressed(false);
            setRadius(0.0f);
        }
        return z;
    }

    /* renamed from: c */
    public final AdapterView mo60948c() {
        if (this.f61745s != null) {
            return this.f61745s;
        }
        ViewParent parent = getParent();
        while (!(parent instanceof AdapterView)) {
            try {
                parent = parent.getParent();
            } catch (NullPointerException unused) {
                throw new RuntimeException("Could not find a parent AdapterView");
            }
        }
        this.f61745s = (AdapterView) parent;
        return this.f61745s;
    }

    private float getEndRadius() {
        int i;
        int i2;
        int width = getWidth();
        int height = getHeight();
        int i3 = height / 2;
        if (width / 2 > this.f61748v.x) {
            i = width - this.f61748v.x;
        } else {
            i = this.f61748v.x;
        }
        float f = (float) i;
        if (i3 > this.f61748v.y) {
            i2 = height - this.f61748v.y;
        } else {
            i2 = this.f61748v.y;
        }
        return ((float) Math.sqrt(Math.pow((double) f, 2.0d) + Math.pow((double) ((float) i2), 2.0d))) * 1.2f;
    }

    /* renamed from: b */
    public final void mo60947b() {
        if (!this.f61751y) {
            if (this.f61747u != null) {
                this.f61747u.cancel();
            }
            float sqrt = (float) (Math.sqrt(Math.pow((double) getWidth(), 2.0d) + Math.pow((double) getHeight(), 2.0d)) * 1.2000000476837158d);
            this.f61747u = ObjectAnimator.ofFloat(this, this.f61725E, new float[]{(float) this.f61739m, sqrt}).setDuration(2500);
            this.f61747u.setInterpolator(new LinearInterpolator());
            this.f61747u.start();
        }
    }

    public void setRippleDelayClick(boolean z) {
        this.f61729c = z;
    }

    public void setRippleDiameter(int i) {
        this.f61739m = i;
    }

    public void setRippleDuration(int i) {
        this.f61740n = i;
    }

    public void setRippleFadeDuration(int i) {
        this.f61741o = i;
    }

    public void setRippleHover(boolean z) {
        this.f61727a = z;
    }

    public void setRippleInAdapter(boolean z) {
        this.f61731e = z;
    }

    public void setRippleOverlay(boolean z) {
        this.f61738l = z;
    }

    public void setRipplePersistent(boolean z) {
        this.f61730d = z;
    }

    public MaterialRippleLayout(Context context) {
        this(context, null, 0);
    }

    public void setRadius(float f) {
        this.f61744r = f;
        invalidate();
    }

    public void setRippleRoundedCorners(int i) {
        this.f61743q = (float) i;
        m76844h();
    }

    public void setRippleAlpha(Integer num) {
        this.f61735i.setAlpha(num.intValue());
        invalidate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!m76839a(this.f61732f, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return false;
    }

    public void setDefaultRippleAlpha(float f) {
        this.f61728b = (int) (f * 255.0f);
        this.f61735i.setAlpha(this.f61728b);
        invalidate();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        if (this.f61732f != null) {
            this.f61732f.setOnClickListener(onClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        if (this.f61732f != null) {
            this.f61732f.setOnLongClickListener(onLongClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setRippleBackground(int i) {
        this.f61742p = new ColorDrawable(i);
        this.f61742p.setBounds(this.f61736j);
        invalidate();
    }

    public void setRippleColor(int i) {
        this.f61737k = i;
        this.f61735i.setColor(i);
        this.f61735i.setAlpha(this.f61728b);
        invalidate();
    }

    public void draw(Canvas canvas) {
        boolean g = m76843g();
        if (this.f61738l) {
            if (!g) {
                this.f61742p.draw(canvas);
            }
            super.draw(canvas);
            if (!g) {
                if (this.f61743q != 0.0f) {
                    Path path = new Path();
                    path.addRoundRect(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), this.f61743q, this.f61743q, Direction.CW);
                    canvas.clipPath(path);
                }
                canvas.drawCircle((float) this.f61748v.x, (float) this.f61748v.y, this.f61744r, this.f61735i);
            }
        } else {
            if (!g) {
                this.f61742p.draw(canvas);
                canvas.drawCircle((float) this.f61748v.x, (float) this.f61748v.y, this.f61744r, this.f61735i);
            }
            super.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void mo60945a(final Runnable runnable) {
        if (!this.f61751y) {
            float endRadius = getEndRadius();
            m76840d();
            this.f61746t = new AnimatorSet();
            this.f61746t.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (!MaterialRippleLayout.this.f61730d) {
                        MaterialRippleLayout.this.setRadius(0.0f);
                        MaterialRippleLayout.this.setRippleAlpha(Integer.valueOf(MaterialRippleLayout.this.f61728b));
                    }
                    if (runnable != null && MaterialRippleLayout.this.f61729c) {
                        runnable.run();
                    }
                    MaterialRippleLayout.this.f61732f.setPressed(false);
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.f61725E, new float[]{this.f61744r, endRadius});
            ofFloat.setDuration((long) this.f61740n);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, this.f61726F, new int[]{this.f61728b, 0});
            ofInt.setDuration((long) this.f61741o);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.setStartDelay((long) ((this.f61740n - this.f61741o) - 50));
            if (this.f61730d) {
                this.f61746t.play(ofFloat);
            } else if (getRadius() > endRadius) {
                ofInt.setStartDelay(0);
                this.f61746t.play(ofInt);
            } else {
                this.f61746t.playTogether(new Animator[]{ofFloat, ofInt});
            }
            this.f61746t.start();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!isEnabled() || !this.f61732f.isEnabled()) {
            return onTouchEvent;
        }
        boolean contains = this.f61736j.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (contains) {
            this.f61749w.set(this.f61748v.x, this.f61748v.y);
            this.f61748v.set((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f61721A.onTouchEvent(motionEvent) || this.f61734h) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                m76842f();
                this.f61751y = false;
                this.f61723C = new C23425b(motionEvent);
                if (!m76841e()) {
                    this.f61723C.run();
                    break;
                } else {
                    mo60944a();
                    this.f61733g = true;
                    postDelayed(this.f61723C, (long) ViewConfiguration.getTapTimeout());
                    break;
                }
            case 1:
                this.f61722B = new C23424a();
                if (this.f61733g) {
                    this.f61732f.setPressed(true);
                    postDelayed(new Runnable() {
                        public final void run() {
                            MaterialRippleLayout.this.f61732f.setPressed(false);
                        }
                    }, (long) ViewConfiguration.getPressedStateDuration());
                }
                if (contains) {
                    mo60945a(this.f61722B);
                } else if (!this.f61727a) {
                    setRadius(0.0f);
                }
                if (!this.f61729c && contains) {
                    this.f61722B.run();
                }
                mo60944a();
                break;
            case 2:
                if (this.f61727a) {
                    if (contains && !this.f61751y) {
                        invalidate();
                    } else if (!contains) {
                        mo60945a(null);
                    }
                }
                if (!contains) {
                    mo60944a();
                    if (this.f61747u != null) {
                        this.f61747u.cancel();
                    }
                    this.f61732f.onTouchEvent(motionEvent);
                    this.f61751y = true;
                    break;
                }
                break;
            case 3:
                if (this.f61731e) {
                    this.f61748v.set(this.f61749w.x, this.f61749w.y);
                    this.f61749w = new Point();
                }
                this.f61732f.onTouchEvent(motionEvent);
                if (!this.f61727a) {
                    this.f61732f.setPressed(false);
                } else if (!this.f61733g) {
                    mo60945a(null);
                }
                mo60944a();
                break;
        }
        return true;
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m76838a(Resources resources, float f) {
        return TypedValue.applyDimension(1, 35.0f, resources.getDisplayMetrics());
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            this.f61732f = view;
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout can host only one child");
    }

    /* renamed from: a */
    private boolean m76839a(View view, int i, int i2) {
        loop0:
        while (true) {
            int i3 = 0;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i3 < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i3);
                    Rect rect = new Rect();
                    childAt.getHitRect(rect);
                    if (rect.contains(i, i2)) {
                        i -= rect.left;
                        i2 -= rect.top;
                        view = childAt;
                    } else {
                        i3++;
                    }
                }
                break loop0;
            } else if (view != this.f61732f) {
                if (!view.isEnabled() || (!view.isClickable() && !view.isLongClickable() && !view.isFocusableInTouchMode())) {
                    return false;
                }
                return true;
            }
        }
        return view.isFocusableInTouchMode();
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61735i = new Paint(1);
        this.f61736j = new Rect();
        this.f61748v = new Point();
        this.f61749w = new Point();
        this.f61724D = new SimpleOnGestureListener() {
            public final boolean onDown(MotionEvent motionEvent) {
                MaterialRippleLayout.this.f61734h = false;
                return super.onDown(motionEvent);
            }

            public final void onLongPress(MotionEvent motionEvent) {
                MaterialRippleLayout.this.f61734h = MaterialRippleLayout.this.f61732f.performLongClick();
                if (MaterialRippleLayout.this.f61734h) {
                    if (MaterialRippleLayout.this.f61727a) {
                        MaterialRippleLayout.this.mo60945a(null);
                    }
                    MaterialRippleLayout.this.mo60944a();
                }
            }
        };
        this.f61725E = new Property<MaterialRippleLayout, Float>(Float.class, "radius") {
            public final /* synthetic */ Object get(Object obj) {
                return m76849a((MaterialRippleLayout) obj);
            }

            /* renamed from: a */
            private static Float m76849a(MaterialRippleLayout materialRippleLayout) {
                return Float.valueOf(materialRippleLayout.getRadius());
            }

            /* renamed from: a */
            private static void m76850a(MaterialRippleLayout materialRippleLayout, Float f) {
                materialRippleLayout.setRadius(f.floatValue());
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                m76850a((MaterialRippleLayout) obj, (Float) obj2);
            }
        };
        this.f61726F = new Property<MaterialRippleLayout, Integer>(Integer.class, "rippleAlpha") {
            public final /* synthetic */ Object get(Object obj) {
                return m76851a((MaterialRippleLayout) obj);
            }

            /* renamed from: a */
            private static Integer m76851a(MaterialRippleLayout materialRippleLayout) {
                return Integer.valueOf(materialRippleLayout.getRippleAlpha());
            }

            /* renamed from: a */
            private static void m76852a(MaterialRippleLayout materialRippleLayout, Integer num) {
                materialRippleLayout.setRippleAlpha(num);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                m76852a((MaterialRippleLayout) obj, (Integer) obj2);
            }
        };
        setWillNotDraw(false);
        this.f61721A = new GestureDetector(context, this.f61724D);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialRippleLayout);
        this.f61737k = obtainStyledAttributes.getColor(2, -1);
        this.f61739m = obtainStyledAttributes.getDimensionPixelSize(4, (int) m76838a(getResources(), 35.0f));
        this.f61738l = obtainStyledAttributes.getBoolean(9, false);
        this.f61727a = obtainStyledAttributes.getBoolean(7, true);
        this.f61740n = obtainStyledAttributes.getInt(5, 350);
        this.f61728b = (int) (obtainStyledAttributes.getFloat(0, 0.2f) * 255.0f);
        this.f61729c = obtainStyledAttributes.getBoolean(3, true);
        this.f61741o = obtainStyledAttributes.getInteger(6, 75);
        this.f61742p = new ColorDrawable(obtainStyledAttributes.getColor(1, 0));
        this.f61730d = obtainStyledAttributes.getBoolean(10, false);
        this.f61731e = obtainStyledAttributes.getBoolean(8, false);
        this.f61743q = (float) obtainStyledAttributes.getDimensionPixelSize(11, 0);
        obtainStyledAttributes.recycle();
        this.f61735i.setColor(this.f61737k);
        this.f61735i.setAlpha(this.f61728b);
        m76844h();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f61736j.set(0, 0, i, i2);
        this.f61742p.setBounds(this.f61736j);
    }
}
