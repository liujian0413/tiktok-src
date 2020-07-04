package com.p280ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f */
public final class C29108f extends C29100a {

    /* renamed from: a */
    public static final C29109a f76859a = new C29109a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$a */
    public static final class C29109a {
        private C29109a() {
        }

        public /* synthetic */ C29109a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo74558a() {
        return "abnor_player";
    }

    /* renamed from: b */
    public final long mo74560b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo74561c() {
        long currentTimeMillis = System.currentTimeMillis() - mo74560b();
        List b = C29097a.m95452a().mo74534b("block", currentTimeMillis);
        List<C37295c> b2 = C29097a.m95452a().mo74534b("error", currentTimeMillis);
        JSONObject jSONObject = new JSONObject();
        if (!b.isEmpty()) {
            jSONObject.put("block_count", b.size());
        }
        if (!b2.isEmpty()) {
            jSONObject.put("error_count", b2.size());
            JSONArray jSONArray = new JSONArray();
            for (C37295c cVar : b2) {
                if (cVar != null) {
                    jSONArray.put(new JSONObject(cVar.f97424d));
                }
            }
            jSONObject.put("error_code_msg", jSONArray);
        }
        String jSONObject2 = jSONObject.toString();
        C7573i.m23582a((Object) jSONObject2, "result.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    public final boolean mo74559a(String str) {
        C7573i.m23587b(str, "type");
        int hashCode = str.hashCode();
        if (hashCode == 93832333 ? !str.equals("block") : hashCode != 96784904 || !str.equals("error")) {
            return false;
        }
        return true;
    }
}
