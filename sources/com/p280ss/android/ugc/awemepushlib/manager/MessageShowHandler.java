package com.p280ss.android.ugc.awemepushlib.manager;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.ies.p534b.C10295a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.CompressType;
import com.p280ss.android.push.window.oppo.C20037e;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;
import com.p280ss.android.ugc.awemepushlib.interaction.C43603d;
import com.p280ss.android.ugc.awemepushlib.model.C43639a;
import com.p280ss.android.ugc.awemepushlib.model.PushMsg;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43590a;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43591b;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43592c;
import com.p280ss.android.ugc.awemepushlib.widget.C43641a;
import com.p280ss.android.ugc.awemepushlib.widget.PushNotifyActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler */
public final class MessageShowHandler {

    /* renamed from: a */
    private static boolean f112886a = true;

    /* renamed from: b */
    private static final Object f112887b = new Object();

    /* renamed from: c */
    private static NotificationManager f112888c;

    /* renamed from: d */
    private static final List<C43630a> f112889d = new ArrayList();

    /* renamed from: e */
    private static volatile boolean f112890e = false;

    /* renamed from: f */
    private static DownloadImageApi f112891f;

    /* renamed from: g */
    private static C6309f f112892g = new C6309f(Looper.getMainLooper(), new C6310a() {
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: h */
    private static final Comparator<C43630a> f112893h = new Comparator<C43630a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m138248a((C43630a) obj, (C43630a) obj2);
        }

        /* renamed from: a */
        private static int m138248a(C43630a aVar, C43630a aVar2) {
            if (aVar.f112898b == aVar2.f112898b) {
                return 0;
            }
            if (aVar.f112898b > aVar2.f112898b) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$DownloadImageApi */
    public interface DownloadImageApi {
        @C6457h
        C12466b<TypedInput> downloadImageWithUrl(@C6450ac String str);
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$a */
    static class C43630a {

        /* renamed from: a */
        public int f112897a;

        /* renamed from: b */
        public long f112898b;

        C43630a(int i, long j) {
            this.f112897a = i;
            this.f112898b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$b */
    static class C43631b implements Runnable {

        /* renamed from: a */
        private final String f112899a;

        public final void run() {
            Context a = C6399b.m19921a();
            if (a != null) {
                try {
                    MessageShowHandler.m138242a(a, this.f112899a);
                } catch (Exception unused) {
                }
            }
        }

        private C43631b(String str) {
            this.f112899a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$c */
    static class C43632c implements Runnable {

        /* renamed from: a */
        private final String[] f112900a;

        public final void run() {
            if (this.f112900a != null && this.f112900a.length > 0) {
                try {
                    String str = this.f112900a[0];
                    String str2 = this.f112900a[1];
                    String str3 = this.f112900a[2];
                    String str4 = this.f112900a[3];
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("did", str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("id", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("url", str4);
                        }
                        C43590a.m138127a(new JSONObject(NetworkUtils.executePost(-1, str, jSONObject.toString().getBytes("UTF-8"), CompressType.GZIP, "application/json")));
                    }
                } catch (Throwable unused) {
                }
            }
        }

        C43632c(String[] strArr) {
            this.f112900a = strArr;
        }
    }

    /* renamed from: a */
    public static void m138243a(Context context, String str, int i, String str2) {
        if (!C6319n.m19593a(str)) {
            PushMsg from = PushMsg.from(str);
            if (from != null && !AwemeRedBadgerManager.m138220a().mo105540a(context, from)) {
                C43603d.m138177a(from, i);
                C43603d.m138179a(from.openUrl);
                from.extra.turn_screen_on = false;
                m138247b(context, i, from);
                C43633a.m138259c().mo105550a(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: a */
    private static boolean m138245a(Context context, PushMsg pushMsg, int i, JSONObject jSONObject) {
        PushMsg pushMsg2 = pushMsg;
        int i2 = i;
        long j = (long) i2;
        Context context2 = context;
        C43603d.m138176a(context2, "news_achieve", (long) pushMsg2.f112935id, j, jSONObject);
        if (i2 == 6) {
            Context context3 = context;
            C43603d.m138176a(context3, "umeng_news_achieve", (long) pushMsg2.f112935id, j, jSONObject);
        }
        if (pushMsg2.isPing == 1) {
            return true;
        }
        if (C6319n.m19593a(pushMsg2.text)) {
            if (pushMsg2.pass_through == 0) {
                m138235a(context);
            }
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (pushMsg2.pass_through == 0 || pushMsg2.filter == 0 || !C43633a.m138259c().mo105553a(pushMsg2.f112935id, currentTimeMillis)) {
            return false;
        }
        C43603d.m138176a(context, "news_forbid", (long) pushMsg2.f112935id, 2, new JSONObject[0]);
        C10295a.m30492a(context, "MessageExisted drop exist message ");
        return true;
    }

    /* renamed from: a */
    private static void m138244a(String str, String str2, String str3, Bitmap bitmap, int i, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        JSONObject b = C6869c.m21381a().mo16887a(C38347c.f99553h, str2).mo16887a("title", str).mo16887a("imageUrl", str3).mo16887a("errorMsg", str4).mo16887a("imageType", sb.toString()).mo16888b();
        if (bitmap != null) {
            C43603d.m138180a("aweme_push_image_load_error_rate", 0, b);
        } else if (TextUtils.isEmpty(str4) || !str4.contains("network not available")) {
            C43603d.m138180a("aweme_push_image_load_error_rate", 1, b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m138240a(Context context, Bitmap bitmap, Bitmap bitmap2, int i, Intent intent, PushMsg pushMsg) {
        if (C43590a.m138128a(pushMsg.originData, pushMsg.text, pushMsg.title)) {
            if (bitmap == null && bitmap2 == null) {
                C43603d.m138178a(pushMsg, false, i);
            } else {
                C43603d.m138178a(pushMsg, true, i);
            }
            Intent a = m138230a(context, i, pushMsg, 0);
            if (a != null) {
                a.putExtra("log_data_extra_to_adsapp", (HashMap) C43639a.m138285a(pushMsg, i, true));
                Notification a2 = C43590a.m138119a(context, pushMsg, bitmap, bitmap2, a, false);
                if (a2 != null) {
                    if (C43045c.m136572b()) {
                        m138234a(a2, pushMsg.extra.badgeCount);
                    }
                    if (C30538p.m99745a()) {
                        try {
                            f112888c.notify("app_notify_ame", pushMsg.f112935id, a2);
                            C43603d.m138176a(context, "news_notify_show", (long) pushMsg.f112935id, -1, new JSONObject[0]);
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder("notify exception: ");
                            sb.append(e);
                            C10295a.m30492a(context, sb.toString());
                        }
                    } else {
                        try {
                            if (f112888c == null) {
                                f112888c = (NotificationManager) context.getSystemService("notification");
                            }
                            if ("oppo".equalsIgnoreCase(Build.BRAND) && pushMsg.extra.oppoFloatWindow == 2 && C20037e.m65993a(context) == 0) {
                                PushMsg pushMsg2 = new PushMsg();
                                pushMsg2.text = pushMsg.text;
                                pushMsg2.f112935id = pushMsg.f112935id;
                                pushMsg2.title = pushMsg.title;
                                m138241a(context, pushMsg2, i, bitmap, a, pushMsg.extra.float_window_show_time, pushMsg.extra.oppo_push_style);
                            }
                            f112888c.notify("app_notify_ame", pushMsg.f112935id, a2);
                            if (pushMsg != null) {
                                C43603d.m138176a(context, "news_notify_show", (long) pushMsg.f112935id, -1, new JSONObject[0]);
                            }
                        } catch (Exception e2) {
                            StringBuilder sb2 = new StringBuilder("notify exception: ");
                            sb2.append(e2);
                            C10295a.m30492a(context, sb2.toString());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m138241a(Context context, PushMsg pushMsg, int i, Bitmap bitmap, Intent intent, long j, int i2) {
        int i3;
        int i4;
        Context context2 = context;
        PushMsg pushMsg2 = pushMsg;
        int i5 = i;
        Bitmap bitmap2 = bitmap;
        Intent intent2 = intent;
        if (intent2 != null) {
            Throwable th = null;
            try {
                boolean equalsIgnoreCase = "oppo".equalsIgnoreCase(Build.BRAND);
                if (C43591b.m138135a(context)) {
                    long j2 = j;
                    i4 = 2010;
                    i3 = 264;
                } else if (equalsIgnoreCase) {
                    long j3 = j;
                    i4 = 20005;
                    i3 = 136;
                } else if (!C43590a.m138125a(context)) {
                    Intent intent3 = new Intent(context2, PushNotifyActivity.class);
                    intent3.addFlags(268435456);
                    intent3.putExtra("message_from", i5);
                    intent3.putExtra("message_obj", pushMsg2);
                    intent3.putExtra("__targetIntent__", intent2);
                    intent3.putExtra("__showTime__", C43633a.m138259c().f112909e);
                    intent3.putExtra("__showTime__", j);
                    if (bitmap2 != null) {
                        intent3.putExtra("__bitmap__", bitmap2);
                    }
                    try {
                        context2.startActivity(intent3);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                } else {
                    long j4 = j;
                    i4 = 2005;
                    i3 = 8;
                }
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                C43641a aVar = r1;
                C43641a aVar2 = new C43641a(context, i, pushMsg, bitmap, intent, j, i2);
                WindowManager windowManager2 = windowManager;
                LayoutParams layoutParams = new LayoutParams(-1, -2, 0, 0, i4, i3, 1);
                layoutParams.gravity = 51;
                if (equalsIgnoreCase) {
                    layoutParams.setTitle("Toast");
                }
                windowManager2.addView(aVar, layoutParams);
            } catch (Throwable th2) {
                th = th2;
            }
            if (th != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("throwable", Log.getStackTraceString(th));
                    C43603d.m138176a(context, "news_notify_anim_push_try_show", (long) pushMsg2.f112935id, (long) i5, jSONObject);
                } catch (Throwable unused2) {
                }
                return;
            }
            C43603d.m138176a(context, "news_notify_anim_push_try_show", (long) pushMsg2.f112935id, (long) i5, new JSONObject[0]);
        }
    }

    /* renamed from: a */
    public static void m138242a(Context context, String str) {
        synchronized (f112887b) {
            Editor edit = C7285c.m22838a(context, "app_notify_info", 0).edit();
            edit.putString("notify_list", str);
            edit.commit();
        }
    }

    /* renamed from: a */
    private static void m138238a(Context context, int i, String str, int i2, String str2) {
        if (context != null && i == 1 && str != null) {
            try {
                if (C43633a.m138259c().mo105558c(context) && !TextUtils.isEmpty(str)) {
                    m138243a(context, str, i2, str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m138235a(Context context) {
        if (context != null) {
            try {
                Intent a = C6776h.m20941a(context, context.getPackageName());
                if (a != null) {
                    a.addFlags(268435456);
                    a.putExtra("from_notification", true);
                    context.startActivity(a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m138231a(String str) {
        if (f112891f == null) {
            f112891f = (DownloadImageApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str).mo26430a().mo26435a(DownloadImageApi.class);
        }
        try {
            return BitmapFactory.decodeStream(((TypedInput) f112891f.downloadImageWithUrl(str).execute().f33302b).mo10444in());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m138246b(Context context) {
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (f112887b) {
                string = C7285c.m22838a(context, "app_notify_info", 0).getString("notify_list", null);
            }
            if (!C6319n.m19593a(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    long optLong = jSONObject.optLong("time", 0);
                    int optInt = jSONObject.optInt("id", 0);
                    if (optInt > 0) {
                        arrayList.add(new C43630a(optInt, optLong));
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (!arrayList.isEmpty()) {
            try {
                f112889d.clear();
                f112889d.addAll(arrayList);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    private static void m138234a(Notification notification, int i) {
        try {
            Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
            obj.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m138236a(Context context, int i) {
        Iterator it = f112889d.iterator();
        while (it.hasNext()) {
            C43630a aVar = (C43630a) it.next();
            if (aVar != null && aVar.f112897a == i) {
                it.remove();
            }
        }
        int i2 = C43633a.m138259c().f112911g;
        int i3 = C43633a.m138259c().f112910f;
        long j = (long) C43633a.m138259c().f112912h;
        if (i3 <= 0) {
            i3 = 5;
        } else if (i3 > 10) {
            i3 = 10;
        }
        if (i2 <= 0) {
            i2 = 2;
        } else if (i2 > 10) {
            i2 = 10;
        }
        if (j <= 0) {
            j = 1800;
        } else if (j < 600) {
            j = 600;
        } else if (j > 259200) {
            j = 259200;
        }
        long j2 = j * 1000;
        int i4 = i2 - 1;
        int i5 = i3 - 1;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int size = f112889d.size();
            if (size > i4) {
                Collections.sort(f112889d, f112893h);
                for (int i6 = size - 1; i6 >= i4; i6--) {
                    C43630a aVar2 = (C43630a) f112889d.get(i6);
                    if (currentTimeMillis - aVar2.f112898b <= j2 && i6 < i5) {
                        break;
                    }
                    f112889d.remove(i6);
                    try {
                        f112888c.cancel("app_notify_ame", aVar2.f112897a);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        f112889d.add(new C43630a(i, currentTimeMillis));
        try {
            JSONArray jSONArray = new JSONArray();
            for (C43630a aVar3 : f112889d) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", aVar3.f112897a);
                jSONObject.put("time", aVar3.f112898b);
                jSONArray.put(jSONObject);
            }
            C6304f.submitRunnable(new C43631b(jSONArray.toString()));
        } catch (Exception unused3) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0165 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031 A[Catch:{ Throwable -> 0x00e3, all -> 0x00ac, Throwable -> 0x00e2, Exception -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012d A[Catch:{ Exception -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015e A[Catch:{ Exception -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016b A[Catch:{ Throwable -> 0x00e3, all -> 0x00ac, Throwable -> 0x00e2, Exception -> 0x0177 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016c A[Catch:{ Throwable -> 0x00e3, all -> 0x00ac, Throwable -> 0x00e2, Exception -> 0x0177 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m138247b(final android.content.Context r13, final int r14, final com.p280ss.android.ugc.awemepushlib.model.PushMsg r15) {
        /*
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = "push_show"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = "perf_monitor"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)     // Catch:{ Exception -> 0x001d }
            int r1 = r15.f112935id     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x001d }
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)     // Catch:{ Exception -> 0x001d }
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r0)     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            boolean r0 = com.p280ss.android.ugc.awemepushlib.p1713b.C43591b.m138134a()     // Catch:{ Exception -> 0x0177 }
            if (r0 == 0) goto L_0x002c
            com.ss.android.ugc.awemepushlib.manager.a r0 = com.p280ss.android.ugc.awemepushlib.manager.C43633a.m138259c()     // Catch:{ Exception -> 0x0177 }
            boolean r0 = r0.f112907c     // Catch:{ Exception -> 0x0177 }
            if (r0 != 0) goto L_0x002c
            return
        L_0x002c:
            boolean r0 = f112890e     // Catch:{ Exception -> 0x0177 }
            r1 = 1
            if (r0 != 0) goto L_0x0036
            m138246b(r13)     // Catch:{ Exception -> 0x0177 }
            f112890e = r1     // Catch:{ Exception -> 0x0177 }
        L_0x0036:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r13.getSystemService(r0)     // Catch:{ Exception -> 0x0177 }
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch:{ Exception -> 0x0177 }
            f112888c = r0     // Catch:{ Exception -> 0x0177 }
            java.lang.String r0 = r15.callback     // Catch:{ Exception -> 0x0177 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0177 }
            r2 = 0
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = r15.callback     // Catch:{ Exception -> 0x0177 }
            java.lang.String r3 = "http"
            boolean r0 = r0.startsWith(r3)     // Catch:{ Exception -> 0x0177 }
            if (r0 == 0) goto L_0x0115
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            java.lang.String r3 = r15.callback     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            r0[r2] = r3     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            java.lang.String r3 = com.bytedance.ies.ugc.statisticlogger.C10981a.m32174d()     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            r0[r1] = r3     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            r3 = 2
            int r4 = r15.f112935id     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            r0[r3] = r4     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            r3 = 3
            java.lang.String r4 = r15.openUrl     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            r0[r3] = r4     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$c r3 = new com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$c     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            com.bytedance.common.utility.p254b.C6304f.submitRunnable(r3)     // Catch:{ Throwable -> 0x00e3, all -> 0x00ac }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0115 }
            r0.<init>()     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "callback"
            java.lang.String r4 = r15.callback     // Catch:{ Throwable -> 0x0115 }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "did"
            java.lang.String r4 = com.bytedance.ies.ugc.statisticlogger.C10981a.m32174d()     // Catch:{ Throwable -> 0x0115 }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "id"
            int r4 = r15.f112935id     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0115 }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "url"
            java.lang.String r4 = r15.openUrl     // Catch:{ Throwable -> 0x0115 }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r6 = "message_callback"
            int r3 = r15.f112935id     // Catch:{ Throwable -> 0x0115 }
            long r7 = (long) r3     // Catch:{ Throwable -> 0x0115 }
            long r9 = (long) r14     // Catch:{ Throwable -> 0x0115 }
            org.json.JSONObject[] r11 = new org.json.JSONObject[r1]     // Catch:{ Throwable -> 0x0115 }
            r11[r2] = r0     // Catch:{ Throwable -> 0x0115 }
        L_0x00a7:
            r5 = r13
            com.p280ss.android.ugc.awemepushlib.interaction.C43603d.m138176a(r5, r6, r7, r9, r11)     // Catch:{ Throwable -> 0x0115 }
            goto L_0x0115
        L_0x00ac:
            r0 = move-exception
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00e2 }
            r3.<init>()     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r4 = "callback"
            java.lang.String r5 = r15.callback     // Catch:{ Throwable -> 0x00e2 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r4 = "did"
            java.lang.String r5 = com.bytedance.ies.ugc.statisticlogger.C10981a.m32174d()     // Catch:{ Throwable -> 0x00e2 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r4 = "id"
            int r5 = r15.f112935id     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x00e2 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r4 = "url"
            java.lang.String r5 = r15.openUrl     // Catch:{ Throwable -> 0x00e2 }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r7 = "message_callback"
            int r15 = r15.f112935id     // Catch:{ Throwable -> 0x00e2 }
            long r8 = (long) r15     // Catch:{ Throwable -> 0x00e2 }
            long r10 = (long) r14     // Catch:{ Throwable -> 0x00e2 }
            org.json.JSONObject[] r12 = new org.json.JSONObject[r1]     // Catch:{ Throwable -> 0x00e2 }
            r12[r2] = r3     // Catch:{ Throwable -> 0x00e2 }
            r6 = r13
            com.p280ss.android.ugc.awemepushlib.interaction.C43603d.m138176a(r6, r7, r8, r10, r12)     // Catch:{ Throwable -> 0x00e2 }
        L_0x00e2:
            throw r0     // Catch:{ Exception -> 0x0177 }
        L_0x00e3:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0115 }
            r0.<init>()     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "callback"
            java.lang.String r4 = r15.callback     // Catch:{ Throwable -> 0x0115 }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "did"
            java.lang.String r4 = com.bytedance.ies.ugc.statisticlogger.C10981a.m32174d()     // Catch:{ Throwable -> 0x0115 }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "id"
            int r4 = r15.f112935id     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0115 }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r3 = "url"
            java.lang.String r4 = r15.openUrl     // Catch:{ Throwable -> 0x0115 }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x0115 }
            java.lang.String r6 = "message_callback"
            int r3 = r15.f112935id     // Catch:{ Throwable -> 0x0115 }
            long r7 = (long) r3     // Catch:{ Throwable -> 0x0115 }
            long r9 = (long) r14     // Catch:{ Throwable -> 0x0115 }
            org.json.JSONObject[] r11 = new org.json.JSONObject[r1]     // Catch:{ Throwable -> 0x0115 }
            r11[r2] = r0     // Catch:{ Throwable -> 0x0115 }
            goto L_0x00a7
        L_0x0115:
            r0 = 0
            java.lang.String r3 = "power"
            java.lang.Object r3 = r13.getSystemService(r3)     // Catch:{ Exception -> 0x0164 }
            android.os.PowerManager r3 = (android.os.PowerManager) r3     // Catch:{ Exception -> 0x0164 }
            boolean r3 = r3.isScreenOn()     // Catch:{ Exception -> 0x0164 }
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0164 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0164 }
            r6 = 20
            if (r5 < r6) goto L_0x014e
            java.lang.String r5 = "display"
            java.lang.Object r5 = r13.getSystemService(r5)     // Catch:{ Exception -> 0x0164 }
            android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5     // Catch:{ Exception -> 0x0164 }
            android.view.Display r5 = r5.getDisplay(r2)     // Catch:{ Exception -> 0x0164 }
            if (r5 == 0) goto L_0x014e
            java.lang.Class<android.view.Display> r6 = android.view.Display.class
            java.lang.String r7 = "getState"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0164 }
            r1[r2] = r5     // Catch:{ Exception -> 0x0164 }
            java.lang.Object r1 = com.bytedance.common.utility.reflect.C9743c.m28722a(r6, r7, r1)     // Catch:{ Exception -> 0x0164 }
            boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0164 }
            if (r2 == 0) goto L_0x014e
            r4 = r1
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0164 }
        L_0x014e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0164 }
            r1.<init>()     // Catch:{ Exception -> 0x0164 }
            java.lang.String r0 = "interactive_state"
            r1.put(r0, r3)     // Catch:{ Exception -> 0x0165 }
            int r0 = r4.intValue()     // Catch:{ Exception -> 0x0165 }
            if (r0 < 0) goto L_0x0165
            java.lang.String r0 = "display_state"
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0165 }
            goto L_0x0165
        L_0x0164:
            r1 = r0
        L_0x0165:
            boolean r0 = m138245a(r13, r15, r14, r1)     // Catch:{ Exception -> 0x0177 }
            if (r0 == 0) goto L_0x016c
            return
        L_0x016c:
            com.bytedance.common.utility.collection.f r0 = f112892g     // Catch:{ Exception -> 0x0177 }
            com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$3 r1 = new com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$3     // Catch:{ Exception -> 0x0177 }
            r1.<init>(r15, r14, r13)     // Catch:{ Exception -> 0x0177 }
            r0.post(r1)     // Catch:{ Exception -> 0x0177 }
            return
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.awemepushlib.manager.MessageShowHandler.m138247b(android.content.Context, int, com.ss.android.ugc.awemepushlib.model.PushMsg):void");
    }

    /* renamed from: a */
    public static void m138237a(Context context, int i, PushMsg pushMsg) {
        if (!f112886a || C6319n.m19593a(pushMsg.imageUrl) || !C43590a.m138130b()) {
            m138240a(context, (Bitmap) null, (Bitmap) null, i, (Intent) null, pushMsg);
            return;
        }
        Bitmap[] bitmapArr = new Bitmap[1];
        Bitmap[] bitmapArr2 = new Bitmap[1];
        C43637e eVar = new C43637e(bitmapArr2, pushMsg, context, bitmapArr, i);
        C1592h a = C1592h.m7855a((Callable<TResult>) eVar, (Executor) C7258h.m22730c());
        C43638f fVar = new C43638f(context, bitmapArr2, bitmapArr, i, pushMsg);
        a.mo6876a((C1591g<TResult, TContinuationResult>) fVar, C1592h.f5958b);
    }

    /* renamed from: a */
    private static Intent m138230a(Context context, int i, PushMsg pushMsg, int i2) {
        Intent intent;
        try {
            intent = C43639a.m138283a(context, pushMsg);
            if (intent == null) {
                return null;
            }
            try {
                intent.addFlags(268435456);
                intent.putExtra("from_notification", true);
                intent.putExtra("msg_from", 1);
                intent.putExtra("msg_id", pushMsg.f112935id);
                intent.putExtra("message_from", i);
                if (!C6319n.m19593a(pushMsg.extra.toJsonString())) {
                    intent.putExtra("message_extra", pushMsg.extra.toJsonString());
                }
                intent.putExtra("imageType", pushMsg.imageType);
            } catch (Throwable unused) {
            }
            return intent;
        } catch (Throwable unused2) {
            intent = null;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m138233a(Bitmap[] bitmapArr, PushMsg pushMsg, Context context, Bitmap[] bitmapArr2, int i) throws Exception {
        String str;
        boolean z;
        PushMsg pushMsg2 = pushMsg;
        try {
            bitmapArr[0] = m138231a(pushMsg2.imageUrl);
            if (bitmapArr[0] == null) {
                bitmapArr[0] = m138231a(pushMsg2.imageUrl);
                C43592c a = C43592c.m138136a();
                String str2 = "retrySuccess";
                if (bitmapArr[0] != null) {
                    z = true;
                } else {
                    z = false;
                }
                Context context2 = context;
                C43603d.m138176a(context2, "push_image_retry", 0, 0, a.mo105522a(str2, Boolean.valueOf(z)).mo105525b());
            }
            if (!TextUtils.isEmpty(pushMsg2.extra.largeModeIconUrl)) {
                bitmapArr2[0] = m138231a(pushMsg2.extra.largeModeIconUrl);
            }
            String str3 = pushMsg2.title;
            String str4 = pushMsg2.text;
            String str5 = pushMsg2.imageUrl;
            Bitmap bitmap = bitmapArr[0];
            int i2 = pushMsg2.imageType;
            if (bitmapArr[0] == null) {
                str = "imageUrlbitmap==null";
            } else {
                str = "";
            }
            m138244a(str3, str4, str5, bitmap, i2, str);
        } catch (Exception e) {
            m138244a(pushMsg2.title, pushMsg2.text, pushMsg2.imageUrl, (Bitmap) null, pushMsg2.imageType, Log.getStackTraceString(e));
            m138240a(context, (Bitmap) null, (Bitmap) null, i, (Intent) null, pushMsg);
        }
        return null;
    }

    /* renamed from: a */
    public static void m138239a(Context context, int i, String str, int i2, String str2, boolean z) {
        m138238a(context, i, str, i2, str2);
    }
}
