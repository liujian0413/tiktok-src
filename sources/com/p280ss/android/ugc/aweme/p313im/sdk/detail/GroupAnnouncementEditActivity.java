package com.p280ss.android.ugc.aweme.p313im.sdk.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.GroupRole;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatDetailActivity.C31149a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity */
public final class GroupAnnouncementEditActivity extends AmeActivity implements OnGlobalLayoutListener {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81695a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementEditActivity.class), "titleBar", "getTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementEditActivity.class), "editText", "getEditText()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementEditActivity.class), "editLimit", "getEditLimit()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementEditActivity.class), "templateLayout", "getTemplateLayout()Landroid/view/ViewGroup;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementEditActivity.class), "templateFillIn", "getTemplateFillIn()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementEditActivity.class), "statusView", "getStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;"))};

    /* renamed from: d */
    public static final C31133a f81696d = new C31133a(null);

    /* renamed from: b */
    public String f81697b;

    /* renamed from: c */
    public C6425b f81698c;

    /* renamed from: e */
    private ViewGroup f81699e;

    /* renamed from: f */
    private final C7541d f81700f = C7546e.m23569a(new C31148o(this));

    /* renamed from: g */
    private final C7541d f81701g = C7546e.m23569a(new C31136d(this));

    /* renamed from: h */
    private final C7541d f81702h = C7546e.m23569a(new C31135c(this));

    /* renamed from: i */
    private final C7541d f81703i = C7546e.m23569a(new C31147n(this));

    /* renamed from: j */
    private final C7541d f81704j = C7546e.m23569a(new C31146m(this));

    /* renamed from: k */
    private final C7541d f81705k = C7546e.m23569a(new C31145l(this));

    /* renamed from: l */
    private String f81706l;

    /* renamed from: m */
    private int f81707m;

    /* renamed from: n */
    private HashMap f81708n;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$a */
    public static final class C31133a {
        private C31133a() {
        }

        public /* synthetic */ C31133a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m101525a(Context context, String str, String str2) {
            C7573i.m23587b(context, "context");
            Intent intent = new Intent(context, GroupAnnouncementEditActivity.class);
            intent.putExtra("conversationId", str);
            intent.putExtra("editInfo", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$b */
    static final class C31134b extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f81709a;

        C31134b(C7562b bVar) {
            this.f81709a = bVar;
            super(1);
        }

        /* renamed from: a */
        private void m101526a(int i) {
            this.f81709a.invoke(Integer.valueOf(i));
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m101526a(((Number) obj).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$c */
    static final class C31135c extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81710a;

        C31135c(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81710a = groupAnnouncementEditActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81710a.mo81623a((int) R.id.dwu);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$d */
    static final class C31136d extends Lambda implements C7561a<DmtEditText> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81711a;

        C31136d(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81711a = groupAnnouncementEditActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtEditText invoke() {
            return (DmtEditText) this.f81711a.mo81623a((int) R.id.aby);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$e */
    public static final class C31137e implements C31980a {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81712a;

        /* renamed from: a */
        public final void mo18096a() {
            this.f81712a.onBackPressed();
        }

        /* renamed from: b */
        public final void mo18097b() {
            this.f81712a.mo81632g();
        }

        C31137e(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81712a = groupAnnouncementEditActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$f */
    public static final class C31138f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81713a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C31138f(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81713a = groupAnnouncementEditActivity;
        }

        public final void afterTextChanged(Editable editable) {
            this.f81713a.mo81628c();
            this.f81713a.mo81629d();
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f81713a.mo81630e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$g */
    static final class C31139g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81714a;

        C31139g(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81714a = groupAnnouncementEditActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81714a.mo81631f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$h */
    static final class C31140h<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81715a;

        C31140h(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81715a = groupAnnouncementEditActivity;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m101531a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101531a(C1592h<Void> hVar) {
            this.f81715a.mo81624a().setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$i */
    public static final class C31141i implements C11195b<Conversation> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81716a;

        C31141i(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81716a = groupAnnouncementEditActivity;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x004c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18089a(com.bytedance.p263im.core.model.Conversation r6) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r0 = r5.f81716a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r0.mo81627b()
                r1 = 8
                r0.setVisibility(r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "GroupAnnEditActivity onSuccess: "
                r0.<init>(r1)
                if (r6 == 0) goto L_0x003f
                com.bytedance.im.core.model.ConversationCoreInfo r1 = r6.getCoreInfo()
                if (r1 == 0) goto L_0x003f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.util.Map r3 = r1.getExt()
                java.lang.String r4 = "a:s_notice"
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                r2.append(r3)
                java.lang.String r3 = ", "
                r2.append(r3)
                java.lang.String r1 = r1.getNotice()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                goto L_0x0040
            L_0x003f:
                r1 = 0
            L_0x0040:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21555a(r0)
                if (r6 == 0) goto L_0x0062
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r0 = r5.f81716a
                android.content.Context r0 = (android.content.Context) r0
                r1 = 2131821564(0x7f1103fc, float:1.9275875E38)
                com.bytedance.ies.dmt.ui.c.a r0 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31383a(r0, r1)
                r0.mo25750a()
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r0 = r5.f81716a
                android.content.Context r0 = (android.content.Context) r0
                com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatDetailActivity.C31149a.m101576b(r0, r6)
                return
            L_0x0062:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity r6 = r5.f81716a
                r6.finish()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupAnnouncementEditActivity.C31141i.mo18089a(com.bytedance.im.core.model.Conversation):void");
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            String str;
            this.f81716a.mo81627b().setVisibility(8);
            StringBuilder sb = new StringBuilder("GroupAnnEditActivity onFailure: ");
            if (gVar != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(gVar.f30956a);
                sb2.append(", ");
                sb2.append(gVar.f30957b);
                sb2.append(", ");
                sb2.append(gVar.f30959d);
                sb2.append(", ");
                sb2.append(gVar.f30958c);
                sb2.append(", ");
                sb2.append(gVar.f30960e);
                str = sb2.toString();
            } else {
                str = null;
            }
            sb.append(str);
            C6921a.m21555a(sb.toString());
            C31257b.m101861a(this.f81716a, gVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$j */
    static final class C31142j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81717a;

        C31142j(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81717a = groupAnnouncementEditActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6425b bVar = this.f81717a.f81698c;
            if (bVar != null) {
                Conversation a = bVar.mo15562a();
                if (a != null) {
                    C31149a.m101576b(this.f81717a, a);
                    return;
                }
            }
            this.f81717a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$k */
    static final class C31143k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81718a;

        /* renamed from: b */
        final /* synthetic */ boolean f81719b;

        /* renamed from: c */
        final /* synthetic */ String f81720c;

        C31143k(GroupAnnouncementEditActivity groupAnnouncementEditActivity, boolean z, String str) {
            this.f81718a = groupAnnouncementEditActivity;
            this.f81719b = z;
            this.f81720c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C31858ad.m103406a();
            C31858ad.m103438a(this.f81718a.f81697b, this.f81719b);
            this.f81718a.mo81626a((C7562b<? super Integer, C7581n>) new C7562b<Integer, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C31143k f81721a;

                {
                    this.f81721a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m101535a((Integer) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m101535a(Integer num) {
                    this.f81721a.f81718a.mo81625a(num, this.f81721a.f81720c, this.f81721a.f81719b);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$l */
    static final class C31145l extends Lambda implements C7561a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81722a;

        C31145l(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81722a = groupAnnouncementEditActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtStatusView invoke() {
            return (DmtStatusView) this.f81722a.mo81623a((int) R.id.dav);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$m */
    static final class C31146m extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81723a;

        C31146m(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81723a = groupAnnouncementEditActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81723a.mo81623a((int) R.id.e36);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$n */
    static final class C31147n extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81724a;

        C31147n(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81724a = groupAnnouncementEditActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            return (RelativeLayout) this.f81724a.mo81623a((int) R.id.bsp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity$o */
    static final class C31148o extends Lambda implements C7561a<ImTextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementEditActivity f81725a;

        C31148o(GroupAnnouncementEditActivity groupAnnouncementEditActivity) {
            this.f81725a = groupAnnouncementEditActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImTextTitleBar invoke() {
            return (ImTextTitleBar) this.f81725a.mo81623a((int) R.id.djz);
        }
    }

    /* renamed from: h */
    private final ImTextTitleBar m101507h() {
        return (ImTextTitleBar) this.f81700f.getValue();
    }

    /* renamed from: i */
    private final DmtEditText m101508i() {
        return (DmtEditText) this.f81701g.getValue();
    }

    /* renamed from: j */
    private final DmtTextView m101509j() {
        return (DmtTextView) this.f81702h.getValue();
    }

    /* renamed from: k */
    private final DmtTextView m101510k() {
        return (DmtTextView) this.f81704j.getValue();
    }

    /* renamed from: a */
    public final View mo81623a(int i) {
        if (this.f81708n == null) {
            this.f81708n = new HashMap();
        }
        View view = (View) this.f81708n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81708n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ViewGroup mo81624a() {
        return (ViewGroup) this.f81703i.getValue();
    }

    /* renamed from: b */
    public final DmtStatusView mo81627b() {
        return (DmtStatusView) this.f81705k.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    /* renamed from: l */
    private final void m101511l() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f81706l = intent.getStringExtra("editInfo");
            this.f81697b = intent.getStringExtra("conversationId");
        }
        String str = this.f81697b;
        if (str != null) {
            this.f81698c = new C6425b(str);
        }
    }

    /* renamed from: n */
    private final void m101513n() {
        m101507h().setOnTitlebarClickListener(new C31137e(this));
        m101508i().addTextChangedListener(new C31138f(this));
        m101510k().setOnClickListener(new C31139g(this));
    }

    /* renamed from: o */
    private final void m101514o() {
        new C10741a(this).mo25657b((int) R.string.a0u).mo25650a((int) R.string.a0h, (DialogInterface.OnClickListener) null).mo25658b((int) R.string.a0t, (DialogInterface.OnClickListener) new C31142j(this)).mo25656a().mo25638b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81632g() {
        /*
            r4 = this;
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r4.m101508i()
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = ""
        L_0x0012:
            java.lang.String r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31873as.m103564a(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0025
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = ""
            r4.m101506a(r0, r3)
            return
        L_0x002e:
            r1 = 2
            r3 = 0
            r4.m101506a(r0, false)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupAnnouncementEditActivity.mo81632g():void");
    }

    public final void onBackPressed() {
        GroupAnnouncementEditActivity groupAnnouncementEditActivity;
        if (TextUtils.equals(this.f81706l, m101508i().getText())) {
            groupAnnouncementEditActivity = this;
        } else {
            groupAnnouncementEditActivity = null;
        }
        if (groupAnnouncementEditActivity != null) {
            super.onBackPressed();
        } else {
            m101514o();
        }
    }

    /* renamed from: m */
    private final void m101512m() {
        boolean z;
        View findViewById = findViewById(16908290);
        C7573i.m23582a((Object) findViewById, "findViewById(android.R.id.content)");
        this.f81699e = (ViewGroup) findViewById;
        ViewGroup viewGroup = this.f81699e;
        if (viewGroup == null) {
            C7573i.m23583a("contentView");
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this);
        String str = this.f81706l;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = null;
            }
            if (str != null) {
                m101508i().setText(str);
                m101508i().setSelection(str.length());
            }
        }
        m101507h().setTitle((int) R.string.a0g);
        mo81627b().setBuilder(C10803a.m31631a((Context) this).mo25953a());
        mo81628c();
        mo81629d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81628c() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f81706l
            if (r0 != 0) goto L_0x0006
            java.lang.String r0 = ""
        L_0x0006:
            java.lang.String r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31873as.m103564a(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.bytedance.ies.dmt.ui.widget.DmtEditText r1 = r2.m101508i()
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r1 = ""
        L_0x001e:
            java.lang.String r1 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31873as.m103564a(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r0 = r0 ^ 1
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r1 = r2.m101507h()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r1.getRightTexView()
            r1.setEnabled(r0)
            if (r0 == 0) goto L_0x003a
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x003a:
            r0 = 1051595899(0x3eae147b, float:0.34)
        L_0x003d:
            r1.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupAnnouncementEditActivity.mo81628c():void");
    }

    /* renamed from: d */
    public final void mo81629d() {
        int i;
        CharSequence charSequence;
        DmtTextView j = m101509j();
        Editable text = m101508i().getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        int i2 = 500 - i;
        if (i2 <= 4) {
            j.setVisibility(0);
            j.setTextColor(j.getResources().getColor(R.color.uu));
            charSequence = String.valueOf(i2);
        } else if (i2 <= 9) {
            j.setVisibility(0);
            j.setTextColor(j.getResources().getColor(R.color.a54));
            charSequence = String.valueOf(i2);
        } else {
            j.setVisibility(8);
            charSequence = "";
        }
        j.setText(charSequence);
    }

    /* renamed from: e */
    public final void mo81630e() {
        Editable text = m101508i().getText();
        if (text != null) {
            C7573i.m23582a((Object) text, "editText.text ?: return");
            if (text.length() > 500) {
                C10761a.m31403c((Context) this, getString(R.string.a0q)).mo25750a();
                int selectionEnd = Selection.getSelectionEnd(text);
                String obj = text.toString();
                if (obj != null) {
                    String substring = obj.substring(0, VETransitionFilterParam.TransitionDuration_DEFAULT);
                    C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    m101508i().setText(substring);
                    Editable text2 = m101508i().getText();
                    if (text2 != null) {
                        if (selectionEnd > text2.length()) {
                            selectionEnd = text2.length();
                        }
                        Selection.setSelection(text2, selectionEnd);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo81631f() {
        String str;
        boolean z;
        String str2;
        Editable text = m101508i().getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = getResources().getString(R.string.a0m);
        } else if (str.length() < 500) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(getResources().getString(R.string.a0m));
            str2 = sb.toString();
            if (str2.length() > 500) {
                if (str2 != null) {
                    str2 = str2.substring(0, VETransitionFilterParam.TransitionDuration_DEFAULT);
                    C7573i.m23582a((Object) str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        } else {
            C10761a.m31403c((Context) this, getString(R.string.a0q)).mo25750a();
            return;
        }
        m101508i().setText(str2);
        Editable text2 = m101508i().getText();
        if (text2 != null) {
            Selection.setSelection(text2, text2.length());
        }
        mo81629d();
    }

    public final void onGlobalLayout() {
        int a = C23486n.m77122a(80.0d);
        StringBuilder sb = new StringBuilder("onGlobalLayout: ");
        sb.append(this.f81707m);
        sb.append(", ");
        ViewGroup viewGroup = this.f81699e;
        if (viewGroup == null) {
            C7573i.m23583a("contentView");
        }
        sb.append(viewGroup.getHeight());
        sb.append(", ");
        sb.append(a);
        if (this.f81707m == 0) {
            ViewGroup viewGroup2 = this.f81699e;
            if (viewGroup2 == null) {
                C7573i.m23583a("contentView");
            }
            this.f81707m = viewGroup2.getHeight();
            return;
        }
        ViewGroup viewGroup3 = this.f81699e;
        if (viewGroup3 == null) {
            C7573i.m23583a("contentView");
        }
        if (viewGroup3.getHeight() - this.f81707m > a) {
            C1592h.m7848a(170).mo6876a((C1591g<TResult, TContinuationResult>) new C31140h<TResult,TContinuationResult>(this), C1592h.f5958b);
        } else {
            int i = this.f81707m;
            ViewGroup viewGroup4 = this.f81699e;
            if (viewGroup4 == null) {
                C7573i.m23583a("contentView");
            }
            if (i - viewGroup4.getHeight() > a) {
                mo81624a().setVisibility(0);
            }
        }
        ViewGroup viewGroup5 = this.f81699e;
        if (viewGroup5 == null) {
            C7573i.m23583a("contentView");
        }
        this.f81707m = viewGroup5.getHeight();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bz);
        C6956a.m21633b().setupStatusBar(this);
        m101511l();
        m101512m();
        m101513n();
        StringBuilder sb = new StringBuilder("GroupAnnEditActivity onCreate: conversationId=");
        sb.append(this.f81697b);
        sb.append(", rawEditInfo=");
        sb.append(this.f81706l);
        C6921a.m21555a(sb.toString());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementEditActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo81626a(C7562b<? super Integer, C7581n> bVar) {
        String str;
        CharSequence b = C7074e.m22069b();
        if (b != null) {
            str = b.toString();
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder("GroupAnnEditActivity checkPermission: ");
        sb.append(this.f81697b);
        sb.append(", ");
        sb.append(str);
        C6921a.m21555a(sb.toString());
        if (this.f81697b != null && str != null) {
            C31243a a = C31244a.m101818a();
            String str2 = this.f81697b;
            if (str2 == null) {
                C7573i.m23580a();
            }
            Integer a2 = a.mo81791a(str2, str);
            if (a2 != null) {
                bVar.invoke(Integer.valueOf(a2.intValue()));
                return;
            }
            C31244a.m101818a();
            String str3 = this.f81697b;
            if (str3 == null) {
                C7573i.m23580a();
            }
            C31243a.m101797a(str3, str, (C7562b<? super Integer, C7581n>) new C31134b<Object,C7581n>(bVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m101506a(String str, boolean z) {
        int i;
        int i2;
        if (z) {
            i = R.string.a0j;
        } else {
            i = R.string.a0r;
        }
        if (z) {
            i2 = R.string.a0k;
        } else {
            i2 = R.string.a0v;
        }
        new C10741a(this).mo25657b(i).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a(i2, (DialogInterface.OnClickListener) new C31143k(this, z, str)).mo25656a().mo25638b();
    }

    /* renamed from: a */
    public final void mo81625a(Integer num, String str, boolean z) {
        StringBuilder sb = new StringBuilder("GroupAnnEditActivity saveAnnouncementReal: ");
        sb.append(num);
        sb.append(", ");
        sb.append(this.f81697b);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(z);
        C6921a.m21555a(sb.toString());
        int value = GroupRole.OWNER.getValue();
        if (num != null && value == num.intValue()) {
            mo81627b().mo25942f();
            C6425b bVar = this.f81698c;
            if (bVar != null) {
                bVar.mo15574b(str, (C11195b<Conversation>) new C31141i<Conversation>(this));
                return;
            }
            return;
        }
        C6921a.m21555a("GroupAnnEditActivity not group owner");
        C10761a.m31399c((Context) this, (int) R.string.a0z).mo25750a();
    }
}
