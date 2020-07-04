package com.p280ss.android.downloadlib;

import android.text.TextUtils;
import com.p280ss.android.download.api.C19371a;
import com.p280ss.android.download.api.model.C19391a;
import com.p280ss.android.download.api.p857a.C19372a;
import com.p280ss.android.download.api.p857a.C19373b;
import com.p280ss.android.download.api.p857a.C19375d;
import com.p280ss.android.download.api.p857a.C19376e;
import com.p280ss.android.download.api.p857a.C19377f;
import com.p280ss.android.download.api.p857a.C19378g;
import com.p280ss.android.download.api.p857a.C19379h;
import com.p280ss.android.download.api.p857a.C19383l;
import com.p280ss.android.downloadlib.addownload.C19475e;
import com.p280ss.android.downloadlib.addownload.C19490i;
import com.p280ss.android.downloadlib.addownload.C19491j;
import com.p280ss.android.downloadlib.addownload.C19495l;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.downloader.C20279f;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.downloadlib.d */
final class C19526d implements C19371a {
    C19526d() {
    }

    /* renamed from: a */
    public final C19371a mo51354a(String str) {
        C19491j.m64218a(str);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51353a(C20279f fVar) {
        if (fVar.f54829o == null) {
            fVar.mo54344a(C19475e.m64072a(C19495l.m64242a()));
        }
        if (fVar.f54820f == null) {
            fVar.f54820f = new C20259y() {
                /* renamed from: b */
                public final boolean mo51645b(DownloadInfo downloadInfo) {
                    return false;
                }

                /* renamed from: a */
                public final boolean mo51644a(DownloadInfo downloadInfo) {
                    C19383l r = C19491j.m64237r();
                    if (r != null) {
                        String b = C19490i.m64202b(downloadInfo);
                        if (!TextUtils.isEmpty(b)) {
                            return r.mo51369a(C19491j.m64206a(), b);
                        }
                    }
                    return false;
                }
            };
        }
        fVar.mo54347a(C19491j.m64239t());
        Downloader.init(fVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51343a(C19372a aVar) {
        C19491j.m64208a(aVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51344a(C19373b bVar) {
        C19491j.m64209a(bVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51345a(C19375d dVar) {
        C19491j.m64210a(dVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51346a(C19376e eVar) {
        C19491j.m64211a(eVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51347a(C19377f fVar) {
        C19491j.m64212a(fVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51348a(C19378g gVar) {
        C19491j.m64213a(gVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51349a(C19379h hVar) {
        C19491j.m64214a(hVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51350a(C19383l lVar) {
        C19491j.m64215a(lVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51351a(C19391a aVar) {
        C19491j.m64216a(aVar);
        return this;
    }

    /* renamed from: a */
    public final C19371a mo51352a(IAppDownloadMonitorListener iAppDownloadMonitorListener) {
        C19491j.m64217a(iAppDownloadMonitorListener);
        AppDownloader.getInstance().appDownloadMonitorListener = iAppDownloadMonitorListener;
        return this;
    }
}
