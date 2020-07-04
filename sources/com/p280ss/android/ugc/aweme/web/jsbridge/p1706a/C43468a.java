package com.p280ss.android.ugc.aweme.web.jsbridge.p1706a;

import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a */
public final class C43468a {

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$a */
    public static class C43469a {

        /* renamed from: a */
        public String f112574a;

        /* renamed from: b */
        public String f112575b;

        /* renamed from: c */
        public JSONObject f112576c;

        public C43469a(String str, String str2, JSONObject jSONObject) {
            this.f112574a = str;
            this.f112575b = str2;
            this.f112576c = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$b */
    public interface C43470b {
        /* renamed from: a */
        void mo61496a(C43469a aVar, C43471c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$c */
    public static class C43471c {

        /* renamed from: a */
        public JSONObject f112577a;

        /* renamed from: b */
        public Exception f112578b;

        public C43471c(JSONObject jSONObject, Exception exc) {
            this.f112577a = jSONObject;
            this.f112578b = exc;
        }
    }

    /* renamed from: a */
    private static String m137934a(C11097i iVar) {
        try {
            return iVar.f30171d.getString("proto");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static C43472b m137933a(C11097i iVar, JSONObject jSONObject, C11087a aVar, C43470b bVar) {
        char c;
        String a = m137934a(iVar);
        if (a.hashCode() == 3708 && a.equals("v2")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return new C43473c(iVar, jSONObject, aVar, bVar);
        }
        return new C43480e(iVar, jSONObject, aVar, bVar);
    }
}
