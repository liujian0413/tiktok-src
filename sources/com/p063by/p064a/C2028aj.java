package com.p063by.p064a;

import android.content.Context;
import android.view.C1444a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p063by.inflate_lib.C2060b;
import com.p280ss.android.ugc.aweme.policy.notice.p1478ui.PolicyNoticeToast;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.by.a.aj */
public final class C2028aj implements C2060b {
    /* renamed from: a */
    public final View mo7712a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        PolicyNoticeToast policyNoticeToast = new PolicyNoticeToast(context);
        LayoutParams a = C1444a.m7241a(viewGroup, -1, -2);
        policyNoticeToast.setId(R.id.ci0);
        if (LinearLayout.LayoutParams.class.isInstance(a)) {
            ((LinearLayout.LayoutParams) a).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a)) {
            ((FrameLayout.LayoutParams) a).gravity = 80;
        }
        policyNoticeToast.setVisibility(8);
        if (viewGroup != null) {
            policyNoticeToast.setLayoutParams(a);
            if (z) {
                viewGroup.addView(policyNoticeToast);
            }
        }
        C1444a.m7242a(policyNoticeToast);
        return policyNoticeToast;
    }
}
