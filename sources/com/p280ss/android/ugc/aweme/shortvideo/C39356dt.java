package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42139af;
import com.p280ss.android.ugc.aweme.tools.C42142ai;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dt */
public final class C39356dt implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f102237a;

    /* renamed from: b */
    ASCameraView f102238b;

    public C39356dt(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f102238b = aSCameraView;
        this.f102237a = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42139af.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C39356dt.this.f102237a.f107337w.mo103594a((Object) this, (C42155av) new C42142ai());
                C39356dt.this.f102238b.setNextCameraMode(0);
                C39356dt.this.f102237a.f107327m.mo100090i();
                C39356dt.this.f102238b.mo56254g(true);
            }
        };
    }
}
