package com.p280ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.util.C0902i;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.util.C6292i;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effect.p1200d.C27424c;
import com.p280ss.android.ugc.aweme.effect.p1200d.C27425d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c;
import com.p280ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39775o;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39782s;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39787x;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40154a;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40161f;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41406s;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.TabLayoutOnPageChangeListenerIndependent;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.widget.C41706n;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.Adapter;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.tools.effect.R$styleable;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.VEState;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47477r;
import dmt.p1861av.video.C47479s;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.C47520y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.effect.w */
public final class C27446w {

    /* renamed from: A */
    protected C27424c f72367A;

    /* renamed from: B */
    protected C27425d f72368B;

    /* renamed from: C */
    protected C0935e f72369C;

    /* renamed from: D */
    public Runnable f72370D = new Runnable() {
        public final void run() {
            int m;
            if (C27446w.this.f72409j != null) {
                if (C27446w.this.f72410k.mo70457c()) {
                    m = C27446w.this.f72409j.mo38860l() - C27446w.this.f72409j.mo38862m();
                } else {
                    m = C27446w.this.f72409j.mo38862m();
                }
                C27446w.this.f72408i.f100395b.setValue(Long.valueOf((long) m));
                C27446w.this.mo70577b();
                C27446w.this.f72424y.post(C27446w.this.f72370D);
            }
        }
    };

    /* renamed from: E */
    private C39782s f72371E;

    /* renamed from: F */
    private C0052o<Boolean> f72372F;

    /* renamed from: G */
    private C0043i f72373G;

    /* renamed from: H */
    private LinearLayout f72374H;

    /* renamed from: I */
    private FrameLayout f72375I;

    /* renamed from: J */
    private ImageView f72376J;

    /* renamed from: K */
    private RelativeLayout f72377K;

    /* renamed from: L */
    private TextView f72378L;

    /* renamed from: M */
    private RelativeLayout f72379M;

    /* renamed from: N */
    private RelativeLayout f72380N;

    /* renamed from: O */
    private LinearLayout f72381O;

    /* renamed from: P */
    private DmtStatusView f72382P;

    /* renamed from: Q */
    private TextView f72383Q;

    /* renamed from: R */
    private TextView f72384R;

    /* renamed from: S */
    private AVDmtTabLayout f72385S;

    /* renamed from: T */
    private ChooseVideoCoverView f72386T;

    /* renamed from: U */
    private C38632c f72387U;

    /* renamed from: V */
    private C41706n f72388V;

    /* renamed from: W */
    private C45329l f72389W;

    /* renamed from: X */
    private View f72390X;

    /* renamed from: Y */
    private int f72391Y;

    /* renamed from: Z */
    private boolean f72392Z;

    /* renamed from: a */
    public VideoPublishEditModel f72393a;

    /* renamed from: aa */
    private EffectPointModel f72394aa;

    /* renamed from: ab */
    private C47520y f72395ab;

    /* renamed from: ac */
    private ArrayList<EffectPointModel> f72396ac;

    /* renamed from: ad */
    private C0052o<Bitmap> f72397ad;

    /* renamed from: ae */
    private C0052o<Boolean> f72398ae;

    /* renamed from: af */
    private C23258e f72399af;

    /* renamed from: ag */
    private C23254a f72400ag = new C27464x(this);

    /* renamed from: b */
    public C0052o<C47479s> f72401b;

    /* renamed from: c */
    public C0052o<C47516v> f72402c;

    /* renamed from: d */
    public C0052o<C47520y> f72403d;

    /* renamed from: e */
    public SafeHandler f72404e;

    /* renamed from: f */
    public VEEffectSeekLayout f72405f;

    /* renamed from: g */
    public NoScrollViewPager f72406g;

    /* renamed from: h */
    public VideoEditView f72407h;

    /* renamed from: i */
    public CutMultiVideoViewModel f72408i;

    /* renamed from: j */
    public C15389d f72409j;

    /* renamed from: k */
    public C27358a f72410k;

    /* renamed from: l */
    public int f72411l;

    /* renamed from: m */
    public int f72412m;

    /* renamed from: n */
    public C27463b f72413n;

    /* renamed from: o */
    public C27462a f72414o;

    /* renamed from: p */
    public Context f72415p;

    /* renamed from: q */
    public EffectTabPagerAdapter f72416q;

    /* renamed from: r */
    public boolean f72417r;

    /* renamed from: s */
    public FragmentActivity f72418s;

    /* renamed from: t */
    public EffectPointModel f72419t;

    /* renamed from: u */
    public long f72420u;

    /* renamed from: v */
    public String f72421v;

    /* renamed from: w */
    public ArrayList<EffectPointModel> f72422w;

    /* renamed from: x */
    public int f72423x = -1;

    /* renamed from: y */
    public SafeHandler f72424y;

    /* renamed from: z */
    protected EditEffectVideoModel f72425z;

    /* renamed from: com.ss.android.ugc.aweme.effect.w$a */
    class C27462a implements Runnable {
        public final void run() {
            C27446w.this.f72405f.mo70428b((int) C27446w.this.f72410k.mo70453a());
            C27446w.this.mo70577b();
            C27446w.this.f72404e.post(this);
        }

        C27462a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$b */
    class C27463b implements Runnable {

        /* renamed from: a */
        int f72444a;

        public final void run() {
            C27446w.this.f72405f.mo70424a(this.f72444a, (int) C27446w.this.f72410k.mo70453a());
            C27446w.this.mo70577b();
            C27446w.this.f72404e.post(this);
        }

        C27463b(int i) {
            this.f72444a = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo70576a(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f72417r) {
            return false;
        }
        m89927P();
        return true;
    }

    /* renamed from: a */
    public final void mo70565a(EffectModel effectModel) {
        if (!this.f72410k.mo70456b()) {
            C47479s a = C47479s.m148205a(effectModel.resDir, (long) this.f72409j.mo38862m());
            a.f121914f = effectModel.color;
            a.f121916h = effectModel.key;
            a.f121917i = effectModel.name;
            a.f121913e = this.f72410k.mo70457c();
            a.f121919k = effectModel.category;
            a.f121918j = effectModel.duration;
            a.f121920l = effectModel.extra;
            this.f72401b.setValue(a);
            m89924M();
            C47479s a2 = C47479s.m148203a(a.f121910b + ((long) effectModel.duration));
            a2.f121913e = this.f72410k.mo70457c();
            this.f72401b.setValue(a2);
            C42962b.f111525a.mo104671a("effect_click", C38511bc.m123103a().mo96485a("creation_id", this.f72393a.creationId).mo96483a("scene_id", 1003).mo96485a("shoot_way", this.f72393a.mShootWay).mo96483a("draft_id", this.f72393a.draftId).mo96485a("tab_name", this.f72421v).mo96485a("effect_name", effectModel.name).mo96485a("effect_id", effectModel.key).f100112a);
        }
    }

    /* renamed from: a */
    public final void mo70566a(EffectModel effectModel, EffectPointModel effectPointModel) {
        C47479s sVar;
        this.f72402c.setValue(C47516v.m148298b(0));
        if (effectPointModel == null) {
            sVar = C47479s.m148206a(effectModel.resDir, 0, (long) this.f72409j.mo38860l());
        } else {
            sVar = C47479s.m148207a(effectModel.resDir, 0, (long) this.f72409j.mo38860l(), effectPointModel.getIndex());
        }
        sVar.f121914f = effectModel.color;
        sVar.f121916h = effectModel.key;
        sVar.f121917i = effectModel.name;
        sVar.f121913e = this.f72410k.mo70457c();
        sVar.f121919k = effectModel.category;
        sVar.f121920l = effectModel.extra;
        this.f72401b.setValue(sVar);
        m89924M();
    }

    /* renamed from: a */
    public final void mo70569a(CharSequence charSequence, long j) {
        if (this.f72377K != null) {
            this.f72377K.setVisibility(0);
            this.f72377K.postDelayed(new C27381ai(this), j);
        }
        if (this.f72378L != null) {
            this.f72378L.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo70574a(boolean z) {
        this.f72417r = z;
        if (!z) {
            this.f72383Q.setVisibility(8);
            this.f72384R.setVisibility(8);
        }
        C27439r.m89908a((View) this.f72375I, z, mo70597h(), this.f72390X, (C6892b<Void>) new C27382aj<Void>(this, z));
        if (z) {
            if (this.f72399af != null) {
                this.f72399af.mo60525a(this.f72400ag);
            }
            this.f72420u = 0;
            if (this.f72405f != null) {
                this.f72402c.setValue(C47516v.m148298b(0));
                this.f72405f.mo70429b(m89922K() ? this.f72391Y : 0, 1);
                m89925N();
            }
            m89926O();
            m89919H();
            return;
        }
        if (this.f72399af != null) {
            this.f72399af.mo60526b(this.f72400ag);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo70575a(boolean z, Void voidR) {
        if (z) {
            this.f72383Q.setVisibility(0);
            this.f72384R.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo70568a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            mo70599j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo70571a(Void voidR) {
        if (this.f72417r) {
            C0902i playBoundary = this.f72407h.getPlayBoundary();
            this.f72402c.setValue(C47516v.m148298b((long) ((Long) playBoundary.f3154a).intValue()));
            m89931a((long) ((Long) playBoundary.f3154a).intValue(), (long) ((Long) playBoundary.f3155b).intValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo70570a(Long l) {
        this.f72402c.setValue(C47516v.m148296a(l.longValue()));
    }

    /* renamed from: a */
    public final void mo70572a(List<EffectCategoryResponse> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.f72393a.isMvThemeVideoType()) {
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    if (list.get(i) != null && C27431j.m89899b(((EffectCategoryResponse) list.get(i)).key)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                list.remove(i);
            }
            return;
        }
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.name = this.f72415p.getString(R.string.e57);
        list.add(effectCategoryResponse);
    }

    /* renamed from: a */
    public final void mo70573a(List<EffectPointModel> list, boolean z) {
        if (z) {
            m89933c(true);
            m89934d(false);
            if (list == null || list.isEmpty()) {
                this.f72407h.mo97639b(false);
                return;
            }
            mo70561a(((EffectPointModel) list.get(0)).getStartPoint(), ((EffectPointModel) list.get(0)).getEndPoint());
            this.f72407h.mo97639b(true);
            return;
        }
        m89933c(false);
        m89934d(true);
    }

    /* renamed from: a */
    public final void mo70567a(C27424c cVar) {
        this.f72367A = cVar;
        this.f72425z = (EditEffectVideoModel) C0069x.m159a(cVar.mo70534a()).mo147a(EditEffectVideoModel.class);
        this.f72425z.mo70335a(this.f72367A);
    }

    /* renamed from: K */
    private boolean m89922K() {
        return this.f72410k.mo70457c();
    }

    /* renamed from: s */
    private void m89938s() {
        this.f72410k = new C27358a() {

            /* renamed from: b */
            private boolean f72442b;

            /* renamed from: c */
            public final boolean mo70457c() {
                return this.f72442b;
            }

            /* renamed from: a */
            public final long mo70453a() {
                return mo70454a((long) C27446w.this.f72409j.mo38862m());
            }

            /* renamed from: b */
            public final boolean mo70456b() {
                int i;
                long a = mo70453a();
                if (!this.f72442b) {
                    i = C27446w.this.f72409j.mo38860l();
                } else {
                    i = 0;
                }
                if (a == ((long) i)) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public final long mo70454a(long j) {
                if (this.f72442b) {
                    return ((long) C27446w.this.f72409j.mo38860l()) - j;
                }
                return j;
            }

            /* renamed from: a */
            public final void mo70455a(boolean z) {
                this.f72442b = z;
                C27446w.this.f72409j.mo38839e(z);
                if (C27446w.this.f72393a.isFastImport) {
                    C27446w.this.f72367A.mo70539f().setValue(VEVolumeChangeOp.ofVoice(C27446w.this.f72393a.voiceVolume));
                }
            }
        };
    }

    /* renamed from: d */
    public final void mo70589d() {
        this.f72404e.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo70605p() {
        this.f72377K.setVisibility(8);
    }

    /* renamed from: P */
    private void m89927P() {
        if (this.f72384R != null) {
            this.f72384R.performClick();
        }
    }

    /* renamed from: R */
    private void m89929R() {
        if (this.f72368B != null) {
            this.f72368B.mo70548a();
        }
    }

    /* renamed from: r */
    private void m89937r() {
        this.f72405f.setOnCursorSeekListener(new C41406s() {

            /* renamed from: a */
            VEState f72439a;

            /* renamed from: a */
            public final void mo70613a(int i, int i2, int i3) {
                C47516v vVar;
                if (i2 == 1) {
                    long a = (long) ((int) C27446w.this.f72410k.mo70454a((long) i));
                    if (i3 == 1) {
                        if (C27446w.this.f72409j != null) {
                            this.f72439a = C27446w.this.f72409j.mo38850h();
                            vVar = C47516v.m148296a(a);
                        } else {
                            return;
                        }
                    } else if (i3 == 3) {
                        vVar = C47516v.m148296a(a);
                    } else if (i3 == 2) {
                        vVar = C47516v.m148298b(a);
                    } else {
                        throw new AssertionError();
                    }
                    C27446w.this.f72402c.setValue(vVar);
                    if (i3 == 2 && this.f72439a == VEState.STARTED) {
                        C27446w.this.mo70599j();
                        this.f72439a = null;
                    }
                } else if (i2 == 2 && i3 == 2 && C27446w.this.f72419t != null) {
                    C47520y yVar = (C47520y) C27446w.this.f72403d.getValue();
                    if (yVar != null) {
                        C27446w.this.f72403d.setValue(yVar.mo119646c((long) i));
                    }
                    C27446w.this.f72419t.setStartPoint(i);
                    C27446w.this.f72419t.setEndPoint(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo70559a() {
        this.f72413n = null;
        this.f72414o = null;
        this.f72404e.removeCallbacksAndMessages(null);
        this.f72424y.removeCallbacksAndMessages(null);
    }

    /* renamed from: j */
    public final void mo70599j() {
        this.f72402c.setValue(C47516v.m148297b());
        m89925N();
    }

    /* renamed from: l */
    public final void mo70601l() {
        this.f72425z.mo70337c().setValue(Boolean.valueOf(false));
    }

    /* renamed from: C */
    private void m89914C() {
        this.f72425z.mo70339e().setValue(Float.valueOf(this.f72407h.getSelectedTime()));
    }

    /* renamed from: D */
    private void m89915D() {
        this.f72386T.mo102316a(false);
        this.f72386T.setLayoutManager(new WrapLinearLayoutManager(this.f72418s, 0, false));
        this.f72386T.post(new C27376ad(this));
    }

    /* renamed from: F */
    private void m89917F() {
        if (this.f72368B == null) {
            this.f72368B = C35574k.m114859a().mo70093h().mo70533b();
        }
        this.f72368B.mo70549a(new C43757g() {
            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                C27446w.this.mo70584b(false);
                ArrayList arrayList = new ArrayList();
                C27446w.this.mo70572a((List<EffectCategoryResponse>) arrayList);
                C27446w.this.mo70583b((List<EffectCategoryResponse>) arrayList);
                C27446w.this.f72416q.mo70393a((List<EffectCategoryResponse>) arrayList);
                C27446w.this.f72406g.setAdapter(C27446w.this.f72416q);
                if (C27446w.this.f72369C != null && !arrayList.isEmpty()) {
                    C27446w.this.f72369C.onPageSelected(0);
                }
                C10761a.m31399c(C27446w.this.f72415p, (int) R.string.dxl).mo25750a();
                StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                sb.append(cVar.toString());
                C6921a.m21562b("EffectHelper", sb.toString());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo70609b(EffectChannelResponse effectChannelResponse) {
                if (C27446w.this.f72416q.f72127a != null && (C27446w.this.f72416q.f72127a instanceof C27442s)) {
                    C27446w.this.f72405f.setEffectPointModels(((C27442s) C27446w.this.f72416q.f72127a).mo70331d());
                    if (C27431j.m89899b(((EffectCategoryResponse) effectChannelResponse.categoryResponseList.get(0)).key)) {
                        C27446w.this.mo70573a(((C27442s) C27446w.this.f72416q.f72127a).mo70331d(), true);
                    }
                }
            }

            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                List<EffectCategoryResponse> list = effectChannelResponse.categoryResponseList;
                C27446w.this.mo70572a(list);
                C27446w.this.mo70583b(list);
                C27446w.this.f72416q.mo70393a(list);
                C27446w.this.f72406g.setAdapter(C27446w.this.f72416q);
                if (!effectChannelResponse.categoryResponseList.isEmpty()) {
                    C27446w.this.f72421v = ((EffectCategoryResponse) effectChannelResponse.categoryResponseList.get(0)).name;
                    C27446w.this.mo70573a(null, C27431j.m89899b(((EffectCategoryResponse) effectChannelResponse.categoryResponseList.get(0)).key));
                }
                C27446w.this.f72406g.post(new C27388ap(this, effectChannelResponse));
                C27446w.this.mo70584b(false);
            }
        });
    }

    /* renamed from: H */
    private void m89919H() {
        if (this.f72389W == null) {
            this.f72389W = new C45329l() {
                public final void onCallback(int i, int i2, float f, String str) {
                    if (i == 4098) {
                        C47479s sVar = (C47479s) C27446w.this.f72401b.getValue();
                        if (!C27446w.this.f72417r) {
                            return;
                        }
                        if (sVar == null || sVar.f121912d != 0) {
                            C27446w.this.f72404e.post(new Runnable() {
                                public final void run() {
                                    if (C27446w.this.f72410k.mo70457c()) {
                                        C27446w.this.f72402c.setValue(C47516v.m148298b(((long) C27446w.this.f72409j.mo38860l()) - C27446w.this.f72420u));
                                    } else {
                                        C27446w.this.f72402c.setValue(C47516v.m148298b(C27446w.this.f72420u));
                                    }
                                    C27446w.this.f72405f.mo70428b((int) C27446w.this.f72420u);
                                    C27446w.this.mo70599j();
                                }
                            });
                        }
                    }
                }
            };
            this.f72409j.mo38824b(this.f72389W);
        }
    }

    /* renamed from: J */
    private void m89921J() {
        if (this.f72405f != null) {
            this.f72405f.mo70428b((int) this.f72410k.mo70453a());
        }
    }

    /* renamed from: M */
    private void m89924M() {
        this.f72402c.setValue(C47516v.m148295a());
        C27439r.m89909a((View) this.f72376J, false, (View) null, false, false);
        if (this.f72376J != null) {
            this.f72376J.setVisibility(8);
        }
    }

    /* renamed from: N */
    private void m89925N() {
        C27439r.m89909a((View) this.f72376J, true, (View) null, false, false);
        if (this.f72376J != null) {
            this.f72376J.setVisibility(0);
        }
    }

    /* renamed from: Q */
    private JSONObject m89928Q() {
        return C6869c.m21381a().mo16887a("shoot_way", this.f72393a.mShootWay).mo16888b();
    }

    /* renamed from: q */
    private void m89936q() {
        this.f72406g.clearOnPageChangeListeners();
        this.f72406g.addOnPageChangeListener(new TabLayoutOnPageChangeListenerIndependent(this.f72385S));
        this.f72369C = new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                C27446w.this.mo70599j();
                C42962b.f111525a.mo104671a("click_effect_tab", C22984d.m75611a().mo59973a("creation_id", C27446w.this.f72393a.creationId).mo59973a("shoot_way", C27446w.this.f72393a.mShootWay).mo59970a("draft_id", C27446w.this.f72393a.draftId).mo59973a("tab_name", C27446w.this.f72421v).f60753a);
                List list = null;
                if (i == C27446w.this.f72416q.getCount() - 1 && !C27446w.this.f72393a.isMvThemeVideoType()) {
                    C27446w.this.mo70594f();
                    if (C27446w.this.f72419t != null && !"0".equals(C27446w.this.f72419t.getKey())) {
                        if (!"1".equals(C27446w.this.f72419t.getKey())) {
                            C27446w.this.f72405f.getSelelctLayout().setVisibility(0);
                        } else {
                            C27446w.this.f72405f.setOverlayColor(C27446w.this.f72411l);
                            C27446w.this.f72405f.mo70427a(true);
                            C27446w.this.f72421v = "time_effect";
                            C27446w.this.mo70573a(null, false);
                        }
                    }
                    C27446w.this.f72405f.setOverlayColor(C27446w.this.f72412m);
                    C27446w.this.f72405f.mo70427a(true);
                    C27446w.this.f72421v = "time_effect";
                    C27446w.this.mo70573a(null, false);
                } else if (C27431j.m89899b(C27446w.this.f72416q.mo70391a(i).key)) {
                    C27446w.this.f72405f.mo70427a(false);
                    C27446w.this.f72405f.getSelelctLayout().setVisibility(8);
                    C27446w.this.f72421v = C27446w.this.f72416q.mo70391a(i).name;
                    if (C27446w.this.f72416q.f72127a != null) {
                        list = ((C27442s) C27446w.this.f72416q.f72127a).mo70331d();
                    }
                    C27446w.this.mo70573a(list, true);
                } else {
                    if (C27446w.this.f72416q.f72127a != null) {
                        C27446w.this.f72405f.setEffectPointModels(((C27442s) C27446w.this.f72416q.f72127a).mo70331d());
                    }
                    C27446w.this.f72405f.mo70427a(false);
                    C27446w.this.f72405f.getSelelctLayout().setVisibility(8);
                    C27446w.this.f72421v = C27446w.this.f72416q.mo70391a(i).name;
                    C27446w.this.mo70573a(null, false);
                }
            }
        };
        this.f72406g.addOnPageChangeListener(this.f72369C);
    }

    /* renamed from: u */
    private void m89940u() {
        this.f72401b = this.f72367A.mo70542i();
        this.f72401b.observe(this.f72373G, new C0053p<C47479s>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C47479s sVar) {
                long j;
                if (sVar != null) {
                    if (sVar.f121913e) {
                        j = ((long) C27446w.this.f72409j.mo38860l()) - sVar.f121910b;
                    } else {
                        j = sVar.f121910b;
                    }
                    long j2 = j;
                    if (sVar.f121912d == 0) {
                        try {
                            C27446w.this.f72405f.mo70426a(sVar.f121909a[0], j2, sVar.f121914f, C27446w.this.f72410k.mo70457c());
                        } catch (NullPointerException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(e.getMessage());
                            sb.append(" ");
                            sb.append(sVar.toString());
                            throw new NullPointerException(sb.toString());
                        }
                    } else if (sVar.f121912d == 5) {
                        C27446w.this.f72407h.mo97629a(true, true, null);
                        C27446w.this.mo70561a((int) sVar.f121910b, (int) sVar.f121911c);
                    } else if (sVar.f121912d == 7) {
                        C27446w.this.f72407h.mo97629a(false, true, null);
                    } else if (sVar.f121912d == 8) {
                        C27446w.this.mo70561a((int) sVar.f121910b, (int) sVar.f121911c);
                        C27446w.this.f72407h.mo97629a(false, true, (C6892b<Void>) new C27389aq<Void>(this, sVar, j2));
                    } else {
                        ArrayList effectPointModels = C27446w.this.f72405f.getEffectPointModels();
                        if (sVar.f121912d == 1) {
                            if (!effectPointModels.isEmpty()) {
                                C27446w.this.f72405f.mo70425a(((EffectPointModel) effectPointModels.get(effectPointModels.size() - 1)).getIndex(), j2);
                            }
                        } else if (sVar.f121912d == 2) {
                            C27446w.this.mo70560a(sVar.f121909a[0]);
                        } else if (sVar.f121912d == 3) {
                            if (C27446w.this.f72402c != null) {
                                C27446w.this.f72402c.setValue(C47516v.m148298b(0));
                            }
                            C27446w.this.f72405f.mo70428b((int) C27446w.this.f72410k.mo70454a(0));
                            C27446w.this.f72405f.mo70422a();
                        } else {
                            if (sVar.f121912d == 4 && C27446w.this.f72422w != null) {
                                for (int length = sVar.f121909a.length - 1; length >= 0; length--) {
                                    C27446w.this.mo70560a(sVar.f121909a[length]);
                                }
                            }
                        }
                    }
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo70607a(C47479s sVar, long j, Void voidR) {
                C27446w.this.f72405f.mo70426a(sVar.f121909a[0], j, sVar.f121914f, C27446w.this.f72410k.mo70457c());
                C27446w.this.f72407h.mo97629a(true, true, null);
            }
        });
    }

    /* renamed from: v */
    private void m89941v() {
        this.f72402c = this.f72367A.mo70543j();
        this.f72402c.observe(this.f72373G, new C0053p<C47516v>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C47516v vVar) {
                if (vVar != null) {
                    if (vVar.f121979a == 0) {
                        C47479s sVar = (C47479s) C27446w.this.f72401b.getValue();
                        if (C27446w.this.f72407h.getVisibility() == 0) {
                            C27446w.this.f72424y.post(C27446w.this.f72370D);
                        } else if (sVar == null || sVar.f121912d != 0 || C27431j.m89896a(sVar.f121919k)) {
                            C27446w.this.f72414o = new C27462a();
                            C27446w.this.f72404e.post(C27446w.this.f72414o);
                        } else {
                            C27446w.this.f72413n = new C27463b(sVar.f121909a[0]);
                            C27446w.this.f72404e.post(C27446w.this.f72413n);
                        }
                    } else {
                        C27446w.this.mo70559a();
                    }
                }
            }
        });
    }

    /* renamed from: w */
    private void m89942w() {
        this.f72367A.mo70544k().observe(this.f72373G, new C27380ah(this));
    }

    /* renamed from: x */
    private void m89943x() {
        this.f72425z.mo70337c().observe(this.f72373G, new C0053p<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                int i;
                int i2;
                int i3;
                int i4;
                if (bool != null) {
                    C27446w.this.mo70574a(bool.booleanValue());
                    if (bool.booleanValue()) {
                        C0052o l = C27446w.this.f72367A.mo70545l();
                        int a = C42111b.f109618a.mo103542a(true, false, false, false, false);
                        int g = C27446w.this.mo70596g();
                        if (C39805en.m127445a()) {
                            i3 = C39805en.m127450c(C27446w.this.f72418s);
                        } else {
                            i3 = 0;
                        }
                        int i5 = g + i3;
                        int h = C27446w.this.mo70597h();
                        int m = C27446w.this.mo70602m();
                        if (C39805en.m127445a()) {
                            i4 = C39804em.m127438b(C27446w.this.f72418s, C39804em.f103457a);
                        } else {
                            i4 = 0;
                        }
                        l.setValue(C47518x.m148299a(a, i5, h, m, i4, 0));
                        return;
                    }
                    C0052o l2 = C27446w.this.f72367A.mo70545l();
                    int color = C27446w.this.f72418s.getResources().getColor(R.color.l3);
                    int g2 = C27446w.this.mo70596g();
                    if (C39805en.m127445a()) {
                        i = C39805en.m127450c(C27446w.this.f72418s);
                    } else {
                        i = 0;
                    }
                    int i6 = g2 + i;
                    int h2 = C27446w.this.mo70597h();
                    int m2 = C27446w.this.mo70602m();
                    if (C39805en.m127445a()) {
                        i2 = C39804em.m127438b(C27446w.this.f72418s, C39804em.f103457a);
                    } else {
                        i2 = 0;
                    }
                    l2.setValue(C47518x.m148302b(color, i6, h2, m2, i2, 0));
                }
            }
        });
    }

    /* renamed from: y */
    private void m89944y() {
        this.f72425z.mo70340f().observe(this.f72373G, new C0053p<VEEffectSelectOp>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(VEEffectSelectOp vEEffectSelectOp) {
                switch (vEEffectSelectOp.mType) {
                    case 1:
                        C27446w.this.mo70578b(vEEffectSelectOp.mTimePosition);
                        return;
                    case 2:
                        C27446w.this.mo70565a(vEEffectSelectOp.mEffectModel);
                        return;
                    case 3:
                        C27446w.this.mo70562a(vEEffectSelectOp.action, vEEffectSelectOp.mEffectModel);
                        return;
                    case 4:
                        C27446w.this.mo70566a(vEEffectSelectOp.mEffectModel, vEEffectSelectOp.mPreviousModel);
                        break;
                }
            }
        });
    }

    /* renamed from: z */
    private void m89945z() {
        this.f72425z.mo70341g().observe(this.f72373G, new C0053p<C47477r>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C47477r rVar) {
                if (rVar != null && rVar.f121908c == 0 && !TextUtils.isEmpty(rVar.f121906a) && rVar.f121907b > 0) {
                    C27446w.this.mo70569a(rVar.f121906a, rVar.f121907b);
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo70585c() {
        if (this.f72413n != null) {
            this.f72404e.post(this.f72413n);
        }
        if (this.f72414o != null) {
            this.f72404e.post(this.f72414o);
        }
    }

    /* renamed from: f */
    public final void mo70594f() {
        this.f72371E.mo70482a().mo6876a((C1591g<TResult, TContinuationResult>) new C27383ak<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: g */
    public final int mo70596g() {
        if (this.f72379M.getHeight() == 0) {
            return (int) C9738o.m28708b(this.f72415p, 52.0f);
        }
        return this.f72379M.getHeight();
    }

    /* renamed from: h */
    public final int mo70597h() {
        if (this.f72375I.getHeight() == 0) {
            return (int) C9738o.m28708b(this.f72415p, 276.0f);
        }
        return this.f72375I.getHeight();
    }

    /* renamed from: n */
    public final void mo70603n() {
        mo70578b(0);
        C47479s sVar = new C47479s();
        sVar.f121912d = 9;
        this.f72401b.setValue(sVar);
        this.f72407h.mo97629a(false, true, null);
    }

    /* renamed from: E */
    private void m89916E() {
        C47479s sVar = (C47479s) this.f72401b.getValue();
        if (sVar != null && sVar.f121912d == 0) {
            C47479s a = C47479s.m148203a((long) this.f72409j.mo38862m());
            a.f121913e = this.f72410k.mo70457c();
            this.f72401b.setValue(a);
        }
        mo70599j();
        C47520y b = C47520y.m148316b();
        this.f72405f.setOverlayColor(this.f72411l);
        this.f72403d.setValue(b);
        m89924M();
    }

    /* renamed from: I */
    private void m89920I() {
        C10741a aVar = new C10741a(this.f72415p);
        aVar.mo25649a((int) R.string.atr).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo25650a((int) R.string.atq, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C27446w.this.f72423x = 1;
                C27446w.this.mo70559a();
                C27446w.this.mo70598i();
            }
        });
        aVar.mo25656a().mo25637a();
    }

    /* renamed from: O */
    private void m89926O() {
        this.f72422w = new ArrayList<>(this.f72396ac);
        if (this.f72419t != null) {
            this.f72394aa = this.f72419t.clone();
        }
        if (this.f72403d.getValue() != null) {
            this.f72395ab = ((C47520y) this.f72403d.getValue()).clone();
        }
    }

    /* renamed from: t */
    private void m89939t() {
        m89940u();
        this.f72372F = this.f72367A.mo70540g();
        m89941v();
        m89912A();
        m89944y();
        m89945z();
        m89942w();
        this.f72396ac = this.f72367A.mo70541h();
        m89943x();
    }

    /* renamed from: b */
    public final void mo70577b() {
        if (this.f72410k.mo70456b() && this.f72392Z) {
            if (!this.f72410k.mo70457c()) {
                this.f72402c.setValue(C47516v.m148298b(0));
            } else if (this.f72410k.mo70457c()) {
                this.f72402c.setValue(C47516v.m148298b(((long) this.f72409j.mo38860l()) - this.f72420u));
            }
            m89924M();
        }
    }

    /* renamed from: e */
    public final void mo70592e() {
        if (!(this.f72409j == null || this.f72389W == null)) {
            this.f72409j.mo38831c(this.f72389W);
        }
        if (this.f72386T.getAdapter() instanceof Adapter) {
            Adapter adapter = (Adapter) this.f72386T.getAdapter();
            if (adapter != null) {
                adapter.mo102330a();
            }
        }
        m89929R();
        if (this.f72416q != null) {
            this.f72416q.mo70392a();
        }
    }

    /* renamed from: k */
    public final void mo70600k() {
        this.f72425z.mo70337c().setValue(Boolean.valueOf(true));
        if (this.f72393a.isMultiVideoEdit() && (this.f72416q.f72127a instanceof TimeEffectTabFragment)) {
            mo70594f();
        }
    }

    /* renamed from: m */
    public final int mo70602m() {
        if (C39805en.m127445a()) {
            return (((C39805en.m127452e(this.f72418s) - mo70596g()) - mo70597h()) - C39805en.m127450c(this.f72418s)) - C39805en.m127451d(this.f72418s);
        }
        return (((View) this.f72390X.getParent()).getHeight() - mo70596g()) - mo70597h();
    }

    /* renamed from: G */
    private void m89918G() {
        if (this.f72371E == null) {
            if (this.f72393a.isFastImport) {
                this.f72371E = new C39787x(this.f72409j, this.f72393a.getPreviewInfo());
                C41530am.m132280a("generate reverse video ,using new api");
            } else if (this.f72393a.isMultiVideoEdit()) {
                this.f72371E = new C39775o(this.f72409j, this.f72393a.multiEditVideoRecordData.curMultiEditVideoRecordData);
            } else {
                this.f72371E = new C27390ar(this.f72409j);
                C41530am.m132280a("generate reverse video ,using old api");
            }
        }
    }

    /* renamed from: i */
    public final void mo70598i() {
        m89921J();
        if (this.f72423x == 1) {
            m89923L();
            this.f72367A.mo70547n().setValue(Boolean.valueOf(false));
            m89935e(false);
        } else if (this.f72423x == 2 && (this.f72419t == null || !this.f72419t.getKey().equals("1") || this.f72371E == null || this.f72371E.mo70483b())) {
            this.f72367A.mo70547n().setValue(Boolean.valueOf(true));
            m89935e(true);
            C42962b.f111525a.mo104670a(C35574k.m114861b(), "fx_confirm", "fx_page", 0, 0, m89928Q());
        }
    }

    /* renamed from: A */
    private void m89912A() {
        this.f72403d = this.f72367A.mo70546m();
        C47520y yVar = (C47520y) this.f72403d.getValue();
        if (yVar != null) {
            int i = 3;
            if (yVar.f121995a.equals("1")) {
                i = 1;
            } else if (yVar.f121995a.equals("2")) {
                m89930a(2, this.f72405f.getTvSelelct());
                this.f72405f.mo70429b((int) yVar.f121996b, 2);
                i = 2;
            } else if (yVar.f121995a.equals("3")) {
                m89930a(3, this.f72405f.getTvSelelct());
                this.f72405f.mo70429b((int) yVar.f121996b, 2);
            } else {
                return;
            }
            this.f72419t = new EffectPointModel();
            this.f72419t.setType(2);
            this.f72419t.setStartPoint((int) yVar.f121996b);
            this.f72419t.setEndPoint((int) yVar.f121996b);
            this.f72419t.setKey(((EffectModel) C27431j.m89898b().get(i)).key);
            this.f72419t.setName(((EffectModel) C27431j.m89898b().get(i)).name);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo70604o() {
        int frameHeight = this.f72386T.getFrameHeight();
        int frameWidth = this.f72386T.getFrameWidth();
        int ceil = (int) Math.ceil((double) (((float) (C9738o.m28691a((Context) this.f72418s) - (Math.round(C9738o.m28708b((Context) this.f72418s, 16.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
        if (this.f72393a.isMultiVideoEdit()) {
            ceil += 2;
        }
        this.f72386T.setCoverSize(ceil);
        this.f72387U = new VEVideoCoverGeneratorImpl(this.f72409j, this.f72418s, this.f72386T.getCoverSize());
        this.f72388V = new C41706n(this.f72387U, frameWidth, frameHeight, ceil);
        if (this.f72393a.isMvThemeVideoType()) {
            MvChooseCoverAdapter mvChooseCoverAdapter = new MvChooseCoverAdapter(frameWidth, frameHeight);
            this.f72386T.setAdapter(mvChooseCoverAdapter);
            new C40154a().mo99907b(this.f72398ae).mo99899a(this.f72397ad).mo99898a(frameWidth, frameHeight).mo99904a((Context) this.f72418s, this.f72409j, ceil, (C40161f) new C27379ag(mvChooseCoverAdapter));
            this.f72386T.setAdapter(mvChooseCoverAdapter);
        } else {
            this.f72386T.setAdapter(new Adapter(this.f72388V, frameWidth, frameHeight));
        }
        m89913B();
    }

    /* renamed from: B */
    private void m89913B() {
        if (this.f72409j == null) {
            StringBuilder sb = new StringBuilder("VEEffectHelper activity is finishing ");
            sb.append(this.f72418s.isFinishing());
            C42880h.m136156a(sb.toString());
            return;
        }
        int l = this.f72409j.mo38860l();
        this.f72408i = (CutMultiVideoViewModel) C0069x.m159a(this.f72418s).mo147a(CutMultiVideoViewModel.class);
        this.f72407h.setCanEdit(false);
        this.f72407h.setMinVideoLength(1000);
        this.f72407h.setMaxVideoLength((long) l);
        this.f72408i.f100404k = this.f72393a.isMvThemeVideoType();
        this.f72408i.f100405l = l;
        StringBuilder sb2 = new StringBuilder("initCutTimeView video duration is ");
        sb2.append(this.f72409j.mo38860l());
        C41530am.m132284c(sb2.toString());
        this.f72407h.setVeEditor(this.f72409j);
        this.f72407h.mo97631a(this.f72418s, this.f72408i, this.f72388V, this.f72393a.getMediaModelList());
        this.f72407h.setPointerScaleRatio(1.2f);
        this.f72407h.setPointerType(2);
        this.f72407h.getVideoEditViewModel().f101837b.observe(this.f72418s, new C27384al(this));
        this.f72407h.getVideoEditViewModel().f101840e.observe(this.f72418s, new C27385am(this));
        this.f72407h.getVideoEditViewModel().f101845j.observe(this.f72418s, new C27386an(this));
        this.f72407h.getVideoEditViewModel().f101843h.observe(this.f72418s, new C27387ao(this));
        this.f72407h.getVideoEditViewModel().f101844i.observe(this.f72418s, new C27466z(this));
        this.f72407h.getVideoEditViewModel().f101841f.observe(this.f72418s, new C27373aa(this));
        this.f72407h.getVideoEditViewModel().f101842g.observe(this.f72418s, new C27374ab(this));
        this.f72407h.getVideoEditViewModel().f101839d.observe(this.f72418s, new C27375ac(this));
    }

    /* renamed from: L */
    private void m89923L() {
        ArrayList<EffectPointModel> arrayList = this.f72396ac;
        if (!arrayList.equals(this.f72422w) && this.f72422w != null && arrayList.size() > this.f72422w.size()) {
            int[] iArr = new int[(arrayList.size() - this.f72422w.size())];
            for (int i = 0; i < iArr.length; i++) {
                iArr[i] = ((EffectPointModel) arrayList.get(this.f72422w.size() + i)).getIndex();
            }
            this.f72401b.setValue(C47479s.m148208a(iArr));
        }
        if (this.f72395ab != null) {
            this.f72403d.setValue(this.f72395ab.clone());
        } else {
            this.f72403d.setValue(C47520y.m148314a());
        }
        C47516v vVar = null;
        if (this.f72394aa != null) {
            this.f72419t = this.f72394aa.clone();
        } else {
            this.f72419t = null;
        }
        if ("time_effect".equals(this.f72421v)) {
            this.f72405f.mo70427a(true);
            if (this.f72395ab != null) {
                C47520y yVar = (C47520y) this.f72403d.getValue();
                if (yVar.f121995a.equals("1")) {
                    this.f72372F.setValue(Boolean.valueOf(true));
                    this.f72405f.mo70429b(0, 1);
                    this.f72405f.getSelelctLayout().setVisibility(8);
                    this.f72405f.setOverlayColor(this.f72411l);
                } else if (yVar.f121995a.equals("2")) {
                    this.f72405f.setOverlayColor(this.f72412m);
                    m89930a(2, this.f72405f.getTvSelelct());
                    this.f72405f.mo70429b((int) yVar.f121996b, 2);
                    this.f72405f.getSelelctLayout().setVisibility(0);
                    vVar = C47516v.m148298b(0);
                    this.f72405f.mo70428b(0);
                } else if (yVar.f121995a.equals("3")) {
                    this.f72405f.setOverlayColor(this.f72412m);
                    m89930a(3, this.f72405f.getTvSelelct());
                    this.f72405f.mo70429b((int) yVar.f121996b, 2);
                    this.f72405f.getSelelctLayout().setVisibility(0);
                    vVar = C47516v.m148298b(0);
                    this.f72405f.mo70428b(0);
                } else if (yVar.f121995a.equals("0")) {
                    this.f72405f.getSelelctLayout().setVisibility(8);
                    this.f72405f.setOverlayColor(this.f72412m);
                }
                if (vVar != null) {
                    this.f72402c.setValue(vVar);
                }
                return;
            }
            this.f72405f.mo70429b(0, 1);
            this.f72405f.setOverlayColor(this.f72412m);
            this.f72405f.getSelelctLayout().setVisibility(8);
            return;
        }
        this.f72405f.mo70427a(false);
        this.f72405f.getSelelctLayout().setVisibility(8);
    }

    /* renamed from: c */
    private void m89933c(boolean z) {
        int i;
        VideoEditView videoEditView = this.f72407h;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        videoEditView.setVisibility(i);
    }

    /* renamed from: d */
    private void m89934d(boolean z) {
        int i;
        VEEffectSeekLayout vEEffectSeekLayout = this.f72405f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        vEEffectSeekLayout.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo70581b(Boolean bool) {
        if (this.f72410k != null && bool != null) {
            this.f72410k.mo70455a(bool.booleanValue());
            this.f72420u = this.f72410k.mo70453a();
        }
    }

    /* renamed from: d */
    public final void mo70590d(int i) {
        this.f72425z.mo70338d().setValue(Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo70586c(int i) {
        this.f72391Y = i;
        this.f72405f.setVideoDuration(this.f72391Y);
        this.f72405f.mo70428b(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo70591d(Void voidR) {
        if (this.f72417r) {
            m89914C();
            this.f72402c.setValue(C47516v.m148296a((long) ((Long) this.f72407h.getPlayBoundary().f3154a).intValue()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo70595f(Void voidR) {
        if (this.f72417r) {
            m89914C();
            this.f72402c.setValue(C47516v.m148296a((long) ((Long) this.f72407h.getPlayBoundary().f3155b).intValue()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo70558a(C1592h hVar) throws Exception {
        if (!hVar.mo6882b() || !((Boolean) hVar.mo6890e()).booleanValue()) {
            this.f72372F.setValue(Boolean.valueOf(false));
        } else {
            this.f72372F.setValue(Boolean.valueOf(true));
            if (this.f72419t != null && this.f72419t.getKey().equals("1") && this.f72417r) {
                m89916E();
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo70582b(Void voidR) {
        if (this.f72417r) {
            m89914C();
            this.f72402c.setValue(C47516v.m148296a((long) ((Long) this.f72407h.getPlayBoundary().f3154a).intValue()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo70587c(View view) {
        C47479s sVar = (C47479s) this.f72401b.getValue();
        if (sVar == null || sVar.f121912d != 0) {
            this.f72406g.setCurrentItem(((Integer) view.getTag()).intValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo70593e(Void voidR) {
        if (this.f72417r) {
            C0902i playBoundary = this.f72407h.getPlayBoundary();
            this.f72402c.setValue(C47516v.m148298b((long) ((Long) playBoundary.f3154a).intValue()));
            m89931a((long) ((Long) playBoundary.f3154a).intValue(), (long) ((Long) playBoundary.f3155b).intValue());
        }
    }

    /* renamed from: a */
    public final void mo70560a(int i) {
        ArrayList effectPointModels = this.f72405f.getEffectPointModels();
        if (effectPointModels != null && !effectPointModels.isEmpty()) {
            VEState h = this.f72409j.mo38850h();
            this.f72405f.mo70423a(i);
            if (effectPointModels.isEmpty()) {
                this.f72402c.setValue(C47516v.m148298b(0));
                this.f72405f.mo70428b((int) this.f72410k.mo70454a(0));
            } else {
                int endPoint = ((EffectPointModel) effectPointModels.get(effectPointModels.size() - 1)).getEndPoint();
                this.f72405f.mo70428b(endPoint);
                if (this.f72410k.mo70457c()) {
                    endPoint = this.f72409j.mo38860l() - endPoint;
                }
                this.f72402c.setValue(C47516v.m148298b((long) endPoint));
            }
            if (h == VEState.STARTED) {
                mo70599j();
            }
        }
    }

    /* renamed from: b */
    public final void mo70580b(View view) {
        C47479s sVar = (C47479s) this.f72401b.getValue();
        if (sVar == null || sVar.f121912d != 0) {
            int id = view.getId();
            if (id == R.id.bb4) {
                if (this.f72409j != null) {
                    int a = (int) this.f72410k.mo70453a();
                    if ((this.f72410k.mo70457c() || a < this.f72409j.mo38860l()) && (!this.f72410k.mo70457c() || a > 0)) {
                        this.f72420u = (long) a;
                        if (this.f72410k.mo70457c()) {
                            this.f72402c.setValue(C47516v.m148298b(((long) this.f72409j.mo38860l()) - this.f72420u));
                        } else {
                            this.f72402c.setValue(C47516v.m148298b(this.f72420u));
                        }
                    } else {
                        this.f72402c.setValue(C47516v.m148298b(0));
                        this.f72420u = this.f72410k.mo70454a(0);
                    }
                    m89924M();
                }
            } else if (id == R.id.dr7) {
                if (!this.f72396ac.equals(this.f72422w) || (this.f72403d.getValue() != null && ((!C47520y.m148314a().equals(this.f72403d.getValue()) || this.f72395ab != null) && !((C47520y) this.f72403d.getValue()).equals(this.f72395ab)))) {
                    m89920I();
                    return;
                }
                this.f72423x = 1;
                mo70559a();
                mo70598i();
            } else if (id == R.id.e15) {
                this.f72423x = 2;
                mo70559a();
                mo70598i();
                m89926O();
                C42962b.f111525a.mo104670a(C35574k.m114861b(), "fx_confirm", "fx_page", 0, 0, m89928Q());
            } else {
                if (id == R.id.ec1) {
                    mo70599j();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo70588c(Void voidR) {
        if (this.f72417r) {
            C0902i playBoundary = this.f72407h.getPlayBoundary();
            this.f72402c.setValue(C47516v.m148298b((long) ((Long) playBoundary.f3154a).intValue()));
            m89931a((long) ((Long) playBoundary.f3154a).intValue(), (long) ((Long) playBoundary.f3155b).intValue());
        }
    }

    /* renamed from: e */
    private void m89935e(boolean z) {
        if (z) {
            this.f72393a.mEffectList = new ArrayList<>(this.f72367A.mo70541h());
            this.f72393a.mTimeEffect = this.f72419t;
            if (!(this.f72393a.mTimeEffect == null || !this.f72393a.mTimeEffect.getKey().equals("1") || this.f72367A.mo70538e().getValue() == null)) {
                this.f72393a.getPreviewInfo().updateReverseVideoContent(this.f72371E.mo70484c(), this.f72371E.mo70486e(), this.f72371E.mo70485d());
            }
            if (this.f72393a.mTimeEffect != null) {
                this.f72393a.mEffectList.add(this.f72393a.mTimeEffect);
            }
            C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f72393a.creationId).mo59973a("shoot_way", this.f72393a.mShootWay).mo59970a("draft_id", this.f72393a.draftId);
            if (this.f72393a.mEffectList != null) {
                StringBuilder sb = new StringBuilder();
                Iterator it = this.f72393a.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel effectPointModel = (EffectPointModel) it.next();
                    if (!TextUtils.isEmpty(effectPointModel.getName())) {
                        sb.append(effectPointModel.getName());
                        sb.append(",");
                    }
                }
                if (sb.length() > 0) {
                    a.mo59973a("effect_name", sb.substring(0, sb.length() - 1));
                }
            }
            C6907h.m21524a("effect_confirm", (Map) a.f60753a);
            return;
        }
        this.f72393a.mEffectList = new ArrayList<>(this.f72367A.mo70541h());
        this.f72393a.mTimeEffect = this.f72419t;
        if (this.f72393a.mTimeEffect != null) {
            this.f72393a.mEffectList.add(this.f72393a.mTimeEffect);
        }
    }

    /* renamed from: b */
    public final void mo70578b(int i) {
        long j;
        C47520y yVar = (C47520y) this.f72403d.getValue();
        if (yVar == null || yVar.f121995a.equals("0") || yVar.f121995a.equals("1")) {
            j = (long) (this.f72409j.mo38860l() / 2);
        } else {
            j = yVar.f121996b;
        }
        C47516v vVar = null;
        C42962b.f111525a.mo104671a("effect_click", C38511bc.m123103a().mo96485a("creation_id", this.f72393a.creationId).mo96483a("scene_id", 1003).mo96485a("shoot_way", this.f72393a.mShootWay).mo96483a("draft_id", this.f72393a.draftId).mo96485a("tab_name", "time_effect").mo96485a("effect_name", ((EffectModel) C27431j.m89898b().get(i)).name).f100112a);
        if (i == 0) {
            yVar = C47520y.m148314a();
            this.f72405f.getSelelctLayout().setVisibility(8);
            this.f72405f.setOverlayColor(this.f72412m);
        } else if (i == 1) {
            if (this.f72371E.mo70483b()) {
                yVar = C47520y.m148316b();
                this.f72405f.setOverlayColor(this.f72411l);
            }
            this.f72405f.getSelelctLayout().setVisibility(8);
        } else if (i == 2) {
            yVar = C47520y.m148315a(j);
            this.f72405f.setOverlayColor(this.f72412m);
            m89930a(2, this.f72405f.getTvSelelct());
            this.f72405f.getSelelctLayout().setVisibility(0);
            this.f72405f.mo70429b((int) j, 2);
            vVar = C47516v.m148298b(0);
            this.f72405f.mo70428b(0);
        } else if (i == 3) {
            yVar = C47520y.m148317b(j);
            this.f72405f.setOverlayColor(this.f72412m);
            m89930a(3, this.f72405f.getTvSelelct());
            this.f72405f.getSelelctLayout().setVisibility(0);
            this.f72405f.mo70429b((int) j, 2);
            vVar = C47516v.m148298b(0);
            this.f72405f.mo70428b(0);
        }
        this.f72419t = new EffectPointModel();
        if (i != 0) {
            this.f72419t.setType(2);
            int i2 = (int) j;
            this.f72419t.setStartPoint(i2);
            this.f72419t.setEndPoint(i2);
            this.f72419t.setKey(((EffectModel) C27431j.m89898b().get(i)).key);
            this.f72419t.setName(((EffectModel) C27431j.m89898b().get(i)).name);
        }
        if (vVar != null) {
            this.f72402c.setValue(vVar);
        }
        if (yVar != null) {
            this.f72403d.setValue(yVar);
            m89924M();
        }
    }

    /* renamed from: b */
    public final void mo70583b(List<EffectCategoryResponse> list) {
        if (!C6292i.m19525a(list)) {
            this.f72385S.mo101344b();
            this.f72385S.setMaxTabModeForCount(list.size());
            for (int i = 0; i < list.size(); i++) {
                AVDmtTabItemView a = C42107a.m134028a(this.f72418s);
                a.setText(((EffectCategoryResponse) list.get(i)).name);
                a.mo103522a(i, list.size());
                a.setTag(Integer.valueOf(i));
                a.setOnClickListener(new C27377ae(this));
                this.f72385S.mo101336a(this.f72385S.mo101329a().mo101401a((View) a));
            }
        }
    }

    /* renamed from: a */
    public final void mo70564a(View view) {
        this.f72390X = view;
        this.f72405f = (VEEffectSeekLayout) this.f72390X.findViewById(R.id.ad0);
        this.f72374H = (LinearLayout) this.f72390X.findViewById(R.id.d23);
        this.f72375I = (FrameLayout) this.f72390X.findViewById(R.id.a2i);
        this.f72376J = (ImageView) this.f72390X.findViewById(R.id.bb4);
        this.f72377K = (RelativeLayout) this.f72390X.findViewById(R.id.cuh);
        this.f72378L = (TextView) this.f72390X.findViewById(R.id.dtx);
        this.f72379M = (RelativeLayout) this.f72390X.findViewById(R.id.acz);
        this.f72380N = (RelativeLayout) this.f72390X.findViewById(R.id.ec1);
        this.f72381O = (LinearLayout) this.f72390X.findViewById(R.id.btf);
        this.f72382P = (DmtStatusView) this.f72390X.findViewById(R.id.bu0);
        this.f72383Q = (TextView) this.f72390X.findViewById(R.id.e15);
        this.f72384R = (TextView) this.f72390X.findViewById(R.id.dr7);
        this.f72406g = (NoScrollViewPager) this.f72390X.findViewById(R.id.edp);
        this.f72385S = (AVDmtTabLayout) this.f72390X.findViewById(R.id.dfo);
        this.f72386T = (ChooseVideoCoverView) this.f72390X.findViewById(R.id.vx);
        this.f72407h = (VideoEditView) this.f72390X.findViewById(R.id.eak);
        this.f72390X.setOnTouchListener(C27465y.f72447a);
        C274471 r5 = new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                C27446w.this.mo70580b(view);
            }
        };
        this.f72376J.setOnClickListener(r5);
        this.f72380N.setOnClickListener(r5);
        this.f72384R.setOnClickListener(r5);
        this.f72383Q.setOnClickListener(r5);
        this.f72411l = C0683b.m2912c(this.f72418s, R.color.aaw);
        TypedArray obtainStyledAttributes = this.f72418s.obtainStyledAttributes(R$styleable.LineStickerLayer1);
        this.f72412m = 0;
        obtainStyledAttributes.recycle();
        this.f72405f.setVideoDuration(this.f72391Y);
        this.f72405f.mo70428b(0);
        this.f72405f.setNormalColor(0);
        this.f72405f.setOverlayColor(this.f72411l);
        this.f72415p = this.f72390X.getContext();
        if (this.f72382P != null) {
            this.f72382P.setBuilder(C10803a.m31631a(this.f72415p).mo25965c(1));
        }
        this.f72416q = new EffectTabPagerAdapter(this.f72418s.getSupportFragmentManager(), this.f72418s);
        this.f72416q.f72130d = this.f72393a.isMvThemeVideoType();
        this.f72406g.setOffscreenPageLimit(1);
        this.f72406g.setNoScroll(true);
        this.f72385S.mo103530f();
        this.f72385S.setDefaultAddTab(false);
        this.f72385S.setupWithViewPager(this.f72406g);
        m89936q();
        C27431j.m89894a();
        mo70584b(true);
        m89917F();
        m89918G();
        this.f72376J.setVisibility(0);
        m89915D();
        this.f72392Z = false;
        m89937r();
        m89938s();
        m89939t();
        mo70599j();
    }

    /* renamed from: b */
    public final void mo70584b(boolean z) {
        if (z) {
            this.f72381O.setVisibility(0);
            this.f72374H.setVisibility(8);
            if (this.f72382P != null) {
                this.f72382P.mo25942f();
            }
        } else {
            if (this.f72382P != null) {
                this.f72382P.mo25939d();
            }
            this.f72381O.setVisibility(8);
            this.f72374H.setVisibility(0);
        }
    }

    /* renamed from: a */
    private static void m89930a(int i, ImageView imageView) {
        C27443t.m89911a(i, imageView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo70579b(int i, int i2) {
        this.f72407h.mo97630a(i, i2, 0);
    }

    /* renamed from: a */
    private void m89931a(long j, long j2) {
        m89914C();
        C47479s a = C47479s.m148204a(j, j2);
        a.f121913e = this.f72410k.mo70457c();
        this.f72401b.setValue(a);
        m89924M();
    }

    /* renamed from: a */
    public final void mo70561a(int i, int i2) {
        if (i >= 0 && i2 >= 0 && !this.f72407h.mo97630a(i, i2, 0)) {
            this.f72424y.postDelayed(new C27378af(this, i, i2), 300);
        }
        this.f72402c.setValue(C47516v.m148298b(0));
    }

    /* renamed from: a */
    public final void mo70562a(int i, EffectModel effectModel) {
        if (i != 0) {
            if (i == 1) {
                C47479s sVar = (C47479s) this.f72401b.getValue();
                if (sVar != null && sVar.f121912d == 0) {
                    mo70599j();
                    C47479s a = C47479s.m148203a((long) this.f72409j.mo38862m());
                    a.f121913e = this.f72410k.mo70457c();
                    this.f72401b.setValue(a);
                }
            }
        } else if (this.f72409j == null) {
            C42880h.m136156a("VEEffectHelper selectFilterEffect mVEEditor is null");
        } else if (!this.f72410k.mo70456b()) {
            C47479s a2 = C47479s.m148205a(effectModel.resDir, (long) this.f72409j.mo38862m());
            a2.f121914f = effectModel.color;
            a2.f121916h = effectModel.key;
            a2.f121917i = effectModel.name;
            a2.f121913e = this.f72410k.mo70457c();
            a2.f121919k = effectModel.category;
            a2.f121920l = effectModel.extra;
            this.f72401b.setValue(a2);
            m89924M();
            C42962b.f111525a.mo104671a("effect_click", C38511bc.m123103a().mo96485a("creation_id", this.f72393a.creationId).mo96483a("scene_id", 1003).mo96485a("shoot_way", this.f72393a.mShootWay).mo96483a("draft_id", this.f72393a.draftId).mo96485a("tab_name", this.f72421v).mo96485a("effect_name", effectModel.name).mo96485a("effect_id", effectModel.key).f100112a);
        }
    }

    /* renamed from: a */
    public final void mo70563a(FragmentActivity fragmentActivity, C0043i iVar) {
        this.f72418s = fragmentActivity;
        this.f72373G = iVar;
        if (this.f72418s instanceof C23258e) {
            this.f72399af = (C23258e) this.f72418s;
        } else {
            this.f72399af = null;
        }
        this.f72424y = new SafeHandler(this.f72418s);
        this.f72404e = new SafeHandler(iVar);
        this.f72393a = this.f72367A.mo70535b();
        this.f72398ae = this.f72367A.mo70536c();
        this.f72397ad = this.f72367A.mo70537d();
        this.f72409j = (C15389d) this.f72367A.mo70538e().getValue();
        if (this.f72409j != null) {
            this.f72391Y = this.f72409j.mo38860l();
        }
    }
}
