package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43732d;
import com.p280ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43750b;
import com.p280ss.android.ugc.effectmanager.effect.p1734d.C43782a;
import com.p280ss.android.ugc.effectmanager.effect.p1734d.C43783b;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43788e;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.e */
public final class C43808e extends C43727d {

    /* renamed from: a */
    public Effect f113356a;

    /* renamed from: b */
    private int f113357b;

    /* renamed from: g */
    private C43680a f113358g;

    /* renamed from: h */
    private List<String> f113359h;

    /* renamed from: i */
    private C43834g f113360i;

    /* renamed from: j */
    private DownloadEffectExtra f113361j;

    /* renamed from: k */
    private C43722d f113362k;

    /* renamed from: a */
    public final void mo105685a() {
        C43782a a = this.f113358g.f113068a.f113509C.mo70645a(new C43750b(this.f113356a, this.f113359h, this.f113360i.f113519j.getPath()));
        final C43788e a2 = new C43788e(this.f113356a, null).mo105840a(0).mo105841a(0);
        a.f113280d = new C43783b<C43788e>() {
            /* renamed from: a */
            public final void mo105723a(C43782a<C43788e> aVar) {
                C43808e.this.mo105769a(42, new C43788e(C43808e.this.f113356a, null));
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo105726a(C43782a<C43788e> aVar, C43788e eVar) {
                C43808e.this.mo105844a(true, null);
                C43808e.this.mo105769a(15, new C43788e(eVar.f113292b, null));
            }

            /* renamed from: a */
            public final void mo105725a(C43782a<C43788e> aVar, C43726c cVar) {
                C43808e.this.mo105844a(false, cVar);
                C43808e.this.mo105769a(15, new C43788e(C43808e.this.f113356a, cVar));
            }

            /* renamed from: a */
            public final void mo105724a(C43782a<C43788e> aVar, int i, long j) {
                C43808e.this.mo105769a(53, a2.mo105840a(i).mo105841a(j));
            }
        };
        a.mo105722a();
    }

    /* renamed from: a */
    public final void mo105844a(boolean z, C43726c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f113362k != null && this.f113361j != null) {
            if (TextUtils.equals("beautify", this.f113361j.panel) || TextUtils.equals("beautifynew", this.f113361j.panel)) {
                boolean z2 = !z;
                StringBuilder sb = new StringBuilder();
                if (this.f113359h != null) {
                    for (String append : this.f113359h) {
                        sb.append(append);
                        sb.append(",");
                    }
                }
                C43722d dVar = this.f113362k;
                String str5 = "effect_resource_download_success_rate";
                C43732d a = C43732d.m138588a();
                String str6 = "effect_id";
                if (this.f113356a == null) {
                    str = "";
                } else {
                    str = this.f113356a.getEffectId();
                }
                C43732d a2 = a.mo105776a(str6, str);
                String str7 = "effect_name";
                if (this.f113356a == null) {
                    str2 = "";
                } else {
                    str2 = this.f113356a.getName();
                }
                C43732d a3 = a2.mo105776a(str7, str2).mo105776a("app_id", this.f113360i.f113521l).mo105776a("access_key", this.f113360i.f113511b).mo105776a("download_urls", sb.toString()).mo105776a("panel", this.f113361j.panel);
                String str8 = "error_code";
                if (cVar == null) {
                    str3 = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cVar.f113220a);
                    str3 = sb2.toString();
                }
                C43732d a4 = a3.mo105776a(str8, str3);
                String str9 = "error_msg";
                if (cVar == null) {
                    str4 = "";
                } else {
                    str4 = cVar.f113221b;
                }
                dVar.mo55503a(str5, z2 ? 1 : 0, a4.mo105776a(str9, str4).mo105777b());
            }
        }
    }

    public C43808e(Effect effect, C43680a aVar, String str, Handler handler) {
        this(effect, aVar, str, handler, null);
    }

    public C43808e(Effect effect, C43680a aVar, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str, "NETWORK");
        this.f113356a = effect;
        this.f113358g = aVar;
        this.f113360i = aVar.f113068a;
        this.f113357b = aVar.f113068a.f113529t;
        this.f113359h = C43731c.m138587b(this.f113356a.getFileUrl());
        this.f113361j = downloadEffectExtra;
        this.f113362k = this.f113360i.f113534y;
    }
}
