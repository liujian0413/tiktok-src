package com.bytedance.polaris.browser.p635a.p636a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p480a.C9700a;
import com.bytedance.p066a.p067a.p068a.C2062a;
import com.bytedance.p066a.p067a.p068a.p069a.C2063a;
import com.bytedance.p066a.p067a.p068a.p069a.C2064b;
import com.bytedance.p066a.p067a.p068a.p069a.C2065c;
import com.bytedance.p066a.p067a.p068a.p069a.C2066d;
import com.bytedance.polaris.base.C12375a;
import com.bytedance.polaris.base.C12377c;
import com.bytedance.polaris.browser.PolarisBrowserActivity;
import com.bytedance.polaris.browser.p635a.C12408b;
import com.bytedance.polaris.browser.p635a.C12409c;
import com.bytedance.polaris.depend.C12422c;
import com.bytedance.polaris.depend.C12424e;
import com.bytedance.polaris.depend.C12426g;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12342c;
import com.bytedance.polaris.p634b.C12349f;
import com.bytedance.polaris.p634b.C12352g;
import com.bytedance.polaris.p634b.C12362m;
import com.bytedance.polaris.p634b.C12363n;
import com.bytedance.polaris.p634b.C12365p;
import com.bytedance.polaris.p634b.C12370u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.c */
public final class C12396c implements C6310a {

    /* renamed from: a */
    public boolean f32920a;

    /* renamed from: b */
    C2062a f32921b = new C2062a();

    /* renamed from: c */
    private final Map<String, C12408b> f32922c = new HashMap();

    /* renamed from: d */
    private final C12397a f32923d;

    /* renamed from: e */
    private WeakReference<Activity> f32924e;

    /* renamed from: f */
    private Handler f32925f = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: com.bytedance.polaris.browser.a.a.c$a */
    public interface C12397a {
        /* renamed from: a */
        void mo30296a(String str, JSONObject jSONObject);

        /* renamed from: b */
        void mo30297b(String str, JSONObject jSONObject);
    }

    @C2063a(mo7716a = "openTreasureBox")
    public final void openTreasureBox() {
    }

    @C2063a(mo7716a = "signIn")
    public final void signIn() {
    }

    /* renamed from: a */
    public final void mo30263a() {
        this.f32921b.mo7715b(this);
    }

    /* renamed from: d */
    private Activity m36043d() {
        if (this.f32924e != null) {
            return (Activity) this.f32924e.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo30269b() {
        for (C12408b bVar : this.f32922c.values()) {
            if (bVar != null) {
                try {
                    bVar.mo30261b();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo30271c() {
        for (C12408b bVar : this.f32922c.values()) {
            if (bVar != null) {
                try {
                    bVar.mo30259a();
                } catch (Exception unused) {
                }
            }
        }
    }

    @C2063a(mo7716a = "open_notifi_setting")
    public final void openNotificationSetting() {
        Activity activity;
        if (this.f32924e != null) {
            activity = (Activity) this.f32924e.get();
        } else {
            activity = null;
        }
        if (activity != null) {
            C12362m.m35901b(activity.getApplicationContext());
        }
    }

    @C2063a(mo7716a = "taskSetting")
    public final void openSetting() {
        C12365p.onEventV3("task_setting_click");
        if (this.f32924e != null) {
            this.f32924e.get();
        }
        C12428i.m36155e();
    }

    @C2063a(mo7716a = "start_red_packet_activity")
    public final void startRedPacketActivity() {
        Activity m = C12428i.m36163m();
        if (m != null && !m.isFinishing() && VERSION.SDK_INT >= 17 && !m.isDestroyed()) {
        }
    }

    @C2063a(mo7716a = "close")
    private void closePage() {
        Activity activity;
        try {
            if (this.f32924e != null) {
                activity = (Activity) this.f32924e.get();
            } else {
                activity = null;
            }
            if (activity != null && (activity instanceof Activity)) {
                Activity activity2 = activity;
                if (m36042a(activity2)) {
                    boolean z = false;
                    if (VERSION.SDK_INT >= 17) {
                        z = activity2.isDestroyed();
                    }
                    if (!activity2.isFinishing() && !z) {
                        activity2.finish();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @C2063a(mo7716a = "open_system_permission_setting")
    private void openSystemPermissionSettings() {
        try {
            if (C12363n.m35908a(C12428i.m36153c())) {
                C12398d.m36053a(Toast.makeText(C12428i.m36153c(), R.string.d2w, 1));
            } else {
                C12398d.m36053a(Toast.makeText(C12428i.m36153c(), R.string.d2b, 1));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static boolean m36042a(Context context) {
        return context instanceof PolarisBrowserActivity;
    }

    @C2063a(mo7716a = "update_task_list")
    public final void updateTaskList(@C2066d(mo7718a = "data") JSONObject jSONObject) {
        C12424e i = C12428i.m36159i();
        if (i != null) {
            i.mo30321a(jSONObject);
        }
    }

    @C2063a(mo7716a = "checkClipboard")
    public final boolean checkClipboard(@C2065c JSONObject jSONObject) {
        Activity activity;
        if (this.f32924e != null) {
            activity = (Activity) this.f32924e.get();
        } else {
            activity = null;
        }
        String str = "";
        if (this.f32924e != null) {
            str = C12342c.m35842a(activity);
        }
        try {
            jSONObject.put("text", str);
        } catch (Exception unused) {
        }
        return true;
    }

    @C2063a(mo7716a = "getVersion")
    public final boolean getPolarisVersion(@C2065c JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        try {
            jSONObject.put("polaris_version", "tt_2.0.0.59");
            jSONObject.put("polaris_version_code", 201);
            jSONObject.put("host_version", C12428i.m36159i().mo30312a());
        } catch (Exception unused) {
        }
        return true;
    }

    @C2063a(mo7716a = "get_status_bar_height")
    public final boolean getStatusBarHeight(@C2065c JSONObject jSONObject) {
        try {
            jSONObject.put("height", C12352g.m35876a((Context) C12428i.m36153c(), false));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 14 && (message.obj instanceof JSONObject)) {
            m36041a(String.valueOf(message.arg2), message.arg1, (JSONObject) message.obj);
        }
    }

    @C2063a(mo7716a = "scanQrcode")
    public final void openScan(@C2064b String str) {
        try {
            C12428i.m36155e();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_plugin_install", 0);
            m36041a(str, 0, jSONObject);
        } catch (Exception unused) {
        }
    }

    @C2063a(mo7716a = "openThirdPage")
    public final void openThirdPage(@C2066d(mo7718a = "url") String str) {
        Activity activity;
        if (!C6319n.m19593a(str)) {
            if (this.f32924e == null) {
                activity = null;
            } else {
                activity = (Activity) this.f32924e.get();
            }
            C12422c e = C12428i.m36155e();
            if (e != null) {
                e.mo30310a((Context) activity, str);
            }
        }
    }

    @C2063a(mo7716a = "appCommonParams")
    public final boolean addCommonParams(@C2065c JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        HashMap hashMap = new HashMap();
        C12370u.m35934a((Map<String, String>) hashMap, false);
        try {
            for (Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return true;
    }

    @C2063a(mo7716a = "feedbackVideo")
    public final void feedbackVideo(@C2066d(mo7718a = "group_id") String str) {
        Activity activity;
        C12422c e = C12428i.m36155e();
        if (this.f32924e == null) {
            activity = null;
        } else {
            activity = (Activity) this.f32924e.get();
        }
        if (e != null && activity != null) {
            StringBuilder sb = new StringBuilder("sslocal://detail?groupid=");
            sb.append(str);
            e.mo30310a((Context) activity, sb.toString());
        }
    }

    @C2063a(mo7716a = "is_notifi_enabled")
    public final boolean isNotificationEnabled(@C2065c JSONObject jSONObject) {
        Activity activity;
        try {
            if (this.f32924e != null) {
                activity = (Activity) this.f32924e.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                jSONObject.put("is_notifi_enabled", C12362m.m35899a(activity.getApplicationContext()));
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @C2063a(mo7716a = "feedback")
    public final void openFeedback(@C2066d(mo7718a = "question_id") String str) {
        Context context;
        int i;
        C12422c e = C12428i.m36155e();
        if (this.f32924e == null) {
            context = null;
        } else {
            context = (Activity) this.f32924e.get();
        }
        if (context == null) {
            context = C12428i.m36153c();
        }
        if (e != null) {
            try {
                i = Integer.parseInt(str);
            } catch (Exception unused) {
                i = -1;
            }
            e.mo30308a(context, i);
        }
    }

    @C2063a(mo7716a = "openPage")
    public final void openPolarisPage(@C2066d(mo7718a = "url") String str) {
        Activity activity;
        if (!C6319n.m19593a(str)) {
            if (this.f32924e == null) {
                activity = null;
            } else {
                activity = (Activity) this.f32924e.get();
            }
            if (C12428i.m36150a(str)) {
                C12428i.m36144a(activity, str, true, false);
                return;
            }
            C12422c e = C12428i.m36155e();
            if (e != null) {
                e.mo30310a((Context) activity, str);
            }
        }
    }

    @C2063a(mo7716a = "pre_load_image_urls")
    public final void preloadImageUrls(@C2066d(mo7718a = "image_urls") JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() >= 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    C12349f.m35867a().mo30187a((List<String>) arrayList);
                }
            } catch (JSONException unused) {
            }
        }
    }

    @C2063a(mo7716a = "statusBar")
    public final boolean changeStatusBarColor(@C2066d(mo7718a = "color") String str) {
        try {
            Activity m = C12428i.m36163m();
            if (m == null) {
                m = (Activity) this.f32924e.get();
            }
            if (m == null || m.isFinishing()) {
                return false;
            }
            if (VERSION.SDK_INT >= 17 && m.isDestroyed()) {
                return false;
            }
            if (!(m instanceof PolarisBrowserActivity) && !C12428i.m36164n()) {
                return false;
            }
            if ("white".equals(str)) {
                C12352g.m35878a(m.getWindow(), false);
            } else if ("black".equals(str)) {
                C12352g.m35878a(m.getWindow(), true);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo30264a(String str, C12408b bVar) {
        if (!C6319n.m19593a(str) && bVar != null) {
            this.f32922c.put(str, bVar);
        }
    }

    /* renamed from: b */
    public final void mo30270b(String str, JSONObject jSONObject) {
        if (this.f32923d != null) {
            this.f32923d.mo30297b(str, jSONObject);
        }
    }

    @C2063a(mo7716a = "awardToast")
    public final void awardToast(@C2066d(mo7718a = "text") String str, @C2066d(mo7718a = "show_short") boolean z) {
        Activity activity;
        if (this.f32924e != null) {
            activity = (Activity) this.f32924e.get();
        } else {
            activity = null;
        }
        if (!TextUtils.isEmpty(str) && activity != null) {
            C12428i.m36155e();
        }
    }

    @C2063a(mo7716a = "copyToClipboard")
    public final boolean copyToClipboard(@C2066d(mo7718a = "content") String str, @C2065c JSONObject jSONObject) {
        int i;
        Activity d = m36043d();
        if (d == null || C6319n.m19593a(str)) {
            i = 0;
        } else {
            C9700a.m28636a(d, "", str);
            i = 1;
        }
        try {
            jSONObject.put("code", i);
        } catch (JSONException unused) {
        }
        return true;
    }

    @C2063a(mo7716a = "get_ab_setting")
    public final boolean getABSetting(@C2066d(mo7718a = "ab_setting_key") String str, @C2065c JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            JSONObject jSONObject2 = C12377c.m35961a().f32839a;
            if (jSONObject2 == null) {
                return true;
            }
            Object opt = jSONObject2.opt(str);
            if (opt != null) {
                jSONObject.put(str, opt);
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo30265a(String str, JSONObject jSONObject) {
        if (this.f32923d != null) {
            this.f32923d.mo30296a(str, jSONObject);
        }
    }

    @C2063a(mo7716a = "page_state_change")
    public final void pageStateChange(@C2066d(mo7718a = "type") String str, @C2066d(mo7718a = "status") int i) {
        if (!TextUtils.isEmpty(str)) {
            char c = 65535;
            if (str.hashCode() == 1508898352 && str.equals("task_action")) {
                c = 0;
            }
            if (c == 0 && i == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", "1");
                    jSONObject.put("from_tab", this.f32920a);
                    mo30270b("visible", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    @C2063a(mo7716a = "toast")
    public final void toast(@C2066d(mo7718a = "text") String str, @C2066d(mo7718a = "icon_type") String str2) {
        int i;
        Activity d = m36043d();
        if (d != null) {
            try {
                if (!C6319n.m19593a(str)) {
                    if (!C6319n.m19593a(str2)) {
                        if ("icon_success".equals(str2)) {
                            i = R.drawable.bdc;
                        } else {
                            i = R.drawable.bdb;
                        }
                        C12428i.m36159i().mo30316a(d, str, d.getResources().getDrawable(i));
                        return;
                    }
                    C12428i.m36159i().mo30316a(d, str, (Drawable) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo30266a(C12409c cVar, JSONObject jSONObject) {
        boolean z = false;
        if (cVar == null) {
            return false;
        }
        if (!this.f32922c.keySet().contains(cVar.f32953c)) {
            z = this.f32921b.mo7714a(cVar.f32953c, cVar.f32954d, cVar.f32952b, jSONObject);
        } else {
            C12408b bVar = (C12408b) this.f32922c.get(cVar.f32953c);
            if (bVar != null) {
                z = bVar.mo30260a(cVar, jSONObject);
            }
        }
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.put(r4, java.lang.Integer.valueOf(0));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0042 */
    @com.bytedance.p066a.p067a.p068a.p069a.C2063a(mo7716a = "check_apps_installed")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkAppsInstalled(@com.bytedance.p066a.p067a.p068a.p069a.C2066d(mo7718a = "pkg_list") org.json.JSONArray r7, @com.bytedance.p066a.p067a.p068a.p069a.C2064b java.lang.String r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x005a
            int r1 = r7.length()     // Catch:{ Throwable -> 0x005f }
            if (r1 > 0) goto L_0x000a
            goto L_0x005a
        L_0x000a:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x005f }
            r1.<init>()     // Catch:{ Throwable -> 0x005f }
            android.app.Application r2 = com.bytedance.polaris.depend.C12428i.m36153c()     // Catch:{ Throwable -> 0x005f }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Throwable -> 0x005f }
            r3 = 0
        L_0x0018:
            int r4 = r7.length()     // Catch:{ Throwable -> 0x005f }
            if (r3 >= r4) goto L_0x004c
            java.lang.String r4 = r7.getString(r3)     // Catch:{ Throwable -> 0x0049 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0049 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0049
        L_0x0029:
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            android.content.pm.PackageInfo r5 = r2.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0042 }
            if (r5 == 0) goto L_0x003a
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NameNotFoundException -> 0x0042 }
            r1.put(r4, r5)     // Catch:{ NameNotFoundException -> 0x0042 }
            goto L_0x0049
        L_0x003a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0042 }
            r1.put(r4, r5)     // Catch:{ NameNotFoundException -> 0x0042 }
            goto L_0x0049
        L_0x0042:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0049 }
            r1.put(r4, r5)     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x004c:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x005f }
            r7.<init>(r1)     // Catch:{ Throwable -> 0x005f }
            java.lang.String r1 = "code"
            r7.put(r1, r0)     // Catch:{ Throwable -> 0x005f }
            r6.mo30265a(r8, r7)     // Catch:{ Throwable -> 0x005f }
            return
        L_0x005a:
            r7 = 0
            r6.m36041a(r8, r0, r7)     // Catch:{ Throwable -> 0x005f }
            return
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.p635a.p636a.C12396c.checkAppsInstalled(org.json.JSONArray, java.lang.String):void");
    }

    /* renamed from: a */
    private void m36041a(String str, int i, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", i);
                if (jSONObject != null) {
                    jSONObject2.put("data", jSONObject);
                }
            } catch (JSONException unused) {
            }
            mo30265a(str, jSONObject2);
        }
    }

    public C12396c(Activity activity, C12375a aVar, C12397a aVar2) {
        this.f32924e = new WeakReference<>(activity);
        this.f32923d = aVar2;
        mo30264a("send_sms", (C12408b) new C12400f(this.f32924e));
        C12394b bVar = new C12394b(this.f32924e, this);
        mo30264a("login", (C12408b) bVar);
        mo30264a("is_login", (C12408b) bVar);
        mo30264a("internal_visible", (C12408b) new C12407j(this.f32924e, this));
        mo30264a("share", (C12408b) new C12402h(this.f32924e, aVar, this));
        mo30264a("shareImage", (C12408b) new C12390a(this.f32924e, aVar, this));
        this.f32921b.mo7713a(this);
    }

    @C2063a(mo7716a = "safeHttpRequest")
    public final void safeHttpRequest(@C2066d(mo7718a = "method") String str, @C2066d(mo7718a = "url") String str2, @C2066d(mo7718a = "params") String str3, @C2066d(mo7718a = "body_content_type") String str4, @C2064b String str5) {
        C12399e eVar = new C12399e(this.f32925f, this.f32924e, str2, str, str3, str4, str5);
        eVar.start();
    }

    @C2063a(mo7716a = "unite_share")
    public final void uniteShare(@C2066d(mo7718a = "platform") String str, @C2066d(mo7718a = "channel") String str2, @C2066d(mo7718a = "text") String str3, @C2066d(mo7718a = "title") String str4, @C2066d(mo7718a = "description") String str5, @C2066d(mo7718a = "url") String str6, @C2066d(mo7718a = "extra") JSONObject jSONObject, @C2066d(mo7718a = "image") String str7, @C2064b String str8) {
        String str9 = str8;
        try {
            C12426g g = C12428i.m36157g();
            if (g == null) {
                m36041a(str9, 0, null);
                return;
            }
            g.mo30330a((Activity) this.f32924e.get(), str, str2, str3, str4, str5, str6, jSONObject, str7);
            m36041a(str9, 1, null);
        } catch (Throwable unused) {
        }
    }
}
