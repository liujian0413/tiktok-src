package com.p280ss.android.ugc.asve.p756d;

import com.p280ss.android.medialib.camera.C19663e;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.constant.C15408b;
import com.p280ss.android.ugc.asve.constant.C15411e;
import com.p280ss.android.ugc.asve.constant.C15415i;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.context.PreviewSize;
import com.p280ss.android.vesdk.VECameraSettings;
import com.p280ss.android.vesdk.VECameraSettings.C45180a;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.d.a */
public final class C15441a {
    /* renamed from: b */
    private static final int m45220b() {
        switch (C6855a.m21306a().mo38965v()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            default:
                return 1;
        }
    }

    /* renamed from: a */
    private static final CAMERA_OUTPUT_MODE m45218a() {
        switch (C6855a.m21306a().mo38965v()) {
            case 1:
                return CAMERA_OUTPUT_MODE.SURFACE;
            case 2:
                return CAMERA_OUTPUT_MODE.FRAME;
            case 3:
                return CAMERA_OUTPUT_MODE.SURFACE_FRAME;
            default:
                return CAMERA_OUTPUT_MODE.SURFACE;
        }
    }

    /* renamed from: b */
    public static final C19663e m45221b(C15422c cVar) {
        C7573i.m23587b(cVar, "$this$toCameraParams");
        C19663e eVar = new C19663e(C6855a.m21308b(), cVar.mo38911b().ordinal());
        eVar.f53270s = cVar.mo38913d();
        eVar.f53268q = cVar.mo38914e();
        eVar.f53267p = cVar.mo38912c().ordinal();
        eVar.f53266o = m45220b();
        return eVar;
    }

    /* renamed from: a */
    public static final VECameraSettings m45219a(C15422c cVar) {
        C7573i.m23587b(cVar, "$this$toCameraSettings");
        C45180a aVar = new C45180a();
        aVar.mo107824a(C15411e.m45061a(cVar.mo38911b()));
        aVar.mo107827b(cVar.mo38913d());
        aVar.mo107821a(C15415i.m45062a(cVar.mo38910a()));
        aVar.mo107822a(C15408b.m45060a(cVar.mo38912c()));
        aVar.mo107818a(cVar.mo38914e());
        aVar.mo107823a(m45218a());
        aVar.mo107826b(2);
        PreviewSize y = C6855a.m21306a().mo38968y();
        if (y != null) {
            aVar.mo107820a(y.getWidth(), y.getHeight());
        }
        VECameraSettings vECameraSettings = aVar.f116145a;
        C7573i.m23582a((Object) vECameraSettings, "VECameraSettings.Builder…)\n        }\n    }.build()");
        return vECameraSettings;
    }
}
