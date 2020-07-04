package com.p280ss.android.ugc.aweme.discover.delegate;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.C26376b;
import com.p280ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.a */
public final class C26615a extends C25647a<List<DiscoverItemData>> {

    /* renamed from: a */
    public boolean f70194a = true;

    /* renamed from: b */
    public C26376b f70195b;

    /* renamed from: c */
    private DiscoverBannerViewHolder f70196c;

    /* renamed from: b */
    public final void mo66519b(C1293v vVar) {
        ((DiscoverBannerViewHolder) vVar).mo67950a(false);
    }

    /* renamed from: a */
    public final void mo66517a(C1293v vVar) {
        if (this.f70194a) {
            ((DiscoverBannerViewHolder) vVar).mo67950a(true);
        }
    }

    /* renamed from: b */
    public final void mo68314b(boolean z) {
        if (!(this.f70194a == z || this.f70196c == null)) {
            this.f70196c.mo67951b(z);
        }
        this.f70194a = z;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.up, viewGroup, false);
        if (this.f70195b != null) {
            this.f70195b.mo67924a(inflate);
        }
        if (this.f70196c == null) {
            this.f70196c = new DiscoverBannerViewHolder(inflate);
        }
        return this.f70196c;
    }

    /* renamed from: a */
    public final void mo68313a(boolean z) {
        if (this.f70196c != null) {
            this.f70196c.mo67950a(z);
        }
    }

    /* renamed from: a */
    private static boolean m87417a(List<DiscoverItemData> list, int i) {
        if (((DiscoverItemData) list.get(i)).getType() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87417a((List) obj, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo62252a(List<DiscoverItemData> list, int i, C1293v vVar, List<Object> list2) {
        DiscoverItemData discoverItemData = (DiscoverItemData) list.get(i);
        DiscoverBannerViewHolder discoverBannerViewHolder = (DiscoverBannerViewHolder) vVar;
        discoverBannerViewHolder.mo67952c(this.f70194a);
        discoverBannerViewHolder.mo67949a(discoverItemData.getBannerList(), true);
    }
}
