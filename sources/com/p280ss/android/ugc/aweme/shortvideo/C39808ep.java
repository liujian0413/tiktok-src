package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42147an;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ep */
public final class C39808ep implements C42161ba {

    /* renamed from: a */
    public VideoRecordNewActivity f103463a;

    public C39808ep(VideoRecordNewActivity videoRecordNewActivity) {
        this.f103463a = videoRecordNewActivity;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42147an.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C39808ep.this.f103463a.f107327m.f104644f.mo55992a((Context) C39808ep.this.f103463a, ((C42147an) t).f109673a);
                C39808ep.this.f103463a.f107337w.mo103594a((Object) C39808ep.this.f103463a, (C42155av) new C42585u(0));
                C39808ep.this.f103463a.f107338x.mo103594a((Object) C39808ep.this.f103463a, (C42155av) new C42585u(0));
            }
        };
    }
}
