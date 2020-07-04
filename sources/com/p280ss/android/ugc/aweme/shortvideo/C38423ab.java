package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40229a;
import com.p280ss.android.ugc.aweme.tools.C42141ah;
import com.p280ss.android.ugc.aweme.tools.C42146am;
import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42250d;
import com.p280ss.android.ugc.aweme.tools.C42569o;
import java.lang.reflect.Type;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab */
public final class C38423ab implements C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f99862a;

    public C38423ab(VideoRecordNewActivity videoRecordNewActivity) {
        this.f99862a = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42569o.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C38423ab.this.f99862a.mo101850j();
                C40229a.m128552a().clear();
                C42141ah a = C42141ah.m134103a(Collections.emptyList(), 0);
                C38423ab.this.f99862a.f107337w.mo103594a((Object) C38423ab.this.f99862a, (C42155av) a);
                C42153at atVar = new C42153at(C38423ab.this.f99862a.f107286a.f99745af, false);
                C42146am amVar = new C42146am(3);
                C38423ab.this.f99862a.f107337w.mo103594a((Object) C38423ab.this.f99862a, (C42155av) atVar);
                C38423ab.this.f99862a.f107337w.mo103594a((Object) C38423ab.this.f99862a, (C42155av) amVar);
                C38423ab.this.f99862a.f107338x.mo103594a((Object) C38423ab.this.f99862a, (C42155av) new C42250d());
                a.mo103576a();
            }
        };
    }
}
