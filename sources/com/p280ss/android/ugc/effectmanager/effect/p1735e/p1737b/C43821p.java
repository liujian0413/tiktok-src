package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43730b;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.net.ProviderEffectListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43795l;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.p */
public final class C43821p extends C43727d {

    /* renamed from: a */
    private C43680a f113453a;

    /* renamed from: b */
    private C43834g f113454b = this.f113453a.f113068a;

    /* renamed from: g */
    private int f113455g = this.f113454b.f113529t;

    /* renamed from: h */
    private C43719a f113456h = this.f113454b.f113528s;

    /* renamed from: i */
    private C43721c f113457i = this.f113454b.f113532w;

    /* renamed from: j */
    private String f113458j;

    /* renamed from: k */
    private String f113459k;

    /* renamed from: l */
    private String f113460l;

    /* renamed from: m */
    private String f113461m;

    /* renamed from: n */
    private int f113462n;

    /* renamed from: o */
    private int f113463o;

    /* renamed from: b */
    private C43707b m138765b() {
        HashMap a = m138568a(this.f113454b);
        if (!TextUtils.isEmpty(this.f113458j)) {
            a.put("library", this.f113458j);
        }
        a.put("cursor", String.valueOf(this.f113462n));
        a.put("count", String.valueOf(this.f113463o));
        this.f113460l = this.f113453a.f113069b.f113609h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113460l);
        sb.append(this.f113454b.f113510a);
        sb.append("/stickers/recommend");
        String a2 = C43735g.m138609a(a, sb.toString());
        this.f113459k = a2;
        try {
            this.f113461m = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C43707b("GET", a2);
    }

    /* renamed from: a */
    public final void mo105685a() {
        C43707b b = m138765b();
        while (true) {
            int i = this.f113455g;
            this.f113455g = i - 1;
            if (i != 0) {
                try {
                    if (this.f113228e) {
                        C43726c cVar = new C43726c(10001);
                        cVar.mo105767a(this.f113459k, this.f113460l, this.f113461m);
                        mo105769a(18, new C43795l(new ProviderEffectModel(), cVar));
                        return;
                    }
                    ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) this.f113454b.f113533x.mo106114a(b, this.f113457i, ProviderEffectListResponse.class);
                    if (providerEffectListResponse.checkValue()) {
                        ProviderEffectModel providerEffectModel = providerEffectListResponse.data;
                        m138764a(providerEffectModel);
                        m138766b(providerEffectModel);
                        mo105769a(18, new C43795l(providerEffectModel, null));
                        return;
                    } else if (this.f113455g == 0) {
                        C43726c cVar2 = new C43726c(10002);
                        cVar2.mo105767a(this.f113459k, this.f113460l, this.f113461m);
                        mo105769a(18, new C43795l(new ProviderEffectModel(), cVar2));
                        return;
                    }
                } catch (Exception e) {
                    if (this.f113455g == 0 || (e instanceof StatusCodeException)) {
                        mo105769a(18, new C43795l(new ProviderEffectModel(), new C43726c(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo105769a(18, new C43795l(new ProviderEffectModel(), new C43726c(e)));
    }

    /* renamed from: b */
    private void m138766b(ProviderEffectModel providerEffectModel) {
        this.f113456h.mo105732a(C43730b.m138576a(this.f113454b.f113515f, this.f113458j), this.f113457i.mo70690a(providerEffectModel));
    }

    /* renamed from: a */
    private void m138764a(ProviderEffectModel providerEffectModel) {
        if (providerEffectModel != null && providerEffectModel.sticker_list != null) {
            for (ProviderEffect providerEffect : providerEffectModel.sticker_list) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f113454b.f113519j);
                sb.append(File.separator);
                sb.append(providerEffect.f113502id);
                sb.append(".gif");
                providerEffect.path = sb.toString();
            }
        }
    }

    public C43821p(C43680a aVar, String str, String str2, int i, int i2, Handler handler) {
        super(handler, str, "NETWORK");
        this.f113462n = i;
        this.f113463o = i2;
        this.f113458j = str2;
        this.f113453a = aVar;
    }
}
