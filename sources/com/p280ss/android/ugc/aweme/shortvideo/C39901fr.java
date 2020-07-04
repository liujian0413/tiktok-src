package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fr */
public final class C39901fr implements C42161ba {

    /* renamed from: a */
    C39382ed f103664a;

    /* renamed from: b */
    public RecordStatusViewModel f103665b;

    C39901fr(C39382ed edVar) {
        this.f103664a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42151ar.class) {
            return null;
        }
        return new C42159az<T>() {

            /* renamed from: b */
            private RecordControlViewModel f103667b;

            /* renamed from: c */
            private RecordViewModel f103668c;

            /* renamed from: d */
            private ShortVideoContext f103669d;

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                if (C39901fr.this.f103664a.f33523b != null) {
                    if (this.f103667b == null) {
                        this.f103667b = (RecordControlViewModel) C36113b.m116288a(C39901fr.this.f103664a.mo97962O()).mo91871a(RecordControlViewModel.class);
                    }
                    if (this.f103668c == null) {
                        this.f103668c = (RecordViewModel) C36113b.m116288a(C39901fr.this.f103664a.mo97962O()).mo91871a(RecordViewModel.class);
                    }
                    if (C39901fr.this.f103665b == null) {
                        C39901fr.this.f103665b = (RecordStatusViewModel) C0069x.m159a(C39901fr.this.f103664a.mo97962O()).mo147a(RecordStatusViewModel.class);
                    }
                    if (this.f103669d == null) {
                        this.f103669d = ((ShortVideoContextViewModel) C0069x.m159a(C39901fr.this.f103664a.mo97962O()).mo147a(ShortVideoContextViewModel.class)).f99791a;
                    }
                    this.f103667b.mo29069f();
                    this.f103667b.mo106954b(0);
                    if (C39901fr.this.f103664a.mo97964Q().f99791a.mo96150k() > 0) {
                        this.f103667b.mo106958d(0);
                        this.f103667b.mo106960e(0);
                        this.f103667b.mo106961f(8);
                    } else if (!this.f103669d.f99779o) {
                        this.f103668c.mo106836b(0);
                        C39901fr.this.f103665b.mo102542m().setValue(Boolean.valueOf(false));
                    }
                    C39901fr.this.f103664a.mo97909d(true);
                }
            }
        };
    }
}
