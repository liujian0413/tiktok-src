package com.bytedance.android.livesdk.verify;

import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.verify.model.GetCertificationEntranceResponse;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class VerifyActivityProxy extends LiveActivityProxy {

    /* renamed from: a */
    private VerifyBrowserFragment f24768a;

    /* renamed from: c */
    private C47562b f24769c = new C47562b();

    /* renamed from: d */
    private String f24770d;

    /* renamed from: e */
    private String f24771e;

    /* renamed from: d */
    private static String m27151d() {
        TTLiveSDKContext.getHostService().mo22370k();
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f24769c.mo119660a();
    }

    public void onCreate() {
        super.onCreate();
        this.f25465b.setContentView(R.layout.al8);
        this.f24768a = new VerifyBrowserFragment();
        m27149a();
    }

    /* renamed from: a */
    private void m27149a() {
        this.f24769c.mo119661a(((ZhimaVerifyApi) C9178j.m27302j().mo22373b().mo10440a(ZhimaVerifyApi.class)).getCertificationEntrance().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C9098a<Object>(this)));
    }

    /* renamed from: c */
    private void m27150c() {
        Bundle bundle = new Bundle();
        if (!C9101d.m27159a(this.f25465b) || TextUtils.isEmpty(this.f24770d)) {
            bundle.putString("url", this.f24771e);
        } else {
            bundle.putString("url", Uri.parse(this.f24770d).buildUpon().appendQueryParameter("return_url", m27151d()).build().toString());
        }
        bundle.putBoolean("hide_nav_bar", true);
        this.f24768a.setArguments(bundle);
        C0633q a = this.f25465b.getSupportFragmentManager().mo2645a();
        a.mo2599b(R.id.a20, this.f24768a);
        a.mo2606d();
    }

    public VerifyActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22269a(C3479d dVar) throws Exception {
        if (dVar != null) {
            this.f24770d = ((GetCertificationEntranceResponse) dVar.data).zhima_entrance;
            this.f24771e = ((GetCertificationEntranceResponse) dVar.data).manual_entrance;
            m27150c();
        }
    }
}
