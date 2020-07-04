package com.p280ss.android.ugc.aweme.setting.api;

import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.discover.p1185ui.GetABTest;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37528a;
import com.p280ss.android.ugc.aweme.setting.C7211b;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.share.C37954a;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.AbTestApi */
public final class AbTestApi {

    /* renamed from: a */
    public static ABTestApi f20146a = ((ABTestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ABTestApi.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.api.AbTestApi$ABTestApi */
    interface ABTestApi {
        @C7730f(mo20420a = "/aweme/v1/abtest/param/")
        C1592h<C6711m> querySettings(@C7744t(mo20436a = "last_settings_version") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.api.AbTestApi$AbTestResponse */
    public static class AbTestResponse {
        @C6593c(mo15949a = "data")
        public AbTestModel data;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.api.AbTestApi$AbTestResponse2 */
    public static class AbTestResponse2 {
        @C6593c(mo15949a = "data")
        public C6711m data;
    }

    /* renamed from: a */
    public static void m22476a(boolean z) {
        f20146a.querySettings(C6887b.m21436b().mo16905b((Context) AwemeApplication.m21341a(), "last_ab_setting_version", "")).mo6875a(C37570a.f97990a).mo6876a((C1591g<TResult, TContinuationResult>) new C37571b<TResult,TContinuationResult>(z), C1592h.f5958b);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m22473a(C1592h hVar) throws Exception {
        try {
            if (hVar.mo6887c()) {
                return Boolean.valueOf(false);
            }
            if (hVar.mo6889d()) {
                return Boolean.valueOf(false);
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().updateABTestModel((C6711m) hVar.mo6890e());
            C37954a.m121243a((C6711m) hVar.mo6890e());
            GetABTest.f70977d.mo69585a((C6711m) hVar.mo6890e());
            AbTestResponse abTestResponse = null;
            if (C10944e.m32113a() != null) {
                abTestResponse = (AbTestResponse) C10944e.m32113a().mo15970a((C6709k) hVar.mo6890e(), AbTestResponse.class);
                if (C6399b.m19928c()) {
                    AbTestResponse2 abTestResponse2 = (AbTestResponse2) C10944e.m32113a().mo15970a((C6709k) hVar.mo6890e(), AbTestResponse2.class);
                    if (!(abTestResponse2 == null || abTestResponse2.data == null)) {
                        C7211b.m22491b(abTestResponse2.data);
                    }
                }
            }
            if (abTestResponse != null) {
                if (abTestResponse.data != null) {
                    if (C6399b.m19944t()) {
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).updateTTAbTest(abTestResponse.data);
                    }
                    C7213d.m22500a().mo18733a(abTestResponse.data);
                    C6711m e = ((C6711m) hVar.mo6890e()).mo16136m().mo16152e("data");
                    if (e != null) {
                        C6857a.m21312e().mo16822a("method_save_abtest_keva", false);
                        C6384b.m19835a();
                        C6384b.m19844a(e);
                        C6857a.m21312e().mo16827b("method_save_abtest_keva", false);
                        C37528a.f97902a.mo94818a();
                    }
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (Exception unused) {
            return Boolean.valueOf(false);
        } catch (IncompatibleClassChangeError unused2) {
        }
    }

    /* renamed from: a */
    public static void m22477a(final boolean z, C6709k kVar) {
        if (kVar != null) {
            try {
                C7492s.m23282a((C7495v<T>) new C37572c<T>(kVar)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<Boolean>() {
                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                    }

                    public final void onSubscribe(C7321c cVar) {
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onNext(Boolean bool) {
                        C7213d.m22500a().mo18736a(true, z);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m22475a(C6709k kVar, C47870u uVar) throws Exception {
        try {
            AbTestResponse abTestResponse = (AbTestResponse) C10944e.m32113a().mo15970a(kVar, AbTestResponse.class);
            if (C6399b.m19928c()) {
                AbTestResponse2 abTestResponse2 = (AbTestResponse2) C10944e.m32113a().mo15970a(kVar, AbTestResponse2.class);
                if (!(abTestResponse2 == null || abTestResponse2.data == null)) {
                    C7211b.m22491b(abTestResponse2.data);
                }
            }
            if (abTestResponse != null) {
                if (abTestResponse.data != null) {
                    C6711m m = kVar.mo16136m();
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().updateABTestModel(m);
                    ((IMusicService) ServiceManager.get().getService(IMusicService.class)).updateMusicAbTestModel(m);
                    C37954a.m121243a(m);
                    GetABTest.f70977d.mo69585a(m);
                    if (C6399b.m19944t()) {
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).updateTTAbTest(abTestResponse.data);
                    }
                    C7213d.m22500a().mo18733a(abTestResponse.data);
                    C6711m e = kVar.mo16136m().mo16152e("data");
                    if (e != null) {
                        C6857a.m21312e().mo16822a("method_save_abtest_keva", false);
                        C6384b.m19835a();
                        C6384b.m19844a(e);
                        C6857a.m21312e().mo16827b("method_save_abtest_keva", false);
                        C37528a.f97902a.mo94818a();
                    }
                    uVar.mo19239a((Object) Boolean.valueOf(true));
                }
            }
        } catch (Exception unused) {
        }
    }
}
