package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43730b;
import com.p280ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43790g;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.h */
public final class C43813h extends C43727d {

    /* renamed from: a */
    private C43680a f113381a;

    /* renamed from: b */
    private C43834g f113382b = this.f113381a.f113068a;

    /* renamed from: g */
    private C43719a f113383g = this.f113382b.f113528s;

    /* renamed from: h */
    private C43721c f113384h = this.f113382b.f113532w;

    /* renamed from: i */
    private String f113385i;

    /* renamed from: j */
    private String f113386j;

    /* renamed from: k */
    private int f113387k;

    /* renamed from: l */
    private int f113388l;

    /* renamed from: m */
    private int f113389m;

    /* renamed from: n */
    private String f113390n;

    /* renamed from: a */
    public final void mo105685a() {
        InputStream b = this.f113383g.mo105735b(C43730b.m138577a(this.f113385i, this.f113386j, this.f113387k, this.f113388l, this.f113389m));
        if (b == null) {
            mo105769a(21, new C43790g(null, new C43726c(10004)));
            return;
        }
        CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) this.f113384h.mo70689a(b, CategoryEffectListResponse.class);
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            mo105769a(21, new C43790g(null, new C43726c(10004)));
        } else {
            mo105769a(21, new C43790g(categoryEffectListResponse.data, null));
        }
        C43729a.m138574a(b);
    }

    public C43813h(C43680a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2, "NETWORK");
        this.f113385i = str;
        this.f113386j = str3;
        this.f113387k = i;
        this.f113388l = i2;
        this.f113389m = i3;
        this.f113390n = str4;
        this.f113381a = aVar;
    }
}
