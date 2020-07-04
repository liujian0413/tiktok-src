package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42590z;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bt */
public final class C38546bt implements C42161ba {

    /* renamed from: a */
    private C39382ed f100184a;

    /* renamed from: b */
    private RecordViewModel f100185b;

    C38546bt(C39382ed edVar) {
        this.f100184a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42590z.class) {
            return null;
        }
        return new C38547bu(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96535a(Object obj, C42155av avVar) {
        C42590z zVar = (C42590z) avVar;
        if (this.f100185b == null) {
            this.f100185b = (RecordViewModel) C36113b.m116288a(this.f100184a.mo97962O()).mo91871a(RecordViewModel.class);
        }
        this.f100185b.mo106832a(Integer.valueOf(zVar.f110747a));
    }
}
