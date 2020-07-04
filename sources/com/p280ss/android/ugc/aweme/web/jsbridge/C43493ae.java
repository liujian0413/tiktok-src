package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.sdk.webview.p901b.C20133e;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27997n;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ae */
public final class C43493ae extends C20133e {

    /* renamed from: a */
    private C11087a f112635a;

    public C43493ae(WeakReference<Context> weakReference, C11087a aVar) {
        super(weakReference);
        this.f112635a = aVar;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        String string = iVar.f30171d.getString("type");
        if (TextUtils.equals("goods_order_share", string)) {
            C27997n.m91597a(iVar.f30171d, this.mContextRef);
            return;
        }
        iVar.f30170c = "open";
        iVar.f30171d.put("type", "openRecord");
        if (iVar.f30171d.has("args")) {
            JSONObject jSONObject2 = iVar.f30171d.getJSONObject("args");
            jSONObject2.put("recordOrigin", "jsBridge");
            if ("challenge".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("challenge_id"));
                jSONObject2.put("recordParam", "challenge");
            } else if ("music".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("music_id"));
                jSONObject2.put("recordParam", "music");
            } else if ("effect".equals(string)) {
                if (jSONObject2.has("effect_id")) {
                    jSONObject2.put("id", jSONObject2.get("effect_id"));
                }
                jSONObject2.put("recordParam", "sticker");
            } else if ("donation".equals(string) && jSONObject2 != null) {
                jSONObject2.put("id", jSONObject2.get("charity_id"));
                jSONObject2.put("recordParam", "donation");
            } else if ("star_atlas".equals(string)) {
                jSONObject2.put("id", jSONObject2.get("star_atlas_id"));
                jSONObject2.put("recordParam", "star_atlas");
                jSONObject2.put("star_atlas_object", iVar.f30171d.getJSONObject("args").toString());
            }
            jSONObject2.put("group", "1");
        }
        open(iVar.f30171d);
    }
}
