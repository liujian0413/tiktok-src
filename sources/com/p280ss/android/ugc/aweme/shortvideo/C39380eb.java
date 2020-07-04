package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42140ag;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eb */
public final class C39380eb implements C42161ba {

    /* renamed from: a */
    C39382ed f102269a;

    public C39380eb(C39382ed edVar) {
        this.f102269a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42140ag.class) {
            return null;
        }
        return new C39381ec(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97960a(Object obj, C42155av avVar) {
        ((RecordControlViewModel) C36113b.m116288a(this.f102269a.mo97962O()).mo91871a(RecordControlViewModel.class)).mo106953a(false);
    }
}
