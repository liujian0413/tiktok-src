package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0052o;
import com.p280ss.android.ugc.aweme.tools.C42145al;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42346k;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ei */
public final class C39797ei implements C42161ba {

    /* renamed from: a */
    public RecordControlViewModel f103447a;

    /* renamed from: b */
    public RecordViewModel f103448b;

    /* renamed from: c */
    public RecordToolbarViewModel f103449c;

    /* renamed from: d */
    public RecordChooseMusicViewModel f103450d;

    /* renamed from: e */
    public final C39382ed f103451e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ei$a */
    public static final class C39798a implements C42159az<T> {

        /* renamed from: a */
        final /* synthetic */ C39797ei f103452a;

        C39798a(C39797ei eiVar) {
            this.f103452a = eiVar;
        }

        /* renamed from: a */
        public final void mo96096a(Object obj, T t) {
            if (this.f103452a.f103451e.f33526d_ != null) {
                if (this.f103452a.f103447a == null) {
                    this.f103452a.f103447a = (RecordControlViewModel) C36113b.m116288a(this.f103452a.f103451e.mo97962O()).mo91871a(RecordControlViewModel.class);
                }
                if (this.f103452a.f103448b == null) {
                    this.f103452a.f103448b = (RecordViewModel) C36113b.m116288a(this.f103452a.f103451e.mo97962O()).mo91871a(RecordViewModel.class);
                }
                if (this.f103452a.f103449c == null) {
                    this.f103452a.f103449c = (RecordToolbarViewModel) C36113b.m116288a(this.f103452a.f103451e.mo97962O()).mo91871a(RecordToolbarViewModel.class);
                }
                if (this.f103452a.f103450d == null) {
                    this.f103452a.f103450d = (RecordChooseMusicViewModel) C36113b.m116288a(this.f103452a.f103451e.mo97962O()).mo91871a(RecordChooseMusicViewModel.class);
                }
                RecordControlViewModel recordControlViewModel = this.f103452a.f103447a;
                if (recordControlViewModel != null) {
                    recordControlViewModel.mo106960e(4);
                    recordControlViewModel.mo106958d(4);
                    recordControlViewModel.mo106961f(4);
                }
                this.f103452a.f103451e.mo97896J().mo103594a((Object) this.f103452a.f103451e, (C42155av) new C42346k());
                RecordToolbarViewModel recordToolbarViewModel = this.f103452a.f103449c;
                if (recordToolbarViewModel != null) {
                    recordToolbarViewModel.mo107187d(false);
                }
                RecordChooseMusicViewModel recordChooseMusicViewModel = this.f103452a.f103450d;
                if (recordChooseMusicViewModel != null) {
                    C0052o<Boolean> oVar = recordChooseMusicViewModel.f114735g;
                    if (oVar != null) {
                        oVar.setValue(Boolean.valueOf(false));
                    }
                }
                RecordViewModel recordViewModel = this.f103452a.f103448b;
                if (recordViewModel != null) {
                    recordViewModel.mo106836b(4);
                }
            }
        }
    }

    public C39797ei(C39382ed edVar) {
        C7573i.m23587b(edVar, "mOwner");
        this.f103451e = edVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        C7573i.m23587b(awVar, "context");
        C7573i.m23587b(type, "type");
        if (type != C42145al.class) {
            return null;
        }
        return new C39798a<>(this);
    }
}
