package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.CopyMethod */
public class CopyMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    protected WeakReference<Context> f112546a;

    public CopyMethod(WeakReference<Context> weakReference) {
        this.f112546a = weakReference;
    }

    public CopyMethod(C11087a aVar, WeakReference<Context> weakReference) {
        super(aVar);
        this.f112546a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject.has("args")) {
            jSONObject2 = jSONObject.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null || !jSONObject2.has(C38347c.f99553h)) {
            aVar.mo71362a(0, "illegal args");
        } else {
            String string = jSONObject2.getString(C38347c.f99553h);
            Context context = (Context) this.f112546a.get();
            if (TextUtils.isEmpty(string) || context == null) {
                aVar.mo71362a(0, "illegal args");
            } else {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                    ClipData newPlainText = ClipData.newPlainText(string, string);
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(newPlainText);
                        StringBuilder sb = new StringBuilder("copy content=");
                        sb.append(string);
                        aVar.mo71363a((Object) sb.toString());
                    } else {
                        aVar.mo71362a(0, "clip board manager not found");
                    }
                } catch (Exception e) {
                    aVar.mo71362a(0, e.getMessage());
                }
            }
        }
    }
}
