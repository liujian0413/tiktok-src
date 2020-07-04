package com.bytedance.sdk.account.p662f.p664b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p662f.p663a.C12825h;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12847h;
import com.bytedance.sdk.account.p666g.C12884a;
import com.bytedance.sdk.account.utils.C12914g;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.i */
public final class C12867i extends C12806h<C12710e<C12825h>> {

    /* renamed from: e */
    private C12825h f34032e;

    /* renamed from: a */
    private static C12791a m37375a(C12825h hVar) {
        return new C12791a().mo31346a(m37379b(hVar), hVar.f33953e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12825h> eVar) {
        C12884a.m37499a("passport_email_send_code", "email", this.f33895b.mo31341a("type"), (C12707b) eVar, this.f33896c);
    }

    /* renamed from: b */
    private static Map<String, String> m37379b(C12825h hVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(hVar.f33949a)) {
            hashMap.put("email", C6319n.m19597d(hVar.f33949a));
        }
        if (!TextUtils.isEmpty(hVar.f33950b)) {
            hashMap.put("captcha", hVar.f33950b);
        }
        hashMap.put("type", C6319n.m19597d(String.valueOf(hVar.f33951c)));
        if (!TextUtils.isEmpty(hVar.f33955g)) {
            hashMap.put("password", C6319n.m19597d(hVar.f33955g));
        }
        if (!TextUtils.isEmpty(hVar.f33952d)) {
            hashMap.put("next", hVar.f33952d);
        }
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34032e.f33964l = jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12825h> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, PreloadTask.BYTE_UNIT_NUMBER, this.f34032e);
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34032e, jSONObject);
        this.f34032e.f33964l = jSONObject2;
    }

    private C12867i(Context context, C12790a aVar, C12825h hVar, C12847h hVar2) {
        super(context, aVar, hVar2);
        this.f34032e = hVar;
    }

    /* renamed from: a */
    public static C12867i m37376a(Context context, String str, String str2, String str3, int i, String str4, Map map, String str5, C12847h hVar) {
        C12825h hVar2 = new C12825h(str, str2, str3, i, str4, map, str5);
        Context context2 = context;
        return new C12867i(context, m37375a(hVar2).mo31343a(C12914g.m37592a(C12715a.m36952o(), str5)).mo31348c(), hVar2, hVar);
    }
}
