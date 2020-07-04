package com.bytedance.android.livesdk.feed.tab.p235a;

import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.tab.a.d */
public final class C6127d implements C6126c {

    /* renamed from: m */
    private static final String f18064m = ((INetworkService) C3596c.m13172a(INetworkService.class)).getHostDomain();

    /* renamed from: a */
    String[] f18065a = {"直播"};

    /* renamed from: b */
    String[] f18066b;

    /* renamed from: c */
    String[] f18067c;

    /* renamed from: d */
    String[] f18068d;

    /* renamed from: e */
    int[] f18069e;

    /* renamed from: f */
    int[] f18070f;

    /* renamed from: g */
    int[] f18071g;

    /* renamed from: h */
    int[] f18072h;

    /* renamed from: i */
    int[] f18073i;

    /* renamed from: j */
    int[] f18074j;

    /* renamed from: k */
    boolean[] f18075k;

    /* renamed from: l */
    int[] f18076l;

    /* renamed from: a */
    public final List<C5989f> mo14782a() {
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < this.f18065a.length; i++) {
            C5989f fVar = new C5989f();
            fVar.f17751a = (long) this.f18072h[i];
            fVar.f17758h = this.f18067c[i];
            fVar.f17752b = this.f18065a[i];
            fVar.f17754d = this.f18066b[i];
            fVar.f17753c = this.f18069e[i];
            fVar.f17756f = this.f18070f[i];
            fVar.f17757g = this.f18071g[i];
            fVar.f17759i = this.f18073i[i];
            fVar.f17760j = this.f18074j[i];
            arrayList.add(fVar);
        }
        return arrayList;
    }

    public C6127d() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(f18064m);
        sb.append("/webcast/feed/");
        this.f18066b = new String[]{sb.toString()};
        this.f18067c = new String[]{"live"};
        this.f18068d = new String[]{"live"};
        this.f18069e = new int[]{1};
        this.f18070f = new int[]{1};
        this.f18071g = new int[]{1};
        this.f18072h = new int[]{1};
        this.f18073i = new int[]{1001};
        this.f18074j = new int[]{0};
        this.f18075k = new boolean[]{false};
        this.f18076l = new int[]{0};
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(f18064m);
        sb2.append("/webcast/feed/?content_type=0&style=2&channel_id=21");
        this.f18066b = new String[]{sb2.toString()};
        this.f18065a[0] = "Top LIVEs";
        this.f18070f[0] = 2;
    }
}
