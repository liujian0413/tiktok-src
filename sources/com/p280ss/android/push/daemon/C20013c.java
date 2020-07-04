package com.p280ss.android.push.daemon;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.p280ss.android.message.MessageReceiver;
import com.p280ss.android.message.NotifyService;
import com.p280ss.android.push.daemon.C6839b.C6840a;
import com.p280ss.android.push.daemon.C6839b.C6841b;
import com.p280ss.android.pushmanager.setting.C20090b;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.daemon.c */
public class C20013c {

    /* renamed from: c */
    static C6839b f54149c;

    /* renamed from: f */
    private static volatile C20013c f54150f;

    /* renamed from: a */
    Context f54151a;

    /* renamed from: b */
    C6842e f54152b;

    /* renamed from: d */
    boolean f54153d;

    /* renamed from: e */
    C20014a f54154e;

    /* renamed from: com.ss.android.push.daemon.c$a */
    class C20014a {

        /* renamed from: a */
        long f54155a;

        /* renamed from: b */
        long f54156b;

        /* renamed from: c */
        long f54157c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo53595a(Context context) {
            this.f54157c = System.currentTimeMillis();
            if (this.f54157c >= this.f54156b) {
                this.f54155a += this.f54157c - this.f54156b;
            }
            m65944c(context);
        }

        /* renamed from: c */
        private void m65944c(Context context) {
            try {
                if (this.f54156b > 0) {
                    if (this.f54157c > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("start", this.f54156b);
                        jSONObject.put("end", this.f54157c);
                        jSONObject.put("duration", this.f54155a);
                        C20090b.m66187a().mo53765c(jSONObject.toString());
                    }
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: b */
        private void m65943b(Context context) {
            try {
                String i = C20090b.m66187a().mo53783i();
                if (!TextUtils.isEmpty(i)) {
                    JSONObject jSONObject = new JSONObject(i);
                    this.f54156b = jSONObject.optLong("start", 0);
                    if (DateUtils.isToday(this.f54156b)) {
                        this.f54155a = jSONObject.optLong("duration", 0);
                        this.f54157c = jSONObject.optLong("end", 0);
                        return;
                    }
                    C20090b.m66187a().mo53770d(i);
                    this.f54156b = 0;
                    this.f54157c = 0;
                    this.f54155a = 0;
                }
            } catch (Throwable unused) {
            }
        }

        C20014a(Context context) {
            m65943b(context);
        }
    }

    /* renamed from: com.ss.android.push.daemon.c$b */
    class C20015b implements C6841b {
        /* renamed from: a */
        public final void mo16702a() {
            if (C20013c.this.f54154e != null) {
                C20013c.this.f54154e.mo53595a(C20013c.this.f54151a);
            }
        }

        C20015b() {
        }
    }

    /* renamed from: d */
    private static boolean m65941d() {
        C20090b.m66187a();
        return true;
    }

    /* renamed from: c */
    private static boolean m65940c() {
        return C20090b.m66187a().mo53788n();
    }

    /* renamed from: a */
    public final void mo53594a() {
        if (VERSION.SDK_INT >= 21 && Boolean.valueOf(C20090b.m66187a().mo53782h()).booleanValue() && m65941d() && !m65940c()) {
            try {
                if (!this.f54153d) {
                    this.f54153d = true;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private C6839b m65939b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f54151a.getPackageName());
        sb.append(":push");
        C6840a aVar = new C6840a(sb.toString(), NotifyService.class.getCanonicalName(), MessageReceiver.class.getCanonicalName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f54151a.getPackageName());
        sb2.append(":pushservice");
        return new C6839b(aVar, new C6840a(sb2.toString(), PushService.class.getCanonicalName(), PushReceiver.class.getCanonicalName()), new C20015b());
    }

    /* renamed from: a */
    public static C20013c m65938a(Context context) {
        if (f54150f == null) {
            synchronized (C20013c.class) {
                if (f54150f == null) {
                    f54150f = new C20013c(context);
                }
            }
        }
        return f54150f;
    }

    private C20013c(Context context) {
        this.f54151a = context;
        try {
            if (f54149c == null) {
                f54149c = m65939b();
            }
            this.f54152b = new C6838a(f54149c);
            this.f54154e = new C20014a(context);
        } catch (Throwable unused) {
        }
    }
}
