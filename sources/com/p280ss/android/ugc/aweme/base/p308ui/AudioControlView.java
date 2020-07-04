package com.p280ss.android.ugc.aweme.base.p308ui;

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
import android.os.Message;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView */
public class AudioControlView extends View {

    /* renamed from: a */
    int f61631a;

    /* renamed from: b */
    int f61632b;

    /* renamed from: c */
    public C23407b f61633c;

    /* renamed from: d */
    public ValueAnimator f61634d;

    /* renamed from: e */
    private Paint f61635e;

    /* renamed from: f */
    private int f61636f;

    /* renamed from: g */
    private float f61637g;

    /* renamed from: h */
    private boolean f61638h;

    /* renamed from: i */
    private HandlerThread f61639i;

    /* renamed from: j */
    private C23406a f61640j;

    /* renamed from: k */
    private volatile boolean f61641k;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView$a */
    static class C23406a extends Handler {

        /* renamed from: a */
        public boolean f61644a;

        /* renamed from: b */
        private final WeakReference<AudioControlView> f61645b;

        /* renamed from: c */
        private AudioManager f61646c;

        /* renamed from: d */
        private int f61647d;

        /* renamed from: e */
        private int f61648e;

        /* renamed from: f */
        private int f61649f;

        /* renamed from: f */
        private void m76768f() {
            m76770h();
            m76769g();
        }

        /* renamed from: g */
        private void m76769g() {
            C1592h.m7855a((Callable<TResult>) new C23441a<TResult>(this), C1592h.f5958b);
        }

        /* renamed from: h */
        private void m76770h() {
            try {
                this.f61646c.setStreamVolume(3, this.f61649f, 8);
            } catch (SecurityException e) {
                C6921a.m21559a((Throwable) e);
            }
        }

        /* renamed from: b */
        private void m76764b() {
            this.f61647d = this.f61646c.getStreamMaxVolume(3);
            this.f61648e = this.f61647d / 15;
            if (this.f61648e == 0) {
                this.f61648e = 1;
            }
            m76765c();
        }

        /* renamed from: c */
        private void m76765c() {
            try {
                this.f61649f = this.f61646c.getStreamVolume(3);
            } catch (NullPointerException e) {
                C6921a.m21559a((Throwable) e);
                this.f61644a = true;
            }
        }

        /* renamed from: d */
        private void m76766d() {
            m76765c();
            this.f61649f += this.f61648e;
            if (this.f61649f > this.f61647d) {
                this.f61649f = this.f61647d;
            }
            m76768f();
        }

        /* renamed from: e */
        private void m76767e() {
            m76765c();
            this.f61649f -= this.f61648e;
            if (this.f61649f < 0) {
                this.f61649f = 0;
            }
            m76768f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo60890a() throws Exception {
            AudioControlView audioControlView = (AudioControlView) this.f61645b.get();
            if (audioControlView != null) {
                audioControlView.setProgress(((float) this.f61649f) / ((float) this.f61647d));
                audioControlView.mo60875d();
            }
            return null;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    m76764b();
                    return;
                case 2:
                    m76766d();
                    return;
                case 3:
                    m76767e();
                    break;
            }
        }

        private C23406a(Looper looper, AudioControlView audioControlView) {
            super(looper);
            this.f61645b = new WeakReference<>(audioControlView);
            this.f61646c = (AudioManager) audioControlView.getContext().getSystemService("audio");
            sendEmptyMessage(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.AudioControlView$b */
    public interface C23407b {
        /* renamed from: a */
        void mo60892a();

        /* renamed from: b */
        void mo60893b();
    }

    /* renamed from: e */
    public final void mo60877e() {
        this.f61633c = null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f61641k = false;
    }

    /* renamed from: b */
    public final void mo60873b() {
        mo60872a();
        this.f61640j.sendEmptyMessage(3);
    }

    /* renamed from: c */
    public final void mo60874c() {
        mo60872a();
        this.f61640j.sendEmptyMessage(2);
    }

    /* renamed from: d */
    public final void mo60875d() {
        if (!this.f61641k) {
            invalidate();
            m76757i();
        }
    }

    /* renamed from: f */
    public final boolean mo60878f() {
        if (this.f61640j != null) {
            return this.f61640j.f61644a;
        }
        return false;
    }

    /* renamed from: h */
    private void m76756h() {
        if (this.f61634d != null) {
            this.f61634d.removeAllListeners();
            this.f61634d.cancel();
            this.f61634d = null;
        }
    }

    public ObjectAnimator getHideVolumeAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76756h();
        this.f61633c = null;
        if (this.f61639i != null) {
            this.f61639i.quit();
            this.f61639i = null;
            this.f61640j = null;
        }
        this.f61641k = true;
    }

    /* renamed from: g */
    private void m76755g() {
        this.f61635e = new Paint();
        this.f61635e.setAntiAlias(true);
        this.f61635e.setColor(this.f61636f);
        this.f61635e.setStyle(Style.FILL);
        this.f61635e.setStrokeWidth(2.0f);
    }

    /* renamed from: i */
    private void m76757i() {
        m76756h();
        if (this.f61633c != null) {
            this.f61633c.mo60893b();
        }
        this.f61634d = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f61634d.setDuration(1400);
        this.f61634d.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (AudioControlView.this.f61633c != null) {
                    AudioControlView.this.f61633c.mo60892a();
                    AudioControlView.this.f61634d = null;
                }
            }
        });
        this.f61634d.start();
    }

    /* renamed from: a */
    public final void mo60872a() {
        if (this.f61639i == null) {
            this.f61639i = new HandlerThread("Audio-Api-Thread");
            this.f61639i.start();
            this.f61640j = new C23406a(this.f61639i.getLooper(), this);
        }
    }

    public ObjectAnimator getShowVolumeAnim() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                AudioControlView.this.mo60872a();
            }
        });
        return duration;
    }

    public void setOnAudioControlViewHideListener(C23407b bVar) {
        this.f61633c = bVar;
    }

    public void setProgress(float f) {
        this.f61637g = f;
    }

    public AudioControlView(Context context) {
        this(context, null);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setForegroundColor(int i) {
        this.f61636f = i;
        this.f61635e.setColor(this.f61636f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f61638h) {
            canvas.drawLine((float) this.f61631a, (float) (this.f61632b / 2), ((float) this.f61631a) - (((float) this.f61631a) * this.f61637g), (float) (this.f61632b / 2), this.f61635e);
            return;
        }
        canvas.drawLine(0.0f, (float) (this.f61632b / 2), ((float) this.f61631a) * this.f61637g, (float) (this.f61632b / 2), this.f61635e);
    }

    public AudioControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f61631a = getMeasuredWidth();
        this.f61632b = getMeasuredHeight();
        boolean z = true;
        if (C0991u.m4220h(this) != 1) {
            z = false;
        }
        this.f61638h = z;
    }

    public AudioControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioControlView);
        this.f61636f = obtainStyledAttributes.getColor(1, C0683b.m2912c(context, R.color.a5e));
        obtainStyledAttributes.recycle();
        m76755g();
    }
}
