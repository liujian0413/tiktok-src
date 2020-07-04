package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ft */
public final class C39905ft implements C42161ba {

    /* renamed from: a */
    C39382ed f103674a;

    /* renamed from: b */
    private RecordToolbarViewModel f103675b;

    public C39905ft(C39382ed edVar) {
        this.f103674a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42153at.class) {
            return null;
        }
        return new C39906fu(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99317a(Object obj, C42155av avVar) {
        C42153at atVar = (C42153at) avVar;
        if (this.f103675b == null) {
            this.f103675b = (RecordToolbarViewModel) C36113b.m116288a(this.f103674a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
        }
        this.f103675b.mo107179a(atVar);
        this.f103674a.mo97964Q().f99791a.f99744ae = !atVar.f109683a;
    }
}
