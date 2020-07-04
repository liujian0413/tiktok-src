package com.p280ss.android.newmedia.redbadge;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Bundle;
import android.text.format.DateUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import com.p280ss.android.message.C19846k;
import com.p280ss.android.newmedia.redbadge.p895b.C19979a;
import com.p280ss.android.pushmanager.app.C20044c;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.redbadge.b */
public class C19973b implements C6310a {

    /* renamed from: e */
    private static volatile C19973b f54058e;

    /* renamed from: a */
    public Context f54059a;

    /* renamed from: b */
    public C6309f f54060b;

    /* renamed from: c */
    public boolean f54061c;

    /* renamed from: d */
    public boolean f54062d;

    /* renamed from: f */
    private String f54063f;

    /* renamed from: g */
    private int f54064g;

    /* renamed from: h */
    private int f54065h;

    /* renamed from: i */
    private C19978a f54066i;

    /* renamed from: j */
    private C19978a f54067j;

    /* renamed from: k */
    private volatile boolean f54068k;

    /* renamed from: l */
    private Runnable f54069l = new Runnable() {
        public final void run() {
            if (C19973b.this.f54059a != null && C19973b.this.f54062d) {
                C19973b.this.f54062d = false;
                C19973b.this.f54060b.sendEmptyMessage(1);
            }
        }
    };

    /* renamed from: m */
    private ContentObserver f54070m = new ContentObserver(this.f54060b) {
        public final void onChange(boolean z) {
            C19973b.this.mo53462a();
        }
    };

    /* renamed from: n */
    private ContentObserver f54071n = new ContentObserver(this.f54060b) {
        public final void onChange(boolean z) {
            C19973b.this.mo53462a();
        }
    };

    /* renamed from: com.ss.android.newmedia.redbadge.b$a */
    static class C19978a {

        /* renamed from: a */
        long f54076a;

        /* renamed from: b */
        long f54077b;

        /* renamed from: c */
        long f54078c;

        private C19978a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final JSONObject mo53472a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("launch", this.f54076a);
                jSONObject.put("leave", this.f54077b);
                jSONObject.put("badge", this.f54078c);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }

        /* renamed from: a */
        static C19978a m65853a(String str) {
            C19978a aVar = new C19978a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.f54076a = jSONObject.optLong("launch", 0);
                aVar.f54077b = jSONObject.optLong("leave", 0);
                aVar.f54078c = jSONObject.optLong("badge", 0);
            } catch (Throwable unused) {
            }
            return aVar;
        }
    }

    /* renamed from: e */
    private boolean m65843e() {
        return C19980c.m65880a(this);
    }

    /* renamed from: a */
    public final void mo53463a(String str) {
        C19980c.m65879a(this, str);
    }

    /* renamed from: d */
    public final void mo53467d() {
        m65846h();
    }

    /* renamed from: h */
    private void m65846h() {
        try {
            C19979a.m65855a(this.f54059a).mo53485d(C20044c.m66007b().mo53669e());
            C6304f.submitRunnable(new Runnable() {
                public final void run() {
                    C19979a.m65855a(C19973b.this.f54059a).mo53487e(C20044c.m66007b().mo53670f());
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void mo53466c() {
        if (this.f54059a != null && this.f54062d) {
            this.f54060b.postDelayed(this.f54069l, 30000);
            this.f54060b.sendEmptyMessage(2);
        }
    }

    /* renamed from: f */
    private void m65844f() {
        boolean z;
        try {
            this.f54064g = C19979a.m65855a(this.f54059a).mo53490g();
            this.f54065h = C19979a.m65855a(this.f54059a).mo53491h();
            String e = C19979a.m65855a(this.f54059a).mo53486e();
            if (!C6319n.m19593a(e)) {
                this.f54066i = C19978a.m65853a(e);
            }
            String f = C19979a.m65855a(this.f54059a).mo53488f();
            if (!C6319n.m19593a(f)) {
                this.f54067j = C19978a.m65853a(f);
            }
            if (this.f54066i != null) {
                if (!DateUtils.isToday(this.f54066i.f54076a)) {
                    this.f54064g = 0;
                    z = true;
                } else {
                    z = false;
                }
                if (!DateUtils.isToday(this.f54066i.f54078c)) {
                    this.f54065h = 0;
                    z = true;
                }
                if (z) {
                    m65845g();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m65845g() {
        String str;
        String str2;
        try {
            C19979a.m65855a(this.f54059a).mo53479b(this.f54064g);
            C19979a.m65855a(this.f54059a).mo53482c(this.f54065h);
            C19979a a = C19979a.m65855a(this.f54059a);
            if (this.f54066i == null) {
                str = "";
            } else {
                str = this.f54066i.mo53472a().toString();
            }
            a.mo53480b(str);
            C19979a a2 = C19979a.m65855a(this.f54059a);
            if (this.f54067j == null) {
                str2 = "";
            } else {
                str2 = this.f54067j.mo53472a().toString();
            }
            a2.mo53483c(str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo53464b() {
        if (this.f54059a != null) {
            if (!this.f54062d) {
                this.f54062d = true;
                this.f54060b.sendEmptyMessage(0);
            } else if (this.f54068k) {
                this.f54068k = false;
                this.f54060b.sendEmptyMessage(3);
            }
            this.f54060b.removeCallbacks(this.f54069l);
        }
    }

    /* renamed from: a */
    public final void mo53462a() {
        this.f54061c = C19979a.m65855a(this.f54059a).mo53477a();
        this.f54063f = C19979a.m65855a(this.f54059a).mo53478b();
    }

    /* renamed from: a */
    public static C19973b m65837a(Context context) {
        if (f54058e == null) {
            synchronized (C19973b.class) {
                if (f54058e == null) {
                    f54058e = new C19973b(context);
                }
            }
        }
        return f54058e;
    }

    /* renamed from: c */
    private static long m65842c(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optLong("rule_id");
        } catch (Exception unused) {
            return 0;
        }
    }

    private C19973b(Context context) {
        this.f54059a = context.getApplicationContext();
        this.f54060b = new C6309f(C19846k.m65542a().f53813a, this);
        m65844f();
        m65841b(context);
        mo53462a();
    }

    /* renamed from: b */
    private void m65841b(Context context) {
        if (context != null) {
            try {
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(context, "is_desktop_red_badge_show", "boolean"), true, this.f54070m);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(context, "desktop_red_badge_args", "string"), true, this.f54071n);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            int r4 = r4.what     // Catch:{ Throwable -> 0x006d }
            r0 = 0
            r1 = 1
            switch(r4) {
                case 0: goto L_0x003e;
                case 1: goto L_0x001b;
                case 2: goto L_0x0017;
                case 3: goto L_0x000b;
                default: goto L_0x000a;
            }     // Catch:{ Throwable -> 0x006d }
        L_0x000a:
            goto L_0x006c
        L_0x000b:
            com.ss.android.newmedia.redbadge.g r4 = com.p280ss.android.newmedia.redbadge.C19991g.m65902a()     // Catch:{ Throwable -> 0x006d }
            android.content.Context r1 = r3.f54059a     // Catch:{ Throwable -> 0x006d }
            r4.mo53508a(r1)     // Catch:{ Throwable -> 0x006d }
            r3.f54068k = r0     // Catch:{ Throwable -> 0x006d }
            goto L_0x006c
        L_0x0017:
            r3.m65838a(r1)     // Catch:{ Throwable -> 0x006d }
            goto L_0x006d
        L_0x001b:
            r3.m65838a(r1)     // Catch:{ Throwable -> 0x006d }
            boolean r4 = r3.m65843e()     // Catch:{ Throwable -> 0x006d }
            if (r4 == 0) goto L_0x006c
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x006d }
            android.content.Context r0 = r3.f54059a     // Catch:{ Throwable -> 0x006d }
            com.ss.android.pushmanager.app.c$b r2 = com.p280ss.android.pushmanager.app.C20044c.m66007b()     // Catch:{ Throwable -> 0x006d }
            java.lang.Class r2 = r2.mo53666b()     // Catch:{ Throwable -> 0x006d }
            r4.<init>(r0, r2)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = "app_exit"
            r4.putExtra(r0, r1)     // Catch:{ Throwable -> 0x006d }
            android.content.Context r0 = r3.f54059a     // Catch:{ Throwable -> 0x006d }
            r0.startService(r4)     // Catch:{ Throwable -> 0x006d }
            goto L_0x006d
        L_0x003e:
            r3.m65838a(r0)     // Catch:{ Throwable -> 0x006d }
            com.ss.android.newmedia.redbadge.g r4 = com.p280ss.android.newmedia.redbadge.C19991g.m65902a()     // Catch:{ Throwable -> 0x006d }
            android.content.Context r2 = r3.f54059a     // Catch:{ Throwable -> 0x006d }
            r4.mo53508a(r2)     // Catch:{ Throwable -> 0x006d }
            r3.f54068k = r0     // Catch:{ Throwable -> 0x006d }
            boolean r4 = r3.m65843e()     // Catch:{ Throwable -> 0x006d }
            if (r4 == 0) goto L_0x006c
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x006d }
            android.content.Context r0 = r3.f54059a     // Catch:{ Throwable -> 0x006d }
            com.ss.android.pushmanager.app.c$b r2 = com.p280ss.android.pushmanager.app.C20044c.m66007b()     // Catch:{ Throwable -> 0x006d }
            java.lang.Class r2 = r2.mo53666b()     // Catch:{ Throwable -> 0x006d }
            r4.<init>(r0, r2)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = "app_entrance"
            r4.putExtra(r0, r1)     // Catch:{ Throwable -> 0x006d }
            android.content.Context r0 = r3.f54059a     // Catch:{ Throwable -> 0x006d }
            r0.startService(r4)     // Catch:{ Throwable -> 0x006d }
            goto L_0x006d
        L_0x006c:
            return
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.redbadge.C19973b.handleMsg(android.os.Message):void");
    }

    /* renamed from: a */
    private void m65838a(int i) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f54066i == null) {
                this.f54066i = new C19978a();
            }
            if (this.f54067j == null) {
                this.f54067j = new C19978a();
            }
            if (!DateUtils.isToday(this.f54066i.f54076a)) {
                this.f54064g = 0;
            }
            if (!DateUtils.isToday(this.f54066i.f54078c)) {
                this.f54065h = 0;
            }
            switch (i) {
                case 0:
                    this.f54067j.f54076a = this.f54066i.f54076a;
                    this.f54067j.f54077b = this.f54066i.f54077b;
                    this.f54066i.f54076a = currentTimeMillis;
                    this.f54066i.f54077b = currentTimeMillis + 900000;
                    this.f54064g++;
                    break;
                case 1:
                    this.f54066i.f54077b = currentTimeMillis;
                    break;
                case 2:
                    this.f54067j.f54078c = this.f54066i.f54078c;
                    this.f54066i.f54078c = currentTimeMillis;
                    this.f54065h++;
                    break;
            }
            m65845g();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = new java.util.Random().nextInt(5) + 1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0053 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53465b(java.lang.String r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r0 = r6.f54059a
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r6.m65843e()
            if (r0 != 0) goto L_0x000f
            goto L_0x00f3
        L_0x000f:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f2 }
            r0.<init>(r7)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = "show"
            int r1 = r0.optInt(r1)     // Catch:{ Throwable -> 0x00f2 }
            if (r1 > 0) goto L_0x001d
            return
        L_0x001d:
            java.lang.String r1 = "content_type"
            java.lang.String r1 = r0.optString(r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r2 = "content"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ Throwable -> 0x00f2 }
            long r2 = m65842c(r7)     // Catch:{ Throwable -> 0x00f2 }
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x00f2 }
            if (r7 != 0) goto L_0x00f1
            boolean r7 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x00f2 }
            if (r7 != 0) goto L_0x00f1
            com.ss.android.pushmanager.setting.a r7 = com.p280ss.android.pushmanager.setting.C20089a.m66179a()     // Catch:{ Throwable -> 0x00f2 }
            boolean r7 = r7.mo53744c()     // Catch:{ Throwable -> 0x00f2 }
            if (r7 == 0) goto L_0x0045
            goto L_0x00f1
        L_0x0045:
            java.lang.String r7 = "desktop_red_badge"
            boolean r7 = r7.equals(r1)     // Catch:{ Throwable -> 0x00f2 }
            if (r7 == 0) goto L_0x00b1
            r7 = 1
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0053 }
            goto L_0x005e
        L_0x0053:
            java.util.Random r1 = new java.util.Random     // Catch:{ Throwable -> 0x00f2 }
            r1.<init>()     // Catch:{ Throwable -> 0x00f2 }
            r4 = 5
            int r1 = r1.nextInt(r4)     // Catch:{ Throwable -> 0x00f2 }
            int r1 = r1 + r7
        L_0x005e:
            if (r1 <= 0) goto L_0x00a0
            com.ss.android.newmedia.redbadge.g r4 = com.p280ss.android.newmedia.redbadge.C19991g.m65902a()     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r5 = r6.f54059a     // Catch:{ Throwable -> 0x00f2 }
            r4.mo53509a(r5, r1)     // Catch:{ Throwable -> 0x00f2 }
            r6.f54068k = r7     // Catch:{ Throwable -> 0x00f2 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f2 }
            r7.<init>()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r4 = "content"
            r7.put(r4, r0)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "desktop_red_badge"
            long r4 = (long) r1     // Catch:{ Throwable -> 0x00f2 }
            r6.m65839a(r0, r4, r7)     // Catch:{ Throwable -> 0x00f2 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ Throwable -> 0x00f2 }
            r7.<init>()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "badge_number"
            r7.putInt(r0, r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "red_badge_is_open"
            boolean r1 = r6.m65843e()     // Catch:{ Throwable -> 0x00f2 }
            r7.putInt(r0, r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "show_type"
            java.lang.String r1 = "request"
            r7.putString(r0, r1)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "rule_id"
            r7.putLong(r0, r2)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "red_badge_show"
            r6.m65840a(r0, r7)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x00ac
        L_0x00a0:
            com.ss.android.newmedia.redbadge.g r7 = com.p280ss.android.newmedia.redbadge.C19991g.m65902a()     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r0 = r6.f54059a     // Catch:{ Throwable -> 0x00f2 }
            r7.mo53508a(r0)     // Catch:{ Throwable -> 0x00f2 }
            r7 = 0
            r6.f54068k = r7     // Catch:{ Throwable -> 0x00f2 }
        L_0x00ac:
            r7 = 2
            r6.m65838a(r7)     // Catch:{ Throwable -> 0x00f2 }
            goto L_0x00f2
        L_0x00b1:
            java.lang.String r7 = "notification"
            boolean r7 = r7.equals(r1)     // Catch:{ Throwable -> 0x00f2 }
            if (r7 == 0) goto L_0x00f0
            android.content.Intent r7 = new android.content.Intent     // Catch:{ Throwable -> 0x00f2 }
            com.ss.android.pushmanager.app.c$b r1 = com.p280ss.android.pushmanager.app.C20044c.m66007b()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = r1.mo53668d()     // Catch:{ Throwable -> 0x00f2 }
            r7.<init>(r1)     // Catch:{ Throwable -> 0x00f2 }
            com.ss.android.pushmanager.app.c$b r1 = com.p280ss.android.pushmanager.app.C20044c.m66007b()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = r1.mo53667c()     // Catch:{ Throwable -> 0x00f2 }
            r7.putExtra(r1, r0)     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r1 = r6.f54059a     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Throwable -> 0x00f2 }
            r7.setPackage(r1)     // Catch:{ Throwable -> 0x00f2 }
            android.content.Context r1 = r6.f54059a     // Catch:{ Throwable -> 0x00f2 }
            r1.startService(r7)     // Catch:{ Throwable -> 0x00f2 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f2 }
            r7.<init>()     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r1 = "content"
            r7.put(r1, r0)     // Catch:{ Throwable -> 0x00f2 }
            java.lang.String r0 = "notification"
            r1 = 0
            r6.m65839a(r0, r1, r7)     // Catch:{ Throwable -> 0x00f2 }
        L_0x00f0:
            return
        L_0x00f1:
            return
        L_0x00f2:
            return
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.redbadge.C19973b.mo53465b(java.lang.String):void");
    }

    /* renamed from: a */
    private void m65840a(String str, Bundle bundle) {
        if (!C6319n.m19593a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            } catch (Throwable unused) {
            }
            C20044c.m66007b().mo53665a(this.f54059a, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    /* renamed from: a */
    private void m65839a(String str, long j, JSONObject jSONObject) {
        C20044c.m66007b().mo53665a(this.f54059a, "umeng", "red_badge", str, j, 0, jSONObject);
    }
}
