package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14817bv;
import com.google.android.gms.common.util.C15323f;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.id */
public final class C15756id implements C15742hq<ami> {

    /* renamed from: d */
    private static final Map<String, Integer> f44502d = C15323f.m44568a((K[]) new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, (V[]) new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)});

    /* renamed from: a */
    private final C14817bv f44503a;

    /* renamed from: b */
    private final C16002rg f44504b;

    /* renamed from: c */
    private final C16015rt f44505c;

    public C15756id(C14817bv bvVar, C16002rg rgVar, C16015rt rtVar) {
        this.f44503a = bvVar;
        this.f44504b = rgVar;
        this.f44505c = rtVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        int intValue = ((Integer) f44502d.get((String) map.get("a"))).intValue();
        if (intValue != 5 && intValue != 7 && this.f44503a != null && !this.f44503a.mo37761b()) {
            this.f44503a.mo37760a(null);
        } else if (intValue != 1) {
            switch (intValue) {
                case 3:
                    new C16006rk(ami, map).mo41938a();
                    return;
                case 4:
                    new C15999rd(ami, map).mo41927a();
                    return;
                case 5:
                    new C16005rj(ami, map).mo41937a();
                    return;
                case 6:
                    this.f44504b.mo41934a(true);
                    return;
                case 7:
                    if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43739M)).booleanValue()) {
                        this.f44505c.mo37762I();
                        return;
                    }
                    break;
                default:
                    acd.m45781d("Unknown MRAID command called.");
                    break;
            }
        } else {
            this.f44504b.mo41933a(map);
        }
    }
}
