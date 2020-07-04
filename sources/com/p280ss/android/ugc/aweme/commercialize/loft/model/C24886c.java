package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import android.content.Context;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.c */
public final class C24886c {

    /* renamed from: a */
    public static final C24887a f65626a = new C24887a(null);

    /* renamed from: b */
    private Context f65627b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.c$a */
    public static final class C24887a extends C24892g<C24886c, Context> {
        private C24887a() {
            super(C248881.f65628a);
        }

        public /* synthetic */ C24887a(C7571f fVar) {
            this();
        }
    }

    private C24886c(Context context) {
        Context applicationContext = context.getApplicationContext();
        C7573i.m23582a((Object) applicationContext, "context.applicationContext");
        this.f65627b = applicationContext;
    }

    public /* synthetic */ C24886c(Context context, C7571f fVar) {
        this(context);
    }

    /* renamed from: a */
    public final void mo65129a(String str, String str2) {
        boolean z;
        C7573i.m23587b(str, "downloadUrl");
        C7573i.m23587b(str2, "savePath");
        Downloader instance = Downloader.getInstance(this.f65627b);
        Integer valueOf = Integer.valueOf(instance.getDownloadId(str, str2));
        if (valueOf.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            instance.removeTaskMainListener(valueOf.intValue());
        }
    }

    /* renamed from: b */
    public final boolean mo65131b(String str, String str2) {
        boolean z;
        C7573i.m23587b(str, "downloadUrl");
        C7573i.m23587b(str2, "savePath");
        Downloader instance = Downloader.getInstance(this.f65627b);
        Integer valueOf = Integer.valueOf(instance.getDownloadId(str, str2));
        if (valueOf.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return instance.isDownloading(valueOf.intValue());
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo65132c(String str, String str2) {
        boolean z;
        C7573i.m23587b(str, "downloadUrl");
        C7573i.m23587b(str2, "savePath");
        Downloader instance = Downloader.getInstance(this.f65627b);
        Integer valueOf = Integer.valueOf(instance.getDownloadId(str, str2));
        if (valueOf.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            DownloadInfo downloadInfo = instance.getDownloadInfo(valueOf.intValue());
            if (downloadInfo == null || !downloadInfo.isDownloaded()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo65130a(String str, String str2, String str3, IDownloadListener iDownloadListener) {
        C7573i.m23587b(str, "downloadUrl");
        C7573i.m23587b(str2, "savePath");
        C7573i.m23587b(str3, "saveName");
        C7573i.m23587b(iDownloadListener, "listener");
        Downloader.with(this.f65627b).url(str).retryCount(3).name(str3).savePath(str2).mainThreadListener(iDownloadListener).download();
    }
}
