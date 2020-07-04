package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22610a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22611b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.p1036i.C22996a;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.router.C37257a;
import com.p280ss.android.ugc.aweme.router.C37262d;
import com.p280ss.android.ugc.aweme.router.C37265f;
import com.p280ss.android.ugc.aweme.router.C37267g;
import com.p280ss.android.ugc.aweme.router.C37269h;
import com.p280ss.android.ugc.aweme.router.C37271i;
import com.p280ss.android.ugc.aweme.router.C37274k;
import com.p280ss.android.ugc.aweme.router.C37276l;
import com.p280ss.android.ugc.aweme.router.C37277m;
import com.p280ss.android.ugc.aweme.router.C37279n;
import com.p280ss.android.ugc.aweme.router.C37284r;
import com.p280ss.android.ugc.aweme.router.C37287w;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7195s.C7201a;
import com.p280ss.android.ugc.aweme.router.C7195s.C7202b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitRouter */
public class InitRouter implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        C6857a.m21312e().mo16822a("method_init_smart_router_duration", false);
        C7195s.m22440a((C7201a) new C37284r());
        C7195s.m22439a((Application) context);
        C7195s.m22438a();
        C7195s.m22441a((C7202b) new C22996a());
        SmartRouter.init(AwemeApplication.m21341a());
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).initRouterConfig();
        SmartRouter.addInterceptor(new C37271i());
        SmartRouter.addInterceptor(new C22996a());
        SmartRouter.addInterceptor(new C37287w());
        SmartRouter.addInterceptor(new C37265f());
        SmartRouter.addInterceptor(new C37279n());
        SmartRouter.addInterceptor(new C37269h());
        SmartRouter.addInterceptor(new C22611b());
        SmartRouter.addInterceptor(new C37267g());
        SmartRouter.addInterceptor(new C37277m());
        SmartRouter.addInterceptor(new C37277m());
        SmartRouter.addInterceptor(new C37274k());
        SmartRouter.addInterceptor(new C22610a());
        SmartRouter.addInterceptor(new C37276l());
        SmartRouter.addInterceptor(new C37262d());
        SmartRouter.addInterceptor(new C37257a());
        C6857a.m21312e().mo16827b("method_init_smart_router_duration", false);
    }
}
