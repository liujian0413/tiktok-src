package com.bytedance.android.livesdk.chatroom.utils;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p457i.C9487n;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.o */
public final class C5357o {
    /* renamed from: a */
    public static void m17077a(View view, OnClickListener onClickListener, DataCenter dataCenter) {
    }

    /* renamed from: a */
    public static void m17078a(View view, DataCenter dataCenter) {
    }

    /* renamed from: a */
    public static boolean m17082a(DataCenter dataCenter) {
        return false;
    }

    /* renamed from: d */
    public static boolean m17087d(Bundle bundle) {
        return false;
    }

    /* renamed from: a */
    public static List<String> m17074a() {
        if (LiveSettingKeys.LIVE_RANK_INFO_LIST.mo10240a() != null && ((C9487n) LiveSettingKeys.LIVE_RANK_INFO_LIST.mo10240a()).f25976a != null) {
            return ((C9487n) LiveSettingKeys.LIVE_RANK_INFO_LIST.mo10240a()).f25976a;
        }
        return Arrays.asList(new String[]{"http://p1-webcast-dycdn.byteimg.com/img/webcast/6690142627768568584~tplv-resize:400:400.jpeg", "https://p3-dy.byteimg.com/aweme/1080x1080/24023000230ca9e85dd48.jpeg", "https://p9-dy.byteimg.com/aweme/720x720/1cb25000672c8dded103b.jpeg", "https://p9-dy.byteimg.com/aweme/720x720/2ce9d0006872c3f3d5886.jpeg", "https://p3-dy.byteimg.com/aweme/720x720/2409f0005bf8faaa4e78b.jpeg"});
    }

    /* renamed from: b */
    private static String m17083b() {
        if (!(C9469i.m27993e() == null || C9469i.m27993e().mo14577q() == null)) {
            Map a = C9469i.m27993e().mo14577q().mo23191a(-1);
            if (a != null && (a.get("feed_url") instanceof String)) {
                return (String) a.get("feed_url");
            }
        }
        return "";
    }

    /* renamed from: b */
    public static String m17084b(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        boolean z = false;
        if (bundle.getBoolean("live.intent.extra.FROM_NEW_STYLE", false) || (bundle2 != null && bundle2.getBoolean("live.intent.extra.FROM_NEW_STYLE", false))) {
            z = true;
        }
        if (!z) {
            return "";
        }
        String string = bundle.getString("live.intent.extra.FEED_URL", "");
        if (C6319n.m19593a(string)) {
            if (bundle2 != null) {
                string = bundle2.getString("live.intent.extra.FEED_URL", "");
            } else {
                string = "";
            }
            if (C6319n.m19593a(string)) {
                return "";
            }
        }
        return string;
    }

    /* renamed from: c */
    public static boolean m17086c(Bundle bundle) {
        boolean z;
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if ("1".equals(bundle.getString("enable_feed_drawer", "0")) || (bundle2 != null && "1".equals(bundle2.getString("enable_feed_drawer", "0")))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", true);
                bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
                bundle.putString("live.intent.extra.FEED_URL", m17083b());
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static String m17088e(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        if (!((!"push".equals(bundle.getString("enter_from_merge")) && !"push".equals(bundle.getString("enter_method"))) || C9469i.m27993e() == null || C9469i.m27993e().mo14577q() == null)) {
            Map a = C9469i.m27993e().mo14577q().mo23191a(-1);
            if (a == null) {
                return "";
            }
            if (a.get("feed_url") instanceof String) {
                return (String) a.get("feed_url");
            }
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m17081a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        if (bundle.getLong("live.intent.extra.LOAD_DURATION", 0) > 0) {
            return true;
        }
        Bundle bundle2 = bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle2 == null || bundle2.getLong("live.intent.extra.LOAD_DURATION", 0) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m17080a(boolean z, Bundle bundle) {
        C8443c.m25663a().mo21605a(Room.class);
    }

    /* renamed from: a */
    public static void m17075a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null && bundle2.getBoolean("live.intent.extra.FROM_NEW_STYLE", false)) {
            bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", bundle2.getBoolean("live.intent.extra.FROM_NEW_STYLE", false));
            bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
            bundle.putString("live.intent.extra.FEED_URL", bundle2.getString("live.intent.extra.FEED_URL", ""));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (com.bytedance.common.utility.C6319n.m19593a(m17088e(r4)) != false) goto L_0x007a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m17076a(android.os.Bundle r4, com.bytedance.ies.sdk.widgets.DataCenter r5) {
        /*
            if (r4 == 0) goto L_0x0089
            if (r5 != 0) goto L_0x0006
            goto L_0x0089
        L_0x0006:
            java.lang.String r0 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r0 = r4.getBundle(r0)
            java.lang.String r1 = "live.intent.extra.FROM_NEW_STYLE"
            r2 = 0
            boolean r1 = r4.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = "live.intent.extra.FROM_NEW_STYLE"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = 0
            goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            if (r1 != 0) goto L_0x0026
            return
        L_0x0026:
            java.lang.String r3 = "data_room"
            java.lang.Object r3 = r5.get(r3)
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r3
            if (r3 == 0) goto L_0x0037
            boolean r3 = r3.isOfficial()
            if (r3 == 0) goto L_0x0037
            r1 = 0
        L_0x0037:
            java.lang.String r2 = "live.intent.extra.FROM_NEW_STYLE"
            r4.putBoolean(r2, r1)
            if (r0 == 0) goto L_0x0043
            java.lang.String r2 = "live.intent.extra.FROM_NEW_STYLE"
            r0.putBoolean(r2, r1)
        L_0x0043:
            java.lang.String r2 = "live.intent.extra.FEED_URL"
            java.lang.String r3 = ""
            java.lang.String r2 = r4.getString(r2, r3)
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x005c
            java.lang.String r2 = "live.intent.extra.FEED_URL"
            java.lang.String r3 = ""
            java.lang.String r2 = r0.getString(r2, r3)
            goto L_0x005e
        L_0x005c:
            java.lang.String r2 = ""
        L_0x005e:
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = m17088e(r4)
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r3)
            if (r3 != 0) goto L_0x007a
        L_0x006e:
            java.lang.String r3 = "live.intent.extra.FEED_URL"
            r4.putString(r3, r2)
            if (r0 == 0) goto L_0x007a
            java.lang.String r4 = "live.intent.extra.FEED_URL"
            r0.putString(r4, r2)
        L_0x007a:
            java.lang.String r4 = "data_live_new_feed_style"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.lambda$put$1$DataCenter(r4, r0)
            java.lang.String r4 = "data_live_new_feed_url"
            r5.lambda$put$1$DataCenter(r4, r2)
            return
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.utils.C5357o.m17076a(android.os.Bundle, com.bytedance.ies.sdk.widgets.DataCenter):void");
    }

    /* renamed from: b */
    public static void m17085b(Bundle bundle, DataCenter dataCenter) {
        if (dataCenter != null && ((Boolean) dataCenter.get("data_live_new_feed_style", Boolean.valueOf(false))).booleanValue()) {
            bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", ((Boolean) dataCenter.get("data_live_new_feed_style", Boolean.valueOf(false))).booleanValue());
            bundle.putString("live.intent.extra.WINDOW_MODE", "full_screen");
            bundle.putString("live.intent.extra.FEED_URL", (String) dataCenter.get("data_live_new_feed_url", ""));
        }
    }

    /* renamed from: a */
    public static void m17079a(View view, String str, DataCenter dataCenter) {
        if (view instanceof TextView) {
        }
    }
}
