package com.p280ss.android.ugc.aweme.discover.delegate;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24891f;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.C37388a;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.f */
public final class C26620f extends C25647a<List<DiscoverItemData>> implements C27013b {

    /* renamed from: a */
    private Context f70199a;

    /* renamed from: b */
    private C0043i f70200b;

    public C26620f(C0043i iVar) {
        this.f70200b = iVar;
    }

    /* renamed from: a */
    public final C1293v mo62251a(ViewGroup viewGroup) {
        this.f70199a = viewGroup.getContext();
        return HotSearchImageViewHolder.m86827a(viewGroup, "hot_search_section_discovery", (C27013b) this, this.f70200b);
    }

    /* renamed from: a */
    private static boolean m87450a(List<DiscoverItemData> list, int i) {
        if (((DiscoverItemData) list.get(i)).getType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62253a(Object obj, int i) {
        return m87450a((List) obj, i);
    }

    /* renamed from: a */
    public final void mo68315a(HotSearchItem hotSearchItem, int i, String str) {
        String str2;
        if (this.f70199a != null && !TextUtils.isEmpty(hotSearchItem.getWord())) {
            SearchResultParam keyword = new SearchResultParam().setKeyword(hotSearchItem.getWord());
            if (hotSearchItem.getAdData() != null) {
                str2 = hotSearchItem.getAdData().getItemIdList();
            } else {
                str2 = "";
            }
            SearchResultParam openNewSearchContainer = keyword.setItemIdList(str2).setRealSearchWord(hotSearchItem.getRealSearchWord()).setSearchFrom(2).setEnterFrom(str).setAd(hotSearchItem.isAd()).setSource("hot_search_section").setOpenNewSearchContainer(!C6399b.m19944t());
            if (C26654b.m87575c()) {
                HotSpotDetailActivity.m87664a(this.f70199a, openNewSearchContainer);
                return;
            }
            C37385g gVar = C37385g.f97617a;
            C37388a aVar = new C37388a(this.f70199a, openNewSearchContainer, null, null, null, null);
            gVar.launchSearchPage(aVar);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62252a(Object obj, int i, C1293v vVar, List list) {
        m87449a((List) obj, i, vVar, list);
    }

    /* renamed from: a */
    private static void m87449a(List<DiscoverItemData> list, int i, C1293v vVar, List<Object> list2) {
        List list3 = ((DiscoverItemData) list.get(i)).getHotSearchResponse().getData().getList();
        if (vVar instanceof HotSearchImageViewHolder) {
            if (list2.size() <= 0 || !(list2.get(0) instanceof C24891f)) {
                ((HotSearchImageViewHolder) vVar).mo67965a(list3);
            } else {
                ((HotSearchImageViewHolder) vVar).mo67967c();
            }
        }
    }
}
