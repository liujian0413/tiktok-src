package com.p280ss.android.downloadlib.addownload;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.downloadlib.p868c.C19524i;
import com.p280ss.android.downloadlib.p868c.C19524i.C19525a;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.d */
public class C19472d implements C19525a {

    /* renamed from: a */
    private static String f52720a = "d";

    /* renamed from: b */
    private static volatile C19472d f52721b;

    /* renamed from: c */
    private Map<Long, Pair<C19387c, C19386b>> f52722c = new ConcurrentHashMap();

    /* renamed from: d */
    private C19524i f52723d = new C19524i(Looper.getMainLooper(), this);

    /* renamed from: e */
    private ConcurrentHashMap<Long, Runnable> f52724e = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static long m64067b() {
        return C19491j.m64228i().optLong("quick_app_check_internal", 1200);
    }

    /* renamed from: a */
    public static C19472d m64062a() {
        if (f52721b == null) {
            synchronized (C19472d.class) {
                if (f52721b == null) {
                    f52721b = new C19472d();
                }
            }
        }
        return f52721b;
    }

    /* renamed from: a */
    public static boolean m64065a(C19387c cVar) {
        if (cVar == null || cVar.mo51015x() == null || TextUtils.isEmpty(cVar.mo51015x().f52506a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m64066a(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.getStatus() == 0 || downloadInfo.getStatus() == -4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo51520a(Message message) {
        boolean z;
        String str;
        if (C19491j.m64230k() != null) {
            z = C19491j.m64230k().mo51355a();
        } else {
            z = false;
        }
        new StringBuilder("handleMsg isAppInBackground:").append(z);
        if (message != null && this.f52722c != null && !this.f52722c.isEmpty()) {
            new StringBuilder("handleMsg msg.what:").append(message.what);
            long j = 0;
            if (message.obj != null && (message.obj instanceof Long)) {
                j = ((Long) message.obj).longValue();
            }
            Pair pair = (Pair) this.f52722c.get(Long.valueOf(j));
            if (pair != null) {
                C19387c cVar = (C19387c) pair.first;
                C19386b bVar = (C19386b) pair.second;
                if (bVar == null) {
                    str = "";
                } else {
                    str = bVar.mo50946A();
                }
                if (cVar != null) {
                    this.f52722c.remove(Long.valueOf(j));
                    int i = message.what;
                    if (i != 7) {
                        switch (i) {
                            case 4:
                                if (z) {
                                    m64064a(true, cVar, str, 2);
                                    return;
                                }
                                return;
                            case 5:
                                if (z) {
                                    m64064a(true, cVar, str, 1);
                                    return;
                                }
                                return;
                        }
                    } else {
                        Runnable runnable = (Runnable) this.f52724e.get(Long.valueOf(j));
                        this.f52724e.remove(Long.valueOf(j));
                        if (z) {
                            m64064a(true, cVar, str, 1);
                            m64063a(cVar, bVar, 1);
                            return;
                        }
                        if (runnable != null) {
                            this.f52723d.post(runnable);
                        }
                        m64064a(false, cVar, str, 1);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m64063a(C19387c cVar, C19386b bVar, long j) {
        if (bVar != null && bVar.mo50969w()) {
            String l = bVar.mo50958l();
            if (TextUtils.isEmpty(l)) {
                l = "click";
            }
            C19490i.m64194a(l, 1, cVar, bVar);
        }
    }

    /* renamed from: a */
    public final void mo51547a(int i, C19387c cVar, C19386b bVar) {
        new StringBuilder("sendQuickAppMsg msgWhat:").append(i);
        if (this.f52723d != null) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = Long.valueOf(cVar.mo50995d());
            this.f52722c.put(Long.valueOf(cVar.mo50995d()), new Pair(cVar, bVar));
            this.f52723d.sendMessageDelayed(obtain, m64067b());
        }
    }

    /* renamed from: a */
    public static void m64064a(boolean z, C19387c cVar, String str, long j) {
        String str2;
        String str3;
        JSONObject jSONObject;
        if (cVar != null && cVar.mo51015x() != null) {
            JSONObject jSONObject2 = null;
            try {
                if (cVar.mo51013v() == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(cVar.mo51013v().toString());
                }
                jSONObject2 = jSONObject;
                jSONObject2.putOpt("click_type", Long.valueOf(j));
            } catch (JSONException unused) {
            }
            JSONObject jSONObject3 = jSONObject2;
            if (z) {
                str2 = "quickapp_success";
            } else {
                str2 = "quickapp_fail";
            }
            if (TextUtils.isEmpty(str)) {
                str3 = "embeded_ad";
            } else {
                str3 = str;
            }
            C19490i.m64199a(str3, str2, cVar.mo51008q(), cVar.mo50995d(), cVar.mo51009r(), cVar.mo50996e(), jSONObject3, 2, false);
        }
    }
}
