package com.bytedance.opensdk.core.p620a.p621a;

import com.bytedance.opensdk.core.base.p626b.C12306a;
import com.bytedance.opensdk.core.base.p626b.C12307b;
import com.bytedance.opensdk.core.p620a.C12288a;
import com.bytedance.opensdk.core.p620a.p622b.C12296b;
import com.bytedance.opensdk.p619b.C12267b;
import com.bytedance.opensdk.p619b.C12280k;
import com.bytedance.opensdk.p619b.C12285o;
import com.google.gson.C18373n;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.LinkedHashMap;
import kotlin.coroutines.C47919b;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.opensdk.core.a.a.b */
public final class C12290b extends C12289a<C12296b> {

    /* renamed from: com.bytedance.opensdk.core.a.a.b$a */
    public final class C12291a extends C12306a {
        public C12291a(String str, Integer num) {
            super(str, num);
        }
    }

    /* renamed from: com.bytedance.opensdk.core.a.a.b$b */
    public final class C12292b extends C12307b<C12291a> {

        /* renamed from: a */
        final /* synthetic */ C12290b f32645a;

        public C12292b(C12290b bVar, String str, C12291a aVar) {
            C7573i.m23587b(str, "message");
            C7573i.m23587b(aVar, "data");
            this.f32645a = bVar;
            super(str, aVar);
        }
    }

    public C12290b(C12296b bVar) {
        C7573i.m23587b(bVar, "authConfig");
        super(bVar);
    }

    /* renamed from: a */
    public final Object mo30094a(C47919b<? super C12288a> bVar) {
        return C12267b.m35665a(m35725a(((C12296b) this.f32643a).f32648b, ((C12296b) this.f32643a).f32650d));
    }

    /* renamed from: a */
    private final C12292b m35725a(int i, String str) {
        C6711m mVar;
        int i2;
        C12285o oVar = new C12285o(C12280k.m35704b());
        C6711m mVar2 = new C6711m();
        mVar2.mo16147a("client_key", str);
        mVar2.mo16146a("app_id", (Number) Integer.valueOf(i));
        try {
            C18373n nVar = new C18373n();
            C12280k kVar = C12280k.f32621a;
            String a = oVar.mo30089a();
            String mVar3 = mVar2.toString();
            C7573i.m23582a((Object) mVar3, "body.toString()");
            C6709k a2 = nVar.mo47346a(C12280k.m35697a(a, mVar3, new LinkedHashMap(), new LinkedHashMap()));
            C7573i.m23582a((Object) a2, "JsonParser().parse(SdkUt… body = body.toString()))");
            mVar = a2.mo16136m();
        } catch (Exception e) {
            mVar = C12267b.m35671a(e, (int) C34943c.f91128x);
        }
        C7573i.m23582a((Object) mVar, "jsonResp");
        String a3 = C12267b.m35674a(mVar, "message", (String) null);
        if (a3 == null) {
            a3 = "";
        }
        String a4 = C12267b.m35674a(mVar, "error_message", (String) null);
        if (a4 == null) {
            a4 = C12267b.m35674a(mVar, "description", (String) null);
        }
        String a5 = C12267b.m35674a(mVar, "error_code", (String) null);
        if (a5 != null) {
            Integer d = C7634n.m23706d(a5);
            if (d != null) {
                i2 = d.intValue();
                return new C12292b(this, a3, new C12291a(a4, Integer.valueOf(i2)));
            }
        }
        i2 = C12267b.m35664a(mVar, "error_code", -1);
        return new C12292b(this, a3, new C12291a(a4, Integer.valueOf(i2)));
    }
}
