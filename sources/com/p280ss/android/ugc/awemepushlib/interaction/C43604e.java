package com.p280ss.android.ugc.awemepushlib.interaction;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.C6322b;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.common.push.account.AuthenticatorService;
import com.bytedance.ies.common.push.account.C10725a.C10727a;
import com.bytedance.ies.common.push.p560a.C10723a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.aweme.ttsetting.C10969a;
import com.bytedance.ies.ugc.aweme.ttsetting.C10975b;
import com.bytedance.ies.ugc.statisticlogger.config.C10988b;
import com.bytedance.ies.ugc.statisticlogger.config.ConfigUpdateEvent;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.message.C19841i;
import com.p280ss.android.newmedia.redbadge.C19973b;
import com.p280ss.android.push.window.oppo.C20025c;
import com.p280ss.android.pushmanager.C20053c;
import com.p280ss.android.pushmanager.C20072e;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.client.C20070h;
import com.p280ss.android.pushmanager.client.MessageAppManager;
import com.p280ss.android.pushmanager.monitor.C20080a;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.p280ss.android.ugc.aweme.C21676bi;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.awemepushapi.AccountExperiment;
import com.p280ss.android.ugc.awemepushapi.C43587a;
import com.p280ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.p280ss.android.ugc.awemepushlib.manager.C43633a;
import com.p280ss.android.ugc.awemepushlib.p1712a.C43588a;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43590a;
import com.p280ss.android.ugc.awemepushlib.p1714di.C43593a;
import com.p280ss.android.ugc.awemepushlib.p1714di.C43594b;
import com.p280ss.android.ugc.awemepushlib.p1714di.C43596c;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.e */
public final class C43604e {

    /* renamed from: a */
    public static volatile int f112848a = 0;

    /* renamed from: b */
    private static String f112849b = "is_allow_oppo_push";

    /* renamed from: c */
    private static volatile boolean f112850c;

    /* renamed from: d */
    private static ExecutorService f112851d = C43625u.m138219a(1);

    /* renamed from: e */
    private static C43593a f112852e;

    /* renamed from: f */
    private static C43594b f112853f;

    /* renamed from: g */
    private static volatile int f112854g = 0;

    /* renamed from: h */
    private static Deque<Runnable> f112855h = new LinkedList();

    /* renamed from: a */
    static final /* synthetic */ void m138194a(boolean z) {
        int a = C43599a.m138162a();
        if (z) {
            a = 0;
        }
        new Handler(Looper.getMainLooper()).postDelayed(C43612h.f112861a, (long) a);
    }

    /* renamed from: a */
    public static void m138195a(boolean z, Context context) {
        C19841i.m65517a(context, 2);
        MessageAppManager.inst().initOnApplication(context, new C43596c(), C6776h.m20949c(context));
        if (z) {
            C20070h.m66075a();
            C20070h.m66080c(context, C43633a.m138259c().mo105554a(context));
            if (C6399b.m19945u()) {
                new C10727a(context).mo25628a().mo25627a();
            }
            if (VERSION.SDK_INT >= 24) {
                try {
                    C20090b.m66187a().mo53767c(false);
                } catch (Exception unused) {
                }
            }
            if (C7163a.m22363a()) {
                try {
                    MessageAppManager.inst().checkPushConfiguration("AwemePushConfig", C29960a.m98230a());
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m138193a(Runnable runnable) {
        f112851d.execute(new C43621q(runnable));
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m138196a(int i, int i2, int i3, int i4, int i5, Callback callback, Message message) {
        if (message == null) {
            return false;
        }
        if (C43590a.m138123a(i, message.what, message.obj)) {
            return true;
        }
        m138185a(i2, i3, i4, i5, message);
        if (callback == null) {
            return false;
        }
        return callback.handleMessage(message);
    }

    /* renamed from: d */
    private static C43593a m138204d() {
        if (f112852e == null) {
            f112852e = new C43593a();
        }
        return f112852e;
    }

    /* renamed from: e */
    private static C43594b m138206e() {
        if (f112853f == null) {
            f112853f = new C43594b();
        }
        return f112853f;
    }

    /* renamed from: a */
    public static void m138183a() {
        C20074g.m66105a((C20072e) m138204d());
        C20025c.m65969a(C6399b.m19921a(), m138206e());
    }

    /* renamed from: f */
    private static void m138207f() {
        if (C7163a.m22363a()) {
            MessageAppManager.inst().setMonitorEnable(!Debug.isDebuggerConnected());
        }
        MessageAppManager.inst().setMonitorImpl(new C20080a() {
            /* renamed from: a */
            public final void mo53717a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                C6379c.m19828a(str, jSONObject, jSONObject2, jSONObject3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m138208g() {
        if (!f112850c && f112854g != 0) {
            while (f112855h.size() > 0) {
                ((Runnable) f112855h.pop()).run();
            }
            f112850c = true;
        }
    }

    /* renamed from: h */
    private static void m138209h() {
        try {
            C6322b b = C6322b.m19609a(Class.forName("android.app.ActivityThread")).mo15160b("currentActivityThread");
            if (b != null) {
                Class cls = Class.forName("android.app.ActivityThread$H");
                C6322b a = C6322b.m19609a(Class.forName("android.app.ActivityThread$H"));
                int intValue = ((Integer) a.mo15161b("SCHEDULE_CRASH", new Class[0]).f18556a).intValue();
                int intValue2 = ((Integer) a.mo15161b("RECEIVER", new Class[0]).f18556a).intValue();
                int intValue3 = ((Integer) a.mo15161b("CREATE_SERVICE", new Class[0]).f18556a).intValue();
                int intValue4 = ((Integer) a.mo15161b("BIND_SERVICE", new Class[0]).f18556a).intValue();
                int intValue5 = ((Integer) a.mo15161b("SERVICE_ARGS", new Class[0]).f18556a).intValue();
                Handler handler = (Handler) b.mo15161b("mH", cls).f18556a;
                if (handler != null) {
                    C6322b a2 = C6322b.m19610a((Object) handler);
                    C43623s sVar = new C43623s(intValue, intValue2, intValue3, intValue4, intValue5, (Callback) a2.mo15161b("mCallback", Callback.class).f18556a);
                    a2.mo15157a("mCallback", (Object) sVar);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m138198b(Activity activity) {
        C19841i.m65522d(activity);
        if (f112848a == 0) {
            C19973b.m65837a((Context) activity).mo53466c();
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m138199b(Context context) {
        C43633a.m138259c().mo105560e(context);
        C21676bi.m72552a();
    }

    /* renamed from: d */
    static final /* synthetic */ void m138205d(Activity activity) {
        if (f112848a == 0) {
            C19973b.m65837a((Context) activity).mo53464b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m138184a(int i) {
        f112854g = i;
        switch (i) {
            case 2:
            case 3:
                f112851d.execute(C43622r.f112871a);
                break;
            case 4:
                m138208g();
                return;
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m138200b(Runnable runnable) {
        if (f112850c) {
            runnable.run();
        } else {
            f112855h.add(runnable);
        }
    }

    /* renamed from: c */
    private static void m138203c(Context context) {
        AccountManager accountManager = AccountManager.get(context);
        String packageName = context.getPackageName();
        String string = context.getString(context.getApplicationInfo().labelRes);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(packageName)) {
            try {
                accountManager.removeAccount(new Account(string, packageName), null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m138190a(Context context, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, AuthenticatorService.class);
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (C6384b.m19835a().mo15287a(AccountExperiment.class, false, "account_service_type", C6384b.m19835a().mo15295d().account_service_type, 3) == 1) {
            m138203c(context);
            return;
        }
        if (C6384b.m19835a().mo15287a(AccountExperiment.class, false, "account_service_type", C6384b.m19835a().mo15295d().account_service_type, 3) == 2) {
            if (z) {
                if (componentEnabledSetting != 1) {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                }
                new C10727a(context).mo25628a().mo25627a();
            }
        } else if (C6384b.m19835a().mo15287a(AccountExperiment.class, false, "account_service_type", C6384b.m19835a().mo15295d().account_service_type, 3) != 3) {
            if (componentEnabledSetting != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
            new C10727a(context).mo25628a().mo25627a();
        } else if (z) {
            if (componentEnabledSetting != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
            new C10727a(context).mo25628a().mo25627a();
        } else {
            m138203c(context);
        }
    }

    /* renamed from: a */
    public static void m138191a(Context context, boolean z, C43587a aVar) {
        m138192a(context, z, aVar, false);
    }

    /* renamed from: a */
    public static void m138192a(final Context context, final boolean z, C43587a aVar, boolean z2) {
        f112855h.addFirst(new Runnable() {
            public final void run() {
                try {
                    C43604e.m138195a(z, context);
                } catch (Throwable th) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("location", "constructInitPush");
                        jSONObject.put("errorDesc", th.getMessage());
                        C43603d.m138181a("aweme_nofatal_track", jSONObject);
                    } catch (JSONException unused) {
                    }
                    if (C7163a.m22363a()) {
                        throw th;
                    }
                }
            }
        });
        if (C6399b.m19944t()) {
            MessageAppManager.inst().setDefaultChannelName(false, "");
            MessageAppManager.inst().setIExtraMessageDepend(new C20053c() {
                /* renamed from: a */
                public final String mo53676a() {
                    return "payload";
                }

                /* renamed from: c */
                public final String mo53677c() {
                    return "http://api.hypstar.com";
                }
            });
        }
        C43600b.m138164a(aVar);
        C20074g.m66105a((C20072e) m138204d());
        C10723a.f28666a.f28667b = new C43588a();
        MessageAppManager.inst().initPushSetting(context);
        MessageAppManager.inst().setDebuggable(false);
        if (z) {
            C20070h.m66075a();
            C20070h.m66077a(context, true);
            C43633a.m138259c().mo105559d(context);
            C20025c.m65969a(C6399b.m19921a(), m138206e());
            C43633a.m138259c().mo105549a(C6887b.m21436b().mo16909b(context, f112849b, true));
            AwemeRedBadgerManager.m138220a().mo105542b();
            C6405d.m19974b().mo19325f(C43610f.f112859a);
            C6405d.m19976c().mo19325f(C43611g.f112860a);
            C6405d.m19983f().mo19325f(C43616l.f112865a);
            C10969a.m32155a((C10975b) new C10975b() {
                /* renamed from: a */
                public final void mo26469a(Throwable th) {
                }

                /* renamed from: a */
                public final void mo26470a(JSONObject jSONObject) {
                    C43604e.m138193a((Runnable) new C43624t(jSONObject, context));
                }

                /* renamed from: a */
                static final /* synthetic */ void m138212a(JSONObject jSONObject, Context context) {
                    C21676bi.m72553a(jSONObject);
                    C43633a.m138259c().mo105561f(context);
                    C43633a.m138259c();
                    C43633a.m138253a(context, jSONObject);
                }
            });
            C10988b.m32200a().mo19291a((C7328l<? super T>) new C7328l<ConfigUpdateEvent>() {
                /* renamed from: a */
                private static boolean m138215a(ConfigUpdateEvent configUpdateEvent) throws Exception {
                    return ConfigUpdateEvent.Local.equals(configUpdateEvent);
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) throws Exception {
                    return m138215a((ConfigUpdateEvent) obj);
                }
            }).mo19325f((C7326g<? super T>) new C43617m<Object>(context));
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).addLoginOrLogoutListener(new C43618n(context));
            m138193a((Runnable) new C43619o(context));
            m138207f();
        }
        m138209h();
        if (z) {
            f112851d.execute(new C43620p(z2));
        } else {
            m138184a(4);
        }
    }

    /* renamed from: a */
    private static void m138185a(int i, int i2, int i3, int i4, Message message) {
        if (!f112850c && message != null) {
            int i5 = message.what;
            if (i5 == i || i5 == i2 || i5 == i4 || i5 == i3) {
                try {
                    String message2 = message.toString();
                    if (message2.contains("com.xiaomi") || message2.contains("com.taobao") || message2.contains("org.android.agoo") || message2.contains("com.aliyun") || message2.contains("com.alibaba") || message2.contains("com.umeng.message") || message2.contains("com.huawei") || message2.contains("com.coloros.mcssdk") || message2.contains("com.meizu") || message2.contains("com.vivo") || message2.contains("com.ss.android.newmedia.message") || message2.contains("com.amazon") || message2.contains("com.fcm") || message2.contains("com.adm")) {
                        m138184a(3);
                    }
                } catch (Exception unused) {
                    m138184a(3);
                }
            }
        }
    }
}
