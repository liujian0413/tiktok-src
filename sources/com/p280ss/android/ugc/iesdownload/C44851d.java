package com.p280ss.android.ugc.iesdownload;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.p280ss.android.ugc.iesdownload.p1744a.C44842a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44848c;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.io.File;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.iesdownload.d */
public final class C44851d {

    /* renamed from: a */
    private static Context f115336a;

    /* renamed from: b */
    private OkHttpClient f115337b;

    /* renamed from: c */
    private C44854e f115338c;

    /* renamed from: d */
    private C44857f f115339d;

    /* renamed from: com.ss.android.ugc.iesdownload.d$a */
    static class C44853a {

        /* renamed from: a */
        public static final C44851d f115340a = new C44851d();
    }

    private C44851d() {
    }

    /* renamed from: d */
    private static boolean m141540d() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: a */
    public static C44851d m141532a() {
        C44851d dVar = C44853a.f115340a;
        if (f115336a == null) {
            f115336a = IesDownLoadConfigProvider.getInstance().getContext();
        }
        return dVar;
    }

    /* renamed from: b */
    public static long m141538b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: c */
    public static long m141539c() {
        if (!m141540d()) {
            return -1;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: a */
    private static boolean m141536a(String str) {
        return URLUtil.isNetworkUrl(str);
    }

    /* renamed from: a */
    private boolean m141535a(C44849d dVar) {
        String str = this.f115338c.f115342b;
        String str2 = this.f115338c.f115343c;
        if (m141537a(str, str2) && m141536a(str)) {
            return true;
        }
        dVar.mo59411a(C44850c.m141527a().mo107289a(2).mo107291a(str, str2));
        return false;
    }

    /* renamed from: a */
    private static boolean m141537a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m141533a(C44849d dVar, C44842a aVar) {
        if (!TextUtils.isEmpty(this.f115338c.f115343c)) {
            File file = new File(this.f115338c.f115343c);
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            m141534a(this.f115338c, dVar, aVar);
            return;
        }
        m141534a(this.f115338c, dVar, aVar);
    }

    /* renamed from: a */
    public final void mo107292a(C44854e eVar, C44849d dVar) {
        if (eVar.f115351k != null) {
            this.f115337b = eVar.f115351k;
        }
        if (eVar != null && dVar != null) {
            C44842a a = C44842a.m141513a(f115336a);
            this.f115338c = eVar;
            if (m141535a(dVar)) {
                m141533a(dVar, a);
            }
        }
    }

    /* renamed from: a */
    public final void mo107293a(String str, C44848c cVar) {
        if (!m141536a(str)) {
            cVar.mo59411a(C44850c.m141527a().mo107289a(2));
            return;
        }
        if (this.f115339d == null) {
            this.f115339d = new C44857f(f115336a, this.f115337b, C44842a.m141513a(f115336a));
        }
        this.f115339d.mo107301a(str, cVar);
    }

    /* renamed from: a */
    private void m141534a(C44854e eVar, C44849d dVar, C44842a aVar) {
        if (!m141536a(eVar.f115342b)) {
            dVar.mo59411a(C44850c.m141527a().mo107289a(2));
            return;
        }
        if (this.f115339d == null) {
            this.f115339d = new C44857f(f115336a, this.f115337b, aVar);
        }
        this.f115339d.mo107300a(eVar, dVar);
    }
}
