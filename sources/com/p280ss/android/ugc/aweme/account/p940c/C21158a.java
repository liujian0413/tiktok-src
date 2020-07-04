package com.p280ss.android.ugc.aweme.account.p940c;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.c.a */
public final class C21158a extends Dialog {

    /* renamed from: a */
    public boolean f56828a;

    /* renamed from: b */
    public final Activity f56829b;

    /* renamed from: c */
    private DmtStatusView f56830c;

    public final void onBackPressed() {
        if (this.f56828a) {
            super.onBackPressed();
        }
    }

    public final void show() {
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                C7573i.m23580a();
            }
            if (!ownerActivity.isFinishing()) {
                super.show();
                this.f56830c.mo25942f();
            }
        }
    }

    public final void dismiss() {
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                C7573i.m23580a();
            }
            if (!ownerActivity.isFinishing()) {
                C21159b.m71299a(this);
                this.f56830c.mo25938c(true);
            }
        }
    }

    public C21158a(Activity activity, View view) {
        C7573i.m23587b(activity, "context");
        super(activity, R.style.v);
        this.f56829b = activity;
        setOwnerActivity(this.f56829b);
        setContentView(R.layout.k4);
        ButterKnife.bind((Dialog) this);
        View findViewById = findViewById(R.id.dav);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.status_view)");
        this.f56830c = (DmtStatusView) findViewById;
        C10803a a = C10803a.m31631a(getContext());
        a.mo25960a(view);
        this.f56830c.setBuilder(a);
    }
}
