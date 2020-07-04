package com.p280ss.android.pushmanager.client;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9708b;
import com.bytedance.p530h.p531a.C10279a;
import com.p280ss.android.message.C19809a;
import com.p280ss.android.message.C19842j;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.pushmanager.C20053c;
import com.p280ss.android.pushmanager.C20071d;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.C20076i;
import com.p280ss.android.pushmanager.C20077j;
import com.p280ss.android.pushmanager.C20078k;
import com.p280ss.android.pushmanager.IMessageAppAdapter;
import com.p280ss.android.pushmanager.monitor.C20080a;
import com.p280ss.android.pushmanager.monitor.C20081b;
import com.p280ss.android.pushmanager.monitor.C20083c;
import com.p280ss.android.pushmanager.monitor.C20084d;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.p280ss.android.pushmanager.thirdparty.PushDependAdapter;
import com.p280ss.android.pushmanager.thirdparty.PushManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.client.MessageAppManager */
public class MessageAppManager implements IMessageAppAdapter {
    private static volatile MessageAppManager sMessageAppManager;
    private volatile AtomicBoolean hasRegisteredWithLastChannels = new AtomicBoolean(false);
    private volatile AtomicBoolean isRequestingUpdateSender = new AtomicBoolean(false);
    private String mChannelName;
    private boolean mEnableCreateChannel = true;
    public Handler mHandler = new Handler(Looper.getMainLooper());
    private Map<Integer, Boolean> mPushRegistedMap = new HashMap();

    private void pushDependAdapterInject() {
        try {
            PushDependAdapter.inJect();
        } catch (Throwable unused) {
        }
    }

    public Context getContext() {
        return C19809a.m65408a();
    }

    public static MessageAppManager inst() {
        if (sMessageAppManager == null) {
            synchronized (MessageAppManager.class) {
                if (sMessageAppManager == null) {
                    sMessageAppManager = new MessageAppManager();
                }
            }
        }
        return sMessageAppManager;
    }

    private MessageAppManager() {
    }

    public void setDebuggable(boolean z) {
        C10279a.m30442a(z);
    }

    public void setIExtraMessageDepend(C20053c cVar) {
        C20074g.m66104a(cVar);
    }

    public void setMonitorEnable(boolean z) {
        C20083c.m66138a(z);
    }

    public void setMonitorImpl(C20080a aVar) {
        C20083c.m66135a(aVar);
    }

    public void synNotifySwitchStatus(Context context) {
        C20065f.m66067a(context);
    }

    public void initPushSetting(Context context) {
        C19809a.m65409a((Application) context.getApplicationContext());
    }

    public void registerAliPushOnChannelProcess(Context context) {
        int t = C20090b.m66187a().mo53793t();
        if (t >= 0) {
            registerPush(context, t);
        }
    }

    /* access modifiers changed from: 0000 */
    public void registerSelfPush(Context context) {
        if (context != null) {
            C19842j.m65524a().mo53195a(context);
        }
    }

    private boolean registerAliPush(Context context) {
        int i = 6;
        boolean z = false;
        try {
            if (C20076i.m66116a(6)) {
                z = tryConfigPush(context, 6);
            } else {
                i = -1;
            }
            C20090b.m66187a().mo53756a(i);
        } catch (Throwable unused) {
        }
        return z;
    }

    private void registerAliPushObserver(final Context context) {
        try {
            context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(context, "ali_push_type", "integer"), true, new ContentObserver(this.mHandler) {
                public final void onChange(boolean z) {
                    MessageAppManager.this.registerAliPushOnChannelProcess(context);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public String handleMySelfPushIntent(Intent intent) {
        if (intent != null && "com.ss.android.message".equals(intent.getAction())) {
            return intent.getStringExtra("message_data");
        }
        return null;
    }

    public void tryRegisterWithLastValidChannels(Context context) {
        if (this.hasRegisteredWithLastChannels.compareAndSet(false, true)) {
            tryRegistAllSelectedPush(context, C20090b.m66187a().mo53791q(), false);
        }
    }

    private boolean saveSsids(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = (String) map.get(C20077j.f54293a);
            String str2 = (String) map.get(C20077j.f54294b);
            if (!C6319n.m19593a((String) map.get(C20077j.f54297e)) && !C6319n.m19593a(str) && !C6319n.m19593a(str2)) {
                C20090b.m66187a();
                C20090b.m66188a(map);
                return true;
            }
        }
        return false;
    }

    private void trySendPushDaemonMonitor(Context context) {
        try {
            String j = C20090b.m66187a().mo53784j();
            if (!C6319n.m19593a(j)) {
                C20074g.m66102a();
                new JSONObject(j);
                C20090b.m66187a().mo53770d("");
            }
        } catch (Throwable unused) {
        }
    }

    public void unRegisterAllThirdPush(Context context) {
        unregisterPush(context, 1);
        unregisterPush(context, 7);
        unregisterPush(context, 8);
        unregisterPush(context, 6);
        unregisterPush(context, 10);
        unregisterPush(context, 11);
        unregisterPush(context, 5);
        unregisterPush(context, 14);
        this.mPushRegistedMap.clear();
    }

    /* access modifiers changed from: 0000 */
    public boolean registerAllThirdPush(Context context) {
        boolean registerAliPush = registerAliPush(context);
        if (C20090b.m66187a().mo53768c()) {
            return registerAliPush | tryConfigPush(context, 1) | tryConfigPush(context, 7) | tryConfigPush(context, 8) | tryConfigPush(context, 10) | tryConfigPush(context, 5) | registerPush(context, 11) | tryConfigPush(context, 14);
        }
        unRegisterAllThirdPush(context);
        return registerAliPush;
    }

    public void getSSIDs(Context context, Map<String, String> map) {
        C20090b.m66187a();
        C20090b.m66189b(map);
    }

    public void initOnApplication(Context context, C20071d dVar) {
        initOnApplication(context, dVar, null);
    }

    public void setDefaultChannelName(boolean z, String str) {
        this.mEnableCreateChannel = z;
        this.mChannelName = str;
    }

    private boolean isPushAvailable(Context context, int i) {
        if (context == null) {
            return false;
        }
        return PushManager.inst().isPushAvailable(context, i);
    }

    public boolean checkPushConfiguration(String str, Context context) {
        return PushManager.inst().checkThirdPushConfig(str, context);
    }

    public synchronized void handleAppLogUpdate(Context context, Map<String, String> map) {
        handleAppLogUpdate(context, map, false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        com.p280ss.android.message.p885a.C19813b.m65416a(r3.mo53700a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createMessageData(android.content.Context r2, com.p280ss.android.pushmanager.C20071d r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x001e
            if (r2 != 0) goto L_0x0005
            goto L_0x001e
        L_0x0005:
            com.ss.android.pushmanager.app.d r0 = new com.ss.android.pushmanager.app.d     // Catch:{ Exception -> 0x0015 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0015 }
            com.p280ss.android.pushmanager.app.C20047d.m66019a(r0)     // Catch:{ Exception -> 0x0015 }
            com.ss.android.pushmanager.app.d r0 = com.p280ss.android.pushmanager.app.C20047d.m66018a()     // Catch:{ Exception -> 0x0015 }
            r0.mo53663a(r2)     // Catch:{ Exception -> 0x0015 }
            return
        L_0x0015:
            android.content.Context r2 = r3.mo53700a()     // Catch:{ Throwable -> 0x001d }
            com.p280ss.android.message.p885a.C19813b.m65416a(r2)     // Catch:{ Throwable -> 0x001d }
            return
        L_0x001d:
            return
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.client.MessageAppManager.createMessageData(android.content.Context, com.ss.android.pushmanager.d):void");
    }

    private boolean registerPush(Context context, int i) {
        if (!C20076i.m66116a(i) || context == null) {
            return false;
        }
        PushManager.inst().registerPush(context, i);
        return true;
    }

    private void unregisterPush(Context context, int i) {
        if (i == 8 && !C19826j.m65469a()) {
            return;
        }
        if ((i != 7 || C9708b.m28646a()) && context != null) {
            PushManager.inst().unregisterPush(context.getApplicationContext(), i);
        }
    }

    private boolean tryConfigPush(Context context, int i) {
        if (context == null || C20090b.m66187a().mo53788n()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (!C20076i.m66116a(i) || !isPushAvailable(applicationContext, i)) {
            unregisterPush(applicationContext.getApplicationContext(), i);
            this.mPushRegistedMap.put(Integer.valueOf(i), Boolean.valueOf(false));
            return false;
        } else if (this.mPushRegistedMap.containsKey(Integer.valueOf(i)) && ((Boolean) this.mPushRegistedMap.get(Integer.valueOf(i))).booleanValue()) {
            return true;
        } else {
            this.mPushRegistedMap.put(Integer.valueOf(i), Boolean.valueOf(true));
            return registerPush(applicationContext, i);
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        if (context != null) {
            PushManager.inst().trackPush(context.getApplicationContext(), i, obj);
        }
    }

    public void initOnApplication(final Context context, C20071d dVar, String str) {
        C19809a.m65409a((Application) context.getApplicationContext());
        if (!C6319n.m19593a(str)) {
            C19826j.m65468a(str);
        } else {
            str = C20060b.m66050a(context);
        }
        createMessageData(context, dVar);
        pushDependAdapterInject();
        C20078k.m66122b().mo53185a(context, dVar);
        if (str.endsWith(":pushservice")) {
            registerAliPushOnChannelProcess(context);
            registerAliPushObserver(context);
        }
        if (C19826j.m65474c(context)) {
            this.mHandler.postDelayed(new Runnable() {
                public final void run() {
                    C20090b.m66187a();
                    C20065f.m66067a(context);
                }
            }, TimeUnit.SECONDS.toMillis(15));
            if (this.mEnableCreateChannel) {
                C20065f.m66068a(context, this.mChannelName);
            }
        }
        C20081b.m66129a();
    }

    public void tryRegistAllSelectedPush(final Context context, String str, boolean z) {
        boolean z2;
        C20090b.m66187a();
        boolean a = C20076i.m66114a(context).mo53716a(str);
        boolean z3 = false;
        if (z && !a) {
            str = C20090b.m66187a().mo53791q();
            if (!C20076i.m66114a(context).mo53716a(str)) {
                C20084d.m66148a(false, str);
                return;
            }
        }
        if (!z || !a) {
            z2 = false;
        } else {
            z2 = true;
        }
        C20076i.m66115a(str, z2);
        boolean registerAllThirdPush = registerAllThirdPush(context);
        registerSelfPush(context);
        trySendPushDaemonMonitor(context);
        this.mHandler.post(new Runnable() {
            public final void run() {
                C20064e.m66062a(context);
            }
        });
        if (registerAllThirdPush || C20090b.m66187a().mo53789o()) {
            z3 = true;
        }
        C20084d.m66148a(z3, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleAppLogUpdate(final android.content.Context r8, java.util.Map<java.lang.String, java.lang.String> r9, boolean r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.saveSsids(r9)     // Catch:{ all -> 0x0097 }
            com.ss.android.pushmanager.k r1 = com.p280ss.android.pushmanager.C20078k.m66122b()     // Catch:{ all -> 0x0097 }
            r1.mo53186a(r8, r9)     // Catch:{ all -> 0x0097 }
            com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0014
            com.p280ss.android.pushmanager.monitor.C20081b.m66132b()     // Catch:{ all -> 0x0097 }
        L_0x0014:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0097 }
            com.ss.android.pushmanager.setting.b r9 = com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ all -> 0x0097 }
            long r3 = r9.mo53798y()     // Catch:{ all -> 0x0097 }
            r9 = 0
            long r1 = r1 - r3
            com.ss.android.pushmanager.setting.b r9 = com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ all -> 0x0097 }
            int r9 = r9.mo53799z()     // Catch:{ all -> 0x0097 }
            long r3 = (long) r9     // Catch:{ all -> 0x0097 }
            r9 = 0
            r5 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0033
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            if (r1 == 0) goto L_0x003a
        L_0x0038:
            if (r10 == 0) goto L_0x003c
        L_0x003a:
            r10 = 1
            goto L_0x003d
        L_0x003c:
            r10 = 0
        L_0x003d:
            if (r10 == 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicBoolean r10 = r7.isRequestingUpdateSender     // Catch:{ all -> 0x0097 }
            boolean r10 = r10.compareAndSet(r9, r5)     // Catch:{ all -> 0x0097 }
            if (r10 == 0) goto L_0x0051
            com.ss.android.pushmanager.client.MessageAppManager$2 r9 = new com.ss.android.pushmanager.client.MessageAppManager$2     // Catch:{ all -> 0x0097 }
            r9.<init>(r8)     // Catch:{ all -> 0x0097 }
            com.bytedance.common.utility.p254b.C6304f.submitRunnable(r9)     // Catch:{ all -> 0x0097 }
            monitor-exit(r7)
            return
        L_0x0051:
            java.util.concurrent.atomic.AtomicBoolean r10 = r7.isRequestingUpdateSender     // Catch:{ all -> 0x0097 }
            boolean r10 = r10.get()     // Catch:{ all -> 0x0097 }
            if (r10 != 0) goto L_0x0095
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0097 }
            r10.<init>()     // Catch:{ all -> 0x0097 }
            com.ss.android.pushmanager.setting.a r0 = com.p280ss.android.pushmanager.setting.C20089a.m66179a()     // Catch:{ all -> 0x0097 }
            r0.mo53743b(r10)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = com.p280ss.android.pushmanager.C20077j.f54297e     // Catch:{ all -> 0x0097 }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = com.p280ss.android.pushmanager.C20077j.f54293a     // Catch:{ all -> 0x0097 }
            java.lang.Object r1 = r10.get(r1)     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = com.p280ss.android.pushmanager.C20077j.f54294b     // Catch:{ all -> 0x0097 }
            java.lang.Object r10 = r10.get(r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0097 }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x0090
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x0090
            boolean r10 = com.bytedance.common.utility.C6319n.m19593a(r10)     // Catch:{ all -> 0x0097 }
            if (r10 != 0) goto L_0x0090
            r9 = 1
        L_0x0090:
            if (r9 == 0) goto L_0x0095
            r7.tryRegisterWithLastValidChannels(r8)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r7)
            return
        L_0x0097:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.client.MessageAppManager.handleAppLogUpdate(android.content.Context, java.util.Map, boolean):void");
    }

    public void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                return;
            }
        }
        if (z) {
            jSONObject.put("click_position", "notify");
        } else {
            jSONObject.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("post_back", str);
        }
        jSONObject.put("rule_id", j);
        C20074g.m66102a().mo53710a("push_click", jSONObject);
    }
}
