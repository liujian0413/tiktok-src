package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43702a;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43730b;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43732d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.net.EffectNetListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43785b;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.k */
public final class C43816k extends C43727d {

    /* renamed from: a */
    private C43680a f113412a;

    /* renamed from: b */
    private C43834g f113413b = this.f113412a.f113068a;

    /* renamed from: g */
    private int f113414g = this.f113413b.f113529t;

    /* renamed from: h */
    private C43719a f113415h = this.f113413b.f113528s;

    /* renamed from: i */
    private C43721c f113416i = this.f113413b.f113532w;

    /* renamed from: j */
    private C43722d f113417j = this.f113413b.f113534y;

    /* renamed from: k */
    private String f113418k;

    /* renamed from: l */
    private String f113419l;

    /* renamed from: m */
    private String f113420m;

    /* renamed from: n */
    private String f113421n;

    /* renamed from: o */
    private long f113422o;

    /* renamed from: b */
    private C43707b m138753b() {
        HashMap a = m138568a(this.f113413b);
        if (!TextUtils.isEmpty(this.f113418k)) {
            a.put("panel", this.f113418k);
        }
        this.f113420m = this.f113412a.f113069b.f113609h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113420m);
        sb.append(this.f113413b.f113510a);
        sb.append("/v3/effects");
        String a2 = C43735g.m138609a(a, sb.toString());
        this.f113419l = a2;
        try {
            this.f113421n = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C43707b("GET", a2);
    }

    /* renamed from: a */
    public final void mo105685a() {
        long currentTimeMillis = System.currentTimeMillis();
        C43707b b = m138753b();
        while (true) {
            int i = this.f113414g;
            this.f113414g = i - 1;
            if (i != 0) {
                InputStream inputStream = null;
                try {
                    if (this.f113228e) {
                        m138751a(new C43726c(10001));
                        C43729a.m138574a(null);
                        return;
                    }
                    InputStream inputStream2 = this.f113413b.f113533x.mo106116a(b);
                    try {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        EffectNetListResponse effectNetListResponse = (EffectNetListResponse) this.f113413b.f113533x.mo106115a(b, inputStream2, this.f113416i, EffectNetListResponse.class);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (effectNetListResponse.checkValued()) {
                            EffectChannelModel effectChannelModel = effectNetListResponse.data;
                            EffectChannelResponse buildChannelResponse = new BuildEffectChannelResponse(this.f113418k, this.f113412a.f113068a.f113519j.getAbsolutePath(), false).buildChannelResponse(effectChannelModel);
                            m138752a(effectChannelModel);
                            mo105769a(14, new C43785b(buildChannelResponse, null));
                            long currentTimeMillis4 = System.currentTimeMillis();
                            if (this.f113417j != null) {
                                this.f113417j.mo55503a("effect_list_success_rate", 0, C43732d.m138588a().mo105776a("app_id", this.f113413b.f113521l).mo105776a("access_key", this.f113413b.f113511b).mo105776a("panel", this.f113418k).mo105775a("duration", Long.valueOf(currentTimeMillis4 - currentTimeMillis)).mo105775a("network_time", Long.valueOf(currentTimeMillis2 - currentTimeMillis)).mo105775a("json_time", Long.valueOf(currentTimeMillis3 - currentTimeMillis2)).mo105775a("io_time", Long.valueOf(currentTimeMillis4 - currentTimeMillis3)).mo105775a("size", Long.valueOf(this.f113422o)).mo105777b());
                            }
                            C43729a.m138574a(inputStream2);
                            return;
                        } else if (this.f113414g == 0) {
                            m138751a(new C43726c(10002));
                            C43729a.m138574a(inputStream2);
                            return;
                        } else {
                            C43729a.m138574a(inputStream2);
                        }
                    } catch (Exception e) {
                        e = e;
                        inputStream = inputStream2;
                        try {
                            if (this.f113414g != 0 || (e instanceof StatusCodeException)) {
                                m138751a(new C43726c(e));
                                C43729a.m138574a(inputStream);
                                return;
                            }
                            C43729a.m138574a(inputStream);
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                            C43729a.m138574a(inputStream2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C43729a.m138574a(inputStream2);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    if (this.f113414g != 0) {
                    }
                    m138751a(new C43726c(e));
                    C43729a.m138574a(inputStream);
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m138751a(C43726c cVar) {
        cVar.mo105767a(this.f113419l, this.f113420m, this.f113421n);
        mo105769a(14, new C43785b(null, cVar));
        if (this.f113417j != null) {
            this.f113417j.mo55503a("effect_list_success_rate", 1, C43732d.m138588a().mo105776a("app_id", this.f113413b.f113521l).mo105776a("access_key", this.f113413b.f113511b).mo105776a("panel", this.f113418k).mo105774a("error_code", Integer.valueOf(cVar.f113220a)).mo105776a("error_msg", cVar.f113221b).mo105777b());
        }
    }

    /* renamed from: a */
    private void m138752a(EffectChannelModel effectChannelModel) {
        String a = C43730b.m138576a(this.f113413b.f113515f, this.f113418k);
        this.f113415h.mo105732a(a, this.f113416i.mo70690a(effectChannelModel));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113413b.f113519j);
        sb.append(File.separator);
        sb.append(a);
        this.f113422o = new File(sb.toString()).length() / ((long) C43702a.f113154a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C38347c.f99551f, effectChannelModel.version);
            C43719a aVar = this.f113415h;
            StringBuilder sb2 = new StringBuilder("effect_version");
            sb2.append(this.f113418k);
            aVar.mo105732a(sb2.toString(), jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    public C43816k(C43680a aVar, String str, String str2, Handler handler) {
        super(handler, str2, "NETWORK");
        this.f113418k = str;
        this.f113412a = aVar;
    }
}
