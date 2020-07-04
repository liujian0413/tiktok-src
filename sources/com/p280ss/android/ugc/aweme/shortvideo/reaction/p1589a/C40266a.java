package com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a;

import com.aweme.storage.C1913c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoPlayerManager.C43246a;
import java.io.File;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.a */
public final class C40266a {

    /* renamed from: a */
    public static final C40266a f104614a = new C40266a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.a$a */
    public static final class C40267a implements C43246a {

        /* renamed from: a */
        final /* synthetic */ C40272e f104615a;

        /* renamed from: b */
        final /* synthetic */ String f104616b;

        /* renamed from: c */
        final /* synthetic */ String f104617c;

        /* renamed from: d */
        final /* synthetic */ String f104618d;

        /* renamed from: e */
        final /* synthetic */ String f104619e;

        /* renamed from: a */
        public final void mo100065a() {
            C40266a.m128654a(this.f104616b, this.f104618d, this.f104619e, this.f104615a);
        }

        /* renamed from: a */
        public final void mo100066a(String str) {
            File file = new File(str);
            C29097a.m95452a().mo74527a("download_success");
            C40272e eVar = this.f104615a;
            if (eVar != null) {
                eVar.mo100067a();
            }
            C40272e eVar2 = this.f104615a;
            if (eVar2 != null) {
                eVar2.mo99264a(100, file.length(), file.length());
            }
            C40272e eVar3 = this.f104615a;
            if (eVar3 != null) {
                String str2 = this.f104616b;
                if (str2 == null) {
                    str2 = "";
                }
                eVar3.mo99266a(str2, this.f104617c);
            }
        }

        C40267a(C40272e eVar, String str, String str2, String str3, String str4) {
            this.f104615a = eVar;
            this.f104616b = str;
            this.f104617c = str2;
            this.f104618d = str3;
            this.f104619e = str4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.a$b */
    public static final class C40268b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C40272e f104620a;

        C40268b(C40272e eVar) {
            this.f104620a = eVar;
        }

        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            C40272e eVar = this.f104620a;
            if (eVar != null) {
                eVar.mo100067a();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
            if (r1 == null) goto L_0x000f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.p280ss.android.socialbase.downloader.model.DownloadInfo r3) {
            /*
                r2 = this;
                super.onSuccessed(r3)
                com.ss.android.ugc.aweme.shortvideo.reaction.a.e r0 = r2.f104620a
                if (r0 == 0) goto L_0x0019
                if (r3 == 0) goto L_0x000f
                java.lang.String r1 = r3.getUrl()
                if (r1 != 0) goto L_0x0011
            L_0x000f:
                java.lang.String r1 = ""
            L_0x0011:
                java.lang.String r3 = com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a.C40266a.m128653a(r3)
                r0.mo99266a(r1, r3)
                return
            L_0x0019:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a.C40266a.C40268b.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            long j;
            long j2;
            super.onProgress(downloadInfo);
            if (downloadInfo != null) {
                j = downloadInfo.getCurBytes();
            } else {
                j = 0;
            }
            long j3 = j;
            if (downloadInfo != null) {
                j2 = downloadInfo.getTotalBytes();
            } else {
                j2 = 100;
            }
            long j4 = j2;
            int i = (int) (((((float) j3) * 1.0f) / ((float) j4)) * 100.0f);
            C40272e eVar = this.f104620a;
            if (eVar != null) {
                eVar.mo99264a(i, j3, j4);
            }
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            C40272e eVar = this.f104620a;
            if (eVar != null) {
                Exception exc = baseException;
                Integer num = null;
                if (baseException != null) {
                    str = baseException.getErrorMessage();
                } else {
                    str = null;
                }
                if (baseException != null) {
                    num = Integer.valueOf(baseException.getErrorCode());
                }
                eVar.mo99265a(exc, str, num);
            }
        }
    }

    private C40266a() {
    }

    /* renamed from: a */
    public static String m128653a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath == null || !C7634n.m23723c(savePath, "/", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(downloadInfo.getSavePath());
            sb.append(File.separator);
            sb.append(downloadInfo.getName());
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(downloadInfo.getSavePath());
        sb2.append(downloadInfo.getName());
        return sb2.toString();
    }

    /* renamed from: a */
    public static final void m128654a(String str, String str2, String str3, C40272e eVar) {
        Downloader.with(C6399b.m19921a()).url(str).name(str3).savePath(str2).subThreadListener(new C40268b(eVar)).download();
    }

    /* renamed from: a */
    public static final void m128655a(String str, String str2, String str3, String str4, C40272e eVar) {
        String str5;
        if (str3 == null || !C7634n.m23723c(str3, "/", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(File.separator);
            sb.append(str4);
            str5 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str4);
            str5 = sb2.toString();
        }
        LocalVideoPlayerManager a = LocalVideoPlayerManager.m137195a();
        C40267a aVar = new C40267a(eVar, str2, str5, str3, str4);
        if (!a.mo104995a(str, str5, (C43246a) aVar)) {
            C1913c.m8857a("duet");
            m128654a(str2, str3, str4, eVar);
        }
    }
}
