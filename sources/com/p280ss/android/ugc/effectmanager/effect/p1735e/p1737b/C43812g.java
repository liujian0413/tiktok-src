package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43789f;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.g */
public final class C43812g extends C43727d {

    /* renamed from: a */
    private C43680a f113374a;

    /* renamed from: b */
    private C43834g f113375b;

    /* renamed from: g */
    private C43721c f113376g;

    /* renamed from: h */
    private List<String> f113377h = new ArrayList();

    /* renamed from: i */
    private String f113378i;

    /* renamed from: j */
    private boolean f113379j;

    /* renamed from: k */
    private int f113380k;

    /* renamed from: a */
    public final void mo105685a() {
        int i = 0;
        while (i < this.f113380k) {
            try {
                this.f113375b.f113533x.mo106114a(m138743a(this.f113377h, this.f113379j), this.f113376g, BaseNetResponse.class);
                mo105769a(40, new C43789f(true, this.f113377h, null));
                return;
            } catch (Exception e) {
                if (i == this.f113380k - 1 || (e instanceof StatusCodeException)) {
                    mo105769a(40, new C43789f(false, this.f113377h, new C43726c(e)));
                    return;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private C43707b m138743a(List<String> list, boolean z) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f113375b.f113511b)) {
            hashMap.put("access_key", this.f113375b.f113511b);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113514e)) {
            hashMap.put("device_id", this.f113375b.f113514e);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113517h)) {
            hashMap.put("device_type", this.f113375b.f113517h);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113516g)) {
            hashMap.put("device_platform", this.f113375b.f113516g);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113520k)) {
            hashMap.put("region", this.f113375b.f113520k);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113512c)) {
            hashMap.put("sdk_version", this.f113375b.f113512c);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113513d)) {
            hashMap.put("app_version", this.f113375b.f113513d);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113515f)) {
            hashMap.put("channel", this.f113375b.f113515f);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113521l)) {
            hashMap.put("aid", this.f113375b.f113521l);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113522m)) {
            hashMap.put("app_language", this.f113375b.f113522m);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113523n)) {
            hashMap.put("language", this.f113375b.f113523n);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113524o)) {
            hashMap.put("longitude", this.f113375b.f113524o);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113525p)) {
            hashMap.put("latitude", this.f113375b.f113525p);
        }
        if (!TextUtils.isEmpty(this.f113375b.f113526q)) {
            hashMap.put("city_code", this.f113375b.f113526q);
        }
        if (!TextUtils.isEmpty(this.f113378i)) {
            hashMap.put("panel", this.f113378i);
        }
        hashMap.put("effect_ids", list);
        hashMap.put("type", Integer.valueOf(z ? 1 : 0));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113374a.f113069b.f113609h);
        sb.append(this.f113375b.f113510a);
        sb.append("/v3/effect/favorite");
        C43707b bVar = new C43707b("POST", sb.toString());
        bVar.f113173e = hashMap;
        bVar.f113174f = "application/json";
        return bVar;
    }

    public C43812g(C43680a aVar, String str, String str2, Handler handler, List<String> list, boolean z) {
        super(handler, str2, "NETWORK");
        this.f113374a = aVar;
        this.f113375b = this.f113374a.f113068a;
        this.f113376g = this.f113374a.f113068a.f113532w;
        this.f113377h.clear();
        this.f113377h.addAll(list);
        this.f113379j = z;
        this.f113378i = str;
        this.f113380k = this.f113375b.f113529t;
    }
}
