package com.bytedance.sdk.account.p662f.p664b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12713h;
import com.bytedance.sdk.account.p659c.C12790a;
import com.bytedance.sdk.account.p659c.C12790a.C12791a;
import com.bytedance.sdk.account.p659c.C12792b;
import com.bytedance.sdk.account.p660d.C12795b;
import com.bytedance.sdk.account.p660d.C12806h;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12859t;
import com.bytedance.sdk.account.p667h.C12885a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.w */
public final class C12882w extends C12806h<C12713h> {

    /* renamed from: e */
    private C12883a f34048e;

    /* renamed from: com.bytedance.sdk.account.f.b.w$a */
    public static class C12883a extends C12885a {

        /* renamed from: a */
        String f34049a;

        /* renamed from: b */
        public String f34050b;

        /* renamed from: c */
        public boolean f34051c;

        /* renamed from: d */
        public int f34052d;

        /* renamed from: e */
        public int f34053e;

        /* renamed from: f */
        public String f34054f;

        public C12883a(String str, boolean z, int i) {
            this.f34050b = str;
            this.f34051c = z;
            this.f34052d = i;
        }

        public C12883a(String str, boolean z, int i, int i2, String str2) {
            this.f34050b = str;
            this.f34051c = z;
            this.f34052d = i;
            this.f34053e = i2;
            this.f34054f = str2;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31160a(C12707b bVar) {
    }

    /* renamed from: a */
    private static Map<String, String> m37493a(C12883a aVar) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("code", Uri.encode(aVar.f34050b));
        hashMap.put("type", String.valueOf(aVar.f34052d));
        String str2 = "need_ticket";
        if (aVar.f34051c) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        if (aVar.f34053e > 0) {
            hashMap.put("scene", String.valueOf(aVar.f34053e));
        }
        if (!TextUtils.isEmpty(aVar.f34054f)) {
            hashMap.put("shark_ticket", aVar.f34054f);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo31161a(JSONObject jSONObject, JSONObject jSONObject2) {
        C12795b.m37137a(this.f34048e, jSONObject, jSONObject2);
    }

    /* renamed from: b */
    public final void mo31162b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        if (jSONObject2 != null) {
            this.f34048e.f34049a = jSONObject2.optString("ticket", "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C12713h mo31159a(boolean z, C12792b bVar) {
        C12713h hVar = new C12713h(z, 1015);
        if (z) {
            hVar.f33722g = this.f34048e.f34049a;
        } else {
            hVar.f33702b = this.f34048e.f34055g;
            hVar.f33703c = this.f34048e.f34056h;
        }
        return hVar;
    }

    private C12882w(Context context, C12790a aVar, C12883a aVar2, C12859t tVar) {
        super(context, aVar, tVar);
        this.f34048e = aVar2;
    }

    /* renamed from: a */
    public static C12882w m37492a(Context context, String str, int i, boolean z, C12859t tVar) {
        C12883a aVar = new C12883a(str, z, i);
        return new C12882w(context, new C12791a().mo31343a(C12715a.m36960w()).mo31345a(m37493a(aVar)).mo31348c(), aVar, tVar);
    }

    /* renamed from: a */
    public static C12882w m37491a(Context context, String str, int i, boolean z, int i2, String str2, C12859t tVar) {
        C12883a aVar = new C12883a(str, z, i, i2, str2);
        return new C12882w(context, new C12791a().mo31343a(C12715a.m36960w()).mo31345a(m37493a(aVar)).mo31348c(), aVar, tVar);
    }
}
