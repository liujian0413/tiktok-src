package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42343h;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dl */
public final class C39346dl implements C42161ba {

    /* renamed from: a */
    C39382ed f102215a;

    public C39346dl(C39382ed edVar) {
        this.f102215a = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42343h.class) {
            return null;
        }
        final C42159az a = awVar.mo103592a((C42161ba) this, type);
        return new C42159az<T>() {

            /* renamed from: a */
            RecordViewModel f102216a;

            /* renamed from: a */
            private void m125699a(int i) {
                boolean z;
                RecordViewModel recordViewModel = this.f102216a;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                recordViewModel.mo106847l(z);
            }

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                if (a != null) {
                    a.mo96096a(obj, t);
                }
                if (this.f102216a == null) {
                    this.f102216a = (RecordViewModel) C36113b.m116288a(C39346dl.this.f102215a.mo97962O()).mo91871a(RecordViewModel.class);
                }
                C42343h hVar = (C42343h) t;
                if (TextUtils.equals((CharSequence) hVar.f110140b, C39346dl.this.f102215a.mo31017x().getString(R.string.dcv)) || TextUtils.equals((CharSequence) hVar.f110140b, C39346dl.this.f102215a.mo31017x().getString(R.string.dcp))) {
                    m125699a(8);
                } else if (!C39346dl.this.f102215a.mo97964Q().f99791a.mo96142d() && !C39346dl.this.f102215a.mo97964Q().f99791a.mo96144e()) {
                    m125699a(0);
                }
            }
        };
    }
}
