package com.bytedance.android.livesdk.action.p182a;

import com.bytedance.android.livesdk.action.C3867c;
import com.bytedance.android.livesdk.action.C3868d;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7605h;
import org.json.JSONObject;

@C3867c(mo11408a = "webcast_inroom_livelog")
/* renamed from: com.bytedance.android.livesdk.action.a.d */
public final class C3859d extends C3868d<JSONObject> {

    /* renamed from: com.bytedance.android.livesdk.action.a.d$a */
    static final class C3860a extends Lambda implements C7562b<String, Pair<? extends String, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11560a;

        C3860a(JSONObject jSONObject) {
            this.f11560a = jSONObject;
            super(1);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
            if (r0 == null) goto L_0x000e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public kotlin.Pair<java.lang.String, java.lang.String> invoke(java.lang.String r2) {
            /*
                r1 = this;
                org.json.JSONObject r0 = r1.f11560a
                java.lang.Object r0 = r0.get(r2)
                if (r0 == 0) goto L_0x000e
                java.lang.String r0 = r0.toString()
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                java.lang.String r0 = ""
            L_0x0010:
                kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.action.p182a.C3859d.C3860a.invoke(java.lang.String):kotlin.Pair");
        }
    }

    /* renamed from: a */
    private static Map<String, String> m13708a(JSONObject jSONObject) {
        Iterator keys = jSONObject.keys();
        C7573i.m23582a((Object) keys, "keys()");
        return C7507ae.m23391a(C7605h.m23659d(C7605h.m23637a(keys), new C3860a(jSONObject)));
    }

    /* renamed from: a */
    public final void mo11405a(Map<String, Object> map) {
        String str;
        Object obj = map.get("event_name");
        Object obj2 = map.get("params");
        if (obj2 != null) {
            str = obj2.toString();
        } else {
            str = null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (obj != null) {
                C8443c.m25663a().mo21606a(obj.toString(), m13708a(jSONObject), Room.class, C8438j.class);
            }
        } catch (Exception unused) {
        }
        mo11410a(null);
    }
}
