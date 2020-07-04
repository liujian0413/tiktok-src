package com.p280ss.android.ugc.aweme.net;

import android.content.Context;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.Api.C22798b;
import com.p280ss.android.ugc.aweme.app.api.Api.C22800d;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.net.b */
public class C34037b<T> {

    /* renamed from: h */
    public static final String f88780h = "b";

    /* renamed from: i */
    private static final CommonApi f88781i = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CommonApi.class));

    /* renamed from: a */
    public C34065d<T> f88782a;

    /* renamed from: b */
    public String f88783b;

    /* renamed from: c */
    HttpType f88784c;

    /* renamed from: d */
    List<C19565e> f88785d;

    /* renamed from: e */
    Class<T> f88786e;

    /* renamed from: f */
    String f88787f;

    /* renamed from: g */
    public boolean f88788g;

    /* renamed from: a */
    public final void mo86727a() {
        m109617a(C6399b.m19921a());
    }

    /* renamed from: a */
    public final void mo86728a(C34065d dVar) {
        this.f88782a = dVar;
    }

    /* renamed from: a */
    private void m109617a(final Context context) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                try {
                    Object a = C34037b.m109616a(C34037b.this.f88784c, C34037b.this.f88783b, C34037b.this.f88785d, C34037b.this.f88787f, C34037b.this.f88786e);
                    if (C34037b.this.f88782a != null) {
                        C6726a.m20844b(new C34044c(this, a));
                    }
                } catch (Exception e) {
                    if (C34037b.this.f88782a != null) {
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (C34037b.this.f88788g) {
                                    C22814a.m75244a(context, (Throwable) e);
                                }
                                C34037b.this.f88782a.mo58715a(e);
                            }
                        });
                    } else {
                        C22814a.m75244a(context, (Throwable) e);
                    }
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo86729a(Object obj) {
                C34037b.this.f88782a.mo58716a(C34037b.this.f88783b, obj);
            }
        });
    }

    public C34037b(String str, HttpType httpType, Class<T> cls) {
        this(str, httpType, "", cls);
    }

    public C34037b(String str, HttpType httpType, String str2, Class<T> cls) {
        this(str, httpType, null, str2, cls);
    }

    public C34037b(String str, HttpType httpType, List<C19565e> list, Class<T> cls) {
        this(str, httpType, list, null, cls);
    }

    private C34037b(String str, HttpType httpType, List<C19565e> list, String str2, Class<T> cls) {
        this.f88788g = true;
        this.f88783b = str;
        this.f88784c = httpType;
        this.f88785d = list;
        this.f88786e = cls;
        this.f88787f = str2;
    }

    /* renamed from: a */
    public static <T> T m109616a(HttpType httpType, String str, List<C19565e> list, String str2, Class<T> cls) throws Exception {
        HashMap hashMap = new HashMap();
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (C19565e eVar : list) {
                hashMap.put(eVar.mo51722a(), eVar.mo51723b());
            }
        }
        if (httpType == HttpType.POST) {
            NetUtil.putCommonParams(hashMap, true);
            String str3 = (String) f88781i.doPost(str, hashMap).execute().f33302b;
            if (String.class.equals(cls)) {
                return Api.m75212a(str3, C22800d.m75221a(), str2, str);
            }
            return Api.m75212a(str3, new C22798b(cls), str2, str);
        } else if (httpType == HttpType.GET) {
            String str4 = (String) f88781i.doGet(str, (Map<String, String>) hashMap).execute().f33302b;
            if (String.class.equals(cls)) {
                return Api.m75212a(str4, C22800d.m75221a(), str2, str);
            }
            return Api.m75212a(str4, new C22798b(cls), str2, str);
        } else {
            throw new IllegalStateException("Unsupport http type !");
        }
    }
}
