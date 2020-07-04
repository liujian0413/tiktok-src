package com.p280ss.android.ugc.effectmanager.common.p1729d;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.policy.Policy;
import com.p280ss.android.ugc.effectmanager.C43834g;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.common.d.d */
public abstract class C43727d implements C43724a {

    /* renamed from: c */
    protected Handler f113226c;

    /* renamed from: d */
    protected String f113227d;

    /* renamed from: e */
    public boolean f113228e;

    /* renamed from: f */
    public String f113229f;

    /* renamed from: a */
    protected static HashMap<String, String> m138568a(C43834g gVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(gVar.f113511b)) {
            hashMap.put("access_key", gVar.f113511b);
        }
        if (!TextUtils.isEmpty(gVar.f113514e)) {
            hashMap.put("device_id", gVar.f113514e);
        }
        if (!TextUtils.isEmpty(gVar.f113517h)) {
            hashMap.put("device_type", gVar.f113517h);
        }
        if (!TextUtils.isEmpty(gVar.f113516g)) {
            hashMap.put("device_platform", gVar.f113516g);
        }
        if (!TextUtils.isEmpty(gVar.f113520k)) {
            hashMap.put("region", gVar.f113520k);
        }
        if (!TextUtils.isEmpty(gVar.f113512c)) {
            hashMap.put("sdk_version", gVar.f113512c);
        }
        if (!TextUtils.isEmpty(gVar.f113513d)) {
            hashMap.put("app_version", gVar.f113513d);
        }
        if (!TextUtils.isEmpty(gVar.f113515f)) {
            hashMap.put("channel", gVar.f113515f);
        }
        if (!TextUtils.isEmpty(gVar.f113521l)) {
            hashMap.put("aid", gVar.f113521l);
        }
        if (!TextUtils.isEmpty(gVar.f113522m)) {
            hashMap.put("app_language", gVar.f113522m);
        }
        if (!TextUtils.isEmpty(gVar.f113523n)) {
            hashMap.put("language", gVar.f113523n);
        }
        if (!TextUtils.isEmpty(gVar.f113524o)) {
            hashMap.put("longitude", gVar.f113524o);
        }
        if (!TextUtils.isEmpty(gVar.f113525p)) {
            hashMap.put("latitude", gVar.f113525p);
        }
        if (!TextUtils.isEmpty(gVar.f113526q)) {
            hashMap.put("city_code", gVar.f113526q);
        }
        if (!TextUtils.isEmpty(gVar.f113518i)) {
            hashMap.put("gpu", gVar.f113518i);
        }
        hashMap.put("platform_sdk_version", "560.1.0.6");
        return hashMap;
    }

    public C43727d(Handler handler, String str) {
        this.f113226c = handler;
        this.f113227d = str;
        this.f113229f = Policy.ACTION_NORMAL;
    }

    /* renamed from: a */
    public final void mo105769a(int i, C43725b bVar) {
        bVar.f113219a = this.f113227d;
        Message obtainMessage = this.f113226c.obtainMessage(i);
        obtainMessage.obj = bVar;
        obtainMessage.sendToTarget();
    }

    public C43727d(Handler handler, String str, String str2) {
        this.f113226c = handler;
        this.f113227d = str;
        this.f113229f = str2;
    }
}
