package com.p280ss.android.ugc.aweme.app;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.experiment.RNLibrarianExperiment;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.o */
public final class C23016o {

    /* renamed from: a */
    public static final C23017a f60793a = new C23017a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.o$a */
    public static final class C23017a {
        private C23017a() {
        }

        public /* synthetic */ C23017a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m75671a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
            String str3;
            C7573i.m23587b(str, "logType");
            C7573i.m23587b(str2, "serviceName");
            C7573i.m23587b(jSONObject, "category");
            C7573i.m23587b(jSONObject2, "metric");
            C7573i.m23587b(jSONObject3, "value");
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("status", 0);
            jSONObject5.put("value", jSONObject3);
            String str4 = "category";
            if (C6384b.m19835a().mo15292a(RNLibrarianExperiment.class, true, "rn_use_librarian", C6384b.m19835a().mo15295d().rn_use_librarian, false)) {
                str3 = "true";
            } else {
                str3 = "false";
            }
            jSONObject.put("rn_use_librarian", str3);
            jSONObject5.put(str4, jSONObject);
            jSONObject5.put("metric", jSONObject2);
            if (jSONObject4 != null) {
                jSONObject5.put("extra", jSONObject4);
            }
            C6877n.m21407a(str, str2, jSONObject5);
        }
    }
}
