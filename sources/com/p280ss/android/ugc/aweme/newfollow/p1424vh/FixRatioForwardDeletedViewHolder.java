package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardTextViewHolder;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FixRatioForwardDeletedViewHolder */
public class FixRatioForwardDeletedViewHolder extends ForwardTextViewHolder {
    /* renamed from: E */
    public final void mo76008E() {
    }

    /* renamed from: s */
    public final boolean mo76041s() {
        return true;
    }

    /* renamed from: z */
    public final void mo76050z() {
        this.f78599y.setVisibility(8);
    }

    /* renamed from: x */
    public final void mo76048x() {
        mo76009H();
        mo76007C();
        mo76008E();
    }

    /* renamed from: L */
    public final List<String> mo76013L() {
        ArrayList arrayList = new ArrayList();
        if (!C28482e.m93606a(this.f78552F) && C43122ff.m136762a(this.f78552F)) {
            arrayList.add(mo75888b().getString(R.string.fll));
        }
        return arrayList;
    }

    /* renamed from: H */
    public final void mo76009H() {
        if (this.f78595u != null) {
            if (C21740a.m72687c(this.f78552F)) {
                this.f78595u.setImageResource(R.drawable.auv);
            } else {
                this.f78595u.setImageResource(R.drawable.a8t);
            }
        }
        if (this.f78596v != null) {
            this.f78596v.setVisibility(0);
            this.f78596v.setTextSize(1, 13.0f);
            if (C21740a.m72687c(this.f78552F)) {
                this.f78596v.setText(R.string.c_z);
                return;
            }
            this.f78596v.setText(R.string.foy);
        }
    }

    /* renamed from: c */
    public final void mo76029c(View view) {
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
        viewStub4.setLayoutResource(R.layout.a6r);
        mo76017a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub5.setLayoutResource(R.layout.a6f);
        mo76018a(viewStub5.inflate(), 16.0f, 20.0f);
    }

    public FixRatioForwardDeletedViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        super(followFeedLayout, bVar, jVar, eVar, aVar);
        this.f78597w.setDisplayType(C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8));
    }
}
