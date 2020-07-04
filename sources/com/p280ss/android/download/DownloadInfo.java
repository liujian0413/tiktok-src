package com.p280ss.android.download;

import android.app.NotificationManager;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.p280ss.android.download.p861b.C19405c.C19406a;
import com.p280ss.android.download.p861b.C19407d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.download.DownloadInfo */
public final class DownloadInfo {

    /* renamed from: A */
    public String f52314A;

    /* renamed from: B */
    public String f52315B;

    /* renamed from: C */
    public int f52316C;

    /* renamed from: D */
    public int f52317D;

    /* renamed from: E */
    public List<Pair<String, String>> f52318E;

    /* renamed from: F */
    private Future<?> f52319F;

    /* renamed from: G */
    private C19428h f52320G;

    /* renamed from: H */
    private final Context f52321H;

    /* renamed from: I */
    private NotificationManager f52322I;

    /* renamed from: J */
    private final C19439q f52323J;

    /* renamed from: K */
    private final C19437p f52324K;

    /* renamed from: L */
    private final C19414d f52325L;

    /* renamed from: a */
    public long f52326a;

    /* renamed from: b */
    public String f52327b;

    /* renamed from: c */
    public boolean f52328c;

    /* renamed from: d */
    public String f52329d;

    /* renamed from: e */
    public String f52330e;

    /* renamed from: f */
    public String f52331f;

    /* renamed from: g */
    public int f52332g;

    /* renamed from: h */
    public int f52333h;

    /* renamed from: i */
    public int f52334i;

    /* renamed from: j */
    public int f52335j;

    /* renamed from: k */
    public int f52336k;

    /* renamed from: l */
    public int f52337l;

    /* renamed from: m */
    public long f52338m;

    /* renamed from: n */
    public String f52339n;

    /* renamed from: o */
    public String f52340o;

    /* renamed from: p */
    public String f52341p;

    /* renamed from: q */
    public String f52342q;

    /* renamed from: r */
    public String f52343r;

    /* renamed from: s */
    public long f52344s;

    /* renamed from: t */
    public long f52345t;

    /* renamed from: u */
    public String f52346u;

    /* renamed from: v */
    public int f52347v;

    /* renamed from: w */
    public boolean f52348w;

    /* renamed from: x */
    public String f52349x;

    /* renamed from: y */
    public int f52350y;

    /* renamed from: z */
    public boolean f52351z;

    /* renamed from: com.ss.android.download.DownloadInfo$NetworkState */
    public enum NetworkState {
        OK,
        NO_CONNECTION,
        UNUSABLE_DUE_TO_SIZE,
        RECOMMENDED_UNUSABLE_DUE_TO_SIZE,
        CANNOT_USE_ROAMING,
        TYPE_DISALLOWED_BY_REQUESTOR
    }

    /* renamed from: com.ss.android.download.DownloadInfo$a */
    public static class C19353a {

        /* renamed from: a */
        private C19422f f52353a;

        /* renamed from: b */
        private Cursor f52354b;

        /* renamed from: a */
        private String m63520a(String str) {
            String string = this.f52354b.getString(this.f52354b.getColumnIndexOrThrow(str));
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string;
        }

        /* renamed from: b */
        private Integer m63522b(String str) {
            return Integer.valueOf(this.f52354b.getInt(this.f52354b.getColumnIndexOrThrow(str)));
        }

        /* renamed from: c */
        private Long m63524c(String str) {
            return Long.valueOf(this.f52354b.getLong(this.f52354b.getColumnIndexOrThrow(str)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r0.close();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m63523b(com.p280ss.android.download.DownloadInfo r9) {
            /*
                r8 = this;
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> r0 = r9.f52318E
                r0.clear()
                android.net.Uri r0 = r9.mo51306e()
                java.lang.String r1 = "headers"
                android.net.Uri r3 = android.net.Uri.withAppendedPath(r0, r1)
                com.ss.android.download.f r2 = r8.f52353a
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                android.database.Cursor r0 = r2.mo51451a(r3, r4, r5, r6, r7)
                java.lang.String r1 = "header"
                int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x004c, all -> 0x0045 }
                java.lang.String r2 = "value"
                int r2 = r0.getColumnIndexOrThrow(r2)     // Catch:{ Exception -> 0x004c, all -> 0x0045 }
                r0.moveToFirst()     // Catch:{ Exception -> 0x004c, all -> 0x0045 }
            L_0x0028:
                boolean r3 = r0.isAfterLast()     // Catch:{ Exception -> 0x004c, all -> 0x0045 }
                if (r3 != 0) goto L_0x003d
                java.lang.String r3 = r0.getString(r1)     // Catch:{ Exception -> 0x004c, all -> 0x0045 }
                java.lang.String r4 = r0.getString(r2)     // Catch:{ Exception -> 0x004c, all -> 0x0045 }
                m63521a(r9, r3, r4)     // Catch:{ Exception -> 0x004c, all -> 0x0045 }
                r0.moveToNext()     // Catch:{ Exception -> 0x004c, all -> 0x0045 }
                goto L_0x0028
            L_0x003d:
                if (r0 == 0) goto L_0x004f
            L_0x003f:
                r0.close()     // Catch:{ Exception -> 0x0043 }
                goto L_0x004f
            L_0x0043:
                goto L_0x004f
            L_0x0045:
                r9 = move-exception
                if (r0 == 0) goto L_0x004b
                r0.close()     // Catch:{ Exception -> 0x004b }
            L_0x004b:
                throw r9
            L_0x004c:
                if (r0 == 0) goto L_0x004f
                goto L_0x003f
            L_0x004f:
                java.lang.String r0 = r9.f52341p
                if (r0 == 0) goto L_0x005a
                java.lang.String r0 = "Cookie"
                java.lang.String r1 = r9.f52341p
                m63521a(r9, r0, r1)
            L_0x005a:
                java.lang.String r0 = r9.f52343r
                if (r0 == 0) goto L_0x0065
                java.lang.String r0 = "Referer"
                java.lang.String r1 = r9.f52343r
                m63521a(r9, r0, r1)
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.DownloadInfo.C19353a.m63523b(com.ss.android.download.DownloadInfo):void");
        }

        /* renamed from: a */
        public final void mo51308a(DownloadInfo downloadInfo) {
            boolean z;
            boolean z2;
            downloadInfo.f52326a = m63524c("_id").longValue();
            downloadInfo.f52327b = m63520a("uri");
            boolean z3 = false;
            if (m63522b("no_integrity").intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            downloadInfo.f52328c = z;
            downloadInfo.f52329d = m63520a("hint");
            downloadInfo.f52330e = m63520a("_data");
            downloadInfo.f52331f = m63520a("mimetype");
            downloadInfo.f52332g = m63522b("destination").intValue();
            downloadInfo.f52333h = m63522b("visibility").intValue();
            downloadInfo.f52335j = m63522b("status").intValue();
            downloadInfo.f52336k = m63522b("numfailed").intValue();
            downloadInfo.f52337l = m63522b("method").intValue() & 268435455;
            downloadInfo.f52338m = m63524c("lastmod").longValue();
            downloadInfo.f52339n = m63520a("notificationpackage");
            downloadInfo.f52340o = m63520a("notificationextras");
            downloadInfo.f52341p = m63520a("cookiedata");
            downloadInfo.f52342q = m63520a("useragent");
            downloadInfo.f52343r = m63520a("referer");
            downloadInfo.f52344s = m63524c("total_bytes").longValue();
            downloadInfo.f52345t = m63524c("current_bytes").longValue();
            downloadInfo.f52346u = m63520a("etag");
            downloadInfo.f52347v = m63522b("scanned").intValue();
            if (m63522b("deleted").intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            downloadInfo.f52348w = z2;
            downloadInfo.f52349x = m63520a("mediaprovider_uri");
            downloadInfo.f52350y = m63522b("allowed_network_types").intValue();
            if (m63522b("allow_roaming").intValue() != 0) {
                z3 = true;
            }
            downloadInfo.f52351z = z3;
            downloadInfo.f52314A = m63520a("title");
            downloadInfo.f52315B = m63520a("description");
            downloadInfo.f52316C = m63522b("bypass_recommended_size_limit").intValue();
            synchronized (this) {
                downloadInfo.f52334i = m63522b("control").intValue();
            }
        }

        public C19353a(C19422f fVar, Cursor cursor) {
            this.f52353a = fVar;
            this.f52354b = cursor;
        }

        /* renamed from: a */
        private static void m63521a(DownloadInfo downloadInfo, String str, String str2) {
            downloadInfo.f52318E.add(Pair.create(str, str2));
        }

        /* renamed from: a */
        public final DownloadInfo mo51307a(Context context, C19439q qVar, C19437p pVar, C19414d dVar) {
            DownloadInfo downloadInfo = new DownloadInfo(context, qVar, pVar, dVar);
            mo51308a(downloadInfo);
            m63523b(downloadInfo);
            return downloadInfo;
        }
    }

    /* renamed from: b */
    private static int m63504b(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public final Collection<Pair<String, String>> mo51298a() {
        return Collections.unmodifiableList(this.f52318E);
    }

    /* renamed from: e */
    public final Uri mo51306e() {
        return ContentUris.withAppendedId(C19406a.f52513a, this.f52326a);
    }

    /* renamed from: g */
    private boolean m63508g() {
        NetworkInfo b = this.f52323J.mo51471b();
        if (b == null || !b.isConnected() || m63504b(b.getType()) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m63509h() {
        if (this.f52347v != 0 || ((this.f52332g != 0 && this.f52332g != 1) || !C19406a.m63753a(this.f52335j))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final NetworkState mo51304c() {
        NetworkInfo b = this.f52323J.mo51471b();
        if (b == null || !b.isConnected()) {
            return NetworkState.NO_CONNECTION;
        }
        if (!this.f52323J.mo51472c() || this.f52351z) {
            return m63503a(b.getType());
        }
        return NetworkState.CANNOT_USE_ROAMING;
    }

    /* renamed from: d */
    public final void mo51305d() {
        String str = this.f52330e;
        if (this.f52330e != null) {
            File file = new File(str);
            if (this.f52335j == 200 && !file.exists()) {
                C19414d.m63796a(this.f52321H).mo51441a(C19414d.m63805b(this));
                C19422f.m63833a(this.f52321H).mo51450a(mo51306e(), (String) null, (String[]) null);
            }
        }
    }

    /* renamed from: f */
    private boolean m63507f() {
        if (this.f52334i == 1) {
            return false;
        }
        int i = this.f52335j;
        if (i == 0 || i == 190 || i == 192) {
            return true;
        }
        switch (i) {
            case 194:
                long a = this.f52323J.mo51469a();
                if (m63508g() || m63505b(a) > a) {
                    return false;
                }
                return true;
            case 195:
            case 196:
                if (m63508g() || mo51304c() != NetworkState.OK) {
                    return false;
                }
                return true;
            default:
                switch (i) {
                    case 198:
                        return false;
                    case 199:
                        return Environment.getExternalStorageState().equals("mounted");
                    default:
                        return false;
                }
        }
    }

    /* renamed from: b */
    public final void mo51303b() {
        if (this.f52339n != null) {
            Intent intent = new Intent("android.ss.intent.action.DOWNLOAD_COMPLETE");
            intent.setPackage(this.f52339n);
            intent.putExtra("extra_download_id", this.f52326a);
            intent.putExtra("extra_download_visibility", this.f52333h);
            this.f52323J.mo51470a(intent);
        }
    }

    /* renamed from: a */
    public final boolean mo51301a(C19426g gVar) {
        boolean h;
        synchronized (this) {
            h = m63509h();
            if (h) {
                gVar.mo51458a(this);
            }
        }
        return h;
    }

    /* renamed from: a */
    private NetworkState m63503a(int i) {
        boolean z;
        int b = m63504b(i);
        if (this.f52350y == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z || (b & this.f52350y) != 0) {
            return m63506c(i);
        }
        return NetworkState.TYPE_DISALLOWED_BY_REQUESTOR;
    }

    /* renamed from: b */
    private long m63505b(long j) {
        if (this.f52336k == 0) {
            return j;
        }
        if (this.f52337l > 0) {
            return this.f52338m + ((long) this.f52337l);
        }
        return this.f52338m + ((long) ((this.f52317D + 1000) * 30 * (1 << (this.f52336k - 1))));
    }

    /* renamed from: c */
    private NetworkState m63506c(int i) {
        if (this.f52344s <= 0) {
            return NetworkState.OK;
        }
        if (i == 1) {
            return NetworkState.OK;
        }
        Long d = this.f52323J.mo51473d();
        if (d != null && this.f52344s > d.longValue()) {
            return NetworkState.UNUSABLE_DUE_TO_SIZE;
        }
        if (this.f52316C == 0) {
            Long e = this.f52323J.mo51474e();
            if (e != null && this.f52344s > e.longValue()) {
                return NetworkState.RECOMMENDED_UNUSABLE_DUE_TO_SIZE;
            }
        }
        return NetworkState.OK;
    }

    /* renamed from: a */
    public final long mo51297a(long j) {
        if (C19406a.m63755c(this.f52335j)) {
            return Long.MAX_VALUE;
        }
        if (this.f52335j != 194) {
            return 0;
        }
        long b = m63505b(j);
        if (b <= j) {
            return 0;
        }
        return b - j;
    }

    /* renamed from: a */
    public final void mo51299a(C19407d dVar) {
        String str;
        String str2;
        dVar.println("DownloadInfo:");
        dVar.mo51418a();
        dVar.mo51419a("mId", Long.valueOf(this.f52326a));
        dVar.mo51419a("mLastMod", Long.valueOf(this.f52338m));
        dVar.mo51419a("mPackage", this.f52339n);
        dVar.println();
        dVar.mo51419a("mUri", this.f52327b);
        dVar.println();
        dVar.mo51419a("mMimeType", this.f52331f);
        String str3 = "mCookies";
        if (this.f52341p != null) {
            str = "yes";
        } else {
            str = "no";
        }
        dVar.mo51419a(str3, str);
        String str4 = "mReferer";
        if (this.f52343r != null) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        dVar.mo51419a(str4, str2);
        dVar.mo51419a("mUserAgent", this.f52342q);
        dVar.println();
        dVar.mo51419a("mFileName", this.f52330e);
        dVar.mo51419a("mDestination", Integer.valueOf(this.f52332g));
        dVar.println();
        dVar.mo51419a("mStatus", C19406a.m63756d(this.f52335j));
        dVar.mo51419a("mCurrentBytes", Long.valueOf(this.f52345t));
        dVar.mo51419a("mTotalBytes", Long.valueOf(this.f52344s));
        dVar.println();
        dVar.mo51419a("mNumFailed", Integer.valueOf(this.f52336k));
        dVar.mo51419a("mRetryAfter", Integer.valueOf(this.f52337l));
        dVar.mo51419a("mETag", this.f52346u);
        dVar.println();
        dVar.mo51419a("mAllowedNetworkTypes", Integer.valueOf(this.f52350y));
        dVar.mo51419a("mAllowRoaming", Boolean.valueOf(this.f52351z));
        dVar.println();
        dVar.mo51420b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51300a(boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(mo51306e());
        intent.setClassName(this.f52321H.getPackageName(), SizeLimitActivity.class.getName());
        intent.setFlags(268435456);
        intent.putExtra("isWifiRequired", z);
        this.f52321H.startActivity(intent);
    }

    /* renamed from: a */
    public final boolean mo51302a(ExecutorService executorService) {
        boolean f;
        boolean z;
        synchronized (this) {
            f = m63507f();
            if (this.f52319F == null || this.f52319F.isDone()) {
                z = false;
            } else {
                z = true;
            }
            if (f && !z) {
                if (this.f52335j != 192) {
                    this.f52335j = 192;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("status", Integer.valueOf(this.f52335j));
                    C19422f.m63833a(this.f52321H).mo51449a(mo51306e(), contentValues, (String) null, (String[]) null);
                }
                C19428h hVar = new C19428h(this.f52321H, this.f52323J, this, this.f52324K, this.f52325L);
                this.f52320G = hVar;
                this.f52319F = executorService.submit(this.f52320G);
            }
        }
        return f;
    }

    /* renamed from: a */
    public static int m63502a(C19422f fVar, long j) {
        boolean a = fVar.mo51451a(ContentUris.withAppendedId(C19406a.f52513a, j), new String[]{"status"}, (String) null, (String[]) null, (String) null);
        try {
            a = a.moveToFirst();
            if (a) {
                int i = a.getInt(0);
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused) {
                    }
                }
                return i;
            }
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused2) {
                }
            }
            return 190;
        } finally {
            if (a != null) {
                try {
                    a.close();
                } catch (Exception unused3) {
                }
            }
        }
    }

    private DownloadInfo(Context context, C19439q qVar, C19437p pVar, C19414d dVar) {
        this.f52318E = new ArrayList();
        this.f52321H = context;
        this.f52322I = (NotificationManager) this.f52321H.getSystemService("notification");
        this.f52323J = qVar;
        this.f52324K = pVar;
        this.f52325L = dVar;
        this.f52317D = C19431j.f52610a.nextInt(1001);
    }
}
