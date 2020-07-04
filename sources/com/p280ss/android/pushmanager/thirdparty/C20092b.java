package com.p280ss.android.pushmanager.thirdparty;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p254b.C6304f;
import com.p280ss.android.message.C19846k;
import com.p280ss.android.pushmanager.C20076i;
import com.p280ss.android.pushmanager.setting.C20090b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.pushmanager.thirdparty.b */
public class C20092b implements Runnable {

    /* renamed from: a */
    private static final String f54337a = IPushDepend.SEND_PUSH_TOKEN_URL;

    /* renamed from: c */
    private static final Map<Integer, String> f54338c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final Map<Integer, Object> f54339d = new HashMap();

    /* renamed from: b */
    private final ISendTokenCallBack f54340b;

    /* renamed from: e */
    private int f54341e = 10;

    /* renamed from: f */
    private Context f54342f;

    /* renamed from: g */
    private final Handler f54343g = new Handler(C19846k.m65542a().f53813a) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C20092b.this.mo53800a(message);
        }
    };

    /* renamed from: h */
    private int f54344h = 0;

    public void run() {
        Object obj;
        if (this.f54342f != null && this.f54340b != null) {
            synchronized (C20092b.class) {
                obj = f54339d.get(Integer.valueOf(this.f54340b.getType()));
                if (obj == null) {
                    obj = new Object();
                    f54339d.put(Integer.valueOf(this.f54340b.getType()), obj);
                }
            }
            synchronized (obj) {
                m66248a(this.f54340b);
            }
        }
    }

    /* renamed from: d */
    private static boolean m66253d(int i) {
        return C20076i.m66116a(i);
    }

    /* renamed from: a */
    static String m66246a(int i) {
        return C20090b.m66187a().mo53755a(m66252c(i), "");
    }

    /* renamed from: b */
    private static String m66250b(int i) {
        StringBuilder sb = new StringBuilder("push_token_sent_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: c */
    private static String m66252c(int i) {
        StringBuilder sb = new StringBuilder("push_token_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    private void m66249a(String str) {
        try {
            this.f54344h++;
            if (this.f54344h <= 3 && !TextUtils.isEmpty(str)) {
                C19846k.m65542a().mo53205a(new Runnable() {
                    public final void run() {
                        C20092b.this.run();
                    }
                }, TimeUnit.SECONDS.toMillis(4) * ((long) this.f54344h));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private void m66251b(Message message) {
        String str;
        try {
            boolean z = false;
            switch (message.arg1) {
                case 10:
                    break;
                case 11:
                    z = true;
                    break;
            }
            StringBuilder sb = new StringBuilder("Send token ");
            if (z) {
                str = "success";
            } else {
                str = "fail";
            }
            sb.append(str);
            if (z) {
                int i = message.arg2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(m66250b(i), Boolean.valueOf(true));
                if (message.obj instanceof String) {
                    linkedHashMap.put(m66252c(i), message.obj);
                }
                C20090b.m66187a().mo53766c((Map<String, ?>) linkedHashMap);
                return;
            }
            m66249a((String) message.obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo53800a(Message message) {
        if (message.what == 1) {
            m66251b(message);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3 A[Catch:{ Throwable -> 0x00e2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66248a(com.p280ss.android.pushmanager.thirdparty.ISendTokenCallBack r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r9.f54342f
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            r0 = 0
            r1 = 10
            r2 = 0
            r3 = 1
            android.content.Context r4 = r9.f54342f     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r4 = r10.getToken(r4)     // Catch:{ Throwable -> 0x00e0 }
            int r10 = r10.getType()     // Catch:{ Throwable -> 0x00e1 }
            boolean r0 = m66253d(r10)     // Catch:{ Throwable -> 0x00e2 }
            if (r0 != 0) goto L_0x001e
            return
        L_0x001e:
            java.util.Map<java.lang.Integer, java.lang.String> r0 = f54338c     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Throwable -> 0x00e2 }
            boolean r0 = android.text.TextUtils.equals(r4, r0)     // Catch:{ Throwable -> 0x00e2 }
            if (r0 == 0) goto L_0x0034
            com.p280ss.android.pushmanager.monitor.C20084d.m66149b(r10)     // Catch:{ Throwable -> 0x00e2 }
            return
        L_0x0034:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00e2 }
            if (r0 != 0) goto L_0x00d6
            com.ss.android.pushmanager.app.d r0 = com.p280ss.android.pushmanager.app.C20047d.m66018a()     // Catch:{ Throwable -> 0x00e2 }
            java.util.Map r0 = r0.mo53674c()     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r5 = f54337a     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r0 = com.p280ss.android.message.p885a.C19826j.m65467a(r5, r0)     // Catch:{ Throwable -> 0x00e2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00e2 }
            r5.<init>()     // Catch:{ Throwable -> 0x00e2 }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r7 = "token"
            r6.<init>(r7, r4)     // Catch:{ Throwable -> 0x00e2 }
            r5.add(r6)     // Catch:{ Throwable -> 0x00e2 }
            android.util.Pair r6 = new android.util.Pair     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r7 = "type"
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ Throwable -> 0x00e2 }
            r6.<init>(r7, r8)     // Catch:{ Throwable -> 0x00e2 }
            r5.add(r6)     // Catch:{ Throwable -> 0x00e2 }
            java.lang.String r0 = com.p280ss.android.message.p885a.C19826j.m65466a(r0, r5)     // Catch:{ Throwable -> 0x00e2 }
            r6 = 103(0x67, float:1.44E-43)
            com.bytedance.common.utility.k r7 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r0 = r7.mo15151a(r0, r5)     // Catch:{ Throwable -> 0x00a3 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00a3 }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r0 = "success"
            java.lang.String r7 = "message"
            java.lang.String r5 = r5.optString(r7)     // Catch:{ Throwable -> 0x00a3 }
            boolean r0 = r0.equals(r5)     // Catch:{ Throwable -> 0x00a3 }
            if (r0 == 0) goto L_0x0099
            r0 = 200(0xc8, float:2.8E-43)
            java.util.Map<java.lang.Integer, java.lang.String> r2 = f54338c     // Catch:{ Throwable -> 0x0096 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0096 }
            r2.put(r5, r4)     // Catch:{ Throwable -> 0x0096 }
            com.p280ss.android.pushmanager.monitor.C20084d.m66149b(r10)     // Catch:{ Throwable -> 0x0096 }
            r2 = 1
            goto L_0x00ae
        L_0x0096:
            r0 = move-exception
            r2 = 1
            goto L_0x00a4
        L_0x0099:
            r0 = -200(0xffffffffffffff38, float:NaN)
            java.lang.String r5 = "-200"
            java.lang.String r7 = "server 返回更新失败"
            com.p280ss.android.pushmanager.monitor.C20084d.m66144a(r10, r6, r5, r7)     // Catch:{ Throwable -> 0x00a3 }
            goto L_0x00ae
        L_0x00a3:
            r0 = move-exception
        L_0x00a4:
            java.lang.String r5 = "1"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ Throwable -> 0x00e2 }
            com.p280ss.android.pushmanager.monitor.C20084d.m66144a(r10, r6, r5, r0)     // Catch:{ Throwable -> 0x00e2 }
            r0 = 1
        L_0x00ae:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00cc }
            r5.<init>()     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r6 = "label"
            java.lang.String r7 = "send_token"
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r6 = "status"
            r5.put(r6, r0)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r0 = "token"
            r5.put(r0, r4)     // Catch:{ Throwable -> 0x00cc }
            java.lang.String r0 = "type"
            r5.put(r0, r10)     // Catch:{ Throwable -> 0x00cc }
            com.p280ss.android.pushmanager.C20074g.m66102a()     // Catch:{ Throwable -> 0x00cc }
        L_0x00cc:
            if (r2 == 0) goto L_0x00d3
            r0 = 11
            r9.f54341e = r0     // Catch:{ Throwable -> 0x00e2 }
            goto L_0x00e4
        L_0x00d3:
            r9.f54341e = r1     // Catch:{ Throwable -> 0x00e2 }
            goto L_0x00e4
        L_0x00d6:
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r2 = "0"
            java.lang.String r5 = "token 为空"
            com.p280ss.android.pushmanager.monitor.C20084d.m66144a(r10, r0, r2, r5)     // Catch:{ Throwable -> 0x00e2 }
            goto L_0x00e4
        L_0x00e0:
            r4 = r0
        L_0x00e1:
            r10 = 0
        L_0x00e2:
            r9.f54341e = r1
        L_0x00e4:
            android.os.Handler r0 = r9.f54343g
            int r1 = r9.f54341e
            android.os.Message r10 = r0.obtainMessage(r3, r1, r10, r4)
            r10.sendToTarget()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.thirdparty.C20092b.m66248a(com.ss.android.pushmanager.thirdparty.ISendTokenCallBack):void");
    }

    private C20092b(Context context, ISendTokenCallBack iSendTokenCallBack) {
        this.f54342f = context;
        this.f54340b = iSendTokenCallBack;
    }

    /* renamed from: a */
    static void m66247a(Context context, ISendTokenCallBack iSendTokenCallBack) {
        C20092b bVar = new C20092b(context, iSendTokenCallBack);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C6304f.submitRunnable(bVar);
        } else {
            bVar.run();
        }
    }
}
