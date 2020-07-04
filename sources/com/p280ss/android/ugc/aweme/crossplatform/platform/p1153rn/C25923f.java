package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.framework.C29957d;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27873e;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.f */
public final class C25923f implements C29957d {
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo67298a() {
        /*
            r3 = this;
            com.bytedance.ies.geckoclient.f r0 = com.p280ss.android.ugc.aweme.utils.C42983bo.m136460b()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r2 = "rn_base_android"
            com.bytedance.ies.geckoclient.model.d r0 = r0.mo26209a(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.lang.String r0 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25913b.m85207c(r0)
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x001d
            return r1
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25923f.mo67298a():java.lang.String");
    }

    /* renamed from: b */
    public final String mo67301b() {
        C10873f b = C42983bo.m136460b();
        if (b == null) {
            return null;
        }
        C10903d a = b.mo26209a("rn_snapshot");
        if (a == null) {
            return null;
        }
        return C25913b.m85201a(a, "blobdata");
    }

    /* renamed from: a */
    public final void mo67299a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_time", j);
        } catch (JSONException unused) {
        }
        C6877n.m21447a("react_page_load_time", jSONObject);
    }

    /* renamed from: a */
    public final void mo67300a(Exception exc, Map<String, Object> map) {
        C25871a.m85133a().mo67245a(exc, "native");
        C27873e.m91306a(exc, map);
    }
}
