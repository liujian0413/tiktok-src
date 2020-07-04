package com.p280ss.ttvideoengine.p1812e;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.a */
public final class C46076a {

    /* renamed from: a */
    public String f117769a;

    /* renamed from: b */
    public String f117770b;

    /* renamed from: c */
    public String[] f117771c;

    /* renamed from: a */
    public final void mo112210a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        this.f117769a = jSONObject.optString("main_play_url");
        if (!TextUtils.isEmpty(this.f117769a)) {
            arrayList.add(this.f117769a);
        }
        this.f117770b = jSONObject.optString("backup_play_url");
        if (!TextUtils.isEmpty(this.f117770b)) {
            arrayList.add(this.f117770b);
        }
        this.f117771c = new String[arrayList.size()];
        arrayList.toArray(this.f117771c);
    }
}
