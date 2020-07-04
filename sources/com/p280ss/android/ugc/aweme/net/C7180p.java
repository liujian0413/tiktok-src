package com.p280ss.android.ugc.aweme.net;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.apm.ttnet.TTNetSampleInterceptor;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.ies.ugc.aweme.network.C10948f;
import com.bytedance.ies.ugc.aweme.network.C10955g;
import com.bytedance.ies.ugc.aweme.network.C10963h;
import com.bytedance.retrofit2.p638c.C12469a;
import com.p280ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.application.C22868f;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.net.corenet.C34061f;
import com.p280ss.android.ugc.aweme.net.corenet.IESNetDepend;
import com.p280ss.android.ugc.aweme.net.experiment.ApiLibraExperiment;
import com.p280ss.android.ugc.aweme.net.experiment.Cronet4xExperiment;
import com.p280ss.android.ugc.aweme.net.experiment.EnableNewTTNetExperiment;
import com.p280ss.android.ugc.aweme.net.experiment.LinkSelectorTypeExperiment;
import com.p280ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.secapi.C37421b;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.p */
public final class C7180p implements Runnable {

    /* renamed from: com.ss.android.ugc.aweme.net.p$a */
    public static final class C7181a implements C37421b {
        C7181a() {
        }

        /* renamed from: a */
        public final String mo18657a() {
            String a = C22868f.m75331a();
            C7573i.m23582a((Object) a, "SessionUtil.getSessionId()");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$b */
    static final class C7182b extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C7182b f20108a = new C7182b();

        C7182b() {
            super(0);
        }

        /* renamed from: a */
        private static String m22415a() {
            return C32326h.m104885g();
        }

        public final /* synthetic */ Object invoke() {
            return m22415a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$c */
    static final class C7183c extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C7183c f20109a = new C7183c();

        C7183c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m22416a());
        }

        /* renamed from: a */
        private static boolean m22416a() {
            if (C6384b.m19835a().mo15287a(LinkSelectorTypeExperiment.class, true, "link_selector_type", C6384b.m19835a().mo15295d().link_selector_type, 0) == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$d */
    static final class C7184d extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C7184d f20110a = new C7184d();

        C7184d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m22417a());
        }

        /* renamed from: a */
        private static boolean m22417a() {
            if (!C6399b.m19947w() || !C6384b.m19835a().mo15292a(EnableNewTTNetExperiment.class, true, "enable_new_ttnet", C6384b.m19835a().mo15295d().enable_new_ttnet, false)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$e */
    static final class C7185e extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C7185e f20111a = new C7185e();

        C7185e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m22418a());
        }

        /* renamed from: a */
        private static int m22418a() {
            return C6384b.m19835a().mo15287a(ApiLibraExperiment.class, true, "enable_api_libra", C6384b.m19835a().mo15295d().enable_api_libra, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$f */
    static final class C7186f extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C7186f f20112a = new C7186f();

        C7186f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m22419a());
        }

        /* renamed from: a */
        private static boolean m22419a() {
            return C6384b.m19835a().mo15292a(Cronet4xExperiment.class, true, "enable_cronet_4x", C6384b.m19835a().mo15295d().enable_cronet_4x, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.p$g */
    public static final class C7187g implements C10963h {

        /* renamed from: a */
        final /* synthetic */ C7180p f20113a;

        /* renamed from: d */
        public final void mo18661d(C10948f fVar) {
            C7573i.m23587b(fVar, "config");
        }

        C7187g(C7180p pVar) {
            this.f20113a = pVar;
        }

        /* renamed from: a */
        public final void mo18658a(C10948f fVar) {
            C7573i.m23587b(fVar, "config");
            C6857a.m21312e().mo16822a("feed_network_init_to_init_ttnet", false);
        }

        /* renamed from: b */
        public final void mo18659b(C10948f fVar) {
            C7573i.m23587b(fVar, "config");
            C6857a.m21312e().mo16827b("feed_network_init_to_init_ttnet", false);
            C6857a.m21312e().mo16822a("feed_network_init_ttnet_duration", false);
        }

        /* renamed from: c */
        public final void mo18660c(C10948f fVar) {
            C7573i.m23587b(fVar, "config");
            C6857a.m21312e().mo16827b("feed_network_init_ttnet_duration", false);
            C6857a.m21312e().mo16822a("feed_network_init_sec_duration", false);
            this.f20113a.mo18655a(C6399b.m19921a(), fVar);
            C6857a.m21312e().mo16827b("feed_network_init_sec_duration", false);
        }
    }

    /* renamed from: a */
    private static String m22412a() {
        String str;
        if (C6399b.m19944t()) {
            I18nManagerService i18nManagerService = (I18nManagerService) ServiceManager.get().getService(I18nManagerService.class);
            C7573i.m23582a((Object) i18nManagerService, "i18nManagerService");
            str = i18nManagerService.getAppLanguage();
        } else {
            Locale locale = Locale.getDefault();
            C7573i.m23582a((Object) locale, "Locale.getDefault()");
            str = locale.getLanguage();
        }
        if (str != null) {
            if (str != null) {
                String lowerCase = str.toLowerCase();
                C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                if (lowerCase != null) {
                    return lowerCase;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return "";
    }

    public final void run() {
        Context a = C6399b.m19921a();
        if (a != null) {
            C10955g gVar = new C10955g((Application) a);
            gVar.f29644a = new IESNetDepend();
            gVar.f29645b = C7179f.f20106b;
            gVar.f29646c = new C34061f(C6399b.m19921a());
            gVar.f29649f = C6399b.m19941q();
            gVar.f29650g = true;
            gVar.f29648e = C6399b.m19929e();
            gVar.f29647d = C6399b.m19935k();
            gVar.f29651h = C7258h.m22730c();
            gVar.f29652i = C19223b.f51886a;
            gVar.mo26441a((C12469a) new UrlTransformInterceptorTTNet());
            if (C7163a.m22363a()) {
                IAnyWhereDoor iAnyWhereDoor = (IAnyWhereDoor) ServiceManager.get().getService(IAnyWhereDoor.class);
                if (iAnyWhereDoor != null) {
                    C12469a networkInterceptor = iAnyWhereDoor.getNetworkInterceptor();
                    if (networkInterceptor != null) {
                        gVar.mo26441a(networkInterceptor);
                    }
                }
            }
            Object service = ServiceManager.get().getService(InterceptorProvider.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ptorProvider::class.java)");
            List<C12469a> interceptors = ((InterceptorProvider) service).getInterceptors();
            if (!C6307b.m19566a((Collection<T>) interceptors)) {
                for (C12469a aVar : interceptors) {
                    C7573i.m23582a((Object) aVar, "interceptor");
                    gVar.mo26441a(aVar);
                }
            }
            if (C6399b.m19945u()) {
                gVar.mo26441a((C12469a) new TTNetSampleInterceptor());
            }
            gVar.mo26442a((C7561a<String>) C7182b.f20108a);
            gVar.mo26443b(C7183c.f20109a);
            gVar.mo26445d(C7184d.f20110a);
            gVar.mo26444c(C7185e.f20111a);
            gVar.mo26446e(C7186f.f20112a);
            C10944e.m32114a(gVar.mo26440a(), new C7187g(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
    }

    /* renamed from: a */
    public final void mo18655a(Context context, C10948f fVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C6776h.m20947b(context)) {
            String str = fVar.f29624f;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String str3 = fVar.f29625g;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str3;
            Context context2 = context;
            ((ISecApi) ServiceManager.get().getService(ISecApi.class)).initSec(context2, m22412a(), fVar.f29623e, str2, str4, fVar.f29626h, new C7181a());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        new StringBuilder("sec init cost time:").append(elapsedRealtime2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sec_init_time", elapsedRealtime2);
        } catch (JSONException unused) {
        }
        C6893q.m21452b("sec_init_time", "", jSONObject);
    }
}
