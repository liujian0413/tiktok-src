package com.p280ss.android.ugc.aweme.discover.mixfeed;

import android.arch.lifecycle.C0063u;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchRecomWordsSpanCountABTest;
import com.p280ss.android.ugc.aweme.discover.api.SuggestWordsApi.C26565a;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.TrendingSource;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p280ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel */
public final class SearchRecomWordModel extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f70453a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchRecomWordModel.class), "updatedResult", "getUpdatedResult()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchRecomWordModel.class), "fetchState", "getFetchState()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchRecomWordModel.class), "resumePlayFromDetailPage", "getResumePlayFromDetailPage()Lcom/bytedance/ies/sdk/widgets/NextLiveData;"))};

    /* renamed from: b */
    public final int f70454b = C6384b.m19835a().mo15287a(SearchRecomWordsSpanCountABTest.class, true, "search_recom_word_row_count", C6384b.m19835a().mo15295d().search_recom_word_row_count, 0);

    /* renamed from: c */
    private final C7541d f70455c = C7546e.m23569a(C26739e.f70472a);

    /* renamed from: d */
    private final C7541d f70456d = C7546e.m23569a(C26736b.f70464a);

    /* renamed from: e */
    private final C7541d f70457e = C7546e.m23569a(C26738d.f70471a);

    /* renamed from: f */
    private final Set<Integer> f70458f = new HashSet();

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel$a */
    static final class C26735a<TTaskResult, TContinuationResult> implements C1591g<SuggestWordResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ SearchRecomWordModel f70459a;

        /* renamed from: b */
        final /* synthetic */ int f70460b;

        /* renamed from: c */
        final /* synthetic */ String f70461c;

        /* renamed from: d */
        final /* synthetic */ String f70462d;

        /* renamed from: e */
        final /* synthetic */ TrendingSource f70463e;

        C26735a(SearchRecomWordModel searchRecomWordModel, int i, String str, String str2, TrendingSource trendingSource) {
            this.f70459a = searchRecomWordModel;
            this.f70460b = i;
            this.f70461c = str;
            this.f70462d = str2;
            this.f70463e = trendingSource;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m87790a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87790a(C1592h<SuggestWordResponse> hVar) {
            TypeWords typeWords;
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6882b()) {
                SuggestWordResponse suggestWordResponse = (SuggestWordResponse) hVar.mo6890e();
                if (suggestWordResponse != null) {
                    List<TypeWords> list = suggestWordResponse.data;
                    SearchRecomWordModel searchRecomWordModel = this.f70459a;
                    int i = this.f70460b;
                    String str = this.f70461c;
                    String str2 = this.f70462d;
                    if (list != null) {
                        typeWords = (TypeWords) C7525m.m23511f(list);
                    } else {
                        typeWords = null;
                    }
                    searchRecomWordModel.mo68473a(i, str, str2, new C26568a(typeWords), this.f70463e);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel$b */
    static final class C26736b extends Lambda implements C7561a<NextLiveData<C26750b>> {

        /* renamed from: a */
        public static final C26736b f70464a = new C26736b();

        C26736b() {
            super(0);
        }

        /* renamed from: a */
        private static NextLiveData<C26750b> m87791a() {
            return new NextLiveData<>();
        }

        public final /* synthetic */ Object invoke() {
            return m87791a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel$c */
    static final class C26737c extends Lambda implements C7562b<C26750b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchRecomWordModel f70465a;

        /* renamed from: b */
        final /* synthetic */ int f70466b;

        /* renamed from: c */
        final /* synthetic */ String f70467c;

        /* renamed from: d */
        final /* synthetic */ String f70468d;

        /* renamed from: e */
        final /* synthetic */ TrendingSource f70469e;

        /* renamed from: f */
        final /* synthetic */ C26568a f70470f;

        C26737c(SearchRecomWordModel searchRecomWordModel, int i, String str, String str2, TrendingSource trendingSource, C26568a aVar) {
            this.f70465a = searchRecomWordModel;
            this.f70466b = i;
            this.f70467c = str;
            this.f70468d = str2;
            this.f70469e = trendingSource;
            this.f70470f = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87792a((C26750b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87792a(C26750b bVar) {
            if (bVar != null && bVar.f70513b == RecomWordFetchStage.DATA_FETCHING && this.f70466b == bVar.f70512a) {
                NextLiveData a = this.f70465a.mo68471a();
                C26740a aVar = new C26740a(this.f70466b, this.f70467c, this.f70468d, this.f70469e, this.f70470f);
                a.postValue(aVar);
                this.f70465a.mo68476b().setValue(new C26750b(this.f70466b, RecomWordFetchStage.FINISHED));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel$d */
    static final class C26738d extends Lambda implements C7561a<NextLiveData<Boolean>> {

        /* renamed from: a */
        public static final C26738d f70471a = new C26738d();

        C26738d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m87793a();
        }

        /* renamed from: a */
        private static NextLiveData<Boolean> m87793a() {
            NextLiveData<Boolean> nextLiveData = new NextLiveData<>();
            nextLiveData.setValue(Boolean.valueOf(false));
            return nextLiveData;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.SearchRecomWordModel$e */
    static final class C26739e extends Lambda implements C7561a<NextLiveData<C26740a>> {

        /* renamed from: a */
        public static final C26739e f70472a = new C26739e();

        C26739e() {
            super(0);
        }

        /* renamed from: a */
        private static NextLiveData<C26740a> m87794a() {
            return new NextLiveData<>();
        }

        public final /* synthetic */ Object invoke() {
            return m87794a();
        }
    }

    /* renamed from: f */
    private final NextLiveData<Boolean> m87778f() {
        return (NextLiveData) this.f70457e.getValue();
    }

    /* renamed from: a */
    public final NextLiveData<C26740a> mo68471a() {
        return (NextLiveData) this.f70455c.getValue();
    }

    /* renamed from: b */
    public final NextLiveData<C26750b> mo68476b() {
        return (NextLiveData) this.f70456d.getValue();
    }

    /* renamed from: e */
    public final boolean mo68481e() {
        if (this.f70454b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo68478c() {
        m87778f().setValue(Boolean.valueOf(false));
    }

    /* renamed from: d */
    public final void mo68480d() {
        m87778f().setValue(Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo68472a(int i) {
        mo68476b().setValue(new C26750b(i, RecomWordFetchStage.TIMING));
    }

    /* renamed from: b */
    public final void mo68477b(C7562b<? super C26750b, C7581n> bVar) {
        C7573i.m23587b(bVar, "func");
        bVar.invoke(mo68476b().getValue());
    }

    /* renamed from: c */
    public final void mo68479c(C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(bVar, "func");
        Boolean bool = (Boolean) m87778f().getValue();
        if (bool != null) {
            bVar.invoke(bool);
        }
    }

    /* renamed from: a */
    public final void mo68475a(C7562b<? super C26740a, C7581n> bVar) {
        C7573i.m23587b(bVar, "func");
        bVar.invoke(mo68471a().getValue());
    }

    /* renamed from: a */
    public final void mo68474a(String str, String str2, int i, TrendingSource trendingSource) {
        C7573i.m23587b(str, "gid");
        C7573i.m23587b(str2, "query");
        if (!this.f70458f.contains(Integer.valueOf(i + 1))) {
            mo68476b().setValue(new C26750b(i, RecomWordFetchStage.DATA_FETCHING));
            C26740a aVar = (C26740a) mo68471a().getValue();
            if (aVar == null || aVar.f70476a != i) {
                if (trendingSource != null) {
                    C1592h c = C26565a.m87323a().getRecommendWords(str, str2, "30003");
                    C26735a aVar2 = new C26735a(this, i, str, str2, trendingSource);
                    c.mo6876a((C1591g<TResult, TContinuationResult>) aVar2, C1592h.f5958b);
                }
                return;
            }
            mo68473a(i, str, str2, aVar.f70480e, aVar.f70479d);
        }
    }

    /* renamed from: a */
    public final void mo68473a(int i, String str, String str2, C26568a<TypeWords> aVar, TrendingSource trendingSource) {
        C26737c cVar = new C26737c(this, i, str, str2, trendingSource, aVar);
        mo68477b(cVar);
    }
}
