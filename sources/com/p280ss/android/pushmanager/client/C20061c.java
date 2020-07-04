package com.p280ss.android.pushmanager.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.collection.C9725a;
import com.p280ss.android.message.C19846k;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.pushmanager.client.c */
public final class C20061c implements C6310a {

    /* renamed from: f */
    private static C20061c f54256f;

    /* renamed from: a */
    public Messenger f54257a;

    /* renamed from: b */
    private WeakReference<Context> f54258b;

    /* renamed from: c */
    private Handler f54259c;

    /* renamed from: d */
    private Messenger f54260d;

    /* renamed from: e */
    private long f54261e;

    /* renamed from: g */
    private ServiceConnection f54262g = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            C20061c.this.f54257a = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C20061c.this.f54257a = new Messenger(iBinder);
            C20061c.this.mo53694a();
        }
    };

    /* renamed from: a */
    public static void m66051a(Context context) {
        C20063d.m66060a(context);
    }

    /* renamed from: c */
    public static void m66056c(Context context) {
        C20063d.m66061b(context);
    }

    /* renamed from: d */
    private void m66057d() {
        if (this.f54257a != null) {
            try {
                m66055c();
                this.f54257a = null;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m66055c() {
        try {
            if (!(this.f54257a == null || this.f54258b.get() == null)) {
                ((Context) this.f54258b.get()).unbindService(this.f54262g);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m66053b() {
        if (this.f54258b != null && this.f54258b.get() != null) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName((Context) this.f54258b.get(), "com.ss.android.message.log.LogService"));
                ((Context) this.f54258b.get()).bindService(intent, this.f54262g, 1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53694a() {
        try {
            Message obtain = Message.obtain(null, 0);
            obtain.replyTo = this.f54260d;
            Bundle bundle = new Bundle();
            bundle.putLong("start_id", this.f54261e);
            obtain.obj = bundle;
            this.f54257a.send(obtain);
        } catch (Throwable unused) {
            m66057d();
        }
    }

    /* renamed from: b */
    public static void m66054b(Context context) {
        if (context != null) {
            if (f54256f == null) {
                f54256f = new C20061c(context);
                return;
            }
            if (f54256f.f54257a == null) {
                f54256f.m66053b();
            }
        }
    }

    /* renamed from: d */
    public static void m66058d(Context context) {
        if (!(context == null || f54256f == null)) {
            f54256f.m66055c();
        }
    }

    private C20061c(Context context) {
        this.f54258b = new WeakReference<>(context.getApplicationContext());
        Looper looper = C19846k.m65542a().f53813a;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.f54259c = new C6309f(looper, this);
        this.f54260d = new Messenger(this.f54259c);
        m66053b();
    }

    /* renamed from: a */
    private void m66052a(List<Long> list) {
        if (list.size() > 0) {
            try {
                Message obtain = Message.obtain(null, 1);
                obtain.replyTo = this.f54260d;
                Bundle bundle = new Bundle();
                bundle.putLongArray("event_ids", C9725a.m28660a(list));
                obtain.obj = bundle;
                this.f54257a.send(obtain);
            } catch (Throwable unused) {
                m66057d();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095 A[Catch:{ Throwable -> 0x00b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r1.what     // Catch:{ Throwable -> 0x00b3 }
            if (r2 == 0) goto L_0x0010
            r1 = 2
            if (r2 == r1) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r18.m66057d()     // Catch:{ Throwable -> 0x00b3 }
        L_0x000f:
            return
        L_0x0010:
            com.ss.android.pushmanager.app.c$b r2 = com.p280ss.android.pushmanager.app.C20044c.m66007b()     // Catch:{ Throwable -> 0x00b3 }
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.Object r1 = r1.obj     // Catch:{ Throwable -> 0x00b3 }
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r2 = "events"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r3 = "has_more"
            boolean r1 = r1.getBoolean(r3)     // Catch:{ Throwable -> 0x00b3 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Throwable -> 0x00b3 }
            if (r3 != 0) goto L_0x00aa
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00b3 }
            r3.<init>()     // Catch:{ Throwable -> 0x00b3 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Throwable -> 0x00b3 }
            r4.<init>(r2)     // Catch:{ Throwable -> 0x00b3 }
            int r2 = r4.length()     // Catch:{ Throwable -> 0x00b3 }
            r5 = 0
        L_0x003c:
            if (r5 >= r2) goto L_0x00a1
            org.json.JSONObject r6 = r4.optJSONObject(r5)     // Catch:{ Throwable -> 0x00b3 }
            if (r6 == 0) goto L_0x009e
            java.lang.String r7 = "category"
            java.lang.String r10 = r6.optString(r7)     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r7 = "tag"
            java.lang.String r11 = r6.optString(r7)     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r7 = "label"
            java.lang.String r12 = r6.optString(r7)     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r7 = "value"
            long r13 = r6.optLong(r7)     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r7 = "ext_value"
            long r15 = r6.optLong(r7)     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r7 = "ext_json"
            java.lang.String r7 = r6.optString(r7)     // Catch:{ Throwable -> 0x00b3 }
            r8 = 0
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x00b3 }
            if (r9 != 0) goto L_0x0077
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0077 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x0077 }
            r17 = r9
            goto L_0x0079
        L_0x0077:
            r17 = r8
        L_0x0079:
            com.ss.android.pushmanager.app.c$b r8 = com.p280ss.android.pushmanager.app.C20044c.m66007b()     // Catch:{ Throwable -> 0x00b3 }
            java.lang.ref.WeakReference<android.content.Context> r7 = r0.f54258b     // Catch:{ Throwable -> 0x00b3 }
            java.lang.Object r7 = r7.get()     // Catch:{ Throwable -> 0x00b3 }
            r9 = r7
            android.content.Context r9 = (android.content.Context) r9     // Catch:{ Throwable -> 0x00b3 }
            r8.mo53665a(r9, r10, r11, r12, r13, r15, r17)     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r7 = "_id"
            long r6 = r6.optLong(r7)     // Catch:{ Throwable -> 0x00b3 }
            long r8 = r0.f54261e     // Catch:{ Throwable -> 0x00b3 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0097
            r0.f54261e = r6     // Catch:{ Throwable -> 0x00b3 }
        L_0x0097:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Throwable -> 0x00b3 }
            r3.add(r6)     // Catch:{ Throwable -> 0x00b3 }
        L_0x009e:
            int r5 = r5 + 1
            goto L_0x003c
        L_0x00a1:
            int r2 = r3.size()     // Catch:{ Throwable -> 0x00b3 }
            if (r2 <= 0) goto L_0x00aa
            r0.m66052a(r3)     // Catch:{ Throwable -> 0x00b3 }
        L_0x00aa:
            if (r1 == 0) goto L_0x00b0
            r18.mo53694a()     // Catch:{ Throwable -> 0x00b3 }
            goto L_0x00b3
        L_0x00b0:
            r18.m66057d()     // Catch:{ Throwable -> 0x00b3 }
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.client.C20061c.handleMsg(android.os.Message):void");
    }
}
