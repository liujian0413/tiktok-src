package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42343h;
import com.p280ss.android.ugc.gamora.recorder.C44442a;
import com.p280ss.android.ugc.gamora.recorder.C44462c;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dr */
public final class C39354dr implements C42161ba {

    /* renamed from: a */
    private final VideoRecordNewActivity f102234a;

    public C39354dr(C39382ed edVar) {
        this.f102234a = (VideoRecordNewActivity) edVar.f33526d_;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42343h.class) {
            return null;
        }
        return new C39355ds(this, awVar.mo103592a((C42161ba) this, type));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97921a(C42159az azVar, Object obj, C42155av avVar) {
        if (azVar != null) {
            azVar.mo96096a(obj, avVar);
        }
        String str = "";
        C42343h hVar = (C42343h) avVar;
        if (TextUtils.equals(str, "")) {
            for (C44462c cVar : C44442a.m140572a()) {
                if (TextUtils.equals((CharSequence) hVar.f110140b, cVar.f114729b.f113643c)) {
                    str = cVar.f114729b.f113644d;
                }
            }
        }
        if (!TextUtils.equals(str, "")) {
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this.f102234a).mo147a(ShortVideoContextViewModel.class)).f99791a;
            C6907h.m21524a("change_record_mode", (Map) C22984d.m75611a().mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("shoot_way", shortVideoContext.f99788x).mo59970a("draft_id", shortVideoContext.f99790z).mo59973a("to_status", str).f60753a);
        }
    }
}
