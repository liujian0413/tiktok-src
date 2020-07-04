package com.p280ss.android.ugc.aweme.live.p1363c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAction.C9429a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.sdk.activity.LiveDummyActivity;
import com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.c.b */
public final class C32471b implements IHostAction {
    public final void openSignActivity(Context context, Intent intent) {
    }

    public final void openTaobaoApp(Context context, String str, C9429a aVar) {
    }

    public final void openVideoDetailPage(String str, String str2) {
    }

    public final void switchToLiveTab(int i, String str) {
    }

    public final boolean tryOpenAdByOpenUrl(Context context, long j, String str, String str2) {
        return false;
    }

    public final boolean tryShowKoiRedPackageInLive(String str) {
        return false;
    }

    /* renamed from: a */
    private static String m105200a(String str, Bundle bundle) {
        C7203u a = C7203u.m22460a(str);
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                a.mo18694a(str2, obj.toString());
            }
        }
        return a.mo18695a();
    }

    public final void openFeedBack(String str, Context context) {
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        StringBuilder sb = new StringBuilder("https://aweme.snssdk.com/falcon/rn_main_web/feedback/?hide_nav_bar=1?enter_from=");
        sb.append(str);
        intent.setData(Uri.parse(sb.toString()));
        intent.putExtra("hide_nav_bar", true);
        context.startActivity(intent);
    }

    public final void openUserProfilePage(long j, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(j);
        C7203u a = C7203u.m22460a(sb.toString());
        if (map != null) {
            for (String str : map.keySet()) {
                a.mo18694a(str, (String) map.get(str));
            }
        }
        C7195s.m22438a().mo18682a(a.mo18695a());
    }

    /* renamed from: a */
    private static boolean m105202a(Context context, String str) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("sslocal://showcaseh5")) {
            C25371n.m83481d(context, str);
            return true;
        }
        Intent intent = new Intent(context, DeepLinkHandlerActivity.class);
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    private static void m105201a(Activity activity, Bundle bundle) {
        if (activity != null) {
            StringBuilder sb = new StringBuilder();
            if (C6399b.m19946v()) {
                sb.append("https://musical.ly/report/");
            } else if (C6399b.m19947w()) {
                sb.append("https://www.tiktokv.com/aweme/in_app/report/");
            } else {
                sb.append("https://aweme.snssdk.com/falcon/douyin_falcon/report/index.html/");
            }
            try {
                sb.append("?object_id=");
                sb.append(bundle.get("reportVideo.user.id"));
                sb.append("&owner_id=");
                sb.append(bundle.get("reportVideo.user.id"));
                sb.append("&report_type=");
                sb.append(bundle.get("reportVideo.activity.type"));
                sb.append("&room_id=");
                sb.append(bundle.get("reportVideo.media.id"));
            } catch (Exception unused) {
            }
            Intent intent = new Intent(activity, CrossPlatformActivity.class);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("show_load_dialog", false);
            bundle2.putBoolean("hide_nav_bar", true);
            intent.putExtras(bundle2);
            intent.setData(Uri.parse(sb.toString()));
            activity.startActivity(intent);
        }
    }

    public final boolean openHostBrowser(String str, Bundle bundle, Context context) {
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.putExtras(bundle);
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
        return true;
    }

    public final void openLiveBrowser(String str, String str2, Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", TextUtils.isEmpty(str2));
        bundle.putString("title", str2);
        openLiveBrowser(str, bundle, context);
    }

    public final void openUserProfilePage(Context context, long j, Bundle bundle) {
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(j);
        a.mo18682a(sb.toString());
    }

    public final void openLiveBrowser(String str, Bundle bundle, Context context) {
        if (!(context instanceof Activity)) {
            context = C6405d.m19984g();
        }
        if (context != null) {
            Intent intent = new Intent(context, LiveDummyActivity.class);
            bundle.putString("url", str);
            bundle.putBoolean("show_progress", false);
            intent.putExtra("intent_type", 1);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r6.equals("//chargeDeal") != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleSchema(android.content.Context r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.app.Activity
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = -1
            int r2 = r6.hashCode()
            r3 = 1
            switch(r2) {
                case -1863814380: goto L_0x0055;
                case -1813849575: goto L_0x004b;
                case -1588030678: goto L_0x0041;
                case -570110082: goto L_0x0037;
                case -262720268: goto L_0x002d;
                case 337200928: goto L_0x0024;
                case 947267529: goto L_0x001a;
                case 1392218355: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x005f
        L_0x0010:
            java.lang.String r1 = "//item"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 4
            goto L_0x0060
        L_0x001a:
            java.lang.String r1 = "//profile"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 5
            goto L_0x0060
        L_0x0024:
            java.lang.String r2 = "//chargeDeal"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x005f
            goto L_0x0060
        L_0x002d:
            java.lang.String r1 = "//live/detail"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 2
            goto L_0x0060
        L_0x0037:
            java.lang.String r1 = "//verify/acitivity"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 3
            goto L_0x0060
        L_0x0041:
            java.lang.String r1 = "//livend/submitfeedbackacitivity"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 7
            goto L_0x0060
        L_0x004b:
            java.lang.String r1 = "//webview"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 6
            goto L_0x0060
        L_0x0055:
            java.lang.String r1 = "//report"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = -1
        L_0x0060:
            switch(r1) {
                case 0: goto L_0x0118;
                case 1: goto L_0x0111;
                case 2: goto L_0x0105;
                case 3: goto L_0x0102;
                case 4: goto L_0x00e9;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0123
        L_0x0065:
            if (r7 == 0) goto L_0x0123
            java.lang.String r0 = "roomId"
            boolean r0 = r7.containsKey(r0)
            if (r0 == 0) goto L_0x0123
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            java.lang.Class r0 = r0.getSubmitFeedbackActivity()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r0)
            java.lang.String r0 = "roomId"
            java.lang.String r2 = "roomId"
            long r2 = r7.getLong(r2)
            r1.putExtra(r0, r2)
            java.lang.String r7 = "feedback_id"
            java.lang.String r0 = "6954"
            r1.putExtra(r7, r0)
            java.lang.String r7 = "enter_from"
            java.lang.String r0 = "live_end"
            r1.putExtra(r7, r0)
            r5.startActivity(r1)
            goto L_0x0123
        L_0x00a2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "aweme://webview/?url="
            r6.append(r0)
            java.lang.String r0 = "bundle_open_url"
            java.lang.Object r0 = r7.get(r0)
            r6.append(r0)
            java.lang.String r0 = "title"
            boolean r0 = r7.containsKey(r0)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "&title="
            r6.append(r0)
            java.lang.String r0 = "title"
            java.lang.Object r7 = r7.get(r0)
            r6.append(r7)
        L_0x00cb:
            java.lang.String r6 = r6.toString()
            goto L_0x0123
        L_0x00d0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "aweme://user/profile/"
            r6.<init>(r0)
            java.lang.String r0 = "user_id"
            java.lang.Object r0 = r7.get(r0)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = m105200a(r6, r7)
            goto L_0x0123
        L_0x00e9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "aweme://aweme/detail/"
            r6.<init>(r0)
            java.lang.String r0 = "extra_key_id"
            java.lang.Object r0 = r7.get(r0)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = m105200a(r6, r7)
            goto L_0x0123
        L_0x0102:
            java.lang.String r6 = "aweme://aweme/zhima/live"
            goto L_0x0123
        L_0x0105:
            java.lang.String r0 = "live.intent.extra.ROOM_ID"
            long r0 = r7.getLong(r0)
            java.lang.String r2 = ""
            com.p280ss.android.ugc.aweme.live.C32430a.m105055a(r5, r0, r7, r2)
            goto L_0x0123
        L_0x0111:
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            m105201a(r0, r7)
            goto L_0x0123
        L_0x0118:
            com.ss.android.ugc.aweme.live.c.c r6 = new com.ss.android.ugc.aweme.live.c.c
            r6.<init>()
            android.app.Activity r5 = (android.app.Activity) r5
            r6.openWallet(r5)
            return r3
        L_0x0123:
            boolean r5 = m105202a(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.live.p1363c.C32471b.handleSchema(android.content.Context, java.lang.String, android.os.Bundle):boolean");
    }

    public final boolean openHostBrowser(String str, boolean z, String str2, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("aweme://webview/?url=");
        sb.append(str);
        if (z) {
            sb.append("&title=");
            sb.append(str2);
        }
        return m105202a(context, sb.toString());
    }
}
