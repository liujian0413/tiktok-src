package com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.repo.C29480e;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel.C29516b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.a */
public final class C29538a extends C25673a<Aweme, RecommendList> implements C26112p {

    /* renamed from: c */
    public static final C29539a f77845c = new C29539a(null);

    /* renamed from: a */
    public final RecommendFollowViewModel f77846a;

    /* renamed from: b */
    public final RecommendList f77847b;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.a$a */
    public static final class C29539a {
        private C29539a() {
        }

        public /* synthetic */ C29539a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C29538a m97062a(RecommendFollowViewModel recommendFollowViewModel, RecommendList recommendList) {
            C7573i.m23587b(recommendFollowViewModel, "viewModel");
            C7573i.m23587b(recommendList, "data");
            return new C29538a(recommendFollowViewModel, recommendList, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.a$b */
    public static final class C29540b implements C29516b {

        /* renamed from: a */
        final /* synthetic */ C29538a f77848a;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.a$b$a */
        static final class C29541a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C29540b f77849a;

            /* renamed from: b */
            final /* synthetic */ RecommendList f77850b;

            C29541a(C29540b bVar, RecommendList recommendList) {
                this.f77849a = bVar;
                this.f77850b = recommendList;
            }

            public final void run() {
                this.f77849a.f77848a.mIsLoading = false;
                this.f77849a.f77848a.handleData(this.f77850b);
                List<C25678f> list = this.f77849a.f77848a.mNotifyListeners;
                if (list != null) {
                    for (C25678f fVar : list) {
                        if (fVar != null) {
                            fVar.mo56977b();
                        }
                    }
                }
            }
        }

        C29540b(C29538a aVar) {
            this.f77848a = aVar;
        }

        /* renamed from: a */
        public final void mo75538a(RecommendList recommendList) {
            C7573i.m23587b(recommendList, "data");
            this.f77848a.mHandler.post(new C29541a(this, recommendList));
        }

        /* renamed from: a */
        public final void mo75539a(Throwable th) {
            Throwable th2;
            C7573i.m23587b(th, "throwable");
            this.f77848a.mIsLoading = false;
            List<C25678f> list = this.f77848a.mNotifyListeners;
            if (list != null) {
                for (C25678f fVar : list) {
                    if (fVar != null) {
                        if (!(th instanceof Exception)) {
                            th2 = null;
                        } else {
                            th2 = th;
                        }
                        fVar.mo57296a((Exception) th2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return getItems();
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((RecommendList) this.mData).hasMore()) {
            return false;
        }
        return true;
    }

    public final List<Aweme> getItems() {
        List<Aweme> arrayList = new ArrayList<>();
        Object obj = this.mData;
        C7573i.m23582a(obj, "mData");
        for (C29480e eVar : ((RecommendList) obj).getRecommendFollowList()) {
            arrayList.addAll(eVar.f77739b);
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m97059a(boolean z) {
        this.f77846a.mo75536a(z, new C29540b(this));
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    public final void loadMoreList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m97059a(true);
    }

    public final void refreshList(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        m97059a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(RecommendList recommendList) {
        boolean z;
        if (recommendList == null || C6307b.m19566a((Collection<T>) recommendList.getRecommendFollowList()) || C6307b.m19566a((Collection<T>) recommendList.getUserList())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (recommendList == null) {
                C7573i.m23580a();
            }
            for (C29480e eVar : recommendList.getRecommendFollowList()) {
                for (Aweme clone : eVar.f77739b) {
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(clone.clone());
                }
            }
            this.mData = recommendList;
            return;
        }
        if (this.mData != null) {
            ((RecommendList) this.mData).setHasMore(false);
        }
    }

    private C29538a(RecommendFollowViewModel recommendFollowViewModel, RecommendList recommendList) {
        this.f77846a = recommendFollowViewModel;
        this.f77847b = recommendList;
        this.mData = this.f77847b;
    }

    public /* synthetic */ C29538a(RecommendFollowViewModel recommendFollowViewModel, RecommendList recommendList, C7571f fVar) {
        this(recommendFollowViewModel, recommendList);
    }
}
