package com.p280ss.android.ugc.aweme.p1053ba;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.recorder.camera.p923a.C20705b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39814eu;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.shortvideo.transition.C41125b;
import com.p280ss.android.ugc.aweme.tools.C42137ad;
import com.p280ss.android.ugc.aweme.tools.C42146am;
import com.p280ss.android.ugc.aweme.tools.C42147an;
import com.p280ss.android.ugc.aweme.tools.C42152as;
import com.p280ss.android.ugc.aweme.tools.C42154au;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42304e;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.aweme.tools.C42586v;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44778a;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44779b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44779b.C44780a;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ba.a */
public final class C23162a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f61115a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "reverseCameraModel", "getReverseCameraModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "speedModel", "getSpeedModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "mBeautyModel", "getMBeautyModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "filterModel", "getFilterModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "beautyModel", "getBeautyModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "countdownModel", "getCountdownModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "microphoneModel", "getMicrophoneModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "wideCameraModel", "getWideCameraModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "cutMusicModel", "getCutMusicModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "moreFunctionModel", "getMoreFunctionModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "switchDurationModel", "getSwitchDurationModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "flashModel", "getFlashModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C23162a.class), "shakeFreeModel", "getShakeFreeModel()Lcom/ss/android/ugc/gamora/recorder/toolbar/RecordToolBarModel;"))};

    /* renamed from: b */
    public final C43868d f61116b;

    /* renamed from: c */
    private final C7541d f61117c = C7546e.m23569a(new C23188w(this));

    /* renamed from: d */
    private final C7541d f61118d = C7546e.m23569a(new C23190y(this));

    /* renamed from: e */
    private final C7541d f61119e = C7546e.m23569a(new C23185t(this));

    /* renamed from: f */
    private final C7541d f61120f = C7546e.m23569a(new C23167d(this));

    /* renamed from: g */
    private final C7541d f61121g = C7546e.m23569a(new C23163a(this));

    /* renamed from: h */
    private final C7541d f61122h = C7546e.m23569a(new C23165b(this));

    /* renamed from: i */
    private final C7541d f61123i = C7546e.m23569a(new C23186u(this));

    /* renamed from: j */
    private final C7541d f61124j = C7546e.m23569a(new C23164aa(this));

    /* renamed from: k */
    private final C7541d f61125k = C7546e.m23569a(new C23166c(this));

    /* renamed from: l */
    private final C7541d f61126l = C7546e.m23569a(new C23187v(this));

    /* renamed from: m */
    private final C7541d f61127m = C7546e.m23569a(new C23191z(this));

    /* renamed from: n */
    private final C7541d f61128n = C7546e.m23569a(new C23168e(this));

    /* renamed from: o */
    private final C7541d f61129o = C7546e.m23569a(new C23189x(this));

    /* renamed from: p */
    private final boolean f61130p;

    /* renamed from: com.ss.android.ugc.aweme.ba.a$a */
    static final class C23163a extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61131a;

        C23163a(C23162a aVar) {
            this.f61131a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61131a.mo60319r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$aa */
    static final class C23164aa extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61132a;

        C23164aa(C23162a aVar) {
            this.f61132a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61132a.mo60322u();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$b */
    static final class C23165b extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61133a;

        C23165b(C23162a aVar) {
            this.f61133a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61133a.mo60320s();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$c */
    static final class C23166c extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61134a;

        C23166c(C23162a aVar) {
            this.f61134a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61134a.mo60323v();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$d */
    static final class C23167d extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61135a;

        C23167d(C23162a aVar) {
            this.f61135a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61135a.mo60318q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$e */
    static final class C23168e extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61136a;

        C23168e(C23162a aVar) {
            this.f61136a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61136a.mo60326y();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$f */
    public static final class C23169f implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61137a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23169f(C23162a aVar) {
            this.f61137a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            JediViewModel a = C36113b.m116288a(this.f61137a.f61116b.mo106145d()).mo91871a(RecordViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ordViewModel::class.java)");
            RecordViewModel recordViewModel = (RecordViewModel) a;
            if (C7573i.m23585a((Object) recordViewModel.mo106835b((C0043i) this.f61137a.f61116b.mo106145d()), (Object) Boolean.valueOf(false))) {
                recordViewModel.mo106842g(true);
            } else {
                recordViewModel.mo106842g(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$g */
    public static final class C23170g implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61138a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23170g(C23162a aVar) {
            this.f61138a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            C6907h.m21524a("count_down", (Map) C22984d.m75611a().mo59973a("creation_id", this.f61138a.f61116b.mo106146e().f99787w).mo59973a("shoot_way", this.f61138a.f61116b.mo106146e().f99788x).mo59970a("draft_id", this.f61138a.f61116b.mo106146e().f99790z).mo59973a("enter_from", "video_shoot_page").f60753a);
            ((RecordViewModel) C36113b.m116288a(this.f61138a.f61116b.mo106145d()).mo91871a(RecordViewModel.class)).mo106840e(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$h */
    public static final class C23171h implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61139a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23171h(C23162a aVar) {
            this.f61139a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            ((RecordViewModel) C36113b.m116288a(this.f61139a.f61116b.mo106145d()).mo91871a(RecordViewModel.class)).mo106839d(true);
            this.f61139a.f61116b.mo106141b().mo103594a((Object) this, (C42155av) new C42137ad(0));
            C6907h.onEvent(MobClick.obtain().setEventName("music_edit").setLabelName("shoot_page").setJsonObject((JSONObject) this.f61139a.f61116b.mo106153l().mo44946a()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$i */
    public static final class C23172i implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61140a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23172i(C23162a aVar) {
            this.f61140a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            ((RecordViewModel) C36113b.m116288a(this.f61140a.f61116b.mo106145d()).mo91871a(RecordViewModel.class)).mo29069f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$j */
    public static final class C23173j implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61141a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23173j(C23162a aVar) {
            this.f61141a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            String str;
            C7573i.m23587b(bVar, "model");
            int o = this.f61141a.f61116b.mo106148g().mo100096o();
            this.f61141a.f61116b.mo106144c().mo103594a((Object) this, (C42155av) new C42585u(o));
            bVar.mo107227a();
            bVar.f115193b = CameraModule.f104638i.get(o);
            String str2 = "light";
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f61141a.f61116b.mo106146e().f99787w).mo59973a("shoot_way", this.f61141a.f61116b.mo106146e().f99788x).mo59970a("draft_id", this.f61141a.f61116b.mo106146e().f99790z);
            String str3 = "to_status";
            if (o == 0) {
                str = "off";
            } else {
                str = "on";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$k */
    public static final class C23174k implements C44778a {

        /* renamed from: a */
        public boolean f61142a;

        /* renamed from: b */
        final /* synthetic */ C23162a f61143b;

        /* renamed from: c */
        final /* synthetic */ boolean f61144c;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            this.f61142a = !this.f61142a;
            this.f61143b.f61116b.mo106144c().mo103594a((Object) this, (C42155av) new C42304e(this.f61142a));
            ((RecordToolbarViewModel) C36113b.m116288a(this.f61143b.f61116b.mo106145d()).mo91871a(RecordToolbarViewModel.class)).mo107189f(this.f61142a);
        }

        C23174k(C23162a aVar, boolean z) {
            this.f61143b = aVar;
            this.f61144c = z;
            this.f61142a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$l */
    public static final class C23175l implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61145a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23175l(C23162a aVar) {
            this.f61145a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            int i;
            C7573i.m23587b(bVar, "model");
            if (bVar.f115194c) {
                if (this.f61145a.f61116b.mo106146e().f99708M) {
                    i = 1;
                } else {
                    i = 2;
                }
                this.f61145a.f61116b.mo106141b().mo103594a((Object) this, (C42155av) new C42146am(i));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$m */
    public static final class C23176m implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61146a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23176m(C23162a aVar) {
            this.f61146a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            ((RecordViewModel) C36113b.m116288a(this.f61146a.f61116b.mo106145d()).mo91871a(RecordViewModel.class)).mo106834a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$n */
    static final class C23177n implements C44780a {

        /* renamed from: a */
        public static final C23177n f61147a = new C23177n();

        C23177n() {
        }

        /* renamed from: a */
        public final void mo60330a(final View view) {
            view.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new Runnable() {
                public final void run() {
                    View view = view;
                    C7573i.m23582a((Object) view, "targetView");
                    view.setRotation(0.0f);
                    View view2 = view;
                    C7573i.m23582a((Object) view2, "targetView");
                    view2.setEnabled(false);
                }
            }).withEndAction(new Runnable() {
                public final void run() {
                    View view = view;
                    C7573i.m23582a((Object) view, "targetView");
                    view.setRotation(0.0f);
                    View view2 = view;
                    C7573i.m23582a((Object) view2, "targetView");
                    view2.setEnabled(true);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$o */
    public static final class C23180o implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61150a;

        C23180o(C23162a aVar) {
            this.f61150a = aVar;
        }

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            if (bVar.f115200i) {
                C10761a.m31410e((Context) this.f61150a.f61116b.mo106145d(), this.f61150a.f61116b.mo106145d().getResources().getString(R.string.dc_)).mo25750a();
            }
            return false;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            if (!C41125b.f107007a) {
                ((RecordToolbarViewModel) C36113b.m116288a(this.f61150a.f61116b.mo106145d()).mo91871a(RecordToolbarViewModel.class)).mo107188e(false);
                int f = this.f61150a.f61116b.mo106148g().mo100087f();
                if (f == 0) {
                    C42586v a = C42586v.m135306a();
                    C7573i.m23582a((Object) a, "event");
                    a.f110739b = false;
                    this.f61150a.f61116b.mo106144c().mo103594a((Object) this, (C42155av) a);
                    return;
                }
                if (f == 1) {
                    C42586v b = C42586v.m135307b();
                    C7573i.m23582a((Object) b, "event");
                    b.f110739b = false;
                    this.f61150a.f61116b.mo106144c().mo103594a((Object) this, (C42155av) b);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$p */
    public static final class C23181p implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61151a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23181p(C23162a aVar) {
            this.f61151a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            String str;
            C7573i.m23587b(bVar, "model");
            if (!C41125b.f107007a) {
                boolean z = !C20705b.m68749a((Context) this.f61151a.f61116b.mo106145d(), C35563c.f93230L.mo93343b(Property.ShakeFreeWhiteList));
                ((RecordToolbarViewModel) C36113b.m116288a(this.f61151a.f61116b.mo106145d()).mo91871a(RecordToolbarViewModel.class)).mo107186c(z);
                this.f61151a.f61116b.mo106144c().mo103594a((Object) this, (C42155av) new C42147an(z));
                String str2 = "click_anti_shake";
                C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f61151a.f61116b.mo106146e().f99787w).mo59973a("shoot_way", this.f61151a.f61116b.mo106146e().f99788x).mo59973a("enter_from", "video_shoot_page");
                String str3 = "to_status";
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("draft_id", this.f61151a.f61116b.mo106146e().f99790z).f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$q */
    public static final class C23182q implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61152a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model1");
            return false;
        }

        C23182q(C23162a aVar) {
            this.f61152a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            int i;
            String str;
            C7573i.m23587b(bVar, "model1");
            RecordViewModel recordViewModel = (RecordViewModel) C36113b.m116288a(this.f61152a.f61116b.mo106145d()).mo91871a(RecordViewModel.class);
            if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
                i = 8;
            } else {
                i = 0;
            }
            recordViewModel.mo106829a(i);
            C6907h.onEvent(MobClick.obtain().setEventName("speed_edit").setLabelName("shoot_page").setJsonObject((JSONObject) this.f61152a.f61116b.mo106153l().mo44946a()));
            String str2 = "edit_speed";
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f61152a.f61116b.mo106146e().f99787w).mo59973a("shoot_way", this.f61152a.f61116b.mo106146e().f99788x).mo59970a("draft_id", this.f61152a.f61116b.mo106146e().f99790z);
            String str3 = "to_status";
            if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
                str = "show";
            } else {
                str = "hide";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$r */
    public static final class C23183r implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61153a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23183r(C23162a aVar) {
            this.f61153a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            C42155av asVar = new C42152as(this.f61153a.f61116b.mo106146e().f99745af, this.f61153a.f61116b.mo106146e().f99744ae);
            this.f61153a.f61116b.mo106144c().mo103594a((Object) this, asVar);
            this.f61153a.f61116b.mo106141b().mo103594a((Object) this, asVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$s */
    public static final class C23184s implements C44778a {

        /* renamed from: a */
        final /* synthetic */ C23162a f61154a;

        /* renamed from: b */
        public final boolean mo60329b(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            return false;
        }

        C23184s(C23162a aVar) {
            this.f61154a = aVar;
        }

        /* renamed from: a */
        public final void mo60328a(C44779b bVar) {
            C7573i.m23587b(bVar, "model");
            if (!C41125b.f107007a) {
                if (this.f61154a.f61116b.mo106151j().mo56024b()) {
                    this.f61154a.f61116b.mo106144c().mo103594a((Object) this, (C42155av) C42154au.m134112b());
                    C6907h.m21524a("wide_angle", (Map) C22984d.m75611a().mo59973a("creation_id", this.f61154a.f61116b.mo106146e().f99787w).mo59973a("shoot_way", this.f61154a.f61116b.mo106146e().f99788x).mo59973a("shoot_way", this.f61154a.f61116b.mo106146e().f99788x).mo59973a("enter_from", "video_shoot_page").mo59973a("to_status", "off").f60753a);
                    return;
                }
                this.f61154a.f61116b.mo106144c().mo103594a((Object) this, (C42155av) C42154au.m134111a());
                C6907h.m21524a("wide_angle", (Map) C22984d.m75611a().mo59973a("creation_id", this.f61154a.f61116b.mo106146e().f99787w).mo59973a("shoot_way", this.f61154a.f61116b.mo106146e().f99788x).mo59973a("shoot_way", this.f61154a.f61116b.mo106146e().f99788x).mo59973a("enter_from", "video_shoot_page").mo59973a("to_status", "on").f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$t */
    static final class C23185t extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61155a;

        C23185t(C23162a aVar) {
            this.f61155a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61155a.mo60317p();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$u */
    static final class C23186u extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61156a;

        C23186u(C23162a aVar) {
            this.f61156a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61156a.mo60321t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$v */
    static final class C23187v extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61157a;

        C23187v(C23162a aVar) {
            this.f61157a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61157a.mo60324w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$w */
    static final class C23188w extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61158a;

        C23188w(C23162a aVar) {
            this.f61158a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61158a.mo60315n();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$x */
    static final class C23189x extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61159a;

        C23189x(C23162a aVar) {
            this.f61159a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61159a.mo60327z();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$y */
    static final class C23190y extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61160a;

        C23190y(C23162a aVar) {
            this.f61160a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61160a.mo60316o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ba.a$z */
    static final class C23191z extends Lambda implements C7561a<C44779b> {

        /* renamed from: a */
        final /* synthetic */ C23162a f61161a;

        C23191z(C23162a aVar) {
            this.f61161a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44779b invoke() {
            return this.f61161a.mo60325x();
        }
    }

    /* renamed from: a */
    public final C44779b mo60302a() {
        return (C44779b) this.f61117c.getValue();
    }

    /* renamed from: b */
    public final C44779b mo60303b() {
        return (C44779b) this.f61118d.getValue();
    }

    /* renamed from: c */
    public final C44779b mo60304c() {
        return (C44779b) this.f61119e.getValue();
    }

    /* renamed from: d */
    public final C44779b mo60305d() {
        return (C44779b) this.f61120f.getValue();
    }

    /* renamed from: e */
    public final C44779b mo60306e() {
        return (C44779b) this.f61121g.getValue();
    }

    /* renamed from: f */
    public final C44779b mo60307f() {
        return (C44779b) this.f61122h.getValue();
    }

    /* renamed from: g */
    public final C44779b mo60308g() {
        return (C44779b) this.f61123i.getValue();
    }

    /* renamed from: h */
    public final C44779b mo60309h() {
        return (C44779b) this.f61124j.getValue();
    }

    /* renamed from: i */
    public final C44779b mo60310i() {
        return (C44779b) this.f61125k.getValue();
    }

    /* renamed from: j */
    public final C44779b mo60311j() {
        return (C44779b) this.f61126l.getValue();
    }

    /* renamed from: k */
    public final C44779b mo60312k() {
        return (C44779b) this.f61127m.getValue();
    }

    /* renamed from: l */
    public final C44779b mo60313l() {
        return (C44779b) this.f61128n.getValue();
    }

    /* renamed from: m */
    public final C44779b mo60314m() {
        return (C44779b) this.f61129o.getValue();
    }

    /* renamed from: n */
    public final C44779b mo60315n() {
        int i;
        C44778a oVar = new C23180o(this);
        if (this.f61130p) {
            i = R.string.dh5;
        } else {
            i = -1;
        }
        C44779b bVar = new C44779b(0, R.drawable.aq8, oVar, i);
        bVar.f115199h = C23177n.f61147a;
        return bVar;
    }

    /* renamed from: q */
    public final C44779b mo60318q() {
        int i;
        C44778a iVar = new C23172i(this);
        if (this.f61130p) {
            i = R.string.b6p;
        } else {
            i = -1;
        }
        return new C44779b(3, R.drawable.aig, iVar, i);
    }

    /* renamed from: v */
    public final C44779b mo60323v() {
        int i;
        C44778a hVar = new C23171h(this);
        if (this.f61130p) {
            i = R.string.amm;
        } else {
            i = -1;
        }
        return new C44779b(8, R.drawable.apw, hVar, i);
    }

    /* renamed from: w */
    public final C44779b mo60324w() {
        int i;
        C44778a mVar = new C23176m(this);
        if (this.f61130p) {
            i = R.string.ca1;
        } else {
            i = -1;
        }
        return new C44779b(12, R.drawable.aqb, mVar, i);
    }

    /* renamed from: y */
    public final C44779b mo60326y() {
        int i;
        C44778a jVar = new C23173j(this);
        if (this.f61130p) {
            i = R.string.b7n;
        } else {
            i = -1;
        }
        return new C44779b(10, R.drawable.aq6, jVar, i);
    }

    /* renamed from: o */
    public final C44779b mo60316o() {
        int i;
        int i2;
        boolean a = C35563c.f93230L.mo93342a(Property.SpeedPanelOpen);
        if (a) {
            i = R.drawable.aqf;
        } else {
            i = R.drawable.aqe;
        }
        C44778a qVar = new C23182q(this);
        if (!this.f61130p) {
            i2 = -1;
        } else if (a) {
            i2 = R.string.dvv;
        } else {
            i2 = R.string.dvu;
        }
        return new C44779b(1, i, qVar, i2);
    }

    /* renamed from: p */
    public final C44779b mo60317p() {
        int i;
        int i2;
        boolean a = C39814eu.m127477a().mo96463a();
        if (a) {
            i = R.drawable.apu;
        } else {
            i = R.drawable.apt;
        }
        C44778a kVar = new C23174k(this, a);
        if (this.f61130p) {
            i2 = R.string.r7;
        } else {
            i2 = -1;
        }
        return new C44779b(2, i, kVar, i2);
    }

    /* renamed from: r */
    public final C44779b mo60319r() {
        int i;
        int i2;
        if (!C23536f.m77298a() || !C35563c.f93231M.mo93305a(AVAB.Property.MVPBeautyNewIcon)) {
            i = R.drawable.aps;
        } else {
            i = R.drawable.a4a;
        }
        C44778a fVar = new C23169f(this);
        if (this.f61130p) {
            i2 = R.string.b6q;
        } else {
            i2 = -1;
        }
        return new C44779b(4, i, fVar, i2);
    }

    /* renamed from: s */
    public final C44779b mo60320s() {
        int i;
        int i2;
        if (((C35622l) C25682d.m84426a(this.f61116b.mo106145d(), C35622l.class)).mo60370e(3) == 3) {
            i = R.drawable.aqo;
        } else {
            i = R.drawable.aqn;
        }
        C44778a gVar = new C23170g(this);
        if (this.f61130p) {
            i2 = R.string.aho;
        } else {
            i2 = -1;
        }
        return new C44779b(5, i, gVar, i2);
    }

    /* renamed from: t */
    public final C44779b mo60321t() {
        int i;
        int i2;
        if (C35563c.f93230L.mo93343b(Property.DefaultMicrophoneState) == 1) {
            i = R.drawable.aqa;
        } else {
            i = R.drawable.aq_;
        }
        C44778a lVar = new C23175l(this);
        if (this.f61130p) {
            i2 = R.string.c9u;
        } else {
            i2 = -1;
        }
        return new C44779b(6, i, lVar, i2);
    }

    /* renamed from: u */
    public final C44779b mo60322u() {
        int i;
        int i2;
        if (this.f61116b.mo106151j().mo56024b()) {
            i = R.drawable.apr;
        } else {
            i = R.drawable.apq;
        }
        C44778a sVar = new C23184s(this);
        if (this.f61130p) {
            i2 = R.string.fsg;
        } else {
            i2 = -1;
        }
        return new C44779b(7, i, sVar, i2);
    }

    /* renamed from: x */
    public final C44779b mo60325x() {
        int i;
        int i2;
        if (this.f61116b.mo106146e().f99745af) {
            i = R.drawable.aqm;
        } else {
            i = R.drawable.aql;
        }
        C44778a rVar = new C23183r(this);
        if (this.f61130p) {
            i2 = R.string.awu;
        } else {
            i2 = -1;
        }
        return new C44779b(9, i, rVar, i2);
    }

    /* renamed from: z */
    public final C44779b mo60327z() {
        int i;
        int i2;
        if (C20705b.m68749a((Context) this.f61116b.mo106145d(), C35563c.f93230L.mo93343b(Property.ShakeFreeWhiteList))) {
            i = R.drawable.aqh;
        } else {
            i = R.drawable.aqg;
        }
        C44778a pVar = new C23181p(this);
        if (this.f61130p) {
            i2 = R.string.drx;
        } else {
            i2 = -1;
        }
        return new C44779b(11, i, pVar, i2);
    }

    public C23162a(C43868d dVar, boolean z) {
        C7573i.m23587b(dVar, "recordEnv");
        this.f61116b = dVar;
        this.f61130p = z;
    }
}
