package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewStub;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26740a;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26750b;
import com.p280ss.android.ugc.aweme.discover.mixfeed.RecomWordFetchStage;
import com.p280ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel.C29434a;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.CommercialFlowFeedViewHolder;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder */
public class SearchMixVideoViewHolder extends CommercialFlowFeedViewHolder {

    /* renamed from: a */
    public SearchResultParam f70591a;

    /* renamed from: b */
    public C26772a f70592b;

    /* renamed from: c */
    public final Handler f70593c;

    /* renamed from: d */
    public final Runnable f70594d;

    /* renamed from: e */
    public long f70595e;

    /* renamed from: f */
    public final SearchRecomWordModel f70596f;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder$a */
    static final class C26767a extends Lambda implements C7562b<C26740a, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchMixVideoViewHolder f70597a;

        C26767a(SearchMixVideoViewHolder searchMixVideoViewHolder) {
            this.f70597a = searchMixVideoViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87876a((C26740a) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87876a(C26740a aVar) {
            if (aVar == null || aVar.f70476a != this.f70597a.getLayoutPosition()) {
                C26772a aVar2 = this.f70597a.f70592b;
                if (aVar2 != null) {
                    aVar2.mo68538a();
                }
            } else if (aVar.f70476a == this.f70597a.getLayoutPosition()) {
                this.f70597a.mo68517a((TrendingSource) null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder$b */
    static final class C26768b extends Lambda implements C7562b<C26750b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchMixVideoViewHolder f70598a;

        C26768b(SearchMixVideoViewHolder searchMixVideoViewHolder) {
            this.f70598a = searchMixVideoViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87877a((C26750b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87877a(C26750b bVar) {
            if (bVar != null && bVar.f70513b == RecomWordFetchStage.TIMING && bVar.f70512a == this.f70598a.getLayoutPosition()) {
                this.f70598a.f70593c.removeCallbacks(this.f70598a.f70594d);
                this.f70598a.mo68517a(TrendingSource.VIDEO_AUTOPLAY);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder$c */
    static final class C26769c extends Lambda implements C7562b<C26740a, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchMixVideoViewHolder f70599a;

        C26769c(SearchMixVideoViewHolder searchMixVideoViewHolder) {
            this.f70599a = searchMixVideoViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87878a((C26740a) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87878a(C26740a aVar) {
            if (!(aVar == null || aVar.f70476a == this.f70599a.getLayoutPosition())) {
                C26772a aVar2 = this.f70599a.f70592b;
                if (aVar2 != null) {
                    aVar2.mo68538a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder$d */
    static final class C26770d extends Lambda implements C7562b<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchMixVideoViewHolder f70600a;

        C26770d(SearchMixVideoViewHolder searchMixVideoViewHolder) {
            this.f70600a = searchMixVideoViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87879a(((Boolean) obj).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87879a(boolean z) {
            if (z) {
                this.f70600a.mo68517a(TrendingSource.CLICK_VIDEO_BACK);
                this.f70600a.f70596f.mo68478c();
                return;
            }
            this.f70600a.f70596f.mo68477b(new C7562b<C26750b, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C26770d f70601a;

                {
                    this.f70601a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m87880a((C26750b) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m87880a(C26750b bVar) {
                    if (bVar == null || bVar.f70512a != this.f70601a.f70600a.getLayoutPosition()) {
                        this.f70601a.f70600a.f70596f.mo68472a(this.f70601a.f70600a.getLayoutPosition());
                        this.f70601a.f70600a.f70593c.postDelayed(this.f70601a.f70600a.f70594d, this.f70601a.f70600a.f70595e);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public final String mo68523h() {
        return "from_search_mix";
    }

    /* renamed from: i */
    public final int mo68524i() {
        return 9;
    }

    /* renamed from: j */
    public final void mo68525j() {
        super.mo68525j();
    }

    /* renamed from: ar */
    private final void mo86986ar() {
        if (this.f70596f.mo68481e()) {
            this.f70596f.mo68479c(new C26770d(this));
        }
    }

    /* renamed from: e */
    public final void mo68520e() {
        if (C26654b.m87583k()) {
            mo68521f();
        } else {
            super.mo68520e();
        }
        this.f70596f.mo68480d();
    }

    /* renamed from: g */
    public final boolean mo68522g() {
        C37385g gVar = C37385g.f97617a;
        Context ab = mo75261ab();
        if (ab == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        } else if (!gVar.isSearchResultActivity((Activity) ab)) {
            return false;
        } else {
            String r = mo75290r();
            C7573i.m23582a((Object) r, "eventType");
            Context ab2 = mo75261ab();
            if (!(ab2 instanceof FragmentActivity)) {
                ab2 = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) ab2;
            if (fragmentActivity == null) {
                return false;
            }
            return C29434a.m96851a(r, fragmentActivity).f77626a;
        }
    }

    /* renamed from: f */
    public final void mo68521f() {
        String str;
        super.mo68521f();
        View view = this.f89213be;
        String str2 = "general_search";
        Aweme aweme = this.f77546j;
        SearchResultParam searchResultParam = this.f70591a;
        String str3 = null;
        if (searchResultParam != null) {
            str = searchResultParam.getKeyword();
        } else {
            str = null;
        }
        C26780aa.m87960a(view, str2, aweme, str);
        Context ab = mo75261ab();
        SearchResultParam searchResultParam2 = this.f70591a;
        if (searchResultParam2 != null) {
            str3 = searchResultParam2.getKeyword();
        }
        String str4 = str3;
        Aweme aweme2 = this.f77546j;
        C7573i.m23582a((Object) aweme2, "mAweme");
        String aid = aweme2.getAid();
        String r = mo75290r();
        String h = mo68523h();
        Aweme aweme3 = this.f77546j;
        C7573i.m23582a((Object) aweme3, "mAweme");
        DetailActivity.m86055a(ab, str4, aid, r, h, aweme3.getEnterpriseType(), mo68524i(), mo75315am(), this.f77597az);
        Aweme aweme4 = this.f77546j;
        C7573i.m23582a((Object) aweme4, "mAweme");
        if (aweme4.isAd()) {
            C24958f.m81905a().mo65273b(this.f77546j).mo65266a("result_ad").mo65276b("otherclick").mo65283e("video").mo65270a(mo75261ab());
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        super.mo63045a(eVar);
        mo86986ar();
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        super.mo63047b(str);
        if (this.f70596f.mo68481e()) {
            this.f70596f.mo68477b(new C26768b(this));
        }
    }

    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        if (this.f70596f.mo68481e()) {
            this.f70593c.removeCallbacks(this.f70594d);
            this.f70596f.mo68475a((C7562b<? super C26740a, C7581n>) new C26769c<Object,C7581n>(this));
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        super.mo63046a(str);
        mo86986ar();
    }

    /* renamed from: c */
    public final void mo68519c(boolean z) {
        C37385g gVar = C37385g.f97617a;
        Context ab = mo75261ab();
        if (ab == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        } else if (gVar.isSearchResultActivity((Activity) ab)) {
            String r = mo75290r();
            C7573i.m23582a((Object) r, "eventType");
            Context ab2 = mo75261ab();
            if (!(ab2 instanceof FragmentActivity)) {
                ab2 = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) ab2;
            if (fragmentActivity != null) {
                C29434a.m96851a(r, fragmentActivity).f77626a = z;
            }
        }
    }

    /* renamed from: b */
    private final void mo68529b(View view) {
        if (this.f70592b == null && this.f70596f.mo68481e()) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.dcp);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.a_6);
                View inflate = viewStub.inflate();
                C7573i.m23582a((Object) inflate, "it.inflate()");
                this.f70592b = new C26772a(inflate, this.f70596f.f70454b);
                C26772a aVar = this.f70592b;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                mo75253a(aVar.f70608d, 4.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo68517a(TrendingSource trendingSource) {
        if (!(this.f70591a == null || this.f77546j == null || !this.f70596f.mo68481e())) {
            if (this.f70592b != null) {
                C26772a aVar = this.f70592b;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                if (aVar.mo68539b()) {
                    return;
                }
            }
            this.f70593c.removeCallbacks(this.f70594d);
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            mo68529b(view);
            SearchRecomWordModel searchRecomWordModel = this.f70596f;
            Aweme aweme = this.f77546j;
            C7573i.m23582a((Object) aweme, "aweme");
            String aid = aweme.getAid();
            C7573i.m23582a((Object) aid, "aweme.aid");
            SearchResultParam searchResultParam = this.f70591a;
            if (searchResultParam == null) {
                C7573i.m23580a();
            }
            String keyword = searchResultParam.getKeyword();
            C7573i.m23582a((Object) keyword, "searchParam!!.keyword");
            searchRecomWordModel.mo68474a(aid, keyword, getLayoutPosition(), trendingSource);
        }
    }

    /* renamed from: a */
    public void mo68518a(Aweme aweme, List<Comment> list, List<User> list2, C21747e eVar) {
        super.mo68518a(aweme, list, list2, eVar);
        this.f70596f.mo68475a((C7562b<? super C26740a, C7581n>) new C26767a<Object,C7581n>(this));
    }
}
