package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.music.model.MusicTag;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa */
public final class C26475aa {

    /* renamed from: a */
    public static final C26475aa f69840a = new C26475aa();

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa$a */
    public static final class C26476a implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f69841a;

        /* renamed from: b */
        final /* synthetic */ Context f69842b;

        /* renamed from: c */
        final /* synthetic */ OnClickListener f69843c;

        /* renamed from: d */
        final /* synthetic */ List f69844d;

        public final void onViewDetachedFromWindow(View view) {
            RecyclerView recyclerView = this.f69841a;
            if (recyclerView != null) {
                C1262a adapter = recyclerView.getAdapter();
                if (adapter != null && (adapter instanceof SearchMusicTagAdapter)) {
                    SearchMusicTagAdapter searchMusicTagAdapter = (SearchMusicTagAdapter) adapter;
                    searchMusicTagAdapter.mo68049a(searchMusicTagAdapter.mo68050a());
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            int[] iArr = new int[2];
            RecyclerView recyclerView = this.f69841a;
            if (recyclerView != null) {
                C1262a adapter = recyclerView.getAdapter();
                if (adapter != null && (adapter instanceof SearchMusicTagAdapter)) {
                    iArr = ((SearchMusicTagAdapter) adapter).f69722a;
                }
            }
            RecyclerView recyclerView2 = this.f69841a;
            if (recyclerView2 != null) {
                C1273i layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
                    ((LinearLayoutManager) layoutManager).mo5417a(iArr[0], iArr[1]);
                }
            }
        }

        C26476a(RecyclerView recyclerView, Context context, OnClickListener onClickListener, List list) {
            this.f69841a = recyclerView;
            this.f69842b = context;
            this.f69843c = onClickListener;
            this.f69844d = list;
        }
    }

    private C26475aa() {
    }

    /* renamed from: a */
    public static void m87143a(Context context, RecyclerView recyclerView, List<MusicTag> list, OnClickListener onClickListener) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(list, "musicTags");
        C7573i.m23587b(onClickListener, "onClickListener");
        if (!C6399b.m19945u() && recyclerView != null) {
            recyclerView.setVisibility(0);
            if (recyclerView.getAdapter() == null) {
                SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1 searchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1 = new SearchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1(context, 0, false, recyclerView, context, onClickListener, list);
                recyclerView.setLayoutManager(searchMusicTagProcessor$addMusicTags$$inlined$let$lambda$1);
                recyclerView.setAdapter(new SearchMusicTagAdapter(onClickListener, recyclerView));
                if (C43127fh.m136806a(context)) {
                    recyclerView.addOnAttachStateChangeListener(new C26476a(recyclerView, context, onClickListener, list));
                }
            }
            if (recyclerView.getAdapter() != null) {
                C1262a adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    ((SearchMusicTagAdapter) adapter).mo68048a(list);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchMusicTagAdapter");
                }
            }
        }
    }
}
