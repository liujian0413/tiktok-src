package com.p280ss.android.downloadlib.addownload;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.downloadlib.C19444a;
import com.p280ss.android.downloadlib.addownload.p863a.C19457a;
import com.p280ss.android.downloadlib.addownload.p864b.C19461a;
import com.p280ss.android.downloadlib.p868c.C19518d;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.downloadlib.p868c.C19524i;
import com.p280ss.android.downloadlib.p868c.C19524i.C19525a;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.b */
public class C19459b implements C19525a {

    /* renamed from: a */
    private static final String f52679a = "b";

    /* renamed from: b */
    private static C19459b f52680b;

    /* renamed from: c */
    private C19524i f52681c = new C19524i(Looper.getMainLooper(), this);

    /* renamed from: d */
    private Map<String, String> f52682d;

    /* renamed from: e */
    private long f52683e;

    /* renamed from: f */
    private C19460a f52684f;

    /* renamed from: com.ss.android.downloadlib.addownload.b$a */
    public static class C19460a {

        /* renamed from: a */
        public String f52685a;

        /* renamed from: b */
        public C19386b f52686b;

        /* renamed from: c */
        public C19384a f52687c;

        /* renamed from: a */
        public final void mo51524a() {
            this.f52685a = null;
            this.f52686b = null;
            this.f52687c = null;
        }

        /* renamed from: a */
        public final void mo51525a(String str, C19386b bVar, C19384a aVar) {
            this.f52685a = str;
            this.f52686b = bVar;
            this.f52687c = aVar;
        }
    }

    private C19459b() {
    }

    /* renamed from: c */
    private Map<String, String> m64019c() {
        if (this.f52682d == null) {
            this.f52682d = new ConcurrentHashMap();
        }
        return this.f52682d;
    }

    /* renamed from: b */
    public final C19460a mo51523b() {
        if (this.f52684f == null) {
            this.f52684f = new C19460a();
        }
        return this.f52684f;
    }

    /* renamed from: a */
    public static C19459b m64016a() {
        if (f52680b == null) {
            synchronized (C19459b.class) {
                if (f52680b == null) {
                    f52680b = new C19459b();
                }
            }
        }
        return f52680b;
    }

    /* renamed from: a */
    public final void mo51520a(Message message) {
        if (message.what == 200) {
            m64017a((C19461a) message.obj);
        }
    }

    /* renamed from: a */
    private void m64017a(C19461a aVar) {
        String str;
        StringBuilder sb = new StringBuilder("handleStartInstallMsg start appName:");
        if (aVar == null) {
            str = "";
        } else {
            str = aVar.f52692e;
        }
        sb.append(str);
        if (C19491j.m64230k() != null) {
            if ((C19491j.m64230k().mo51355a() && !C19491j.m64234o()) || aVar == null) {
                return;
            }
            if (C19523h.m64320a(C19491j.m64206a(), aVar.f52691d)) {
                m64018a(aVar, "installed", aVar.f52690c);
                new StringBuilder("handleStartInstallMsg isInstalledApp mPackageName:").append(aVar.f52691d);
            } else if (!C19523h.m64325a(aVar.f52694g)) {
                m64018a(aVar, "file_lost", aVar.f52690c);
                new StringBuilder("handleStartInstallMsg file_lost mPackageName:").append(aVar.f52691d);
            } else if (C19457a.m64009a().mo51517a(aVar.f52691d)) {
                m64018a(aVar, "conflict_with_back_dialog", aVar.f52690c);
                new StringBuilder("handleStartInstallMsg conflict_with_back_dialog mPackageName:").append(aVar.f52691d);
            } else {
                new StringBuilder("handleStartInstallMsg start_install  mPackageName:").append(aVar.f52691d);
                m64018a(aVar, "start_install", C19491j.m64235p());
                AppDownloader.startInstall(C19491j.m64206a(), (int) aVar.f52688a);
            }
        }
    }

    /* renamed from: a */
    public final void mo51521a(String str) {
        new StringBuilder("trySendRecommendAdEvent packageName:").append(str);
        if (m64019c().containsKey(str)) {
            C19444a.m63957a().mo51498a((String) m64019c().remove(str), str);
        }
    }

    /* renamed from: a */
    public final void mo51522a(String str, long j) {
        StringBuilder sb = new StringBuilder("addPackageName packageName:");
        sb.append(str);
        sb.append(",adId:");
        sb.append(j);
        if (!TextUtils.isEmpty(str)) {
            m64019c().put(str, String.valueOf(j));
        } else {
            m64019c().remove(str);
        }
    }

    /* renamed from: a */
    private static void m64018a(C19461a aVar, String str, long j) {
        JSONObject jSONObject;
        C19236a a = C19518d.m64286a(aVar.f52689b);
        if (a != null) {
            jSONObject = a.f52031j;
        } else {
            jSONObject = null;
        }
        C19490i.m64199a("delay_install", str, true, aVar.f52689b, aVar.f52693f, j, jSONObject, 2, false);
    }

    /* renamed from: a */
    public final void mo51519a(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        long j4 = j2;
        String str5 = str;
        StringBuilder sb = new StringBuilder("trySendDelayInstallMsg start packageName:");
        sb.append(str5);
        sb.append(",adId:");
        sb.append(j4);
        if (C19491j.m64233n()) {
            StringBuilder sb2 = new StringBuilder("trySendDelayInstallMsg next packageName:");
            sb2.append(str5);
            sb2.append(",adId:");
            sb2.append(j4);
            C19461a aVar = new C19461a(j, j2, j3, str, str2, str3, str4);
            long currentTimeMillis = System.currentTimeMillis() - this.f52683e;
            long p = C19491j.m64235p();
            if (currentTimeMillis < C19491j.m64236q()) {
                long q = C19491j.m64236q() - currentTimeMillis;
                p += q;
                this.f52683e = System.currentTimeMillis() + q;
            } else {
                this.f52683e = System.currentTimeMillis();
            }
            this.f52681c.sendMessageDelayed(this.f52681c.obtainMessage(C34943c.f91127w, aVar), p);
        }
    }
}
