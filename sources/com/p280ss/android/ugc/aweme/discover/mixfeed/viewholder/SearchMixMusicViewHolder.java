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
import com.p280ss.android.ugc.aweme.discover.p1176b.C26583j;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27022aw.C27024a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27026ay;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27029ba;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMusicViewHolder */
public class SearchMixMusicViewHolder extends AbsSearchViewHolder {

    /* renamed from: c */
    C27026ay f70578c;

    /* renamed from: d */
    public final View mo67902d() {
        if (this.f70578c != null) {
            return this.f70578c.mo69798b();
        }
        return null;
    }

    /* renamed from: a */
    public static SearchMixMusicViewHolder m87846a(ViewGroup viewGroup) {
        return m87847a(viewGroup, false);
    }

    /* renamed from: a */
    private static SearchMixMusicViewHolder m87847a(ViewGroup viewGroup, boolean z) {
        View view;
        if (!(viewGroup.getContext() instanceof C23149d) || !C6399b.m19944t() || !C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_search_mix, viewGroup, false);
        } else {
            view = ((C23149d) viewGroup.getContext()).getInflater().mo60290a(R.layout.layout_search_mix);
        }
        return new SearchMixMusicViewHolder(view, viewGroup.getContext(), false);
    }

    /* renamed from: a */
    public final void mo68510a(List<Music> list, SearchResultParam searchResultParam, boolean z) {
        if (this.f70578c != null) {
            this.f70578c.mo69744a(list, searchResultParam, z);
        }
    }

    private SearchMixMusicViewHolder(View view, Context context, boolean z) {
        super(view);
        this.f70578c = new C27026ay(view, context, z, new C27024a() {
            /* renamed from: a */
            public final void mo68509a() {
                C6907h.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(C6869c.m21381a().mo16887a("search_type", "music").mo16888b()));
                C42961az.m136380a(new C26583j(C27029ba.f71323e));
            }
        });
        View findViewById = view.findViewById(R.id.b54);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) C9738o.m28708b(context, 16.0f);
        layoutParams.rightMargin = (int) C9738o.m28708b(context, 16.0f);
        findViewById.setLayoutParams(layoutParams);
        if (this.f70578c.f71310c != null) {
            this.f70578c.f71310c.setFontType(C10834d.f29337g);
        }
    }
}
