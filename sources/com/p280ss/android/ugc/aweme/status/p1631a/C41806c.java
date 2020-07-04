package com.p280ss.android.ugc.aweme.status.p1631a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.ugc.aweme.status.p1632b.C41809a;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.status.a.c */
public final class C41806c {

    /* renamed from: a */
    public static final C41806c f108749a = new C41806c();

    /* renamed from: b */
    private static ArrayList<C41804a> f108750b = new ArrayList<>();

    private C41806c() {
    }

    /* renamed from: a */
    public static void m133031a(Context context) {
        C7573i.m23587b(context, "context");
        Downloader instance = Downloader.getInstance(context);
        for (C41804a aVar : f108750b) {
            if (!(aVar.f108747b == null || aVar.f108748c == null)) {
                instance.cancel(aVar.f108746a);
            }
        }
        f108750b.clear();
    }

    /* renamed from: a */
    public static int m133030a(Context context, C41809a aVar, C41805b bVar) {
        C7573i.m23587b(context, "mActivity");
        C7573i.m23587b(aVar, "statusEffect");
        C7573i.m23587b(bVar, "listener");
        if (aVar.f108754c == null || aVar.f108754c.getFileUrl() == null) {
            return -1;
        }
        UrlModel fileUrl = aVar.f108754c.getFileUrl();
        C7573i.m23582a((Object) fileUrl, "statusEffect.effect.fileUrl");
        String str = (String) fileUrl.getUrlList().get(0);
        DownloadInfo downloadInfo = new DownloadInfo();
        if (TextUtils.isEmpty(str)) {
            bVar.onFailed(downloadInfo, new BaseException(0, "url=null"));
        }
        if (TextUtils.isEmpty(aVar.f108754c.getZipPath())) {
            bVar.onFailed(downloadInfo, new BaseException(0, "zipPath=null"));
        }
        if (!C41807d.m133032a(context)) {
            C10761a.m31403c(context, context.getResources().getString(R.string.b23)).mo25750a();
            bVar.onFailed(downloadInfo, new BaseException(0, "network error"));
        }
        File file = new File(aVar.f108754c.getZipPath());
        DownloadTask url = Downloader.with(context).url(str);
        StringBuilder sb = new StringBuilder();
        sb.append(file.getParent());
        sb.append(File.separator);
        DownloadTask retryCount = url.savePath(sb.toString()).name(file.getName()).mainThreadListener(bVar).retryCount(3);
        int download = retryCount.download();
        C41804a aVar2 = new C41804a();
        aVar2.f108746a = download;
        aVar2.f108747b = retryCount;
        aVar2.f108748c = bVar;
        f108750b.add(aVar2);
        return download;
    }
}
