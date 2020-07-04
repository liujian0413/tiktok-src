package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.p1492b;

import android.view.View;
import android.widget.RelativeLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.UserProfileV2Fragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a.b.c */
public final class C36589c extends C36587b {

    /* renamed from: b */
    private RelativeLayout f96002b;

    /* renamed from: a */
    public final int mo92798a() {
        return R.layout.rt;
    }

    /* renamed from: b */
    public final void mo92806b() {
        RelativeLayout relativeLayout = this.f96002b;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(0.0f);
        }
        RelativeLayout relativeLayout2 = this.f96002b;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(4);
        }
    }

    public C36589c(UserProfileV2Fragment userProfileV2Fragment) {
        C7573i.m23587b(userProfileV2Fragment, "owner");
        super(userProfileV2Fragment);
    }

    /* renamed from: a */
    public final void mo92799a(float f) {
        RelativeLayout relativeLayout = this.f96002b;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void mo92801a(View view) {
        RelativeLayout relativeLayout;
        super.mo92801a(view);
        if (view != null) {
            relativeLayout = (RelativeLayout) view.findViewById(R.id.cv7);
        } else {
            relativeLayout = null;
        }
        this.f96002b = relativeLayout;
    }

    /* renamed from: a */
    public final void mo92804a(boolean z) {
        int i;
        RelativeLayout relativeLayout = this.f96002b;
        if (relativeLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            relativeLayout.setVisibility(i);
        }
    }
}
