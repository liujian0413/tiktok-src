package com.p280ss.android.ugc.aweme.account.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.view.DmtLoadingDialog */
public class DmtLoadingDialog extends Dialog {

    /* renamed from: a */
    public Unbinder f59621a;
    @BindView(2131493274)
    LinearLayout mMainLayout;
    @BindView(2131493358)
    ProgressBar mProgressbar;

    public void dismiss() {
        C22359a.m74043a(this);
        ObjectAnimator.ofFloat(this.mMainLayout, "alpha", new float[]{this.mMainLayout.getAlpha(), 0.0f}).setDuration(300).addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (DmtLoadingDialog.this.f59621a != null) {
                    DmtLoadingDialog.this.f59621a.unbind();
                }
            }
        });
    }

    public void show() {
        super.show();
        ObjectAnimator.ofFloat(this.mMainLayout, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
    }

    public DmtLoadingDialog(Context context) {
        super(context, R.style.ga);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.jt);
        this.f59621a = ButterKnife.bind((Dialog) this);
        this.mProgressbar.getIndeterminateDrawable().setColorFilter(C0683b.m2912c(getContext(), R.color.zg), Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
    }
}
