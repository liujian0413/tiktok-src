package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.C1343ah;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.music.model.MusicTag;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchMusicTagAdapter */
public final class SearchMusicTagAdapter extends C1262a<SearchMusicTagViewHolder> {

    /* renamed from: a */
    public int[] f69722a = new int[2];

    /* renamed from: b */
    public final RecyclerView f69723b;

    /* renamed from: c */
    private final List<MusicTag> f69724c = new ArrayList();

    /* renamed from: d */
    private final OnClickListener f69725d;

    public final int getItemCount() {
        return this.f69724c.size();
    }

    /* renamed from: a */
    public final int[] mo68050a() {
        Integer num;
        int i;
        View view;
        int[] iArr = new int[2];
        C1273i layoutManager = this.f69723b.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                num = Integer.valueOf(linearLayoutManager.mo5446k());
            } else {
                num = null;
            }
            int i2 = 0;
            iArr[0] = num.intValue();
            C1343ah a = C1343ah.m6625a(linearLayoutManager, 0);
            int size = this.f69724c.size();
            int c = a.mo6268c();
            int d = a.mo6270d();
            if (size > 0) {
                i = 1;
            } else {
                i = 0;
            }
            while (i2 != size) {
                RecyclerView recyclerView = this.f69723b;
                if (recyclerView != null) {
                    view = recyclerView.getChildAt(i2);
                } else {
                    view = null;
                }
                if (view == null) {
                    return iArr;
                }
                int a2 = a.mo6263a(view);
                int b = a.mo6267b(view);
                if (a2 >= d || b <= c || a2 < c || b > d) {
                    i2 += i;
                } else {
                    iArr[1] = a2;
                    return iArr;
                }
            }
            return iArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: a */
    public final void mo68049a(int[] iArr) {
        C7573i.m23587b(iArr, "<set-?>");
        this.f69722a = iArr;
    }

    /* renamed from: a */
    public final void mo68048a(List<MusicTag> list) {
        C7573i.m23587b(list, "musicTags");
        this.f69722a = new int[2];
        this.f69724c.clear();
        this.f69724c.addAll(list);
        notifyDataSetChanged();
        C1273i layoutManager = this.f69723b.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo5437e(0);
        }
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m87019a(viewGroup, i);
    }

    public SearchMusicTagAdapter(OnClickListener onClickListener, RecyclerView recyclerView) {
        C7573i.m23587b(onClickListener, "onClickListener");
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f69725d = onClickListener;
        this.f69723b = recyclerView;
    }

    /* renamed from: a */
    private static SearchMusicTagViewHolder m87019a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2n, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new SearchMusicTagViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(SearchMusicTagViewHolder searchMusicTagViewHolder, int i) {
        C7573i.m23587b(searchMusicTagViewHolder, "holder");
        MusicTag musicTag = (MusicTag) this.f69724c.get(i);
        searchMusicTagViewHolder.itemView.setOnClickListener(this.f69725d);
        searchMusicTagViewHolder.mo68051a(musicTag);
    }
}
