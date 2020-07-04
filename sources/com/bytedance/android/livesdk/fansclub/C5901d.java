package com.bytedance.android.livesdk.fansclub;

import com.bytedance.android.livesdk.config.LiveSettingKeys;

/* renamed from: com.bytedance.android.livesdk.fansclub.d */
public final class C5901d {

    /* renamed from: a */
    public static final String f17472a;

    /* renamed from: b */
    public static final String f17473b;

    static {
        StringBuilder sb = new StringBuilder("https://webcast.amemv.com/falcon/webcast_douyin/page/fansclub/index.html");
        sb.append("?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&enter_from_merge=%s&enter_method=%s&event_module=%s&isFans=%s");
        f17472a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) LiveSettingKeys.LIVE_FANS_GROUP_URL.mo10240a());
        sb2.append("?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&enter_from_merge=%s&enter_method=%s&event_module=%s&isFans=%s");
        f17473b = sb2.toString();
    }
}
