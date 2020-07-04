package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.StatedButton */
public class StatedButton extends AutoRTLImageView {

    /* renamed from: a */
    public int f96262a;

    /* renamed from: b */
    public boolean f96263b;

    /* renamed from: c */
    private int f96264c;

    /* renamed from: c */
    public final void mo92994c() {
        this.f96263b = false;
    }

    /* renamed from: a */
    public final void mo92992a() {
        setImageResource(this.f96264c);
        mo92993b();
    }

    /* renamed from: b */
    public final void mo92993b() {
        this.f96263b = true;
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {
            public final void run() {
                if (StatedButton.this.f96263b) {
                    StatedButton.this.mo92993b();
                    return;
                }
                StatedButton.this.animate().cancel();
                StatedButton.this.animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
                StatedButton.this.setImageResource(StatedButton.this.f96262a);
            }
        }).start();
    }

    public void setLoadingBackground(int i) {
        this.f96264c = i;
    }

    public StatedButton(Context context) {
        this(context, null);
    }

    public void setLoginBackgroundRes(int i) {
        this.f96262a = i;
        setImageResource(this.f96262a);
    }

    public StatedButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatedButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f96262a = R.drawable.arb;
        this.f96264c = R.drawable.arc;
        setImageResource(this.f96262a);
    }
}
