package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d.C34324a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34325e;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.i */
public final class C37249i implements C7152c {

    /* renamed from: com.ss.android.ugc.aweme.requesttask.idle.i$a */
    static final class C37250a<TTaskResult, TContinuationResult> implements C1591g<TutorialVideoResp, Object> {

        /* renamed from: a */
        public static final C37250a f97367a = new C37250a();

        C37250a() {
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            return m119701a(hVar);
        }

        /* renamed from: a */
        private static Void m119701a(C1592h<TutorialVideoResp> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (!hVar.mo6882b()) {
                return null;
            }
            C34325e eVar = (C34325e) C34324a.m111010a(C34325e.class);
            if (hVar.mo6890e() == null || ((TutorialVideoResp) hVar.mo6890e()).getInfo() == null) {
                if (eVar != null) {
                    eVar.mo60349b("");
                }
                if (eVar != null) {
                    eVar.mo60351d("");
                }
                if (eVar != null) {
                    eVar.mo60353f("");
                }
                if (eVar != null) {
                    eVar.mo60355h("");
                }
            } else {
                int count = ((TutorialVideoResp) hVar.mo6890e()).getCount();
                C34315c.m110976a(1000, count);
                C42961az.m136381b(new C34314g(1000, count));
                if (!TextUtils.isEmpty(((TutorialVideoResp) hVar.mo6890e()).getInfo().getAwemeId()) && eVar != null) {
                    eVar.mo60349b(((TutorialVideoResp) hVar.mo6890e()).getInfo().getAwemeId());
                }
                if (!TextUtils.isEmpty(((TutorialVideoResp) hVar.mo6890e()).getInfo().getTitle()) && eVar != null) {
                    eVar.mo60351d(((TutorialVideoResp) hVar.mo6890e()).getInfo().getTitle());
                }
                if (!TextUtils.isEmpty(((TutorialVideoResp) hVar.mo6890e()).getInfo().getContent()) && eVar != null) {
                    eVar.mo60353f(((TutorialVideoResp) hVar.mo6890e()).getInfo().getContent());
                }
                if (!TextUtils.isEmpty(((TutorialVideoResp) hVar.mo6890e()).getInfo().getButton()) && eVar != null) {
                    eVar.mo60355h(((TutorialVideoResp) hVar.mo6890e()).getInfo().getButton());
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final RequestType mo18606a() {
        return RequestType.NORMAL;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        TutorialVideoApiManager.f89509c.mo87203a(0).mo6886c(C37250a.f97367a, C1592h.f5958b);
    }
}
