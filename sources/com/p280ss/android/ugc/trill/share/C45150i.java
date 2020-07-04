package com.p280ss.android.ugc.trill.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.p280ss.android.ugc.aweme.base.widget.CanCancelRadioButton.C23495a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.share.C38247o;
import com.p280ss.android.ugc.aweme.share.SilentShareChannel;
import com.p280ss.android.ugc.aweme.share.SilentShareChannel.C37953a;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.trill.p1765g.C44998b;
import com.p280ss.android.ugc.trill.share.helo.C45123a;
import com.p280ss.android.ugc.trill.share.helo.C45123a.C45124a;
import com.p280ss.android.ugc.trill.share.helo.C45140b;
import com.p280ss.android.ugc.trill.share.helo.p1768a.C45138a;
import com.p280ss.android.ugc.trill.share.helo.p1768a.C45139b;
import com.p280ss.android.ugc.trill.share.helo.p1769b.C45144b;
import com.p280ss.android.ugc.trill.share.helo.p1769b.C45144b.C45145a;
import com.p280ss.android.ugc.trill.share.helo.p1771d.C45148a;
import com.p280ss.android.ugc.trill.share.helo.p1771d.C45149b;
import com.p280ss.android.ugc.trill.share.p1767a.C45078a;
import com.p280ss.android.ugc.trill.share.p1772ui.SilentSharePopupWindow;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.trill.share.i */
public final class C45150i extends C38247o {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f116006b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45150i.class), "heloGroup", "getHeloGroup()Landroid/widget/RadioGroup;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45150i.class), "heloButton", "getHeloButton()Lcom/ss/android/ugc/aweme/base/widget/CanCancelRadioButton;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45150i.class), "radioGroup", "getRadioGroup()Landroid/widget/RadioGroup;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45150i.class), "syncTitle", "getSyncTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: h */
    public static final C45151a f116007h = new C45151a(null);

    /* renamed from: c */
    public boolean f116008c;

    /* renamed from: d */
    public final List<Pair<SilentShareChannel, CanCancelRadioButton>> f116009d = new ArrayList();

    /* renamed from: e */
    public SilentSharePopupWindow f116010e;

    /* renamed from: f */
    public String f116011f = "";

    /* renamed from: g */
    public int f116012g = -1;

    /* renamed from: i */
    private final C7541d f116013i = C7546e.m23569a(new C45156f(this));

    /* renamed from: j */
    private final C7541d f116014j = C7546e.m23569a(new C45155e(this));

    /* renamed from: k */
    private final C7541d f116015k = C7546e.m23569a(new C45158h(this));

    /* renamed from: l */
    private int f116016l;

    /* renamed from: m */
    private final C7541d f116017m = C7546e.m23569a(new C45160j(this));

    /* renamed from: n */
    private int f116018n = 2;

    /* renamed from: o */
    private final Context f116019o;

    /* renamed from: p */
    private final int f116020p;

    /* renamed from: com.ss.android.ugc.trill.share.i$a */
    public static final class C45151a {
        private C45151a() {
        }

        public /* synthetic */ C45151a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$b */
    static final class C45152b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45150i f116021a;

        /* renamed from: b */
        final /* synthetic */ RadioGroup f116022b;

        C45152b(C45150i iVar, RadioGroup radioGroup) {
            this.f116021a = iVar;
            this.f116022b = radioGroup;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl isAwemePrivate = inst.getIsAwemePrivate();
            C7573i.m23582a((Object) isAwemePrivate, "SharePrefCache.inst().isAwemePrivate");
            Object d = isAwemePrivate.mo59877d();
            C7573i.m23582a(d, "SharePrefCache.inst().isAwemePrivate.cache");
            if (((Boolean) d).booleanValue()) {
                C10761a.m31410e(this.f116021a.getContext(), this.f116021a.getContext().getString(R.string.d5g)).mo25750a();
            } else if (!C38037a.m121403a()) {
                RadioGroup radioGroup = this.f116022b;
                C7573i.m23582a((Object) radioGroup, "radioGroup");
                if (radioGroup.getCheckedRadioButtonId() != -1) {
                    this.f116022b.check(-1);
                }
                for (Pair second : this.f116021a.f116009d) {
                    ((CanCancelRadioButton) second.getSecond()).setCanChecked(false);
                }
                C10761a.m31410e(this.f116021a.getContext(), this.f116021a.getContext().getString(R.string.ae8, new Object[]{C38037a.m121404b()})).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$c */
    static final class C45153c implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C45150i f116023a;

        C45153c(C45150i iVar) {
            this.f116023a = iVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            C45150i iVar = this.f116023a;
            if (iVar.f116012g != i) {
                if (i == -1) {
                    C23338f.m76562a().mo60629b("key_silent_share_save", 0);
                }
                if (!iVar.f116008c) {
                    iVar.f116008c = true;
                    Object service = ServiceManager.get().getService(IAVService.class);
                    C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
                    ((IAVService) service).getPublishService().cancelSynthetise(iVar.getContext());
                }
                if (iVar.f116010e != null && C45150i.m142336a(iVar).isShowing()) {
                    C45150i.m142336a(iVar).dismiss();
                }
                for (Pair pair : iVar.f116009d) {
                    if (((CanCancelRadioButton) pair.getSecond()).getId() == i) {
                        C23338f.m76562a().mo60629b("key_silent_share_save", ((SilentShareChannel) pair.getFirst()).getSaveType());
                        iVar.mo107711a((View) pair.getSecond(), ((SilentShareChannel) pair.getFirst()).getLabel());
                        iVar.mo107712a(true, ((SilentShareChannel) pair.getFirst()).getKey());
                    }
                    if (((CanCancelRadioButton) pair.getSecond()).getId() == iVar.f116012g) {
                        iVar.mo107712a(false, ((SilentShareChannel) pair.getFirst()).getKey());
                    }
                }
                iVar.f116012g = i;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$d */
    public static final class C45154d implements C45138a {

        /* renamed from: a */
        final /* synthetic */ C45150i f116024a;

        /* renamed from: a */
        public final void mo107625a() {
            CanCancelRadioButton heloButton = this.f116024a.getHeloButton();
            if (heloButton != null) {
                heloButton.setCanChecked(true);
            }
            CanCancelRadioButton heloButton2 = this.f116024a.getHeloButton();
            if (heloButton2 != null) {
                heloButton2.setChecked(true);
            }
            C45145a.m142328a().mo107695b(this.f116024a.mo107715f());
            C45145a.m142328a().mo107693a(true);
        }

        C45154d(C45150i iVar) {
            this.f116024a = iVar;
        }

        /* renamed from: a */
        public final void mo107626a(int i, String str, String str2) {
            CanCancelRadioButton heloButton = this.f116024a.getHeloButton();
            if (heloButton != null) {
                heloButton.setCanChecked(false);
            }
            CanCancelRadioButton heloButton2 = this.f116024a.getHeloButton();
            if (heloButton2 != null) {
                heloButton2.setChecked(false);
            }
            C45145a.m142328a().mo107695b(this.f116024a.mo107715f());
            C45145a.m142328a().mo107693a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$e */
    static final class C45155e extends Lambda implements C7561a<CanCancelRadioButton> {

        /* renamed from: a */
        final /* synthetic */ C45150i f116025a;

        C45155e(C45150i iVar) {
            this.f116025a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CanCancelRadioButton invoke() {
            return (CanCancelRadioButton) this.f116025a.findViewById(R.id.qb);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$f */
    static final class C45156f extends Lambda implements C7561a<RadioGroup> {

        /* renamed from: a */
        final /* synthetic */ C45150i f116026a;

        C45156f(C45150i iVar) {
            this.f116026a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RadioGroup invoke() {
            return (RadioGroup) this.f116026a.findViewById(R.id.asy);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$g */
    public static final class C45157g implements C45139b {

        /* renamed from: a */
        final /* synthetic */ C45150i f116027a;

        /* renamed from: b */
        final /* synthetic */ boolean f116028b;

        /* renamed from: c */
        final /* synthetic */ boolean f116029c;

        /* renamed from: a */
        public final void mo107627a(boolean z, boolean z2) {
            boolean z3;
            boolean z4;
            CanCancelRadioButton heloButton = this.f116027a.getHeloButton();
            boolean z5 = true;
            if (!this.f116028b || !C45150i.m142340c()) {
                z3 = false;
            } else {
                z3 = true;
            }
            heloButton.setCanChecked(z3);
            CanCancelRadioButton heloButton2 = this.f116027a.getHeloButton();
            C7573i.m23582a((Object) heloButton2, "heloButton");
            if (!this.f116028b || !C45150i.m142340c() || !this.f116029c) {
                z4 = false;
            } else {
                z4 = true;
            }
            heloButton2.setChecked(z4);
            C45145a.m142328a().mo107695b(this.f116027a.mo107715f());
            C45144b a = C45145a.m142328a();
            if (!z || !z2) {
                z5 = false;
            }
            a.mo107693a(z5);
        }

        C45157g(C45150i iVar, boolean z, boolean z2) {
            this.f116027a = iVar;
            this.f116028b = z;
            this.f116029c = z2;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$h */
    static final class C45158h extends Lambda implements C7561a<RadioGroup> {

        /* renamed from: a */
        final /* synthetic */ C45150i f116030a;

        C45158h(C45150i iVar) {
            this.f116030a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RadioGroup invoke() {
            return (RadioGroup) this.f116030a.findViewById(R.id.cmx);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$i */
    static final class C45159i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45150i f116031a;

        C45159i(C45150i iVar) {
            this.f116031a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C45078a aVar = (C45078a) C23336d.m76560a(this.f116031a.getContext(), C45078a.class);
            if (this.f116031a.mo107714e()) {
                C45145a.m142328a().mo107695b(this.f116031a.mo107715f());
                this.f116031a.mo107712a(this.f116031a.mo107715f(), "helo");
                return;
            }
            this.f116031a.getHeloButton().toggle();
            if (aVar.mo60412b(false)) {
                this.f116031a.mo107713d();
                return;
            }
            if (!C45150i.m142340c()) {
                this.f116031a.f116011f = "helo";
                this.f116031a.mo107716g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$j */
    static final class C45160j extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C45150i f116032a;

        C45160j(C45150i iVar) {
            this.f116032a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f116032a.findViewById(R.id.df8);
        }
    }

    private final RadioGroup getHeloGroup() {
        return (RadioGroup) this.f116013i.getValue();
    }

    private final RadioGroup getRadioGroup() {
        return (RadioGroup) this.f116015k.getValue();
    }

    private final DmtTextView getSyncTitle() {
        return (DmtTextView) this.f116017m.getValue();
    }

    /* renamed from: a */
    public final void mo95858a(int i, C23495a aVar) {
    }

    /* renamed from: a */
    public final void mo95859a(int i, boolean z) {
    }

    public final CanCancelRadioButton getHeloButton() {
        return (CanCancelRadioButton) this.f116014j.getValue();
    }

    public final void setSaveLocalEnabled(boolean z) {
    }

    /* renamed from: c */
    public static boolean m142340c() {
        C45124a.m142292a();
        return C45123a.m142284a();
    }

    /* renamed from: h */
    private final void m142341h() {
        m142342i();
        m142343j();
    }

    private final int getLayoutResId() {
        if (this.f116020p == 0) {
            return R.layout.b5b;
        }
        return R.layout.cl;
    }

    /* renamed from: e */
    public final boolean mo107714e() {
        CanCancelRadioButton heloButton = getHeloButton();
        if (heloButton != null) {
            return heloButton.f61972a;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo107715f() {
        CanCancelRadioButton heloButton = getHeloButton();
        if (heloButton != null) {
            return heloButton.isChecked();
        }
        return false;
    }

    /* renamed from: j */
    private final void m142343j() {
        if (C6399b.m19946v()) {
            C45123a a = C45124a.m142292a();
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            a.mo107684a(context, new C45149b(TutorialVideoApiManager.f89507a, "https://open-api.musical.ly"));
        }
    }

    /* renamed from: k */
    private final void m142344k() {
        CanCancelRadioButton heloButton = getHeloButton();
        if (heloButton != null) {
            heloButton.setOnClickListener(new C45159i(this));
        }
    }

    /* renamed from: n */
    private static boolean m142347n() {
        int i;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Integer closeSyncToHeloEntry = a.getCloseSyncToHeloEntry();
            if (closeSyncToHeloEntry == null) {
                C7573i.m23580a();
            }
            i = closeSyncToHeloEntry.intValue();
        } catch (NullValueException unused) {
            i = 0;
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private static boolean m142348o() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        AbTestModel d = a.mo18803bo();
        if (d == null || !d.enableSyncToHeloEntry) {
            return true;
        }
        return false;
    }

    private final String getUserName() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        C7573i.m23582a((Object) iUserService, "service");
        if (iUserService.getCurrentUser() == null) {
            return "";
        }
        User currentUser = iUserService.getCurrentUser();
        C7573i.m23582a((Object) currentUser, "service.currentUser");
        String nickname = currentUser.getNickname();
        C7573i.m23582a((Object) nickname, "service.currentUser.nickname");
        return nickname;
    }

    /* renamed from: a */
    public final void mo95855a() {
        C45124a.m142292a().mo107688b().mo107690a();
    }

    /* renamed from: b */
    public final String mo95860b() {
        ArrayList arrayList = new ArrayList();
        if (mo107715f()) {
            arrayList.add(Integer.valueOf(100));
        }
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C44998b.m141974a(";", arrayList);
    }

    /* renamed from: d */
    public final void mo107713d() {
        if (this.f116016l == 2) {
            C10761a.m31410e(getContext(), getContext().getString(R.string.w8)).mo25750a();
        } else {
            C10761a.m31410e(getContext(), getContext().getString(R.string.d5g)).mo25750a();
        }
    }

    /* renamed from: g */
    public final void mo107716g() {
        String userName = getUserName();
        String userAvatarUrl = getUserAvatarUrl();
        C45140b b = C45124a.m142292a().mo107688b();
        Fragment fragment = getFragment();
        C7573i.m23582a((Object) fragment, "fragment");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "fragment.activity!!");
        b.mo107692a((Activity) activity, new C45148a(userName, userAvatarUrl), new C45154d(this));
    }

    public final int getSaveUploadType() {
        for (Pair pair : this.f116009d) {
            if (((CanCancelRadioButton) pair.getSecond()).getId() == getRadioGroup().getCheckedRadioButtonId()) {
                return ((SilentShareChannel) pair.getFirst()).getSaveType();
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r0.isLogin() == false) goto L_0x0040;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m142346m() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r1 = com.p280ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.p280ss.android.ugc.aweme.framework.services.IUserService) r0
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x0056
            android.app.Activity r1 = (android.app.Activity) r1
            java.util.List r1 = com.p280ss.android.ugc.aweme.share.SilentShareChannel.C37953a.m121242a(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0023
            return
        L_0x0023:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r1 == 0) goto L_0x0040
            boolean r1 = m142347n()
            if (r1 != 0) goto L_0x0040
            boolean r1 = m142348o()
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "service"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x0055
        L_0x0040:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r2.getSyncTitle()
            java.lang.String r1 = "syncTitle"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            android.widget.RadioGroup r0 = r2.getRadioGroup()
            r0.setVisibility(r1)
        L_0x0055:
            return
        L_0x0056:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.trill.share.C45150i.m142346m():void");
    }

    private final String getUserAvatarUrl() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        C7573i.m23582a((Object) iUserService, "service");
        if (iUserService.getCurrentUser() != null) {
            User currentUser = iUserService.getCurrentUser();
            C7573i.m23582a((Object) currentUser, "service.currentUser");
            if (currentUser.getAvatarMedium() != null) {
                User currentUser2 = iUserService.getCurrentUser();
                C7573i.m23582a((Object) currentUser2, "service.currentUser");
                UrlModel avatarMedium = currentUser2.getAvatarMedium();
                C7573i.m23582a((Object) avatarMedium, "service.currentUser.avatarMedium");
                if (avatarMedium.getUrlList() != null) {
                    User currentUser3 = iUserService.getCurrentUser();
                    C7573i.m23582a((Object) currentUser3, "service.currentUser");
                    UrlModel avatarMedium2 = currentUser3.getAvatarMedium();
                    C7573i.m23582a((Object) avatarMedium2, "service.currentUser.avatarMedium");
                    if (avatarMedium2.getUrlList().size() != 0) {
                        User currentUser4 = iUserService.getCurrentUser();
                        C7573i.m23582a((Object) currentUser4, "service.currentUser");
                        UrlModel avatarMedium3 = currentUser4.getAvatarMedium();
                        C7573i.m23582a((Object) avatarMedium3, "service.currentUser.avatarMedium");
                        Object obj = avatarMedium3.getUrlList().get(0);
                        C7573i.m23582a(obj, "service.currentUser.avatarMedium.urlList[0]");
                        return (String) obj;
                    }
                }
            }
        }
        return "";
    }

    /* renamed from: i */
    private final void m142342i() {
        boolean z;
        if (getHeloButton() != null) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (C6399b.m19946v() && !m142347n() && !m142348o()) {
                C7573i.m23582a((Object) iUserService, "service");
                if (iUserService.isLogin()) {
                    RadioGroup heloGroup = getHeloGroup();
                    C7573i.m23582a((Object) heloGroup, "heloGroup");
                    boolean z2 = false;
                    heloGroup.setVisibility(0);
                    C45078a aVar = (C45078a) C23336d.m76560a(getContext(), C45078a.class);
                    boolean b = C45145a.m142328a().mo107696b();
                    boolean z3 = !aVar.mo60412b(false);
                    CanCancelRadioButton heloButton = getHeloButton();
                    if (!z3 || !m142340c()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    heloButton.setCanChecked(z);
                    CanCancelRadioButton heloButton2 = getHeloButton();
                    C7573i.m23582a((Object) heloButton2, "heloButton");
                    if (z3 && m142340c() && b) {
                        z2 = true;
                    }
                    heloButton2.setChecked(z2);
                    C45124a.m142292a().mo107687a(new C45157g(this, z3, b));
                }
            }
        }
    }

    /* renamed from: l */
    private final void m142345l() {
        int i;
        if (getContext() instanceof Activity) {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.cmx);
            Context context = getContext();
            if (context != null) {
                List a = C37953a.m121242a((Activity) context);
                if (a.isEmpty()) {
                    m142346m();
                    return;
                }
                Iterable iterable = a;
                if (m142348o()) {
                    i = 4;
                } else {
                    i = 3;
                }
                for (SilentShareChannel silentShareChannel : C7525m.m23505c(iterable, i)) {
                    View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a_5, radioGroup, false);
                    if (inflate != null) {
                        CanCancelRadioButton canCancelRadioButton = (CanCancelRadioButton) inflate;
                        canCancelRadioButton.setTag(silentShareChannel);
                        canCancelRadioButton.setBackground(getResources().getDrawable(silentShareChannel.getIconRes()));
                        canCancelRadioButton.setId(View.generateViewId());
                        canCancelRadioButton.setOnClickListener(new C45152b(this, radioGroup));
                        if (!C38037a.m121403a()) {
                            canCancelRadioButton.setAlpha(0.34f);
                        }
                        radioGroup.addView(canCancelRadioButton);
                        this.f116009d.add(new Pair(silentShareChannel, canCancelRadioButton));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton");
                    }
                }
                int a2 = C23338f.m76562a().mo60620a("key_silent_share_save", 0);
                for (Pair pair : this.f116009d) {
                    if (((SilentShareChannel) pair.getFirst()).getSaveType() == a2) {
                        ((CanCancelRadioButton) pair.getSecond()).setChecked(true);
                        this.f116012g = ((CanCancelRadioButton) pair.getSecond()).getId();
                    }
                }
                if (!C38037a.m121403a()) {
                    radioGroup.clearCheck();
                }
                radioGroup.setOnCheckedChangeListener(new C45153c(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public final void setSyncShareViewTextColor(int i) {
        getSyncTitle().setTextColor(i);
    }

    /* renamed from: a */
    public static final /* synthetic */ SilentSharePopupWindow m142336a(C45150i iVar) {
        SilentSharePopupWindow silentSharePopupWindow = iVar.f116010e;
        if (silentSharePopupWindow == null) {
            C7573i.m23583a("popupWindow");
        }
        return silentSharePopupWindow;
    }

    public final void setSyncShareViewTextSize(float f) {
        DmtTextView syncTitle = getSyncTitle();
        C7573i.m23582a((Object) syncTitle, "syncTitle");
        syncTitle.setTextSize(f);
    }

    public final void setSyncShareViewTitle(String str) {
        DmtTextView syncTitle = getSyncTitle();
        C7573i.m23582a((Object) syncTitle, "syncTitle");
        syncTitle.setText(str);
    }

    /* renamed from: a */
    private static String m142337a(Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2 != null) {
                return obj2;
            }
        }
        return "";
    }

    public final void setSyncIconSize(int i) {
        for (Pair second : this.f116009d) {
            LayoutParams layoutParams = ((CanCancelRadioButton) second.getSecond()).getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
        }
    }

    /* renamed from: a */
    private final void m142338a(boolean z) {
        if (z) {
            if (getRadioGroup().getCheckedRadioButtonId() != -1) {
                getRadioGroup().check(-1);
            }
            for (Pair second : this.f116009d) {
                ((CanCancelRadioButton) second.getSecond()).setCanChecked(false);
            }
            return;
        }
        for (Pair second2 : this.f116009d) {
            ((CanCancelRadioButton) second2.getSecond()).setCanChecked(true);
        }
    }

    /* renamed from: b */
    private final void m142339b(boolean z) {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (C6399b.m19946v() && !m142347n() && !m142348o()) {
            C7573i.m23582a((Object) iUserService, "service");
            if (iUserService.isLogin()) {
                if (z) {
                    getHeloButton().setCanChecked(false);
                    if (getHeloGroup() != null) {
                        RadioGroup heloGroup = getHeloGroup();
                        C7573i.m23582a((Object) heloGroup, "heloGroup");
                        int checkedRadioButtonId = heloGroup.getCheckedRadioButtonId();
                        CanCancelRadioButton heloButton = getHeloButton();
                        if (heloButton == null) {
                            C7573i.m23580a();
                        }
                        if (checkedRadioButtonId == heloButton.getId()) {
                            getHeloGroup().check(-1);
                        }
                    }
                } else {
                    getHeloButton().setCanChecked(m142340c());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo95856a(int i) {
        boolean z;
        int i2 = 0;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f116016l = i;
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl isAwemePrivate = inst.getIsAwemePrivate();
        C7573i.m23582a((Object) isAwemePrivate, "SharePrefCache.inst().isAwemePrivate");
        isAwemePrivate.mo59871a(Boolean.valueOf(z));
        ((C45078a) C23336d.m76560a(getContext(), C45078a.class)).mo60411a(z);
        m142339b(z);
        m142338a(z);
        DmtTextView syncTitle = getSyncTitle();
        C7573i.m23582a((Object) syncTitle, "syncTitle");
        if (z) {
            i2 = 8;
        }
        syncTitle.setVisibility(i2);
        m142346m();
    }

    public C45150i(Context context, int i) {
        C7573i.m23587b(context, "ctx");
        super(context);
        this.f116019o = context;
        this.f116020p = i;
        LayoutInflater.from(this.f116019o).inflate(getLayoutResId(), this, true);
        m142345l();
        m142344k();
        m142341h();
    }

    /* renamed from: a */
    public final void mo107711a(View view, String str) {
        int i;
        int width;
        if (C23338f.m76562a().mo60620a("key_pop_up_window_share_count", 0) < 3) {
            if (!m142348o() || this.f116018n > 0) {
                this.f116018n--;
                if (this.f116010e != null) {
                    SilentSharePopupWindow silentSharePopupWindow = this.f116010e;
                    if (silentSharePopupWindow == null) {
                        C7573i.m23583a("popupWindow");
                    }
                    if (silentSharePopupWindow.isShowing()) {
                        SilentSharePopupWindow silentSharePopupWindow2 = this.f116010e;
                        if (silentSharePopupWindow2 == null) {
                            C7573i.m23583a("popupWindow");
                        }
                        silentSharePopupWindow2.dismiss();
                    }
                }
                Context context = getContext();
                C7573i.m23582a((Object) context, "context");
                String string = getResources().getString(R.string.ddu, new Object[]{str});
                C7573i.m23582a((Object) string, "resources.getString(R.st…direct_share_hint, label)");
                SilentSharePopupWindow silentSharePopupWindow3 = new SilentSharePopupWindow(context, string, (int) C20505c.m68010a(getContext(), 3.0f), 0, 8, null);
                this.f116010e = silentSharePopupWindow3;
                SilentSharePopupWindow silentSharePopupWindow4 = this.f116010e;
                if (silentSharePopupWindow4 == null) {
                    C7573i.m23583a("popupWindow");
                }
                silentSharePopupWindow4.getContentView().measure(0, 0);
                float a = C20505c.m68010a(getContext(), 10.0f);
                SilentSharePopupWindow silentSharePopupWindow5 = this.f116010e;
                if (silentSharePopupWindow5 == null) {
                    C7573i.m23583a("popupWindow");
                }
                View contentView = silentSharePopupWindow5.getContentView();
                C7573i.m23582a((Object) contentView, "popupWindow.contentView");
                int measuredWidth = contentView.getMeasuredWidth();
                SilentSharePopupWindow silentSharePopupWindow6 = this.f116010e;
                if (silentSharePopupWindow6 == null) {
                    C7573i.m23583a("popupWindow");
                }
                View contentView2 = silentSharePopupWindow6.getContentView();
                C7573i.m23582a((Object) contentView2, "popupWindow.contentView");
                int measuredHeight = contentView2.getMeasuredHeight();
                SilentSharePopupWindow silentSharePopupWindow7 = this.f116010e;
                if (silentSharePopupWindow7 == null) {
                    C7573i.m23583a("popupWindow");
                }
                ImageView imageView = (ImageView) silentSharePopupWindow7.getContentView().findViewById(R.id.b6c);
                SilentSharePopupWindow silentSharePopupWindow8 = this.f116010e;
                if (silentSharePopupWindow8 == null) {
                    C7573i.m23583a("popupWindow");
                }
                ImageView imageView2 = (ImageView) silentSharePopupWindow8.getContentView().findViewById(R.id.b6d);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int a2 = C20505c.m68011a(this.f116019o);
                int width2 = iArr[0] + (view.getWidth() / 2);
                int i2 = measuredWidth / 2;
                float f = (float) width2;
                if (((float) i2) + a > f) {
                    int i3 = (int) (a - ((float) iArr[0]));
                    C7573i.m23582a((Object) imageView, "left");
                    imageView.getLayoutParams().width = (int) (f - a);
                    C7573i.m23582a((Object) imageView2, "right");
                    imageView2.getLayoutParams().width = measuredWidth - imageView.getLayoutParams().width;
                    i = i3;
                } else {
                    float f2 = ((float) a2) - a;
                    if (((float) (width2 + i2)) > f2) {
                        width = (int) (f2 - ((float) (iArr[0] + measuredWidth)));
                        C7573i.m23582a((Object) imageView2, "right");
                        imageView2.getLayoutParams().width = (int) (f2 - f);
                        C7573i.m23582a((Object) imageView, "left");
                        imageView.getLayoutParams().width = measuredWidth - imageView2.getLayoutParams().width;
                    } else {
                        width = (view.getWidth() - measuredWidth) / 2;
                        C7573i.m23582a((Object) imageView, "left");
                        imageView.getLayoutParams().width = i2;
                        C7573i.m23582a((Object) imageView2, "right");
                        imageView2.getLayoutParams().width = i2;
                    }
                    i = width;
                }
                imageView.getLayoutParams().height = measuredHeight;
                imageView2.getLayoutParams().height = measuredHeight;
                SilentSharePopupWindow silentSharePopupWindow9 = this.f116010e;
                if (silentSharePopupWindow9 == null) {
                    C7573i.m23583a("popupWindow");
                }
                silentSharePopupWindow9.mo107721a();
                try {
                    SilentSharePopupWindow silentSharePopupWindow10 = this.f116010e;
                    if (silentSharePopupWindow10 == null) {
                        C7573i.m23583a("popupWindow");
                    }
                    silentSharePopupWindow10.m142369a(view, i, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo107712a(boolean z, String str) {
        String str2;
        Object tag = getTag();
        if (!(tag instanceof Map)) {
            tag = null;
        }
        Map map = (Map) tag;
        if (map != null) {
            if (z) {
                str2 = "publish_share_confirm";
            } else {
                str2 = "publish_share_cancel";
            }
            C6907h.m21524a(str2, (Map) C22984d.m75611a().mo59973a("creation_id", m142337a(map.get("creation_id"))).mo59973a("enter_from", m142337a(map.get("enter_from"))).mo59973a("content_type", m142337a(map.get("content_type"))).mo59973a("shoot_way", m142337a(map.get("shoot_way"))).mo59973a("share_to", str).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo95857a(int i, int i2, Intent intent) {
        String str = this.f116011f;
        if (str.hashCode() == 3198784 && str.equals("helo")) {
            C45124a.m142292a().mo107688b().mo107691a(i, i2, intent);
        }
    }
}
