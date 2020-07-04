package com.p280ss.android.ugc.aweme.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.views.DmtLoadingDialog */
public class DmtLoadingDialog extends Dialog {

    /* renamed from: a */
    public Unbinder f112238a;

    /* renamed from: b */
    private String f112239b;
    DmtTextView mContent;
    LinearLayout mMainLayout;
    ProgressBar mProgressbar;

    public void dismiss() {
        C43362c.m137645a(this);
        ObjectAnimator.ofFloat(this.mMainLayout, "alpha", new float[]{this.mMainLayout.getAlpha(), 0.0f}).setDuration(300).addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (DmtLoadingDialog.this.f112238a != null) {
                    DmtLoadingDialog.this.f112238a.unbind();
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
        this.f112238a = ButterKnife.bind((Dialog) this);
        this.mProgressbar.getIndeterminateDrawable().setColorFilter(C0683b.m2912c(getContext(), R.color.zg), Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
        if (!TextUtils.isEmpty(this.f112239b)) {
            C9738o.m28704a((TextView) this.mContent, (CharSequence) this.f112239b);
        }
    }

    public DmtLoadingDialog(Context context, String str) {
        this(context);
        this.f112239b = str;
    }
}
