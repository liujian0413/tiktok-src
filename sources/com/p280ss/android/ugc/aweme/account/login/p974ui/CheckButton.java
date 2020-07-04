package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.p280ss.android.ugc.aweme.p1416n.C34033b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.CheckButton */
public class CheckButton extends DmtButton {

    /* renamed from: b */
    public boolean f58387b;

    /* renamed from: d */
    public final void mo58186d() {
        this.f58387b = false;
    }

    /* renamed from: b */
    public final void mo58184b() {
        setBackgroundResource(R.drawable.b0o);
        mo58185c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo58186d();
        animate().cancel();
    }

    /* renamed from: c */
    public final void mo58185c() {
        this.f58387b = true;
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {
            public final void run() {
                if (CheckButton.this.f58387b) {
                    CheckButton.this.mo58185c();
                    return;
                }
                CheckButton.this.animate().cancel();
                CheckButton.this.animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
                CheckButton.this.setBackgroundResource(R.drawable.oh);
            }
        }).start();
    }

    public CheckButton(Context context) {
        this(context, null);
    }

    public CheckButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.oh);
        setOnTouchListener(new C34033b(1.2f, 100, null));
    }
}
