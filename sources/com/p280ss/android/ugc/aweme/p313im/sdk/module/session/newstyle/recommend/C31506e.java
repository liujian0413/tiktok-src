package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend;

import bolts.C1591g;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e */
public final class C31506e extends C25640a<C31505d> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82501a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31506e.class), "mRecommendApi", "getMRecommendApi()Lcom/ss/android/ugc/aweme/im/sdk/module/session/newstyle/recommend/RecommendApi;"))};

    /* renamed from: d */
    public static final C31507a f82502d = new C31507a(null);

    /* renamed from: b */
    public List<? extends User> f82503b = C7525m.m23461a();

    /* renamed from: c */
    public boolean f82504c;

    /* renamed from: e */
    private volatile int f82505e;

    /* renamed from: f */
    private final C7541d f82506f = C7546e.m23569a(C31509c.f82508a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e$a */
    public static final class C31507a {
        private C31507a() {
        }

        public /* synthetic */ C31507a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e$b */
    static final class C31508b<V> implements Callable<C31505d> {

        /* renamed from: a */
        final /* synthetic */ C31506e f82507a;

        C31508b(C31506e eVar) {
            this.f82507a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31505d call() {
            try {
                C31505d dVar = (C31505d) this.f82507a.mData;
                dVar.f82495a = this.f82507a.f82503b;
                this.f82507a.mo82216a(C7525m.m23461a());
                return dVar;
            } catch (ExecutionException e) {
                throw e;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.e$c */
    static final class C31509c extends Lambda implements C7561a<RecommendApi> {

        /* renamed from: a */
        public static final C31509c f82508a = new C31509c();

        C31509c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m102458a();
        }

        /* renamed from: a */
        private static RecommendApi m102458a() {
            return (RecommendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C7075h.f19903b).create(RecommendApi.class);
        }
    }

    /* renamed from: c */
    private final RecommendApi m102451c() {
        return (RecommendApi) this.f82506f.getValue();
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    /* renamed from: a */
    public final void mo82214a() {
        this.f82505e = 0;
        this.f82504c = false;
        m102449a(20);
    }

    /* renamed from: d */
    private final void m102452d() {
        C23397p.m76735a().mo60807a(this.mHandler, new C31508b(this), 0);
    }

    /* renamed from: b */
    public final void mo82217b() {
        boolean z = true;
        this.f82504c = true;
        Collection collection = this.f82503b;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        }
        if (!z) {
            m102452d();
        } else {
            m102449a(20);
        }
    }

    /* renamed from: a */
    public final void mo82216a(List<? extends User> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f82503b = list;
    }

    /* renamed from: a */
    public final void mo82215a(User user) {
        C7573i.m23587b(user, "user");
        m102451c().dislikeRecommend(user.getUid());
    }

    /* renamed from: a */
    private final void m102449a(int i) {
        RecommendApi c = m102451c();
        Integer valueOf = Integer.valueOf(20);
        Integer valueOf2 = Integer.valueOf(this.f82505e);
        Integer valueOf3 = Integer.valueOf(10);
        Integer valueOf4 = Integer.valueOf(C31504c.m102445a());
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
        c.recommendList(valueOf, valueOf2, null, valueOf3, null, valueOf4, f.getToReportId(), Integer.valueOf(C31504c.m102447b()), null).mo6875a((C1591g<TResult, TContinuationResult>) new C31502a<TResult,TContinuationResult>(this.mHandler, 0));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C31505d dVar) {
        super.handleData(dVar);
        if (dVar != null) {
            boolean z = true;
            String str = null;
            if (!this.f82504c) {
                C6956a a = C6956a.m21632a();
                C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                if (a.mo18009f().checkIMInsertRecommendContact()) {
                    C6956a a2 = C6956a.m21632a();
                    C7573i.m23582a((Object) a2, "AwemeImManager.instance()");
                    C7103h f = a2.mo18009f();
                    C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
                    int recommendContactPosition = f.getRecommendContactPosition();
                    if (recommendContactPosition > 0) {
                        if (dVar.f82495a.size() > recommendContactPosition) {
                            dVar.f82495a.add(recommendContactPosition, new RecommendContact(null, 1, null));
                        } else {
                            dVar.f82495a.add(new RecommendContact(null, 1, null));
                        }
                    }
                }
                List<User> list = dVar.f82495a;
                C7573i.m23582a((Object) list, "userList");
                if ((!list.isEmpty()) && !(dVar.f82495a.get(0) instanceof RecommendTitle)) {
                    dVar.f82495a.add(0, new RecommendTitle());
                }
            }
            this.f82505e = dVar.f82497c;
            Collection collection = dVar.f82495a;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                dVar.f82498d = false;
            }
            this.mData = dVar;
            C6956a a3 = C6956a.m21632a();
            C7573i.m23582a((Object) a3, "AwemeImManager.instance()");
            C7103h f2 = a3.mo18009f();
            Object obj = this.mData;
            C7573i.m23582a(obj, "mData");
            String str2 = ((C31505d) obj).f82496b;
            LogPbBean logPbBean = ((C31505d) this.mData).f82500f;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            }
            f2.saveLogPb(str2, str);
        }
    }
}
