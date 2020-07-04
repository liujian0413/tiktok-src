package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42343h;
import com.p280ss.android.ugc.gamora.bottomtab.C43866b;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f.C43871a;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.C44442a;
import com.p280ss.android.ugc.gamora.recorder.C44462c;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dp */
public final class C39352dp implements C42161ba {

    /* renamed from: a */
    private final VideoRecordNewActivity f102232a;

    C39352dp(C39382ed edVar) {
        this.f102232a = (VideoRecordNewActivity) edVar.f33526d_;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42343h.class) {
            return null;
        }
        return new C39353dq(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97920a(Object obj, C42155av avVar) {
        C42343h hVar = (C42343h) avVar;
        C43871a aVar = new C43871a(hVar.f110141c);
        for (C44462c cVar : C44442a.m140572a()) {
            C43866b bVar = cVar.f114729b;
            if (TextUtils.equals((CharSequence) hVar.f110139a, bVar.f113643c)) {
                cVar.f114728a.setValue(Boolean.valueOf(false));
                if (bVar.f113646f != null) {
                    bVar.f113646f.mo94783b(bVar, aVar);
                }
            }
            if (TextUtils.equals((CharSequence) hVar.f110140b, bVar.f113643c)) {
                cVar.f114728a.setValue(Boolean.valueOf(true));
                if (bVar.f113646f != null) {
                    bVar.f113646f.mo94782a(bVar, aVar);
                }
            }
        }
        if (TextUtils.equals((CharSequence) hVar.f110139a, this.f102232a.getString(R.string.dcp)) && !TextUtils.equals((CharSequence) hVar.f110140b, this.f102232a.getString(R.string.dcp))) {
            ((RecordControlViewModel) C36113b.m116288a(this.f102232a).mo91871a(RecordControlViewModel.class)).mo106953a(true);
        }
    }
}
