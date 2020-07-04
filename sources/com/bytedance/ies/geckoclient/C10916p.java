package com.bytedance.ies.geckoclient;

import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.geckoclient.model.C10912k;
import com.bytedance.ies.geckoclient.p570d.C10852a;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.geckoclient.p */
final class C10916p extends C10835a {

    /* renamed from: b */
    public C10915o f29560b;

    public final void run() {
        int i = 0;
        while (i < 3) {
            try {
                m32001a();
                return;
            } catch (Exception unused) {
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m32001a() throws Exception {
        C10912k kVar = this.f29560b.f29559a;
        if (!C6311g.m19573a(kVar.f29556b) && new JSONObject(this.f29339a.mo26176a(kVar)).getInt("status") != 0) {
            throw new RuntimeException("上传失败");
        }
    }

    C10916p(C10852a aVar) {
        super(aVar);
    }
}
