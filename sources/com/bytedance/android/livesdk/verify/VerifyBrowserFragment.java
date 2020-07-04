package com.bytedance.android.livesdk.verify;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4061m;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4061m.C4062a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.verify.model.C9110b;
import com.bytedance.android.livesdk.verify.model.ZhimaPollingResponse;
import com.bytedance.ies.web.p582a.C11093e;
import java.net.URLEncoder;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class VerifyBrowserFragment extends TTLiveBrowserFragment implements C4062a {

    /* renamed from: E */
    private C9110b f24772E;

    /* renamed from: F */
    private boolean f24773F;

    /* renamed from: G */
    private C47562b f24774G = new C47562b();

    /* renamed from: H */
    private C4061m f24775H;

    public void onDestroyView() {
        super.onDestroyView();
        this.f24774G.mo119660a();
    }

    public void onResume() {
        super.onResume();
        if (this.f24773F && this.f24772E != null) {
            this.f24774G.mo119661a(((ZhimaVerifyApi) C9178j.m27302j().mo22373b().mo10440a(ZhimaVerifyApi.class)).queryPollingStatus(this.f24772E.f24802c, this.f24772E.f24800a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C9099b<Object>(this), (C7326g<? super Throwable>) new C9100c<Object>(this)));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22272a(Throwable th) throws Exception {
        this.f24775H.mo11666a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22271a(C3479d dVar) throws Exception {
        if (((ZhimaPollingResponse) dVar.data).isVerified) {
            getActivity().setResult(-1);
            getActivity().finish();
            return;
        }
        this.f24775H.mo11666a();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f24775H = new C4061m(getActivity(), this, this.f11941w.mo11657c());
        this.f11941w.mo11657c().mo27210a("openZmCert", (C11093e) this.f24775H);
    }

    /* renamed from: a */
    public final void mo11667a(C9110b bVar) {
        if (!TextUtils.isEmpty(bVar.f24800a) && !TextUtils.isEmpty(bVar.f24801b) && !TextUtils.isEmpty(bVar.f24802c)) {
            this.f24772E = bVar;
            Intent intent = new Intent("android.intent.action.VIEW");
            StringBuilder sb = new StringBuilder("alipays://platformapi/startapp?appId=20000067&url=");
            sb.append(URLEncoder.encode(bVar.f24801b));
            intent.setData(Uri.parse(sb.toString()));
            getActivity().startActivity(intent);
            this.f24773F = true;
        }
    }
}
