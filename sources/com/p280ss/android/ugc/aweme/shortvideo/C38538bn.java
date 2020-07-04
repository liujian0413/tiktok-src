package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42588x;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bn */
public final class C38538bn implements C42161ba {

    /* renamed from: a */
    C39382ed f100156a;

    public C38538bn(C39382ed edVar) {
        this.f100156a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42588x.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C42588x xVar = (C42588x) t;
                if (xVar.f110745d == 1) {
                    C38538bn.this.f100156a.f102273C.f103758b = xVar.f110742a;
                } else if (xVar.f110745d == 2) {
                    C38538bn.this.f100156a.f102273C.f103759c = xVar.f110743b;
                } else {
                    if (xVar.f110745d == 3) {
                        C38538bn.this.f100156a.f102273C.f103757a = (C39944a) xVar.f110744c;
                    }
                }
            }
        };
    }
}
