package com.p280ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.router.h */
public final class C37269h implements IInterceptor {

    /* renamed from: a */
    public static final C37270a f97394a = new C37270a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.h$a */
    public static final class C37270a {
        private C37270a() {
        }

        public /* synthetic */ C37270a(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r2) {
        /*
            r1 = this;
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x001e
            if (r2 == 0) goto L_0x0013
            android.net.Uri r2 = r2.getUri()
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getHost()
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            java.lang.String r0 = "draft_box"
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r2, r0)
            if (r2 == 0) goto L_0x001e
            r2 = 1
            return r2
        L_0x001e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37269h.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context instanceof Activity) {
            context.startActivity(new Intent(context, ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().draftBoxActivity()));
        } else {
            if (context == null) {
                context = C6399b.m19921a();
            }
            Intent intent = new Intent(context, ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().draftBoxActivity());
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        return true;
    }
}
