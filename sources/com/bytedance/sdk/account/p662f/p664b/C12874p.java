package com.bytedance.sdk.account.p662f.p664b;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12795b.C12796a;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p662f.p663a.C12834q;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12853n;
import com.bytedance.sdk.account.p666g.C12884a;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.p */
public final class C12874p extends C12806h<C12710e<C12834q>> {

    /* renamed from: e */
    private C12834q f34039e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12834q> eVar) {
        C12884a.m37499a("passport_mobile_register", "mobile", (String) null, (C12707b) eVar, this.f33896c);
    }

    /* renamed from: a */
    private static Map<String, String> m37432a(C12834q qVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C6319n.m19597d(qVar.f33987a));
        hashMap.put("captcha", qVar.f33989c);
        hashMap.put("code", C6319n.m19597d(String.valueOf(qVar.f33988b)));
        hashMap.put("password", C6319n.m19597d(qVar.f33990d));
        hashMap.put("type", C6319n.m19597d(String.valueOf(qVar.f33970r)));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12834q> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, LiveRoomStruct.ROOM_LONGTIME_NO_NET, this.f34039e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34039e.f33991e = C12796a.m37140a(jSONObject, jSONObject2);
        this.f34039e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f34039e, jSONObject);
        this.f34039e.f33964l = jSONObject2;
    }

    private C12874p(Context context, C12790a aVar, C12834q qVar, C12853n nVar) {
        super(context, aVar, nVar);
        this.f34039e = qVar;
    }

    /* renamed from: a */
    public static C12874p m37431a(Context context, String str, String str2, String str3, String str4, C12853n nVar) {
        C12834q qVar = new C12834q(str, str2, str3, str4);
        return new C12874p(context, new C12791a().mo31343a(C12715a.m36940c()).mo31345a(m37432a(qVar)).mo31348c(), qVar, nVar);
    }
}
