package com.p280ss.android.ugc.effectmanager;

import com.p280ss.android.ugc.effectmanager.common.C43728e;
import com.p280ss.android.ugc.effectmanager.model.ModelInfo;
import com.p280ss.android.ugc.effectmanager.p1725c.C43701a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.o */
public final class C43862o {

    /* renamed from: a */
    private C43728e<String, ModelInfo> f113634a;

    /* renamed from: b */
    private C43847l f113635b;

    /* renamed from: b */
    private void m138926b() {
        HashMap hashMap = new HashMap();
        for (ModelInfo modelInfo : this.f113634a.mo105773b()) {
            String name = modelInfo.getName();
            if (!hashMap.containsKey(name)) {
                hashMap.put(name, modelInfo.getVersion());
            } else if (!((String) hashMap.get(name)).equals(modelInfo.getVersion())) {
                StringBuilder sb = new StringBuilder("model ");
                sb.append(name);
                sb.append(" has different versions in ServerTable,Please modify the file to the correct format ");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final C43847l mo106118a() {
        if (this.f113635b == null) {
            m138926b();
            this.f113635b = new C43847l();
            C43728e<String, C43848a> eVar = new C43728e<>();
            for (String str : this.f113634a.mo105771a()) {
                for (ModelInfo aVar : this.f113634a.mo105770a(str)) {
                    eVar.mo105772a(str, new C43848a(aVar));
                }
            }
            this.f113635b.f113600a = eVar;
        }
        return this.f113635b;
    }

    public C43862o(C43728e<String, ModelInfo> eVar) {
        this.f113634a = (C43728e) C43701a.m138484a(eVar);
    }
}
