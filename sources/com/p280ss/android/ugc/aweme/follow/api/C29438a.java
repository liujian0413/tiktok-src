package com.p280ss.android.ugc.aweme.follow.api;

import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.follow.p1261d.C29450c;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.api.a */
public final class C29438a {

    /* renamed from: a */
    public static IFollowFeedApiV1 f77639a;

    /* renamed from: b */
    public static final C29439a f77640b = new C29439a(null);

    /* renamed from: c */
    private static IRetrofitService f77641c;

    /* renamed from: com.ss.android.ugc.aweme.follow.api.a$a */
    public static final class C29439a {
        private C29439a() {
        }

        public /* synthetic */ C29439a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FollowFeedList m96867a(int i, int i2, int i3, long j, String str, String str2) throws Exception {
            Object obj = C29438a.f77639a.getRecommendList(i, i2, i3, j, str, str2).get();
            C7573i.m23582a(obj, "api.getRecommendList(cou…onIds, lastFeedIds).get()");
            return (FollowFeedList) obj;
        }

        /* renamed from: a */
        public static FollowFeedList m96868a(long j, long j2, int i, int i2, int i3, long j3, int i4, String str, String str2, int i5, int i6, int i7, int i8) throws Exception {
            int i9 = i5;
            int i10 = i6;
            Object obj = C29438a.f77639a.getFriendList(j, j2, i, i2, i3, j3, i4, str, i9, i10, str2, i7, i8, C29450c.m96906b(), Integer.valueOf(C29450c.m96910c(3)), Integer.valueOf(C29450c.m96899a()), Long.valueOf(C29450c.m96912d()), Long.valueOf(C29450c.m96911c())).get();
            C7573i.m23582a(obj, "api.getFriendList(maxCur…lastLongLinkItemId).get()");
            return (FollowFeedList) obj;
        }

        /* renamed from: a */
        public static FollowFeedList m96869a(long j, long j2, int i, int i2, int i3, long j3, int i4, String str, String str2, String str3, String str4, String str5, int i5, int i6, int i7, int i8, int i9, int i10) throws Exception {
            IFollowFeedApiV1 iFollowFeedApiV1 = C29438a.f77639a;
            C34202f a = C34202f.m110435a();
            C7573i.m23582a((Object) a, "RecUserImpressionReporter.getInstance()");
            String b = a.mo86949b();
            String a2 = C6903bc.m21468I().mo84734a();
            if (a2 == null) {
                C7573i.m23580a();
            }
            Object obj = iFollowFeedApiV1.getFollowFeedList(j, j2, i, i2, i3, j3, i4, str, str2, b, i5, i6, str3, str4, str5, i7, i8, a2, i9, Integer.valueOf(i10), C29450c.m96906b(), Integer.valueOf(C29450c.m96910c(2)), Integer.valueOf(C29450c.m96910c(1)), Integer.valueOf(C29450c.m96899a()), Long.valueOf(C29450c.m96912d()), Long.valueOf(C29450c.m96911c())).get();
            C7573i.m23582a(obj, "api.getFollowFeedList(ma…lastLongLinkItemId).get()");
            return (FollowFeedList) obj;
        }
    }

    /* renamed from: a */
    public static final FollowFeedList m96864a(int i, int i2, int i3, long j, String str, String str2) throws Exception {
        return C29439a.m96867a(20, i2, i3, j, str, str2);
    }

    /* renamed from: a */
    public static final FollowFeedList m96865a(long j, long j2, int i, int i2, int i3, long j3, int i4, String str, String str2, int i5, int i6, int i7, int i8) throws Exception {
        return C29439a.m96868a(j, j2, 20, i2, i3, j3, i4, str, str2, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public static final FollowFeedList m96866a(long j, long j2, int i, int i2, int i3, long j3, int i4, String str, String str2, String str3, String str4, String str5, int i5, int i6, int i7, int i8, int i9, int i10) throws Exception {
        return C29439a.m96869a(j, j2, 20, i2, i3, j3, i4, str, str2, str3, str4, str5, i5, i6, i7, i8, i9, i10);
    }

    static {
        Object service = ServiceManager.get().getService(IRetrofitService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = (IRetrofitService) service;
        f77641c = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit(C19223b.f51890e).create(IFollowFeedApiV1.class);
        C7573i.m23582a(create, "retrofitService.createNe…lowFeedApiV1::class.java)");
        f77639a = (IFollowFeedApiV1) create;
    }
}
