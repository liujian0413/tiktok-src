package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30898i;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.MediaChooseActivity.C31359a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.adapter.MediaChoosePanelAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseParameters;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseParameters.C31401a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1330a.C31378a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel.C31426a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1328a.C31342b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.HorizontalSpaceItemDecoration;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b */
public final class C31383b {

    /* renamed from: a */
    public View f82201a;

    /* renamed from: b */
    public MediaPanelChooseViewModel f82202b;

    /* renamed from: c */
    private View f82203c;

    /* renamed from: d */
    private View f82204d;

    /* renamed from: e */
    private View f82205e;

    /* renamed from: f */
    private View f82206f;

    /* renamed from: g */
    private View f82207g;

    /* renamed from: h */
    private DmtButton f82208h;

    /* renamed from: i */
    private View f82209i;

    /* renamed from: j */
    private RecyclerView f82210j;

    /* renamed from: k */
    private MediaChoosePanelAdapter f82211k;

    /* renamed from: l */
    private final C0053p<List<MediaModel>> f82212l;

    /* renamed from: m */
    private final C0053p<List<MediaModel>> f82213m;

    /* renamed from: n */
    private final C0053p<MediaChooseResult> f82214n;

    /* renamed from: o */
    private final FragmentActivity f82215o;

    /* renamed from: p */
    private final ViewGroup f82216p;

    /* renamed from: q */
    private final C31378a f82217q;

    /* renamed from: r */
    private final MediaChooseParameters f82218r;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$a */
    static final class C31384a<T> implements C6892b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C31383b f82219a;

        C31384a(C31383b bVar) {
            this.f82219a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(Boolean bool) {
            C31383b bVar = this.f82219a;
            C7573i.m23582a((Object) bool, "result");
            if (!bool.booleanValue()) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo81949a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$b */
    static final class C31385b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31383b f82220a;

        C31385b(C31383b bVar) {
            this.f82220a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7573i.m23582a((Object) view, "it");
            view.setSelected(!view.isSelected());
            C31383b.m102136a(this.f82220a).f82289d = view.isSelected();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$c */
    static final class C31386c extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31383b f82221a;

        C31386c(C31383b bVar) {
            this.f82221a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102153a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102153a(View view) {
            C7573i.m23587b(view, "it");
            this.f82221a.mo81952d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$d */
    static final class C31387d extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31383b f82222a;

        C31387d(C31383b bVar) {
            this.f82222a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102154a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102154a(View view) {
            C7573i.m23587b(view, "it");
            this.f82222a.mo81951c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$e */
    static final class C31388e extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31383b f82223a;

        C31388e(C31383b bVar) {
            this.f82223a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102155a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102155a(View view) {
            C7573i.m23587b(view, "it");
            this.f82223a.mo81953e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$f */
    static final class C31389f<T> implements C0053p<List<MediaModel>> {

        /* renamed from: a */
        final /* synthetic */ C31383b f82224a;

        C31389f(C31383b bVar) {
            this.f82224a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<MediaModel> list) {
            boolean z;
            if (list != null) {
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list = null;
                }
                if (list != null) {
                    C31383b bVar = this.f82224a;
                    C7573i.m23582a((Object) list, "it");
                    bVar.mo81948a(list);
                    return;
                }
            }
            this.f82224a.m102139b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$g */
    static final class C31390g<T> implements C0053p<MediaChooseResult> {

        /* renamed from: a */
        final /* synthetic */ C31383b f82225a;

        C31390g(C31383b bVar) {
            this.f82225a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(MediaChooseResult mediaChooseResult) {
            if (mediaChooseResult != null) {
                C31383b.m102136a(this.f82225a).mo82000b().setValue(C7525m.m23509d((Collection<? extends T>) mediaChooseResult.getSelectedList()));
                C31383b.m102136a(this.f82225a).f82289d = mediaChooseResult.getSendRaw();
                C31383b.m102138b(this.f82225a).setSelected(mediaChooseResult.getSendRaw());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$h */
    static final class C31391h<T> implements C0053p<List<MediaModel>> {

        /* renamed from: a */
        final /* synthetic */ C31383b f82226a;

        C31391h(C31383b bVar) {
            this.f82226a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<MediaModel> list) {
            this.f82226a.mo81950b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.b$i */
    static final class C31392i<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31383b f82227a;

        C31392i(C31383b bVar) {
            this.f82227a = bVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m102159a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102159a(C1592h<Void> hVar) {
            C31383b.m102136a(this.f82227a).mo82005n();
        }
    }

    /* renamed from: e */
    public final void mo81953e() {
        C30898i.m100632a().mo80818a(this.f82215o, new C31384a(this));
    }

    /* renamed from: h */
    private void m102142h() {
        MediaPanelChooseViewModel mediaPanelChooseViewModel = this.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel.mo82006o().removeObserver(this.f82212l);
        MediaPanelChooseViewModel mediaPanelChooseViewModel2 = this.f82202b;
        if (mediaPanelChooseViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel2.mo82000b().removeObserver(this.f82213m);
        MediaPanelChooseViewModel mediaPanelChooseViewModel3 = this.f82202b;
        if (mediaPanelChooseViewModel3 == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel3.mo82007p().removeObserver(this.f82214n);
    }

    /* renamed from: i */
    private final void m102143i() {
        int dimensionPixelSize = this.f82215o.getResources().getDimensionPixelSize(R.dimen.hv);
        int dimensionPixelSize2 = this.f82215o.getResources().getDimensionPixelSize(R.dimen.i3);
        RecyclerView recyclerView = this.f82210j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = dimensionPixelSize2 - dimensionPixelSize;
        RecyclerView recyclerView2 = this.f82210j;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    private final void m102144j() {
        MediaPanelChooseViewModel mediaPanelChooseViewModel = this.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel.mo82000b().setValue(new ArrayList());
        MediaPanelChooseViewModel mediaPanelChooseViewModel2 = this.f82202b;
        if (mediaPanelChooseViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel2.f82289d = false;
        View view = this.f82201a;
        if (view == null) {
            C7573i.m23583a("btnSendRaw");
        }
        view.setSelected(false);
    }

    /* renamed from: a */
    public final void mo81947a() {
        m102142h();
        MediaPanelChooseViewModel mediaPanelChooseViewModel = this.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        List list = (List) mediaPanelChooseViewModel.mo82006o().getValue();
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void mo81952d() {
        ArrayList arrayList = new ArrayList();
        MediaPanelChooseViewModel mediaPanelChooseViewModel = this.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        boolean z = mediaPanelChooseViewModel.f82289d;
        MediaPanelChooseViewModel mediaPanelChooseViewModel2 = this.f82202b;
        if (mediaPanelChooseViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        List list = (List) mediaPanelChooseViewModel2.mo82000b().getValue();
        if (list != null) {
            arrayList.addAll(list);
        }
        m102144j();
        this.f82217q.mo80555a(new MediaChooseResult(z, arrayList));
    }

    /* renamed from: f */
    private void m102140f() {
        LayoutInflater.from(this.f82215o).inflate(R.layout.a8h, this.f82216p, true);
        this.f82203c = m102135a((int) R.id.bin);
        this.f82204d = m102135a((int) R.id.du0);
        this.f82205e = m102135a((int) R.id.dzg);
        this.f82206f = m102135a((int) R.id.duu);
        this.f82207g = m102135a((int) R.id.bgs);
        this.f82208h = (DmtButton) m102135a((int) R.id.rg);
        this.f82201a = m102135a((int) R.id.ri);
        this.f82209i = m102135a((int) R.id.po);
        this.f82210j = (RecyclerView) m102135a((int) R.id.cqb);
    }

    /* renamed from: c */
    public final void mo81951c() {
        ArrayList arrayList = new ArrayList();
        MediaPanelChooseViewModel mediaPanelChooseViewModel = this.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        List list = (List) mediaPanelChooseViewModel.mo82000b().getValue();
        if (list != null) {
            arrayList.addAll(list);
        }
        View view = this.f82201a;
        if (view == null) {
            C7573i.m23583a("btnSendRaw");
        }
        MediaChooseParameters mediaChooseParameters = new MediaChooseParameters(17, view.isSelected(), arrayList);
        C1592h.m7848a(120).mo6876a((C1591g<TResult, TContinuationResult>) new C31392i<TResult,TContinuationResult>(this), C1592h.f5958b);
        C31359a.m102091a(this.f82215o, mediaChooseParameters);
    }

    /* renamed from: b */
    public final void mo81950b() {
        boolean z;
        MediaPanelChooseViewModel mediaPanelChooseViewModel = this.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        List list = (List) mediaPanelChooseViewModel.mo82000b().getValue();
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DmtButton dmtButton = this.f82208h;
            if (dmtButton == null) {
                C7573i.m23583a("btnSend");
            }
            dmtButton.setText(this.f82215o.getResources().getString(R.string.bp9));
            DmtButton dmtButton2 = this.f82208h;
            if (dmtButton2 == null) {
                C7573i.m23583a("btnSend");
            }
            dmtButton2.setTextColor(this.f82215o.getResources().getColor(R.color.ty));
            DmtButton dmtButton3 = this.f82208h;
            if (dmtButton3 == null) {
                C7573i.m23583a("btnSend");
            }
            dmtButton3.setEnabled(false);
            return;
        }
        DmtButton dmtButton4 = this.f82208h;
        if (dmtButton4 == null) {
            C7573i.m23583a("btnSend");
        }
        dmtButton4.setText(this.f82215o.getResources().getString(R.string.bpa, new Object[]{Integer.valueOf(list.size())}));
        DmtButton dmtButton5 = this.f82208h;
        if (dmtButton5 == null) {
            C7573i.m23583a("btnSend");
        }
        dmtButton5.setTextColor(this.f82215o.getResources().getColor(R.color.vi));
        DmtButton dmtButton6 = this.f82208h;
        if (dmtButton6 == null) {
            C7573i.m23583a("btnSend");
        }
        dmtButton6.setEnabled(true);
    }

    /* renamed from: g */
    private void m102141g() {
        this.f82202b = C31426a.m102239a(this.f82215o);
        View view = this.f82201a;
        if (view == null) {
            C7573i.m23583a("btnSendRaw");
        }
        view.setOnClickListener(new C31385b(this));
        DmtButton dmtButton = this.f82208h;
        if (dmtButton == null) {
            C7573i.m23583a("btnSend");
        }
        C31342b.m102053a(dmtButton, new C31386c(this));
        View view2 = this.f82209i;
        if (view2 == null) {
            C7573i.m23583a("btnAlbum");
        }
        C31342b.m102053a(view2, new C31387d(this));
        View view3 = this.f82205e;
        if (view3 == null) {
            C7573i.m23583a("tvNoticePermission");
        }
        C31342b.m102053a(view3, new C31388e(this));
        C31882a n = C31882a.m103579n();
        View[] viewArr = new View[4];
        View view4 = this.f82205e;
        if (view4 == null) {
            C7573i.m23583a("tvNoticePermission");
        }
        viewArr[0] = view4;
        DmtButton dmtButton2 = this.f82208h;
        if (dmtButton2 == null) {
            C7573i.m23583a("btnSend");
        }
        viewArr[1] = dmtButton2;
        View view5 = this.f82201a;
        if (view5 == null) {
            C7573i.m23583a("btnSendRaw");
        }
        viewArr[2] = view5;
        View view6 = this.f82209i;
        if (view6 == null) {
            C7573i.m23583a("btnAlbum");
        }
        viewArr[3] = view6;
        n.mo82725a(viewArr);
        MediaPanelChooseViewModel mediaPanelChooseViewModel = this.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        this.f82211k = new MediaChoosePanelAdapter(mediaPanelChooseViewModel);
        RecyclerView recyclerView = this.f82210j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        MediaChoosePanelAdapter mediaChoosePanelAdapter = this.f82211k;
        if (mediaChoosePanelAdapter == null) {
            C7573i.m23583a("adapter");
        }
        recyclerView.setAdapter(mediaChoosePanelAdapter);
        RecyclerView recyclerView2 = this.f82210j;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f82215o, 0, false));
        RecyclerView recyclerView3 = this.f82210j;
        if (recyclerView3 == null) {
            C7573i.m23583a("recyclerView");
        }
        C1267f itemAnimator = recyclerView3.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).f5112m = false;
            RecyclerView recyclerView4 = this.f82210j;
            if (recyclerView4 == null) {
                C7573i.m23583a("recyclerView");
            }
            recyclerView4.mo5525a((C1272h) new HorizontalSpaceItemDecoration((int) C9738o.m28708b((Context) this.f82215o, 3.0f)));
            m102143i();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: a */
    private final <T extends View> T m102135a(int i) {
        T findViewById = this.f82216p.findViewById(i);
        C7573i.m23582a((Object) findViewById, "layout.findViewById(id)");
        return findViewById;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m102138b(C31383b bVar) {
        View view = bVar.f82201a;
        if (view == null) {
            C7573i.m23583a("btnSendRaw");
        }
        return view;
    }

    /* renamed from: a */
    public static final /* synthetic */ MediaPanelChooseViewModel m102136a(C31383b bVar) {
        MediaPanelChooseViewModel mediaPanelChooseViewModel = bVar.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        return mediaPanelChooseViewModel;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m102139b(boolean z) {
        int i;
        View view = this.f82203c;
        if (view == null) {
            C7573i.m23583a("noticeLayout");
        }
        int i2 = 0;
        view.setVisibility(0);
        View view2 = this.f82204d;
        if (view2 == null) {
            C7573i.m23583a("tvNoticeEmpty");
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view2.setVisibility(i);
        View view3 = this.f82206f;
        if (view3 == null) {
            C7573i.m23583a("tvNoticeForbidden");
        }
        if (!z) {
            i2 = 8;
        }
        view3.setVisibility(i2);
        View view4 = this.f82205e;
        if (view4 == null) {
            C7573i.m23583a("tvNoticePermission");
        }
        View view5 = this.f82206f;
        if (view5 == null) {
            C7573i.m23583a("tvNoticeForbidden");
        }
        view4.setVisibility(view5.getVisibility());
        RecyclerView recyclerView = this.f82210j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView.setVisibility(8);
        View view6 = this.f82207g;
        if (view6 == null) {
            C7573i.m23583a("bottomLayout");
        }
        view6.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo81948a(List<MediaModel> list) {
        View view = this.f82203c;
        if (view == null) {
            C7573i.m23583a("noticeLayout");
        }
        view.setVisibility(8);
        RecyclerView recyclerView = this.f82210j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView.setVisibility(0);
        View view2 = this.f82207g;
        if (view2 == null) {
            C7573i.m23583a("bottomLayout");
        }
        view2.setVisibility(0);
        MediaChoosePanelAdapter mediaChoosePanelAdapter = this.f82211k;
        if (mediaChoosePanelAdapter == null) {
            C7573i.m23583a("adapter");
        }
        mediaChoosePanelAdapter.mo81945a(list);
    }

    /* renamed from: a */
    public final void mo81949a(boolean z) {
        if (!z) {
            m102139b(true);
            return;
        }
        MediaPanelChooseViewModel mediaPanelChooseViewModel = this.f82202b;
        if (mediaPanelChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel.mo82006o().observe(this.f82215o, this.f82212l);
        MediaPanelChooseViewModel mediaPanelChooseViewModel2 = this.f82202b;
        if (mediaPanelChooseViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel2.mo82000b().observe(this.f82215o, this.f82213m);
        MediaPanelChooseViewModel mediaPanelChooseViewModel3 = this.f82202b;
        if (mediaPanelChooseViewModel3 == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel3.mo82007p().observe(this.f82215o, this.f82214n);
        MediaPanelChooseViewModel mediaPanelChooseViewModel4 = this.f82202b;
        if (mediaPanelChooseViewModel4 == null) {
            C7573i.m23583a("viewModel");
        }
        mediaPanelChooseViewModel4.mo82003l();
        mo81950b();
    }

    private C31383b(FragmentActivity fragmentActivity, ViewGroup viewGroup, C31378a aVar, MediaChooseParameters mediaChooseParameters) {
        C7573i.m23587b(fragmentActivity, "context");
        C7573i.m23587b(viewGroup, "layout");
        C7573i.m23587b(aVar, "callback");
        C7573i.m23587b(mediaChooseParameters, "parameters");
        this.f82215o = fragmentActivity;
        this.f82216p = viewGroup;
        this.f82217q = aVar;
        this.f82218r = mediaChooseParameters;
        m102140f();
        m102141g();
        this.f82212l = new C31389f(this);
        this.f82213m = new C31391h(this);
        this.f82214n = new C31390g(this);
    }

    public /* synthetic */ C31383b(FragmentActivity fragmentActivity, ViewGroup viewGroup, C31378a aVar, MediaChooseParameters mediaChooseParameters, int i, C7571f fVar) {
        this(fragmentActivity, viewGroup, aVar, C31401a.m102170a());
    }
}
