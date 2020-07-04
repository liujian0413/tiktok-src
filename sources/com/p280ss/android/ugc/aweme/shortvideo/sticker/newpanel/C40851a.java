package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView.C1278j;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1282n;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewPropertyAnimator;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40913s;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a */
public final class C40851a extends C40882e {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f106252a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C40851a.class), "mStickerFetcher", "getMStickerFetcher()Lcom/ss/android/ugc/aweme/shortvideo/sticker/newpanel/NewPanelStickerFetchController;"))};

    /* renamed from: b */
    public final C0043i f106253b;

    /* renamed from: c */
    public final AppCompatActivity f106254c;

    /* renamed from: d */
    public final ShortVideoContext f106255d;

    /* renamed from: e */
    public final EffectStickerManager f106256e;

    /* renamed from: f */
    private final C7541d f106257f = C7546e.m23569a(new C40855d(this));

    /* renamed from: g */
    private NewPanelBusiStickerShowLogger f106258g;

    /* renamed from: q */
    private C40885h f106259q;

    /* renamed from: r */
    private final AVDmtTabLayout f106260r;

    /* renamed from: s */
    private final DmtStatusView f106261s;

    /* renamed from: t */
    private final View f106262t;

    /* renamed from: u */
    private final C1282n f106263u;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$a */
    static final class C40852a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106264a;

        C40852a(C40851a aVar) {
            this.f106264a = aVar;
            super(0);
        }

        /* renamed from: a */
        private void m130583a() {
            this.f106264a.mo101149a(STATUS.LOADING);
        }

        public final /* synthetic */ Object invoke() {
            m130583a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$b */
    static final class C40853b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106265a;

        /* renamed from: b */
        final /* synthetic */ C7562b f106266b;

        /* renamed from: c */
        final /* synthetic */ String f106267c;

        C40853b(C40851a aVar, C7562b bVar, String str) {
            this.f106265a = aVar;
            this.f106266b = bVar;
            this.f106267c = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m130584a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m130584a() {
            C7562b bVar = this.f106266b;
            if (bVar != null) {
                bVar.invoke(this.f106267c);
            }
            this.f106265a.mo101149a(STATUS.SUCCESS);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$c */
    static final class C40854c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106268a;

        C40854c(C40851a aVar) {
            this.f106268a = aVar;
            super(0);
        }

        /* renamed from: a */
        private void m130585a() {
            this.f106268a.mo101149a(STATUS.ERROR);
        }

        public final /* synthetic */ Object invoke() {
            m130585a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$d */
    static final class C40855d extends Lambda implements C7561a<NewPanelStickerFetchController> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106269a;

        C40855d(C40851a aVar) {
            this.f106269a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NewPanelStickerFetchController invoke() {
            return new NewPanelStickerFetchController(this.f106269a.f106253b, this.f106269a.f106254c, this.f106269a.f106256e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$e */
    static final class C40856e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106270a;

        /* renamed from: b */
        final /* synthetic */ Effect f106271b;

        C40856e(C40851a aVar, Effect effect) {
            this.f106270a = aVar;
            this.f106271b = effect;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<C0902i<Integer, String>> call() {
            NewPanelStickerAdapter newPanelStickerAdapter = this.f106270a.f106321n;
            if (newPanelStickerAdapter != null) {
                List a = newPanelStickerAdapter.mo101103a(this.f106271b);
                if (a != null) {
                    Iterable iterable = a;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (true) {
                        int i = -1;
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        NewPanelStickerAdapter newPanelStickerAdapter2 = this.f106270a.f106321n;
                        if (newPanelStickerAdapter2 != null) {
                            i = newPanelStickerAdapter2.mo101102a(str, this.f106271b);
                        }
                        arrayList.add(new C0902i(Integer.valueOf(i), str));
                    }
                    Iterable iterable2 = (List) arrayList;
                    Collection arrayList2 = new ArrayList();
                    for (Object next : iterable2) {
                        Integer num = (Integer) ((C0902i) next).f3154a;
                        if (num == null) {
                            num = Integer.valueOf(-1);
                        }
                        boolean z = false;
                        if (C7573i.m23576a(num.intValue(), 0) >= 0) {
                            z = true;
                        }
                        if (z) {
                            arrayList2.add(next);
                        }
                    }
                    return (List) arrayList2;
                }
            }
            return C7525m.m23461a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$f */
    static final class C40857f<TTaskResult, TContinuationResult> implements C1591g<List<? extends C0902i<Integer, String>>, Void> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106272a;

        /* renamed from: b */
        final /* synthetic */ Effect f106273b;

        C40857f(C40851a aVar, Effect effect) {
            this.f106272a = aVar;
            this.f106273b = effect;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<List<C0902i<Integer, String>>> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6882b()) {
                return null;
            }
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "task.result");
            for (C0902i iVar : (Iterable) e) {
                Integer num = (Integer) iVar.f3154a;
                if (num == null) {
                    num = Integer.valueOf(-1);
                }
                C7573i.m23582a((Object) num, "pair.first ?: -1");
                int intValue = num.intValue();
                String str = (String) iVar.f3155b;
                if (str == null) {
                    str = "";
                }
                C7573i.m23582a((Object) str, "pair.second ?: \"\"");
                NewPanelStickerAdapter newPanelStickerAdapter = this.f106272a.f106321n;
                if (newPanelStickerAdapter != null) {
                    newPanelStickerAdapter.notifyItemChanged(intValue, StickerWrapper.m129064a(this.f106273b, str, (C27481e) this.f106272a.f106256e.f104787e));
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$g */
    public static final class C40858g implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C40851a f106274a;

        C40858g(C40851a aVar) {
            this.f106274a = aVar;
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f106274a.mo101154k();
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f106274a.f106319l) {
                this.f106274a.mo101152i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$h */
    public static final class C40859h implements C0053p<C0902i<Effect, Effect>> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106275a;

        C40859h(C40851a aVar) {
            this.f106275a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C0902i<Effect, Effect> iVar) {
            if (iVar != null) {
                Effect effect = (Effect) iVar.f3154a;
                Effect effect2 = (Effect) iVar.f3155b;
                this.f106275a.mo101121a(effect);
                this.f106275a.mo101121a(effect2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$i */
    static final class C40860i<T> implements C0053p<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106276a;

        C40860i(C40851a aVar) {
            this.f106276a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<String> list) {
            C0063u a = C0069x.m159a((FragmentActivity) this.f106276a.f106254c).mo147a(EffectStickerViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders\n     …kerViewModel::class.java)");
            ((EffectStickerViewModel) a).mo101285a().mo101192a(list);
            if (list != null && (!list.isEmpty())) {
                C40426a.m129277a(list);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$j */
    static final class C40861j<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ LinkedHashMap f106277a;

        C40861j(LinkedHashMap linkedHashMap) {
            this.f106277a = linkedHashMap;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<StickerWrapper> call() {
            return StickerWrapper.m129067a(this.f106277a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$k */
    static final class C40862k<TTaskResult, TContinuationResult> implements C1591g<List<? extends StickerWrapper>, Void> {

        /* renamed from: a */
        final /* synthetic */ C40851a f106278a;

        C40862k(C40851a aVar) {
            this.f106278a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<List<StickerWrapper>> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6882b()) {
                return null;
            }
            NewPanelStickerAdapter newPanelStickerAdapter = this.f106278a.f106321n;
            if (newPanelStickerAdapter != null) {
                newPanelStickerAdapter.mo58045a((List) hVar.mo6890e());
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.a$l */
    static final class C40863l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AVDmtPanelRecyleView f106279a;

        /* renamed from: b */
        final /* synthetic */ float f106280b;

        /* renamed from: c */
        final /* synthetic */ float f106281c;

        /* renamed from: d */
        final /* synthetic */ long f106282d;

        /* renamed from: e */
        final /* synthetic */ boolean f106283e;

        C40863l(AVDmtPanelRecyleView aVDmtPanelRecyleView, float f, float f2, long j, boolean z) {
            this.f106279a = aVDmtPanelRecyleView;
            this.f106280b = f;
            this.f106281c = f2;
            this.f106282d = j;
            this.f106283e = z;
        }

        public final void run() {
            int i;
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106279a;
            if (this.f106283e) {
                i = 0;
            } else {
                i = 8;
            }
            aVDmtPanelRecyleView.setVisibility(i);
        }
    }

    /* renamed from: l */
    private final NewPanelStickerFetchController m130566l() {
        return (NewPanelStickerFetchController) this.f106257f.getValue();
    }

    /* renamed from: n */
    private final void m130568n() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.mo5528a((C1281m) new CategoryScrollerEffectStickerModule$addSyncTabListener$1(this));
        }
    }

    /* renamed from: g */
    public final void mo101131g() {
        super.mo101131g();
        NewPanelBusiStickerShowLogger newPanelBusiStickerShowLogger = this.f106258g;
        if (newPanelBusiStickerShowLogger != null) {
            newPanelBusiStickerShowLogger.mo101099b();
        }
    }

    /* renamed from: m */
    private final void m130567m() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            NewPanelStickerAdapter newPanelStickerAdapter = this.f106321n;
            if (newPanelStickerAdapter != null) {
                this.f106258g = new NewPanelBusiStickerShowLogger(this, aVDmtPanelRecyleView, newPanelStickerAdapter);
                NewPanelBusiStickerShowLogger newPanelBusiStickerShowLogger = this.f106258g;
                if (newPanelBusiStickerShowLogger != null) {
                    newPanelBusiStickerShowLogger.mo101098a();
                }
            }
        }
    }

    /* renamed from: p */
    private final C0052o<List<String>> m130570p() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f106254c).mo147a(EffectStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…kerViewModel::class.java)");
        C0052o<List<String>> b = ((EffectStickerViewModel) a).mo101289b();
        C7573i.m23582a((Object) b, "ViewModelProviders.of(mA…el::class.java).urlPrefix");
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo101129e() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(8);
        }
        DmtStatusView dmtStatusView = this.f106261s;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(0);
        }
        DmtStatusView dmtStatusView2 = this.f106261s;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo25942f();
        }
    }

    /* renamed from: f */
    public final void mo101130f() {
        super.mo101130f();
        if (this.f106317j && this.f106261s != null && STATUS.LOADING == this.f106316i) {
            this.f106261s.mo25939d();
            this.f106261s.mo25942f();
        }
    }

    /* renamed from: o */
    private final boolean m130569o() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f106254c).mo147a(EffectStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…kerViewModel::class.java)");
        C40913s a2 = ((EffectStickerViewModel) a).mo101285a();
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(mA…    .recordStickerContext");
        if (!a2.mo101196e()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo101126b() {
        C40885h hVar = this.f106259q;
        if (hVar != null) {
            return hVar.f106329a;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo101128d() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(8);
        }
        DmtStatusView dmtStatusView = this.f106261s;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(0);
        }
        DmtStatusView dmtStatusView2 = this.f106261s;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo25934a(false);
        }
        View view = this.f106262t;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r0 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0085, code lost:
        if (r1 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a6, code lost:
        if (r0 == null) goto L_0x00a8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101120a() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r0 = r7.f106321n
            android.support.v7.widget.LinearLayoutManager r1 = r7.f106322o
            int r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d.m130623a(r0, r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView r1 = r7.f106320m
            android.view.View r1 = (android.view.View) r1
            boolean r1 = m130562b(r1)
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L_0x0038
            android.support.v7.widget.LinearLayoutManager r0 = r7.f106322o
            if (r0 == 0) goto L_0x001c
            int r2 = r0.mo5445j()
        L_0x001c:
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r0 = r7.f106321n
            if (r0 == 0) goto L_0x0032
            java.util.List r0 = r0.mo62312a()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r0
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.f104909b
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            r7.m130564c(r0)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView r4 = r7.f106320m
            if (r4 == 0) goto L_0x0041
            android.support.v7.widget.RecyclerView$v r4 = r4.mo5575f(r0)
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            r5 = 2
            int[] r6 = new int[r5]
            if (r4 == 0) goto L_0x004e
            android.view.View r4 = r4.itemView
            if (r4 == 0) goto L_0x004e
            r4.getLocationOnScreen(r6)
        L_0x004e:
            r2 = r6[r2]
            android.support.v7.app.AppCompatActivity r4 = r7.f106254c
            android.content.Context r4 = (android.content.Context) r4
            int r4 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127447b(r4)
            if (r1 == 0) goto L_0x005c
            int r2 = r4 - r2
        L_0x005c:
            int r4 = r4 / r5
            if (r2 >= r4) goto L_0x008c
            int r1 = r0 + 1
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r5 = r7.f106321n
            if (r5 == 0) goto L_0x006f
            java.util.List r5 = r5.mo62312a()
            if (r5 == 0) goto L_0x006f
            int r3 = r5.size()
        L_0x006f:
            if (r1 >= r3) goto L_0x008c
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r3 = r7.f106321n
            if (r3 == 0) goto L_0x0087
            java.util.List r3 = r3.mo62312a()
            if (r3 == 0) goto L_0x0087
            java.lang.Object r1 = r3.get(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r1 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r1
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = r1.f104909b
            if (r1 != 0) goto L_0x0089
        L_0x0087:
            java.lang.String r1 = ""
        L_0x0089:
            r7.m130564c(r1)
        L_0x008c:
            if (r2 <= r4) goto L_0x00ad
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x00ad
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r1 = r7.f106321n
            if (r1 == 0) goto L_0x00a8
            java.util.List r1 = r1.mo62312a()
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r0
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r0.f104909b
            if (r0 != 0) goto L_0x00aa
        L_0x00a8:
            java.lang.String r0 = ""
        L_0x00aa:
            r7.m130564c(r0)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40851a.mo101120a():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo101127c() {
        boolean z;
        LinkedHashMap a = this.f106256e.mo100209a();
        C7573i.m23582a((Object) a, "mEffectStickerManager.newPanelEffectMap");
        DmtStatusView dmtStatusView = this.f106261s;
        if (dmtStatusView != null) {
            dmtStatusView.mo25950n();
        }
        Map map = a;
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DmtStatusView dmtStatusView2 = this.f106261s;
            if (dmtStatusView2 != null) {
                dmtStatusView2.setVisibility(0);
            }
            DmtStatusView dmtStatusView3 = this.f106261s;
            if (dmtStatusView3 != null) {
                dmtStatusView3.mo25943g();
            }
            View view = this.f106262t;
            if (view != null) {
                view.setVisibility(8);
            }
            return;
        }
        DmtStatusView dmtStatusView4 = this.f106261s;
        if (dmtStatusView4 != null) {
            dmtStatusView4.mo25939d();
        }
        DmtStatusView dmtStatusView5 = this.f106261s;
        if (dmtStatusView5 != null) {
            dmtStatusView5.setVisibility(8);
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(0);
        }
        View view2 = this.f106262t;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        C1592h.m7853a((Callable<TResult>) new C40861j<TResult>(a)).mo6876a((C1591g<TResult, TContinuationResult>) new C40862k<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: b */
    private final void m130561b(int i) {
        C40885h hVar = this.f106259q;
        if (hVar != null) {
            hVar.mo101159a(i);
        }
    }

    /* renamed from: b */
    private static boolean m130562b(View view) {
        if (view != null && 1 == C0991u.m4220h(view)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo101121a(Effect effect) {
        C1592h.m7853a((Callable<TResult>) new C40856e<TResult>(this, effect)).mo6876a((C1591g<TResult, TContinuationResult>) new C40857f<TResult,TContinuationResult>(this, effect), C1592h.f5958b);
    }

    /* renamed from: c */
    private final void m130564c(String str) {
        int d = m130565d(str);
        int tabCount = this.f106260r.getTabCount();
        if (d >= 0 && tabCount >= d) {
            C41011f a = this.f106260r.mo101330a(d);
            if (a != null) {
                a.mo101403a();
            }
            this.f106315h = d;
            mo101150b(mo101153j());
        }
    }

    /* renamed from: d */
    private final int m130565d(String str) {
        List<EffectCategoryModel> d = this.f106256e.mo100231d();
        C7573i.m23582a((Object) d, "mEffectStickerManager.newPanelEffectCategory");
        int i = 0;
        for (EffectCategoryModel effectCategoryModel : d) {
            C7573i.m23582a((Object) effectCategoryModel, "it");
            if (C7573i.m23585a((Object) effectCategoryModel.key, (Object) str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo101122a(String str) {
        C7573i.m23587b(str, "categoryKey");
        int d = m130565d(str);
        int c = m130563c(d);
        if (c >= 0) {
            this.f106260r.setHideIndicatorView(false);
            C41011f a = this.f106260r.mo101330a(d);
            if (a != null) {
                a.mo101403a();
            }
            m130561b(c);
            this.f106315h = d;
            mo101150b(mo101153j());
        }
    }

    /* renamed from: a */
    private final void m130560a(View view) {
        NewPanelStickerAdapter newPanelStickerAdapter = new NewPanelStickerAdapter(this.f106256e);
        newPanelStickerAdapter.f106195a = m130569o();
        newPanelStickerAdapter.mo66516d(false);
        this.f106321n = newPanelStickerAdapter;
        this.f106322o = new StickerCenterLayoutManager(this.f106254c, 0, false);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) view.findViewById(R.id.bk0);
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setAdapter(this.f106321n);
            aVDmtPanelRecyleView.setLayoutManager(this.f106322o);
            aVDmtPanelRecyleView.setItemViewCacheSize(5);
            aVDmtPanelRecyleView.setRecycledViewPool(this.f106263u);
            Context applicationContext = this.f106254c.getApplicationContext();
            C7573i.m23582a((Object) applicationContext, "mActivity.applicationContext");
            this.f106259q = new C40885h(applicationContext, aVDmtPanelRecyleView, 112);
        } else {
            aVDmtPanelRecyleView = null;
        }
        this.f106320m = aVDmtPanelRecyleView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0037 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m130563c(int r11) {
        /*
            r10 = this;
            r0 = -1
            if (r11 == r0) goto L_0x0063
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r10.f106256e
            java.util.List r0 = r0.mo100231d()
            int r0 = r0.size()
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r1 = r10.f106256e
            java.util.List r1 = r1.mo100231d()
            java.lang.String r2 = "mEffectStickerManager.newPanelEffectCategory"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0021:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0062
            java.lang.Object r5 = r1.next()
            int r6 = r3 + 1
            if (r3 >= 0) goto L_0x0032
            kotlin.collections.C7525m.m23465b()
        L_0x0032:
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r5 = (com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r5
            r7 = 1
            if (r7 <= r3) goto L_0x0039
        L_0x0037:
            r3 = r6
            goto L_0x0021
        L_0x0039:
            if (r11 <= r3) goto L_0x0037
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r8 = r10.f106256e
            java.util.LinkedHashMap r8 = r8.mo100209a()
            java.lang.String r9 = "response"
            kotlin.jvm.internal.C7573i.m23582a(r5, r9)
            java.lang.String r5 = r5.key
            java.lang.Object r5 = r8.get(r5)
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r5 = (com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel) r5
            if (r5 == 0) goto L_0x0059
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r5 = r5.effects
            if (r5 == 0) goto L_0x0059
            int r5 = r5.size()
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            int r4 = r4 + r5
            int r5 = r0 + -1
            if (r3 == r5) goto L_0x0037
            int r4 = r4 + 1
            goto L_0x0037
        L_0x0062:
            return r4
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40851a.m130563c(int):int");
    }

    /* renamed from: a */
    public final void mo101123a(String str, View view) {
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(view, "root");
        m130560a(view);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.mo5528a((C1281m) new CategoryScrollerEffectStickerModule$onCreate$1(this));
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f106320m;
        if (aVDmtPanelRecyleView2 != null) {
            aVDmtPanelRecyleView2.addOnAttachStateChangeListener(new C40858g(this));
        }
        this.f106323p = new CategoryScrollerEffectStickerModule$onCreate$3(this);
        C1278j jVar = this.f106323p;
        if (jVar != null) {
            AVDmtPanelRecyleView aVDmtPanelRecyleView3 = this.f106320m;
            if (aVDmtPanelRecyleView3 != null) {
                aVDmtPanelRecyleView3.mo5526a(jVar);
            }
        }
        C0063u a = C0069x.m159a((FragmentActivity) this.f106254c).mo147a(CurParentStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…kerViewModel::class.java)");
        ((CurParentStickerViewModel) a).mo101270a().observe(this.f106253b, new C40859h(this));
        m130570p().observe(this.f106254c, new C40860i(this));
        this.f106319l = true;
        m130568n();
        mo101150b(mo101153j());
        m130567m();
    }

    /* renamed from: a */
    public final void mo101124a(String str, C7562b<? super String, ? extends Object> bVar) {
        C7573i.m23587b(str, "panel");
        mo101149a(STATUS.LOADING);
        LinkedHashMap a = this.f106256e.mo100209a();
        C7573i.m23582a((Object) a, "mEffectStickerManager.newPanelEffectMap");
        if (!a.isEmpty()) {
            if (bVar != null) {
                bVar.invoke(str);
            }
            mo101149a(STATUS.SUCCESS);
            return;
        }
        m130566l().f106209a = new C40852a(this);
        m130566l().f106210b = new C40853b(this, bVar, str);
        m130566l().f106211c = new C40854c(this);
        m130566l().mo101108a();
    }

    /* renamed from: a */
    public final void mo101125a(boolean z, long j) {
        float f;
        float f2;
        if (this.f106317j != z) {
            this.f106317j = z;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
            if (aVDmtPanelRecyleView != null) {
                aVDmtPanelRecyleView.setAlpha(f);
                aVDmtPanelRecyleView.setVisibility(0);
                ViewPropertyAnimator duration = aVDmtPanelRecyleView.animate().alpha(f2).setDuration(250);
                C40863l lVar = new C40863l(aVDmtPanelRecyleView, f, f2, 250, z);
                duration.withEndAction(lVar).start();
            }
            if (this.f106318k) {
                mo101149a(STATUS.SUCCESS);
                this.f106318k = false;
            }
        }
    }

    public C40851a(C0043i iVar, AppCompatActivity appCompatActivity, ShortVideoContext shortVideoContext, AVDmtTabLayout aVDmtTabLayout, DmtStatusView dmtStatusView, View view, C1282n nVar, EffectStickerManager effectStickerManager) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(appCompatActivity, "mActivity");
        C7573i.m23587b(aVDmtTabLayout, "mTabLayout");
        C7573i.m23587b(nVar, "mViewPool");
        C7573i.m23587b(effectStickerManager, "mEffectStickerManager");
        super(appCompatActivity, shortVideoContext, effectStickerManager);
        this.f106253b = iVar;
        this.f106254c = appCompatActivity;
        this.f106255d = shortVideoContext;
        this.f106260r = aVDmtTabLayout;
        this.f106261s = dmtStatusView;
        this.f106262t = view;
        this.f106263u = nVar;
        this.f106256e = effectStickerManager;
    }
}
