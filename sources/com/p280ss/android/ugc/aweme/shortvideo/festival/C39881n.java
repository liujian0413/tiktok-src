package com.p280ss.android.ugc.aweme.shortvideo.festival;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1288h.C30218a.C30219a;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.n */
public class C39881n extends AbsDownloadListener {

    /* renamed from: a */
    private static volatile C39881n f103625a;

    /* renamed from: b */
    private static final String f103626b;

    /* renamed from: c */
    private static final String f103627c;

    /* renamed from: d */
    private String f103628d = "";

    /* renamed from: e */
    private boolean f103629e;

    /* renamed from: e */
    private static String m127629e() {
        return f103627c;
    }

    /* renamed from: g */
    private static C30219a m127631g() {
        C30221c a = C39874g.m127611a();
        if (a == null) {
            return null;
        }
        return a.f79516f;
    }

    /* renamed from: c */
    public final String mo99303c() {
        if (C39874g.m127612b()) {
            return this.f103628d;
        }
        return "";
    }

    /* renamed from: a */
    public static C39881n m127622a() {
        if (f103625a == null) {
            synchronized (C39881n.class) {
                if (f103625a == null) {
                    f103625a = new C39881n();
                }
            }
        }
        return f103625a;
    }

    /* renamed from: d */
    private boolean m127628d() {
        String f = m127630f();
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        File file = new File(m127623a(f));
        if (!file.exists() || !file.isDirectory() || file.listFiles().length <= 0) {
            return false;
        }
        this.f103628d = file.getPath();
        return true;
    }

    /* renamed from: f */
    private String m127630f() {
        C30219a g = m127631g();
        if (g == null || g.f79503a == null) {
            return null;
        }
        UrlModel urlModel = g.f79503a;
        if (urlModel == null || C6311g.m19573a(urlModel.getUrlList())) {
            return null;
        }
        return (String) urlModel.getUrlList().get(0);
    }

    /* renamed from: b */
    public final void mo99302b() {
        if (!C39874g.m127612b()) {
            C42973bg.m136431c(f103627c);
        } else if (!m127628d() && !this.f103629e) {
            this.f103629e = true;
            this.f103628d = "";
            C42973bg.m136431c(f103627c);
            C42973bg.m136422a(f103627c, false);
            m127627c(m127630f());
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().shortVideoRootDir());
        sb.append("share");
        sb.append(File.separator);
        f103626b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f103626b);
        sb2.append("water");
        sb2.append(File.separator);
        f103627c = sb2.toString();
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        m127625a(downloadInfo);
    }

    /* renamed from: b */
    private String m127626b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m127629e());
        sb.append(m127624a(str, true));
        return sb.toString();
    }

    /* renamed from: a */
    private String m127623a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m127629e());
        sb.append(m127624a(str, false));
        return sb.toString();
    }

    /* renamed from: c */
    private void m127627c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Downloader.with(C6399b.m19921a()).url(str).name(m127624a(str, true)).savePath(m127629e()).subThreadListener(this).download();
        }
    }

    /* renamed from: a */
    private void m127625a(DownloadInfo downloadInfo) {
        File file = new File(m127626b(downloadInfo.getUrl()));
        if (m127631g() == null || !C39875h.m127613a(file, m127631g().f79504b)) {
            C42973bg.m136431c(f103627c);
            return;
        }
        String a = m127623a(downloadInfo.getUrl());
        C42973bg.m136422a(a, false);
        File file2 = new File(a);
        if (!file2.exists() || !file2.isDirectory() || file2.listFiles().length <= 0) {
            try {
                C43136fo.m136824a(file, file2);
                if (file.exists()) {
                    file.delete();
                }
                this.f103628d = file2.getPath();
            } catch (Exception unused) {
            }
        } else {
            this.f103628d = file2.getPath();
        }
    }

    /* renamed from: a */
    private static String m127624a(String str, boolean z) {
        String a = C6306c.m19561a(str);
        if (!z) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".zip");
        return sb.toString();
    }
}
