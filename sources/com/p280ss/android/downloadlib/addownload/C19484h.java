package com.p280ss.android.downloadlib.addownload;

import android.content.ContentValues;
import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.download.api.model.C19393b;
import com.p280ss.android.download.api.model.C19398d;
import com.p280ss.android.download.api.model.C19398d.C19399a;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p857a.C19372a;
import com.p280ss.android.download.api.p857a.C19382k;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19386b;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.downloadlib.C19444a;
import com.p280ss.android.downloadlib.addownload.exception.OpenAppException;
import com.p280ss.android.downloadlib.addownload.p865c.C19468a;
import com.p280ss.android.downloadlib.p868c.C19517c;
import com.p280ss.android.downloadlib.p868c.C19519e;
import com.p280ss.android.downloadlib.p868c.C19519e.C19520a;
import com.p280ss.android.downloadlib.p868c.C19523h;
import com.p280ss.android.downloadlib.p868c.C19524i;
import com.p280ss.android.downloadlib.p868c.C19524i.C19525a;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.p848c.p849a.p851b.C19236a;
import com.p280ss.android.socialbase.appdownloader.AppDownloadUtils;
import com.p280ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.h */
public final class C19484h implements C19525a {

    /* renamed from: a */
    public C19387c f52754a;

    /* renamed from: b */
    public C19386b f52755b;

    /* renamed from: c */
    private C19384a f52756c;

    /* renamed from: d */
    private C19393b f52757d;

    /* renamed from: e */
    private int f52758e;

    /* renamed from: f */
    private boolean f52759f;

    /* renamed from: g */
    private final C19524i f52760g = new C19524i(Looper.getMainLooper(), this);

    /* renamed from: h */
    private C19489b f52761h;

    /* renamed from: com.ss.android.downloadlib.addownload.h$a */
    static class C19488a extends AbsDownloadListener {

        /* renamed from: a */
        private C19524i f52768a;

        public final void onCanceled(DownloadInfo downloadInfo) {
            m64188a(downloadInfo);
        }

        public final void onPause(DownloadInfo downloadInfo) {
            m64188a(downloadInfo);
        }

        public final void onPrepare(DownloadInfo downloadInfo) {
            m64188a(downloadInfo);
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            m64188a(downloadInfo);
        }

        public final void onStart(DownloadInfo downloadInfo) {
            m64188a(downloadInfo);
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            m64188a(downloadInfo);
        }

        C19488a(C19524i iVar) {
            this.f52768a = iVar;
        }

        /* renamed from: a */
        private void m64188a(DownloadInfo downloadInfo) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = downloadInfo;
            this.f52768a.sendMessage(obtain);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            m64188a(downloadInfo);
        }
    }

    /* renamed from: com.ss.android.downloadlib.addownload.h$b */
    public interface C19489b {
        /* renamed from: a */
        void mo51591a(DownloadInfo downloadInfo);
    }

    /* renamed from: a */
    public final void mo51576a(C19387c cVar) {
        this.f52754a = cVar;
        this.f52757d = cVar.mo51011t();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51578a(DownloadInfo downloadInfo) {
        this.f52759f = false;
        if (this.f52761h != null) {
            this.f52761h.mo51591a(downloadInfo);
            this.f52761h = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo51582a(Context context, int i, boolean z) {
        return (C19490i.m64200a(this.f52758e) && m64142a(context, i)) || (!z && C19490i.m64205c(this.f52758e) && m64141a(context));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51574a(final C19382k kVar) {
        if (this.f52754a == null || TextUtils.isEmpty(this.f52754a.mo51003l()) || !this.f52754a.mo51003l().startsWith(Environment.getDataDirectory().getAbsolutePath())) {
            m64143b((C19382k) new C19382k() {
                /* renamed from: a */
                public final void mo51367a() {
                    kVar.mo51367a();
                }

                /* renamed from: a */
                public final void mo51368a(String str) {
                    C19491j.m64223d().mo51365a(C19491j.m64206a(), "您已禁止使用存储权限，请授权后再下载", null, 1);
                    C19484h.this.mo51590e();
                    kVar.mo51368a(str);
                }
            });
        } else {
            kVar.mo51367a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51573a(Message message, C19400e eVar, List<C19388d> list) {
        if (message != null && list != null && !list.isEmpty() && message.what == 3) {
            DownloadInfo downloadInfo = (DownloadInfo) message.obj;
            eVar.mo51415a(downloadInfo);
            int notificationType = AppDownloadUtils.getNotificationType(downloadInfo.getStatus());
            int i = 0;
            if (downloadInfo.getTotalBytes() > 0) {
                i = (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes());
                if (notificationType == 1 && this.f52761h != null) {
                    this.f52761h.mo51591a(downloadInfo);
                    this.f52761h = null;
                }
            }
            for (C19388d dVar : list) {
                switch (notificationType) {
                    case 1:
                        dVar.mo51376a(eVar, i);
                        break;
                    case 2:
                        dVar.mo51378b(eVar, i);
                        break;
                    case 3:
                        if (downloadInfo != null) {
                            if (downloadInfo.getStatus() != -4) {
                                if (downloadInfo.getStatus() != -1) {
                                    if (downloadInfo.getStatus() == -3) {
                                        if (!C19523h.m64323a(this.f52754a)) {
                                            dVar.mo51379c(eVar);
                                            break;
                                        } else {
                                            dVar.mo51377b(eVar);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    dVar.mo51375a(eVar);
                                    break;
                                }
                            } else {
                                dVar.mo51373a();
                                break;
                            }
                        } else {
                            return;
                        }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51577a(C19400e eVar) {
        if (this.f52754a.mo51008q() && C19490i.m64201a(this.f52754a)) {
            if (!this.f52759f) {
                C19490i.m64198a(C19491j.m64232m(), "file_status", true, this.f52754a.mo50995d(), this.f52754a.mo51009r(), (eVar == null || !C19523h.m64330b(eVar.f52503e)) ? 2 : 1, 2, this.f52755b.mo50972z());
                this.f52759f = true;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("ext_value", Long.valueOf(this.f52754a.mo50996e()));
            contentValues.put("force_update", Integer.valueOf(1));
            C19444a.m63957a();
            C19444a.m63965a(String.valueOf(this.f52754a.mo50995d()), contentValues);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51572a(long j) {
        if (this.f52755b != null && this.f52755b.mo50969w()) {
            String l = this.f52755b.mo50958l();
            if (TextUtils.isEmpty(l)) {
                l = "click";
            }
            C19490i.m64194a(l, j, this.f52754a, this.f52755b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51580a(String str, boolean z) {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            if (TextUtils.isEmpty(null)) {
                str = this.f52755b.mo50951e();
            }
            String m = this.f52755b.mo50959m();
            JSONObject jSONObject = new JSONObject();
            C19523h.m64316a(this.f52754a.mo51013v(), jSONObject);
            if (C19491j.m64220b() != null) {
                C19399a aVar = new C19399a();
                if (TextUtils.isEmpty(str)) {
                    str = this.f52755b.mo50947a();
                }
                C19399a b = aVar.mo51411b(str);
                if (TextUtils.isEmpty(m)) {
                    m = "click_start";
                }
                C19398d a = b.mo51413c(m).mo51412b(this.f52754a.mo51008q()).mo51403a(this.f52754a.mo50995d()).mo51414d(this.f52754a.mo51009r()).mo51410b(this.f52754a.mo50996e()).mo51407a(jSONObject).mo51402a(1).mo51404a(this.f52755b.mo50967u()).mo51408a(z).mo51409a();
                if (z) {
                    C19491j.m64220b().mo51357a(a);
                    return;
                }
                C19491j.m64220b().onEvent(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo51581a(boolean z, long j, long j2, String str) {
        JSONObject jSONObject;
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            try {
                if (this.f52754a.mo51013v() == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(this.f52754a.mo51013v().toString());
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject2.put("app_package", str);
                    jSONObject2.put("status", j);
                } catch (JSONException unused2) {
                }
            }
            C19490i.m64199a(this.f52755b.mo50947a(), z ? "click_open_market_success" : "click_open_market_failed", true, this.f52754a.mo50995d(), this.f52754a.mo51009r(), j2, jSONObject2, 1, this.f52755b.mo50972z());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51579a(com.p280ss.android.socialbase.downloader.model.DownloadInfo r7, com.p280ss.android.download.api.model.C19400e r8, java.util.List<com.p280ss.android.download.api.p858b.C19388d> r9) {
        /*
            r6 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r7 == 0) goto L_0x0077
            if (r8 != 0) goto L_0x000d
            goto L_0x0077
        L_0x000d:
            r0 = 0
            long r1 = r7.getTotalBytes()     // Catch:{ Exception -> 0x0027 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0027
            long r1 = r7.getCurBytes()     // Catch:{ Exception -> 0x0027 }
            r3 = 100
            long r1 = r1 * r3
            long r3 = r7.getTotalBytes()     // Catch:{ Exception -> 0x0027 }
            long r1 = r1 / r3
            int r1 = (int) r1
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 >= 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r8.mo51415a(r7)
            java.util.Iterator r9 = r9.iterator()
        L_0x0033:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r9.next()
            com.ss.android.download.api.b.d r1 = (com.p280ss.android.download.api.p858b.C19388d) r1
            int r2 = r7.getStatus()
            switch(r2) {
                case -4: goto L_0x0063;
                case -3: goto L_0x0053;
                case -2: goto L_0x004f;
                case -1: goto L_0x004b;
                case 0: goto L_0x0046;
                case 1: goto L_0x0047;
                case 2: goto L_0x0047;
                case 3: goto L_0x0047;
                case 4: goto L_0x0047;
                case 5: goto L_0x0047;
                case 6: goto L_0x0046;
                case 7: goto L_0x0047;
                case 8: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0033
        L_0x0047:
            r1.mo51376a(r8, r0)
            goto L_0x0033
        L_0x004b:
            r1.mo51375a(r8)
            goto L_0x0033
        L_0x004f:
            r1.mo51378b(r8, r0)
            goto L_0x0033
        L_0x0053:
            com.ss.android.download.api.b.c r2 = r6.f52754a
            boolean r2 = com.p280ss.android.downloadlib.p868c.C19523h.m64323a(r2)
            if (r2 == 0) goto L_0x005f
            r1.mo51377b(r8)
            goto L_0x0033
        L_0x005f:
            r1.mo51379c(r8)
            goto L_0x0033
        L_0x0063:
            com.ss.android.download.api.b.c r2 = r6.f52754a
            boolean r2 = com.p280ss.android.downloadlib.p868c.C19523h.m64323a(r2)
            if (r2 == 0) goto L_0x0072
            r2 = -3
            r8.f52500b = r2
            r1.mo51377b(r8)
            goto L_0x0033
        L_0x0072:
            r1.mo51373a()
            goto L_0x0033
        L_0x0076:
            return
        L_0x0077:
            java.util.Iterator r7 = r9.iterator()
        L_0x007b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x008b
            java.lang.Object r8 = r7.next()
            com.ss.android.download.api.b.d r8 = (com.p280ss.android.download.api.p858b.C19388d) r8
            r8.mo51373a()
            goto L_0x007b
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.addownload.C19484h.mo51579a(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.download.api.model.e, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo51520a(Message message) {
        if (message.what == 1 && this.f52755b != null && this.f52755b.mo50970x()) {
            C19372a k = C19491j.m64230k();
            if (k != null && k.mo51355a()) {
                C19444a.m63957a();
                C19444a.m63963a(this.f52755b, this.f52754a);
            }
        }
    }

    /* renamed from: g */
    private boolean m64148g() {
        if (!m64149h() || !m64150i()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m64150i() {
        if (this.f52756c == null || !this.f52756c.mo50937d()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m64146f() {
        if (!C19523h.m64323a(this.f52754a) || C19490i.m64200a(this.f52758e)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m64149h() {
        if (this.f52754a == null || TextUtils.isEmpty(this.f52754a.mo50997f()) || TextUtils.isEmpty(this.f52754a.mo50992a())) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m64154m() {
        if (this.f52760g != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.f52760g.sendMessageDelayed(obtain, 1200);
        }
    }

    /* renamed from: p */
    private void m64157p() {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            C19490i.m64193a(this.f52754a, this.f52755b);
        }
    }

    /* renamed from: j */
    private void m64151j() {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            String f = this.f52755b.mo50952f();
            String n = this.f52755b.mo50960n();
            if (TextUtils.isEmpty(f)) {
                f = this.f52755b.mo50947a();
            }
            if (TextUtils.isEmpty(n)) {
                n = "click_pause";
            }
            C19490i.m64195a(f, n, this.f52755b.mo50967u(), this.f52755b.mo50972z(), this.f52754a);
        }
    }

    /* renamed from: k */
    private void m64152k() {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            String g = this.f52755b.mo50953g();
            String o = this.f52755b.mo50961o();
            if (TextUtils.isEmpty(g)) {
                g = this.f52755b.mo50947a();
            }
            if (TextUtils.isEmpty(o)) {
                o = "click_continue";
            }
            C19490i.m64195a(g, o, this.f52755b.mo50967u(), this.f52755b.mo50972z(), this.f52754a);
        }
    }

    /* renamed from: l */
    private void m64153l() {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            String h = this.f52755b.mo50954h();
            String p = this.f52755b.mo50962p();
            if (TextUtils.isEmpty(h)) {
                h = this.f52755b.mo50947a();
            }
            if (TextUtils.isEmpty(p)) {
                p = "click_install";
            }
            C19490i.m64195a(h, p, this.f52755b.mo50967u(), this.f52755b.mo50972z(), this.f52754a);
        }
    }

    /* renamed from: n */
    private void m64155n() {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            String i = this.f52755b.mo50955i();
            String q = this.f52755b.mo50963q();
            if (TextUtils.isEmpty(i)) {
                i = this.f52755b.mo50947a();
            }
            if (TextUtils.isEmpty(q)) {
                q = "click_open";
            }
            C19490i.m64195a(i, q, this.f52755b.mo50967u(), this.f52755b.mo50972z(), this.f52754a);
        }
    }

    /* renamed from: o */
    private void m64156o() {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            String j = this.f52755b.mo50956j();
            String r = this.f52755b.mo50964r();
            if (TextUtils.isEmpty(j)) {
                j = this.f52755b.mo50947a();
            }
            if (TextUtils.isEmpty(r)) {
                r = "open";
            }
            C19490i.m64195a(j, r, this.f52755b.mo50967u(), this.f52755b.mo50972z(), this.f52754a);
        }
    }

    /* renamed from: q */
    private void m64158q() {
        try {
            if (this.f52754a != null) {
                if (this.f52755b != null) {
                    C19490i.m64198a(this.f52755b.mo50947a(), "deeplink_url_true", this.f52754a.mo51008q(), this.f52754a.mo50995d(), this.f52754a.mo51009r(), this.f52754a.mo50996e(), 1, this.f52755b.mo50972z());
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo51586c() {
        if (C19490i.m64201a(this.f52754a) && !C19523h.m64323a(this.f52754a)) {
            C19459b.m64016a().mo51522a(this.f52754a.mo51010s(), this.f52754a.mo50995d());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo51590e() {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            String k = this.f52755b.mo50957k();
            String s = this.f52755b.mo50965s();
            if (TextUtils.isEmpty(k)) {
                k = this.f52755b.mo50947a();
            }
            if (TextUtils.isEmpty(s)) {
                s = "storage_deny";
            }
            C19490i.m64195a(k, s, this.f52755b.mo50967u(), this.f52755b.mo50972z(), this.f52754a);
        }
    }

    /* renamed from: b */
    public final void mo51583b() {
        if (TextUtils.equals(this.f52754a.mo50992a(), C19459b.m64016a().mo51523b().f52685a)) {
            this.f52755b = C19459b.m64016a().mo51523b().f52686b;
            mo51575a(C19459b.m64016a().mo51523b().f52687c);
        }
        C19459b.m64016a().mo51523b().mo51524a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo51589d() {
        if (this.f52755b != null && this.f52755b.mo50970x()) {
            String c = this.f52755b.mo50949c();
            String t = this.f52755b.mo50966t();
            JSONObject a = C19523h.m64311a(this.f52754a.mo51013v());
            try {
                a.putOpt("download_time", Integer.valueOf(0));
                a.putOpt("fail_status", Integer.valueOf(-100));
                a.putOpt("fail_msg", "start download failed, id=0");
            } catch (JSONException unused) {
            }
            if (TextUtils.isEmpty(c)) {
                c = "embeded_ad";
            }
            String str = c;
            if (TextUtils.isEmpty(t)) {
                t = "download_failed";
            }
            C19490i.m64197a(str, t, a, this.f52755b.mo50967u(), this.f52755b.mo50972z(), this.f52754a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51571a() {
        if (C19490i.m64203b(this.f52758e) && this.f52757d != null) {
            C19393b bVar = new C19393b();
            bVar.f52444a = this.f52754a.mo50995d();
            bVar.f52445b = this.f52754a.mo50996e();
            bVar.f52447d = this.f52757d.f52447d;
            bVar.f52449f = this.f52754a.mo51009r();
            C19456a.m63995a().mo51514a(this.f52754a.mo51010s(), bVar);
            m64158q();
        }
    }

    /* renamed from: f */
    private static boolean m64147f(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.getStatus() != -3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo51570a(boolean z) {
        if (!m64146f() || !z) {
            return 0;
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo51588c(final boolean z) {
        if (this.f52761h == null) {
            this.f52761h = new C19489b() {
                /* renamed from: a */
                public final void mo51591a(DownloadInfo downloadInfo) {
                    Object obj;
                    if (!(C19484h.this.f52755b == null || !C19484h.this.f52755b.mo50970x() || C19491j.m64220b() == null)) {
                        JSONObject jSONObject = new JSONObject();
                        m64186a(downloadInfo, jSONObject);
                        String e = C19484h.this.f52755b.mo50951e();
                        String m = C19484h.this.f52755b.mo50959m();
                        C19399a aVar = new C19399a();
                        if (TextUtils.isEmpty(e)) {
                            e = C19484h.this.f52755b.mo50947a();
                        }
                        C19399a b = aVar.mo51411b(e);
                        if (TextUtils.isEmpty(m)) {
                            m = "click_start";
                        }
                        C19399a a = b.mo51413c(m).mo51412b(C19484h.this.f52754a.mo51008q()).mo51403a(C19484h.this.f52754a.mo50995d()).mo51414d(C19484h.this.f52754a.mo51009r()).mo51410b(C19484h.this.f52754a.mo50996e()).mo51407a(jSONObject).mo51402a(1);
                        if (C19484h.this.f52755b != null) {
                            obj = C19484h.this.f52755b.mo50967u();
                        } else {
                            obj = null;
                        }
                        C19398d a2 = a.mo51404a(obj).mo51408a(z).mo51409a();
                        if (z) {
                            C19491j.m64220b().mo51357a(a2);
                            return;
                        }
                        C19491j.m64220b().onEvent(a2);
                    }
                }

                /* renamed from: a */
                private void m64186a(DownloadInfo downloadInfo, JSONObject jSONObject) {
                    try {
                        JSONObject v = C19484h.this.f52754a.mo51013v();
                        if (v != null) {
                            C19523h.m64316a(v, jSONObject);
                        }
                        if (downloadInfo != null) {
                            jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
                            jSONObject.put("chunk_count", downloadInfo.getChunkCount());
                            jSONObject.put("download_url", downloadInfo.getUrl());
                            jSONObject.put("app_name", downloadInfo.getTitle());
                            jSONObject.put("network_quality", downloadInfo.getNetworkQuality());
                            jSONObject.put("only_wifi", downloadInfo.isOnlyWifi() ? 1 : 0);
                        }
                    } catch (Exception unused) {
                    }
                }
            };
        }
    }

    /* renamed from: d */
    private boolean m64144d(DownloadInfo downloadInfo) {
        if (!m64147f(downloadInfo) || this.f52754a == null || C19523h.m64323a(this.f52754a)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m64145e(DownloadInfo downloadInfo) {
        if (!m64147f(downloadInfo) || !C19490i.m64200a(this.f52758e)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51575a(C19384a aVar) {
        this.f52756c = aVar;
        this.f52758e = aVar.mo50934a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo51584b(DownloadInfo downloadInfo) {
        if (m64144d(downloadInfo) || m64145e(downloadInfo)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<C19388d> m64139a(Map<Integer, C19388d> map) {
        ArrayList arrayList = new ArrayList();
        if (map == null || map.isEmpty()) {
            return arrayList;
        }
        for (C19388d dVar : map.values()) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m64143b(final C19382k kVar) {
        if (C19519e.m64291b("android.permission.WRITE_EXTERNAL_STORAGE")) {
            kVar.mo51367a();
            return;
        }
        C19459b.m64016a().mo51523b().mo51525a(this.f52754a.mo50992a(), this.f52755b, this.f52756c);
        C19519e.m64290a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, (C19520a) new C19520a() {
            /* renamed from: a */
            public final void mo51485a() {
                C19484h.this.mo51583b();
                if (kVar != null) {
                    kVar.mo51367a();
                }
            }

            /* renamed from: a */
            public final void mo51486a(String str) {
                C19484h.this.mo51583b();
                if (kVar != null) {
                    kVar.mo51368a(str);
                }
            }
        });
    }

    /* renamed from: a */
    private boolean m64140a(int i) {
        if (C19523h.m64323a(this.f52754a)) {
            return false;
        }
        if ((this.f52756c.mo50935b() == 2 && i == 2) || this.f52756c.mo50935b() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m64141a(Context context) {
        if (context == null || this.f52757d == null) {
            return false;
        }
        String str = this.f52757d.f52447d;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            C19523h.m64333d(context, str);
        } catch (OpenAppException e) {
            if (e.getFinalStatus() == 1) {
                m64156o();
                C19491j.m64222c();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo51585b(boolean z) {
        if (z || this.f52756c == null || this.f52756c.mo50935b() != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo51587c(DownloadInfo downloadInfo) {
        if (this.f52754a != null && downloadInfo != null && downloadInfo.getId() != 0) {
            int status = downloadInfo.getStatus();
            switch (status) {
                case -4:
                case -1:
                    if (C19490i.m64204b(this.f52754a)) {
                        mo51580a((String) null, this.f52755b.mo50972z());
                    } else {
                        mo51588c(this.f52755b.mo50972z());
                    }
                    if (this.f52755b != null && this.f52755b.mo50971y()) {
                        C19444a.m63957a().mo51493a(new C19236a(this.f52754a, this.f52755b.mo50972z(), (long) downloadInfo.getId()));
                        break;
                    }
                case ImageFrame.NV21 /*-3*/:
                    if (!C19523h.m64323a(this.f52754a)) {
                        m64153l();
                        m64154m();
                        break;
                    } else {
                        m64155n();
                        break;
                    }
                case -2:
                    m64152k();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                    m64151j();
                    break;
            }
            if (status == -1 || status == -4) {
                mo51572a(2);
                return;
            }
            if (C19490i.m64201a(this.f52754a)) {
                mo51572a(2);
            }
        }
    }

    /* renamed from: a */
    private boolean m64142a(Context context, int i) {
        String str;
        Context context2 = context;
        if (context2 == null) {
            return false;
        }
        if (this.f52757d == null) {
            str = "";
        } else {
            str = this.f52757d.f52447d;
        }
        String s = this.f52754a.mo51010s();
        try {
            if (!m64140a(i) || TextUtils.isEmpty(s) || C19491j.m64228i().optInt("disable_market") == 1) {
                C19523h.m64315a(context2, str, this.f52754a);
            } else {
                C19523h.m64331c(context2, this.f52754a.mo51010s());
            }
        } catch (OpenAppException e) {
            switch (e.getFinalStatus()) {
                case 1:
                    m64156o();
                    C19491j.m64222c();
                    return true;
                case 2:
                    m64155n();
                    C19491j.m64222c();
                    return true;
                case 3:
                    mo51572a(2);
                    mo51581a(true, (long) e.getExtStatus(), this.f52754a.mo50996e(), s);
                    C19491j.m64222c();
                    C19456a.m63995a().mo51510a(this.f52754a.mo50995d(), this.f52754a.mo50996e(), this.f52754a.mo51009r(), this.f52754a.mo50997f(), this.f52754a.mo51010s());
                    if (this.f52755b.mo50971y()) {
                        C19236a aVar = new C19236a(this.f52754a, this.f52755b.mo50972z(), 0);
                        aVar.f52025d = 2;
                        aVar.f52030i = System.currentTimeMillis();
                        aVar.f52034m = 4;
                        C19444a.m63957a().mo51493a(aVar);
                    }
                    return true;
                case 4:
                    mo51581a(false, (long) e.getExtStatus(), this.f52754a.mo50996e(), s);
                    break;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo51569a(Context context, IDownloadListener iDownloadListener) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Context context2 = context;
        if (context2 == null) {
            return 0;
        }
        Map h = this.f52754a.mo50999h();
        ArrayList arrayList = new ArrayList();
        if (h != null) {
            for (Entry entry : h.entrySet()) {
                if (entry != null) {
                    arrayList.add(new HttpHeader((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        String valueOf = String.valueOf(this.f52754a.mo50995d());
        long e = this.f52754a.mo50996e();
        String r = this.f52754a.mo51009r();
        if (this.f52756c == null || !this.f52756c.mo50936c()) {
            z = false;
        } else {
            z = true;
        }
        String a = C19517c.m64285a(valueOf, e, 0, r, z, this.f52754a.mo51013v(), this.f52754a.mo50994c(), this.f52754a.mo51004m());
        C19495l a2 = C19495l.m64244a(this.f52754a.mo51004m());
        AppTaskBuilder headConnectionAvailable = new AppTaskBuilder(context2, this.f52754a.mo50992a()).backUpUrls(this.f52754a.mo50993b()).name(this.f52754a.mo50997f()).extra(a).mimeType(this.f52754a.mo50998g()).headers(arrayList).showNotification(this.f52754a.mo51001j()).needWifi(this.f52754a.mo51002k()).savePath(this.f52754a.mo51003l()).mainThreadListener(iDownloadListener).mimeType("application/vnd.android.package-archive").needIndependentProcess(this.f52754a.mo51005n()).fileUriProvider(this.f52754a.mo51017z()).autoInstallWithoutNotification(this.f52754a.mo51016y()).packageName(this.f52754a.mo51010s()).minProgressTimeMsInterval(1000).maxProgressCount(100).needDefaultHttpServiceBackUp(true).needReuseFirstConnection(true).retryCount(a2.mo51596a("retry_count", 5)).backUpUrlRetryCount(a2.mo51596a("backup_url_retry_count", 0)).needReuseFirstConnection(true).headConnectionAvailable(true);
        if (a2.mo51596a("need_https_to_http_retry", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AppTaskBuilder needHttpsToHttpRetry = headConnectionAvailable.needHttpsToHttpRetry(z2);
        if (a2.mo51596a("need_chunk_downgrade_retry", 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AppTaskBuilder needChunkDowngradeRetry = needHttpsToHttpRetry.needChunkDowngradeRetry(z3);
        if (a2.mo51596a("need_retry_delay", 0) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        AppTaskBuilder retryDelayTimeArray = needChunkDowngradeRetry.needRetryDelay(z4).retryDelayTimeArray(a2.mo51598a("retry_delay_time_array"));
        if (a2.mo51596a("need_reuse_runnable", 0) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        AppTaskBuilder failedResumeMaxCount = retryDelayTimeArray.needReuseChunkRunnable(z5).retryScheduleMinutes(a2.mo51596a("retry_schedule_minutes", 0)).failedResumeMinInterval(a2.mo51597a("failed_resume_min_interval", -1)).failedResumeMaxCount(a2.mo51596a("failed_resume_max_count", -1));
        if (a2.mo51596a("failed_resume_need_wifi", 1) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        AppTaskBuilder failedResumeNeedWifi = failedResumeMaxCount.failedResumeNeedWifi(z6);
        if (a2.mo51596a("failed_resume_need_wait_wifi", 0) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        AppTaskBuilder failedResumeNeedWaitWifi = failedResumeNeedWifi.failedResumeNeedWaitWifi(z7);
        if (a2.mo51596a("need_independent_process", 0) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        AppTaskBuilder adjustChunkCalculator = failedResumeNeedWaitWifi.needIndependentProcess(z8).chunkStrategy(a2.mo51602d(this.f52754a.mo50992a())).adjustChunkCalculator(a2.mo51599b());
        C19468a aVar = null;
        if (a2.mo51596a("exec_clear_space_switch", 0) == 1 && a2.mo51596a("clear_space_use_disk_handler", 0) == 1) {
            aVar = new C19468a();
            adjustChunkCalculator.diskSpaceHandler(aVar);
        }
        int a3 = C19490i.m64190a(this.f52754a.mo51000i(), m64148g(), this.f52754a.mo51013v(), adjustChunkCalculator);
        if (aVar != null) {
            aVar.f52716a = a3;
        }
        C19495l.m64246a(a3, a2);
        m64157p();
        return a3;
    }
}
