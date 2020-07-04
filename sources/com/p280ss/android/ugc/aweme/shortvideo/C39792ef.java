package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42141ah;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordModeViewModel;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel;
import java.lang.reflect.Type;
import kotlin.Pair;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ef */
public final class C39792ef implements C42161ba {

    /* renamed from: a */
    public C39382ed f103431a;

    C39792ef(C39382ed edVar) {
        this.f103431a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42141ah.class) {
            return null;
        }
        return new C42159az<T>() {

            /* renamed from: a */
            RecordControlViewModel f103432a;

            /* renamed from: b */
            RecordViewModel f103433b;

            /* renamed from: c */
            RecordProgressViewModel f103434c;

            /* renamed from: d */
            ShortVideoContext f103435d;

            /* renamed from: e */
            ShortVideoContextViewModel f103436e;

            /* renamed from: f */
            RecordModeViewModel f103437f;

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                long j;
                boolean z;
                int i;
                if (this.f103432a == null) {
                    this.f103432a = (RecordControlViewModel) C36113b.m116288a(C39792ef.this.f103431a.mo97962O()).mo91871a(RecordControlViewModel.class);
                }
                if (this.f103433b == null) {
                    this.f103433b = (RecordViewModel) C36113b.m116288a(C39792ef.this.f103431a.mo97962O()).mo91871a(RecordViewModel.class);
                }
                if (this.f103437f == null) {
                    this.f103437f = (RecordModeViewModel) C36113b.m116288a(C39792ef.this.f103431a.mo97962O()).mo91871a(RecordModeViewModel.class);
                }
                if (this.f103434c == null) {
                    this.f103434c = (RecordProgressViewModel) C36113b.m116288a(C39792ef.this.f103431a.mo97962O()).mo91871a(RecordProgressViewModel.class);
                }
                if (this.f103435d == null) {
                    this.f103435d = ((ShortVideoContextViewModel) C0069x.m159a(C39792ef.this.f103431a.mo97962O()).mo147a(ShortVideoContextViewModel.class)).f99791a;
                    this.f103436e = (ShortVideoContextViewModel) C0069x.m159a(C39792ef.this.f103431a.mo97962O()).mo147a(ShortVideoContextViewModel.class);
                }
                C42141ah ahVar = (C42141ah) t;
                if (this.f103435d.f99779o) {
                    this.f103437f.mo107125a(new Pair<>(ahVar.f109664a, Long.valueOf(ahVar.f109665b)));
                } else {
                    this.f103434c.mo107137a(new Pair<>(ahVar.f109664a, Long.valueOf(ahVar.f109665b)));
                }
                long j2 = ahVar.f109665b;
                if (this.f103435d.mo96144e()) {
                    j = this.f103435d.f99767c;
                } else if (this.f103435d.f99779o) {
                    j = this.f103435d.f99780p;
                } else {
                    j = C39810eq.m127460a();
                }
                if (j2 >= j) {
                    z = true;
                } else {
                    z = false;
                }
                this.f103432a.mo106957c(z);
                if (!ahVar.f109664a.isEmpty() || ahVar.f109665b != 0) {
                    RecordControlViewModel recordControlViewModel = this.f103432a;
                    if (z) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    recordControlViewModel.mo106958d(i);
                    this.f103432a.mo106961f(4);
                    this.f103433b.mo106836b(4);
                    if (this.f103436e.mo96173e()) {
                        this.f103432a.mo106960e(0);
                        this.f103432a.mo106958d(0);
                    }
                } else {
                    this.f103432a.mo106960e(4);
                    this.f103432a.mo106958d(4);
                    if (!this.f103435d.f99779o) {
                        this.f103433b.mo106836b(0);
                        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) C39792ef.this.f103431a.f33526d_;
                        if (!videoRecordNewActivity.f107286a.mo96142d() && !videoRecordNewActivity.f107286a.mo96144e() && this.f103436e.mo96173e()) {
                            this.f103432a.mo106961f(0);
                        }
                    }
                }
            }
        };
    }
}
