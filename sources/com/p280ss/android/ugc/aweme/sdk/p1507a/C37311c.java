package com.p280ss.android.ugc.aweme.sdk.p1507a;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.sdk.iap.C37334b;
import com.p280ss.android.ugc.aweme.sdk.iap.C37350e.C37352b;
import com.p280ss.android.ugc.aweme.sdk.iap.adapter.C37332a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.a.c */
public final class C37311c extends C37308a {

    /* renamed from: e */
    private C37352b f97455e;

    /* renamed from: f */
    private C37313d f97456f;

    /* renamed from: g */
    private C37334b f97457g = new C37334b() {
        /* renamed from: a */
        public final void mo93929a(int i, Exception exc) {
            String str;
            if (i == 1 || i == 0) {
                try {
                    C37311c.this.f97448b.put("code", -1);
                    JSONObject jSONObject = C37311c.this.f97448b;
                    String str2 = "msg";
                    if (exc == null) {
                        str = "";
                    } else {
                        str = exc.getMessage();
                    }
                    jSONObject.put(str2, str);
                } catch (JSONException unused) {
                }
                C37311c.this.f97450d.mo27030a(C37311c.this.f97447a.f30169b, C37311c.this.f97448b);
            }
        }

        /* renamed from: a */
        public final void mo93930a(int i, Object obj) {
            List list;
            if (i == 1) {
                if (obj == null) {
                    list = new ArrayList(0);
                } else {
                    list = (List) obj;
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    arrayList.add(C37332a.m119858a((C37332a) list.get(i2)));
                }
                try {
                    C37311c.this.f97448b.put("code", 0);
                    C37311c.this.f97448b.put("args", arrayList);
                } catch (JSONException unused) {
                }
                C37311c.this.f97450d.mo27030a(C37311c.this.f97447a.f30169b, C37311c.this.f97448b);
            }
        }
    };

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        super.call(iVar, jSONObject);
        if (this.f97455e == null) {
            this.f97455e = this.f97456f.mo93931a(this.f97449c, this.f97457g);
        }
        this.f97447a = iVar;
        this.f97448b = jSONObject;
        iVar.f30173f = false;
        this.f97455e.mo93983a();
    }

    public C37311c(Context context, C11087a aVar, C37313d dVar) {
        super(context, aVar);
        this.f97456f = dVar;
    }
}
