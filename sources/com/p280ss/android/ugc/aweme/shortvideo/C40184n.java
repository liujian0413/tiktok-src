package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42345j;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.n */
public final class C40184n implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f104458a;

    /* renamed from: b */
    ASCameraView f104459b;

    public C40184n(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f104458a = videoRecordNewActivity;
        this.f104459b = aSCameraView;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42345j.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C40184n.this.f104459b.mo56287h(true);
                C40184n.this.f104459b.mo56289i(false);
                C40184n.this.f104459b.setMusicPath("");
                C40184n.this.f104459b.mo56226a("", 0, 0);
                C40184n.this.f104459b.mo56249d(false);
                C40184n.this.f104458a.f107324j.mo100266a();
                C40184n.this.f104458a.f107286a.f99771g = 0;
                C40184n.this.f104458a.f107286a.f99770f = 0;
                C40184n.this.f104458a.f107286a.f99775k.mo96318f();
                C40184n.this.f104458a.f107286a.f99769e = null;
                C40184n.this.f104458a.mo101860q();
            }
        };
    }
}
