package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.live.base.model.C2343f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.banner.a */
public class C2337a implements C2343f {
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public long f7662a;
    @C6593c(mo15949a = "title")

    /* renamed from: b */
    public String f7663b;
    @C6593c(mo15949a = "url_list")

    /* renamed from: c */
    public List<String> f7664c;
    @C6593c(mo15949a = "uri")

    /* renamed from: d */
    public String f7665d;
    @C6593c(mo15949a = "height")

    /* renamed from: e */
    public int f7666e;
    @C6593c(mo15949a = "width")

    /* renamed from: f */
    public int f7667f;
    @C6593c(mo15949a = "schema_url")

    /* renamed from: g */
    public String f7668g;
    @C6593c(mo15949a = "text")

    /* renamed from: h */
    public String f7669h;
    @C6593c(mo15949a = "action_type")

    /* renamed from: i */
    public int f7670i;
    @C6593c(mo15949a = "priority")

    /* renamed from: j */
    public int f7671j;
    @C6593c(mo15949a = "extra")

    /* renamed from: k */
    String f7672k;
    @C6593c(mo15949a = "avg_color")

    /* renamed from: l */
    public String f7673l;
    @C6593c(mo15949a = "banner_type")

    /* renamed from: m */
    public int f7674m;

    /* renamed from: n */
    private ImageModel f7675n;

    public long getId() {
        return this.f7662a;
    }

    public String getMixId() {
        return String.valueOf(getId());
    }

    /* renamed from: a */
    public final ImageModel mo8227a() {
        if (!(this.f7675n != null || this.f7664c == null || this.f7665d == null)) {
            this.f7675n = new ImageModel(this.f7665d, this.f7664c);
        }
        return this.f7675n;
    }

    /* renamed from: a */
    public final boolean mo8228a(C2337a aVar) {
        if (this == aVar) {
            return true;
        }
        if (aVar == null || this.f7662a != aVar.f7662a || !C6319n.m19594a(this.f7663b, aVar.f7663b) || !C6319n.m19594a(this.f7665d, aVar.f7665d) || !C6319n.m19594a(this.f7668g, aVar.f7668g) || !C6319n.m19594a(this.f7669h, aVar.f7669h) || this.f7667f != aVar.f7667f || this.f7666e != aVar.f7666e) {
            return false;
        }
        if (this.f7664c == null && aVar.f7664c != null) {
            return false;
        }
        if (this.f7664c != null && aVar.f7664c == null) {
            return false;
        }
        if (this.f7664c == null && aVar.f7664c == null) {
            return true;
        }
        if (this.f7664c.size() != aVar.f7664c.size() || this.f7670i != aVar.f7670i || this.f7671j != aVar.f7671j) {
            return false;
        }
        for (int i = 0; i < this.f7664c.size(); i++) {
            if (!C6319n.m19594a((String) this.f7664c.get(i), (String) aVar.f7664c.get(i))) {
                return false;
            }
        }
        if (!C6319n.m19594a(this.f7672k, aVar.f7672k)) {
            return false;
        }
        return true;
    }
}
