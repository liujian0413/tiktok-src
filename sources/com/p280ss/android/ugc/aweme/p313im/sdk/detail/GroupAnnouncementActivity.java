package com.p280ss.android.ugc.aweme.p313im.sdk.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.proto.GroupRole;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupAnnouncementEditActivity.C31133a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.C6966a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Calendar;
import java.util.HashMap;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity */
public final class GroupAnnouncementActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81675a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementActivity.class), "titleBar", "getTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementActivity.class), "ivAvatar", "getIvAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementActivity.class), "tvUserName", "getTvUserName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementActivity.class), "dividerLine", "getDividerLine()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementActivity.class), "tvTime", "getTvTime()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupAnnouncementActivity.class), "tvAnnouncement", "getTvAnnouncement()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: c */
    public static final C31123a f81676c = new C31123a(null);

    /* renamed from: b */
    public String f81677b;

    /* renamed from: d */
    private final C7541d f81678d = C7546e.m23569a(new C31128f(this));

    /* renamed from: e */
    private final C7541d f81679e = C7546e.m23569a(new C31127e(this));

    /* renamed from: f */
    private final C7541d f81680f = C7546e.m23569a(new C31131i(this));

    /* renamed from: g */
    private final C7541d f81681g = C7546e.m23569a(new C31124b(this));

    /* renamed from: h */
    private final C7541d f81682h = C7546e.m23569a(new C31130h(this));

    /* renamed from: i */
    private final C7541d f81683i = C7546e.m23569a(new C31129g(this));

    /* renamed from: j */
    private String f81684j;

    /* renamed from: k */
    private HashMap f81685k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$a */
    public static final class C31123a {
        private C31123a() {
        }

        public /* synthetic */ C31123a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m101494a(Context context, String str) {
            C7573i.m23587b(context, "context");
            Intent intent = new Intent(context, GroupAnnouncementActivity.class);
            intent.putExtra("conversationId", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$b */
    static final class C31124b extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81686a;

        C31124b(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81686a = groupAnnouncementActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f81686a.mo81618a((int) R.id.a9t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$c */
    static final class C31125c extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81687a;

        C31125c(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81687a = groupAnnouncementActivity;
            super(1);
        }

        /* renamed from: a */
        private void m101496a(int i) {
            this.f81687a.mo81621a(Integer.valueOf(i), false);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m101496a(((Number) obj).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$d */
    public static final class C31126d implements C31980a {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81688a;

        /* renamed from: a */
        public final void mo18096a() {
            this.f81688a.onBackPressed();
        }

        /* renamed from: b */
        public final void mo18097b() {
            String str;
            Context context = this.f81688a;
            String str2 = this.f81688a.f81677b;
            CharSequence text = this.f81688a.mo81619a().getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            C31133a.m101525a(context, str2, str);
        }

        C31126d(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81688a = groupAnnouncementActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$e */
    static final class C31127e extends Lambda implements C7561a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81689a;

        C31127e(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81689a = groupAnnouncementActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AvatarImageView invoke() {
            return (AvatarImageView) this.f81689a.mo81618a((int) R.id.b64);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$f */
    static final class C31128f extends Lambda implements C7561a<ImTextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81690a;

        C31128f(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81690a = groupAnnouncementActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImTextTitleBar invoke() {
            return (ImTextTitleBar) this.f81690a.mo81618a((int) R.id.djz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$g */
    static final class C31129g extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81691a;

        C31129g(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81691a = groupAnnouncementActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81691a.mo81618a((int) R.id.dqk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$h */
    static final class C31130h extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81692a;

        C31130h(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81692a = groupAnnouncementActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81692a.mo81618a((int) R.id.e3_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$i */
    static final class C31131i extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81693a;

        C31131i(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81693a = groupAnnouncementActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81693a.mo81618a((int) R.id.e4i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$j */
    static final class C31132j implements C6966a {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f81694a;

        C31132j(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f81694a = groupAnnouncementActivity;
        }

        /* renamed from: a */
        public final void mo18035a(IMUser iMUser) {
            this.f81694a.mo81620a(iMUser);
        }
    }

    /* renamed from: b */
    private final ImTextTitleBar m101483b() {
        return (ImTextTitleBar) this.f81678d.getValue();
    }

    /* renamed from: c */
    private final AvatarImageView m101484c() {
        return (AvatarImageView) this.f81679e.getValue();
    }

    /* renamed from: d */
    private final DmtTextView m101485d() {
        return (DmtTextView) this.f81680f.getValue();
    }

    /* renamed from: e */
    private final View m101486e() {
        return (View) this.f81681g.getValue();
    }

    /* renamed from: f */
    private final DmtTextView m101487f() {
        return (DmtTextView) this.f81682h.getValue();
    }

    /* renamed from: a */
    public final View mo81618a(int i) {
        if (this.f81685k == null) {
            this.f81685k = new HashMap();
        }
        View view = (View) this.f81685k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81685k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DmtTextView mo81619a() {
        return (DmtTextView) this.f81683i.getValue();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity", "onResume", true);
        super.onResume();
        m101489h();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity", "onResume", false);
    }

    /* renamed from: g */
    private final void m101488g() {
        if (this.f81677b != null && this.f81684j != null) {
            C31243a a = C31244a.m101818a();
            String str = this.f81677b;
            if (str == null) {
                C7573i.m23580a();
            }
            String str2 = this.f81684j;
            if (str2 == null) {
                C7573i.m23580a();
            }
            Integer a2 = a.mo81791a(str, str2);
            if (a2 != null) {
                mo81621a(Integer.valueOf(a2.intValue()), true);
            } else {
                C31244a.m101818a();
                String str3 = this.f81677b;
                if (str3 == null) {
                    C7573i.m23580a();
                }
                String str4 = this.f81684j;
                if (str4 == null) {
                    C7573i.m23580a();
                }
                C31243a.m101797a(str3, str4, (C7562b<? super Integer, C7581n>) new C31125c<Object,C7581n>(this));
            }
            m101483b().setTitle((int) R.string.a0g);
            m101483b().setOnTitlebarClickListener(new C31126d(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x004c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101489h() {
        /*
            r7 = this;
            com.bytedance.im.core.model.a r0 = com.bytedance.p263im.core.model.C6417a.m20015a()
            java.lang.String r1 = r7.f81677b
            com.bytedance.im.core.model.Conversation r0 = r0.mo15530a(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "GroupAnnouncementActivity updateAnnouncement: "
            r1.<init>(r2)
            r2 = 0
            if (r0 == 0) goto L_0x003f
            com.bytedance.im.core.model.ConversationCoreInfo r3 = r0.getCoreInfo()
            if (r3 == 0) goto L_0x003f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Map r5 = r3.getExt()
            java.lang.String r6 = "a:s_notice"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            java.lang.String r3 = r3.getNotice()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x0040
        L_0x003f:
            r3 = r2
        L_0x0040:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21555a(r1)
            if (r0 == 0) goto L_0x00b1
            com.bytedance.im.core.model.ConversationCoreInfo r0 = r0.getCoreInfo()
            if (r0 == 0) goto L_0x00b1
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mo81619a()
            java.lang.String r3 = r0.getNotice()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            java.util.Map r0 = r0.getExt()
            java.lang.String r1 = "a:s_notice"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00ad
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.GroupAnnouncementExtra> r1 = com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupAnnouncementExtra.class
            java.lang.Object r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103667a(r0, r1)     // Catch:{ Throwable -> 0x0076 }
            com.ss.android.ugc.aweme.im.sdk.group.model.GroupAnnouncementExtra r0 = (com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupAnnouncementExtra) r0     // Catch:{ Throwable -> 0x0076 }
            goto L_0x007b
        L_0x0076:
            r0 = move-exception
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r0)
            r0 = r2
        L_0x007b:
            if (r0 == 0) goto L_0x00a9
            boolean r1 = r0.isValid()
            if (r1 == 0) goto L_0x00a9
            long r1 = r0.getUpdateTime()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.m101482a(r1)
            com.ss.android.ugc.aweme.im.sdk.d.d r1 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            long r2 = r0.getUpdateUserId()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$j r2 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$j
            r2.<init>(r7)
            com.ss.android.ugc.aweme.im.sdk.d.d$a r2 = (com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.C6966a) r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r1.mo18020a(r0, r2)
            r7.mo81620a(r0)
            goto L_0x00b0
        L_0x00a9:
            r7.mo81620a(r2)
            goto L_0x00b1
        L_0x00ad:
            r7.mo81620a(r2)
        L_0x00b0:
            return
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupAnnouncementActivity.m101489h():void");
    }

    /* renamed from: a */
    private final void m101482a(String str) {
        if (str != null) {
            try {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(Long.parseLong(str) * 1000);
                if (instance != null) {
                    DmtTextView f = m101487f();
                    StringBuilder sb = new StringBuilder();
                    sb.append(instance.get(1));
                    sb.append(24180);
                    sb.append(instance.get(2) + 1);
                    sb.append(26376);
                    sb.append(instance.get(5));
                    sb.append("日 ");
                    sb.append(instance.get(11));
                    sb.append(':');
                    sb.append(instance.get(12));
                    f.setText(sb.toString());
                }
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.by);
        C6956a.m21633b().setupStatusBar(this);
        Intent intent = getIntent();
        String str2 = null;
        if (intent != null) {
            str = intent.getStringExtra("conversationId");
        } else {
            str = null;
        }
        this.f81677b = str;
        CharSequence b = C7074e.m22069b();
        if (b != null) {
            str2 = b.toString();
        }
        this.f81684j = str2;
        m101488g();
        StringBuilder sb = new StringBuilder("GroupAnnouncementActivity onCreate: ");
        sb.append(this.f81677b);
        sb.append(", ");
        sb.append(this.f81684j);
        C6921a.m21555a(sb.toString());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo81620a(IMUser iMUser) {
        int i;
        if (iMUser != null) {
            AvatarImageView c = m101484c();
            if (c == null) {
                C7573i.m23580a();
            }
            C23323e.m76524b(c, iMUser.getAvatarThumb());
            m101485d().setText(iMUser.getDisplayName());
            i = 0;
        } else {
            i = 8;
        }
        m101484c().setVisibility(i);
        m101485d().setVisibility(i);
        m101487f().setVisibility(i);
        m101486e().setVisibility(i);
    }

    /* renamed from: a */
    public final void mo81621a(Integer num, boolean z) {
        int i;
        DmtTextView rightTexView = m101483b().getRightTexView();
        C7573i.m23582a((Object) rightTexView, "titleBar.rightTexView");
        int value = GroupRole.OWNER.getValue();
        if (num != null && value == num.intValue()) {
            i = 0;
        } else {
            i = 8;
        }
        rightTexView.setVisibility(i);
        StringBuilder sb = new StringBuilder("GroupAnnouncementActivity updateTitleBar: ");
        sb.append(num);
        sb.append(", ");
        sb.append(z);
        C6921a.m21555a(sb.toString());
    }
}
