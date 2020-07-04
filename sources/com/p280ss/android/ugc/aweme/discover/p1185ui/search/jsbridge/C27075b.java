package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26034h;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.discover.presenter.C26819e;
import com.p280ss.android.ugc.aweme.discover.presenter.C26819e.C26820a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.b */
public final class C27075b implements C0053p<C26820a>, C26034h {

    /* renamed from: a */
    public final CrossPlatformWebView f71430a;

    /* renamed from: b */
    public final C0043i f71431b;

    /* renamed from: c */
    private final boolean f71432c = C26819e.f70769b.mo69480b();

    /* renamed from: a */
    public final void mo67152a() {
        m88866c();
    }

    /* renamed from: c */
    private final void m88866c() {
        C26820a aVar = (C26820a) C26819e.m88101a().getValue();
        if (aVar == null) {
            C26819e.m88101a().observe(this.f71431b, this);
        } else {
            onChanged(aVar);
        }
    }

    /* renamed from: b */
    public final void mo69866b() {
        if (this.f71432c) {
            C26819e.m88101a().removeObserver(this);
            C26819e.f70769b.mo69481c();
            this.f71430a.mo67480b((C26034h) this);
            C42961az.m136383d(this);
        }
    }

    @C7709l
    public final void onH5ComponentDidMount(C27074a aVar) {
        C7573i.m23587b(aVar, "event");
        m88866c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C26820a aVar) {
        if (aVar != null) {
            try {
                this.f71430a.mo67473a("postGuessSearchData", m88865b(aVar), this.f71430a.getReactId());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private final JSONObject m88865b(C26820a aVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reactId", this.f71430a.getReactId());
        jSONObject.put("code", aVar.f70772a);
        jSONObject.put("response", aVar.f70773b);
        return jSONObject;
    }

    public C27075b(CrossPlatformWebView crossPlatformWebView, C0043i iVar) {
        C7573i.m23587b(crossPlatformWebView, C22912d.f60641a);
        C7573i.m23587b(iVar, "owner");
        this.f71430a = crossPlatformWebView;
        this.f71431b = iVar;
        if (this.f71432c) {
            this.f71430a.mo67469a((C26034h) this);
            C42961az.m136382c(this);
            if (this.f71430a.mo67492f()) {
                m88866c();
            }
        }
    }
}
