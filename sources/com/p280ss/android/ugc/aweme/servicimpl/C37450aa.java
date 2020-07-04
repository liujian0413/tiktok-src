package com.p280ss.android.ugc.aweme.servicimpl;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.photo.PhotoModule;
import com.p280ss.android.ugc.aweme.photo.PhotoModule.C34724a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38519c;
import com.p280ss.android.ugc.aweme.shortvideo.game.C39934k;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42342g;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.gamora.bottomtab.C43866b;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f.C43871a;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.aa */
public final class C37450aa implements C43867c, C44396a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f97735a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37450aa.class), "photoModule", "getPhotoModule()Lcom/ss/android/ugc/aweme/photo/PhotoModule;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37450aa.class), "photoScene", "getPhotoScene()Lcom/ss/android/ugc/aweme/servicimpl/PhotoBottomTabModule$PhotoScene;"))};

    /* renamed from: b */
    public ShortVideoContextViewModel f97736b;

    /* renamed from: c */
    public RecordViewModel f97737c;

    /* renamed from: d */
    public RecordProgressViewModel f97738d;

    /* renamed from: e */
    public RecordToolbarViewModel f97739e;

    /* renamed from: f */
    public RecordControlViewModel f97740f;

    /* renamed from: g */
    public CameraModule f97741g;

    /* renamed from: h */
    public C43868d f97742h;

    /* renamed from: i */
    public RecordStatusViewModel f97743i;

    /* renamed from: j */
    public final C23254a f97744j = new C37456e(this);

    /* renamed from: k */
    private C42156aw f97745k;

    /* renamed from: l */
    private final C7541d f97746l = C7546e.m23569a(new C37457f(this));

    /* renamed from: m */
    private final C7541d f97747m = C7546e.m23569a(new C37458g(this));

    /* renamed from: n */
    private final String f97748n;

    /* renamed from: o */
    private final String f97749o;

    /* renamed from: p */
    private final String f97750p;

    /* renamed from: q */
    private final boolean f97751q = false;

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$a */
    public final class C37451a extends C43869e {
        public final String bQ_() {
            return "PhotoScene";
        }

        public final void bR_() {
        }

        public final void bS_() {
        }

        /* renamed from: q */
        public final void mo31008q() {
            super.mo31008q();
            FragmentActivity d = C37450aa.m120078a(C37450aa.this).mo106145d();
            if (d != null) {
                ((C23258e) d).mo60526b(C37450aa.this.f97744j);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
        }

        public C37451a() {
        }

        /* renamed from: e */
        public final void mo30985e(Bundle bundle) {
            super.mo30985e(bundle);
            FragmentActivity d = C37450aa.m120078a(C37450aa.this).mo106145d();
            if (d != null) {
                ((C23258e) d).mo60525a(C37450aa.this.f97744j);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
        }

        /* renamed from: a */
        public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            C7573i.m23587b(layoutInflater, "inflater");
            C7573i.m23587b(viewGroup, "container");
            return new View(mo31014u());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$b */
    public static final class C37452b implements C43870f {

        /* renamed from: a */
        final /* synthetic */ C37450aa f97753a;

        /* renamed from: b */
        final /* synthetic */ C43868d f97754b;

        C37452b(C37450aa aaVar, C43868d dVar) {
            this.f97753a = aaVar;
            this.f97754b = dVar;
        }

        /* renamed from: b */
        public final boolean mo94783b(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            C37450aa.m120080c(this.f97753a).mo96166b(false);
            return true;
        }

        /* renamed from: a */
        public final boolean mo94782a(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            C37450aa.m120079b(this.f97753a).mo106846k(true);
            C37450aa.m120079b(this.f97753a).mo106829a(8);
            C37450aa.m120080c(this.f97753a).mo96166b(true);
            C37450aa.m120081d(this.f97753a).mo100082b(0);
            C37450aa.m120082e(this.f97753a).mo107181a(new C42585u(0));
            C37450aa.m120083f(this.f97753a).mo106952a(new Pair<>(Integer.valueOf(1), Boolean.valueOf(true)));
            boolean d = C37450aa.m120081d(this.f97753a).mo100085d();
            C37450aa.m120082e(this.f97753a).mo107180a(new C42342g(true, C37450aa.m120081d(this.f97753a).mo100080a(d), C37450aa.m120081d(this.f97753a).f104644f.mo55994a(d, true)));
            C35563c.f93240c.mo83131a(this.f97754b.mo106146e().f99788x, "photo_shoot");
            C6907h.onEvent(MobClick.obtain().setEventName("shoot_photo_mode").setLabelName("shoot_page").setJsonObject((JSONObject) this.f97754b.mo106153l().mo44946a()));
            C37450aa.m120084g(this.f97753a).mo107138a(false);
            C37450aa.m120086h(this.f97753a).mo102542m().setValue(Boolean.valueOf(false));
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$c */
    static final class C37453c implements C34724a {

        /* renamed from: a */
        final /* synthetic */ C37450aa f97755a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f97756b;

        /* renamed from: c */
        final /* synthetic */ C39374g f97757c;

        /* renamed from: d */
        final /* synthetic */ C7541d f97758d;

        /* renamed from: e */
        final /* synthetic */ C38519c f97759e;

        /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$c$a */
        public static final class C37454a implements C29238ba {

            /* renamed from: a */
            final /* synthetic */ C37453c f97760a;

            C37454a(C37453c cVar) {
                this.f97760a = cVar;
            }

            /* renamed from: a */
            public final float mo74856a(String str) {
                C7573i.m23587b(str, "filterPath");
                return C37450aa.m120078a(this.f97760a.f97755a).mo106156o().mo99986b(str);
            }
        }

        C37453c(C37450aa aaVar, ShortVideoContext shortVideoContext, C39374g gVar, C7541d dVar, C38519c cVar) {
            this.f97755a = aaVar;
            this.f97756b = shortVideoContext;
            this.f97757c = gVar;
            this.f97758d = dVar;
            this.f97759e = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b9, code lost:
            if (r2 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x020f  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0214  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0217  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo88156a(java.lang.String r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r1 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.f97756b
                java.lang.String r2 = r2.f99787w
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.f97756b
                java.lang.String r2 = r2.f99788x
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "draft_id"
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.f97756b
                int r2 = r2.f99790z
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r1, r2)
                java.lang.String r1 = "camera"
                com.ss.android.ugc.aweme.servicimpl.aa r2 = r9.f97755a
                com.ss.android.ugc.aweme.shortvideo.record.CameraModule r2 = com.p280ss.android.ugc.aweme.servicimpl.C37450aa.m120081d(r2)
                int r2 = r2.mo100087f()
                r3 = 1
                if (r2 != r3) goto L_0x0034
                java.lang.String r2 = "front"
                goto L_0x0036
            L_0x0034:
                java.lang.String r2 = "back"
            L_0x0036:
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "filter_name"
                com.ss.android.ugc.aweme.shortvideo.e.g r2 = r9.f97757c
                com.ss.android.ugc.aweme.shortvideo.e.a r2 = r2.mo74909j()
                com.ss.android.ugc.aweme.shortvideo.e.i r2 = (com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i) r2
                java.lang.String r4 = "filterModule.filterFunc"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                com.ss.android.ugc.aweme.filter.g r2 = r2.mo74906g()
                java.lang.String r4 = "filterModule.filterFunc.curFilter"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                java.lang.String r2 = r2.f77268c
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "filter_id"
                com.ss.android.ugc.aweme.shortvideo.e.g r2 = r9.f97757c
                com.ss.android.ugc.aweme.shortvideo.e.a r2 = r2.mo74909j()
                com.ss.android.ugc.aweme.shortvideo.e.i r2 = (com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i) r2
                java.lang.String r4 = "filterModule.filterFunc"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                com.ss.android.ugc.aweme.filter.g r2 = r2.mo74906g()
                java.lang.String r4 = "filterModule.filterFunc.curFilter"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                int r2 = r2.f77266a
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r1, r2)
                java.lang.String r1 = "record_mode"
                java.lang.String r2 = "photo"
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "prop_id"
                kotlin.d r2 = r9.f97758d
                java.lang.Object r2 = r2.getValue()
                com.ss.android.ugc.aweme.shortvideo.sticker.w r2 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w) r2
                if (r2 == 0) goto L_0x0099
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = r2.mo100301b()
                if (r2 == 0) goto L_0x0099
                long r4 = r2.getStickerId()
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                goto L_0x009b
            L_0x0099:
                java.lang.String r2 = ""
            L_0x009b:
                java.lang.String r2 = r2.toString()
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "prop_index"
                kotlin.d r2 = r9.f97758d
                java.lang.Object r2 = r2.getValue()
                com.ss.android.ugc.aweme.shortvideo.sticker.w r2 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w) r2
                if (r2 == 0) goto L_0x00bb
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = r2.mo100301b()
                if (r2 == 0) goto L_0x00bb
                java.lang.String r2 = r2.getGradeKey()
                if (r2 != 0) goto L_0x00bd
            L_0x00bb:
                java.lang.String r2 = ""
            L_0x00bd:
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
                r2 = 0
                if (r1 != 0) goto L_0x00f2
                java.lang.String r1 = "smooth"
                com.ss.android.ugc.aweme.shortvideo.beauty.c r4 = r9.f97759e
                int r4 = r4.mo96490a()
                com.ss.android.ugc.aweme.app.g.d r1 = r0.mo59970a(r1, r4)
                java.lang.String r4 = "eyes"
                com.ss.android.ugc.aweme.shortvideo.beauty.c r5 = r9.f97759e
                int r5 = r5.mo96504c()
                com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59970a(r4, r5)
                java.lang.String r4 = "shape"
                com.ss.android.ugc.aweme.shortvideo.beauty.c r5 = r9.f97759e
                int r5 = r5.mo96499b()
                com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59970a(r4, r5)
                java.lang.String r4 = "tanning"
                r1.mo59970a(r4, r2)
                goto L_0x0119
            L_0x00f2:
                java.lang.String r1 = "smooth"
                com.ss.android.ugc.aweme.shortvideo.beauty.c r4 = r9.f97759e
                int r4 = r4.mo96490a()
                float r4 = com.p280ss.android.ugc.aweme.property.C36964i.m118916a(r4)
                r5 = 1120403456(0x42c80000, float:100.0)
                float r4 = r4 * r5
                int r4 = (int) r4
                com.ss.android.ugc.aweme.app.g.d r1 = r0.mo59970a(r1, r4)
                java.lang.String r4 = "eyes"
                com.ss.android.ugc.aweme.shortvideo.beauty.c r6 = r9.f97759e
                int r6 = r6.mo96499b()
                float r6 = com.p280ss.android.ugc.aweme.property.C36964i.m118924b(r6)
                float r6 = r6 * r5
                int r5 = (int) r6
                r1.mo59970a(r4, r5)
            L_0x0119:
                com.ss.android.ugc.aweme.property.AVAB r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
                com.ss.android.ugc.aweme.property.AVAB$Property r4 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableFilterIntensityJust
                boolean r1 = r1.mo93305a(r4)
                if (r1 == 0) goto L_0x0183
                com.ss.android.ugc.aweme.servicimpl.aa r1 = r9.f97755a
                com.ss.android.ugc.gamora.bottomtab.d r1 = com.p280ss.android.ugc.aweme.servicimpl.C37450aa.m120078a(r1)
                java.lang.String r1 = r1.mo106157p()
                com.ss.android.ugc.aweme.filter.ac r1 = com.p280ss.android.ugc.aweme.filter.C29197ac.C29198a.m95831a(r1)
                com.ss.android.ugc.aweme.filter.az r1 = (com.p280ss.android.ugc.aweme.filter.C29230az) r1
                com.ss.android.ugc.aweme.shortvideo.e.g r4 = r9.f97757c
                com.ss.android.ugc.aweme.shortvideo.e.a r4 = r4.mo74909j()
                com.ss.android.ugc.aweme.shortvideo.e.i r4 = (com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i) r4
                java.lang.String r5 = "filterModule.filterFunc"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                com.ss.android.ugc.aweme.filter.g r4 = r4.mo74906g()
                java.lang.String r5 = "filterBean"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                com.ss.android.ugc.aweme.servicimpl.aa$c$a r5 = new com.ss.android.ugc.aweme.servicimpl.aa$c$a
                r5.<init>(r9)
                com.ss.android.ugc.aweme.filter.ba r5 = (com.p280ss.android.ugc.aweme.filter.C29238ba) r5
                float r1 = com.p280ss.android.ugc.aweme.filter.C29297h.m96116a(r4, r1, r5)
                java.lang.String r5 = "filter_value"
                java.lang.Float r6 = java.lang.Float.valueOf(r1)
                r0.mo59972a(r5, r6)
                float r5 = r4.f77275j
                float r5 = r5 - r1
                float r1 = java.lang.Math.abs(r5)
                double r5 = (double) r1
                r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 < 0) goto L_0x0176
                float r1 = r4.f77275j
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x0177
            L_0x0176:
                r2 = 1
            L_0x0177:
                java.lang.String r1 = "is_original_filter"
                if (r2 == 0) goto L_0x017e
                java.lang.String r2 = "1"
                goto L_0x0180
            L_0x017e:
                java.lang.String r2 = "0"
            L_0x0180:
                r0.mo59973a(r1, r2)
            L_0x0183:
                java.lang.String r1 = "record_video"
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r0)
                com.p280ss.android.ugc.aweme.beauty.C23531b.m77287c()
                r0 = 720(0x2d0, float:1.009E-42)
                r1 = 1280(0x500, float:1.794E-42)
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r9.f97756b
                java.lang.String r2 = r2.f99787w
                com.ss.android.ugc.aweme.photo.PhotoContext r10 = com.p280ss.android.ugc.aweme.photo.PhotoContext.fromCapture(r10, r0, r1, r2)
                com.ss.android.ugc.aweme.shortvideo.e.g r0 = r9.f97757c
                com.ss.android.ugc.aweme.shortvideo.e.a r0 = r0.mo74909j()
                com.ss.android.ugc.aweme.shortvideo.e.i r0 = (com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i) r0
                java.lang.String r1 = "filterModule.filterFunc"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.filter.g r0 = r0.mo74906g()
                java.lang.String r1 = "filterModule.filterFunc.curFilter"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                int r0 = r0.f77270e
                r10.mFilterIndex = r0
                com.ss.android.ugc.aweme.shortvideo.e.g r0 = r9.f97757c
                com.ss.android.ugc.aweme.shortvideo.e.a r0 = r0.mo74909j()
                com.ss.android.ugc.aweme.shortvideo.e.i r0 = (com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i) r0
                java.lang.String r1 = "filterModule.filterFunc"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.filter.g r0 = r0.mo74906g()
                java.lang.String r1 = "filterModule.filterFunc.curFilter"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r0 = r0.f77267b
                r10.mFilterName = r0
                com.ss.android.ugc.aweme.shortvideo.e.g r0 = r9.f97757c
                com.ss.android.ugc.aweme.shortvideo.e.a r0 = r0.mo74909j()
                com.ss.android.ugc.aweme.shortvideo.e.i r0 = (com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i) r0
                java.lang.String r1 = "filterModule.filterFunc"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.filter.g r0 = r0.mo74906g()
                java.lang.String r1 = "filterModule.filterFunc.curFilter"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                int r0 = r0.f77266a
                r10.mFilterId = r0
                com.ss.android.ugc.aweme.shortvideo.beauty.c r0 = r9.f97759e
                int r0 = r0.mo96499b()
                float r0 = (float) r0
                r10.mBigEyesRate = r0
                com.ss.android.ugc.aweme.shortvideo.beauty.c r0 = r9.f97759e
                int r0 = r0.mo96490a()
                float r0 = (float) r0
                r10.mSmoothSkinRate = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f97756b
                java.lang.String r0 = r0.f99788x
                r10.mShootWay = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f97756b
                int r0 = r0.f99790z
                r10.draftId = r0
                kotlin.d r0 = r9.f97758d
                java.lang.Object r0 = r0.getValue()
                com.ss.android.ugc.aweme.shortvideo.sticker.w r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w) r0
                if (r0 == 0) goto L_0x0214
                com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r0 = r0.mo100301b()
                goto L_0x0215
            L_0x0214:
                r0 = 0
            L_0x0215:
                if (r0 == 0) goto L_0x023d
                long r1 = r0.getStickerId()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r10.mStickers = r1
                com.ss.android.ugc.aweme.shortvideo.ui.StickerPoi r1 = r0.getStickerPoi()
                if (r1 == 0) goto L_0x0237
                com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi r1 = new com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi
                com.ss.android.ugc.aweme.shortvideo.ui.StickerPoi r2 = r0.getStickerPoi()
                java.lang.String r3 = "currentSticker.stickerPoi"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                r1.<init>(r2)
                r10.defaultSelectStickerPoi = r1
            L_0x0237:
                java.lang.String r0 = r0.getPropSource()
                r10.mPropSource = r0
            L_0x023d:
                com.ss.android.ugc.aweme.servicimpl.aa r0 = r9.f97755a
                com.ss.android.ugc.aweme.shortvideo.record.CameraModule r0 = com.p280ss.android.ugc.aweme.servicimpl.C37450aa.m120081d(r0)
                int r0 = r0.mo100087f()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r10.mCamera = r0
                com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                java.lang.String r1 = "PublishManager.inst()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = r0.f102247b
                r10.challenges = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.f97756b
                com.ss.android.ugc.aweme.tools.extension.b r0 = com.p280ss.android.ugc.aweme.shortvideo.C40005j.m127914b(r0)
                com.ss.android.ugc.aweme.tools.extension.a r1 = com.p280ss.android.ugc.aweme.shortvideo.C40005j.m127908a(r10)
                com.ss.android.ugc.aweme.tools.extension.Scene r2 = com.p280ss.android.ugc.aweme.tools.extension.Scene.RECORD
                com.ss.android.ugc.aweme.tools.extension.Scene r3 = com.p280ss.android.ugc.aweme.tools.extension.Scene.EDIT
                com.p280ss.android.ugc.aweme.tools.extension.C42311e.m134571a(r0, r1, r2, r3)
                com.ss.android.ugc.aweme.servicimpl.aa r0 = r9.f97755a
                com.ss.android.ugc.gamora.bottomtab.d r0 = com.p280ss.android.ugc.aweme.servicimpl.C37450aa.m120078a(r0)
                android.support.v4.app.FragmentActivity r0 = r0.mo106145d()
                android.content.Context r0 = (android.content.Context) r0
                com.p280ss.android.ugc.aweme.photo.edit.PhotoEditActivity.m112080a(r0, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.servicimpl.C37450aa.C37453c.mo88156a(java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$d */
    static final class C37455d extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C37450aa f97761a;

        C37455d(C37450aa aaVar) {
            this.f97761a = aaVar;
            super(2);
        }

        /* renamed from: a */
        private void m120114a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f97761a.mo94784f();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120114a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$e */
    static final class C37456e implements C23254a {

        /* renamed from: a */
        final /* synthetic */ C37450aa f97762a;

        C37456e(C37450aa aaVar) {
            this.f97762a = aaVar;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            C39934k kVar;
            if (i == 25 || i == 24) {
                C40994w wVar = (C40994w) C37450aa.m120078a(this.f97762a).mo106149h().getValue();
                if (wVar != null) {
                    kVar = wVar.mo100319k();
                } else {
                    kVar = null;
                }
                if (C37450aa.m120080c(this.f97762a).mo96169c() && (kVar == null || !kVar.mo99344c())) {
                    this.f97762a.mo94784f();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$f */
    static final class C37457f extends Lambda implements C7561a<PhotoModule> {

        /* renamed from: a */
        final /* synthetic */ C37450aa f97763a;

        C37457f(C37450aa aaVar) {
            this.f97763a = aaVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public PhotoModule invoke() {
            return this.f97763a.mo94785g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$g */
    static final class C37458g extends Lambda implements C7561a<C37451a> {

        /* renamed from: a */
        final /* synthetic */ C37450aa f97764a;

        C37458g(C37450aa aaVar) {
            this.f97764a = aaVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37451a invoke() {
            return new C37451a();
        }
    }

    /* renamed from: h */
    private final PhotoModule m120085h() {
        return (PhotoModule) this.f97746l.getValue();
    }

    /* renamed from: i */
    private final C37451a m120087i() {
        return (C37451a) this.f97747m.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    public final C43869e bH_() {
        return m120087i();
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    public final Lifecycle getLifecycle() {
        C43868d dVar = this.f97742h;
        if (dVar == null) {
            C7573i.m23583a("tabEnv");
        }
        Lifecycle lifecycle = dVar.mo106145d().getLifecycle();
        C7573i.m23582a((Object) lifecycle, "tabEnv.activity.lifecycle");
        return lifecycle;
    }

    /* renamed from: f */
    public final void mo94784f() {
        long j;
        m120085h().mo88153a();
        C43868d dVar = this.f97742h;
        if (dVar == null) {
            C7573i.m23583a("tabEnv");
        }
        FragmentActivity d = dVar.mo106145d();
        if (d != null) {
            JSONObject n = ((VideoRecordNewActivity) d).mo101854n();
            String str = "prop_id";
            try {
                C43868d dVar2 = this.f97742h;
                if (dVar2 == null) {
                    C7573i.m23583a("tabEnv");
                }
                C40994w wVar = (C40994w) dVar2.mo106149h().getValue();
                if (wVar != null) {
                    FaceStickerBean b = wVar.mo100301b();
                    if (b != null) {
                        j = b.getStickerId();
                        n.put(str, j);
                        C6907h.onEvent(MobClick.obtain().setEventName("shoot_photo").setLabelName("shoot_page").setJsonObject(n));
                        return;
                    }
                }
                j = 0;
                n.put(str, j);
            } catch (JSONException unused) {
            }
            C6907h.onEvent(MobClick.obtain().setEventName("shoot_photo").setLabelName("shoot_page").setJsonObject(n));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
    }

    /* renamed from: g */
    public final PhotoModule mo94785g() {
        C43868d dVar = this.f97742h;
        if (dVar == null) {
            C7573i.m23583a("tabEnv");
        }
        ShortVideoContext e = dVar.mo106146e();
        C43868d dVar2 = this.f97742h;
        if (dVar2 == null) {
            C7573i.m23583a("tabEnv");
        }
        C39374g n = dVar2.mo106155n();
        C43868d dVar3 = this.f97742h;
        if (dVar3 == null) {
            C7573i.m23583a("tabEnv");
        }
        C7541d h = dVar3.mo106149h();
        C43868d dVar4 = this.f97742h;
        if (dVar4 == null) {
            C7573i.m23583a("tabEnv");
        }
        C38519c i = dVar4.mo106150i();
        C43868d dVar5 = this.f97742h;
        if (dVar5 == null) {
            C7573i.m23583a("tabEnv");
        }
        FragmentActivity d = dVar5.mo106145d();
        if (d != null) {
            AbsActivity absActivity = (AbsActivity) d;
            C43868d dVar6 = this.f97742h;
            if (dVar6 == null) {
                C7573i.m23583a("tabEnv");
            }
            C20676a f = dVar6.mo106147f();
            C37453c cVar = new C37453c(this, e, n, h, i);
            return new PhotoModule(absActivity, f, cVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.uikit.base.AbsActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ C43868d m120078a(C37450aa aaVar) {
        C43868d dVar = aaVar.f97742h;
        if (dVar == null) {
            C7573i.m23583a("tabEnv");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecordViewModel m120079b(C37450aa aaVar) {
        RecordViewModel recordViewModel = aaVar.f97737c;
        if (recordViewModel == null) {
            C7573i.m23583a("recordViewModel");
        }
        return recordViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ ShortVideoContextViewModel m120080c(C37450aa aaVar) {
        ShortVideoContextViewModel shortVideoContextViewModel = aaVar.f97736b;
        if (shortVideoContextViewModel == null) {
            C7573i.m23583a("shortVideoContextViewModel");
        }
        return shortVideoContextViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ CameraModule m120081d(C37450aa aaVar) {
        CameraModule cameraModule = aaVar.f97741g;
        if (cameraModule == null) {
            C7573i.m23583a("cameraModule");
        }
        return cameraModule;
    }

    /* renamed from: e */
    public static final /* synthetic */ RecordToolbarViewModel m120082e(C37450aa aaVar) {
        RecordToolbarViewModel recordToolbarViewModel = aaVar.f97739e;
        if (recordToolbarViewModel == null) {
            C7573i.m23583a("recordToolbarViewModel");
        }
        return recordToolbarViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ RecordControlViewModel m120083f(C37450aa aaVar) {
        RecordControlViewModel recordControlViewModel = aaVar.f97740f;
        if (recordControlViewModel == null) {
            C7573i.m23583a("recordControlViewModel");
        }
        return recordControlViewModel;
    }

    /* renamed from: g */
    public static final /* synthetic */ RecordProgressViewModel m120084g(C37450aa aaVar) {
        RecordProgressViewModel recordProgressViewModel = aaVar.f97738d;
        if (recordProgressViewModel == null) {
            C7573i.m23583a("recordProgressViewModel");
        }
        return recordProgressViewModel;
    }

    /* renamed from: h */
    public static final /* synthetic */ RecordStatusViewModel m120086h(C37450aa aaVar) {
        RecordStatusViewModel recordStatusViewModel = aaVar.f97743i;
        if (recordStatusViewModel == null) {
            C7573i.m23583a("recordStatusViewModel");
        }
        return recordStatusViewModel;
    }

    /* renamed from: b */
    public final C43866b mo94780b(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        C43866b bVar = new C43866b(this.f97748n, this.f97749o, this.f97750p, this.f97751q, new C37452b(this, dVar));
        return bVar;
    }

    /* renamed from: a */
    public final void mo94779a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        this.f97742h = dVar;
        C0063u a = C0069x.m159a(dVar.mo106145d()).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ta…extViewModel::class.java)");
        this.f97736b = (ShortVideoContextViewModel) a;
        JediViewModel a2 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordViewModel.class);
        C7573i.m23582a((Object) a2, "JediViewModelProviders.o…ordViewModel::class.java)");
        this.f97737c = (RecordViewModel) a2;
        JediViewModel a3 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordProgressViewModel.class);
        C7573i.m23582a((Object) a3, "JediViewModelProviders.o…essViewModel::class.java)");
        this.f97738d = (RecordProgressViewModel) a3;
        JediViewModel a4 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordToolbarViewModel.class);
        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…barViewModel::class.java)");
        this.f97739e = (RecordToolbarViewModel) a4;
        JediViewModel a5 = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordControlViewModel.class);
        C7573i.m23582a((Object) a5, "JediViewModelProviders.o…rolViewModel::class.java)");
        this.f97740f = (RecordControlViewModel) a5;
        this.f97745k = dVar.mo106141b();
        this.f97741g = dVar.mo106148g();
        RecordControlViewModel recordControlViewModel = this.f97740f;
        if (recordControlViewModel == null) {
            C7573i.m23583a("recordControlViewModel");
        }
        mo91869c(recordControlViewModel, C37459ab.f97765a, new C11672v(), new C37455d(this));
        C0063u a6 = C0069x.m159a(dVar.mo106145d()).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a6, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f97743i = (RecordStatusViewModel) a6;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    public C37450aa(String str, String str2, String str3, boolean z) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(str3, "shootMode");
        this.f97748n = str;
        this.f97749o = str2;
        this.f97750p = str3;
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
