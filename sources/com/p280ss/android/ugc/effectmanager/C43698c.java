package com.p280ss.android.ugc.effectmanager;

import com.bef.effectsdk.RequirementResourceMapper;
import com.p280ss.android.ugc.effectmanager.C43681b.C43687a;
import com.p280ss.android.ugc.effectmanager.common.C43702a;
import com.p280ss.android.ugc.effectmanager.common.C43723d;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43732d;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43749a;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43750b;
import com.p280ss.android.ugc.effectmanager.effect.p1734d.C43782a;
import com.p280ss.android.ugc.effectmanager.effect.p1734d.C43783b;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43788e;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43801b;
import com.p280ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p280ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.p280ss.android.ugc.effectmanager.model.ModelInfo;
import com.p280ss.android.ugc.effectmanager.network.C43859a;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.c */
public final class C43698c implements C43749a {

    /* renamed from: a */
    private C43679a f113141a;

    /* renamed from: b */
    private C43859a f113142b;

    /* renamed from: c */
    private C43856m f113143c;

    /* renamed from: d */
    private C43858n f113144d;

    /* renamed from: e */
    private C43831f f113145e;

    /* renamed from: f */
    private C43687a f113146f;

    /* renamed from: g */
    private final DownloadableModelConfig f113147g;

    /* renamed from: h */
    private C43722d f113148h;

    /* renamed from: i */
    private final Object f113149i = new Object();

    /* renamed from: com.ss.android.ugc.effectmanager.c$a */
    class C43699a extends C43782a<C43788e> {

        /* renamed from: a */
        C43782a<C43788e> f113150a;

        /* renamed from: b */
        C43750b f113151b;

        /* renamed from: b */
        private C43783b<C43788e> m138477b() {
            return new C43783b<C43788e>() {
                /* renamed from: a */
                public final void mo105723a(C43782a<C43788e> aVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo105726a(C43782a<C43788e> aVar, C43788e eVar) {
                    C43699a.this.mo105837a((C43782a<T>) C43699a.this, eVar);
                }

                /* renamed from: a */
                public final void mo105725a(C43782a<C43788e> aVar, C43726c cVar) {
                    C43699a.this.mo105836a((C43782a<T>) C43699a.this, cVar);
                }

                /* renamed from: a */
                public final void mo105724a(C43782a<C43788e> aVar, int i, long j) {
                    C43699a.this.mo105835a(aVar, i, j);
                }
            };
        }

        /* renamed from: a */
        public final void mo105722a() {
            try {
                mo105834a(this);
                C43698c.this.mo105721b(this.f113151b);
                this.f113150a.mo105722a();
            } catch (RuntimeException e) {
                mo105836a((C43782a<T>) this, new C43726c((Exception) e));
            }
        }

        public C43699a(C43782a<C43788e> aVar, C43750b bVar) {
            this.f113150a = aVar;
            this.f113151b = bVar;
        }
    }

    /* renamed from: a */
    private static String m138465a(String str) {
        return C43723d.m138564a(str);
    }

    /* renamed from: c */
    private Collection<ModelInfo> m138471c(String[] strArr) {
        return m138466a(strArr, this.f113143c.mo106094a());
    }

    /* renamed from: a */
    private static List<String> m138467a(Effect effect) {
        List<String> requirements = effect.getRequirements();
        if (requirements == null) {
            return Collections.EMPTY_LIST;
        }
        return requirements;
    }

    /* renamed from: b */
    private boolean m138470b(String[] strArr) {
        for (String c : strArr) {
            if (!m138472c(c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private boolean m138472c(String str) {
        C43679a aVar = this.f113141a;
        StringBuilder sb = new StringBuilder("model/");
        sb.append(str);
        return aVar.mo105676a(sb.toString());
    }

    /* renamed from: b */
    private String m138469b(String str) {
        for (C43848a aVar : this.f113143c.mo106094a().f113600a.mo105773b()) {
            if (aVar.mo106062a().equals(str)) {
                return aVar.mo106063b();
            }
        }
        StringBuilder sb = new StringBuilder("Can not find compatible version from server");
        sb.append(str);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public final C43782a<C43788e> mo70645a(C43750b bVar) {
        return new C43699a(new C43801b(this.f113142b, this.f113148h, this.f113147g.f113046m, this.f113147g.f113047n).mo70645a(bVar), bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo105721b(C43750b bVar) {
        List a = m138467a(bVar.f113247a);
        if (a != null && !a.isEmpty()) {
            HashSet hashSet = new HashSet(Arrays.asList(RequirementResourceMapper.m8926a((String[]) a.toArray(new String[a.size()]))));
            String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
            synchronized (this.f113149i) {
                try {
                    m138468a(bVar, m138471c(strArr));
                } catch (RuntimeException e) {
                    if (!m138470b(strArr)) {
                        throw e;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Collection<ModelInfo> mo105719a(String[] strArr) {
        C43847l lVar = this.f113143c.f113627b;
        if (lVar == null) {
            return new ArrayList();
        }
        return m138466a(strArr, lVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo105720a(List<String> list) {
        this.f113143c.mo106094a();
        Effect effect = new Effect();
        effect.setName("Stub");
        effect.setRequirements(list);
        mo105721b(new C43750b(effect, null, null));
    }

    /* renamed from: a */
    private long m138464a(ModelInfo modelInfo, FetchModelType fetchModelType) {
        return this.f113144d.mo106113a(modelInfo, fetchModelType);
    }

    /* renamed from: a */
    private Collection<ModelInfo> m138466a(String[] strArr, C43847l lVar) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String a = m138465a(str);
            String b = m138469b(a);
            if (!m138472c(str) || new BigDecimal(C43723d.m138565b(str)).compareTo(new BigDecimal(b)) != 0) {
                LocalModelInfo a2 = this.f113145e.mo105969a(a);
                if (a2 == null || !a2.getVersion().equals(b)) {
                    ExtendedUrlModel a3 = lVar.mo106061a(a);
                    ModelInfo modelInfo = new ModelInfo();
                    modelInfo.setName(a);
                    modelInfo.setVersion(b);
                    modelInfo.setFile_url(a3);
                    arrayList.add(modelInfo);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m138468a(C43750b bVar, Collection<ModelInfo> collection) {
        String str;
        for (ModelInfo modelInfo : collection) {
            C43863p a = C43863p.m138928a();
            try {
                long a2 = m138464a(modelInfo, this.f113147g.f113049p) / ((long) C43702a.f113154a);
                long currentTimeMillis = System.currentTimeMillis() - System.currentTimeMillis();
                if (this.f113148h != null) {
                    C43722d dVar = this.f113148h;
                    String str2 = "resource_download_success_rate";
                    C43732d a3 = C43732d.m138588a().mo105776a("app_id", this.f113147g.f113046m).mo105776a("access_key", this.f113147g.f113047n).mo105775a("duration", Long.valueOf(currentTimeMillis));
                    String str3 = "resource_name";
                    if (modelInfo == null) {
                        str = "";
                    } else {
                        str = modelInfo.getName();
                    }
                    dVar.mo55503a(str2, 0, a3.mo105776a(str3, str).mo105776a("resource_type", this.f113147g.f113049p.toString()).mo105775a("size", Long.valueOf(a2)).mo105777b());
                }
                if (this.f113146f != null) {
                    this.f113146f.mo90377a(bVar.f113247a, modelInfo, a.mo106119b());
                }
            } catch (RuntimeException e) {
                C43726c cVar = new C43726c((Exception) e);
                String str4 = (String) modelInfo.getFile_url().getUrlList().get(0);
                String str5 = "";
                try {
                    str5 = InetAddress.getByName(new URL(str4).getHost()).getHostAddress();
                } catch (MalformedURLException | UnknownHostException unused) {
                }
                if (this.f113148h != null) {
                    this.f113148h.mo55503a("resource_download_success_rate", 1, C43732d.m138588a().mo105776a("app_id", this.f113147g.f113046m).mo105776a("access_key", this.f113147g.f113047n).mo105776a("resource_name", modelInfo.getName()).mo105776a("resource_type", this.f113147g.f113049p.toString()).mo105776a("error_msg", e.getMessage()).mo105774a("error_code", Integer.valueOf(cVar.f113220a)).mo105776a("download_url", str4).mo105776a("host_ip", str5).mo105777b());
                }
                if (this.f113146f != null) {
                    this.f113146f.mo90378a(bVar.f113247a, modelInfo, (Exception) e);
                    throw e;
                }
            }
        }
    }

    public C43698c(DownloadableModelConfig downloadableModelConfig, C43679a aVar, C43831f fVar, C43859a aVar2, C43856m mVar, C43687a aVar3) {
        this.f113147g = downloadableModelConfig;
        this.f113148h = downloadableModelConfig.f113048o;
        this.f113141a = aVar;
        this.f113145e = fVar;
        this.f113142b = aVar2;
        this.f113143c = mVar;
        this.f113144d = new C43858n(this.f113145e, aVar2);
        this.f113146f = aVar3;
    }
}
