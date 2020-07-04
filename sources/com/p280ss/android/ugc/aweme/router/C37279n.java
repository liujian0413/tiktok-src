package com.p280ss.android.ugc.aweme.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.router.n */
public final class C37279n implements IInterceptor {

    /* renamed from: a */
    public static final C37280a f97398a = new C37280a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.n$a */
    public static final class C37280a {
        private C37280a() {
        }

        public /* synthetic */ C37280a(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x000e
            android.net.Uri r1 = r4.getUri()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getHost()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r4 == 0) goto L_0x001c
            android.net.Uri r2 = r4.getUri()
            if (r2 == 0) goto L_0x001c
            java.lang.String r2 = r2.getPath()
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            java.lang.String r1 = kotlin.jvm.internal.C7573i.m23577a(r1, r2)
            java.lang.String r2 = "studio/task/create"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r1 != 0) goto L_0x0052
            if (r4 == 0) goto L_0x0036
            android.net.Uri r1 = r4.getUri()
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = r1.getHost()
            goto L_0x0037
        L_0x0036:
            r1 = r0
        L_0x0037:
            if (r4 == 0) goto L_0x0043
            android.net.Uri r4 = r4.getUri()
            if (r4 == 0) goto L_0x0043
            java.lang.String r0 = r4.getPath()
        L_0x0043:
            java.lang.String r4 = kotlin.jvm.internal.C7573i.m23577a(r1, r0)
            java.lang.String r0 = "studio/create"
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r0)
            if (r4 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r4 = 0
            return r4
        L_0x0052:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37279n.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (context instanceof Activity) {
            Object service = ServiceManager.get().getService(IAVService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
            context.startActivity(C33336b.m107779a(new Intent(context, ((IAVService) service).getRecordPermissionActivity()), routeIntent));
        } else {
            if (context == null) {
                context = C6399b.m19921a();
            }
            Object service2 = ServiceManager.get().getService(IAVService.class);
            C7573i.m23582a(service2, "ServiceManager.get()\n   …e(IAVService::class.java)");
            Intent intent = new Intent(context, ((IAVService) service2).getRecordPermissionActivity());
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        return true;
    }
}
