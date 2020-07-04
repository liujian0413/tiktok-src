package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.abtest.AsyncInflateSearchExperiment;
import com.p280ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26583j;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27022aw.C27024a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27029ba;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchMixUserCell;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixUserViewHolder */
public class SearchMixUserViewHolder extends AbsSearchViewHolder {

    /* renamed from: c */
    SearchMixUserCell f70588c;

    /* renamed from: d */
    public List<SearchUser> f70589d;

    /* renamed from: d */
    public final View mo67902d() {
        if (this.f70588c != null) {
            return this.f70588c.mo69798b();
        }
        return null;
    }

    /* renamed from: a */
    public static SearchMixUserViewHolder m87856a(ViewGroup viewGroup) {
        return m87857a(viewGroup, false);
    }

    /* renamed from: a */
    private static SearchMixUserViewHolder m87857a(ViewGroup viewGroup, boolean z) {
        View view;
        if (!(viewGroup.getContext() instanceof C23149d) || !C6399b.m19944t() || !C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_search_mix_for_user, viewGroup, false);
        } else {
            view = ((C23149d) viewGroup.getContext()).getInflater().mo60290a(R.layout.layout_search_mix_for_user);
        }
        return new SearchMixUserViewHolder(view, viewGroup.getContext(), false);
    }

    /* renamed from: a */
    public final void mo68516a(SearchMixUserData searchMixUserData, SearchResultParam searchResultParam, boolean z) {
        if (this.f70588c != null) {
            this.f70588c.mo69744a(searchMixUserData, searchResultParam, z);
        }
        this.f70589d = searchMixUserData.users;
    }

    private SearchMixUserViewHolder(View view, Context context, boolean z) {
        super(view);
        this.f70588c = new SearchMixUserCell(view, context, new C27024a() {
            /* renamed from: a */
            public final void mo68509a() {
                C6907h.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(C6869c.m21381a().mo16887a("search_type", "user").mo16888b()));
                if (C6399b.m19944t()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("token_type", "hot_user");
                    hashMap.put("aladin_button_type", "click_more_button");
                    if (SearchMixUserViewHolder.this.f70589d != null && SearchMixUserViewHolder.this.f70589d.size() > 0) {
                        SearchUser searchUser = (SearchUser) SearchMixUserViewHolder.this.f70589d.get(0);
                        hashMap.put("search_result_id", searchUser.user.getUid());
                        hashMap.put("user_name", searchUser.user.getUniqueId());
                    }
                    SearchMixUserViewHolder.this.mo67900b((Map<String, String>) hashMap);
                }
                C42961az.m136380a(new C26583j(C27029ba.f71321c));
            }
        }, this);
        this.f70588c.mo69746b(z);
        View findViewById = view.findViewById(R.id.b54);
        if (!z) {
            LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
            layoutParams.leftMargin = (int) C9738o.m28708b(context, 16.0f);
            layoutParams.rightMargin = (int) C9738o.m28708b(context, 16.0f);
            findViewById.setLayoutParams(layoutParams);
        } else if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        if (this.f70588c.f71310c != null) {
            this.f70588c.f71310c.setFontType(C10834d.f29337g);
        }
    }
}
