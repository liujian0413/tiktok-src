package com.bytedance.android.livesdk.gift.relay.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftRelayProgressBar extends FrameLayout implements C9302a {

    /* renamed from: a */
    public C8281a f22741a;

    /* renamed from: b */
    public int f22742b;

    /* renamed from: c */
    private ProgressBar f22743c;

    /* renamed from: d */
    private SimpleDraweeView f22744d;

    /* renamed from: e */
    private SimpleDraweeView f22745e;

    /* renamed from: f */
    private TextView f22746f;

    /* renamed from: g */
    private Handler f22747g;

    /* renamed from: com.bytedance.android.livesdk.gift.relay.view.GiftRelayProgressBar$a */
    public interface C8281a {
        /* renamed from: b */
        void mo13767b();

        /* renamed from: c */
        void mo13768c();

        /* renamed from: d */
        void mo13769d();
    }

    /* renamed from: a */
    private void m25299a() {
        LayoutInflater.from(getContext()).inflate(R.layout.ar5, this);
        this.f22743c = (ProgressBar) findViewById(R.id.arx);
        this.f22743c.setMax(1000);
        this.f22744d = (SimpleDraweeView) findViewById(R.id.cld);
        this.f22745e = (SimpleDraweeView) findViewById(R.id.clf);
        this.f22746f = (TextView) findViewById(R.id.ary);
        this.f22747g = new C9301a(Looper.getMainLooper(), this);
        this.f22744d.setController(((C13382e) C13380c.m39166a().mo32711a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_loading.webp").mo32751c(true)).mo32730f());
    }

    public void setmProgressBarListener(C8281a aVar) {
        this.f22741a = aVar;
    }

    public GiftRelayProgressBar(Context context) {
        this(context, null);
    }

    public void setProgressBarDrawable(Drawable drawable) {
        this.f22743c.setProgressDrawable(drawable);
    }

    public void setmProgressBarRank(String str) {
        this.f22746f.setText(str);
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (message != null && message.what == 4) {
            this.f22745e.setVisibility(8);
            setProgress(0);
            mo21427a(this.f22742b, 0);
            this.f22741a.mo13768c();
        }
    }

    /* renamed from: a */
    public final void mo21426a(int i) {
        this.f22745e.setVisibility(0);
        this.f22745e.setController(((C13382e) C13380c.m39166a().mo32711a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_sweep.webp").mo32751c(true)).mo32730f());
        this.f22747g.sendEmptyMessageDelayed(4, 500);
    }

    public void setProgress(int i) {
        if (i <= this.f22743c.getMax()) {
            this.f22743c.setProgress(i);
            int width = (this.f22743c.getWidth() - this.f22743c.getPaddingLeft()) - this.f22743c.getPaddingRight();
            int progress = width - ((int) (((float) width) * (1.0f - ((((float) this.f22743c.getProgress()) * 1.0f) / ((float) this.f22743c.getMax())))));
            LayoutParams layoutParams = (LayoutParams) this.f22744d.getLayoutParams();
            int left = ((this.f22743c.getLeft() + this.f22743c.getPaddingLeft()) + progress) - this.f22744d.getWidth();
            layoutParams.setMargins(left + 8, ((getHeight() - this.f22743c.getHeight()) / 2) - 2, ((getWidth() - left) - this.f22744d.getWidth()) - 8, ((getHeight() - this.f22743c.getHeight()) / 2) - 2);
            this.f22744d.setLayoutParams(layoutParams);
            if (i < 3) {
                this.f22744d.setVisibility(4);
            } else {
                this.f22744d.setVisibility(0);
            }
        }
    }

    public GiftRelayProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo21427a(int i, int i2) {
        final int i3;
        final int progress = this.f22743c.getProgress();
        if (i2 != 0) {
            i3 = this.f22743c.getMax();
        } else {
            i3 = i;
        }
        long j = (long) (((float) (i3 - progress)) * 3.0f);
        if (j < 0) {
            j = 0;
        }
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{0, 100}).setDuration(j);
        final int i4 = i2;
        final int i5 = i;
        C82801 r1 = new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue < 100) {
                    GiftRelayProgressBar.this.setProgress((int) (((float) progress) + (((float) (i3 - progress)) * (((float) intValue) / 100.0f))));
                } else if (i4 == 1) {
                    GiftRelayProgressBar.this.f22742b = i5;
                    GiftRelayProgressBar.this.mo21426a((int) VETransitionFilterParam.TransitionDuration_DEFAULT);
                    GiftRelayProgressBar.this.f22741a.mo13767b();
                } else if (i4 == 2) {
                    GiftRelayProgressBar.this.f22741a.mo13768c();
                    GiftRelayProgressBar.this.setProgress(0);
                    GiftRelayProgressBar.this.mo21427a(i5, 0);
                } else {
                    GiftRelayProgressBar.this.f22741a.mo13769d();
                }
            }
        };
        duration.addUpdateListener(r1);
        duration.start();
    }

    public GiftRelayProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22742b = 1;
        m25299a();
    }
}
