package com.p280ss.android.ugc.aweme.shortvideo.p1547a;

import android.view.SurfaceView;
import com.p280ss.android.ugc.asve.p754b.C15383a;
import com.p280ss.android.ugc.asve.p754b.C15390e;
import com.p280ss.android.ugc.asve.p754b.C15391f;
import com.p280ss.android.ugc.asve.p754b.C15393h;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.p280ss.android.vesdk.VEException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.a.b */
public final class C38420b extends C15383a {
    public C38420b(String str) throws VEException {
        C7573i.m23587b(str, "workSpace");
        super(str);
    }

    /* renamed from: a */
    public final int mo38772a(C15390e eVar) {
        C7573i.m23587b(eVar, "param");
        if (eVar instanceof C15391f) {
            C15391f fVar = (C15391f) eVar;
            fVar.mo38888a(C43142i.m136844a(fVar.f39692j, MediaType.VIDEO));
        } else if (eVar instanceof C15393h) {
            C15393h hVar = (C15393h) eVar;
            hVar.mo38889a(C43142i.m136844a(hVar.f39696b, MediaType.IMAGE));
        }
        return super.mo38772a(eVar);
    }

    public C38420b(String str, SurfaceView surfaceView) {
        C7573i.m23587b(str, "workSpace");
        C7573i.m23587b(surfaceView, "surfaceView");
        super(str, surfaceView);
    }

    /* renamed from: a */
    public final int mo38781a(String str, int i, int i2) {
        C7573i.m23587b(str, "path");
        return super.mo38781a(C43142i.m136842a(str, MediaType.AUDIO), i, i2);
    }

    public C38420b(String str, SurfaceView surfaceView, long j) {
        C7573i.m23587b(str, "workSpace");
        C7573i.m23587b(surfaceView, "surfaceView");
        super(str, surfaceView, j);
    }

    /* renamed from: a */
    public final int mo38783a(String str, int i, int i2, boolean z) {
        C7573i.m23587b(str, "file");
        return super.mo38783a(C43142i.m136842a(str, MediaType.AUDIO), i, i2, z);
    }
}
