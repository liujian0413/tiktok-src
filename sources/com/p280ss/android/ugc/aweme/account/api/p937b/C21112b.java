package com.p280ss.android.ugc.aweme.account.api.p937b;

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
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.bytedance.sdk.account.p666g.C12884a;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.api.b.b */
public final class C21112b extends C12806h<C12710e<C12836s>> {

    /* renamed from: f */
    public static final C21113a f56686f = new C21113a(null);

    /* renamed from: e */
    public final C12836s f56687e;

    /* renamed from: com.ss.android.ugc.aweme.account.api.b.b$a */
    public static final class C21113a {
        private C21113a() {
        }

        public /* synthetic */ C21113a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private final C12791a m71193a(C12836s sVar) {
            C12791a a = new C12791a().mo31345a(m71194b(sVar));
            C7573i.m23582a((Object) a, "ApiRequest.Builder()\n   …ters(getParams(queryObj))");
            return a;
        }

        /* renamed from: b */
        private static Map<String, String> m71194b(C12836s sVar) {
            Map<String, String> hashMap = new HashMap<>();
            String d = C6319n.m19597d(sVar.f33997a);
            C7573i.m23582a((Object) d, "StringUtils.encryptWithXor(queryObj.mMobile)");
            hashMap.put("mobile", d);
            if (!TextUtils.isEmpty(sVar.f34003g)) {
                String d2 = C6319n.m19597d(sVar.f34003g);
                C7573i.m23582a((Object) d2, "StringUtils.encryptWithXor(queryObj.mOldMobile)");
                hashMap.put("old_mobile", d2);
            }
            String str = sVar.f33998b;
            C7573i.m23582a((Object) str, "queryObj.mCaptcha");
            hashMap.put("captcha", str);
            String d3 = C6319n.m19597d(String.valueOf(sVar.f34001e));
            C7573i.m23582a((Object) d3, "StringUtils.encryptWithX…ueryObj.mType.toString())");
            hashMap.put("type", d3);
            String d4 = C6319n.m19597d(String.valueOf(sVar.f34002f));
            C7573i.m23582a((Object) d4, "StringUtils.encryptWithX….mUnbindExist.toString())");
            hashMap.put("unbind_exist", d4);
            hashMap.put("mix_mode", "1");
            if (sVar.f34011z == 1) {
                hashMap.put("check_register", "1");
            } else if (sVar.f34011z == 0) {
                hashMap.put("check_register", "0");
            }
            if (!TextUtils.isEmpty(sVar.f34005t)) {
                String str2 = sVar.f34005t;
                C7573i.m23582a((Object) str2, "queryObj.mTicket");
                hashMap.put("ticket", str2);
            }
            hashMap.put("auto_read", String.valueOf(sVar.f34006u));
            if (!TextUtils.isEmpty(sVar.f34007v)) {
                String str3 = sVar.f34007v;
                C7573i.m23582a((Object) str3, "queryObj.mSharkTicket");
                hashMap.put("shark_ticket", str3);
            }
            if (!TextUtils.isEmpty(sVar.f34008w)) {
                String str4 = sVar.f34008w;
                C7573i.m23582a((Object) str4, "queryObj.mUnusableMobileTicket");
                hashMap.put("unusable_mobile_ticket", str4);
            }
            return hashMap;
        }

        /* renamed from: a */
        public final C21112b mo56964a(Context context, String str, String str2, int i, int i2, String str3, int i3, int i4, C12855p pVar) {
            Context context2 = context;
            C12855p pVar2 = pVar;
            C7573i.m23587b(context, "context");
            String str4 = str;
            C7573i.m23587b(str, "mobile");
            String str5 = str2;
            C7573i.m23587b(str2, "captcha");
            String str6 = str3;
            C7573i.m23587b(str6, "ticket");
            C7573i.m23587b(pVar2, "call");
            C12836s sVar = new C12836s(str4, str5, i, i2, str6, i3, i4);
            C12790a c = m71193a(sVar).mo31343a(C12715a.m36938a("/passport/mobile/send_whatsapp_code/")).mo31348c();
            C7573i.m23582a((Object) c, "request");
            return new C21112b(context, c, sVar, pVar2);
        }
    }

    /* renamed from: a */
    public static final C21112b m71186a(Context context, String str, String str2, int i, int i2, String str3, int i3, int i4, C12855p pVar) {
        return f56686f.mo56964a(context, str, str2, i, 0, str3, i3, i4, pVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo31160a(C12710e<C12836s> eVar) {
        C12884a.m37499a("passport_mobile_sendcode", "mobile", this.f33895b.mo31341a("type"), (C12707b) eVar, this.f33896c);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12710e<C12836s> mo31159a(boolean z, C12792b bVar) {
        return new C12710e<>(z, 1002, this.f56687e);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        C12836s sVar = this.f56687e;
        if (jSONObject2 != null) {
            i = jSONObject2.optInt("retry_time", 30);
        } else {
            i = 0;
        }
        sVar.f34004s = i;
        this.f56687e.f33964l = jSONObject;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37136a(this.f56687e, jSONObject);
        this.f56687e.f33964l = jSONObject2;
    }

    public C21112b(Context context, C12790a aVar, C12836s sVar, C12855p pVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "request");
        C7573i.m23587b(sVar, "queryObj");
        C7573i.m23587b(pVar, "call");
        super(context, aVar, pVar);
        this.f56687e = sVar;
    }
}
