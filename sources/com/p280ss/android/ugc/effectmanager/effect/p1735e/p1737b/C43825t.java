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

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.t */
public final class C43825t extends C43727d {

    /* renamed from: a */
    private C43680a f113481a;

    /* renamed from: b */
    private C43834g f113482b = this.f113481a.f113068a;

    /* renamed from: g */
    private int f113483g = this.f113482b.f113529t;

    /* renamed from: h */
    private C43719a f113484h = this.f113482b.f113528s;

    /* renamed from: i */
    private C43721c f113485i = this.f113482b.f113532w;

    /* renamed from: j */
    private String f113486j;

    /* renamed from: k */
    private String f113487k;

    /* renamed from: l */
    private String f113488l;

    /* renamed from: m */
    private String f113489m;

    /* renamed from: n */
    private String f113490n;

    /* renamed from: o */
    private int f113491o;

    /* renamed from: p */
    private int f113492p;

    /* renamed from: a */
    public final void mo105685a() {
        C43707b b = m138774b();
        while (true) {
            int i = this.f113483g;
            this.f113483g = i - 1;
            if (i != 0) {
                try {
                    if (this.f113228e) {
                        C43726c cVar = new C43726c(10001);
                        cVar.mo105767a(this.f113488l, this.f113489m, this.f113490n);
                        mo105769a(18, new C43795l(new ProviderEffectModel(), cVar));
                        return;
                    }
                    ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) this.f113482b.f113533x.mo106114a(b, this.f113485i, ProviderEffectListResponse.class);
                    if (providerEffectListResponse.checkValue()) {
                        ProviderEffectModel providerEffectModel = providerEffectListResponse.data;
                        m138773a(providerEffectModel);
                        mo105769a(18, new C43795l(providerEffectModel, null));
                        return;
                    } else if (this.f113483g == 0) {
                        C43726c cVar2 = new C43726c(10002);
                        cVar2.mo105767a(this.f113488l, this.f113489m, this.f113490n);
                        mo105769a(18, new C43795l(new ProviderEffectModel(), cVar2));
                        return;
                    }
                } catch (Exception e) {
                    if (this.f113483g == 0 || (e instanceof StatusCodeException)) {
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
    private C43707b m138774b() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f113482b.f113511b)) {
            hashMap.put("access_key", this.f113482b.f113511b);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113513d)) {
            hashMap.put("app_version", this.f113482b.f113513d);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113512c)) {
            hashMap.put("sdk_version", this.f113482b.f113512c);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113515f)) {
            hashMap.put("channel", this.f113482b.f113515f);
        }
        if (!TextUtils.isEmpty(this.f113486j)) {
            hashMap.put("library", this.f113486j);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113516g)) {
            hashMap.put("device_platform", this.f113482b.f113516g);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113514e)) {
            hashMap.put("device_id", this.f113482b.f113514e);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113520k)) {
            hashMap.put("region", this.f113482b.f113520k);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113517h)) {
            hashMap.put("device_type", this.f113482b.f113517h);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113521l)) {
            hashMap.put("aid", this.f113482b.f113521l);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113522m)) {
            hashMap.put("app_language", this.f113482b.f113522m);
        }
        if (!TextUtils.isEmpty(this.f113482b.f113523n)) {
            hashMap.put("language", this.f113482b.f113523n);
        }
        if (!TextUtils.isEmpty(this.f113487k)) {
            hashMap.put("word", this.f113487k);
        }
        hashMap.put("cursor", String.valueOf(this.f113491o));
        hashMap.put("count", String.valueOf(this.f113492p));
        this.f113489m = this.f113481a.f113069b.f113609h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113489m);
        sb.append(this.f113482b.f113510a);
        sb.append("/stickers/search");
        String a = C43735g.m138609a(hashMap, sb.toString());
        this.f113488l = a;
        try {
            this.f113490n = InetAddress.getByName(new URL(a).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C43707b("GET", a);
    }

    /* renamed from: a */
    private void m138773a(ProviderEffectModel providerEffectModel) {
        if (providerEffectModel != null && providerEffectModel.sticker_list != null) {
            for (ProviderEffect providerEffect : providerEffectModel.sticker_list) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f113482b.f113519j);
                sb.append(File.separator);
                sb.append(providerEffect.f113502id);
                sb.append(".gif");
                providerEffect.path = sb.toString();
            }
        }
    }

    public C43825t(C43680a aVar, String str, String str2, String str3, int i, int i2, Handler handler) {
        super(handler, str, "NETWORK");
        this.f113486j = str3;
        this.f113491o = i;
        this.f113492p = i2;
        this.f113487k = str2;
        this.f113481a = aVar;
    }
}
