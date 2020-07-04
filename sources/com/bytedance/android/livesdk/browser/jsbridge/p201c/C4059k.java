package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4116at.C4117a;
import com.bytedance.android.livesdk.browser.p197g.C4025b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.k */
public final class C4059k implements C11093e {

    /* renamed from: a */
    private WeakReference<Context> f12048a;

    /* renamed from: b */
    private WeakReference<C4117a> f12049b;

    /* renamed from: a */
    private static Map<String, String> m14142a(JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                hashMap.put(str, String.valueOf(obj));
            }
        }
        return hashMap;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        m14143a(iVar.f30171d, jSONObject);
    }

    public C4059k(WeakReference<Context> weakReference, C4117a aVar) {
        this.f12048a = weakReference;
        this.f12049b = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    private void m14143a(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        Context context;
        if (jSONObject != null) {
            jSONObject.optString("title");
            jSONObject.optString("desc");
            jSONObject.optString("image");
            jSONObject.optString("url");
            String optString = jSONObject.optString("platform");
            String optString2 = jSONObject.optString("type");
            C4025b bVar = null;
            if (this.f12048a == null) {
                context = null;
            } else {
                context = (Context) this.f12048a.get();
            }
            if (!C6319n.m19593a(optString) && context != null) {
                int i = 0;
                if ("live_room".equals(optString2)) {
                    Map a = m14142a(jSONObject.optJSONObject("url_extra"));
                    Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
                    if (currentRoom == null || currentRoom.getShareUrl() == null) {
                        jSONObject2.put("code", 0);
                        return;
                    }
                    Builder buildUpon = Uri.parse(currentRoom.getShareUrl()).buildUpon();
                    for (Entry entry : a.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
                    TTLiveSDKContext.getHostService().mo22364e().mo22108a((Activity) context, C9389b.m27848a(currentRoom).mo23108f(optString).mo23100a(a).mo23106d(buildUpon.toString()).mo23102a());
                    jSONObject2.put("code", 1);
                } else if ("open_platform".equals(optString2)) {
                    TTLiveSDKContext.getHostService().mo22364e().mo22108a((Activity) context, C9389b.m27846a().mo23108f(optString).mo23103b().mo23102a());
                    jSONObject2.put("code", 1);
                } else {
                    if (this.f12049b.get() != null) {
                        bVar = ((C4117a) this.f12049b.get()).mo11613f();
                    }
                    if (!(bVar == null || bVar.f11998d == null)) {
                        Builder buildUpon2 = Uri.parse(bVar.f11998d).buildUpon();
                        buildUpon2.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
                        TTLiveSDKContext.getHostService().mo22364e().mo22108a((Activity) context, C9389b.m27846a().mo23108f(optString).mo23099a(bVar.f11995a).mo23104b(bVar.f11996b).mo23105c(bVar.f11997c).mo23106d(buildUpon2.toString()).mo23102a());
                        i = 1;
                    }
                    jSONObject2.put("code", i);
                }
            }
        }
    }
}
