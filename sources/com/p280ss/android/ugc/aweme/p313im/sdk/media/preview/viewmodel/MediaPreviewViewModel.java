package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.C31448a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model.MediaPreviewLifecycleObserver;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model.MediaPreviewSettings;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model.MediaPreviewSettings.C31457a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1333a.C31449a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1334b.C31452a;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel */
public final class MediaPreviewViewModel extends MediaChooseViewModel {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f82392f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPreviewViewModel.class), "currentMedia", "getCurrentMedia()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPreviewViewModel.class), "lifecycleEvent", "getLifecycleEvent()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPreviewViewModel.class), "mediaPlayHelper", "getMediaPlayHelper()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/helper/MediaPlayHelper;"))};

    /* renamed from: i */
    public static final C31467a f82393i = new C31467a(null);

    /* renamed from: g */
    public MediaPreviewSettings f82394g = C31457a.m102301a();

    /* renamed from: h */
    public C31449a f82395h;

    /* renamed from: j */
    private final C7541d f82396j = C7546e.m23569a(C31468b.f82399a);

    /* renamed from: k */
    private final C7541d f82397k = C7546e.m23569a(C31469c.f82400a);

    /* renamed from: l */
    private final C7541d f82398l = C7546e.m23569a(C31470d.f82401a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel$a */
    public static final class C31467a {
        private C31467a() {
        }

        public /* synthetic */ C31467a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MediaPreviewViewModel m102346a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(MediaPreviewViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…iewViewModel::class.java)");
            return (MediaPreviewViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel$b */
    static final class C31468b extends Lambda implements C7561a<C23084b<MediaModel>> {

        /* renamed from: a */
        public static final C31468b f82399a = new C31468b();

        C31468b() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<MediaModel> m102347a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102347a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel$c */
    static final class C31469c extends Lambda implements C7561a<C23084b<Event>> {

        /* renamed from: a */
        public static final C31469c f82400a = new C31469c();

        C31469c() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<Event> m102348a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102348a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewmodel.MediaPreviewViewModel$d */
    static final class C31470d extends Lambda implements C7561a<C31452a> {

        /* renamed from: a */
        public static final C31470d f82401a = new C31470d();

        C31470d() {
            super(0);
        }

        /* renamed from: a */
        private static C31452a m102349a() {
            return new C31452a();
        }

        public final /* synthetic */ Object invoke() {
            return m102349a();
        }
    }

    /* renamed from: o */
    public final C23084b<MediaModel> mo82089o() {
        return (C23084b) this.f82396j.getValue();
    }

    /* renamed from: p */
    public final C23084b<Event> mo82090p() {
        return (C23084b) this.f82397k.getValue();
    }

    /* renamed from: q */
    public final C31452a mo82091q() {
        return (C31452a) this.f82398l.getValue();
    }

    public final void onCleared() {
        super.onCleared();
        mo82091q().mo82056a();
    }

    /* renamed from: l */
    public final void mo82003l() {
        if (this.f82395h instanceof C31448a) {
            C31449a aVar = this.f82395h;
            if (aVar == null) {
                C7573i.m23580a();
            }
            Pair b = aVar.mo82051b();
            if (this.f82394g.isChooseMode()) {
                C23084b b2 = mo82000b();
                C31449a aVar2 = this.f82395h;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                b2.setValue(aVar2.mo82052c());
            }
            C31449a aVar3 = this.f82395h;
            if (aVar3 == null) {
                C7573i.m23580a();
            }
            MediaModel a = aVar3.mo82050a();
            if (a != null) {
                mo82089o().setValue(a);
            }
            mo81551d((List) b.getFirst(), ((Boolean) b.getSecond()).booleanValue());
        }
    }

    /* renamed from: a */
    public final void mo82088a(MediaPreviewSettings mediaPreviewSettings) {
        C7573i.m23587b(mediaPreviewSettings, "<set-?>");
        this.f82394g = mediaPreviewSettings;
    }

    /* renamed from: a */
    public final void mo82087a(Lifecycle lifecycle) {
        C7573i.m23587b(lifecycle, "lifecycle");
        lifecycle.mo55a(new MediaPreviewLifecycleObserver(mo82090p()));
    }
}
