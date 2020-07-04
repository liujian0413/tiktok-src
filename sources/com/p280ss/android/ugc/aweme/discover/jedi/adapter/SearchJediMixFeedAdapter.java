package com.p280ss.android.ugc.aweme.discover.jedi.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11554a.C11555a;
import com.bytedance.jedi.arch.ext.list.differ.C11561b;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.discover.abtest.AsyncInflateSearchExperiment;
import com.p280ss.android.ugc.aweme.discover.abtest.GeneralRelatedSearchCardStyle;
import com.p280ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.RelatedSearchWithImageViewHolder.C26421a;
import com.p280ss.android.ugc.aweme.discover.adapter.RelatedWordGridViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.RelatedWordGridViewHolder.C26429a;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchCustomViewHolder;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixChallengeViewHolder;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixMusicViewHolder;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixOperationViewHolder;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixOperationViewHolder.C26764a;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixUserViewHolder;
import com.p280ss.android.ugc.aweme.discover.model.SearchMixUserData;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.feed.adapter.RecommendCellBViewHolder;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter */
public final class SearchJediMixFeedAdapter extends BaseAdapter<C26754d> implements C11554a<C26754d> {

    /* renamed from: a */
    public static final C26717a f70421a = new C26717a(null);

    /* renamed from: b */
    private final C11561b<C26754d> f70422b;

    /* renamed from: c */
    private final RecyclerView f70423c;

    /* renamed from: d */
    private SearchResultParam f70424d;

    /* renamed from: e */
    private C23685d f70425e;

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter$a */
    public static final class C26717a {
        private C26717a() {
        }

        public /* synthetic */ C26717a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter$b */
    static final class C26718b implements Runnable {

        /* renamed from: a */
        public static final C26718b f70429a = new C26718b();

        C26718b() {
        }

        public final void run() {
            C26612d.m87397c();
        }
    }

    /* renamed from: a */
    public final void mo29136a(List<? extends C26754d> list, C7561a<C7581n> aVar) {
        C7573i.m23587b(list, "list");
    }

    public final C11561b<C26754d> aC_() {
        return this.f70422b;
    }

    public final int getItemCount() {
        return super.getItemCount();
    }

    /* renamed from: a */
    public final void mo68446a(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        this.f70424d = searchResultParam;
    }

    /* renamed from: a */
    public final void mo58045a(List<? extends C26754d> list) {
        super.mo58045a(list);
        if (list == null) {
            list = new ArrayList<>();
            mo66516d(false);
        }
        this.f67539l = list;
        notifyDataSetChanged();
    }

    public final void onViewDetachedFromWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof AnimatedViewHolder) {
            ((AnimatedViewHolder) vVar).mo66492a(false);
        }
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof AnimatedViewHolder) {
            ((AnimatedViewHolder) vVar).mo66492a(true);
        }
        if (vVar instanceof RecommendCellBViewHolder) {
            ((RecommendCellBViewHolder) vVar).mo71605o();
        }
        if (vVar instanceof SearchMixOperationViewHolder) {
            ((SearchMixOperationViewHolder) vVar).mo68513a(true);
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        C26754d dVar = (C26754d) this.f67539l.get(i);
        C7573i.m23582a((Object) dVar, "flowFeed");
        if (dVar.getFeedType() == 65280) {
            return 16;
        }
        if (dVar.getFeedType() == 65456) {
            return PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
        }
        if (dVar.getFeedType() == 65457) {
            return 112;
        }
        if (dVar.getFeedType() == 65467) {
            return 48;
        }
        if (dVar.getFeedType() == 65465) {
            return 144;
        }
        if (dVar.getFeedType() == 65459) {
            return 80;
        }
        if (dVar.getFeedType() == 65458) {
            return 96;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046 A[LOOP:0: B:1:0x0012->B:15:0x0046, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo68445a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "awemeId"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.util.List r0 = r5.f67539l
            java.lang.String r1 = "mItems"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0012:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0049
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.discover.mixfeed.d r3 = (com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d) r3
            java.lang.String r4 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            boolean r4 = r3.mo68495a()
            if (r4 == 0) goto L_0x0042
            r4 = r6
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.getAweme()
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r3.getAid()
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            if (r3 == 0) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x0042:
            r3 = 0
        L_0x0043:
            if (r3 == 0) goto L_0x0046
            return r2
        L_0x0046:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0049:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter.mo68445a(java.lang.String):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C26754d mo29135a(int i, boolean z) {
        return (C26754d) C11555a.m34005a((C11554a<T>) this, i, z);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        View view;
        C7573i.m23587b(viewGroup, "parent");
        if (i == 16) {
            if (!(viewGroup.getContext() instanceof C23149d) || !C6399b.m19944t() || !C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_video, viewGroup, false);
                C7573i.m23582a((Object) view, "LayoutInflater.from(pare…oLayout(), parent, false)");
            } else {
                Context context = viewGroup.getContext();
                if (context != null) {
                    view = ((C23149d) context).getInflater().mo60290a(R.layout.item_search_video);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
                }
            }
            RecommendCellBViewHolder recommendCellBViewHolder = new RecommendCellBViewHolder(view, "", this.f70425e, true);
            recommendCellBViewHolder.f74012e = true;
            return recommendCellBViewHolder;
        } else if (i == 48) {
            return C26764a.m87855a(viewGroup, false);
        } else {
            if (i != 80) {
                if (i == 96) {
                    SearchMixUserViewHolder a = SearchMixUserViewHolder.m87856a(viewGroup);
                    C7573i.m23582a((Object) a, "SearchMixUserViewHolder.create(parent)");
                    return a;
                } else if (i == 112) {
                    SearchMixMusicViewHolder a2 = SearchMixMusicViewHolder.m87846a(viewGroup);
                    C7573i.m23582a((Object) a2, "SearchMixMusicViewHolder.create(parent)");
                    return a2;
                } else if (i == 128) {
                    SearchMixChallengeViewHolder a3 = SearchMixChallengeViewHolder.m87841a(viewGroup);
                    C7573i.m23582a((Object) a3, "SearchMixChallengeViewHolder.create(parent)");
                    return a3;
                } else if (i != 144) {
                    return new SearchJediMixFeedAdapter$onCreateBasicViewHolder$1(viewGroup, new View(viewGroup.getContext()));
                } else {
                    return SearchCustomViewHolder.f70573c.mo68507a(viewGroup);
                }
            } else if (C6384b.m19835a().mo15287a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", C6384b.m19835a().mo15295d().general_related_search_style, 0) == 1) {
                return C26429a.m86958a(viewGroup, this.f70423c);
            } else {
                return C26421a.m86943a(viewGroup);
            }
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        C26754d dVar = (C26754d) this.f67539l.get(i);
        try {
            int a = mo58029a(i);
            if (a != 16) {
                if (a == 48) {
                    SearchMixOperationViewHolder searchMixOperationViewHolder = (SearchMixOperationViewHolder) vVar;
                    C7573i.m23582a((Object) dVar, "mixFeed");
                    searchMixOperationViewHolder.mo68511a(dVar.f70542p.getOperation(), this.f70424d, dVar.f70547u, 2);
                } else if (a != 80) {
                    if (a == 96) {
                        SearchMixUserData searchMixUserData = new SearchMixUserData();
                        C7573i.m23582a((Object) dVar, "mixFeed");
                        SearchMixUserData hasTopUser = searchMixUserData.setUsers(dVar.f70528b).setHasTopUser(dVar.f70532f);
                        C7573i.m23582a((Object) hasTopUser, "searchMixUserData");
                        hasTopUser.setAd(dVar.f70548v);
                        ((SearchMixUserViewHolder) vVar).mo68516a(hasTopUser, this.f70424d, dVar.f70547u);
                    } else if (a == 112) {
                        SearchMixMusicViewHolder searchMixMusicViewHolder = (SearchMixMusicViewHolder) vVar;
                        C7573i.m23582a((Object) dVar, "mixFeed");
                        searchMixMusicViewHolder.mo68510a(dVar.f70530d, this.f70424d, dVar.f70547u);
                    } else if (a == 128) {
                        SearchMixChallengeViewHolder searchMixChallengeViewHolder = (SearchMixChallengeViewHolder) vVar;
                        C7573i.m23582a((Object) dVar, "mixFeed");
                        searchMixChallengeViewHolder.mo68508a(dVar.f70531e, this.f70424d, dVar.f70547u);
                    } else if (a == 144) {
                        SearchCustomViewHolder searchCustomViewHolder = (SearchCustomViewHolder) vVar;
                        C7573i.m23582a((Object) dVar, "mixFeed");
                        String str = dVar.f70527a;
                        C7573i.m23582a((Object) str, "mixFeed.customContent");
                        searchCustomViewHolder.mo68506a(str);
                    }
                } else if (C6384b.m19835a().mo15287a(GeneralRelatedSearchCardStyle.class, true, "general_related_search_style", C6384b.m19835a().mo15295d().general_related_search_style, 0) == 1) {
                    RelatedWordGridViewHolder relatedWordGridViewHolder = (RelatedWordGridViewHolder) vVar;
                    C7573i.m23582a((Object) dVar, "mixFeed");
                    relatedWordGridViewHolder.mo68025a(dVar, this.f70424d, i);
                } else {
                    RelatedSearchWithImageViewHolder relatedSearchWithImageViewHolder = (RelatedSearchWithImageViewHolder) vVar;
                    C7573i.m23582a((Object) dVar, "mixFeed");
                    relatedSearchWithImageViewHolder.mo68018a(dVar, this.f70424d, i);
                }
                return;
            }
            RecommendCellBViewHolder recommendCellBViewHolder = (RecommendCellBViewHolder) vVar;
            C7573i.m23582a((Object) dVar, "mixFeed");
            recommendCellBViewHolder.mo71604a(dVar.getAweme(), i, true);
            vVar.itemView.post(C26718b.f70429a);
        } finally {
            vVar.itemView.post(C26718b.f70429a);
        }
    }

    public SearchJediMixFeedAdapter(RecyclerView recyclerView, SearchResultParam searchResultParam, C23685d dVar) {
        C7573i.m23587b(recyclerView, "mRecyclerView");
        C7573i.m23587b(dVar, "mAwemeClickListener");
        this.f70423c = recyclerView;
        this.f70424d = searchResultParam;
        this.f70425e = dVar;
        C11561b bVar = new C11561b(this, new Differ(), null, 4, null);
        this.f70422b = bVar;
    }
}
