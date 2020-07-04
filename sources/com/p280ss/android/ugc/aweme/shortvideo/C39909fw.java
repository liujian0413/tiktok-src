package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42154au;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fw */
public final class C39909fw implements C42161ba {

    /* renamed from: a */
    C39382ed f103680a;

    /* renamed from: b */
    private RecordToolbarViewModel f103681b;

    public C39909fw(C39382ed edVar) {
        this.f103680a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42154au.class) {
            return null;
        }
        return new C39910fx(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99318a(Object obj, C42155av avVar) {
        int i;
        C42154au auVar = (C42154au) avVar;
        if (this.f103681b == null) {
            this.f103681b = (RecordToolbarViewModel) C36113b.m116288a(this.f103680a.mo97962O()).mo91871a(RecordToolbarViewModel.class);
        }
        this.f103681b.mo107185b(auVar.f109685a);
        if (this.f103680a.f102277G.mo56029e()) {
            RecordToolbarViewModel recordToolbarViewModel = this.f103681b;
            if (auVar.f109685a) {
                i = 5;
            } else {
                i = 6;
            }
            recordToolbarViewModel.mo107181a(new C42585u(i));
        }
    }
}
