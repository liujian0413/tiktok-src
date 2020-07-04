package com.p280ss.android.ugc.aweme.digg;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.digg.p1171a.C26350a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.p280ss.android.ugc.aweme.views.BottomSheetNestedLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
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

/* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment */
public final class LikeUsersFragment extends DialogFragment implements C6905a, C25675c<User> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f69324a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeUsersFragment.class), "mBackView", "getMBackView()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeUsersFragment.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeUsersFragment.class), "mRecyclerView", "getMRecyclerView()Landroid/support/v7/widget/RecyclerView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeUsersFragment.class), "mLikeUsersLayout", "getMLikeUsersLayout()Landroid/widget/RelativeLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeUsersFragment.class), "mLikeUsersListLayout", "getMLikeUsersListLayout()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeUsersFragment.class), "mLikeUsersNestedLayout", "getMLikeUsersNestedLayout()Lcom/ss/android/ugc/aweme/views/BottomSheetNestedLayout;"))};

    /* renamed from: f */
    public static final C26336a f69325f = new C26336a(null);

    /* renamed from: b */
    public final C26354c f69326b = new C26354c();

    /* renamed from: c */
    public String f69327c = "";

    /* renamed from: d */
    public int f69328d;

    /* renamed from: e */
    public String f69329e = "";

    /* renamed from: g */
    private final C7541d f69330g = C7546e.m23569a(new C26340e(this));

    /* renamed from: h */
    private final C7541d f69331h = C7546e.m23569a(new C26345j(this));

    /* renamed from: i */
    private final C7541d f69332i = C7546e.m23569a(new C26344i(this));

    /* renamed from: j */
    private final C7541d f69333j = C7546e.m23569a(new C26341f(this));

    /* renamed from: k */
    private final C7541d f69334k = C7546e.m23569a(new C26342g(this));

    /* renamed from: l */
    private final C7541d f69335l = C7546e.m23569a(new C26343h(this));

    /* renamed from: m */
    private final LikeUsersDialogAdapter f69336m = new LikeUsersDialogAdapter();

    /* renamed from: n */
    private boolean f69337n = true;

    /* renamed from: o */
    private int f69338o;

    /* renamed from: p */
    private String f69339p = "";

    /* renamed from: q */
    private String f69340q = "";

    /* renamed from: r */
    private HashMap f69341r;

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$a */
    public static final class C26336a {
        private C26336a() {
        }

        public /* synthetic */ C26336a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LikeUsersFragment m86666a(String str, int i, String str2, boolean z, int i2, String str3, String str4) {
            C7573i.m23587b(str3, "previousPage");
            C7573i.m23587b(str4, "enterFrom");
            LikeUsersFragment likeUsersFragment = new LikeUsersFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("awemeType", i);
            bundle.putString("awemeAid", str);
            bundle.putBoolean("isShadow", z);
            bundle.putString("enterFrom", str4);
            bundle.putString("likeUsers", str2);
            bundle.putInt("dialogHeight", i2);
            bundle.putString("previousPage", str3);
            likeUsersFragment.setArguments(bundle);
            return likeUsersFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$b */
    static final class C26337b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69342a;

        C26337b(LikeUsersFragment likeUsersFragment) {
            this.f69342a = likeUsersFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69342a.f69326b.mo56976a(Integer.valueOf(1), this.f69342a.f69327c, Integer.valueOf(this.f69342a.f69328d), Long.valueOf(0), Long.valueOf(0), Integer.valueOf(30), this.f69342a.f69329e, Integer.valueOf(C43161e.m136882a()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$c */
    static final class C26338c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69343a;

        C26338c(LikeUsersFragment likeUsersFragment) {
            this.f69343a = likeUsersFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69343a.mo67848e().dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$d */
    static final class C26339d extends Lambda implements C7562b<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69344a;

        C26339d(LikeUsersFragment likeUsersFragment) {
            this.f69344a = likeUsersFragment;
            super(1);
        }

        /* renamed from: a */
        private void m86667a(boolean z) {
            if (!z) {
                this.f69344a.dismiss();
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m86667a(((Boolean) obj).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$e */
    static final class C26340e extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69345a;

        C26340e(LikeUsersFragment likeUsersFragment) {
            this.f69345a = likeUsersFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f69345a.mo67847a((int) R.id.pr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$f */
    static final class C26341f extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69346a;

        C26341f(LikeUsersFragment likeUsersFragment) {
            this.f69346a = likeUsersFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            return (RelativeLayout) this.f69346a.mo67847a((int) R.id.bi6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$g */
    static final class C26342g extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69347a;

        C26342g(LikeUsersFragment likeUsersFragment) {
            this.f69347a = likeUsersFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f69347a.mo67847a((int) R.id.bi7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$h */
    static final class C26343h extends Lambda implements C7561a<BottomSheetNestedLayout> {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69348a;

        C26343h(LikeUsersFragment likeUsersFragment) {
            this.f69348a = likeUsersFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public BottomSheetNestedLayout invoke() {
            return (BottomSheetNestedLayout) this.f69348a.mo67847a((int) R.id.bim);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$i */
    static final class C26344i extends Lambda implements C7561a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69349a;

        C26344i(LikeUsersFragment likeUsersFragment) {
            this.f69349a = likeUsersFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecyclerView invoke() {
            return (RecyclerView) this.f69349a.mo67847a((int) R.id.cqd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.LikeUsersFragment$j */
    static final class C26345j extends Lambda implements C7561a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ LikeUsersFragment f69350a;

        C26345j(LikeUsersFragment likeUsersFragment) {
            this.f69350a = likeUsersFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtStatusView invoke() {
            return (DmtStatusView) this.f69350a.mo67847a((int) R.id.edf);
        }
    }

    /* renamed from: f */
    private final ImageView m86644f() {
        return (ImageView) this.f69330g.getValue();
    }

    /* renamed from: g */
    private final DmtStatusView m86645g() {
        return (DmtStatusView) this.f69331h.getValue();
    }

    /* renamed from: h */
    private final RecyclerView m86646h() {
        return (RecyclerView) this.f69332i.getValue();
    }

    /* renamed from: j */
    private final RelativeLayout m86647j() {
        return (RelativeLayout) this.f69333j.getValue();
    }

    /* renamed from: k */
    private final FrameLayout m86648k() {
        return (FrameLayout) this.f69334k.getValue();
    }

    /* renamed from: s */
    private void m86656s() {
        if (this.f69341r != null) {
            this.f69341r.clear();
        }
    }

    /* renamed from: a */
    public final View mo67847a(int i) {
        if (this.f69341r == null) {
            this.f69341r = new HashMap();
        }
        View view = (View) this.f69341r.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f69341r.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<User> list, boolean z) {
    }

    /* renamed from: e */
    public final BottomSheetNestedLayout mo67848e() {
        return (BottomSheetNestedLayout) this.f69335l.getValue();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        m86645g().mo25942f();
    }

    public final void aD_() {
        this.f69336m.ag_();
    }

    public final void ae_() {
        m86645g().mo25943g();
    }

    /* renamed from: r */
    private final void m86655r() {
        this.f69326b.mo66535W_();
        this.f69326b.mo59134U_();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        m86655r();
        m86656s();
    }

    /* renamed from: n */
    private final void m86651n() {
        if (this.f69338o > 0) {
            RelativeLayout j = m86647j();
            C7573i.m23582a((Object) j, "mLikeUsersLayout");
            j.getLayoutParams().height = this.f69338o;
            FrameLayout k = m86648k();
            C7573i.m23582a((Object) k, "mLikeUsersListLayout");
            k.getLayoutParams().height = -1;
        }
    }

    /* renamed from: o */
    private final View m86652o() {
        Context context = getContext();
        if (context == null) {
            context = C6399b.m19921a();
        }
        C7573i.m23582a((Object) context, "context ?: AppContextMan…r.getApplicationContext()");
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.ss));
        int c = C0683b.m2912c(context, R.color.abp);
        dmtTextView.setOnClickListener(new C26337b(this));
        dmtTextView.setText(R.string.c46);
        dmtTextView.setTextColor(c);
        return dmtTextView;
    }

    /* renamed from: p */
    private final void m86653p() {
        this.f69336m.mo66504a((C6905a) this);
        m86644f().setOnClickListener(new C26338c(this));
        mo67848e().setShowStateChangedListener(new C26339d(this));
    }

    /* renamed from: m */
    private final void m86650m() {
        RecyclerView h = m86646h();
        C7573i.m23582a((Object) h, "mRecyclerView");
        h.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        LikeUsersDialogAdapter likeUsersDialogAdapter = this.f69336m;
        Context context = getContext();
        if (context == null) {
            context = C6399b.m19921a();
        }
        likeUsersDialogAdapter.f67550q = C0683b.m2912c(context, R.color.lz);
        this.f69336m.mo66506d(R.string.am0);
        this.f69336m.mo67844a(this.f69339p);
        this.f69336m.mo67845b(this.f69340q);
        RecyclerView h2 = m86646h();
        C7573i.m23582a((Object) h2, "mRecyclerView");
        h2.setAdapter(this.f69336m);
        m86645g().setBuilder(C10803a.m31631a(getContext()).mo25965c(0).mo25966c(m86652o()));
        m86651n();
    }

    /* renamed from: q */
    private final void m86654q() {
        this.f69326b.mo66536a(new C26351b());
        this.f69326b.mo66537a(this);
        this.f69326b.mo56976a(Integer.valueOf(1), this.f69327c, Integer.valueOf(this.f69328d), Long.valueOf(0), Long.valueOf(0), Integer.valueOf(30), this.f69329e, Integer.valueOf(C43161e.m136882a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r0 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r0 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        if (r0 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0 == null) goto L_0x000e;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m86649l() {
        /*
            r5 = this;
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "likeUsers"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            r1 = 0
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            if (r2 == 0) goto L_0x0027
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User[]> r1 = com.p280ss.android.ugc.aweme.profile.model.User[].class
            java.util.List r1 = com.p280ss.android.ugc.aweme.utils.C42996by.m136486b(r0, r1)
        L_0x0027:
            java.lang.String r0 = m86642a(r1)
            r5.f69329e = r0
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = "previousPage"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r0 = ""
        L_0x003d:
            r5.f69339p = r0
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = "dialogHeight"
            int r0 = r0.getInt(r1)
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            r5.f69338o = r0
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = "isShadow"
            boolean r3 = r0.getBoolean(r1)
        L_0x005b:
            r5.f69337n = r3
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = "enterFrom"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x006d
        L_0x006b:
            java.lang.String r0 = ""
        L_0x006d:
            r5.f69340q = r0
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = "awemeAid"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x007f
        L_0x007d:
            java.lang.String r0 = ""
        L_0x007f:
            r5.f69327c = r0
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = "awemeType"
            int r4 = r0.getInt(r1)
        L_0x008d:
            r5.f69328d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.digg.LikeUsersFragment.m86649l():void");
    }

    public final void bd_() {
        C26351b bVar = (C26351b) this.f69326b.mo66539h();
        C7573i.m23582a((Object) bVar, "mPresenter.model");
        if (bVar.isHasMore()) {
            C26354c cVar = this.f69326b;
            C26351b bVar2 = (C26351b) this.f69326b.mo66539h();
            C7573i.m23582a((Object) bVar2, "mPresenter.model");
            C26351b bVar3 = (C26351b) this.f69326b.mo66539h();
            C7573i.m23582a((Object) bVar3, "mPresenter.model");
            cVar.mo56976a(Integer.valueOf(4), this.f69327c, Integer.valueOf(this.f69328d), Long.valueOf(((C26350a) bVar2.getData()).f69367b), Long.valueOf(((C26350a) bVar3.getData()).f69368c), Integer.valueOf(30), this.f69329e, Integer.valueOf(C43161e.m136882a()));
        }
    }

    /* renamed from: a */
    private final void m86643a(boolean z) {
        if (z) {
            this.f69336m.ai_();
        } else {
            this.f69336m.ah_();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f69336m.mo66503a(m86646h(), false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.t6);
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        RecyclerView h = m86646h();
        C7573i.m23582a((Object) h, "mRecyclerView");
        h.setVisibility(8);
        m86645g().mo25944h();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.gn);
            }
        }
        if (!this.f69337n) {
            Dialog dialog2 = getDialog();
            if (dialog2 != null) {
                Window window2 = dialog2.getWindow();
                if (window2 != null) {
                    LayoutParams attributes = window2.getAttributes();
                    if (attributes != null) {
                        attributes.dimAmount = 0.0f;
                    }
                }
            }
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            Window window3 = dialog3.getWindow();
            if (window3 != null) {
                window3.setLayout(-1, -1);
            }
        }
    }

    /* renamed from: a */
    private static String m86642a(List<? extends User> list) {
        boolean z;
        String str = "";
        Collection collection = list;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        String str2 = ",";
        StringBuilder sb = new StringBuilder();
        int size = list.size() - 1;
        int size2 = collection.size();
        for (int i = 0; i < size2; i++) {
            sb.append(((User) list.get(i)).getUid());
            if (i != size) {
                sb.append(str2);
            }
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "builder.toString()");
        if (sb2.length() > 0) {
            z2 = true;
        }
        if (z2) {
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(sb2);
            sb3.append(']');
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r4 == false) goto L_0x0017;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59108b(java.util.List<com.p280ss.android.ugc.aweme.profile.model.User> r3, boolean r4) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0016
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x0012
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r4 = 0
            goto L_0x0013
        L_0x0012:
            r4 = 1
        L_0x0013:
            if (r4 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.m86643a(r0)
            com.ss.android.ugc.aweme.digg.LikeUsersDialogAdapter r4 = r2.f69336m
            r4.mo67846e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.digg.LikeUsersFragment.mo59108b(java.util.List, boolean):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m86649l();
        m86650m();
        m86653p();
        m86654q();
    }

    /* renamed from: a */
    public final void mo59099a(List<User> list, boolean z) {
        RecyclerView h = m86646h();
        C7573i.m23582a((Object) h, "mRecyclerView");
        if (h.getVisibility() != 0) {
            RecyclerView h2 = m86646h();
            C7573i.m23582a((Object) h2, "mRecyclerView");
            h2.setVisibility(0);
        }
        m86643a(z);
        this.f69336m.mo58045a(list);
        m86645g().mo25939d();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ol, viewGroup, false);
    }
}
