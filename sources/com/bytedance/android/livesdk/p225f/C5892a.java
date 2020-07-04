package com.bytedance.android.livesdk.p225f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.p022v4.content.FileProvider;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3388h;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.android.livesdk.f.a */
public final class C5892a {

    /* renamed from: a */
    public static Set<String> f17432a = new HashSet();

    /* renamed from: c */
    private static AtomicInteger f17433c;

    /* renamed from: b */
    public String f17434b;

    /* renamed from: d */
    private File f17435d;

    /* renamed from: e */
    private String f17436e;

    /* renamed from: f */
    private boolean f17437f;

    /* renamed from: g */
    private boolean f17438g;

    /* renamed from: h */
    private String f17439h;

    /* renamed from: b */
    private void m18406b() {
        if (!this.f17437f) {
            try {
                this.f17436e = m18409d();
                boolean z = false;
                if (this.f17436e != null) {
                    File file = new File(this.f17436e);
                    this.f17435d = file;
                    z = C3388h.m12605a(file);
                }
                if (z) {
                    this.f17437f = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private static String m18410e() {
        if (f17433c == null) {
            f17433c = new AtomicInteger();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(System.currentTimeMillis()));
        sb.append(f17433c.incrementAndGet());
        return sb.toString();
    }

    /* renamed from: c */
    private void m18408c() {
        File[] listFiles;
        File file = this.f17435d;
        if (file == null && this.f17436e != null) {
            file = new File(this.f17436e);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (file != null && file.exists() && file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                if (file2 != null && currentTimeMillis - file2.lastModified() > 600000) {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: d */
    private static String m18409d() {
        Context e = C3358ac.m12528e();
        File externalCacheDir = e.getExternalCacheDir();
        if (externalCacheDir != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(externalCacheDir.getAbsolutePath());
            sb.append("/apk");
            return sb.toString();
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(absolutePath);
        sb2.append("/Android/data/");
        sb2.append(e.getPackageName());
        sb2.append("/files/apk");
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo14422a() {
        String str;
        if (!this.f17438g) {
            this.f17438g = true;
            if (this.f17435d != null && this.f17435d.exists() && !C6319n.m19593a(this.f17434b)) {
                try {
                    m18408c();
                } catch (Exception unused) {
                }
                String e = m18410e();
                if (!f17432a.contains(this.f17434b)) {
                    if (this.f17439h == null) {
                        str = "";
                    } else {
                        str = this.f17439h;
                    }
                    C9049ap.m27028a(str);
                    f17432a.add(this.f17434b);
                    DownloadTask url = Downloader.with(C3358ac.m12528e()).url(this.f17434b);
                    StringBuilder sb = new StringBuilder();
                    sb.append(e);
                    sb.append(".apk");
                    url.name(sb.toString()).savePath(this.f17436e).retryCount(3).mainThreadListener(new AbsDownloadListener() {
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            super.onSuccessed(downloadInfo);
                            C5892a.m18405a(downloadInfo);
                            C5892a.f17432a.remove(C5892a.this.f17434b);
                        }

                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            super.onFailed(downloadInfo, baseException);
                            C5892a.f17432a.remove(C5892a.this.f17434b);
                        }
                    }).download();
                }
            }
        }
    }

    /* renamed from: b */
    public final C5892a mo14423b(String str) {
        this.f17439h = str;
        return this;
    }

    /* renamed from: a */
    public static C5892a m18404a(String str) {
        return new C5892a(str);
    }

    private C5892a(String str) {
        this.f17434b = str;
        m18406b();
    }

    /* renamed from: c */
    private static Uri m18407c(String str) {
        try {
            return m18403a(C3358ac.m12528e(), new File(str));
        } catch (Exception unused) {
            return Uri.parse("");
        }
    }

    /* renamed from: a */
    public static void m18405a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            if (VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
            }
            intent.setDataAndType(m18407c(downloadInfo.getTargetFilePath()), "application/vnd.android.package-archive");
            C3358ac.m12528e().startActivity(intent);
        }
    }

    /* renamed from: a */
    private static Uri m18403a(Context context, File file) {
        if (context == null || VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return Uri.fromFile(file);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(TTLiveFileProvider.NAME);
        return FileProvider.getUriForFile(context, sb.toString(), file);
    }
}
