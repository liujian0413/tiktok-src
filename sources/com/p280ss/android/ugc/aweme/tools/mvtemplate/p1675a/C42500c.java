package com.p280ss.android.ugc.aweme.tools.mvtemplate.p1675a;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.c */
public class C42500c {

    /* renamed from: c */
    private static C42500c f110520c;

    /* renamed from: a */
    public HashMap<String, Integer> f110521a = new HashMap<>();

    /* renamed from: b */
    private List<Integer> f110522b = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.c$a */
    interface C42502a {
        /* renamed from: a */
        void mo104074a(boolean z);
    }

    /* renamed from: a */
    public static C42500c m135067a() {
        if (f110520c == null) {
            synchronized (C42500c.class) {
                f110520c = new C42500c();
            }
        }
        return f110520c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo104077a(MvThemeData mvThemeData) throws Exception {
        return Boolean.valueOf(m135069b(mvThemeData));
    }

    /* renamed from: b */
    public final void mo104081b(List<MvThemeData> list) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            for (MvThemeData mvThemeData : list) {
                if (mvThemeData != null && !TextUtils.isEmpty(mvThemeData.mo104047c())) {
                    this.f110521a.put(mvThemeData.mo104047c(), Integer.valueOf(4));
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m135069b(MvThemeData mvThemeData) {
        if (mvThemeData == null || TextUtils.isEmpty(mvThemeData.mo104051f()) || TextUtils.isEmpty(mvThemeData.mo104048d()) || !C7276d.m22812b(mvThemeData.mo104048d()) || TextUtils.isEmpty(mvThemeData.mo104050e())) {
            return false;
        }
        File file = new File(mvThemeData.mo104048d());
        try {
            if (C43734f.m138604a(file).equals(mvThemeData.mo104051f())) {
                C43733e.m138598b(mvThemeData.mo104048d(), mvThemeData.mo104050e());
                return true;
            }
            C43733e.m138599b(file.getAbsolutePath());
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final int mo104076a(String str) {
        if (this.f110521a.get(str) == null) {
            return 4;
        }
        return ((Integer) this.f110521a.get(str)).intValue();
    }

    /* renamed from: a */
    public final void mo104078a(Context context) {
        for (Integer intValue : this.f110522b) {
            Downloader.getInstance(context).removeTaskMainListener(intValue.intValue());
        }
        this.f110522b.clear();
    }

    /* renamed from: a */
    public final void mo104080a(List<MvThemeData> list) {
        this.f110521a.clear();
        mo104081b(list);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m135068a(C42502a aVar, C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            aVar.mo104074a(false);
            return null;
        }
        aVar.mo104074a(((Boolean) hVar.mo6890e()).booleanValue());
        return null;
    }

    /* renamed from: a */
    public final void mo104079a(MvThemeData mvThemeData, C42502a aVar) {
        C1592h.m7855a((Callable<TResult>) new C42503d<TResult>(this, mvThemeData), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C42504e<TResult,TContinuationResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public final int mo104075a(Context context, MvThemeData mvThemeData, final C42499b bVar) {
        if (mvThemeData == null || context == null) {
            return -1;
        }
        String c = mvThemeData.mo104047c();
        if (TextUtils.isEmpty(c)) {
            return -1;
        }
        String d = mvThemeData.mo104048d();
        if (TextUtils.isEmpty(d)) {
            return -1;
        }
        if (!C42505f.m135078a(context)) {
            C10761a.m31403c(context, context.getResources().getString(R.string.b23)).mo25750a();
            return -1;
        }
        File file = new File(d);
        int intValue = ((Integer) this.f110521a.get(c)).intValue();
        if (intValue == 1 || intValue == -1 || intValue == 4) {
            DownloadTask url = Downloader.with(context).url(c);
            StringBuilder sb = new StringBuilder();
            sb.append(file.getParent());
            sb.append(File.separator);
            DownloadTask mainThreadListener = url.savePath(sb.toString()).name(file.getName()).mainThreadListener(new C42499b() {
                public final void onProgress(DownloadInfo downloadInfo) {
                    if (bVar != null) {
                        bVar.onProgress(downloadInfo);
                    }
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    C42500c.this.f110521a.put(downloadInfo.getUrl(), Integer.valueOf(3));
                    if (bVar != null) {
                        bVar.onSuccessed(downloadInfo);
                    }
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    C42500c.this.f110521a.put(downloadInfo.getUrl(), Integer.valueOf(-1));
                    if (bVar != null) {
                        bVar.onFailed(downloadInfo, baseException);
                    }
                }
            });
            mainThreadListener.download();
            this.f110522b.add(Integer.valueOf(mainThreadListener.getDownloadId()));
            this.f110521a.put(c, Integer.valueOf(2));
        }
        return intValue;
    }
}
