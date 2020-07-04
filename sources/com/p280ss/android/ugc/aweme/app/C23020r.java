package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.ies.uikit.base.C11008b;
import com.bytedance.ies.uikit.base.C11008b.C11009a;
import com.bytedance.ies.uikit.base.C11008b.C11011c;
import com.p280ss.android.ugc.aweme.C21773q;
import com.p280ss.android.ugc.aweme.app.p1020a.C22730a;
import com.p280ss.android.ugc.aweme.base.activity.CustomErrorActivity;
import com.p280ss.android.ugc.aweme.commercialize.p1118b.C24552a;
import com.p280ss.android.ugc.aweme.commercialize.p1118b.C24553b;
import com.p280ss.android.ugc.aweme.commercialize.p1118b.C24554c;
import com.p280ss.android.ugc.aweme.commercialize.p1118b.C24555d;
import com.p280ss.android.ugc.aweme.commercialize.p1118b.C24556e;
import com.p280ss.android.ugc.aweme.commercialize.p1118b.C24557f;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.legoImp.task.FetchCombineSettingsTask;
import com.p280ss.android.ugc.aweme.legoImp.task.GeckoTask;
import com.p280ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask;
import com.p280ss.android.ugc.aweme.legoImp.task.InitRouter;
import com.p280ss.android.ugc.aweme.legoImp.task.PreloadInstanceTask;
import com.p280ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask;
import com.p280ss.android.ugc.aweme.legoImp.task.SplashAdManagerPreloadTask;
import com.p280ss.android.ugc.aweme.miniapp.impl.C33378b;
import com.p280ss.android.ugc.aweme.miniapp.impl.C33400h;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30556d;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22377b;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22378c;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22380e;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22381f;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22382g;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22384i;
import com.p280ss.android.ugc.aweme.p984ad.services.C22463a.C22464a;
import com.p280ss.android.ugc.aweme.p984ad.services.IAdService;
import com.p280ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.p280ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.p280ss.android.ugc.aweme.update.UpdateHelper;
import com.p280ss.android.ugc.aweme.util.C42869b;
import com.p280ss.android.ugc.aweme.util.C42881i;

/* renamed from: com.ss.android.ugc.aweme.app.r */
public abstract class C23020r implements C6865al {
    /* renamed from: a */
    public final Class<? extends Activity> mo16848a() {
        return CustomErrorActivity.class;
    }

    /* renamed from: b */
    public final void mo16851b() {
        UpdateHelper.m135748a();
    }

    /* renamed from: k */
    public final void mo16864k() {
        C23018p.m75672a();
    }

    /* renamed from: c */
    public final LegoTask mo16853c() {
        return new GeckoHighPriorityCheckInRequest();
    }

    /* renamed from: d */
    public final LegoTask mo16855d() {
        return new GeckoCheckInRequest();
    }

    /* renamed from: e */
    public final LegoTask mo16857e() {
        return new FetchCombineSettingsTask();
    }

    /* renamed from: f */
    public final LegoTask mo16859f() {
        return new GeckoTask();
    }

    /* renamed from: h */
    public final LegoTask mo16861h() {
        return new SplashAdManagerPreloadTask();
    }

    /* renamed from: i */
    public final LegoTask mo16862i() {
        return new SettingsReaderInitTask();
    }

    /* renamed from: j */
    public final LegoTask mo16863j() {
        return new PreloadInstanceTask();
    }

    /* renamed from: l */
    public final LegoTask mo16865l() {
        return new InitRouter();
    }

    /* renamed from: m */
    public final LegoTask mo16866m() {
        return new InitLiveServiceTask();
    }

    /* renamed from: n */
    public final Object mo16867n() {
        return new C33378b();
    }

    /* renamed from: o */
    public final Object mo16868o() {
        return new C33400h();
    }

    /* renamed from: g */
    public final void mo16860g() {
        C11008b.m32268a((C11009a) AwemeAppData.m65765a());
        C11008b.m32269a((C11011c) AwemeAppData.m65765a());
    }

    /* renamed from: c */
    public final void mo16854c(Application application) {
        C42869b.m136123a(application);
    }

    /* renamed from: d */
    public final void mo16856d(Application application) {
        C22730a.m75099a(application);
    }

    /* renamed from: b */
    public final void mo16852b(Application application) {
        C42881i.m136160a(application);
    }

    /* renamed from: f */
    static final /* synthetic */ IIMService m75680f(Application application) {
        IIMService a = C30556d.m99809a(true, false);
        if (a == null) {
            return null;
        }
        C30553b.m99782a(application, a);
        return a;
    }

    /* renamed from: a */
    public final void mo16850a(Context context) {
        new C21773q().mo58118a(context);
    }

    /* renamed from: e */
    public final void mo16858e(Application application) {
        ServiceManager.get().bind(IIMService.class, new C23021s(application)).asSingleton();
    }

    /* renamed from: a */
    public final void mo16849a(Application application) {
        IAdService iAdService = (IAdService) ServiceManager.get().getService(IAdService.class);
        if (iAdService != null) {
            iAdService.init(application, new C22464a().mo59041a((C22381f) new C24555d()).mo59043a((C22384i) new C24557f()).mo59038a((C22377b) new C24552a()).mo59039a((C22378c) new C24553b()).mo59040a((C22380e) new C24554c()).mo59042a((C22382g) new C24556e()).mo59044a());
        }
    }
}
