package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.model.NetException;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43792i;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.m */
public final class C43818m extends C43727d {

    /* renamed from: a */
    private C43680a f113428a;

    /* renamed from: b */
    private C43834g f113429b = this.f113428a.f113068a;

    /* renamed from: g */
    private C43721c f113430g = this.f113428a.f113068a.f113532w;

    /* renamed from: h */
    private String f113431h;

    /* renamed from: i */
    private int f113432i;

    /* renamed from: b */
    private C43707b m138757b() {
        HashMap a = m138568a(this.f113429b);
        if (!TextUtils.isEmpty(this.f113431h)) {
            a.put("panel", this.f113431h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113428a.f113069b.f113609h);
        sb.append(this.f113429b.f113510a);
        sb.append("/v3/effect/my");
        return new C43707b("GET", C43735g.m138609a(a, sb.toString()));
    }

    /* renamed from: a */
    public final void mo105685a() {
        C43707b b = m138757b();
        int i = 0;
        while (i < this.f113432i) {
            try {
                FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) this.f113429b.f113533x.mo106114a(b, this.f113430g, FetchFavoriteListResponse.class);
                if (fetchFavoriteListResponse == null || !fetchFavoriteListResponse.checkValued()) {
                    throw new NetException(Integer.valueOf(10002), "Download error");
                }
                C43731c.m138584a(this.f113429b.f113519j.getAbsolutePath(), fetchFavoriteListResponse.getEffects());
                C43731c.m138584a(this.f113429b.f113519j.getAbsolutePath(), fetchFavoriteListResponse.getCollectEffects());
                mo105769a(41, new C43792i(fetchFavoriteListResponse));
                return;
            } catch (Exception e) {
                if (i == this.f113432i - 1) {
                    mo105769a(41, new C43792i(new C43726c(e)));
                }
                i++;
            }
        }
    }

    public C43818m(C43680a aVar, String str, String str2, Handler handler) {
        super(handler, str2, "NETWORK");
        this.f113428a = aVar;
        this.f113431h = str;
        this.f113432i = this.f113429b.f113529t;
    }
}
