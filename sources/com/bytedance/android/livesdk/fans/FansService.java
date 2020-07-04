package com.bytedance.android.livesdk.fans;

import android.content.Context;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.C1642a;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.p116b.C2321a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3975b;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.fansclub.C5900c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.common.util.C19290j;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class FansService implements C2321a {
    public static final int FANS_GROUP_DIALOG_HEIGHT = 440;
    public static final String NEW_FANS_CLUB = "https://webcast.huoshan.com/falcon/webcast_huoshan/page/fansclub/index.html?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&source=%s&event_module=%s&isFans=%s&is_first_consume=%s";
    public static final String SHAPED_FANS_CLUB;

    public FansService() {
        C3596c.m13174a(C2321a.class, this);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append((String) LiveSettingKeys.LIVE_FANS_GROUP_URL.mo10240a());
        sb.append("?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&source=%s&event_module=%s&isFans=%s");
        SHAPED_FANS_CLUB = sb.toString();
    }

    public void showFansEntranceDialog(Context context, Room room, boolean z, boolean z2) {
        boolean z3;
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        if (context != null && room != null && room.getOwner() != null && TTLiveSDKContext.getHostService() != null && TTLiveSDKContext.getHostService().mo22367h() != null) {
            if (room.getOwner().getId() == TTLiveSDKContext.getHostService().mo22367h().mo22165a().getId()) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str4 = NEW_FANS_CLUB;
            if (C5900c.m18433a(z3)) {
                str4 = SHAPED_FANS_CLUB;
            }
            Locale locale = Locale.US;
            int i4 = 8;
            Object[] objArr = new Object[8];
            objArr[0] = Long.valueOf(room.getId());
            objArr[1] = Long.valueOf(room.getOwner().getId());
            objArr[2] = Long.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b());
            objArr[3] = "";
            objArr[4] = "";
            objArr[5] = "top";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            objArr[6] = str;
            objArr[7] = Integer.valueOf(C9281a.m27615a(TTLiveSDKContext.getHostService().mo22367h().mo22165a()));
            String a = C1642a.m8035a(locale, str4, objArr);
            if (C5900c.m18433a(z3)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("&web_bg_color=%2300000000");
                a = sb.toString();
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i5 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
            int i6 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
            if (!z2) {
                i5 = C9738o.m28714c(context, (float) C9051ar.m27033a(context));
            } else if (C5900c.m18433a(z3)) {
                i6 = (int) (((float) i6) * 0.85f);
            } else {
                i6 = FANS_GROUP_DIALOG_HEIGHT;
            }
            C3975b b = C3979c.m13951a(a).mo11555a(i5).mo11560b(i6);
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C3975b b2 = b.mo11556a(8, 8, i, i2).mo11561b(!z2);
            if (z2) {
                i4 = 0;
            }
            C3975b c = b2.mo11562c(i4);
            if (z2) {
                i3 = 80;
            } else {
                i3 = 8388613;
            }
            C3975b e = c.mo11566e(i3);
            if (C5900c.m18433a(z3)) {
                e.mo11568f(0);
                e.mo11565d(false);
            }
            BaseDialogFragment a2 = C9178j.m27302j().mo22374c().mo11533a(e);
            if (a2 != null && (context instanceof FragmentActivity)) {
                HashMap hashMap = new HashMap();
                String str5 = "anchor_id";
                if (room != null) {
                    str2 = String.valueOf(room.getOwnerUserId());
                } else {
                    str2 = "0";
                }
                hashMap.put(str5, str2);
                String str6 = "room_id";
                if (room != null) {
                    str3 = String.valueOf(room.getId());
                } else {
                    str3 = "0";
                }
                hashMap.put(str6, str3);
                C8443c.m25663a().mo21606a("livesdk_fans_club_entrance_click", hashMap, new Object[0]);
                BaseDialogFragment.m12686a((FragmentActivity) context, (DialogFragment) a2);
            }
        }
    }

    private void showCommonDialog(Context context, Room room, String str, String str2, Map<String, String> map) {
        C19290j jVar = new C19290j((String) LiveConfigSettingKeys.SEND_GIFT_FAIL_DIALOG_URL.mo10240a());
        if (C5900c.m18433a(false)) {
            jVar.mo51186a("is_open_fansclub2019", 1);
        }
        addBaseParams(jVar, room, str, str2, map);
        BaseDialogFragment a = C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(jVar.mo51184a()).mo11555a(280).mo11560b(294).mo11564d(2).mo11562c(0).mo11566e(17));
        if (context instanceof FragmentActivity) {
            BaseDialogFragment.m12686a((FragmentActivity) context, (DialogFragment) a);
        }
    }

    private void addBaseParams(C19290j jVar, Room room, String str, String str2, Map<String, String> map) {
        String str3;
        String str4;
        String str5;
        if (jVar != null) {
            C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
            String str6 = "";
            String str7 = "";
            if (a.mo21568a().containsKey("enter_from_merge")) {
                str6 = (String) a.mo21568a().get("enter_from_merge");
            }
            if (a.mo21568a().containsKey("enter_method")) {
                str7 = (String) a.mo21568a().get("enter_method");
            }
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        jVar.mo51188a((String) entry.getKey(), URLEncoder.encode((String) entry.getValue()));
                    }
                }
            }
            jVar.mo51188a("request_page", str2);
            jVar.mo51188a("enter_from_merge", str6);
            String str8 = "anchor_id";
            if (room != null) {
                str3 = String.valueOf(room.getOwnerUserId());
            } else {
                str3 = "0";
            }
            jVar.mo51188a(str8, str3);
            String str9 = "room_id";
            if (room != null) {
                str4 = String.valueOf(room.getId());
            } else {
                str4 = "0";
            }
            jVar.mo51188a(str9, str4);
            String str10 = "request_id";
            if (room != null) {
                str5 = room.getRequestId();
            } else {
                str5 = "0";
            }
            jVar.mo51188a(str10, str5);
            jVar.mo51188a("enter_method", str7);
            jVar.mo51188a("action_type", str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void showXTDialog(android.content.Context r9, com.bytedance.android.livesdkapi.depend.model.live.Room r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r8 = this;
            com.bytedance.android.live.core.setting.l<java.lang.String> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.SEND_GIFT_FAIL_DIALOG_URL
            java.lang.Object r0 = r0.mo10240a()
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.common.util.j r7 = new com.ss.android.common.util.j
            r7.<init>(r0)
            r6 = 0
            r1 = r8
            r2 = r7
            r3 = r10
            r4 = r11
            r5 = r12
            r1.addBaseParams(r2, r3, r4, r5, r6)
            if (r10 == 0) goto L_0x0021
            com.bytedance.android.live.base.model.user.User r11 = r10.getOwner()
            com.bytedance.android.live.base.model.ImageModel r11 = r11.getAvatarThumb()
            goto L_0x0022
        L_0x0021:
            r11 = 0
        L_0x0022:
            java.lang.String r12 = ""
            r0 = 0
            if (r11 == 0) goto L_0x003a
            java.util.List r11 = r11.getUrls()
            if (r11 == 0) goto L_0x003a
            int r1 = r11.size()
            if (r1 <= 0) goto L_0x003a
            java.lang.Object r11 = r11.get(r0)
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
        L_0x003a:
            if (r10 == 0) goto L_0x0045
            com.bytedance.android.live.base.model.user.User r11 = r10.getOwner()
            java.lang.String r11 = r11.getNickName()
            goto L_0x0047
        L_0x0045:
            java.lang.String r11 = ""
        L_0x0047:
            java.lang.String r1 = ""
            com.bytedance.android.livesdk.log.c r2 = com.bytedance.android.livesdk.log.C8443c.m25663a()
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r3 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            com.bytedance.android.livesdk.log.a.g r2 = r2.mo21605a(r3)
            boolean r3 = r2 instanceof com.bytedance.android.livesdk.log.p404a.C8420k
            if (r3 == 0) goto L_0x0071
            com.bytedance.android.livesdk.log.a.k r2 = (com.bytedance.android.livesdk.log.p404a.C8420k) r2
            java.util.Map r3 = r2.mo21568a()
            java.lang.String r4 = "log_pb"
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x0071
            java.util.Map r1 = r2.mo21568a()
            java.lang.String r2 = "log_pb"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
        L_0x0071:
            java.lang.String r2 = "utf-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0084 }
            java.lang.String r12 = "utf-8"
            java.lang.String r12 = java.net.URLEncoder.encode(r11, r12)     // Catch:{ UnsupportedEncodingException -> 0x0085 }
            java.lang.String r11 = "utf-8"
            java.lang.String r11 = java.net.URLEncoder.encode(r1, r11)     // Catch:{ UnsupportedEncodingException -> 0x0086 }
            goto L_0x0087
        L_0x0084:
            r2 = r12
        L_0x0085:
            r12 = r11
        L_0x0086:
            r11 = r1
        L_0x0087:
            java.lang.String r1 = "anchor_avatar"
            r7.mo51188a(r1, r2)
            java.lang.String r1 = "nickname"
            r7.mo51188a(r1, r12)
            java.lang.String r12 = "log_pb"
            r7.mo51188a(r12, r11)
            java.lang.String r11 = "orientation"
            if (r10 == 0) goto L_0x00a3
            int r10 = r10.getOrientation()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r10 = "0"
        L_0x00a5:
            r7.mo51188a(r11, r10)
            java.lang.String r10 = "game_fullscreen"
            r11 = 1
            r12 = r13 ^ 1
            r7.mo51186a(r10, r12)
            int r10 = com.bytedance.android.livesdk.utils.C9051ar.m27033a(r9)
            float r10 = (float) r10
            int r10 = com.bytedance.android.livesdk.utils.C9051ar.m27037c(r9, r10)
            r12 = 1133248512(0x438c0000, float:280.0)
            float r10 = (float) r10
            r13 = 1136361472(0x43bb8000, float:375.0)
            float r10 = r10 / r13
            float r12 = r12 * r10
            int r12 = (int) r12
            r13 = 1133707264(0x43930000, float:294.0)
            float r10 = r10 * r13
            int r10 = (int) r10
            java.lang.String r13 = r7.mo51184a()
            com.bytedance.android.livesdk.browser.c.b$b r13 = com.bytedance.android.livesdk.browser.p193c.C3979c.m13951a(r13)
            com.bytedance.android.livesdk.browser.c.b$b r12 = r13.mo11555a(r12)
            com.bytedance.android.livesdk.browser.c.b$b r10 = r12.mo11560b(r10)
            com.bytedance.android.livesdk.browser.c.b$b r10 = r10.mo11567e(r0)
            com.bytedance.android.livesdk.browser.c.b$b r10 = r10.mo11563c(r11)
            com.bytedance.android.livesdk.browser.c.b$b r10 = r10.mo11561b(r11)
            r11 = 2
            com.bytedance.android.livesdk.browser.c.b$b r10 = r10.mo11564d(r11)
            com.bytedance.android.livesdk.browser.c.b$b r10 = r10.mo11562c(r0)
            r11 = 17
            com.bytedance.android.livesdk.browser.c.b$b r10 = r10.mo11566e(r11)
            com.bytedance.android.livesdk.w.f r11 = com.bytedance.android.livesdk.p428w.C9178j.m27302j()
            com.bytedance.android.livesdk.browser.c.b r11 = r11.mo22374c()
            com.bytedance.android.live.core.widget.BaseDialogFragment r10 = r11.mo11533a(r10)
            boolean r11 = r9 instanceof android.support.p022v4.app.FragmentActivity
            if (r11 == 0) goto L_0x0108
            android.support.v4.app.FragmentActivity r9 = (android.support.p022v4.app.FragmentActivity) r9
            com.bytedance.android.live.core.widget.BaseDialogFragment.m12686a(r9, r10)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.fans.FansService.showXTDialog(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, java.lang.String, boolean):void");
    }

    public void showJoinFansDialog(Context context, Room room, String str, String str2, boolean z, Map<String, String> map) {
        showCommonDialog(context, room, str, str2, map);
    }
}
