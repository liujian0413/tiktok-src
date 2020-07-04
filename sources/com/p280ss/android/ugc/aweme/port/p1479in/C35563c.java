package com.p280ss.android.ugc.aweme.port.p1479in;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import bolts.C1592h;
import com.bef.effectsdk.C1942b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.gson.C6600e;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.C20486b;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.C20488d;
import com.p280ss.android.ttve.utils.C20504b;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.context.C15426e;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.effectplatform.C27471b;
import com.p280ss.android.ugc.aweme.effectplatform.C27483g;
import com.p280ss.android.ugc.aweme.effectplatform.C27499q;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29294b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.internal.C35613e;
import com.p280ss.android.ugc.aweme.port.internal.C35619i;
import com.p280ss.android.ugc.aweme.port.internal.C35621k;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.C36963h;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService;
import com.p280ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41387m;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.p1618a.C41239a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService;
import com.p280ss.android.ugc.effectmanager.C43681b;
import com.p280ss.android.ugc.effectmanager.C43681b.C43687a;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.DownloadableModelConfig.C43678a;
import com.p280ss.android.ugc.effectmanager.DownloadableModelConfig.ModelFileEnv;
import com.p280ss.android.ugc.effectmanager.FetchModelType;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43720b;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.model.ModelInfo;
import com.p280ss.android.ugc.gamora.integration.IIntegrationService;
import com.p280ss.android.vesdk.C45252ac;
import com.p280ss.android.vesdk.C45321i;
import dmt.p1861av.video.C47452c;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.port.in.c */
public final class C35563c {

    /* renamed from: A */
    public static C35543aj f93219A;

    /* renamed from: B */
    public static C35534ae f93220B;

    /* renamed from: C */
    public static C35576m f93221C;

    /* renamed from: D */
    public static C35581q f93222D;

    /* renamed from: E */
    public static IAVPrivacySettingService f93223E;

    /* renamed from: F */
    public static C35577n f93224F;

    /* renamed from: G */
    public static C35548am f93225G;

    /* renamed from: H */
    public static C35558as f93226H;

    /* renamed from: I */
    public static C35535af f93227I;

    /* renamed from: J */
    public static C35546al f93228J;

    /* renamed from: K */
    public static IIntegrationService f93229K;

    /* renamed from: L */
    public static AVSettings f93230L;

    /* renamed from: M */
    public static AVAB f93231M;

    /* renamed from: N */
    public static C36963h f93232N;

    /* renamed from: O */
    private static C35572j f93233O;

    /* renamed from: P */
    private static volatile boolean f93234P;

    /* renamed from: Q */
    private static volatile C35565a f93235Q;

    /* renamed from: R */
    private static final Object f93236R = new Object();

    /* renamed from: S */
    private static ReentrantLock f93237S = new ReentrantLock();

    /* renamed from: a */
    public static Application f93238a;

    /* renamed from: b */
    public static C6600e f93239b;

    /* renamed from: c */
    public static C35578o f93240c;

    /* renamed from: d */
    public static C35584s f93241d;

    /* renamed from: e */
    public static C35533ad f93242e;

    /* renamed from: f */
    public static C35553ap f93243f;

    /* renamed from: g */
    public static C35582r f93244g;

    /* renamed from: h */
    public static C35603z f93245h;

    /* renamed from: i */
    public static IAVMusicService f93246i;

    /* renamed from: j */
    public static C35575l f93247j;

    /* renamed from: k */
    public static C35599w f93248k;

    /* renamed from: l */
    public static C35554aq f93249l;

    /* renamed from: m */
    public static C35538ah f93250m;

    /* renamed from: n */
    public static C35590t f93251n;

    /* renamed from: o */
    public static C35544ak f93252o;

    /* renamed from: p */
    public static C35559at f93253p;

    /* renamed from: q */
    public static IVideoConfigService f93254q;

    /* renamed from: r */
    public static IVideoConfigService f93255r;

    /* renamed from: s */
    public static C35557ar f93256s;

    /* renamed from: t */
    public static C35541ai f93257t;

    /* renamed from: u */
    public static C35601y f93258u;

    /* renamed from: v */
    public static C35580p f93259v;

    /* renamed from: w */
    public static C21164d f93260w;

    /* renamed from: x */
    public static C35549an f93261x;

    /* renamed from: y */
    public static C35552ao f93262y;

    /* renamed from: z */
    public static C35593v f93263z;

    /* renamed from: com.ss.android.ugc.aweme.port.in.c$a */
    public interface C35565a {
        /* renamed from: a */
        C45321i mo90380a();
    }

    /* renamed from: c */
    public static boolean m114836c() {
        return f93233O.f93274a;
    }

    /* renamed from: i */
    static final /* synthetic */ Void m114842i() throws Exception {
        if (!f93234P) {
            m114829a(f93235Q.mo90380a());
        }
        return null;
    }

    /* renamed from: j */
    static final /* synthetic */ C45321i m114843j() {
        new C39967gn();
        return C39967gn.m127849a();
    }

    static {
        m114826a(C35574k.f93282a, C35574k.f93283b);
        m114828a(C35570h.f93271a);
    }

    /* renamed from: b */
    public static String m114835b() {
        StringBuilder sb = new StringBuilder();
        f93233O.mo90386a((C17440n<Activity>) new C35567e<Activity>(sb));
        return sb.toString();
    }

    /* renamed from: d */
    public static synchronized C29294b m114837d() {
        C29294b d;
        synchronized (C35563c.class) {
            d = C35574k.m114859a().mo70097l().mo74951d();
        }
        return d;
    }

    /* renamed from: h */
    public static String m114841h() {
        if (!C7163a.m22363a() || !f93231M.mo93305a(Property.GetEffectVersionFromLib)) {
            return "6.0.0";
        }
        return C45252ac.m142769b();
    }

    /* renamed from: k */
    private static ModelFileEnv m114844k() {
        if (!C7163a.m22363a() || !f93230L.mo93342a(AVSettings.Property.ModelFileTestEnv)) {
            return ModelFileEnv.ONLINE;
        }
        return ModelFileEnv.TEST;
    }

    /* renamed from: a */
    public static boolean m114832a() {
        return f93233O.mo90386a(C35566d.f93267a);
    }

    /* renamed from: g */
    public static String m114840g() {
        String str;
        if (!C7163a.m22363a() || !f93231M.mo93305a(Property.UseEffectCam)) {
            str = "142710f02c3a11e8b42429f14557854a";
        } else {
            str = "68d32050064f11e891efe7cc07299bc5";
        }
        if (!str.equals("142710f02c3a11e8b42429f14557854a")) {
            return str;
        }
        if (!C7163a.m22363a() || !f93231M.mo93305a(Property.UsePlanQi)) {
            return "142710f02c3a11e8b42429f14557854a";
        }
        return "9f623eb0ee4911e98a27811dc5ef9137";
    }

    /* renamed from: f */
    public static void m114839f() {
        if (C35574k.m114859a().mo70096k().mo93305a(Property.EnableAsyncInitVesdk)) {
            if (!f93234P) {
                m114829a(f93235Q.mo90380a());
            }
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                C1592h.m7855a(C35569g.f93270a, C1592h.f5958b).mo6892g();
            } catch (InterruptedException unused) {
            }
        } else if (!f93234P) {
            m114829a(f93235Q.mo90380a());
        }
    }

    /* renamed from: e */
    public static void m114838e() {
        C43720b bVar;
        ExecutorService executorService;
        synchronized (f93236R) {
            if (!C43681b.m138406a()) {
                final boolean a = f93231M.mo93305a(Property.UseNewEffectExecutorType);
                final boolean a2 = f93231M.mo93305a(Property.PreFetchPopEffectModel);
                final int b = f93231M.mo93306b(Property.FetchEffectModelType);
                C43834g a3 = EffectPlatform.m90011a((Context) f93238a, f93245h.mo83209c(), f93220B.getOKHttpClient(), C35574k.m114859a().mo70092g().mo70113a()).mo105986a();
                C43678a a4 = new C43678a().mo105656a(f93238a.getAssets()).mo105661a((C43721c) new C27483g()).mo105662a((C43722d) new C20504b()).mo105670d(EffectPlatform.m90014c()).mo105671e("142710f02c3a11e8b42429f14557854a").mo105668b(Build.MODEL).mo105665a(EffectPlatform.m90013b()).mo105669c(m114841h()).mo105672f(f93231M.mo93309e(Property.EffectExclusionPattern)).mo105664a(new File(f93238a.getFilesDir(), "effectmodel").getPath());
                if (f93231M.mo93305a(Property.EffectPlatformUseTTNet)) {
                    bVar = new C27499q();
                } else {
                    bVar = new C27471b(f93220B.getOKHttpClient());
                }
                C43678a a5 = a4.mo105660a(bVar).mo105663a(a3);
                if (a) {
                    executorService = C7258h.m22730c();
                } else {
                    executorService = C1592h.f5957a;
                }
                C43681b.m138404a(a5.mo105666a((Executor) executorService).mo105659a((C43687a) new C43687a() {
                    /* renamed from: a */
                    public final void mo90379a(Effect effect, Exception exc) {
                        StringBuilder sb = new StringBuilder("onModelNotFound");
                        sb.append(Log.getStackTraceString(exc));
                        C41530am.m132283b(sb.toString());
                        C6893q.m21444a("model_not_found_rate", 1, C38510bb.m123095a().mo96481a("errorDesc", Log.getStackTraceString(exc)).mo96479a("executor_type", Integer.valueOf(a ? 1 : 0)).mo96479a("prefetch_model", Integer.valueOf(a2 ? 1 : 0)).mo96479a("zip_model", Integer.valueOf(b)).mo96482b());
                    }

                    /* renamed from: a */
                    public final void mo90377a(Effect effect, ModelInfo modelInfo, long j) {
                        StringBuilder sb = new StringBuilder("onModelDownloadSuccess ");
                        sb.append(effect.getName());
                        sb.append(" requirements ");
                        sb.append(modelInfo.getName());
                        C41530am.m132280a(sb.toString());
                        C6893q.m21444a("model_download_time", 0, C38510bb.m123095a().mo96480a("duration", Long.valueOf(j)).mo96482b());
                        C6893q.m21444a("service_model_download_error_rate", 0, C38510bb.m123095a().mo96479a("executor_type", Integer.valueOf(a ? 1 : 0)).mo96479a("prefetch_model", Integer.valueOf(a2 ? 1 : 0)).mo96479a("zipModel", Integer.valueOf(b)).mo96482b());
                    }

                    /* renamed from: a */
                    public final void mo90378a(Effect effect, ModelInfo modelInfo, Exception exc) {
                        StringBuilder sb = new StringBuilder("onModelDownloadError ");
                        sb.append(effect.getName());
                        sb.append(" requirements ");
                        sb.append(modelInfo.getName());
                        C41530am.m132283b(sb.toString());
                        C6893q.m21444a("service_model_download_error_rate", 1, C38510bb.m123095a().mo96481a("errorDesc", Log.getStackTraceString(exc)).mo96479a("executor_type", Integer.valueOf(a ? 1 : 0)).mo96479a("prefetch_model", Integer.valueOf(a2 ? 1 : 0)).mo96479a("zip_model", Integer.valueOf(b)).mo96482b());
                    }
                }).mo105657a(m114844k()).mo105658a(FetchModelType.fromValue(b)).mo105667a());
                C43681b.m138405a(C35568f.f93269a);
            }
        }
    }

    /* renamed from: a */
    private static void m114828a(C35565a aVar) {
        f93235Q = aVar;
    }

    /* renamed from: a */
    public static void m114830a(Class<?> cls) {
        f93233O.mo90385a(cls);
    }

    /* renamed from: a */
    public static void m114829a(C45321i iVar) {
        C41530am.m132285d("AVEnv initVESDK start");
        if (!f93234P) {
            try {
                f93237S.lock();
                if (!f93234P) {
                    if (C6399b.m19944t()) {
                        TENativeLibsLoader.m67982a(((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().getLibraryLoader(f93238a));
                    }
                    m114838e();
                    m114827a((C1942b) C43681b.m138407b().mo105682f(), iVar);
                    C35560au.m114825a(f93238a);
                    f93234P = true;
                }
            } finally {
                f93237S.unlock();
            }
        }
        C41530am.m132285d("AVEnv initVESDK end");
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m114833a(Activity activity) {
        if (!(activity instanceof C41387m) || !((C41387m) activity).mo88338b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m114827a(C1942b bVar, C45321i iVar) {
        C6855a.f19498b.mo16718a((C15426e) new C35518a(bVar, C41239a.m131841a(f93238a), iVar));
    }

    /* renamed from: a */
    private static void m114826a(Application application, C35577n nVar) {
        f93238a = application;
        f93224F = nVar;
        f93239b = nVar.mo70085S();
        f93233O = new C35572j(application);
        f93240c = f93224F.mo70102q();
        f93241d = f93224F.mo70103r();
        f93242e = f93224F.mo70104s();
        f93243f = f93224F.mo70105t();
        f93244g = (C35582r) C17439m.m57962a(f93224F.mo70106u());
        f93245h = f93224F.mo70107v();
        f93246i = f93224F.mo70086a();
        f93256s = f93224F.mo70108w();
        f93257t = f93224F.mo70109x();
        f93247j = f93224F.mo70110y();
        f93248k = f93224F.mo70111z();
        f93249l = f93224F.mo70067A();
        f93250m = f93224F.mo70068B();
        f93251n = f93224F.mo70069C();
        f93252o = f93224F.mo70070D();
        f93258u = f93224F.mo70071E();
        f93259v = f93224F.mo70072F();
        f93260w = f93224F.mo70073G();
        f93261x = f93224F.mo70074H();
        f93262y = f93224F.mo70075I();
        f93263z = f93224F.mo70076J();
        f93219A = f93224F.mo70077K();
        f93220B = f93224F.mo70078L();
        f93221C = f93224F.mo70079M();
        f93222D = f93224F.mo70080N();
        f93223E = f93224F.mo70087b();
        f93225G = f93224F.mo70081O();
        f93226H = f93224F.mo70082P();
        f93227I = f93224F.mo70084R();
        f93228J = f93224F.mo70083Q();
        f93230L = f93224F.mo70091f();
        f93253p = new C35621k();
        f93231M = f93224F.mo70096k();
        f93254q = new C35619i();
        f93255r = new C35613e();
        f93232N = new C36963h();
        f93229K = (IIntegrationService) ServiceManager.get().getService(IIntegrationService.class);
        if (f93231M.mo93305a(Property.LoadLibraryFromExternal)) {
            TENativeLibsLoader.m67982a((C20488d) new C47452c(application, new C20486b()));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m114834a(StringBuilder sb, Activity activity) {
        if (activity instanceof C41387m) {
            sb.append(activity);
            sb.append(" isRecording: ");
            sb.append(((C41387m) activity).mo88338b());
            sb.append("\n");
        } else {
            sb.append(activity);
            sb.append("\n");
        }
        return false;
    }
}
