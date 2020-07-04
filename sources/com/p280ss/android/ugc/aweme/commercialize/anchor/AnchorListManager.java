package com.p280ss.android.ugc.aweme.commercialize.anchor;

import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.keva.Keva;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lancet.CommerceException;
import com.p280ss.android.ugc.aweme.util.C42880h;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager */
public final class AnchorListManager {

    /* renamed from: a */
    public static final AnchorListManager f64708a = new AnchorListManager();

    /* renamed from: b */
    private static final AnchorListApi f64709b = ((AnchorListApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(AnchorListApi.class));

    /* renamed from: c */
    private static final Keva f64710c;

    /* renamed from: d */
    private static final C6600e f64711d = new C6600e();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f64712e;

    /* renamed from: f */
    private static List<C24536e> f64713f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$AnchorListApi */
    public interface AnchorListApi {
        @C7730f(mo20420a = "/aweme/v1/anchor/list/")
        C1592h<C24530b> getAnchorList();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$a */
    static final class C24515a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C24515a f64714a = new C24515a();

        C24515a() {
        }

        /* renamed from: a */
        private static void m80524a() {
            AnchorListManager.f64708a.mo64314d();
        }

        public final /* synthetic */ Object call() {
            m80524a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$b */
    static final class C24516b<TTaskResult, TContinuationResult> implements C1591g<C24530b, Void> {

        /* renamed from: a */
        public static final C24516b f64715a = new C24516b();

        C24516b() {
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            return m80525a(hVar);
        }

        /* renamed from: a */
        private static Void m80525a(C1592h<C24530b> hVar) {
            Object obj;
            Object obj2;
            AnchorListManager.f64712e = true;
            C7573i.m23582a((Object) hVar, "it");
            AnchorListManager.m80518a(((C24530b) hVar.mo6890e()).f64752c);
            StringBuilder sb = new StringBuilder("success memory list = ");
            List b = AnchorListManager.f64708a.mo64313b();
            if (b != null) {
                obj = Integer.valueOf(b.size());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append("  network list = ");
            List<C24536e> list = ((C24530b) hVar.mo6890e()).f64752c;
            if (list != null) {
                obj2 = Integer.valueOf(list.size());
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            C24533c.m80539a(AnchorListManager.f64708a.mo64313b());
            C1592h.m7853a((Callable<TResult>) C245171.f64716a);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$c */
    public static final class C24518c extends C6597a<List<C24536e>> {
        C24518c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager$d */
    public static final class C24519d extends C6597a<List<C24536e>> {
        C24519d() {
        }
    }

    private AnchorListManager() {
    }

    /* renamed from: a */
    public static void m80516a() {
        C24533c.m80538a();
        f64709b.getAnchorList().mo6876a((C1591g<TResult, TContinuationResult>) C24516b.f64715a, C1592h.f5958b);
    }

    /* renamed from: c */
    public static boolean m80519c() {
        Boolean bool;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            bool = a.getEnableAnchorCache();
            C7573i.m23582a((Object) bool, "SettingsReader.get().enableAnchorCache");
        } catch (Exception unused) {
            bool = Boolean.valueOf(false);
        }
        return bool.booleanValue();
    }

    /* renamed from: e */
    public final boolean mo64315e() {
        if (!f64710c.getBoolean("anchor_local_success", false) || !m80519c()) {
            return false;
        }
        return true;
    }

    static {
        Keva repo = Keva.getRepo("anchor_data_keva");
        C7573i.m23582a((Object) repo, "Keva.getRepo(ANCHOR_KEVA_NAME)");
        f64710c = repo;
    }

    /* renamed from: b */
    public final List<C24536e> mo64313b() {
        boolean z;
        if (m80519c()) {
            Collection collection = f64713f;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !f64712e) {
                f64713f = m80520f();
            }
        }
        return f64713f;
    }

    /* renamed from: d */
    public final void mo64314d() {
        try {
            f64710c.storeString("anchor_list_key", f64711d.mo15980b(mo64313b(), new C24519d().type));
            f64710c.storeBoolean("anchor_local_success", true);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("AnchorListManager saveData Exception: ");
            sb.append(e);
            C42880h.m136156a(sb.toString());
            C6921a.m21559a((Throwable) new CommerceException(e));
        }
    }

    /* renamed from: f */
    private static List<C24536e> m80520f() {
        try {
            String string = f64710c.getString("anchor_list_key", null);
            if (!TextUtils.isEmpty(string)) {
                return (List) f64711d.mo15975a(string, new C24518c().type);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("AnchorListManager getLocalData Exception: ");
            sb.append(e);
            C42880h.m136156a(sb.toString());
            C6921a.m21559a((Throwable) new CommerceException(e));
        }
        return null;
    }

    /* renamed from: a */
    public static void m80518a(List<C24536e> list) {
        f64713f = list;
        C1592h.m7853a((Callable<TResult>) C24515a.f64714a);
    }
}
