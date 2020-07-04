package com.bytedance.jirafast.net;

import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.jirafast.models.C12009a;
import com.bytedance.jirafast.net.C12016d.C12017a;
import com.bytedance.jirafast.utils.C12068a;
import com.bytedance.jirafast.utils.C12076g;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.jirafast.net.c */
public final class C12015c implements C12017a {

    /* renamed from: a */
    private C12018e f31952a;

    public C12015c(OkHttpClient okHttpClient) {
        this.f31952a = new C12018e(okHttpClient, 0);
    }

    /* renamed from: b */
    private boolean m35087b(String str) {
        if (this.f31952a == null) {
            return false;
        }
        this.f31952a.mo29668a((C12017a) this);
        if (!FileUtils.m28679c(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final List<C12009a> mo29663a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        C12009a aVar = new C12009a();
        for (String str : list) {
            UrlModel urlModel = null;
            try {
                urlModel = m35086a(str);
            } catch (Throwable unused) {
            }
            aVar.f31929a = str;
            aVar.f31930b = urlModel;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    private UrlModel m35086a(String str) {
        if (!m35087b(str)) {
            return null;
        }
        C12018e eVar = this.f31952a;
        StringBuilder sb = new StringBuilder();
        sb.append(C12068a.m35194a().mo29742a(C12068a.f32149x));
        sb.append("upload/image/");
        Response a = eVar.mo29667a(str, sb.toString());
        if (a == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a.body().string());
            boolean has = jSONObject.has("status_code");
            int i = -1;
            if (has) {
                i = jSONObject.optInt("status_code");
            }
            if (has && i == 0) {
                return (UrlModel) C12076g.m35227a(jSONObject.getString("data"), UrlModel.class);
            }
        } catch (IOException | Exception | JSONException unused) {
        }
        return null;
    }
}
