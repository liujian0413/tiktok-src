package com.p280ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.internal.C13315l;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.experiment.ToolsUseDownloaderExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.share.C38238j;
import com.p280ss.android.ugc.aweme.share.gif.p1537ui.VideoShare2GifEditActivity;
import com.p280ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a.C40269b;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.gif.b */
public final class C38046b implements C38054h {

    /* renamed from: a */
    private FeedPanelStateViewModel f99057a;

    /* renamed from: b */
    private C41654d f99058b;

    /* renamed from: b */
    private static void m121429b(Runnable runnable) {
        C1592h.m7855a((Callable<TResult>) new C38053g<TResult>(runnable), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo95684a(int i) {
        m121429b((Runnable) new C38051e(this, i));
    }

    /* renamed from: a */
    public final void mo95685a(Activity activity) {
        m121429b((Runnable) new C38049c(this, activity));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo95691c(Activity activity) {
        this.f99058b = C41654d.m132586b(activity, activity.getString(R.string.c4h));
        if (this.f99057a != null) {
            this.f99057a.f99458h.setValue(Boolean.valueOf(true));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo95689b(int i) {
        if (this.f99058b != null) {
            this.f99058b.setProgress(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo95692d(Activity activity) {
        if (this.f99058b != null) {
            this.f99058b.dismiss();
        }
        C10761a.m31396b((Context) activity, activity.getString(R.string.c4d), 1).mo25750a();
        if (this.f99057a != null) {
            this.f99057a.f99458h.setValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: b */
    public final void mo95690b(Activity activity) {
        m121429b((Runnable) new C38052f(this, activity));
    }

    /* renamed from: a */
    public final void mo95686a(Activity activity, Aweme aweme, String str, String str2) {
        Activity activity2 = activity;
        if (!activity.isFinishing()) {
            String b = C38044a.f99049a.mo95683b(aweme);
            File file = new File(b);
            if (!file.exists() || file.length() <= 0) {
                if (activity2 instanceof FragmentActivity) {
                    this.f99057a = (FeedPanelStateViewModel) C0069x.m159a((FragmentActivity) activity2).mo147a(FeedPanelStateViewModel.class);
                }
                String str3 = "";
                if (!(aweme.getVideo() == null || aweme.getVideo().getPlayAddrH264() == null || aweme.getVideo().getPlayAddrH264().getUrlList() == null)) {
                    str3 = (String) aweme.getVideo().getPlayAddrH264().getUrlList().get(0);
                }
                String str4 = str3;
                if (!TextUtils.isEmpty(str4)) {
                    if (C6384b.m19835a().mo15292a(ToolsUseDownloaderExperiment.class, true, "tools_use_downloader", C6384b.m19835a().mo15295d().tools_use_downloader, false)) {
                        m121427a(activity, aweme, str4, str, str2, b);
                    } else {
                        m121428b(activity, aweme, str4, str, str2, b);
                    }
                }
            } else if (!activity.isFinishing()) {
                VideoShare2GifEditActivity.m121444a(activity, aweme.getAid(), aweme.getAuthorUid(), aweme.isReviewed(), b, str, str2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95687a(Activity activity, Aweme aweme, String str, String str2, String str3) {
        if (!activity.isFinishing()) {
            if (this.f99058b != null) {
                this.f99058b.dismiss();
            }
            VideoShare2GifEditActivity.m121444a(activity, aweme.getAid(), aweme.getAuthorUid(), aweme.isReviewed(), str, str2, str3);
            if (this.f99057a != null) {
                this.f99057a.f99458h.setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    public final void mo95688a(String str, Activity activity, Aweme aweme, String str2, String str3) {
        C38050d dVar = new C38050d(this, activity, aweme, str, str2, str3);
        m121429b((Runnable) dVar);
    }

    /* renamed from: b */
    private void m121428b(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        C38238j jVar = new C38238j();
        final Activity activity2 = activity;
        final Aweme aweme2 = aweme;
        final String str5 = str2;
        final String str6 = str3;
        final String str7 = str;
        C380482 r1 = new C40269b() {
            /* renamed from: a */
            public final void mo59407a(int i) {
                super.mo59407a(i);
                C38046b.this.mo95690b(activity2);
            }

            /* renamed from: a */
            public final void mo59411a(C44850c cVar) {
                super.mo59411a(cVar);
                C38046b.this.mo95685a(activity2);
                C6877n.m21444a("aweme_download_error_rate", 1, new C6869c().mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16887a("url", str7).mo16887a("from", "gifshare").mo16888b());
            }

            /* renamed from: a */
            public final void mo59412a(String str) {
                super.mo59412a(str);
                C38046b.this.mo95688a(str, activity2, aweme2, str5, str6);
                C6877n.m21444a("aweme_download_error_rate", 0, new C6869c().mo16882a("tools_use_downloader", Boolean.valueOf(false)).mo16887a("url", str7).mo16887a("from", "gifshare").mo16888b());
            }

            /* renamed from: a */
            public final void mo59408a(int i, long j, long j2) {
                super.mo59408a(i, j, j2);
                C38046b.this.mo95684a(i);
            }
        };
        jVar.mo95822a(r1);
        jVar.mo95823a(str, str4, false);
    }

    /* renamed from: a */
    private void m121427a(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        File file = new File(str4);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        DownloadTask name = Downloader.with(C6399b.m19921a()).url(str).savePath(C38044a.m121417b()).name(C38044a.m121419c(aweme));
        final Activity activity2 = activity;
        final Aweme aweme2 = aweme;
        final String str5 = str2;
        final String str6 = str3;
        final String str7 = str;
        C380471 r0 = new AbsDownloadListener() {
            public final void onStart(DownloadInfo downloadInfo) {
                super.onStart(downloadInfo);
                C38046b.this.mo95690b(activity2);
            }

            public final void onProgress(DownloadInfo downloadInfo) {
                super.onProgress(downloadInfo);
                C38046b.this.mo95684a((int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes()));
            }

            public final void onSuccessed(DownloadInfo downloadInfo) {
                String sb;
                super.onSuccessed(downloadInfo);
                if (downloadInfo.getSavePath().endsWith("/")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(downloadInfo.getSavePath());
                    sb2.append(downloadInfo.getName());
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(downloadInfo.getSavePath());
                    sb3.append(File.separator);
                    sb3.append(downloadInfo.getName());
                    sb = sb3.toString();
                }
                C38046b.this.mo95688a(sb, activity2, aweme2, str5, str6);
                C6877n.m21444a("aweme_download_error_rate", 0, new C6869c().mo16882a("tools_use_downloader", Boolean.valueOf(true)).mo16887a("url", str7).mo16887a("from", "gifshare").mo16888b());
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                super.onFailed(downloadInfo, baseException);
                C38046b.this.mo95685a(activity2);
                String str = "null exception";
                if (baseException != null) {
                    str = C13315l.m38963c(baseException);
                }
                C6877n.m21444a("aweme_download_error_rate", 1, new C6869c().mo16882a("tools_use_downloader", Boolean.valueOf(true)).mo16887a("url", str7).mo16887a("from", "gifshare").mo16887a("exception", str).mo16888b());
            }
        };
        name.subThreadListener(r0).download();
    }
}
