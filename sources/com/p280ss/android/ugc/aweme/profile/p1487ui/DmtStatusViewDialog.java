package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.DmtStatusViewDialog */
public class DmtStatusViewDialog extends Dialog {
    DmtStatusView mDmtStatusView;

    /* renamed from: a */
    private void m116565a() {
        setContentView(R.layout.k4);
        ButterKnife.bind((Dialog) this);
        this.mDmtStatusView.setBuilder(C10803a.m31631a(getContext()));
    }

    public void show() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            super.show();
            if (this.mDmtStatusView != null) {
                this.mDmtStatusView.mo25942f();
            }
        }
    }

    public void dismiss() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            try {
                C36574u.m117990a(this);
            } catch (Exception unused) {
            }
            if (this.mDmtStatusView != null) {
                this.mDmtStatusView.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m116565a();
    }

    public DmtStatusViewDialog(Activity activity) {
        super(activity, R.style.v);
        setOwnerActivity(activity);
    }
}
