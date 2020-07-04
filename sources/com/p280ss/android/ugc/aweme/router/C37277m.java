package com.p280ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.router.m */
public final class C37277m implements IInterceptor {

    /* renamed from: a */
    public static final C37278a f97397a = new C37278a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.m$a */
    public static final class C37278a {
        private C37278a() {
        }

        public /* synthetic */ C37278a(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "chatting/message"
            r1 = 0
            if (r4 == 0) goto L_0x0010
            android.net.Uri r2 = r4.getUri()
            if (r2 == 0) goto L_0x0010
            java.lang.String r2 = r2.getHost()
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            if (r4 == 0) goto L_0x001d
            android.net.Uri r4 = r4.getUri()
            if (r4 == 0) goto L_0x001d
            java.lang.String r1 = r4.getPath()
        L_0x001d:
            java.lang.String r4 = kotlin.jvm.internal.C7573i.m23577a(r2, r1)
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37277m.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str = null;
        if (context instanceof Activity) {
            C24758a aVar = C24758a.f65215a;
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                str = routeIntent.getUrl();
            }
            aVar.mo59313a(activity, str);
        } else {
            C24758a aVar2 = C24758a.f65215a;
            if (routeIntent != null) {
                str = routeIntent.getUrl();
            }
            aVar2.mo59315a(str);
        }
        return true;
    }
}
