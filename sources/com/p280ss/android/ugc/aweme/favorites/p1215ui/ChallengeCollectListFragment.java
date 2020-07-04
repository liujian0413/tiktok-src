package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.favorites.adapter.CollectChallengeAdapter;
import com.p280ss.android.ugc.aweme.favorites.model.C27761a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.ChallengeCollectListFragment */
public class ChallengeCollectListFragment extends BaseCollectListFragment {
    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: t */
    public final void mo71270t() {
        mo71265o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo71263m() {
        if (this.f73219i != null) {
            this.f73219i.mo66536a(new C27761a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final BaseAdapter mo71264n() {
        return new CollectChallengeAdapter(getActivity());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo71261g() {
        if (this.f73219i != null) {
            this.f73219i.mo56976a(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo71262i() {
        if (this.f73219i != null) {
            this.f73219i.mo56976a(Integer.valueOf(4));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final View mo71268r() {
        if (getActivity() == null) {
            return null;
        }
        if (!C6399b.m19944t() || getActivity() == null) {
            return super.mo71268r();
        }
        C10805b bVar = new C10806a(getActivity()).mo25990b((int) R.string.b4l).mo25993c(R.string.b4k).mo25985a((int) R.drawable.ax0).f29135a;
        MtEmptyView a = MtEmptyView.m31657a(getContext());
        a.setStatus(bVar);
        return a;
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v1/challenge/listcollection/?")) {
            C42961az.m136385f(aVar);
            mo71261g();
        }
    }
}
