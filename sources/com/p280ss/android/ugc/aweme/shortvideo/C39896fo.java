package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fo */
public final class C39896fo implements C42161ba {

    /* renamed from: a */
    C39382ed f103655a;

    public C39896fo(C39382ed edVar) {
        this.f103655a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42151ar.class) {
            return null;
        }
        final C42159az a = awVar.mo103592a((C42161ba) this, type);
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                if (a != null) {
                    a.mo96096a(obj, t);
                }
                ((VideoRecordNewActivity) C39896fo.this.f103655a.f33526d_).f107324j.mo100304b(true);
            }
        };
    }
}
