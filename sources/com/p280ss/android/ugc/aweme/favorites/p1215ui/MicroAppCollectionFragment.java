package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.favorites.adapter.CollectMicroAppsAdapter;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33365a;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33369c;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33369c.C33370a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.MicroAppCollectionFragment */
public final class MicroAppCollectionFragment extends BaseCollectListFragment implements C33370a {

    /* renamed from: j */
    private HashMap f73278j;

    /* renamed from: k */
    private void m91127k() {
        if (this.f73278j != null) {
            this.f73278j.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m91127k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo71263m() {
        C25674b bVar = this.f73219i;
        if (bVar != null) {
            bVar.mo66536a(new C33365a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final BaseAdapter<?> mo71264n() {
        return new CollectMicroAppsAdapter<>(getActivity());
    }

    public final void onDestroy() {
        C33369c.m107934b(this);
        super.onDestroy();
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
    /* renamed from: q */
    public final void mo71267q() {
        int i;
        super.mo71267q();
        Context context = getContext();
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                i = resources.getDimensionPixelSize(R.dimen.ip);
                this.mListView.setPadding(i, 0, i, 0);
            }
        }
        i = 0;
        this.mListView.setPadding(i, 0, i, 0);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33369c.m107933a(this);
    }
}
