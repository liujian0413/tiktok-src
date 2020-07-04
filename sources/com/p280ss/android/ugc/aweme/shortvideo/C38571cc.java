package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.tools.C42135ab;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cc */
public final class C38571cc implements C42161ba {

    /* renamed from: a */
    public final C39382ed f100211a;

    public C38571cc(C39382ed edVar) {
        this.f100211a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42135ab.class) {
            return null;
        }
        return new C42159az<T>() {

            /* renamed from: a */
            RecordProgressViewModel f100212a;

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                if (this.f100212a == null) {
                    this.f100212a = (RecordProgressViewModel) C36113b.m116288a(C38571cc.this.f100211a.mo97962O()).mo91871a(RecordProgressViewModel.class);
                }
                this.f100212a.mo107136a(((C42135ab) t).f109652a);
            }
        };
    }
}
