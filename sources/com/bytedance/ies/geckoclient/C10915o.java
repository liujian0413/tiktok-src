package com.bytedance.ies.geckoclient;

import com.bytedance.ies.geckoclient.model.C10912k;
import com.bytedance.ies.geckoclient.model.CommonParamsModel;
import com.bytedance.ies.geckoclient.p571e.C10867d;

/* renamed from: com.bytedance.ies.geckoclient.o */
final class C10915o {

    /* renamed from: a */
    public C10912k f29559a;

    C10915o(C10873f fVar) {
        String d = fVar.mo26227d();
        String b = C10867d.m31883b();
        String c = fVar.mo26225c();
        StringBuilder sb = new StringBuilder();
        sb.append(C10867d.m31885c(C10873f.m31911e()));
        CommonParamsModel commonParamsModel = new CommonParamsModel(d, 0, b, c, sb.toString(), C10867d.m31880a());
        this.f29559a = new C10912k(commonParamsModel);
    }
}
