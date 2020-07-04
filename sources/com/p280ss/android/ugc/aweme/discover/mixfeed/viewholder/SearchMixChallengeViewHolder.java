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
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26583j;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27022aw.C27024a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27025ax;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27029ba;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixChallengeViewHolder */
public class SearchMixChallengeViewHolder extends AbsSearchViewHolder {

    /* renamed from: c */
    C27025ax f70575c;

    /* renamed from: d */
    public List<SearchChallenge> f70576d;

    /* renamed from: d */
    public final View mo67902d() {
        if (this.f70575c != null) {
            return this.f70575c.mo69798b();
        }
        return null;
    }

    /* renamed from: a */
    public static SearchMixChallengeViewHolder m87841a(ViewGroup viewGroup) {
        return m87842a(viewGroup, false);
    }

    /* renamed from: a */
    private static SearchMixChallengeViewHolder m87842a(ViewGroup viewGroup, boolean z) {
        View view;
        if (!(viewGroup.getContext() instanceof C23149d) || !C6399b.m19944t() || !C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_search_mix, viewGroup, false);
        } else {
            view = ((C23149d) viewGroup.getContext()).getInflater().mo60290a(R.layout.layout_search_mix);
        }
        return new SearchMixChallengeViewHolder(view, viewGroup.getContext(), false);
    }

    /* renamed from: a */
    public final void mo68508a(List<SearchChallenge> list, SearchResultParam searchResultParam, boolean z) {
        if (this.f70575c != null) {
            this.f70575c.mo69744a(list, searchResultParam, z);
        }
        this.f70576d = list;
    }

    private SearchMixChallengeViewHolder(View view, Context context, boolean z) {
        super(view);
        this.f70575c = new C27025ax(view, context, z, new C27024a() {
            /* renamed from: a */
            public final void mo68509a() {
                C6907h.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(C6869c.m21381a().mo16887a("search_type", "challenge").mo16888b()));
                if (C6399b.m19944t()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("token_type", "hot_challenge");
                    hashMap.put("aladin_button_type", "click_more_button");
                    if (SearchMixChallengeViewHolder.this.f70576d != null && SearchMixChallengeViewHolder.this.f70576d.size() > 0) {
                        SearchChallenge searchChallenge = (SearchChallenge) SearchMixChallengeViewHolder.this.f70576d.get(0);
                        hashMap.put("search_result_id", searchChallenge.getChallenge().getCid());
                        hashMap.put("hashtags_name", searchChallenge.getChallenge().getChallengeName());
                    }
                    SearchMixChallengeViewHolder.this.mo67900b((Map<String, String>) hashMap);
                }
                C42961az.m136380a(new C26583j(C27029ba.f71324f));
            }
        });
        View findViewById = view.findViewById(R.id.b54);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) C9738o.m28708b(context, 16.0f);
        layoutParams.rightMargin = (int) C9738o.m28708b(context, 16.0f);
        findViewById.setLayoutParams(layoutParams);
        if (this.f70575c.f71310c != null) {
            this.f70575c.f71310c.setFontType(C10834d.f29337g);
        }
    }
}
