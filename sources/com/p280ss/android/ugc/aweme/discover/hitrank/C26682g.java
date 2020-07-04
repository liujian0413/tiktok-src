package com.p280ss.android.ugc.aweme.discover.hitrank;

import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.g */
public final class C26682g {

    /* renamed from: a */
    public static final C26682g f70355a = new C26682g();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static RankApi f70356b;

    /* renamed from: com.ss.android.ugc.aweme.discover.hitrank.g$a */
    static final class C26683a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f70357a;

        /* renamed from: b */
        final /* synthetic */ int f70358b;

        /* renamed from: c */
        final /* synthetic */ List f70359c;

        C26683a(String str, int i, List list) {
            this.f70357a = str;
            this.f70358b = i;
            this.f70359c = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public BaseResponse call() {
            RankApi a = C26682g.f70356b;
            if (a == null) {
                C7573i.m23580a();
            }
            return (BaseResponse) a.finishHitRankTask(this.f70357a, 1, this.f70358b, this.f70359c, C43077dz.m136657a().mo104733b(this.f70357a)).get();
        }
    }

    private C26682g() {
    }

    /* renamed from: a */
    public final void mo68416a(String str, int i) {
        C7573i.m23587b(str, "uid");
        m87659a(str, i, null);
    }

    /* renamed from: a */
    public final void mo68414a(Aweme aweme, int i) {
        String str;
        if (!C6399b.m19944t()) {
            StringBuilder sb = new StringBuilder();
            User user = null;
            if (aweme != null) {
                str = aweme.getDesc();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" : ");
            sb.append(i);
            if (i != 0) {
                if (aweme != null) {
                    user = aweme.getAuthor();
                }
                if (user != null) {
                    mo68415a(aweme.getAuthor(), i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo68415a(User user, int i) {
        String str;
        if (!C6399b.m19944t()) {
            StringBuilder sb = new StringBuilder();
            if (user != null) {
                str = user.getNickname();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" : ");
            sb.append(i);
            if (user != null && C26676a.m87639a(user)) {
                String uid = user.getUid();
                C7573i.m23582a((Object) uid, "user.uid");
                mo68416a(uid, i);
            }
        }
    }

    /* renamed from: a */
    public static void m87659a(String str, int i, List<String> list) {
        C7573i.m23587b(str, "uid");
        IAccountUserService userService = C6861a.m21332a().userService();
        C7573i.m23582a((Object) userService, "AccountProxyService.get().userService()");
        if (userService.isLogin()) {
            if (f70356b == null) {
                f70356b = (RankApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RankApi.class);
            }
            C1592h.m7853a((Callable<TResult>) new C26683a<TResult>(str, i, list));
        }
    }
}
