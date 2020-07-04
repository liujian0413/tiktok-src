package com.p280ss.android.ugc.aweme.net.corenet;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.net.cronet.C10929b;
import com.bytedance.ies.net.p574b.C10923c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.retrofit2.p638c.C12469a;
import com.p280ss.android.common.p852c.C19279b;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.legacy.download.C32331a;
import com.p280ss.android.ugc.aweme.net.C34066e;
import com.p280ss.android.ugc.aweme.net.C34100t;
import com.p280ss.android.ugc.aweme.net.ClientChangeSwitch;
import com.p280ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.SecUidInterceptorTTNet;
import com.p280ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet;
import com.p280ss.android.ugc.iesdownload.p1745b.C44847b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.f */
public final class C34061f extends C34066e {

    /* renamed from: c */
    private static String f88832c;

    /* renamed from: a */
    static final /* synthetic */ C44847b m109669a(C34052a aVar) {
        return aVar;
    }

    /* renamed from: b */
    public static boolean m109671b() {
        if (!m109672c()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m109672c() {
        if (VERSION.SDK_INT == 18) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m109674e() {
        if (C6399b.m19938n() == 1 || C6399b.m19938n() == 4) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static void m109673d() {
        if (!m109674e()) {
            Integer num = (Integer) C23060u.m75742a().mo60063ag().mo59877d();
            if (num.intValue() < 1600 || num.intValue() > 1640) {
                String str = (String) SharePrefCache.inst().getShareCookieCacheItem().mo59877d();
                if (TextUtils.isEmpty(str) || !TextUtils.equals(".tiktokv.com", str)) {
                    NetworkUtils.setShareCookieHost(".snssdk.com");
                } else {
                    NetworkUtils.setShareCookieHost(str);
                }
            } else {
                NetworkUtils.setShareCookieHost(".tiktokv.com");
                SharePrefCache.inst().getShareCookieCacheItem().mo59871a(".tiktokv.com");
            }
        }
    }

    /* renamed from: a */
    public final synchronized C19279b mo86744a() {
        m109673d();
        C10944e.m32116c();
        if (m109671b()) {
            f88832c = "CronetClient";
            C34052a aVar = new C34052a();
            aVar.mo26346a(60000);
            aVar.mo26350b(60000);
            aVar.mo26353c(60000);
            aVar.mo26348a((C12469a) new ApiAlisgInterceptorTTNet());
            aVar.mo26348a((C12469a) new ApiCheckInterceptorTTNet());
            aVar.mo26348a((C12469a) new DevicesNullInterceptorTTNet());
            aVar.mo26348a((C12469a) new UrlTransformInterceptorTTNet());
            aVar.mo26348a((C12469a) new SecUidInterceptorTTNet());
            List<C12469a> a = m109670a(0);
            if (!C6307b.m19566a((Collection<T>) a)) {
                for (C12469a a2 : a) {
                    aVar.mo26348a(a2);
                }
            }
            aVar.mo26347a((C10929b) new C34058c());
            C32331a.m104893b(new C34062g(aVar));
            if (C10292j.m30480a().mo25012a(ClientChangeSwitch.class, "change_network_client", C6384b.m19835a().mo15294c().getChangeNetworkClient()) == 0) {
                return aVar;
            }
            return new C34063h(aVar);
        }
        f88832c = "SsOkhttp3Client";
        return new C10923c(new C34100t());
    }

    public C34061f(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static List<C12469a> m109670a(int i) {
        ArrayList arrayList = new ArrayList();
        if (C6399b.m19944t()) {
            arrayList.add(new FeedRetryInterceptorTTNet());
        }
        return arrayList;
    }
}
