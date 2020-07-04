package com.p280ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
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
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.common.widget.DragView */
public class DragView extends FrameLayout implements OnGlobalLayoutListener {

    /* renamed from: A */
    private long f67694A = 250;

    /* renamed from: a */
    public View f67695a;

    /* renamed from: b */
    public IViewInfo f67696b;

    /* renamed from: c */
    public float f67697c = 1.0f;

    /* renamed from: d */
    public float f67698d = 1.0f;

    /* renamed from: e */
    public float f67699e = 6.0f;

    /* renamed from: f */
    public float f67700f = 0.3f;

    /* renamed from: g */
    public float f67701g = 0.3f;

    /* renamed from: h */
    public int f67702h = NormalGiftView.ALPHA_255;

    /* renamed from: i */
    public boolean f67703i;

    /* renamed from: j */
    public int f67704j = 10;

    /* renamed from: k */
    public C25730a f67705k;

    /* renamed from: l */
    int f67706l;

    /* renamed from: m */
    int f67707m;

    /* renamed from: n */
    int f67708n;

    /* renamed from: o */
    int f67709o;

    /* renamed from: p */
    int f67710p;

    /* renamed from: q */
    int f67711q;

    /* renamed from: r */
    private int f67712r = -1;

    /* renamed from: s */
    private int f67713s = -1;

    /* renamed from: t */
    private float f67714t;

    /* renamed from: u */
    private float f67715u;

    /* renamed from: v */
    private float f67716v;

    /* renamed from: w */
    private float f67717w;

    /* renamed from: x */
    private int f67718x;

    /* renamed from: y */
    private int f67719y;

    /* renamed from: z */
    private int f67720z = 120;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.DragView$IViewInfo */
    public static class IViewInfo implements Parcelable {
        public static final Creator<IViewInfo> CREATOR = new Creator<IViewInfo>() {
            /* renamed from: a */
            private static IViewInfo[] m84506a(int i) {
                return new IViewInfo[i];
            }

            /* renamed from: a */
            private static IViewInfo m84505a(Parcel parcel) {
                return new IViewInfo(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m84505a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m84506a(i);
            }
        };

        /* renamed from: a */
        public int f67758a;

        /* renamed from: b */
        public int f67759b;

        /* renamed from: c */
        public int f67760c;

        /* renamed from: d */
        public int f67761d;

        /* renamed from: e */
        public float f67762e;

        /* renamed from: f */
        public float f67763f;

        public int describeContents() {
            return 0;
        }

        protected IViewInfo(Parcel parcel) {
            this.f67762e = 0.5f;
            this.f67763f = 1.0f;
            this.f67758a = parcel.readInt();
            this.f67759b = parcel.readInt();
            this.f67760c = parcel.readInt();
            this.f67761d = parcel.readInt();
            this.f67762e = parcel.readFloat();
            this.f67763f = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f67758a);
            parcel.writeInt(this.f67759b);
            parcel.writeInt(this.f67760c);
            parcel.writeInt(this.f67761d);
            parcel.writeFloat(this.f67762e);
            parcel.writeFloat(this.f67763f);
        }

        public IViewInfo(int i, int i2, int i3, int i4, float f) {
            this(i, i2, i3, i4, f, ((float) i3) / ((float) i4));
        }

        public IViewInfo(int i, int i2, int i3, int i4, float f, float f2) {
            this.f67762e = 0.5f;
            this.f67763f = 1.0f;
            this.f67758a = i;
            this.f67759b = i2;
            this.f67760c = i4;
            this.f67761d = i3;
            this.f67762e = f;
            this.f67763f = f2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.DragView$a */
    public interface C25730a {
        /* renamed from: a */
        void mo66665a();

        /* renamed from: b */
        void mo66666b();

        /* renamed from: c */
        void mo66667c();

        /* renamed from: d */
        void mo66668d();

        /* renamed from: e */
        void mo66669e();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.DragView$b */
    public interface C25731b {
        /* renamed from: a */
        void mo66670a(float f, float f2, float f3, float f4);
    }

    /* renamed from: c */
    private static boolean m84496c() {
        if (C6405d.m19984g() == null || (C6405d.m19984g().getWindow().getAttributes().flags & PreloadTask.BYTE_UNIT_NUMBER) != 1024) {
            return false;
        }
        return true;
    }

    public void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        postDelayed(new Runnable() {
            public final void run() {
                if (DragView.this.f67695a != null) {
                    DragView.this.mo66642b();
                }
            }
        }, 50);
    }

    /* renamed from: d */
    private void m84497d() {
        if (this.f67716v <= ((float) this.f67720z) && this.f67698d > this.f67701g + 0.01f && this.f67697c > this.f67700f + 0.01f) {
            m84498e();
        } else if (this.f67696b == null) {
            m84499f();
        } else {
            mo66639a();
        }
    }

    /* renamed from: g */
    private void m84500g() {
        if (this.f67696b != null) {
            m84492a(this.f67696b.f67758a, this.f67696b.f67759b, this.f67696b.f67760c, this.f67696b.f67761d, this.f67696b.f67763f);
            this.f67704j = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        }
    }

    /* renamed from: e */
    private void m84498e() {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f67694A);
        final float f = 1.0f - this.f67697c;
        final float f2 = this.f67697c;
        final float f3 = 1.0f - this.f67698d;
        final float f4 = this.f67698d;
        LayoutParams layoutParams = (LayoutParams) this.f67695a.getLayoutParams();
        int i = layoutParams.topMargin;
        final float f5 = (float) (i - this.f67709o);
        final float f6 = (float) (layoutParams.leftMargin - this.f67708n);
        final int i2 = this.f67702h;
        final int i3 = 255 - this.f67702h;
        C257245 r3 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 1.0f - floatValue;
                DragView.this.f67697c = (f * f) + f2;
                DragView.this.f67698d = (f3 * f) + f4;
                DragView.this.f67702h = ((int) (f * ((float) i3))) + i2;
                DragView.this.mo66640a((int) ((f6 * floatValue) + ((float) DragView.this.f67708n)), (int) ((floatValue * f5) + ((float) DragView.this.f67709o)));
            }
        };
        duration.addUpdateListener(r3);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (DragView.this.f67705k != null) {
                    DragView.this.f67705k.mo66667c();
                }
            }
        });
        duration.setInterpolator(new AccelerateInterpolator());
        duration.start();
    }

    /* renamed from: f */
    private void m84499f() {
        final float f = this.f67697c * 0.9f;
        final float f2 = this.f67698d * 0.9f;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f67694A);
        final float f3 = this.f67697c - f;
        final float f4 = this.f67697c - f2;
        final float f5 = (float) this.f67702h;
        LayoutParams layoutParams = (LayoutParams) this.f67695a.getLayoutParams();
        int i = layoutParams.topMargin;
        final float width = (((float) getWidth()) - (((float) this.f67707m) * f)) / 2.0f;
        final float height = (((float) getHeight()) - (((float) this.f67706l) * f2)) / 2.0f;
        final float f6 = ((float) layoutParams.leftMargin) - width;
        final float f7 = ((float) i) - height;
        C257289 r2 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragView.this.f67697c = (f3 * floatValue) + f;
                DragView.this.f67698d = (f4 * floatValue) + f2;
                DragView.this.f67702h = (int) (f5 * floatValue);
                DragView.this.mo66640a((int) ((f6 * floatValue) + width), (int) ((f7 * floatValue) + height));
            }
        };
        duration.addUpdateListener(r2);
        duration.start();
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DragView.this.f67705k.mo66669e();
            }
        });
    }

    /* renamed from: b */
    public final void mo66642b() {
        m84500g();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(this.f67694A);
        final float f = 1.0f - this.f67700f;
        final float f2 = 1.0f - this.f67701g;
        final float f3 = (float) (this.f67708n - this.f67711q);
        final float f4 = (float) (this.f67709o - this.f67710p);
        C257267 r3 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragView.this.f67697c = (f * floatValue) + DragView.this.f67700f;
                DragView.this.f67698d = (f2 * floatValue) + DragView.this.f67701g;
                DragView.this.f67702h = (int) (255.0f * floatValue);
                DragView.this.f67699e = DragView.this.f67696b.f67762e * (1.0f - floatValue);
                DragView.this.mo66640a(DragView.this.f67711q + ((int) (f3 * floatValue)), DragView.this.f67710p + ((int) (floatValue * f4)));
            }
        };
        duration.addUpdateListener(r3);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (DragView.this.f67705k != null) {
                    DragView.this.f67705k.mo66667c();
                }
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DragView.this.f67695a.setVisibility(0);
                if (DragView.this.f67705k != null) {
                    DragView.this.f67705k.mo66665a();
                }
            }
        });
        duration.start();
    }

    /* renamed from: a */
    public final void mo66639a() {
        this.f67703i = m84496c();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f67694A);
        final float f = this.f67697c - this.f67700f;
        final float f2 = this.f67698d - this.f67701g;
        final float f3 = (float) this.f67702h;
        LayoutParams layoutParams = (LayoutParams) this.f67695a.getLayoutParams();
        int i = layoutParams.leftMargin;
        final int i2 = i - this.f67696b.f67758a;
        final int i3 = layoutParams.topMargin - this.f67696b.f67759b;
        final int d = C23482j.m77101d();
        C257223 r3 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragView.this.f67697c = (f * floatValue) + DragView.this.f67700f;
                DragView.this.f67698d = (f2 * floatValue) + DragView.this.f67701g;
                DragView.this.f67702h = (int) (f3 * floatValue);
                int i = (int) ((((float) i2) * floatValue) + ((float) DragView.this.f67696b.f67758a));
                int i2 = (int) ((((float) i3) * floatValue) + ((float) DragView.this.f67696b.f67759b));
                if (!DragView.this.f67703i) {
                    i2 = (int) (((float) i2) - ((1.0f - floatValue) * ((float) d)));
                }
                DragView.this.f67699e = DragView.this.f67696b.f67762e * (1.0f - floatValue);
                DragView.this.mo66640a(i, i2);
            }
        };
        duration.addUpdateListener(r3);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DragView.this.f67695a.setVisibility(8);
                DragView.this.f67705k.mo66669e();
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (DragView.this.f67705k != null) {
                    DragView.this.f67705k.mo66666b();
                }
            }
        });
        duration.start();
    }

    public void setAnimatorDuration(int i) {
        this.f67694A = (long) i;
    }

    public void setDragStateListener(C25730a aVar) {
        this.f67705k = aVar;
    }

    public void setDragThreshold(int i) {
        this.f67720z = i;
    }

    /* renamed from: b */
    private void m84494b(MotionEvent motionEvent) {
        this.f67714t = motionEvent.getX();
        this.f67715u = motionEvent.getY();
    }

    public DragView(Context context) {
        super(context);
        setBackgroundColor(-16777216);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (motionEvent.getActionMasked() == 5 && this.f67713s == 0) {
            this.f67712r = 2;
        }
        this.f67713s = motionEvent.getActionMasked();
        if (this.f67695a.getScaleX() == 1.0f && pointerId == 0 && this.f67712r != 2) {
            int action = motionEvent.getAction();
            if (action == 0) {
                m84494b(motionEvent);
            } else if (action == 2 && (this.f67712r == 1 || m84493a(motionEvent))) {
                m84495c(motionEvent);
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.f67712r = -1;
            if (Math.abs(this.f67716v) > ((float) this.f67704j) || Math.abs(this.f67717w) > ((float) this.f67704j)) {
                m84497d();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private boolean m84493a(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX() - this.f67714t;
        float y = motionEvent.getY() - this.f67715u;
        if (Math.abs(y) <= ((float) this.f67704j) && Math.abs(x) <= ((float) this.f67704j)) {
            return false;
        }
        if (Math.abs(x) < Math.abs(y)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f67712r != 1) {
                this.f67714t = motionEvent.getX();
                this.f67715u = motionEvent.getY();
            }
            this.f67712r = 1;
        } else {
            this.f67712r = 0;
        }
        return z;
    }

    /* renamed from: c */
    private void m84495c(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        this.f67717w = motionEvent.getX() - this.f67714t;
        this.f67716v = y - this.f67715u;
        float f = this.f67716v / ((float) this.f67720z);
        if (this.f67697c >= this.f67700f && this.f67697c <= 1.0f) {
            this.f67697c = 1.0f - ((1.0f - this.f67700f) * f);
        }
        if (this.f67698d >= this.f67701g && this.f67698d <= 1.0f) {
            this.f67698d = 1.0f - ((1.0f - this.f67701g) * f);
        }
        this.f67702h = (int) ((1.0f - f) * 255.0f);
        if (this.f67702h > 255) {
            this.f67702h = NormalGiftView.ALPHA_255;
        } else if (this.f67702h <= 153) {
            this.f67702h = 153;
        }
        if (this.f67697c < this.f67700f) {
            this.f67697c = this.f67700f;
        } else if (this.f67697c > 1.0f) {
            this.f67697c = 1.0f;
        }
        if (this.f67698d < this.f67701g) {
            this.f67698d = this.f67701g;
        } else if (this.f67698d > 1.0f) {
            this.f67698d = 1.0f;
        }
        int i = (int) (this.f67717w + (this.f67714t * (1.0f - this.f67697c)) + (((float) this.f67708n) * this.f67697c));
        int i2 = (int) (this.f67716v + (this.f67715u * (1.0f - this.f67698d)) + (((float) this.f67709o) * this.f67698d));
        if (this.f67705k != null) {
            this.f67705k.mo66668d();
        }
        mo66640a(i, i2);
    }

    public DragView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(-16777216);
    }

    /* renamed from: a */
    public final void mo66640a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f67695a.getLayoutParams();
        layoutParams.width = (int) (((float) this.f67707m) * this.f67697c);
        layoutParams.height = (int) (((float) this.f67706l) * this.f67698d);
        layoutParams.topMargin = i2;
        layoutParams.leftMargin = i;
        if (this.f67695a instanceof C25731b) {
            ((C25731b) this.f67695a).mo66670a((float) layoutParams.width, (float) layoutParams.height, (float) layoutParams.leftMargin, (float) layoutParams.topMargin);
        }
        this.f67695a.setLayoutParams(layoutParams);
        setBackgroundColor(this.f67702h << 24);
        if (VERSION.SDK_INT >= 21) {
            this.f67695a.invalidateOutline();
        }
    }

    /* renamed from: a */
    public final void mo66641a(View view, IViewInfo iViewInfo) {
        if (view != null && iViewInfo != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            LayoutParams layoutParams = new LayoutParams(iViewInfo.f67760c, iViewInfo.f67761d);
            layoutParams.leftMargin = iViewInfo.f67758a;
            layoutParams.topMargin = iViewInfo.f67759b;
            this.f67695a = view;
            this.f67696b = iViewInfo;
            this.f67699e = iViewInfo.f67762e;
            if (VERSION.SDK_INT >= 21) {
                this.f67695a.setOutlineProvider(new ViewOutlineProvider() {
                    public final void getOutline(View view, Outline outline) {
                        Outline outline2 = outline;
                        outline2.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.max(DragView.this.f67699e, 0.5f));
                    }
                });
                this.f67695a.setClipToOutline(true);
                this.f67695a.setVisibility(4);
            }
            addView(this.f67695a, layoutParams);
            this.f67702h = 0;
            setBackgroundColor(this.f67702h << 24);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f67718x = i;
        this.f67719y = i2;
        m84500g();
    }

    /* renamed from: a */
    private void m84492a(int i, int i2, int i3, int i4, float f) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        if (((float) getHeight()) / ((float) getWidth()) > f) {
            this.f67706l = (int) (((float) getWidth()) * f);
            this.f67707m = getWidth();
            this.f67708n = 0;
            this.f67709o = (getHeight() - this.f67706l) / 2;
        } else {
            this.f67706l = getHeight();
            this.f67707m = (int) (((float) getHeight()) / f);
            this.f67708n = (getWidth() - this.f67707m) / 2;
            this.f67709o = 0;
        }
        this.f67710p = i2 - iArr[1];
        this.f67711q = i - iArr[0];
        this.f67700f = ((float) i3) / ((float) this.f67707m);
        this.f67701g = ((float) i4) / ((float) this.f67706l);
    }
}
