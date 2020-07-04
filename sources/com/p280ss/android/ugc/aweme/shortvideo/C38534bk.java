package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42586v;
import com.p280ss.android.ugc.aweme.tools.C42587w;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bk */
public final class C38534bk implements C42161ba {

    /* renamed from: a */
    C39382ed f100151a;

    /* renamed from: b */
    private RecordToolbarViewModel f100152b;

    public C38534bk(C39382ed edVar) {
        this.f100151a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42586v.class) {
            return null;
        }
        return new C38535bl(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96523a(Object obj, C42155av avVar) {
        C42586v vVar = (C42586v) avVar;
        if (this.f100152b == null) {
            this.f100152b = (RecordToolbarViewModel) C36113b.m116288a(this.f100151a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
        }
        this.f100152b.mo107182a(new C42587w(vVar.f110738a, vVar.f110739b));
        if (!vVar.f110738a) {
            ((VideoRecordNewActivity) this.f100151a.f33526d_).f107327m.mo100082b(0);
        }
    }
}
