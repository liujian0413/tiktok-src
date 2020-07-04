package com.p280ss.android.ugc.aweme.tools.draft.p1668c;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.tools.draft.p1666a.C42275a;
import com.p280ss.android.ugc.aweme.tools.draft.p1667b.C42278a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b */
public abstract class C42281b {

    /* renamed from: a */
    private final List<C42278a> f110039a = new ArrayList();

    /* renamed from: a */
    public abstract int mo103762a();

    /* renamed from: a */
    public abstract boolean mo103763a(C27311c cVar);

    /* renamed from: b */
    public final List<C42278a> mo103764b() {
        m134501c();
        return this.f110039a;
    }

    /* renamed from: c */
    private final void m134501c() {
        List<C42278a> list = this.f110039a;
        int size = list.size();
        int i = size - 1;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < size; i4++) {
                if (((C42278a) list.get(i4)).mo103761a((C42278a) list.get(i2))) {
                    C42278a aVar = (C42278a) list.get(i2);
                    list.set(i2, list.get(i4));
                    list.set(i4, aVar);
                }
            }
            i2 = i3;
        }
    }

    /* renamed from: b */
    public final void mo103765b(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        C42278a aVar = (C42278a) C7525m.m23517i(this.f110039a);
        if (C42275a.m134485a(aVar, cVar)) {
            aVar.mo103760a(cVar);
            return;
        }
        C42278a aVar2 = new C42278a();
        aVar2.f110029a = cVar.f72036e;
        aVar2.mo103760a(cVar);
        this.f110039a.add(aVar2);
    }
}
