package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42568n;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aa */
public final class C38421aa implements C42161ba {

    /* renamed from: a */
    C39382ed f99859a;

    /* renamed from: b */
    public RecordToolbarViewModel f99860b;

    public C38421aa(C39382ed edVar) {
        this.f99859a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42568n.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C42568n nVar = (C42568n) t;
                if (C38421aa.this.f99860b == null) {
                    C38421aa.this.f99860b = (RecordToolbarViewModel) C36113b.m116288a(C38421aa.this.f99859a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
                }
                if (nVar.f110702a == null) {
                    C38421aa.this.f99860b.mo29069f();
                } else {
                    C38421aa.this.f99860b.mo107190g();
                }
                ShortVideoContext shortVideoContext = C38421aa.this.f99859a.mo97964Q().f99791a;
                if (!shortVideoContext.f99744ae) {
                    C38421aa.this.f99859a.mo97963P().mo103594a((Object) this, (C42155av) new C42153at(shortVideoContext.f99745af, false));
                    C38421aa.this.f99859a.mo97896J().mo103594a((Object) this, (C42155av) new C42153at(shortVideoContext.f99745af, false));
                }
            }
        };
    }
}
