package com.bytedance.android.livesdk.chatroom.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.livesdk.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class VolumeControlView extends View {

    /* renamed from: a */
    int f15652a;

    /* renamed from: b */
    int f15653b;

    /* renamed from: c */
    public int f15654c;

    /* renamed from: d */
    public int f15655d;

    /* renamed from: e */
    public int f15656e;

    /* renamed from: f */
    public C5370a f15657f;

    /* renamed from: g */
    public ValueAnimator f15658g;

    /* renamed from: h */
    public volatile Handler f15659h;

    /* renamed from: i */
    private Paint f15660i;

    /* renamed from: j */
    private Context f15661j;

    /* renamed from: k */
    private AudioManager f15662k;

    /* renamed from: l */
    private int f15663l;

    /* renamed from: m */
    private int f15664m;

    /* renamed from: n */
    private float f15665n;

    /* renamed from: o */
    private boolean f15666o;

    /* renamed from: p */
    private HandlerThread f15667p;

    /* renamed from: q */
    private Handler f15668q;

    /* renamed from: com.bytedance.android.livesdk.chatroom.view.VolumeControlView$a */
    public interface C5370a {
    }

    /* renamed from: d */
    private void m17106d() {
        this.f15656e = this.f15662k.getStreamVolume(3);
    }

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    /* renamed from: c */
    private void m17105c() {
        this.f15660i = new Paint();
        this.f15660i.setAntiAlias(true);
        this.f15660i.setColor(this.f15664m);
        this.f15660i.setStyle(Style.FILL);
        this.f15660i.setStrokeWidth(2.0f);
    }

    /* renamed from: a */
    public final void mo13651a() {
        if (this.f15667p == null) {
            this.f15667p = new HandlerThread("Audio-Api-Thread");
            this.f15667p.start();
            this.f15659h = new Handler(this.f15667p.getLooper());
        }
        if (this.f15662k == null) {
            this.f15659h.post(new Runnable() {
                public final void run() {
                    VolumeControlView.this.mo13652b();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo13652b() {
        this.f15662k = (AudioManager) this.f15661j.getSystemService("audio");
        this.f15654c = this.f15662k.getStreamMaxVolume(3);
        this.f15655d = this.f15654c / 15;
        if (this.f15655d == 0) {
            this.f15655d = 1;
        }
        m17106d();
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                VolumeControlView.this.mo13651a();
            }
        });
        return duration;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f15658g != null) {
            this.f15658g.removeAllListeners();
            this.f15658g.cancel();
            this.f15658g = null;
        }
        this.f15657f = null;
        if (this.f15667p != null) {
            this.f15667p.quit();
            this.f15667p = null;
            this.f15659h = null;
        }
    }

    public void setOnAudioControlViewHideListener(C5370a aVar) {
        this.f15657f = aVar;
    }

    public VolumeControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setForegroundColor(int i) {
        this.f15664m = i;
        this.f15660i.setColor(this.f15664m);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15666o) {
            canvas.drawLine((float) this.f15652a, (float) (this.f15653b / 2), ((float) this.f15652a) - (((float) this.f15652a) * this.f15665n), (float) (this.f15653b / 2), this.f15660i);
            return;
        }
        canvas.drawLine(0.0f, (float) (this.f15653b / 2), ((float) this.f15652a) * this.f15665n, (float) (this.f15653b / 2), this.f15660i);
    }

    public VolumeControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f15652a = getMeasuredWidth();
        this.f15653b = getMeasuredHeight();
        boolean z = true;
        if (C0991u.m4220h(this) != 1) {
            z = false;
        }
        this.f15666o = z;
    }

    public VolumeControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15668q = new Handler(Looper.getMainLooper());
        this.f15661j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_VolumeControlView);
        this.f15663l = obtainStyledAttributes.getColor(0, C0683b.m2912c(context, R.color.aqn));
        this.f15664m = obtainStyledAttributes.getColor(1, C0683b.m2912c(context, R.color.aqm));
        obtainStyledAttributes.recycle();
        m17105c();
    }
}
