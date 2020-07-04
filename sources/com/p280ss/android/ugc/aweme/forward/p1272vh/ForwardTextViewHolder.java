package com.p280ss.android.ugc.aweme.forward.p1272vh;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29888h;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.ForwardTextViewHolder */
public class ForwardTextViewHolder extends BaseForwardViewHolder {

    /* renamed from: S */
    TextView f78635S;

    /* renamed from: T */
    ViewStub f78636T;

    /* renamed from: k */
    public final void mo58065k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo76045u() {
        super.mo76045u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo76011J() {
        if (VERSION.SDK_INT >= 21) {
            this.f78635S.setOutlineProvider(new C43070ds(this.f78635S.getResources().getDimensionPixelOffset(R.dimen.hf)));
            this.f78635S.setClipToOutline(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76016a(View view) {
        super.mo76016a(view);
        this.f78635S = (TextView) view.findViewById(R.id.dsf);
        this.f78636T = (ViewStub) view.findViewById(R.id.dc3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo76029c(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a6t);
        mo76017a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo76017a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a8n);
        mo76017a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub4.setLayoutResource(R.layout.a6d);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub5.setLayoutResource(R.layout.a6f);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc8);
        viewStub6.setLayoutResource(R.layout.a6p);
        mo76017a(viewStub6.inflate(), 12.0f);
    }

    public ForwardTextViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        super(followFeedLayout, bVar, eVar, aVar);
        this.f78560N = new C29888h(this, jVar);
    }
}
