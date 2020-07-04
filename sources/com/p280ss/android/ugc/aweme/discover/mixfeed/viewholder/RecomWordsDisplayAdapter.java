package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26740a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.C37388a;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collections;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.RecomWordsDisplayAdapter */
public final class RecomWordsDisplayAdapter extends C1262a<RecomWordItemViewHolder> {

    /* renamed from: a */
    public C26740a f70565a;

    /* renamed from: b */
    public List<Word> f70566b;

    /* renamed from: c */
    public boolean f70567c;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.RecomWordsDisplayAdapter$a */
    public static final class C26759a extends C27009an {

        /* renamed from: a */
        final /* synthetic */ RecomWordsDisplayAdapter f70568a;

        /* renamed from: b */
        final /* synthetic */ String f70569b;

        /* renamed from: c */
        final /* synthetic */ RecomWordItemViewHolder f70570c;

        /* renamed from: d */
        final /* synthetic */ Word f70571d;

        /* renamed from: e */
        final /* synthetic */ int f70572e;

        /* renamed from: b */
        public final void mo67959b(View view, MotionEvent motionEvent) {
            C7573i.m23587b(view, "view");
            C7573i.m23587b(motionEvent, "event");
            C26612d.f70187a.mo68302a(3);
            SearchResultParam enterFrom = new SearchResultParam().setSearchFrom(4).setKeyword(this.f70569b).setEnterFrom("click_recom");
            C37385g gVar = C37385g.f97617a;
            View view2 = this.f70570c.itemView;
            C7573i.m23582a((Object) view2, "holder.itemView");
            Context context = view2.getContext();
            C7573i.m23582a((Object) enterFrom, "param");
            C37388a aVar = new C37388a(context, enterFrom, null, null, null, null, 60, null);
            gVar.launchSearchPage(aVar);
            C26774b.m87921b(this.f70571d, this.f70572e, this.f70568a.f70565a);
        }

        C26759a(RecomWordsDisplayAdapter recomWordsDisplayAdapter, String str, RecomWordItemViewHolder recomWordItemViewHolder, Word word, int i) {
            this.f70568a = recomWordsDisplayAdapter;
            this.f70569b = str;
            this.f70570c = recomWordItemViewHolder;
            this.f70571d = word;
            this.f70572e = i;
        }
    }

    public final int getItemCount() {
        return this.f70566b.size();
    }

    public RecomWordsDisplayAdapter() {
        List<Word> emptyList = Collections.emptyList();
        C7573i.m23582a((Object) emptyList, "Collections.emptyList()");
        this.f70566b = emptyList;
    }

    /* renamed from: a */
    public final void mo68505a(List<Word> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f70566b = list;
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m87833a(viewGroup, i);
    }

    /* renamed from: a */
    private static RecomWordItemViewHolder m87833a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm, viewGroup, false);
        C7573i.m23582a((Object) inflate, "this");
        LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            View rootView = inflate.getRootView();
            C7573i.m23582a((Object) rootView, "rootView");
            marginLayoutParams.topMargin = (int) C9738o.m28708b(rootView.getContext(), 12.0f);
            marginLayoutParams.height += marginLayoutParams.topMargin;
            inflate.setLayoutParams(marginLayoutParams);
            return new RecomWordItemViewHolder(inflate);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(RecomWordItemViewHolder recomWordItemViewHolder, int i) {
        C7573i.m23587b(recomWordItemViewHolder, "holder");
        Word word = (Word) this.f70566b.get(i);
        if (this.f70567c) {
            C26774b.m87920a(word, i, this.f70565a);
        }
        String word2 = word.getWord();
        recomWordItemViewHolder.f70564a.setText(word2);
        TextView textView = recomWordItemViewHolder.f70564a;
        View view = recomWordItemViewHolder.itemView;
        C7573i.m23582a((Object) view, "holder.itemView");
        textView.setMaxWidth((int) C9738o.m28708b(view.getContext(), 328.0f));
        recomWordItemViewHolder.f70564a.setSingleLine(true);
        recomWordItemViewHolder.f70564a.setEllipsize(TruncateAt.END);
        View view2 = recomWordItemViewHolder.itemView;
        C26759a aVar = new C26759a(this, word2, recomWordItemViewHolder, word, i);
        view2.setOnTouchListener(aVar);
    }
}
