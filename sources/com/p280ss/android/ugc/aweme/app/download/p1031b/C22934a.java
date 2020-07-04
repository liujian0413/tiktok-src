package com.p280ss.android.ugc.aweme.app.download.p1031b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.download.api.p858b.p859a.C19385a;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.download.b.a */
public class C22934a implements C19385a {

    /* renamed from: a */
    private static C22934a f60699a;

    /* renamed from: b */
    private Set<String> f60700b = new HashSet();

    /* renamed from: a */
    public final void mo51370a(DownloadInfo downloadInfo) {
    }

    /* renamed from: a */
    public final void mo51372a(DownloadInfo downloadInfo, String str) {
    }

    private C22934a() {
    }

    /* renamed from: a */
    public static C22934a m75490a() {
        if (f60699a == null) {
            synchronized (C22934a.class) {
                if (f60699a == null) {
                    f60699a = new C22934a();
                }
            }
        }
        return f60699a;
    }

    /* renamed from: a */
    public final void mo59933a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f60700b.add(str);
        } else {
            this.f60700b.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo51371a(DownloadInfo downloadInfo, BaseException baseException, String str) {
        String url = downloadInfo.getUrl();
        if (TextUtils.isEmpty(url) && this.f60700b.contains(url)) {
            C10761a.m31399c((Context) C6405d.m19984g(), (int) R.string.avf).mo25750a();
            this.f60700b.remove(url);
        }
    }
}
