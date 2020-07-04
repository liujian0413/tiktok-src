package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21337n;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.LoginButton */
public class LoginButton extends AutoRTLButton implements C21337n {

    /* renamed from: b */
    private int f58422b;

    /* renamed from: c */
    private int f58423c;

    /* renamed from: d */
    private boolean f58424d;

    /* renamed from: a */
    public final void mo57357a() {
        setEnabled(true);
        this.f58424d = false;
    }

    /* renamed from: Z_ */
    public final void mo57356Z_() {
        setBackgroundResource(this.f58423c);
        m72945d();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo57357a();
        animate().cancel();
    }

    /* renamed from: d */
    private void m72945d() {
        this.f58424d = true;
        setEnabled(false);
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new C21872i(this)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo58202b() {
        if (this.f58424d) {
            m72945d();
            return;
        }
        animate().cancel();
        animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
        setBackgroundResource(this.f58422b);
    }

    public void setLoadingBackground(int i) {
        this.f58423c = i;
    }

    public LoginButton(Context context) {
        this(context, null);
    }

    public void setLoginBackgroundRes(int i) {
        this.f58422b = i;
        setBackgroundResource(this.f58422b);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58422b = R.drawable.oi;
        this.f58423c = R.drawable.b0o;
        setBackgroundResource(this.f58422b);
        setOnTouchListener(new C34032a(0.5f, 150, null));
    }
}
