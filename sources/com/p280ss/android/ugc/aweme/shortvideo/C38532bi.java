package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bi */
public final class C38532bi implements C42161ba {

    /* renamed from: a */
    C39382ed f100148a;

    /* renamed from: b */
    private RecordToolbarViewModel f100149b;

    public C38532bi(C39382ed edVar) {
        this.f100148a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (C42585u.class != type) {
            return null;
        }
        return new C38533bj(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96522a(Object obj, C42155av avVar) {
        if (this.f100149b == null) {
            this.f100149b = (RecordToolbarViewModel) C36113b.m116288a(this.f100148a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
        }
        this.f100149b.mo107181a((C42585u) avVar);
    }
}
