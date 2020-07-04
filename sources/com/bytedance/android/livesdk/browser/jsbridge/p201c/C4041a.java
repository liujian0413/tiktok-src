package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.android.live.core.utils.C3381c;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p480a.C9700a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.a */
public class C4041a implements C11093e {

    /* renamed from: a */
    private Context f12025a;

    public C4041a(Context context) {
        this.f12025a = context;
    }

    /* renamed from: a */
    private static Map<String, String> m14107a(JSONObject jSONObject) throws Exception {
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11662a(String str, String str2) throws Exception {
        m14108a(this.f12025a, str2, str);
    }

    public void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        String str;
        Object obj;
        JSONObject jSONObject2 = null;
        if (iVar.f30171d != null) {
            str = iVar.f30171d.optString(C38347c.f99553h);
        } else {
            str = null;
        }
        if (iVar.f30171d != null) {
            obj = iVar.f30171d.optString("type");
        } else {
            obj = null;
        }
        if ("live_room".equals(obj)) {
            if (iVar.f30171d != null) {
                jSONObject2 = iVar.f30171d.optJSONObject("url_extra");
            }
            Map a = m14107a(jSONObject2);
            Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
            if (!(currentRoom == null || currentRoom.getShareUrl() == null)) {
                Builder buildUpon = Uri.parse(currentRoom.getShareUrl()).buildUpon();
                for (Entry entry : a.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()));
                TTLiveSDKContext.getHostService().mo22364e().mo22109a(buildUpon.toString()).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4043b<Object>(this, str), C4044c.f12029a);
            }
            return;
        }
        Context context = this.f12025a;
        int i = 0;
        if (context != null) {
            C9700a.m28636a(context, "", str);
            i = 1;
        }
        jSONObject.put("code", i);
    }

    /* renamed from: a */
    private static void m14108a(Context context, String str, String str2) {
        if (str2 != null) {
            try {
                if (str2.isEmpty()) {
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                C3381c.m12568a(sb.toString());
                C9049ap.m27022a((int) R.string.ebd);
            } catch (Exception e) {
                C4041a.class.getSimpleName();
                e.getMessage();
                return;
            }
        }
        str2 = context.getString(R.string.edz);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        C3381c.m12568a(sb2.toString());
        C9049ap.m27022a((int) R.string.ebd);
    }
}
