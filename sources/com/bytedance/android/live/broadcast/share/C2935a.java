package com.bytedance.android.live.broadcast.share;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.host.IHostShare;

/* renamed from: com.bytedance.android.live.broadcast.share.a */
public final class C2935a {
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11413a(android.app.Activity r3, java.lang.String r4, com.bytedance.android.livesdkapi.depend.model.live.Room r5) {
        /*
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostShare> r0 = com.bytedance.android.livesdkapi.host.IHostShare.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            com.bytedance.android.livesdkapi.host.IHostShare r0 = (com.bytedance.android.livesdkapi.host.IHostShare) r0
            int r1 = r4.hashCode()
            r2 = 0
            switch(r1) {
                case -2116720984: goto L_0x0057;
                case -1436108013: goto L_0x004d;
                case -916346253: goto L_0x0043;
                case 3321844: goto L_0x0039;
                case 28903346: goto L_0x002f;
                case 497130182: goto L_0x0025;
                case 1620810375: goto L_0x001b;
                case 1934780818: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0061
        L_0x0011:
            java.lang.String r1 = "whatsapp"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0061
            r4 = 1
            goto L_0x0062
        L_0x001b:
            java.lang.String r1 = "facebook_lite"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0061
            r4 = 7
            goto L_0x0062
        L_0x0025:
            java.lang.String r1 = "facebook"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0061
            r4 = 0
            goto L_0x0062
        L_0x002f:
            java.lang.String r1 = "instagram"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0061
            r4 = 3
            goto L_0x0062
        L_0x0039:
            java.lang.String r1 = "line"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0061
            r4 = 2
            goto L_0x0062
        L_0x0043:
            java.lang.String r1 = "twitter"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0061
            r4 = 4
            goto L_0x0062
        L_0x004d:
            java.lang.String r1 = "messenger"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0061
            r4 = 6
            goto L_0x0062
        L_0x0057:
            java.lang.String r1 = "kakao_talk"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0061
            r4 = 5
            goto L_0x0062
        L_0x0061:
            r4 = -1
        L_0x0062:
            switch(r4) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00a2;
                case 2: goto L_0x0098;
                case 3: goto L_0x008e;
                case 4: goto L_0x0084;
                case 5: goto L_0x007a;
                case 6: goto L_0x0070;
                case 7: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            return r2
        L_0x0066:
            com.bytedance.android.livesdk.log.C8448g.m25682a(r3)
            java.lang.String r4 = "facebook_lite"
            boolean r3 = m11412a(r3, r5, r0, r4)
            return r3
        L_0x0070:
            com.bytedance.android.livesdk.log.C8448g.m25682a(r3)
            java.lang.String r4 = "messenger"
            boolean r3 = m11412a(r3, r5, r0, r4)
            return r3
        L_0x007a:
            com.bytedance.android.livesdk.log.C8448g.m25682a(r3)
            java.lang.String r4 = "kakao_talk"
            boolean r3 = m11412a(r3, r5, r0, r4)
            return r3
        L_0x0084:
            com.bytedance.android.livesdk.log.C8448g.m25682a(r3)
            java.lang.String r4 = "twitter"
            boolean r3 = m11412a(r3, r5, r0, r4)
            return r3
        L_0x008e:
            com.bytedance.android.livesdk.log.C8448g.m25682a(r3)
            java.lang.String r4 = "instagram"
            boolean r3 = m11412a(r3, r5, r0, r4)
            return r3
        L_0x0098:
            com.bytedance.android.livesdk.log.C8448g.m25682a(r3)
            java.lang.String r4 = "line"
            boolean r3 = m11412a(r3, r5, r0, r4)
            return r3
        L_0x00a2:
            com.bytedance.android.livesdk.log.C8448g.m25682a(r3)
            java.lang.String r4 = "whatsapp"
            boolean r3 = m11412a(r3, r5, r0, r4)
            return r3
        L_0x00ac:
            com.bytedance.android.livesdk.log.C8448g.m25682a(r3)
            java.lang.String r4 = "facebook"
            boolean r3 = m11412a(r3, r5, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.share.C2935a.m11413a(android.app.Activity, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    /* renamed from: a */
    private static boolean m11412a(Activity activity, Room room, IHostShare iHostShare, String str) {
        if (!iHostShare.isShareAvailable(str, activity)) {
            return false;
        }
        iHostShare.share(activity, C9389b.m27848a(room).mo23104b(room.getAnchorShareText()).mo23108f(str).mo23102a(), null);
        return true;
    }
}
