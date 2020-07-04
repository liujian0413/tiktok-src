package com.bytedance.android.livesdk.sign;

import android.os.Bundle;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sign.C8950a.C8951a;
import com.bytedance.android.livesdk.verify.ZhimaVerifyApi;
import com.bytedance.android.livesdk.verify.model.ZhimaStatusResponse;
import com.bytedance.ies.web.p582a.C11093e;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class BroadcastSigningFragment extends TTLiveBrowserFragment implements C8951a {

    /* renamed from: E */
    private C8950a f24502E;

    /* renamed from: F */
    private boolean f24503F;

    /* renamed from: G */
    private C47562b f24504G = new C47562b();

    /* renamed from: s */
    public final void mo22122s() {
        this.f24503F = true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f24504G.mo119660a();
    }

    public void onResume() {
        super.onResume();
        if (this.f24503F) {
            this.f24504G.mo119661a(((ZhimaVerifyApi) C9178j.m27302j().mo22373b().mo10440a(ZhimaVerifyApi.class)).getCertificationStatus().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C7326g<C3479d<ZhimaStatusResponse>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C3479d<ZhimaStatusResponse> dVar) throws Exception {
                    ZhimaStatusResponse zhimaStatusResponse = (ZhimaStatusResponse) dVar.data;
                    if (zhimaStatusResponse.is_verified) {
                        BroadcastSigningFragment.this.mo22121b(1);
                    } else if (zhimaStatusResponse.certification_step == 3) {
                        BroadcastSigningFragment.this.mo22121b(2);
                    } else {
                        BroadcastSigningFragment.this.mo22121b(0);
                    }
                }
            }));
        }
    }

    /* renamed from: b */
    public final void mo22121b(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            this.f11941w.mo11529a().mo27206a("H5_signStatus", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f24502E = new C8950a(getActivity(), this);
        this.f11941w.mo11657c().mo27210a("openHostVerify", (C11093e) this.f24502E);
    }
}
