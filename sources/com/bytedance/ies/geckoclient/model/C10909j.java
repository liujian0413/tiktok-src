package com.bytedance.ies.geckoclient.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.ies.geckoclient.model.j */
public final class C10909j {
    @C6593c(mo15949a = "package_version")

    /* renamed from: a */
    public int f29540a;
    @C6593c(mo15949a = "channel")

    /* renamed from: b */
    public String f29541b;
    @C6593c(mo15949a = "package_type")

    /* renamed from: c */
    public int f29542c;

    /* renamed from: d */
    public String f29543d;

    /* renamed from: e */
    public long f29544e;
    @C6593c(mo15949a = "content")

    /* renamed from: f */
    private C10910a f29545f;

    /* renamed from: com.bytedance.ies.geckoclient.model.j$a */
    public static class C10910a {
        @C6593c(mo15949a = "package")

        /* renamed from: a */
        public C10911b f29546a;
        @C6593c(mo15949a = "patch")

        /* renamed from: b */
        public C10911b f29547b;
        @C6593c(mo15949a = "strategies")

        /* renamed from: c */
        public C10908i f29548c;
    }

    /* renamed from: com.bytedance.ies.geckoclient.model.j$b */
    public static class C10911b {
        @C6593c(mo15949a = "id")

        /* renamed from: a */
        public int f29549a;

        /* renamed from: b */
        public String f29550b;
        @C6593c(mo15949a = "url_list")

        /* renamed from: c */
        public List<String> f29551c;
        @C6593c(mo15949a = "md5")

        /* renamed from: d */
        public String f29552d;

        /* renamed from: e */
        public String f29553e;

        /* renamed from: f */
        public String f29554f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Package{url='");
            sb.append(this.f29550b);
            sb.append('\'');
            sb.append(", md5='");
            sb.append(this.f29552d);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public final C10911b mo26309a() {
        return this.f29545f.f29546a;
    }

    /* renamed from: b */
    public final C10911b mo26310b() {
        return this.f29545f.f29547b;
    }

    /* renamed from: c */
    public final C10908i mo26311c() {
        return this.f29545f.f29548c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatePackage{version=");
        sb.append(this.f29540a);
        sb.append(", channel='");
        sb.append(this.f29541b);
        sb.append('\'');
        sb.append(", content=");
        sb.append(this.f29545f);
        sb.append(", packageType=");
        sb.append(this.f29542c);
        sb.append(", afterPatchZip='");
        sb.append(this.f29543d);
        sb.append('\'');
        sb.append(", downloadFileSize=");
        sb.append(this.f29544e);
        sb.append('}');
        return sb.toString();
    }
}
