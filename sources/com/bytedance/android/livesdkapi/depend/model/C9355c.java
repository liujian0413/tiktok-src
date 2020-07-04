package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.android.live.base.model.C2347g;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.c */
public final class C9355c {
    @C6593c(mo15949a = "icon_url")

    /* renamed from: a */
    public C2347g f25562a;
    @C6593c(mo15949a = "file_url")

    /* renamed from: b */
    public C2347g f25563b;
    @C6593c(mo15949a = "material_type")

    /* renamed from: c */
    public int f25564c;
    @C6593c(mo15949a = "md5")

    /* renamed from: d */
    public String f25565d;
    @C6593c(mo15949a = "id")

    /* renamed from: e */
    public long f25566e;
    @C6593c(mo15949a = "name")

    /* renamed from: f */
    public String f25567f;
    @C6593c(mo15949a = "description")

    /* renamed from: g */
    public List<String> f25568g;
    @C6593c(mo15949a = "tags")

    /* renamed from: h */
    public List<String> f25569h;

    /* renamed from: i */
    public C9356a f25570i;

    /* renamed from: j */
    public List<C9355c> f25571j;

    /* renamed from: k */
    public List<String> f25572k = new ArrayList();

    /* renamed from: l */
    public Effect f25573l;

    /* renamed from: m */
    public String f25574m;

    /* renamed from: n */
    public String f25575n;

    /* renamed from: o */
    public String f25576o;

    /* renamed from: p */
    public String f25577p = "";

    /* renamed from: q */
    public int f25578q = 0;

    /* renamed from: r */
    public String f25579r;

    /* renamed from: s */
    public String f25580s;

    /* renamed from: t */
    public String f25581t;

    /* renamed from: u */
    public boolean f25582u;

    /* renamed from: v */
    public boolean f25583v;

    /* renamed from: w */
    public String f25584w;

    /* renamed from: x */
    public String f25585x;

    /* renamed from: y */
    public String f25586y;

    /* renamed from: z */
    public String f25587z;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.c$a */
    public static class C9356a {
        @C6593c(mo15949a = "value")

        /* renamed from: a */
        public int f25588a;
        @C6593c(mo15949a = "tag")

        /* renamed from: b */
        public String f25589b = "";
        @C6593c(mo15949a = "max")

        /* renamed from: c */
        public int f25590c = 100;
        @C6593c(mo15949a = "min")

        /* renamed from: d */
        public int f25591d = 100;
        @C6593c(mo15949a = "doubleDirection")

        /* renamed from: e */
        public boolean f25592e;
    }

    /* renamed from: a */
    public final boolean mo22813a(C9355c cVar) {
        if (cVar != null && this.f25566e == cVar.f25566e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m27822a(C9355c cVar, C9355c cVar2) {
        if (cVar == null || cVar2 == null || cVar.f25566e != cVar2.f25566e) {
            return false;
        }
        return true;
    }
}
