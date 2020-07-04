package com.p280ss.android.ugc.aweme.p313im.sdk.group.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupPasswordDetail;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupPasswordInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupShareInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog */
public final class GroupInvitePasswordDialog extends AppCompatDialog {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81971a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mCloseBtn", "getMCloseBtn()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mAvatarView", "getMAvatarView()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mTitleTextView", "getMTitleTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mRetryTextView", "getMRetryTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mLoadingTextView", "getMLoadingTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mPasswordTextView", "getMPasswordTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mExpirationDateTextView", "getMExpirationDateTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mConfirmLayout", "getMConfirmLayout()Landroid/widget/LinearLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mConfirmImageView", "getMConfirmImageView()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupInvitePasswordDialog.class), "mConfirmTextView", "getMConfirmTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: d */
    public static final C31270a f81972d = new C31270a(null);

    /* renamed from: b */
    public final String f81973b;

    /* renamed from: c */
    public final int f81974c;

    /* renamed from: e */
    private final C7541d f81975e = C7546e.m23569a(new C31275f(this));

    /* renamed from: f */
    private final C7541d f81976f = C7546e.m23569a(new C31274e(this));

    /* renamed from: g */
    private final C7541d f81977g = C7546e.m23569a(new C31283n(this));

    /* renamed from: h */
    private final C7541d f81978h = C7546e.m23569a(new C31282m(this));

    /* renamed from: i */
    private final C7541d f81979i = C7546e.m23569a(new C31280k(this));

    /* renamed from: j */
    private final C7541d f81980j = C7546e.m23569a(new C31281l(this));

    /* renamed from: k */
    private final C7541d f81981k = C7546e.m23569a(new C31279j(this));

    /* renamed from: l */
    private final C7541d f81982l = C7546e.m23569a(new C31277h(this));

    /* renamed from: m */
    private final C7541d f81983m = C7546e.m23569a(new C31276g(this));

    /* renamed from: n */
    private final C7541d f81984n = C7546e.m23569a(new C31278i(this));

    /* renamed from: o */
    private Conversation f81985o;

    /* renamed from: p */
    private String f81986p;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$a */
    public static final class C31270a {
        private C31270a() {
        }

        public /* synthetic */ C31270a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$b */
    static final class C31271b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81987a;

        C31271b(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81987a = groupInvitePasswordDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f81987a.f81974c == 3) {
                C6956a a = C6956a.m21632a();
                C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                C7103h f = a.mo18009f();
                C7573i.m23582a((Object) view, "it");
                f.shareToTargetChannel(view.getContext(), "qq");
                C31858ad.m103406a();
                C31858ad.m103478g(this.f81987a.f81973b, "group_qq_command_copy_click");
            } else {
                C6956a a2 = C6956a.m21632a();
                C7573i.m23582a((Object) a2, "AwemeImManager.instance()");
                C7103h f2 = a2.mo18009f();
                C7573i.m23582a((Object) view, "it");
                f2.shareToTargetChannel(view.getContext(), "weixin");
                C31858ad.m103406a();
                C31858ad.m103478g(this.f81987a.f81973b, "group_wx_command_copy_click");
            }
            this.f81987a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$c */
    static final class C31272c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81988a;

        C31272c(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81988a = groupInvitePasswordDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81988a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$d */
    static final class C31273d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81989a;

        C31273d(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81989a = groupInvitePasswordDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81989a.mo81857a(0, (GroupShareInfo) null);
            this.f81989a.mo81856a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$e */
    static final class C31274e extends Lambda implements C7561a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81990a;

        C31274e(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81990a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AvatarImageView invoke() {
            return (AvatarImageView) this.f81990a.findViewById(R.id.b64);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$f */
    static final class C31275f extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81991a;

        C31275f(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81991a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f81991a.findViewById(R.id.b7g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$g */
    static final class C31276g extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81992a;

        C31276g(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81992a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f81992a.findViewById(R.id.b7s);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$h */
    static final class C31277h extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81993a;

        C31277h(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81993a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f81993a.findViewById(R.id.bgz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$i */
    static final class C31278i extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81994a;

        C31278i(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81994a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81994a.findViewById(R.id.ds9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$j */
    static final class C31279j extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81995a;

        C31279j(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81995a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81995a.findViewById(R.id.du_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$k */
    static final class C31280k extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81996a;

        C31280k(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81996a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81996a.findViewById(R.id.dxc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$l */
    static final class C31281l extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81997a;

        C31281l(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81997a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81997a.findViewById(R.id.dz6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$m */
    static final class C31282m extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81998a;

        C31282m(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81998a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81998a.findViewById(R.id.e0q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$n */
    static final class C31283n extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f81999a;

        C31283n(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f81999a = groupInvitePasswordDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81999a.findViewById(R.id.e3f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupInvitePasswordDialog$o */
    static final class C31284o<TTaskResult, TContinuationResult> implements C1591g<GroupShareInfo, Void> {

        /* renamed from: a */
        final /* synthetic */ GroupInvitePasswordDialog f82000a;

        C31284o(GroupInvitePasswordDialog groupInvitePasswordDialog) {
            this.f82000a = groupInvitePasswordDialog;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<GroupShareInfo> hVar) {
            if (hVar != null && hVar.mo6882b()) {
                GroupShareInfo groupShareInfo = (GroupShareInfo) hVar.mo6890e();
                if (groupShareInfo != null && groupShareInfo.status_code == 0) {
                    this.f82000a.mo81857a(1, (GroupShareInfo) hVar.mo6890e());
                    return null;
                }
            }
            this.f82000a.mo81857a(2, (GroupShareInfo) null);
            return null;
        }
    }

    /* renamed from: c */
    private final ImageView m101895c() {
        return (ImageView) this.f81975e.getValue();
    }

    /* renamed from: d */
    private final AvatarImageView m101896d() {
        return (AvatarImageView) this.f81976f.getValue();
    }

    /* renamed from: e */
    private final DmtTextView m101897e() {
        return (DmtTextView) this.f81977g.getValue();
    }

    /* renamed from: f */
    private final DmtTextView m101898f() {
        return (DmtTextView) this.f81978h.getValue();
    }

    /* renamed from: g */
    private final DmtTextView m101899g() {
        return (DmtTextView) this.f81979i.getValue();
    }

    /* renamed from: h */
    private final DmtTextView m101900h() {
        return (DmtTextView) this.f81980j.getValue();
    }

    /* renamed from: i */
    private final DmtTextView m101901i() {
        return (DmtTextView) this.f81981k.getValue();
    }

    /* renamed from: j */
    private final LinearLayout m101902j() {
        return (LinearLayout) this.f81982l.getValue();
    }

    /* renamed from: k */
    private final ImageView m101903k() {
        return (ImageView) this.f81983m.getValue();
    }

    /* renamed from: l */
    private final DmtTextView m101904l() {
        return (DmtTextView) this.f81984n.getValue();
    }

    /* renamed from: a */
    public final void mo81856a() {
        C7077s.m22147a(12, 2, this.f81973b, (C1591g<GroupShareInfo, Void>) new C31284o<GroupShareInfo,Void>(this));
    }

    /* renamed from: m */
    private final void m101905m() {
        this.f81985o = C31244a.m101818a().mo81790a(this.f81973b);
        String string = getContext().getString(R.string.bjn);
        C7573i.m23582a((Object) string, "context.getString(R.stri…password_expiration_date)");
        this.f81986p = string;
    }

    /* renamed from: p */
    private final void m101908p() {
        if (this.f81974c == 3) {
            C31858ad.m103406a();
            C31858ad.m103478g(this.f81973b, "group_qq_command_copy_show");
            return;
        }
        C31858ad.m103406a();
        C31858ad.m103478g(this.f81973b, "group_wx_command_copy_show");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101906n() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r3.m101896d()
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            com.bytedance.im.core.model.Conversation r1 = r3.f81985o
            r2 = 0
            if (r1 == 0) goto L_0x0016
            com.bytedance.im.core.model.ConversationCoreInfo r1 = r1.getCoreInfo()
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = r1.getIcon()
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r0, r1)
            int r0 = r3.f81974c
            r1 = 3
            if (r0 != r1) goto L_0x003e
            android.widget.LinearLayout r0 = r3.m101902j()
            r1 = 2131233197(0x7f0809ad, float:1.8082525E38)
            r0.setBackgroundResource(r1)
            android.widget.ImageView r0 = r3.m101903k()
            r1 = 2131233274(0x7f0809fa, float:1.808268E38)
            r0.setImageResource(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r3.m101904l()
            r1 = 2131823622(0x7f110c06, float:1.9280049E38)
            r0.setText(r1)
            goto L_0x005c
        L_0x003e:
            android.widget.LinearLayout r0 = r3.m101902j()
            r1 = 2131233198(0x7f0809ae, float:1.8082527E38)
            r0.setBackgroundResource(r1)
            android.widget.ImageView r0 = r3.m101903k()
            r1 = 2131233275(0x7f0809fb, float:1.8082683E38)
            r0.setImageResource(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r3.m101904l()
            r1 = 2131823623(0x7f110c07, float:1.928005E38)
            r0.setText(r1)
        L_0x005c:
            r0 = 0
            r3.mo81857a(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupInvitePasswordDialog.m101906n():void");
    }

    /* renamed from: o */
    private final void m101907o() {
        C31882a.m103579n().mo82725a(m101902j(), m101898f(), m101895c());
        m101902j().setOnClickListener(new C31271b(this));
        m101895c().setOnClickListener(new C31272c(this));
        m101898f().setOnClickListener(new C31273d(this));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView((int) R.layout.a70);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        m101905m();
        m101906n();
        m101907o();
        mo81856a();
    }

    /* renamed from: a */
    private static void m101894a(String str, String str2) {
        boolean z;
        Activity g = C6405d.m19984g();
        CharSequence charSequence = str2;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            CharSequence charSequence2 = str;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            }
            if (!z2 && g != null && !g.isFinishing()) {
                ClipboardManager clipboardManager = (ClipboardManager) g.getSystemService("clipboard");
                ClipData newPlainText = ClipData.newPlainText("", charSequence2);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                C6956a a = C6956a.m21632a();
                C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                a.mo18009f().saveShareCommandToSp(C7634n.m23711a(str2, "\n", "", false));
            }
        }
    }

    /* renamed from: a */
    public final void mo81857a(int i, GroupShareInfo groupShareInfo) {
        GroupPasswordInfo groupPasswordInfo;
        boolean z;
        CharSequence charSequence;
        boolean z2;
        CharSequence charSequence2;
        boolean z3;
        while (true) {
            switch (i) {
                case 0:
                    m101901i().setText(R.string.bjb);
                    m101897e().setText(R.string.bnz);
                    DmtTextView h = m101900h();
                    C7573i.m23582a((Object) h, "mPasswordTextView");
                    h.setVisibility(4);
                    DmtTextView g = m101899g();
                    C7573i.m23582a((Object) g, "mLoadingTextView");
                    g.setVisibility(0);
                    DmtTextView f = m101898f();
                    C7573i.m23582a((Object) f, "mRetryTextView");
                    f.setVisibility(8);
                    LinearLayout j = m101902j();
                    C7573i.m23582a((Object) j, "mConfirmLayout");
                    j.setEnabled(false);
                    LinearLayout j2 = m101902j();
                    C7573i.m23582a((Object) j2, "mConfirmLayout");
                    j2.setAlpha(0.5f);
                    return;
                case 1:
                    if (groupShareInfo != null) {
                        groupPasswordInfo = groupShareInfo.getGroupPasswordInfo();
                    } else {
                        groupPasswordInfo = null;
                    }
                    if (groupPasswordInfo != null) {
                        GroupPasswordInfo groupPasswordInfo2 = groupShareInfo.getGroupPasswordInfo();
                        if (groupPasswordInfo2 == null) {
                            C7573i.m23580a();
                        }
                        Collection groupPasswordDetailList = groupPasswordInfo2.getGroupPasswordDetailList();
                        if (groupPasswordDetailList == null || groupPasswordDetailList.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            GroupPasswordInfo groupPasswordInfo3 = groupShareInfo.getGroupPasswordInfo();
                            if (groupPasswordInfo3 == null) {
                                C7573i.m23580a();
                            }
                            List<GroupPasswordDetail> groupPasswordDetailList2 = groupPasswordInfo3.getGroupPasswordDetailList();
                            if (groupPasswordDetailList2 == null) {
                                break;
                            } else {
                                GroupPasswordDetail groupPasswordDetail = null;
                                for (GroupPasswordDetail groupPasswordDetail2 : groupPasswordDetailList2) {
                                    if (groupPasswordDetail2.getShareChannel() == this.f81974c) {
                                        groupPasswordDetail = groupPasswordDetail2;
                                    }
                                }
                                if (groupPasswordDetail != null) {
                                    charSequence = groupPasswordDetail.getToken();
                                } else {
                                    charSequence = null;
                                }
                                CharSequence charSequence3 = charSequence;
                                if (charSequence3 == null || charSequence3.length() == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    continue;
                                } else {
                                    if (groupPasswordDetail != null) {
                                        charSequence2 = groupPasswordDetail.getDescription();
                                    } else {
                                        charSequence2 = null;
                                    }
                                    CharSequence charSequence4 = charSequence2;
                                    if (charSequence4 == null || charSequence4.length() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        GroupPasswordInfo groupPasswordInfo4 = groupShareInfo.getGroupPasswordInfo();
                                        if (groupPasswordInfo4 == null) {
                                            C7573i.m23580a();
                                        }
                                        long expireTime = currentTimeMillis + (groupPasswordInfo4.getExpireTime() * 1000);
                                        String str = this.f81986p;
                                        if (str == null) {
                                            C7573i.m23583a("mExpirationDateFormat");
                                        }
                                        String format = new SimpleDateFormat(str, Locale.getDefault()).format(Long.valueOf(expireTime));
                                        DmtTextView i2 = m101901i();
                                        C7573i.m23582a((Object) i2, "mExpirationDateTextView");
                                        i2.setText(getContext().getString(R.string.bnw, new Object[]{format}));
                                        if (groupPasswordDetail == null) {
                                            C7573i.m23580a();
                                        }
                                        String token = groupPasswordDetail.getToken();
                                        DmtTextView h2 = m101900h();
                                        C7573i.m23582a((Object) h2, "mPasswordTextView");
                                        h2.setVisibility(0);
                                        DmtTextView h3 = m101900h();
                                        C7573i.m23582a((Object) h3, "mPasswordTextView");
                                        h3.setText(token);
                                        if (groupPasswordDetail == null) {
                                            C7573i.m23580a();
                                        }
                                        String description = groupPasswordDetail.getDescription();
                                        if (description == null) {
                                            C7573i.m23580a();
                                        }
                                        int a = C7634n.m23730a((CharSequence) description, "\n", 0, false, 6, (Object) null) + 1;
                                        if (groupPasswordDetail == null) {
                                            C7573i.m23580a();
                                        }
                                        String description2 = groupPasswordDetail.getDescription();
                                        if (description2 == null) {
                                            C7573i.m23580a();
                                        }
                                        StringBuilder sb = new StringBuilder(description2);
                                        IMUser fromUser = IMUser.fromUser(C7074e.m22071c());
                                        C7573i.m23582a((Object) fromUser, "IMUser.fromUser(AppUtil.getCurrentUser())");
                                        m101894a(sb.insert(a, fromUser.getDisplayName()).toString(), token);
                                        break;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    groupShareInfo = null;
                    i = 2;
                    break;
                default:
                    m101901i().setText(R.string.bja);
                    m101897e().setText(R.string.bny);
                    DmtTextView h4 = m101900h();
                    C7573i.m23582a((Object) h4, "mPasswordTextView");
                    h4.setVisibility(4);
                    DmtTextView f2 = m101898f();
                    C7573i.m23582a((Object) f2, "mRetryTextView");
                    f2.setVisibility(0);
                    DmtTextView g2 = m101899g();
                    C7573i.m23582a((Object) g2, "mLoadingTextView");
                    g2.setVisibility(8);
                    LinearLayout j3 = m101902j();
                    C7573i.m23582a((Object) j3, "mConfirmLayout");
                    j3.setEnabled(false);
                    LinearLayout j4 = m101902j();
                    C7573i.m23582a((Object) j4, "mConfirmLayout");
                    j4.setAlpha(0.5f);
                    return;
            }
        }
        m101897e().setText(R.string.bp_);
        DmtTextView g3 = m101899g();
        C7573i.m23582a((Object) g3, "mLoadingTextView");
        g3.setVisibility(8);
        DmtTextView f3 = m101898f();
        C7573i.m23582a((Object) f3, "mRetryTextView");
        f3.setVisibility(8);
        LinearLayout j5 = m101902j();
        C7573i.m23582a((Object) j5, "mConfirmLayout");
        j5.setEnabled(true);
        LinearLayout j6 = m101902j();
        C7573i.m23582a((Object) j6, "mConfirmLayout");
        j6.setAlpha(1.0f);
        m101908p();
    }

    public GroupInvitePasswordDialog(Context context, String str, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "conversationId");
        super(context);
        this.f81973b = str;
        this.f81974c = i;
    }
}
