package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.favorites.adapter.CollectMediumAdapter;
import com.p280ss.android.ugc.aweme.favorites.model.C27764c;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediumCollectionFragment */
public final class MediumCollectionFragment extends BaseCollectListFragment {

    /* renamed from: j */
    private HashMap f73277j;

    /* renamed from: k */
    private void m91121k() {
        if (this.f73277j != null) {
            this.f73277j.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m91121k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final BaseAdapter<?> mo71264n() {
        return new CollectMediumAdapter<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo71263m() {
        C25674b bVar = this.f73219i;
        if (bVar != null) {
            bVar.mo66536a(new C27764c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo71261g() {
        C25674b bVar = this.f73219i;
        if (bVar != null) {
            bVar.mo56976a(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo71262i() {
        C25674b bVar = this.f73219i;
        if (bVar != null) {
            bVar.mo56976a(Integer.valueOf(4));
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
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C10805b bVar = new C10806a(activity).mo25988a("收藏的影视综艺").mo25991b("所有你收藏的影视综艺会出现在这里").mo25985a((int) R.drawable.ax0).f29135a;
        MtEmptyView a = MtEmptyView.m31657a(getContext());
        a.setStatus(bVar);
        return a;
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onJsBroadcastReceiver(C27994k kVar) {
        C7573i.m23587b(kVar, "broadCastEvent");
        if (TextUtils.equals("movieDetailStateChange", kVar.f73730b.getString("eventName"))) {
            mo71261g();
        }
    }
}
