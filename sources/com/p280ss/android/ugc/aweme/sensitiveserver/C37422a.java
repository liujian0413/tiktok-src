package com.p280ss.android.ugc.aweme.sensitiveserver;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sensitiveserver.a */
public final class C37422a {

    /* renamed from: com.ss.android.ugc.aweme.sensitiveserver.a$a */
    public interface C37423a {
        /* renamed from: a */
        void mo61512a();

        /* renamed from: a */
        void mo61513a(String str, String str2);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m120061a(C37423a aVar, C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6887c()) {
            aVar.mo61512a();
        } else {
            try {
                JSONObject jSONObject = new JSONObject((String) hVar.mo6890e());
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (jSONObject.optInt("code") == 0) {
                    aVar.mo61513a(optJSONObject.optString("file_id"), optJSONObject.optString("ticket_url"));
                } else {
                    aVar.mo61512a();
                }
            } catch (JSONException unused) {
                aVar.mo61512a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m120062a(File file, String str, String str2, String str3, C37423a aVar) {
        if (!file.exists() || file.length() == 0) {
            aVar.mo61512a();
            return;
        }
        SensitiveFileUploadApi.m120060a(new TypedFile("image/*", file), Integer.valueOf(str), new TypedString(str2), Integer.valueOf(str3)).mo6875a((C1591g<TResult, TContinuationResult>) new C37424b<TResult,TContinuationResult>(aVar));
    }
}
