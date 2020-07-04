package com.p280ss.android.ugc.aweme.tools.mvtemplate.p1675a;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a */
public final class C42496a extends C42499b {

    /* renamed from: a */
    public final C42506g f110513a = new C42506g();

    /* renamed from: b */
    public C42507h f110514b;

    /* renamed from: c */
    public final MvThemeData f110515c;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a$a */
    static final class C42497a implements C42502a {

        /* renamed from: a */
        final /* synthetic */ C42496a f110516a;

        /* renamed from: b */
        final /* synthetic */ Context f110517b;

        /* renamed from: c */
        final /* synthetic */ int f110518c;

        C42497a(C42496a aVar, Context context, int i) {
            this.f110516a = aVar;
            this.f110517b = context;
            this.f110518c = i;
        }

        /* renamed from: a */
        public final void mo104074a(boolean z) {
            if (z) {
                C42507h hVar = this.f110516a.f110514b;
                if (hVar != null) {
                    hVar.mo104083a(1, this.f110516a.f110513a.f110528a, 100, this.f110516a.f110515c.mo104048d());
                }
            } else {
                this.f110516a.mo104071a(this.f110517b, this.f110518c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a$b */
    static final class C42498b implements C42502a {

        /* renamed from: a */
        final /* synthetic */ C42496a f110519a;

        C42498b(C42496a aVar) {
            this.f110519a = aVar;
        }

        /* renamed from: a */
        public final void mo104074a(boolean z) {
            if (z) {
                this.f110519a.mo104073a(this.f110519a.f110515c, (BaseException) null, true);
                C42507h hVar = this.f110519a.f110514b;
                if (hVar != null) {
                    hVar.mo104083a(1, this.f110519a.f110513a.f110528a, 100, this.f110519a.f110515c.mo104048d());
                }
            } else {
                C42507h hVar2 = this.f110519a.f110514b;
                if (hVar2 != null) {
                    hVar2.mo104083a(-1, this.f110519a.f110513a.f110528a, 0, null);
                }
            }
        }
    }

    public C42496a(MvThemeData mvThemeData) {
        C7573i.m23587b(mvThemeData, "mvThemeData");
        this.f110515c = mvThemeData;
    }

    /* renamed from: b */
    private static boolean m135061b(MvThemeData mvThemeData) {
        if (mvThemeData != null && !TextUtils.isEmpty(mvThemeData.mo104047c()) && !TextUtils.isEmpty(mvThemeData.mo104044a())) {
            return true;
        }
        return false;
    }

    public final void onProgress(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
        this.f110513a.f110530c = downloadInfo.getDownloadProcess();
        C42507h hVar = this.f110514b;
        if (hVar != null) {
            hVar.mo104083a(3, this.f110513a.f110528a, this.f110513a.f110530c, null);
        }
    }

    public final void onStart(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
        C42507h hVar = this.f110514b;
        if (hVar != null) {
            hVar.mo104083a(2, this.f110513a.f110528a, 0, null);
        }
    }

    public final void onSuccessed(DownloadInfo downloadInfo) {
        C7573i.m23587b(downloadInfo, "entity");
        this.f110513a.f110529b = 3;
        C42500c.m135067a().mo104079a(this.f110515c, (C42502a) new C42498b(this));
    }

    /* renamed from: a */
    private static void m135060a(MvThemeData mvThemeData) {
        if (mvThemeData != null) {
            C6893q.m21444a("mv_resource_download_error_state", 11, C6869c.m21381a().mo16887a("url", mvThemeData.mo104047c()).mo16887a("mv_res_id", mvThemeData.mo104044a()).mo16887a("mv_res_name", mvThemeData.mo104053h()).mo16888b());
        }
    }

    /* renamed from: a */
    public final void mo104071a(Context context, int i) {
        if (C42500c.m135067a().mo104075a(context, this.f110515c, this) == -1) {
            C42507h hVar = this.f110514b;
            if (hVar != null) {
                hVar.mo104083a(-1, i, 0, null);
            }
        }
    }

    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        C7573i.m23587b(downloadInfo, "entity");
        C7573i.m23587b(baseException, "e");
        mo104073a(this.f110515c, baseException, false);
        this.f110513a.f110529b = 3;
        this.f110513a.f110530c = 0;
        C42507h hVar = this.f110514b;
        if (hVar != null) {
            hVar.mo104083a(-1, this.f110513a.f110528a, 0, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r2 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r2 == null) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104073a(com.p280ss.android.ugc.aweme.tools.mvtemplate.MvThemeData r5, com.p280ss.android.socialbase.downloader.exception.BaseException r6, boolean r7) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = m135061b(r5)
            if (r0 != 0) goto L_0x000c
            m135060a(r5)
        L_0x000c:
            if (r7 == 0) goto L_0x0016
            java.lang.String r5 = "mv_resource_download_error_state"
            r6 = 0
            r7 = 0
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r5, r6, r7)
            return
        L_0x0016:
            java.lang.String r7 = "mv_resource_download_error_state"
            r0 = 1
            com.ss.android.ugc.aweme.app.g.c r1 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r2 = "url"
            java.lang.String r3 = r5.mo104047c()
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "mv_res_id"
            java.lang.String r3 = r5.mo104044a()
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "mv_res_name"
            java.lang.String r5 = r5.mo104053h()
            com.ss.android.ugc.aweme.app.g.c r5 = r1.mo16887a(r2, r5)
            java.lang.String r1 = "error_code"
            if (r6 == 0) goto L_0x0049
            int r2 = r6.getErrorCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 != 0) goto L_0x004b
        L_0x0049:
            java.lang.String r2 = ""
        L_0x004b:
            com.ss.android.ugc.aweme.app.g.c r5 = r5.mo16887a(r1, r2)
            java.lang.String r1 = "error_message"
            if (r6 == 0) goto L_0x005f
            java.lang.String r2 = r6.getErrorMessage()
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r2 = ""
        L_0x0061:
            com.ss.android.ugc.aweme.app.g.c r5 = r5.mo16887a(r1, r2)
            java.lang.String r1 = "exception"
            if (r6 != 0) goto L_0x006c
            java.lang.String r6 = ""
            goto L_0x0072
        L_0x006c:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.String r6 = com.facebook.common.internal.C13315l.m38963c(r6)
        L_0x0072:
            com.ss.android.ugc.aweme.app.g.c r5 = r5.mo16887a(r1, r6)
            org.json.JSONObject r5 = r5.mo16888b()
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r7, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.mvtemplate.p1675a.C42496a.mo104073a(com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData, com.ss.android.socialbase.downloader.exception.BaseException, boolean):void");
    }

    /* renamed from: a */
    public final void mo104072a(Context context, C42507h hVar, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(hVar, "listener");
        this.f110513a.f110528a = i;
        this.f110514b = hVar;
        if (!m135061b(this.f110515c)) {
            m135060a(this.f110515c);
            C42507h hVar2 = this.f110514b;
            if (hVar2 != null) {
                hVar2.mo104083a(-1, i, 0, null);
            }
        } else if (this.f110515c.f110495a == null) {
            C42507h hVar3 = this.f110514b;
            if (hVar3 != null) {
                hVar3.mo104083a(-1, i, 0, null);
            }
        } else if (TextUtils.isEmpty(this.f110515c.mo104048d())) {
            C42507h hVar4 = this.f110514b;
            if (hVar4 != null) {
                hVar4.mo104083a(-1, i, 0, null);
            }
        } else {
            String e = this.f110515c.mo104050e();
            if (TextUtils.isEmpty(e)) {
                C42507h hVar5 = this.f110514b;
                if (hVar5 != null) {
                    hVar5.mo104083a(-1, i, 0, null);
                }
            } else if (!new File(e).exists()) {
                mo104071a(context, i);
            } else {
                C42500c.m135067a().mo104079a(this.f110515c, (C42502a) new C42497a(this, context, i));
            }
        }
    }
}
