package com.p280ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.p280ss.android.ugc.aweme.commercialize.feed.p1126a.C24705a;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29961b;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.card.a */
public final class C33374a implements C24705a {

    /* renamed from: a */
    private MicroAppVideoCardView f87205a;

    /* renamed from: b */
    private View f87206b;

    /* renamed from: c */
    private Context f87207c;

    /* renamed from: d */
    private String f87208d;

    /* renamed from: b */
    public final void mo64651b() {
        this.f87206b.setVisibility(0);
        this.f87205a.mo20984b();
    }

    /* renamed from: a */
    public final void mo64650a() {
        int i;
        if (this.f87205a != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f87205a.getLayoutParams();
            if (C21085a.m71117a().f56622i) {
                i = C21085a.m71117a().mo56926b();
            } else {
                i = 0;
            }
            int a = C29961b.m98232a(this.f87207c, 58.0f) - i;
            if (C21085a.m71129c()) {
                a += C21085a.f56610a;
            }
            marginLayoutParams.bottomMargin = a;
            this.f87205a.setLayoutParams(marginLayoutParams);
        }
    }

    public C33374a(View view, String str) {
        this.f87207c = view.getContext();
        this.f87206b = view.findViewById(R.id.jh);
        this.f87205a = (MicroAppVideoCardView) view.findViewById(R.id.byn);
        this.f87208d = str;
    }
}
