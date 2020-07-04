package com.p280ss.android.ugc.aweme.setting.p337ui.widget;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.widget.StorageCleanLoadingDialog */
public final class StorageCleanLoadingDialog extends Dialog {
    public DmtStatusView mDmtStatusView;

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                C37933a.m121196a(this);
            } catch (Exception unused) {
            }
            DmtStatusView dmtStatusView = this.mDmtStatusView;
            if (dmtStatusView == null) {
                C7573i.m23583a("mDmtStatusView");
            }
            dmtStatusView.setVisibility(8);
        }
    }

    /* renamed from: a */
    private final void m121194a() {
        setContentView(R.layout.l7);
        ButterKnife.bind((Dialog) this);
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        dmtStatusView.setBuilder(C10803a.m31631a(getContext()));
    }

    public final void show() {
        if (!isShowing()) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity != null && !ownerActivity.isFinishing()) {
                super.show();
                DmtStatusView dmtStatusView = this.mDmtStatusView;
                if (dmtStatusView == null) {
                    C7573i.m23583a("mDmtStatusView");
                }
                dmtStatusView.mo25939d();
                DmtStatusView dmtStatusView2 = this.mDmtStatusView;
                if (dmtStatusView2 == null) {
                    C7573i.m23583a("mDmtStatusView");
                }
                dmtStatusView2.mo25942f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m121194a();
    }

    public StorageCleanLoadingDialog(Activity activity) {
        C7573i.m23587b(activity, "context");
        super(activity, R.style.v);
        setOwnerActivity(activity);
    }
}
