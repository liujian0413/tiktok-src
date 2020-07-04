package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.schema.interfaces.C8935d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.schema.l */
public final class C8938l implements C8935d {
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("webcast_profile", uri.getHost());
    }

    public final boolean handle(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("user_id");
        long j = 0;
        try {
            if (!TextUtils.isEmpty(queryParameter)) {
                j = Long.parseLong(queryParameter);
            }
        } catch (Throwable unused) {
        }
        String queryParameter2 = uri.getQueryParameter("sec_user_id");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(queryParameter2)) {
            hashMap.put("sec_user_id", queryParameter2);
        }
        return m26743a(j, uri.getQueryParameter("type"), hashMap);
    }

    /* renamed from: a */
    public static boolean m26743a(long j, String str, Map<String, String> map) {
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (j == 0) {
            j = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        }
        if (currentRoom == null || !TextUtils.equals(str, "half")) {
            TTLiveSDKContext.getHostService().mo22365f().mo22043a(j, map);
        } else {
            C9097a.m27146a().mo22267a((Object) new UserProfileEvent(j));
        }
        return true;
    }
}
