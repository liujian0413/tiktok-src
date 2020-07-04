package com.p280ss.android.ugc.aweme.notification.tutorialvideo;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d.C34324a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34325e;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel */
public final class TutorialVideoViewModel extends C0063u {

    /* renamed from: a */
    public final C0052o<TutorialVideoResp> f90327a = new C0052o<>();

    /* renamed from: com.ss.android.ugc.aweme.notification.tutorialvideo.TutorialVideoViewModel$a */
    static final class C34605a<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ TutorialVideoViewModel f90328a;

        C34605a(TutorialVideoViewModel tutorialVideoViewModel) {
            this.f90328a = tutorialVideoViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<TutorialVideoResp> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6882b()) {
                if (!(hVar.mo6890e() == null || ((TutorialVideoResp) hVar.mo6890e()).getInfo() == null)) {
                    TutorialVideoInfo info = ((TutorialVideoResp) hVar.mo6890e()).getInfo();
                    C34325e eVar = (C34325e) C34324a.m111010a(C34325e.class);
                    if (!TextUtils.isEmpty(info.getAwemeId()) && eVar != null) {
                        eVar.mo60349b(info.getAwemeId());
                    }
                    if (!TextUtils.isEmpty(info.getTitle()) && eVar != null) {
                        eVar.mo60351d(info.getTitle());
                    }
                    if (!TextUtils.isEmpty(info.getContent()) && eVar != null) {
                        eVar.mo60353f(info.getContent());
                    }
                    if (!TextUtils.isEmpty(info.getButton()) && eVar != null) {
                        eVar.mo60355h(info.getButton());
                    }
                }
                this.f90328a.f90327a.postValue(hVar.mo6890e());
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo87893a(int i) {
        TutorialVideoApiManager.f89509c.mo87203a(i).mo6885c((C1591g<TResult, TContinuationResult>) new C34605a<TResult,TContinuationResult>(this));
    }
}
