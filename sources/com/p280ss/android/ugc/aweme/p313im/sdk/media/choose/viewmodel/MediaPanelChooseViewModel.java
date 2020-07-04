package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1332c.C31395a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1332c.C31397b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1332c.C31399c;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1328a.C31341a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel */
public final class MediaPanelChooseViewModel extends MediaChooseViewModel {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f82306f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPanelChooseViewModel.class), "mediaModelList", "getMediaModelList()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPanelChooseViewModel.class), "previewChooseResult", "getPreviewChooseResult()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;"))};

    /* renamed from: h */
    public static final C31426a f82307h = new C31426a(null);

    /* renamed from: g */
    public volatile boolean f82308g;

    /* renamed from: i */
    private final C7541d f82309i = C7546e.m23569a(C31427b.f82311a);

    /* renamed from: j */
    private final C7541d f82310j = C7546e.m23569a(C31428c.f82312a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$a */
    public static final class C31426a {
        private C31426a() {
        }

        public /* synthetic */ C31426a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MediaPanelChooseViewModel m102239a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(MediaPanelChooseViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…oseViewModel::class.java)");
            return (MediaPanelChooseViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$b */
    static final class C31427b extends Lambda implements C7561a<C23084b<List<MediaModel>>> {

        /* renamed from: a */
        public static final C31427b f82311a = new C31427b();

        C31427b() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<List<MediaModel>> m102240a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102240a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$c */
    static final class C31428c extends Lambda implements C7561a<C23084b<MediaChooseResult>> {

        /* renamed from: a */
        public static final C31428c f82312a = new C31428c();

        C31428c() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<MediaChooseResult> m102241a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102241a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$d */
    static final class C31429d<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ MediaPanelChooseViewModel f82313a;

        /* renamed from: b */
        final /* synthetic */ boolean f82314b;

        C31429d(MediaPanelChooseViewModel mediaPanelChooseViewModel, boolean z) {
            this.f82313a = mediaPanelChooseViewModel;
            this.f82314b = z;
        }

        public final void subscribe(C47870u<List<MediaModel>> uVar) {
            C7573i.m23587b(uVar, "emitter");
            try {
                List a = C31397b.m102165a(new C31395a(), new C31399c(), 50);
                if (this.f82314b) {
                    MediaPanelChooseViewModel.m102235a(a);
                }
                C31341a.m102050a(uVar, a);
            } catch (Throwable th) {
                C31341a.m102051a(uVar, th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$e */
    static final class C31430e<T> implements C7326g<List<MediaModel>> {

        /* renamed from: a */
        final /* synthetic */ MediaPanelChooseViewModel f82315a;

        C31430e(MediaPanelChooseViewModel mediaPanelChooseViewModel) {
            this.f82315a = mediaPanelChooseViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(List<MediaModel> list) {
            this.f82315a.mo82006o().setValue(list);
            this.f82315a.f82308g = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel$f */
    static final class C31431f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MediaPanelChooseViewModel f82316a;

        C31431f(MediaPanelChooseViewModel mediaPanelChooseViewModel) {
            this.f82316a = mediaPanelChooseViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C6921a.m21559a(th);
            this.f82316a.mo82006o().setValue(new ArrayList());
            this.f82316a.f82308g = false;
        }
    }

    /* renamed from: o */
    public final C23084b<List<MediaModel>> mo82006o() {
        return (C23084b) this.f82309i.getValue();
    }

    /* renamed from: p */
    public final C23084b<MediaChooseResult> mo82007p() {
        return (C23084b) this.f82310j.getValue();
    }

    /* renamed from: l */
    public final void mo82003l() {
        if (!this.f82308g) {
            boolean z = true;
            this.f82308g = true;
            Collection collection = (Collection) mo82006o().getValue();
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            C7321c a = C7492s.m23282a((C7495v<T>) new C31429d<T>(this, z)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C31430e<Object>(this), (C7326g<? super Throwable>) new C31431f<Object>(this));
            mo82002d().mo119660a();
            mo82002d().mo119661a(a);
        }
    }

    /* renamed from: a */
    public static void m102235a(List<MediaModel> list) {
        if (list.size() > 4) {
            list = list.subList(0, 4);
        }
        for (MediaModel accurateSize$default : list) {
            MediaModel.accurateSize$default(accurateSize$default, true, null, 2, null);
        }
    }
}
