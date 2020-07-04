package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42149ap;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fm */
public final class C39894fm implements C42161ba {

    /* renamed from: a */
    C39382ed f103652a;

    /* renamed from: b */
    private RecordControlViewModel f103653b;

    public C39894fm(C39382ed edVar) {
        this.f103652a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42149ap.class) {
            return null;
        }
        return new C39895fn(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99310a(Object obj, C42155av avVar) {
        if (this.f103653b == null) {
            this.f103653b = (RecordControlViewModel) C36113b.m116288a(this.f103652a.mo97962O()).mo91871a(RecordControlViewModel.class);
        }
        this.f103652a.mo97909d(false);
        this.f103653b.mo106960e(8);
    }
}
