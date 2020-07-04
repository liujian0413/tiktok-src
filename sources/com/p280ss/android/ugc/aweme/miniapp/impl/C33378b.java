package com.p280ss.android.ugc.aweme.miniapp.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.Config;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.CookieManager;
import com.bytedance.apm.C6159b;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.p236a.C6154d;
import com.bytedance.common.utility.reflect.C6322b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12125f;
import com.bytedance.lighten.loader.C12176q;
import com.facebook.cache.p683a.C13244c;
import com.facebook.common.internal.C13310j;
import com.facebook.common.memory.C13318c;
import com.facebook.common.p684a.C13273b;
import com.facebook.common.p684a.C13274c;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.p686c.C13288c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.animated.base.C13539b;
import com.facebook.imagepipeline.animated.p712a.C13520b;
import com.facebook.imagepipeline.p710a.p711a.C13513a;
import com.facebook.imagepipeline.p716c.C13586q;
import com.facebook.imagepipeline.p717d.C13613j;
import com.p1843tt.appbrandimpl.C46573a;
import com.p1843tt.appbrandimpl.C46573a.C46575a;
import com.p1843tt.appbrandimpl.C46573a.C46576b;
import com.p1843tt.appbrandimpl.C46581e;
import com.p1843tt.appbrandimpl.MicroAppApi;
import com.p1843tt.miniapphost.AppBrandLogger;
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.agilelogger.C19159a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.p284b.C6729a;
import com.p280ss.android.ugc.aweme.C21643ad;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.IAccountService.C21077a;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.util.C22328g;
import com.p280ss.android.ugc.aweme.app.C22772af;
import com.p280ss.android.ugc.aweme.app.application.C22868f;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.image.C32034d;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33438b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33450a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33457b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33458c;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33462f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33463g;
import com.p280ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent.C33461a;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33423a;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33427b;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33428c;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33430e;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33432g;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.p1398a.C33424a;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.p1398a.C33425b;
import com.p280ss.android.ugc.aweme.net.C34098r;
import com.p280ss.android.ugc.aweme.net.C34103w;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b */
public final class C33378b implements C33438b {

    /* renamed from: a */
    private final String f87217a;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$a */
    static final class C33379a implements C21083g {

        /* renamed from: a */
        final /* synthetic */ C33428c f87218a;

        C33379a(C33428c cVar) {
            this.f87218a = cVar;
        }

        /* renamed from: a */
        public final void mo56868a(int i, int i2, Object obj) {
            if (this.f87218a != null) {
                this.f87218a.mo85667a(i, i2, obj);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$b */
    static final class C33380b<T> implements C6892b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C33430e f87219a;

        C33380b(C33430e eVar) {
            this.f87219a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(Boolean bool) {
            C33430e eVar = this.f87219a;
            C33461a aVar = new C33461a();
            if (bool == null) {
                C7573i.m23580a();
            }
            eVar.mo85669a(aVar.mo85772a(bool.booleanValue()).mo85773a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$c */
    static final class C33381c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33427b f87220a;

        /* renamed from: b */
        final /* synthetic */ String f87221b;

        /* renamed from: c */
        final /* synthetic */ C46573a f87222c;

        C33381c(C33427b bVar, String str, C46573a aVar) {
            this.f87220a = bVar;
            this.f87221b = str;
            this.f87222c = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87220a.mo85666a(this.f87221b);
            this.f87222c.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$d */
    static final class C33382d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33427b f87223a;

        /* renamed from: b */
        final /* synthetic */ C46573a f87224b;

        C33382d(C33427b bVar, C46573a aVar) {
            this.f87223a = bVar;
            this.f87224b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87223a.mo85665a();
            this.f87224b.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$e */
    public static final class C33383e implements C23305g {

        /* renamed from: a */
        final /* synthetic */ C33432g f87225a;

        /* renamed from: b */
        final /* synthetic */ C33384f f87226b;

        /* renamed from: a */
        public final void mo58663a() {
            this.f87225a.mo85673a();
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
            C6861a.m21332a().removeLoginOrLogoutListener(this.f87226b);
            this.f87225a.mo85674a(null);
        }

        C33383e(C33432g gVar, C33384f fVar) {
            this.f87225a = gVar;
            this.f87226b = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$f */
    public static final class C33384f implements C21077a {

        /* renamed from: a */
        final /* synthetic */ C33432g f87227a;

        C33384f(C33432g gVar) {
            this.f87227a = gVar;
        }

        /* renamed from: a */
        public final void mo56854a(int i, boolean z, int i2, User user) {
            if (user == null || !z) {
                this.f87227a.mo85674a(null);
            } else {
                this.f87227a.mo85673a();
            }
            C6861a.m21332a().removeLoginOrLogoutListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$g */
    static final class C33385g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46573a f87228a;

        /* renamed from: b */
        final /* synthetic */ OnClickListener f87229b;

        C33385g(C46573a aVar, OnClickListener onClickListener) {
            this.f87228a = aVar;
            this.f87229b = onClickListener;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87228a.dismiss();
            this.f87229b.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$h */
    static final class C33386h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f87230a;

        /* renamed from: b */
        final /* synthetic */ C46573a f87231b;

        C33386h(OnClickListener onClickListener, C46573a aVar) {
            this.f87230a = onClickListener;
            this.f87231b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87230a.onClick(view);
            this.f87231b.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$i */
    static final class C33387i implements C6154d {

        /* renamed from: a */
        public static final C33387i f87232a = new C33387i();

        C33387i() {
        }

        /* renamed from: a */
        public final void mo14820a() {
            try {
                ALog.m20868d();
                ALog.m20872f();
                Thread.sleep(1000);
            } catch (Exception unused) {
                AppBrandLogger.m146383e("TMA_BaseLibDependImpl", "[uploadAlogInternal] Error in flush Alog to file!");
            }
        }
    }

    /* renamed from: a */
    public final String mo85564a() {
        return "scan_code_result";
    }

    /* renamed from: b */
    public final String mo85587b() {
        return "scan_code_type";
    }

    /* renamed from: d */
    public final void mo85592d() {
        C33388c.m108003a();
    }

    /* renamed from: a */
    public final void mo85575a(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "string");
        C10761a.m31403c(context, str).mo25750a();
    }

    /* renamed from: a */
    public final void mo85572a(Application application) {
        C7573i.m23587b(application, "application");
        Context context = application;
        C12125f.m35295a(context);
        if (!C13380c.m39173d()) {
            C13286a.m38833a((C13288c) C32034d.m104015a());
            C13520b.m39770a(1);
            Object systemService = application.getSystemService("activity");
            if (systemService != null) {
                ActivityManager activityManager = (ActivityManager) systemService;
                C13244c a = C13244c.m38715a(context).mo32456a(C7276d.m22813c()).mo32457a("fresco_cache").mo32455a((C13273b) C13274c.m38814a()).mo32458a();
                C34098r a2 = C34098r.m109769a();
                C7573i.m23582a((Object) a2, "OkHttpManager.getSingleton()");
                C13613j a3 = C13513a.m39766a(context, a2.mo86753d()).mo33194a((C13310j<C13586q>) new C22772af<C13586q>(activityManager)).mo33195a((C13318c) C12176q.m35423a()).mo33193a(a).mo33192a(Config.RGB_565).mo33199a(true).mo33200a();
                C13539b.f35902a = C13539b.m39834a().mo33079a(0).mo33081b(true).mo33080a(false).mo33078a();
                C13380c.m39168a(context, a3);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }

    /* renamed from: a */
    public final void mo85578a(Runnable runnable) {
        C7573i.m23587b(runnable, "runnable");
        C7258h.m22731d().execute(runnable);
    }

    /* renamed from: a */
    public final void mo85573a(Application application, int i, int i2, Map<String, String> map) {
        C7573i.m23587b(application, "application");
        C7573i.m23587b(map, "codemap");
        C33388c.m108005a(application, 0, i2, map);
    }

    /* renamed from: a */
    public final void mo85583a(Map<String, String> map) {
        C7573i.m23587b(map, "codemap");
        C33388c.m108006a(map);
    }

    /* renamed from: a */
    public final void mo85577a(Exception exc) {
        C7573i.m23587b(exc, "exception");
        C6921a.m21554a(exc);
    }

    /* renamed from: a */
    public final void mo85581a(String str, String str2, String str3, int i, C33430e eVar) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(str2, "microAppId");
        C7573i.m23587b(str3, "hashTagName");
        C7573i.m23587b(eVar, "callback");
        C46581e.m146380a().mo115780a(str, str2, str3, i, eVar);
    }

    /* renamed from: a */
    public final void mo85582a(String str, String str2, String str3, Throwable th) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(str2, "tag");
        if ("v".equals(str)) {
            ALog.m20857a(str2, str3);
        } else if (C42323i.f110089f.equals(str)) {
            ALog.m20867c(str2, str3);
        } else if ("d".equals(str)) {
            ALog.m20862b(str2, str3);
        } else if ("w".equals(str)) {
            ALog.m20869d(str2, str3);
        } else if ("e".equals(str)) {
            ALog.m20871e(str2, str3);
        } else if ("et".equals(str)) {
            ALog.m20863b(str2, str3, th);
        } else {
            if ("f".equals(str)) {
                ALog.m20868d();
                ALog.m20872f();
            }
        }
    }

    /* renamed from: a */
    public final void mo85580a(String str, C33423a aVar) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(aVar, "callback");
        C33396f.m108015a().mo85613a(str, aVar);
    }

    /* renamed from: a */
    public final void mo85579a(String str) {
        C7573i.m23587b(str, "type");
        C33396f.m108015a().mo85612a(str);
    }

    /* renamed from: a */
    public final void mo85574a(Context context, Bundle bundle, C33430e eVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bundle, "bundle");
        C7573i.m23587b(eVar, "callback");
        ((IIMService) ServiceManager.get().getService(IIMService.class)).enterChooseContact(context, bundle, new C33380b(eVar));
    }

    /* renamed from: a */
    public final void mo85571a(Activity activity, String str, String str2, C33432g gVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
        C7573i.m23587b(gVar, "callback");
        C33384f fVar = new C33384f(gVar);
        C6861a.m21332a().addLoginOrLogoutListener(fVar);
        C32656f.m105744a(activity, str, "click_mp", (Bundle) null, (C23305g) new C33383e(gVar, fVar));
    }

    /* renamed from: a */
    public final void mo85576a(Context context, String str, JSONObject jSONObject) {
        C7573i.m23587b(context, "context");
        AppLog.recordMiscLog(context, str, jSONObject);
    }

    /* renamed from: h */
    public final boolean mo85596h() {
        return C6399b.m19944t();
    }

    /* renamed from: e */
    public final String mo85593e() {
        String a = C22868f.m75331a();
        C7573i.m23582a((Object) a, "SessionUtil.getSessionId()");
        return a;
    }

    /* renamed from: f */
    public final String mo85594f() {
        String cookie = CookieManager.getInstance().getCookie(this.f87217a);
        C7573i.m23582a((Object) cookie, "CookieManager.getInstanc…).getCookie(apiUrlPrefix)");
        return cookie;
    }

    /* renamed from: g */
    public final String mo85595g() {
        String b = C22328g.m73926b();
        C7573i.m23582a((Object) b, "CookieUtils.getCookie()");
        return b;
    }

    public C33378b() {
        StringBuilder sb = new StringBuilder("http://");
        sb.append(C6729a.f19214c);
        this.f87217a = sb.toString();
    }

    /* renamed from: c */
    public final boolean mo85591c() {
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        return ((IAVService) service).isRecording();
    }

    /* renamed from: i */
    public final C33463g mo85597i() {
        IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
        C33463g gVar = new C33463g();
        C7573i.m23582a((Object) userService, "accountUserService");
        C33463g a = gVar.mo85776a(userService.getCurUser());
        C7573i.m23582a((Object) a, "MpUser().getMpUserFromUs…countUserService.curUser)");
        return a;
    }

    /* renamed from: j */
    public final C33457b mo85598j() {
        C33457b bVar = new C33457b();
        IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
        if (userService != null) {
            bVar.f87334a = userService.isLogin();
            bVar.f87335b = userService.getAvatarUrl();
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo85584a(boolean z) {
        C34103w.m109778a();
    }

    /* renamed from: b */
    public final C33450a mo85585b(String str) {
        C7573i.m23587b(str, "aliasId");
        C33450a a = MicroAppApi.m146350a(str);
        C7573i.m23582a((Object) a, "MicroAppApi.getVideoGid(aliasId)");
        return a;
    }

    /* renamed from: b */
    public final void mo85589b(Application application) {
        C7573i.m23587b(application, "application");
        Class cls = Class.forName("com.bytedance.leakdetector.LeakDetectorInstaller");
        Class[] clsArr = {Application.class};
        Object[] objArr = {application};
        C6322b.m19610a(C6322b.m19609a(cls).mo15159a("INSTANCE", (Class<?>[]) new Class[]{cls})).mo15158a("install", (Class<?>[]) clsArr, objArr);
    }

    /* renamed from: b */
    public final void mo85590b(Runnable runnable) {
        C7573i.m23587b(runnable, "task");
        C43173w.m136929b(runnable);
    }

    /* renamed from: a */
    public final void mo85567a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.login(new C21080d().mo56860a(activity).mo56859a());
        }
    }

    /* renamed from: a */
    public final C33458c mo85563a(String str, long j) {
        C7573i.m23587b(str, "fromToken");
        C33458c a = MicroAppApi.m146351a(str, j);
        C7573i.m23582a((Object) a, "MicroAppApi.getFollowRelation(fromToken, toUid)");
        return a;
    }

    /* renamed from: a */
    public final void mo85565a(long j, long j2) {
        C19159a aVar = ALog.f19201a;
        C7573i.m23582a((Object) aVar, "ALog.sConfig");
        C6159b.m19104a(aVar.f51790d, j, j2, "feedback", (C6154d) C33387i.f87232a);
    }

    /* renamed from: b */
    public final C33462f mo85586b(long j, long j2) {
        C33462f a = MicroAppApi.m146353a(j, j2);
        C7573i.m23582a((Object) a, "MicroAppApi.mutualFollowUser(fromUid, toUid)");
        return a;
    }

    /* renamed from: b */
    public final void mo85588b(Activity activity, Intent intent) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(intent, "inputIntent");
        Context context = activity;
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get()\n   …e(IAVService::class.java)");
        Intent intent2 = new Intent(context, ((IAVService) service).getRecordPermissionActivity());
        intent2.putExtra("micro_app_class", intent.getSerializableExtra("micro_app_class"));
        intent2.putExtra("micro_app_info", intent.getSerializableExtra("micro_app_info"));
        intent2.putExtra("translation_type", 3);
        intent2.putExtra("creation_id", intent.getStringExtra("creation_id"));
        intent2.putExtra("shoot_way", "mp_record");
        intent2.putExtra("sticker_id", intent.getStringExtra("sticker_id"));
        activity.startActivity(intent2);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
    }

    /* renamed from: a */
    public final void mo85568a(Activity activity, Intent intent) {
        C7573i.m23587b(activity, "activity");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).startCutMultiVideoActivityForResult(activity, intent, 1);
    }

    /* renamed from: a */
    public final void mo85566a(long j, C33424a aVar, C33425b bVar, boolean z) {
        C7573i.m23587b(aVar, "callInBackgroundCallback");
        C7573i.m23587b(bVar, "continueCallback");
        C33388c.m108004a(j, aVar, bVar, z);
    }

    /* renamed from: a */
    public final void mo85570a(Activity activity, String str, Bundle bundle, C33428c cVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "var2");
        C7573i.m23587b(cVar, "listener");
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            C21643ad bindService = iAccountService.bindService();
            if (bindService != null) {
                bindService.bindMobile(activity, str, null, new C33379a(cVar));
            }
        }
    }

    /* renamed from: a */
    public final Dialog mo85562a(Activity activity, String str, String str2, String str3, C33427b bVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str3, "icon");
        C7573i.m23587b(bVar, "action");
        C46573a a = new C46575a().mo115769a(activity.getString(R.string.auy), C46576b.f120051d).mo115773b(activity.getString(R.string.bb5, new Object[]{str2}), C46576b.f120051d).mo115774c(str, C46576b.f120051d).mo115775d(activity.getString(R.string.ddy), C46576b.f120051d).mo115776e(activity.getString(R.string.c50), C46576b.f120051d).mo115768a(str3).mo115771a((Context) activity);
        a.mo115764b(new C33381c(bVar, str, a));
        a.mo115763a(new C33382d(bVar, a));
        a.setCancelable(false);
        C7573i.m23582a((Object) a, "dialog");
        return a;
    }

    /* renamed from: a */
    public final void mo85569a(Activity activity, C33458c cVar, long j, OnClickListener onClickListener, OnClickListener onClickListener2) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(cVar, "relation");
        C7573i.m23587b(onClickListener, "leftButtonListener");
        C7573i.m23587b(onClickListener2, "rightButtonListener");
        C46576b bVar = new C46576b(true, -1, -1);
        C46573a a = new C46575a().mo115769a(activity.getString(R.string.b89), bVar).mo115774c(activity.getString(R.string.rd), new C46576b(false, -1, Color.parseColor("#c0161823"))).mo115775d(activity.getString(R.string.w_), C46576b.f120051d).mo115776e(activity.getString(R.string.e45), bVar).mo115770a(false).mo115771a((Context) activity);
        a.mo115764b(new C33385g(a, onClickListener));
        a.mo115763a(new C33386h(onClickListener2, a));
        a.setCancelable(false);
        a.show();
    }
}
