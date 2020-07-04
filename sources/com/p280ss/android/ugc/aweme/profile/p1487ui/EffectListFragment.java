package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.effect.StickerListAdapter;
import com.p280ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.p280ss.android.ugc.aweme.profile.presenter.C36029h;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.EffectListFragment */
public final class EffectListFragment extends ProfileListFragment implements C6905a, C25675c<NewFaceSticker>, C36346ao {

    /* renamed from: g */
    public static final C36143a f94583g = new C36143a(null);

    /* renamed from: e */
    public RecyclerView f94584e;

    /* renamed from: f */
    public DmtStatusView f94585f;

    /* renamed from: h */
    private LinearLayoutManager f94586h;

    /* renamed from: i */
    private C1281m f94587i;

    /* renamed from: j */
    private C25674b<C36029h> f94588j;

    /* renamed from: k */
    private StickerListAdapter f94589k;

    /* renamed from: l */
    private boolean f94590l = true;

    /* renamed from: m */
    private String f94591m;

    /* renamed from: n */
    private String f94592n;

    /* renamed from: o */
    private Boolean f94593o = Boolean.valueOf(false);

    /* renamed from: p */
    private int f94594p;

    /* renamed from: q */
    private Set<String> f94595q = new LinkedHashSet();

    /* renamed from: r */
    private int[] f94596r = new int[2];

    /* renamed from: s */
    private final int f94597s = C23482j.m77095a(getContext());

    /* renamed from: t */
    private ViewStub f94598t;

    /* renamed from: u */
    private View f94599u;

    /* renamed from: v */
    private boolean f94600v;

    /* renamed from: w */
    private HashMap f94601w;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.EffectListFragment$a */
    public static final class C36143a {
        private C36143a() {
        }

        public /* synthetic */ C36143a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static EffectListFragment m116588a(int i, String str, String str2, boolean z) {
            EffectListFragment effectListFragment = new EffectListFragment();
            Bundle bundle = new Bundle();
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                bundle.putString("userid", str);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                bundle.putString("sec_user_id", str2);
            }
            bundle.putBoolean("is_me", z);
            bundle.putInt("bottom_bar_height", i);
            effectListFragment.setArguments(bundle);
            return effectListFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.EffectListFragment$b */
    static final class C36144b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EffectListFragment f94602a;

        C36144b(EffectListFragment effectListFragment) {
            this.f94602a = effectListFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94602a.mo90811A();
        }
    }

    /* renamed from: r */
    private void m116576r() {
        if (this.f94601w != null) {
            this.f94601w.clear();
        }
    }

    public final void aE_() {
    }

    public final boolean aO_() {
        return this.f94590l;
    }

    public final void aT_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
        C7573i.m23587b(exc, "e");
    }

    /* renamed from: c */
    public final void mo59110c(List<NewFaceSticker> list, boolean z) {
        C7573i.m23587b(list, "list");
    }

    /* renamed from: l */
    private final void m116570l() {
        if (this.f95163N) {
            mo90811A();
        }
    }

    /* renamed from: j */
    public final View mo61750j() {
        if (!isViewValid()) {
            return null;
        }
        return this.f94584e;
    }

    /* renamed from: k */
    private final void m116569k() {
        this.f94590l = true;
        m116571m();
        m116573o();
        m116572n();
        m116574p();
        m116575q();
        m116570l();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid()) {
            View view = this.f94599u;
            if (view == null) {
                C7573i.m23583a("mPrivateAccountView");
            }
            view.setVisibility(4);
            DmtStatusView dmtStatusView = this.f94585f;
            if (dmtStatusView == null) {
                C7573i.m23580a();
            }
            dmtStatusView.mo25942f();
        }
    }

    public final void aD_() {
        if (isViewValid()) {
            StickerListAdapter stickerListAdapter = this.f94589k;
            if (stickerListAdapter == null) {
                C7573i.m23580a();
            }
            stickerListAdapter.ag_();
        }
    }

    public final void aS_() {
        if (this.f94584e != null) {
            RecyclerView recyclerView = this.f94584e;
            if (recyclerView == null) {
                C7573i.m23580a();
            }
            recyclerView.mo5541b(0);
        }
    }

    public final void ae_() {
        if (isViewValid()) {
            View view = this.f94599u;
            if (view == null) {
                C7573i.m23583a("mPrivateAccountView");
            }
            view.setVisibility(4);
            DmtStatusView dmtStatusView = this.f94585f;
            if (dmtStatusView == null) {
                C7573i.m23580a();
            }
            dmtStatusView.mo25943g();
        }
    }

    public final void bd_() {
        C25674b<C36029h> bVar = this.f94588j;
        if (bVar == null) {
            C7573i.m23580a();
        }
        bVar.mo56976a(Integer.valueOf(4), this.f94591m, this.f94592n);
    }

    public final void onDestroyView() {
        RecyclerView recyclerView = this.f94584e;
        if (recyclerView != null) {
            C1281m mVar = this.f94587i;
            if (mVar == null) {
                C7573i.m23583a("mOnScrollListener");
            }
            recyclerView.mo5545b(mVar);
        }
        super.onDestroyView();
        m116576r();
    }

    /* renamed from: o */
    private final void m116573o() {
        Boolean bool = this.f94593o;
        if (bool == null) {
            C7573i.m23580a();
        }
        this.f94589k = new StickerListAdapter(bool.booleanValue());
        StickerListAdapter stickerListAdapter = this.f94589k;
        if (stickerListAdapter != null) {
            stickerListAdapter.mo66504a((C6905a) this);
            stickerListAdapter.mo66506d(R.string.am0);
        }
    }

    /* renamed from: p */
    private final void m116574p() {
        this.f94588j = new C25674b<>();
        C25674b<C36029h> bVar = this.f94588j;
        if (bVar == null) {
            C7573i.m23580a();
        }
        bVar.mo66537a(this);
        C25674b<C36029h> bVar2 = this.f94588j;
        if (bVar2 == null) {
            C7573i.m23580a();
        }
        bVar2.mo66536a(new C36029h());
    }

    public final void aQ_() {
        if (this.f94585f == null || (!this.f94600v && !TimeLockRuler.isTeenModeON())) {
            mo90811A();
            return;
        }
        DmtStatusView dmtStatusView = this.f94585f;
        if (dmtStatusView == null) {
            C7573i.m23580a();
        }
        dmtStatusView.setVisibility(4);
        View view = this.f94599u;
        if (view == null) {
            C7573i.m23583a("mPrivateAccountView");
        }
        view.setVisibility(0);
    }

    /* renamed from: m */
    private final void m116571m() {
        String str;
        String str2;
        Boolean bool;
        Bundle arguments = getArguments();
        Integer num = null;
        if (arguments != null) {
            str = arguments.getString("userid");
        } else {
            str = null;
        }
        this.f94591m = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("sec_user_id");
        } else {
            str2 = null;
        }
        this.f94592n = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            bool = Boolean.valueOf(arguments3.getBoolean("is_me", false));
        } else {
            bool = null;
        }
        this.f94593o = bool;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            num = Integer.valueOf(arguments4.getInt("bottom_bar_height", 0));
        }
        if (num == null) {
            C7573i.m23580a();
        }
        this.f94594p = num.intValue();
    }

    /* renamed from: n */
    private final void m116572n() {
        RecyclerView recyclerView = this.f94584e;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f94589k);
        }
        this.f94586h = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView2 = this.f94584e;
        if (recyclerView2 != null) {
            LinearLayoutManager linearLayoutManager = this.f94586h;
            if (linearLayoutManager == null) {
                C7573i.m23583a("mLayoutManger");
            }
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        if (this.f94594p != 0) {
            RecyclerView recyclerView3 = this.f94584e;
            if (recyclerView3 != null) {
                recyclerView3.setPadding(0, 0, 0, this.f94594p);
            }
        }
        this.f94587i = new EffectListFragment$initView$1(this);
        RecyclerView recyclerView4 = this.f94584e;
        if (recyclerView4 != null) {
            C1281m mVar = this.f94587i;
            if (mVar == null) {
                C7573i.m23583a("mOnScrollListener");
            }
            recyclerView4.mo5528a(mVar);
        }
    }

    /* renamed from: q */
    private final void m116575q() {
        int i;
        C10803a a = C10803a.m31631a(getContext());
        try {
            DmtTextView b = m116568b((int) R.string.c48);
            Boolean bool = this.f94593o;
            if (bool == null) {
                C7573i.m23580a();
            }
            if (bool.booleanValue()) {
                i = R.string.cmp;
            } else {
                i = R.string.cmo;
            }
            DmtTextView b2 = m116568b(i);
            b.setOnClickListener(new C36144b(this));
            a.mo25963b((View) b2).mo25966c((View) b);
        } catch (Exception unused) {
        }
        DmtStatusView dmtStatusView = this.f94585f;
        if (dmtStatusView == null) {
            C7573i.m23580a();
        }
        dmtStatusView.setBuilder(a);
    }

    /* renamed from: A */
    public final boolean mo90811A() {
        if (!isViewValid() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        RecyclerView recyclerView = this.f94584e;
        if (recyclerView != null) {
            recyclerView.setVisibility(4);
        }
        if (!C36686x.m118332a(getActivity())) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C10761a.m31399c((Context) activity, (int) R.string.cjs).mo25750a();
            DmtStatusView dmtStatusView = this.f94585f;
            if (dmtStatusView == null) {
                C7573i.m23580a();
            }
            dmtStatusView.mo25944h();
            this.f94590l = true;
            return false;
        }
        C25674b<C36029h> bVar = this.f94588j;
        if (bVar == null) {
            C7573i.m23580a();
        }
        boolean z = !bVar.mo66540i();
        C25674b<C36029h> bVar2 = this.f94588j;
        if (bVar2 == null) {
            C7573i.m23580a();
        }
        bVar2.mo56976a(Integer.valueOf(1), this.f94591m, this.f94592n);
        this.f94590l = false;
        return z;
    }

    /* renamed from: g */
    public final void mo91985g() {
        int i;
        NewFaceSticker newFaceSticker;
        LinearLayoutManager linearLayoutManager = this.f94586h;
        if (linearLayoutManager == null) {
            C7573i.m23583a("mLayoutManger");
        }
        int j = linearLayoutManager.mo5445j();
        LinearLayoutManager linearLayoutManager2 = this.f94586h;
        if (linearLayoutManager2 == null) {
            C7573i.m23583a("mLayoutManger");
        }
        int l = linearLayoutManager2.mo5447l();
        if (j <= l) {
            while (true) {
                StickerListAdapter stickerListAdapter = this.f94589k;
                if (stickerListAdapter != null) {
                    i = stickerListAdapter.getItemCount();
                } else {
                    i = 0;
                }
                if (j < i) {
                    try {
                        StickerListAdapter stickerListAdapter2 = this.f94589k;
                        if (stickerListAdapter2 != null) {
                            newFaceSticker = stickerListAdapter2.mo70406b(j);
                        } else {
                            newFaceSticker = null;
                        }
                        LinearLayoutManager linearLayoutManager3 = this.f94586h;
                        if (linearLayoutManager3 == null) {
                            C7573i.m23583a("mLayoutManger");
                        }
                        View c = linearLayoutManager3.mo5432c(j);
                        if (c != null) {
                            c.getLocationOnScreen(this.f94596r);
                            if (this.f94596r[1] <= this.f94597s) {
                                m116567a(newFaceSticker);
                            } else {
                                return;
                            }
                        }
                    } catch (IndexOutOfBoundsException unused) {
                    }
                    if (j == l) {
                        break;
                    }
                    j++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        C7573i.m23587b(exc, "e");
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f94585f;
            if (dmtStatusView == null) {
                C7573i.m23580a();
            }
            dmtStatusView.mo25944h();
            this.f94590l = true;
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        C7573i.m23587b(exc, "e");
        if (isViewValid()) {
            StickerListAdapter stickerListAdapter = this.f94589k;
            if (stickerListAdapter == null) {
                C7573i.m23580a();
            }
            stickerListAdapter.mo66508i();
        }
    }

    /* renamed from: b */
    private final DmtTextView m116568b(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        dmtTextView.setTextColor(getResources().getColor(R.color.a51));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    /* renamed from: a */
    private final void m116567a(NewFaceSticker newFaceSticker) {
        String str;
        if (newFaceSticker != null) {
            String effectId = newFaceSticker.getEffectId();
            if (effectId != null && !this.f94595q.contains(effectId)) {
                String str2 = "prop_show_homepage";
                C22984d a = new C22984d().mo59973a("prop_id", effectId).mo59973a("from_user_id", this.f94591m);
                String str3 = "enter_from";
                if (C7573i.m23585a((Object) Boolean.valueOf(true), (Object) this.f94593o)) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("tab_name", this.f95164O).f60753a);
                this.f94595q.add(effectId);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m116569k();
    }

    /* renamed from: a */
    public final void mo65501a(String str, String str2) {
        if (this.f94591m == null || !C7634n.m23717a(this.f94591m, str, false)) {
            this.f94591m = str;
            this.f94592n = str2;
            this.f94590l = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r0 == null) goto L_0x0027;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59108b(java.util.List<com.p280ss.android.ugc.aweme.feed.model.NewFaceSticker> r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            boolean r0 = r2.isViewValid()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.mo18803bo()
            boolean r0 = r0.useRecyclerPartialUpdate
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.effect.StickerListAdapter r0 = r2.f94589k
            if (r0 == 0) goto L_0x0027
            java.util.List r0 = r0.mo62312a()
            if (r0 != 0) goto L_0x002e
        L_0x0027:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x002e:
            java.util.Collection r3 = (java.util.Collection) r3
            r0.addAll(r3)
            com.ss.android.ugc.aweme.effect.StickerListAdapter r3 = r2.f94589k
            if (r3 == 0) goto L_0x0045
            r3.mo61577b(r0)
            goto L_0x0045
        L_0x003b:
            com.ss.android.ugc.aweme.effect.StickerListAdapter r0 = r2.f94589k
            if (r0 != 0) goto L_0x0042
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0042:
            r0.mo62323c(r3)
        L_0x0045:
            if (r4 != 0) goto L_0x005d
            com.ss.android.ugc.aweme.effect.StickerListAdapter r3 = r2.f94589k
            if (r3 != 0) goto L_0x004e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x004e:
            r4 = 0
            r3.mo66504a(r4)
            com.ss.android.ugc.aweme.effect.StickerListAdapter r3 = r2.f94589k
            if (r3 != 0) goto L_0x0059
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0059:
            r3.ah_()
            return
        L_0x005d:
            com.ss.android.ugc.aweme.effect.StickerListAdapter r3 = r2.f94589k
            if (r3 != 0) goto L_0x0064
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0064:
            r3.ai_()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.EffectListFragment.mo59108b(java.util.List, boolean):void");
    }

    /* renamed from: a */
    public final void mo59099a(List<NewFaceSticker> list, boolean z) {
        C7573i.m23587b(list, "list");
        if (isViewValid()) {
            DmtStatusView dmtStatusView = this.f94585f;
            if (dmtStatusView == null) {
                C7573i.m23580a();
            }
            dmtStatusView.mo25939d();
            DmtStatusView dmtStatusView2 = this.f94585f;
            if (dmtStatusView2 == null) {
                C7573i.m23580a();
            }
            dmtStatusView2.mo25950n();
            RecyclerView recyclerView = this.f94584e;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            StickerListAdapter stickerListAdapter = this.f94589k;
            if (stickerListAdapter == null) {
                C7573i.m23580a();
            }
            stickerListAdapter.mo58045a(list);
            if (!z) {
                StickerListAdapter stickerListAdapter2 = this.f94589k;
                if (stickerListAdapter2 == null) {
                    C7573i.m23580a();
                }
                stickerListAdapter2.mo66504a((C6905a) null);
                StickerListAdapter stickerListAdapter3 = this.f94589k;
                if (stickerListAdapter3 == null) {
                    C7573i.m23580a();
                }
                stickerListAdapter3.ah_();
                return;
            }
            StickerListAdapter stickerListAdapter4 = this.f94589k;
            if (stickerListAdapter4 == null) {
                C7573i.m23580a();
            }
            stickerListAdapter4.mo66504a((C6905a) this);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.o1, viewGroup, false);
        this.f94584e = (RecyclerView) inflate.findViewById(R.id.cxs);
        this.f94585f = (DmtStatusView) inflate.findViewById(R.id.dav);
        if (this.f94584e instanceof FpsRecyclerView) {
            RecyclerView recyclerView = this.f94584e;
            if (recyclerView != null) {
                ((FpsRecyclerView) recyclerView).setLabel("profile_list");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.views.FpsRecyclerView");
            }
        }
        View findViewById = inflate.findViewById(R.id.dcm);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.stub_private_account)");
        this.f94598t = (ViewStub) findViewById;
        ViewStub viewStub = this.f94598t;
        if (viewStub == null) {
            C7573i.m23583a("mPrivateAccountStub");
        }
        View inflate2 = viewStub.inflate();
        C7573i.m23582a((Object) inflate2, "mPrivateAccountStub.inflate()");
        this.f94599u = inflate2;
        if (TimeLockRuler.isTeenModeON()) {
            View view = this.f94599u;
            if (view == null) {
                C7573i.m23583a("mPrivateAccountView");
            }
            ((TextView) view.findViewById(R.id.title)).setText(R.string.e6j);
            View view2 = this.f94599u;
            if (view2 == null) {
                C7573i.m23583a("mPrivateAccountView");
            }
            ((TextView) view2.findViewById(R.id.a1q)).setText(R.string.e69);
        }
        View view3 = this.f94599u;
        if (view3 == null) {
            C7573i.m23583a("mPrivateAccountView");
        }
        view3.setVisibility(4);
        return inflate;
    }
}
