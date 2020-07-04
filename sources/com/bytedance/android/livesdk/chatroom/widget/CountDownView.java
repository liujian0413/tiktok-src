package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.livesdk.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class CountDownView extends FrameLayout {

    /* renamed from: a */
    public Animation f16879a;

    /* renamed from: b */
    public TextView f16880b;

    /* renamed from: c */
    public C5763a f16881c;

    /* renamed from: d */
    private int f16882d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.CountDownView$a */
    public interface C5763a {
        /* renamed from: a */
        void mo13602a();
    }

    /* renamed from: a */
    public final void mo14194a() {
        C57601 r0 = new CountDownTimer((long) this.f16882d, 1000) {
            public final void onFinish() {
                CountDownView.this.post(new Runnable() {
                    public final void run() {
                        ViewGroup viewGroup = (ViewGroup) CountDownView.this.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(CountDownView.this);
                        }
                    }
                });
                if (CountDownView.this.f16881c != null) {
                    CountDownView.this.f16881c.mo13602a();
                }
            }

            public final void onTick(long j) {
                long j2 = j / 1000;
                CountDownView.this.f16880b.setText(String.valueOf(j2));
                if (j2 < 2) {
                    CountDownView.this.f16879a.setAnimationListener(new AnimationListener() {
                        public final void onAnimationRepeat(Animation animation) {
                        }

                        public final void onAnimationStart(Animation animation) {
                        }

                        public final void onAnimationEnd(Animation animation) {
                            CountDownView.this.setVisibility(8);
                        }
                    });
                }
                CountDownView.this.f16879a.reset();
                CountDownView.this.f16880b.startAnimation(CountDownView.this.f16879a);
            }
        };
        r0.start();
    }

    public void setCountDownListener(C5763a aVar) {
        this.f16881c = aVar;
    }

    public CountDownView(Context context) {
        super(context);
        m18128a(null, 0);
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18128a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m18128a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CountDownView, i, 0);
        this.f16882d = obtainStyledAttributes.getInteger(0, 4000);
        obtainStyledAttributes.recycle();
        Context context = getContext();
        this.f16880b = new TextView(getContext());
        this.f16880b.setTextColor(getResources().getColor(R.color.aft));
        this.f16880b.setTextSize(60.0f);
        this.f16880b.setGravity(17);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f16880b, layoutParams);
        this.f16879a = AnimationUtils.loadAnimation(context, R.anim.cx);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18128a(attributeSet, i);
    }
}
