package com.p280ss.android.ugc.aweme.profile.widgets;

import com.p280ss.android.ugc.aweme.p1049ay.C23142a;
import com.p280ss.android.ugc.aweme.profile.survey.C36080e.C36081a;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.l */
public final class C36911l implements C36081a {

    /* renamed from: a */
    private final WeakReference<MyProfileGuideViewModel> f96723a;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.l$a */
    static final class C36912a extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        final /* synthetic */ C23142a f96724a;

        C36912a(C23142a aVar) {
            this.f96724a = aVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            C7573i.m23587b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, true, this.f96724a, null, null, null, null, 487, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.l$b */
    static final class C36913b extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C36913b f96725a = new C36913b();

        C36913b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118778a((MyProfileGuideState) obj);
        }

        /* renamed from: a */
        private static MyProfileGuideState m118778a(MyProfileGuideState myProfileGuideState) {
            C7573i.m23587b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, true, null, null, null, null, null, 487, null);
        }
    }

    public C36911l(MyProfileGuideViewModel myProfileGuideViewModel) {
        C7573i.m23587b(myProfileGuideViewModel, "profileGuideViewModel");
        this.f96723a = new WeakReference<>(myProfileGuideViewModel);
    }

    /* renamed from: a */
    public final void mo91816a(C23142a aVar) {
        MyProfileGuideViewModel myProfileGuideViewModel = (MyProfileGuideViewModel) this.f96723a.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.mo93147f(new C36912a(aVar));
        }
    }

    /* renamed from: a */
    public final void mo91817a(Exception exc) {
        MyProfileGuideViewModel myProfileGuideViewModel = (MyProfileGuideViewModel) this.f96723a.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.mo93147f(C36913b.f96725a);
        }
    }
}
