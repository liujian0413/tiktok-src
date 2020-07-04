package com.p280ss.android.ugc.aweme.p332ml;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.p298ml.C6821b;
import com.p280ss.android.p298ml.C6827f;
import com.p280ss.android.p298ml.C6827f.C6828a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.setting.model.MLModel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ml.a */
public final class C7170a extends C6827f {

    /* renamed from: a */
    private MLModel f20096a;

    /* renamed from: a */
    private static String m22383a(int i) {
        switch (i) {
            case 1:
                return "STATE_DOWNLOAD_SUCCESS";
            case 2:
                return "STATE_DOWNLOAD_FAILED";
            case 3:
                return "STATE_UNZIP_SUCCESS";
            case 4:
                return "STATE_UNZIP_FAILED";
            case 5:
                return "STATE_LOAD_CONFIG_SUCCESS";
            case 6:
                return "STATE_LOAD_CONFIG_FAILED";
            case 7:
                return "STATE_LOAD_MODEL_SUCCESS";
            case 8:
                return "STATE_LOAD_MODEL_FAILED";
            default:
                return "unknown";
        }
    }

    /* renamed from: e */
    public final C6828a mo16685e() {
        return C7171b.f20097a;
    }

    /* renamed from: g */
    public final C6821b mo16687g() {
        return C7172c.f20098a;
    }

    /* renamed from: a */
    public final boolean mo16681a() {
        if (this.f20096a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo16682b() {
        if (this.f20096a == null) {
            return "";
        }
        return this.f20096a.packageUrl;
    }

    /* renamed from: f */
    public final boolean mo16686f() {
        if (this.f20096a == null || this.f20096a.type != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo16683c() {
        Context a = C6399b.m19921a();
        if (a == null) {
            return "";
        }
        return a.getFilesDir().getAbsolutePath();
    }

    /* renamed from: d */
    public final String mo16684d() {
        if (TextUtils.isEmpty(this.f20096a.scene)) {
            return "default";
        }
        return this.f20096a.scene;
    }

    public C7170a(MLModel mLModel) {
        this.f20096a = mLModel;
    }

    /* renamed from: a */
    static final /* synthetic */ void m22384a(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", str);
            jSONObject.put("state", m22383a(i));
            jSONObject.put("message", str2);
        } catch (JSONException unused) {
        }
        C6877n.m21447a("ml-evaluator", jSONObject);
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m22385a(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
