package com.p280ss.android.ugc.aweme.requestcombine;

import android.content.Context;
import bolts.C1592h;
import com.alibaba.fastjson.JSON;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C12534t;
import com.google.gson.C6607f;
import com.google.gson.C6717s;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.api.BaseResponseObjectTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.app.api.CollectionTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.app.api.UserTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.requestcombine.api.SettingCombineApi.C37219a;
import com.p280ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel;
import com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37205a;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37206b;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37208c;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37209d;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37211e;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37212f;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37213g;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37214h;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37215i;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37216j;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37217k;
import com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37218l;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import com.p280ss.android.ugc.aweme.utils.C43056dh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a */
public final class C37199a implements C37221c {

    /* renamed from: a */
    public static final C37199a f97322a = new C37199a();

    /* renamed from: b */
    private static SettingCombineModel f97323b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ArrayList<C7194d> f97324c = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static HashMap<String, C37205a> f97325d = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$a */
    static final class C37200a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ long f97326a;

        C37200a(long j) {
            this.f97326a = j;
        }

        public final /* synthetic */ Object call() {
            m119581a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m119581a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cost_duration", this.f97326a);
                C6877n.m21444a("settings_response_cost_duration", 1, C6869c.m21382a(jSONObject).mo16888b());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$b */
    static final class C37201b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C37201b f97327a = new C37201b();

        C37201b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m119582a((C12534t) obj);
        }

        /* renamed from: a */
        private static SettingCombineModel m119582a(C12534t<String> tVar) {
            C7573i.m23587b(tVar, "it");
            C6607f createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
            createAdapterGsonBuilder.mo15985a((C6717s) new CollectionTypeAdapterFactory());
            createAdapterGsonBuilder.mo15985a((C6717s) new MusicTypeAdapterFactory());
            createAdapterGsonBuilder.mo15985a((C6717s) new UserTypeAdapterFactory());
            createAdapterGsonBuilder.mo15986a(BackgroundVideo.class, new BackgroundVideoDeserializer());
            createAdapterGsonBuilder.mo15985a((C6717s) new BaseResponseObjectTypeAdapterFactory());
            return (SettingCombineModel) ((SettingCombineModel) createAdapterGsonBuilder.mo15992f().mo15974a((String) tVar.f33302b, SettingCombineModel.class)).checkValid();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$c */
    public static final class C37202c implements C7498y<SettingCombineModel> {

        /* renamed from: a */
        final /* synthetic */ Context f97328a;

        /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$c$a */
        static final class C37203a<V> implements Callable<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C37202c f97329a;

            /* renamed from: b */
            final /* synthetic */ String f97330b;

            /* renamed from: c */
            final /* synthetic */ int f97331c;

            C37203a(C37202c cVar, String str, int i) {
                this.f97329a = cVar;
                this.f97330b = str;
                this.f97331c = i;
            }

            public final /* synthetic */ Object call() {
                m119584a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m119584a() {
                if (C37220b.m119653a(this.f97329a.f97328a)) {
                    C6893q.m21444a("combine_settings_monitor_service", 1, C42967ba.m136396a().mo104680a("errorDesc", this.f97330b).mo104679a("requestCount", Integer.valueOf(this.f97331c)).mo104681b());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.requestcombine.a$c$b */
        static final class C37204b<V> implements Callable<C7581n> {

            /* renamed from: a */
            final /* synthetic */ int f97332a;

            C37204b(int i) {
                this.f97332a = i;
            }

            public final /* synthetic */ Object call() {
                m119585a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m119585a() {
                C6893q.m21444a("combine_settings_monitor_service", 0, C42967ba.m136396a().mo104679a("requestCount", Integer.valueOf(this.f97332a)).mo104681b());
            }
        }

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C37202c(Context context) {
            this.f97328a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(SettingCombineModel settingCombineModel) {
            C7573i.m23587b(settingCombineModel, "settingCombineModel");
            C37199a.f97322a.mo93731a(this.f97328a, settingCombineModel);
            C1592h.m7855a((Callable<TResult>) new C37204b<TResult>(C37199a.f97325d.size()), (Executor) C6907h.m21516a());
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            if ((th instanceof CronetIOException) && ((CronetIOException) th).getStatusCode() == 509) {
                return;
            }
            if (!(th instanceof ApiServerException) || ((ApiServerException) th).getErrorCode() != 509) {
                C37199a.m119571a();
                for (C7194d a : C37199a.f97324c) {
                    a.mo18678a(th);
                }
                C1592h.m7855a((Callable<TResult>) new C37203a<TResult>(this, th.getMessage(), C37199a.f97325d.size()), (Executor) C6907h.m21516a());
            }
        }
    }

    private C37199a() {
    }

    /* renamed from: c */
    private static boolean m119576c() {
        try {
            C6900g b = C6900g.m21454b();
            C7573i.m23582a((Object) b, "NetworkStateManager.getInstance()");
            return b.mo16943d();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo93733b() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        AbTestModel d = a.mo18803bo();
        if (d != null) {
            return d.isUseSettingCombineApi;
        }
        return false;
    }

    /* renamed from: a */
    public static void m119571a() {
        C7126d e = C7121a.m22254e();
        for (C37205a a : f97325d.values()) {
            a.mo93739a(e);
        }
        e.mo18552a();
    }

    static {
        m119574a((C37205a) new C37212f());
        m119574a((C37205a) new C37211e());
        m119574a((C37205a) new C37213g());
        m119574a((C37205a) new C37214h());
        m119574a((C37205a) new C37215i());
        m119574a((C37205a) new C37216j());
        m119574a((C37205a) new C37217k());
        m119574a((C37205a) new C37218l());
        m119574a((C37205a) new C37208c());
        m119574a((C37205a) new C37206b());
        m119574a((C37205a) new C37209d());
    }

    /* renamed from: a */
    public final void mo93732a(C7194d dVar) {
        f97324c.add(dVar);
    }

    /* renamed from: a */
    private static void m119574a(C37205a aVar) {
        String a = aVar.mo93737a();
        if (a != null) {
            f97325d.put(a, aVar);
        }
    }

    /* renamed from: a */
    public final BaseCombineMode mo93730a(String str) {
        C7573i.m23587b(str, "url");
        C37205a aVar = (C37205a) f97325d.get(str);
        if (aVar != null) {
            return aVar.mo93741b();
        }
        return null;
    }

    /* renamed from: a */
    public static void m119572a(Context context) {
        LocationBundle locationBundle;
        Object obj;
        Object obj2;
        C7573i.m23587b(context, "context");
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = f97325d.keySet();
        C7573i.m23582a((Object) keySet, "mColdLaunchRequests.keys");
        int i = 0;
        for (String str : keySet) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(str);
            i++;
        }
        Integer num = null;
        if (C43056dh.m136600a()) {
            locationBundle = C32630h.m105696b(C6399b.m19921a()).mo83993a();
        } else {
            locationBundle = null;
        }
        if (locationBundle != null) {
            obj = Double.valueOf(locationBundle.longitude);
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        if (locationBundle != null) {
            obj2 = Double.valueOf(locationBundle.latitude);
        } else {
            obj2 = null;
        }
        String valueOf2 = String.valueOf(obj2);
        Keva repoFromSp = Keva.getRepoFromSp(context, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            num = Integer.valueOf(repoFromSp.getInt("key_has_local_cache", 0));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api_list", sb.toString());
        hashMap.put("longitude", valueOf);
        hashMap.put("latitude", valueOf2);
        hashMap.put("has_local_cache", String.valueOf(num));
        Collection<C37205a> values = f97325d.values();
        C7573i.m23582a((Object) values, "mColdLaunchRequests.values");
        for (C37205a a : values) {
            Map a2 = a.mo93738a(context);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
        }
        C37219a.m119652a().request(hashMap).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C37201b.f97327a).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C37202c<Object>(context));
    }

    /* renamed from: a */
    public final void mo93731a(Context context, SettingCombineModel settingCombineModel) {
        Integer num;
        long currentTimeMillis = System.currentTimeMillis();
        Keva repoFromSp = Keva.getRepoFromSp(context, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            repoFromSp.storeInt("key_has_local_cache", 1);
        }
        f97323b = settingCombineModel;
        C7126d dVar = new C7126d();
        for (Entry entry : f97325d.entrySet()) {
            String str = (String) entry.getKey();
            C37205a aVar = (C37205a) entry.getValue();
            if (!aVar.mo93740a(f97323b)) {
                BaseCombineMode b = aVar.mo93741b();
                if (b == null || b.getHttpCode() != 509) {
                    aVar.mo93739a(dVar);
                    C7573i.m23582a((Object) str, "key");
                    BaseCombineMode b2 = aVar.mo93741b();
                    if (b2 != null) {
                        num = Integer.valueOf(b2.getHttpCode());
                    } else {
                        num = null;
                    }
                    m119573a(context, str, num);
                }
            }
        }
        dVar.mo18552a();
        for (C7194d a : f97324c) {
            a.mo18677a();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (!C6399b.m19944t()) {
            C1592h.m7855a((Callable<TResult>) new C37200a<TResult>(currentTimeMillis2), (Executor) C6907h.m21516a());
        }
        if (settingCombineModel != null) {
            SettingCombineDataModel data = settingCombineModel.getData();
            if (data != null) {
                AwemeSettingCombineModel awemeSetting = data.getAwemeSetting();
                if (awemeSetting != null) {
                    awemeSetting.getAwemeSetting();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m119573a(Context context, String str, Integer num) {
        if (m119576c()) {
            C6893q.m21444a("combine_settings_monitor_service", 2, C42967ba.m136396a().mo104679a("errorCode", num).mo104680a("url", str).mo104681b());
        }
    }
}
