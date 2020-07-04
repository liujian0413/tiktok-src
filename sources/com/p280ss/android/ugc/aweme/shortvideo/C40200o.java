package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42345j;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.o */
public final class C40200o implements C42161ba {

    /* renamed from: a */
    C39382ed f104495a;

    /* renamed from: b */
    public RecordToolbarViewModel f104496b;

    public C40200o(C39382ed edVar) {
        this.f104495a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42345j.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                if (C40200o.this.f104496b == null) {
                    C40200o.this.f104496b = (RecordToolbarViewModel) C36113b.m116288a(C40200o.this.f104495a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
                }
                C40200o.this.f104496b.mo29069f();
                ShortVideoContext shortVideoContext = C40200o.this.f104495a.mo97964Q().f99791a;
                if (!shortVideoContext.f99744ae) {
                    C40200o.this.f104495a.mo97963P().mo103594a((Object) this, (C42155av) new C42153at(shortVideoContext.f99745af, false));
                    C40200o.this.f104495a.mo97896J().mo103594a((Object) this, (C42155av) new C42153at(shortVideoContext.f99745af, false));
                }
            }
        };
    }
}
