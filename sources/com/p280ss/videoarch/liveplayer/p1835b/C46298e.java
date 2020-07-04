package com.p280ss.videoarch.liveplayer.p1835b;

import com.p280ss.videoarch.liveplayer.C46300c;
import com.p280ss.videoarch.liveplayer.C46300c.C46302a;
import com.p280ss.videoarch.liveplayer.log.LiveError;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.b.e */
final class C46298e {

    /* renamed from: com.ss.videoarch.liveplayer.b.e$a */
    interface C46299a {
        /* renamed from: a */
        void mo115038a(LiveError liveError);

        /* renamed from: a */
        void mo115039a(JSONObject jSONObject);
    }

    /* renamed from: a */
    static void m145339a(C46300c cVar, String str, String str2, C46299a aVar) {
        LiveError liveError;
        if (str2 != null) {
            C46302a a = cVar.mo21841a(str, str2);
            if (a == null) {
                aVar.mo115038a(new LiveError(-111, "result is null", null));
                return;
            }
            Exception exc = a.f118958d;
            if (exc != null || a.f118955a == null) {
                HashMap hashMap = new HashMap();
                if (a.f118955a != null) {
                    hashMap.put("rawResp", a.f118955a);
                }
                if (exc instanceof IOException) {
                    hashMap.put("description", "network IO exception");
                    liveError = new LiveError(-108, exc.toString(), hashMap);
                } else if (exc instanceof JSONException) {
                    hashMap.put("description", "parse JSON failure");
                    if (a.f118956b != null) {
                        hashMap.put("rowBody", a.f118956b);
                    }
                    if (a.f118957c != null) {
                        hashMap.put("responseHeader", a.f118957c);
                    }
                    liveError = new LiveError(-100, exc.getMessage(), hashMap);
                } else {
                    hashMap.put("description", "response not successful");
                    liveError = new LiveError(-104, exc.getMessage(), hashMap);
                }
                aVar.mo115038a(liveError);
                return;
            }
            aVar.mo115039a(a.f118955a);
        }
    }
}
