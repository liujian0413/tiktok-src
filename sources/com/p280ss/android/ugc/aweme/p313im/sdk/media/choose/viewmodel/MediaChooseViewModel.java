package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.ListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseParameters;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseParameters.C31401a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1332c.C31395a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1332c.C31397b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1332c.C31399c;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1328a.C31341a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31346c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel */
public class MediaChooseViewModel extends ListViewModel<MediaModel> {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f82286b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaChooseViewModel.class), "albumList", "getAlbumList()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaChooseViewModel.class), "selectedMediaList", "getSelectedMediaList()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaChooseViewModel.class), "selectedAlbum", "getSelectedAlbum()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaChooseViewModel.class), "disposable", "getDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: e */
    public static final C31417a f82287e = new C31417a(null);

    /* renamed from: c */
    public MediaChooseParameters f82288c = C31401a.m102170a();

    /* renamed from: d */
    public boolean f82289d;

    /* renamed from: f */
    private final C7541d f82290f = C7546e.m23569a(C31418b.f82294a);

    /* renamed from: g */
    private final C7541d f82291g = C7546e.m23569a(C31425i.f82305a);

    /* renamed from: h */
    private final C7541d f82292h = C7546e.m23569a(C31424h.f82304a);

    /* renamed from: i */
    private final C7541d f82293i = C7546e.m23569a(C31419c.f82295a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$a */
    public static final class C31417a {
        private C31417a() {
        }

        public /* synthetic */ C31417a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MediaChooseViewModel m102227a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(MediaChooseViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…oseViewModel::class.java)");
            return (MediaChooseViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$b */
    static final class C31418b extends Lambda implements C7561a<C23084b<List<C31403a>>> {

        /* renamed from: a */
        public static final C31418b f82294a = new C31418b();

        C31418b() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<List<C31403a>> m102228a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102228a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$c */
    static final class C31419c extends Lambda implements C7561a<C47562b> {

        /* renamed from: a */
        public static final C31419c f82295a = new C31419c();

        C31419c() {
            super(0);
        }

        /* renamed from: a */
        private static C47562b m102229a() {
            return new C47562b();
        }

        public final /* synthetic */ Object invoke() {
            return m102229a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$d */
    static final class C31420d<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewModel f82296a;

        C31420d(MediaChooseViewModel mediaChooseViewModel) {
            this.f82296a = mediaChooseViewModel;
        }

        public final void subscribe(C47870u<List<C31403a>> uVar) {
            C7573i.m23587b(uVar, "emitter");
            try {
                C31341a.m102050a(uVar, this.f82296a.mo82004m());
            } catch (Throwable th) {
                C31341a.m102051a(uVar, th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$e */
    static final class C31421e<T> implements C7326g<List<C31403a>> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewModel f82297a;

        C31421e(MediaChooseViewModel mediaChooseViewModel) {
            this.f82297a = mediaChooseViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(List<C31403a> list) {
            this.f82297a.mo81995a().setValue(list);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C31403a aVar = (C31403a) it.next();
                if (aVar.f82254b) {
                    this.f82297a.mo82001c().setValue(aVar);
                    break;
                }
            }
            if (this.f82297a.mo82001c().getValue() == null) {
                C7573i.m23582a((Object) list, "list");
                if (!list.isEmpty()) {
                    this.f82297a.mo82001c().setValue(list.get(0));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$f */
    static final class C31422f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewModel f82298a;

        C31422f(MediaChooseViewModel mediaChooseViewModel) {
            this.f82298a = mediaChooseViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C6921a.m21559a(th);
            this.f82298a.mo81995a().setValue(new ArrayList());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$g */
    static final class C31423g extends Lambda implements C7562b<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewModel f82299a;

        /* renamed from: b */
        final /* synthetic */ List f82300b;

        /* renamed from: c */
        final /* synthetic */ MediaModel f82301c;

        /* renamed from: d */
        final /* synthetic */ C7562b f82302d;

        /* renamed from: e */
        final /* synthetic */ Context f82303e;

        C31423g(MediaChooseViewModel mediaChooseViewModel, List list, MediaModel mediaModel, C7562b bVar, Context context) {
            this.f82299a = mediaChooseViewModel;
            this.f82300b = list;
            this.f82301c = mediaModel;
            this.f82302d = bVar;
            this.f82303e = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102232a(((Boolean) obj).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102232a(boolean z) {
            if (z) {
                this.f82300b.add(this.f82301c);
                this.f82299a.mo82000b().setValue(this.f82300b);
                C7562b bVar = this.f82302d;
                Object value = this.f82299a.mo82000b().getValue();
                if (value == null) {
                    C7573i.m23580a();
                }
                bVar.invoke(Integer.valueOf(((List) value).size()));
                return;
            }
            C10761a.m31399c(this.f82303e, (int) R.string.bhq).mo25750a();
            this.f82302d.invoke(Integer.valueOf(-1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$h */
    static final class C31424h extends Lambda implements C7561a<C23084b<C31403a>> {

        /* renamed from: a */
        public static final C31424h f82304a = new C31424h();

        C31424h() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<C31403a> m102233a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102233a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaChooseViewModel$i */
    static final class C31425i extends Lambda implements C7561a<C23084b<List<MediaModel>>> {

        /* renamed from: a */
        public static final C31425i f82305a = new C31425i();

        C31425i() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<List<MediaModel>> m102234a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102234a();
        }
    }

    /* renamed from: a */
    public final C23084b<List<C31403a>> mo81995a() {
        return (C23084b) this.f82290f.getValue();
    }

    /* renamed from: b */
    public final C23084b<List<MediaModel>> mo82000b() {
        return (C23084b) this.f82291g.getValue();
    }

    /* renamed from: c */
    public final C23084b<C31403a> mo82001c() {
        return (C23084b) this.f82292h.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C47562b mo82002d() {
        return (C47562b) this.f82293i.getValue();
    }

    /* renamed from: n */
    public final void mo82005n() {
        mo82000b().setValue(new ArrayList());
    }

    public void onCleared() {
        super.onCleared();
        mo82002d().mo119660a();
    }

    /* renamed from: m */
    public final List<C31403a> mo82004m() {
        C31395a aVar = new C31395a();
        if (this.f82288c.supportGif()) {
            aVar.f82238c = true;
        }
        if (this.f82288c.isImageVideoMix()) {
            return C31397b.m102169b(aVar, new C31399c(), -1);
        }
        if (this.f82288c.isImageOrGif()) {
            return C31397b.m102164a(aVar, -1);
        }
        return new ArrayList<>();
    }

    /* renamed from: l */
    public void mo82003l() {
        boolean z;
        Collection collection = (Collection) mo81995a().getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C7321c a = C7492s.m23282a((C7495v<T>) new C31420d<T>(this)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C31421e<Object>(this), (C7326g<? super Throwable>) new C31422f<Object>(this));
            mo82002d().mo119660a();
            mo82002d().mo119661a(a);
        }
    }

    /* renamed from: a */
    public final void mo81996a(MediaChooseParameters mediaChooseParameters) {
        C7573i.m23587b(mediaChooseParameters, "<set-?>");
        this.f82288c = mediaChooseParameters;
    }

    /* renamed from: a */
    public final boolean mo81998a(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        if (mo82000b().getValue() == null) {
            mo82000b().setValue(new ArrayList());
        }
        Object value = mo82000b().getValue();
        if (value == null) {
            C7573i.m23580a();
        }
        return ((List) value).contains(mediaModel);
    }

    /* renamed from: b */
    public final int mo81999b(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        List list = (List) mo82000b().getValue();
        if (list == null) {
            list = new ArrayList();
        }
        C7573i.m23582a((Object) list, "selectedMediaList.value ?: mutableListOf()");
        if (!list.contains(mediaModel) && list.size() >= 9) {
            return -1;
        }
        if (!mediaModel.isVideo() || mediaModel.getDuration() <= 300000) {
            return 0;
        }
        return -2;
    }

    /* renamed from: a */
    public final void mo81997a(MediaModel mediaModel, boolean z, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(mediaModel, "mediaModel");
        C7573i.m23587b(bVar, "callback");
        Context a = C6399b.m19921a();
        switch (mo81999b(mediaModel)) {
            case -2:
                C10761a.m31399c(a, (int) R.string.bhr).mo25750a();
                bVar.invoke(Integer.valueOf(-1));
                return;
            case -1:
                C10761a.m31403c(a, C6399b.m19921a().getString(R.string.a28, new Object[]{Integer.valueOf(9)})).mo25750a();
                bVar.invoke(Integer.valueOf(-1));
                return;
            default:
                List list = (List) mo82000b().getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                List list2 = list;
                C7573i.m23582a((Object) list2, "selectedMediaList.value ?: mutableListOf()");
                if (!z) {
                    list2.remove(mediaModel);
                    mo82000b().setValue(list2);
                    bVar.invoke(Integer.valueOf(-1));
                    return;
                }
                C31423g gVar = new C31423g(this, list2, mediaModel, bVar, a);
                C31346c.m102060a(mediaModel, (C7562b<? super Boolean, C7581n>) gVar);
                return;
        }
    }
}
