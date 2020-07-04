package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.support.p029v7.widget.RecyclerView;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23848a.C23849a;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23851c;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23852d;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.p1093a.C24003a;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.p1093a.C24004b;
import com.p280ss.android.ugc.aweme.discover.base.MultiTypeAdapter;
import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicSearchHistoryAdapter */
public final class MusicSearchHistoryAdapter extends MultiTypeAdapter<MusicSearchHistory> implements C23849a {

    /* renamed from: a */
    public static final C23834a f62938a = new C23834a(null);

    /* renamed from: b */
    private boolean f62939b;

    /* renamed from: c */
    private RecyclerView f62940c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicSearchHistoryAdapter$a */
    public static final class C23834a {
        private C23834a() {
        }

        public /* synthetic */ C23834a(C7571f fVar) {
            this();
        }
    }

    public MusicSearchHistoryAdapter(boolean z) {
        mo68272a(new C24004b(z));
        mo68272a(new C24003a(z));
        this.f62939b = z;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f62940c = recyclerView;
        if (this.f62939b) {
            C23851c.m78120c().mo61928a((C23849a) this);
        } else {
            C23852d.m78123c().mo61928a((C23849a) this);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f62940c = null;
        if (this.f62939b) {
            C23851c.m78120c().mo61931b((C23849a) this);
        } else {
            C23852d.m78123c().mo61931b((C23849a) this);
        }
    }

    /* renamed from: a */
    public final void mo61897a(List<MusicSearchHistory> list) {
        C7573i.m23587b(list, "searchHistory");
        this.f70134h.clear();
        for (MusicSearchHistory add : list) {
            this.f70134h.add(add);
            if (this.f70134h.size() >= 10) {
                break;
            }
        }
        if (this.f70134h.size() == 0) {
            RecyclerView recyclerView = this.f62940c;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        } else if (this.f70134h.size() >= 3) {
            this.f70134h.add(new MusicSearchHistory("", Integer.MAX_VALUE));
        }
        notifyDataSetChanged();
    }
}
