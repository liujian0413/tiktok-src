package com.bytedance.ies.bullet.kit.p261rn.internal;

import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C47965i;
import kotlin.Result;
import kotlin.collections.C7506ac;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.c */
public final class C10541c {

    /* renamed from: d */
    public static final C10542a f28267d = new C10542a(null);

    /* renamed from: a */
    public List<String> f28268a = new ArrayList();

    /* renamed from: b */
    public String f28269b = "";

    /* renamed from: c */
    public String f28270c = "";

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.c$a */
    public static final class C10542a {
        private C10542a() {
        }

        public /* synthetic */ C10542a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final C10541c mo25327a(String str) {
            Object obj;
            C7573i.m23587b(str, "json");
            try {
                JSONObject jSONObject = new JSONObject(str);
                C10541c cVar = new C10541c();
                JSONArray optJSONArray = jSONObject.optJSONArray("modules");
                if (optJSONArray != null) {
                    List arrayList = new ArrayList();
                    Iterator it = C7551d.m23565b(0, optJSONArray.length()).iterator();
                    while (it.hasNext()) {
                        String optString = optJSONArray.optString(((C7506ac) it).mo19392a());
                        if (optString != null) {
                            arrayList.add(optString);
                        }
                    }
                    cVar.mo25325a(arrayList);
                }
                String optString2 = jSONObject.optString(C38347c.f99551f);
                if (optString2 != null) {
                    cVar.mo25324a(optString2);
                }
                String optString3 = jSONObject.optString("base_version");
                if (optString3 != null) {
                    cVar.mo25326b(optString3);
                }
                obj = Result.m150902constructorimpl(cVar);
            } catch (Throwable th) {
                obj = Result.m150902constructorimpl(C47965i.m148906a(th));
            }
            if (Result.m150908isFailureimpl(obj)) {
                obj = null;
            }
            return (C10541c) obj;
        }
    }

    /* renamed from: a */
    public final void mo25324a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f28269b = str;
    }

    /* renamed from: b */
    public final void mo25326b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f28270c = str;
    }

    /* renamed from: a */
    public final void mo25325a(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f28268a = list;
    }
}
