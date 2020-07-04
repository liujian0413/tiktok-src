package com.bytedance.android.livesdk.gift.download;

import com.bytedance.android.live.core.utils.C3358ac;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.ugc.live.gift.resource.C46209a;
import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.exception.BaseGetResourceException;
import com.p280ss.ugc.live.gift.resource.exception.WriteStorageException;
import com.p280ss.ugc.live.gift.resource.p1827a.C46211b;
import com.p280ss.ugc.live.gift.resource.p1828b.C46213a;
import com.p280ss.ugc.live.gift.resource.p1829c.C46225d;
import com.p280ss.ugc.live.gift.resource.p1830d.C46229a;
import com.p280ss.ugc.live.gift.resource.p1830d.C46230b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.android.livesdk.gift.download.c */
public final class C7958c implements C46225d<String> {

    /* renamed from: a */
    public C46209a<String> f21539a;

    /* renamed from: b */
    private C46211b f21540b;

    public C7958c(C46211b bVar) {
        this.f21540b = bVar;
    }

    /* renamed from: a */
    private static String m24389a(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf);
        }
        return null;
    }

    /* renamed from: b */
    private static String m24390b(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        return null;
    }

    /* renamed from: a */
    private String m24388a(C46220c cVar) throws Exception {
        String a = C46230b.m145165a(this.f21540b.mo20651a(cVar));
        File file = new File(a);
        if (file.exists() || file.mkdirs()) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(C46229a.m145162a(cVar.mo114170a()));
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("mkdirs return false, dir=");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }

    /* renamed from: a */
    public final void mo20821a(final C46220c cVar, C46209a<String> aVar) {
        this.f21539a = aVar;
        try {
            final String a = m24388a(cVar);
            Downloader.with(C3358ac.m12528e()).url(cVar.mo114171b()).name(m24389a(a)).savePath(m24390b(a)).subThreadListener(new AbsDownloadListener() {
                public final void onProgress(DownloadInfo downloadInfo) {
                    super.onProgress(downloadInfo);
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    super.onSuccessed(downloadInfo);
                    C7958c.this.f21539a.mo114162a(cVar, a);
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    super.onFailed(downloadInfo, baseException);
                    TTDownloadException tTDownloadException = new TTDownloadException(baseException.getErrorMessage(), baseException, cVar, baseException.getErrorCode(), new C46213a(downloadInfo.getUrl()));
                    C7958c.this.f21539a.mo114161a(cVar, (BaseGetResourceException) tTDownloadException);
                }
            }).download();
        } catch (Exception e) {
            this.f21539a.mo114161a(cVar, (BaseGetResourceException) new WriteStorageException("write storage failed.", e, cVar));
        }
    }
}
