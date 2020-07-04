package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.LiveDetailActivity;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FixRatioFollowVideoViewHolder */
public class FixRatioFollowVideoViewHolder extends FollowVideoViewHolder implements C34976f {
    /* renamed from: m */
    public final void mo68532m() {
    }

    /* renamed from: q */
    public final boolean mo75289q() {
        return true;
    }

    /* renamed from: w */
    public final void mo75295w() {
    }

    /* renamed from: C */
    public final void mo75227C() {
        this.f77508X.setVisibility(8);
    }

    /* renamed from: n */
    public final void mo68534n() {
        mo75229E();
        mo68531l();
        if (!mo75289q()) {
            mo75230F();
        }
        mo68532m();
    }

    /* renamed from: J */
    public final List<String> mo75234J() {
        ArrayList arrayList = new ArrayList();
        if (!C28482e.m93606a(this.f77546j) && C43122ff.m136762a(this.f77546j)) {
            arrayList.add(mo75261ab().getString(R.string.fll));
        }
        return arrayList;
    }

    /* renamed from: e */
    public final void mo68520e() {
        if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false)) {
            mo68521f();
        } else {
            super.mo68520e();
        }
    }

    /* renamed from: l */
    public final void mo68531l() {
        if (this.f77493I != null) {
            this.f77493I.setVisibility(0);
            this.f77493I.setTextSize(1, 13.0f);
            if (!C21740a.m72687c(this.f77546j) || this.f77493I == null) {
                this.f77493I.setText(R.string.foy);
            } else {
                this.f77493I.setText(R.string.c_z);
            }
        }
    }

    /* renamed from: f */
    public final void mo68521f() {
        super.mo68521f();
        if (C6384b.m19835a().mo15292a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", C6384b.m19835a().mo15295d().enable_live_in_follow_feed_full_screen, false)) {
            LiveDetailActivity.m86174b(mo75261ab(), this.f77546j.getAid(), mo75290r(), mo68523h(), this.f77546j.getEnterpriseType(), mo68524i(), mo75315am(), this.f77597az);
        } else {
            DetailActivity.m86053a(mo75261ab(), this.f77546j.getAid(), mo75290r(), mo68523h(), this.f77546j.getEnterpriseType(), mo68524i(), mo75315am(), this.f77597az);
        }
    }

    /* renamed from: a */
    public final void mo68500a(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a6t);
        mo75253a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo75253a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a6c);
        mo75253a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        viewStub4.setLayoutResource(R.layout.a6m);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub5.setLayoutResource(R.layout.a6r);
        mo75253a(viewStub5.inflate(), 16.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub6.setLayoutResource(R.layout.a6f);
        mo75254a(viewStub6.inflate(), 16.0f, 20.0f);
    }

    /* renamed from: a */
    public final void mo68503a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int[] iArr = new int[2];
        m110512a(C9738o.m28691a(mo75261ab()), C9738o.m28709b(mo75261ab()), C9738o.m28708b(mo75261ab(), 16.0f), ((float) i2) / ((float) i), iArr);
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view.setLayoutParams(layoutParams);
    }

    public FixRatioFollowVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        super(followFeedLayout, bVar, jVar, aVar, true);
    }

    /* renamed from: a */
    private static void m110512a(int i, int i2, float f, float f2, int[] iArr) {
        float f3 = ((float) i2) * 0.56f;
        if (f2 > 1.3333334f) {
            iArr[1] = (int) f3;
            iArr[0] = (int) (((float) iArr[1]) / 1.3333334f);
            int i3 = (int) ((((float) i) * 0.85f) - f);
            if (iArr[0] > i3) {
                iArr[0] = i3;
            }
        } else {
            iArr[0] = (int) (((float) i) - (f * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f2);
            if (((float) iArr[1]) > f3) {
                iArr[1] = (int) f3;
                iArr[0] = (int) (((float) iArr[1]) / f2);
            }
        }
    }
}
