package com.p280ss.android.ugc.aweme.profile.jedi.p1485a;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.service.C36075k;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39328f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.c */
final class C35824c {

    /* renamed from: a */
    public static final C35824c f93878a = new C35824c();

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.c$a */
    public static final class C35825a implements DraftListener {
        C35825a() {
        }

        public final void onDraftCheckedChanged(C27311c cVar, boolean z) {
            C7573i.m23587b(cVar, "draft");
        }

        public final void onDraftClean() {
            C35820b.m115646c();
        }

        public final void onDraftDelete(C27311c cVar) {
            C35820b.m115646c();
            C35820b.m115645b().mo19128a();
        }

        public final void onDraftUpdate(C27311c cVar) {
            C7573i.m23587b(cVar, "draft");
            C35820b.m115644a(cVar).mo19128a();
        }
    }

    private C35824c() {
    }

    /* renamed from: a */
    public final void mo90719a() {
        C42961az.m136382c(this);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(new C35825a());
    }

    @C7709l
    public final void onPublishStatusUpdate(C39328f fVar) {
        C7573i.m23587b(fVar, "event");
        if (fVar.f102148b == 9 && !C36075k.f94317a.mo59240a()) {
            C35820b.m115645b().mo19128a();
        }
    }
}
