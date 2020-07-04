package com.p280ss.android.ugc.aweme.follow.api;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.follow.p1261d.C29450c;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.follow.api.b */
public final class C29440b {

    /* renamed from: a */
    public static IRetrofitService f77642a;

    /* renamed from: b */
    public static FollowFeedApiV2 f77643b;

    /* renamed from: c */
    public static final C29441a f77644c = new C29441a(null);

    /* renamed from: com.ss.android.ugc.aweme.follow.api.b$a */
    public static final class C29441a {
        private C29441a() {
        }

        public /* synthetic */ C29441a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FollowFeedList m96870a(int i, long j, int i2, int i3, int i4, int i5, long j2, int i6, String str, String str2, String str3, String str4, String str5, int i7, int i8, int i9, int i10, int i11, int i12) {
            Long l;
            Long l2;
            Integer num;
            Integer num2;
            Integer num3;
            String str6;
            Long l3;
            try {
                Long l4 = null;
                if (C6399b.m19944t() || TextUtils.isEmpty(C29450c.m96906b())) {
                    str6 = null;
                    num3 = null;
                    num2 = null;
                    num = null;
                    l2 = null;
                    l = null;
                } else {
                    String b = C29450c.m96906b();
                    Integer valueOf = Integer.valueOf(C29450c.m96899a());
                    Integer valueOf2 = Integer.valueOf(C29450c.m96910c(2));
                    Integer valueOf3 = Integer.valueOf(C29450c.m96910c(1));
                    if (C29450c.m96912d() > 0) {
                        l3 = Long.valueOf(C29450c.m96912d());
                    } else {
                        l3 = null;
                    }
                    if (C29450c.m96911c() > 0) {
                        l4 = Long.valueOf(C29450c.m96911c());
                    }
                    str6 = b;
                    l = l4;
                    num = valueOf;
                    num3 = valueOf2;
                    num2 = valueOf3;
                    l2 = l3;
                }
                FollowFeedApiV2 followFeedApiV2 = C29440b.f77643b;
                C34202f a = C34202f.m110435a();
                C7573i.m23582a((Object) a, "RecUserImpressionReporter.getInstance()");
                Object obj = followFeedApiV2.getFollowFeedList(i, j, i2, 20, i4, i5, j2, a.mo86949b(), str3, str4, str5, str, str2, i10, C6903bc.m21468I().mo84734a(), i9, i11, str6, num3, num2, num, l2, l, Integer.valueOf(i12)).get();
                C7573i.m23582a(obj, "api.getFollowFeedList(re…d, liveTagShowType).get()");
                return (FollowFeedList) obj;
            } catch (ExecutionException e) {
                RuntimeException propagateCompatibleException = C29440b.f77642a.propagateCompatibleException(e);
                C7573i.m23582a((Object) propagateCompatibleException, "retrofitService.propagateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }
    }

    static {
        Object service = ServiceManager.get().getService(IRetrofitService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = (IRetrofitService) service;
        f77642a = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit(C19223b.f51890e).create(FollowFeedApiV2.class);
        C7573i.m23582a(create, "retrofitService.createNe…lowFeedApiV2::class.java)");
        f77643b = (FollowFeedApiV2) create;
    }
}
