package com.p280ss.android.ugc.effectmanager;

import com.p280ss.android.ugc.effectmanager.common.C43728e;
import com.p280ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p280ss.android.ugc.effectmanager.model.ModelInfo;

/* renamed from: com.ss.android.ugc.effectmanager.l */
public final class C43847l {

    /* renamed from: a */
    public C43728e<String, C43848a> f113600a;

    /* renamed from: com.ss.android.ugc.effectmanager.l$a */
    static class C43848a {

        /* renamed from: a */
        public ModelInfo f113601a;

        /* renamed from: a */
        public final String mo106062a() {
            return this.f113601a.getName();
        }

        /* renamed from: b */
        public final String mo106063b() {
            return this.f113601a.getVersion();
        }

        /* renamed from: c */
        public final ExtendedUrlModel mo106064c() {
            return this.f113601a.getFile_url();
        }

        public final int hashCode() {
            return this.f113601a.hashCode();
        }

        public C43848a(ModelInfo modelInfo) {
            this.f113601a = modelInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f113601a.equals(((C43848a) obj).f113601a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ExtendedUrlModel mo106061a(String str) {
        for (C43848a aVar : this.f113600a.mo105773b()) {
            if (aVar.mo106062a().equals(str)) {
                return aVar.mo106064c();
            }
        }
        StringBuilder sb = new StringBuilder("modelName ");
        sb.append(str);
        sb.append(" doesn't exist");
        throw new IllegalArgumentException(sb.toString());
    }
}
