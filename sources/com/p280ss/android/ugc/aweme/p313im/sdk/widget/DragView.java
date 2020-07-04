package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.uikit.p576a.C10994a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.DragView */
public class DragView extends FrameLayout implements OnGlobalLayoutListener {

    /* renamed from: A */
    private boolean f83505A = true;

    /* renamed from: a */
    public View f83506a;

    /* renamed from: b */
    public float f83507b = 6.0f;

    /* renamed from: c */
    public int f83508c = 10;

    /* renamed from: d */
    public C31973a f83509d;

    /* renamed from: e */
    int f83510e;

    /* renamed from: f */
    int f83511f;

    /* renamed from: g */
    int f83512g;

    /* renamed from: h */
    int f83513h;

    /* renamed from: i */
    int f83514i;

    /* renamed from: j */
    int f83515j;

    /* renamed from: k */
    private View f83516k;

    /* renamed from: l */
    private IViewInfo f83517l;

    /* renamed from: m */
    private int f83518m = -1;

    /* renamed from: n */
    private float f83519n;

    /* renamed from: o */
    private float f83520o;

    /* renamed from: p */
    private float f83521p;

    /* renamed from: q */
    private float f83522q;

    /* renamed from: r */
    private float f83523r = 1.0f;

    /* renamed from: s */
    private float f83524s = 1.0f;

    /* renamed from: t */
    private float f83525t = 0.3f;

    /* renamed from: u */
    private float f83526u = 0.3f;

    /* renamed from: v */
    private int f83527v = NormalGiftView.ALPHA_255;

    /* renamed from: w */
    private int f83528w = 120;

    /* renamed from: x */
    private long f83529x = 250;

    /* renamed from: y */
    private boolean f83530y;

    /* renamed from: z */
    private boolean f83531z = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.DragView$IViewInfo */
    public static class IViewInfo implements Parcelable {
        public static final Creator<IViewInfo> CREATOR = new Creator<IViewInfo>() {
            /* renamed from: a */
            private static IViewInfo[] m103841a(int i) {
                return new IViewInfo[i];
            }

            /* renamed from: a */
            private static IViewInfo m103840a(Parcel parcel) {
                return new IViewInfo(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m103840a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m103841a(i);
            }
        };

        /* renamed from: a */
        public int f83537a;

        /* renamed from: b */
        public int f83538b;

        /* renamed from: c */
        public int f83539c;

        /* renamed from: d */
        public int f83540d;

        /* renamed from: e */
        public float f83541e;

        /* renamed from: f */
        public float f83542f;

        public int describeContents() {
            return 0;
        }

        protected IViewInfo(Parcel parcel) {
            this.f83541e = 0.5f;
            this.f83542f = 1.0f;
            this.f83537a = parcel.readInt();
            this.f83538b = parcel.readInt();
            this.f83539c = parcel.readInt();
            this.f83540d = parcel.readInt();
            this.f83541e = parcel.readFloat();
            this.f83542f = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f83537a);
            parcel.writeInt(this.f83538b);
            parcel.writeInt(this.f83539c);
            parcel.writeInt(this.f83540d);
            parcel.writeFloat(this.f83541e);
            parcel.writeFloat(this.f83542f);
        }

        public IViewInfo(int i, int i2, int i3, int i4, float f) {
            this(i, i2, i3, i4, f, ((float) i3) / ((float) i4));
        }

        public IViewInfo(int i, int i2, int i3, int i4, float f, float f2) {
            this.f83541e = 0.5f;
            this.f83542f = 1.0f;
            this.f83537a = i;
            this.f83538b = i2;
            this.f83539c = i4;
            this.f83540d = i3;
            this.f83541e = f;
            this.f83542f = f2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.DragView$a */
    public interface C31973a {
        /* renamed from: a */
        void mo80760a();

        /* renamed from: a */
        void mo80761a(ValueAnimator valueAnimator);

        /* renamed from: b */
        void mo80762b();

        /* renamed from: c */
        void mo80763c();

        /* renamed from: d */
        void mo80764d();

        /* renamed from: e */
        void mo80765e();

        /* renamed from: f */
        void mo80766f();

        /* renamed from: g */
        boolean mo80767g();

        /* renamed from: h */
        boolean mo80768h();
    }

    public int getFullHeight() {
        return this.f83510e;
    }

    public int getFullWidth() {
        return this.f83511f;
    }

    /* renamed from: a */
    public final void mo82821a(View view, View view2, IViewInfo iViewInfo) {
        if (view != null && view2 != null && iViewInfo != null) {
            this.f83506a = view2;
            this.f83516k = view;
            this.f83517l = iViewInfo;
            this.f83507b = iViewInfo.f83541e;
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            if (VERSION.SDK_INT >= 21) {
                this.f83506a.setOutlineProvider(new ViewOutlineProvider() {
                    public final void getOutline(View view, Outline outline) {
                        Outline outline2 = outline;
                        outline2.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.max(DragView.this.f83507b, 0.5f));
                    }
                });
                this.f83506a.setClipToOutline(true);
                this.f83506a.setVisibility(4);
            }
            addView(this.f83516k);
            this.f83527v = 0;
            setBackgroundColor(this.f83527v << 24);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82819a(float f, float f2, float f3, float f4, int i, int i2, float f5, float f6, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f7 = 1.0f - floatValue;
        this.f83523r = (f * f7) + f2;
        this.f83524s = (f3 * f7) + f4;
        this.f83527v = ((int) (f7 * ((float) i))) + i2;
        m103821a((int) ((f5 * floatValue) + ((float) this.f83512g)), (int) ((floatValue * f6) + ((float) this.f83513h)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82820a(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f83523r = (f * floatValue) + this.f83525t;
        this.f83524s = (f2 * floatValue) + this.f83526u;
        this.f83527v = (int) (255.0f * floatValue);
        this.f83507b = this.f83517l.f83541e * (1.0f - floatValue);
        m103821a(this.f83515j + ((int) (f3 * floatValue)), this.f83514i + ((int) (floatValue * f4)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo82823b() {
        if (this.f83516k != null && this.f83506a != null) {
            m103829e();
        }
    }

    public void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        postDelayed(new C31990e(this), 200);
    }

    /* renamed from: c */
    private void m103825c() {
        if (this.f83521p <= ((float) this.f83528w) && this.f83524s > this.f83526u + 0.01f && this.f83523r > this.f83525t + 0.01f) {
            m103827d();
        } else if (this.f83517l == null) {
            m103830f();
        } else {
            mo82816a();
        }
        this.f83522q = 0.0f;
        this.f83521p = 0.0f;
    }

    /* renamed from: g */
    private void m103831g() {
        if (this.f83517l != null) {
            m103822a(this.f83517l.f83537a, this.f83517l.f83538b, this.f83517l.f83539c, this.f83517l.f83540d, this.f83517l.f83542f);
            this.f83508c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    /* renamed from: d */
    private void m103827d() {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f83529x);
        float f = 1.0f - this.f83523r;
        float f2 = this.f83523r;
        float f3 = 1.0f - this.f83524s;
        float f4 = this.f83524s;
        float translationX = this.f83506a.getTranslationX();
        float translationY = this.f83506a.getTranslationY();
        C31987b bVar = new C31987b(this, f, f2, f3, f4, 255 - this.f83527v, this.f83527v, translationX, translationY);
        duration.addUpdateListener(bVar);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (DragView.this.f83509d != null) {
                    DragView.this.f83509d.mo80763c();
                }
            }
        });
        duration.setInterpolator(new AccelerateInterpolator());
        duration.start();
    }

    /* renamed from: e */
    private void m103829e() {
        m103831g();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(this.f83529x);
        C31988c cVar = new C31988c(this, 1.0f - this.f83525t, 1.0f - this.f83526u, (float) (this.f83512g - this.f83515j), (float) (this.f83513h - this.f83514i));
        duration.addUpdateListener(cVar);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (DragView.this.f83509d != null) {
                    DragView.this.f83509d.mo80763c();
                }
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DragView.this.f83506a.setVisibility(0);
                if (DragView.this.f83509d != null) {
                    DragView.this.f83509d.mo80760a();
                }
            }
        });
        duration.start();
    }

    /* renamed from: f */
    private void m103830f() {
        float f = this.f83523r * 0.9f;
        float f2 = this.f83524s * 0.9f;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f83529x);
        float f3 = this.f83523r - f;
        float f4 = this.f83523r - f2;
        float f5 = (float) this.f83527v;
        LayoutParams layoutParams = (LayoutParams) this.f83506a.getLayoutParams();
        int i = layoutParams.topMargin;
        float width = (((float) getWidth()) - (((float) this.f83511f) * f)) / 2.0f;
        float height = (((float) getHeight()) - (((float) this.f83510e) * f2)) / 2.0f;
        C31989d dVar = new C31989d(this, f3, f, f4, f2, f5, ((float) layoutParams.leftMargin) - width, width, ((float) i) - height, height);
        duration.addUpdateListener(dVar);
        duration.start();
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (DragView.this.f83509d != null) {
                    DragView.this.f83509d.mo80766f();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo82816a() {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f83529x);
        C31986a aVar = new C31986a(this, this.f83523r - this.f83525t, this.f83524s - this.f83526u, (float) this.f83527v, this.f83506a.getTranslationX() - ((float) this.f83515j), this.f83506a.getTranslationY() - ((float) this.f83514i));
        duration.addUpdateListener(aVar);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DragView.this.f83506a.setVisibility(8);
                if (DragView.this.f83509d != null) {
                    DragView.this.f83509d.mo80766f();
                }
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (DragView.this.f83509d != null) {
                    DragView.this.f83509d.mo80762b();
                }
            }
        });
        duration.start();
    }

    public void setAnimatorDuration(int i) {
        this.f83529x = (long) i;
    }

    public void setCanDrag(boolean z) {
        this.f83531z = z;
    }

    public void setDragStateListener(C31973a aVar) {
        this.f83509d = aVar;
    }

    public void setDragThreshold(int i) {
        this.f83528w = i;
    }

    public void setFullScreenWindow(boolean z) {
        this.f83530y = z;
    }

    /* renamed from: a */
    public final void mo82822a(IViewInfo iViewInfo) {
        this.f83517l = iViewInfo;
        m103831g();
    }

    /* renamed from: c */
    private void m103826c(MotionEvent motionEvent) {
        this.f83519n = motionEvent.getX();
        this.f83520o = motionEvent.getY();
    }

    public DragView(Context context) {
        super(context);
        setBackgroundColor(-16777216);
    }

    /* renamed from: b */
    private boolean m103824b(MotionEvent motionEvent) {
        if (this.f83509d == null) {
            return false;
        }
        float y = motionEvent.getY() - this.f83520o;
        if ((y <= 0.0f || !this.f83509d.mo80768h()) && (y > 0.0f || !this.f83509d.mo80767g())) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 5) {
            this.f83518m = 2;
        }
        if (!this.f83531z && motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerId(motionEvent.getActionIndex()) == 0 && this.f83518m != 2) {
            int action = motionEvent.getAction();
            if (action == 0) {
                m103826c(motionEvent);
            } else if (action == 2 && ((this.f83518m == 1 || m103823a(motionEvent)) && !m103824b(motionEvent))) {
                m103828d(motionEvent);
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.f83518m = -1;
            if (!this.f83505A) {
                this.f83505A = true;
                m103825c();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private boolean m103823a(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX() - this.f83519n;
        float y = motionEvent.getY() - this.f83520o;
        if (Math.abs(y) <= ((float) this.f83508c) && Math.abs(x) <= ((float) this.f83508c)) {
            return false;
        }
        if (Math.abs(x) < Math.abs(y)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f83518m != 1) {
                this.f83519n = motionEvent.getX();
                this.f83520o = motionEvent.getY();
            }
            this.f83518m = 1;
        } else {
            this.f83518m = 0;
        }
        return z;
    }

    /* renamed from: d */
    private void m103828d(MotionEvent motionEvent) {
        if (this.f83505A) {
            this.f83505A = false;
            if (this.f83509d != null) {
                this.f83509d.mo80764d();
            }
        }
        float y = motionEvent.getY();
        this.f83522q = motionEvent.getX() - this.f83519n;
        this.f83521p = y - this.f83520o;
        float f = this.f83521p / ((float) this.f83528w);
        if (this.f83523r >= this.f83525t && this.f83523r <= 1.0f) {
            this.f83523r = 1.0f - ((1.0f - this.f83525t) * f);
        }
        if (this.f83524s >= this.f83526u && this.f83524s <= 1.0f) {
            this.f83524s = 1.0f - ((1.0f - this.f83526u) * f);
        }
        this.f83527v = (int) ((1.0f - f) * 255.0f);
        if (this.f83527v > 255) {
            this.f83527v = NormalGiftView.ALPHA_255;
        } else if (this.f83527v <= 26) {
            this.f83527v = 26;
        }
        if (this.f83525t < 1.0f) {
            if (this.f83523r < this.f83525t) {
                this.f83523r = this.f83525t;
            } else if (this.f83523r > 1.0f) {
                this.f83523r = 1.0f;
            }
        } else if (this.f83523r < 1.0f) {
            this.f83523r = 1.0f;
        } else if (this.f83523r > this.f83525t) {
            this.f83523r = this.f83525t;
        }
        if (this.f83526u < 1.0f) {
            if (this.f83524s < this.f83526u) {
                this.f83524s = this.f83526u;
            } else if (this.f83524s > 1.0f) {
                this.f83524s = 1.0f;
            }
        } else if (this.f83524s < 1.0f) {
            this.f83524s = 1.0f;
        } else if (this.f83524s > this.f83526u) {
            this.f83524s = this.f83526u;
        }
        if (this.f83509d != null) {
            this.f83509d.mo80765e();
        }
        m103821a((int) (this.f83522q + (this.f83519n * (1.0f - this.f83523r)) + (((float) this.f83512g) * this.f83523r)), (int) (this.f83521p + (this.f83520o * (1.0f - this.f83524s)) + (((float) this.f83513h) * this.f83524s)));
    }

    /* renamed from: a */
    private void m103821a(int i, int i2) {
        this.f83506a.setScaleX(this.f83523r);
        this.f83506a.setScaleY(this.f83524s);
        this.f83506a.setPivotX(0.0f);
        this.f83506a.setPivotY(0.0f);
        this.f83506a.setTranslationX((float) i);
        this.f83506a.setTranslationY((float) i2);
        setBackgroundColor(this.f83527v << 24);
        if (VERSION.SDK_INT >= 21) {
            this.f83506a.invalidateOutline();
        }
    }

    public DragView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m103831g();
    }

    /* renamed from: a */
    private void m103822a(int i, int i2, int i3, int i4, float f) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        this.f83511f = getWidth();
        this.f83510e = getHeight();
        this.f83512g = 0;
        this.f83513h = 0;
        this.f83515j = i - iArr[0];
        this.f83514i = i2 - iArr[1];
        if ((((float) this.f83510e) * 1.0f) / ((float) this.f83511f) > f) {
            this.f83514i = (int) (((float) (i2 - iArr[1])) - ((((float) i4) - (((float) i3) * f)) / 2.0f));
        }
        this.f83525t = ((float) i3) / ((float) this.f83511f);
        this.f83526u = ((float) i4) / ((float) this.f83510e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82818a(float f, float f2, float f3, float f4, float f5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f83523r = (f * floatValue) + this.f83525t;
        this.f83524s = (f2 * floatValue) + this.f83526u;
        this.f83527v = (int) (f3 * floatValue);
        int i = (int) ((f4 * floatValue) + ((float) this.f83515j));
        int i2 = (int) ((f5 * floatValue) + ((float) this.f83514i));
        if (!this.f83530y) {
            i2 = (int) (((float) i2) - ((1.0f - floatValue) * ((float) C10994a.m32204a(this.f83516k.getContext()))));
        }
        this.f83507b = this.f83517l.f83541e * (1.0f - floatValue);
        m103821a(i, i2);
        if (this.f83509d != null) {
            this.f83509d.mo80761a(valueAnimator);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82817a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f83523r = (f * floatValue) + f2;
        this.f83524s = (f3 * floatValue) + f4;
        this.f83527v = (int) (f5 * floatValue);
        m103821a((int) ((f6 * floatValue) + f7), (int) ((f8 * floatValue) + f9));
    }
}
