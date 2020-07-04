package com.p280ss.android.ugc.awemepushlib.p1713b;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.p022v4.app.C0581aa;
import android.text.TextUtils;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.awemepushlib.interaction.C43603d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.b.a */
public final class C43590a {
    /* renamed from: a */
    public static String m138120a(int i) {
        String str = "unknown";
        switch (i) {
            case 1:
                return "MI";
            case 2:
                return "MYSELF";
            case 3:
                return "IXINTUI";
            case 4:
                return "GETUI";
            case 5:
                return "GCM";
            case 6:
                return "UMENG";
            case 7:
                return "HW";
            case 8:
                return "MZ";
            case 9:
                return "ALIYUN";
            case 10:
                return "OPPO";
            default:
                return str;
        }
    }

    /* renamed from: b */
    private static boolean m138131b(int i) {
        return i == 1 || i == 4;
    }

    /* renamed from: c */
    private static boolean m138133c(int i) {
        return i == 2 || i == 3 || i == 1 || i == 4;
    }

    /* renamed from: a */
    public static boolean m138128a(JSONObject jSONObject, String str, String str2) {
        try {
            String string = jSONObject.getString(C22912d.f60642b);
            if (!TextUtils.isEmpty(string) && string.startsWith("sslocal://chat/center")) {
                return C6405d.m19987h();
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m138127a(JSONObject jSONObject) throws JSONException {
        return "success".equals(jSONObject.optString("message"));
    }

    /* renamed from: a */
    public static boolean m138129a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }

    /* renamed from: b */
    public static boolean m138130b() {
        try {
            return true ^ "Hisense".equalsIgnoreCase(Build.BRAND);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m138122a() {
        if (C6405d.m19984g() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m138132c() {
        try {
            if (C6776h.m20953d()) {
                return true;
            }
            if (VERSION.SDK_INT > 20 && C6776h.m20942a()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m138121a(Runnable runnable) {
        if (C9738o.m28706a()) {
            C6304f.submitRunnable(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static boolean m138125a(Context context) {
        String str;
        try {
            C0581aa a = C0581aa.m2444a(context);
            if (C6312h.m19578b()) {
                StringBuilder sb = new StringBuilder("NotificationSettingSwitch: ");
                if (a.mo2561a()) {
                    str = "Open";
                } else {
                    str = "Close";
                }
                sb.append(str);
            }
            return a.mo2561a();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m138126a(Map map) {
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m138123a(int i, int i2, Object obj) {
        if (i2 == i && VERSION.SDK_INT < 28 && (obj instanceof String)) {
            String str = (String) obj;
            if (str.contains("Bad notification posted from package")) {
                C43603d.m138181a("type_badnotification_error", C6869c.m21381a().mo16887a("message", str).mo16888b());
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m138124a(int i, Context context, Intent intent) {
        if (i != 0) {
            return false;
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.support.v4.app.NotificationCompat$c] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v13, types: [android.support.v4.app.NotificationCompat$MessagingStyle] */
    /* JADX WARNING: type inference failed for: r3v16, types: [android.support.v4.app.NotificationCompat$InboxStyle] */
    /* JADX WARNING: type inference failed for: r3v19, types: [android.support.v4.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: type inference failed for: r3v21, types: [android.support.v4.media.app.NotificationCompat$MediaStyle] */
    /* JADX WARNING: type inference failed for: r13v35, types: [android.support.v4.app.NotificationCompat$BigPictureStyle] */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x0365 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v10
      assigns: [?[OBJECT, ARRAY], android.support.v4.app.NotificationCompat$InboxStyle, android.support.v4.app.NotificationCompat$BigTextStyle]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.support.v4.app.NotificationCompat$c, android.support.v4.app.NotificationCompat$InboxStyle, android.support.v4.app.NotificationCompat$BigTextStyle]
      mth insns count: 316
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x036f A[Catch:{ Exception -> 0x0395 }] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification m138119a(android.content.Context r17, com.p280ss.android.ugc.awemepushlib.model.PushMsg r18, android.graphics.Bitmap r19, android.graphics.Bitmap r20, android.content.Intent r21, boolean r22) {
        /*
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            int r5 = r0.pass_through
            boolean r5 = m138124a(r5, r1, r4)
            r6 = 0
            if (r5 == 0) goto L_0x0014
            return r6
        L_0x0014:
            r5 = 0
            if (r2 != 0) goto L_0x0019
            r0.imageType = r5
        L_0x0019:
            if (r3 == 0) goto L_0x001d
            r7 = r3
            goto L_0x001e
        L_0x001d:
            r7 = r2
        L_0x001e:
            android.content.Context r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            com.p280ss.android.ugc.awemepushlib.interaction.C43601c.m138169a(r8)
            com.bytedance.ies.abmock.b r9 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.awemepushapi.PushSettingExperiment> r10 = com.p280ss.android.ugc.awemepushapi.PushSettingExperiment.class
            r11 = 0
            java.lang.String r12 = "enable_notification_category"
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r8 = r8.mo15295d()
            boolean r13 = r8.enable_notification_category
            r14 = 0
            boolean r8 = r9.mo15292a(r10, r11, r12, r13, r14)
            if (r8 == 0) goto L_0x0069
            com.p280ss.android.ugc.awemepushlib.interaction.C43601c.m138171b(r17)
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r8 = r0.extra
            java.lang.String r8 = r8.notificationChannelId
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0061
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r8 = r0.extra
            java.lang.String r8 = r8.notificationChannelId
            boolean r8 = com.p280ss.android.ugc.awemepushlib.interaction.C43601c.m138170a(r1, r8)
            if (r8 != 0) goto L_0x0057
            goto L_0x0061
        L_0x0057:
            android.support.v4.app.NotificationCompat$b r8 = new android.support.v4.app.NotificationCompat$b
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            java.lang.String r9 = r9.notificationChannelId
            r8.<init>(r1, r9)
            goto L_0x0073
        L_0x0061:
            android.support.v4.app.NotificationCompat$b r8 = new android.support.v4.app.NotificationCompat$b
            java.lang.String r9 = "other_channel"
            r8.<init>(r1, r9)
            goto L_0x0073
        L_0x0069:
            com.p280ss.android.ugc.awemepushlib.interaction.C43601c.m138172c(r17)
            android.support.v4.app.NotificationCompat$b r8 = new android.support.v4.app.NotificationCompat$b
            java.lang.String r9 = "com.ss.android.ugc.aweme.server"
            r8.<init>(r1, r9)
        L_0x0073:
            java.lang.String r9 = r0.title
            boolean r9 = com.bytedance.common.utility.C6319n.m19593a(r9)
            if (r9 == 0) goto L_0x0084
            r9 = 2131820920(0x7f110178, float:1.9274569E38)
            java.lang.String r9 = r1.getString(r9)
            r0.title = r9
        L_0x0084:
            java.lang.String r9 = r0.title
            android.support.v4.app.NotificationCompat$b r9 = r8.mo2545d(r9)
            r10 = 1
            r9.mo2539b(r10)
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 20
            if (r9 <= r11) goto L_0x009b
            r9 = 2131233874(0x7f080c52, float:1.8083898E38)
            r8.mo2519a(r9)
            goto L_0x00a1
        L_0x009b:
            r9 = 2131233873(0x7f080c51, float:1.8083896E38)
            r8.mo2519a(r9)
        L_0x00a1:
            boolean r9 = r0.led
            if (r9 == 0) goto L_0x00af
            r9 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r12 = 1000(0x3e8, float:1.401E-42)
            r13 = 2500(0x9c4, float:3.503E-42)
            r8.mo2520a(r9, r12, r13)
        L_0x00af:
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            boolean r9 = r9.isGroupSummary
            if (r9 != 0) goto L_0x00c1
            java.lang.String r9 = "defaultGroup"
            r8.mo2531a(r9)
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            boolean r9 = r9.isGroupSummary
            r8.mo2546d(r9)
        L_0x00c1:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            r12 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivity(r1, r5, r9, r12)
            int r13 = r0.imageType
            boolean r13 = m138131b(r13)
            if (r13 == 0) goto L_0x010d
            if (r2 == 0) goto L_0x010d
            android.support.v4.app.NotificationCompat$BigPictureStyle r13 = new android.support.v4.app.NotificationCompat$BigPictureStyle
            r13.<init>()
            android.support.v4.app.NotificationCompat$BigPictureStyle r13 = r13.mo2501a(r2)
            java.lang.String r14 = r0.title
            android.support.v4.app.NotificationCompat$BigPictureStyle r13 = r13.mo2502a(r14)
            java.lang.String r14 = r0.text
            android.support.v4.app.NotificationCompat$BigPictureStyle r13 = r13.mo2505b(r14)
            if (r3 == 0) goto L_0x00f1
            r13.mo2504b(r3)
            goto L_0x010a
        L_0x00f1:
            android.content.res.Resources r3 = r17.getResources()
            int r14 = com.p280ss.android.ugc.awemepushlib.R$drawable.icon
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r14)
            boolean r14 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r14 == 0) goto L_0x0106
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            goto L_0x0107
        L_0x0106:
            r3 = r6
        L_0x0107:
            r13.mo2504b(r3)
        L_0x010a:
            r3 = r13
            goto L_0x01ad
        L_0x010d:
            int r3 = r0.imageType
            r13 = 5
            if (r3 != r13) goto L_0x0128
            android.support.v4.media.app.NotificationCompat$MediaStyle r3 = new android.support.v4.media.app.NotificationCompat$MediaStyle
            r3.<init>()
            android.support.v4.media.session.MediaSessionCompat r13 = new android.support.v4.media.session.MediaSessionCompat
            java.lang.String r14 = "notification"
            r13.<init>(r1, r14)
            android.support.v4.media.session.MediaSessionCompat$Token r13 = r13.mo3187a()
            android.support.v4.media.app.NotificationCompat$MediaStyle r3 = r3.mo3093a(r13)
            goto L_0x01ad
        L_0x0128:
            int r3 = r0.imageType
            r13 = 6
            if (r3 != r13) goto L_0x0150
            android.support.v4.app.NotificationCompat$BigTextStyle r3 = new android.support.v4.app.NotificationCompat$BigTextStyle
            r3.<init>()
            java.lang.String r13 = r0.title
            android.support.v4.app.NotificationCompat$BigTextStyle r3 = r3.mo2506a(r13)
            java.lang.String r13 = r0.text
            android.support.v4.app.NotificationCompat$BigTextStyle r3 = r3.mo2507b(r13)
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r13 = r0.extra
            java.lang.String r13 = r13.extra_text
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x01ad
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r13 = r0.extra
            java.lang.String r13 = r13.extra_text
            r3.mo2508c(r13)
            goto L_0x01ad
        L_0x0150:
            int r3 = r0.imageType
            r13 = 7
            if (r3 != r13) goto L_0x018e
            android.support.v4.app.NotificationCompat$InboxStyle r3 = new android.support.v4.app.NotificationCompat$InboxStyle
            r3.<init>()
            java.lang.String r13 = r0.title
            android.support.v4.app.NotificationCompat$InboxStyle r3 = r3.mo2512a(r13)
            java.lang.String r13 = r0.text
            android.support.v4.app.NotificationCompat$InboxStyle r3 = r3.mo2513b(r13)
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r13 = r0.extra
            java.lang.String r13 = r13.extra_text
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x01ad
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r13 = r0.extra
            java.lang.String r13 = r13.extra_text
            java.lang.String r14 = "\n"
            java.lang.String[] r13 = r13.split(r14)
            int r14 = r13.length
            r15 = 0
        L_0x017c:
            if (r15 >= r14) goto L_0x01ad
            r12 = r13[r15]
            boolean r16 = android.text.TextUtils.isEmpty(r12)
            if (r16 != 0) goto L_0x0189
            r3.mo2514c(r12)
        L_0x0189:
            int r15 = r15 + 1
            r12 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x017c
        L_0x018e:
            int r3 = r0.imageType
            r12 = 8
            if (r3 != r12) goto L_0x01ac
            android.support.v4.app.NotificationCompat$MessagingStyle r3 = new android.support.v4.app.NotificationCompat$MessagingStyle
            java.lang.String r12 = ""
            r3.<init>(r12)
            java.lang.String r12 = r0.title
            android.support.v4.app.NotificationCompat$MessagingStyle r3 = r3.mo2515a(r12)
            java.lang.String r12 = r0.text
            long r13 = java.lang.System.currentTimeMillis()
            android.support.v4.app.NotificationCompat$MessagingStyle r3 = r3.mo2516a(r12, r13, r6)
            goto L_0x01ad
        L_0x01ac:
            r3 = r6
        L_0x01ad:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 <= r11) goto L_0x01ba
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r12 = r0.extra
            boolean r12 = r12.is_notification_top
            if (r12 == 0) goto L_0x01ba
            r8.mo2525a(r9, r10)
        L_0x01ba:
            int r9 = r0.imageType
            boolean r9 = m138131b(r9)
            if (r9 == 0) goto L_0x01c7
            if (r7 == 0) goto L_0x01c7
            r8.mo2526a(r7)
        L_0x01c7:
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            int r9 = r9.getPriority()
            r8.mo2541c(r9)
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            boolean r9 = r9.isZeroVibrate
            if (r9 == 0) goto L_0x01db
            long[] r9 = new long[r5]
            r8.mo2533a(r9)
        L_0x01db:
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            java.lang.String r9 = r9.bg_color
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x01f0
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            java.lang.String r9 = r9.bg_color
            int r9 = android.graphics.Color.parseColor(r9)
            r8.mo2544d(r9)
        L_0x01f0:
            java.lang.String r9 = r0.title
            android.support.v4.app.NotificationCompat$b r9 = r8.mo2530a(r9)
            java.lang.String r12 = r0.text
            android.support.v4.app.NotificationCompat$b r9 = r9.mo2537b(r12)
            long r12 = java.lang.System.currentTimeMillis()
            r9.mo2523a(r12)
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            int r9 = r9.visibility
            r8.mo2547e(r9)
            boolean r9 = m138132c()
            if (r9 != 0) goto L_0x0219
            com.ss.android.ugc.awemepushlib.model.PushMsg$Extra r9 = r0.extra
            boolean r9 = r9.user_system_style
            if (r9 == 0) goto L_0x0217
            goto L_0x0219
        L_0x0217:
            r9 = 0
            goto L_0x021a
        L_0x0219:
            r9 = 1
        L_0x021a:
            r12 = 3
            if (r9 != 0) goto L_0x02d2
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r9 = "HH:mm"
            java.util.Locale r13 = java.util.Locale.getDefault()
            r2.<init>(r9, r13)
            java.util.Date r9 = new java.util.Date
            long r13 = java.lang.System.currentTimeMillis()
            r9.<init>(r13)
            java.lang.String r2 = r2.format(r9)
            java.lang.String r9 = r17.getPackageName()
            int r13 = r0.imageType
            if (r13 != r12) goto L_0x0246
            android.widget.RemoteViews r13 = new android.widget.RemoteViews
            r14 = 2131494516(0x7f0c0674, float:1.8612543E38)
            r13.<init>(r9, r14)
            goto L_0x025b
        L_0x0246:
            int r13 = r0.imageType
            if (r13 != r10) goto L_0x0253
            android.widget.RemoteViews r13 = new android.widget.RemoteViews
            r14 = 2131494515(0x7f0c0673, float:1.861254E38)
            r13.<init>(r9, r14)
            goto L_0x025b
        L_0x0253:
            android.widget.RemoteViews r13 = new android.widget.RemoteViews
            r14 = 2131494514(0x7f0c0672, float:1.8612539E38)
            r13.<init>(r9, r14)
        L_0x025b:
            r9 = 2131302118(0x7f0916e6, float:1.8222313E38)
            java.lang.String r14 = r0.title
            r13.setTextViewText(r9, r14)
            r9 = 2131302025(0x7f091689, float:1.8222124E38)
            java.lang.String r14 = r0.text
            r13.setTextViewText(r9, r14)
            r9 = 2131302098(0x7f0916d2, float:1.8222273E38)
            r13.setTextViewText(r9, r2)
            int r2 = r0.imageType
            boolean r2 = m138131b(r2)
            r9 = 2131298510(0x7f0908ce, float:1.8214995E38)
            if (r2 == 0) goto L_0x0282
            if (r7 == 0) goto L_0x0282
            r13.setImageViewBitmap(r9, r7)
            goto L_0x0287
        L_0x0282:
            int r2 = com.p280ss.android.ugc.awemepushlib.R$drawable.icon
            r13.setImageViewResource(r9, r2)
        L_0x0287:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r11) goto L_0x02a6
            boolean r2 = com.bytedance.ies.uikit.p578c.C11014a.m32282a(r17)     // Catch:{ Throwable -> 0x02a5 }
            if (r2 == 0) goto L_0x02a6
            r2 = 2131301220(0x7f091364, float:1.8220492E38)
            java.lang.String r11 = "setBackgroundColor"
            android.content.res.Resources r14 = r17.getResources()     // Catch:{ Throwable -> 0x02a5 }
            r15 = 2131100694(0x7f060416, float:1.7813777E38)
            int r14 = r14.getColor(r15)     // Catch:{ Throwable -> 0x02a5 }
            r13.setInt(r2, r11, r14)     // Catch:{ Throwable -> 0x02a5 }
            goto L_0x02a6
        L_0x02a5:
        L_0x02a6:
            int r2 = r0.imageType
            boolean r2 = m138133c(r2)
            if (r2 == 0) goto L_0x02ce
            if (r7 == 0) goto L_0x02ce
            int r2 = r7.getWidth()     // Catch:{ Exception -> 0x02ce }
            int r11 = r7.getHeight()     // Catch:{ Exception -> 0x02ce }
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x02ce }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r11, r14)     // Catch:{ Exception -> 0x02ce }
            android.graphics.Canvas r11 = new android.graphics.Canvas     // Catch:{ Exception -> 0x02ce }
            r11.<init>(r2)     // Catch:{ Exception -> 0x02ce }
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ Exception -> 0x02ce }
            r14.<init>()     // Catch:{ Exception -> 0x02ce }
            r11.drawBitmap(r7, r14, r6)     // Catch:{ Exception -> 0x02ce }
            r13.setImageViewBitmap(r9, r2)     // Catch:{ Exception -> 0x02ce }
        L_0x02ce:
            r8.mo2529a(r13)
            goto L_0x0311
        L_0x02d2:
            if (r2 == 0) goto L_0x02f8
            int r7 = r0.imageType
            if (r7 == 0) goto L_0x02f8
            int r7 = r19.getWidth()     // Catch:{ Exception -> 0x02f4 }
            int r9 = r19.getHeight()     // Catch:{ Exception -> 0x02f4 }
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x02f4 }
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r9, r11)     // Catch:{ Exception -> 0x02f4 }
            android.graphics.Canvas r9 = new android.graphics.Canvas     // Catch:{ Exception -> 0x02f4 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x02f4 }
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch:{ Exception -> 0x02f4 }
            r11.<init>()     // Catch:{ Exception -> 0x02f4 }
            r9.drawBitmap(r2, r11, r6)     // Catch:{ Exception -> 0x02f4 }
            r2 = r7
        L_0x02f4:
            r8.mo2526a(r2)
            goto L_0x0311
        L_0x02f8:
            android.content.res.Resources r2 = r17.getResources()
            int r7 = com.p280ss.android.ugc.awemepushlib.R$drawable.icon
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r7)
            boolean r7 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r7 == 0) goto L_0x030d
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r2 = r2.getBitmap()
            goto L_0x030e
        L_0x030d:
            r2 = r6
        L_0x030e:
            r8.mo2526a(r2)
        L_0x0311:
            if (r3 == 0) goto L_0x0316
            r8.mo2528a(r3)
        L_0x0316:
            java.lang.String r2 = r0.soundUrl     // Catch:{ Exception -> 0x0395 }
            android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0395 }
            boolean r2 = r0.sound     // Catch:{ Exception -> 0x0395 }
            if (r2 != 0) goto L_0x0323
            boolean r2 = r0.useSound     // Catch:{ Exception -> 0x0395 }
            if (r2 == 0) goto L_0x0345
        L_0x0323:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x033f }
            java.lang.String r3 = "android.resource://"
            r2.<init>(r3)     // Catch:{ Exception -> 0x033f }
            java.lang.String r3 = r17.getPackageName()     // Catch:{ Exception -> 0x033f }
            r2.append(r3)     // Catch:{ Exception -> 0x033f }
            java.lang.String r3 = "/2131755015"
            r2.append(r3)     // Catch:{ Exception -> 0x033f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x033f }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x033f }
            goto L_0x0340
        L_0x033f:
            r2 = r6
        L_0x0340:
            if (r2 == 0) goto L_0x0347
            r8.mo2527a(r2)     // Catch:{ Exception -> 0x0395 }
        L_0x0345:
            r10 = 0
            goto L_0x034a
        L_0x0347:
            r8.mo2535b(r10)     // Catch:{ Exception -> 0x0395 }
        L_0x034a:
            boolean r0 = r0.vibrator     // Catch:{ Exception -> 0x0395 }
            if (r0 == 0) goto L_0x0365
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Throwable -> 0x0365 }
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch:{ Throwable -> 0x0365 }
            int r0 = r0.getRingerMode()     // Catch:{ Throwable -> 0x0365 }
            switch(r0) {
                case 0: goto L_0x0365;
                case 1: goto L_0x035e;
                case 2: goto L_0x035e;
                default: goto L_0x035d;
            }     // Catch:{ Throwable -> 0x0365 }
        L_0x035d:
            goto L_0x0365
        L_0x035e:
            if (r10 == 0) goto L_0x0361
            goto L_0x0362
        L_0x0361:
            r12 = 2
        L_0x0362:
            r8.mo2535b(r12)     // Catch:{ Throwable -> 0x0365 }
        L_0x0365:
            com.ss.android.ugc.awemepushlib.manager.a r0 = com.p280ss.android.ugc.awemepushlib.manager.C43633a.m138259c()     // Catch:{ Exception -> 0x0395 }
            boolean r0 = r0.mo105556b()     // Catch:{ Exception -> 0x0395 }
            if (r0 == 0) goto L_0x0389
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0395 }
            java.lang.Class<com.ss.android.ugc.awemepushlib.os.receiver.NotificationBroadcastReceiver> r2 = com.p280ss.android.ugc.awemepushlib.p1715os.receiver.NotificationBroadcastReceiver.class
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r2 = "notification_cancelled"
            r0.setAction(r2)     // Catch:{ Exception -> 0x0395 }
            java.lang.String r2 = "contentIntentURI"
            r0.putExtra(r2, r4)     // Catch:{ Exception -> 0x0395 }
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r1, r5, r0, r2)     // Catch:{ Exception -> 0x0395 }
            r8.mo2536b(r0)     // Catch:{ Exception -> 0x0395 }
        L_0x0389:
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r5, r4, r5)     // Catch:{ Exception -> 0x0395 }
            r8.mo2524a(r0)     // Catch:{ Exception -> 0x0395 }
            android.app.Notification r0 = r8.mo2534b()     // Catch:{ Exception -> 0x0395 }
            return r0
        L_0x0395:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "can not get launch intent: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.bytedance.ies.p534b.C10295a.m30492a(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.awemepushlib.p1713b.C43590a.m138119a(android.content.Context, com.ss.android.ugc.awemepushlib.model.PushMsg, android.graphics.Bitmap, android.graphics.Bitmap, android.content.Intent, boolean):android.app.Notification");
    }
}
