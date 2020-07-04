package com.p280ss.android.ugc.aweme.p313im.sdk.p314d;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.internal.utils.C11432j;
import com.bytedance.p263im.core.model.C11439h;
import com.bytedance.p263im.core.p584a.C11193a;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11205e;
import com.bytedance.p263im.core.p586b.C11206a;
import com.bytedance.p263im.core.p586b.C11207b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.net.C25710e;
import com.p280ss.android.ugc.aweme.emoji.p1201a.C27500a;
import com.p280ss.android.ugc.aweme.emoji.p1207e.C27554a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30752g;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.C6990a;
import com.p280ss.android.ugc.aweme.p313im.sdk.notification.C7027a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p317j.C31335c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p317j.C31337e;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.DefaultMainProxy;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IImplService;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c.C7042c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.service.C7091a;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.a */
public class C6956a {

    /* renamed from: c */
    private static C6956a f19660c;

    /* renamed from: a */
    public C7091a f19661a;

    /* renamed from: b */
    public long f19662b = System.currentTimeMillis();

    /* renamed from: d */
    private C7103h f19663d;

    /* renamed from: e */
    private C11193a f19664e = new C31337e();

    /* renamed from: b */
    public static IImplService m21633b() {
        return (IImplService) C6993a.m21773a(IImplService.class);
    }

    /* renamed from: f */
    public final C7103h mo18009f() {
        if (this.f19663d == null) {
            return new DefaultMainProxy();
        }
        return this.f19663d;
    }

    private C6956a() {
    }

    /* renamed from: a */
    public static C6956a m21632a() {
        if (f19660c == null) {
            synchronized (C6956a.class) {
                if (f19660c == null) {
                    f19660c = new C6956a();
                }
            }
        }
        return f19660c;
    }

    /* renamed from: c */
    public static void m21634c() {
        if (!C11198c.m32777a().f30374d) {
            C31085i.m101387a();
            C6978j.m21717a().mo18055f();
            C11198c.m32777a().mo27250c();
            C7027a.f19815b.mo18127a();
        }
    }

    /* renamed from: e */
    public final void mo18008e() {
        C11432j.m33706a();
        if (C7074e.m22066a()) {
            m21635i();
            C6961d.m21657a().mo18030b();
        }
        mo18007d();
    }

    /* renamed from: g */
    public final void mo18010g() {
        if (C11198c.m32777a().f30372b == null) {
            C11198c.m32777a().mo27246a(this.f19664e);
        }
    }

    /* renamed from: h */
    public final void mo18011h() {
        C27500a.f72532a.mo70702a();
        C27554a.m90296a();
        C27554a.m90302c();
        if (mo18009f().showNewStyle()) {
            C6990a.m21758a().mo18071b();
        }
    }

    /* renamed from: i */
    private static void m21635i() {
        C7058be.m21980a().mo18267b();
        C11198c.m32777a().mo27251d();
        C6978j.m21717a().mo18056g();
        C31085i.m101390b();
        C7076p.m22077a().mo18331o();
        C31335c.m102021a().mo81906d();
        C7027a.f19815b.mo18136i();
    }

    /* renamed from: d */
    public final void mo18007d() {
        boolean z;
        C11432j.m33706a();
        if (C7074e.m22066a()) {
            long d = C7074e.m22072d();
            if (d != C7076p.m22077a().mo18329m()) {
                z = true;
            } else {
                z = false;
            }
            C7076p.m22077a().mo18315e(d);
            if (z) {
                C7042c.m21910b(2);
            }
            if (mo18009f().showNewStyle()) {
                C6990a.m21758a().mo18071b();
            }
            C6967g.m21701d().mo18038a(true, 1);
            return;
        }
        m21635i();
        if (mo18009f().showNewStyle()) {
            C6990a.m21758a().mo18076f();
        }
        C6961d.m21657a().mo18030b();
    }

    @C7709l
    public void onEvent(C25710e eVar) {
        if (eVar.f67655a != 0 && C7074e.m22066a() && System.currentTimeMillis() - this.f19662b >= DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
            C31863ai.m103534c();
        }
    }

    /* renamed from: a */
    private static C11205e m21631a(C7091a aVar) {
        int i;
        C11205e eVar = new C11205e();
        eVar.f30403c = aVar.f19937g;
        eVar.f30404d = aVar.f19936f;
        eVar.f30410j = 0;
        if (aVar.f19931a) {
            i = 3;
        } else {
            i = 6;
        }
        eVar.f30401a = i;
        eVar.f30406f = C7075h.f19905d;
        eVar.f30402b = 2;
        eVar.f30418r = 1;
        eVar.f30409i = 1000;
        eVar.f30426z = true;
        eVar.f30399I = "1000";
        eVar.f30400J = false;
        if (!C31915n.m103671a()) {
            eVar.f30416p = new int[]{1};
        }
        return eVar;
    }

    /* renamed from: a */
    public final void mo18006a(Application application, C7091a aVar, C7103h hVar) {
        this.f19661a = aVar;
        if (hVar == null) {
            hVar = new DefaultMainProxy();
        }
        this.f19663d = hVar;
        C11198c.m32777a().mo27245a(application, m21631a(aVar));
        C11198c.m32777a().mo27246a(this.f19664e);
        C11198c.m32777a().f30373c = new C11206a() {
            /* renamed from: a */
            public final void mo18013a(String str, JSONObject jSONObject) {
                C6907h.m21525a(str, jSONObject);
            }
        };
        C31335c.m102022a(application.getApplicationContext());
        C31335c.m102021a().mo81905c();
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
        C11198c.m32777a();
        C11198c.m32778a((C11439h) new C30752g());
        C11209d.m32823a((C11207b) new C11207b() {
            /* renamed from: a */
            public final void mo18014a(Object obj) {
                try {
                    String b = C11403c.f30887a.mo15979b(obj);
                    while (b.length() > 2000) {
                        C6921a.m21555a(b.substring(0, AdError.SERVER_ERROR_CODE));
                        b = b.substring(AdError.SERVER_ERROR_CODE);
                    }
                    C6921a.m21555a(b);
                } catch (Exception unused) {
                }
            }

            /* renamed from: a */
            public final void mo18017a(String str, String str2, JSONObject jSONObject) {
                C6379c.m19826a("im_event", jSONObject);
            }

            /* renamed from: a */
            public final void mo18015a(String str, String str2, Throwable th) {
                if (!TextUtils.isEmpty(str2)) {
                    C6921a.m21555a(str2);
                }
                if (th != null) {
                    C6921a.m21559a(th);
                }
            }

            /* renamed from: a */
            public final void mo18018a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                C6379c.m19827a(str, jSONObject, jSONObject2);
            }

            /* renamed from: a */
            public final void mo18016a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
                C7074e.m22063a(str, str2, map);
            }
        });
        C6967g.m21701d().mo18036a();
    }
}
