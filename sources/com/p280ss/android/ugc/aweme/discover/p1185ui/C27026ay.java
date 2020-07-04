package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.music.NewSearchMusicViewHolder;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27022aw.C27024a;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ay */
public final class C27026ay extends C27022aw<List<Music>> {

    /* renamed from: h */
    private List<Object> f71317h = new LinkedList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69796a() {
        int i;
        super.mo69796a();
        DmtTextView dmtTextView = this.f71310c;
        if (C6399b.m19947w()) {
            i = R.string.cht;
        } else {
            i = R.string.cgm;
        }
        dmtTextView.setText(i);
        if (!C6399b.m19944t()) {
            this.f71311d.setText(R.string.hv);
        }
    }

    /* renamed from: a */
    public final void mo69744a(List<Music> list, SearchResultParam searchResultParam, boolean z) {
        super.mo69744a(list, searchResultParam, z);
        this.f71313f.removeAllViews();
        this.f71317h.clear();
        if (C6399b.m19945u()) {
            for (Music music : list) {
                NewSearchMusicViewHolder a = NewSearchMusicViewHolder.m87152a((ViewGroup) this.f71309b, searchResultParam.getKeyword(), null);
                a.mo68116a(music, searchResultParam.getKeyword());
                a.mo67896a(new C26501r(true));
                a.mo68117a("general_search");
                this.f71313f.addView(a.mo67902d());
                this.f71317h.add(a);
            }
            return;
        }
        for (Music music2 : list) {
            SearchMusicViewHolder a2 = SearchMusicViewHolder.m87031a((ViewGroup) this.f71309b, searchResultParam.getKeyword(), null, null);
            a2.mo68053a(music2, searchResultParam.getKeyword());
            a2.mo67896a(new C26501r(true));
            a2.mo68054a("general_search");
            this.f71313f.addView(a2.mo67902d());
            this.f71317h.add(a2);
        }
    }

    public C27026ay(View view, Context context, boolean z, C27024a aVar) {
        super(view, context, aVar);
        if (z) {
            this.f71311d.setText(R.string.fpn);
        }
    }
}
