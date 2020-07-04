package com.bytedance.android.livesdk.feed.services;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.C2343f;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.C9368k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C6600e;
import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedItemDeserializer implements C6708j<FeedItem> {

    /* renamed from: a */
    private C6600e f18055a = C2317a.m9932a();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public FeedItem mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        try {
            FeedItem feedItem = (FeedItem) this.f18055a.mo15970a(kVar, FeedItem.class);
            C6711m m = kVar.mo16136m();
            switch (feedItem.type) {
                case 1:
                case 2:
                case 4:
                case 5:
                    feedItem.item = (C2343f) iVar.mo16007a(m.mo16149b("data"), Room.class);
                    break;
                case 3:
                    String str = new String(Base64.decode(m.mo16149b("ad").mo15998c(), 1));
                    if (!TextUtils.isEmpty(str)) {
                        feedItem.adJSONObject = new JSONObject(str);
                        feedItem.item = (C2343f) C2317a.m9932a().mo15974a(str, C9368k.class);
                        long currentTimeMillis = System.currentTimeMillis();
                        ((C9368k) feedItem.item).f25677K = currentTimeMillis;
                        try {
                            feedItem.adJSONObject.put("subId", currentTimeMillis);
                            break;
                        } catch (JSONException unused) {
                            break;
                        }
                    }
                    break;
            }
            return feedItem;
        } catch (Exception unused2) {
            throw new JsonParseException("error type");
        }
    }
}
