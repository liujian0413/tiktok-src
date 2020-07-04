package com.p280ss.android.ugc.aweme.video.local;

import android.content.Context;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo.C20335a;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29092a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.C43246a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.video.local.a */
public final class C43247a {

    /* renamed from: b */
    public static final C43248a f111960b = new C43248a(null);

    /* renamed from: e */
    private static final String f111961e = f111961e;

    /* renamed from: f */
    private static final Map<String, Integer> f111962f = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public AbsDownloadListener f111963a;

    /* renamed from: c */
    private int f111964c = -1;

    /* renamed from: d */
    private DownloadTask f111965d;

    /* renamed from: com.ss.android.ugc.aweme.video.local.a$a */
    public static final class C43248a {
        private C43248a() {
        }

        public /* synthetic */ C43248a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.a$b */
    public static final class C43249b implements C43246a {

        /* renamed from: a */
        final /* synthetic */ C43247a f111966a;

        /* renamed from: b */
        final /* synthetic */ Context f111967b;

        /* renamed from: c */
        final /* synthetic */ String f111968c;

        /* renamed from: d */
        final /* synthetic */ String f111969d;

        /* renamed from: e */
        final /* synthetic */ String f111970e;

        /* renamed from: a */
        public final void mo100065a() {
            this.f111966a.mo104999a(this.f111967b, this.f111968c, this.f111969d, this.f111970e);
        }

        /* renamed from: a */
        public final void mo100066a(String str) {
            C7573i.m23587b(str, "filePath");
            File file = new File(str);
            ((C29092a) ServiceManager.get().getService(C29092a.class)).mo74527a("download_success");
            DownloadInfo downloadInfo = new DownloadInfo();
            C20335a aVar = new C20335a();
            downloadInfo.setCurBytes(file.length());
            downloadInfo.setTotalBytes(file.length());
            AbsDownloadListener absDownloadListener = this.f111966a.f111963a;
            if (absDownloadListener != null) {
                absDownloadListener.onProgress(downloadInfo);
            }
            String str2 = File.separator;
            C7573i.m23582a((Object) str2, "File.separator");
            String b = C7634n.m23775c(str, str2, str);
            String str3 = File.separator;
            C7573i.m23582a((Object) str3, "File.separator");
            String a = C7634n.m23764b(str, str3, str);
            AbsDownloadListener absDownloadListener2 = this.f111966a.f111963a;
            if (absDownloadListener2 != null) {
                absDownloadListener2.onSuccessed(aVar.mo54753a(b).mo54767d(a).mo54758a());
            }
        }

        C43249b(C43247a aVar, Context context, String str, String str2, String str3) {
            this.f111966a = aVar;
            this.f111967b = context;
            this.f111968c = str;
            this.f111969d = str2;
            this.f111970e = str3;
        }
    }

    /* renamed from: a */
    public final void mo105001a(AbsDownloadListener absDownloadListener) {
        C7573i.m23587b(absDownloadListener, "absDownloadListener");
        this.f111963a = absDownloadListener;
    }

    /* renamed from: a */
    public final void mo104998a(Context context) {
        C7573i.m23587b(context, "context");
        Downloader.getInstance(context).pause(this.f111964c);
        Downloader.getInstance(context).removeMainThreadListener(this.f111964c, this.f111963a);
    }

    /* renamed from: b */
    public final void mo105002b(Context context) {
        C7573i.m23587b(context, "context");
        DownloadTask downloadTask = this.f111965d;
        if (downloadTask != null) {
            Downloader.getInstance(context).cancel(downloadTask.getDownloadId());
        }
    }

    /* renamed from: a */
    public final void mo104999a(Context context, String str, String str2, String str3) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "name");
        C7573i.m23587b(str3, "savePath");
        this.f111965d = Downloader.with(context).url(str).name(str2).savePath(str3).mainThreadListener(this.f111963a);
        DownloadTask downloadTask = this.f111965d;
        if (downloadTask != null) {
            downloadTask.download();
        }
    }

    /* renamed from: a */
    public final void mo105000a(Context context, String str, String str2, String str3, String str4) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "sourceId");
        C7573i.m23587b(str2, "url");
        C7573i.m23587b(str3, "name");
        C7573i.m23587b(str4, "savePath");
        LocalVideoPlayerManager a = LocalVideoPlayerManager.m137195a();
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(str3);
        String sb2 = sb.toString();
        C43249b bVar = new C43249b(this, context, str2, str3, str4);
        if (!a.mo104995a(str, sb2, (C43246a) bVar)) {
            mo104999a(context, str2, str3, str4);
        }
    }
}
