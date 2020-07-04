package com.p280ss.android.ugc.aweme.p313im.sdk.detail;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.C6433e;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.GroupRole;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.C30753a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupAnnouncementActivity.C31123a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupAnnouncementEditActivity.C31133a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatMembersActivity.C31170a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.adapter.MemberListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.C31189a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.C31190b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupInvitePasswordDialog;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31080b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity */
public final class GroupChatDetailActivity extends BaseChatDetailActivity implements OnClickListener {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f81726f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mAvatarListView", "getMAvatarListView()Landroid/support/v7/widget/RecyclerView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mMoreMemberView", "getMMoreMemberView()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mGroupNameView", "getMGroupNameView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mGroupNickName", "getMGroupNickName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mGroupAnnouncement", "getMGroupAnnouncement()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mGroupAnnouncementNotSet", "getMGroupAnnouncementNotSet()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mInviteQQFriendsLayout", "getMInviteQQFriendsLayout()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mInviteWechatFriendsLayout", "getMInviteWechatFriendsLayout()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mReportLayout", "getMReportLayout()Landroid/widget/RelativeLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mExitGroupChatLayout", "getMExitGroupChatLayout()Landroid/widget/RelativeLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mEditGroupNameLayout", "getMEditGroupNameLayout()Landroid/widget/RelativeLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mEditGroupNicknameLayout", "getMEditGroupNicknameLayout()Landroid/widget/RelativeLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatDetailActivity.class), "mEditGroupAnnouncementLayout", "getMEditGroupAnnouncementLayout()Landroid/widget/RelativeLayout;"))};

    /* renamed from: h */
    public static final C31149a f81727h = new C31149a(null);

    /* renamed from: A */
    private IMMember f81728A;

    /* renamed from: B */
    private HashMap f81729B;

    /* renamed from: g */
    public Conversation f81730g;

    /* renamed from: i */
    private final C7541d f81731i = C7546e.m23569a(new C31155f(this));

    /* renamed from: j */
    private final C7541d f81732j = C7546e.m23569a(new C31166q(this));

    /* renamed from: k */
    private final C7541d f81733k = C7546e.m23569a(new C31162m(this));

    /* renamed from: l */
    private final C7541d f81734l = C7546e.m23569a(new C31163n(this));

    /* renamed from: m */
    private final C7541d f81735m = C7546e.m23569a(new C31160k(this));

    /* renamed from: n */
    private final C7541d f81736n = C7546e.m23569a(new C31161l(this));

    /* renamed from: o */
    private final C7541d f81737o = C7546e.m23569a(new C31164o(this));

    /* renamed from: p */
    private final C7541d f81738p = C7546e.m23569a(new C31165p(this));

    /* renamed from: q */
    private final C7541d f81739q = C7546e.m23569a(new C31167r(this));

    /* renamed from: r */
    private final C7541d f81740r = C7546e.m23569a(new C31159j(this));

    /* renamed from: s */
    private final C7541d f81741s = C7546e.m23569a(new C31157h(this));

    /* renamed from: t */
    private final C7541d f81742t = C7546e.m23569a(new C31158i(this));

    /* renamed from: u */
    private final C7541d f81743u = C7546e.m23569a(new C31156g(this));

    /* renamed from: v */
    private MemberListAdapter f81744v;

    /* renamed from: w */
    private ArrayList<IMMember> f81745w = new ArrayList<>();

    /* renamed from: x */
    private final ArrayList<C30753a> f81746x = new ArrayList<>();

    /* renamed from: y */
    private C31190b f81747y;

    /* renamed from: z */
    private C31189a f81748z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$a */
    public static final class C31149a {
        private C31149a() {
        }

        public /* synthetic */ C31149a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m101575a(Context context, Conversation conversation) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(conversation, "conversation");
            Intent intent = new Intent(context, GroupChatDetailActivity.class);
            intent.putExtra("conversation", conversation);
            context.startActivity(intent);
        }

        /* renamed from: b */
        public static void m101576b(Context context, Conversation conversation) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(conversation, "conversation");
            Intent intent = new Intent(context, GroupChatDetailActivity.class);
            intent.putExtra("conversation", conversation);
            intent.setFlags(67108864);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$b */
    static final class C31150b extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81749a;

        /* renamed from: b */
        final /* synthetic */ String f81750b;

        C31150b(GroupChatDetailActivity groupChatDetailActivity, String str) {
            this.f81749a = groupChatDetailActivity;
            this.f81750b = str;
            super(1);
        }

        /* renamed from: a */
        private void m101577a(int i) {
            this.f81749a.mo81641a(this.f81750b, Integer.valueOf(i), false);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m101577a(((Number) obj).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$c */
    static final class C31151c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81751a;

        C31151c(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81751a = groupChatDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            String str;
            if (this.f81751a.f81730g != null) {
                Conversation conversation = this.f81751a.f81730g;
                if (conversation == null) {
                    C7573i.m23580a();
                }
                CharSequence conversationId = conversation.getConversationId();
                if (conversationId == null || conversationId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C6417a a = C6417a.m20015a();
                    Conversation conversation2 = this.f81751a.f81730g;
                    String str2 = null;
                    if (conversation2 != null) {
                        str = conversation2.getConversationId();
                    } else {
                        str = null;
                    }
                    if (a.mo15530a(str) != null) {
                        C6425b bVar = this.f81751a.f81618e;
                        if (bVar != null) {
                            bVar.mo15573b((C11195b<String>) new C11195b<String>(this) {

                                /* renamed from: a */
                                final /* synthetic */ C31151c f81752a;

                                {
                                    this.f81752a = r1;
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void mo18089a(String str) {
                                    C7195s.m22438a().mo18679a((Activity) this.f81752a.f81751a, "aweme://main");
                                }

                                /* renamed from: a */
                                public final void mo18088a(C11438g gVar) {
                                    C31257b.m101861a(this.f81752a.f81751a, gVar);
                                }
                            });
                        }
                    }
                    C31858ad.m103406a();
                    Conversation conversation3 = this.f81751a.f81730g;
                    if (conversation3 != null) {
                        str2 = conversation3.getConversationId();
                    }
                    C31858ad.m103478g(str2, "quit_group");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$d */
    public static final class C31153d implements C31980a {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81753a;

        /* renamed from: b */
        public final void mo18097b() {
        }

        /* renamed from: a */
        public final void mo18096a() {
            this.f81753a.finish();
        }

        C31153d(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81753a = groupChatDetailActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$e */
    public static final class C31154e extends C31080b {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81754a;

        C31154e(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81754a = groupChatDetailActivity;
        }

        /* renamed from: a */
        public final void mo15537a(List<Member> list) {
            super.mo15537a(list);
            this.f81754a.mo81642h();
        }

        /* renamed from: b */
        public final void mo15540b(Conversation conversation) {
            super.mo15540b(conversation);
            this.f81754a.f81730g = conversation;
            this.f81754a.mo81642h();
        }

        /* renamed from: b */
        public final void mo15542b(List<Member> list) {
            super.mo15542b(list);
            this.f81754a.mo81642h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$f */
    static final class C31155f extends Lambda implements C7561a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81755a;

        C31155f(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81755a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecyclerView invoke() {
            return (RecyclerView) this.f81755a.mo81586a((int) R.id.cxc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$g */
    static final class C31156g extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81756a;

        C31156g(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81756a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            return (RelativeLayout) this.f81756a.mo81586a((int) R.id.bh_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$h */
    static final class C31157h extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81757a;

        C31157h(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81757a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            return (RelativeLayout) this.f81757a.mo81586a((int) R.id.bhb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$i */
    static final class C31158i extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81758a;

        C31158i(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81758a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            return (RelativeLayout) this.f81758a.mo81586a((int) R.id.bhc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$j */
    static final class C31159j extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81759a;

        C31159j(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81759a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            return (RelativeLayout) this.f81759a.mo81586a((int) R.id.bhg);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$k */
    static final class C31160k extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81760a;

        C31160k(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81760a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f81760a.mo81586a((int) R.id.dv_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$l */
    static final class C31161l extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81761a;

        C31161l(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81761a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81761a.mo81586a((int) R.id.dva);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$m */
    static final class C31162m extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81762a;

        C31162m(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81762a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81762a.mo81586a((int) R.id.dvb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$n */
    static final class C31163n extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81763a;

        C31163n(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81763a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f81763a.mo81586a((int) R.id.dvc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$o */
    static final class C31164o extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81764a;

        C31164o(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81764a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f81764a.mo81586a((int) R.id.bi0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$p */
    static final class C31165p extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81765a;

        C31165p(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81765a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f81765a.mo81586a((int) R.id.bi1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$q */
    static final class C31166q extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81766a;

        C31166q(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81766a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f81766a.mo81586a((int) R.id.dxz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$r */
    static final class C31167r extends Lambda implements C7561a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81767a;

        C31167r(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81767a = groupChatDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RelativeLayout invoke() {
            return (RelativeLayout) this.f81767a.mo81586a((int) R.id.bjd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$s */
    static final class C31168s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f81768a;

        C31168s(GroupChatDetailActivity groupChatDetailActivity) {
            this.f81768a = groupChatDetailActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r0 = r9.f81768a
                com.bytedance.im.core.model.Conversation r0 = r0.f81730g
                r1 = 0
                if (r0 == 0) goto L_0x0016
                com.bytedance.im.core.model.ConversationCoreInfo r0 = r0.getCoreInfo()
                if (r0 == 0) goto L_0x0016
                long r2 = r0.getOwner()
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                goto L_0x0017
            L_0x0016:
                r0 = r1
            L_0x0017:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r2 = r9.f81768a
                com.bytedance.im.core.model.Conversation r2 = r2.f81730g
                if (r2 == 0) goto L_0x0022
                java.lang.String r2 = r2.getConversationId()
                goto L_0x0023
            L_0x0022:
                r2 = r1
            L_0x0023:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r3 = r9.f81768a
                com.bytedance.im.core.model.Conversation r3 = r3.f81730g
                if (r3 == 0) goto L_0x0032
                long r3 = r3.getConversationShortId()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                goto L_0x0033
            L_0x0032:
                r3 = r1
            L_0x0033:
                if (r3 == 0) goto L_0x00cd
                r4 = r2
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                if (r4 == 0) goto L_0x0043
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r4 = 0
                goto L_0x0044
            L_0x0043:
                r4 = 1
            L_0x0044:
                if (r4 != 0) goto L_0x00cd
                if (r0 == 0) goto L_0x00cd
                long r4 = r0.longValue()
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 > 0) goto L_0x0053
                goto L_0x00cd
            L_0x0053:
                r4 = 3
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C6951b.m21623a(r2, r4)
                com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C6951b.m21627d(r2)
                android.net.Uri$Builder r4 = new android.net.Uri$Builder
                r4.<init>()
                java.lang.String r5 = "owner_id"
                long r6 = r0.longValue()
                java.lang.String r0 = java.lang.String.valueOf(r6)
                android.net.Uri$Builder r0 = r4.appendQueryParameter(r5, r0)
                java.lang.String r4 = "extra"
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                java.lang.String r6 = "conversation_id"
                org.json.JSONObject r2 = r5.put(r6, r2)
                java.lang.String r2 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103668a(r2)
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r4, r2)
                java.lang.String r2 = "object_id"
                long r3 = r3.longValue()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
                java.lang.String r2 = "report_type"
                java.lang.String r3 = "im_group"
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
                com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IReportService> r3 = com.p280ss.android.ugc.aweme.framework.services.IReportService.class
                java.lang.Object r2 = r2.getService(r3)
                com.ss.android.ugc.aweme.framework.services.IReportService r2 = (com.p280ss.android.ugc.aweme.framework.services.IReportService) r2
                if (r2 == 0) goto L_0x00ba
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r3 = r9.f81768a
                android.app.Activity r3 = (android.app.Activity) r3
                java.lang.String r4 = "im_group"
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$s$1 r5 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$s$1
                r5.<init>()
                com.ss.android.ugc.aweme.framework.services.IReportService$IReportCallback r5 = (com.p280ss.android.ugc.aweme.framework.services.IReportService.IReportCallback) r5
                r2.showReportDialog(r3, r4, r0, r5)
            L_0x00ba:
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103406a()
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r0 = r9.f81768a
                com.bytedance.im.core.model.Conversation r0 = r0.f81730g
                if (r0 == 0) goto L_0x00c7
                java.lang.String r1 = r0.getConversationId()
            L_0x00c7:
                java.lang.String r0 = "group"
                com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103487i(r1, r0)
                return
            L_0x00cd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatDetailActivity.C31168s.run():void");
        }
    }

    /* renamed from: i */
    private final RecyclerView m101550i() {
        return (RecyclerView) this.f81731i.getValue();
    }

    /* renamed from: j */
    private final TextView m101551j() {
        return (TextView) this.f81732j.getValue();
    }

    /* renamed from: k */
    private final DmtTextView m101552k() {
        return (DmtTextView) this.f81733k.getValue();
    }

    /* renamed from: l */
    private final DmtTextView m101553l() {
        return (DmtTextView) this.f81734l.getValue();
    }

    /* renamed from: m */
    private final TextView m101554m() {
        return (TextView) this.f81735m.getValue();
    }

    /* renamed from: n */
    private final DmtTextView m101555n() {
        return (DmtTextView) this.f81736n.getValue();
    }

    /* renamed from: o */
    private final FrameLayout m101556o() {
        return (FrameLayout) this.f81737o.getValue();
    }

    /* renamed from: p */
    private final FrameLayout m101557p() {
        return (FrameLayout) this.f81738p.getValue();
    }

    /* renamed from: q */
    private final RelativeLayout m101558q() {
        return (RelativeLayout) this.f81739q.getValue();
    }

    /* renamed from: r */
    private final RelativeLayout m101559r() {
        return (RelativeLayout) this.f81740r.getValue();
    }

    /* renamed from: s */
    private final RelativeLayout m101560s() {
        return (RelativeLayout) this.f81741s.getValue();
    }

    /* renamed from: t */
    private final RelativeLayout m101561t() {
        return (RelativeLayout) this.f81742t.getValue();
    }

    /* renamed from: u */
    private final RelativeLayout m101562u() {
        return (RelativeLayout) this.f81743u.getValue();
    }

    /* renamed from: a */
    public final View mo81586a(int i) {
        if (this.f81729B == null) {
            this.f81729B = new HashMap();
        }
        View view = (View) this.f81729B.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81729B.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final int mo81592d() {
        return R.layout.c0;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onCreate", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C6425b bVar = this.f81618e;
        if (bVar != null) {
            bVar.mo15572b();
        }
    }

    /* renamed from: F */
    private final void m101545F() {
        String str;
        Context context = this;
        Conversation conversation = this.f81730g;
        if (conversation != null) {
            str = conversation.getConversationId();
        } else {
            str = null;
        }
        C31257b.m101862a(context, str, new C31168s(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101540A() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.im.sdk.detail.model.b r0 = r2.f81747y
            if (r0 == 0) goto L_0x0016
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.group.model.a> r0 = r2.f81746x
            com.ss.android.ugc.aweme.im.sdk.detail.model.b r1 = r2.f81747y
            if (r1 != 0) goto L_0x000d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x000d:
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0016
            r0 = 18
            goto L_0x0018
        L_0x0016:
            r0 = 19
        L_0x0018:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember> r1 = r2.f81745w
            int r1 = r1.size()
            if (r1 <= r0) goto L_0x002e
            android.widget.TextView r0 = r2.m101551j()
            java.lang.String r1 = "mMoreMemberView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 0
            r0.setVisibility(r1)
            return
        L_0x002e:
            android.widget.TextView r0 = r2.m101551j()
            java.lang.String r1 = "mMoreMemberView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatDetailActivity.m101540A():void");
    }

    /* renamed from: y */
    private final void m101566y() {
        if (this.f81745w.size() >= 20) {
            ArrayList<C30753a> arrayList = this.f81746x;
            C31189a aVar = this.f81748z;
            if (aVar == null) {
                C7573i.m23583a("mAddMemberItem");
            }
            arrayList.set(19, aVar);
        } else {
            ArrayList<C30753a> arrayList2 = this.f81746x;
            C31189a aVar2 = this.f81748z;
            if (aVar2 == null) {
                C7573i.m23583a("mAddMemberItem");
            }
            arrayList2.add(aVar2);
        }
        MemberListAdapter memberListAdapter = this.f81744v;
        if (memberListAdapter == null) {
            C7573i.m23583a("mAvatarListAdapter");
        }
        memberListAdapter.mo81668a((List<? extends C30753a>) this.f81746x);
    }

    /* renamed from: z */
    private final void m101567z() {
        mo81587a().setTitle(getString(R.string.bk1, new Object[]{Integer.valueOf(this.f81745w.size())}));
        m101540A();
    }

    /* renamed from: C */
    private final void m101542C() {
        boolean z;
        String str;
        if (this.f81730g != null) {
            Conversation conversation = this.f81730g;
            if (conversation == null) {
                C7573i.m23580a();
            }
            CharSequence conversationId = conversation.getConversationId();
            if (conversationId == null || conversationId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Context context = this;
                Conversation conversation2 = this.f81730g;
                if (conversation2 == null) {
                    C7573i.m23580a();
                }
                C31170a.m101614a(context, conversation2);
                C31858ad.m103406a();
                Conversation conversation3 = this.f81730g;
                if (conversation3 != null) {
                    str = conversation3.getConversationId();
                } else {
                    str = null;
                }
                C31858ad.m103478g(str, "group_more_member_click");
            }
        }
    }

    /* renamed from: E */
    private final void m101544E() {
        C10741a a = new C10741a(this).mo25657b((int) R.string.blx).mo25665e(R.style.m2).mo25650a((int) R.string.bi8, (DialogInterface.OnClickListener) new C31151c(this));
        String str = null;
        a.mo25658b((int) R.string.bhe, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
        C31858ad.m103406a();
        Conversation conversation = this.f81730g;
        if (conversation != null) {
            str = conversation.getConversationId();
        }
        C31858ad.m103478g(str, "group_quit_click");
    }

    /* renamed from: v */
    private final void m101563v() {
        boolean z;
        Conversation conversation = this.f81730g;
        if (conversation != null) {
            ConversationCoreInfo coreInfo = conversation.getCoreInfo();
            if (coreInfo != null) {
                String notice = coreInfo.getNotice();
                if (notice != null) {
                    if (notice.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        notice = null;
                    }
                    if (notice != null) {
                        TextView m = m101554m();
                        C7573i.m23582a((Object) m, "mGroupAnnouncement");
                        m.setText(notice);
                        TextView m2 = m101554m();
                        C7573i.m23582a((Object) m2, "mGroupAnnouncement");
                        m2.setVisibility(0);
                        DmtTextView n = m101555n();
                        C7573i.m23582a((Object) n, "mGroupAnnouncementNotSet");
                        n.setVisibility(8);
                        return;
                    }
                }
            }
        }
        TextView m3 = m101554m();
        C7573i.m23582a((Object) m3, "mGroupAnnouncement");
        m3.setVisibility(8);
        DmtTextView n2 = m101555n();
        C7573i.m23582a((Object) n2, "mGroupAnnouncementNotSet");
        n2.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo81593e() {
        Serializable serializable;
        CharSequence charSequence;
        boolean z;
        String str;
        super.mo81593e();
        Intent intent = getIntent();
        String str2 = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("conversation");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f81730g = (Conversation) serializable;
            Conversation conversation = this.f81730g;
            if (conversation != null) {
                charSequence = conversation.getConversationId();
            } else {
                charSequence = null;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                finish();
                return;
            }
            Conversation conversation2 = this.f81730g;
            if (conversation2 != null) {
                str = conversation2.getConversationId();
            } else {
                str = null;
            }
            this.f81618e = new C6425b(str);
            Conversation conversation3 = this.f81730g;
            if (conversation3 != null) {
                str2 = conversation3.getConversationId();
            }
            this.f81748z = new C31189a(str2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.im.core.model.Conversation");
    }

    /* renamed from: f */
    public final void mo81594f() {
        String str;
        super.mo81594f();
        RecyclerView i = m101550i();
        C7573i.m23582a((Object) i, "mAvatarListView");
        i.setLayoutManager(new GridLayoutManager(this, 5));
        this.f81744v = new MemberListAdapter(this.f81746x);
        MemberListAdapter memberListAdapter = this.f81744v;
        if (memberListAdapter == null) {
            C7573i.m23583a("mAvatarListAdapter");
        }
        Conversation conversation = this.f81730g;
        if (conversation != null) {
            str = conversation.getConversationId();
        } else {
            str = null;
        }
        memberListAdapter.f81810b = str;
        RecyclerView i2 = m101550i();
        C7573i.m23582a((Object) i2, "mAvatarListView");
        MemberListAdapter memberListAdapter2 = this.f81744v;
        if (memberListAdapter2 == null) {
            C7573i.m23583a("mAvatarListAdapter");
        }
        i2.setAdapter(memberListAdapter2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r0.getRole() == com.bytedance.p263im.core.proto.GroupRole.OWNER.getValue()) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r0.getRole() == com.bytedance.p263im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r0 = com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a();
        r1 = r3.f81730g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r1 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r1 = r1.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r0.mo81802c(r1) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        m101565x();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81642h() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a()
            com.bytedance.im.core.model.Conversation r1 = r3.f81730g
            if (r1 != 0) goto L_0x000b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x000b:
            java.lang.String r1 = r1.getConversationId()
            java.lang.String r2 = "mConversation!!.conversationId"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.List r0 = r0.mo81799b(r1)
            if (r0 == 0) goto L_0x0076
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember> r1 = r3.f81745w
            r1.clear()
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember> r1 = r3.f81745w
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember> r0 = r3.f81745w
            r3.m101547a(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r0 = r3.f81728A
            if (r0 == 0) goto L_0x0041
            com.bytedance.im.core.model.Member r0 = r0.getMember()
            if (r0 == 0) goto L_0x0041
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.p263im.core.proto.GroupRole.OWNER
            int r1 = r1.getValue()
            if (r0 == r1) goto L_0x0057
        L_0x0041:
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r0 = r3.f81728A
            if (r0 == 0) goto L_0x006f
            com.bytedance.im.core.model.Member r0 = r0.getMember()
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.p263im.core.proto.GroupRole.MANAGER
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x006f
        L_0x0057:
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a()
            com.bytedance.im.core.model.Conversation r1 = r3.f81730g
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = r1.getConversationId()
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            boolean r0 = r0.mo81802c(r1)
            if (r0 != 0) goto L_0x006f
            r3.m101565x()
            goto L_0x0072
        L_0x006f:
            r3.m101566y()
        L_0x0072:
            r3.m101567z()
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatDetailActivity.mo81642h():void");
    }

    public final void onResume() {
        CharSequence charSequence;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onResume", true);
        super.onResume();
        C31243a a = C31244a.m101818a();
        Conversation conversation = this.f81730g;
        if (conversation == null) {
            C7573i.m23580a();
        }
        String conversationId = conversation.getConversationId();
        C7573i.m23582a((Object) conversationId, "mConversation!!.conversationId");
        List b = a.mo81799b(conversationId);
        if (b != null) {
            DmtTextView k = m101552k();
            C7573i.m23582a((Object) k, "mGroupNameView");
            Conversation conversation2 = this.f81730g;
            if (conversation2 != null) {
                ConversationCoreInfo coreInfo = conversation2.getCoreInfo();
                if (coreInfo != null) {
                    String name = coreInfo.getName();
                    if (name != null) {
                        charSequence = name;
                        k.setText(charSequence);
                        m101548a(b);
                        m101547a(this.f81745w);
                        m101564w();
                        m101567z();
                    }
                }
            }
            charSequence = getString(R.string.bk6);
            k.setText(charSequence);
            m101548a(b);
            m101547a(this.f81745w);
            m101564w();
            m101567z();
        }
        m101563v();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onResume", false);
    }

    /* renamed from: B */
    private final void m101541B() {
        String str;
        CharSequence b = C7074e.m22069b();
        String str2 = null;
        if (b != null) {
            str = b.toString();
        } else {
            str = null;
        }
        Conversation conversation = this.f81730g;
        if (conversation != null) {
            str2 = conversation.getConversationId();
        }
        StringBuilder sb = new StringBuilder("GroupChatDetailActivity enterAnnouncementEdit: ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        DmtTextView n = m101555n();
        C7573i.m23582a((Object) n, "mGroupAnnouncementNotSet");
        sb.append(n.getVisibility());
        C6921a.m21555a(sb.toString());
        if (str2 != null) {
            DmtTextView n2 = m101555n();
            C7573i.m23582a((Object) n2, "mGroupAnnouncementNotSet");
            if (n2.getVisibility() != 0) {
                C31123a.m101494a(this, str2);
            } else if (str != null) {
                Integer a = C31244a.m101818a().mo81791a(str2, str);
                if (a != null) {
                    mo81641a(str2, Integer.valueOf(a.intValue()), true);
                } else {
                    C31244a.m101818a();
                    C31243a.m101797a(str2, str, (C7562b<? super Integer, C7581n>) new C31150b<Object,C7581n>(this, str2));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101543D() {
        /*
            r6 = this;
            java.lang.String r0 = ""
            com.bytedance.im.core.model.Conversation r1 = r6.f81730g
            r2 = 0
            if (r1 == 0) goto L_0x001c
            com.bytedance.im.core.model.ConversationCoreInfo r1 = r1.getCoreInfo()
            if (r1 == 0) goto L_0x001c
            java.util.Map r1 = r1.getExt()
            if (r1 == 0) goto L_0x001c
            java.lang.String r3 = "a:s_name_operator"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            if (r1 == 0) goto L_0x0043
            java.lang.String r3 = "0"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0043
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r6.m101552k()
            java.lang.String r1 = "mGroupNameView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31873as.m103564a(r0)
            java.lang.String r1 = "StringHelper.trim(mGroupNameView.text.toString())"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
        L_0x0043:
            int r1 = r0.length()
            r3 = 0
            r4 = 20
            if (r1 <= r4) goto L_0x0060
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r0.substring(r3, r4)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            goto L_0x0060
        L_0x0058:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            r1 = r6
            android.app.Activity r1 = (android.app.Activity) r1
            com.bytedance.im.core.model.Conversation r4 = r6.f81730g
            if (r4 == 0) goto L_0x006c
            java.lang.String r4 = r4.getConversationId()
            goto L_0x006d
        L_0x006c:
            r4 = r2
        L_0x006d:
            r5 = 222(0xde, float:3.11E-43)
            com.p280ss.android.ugc.aweme.p313im.sdk.detail.EditGroupInfoActivity.C31105a.m101454a(r1, r4, r0, r3, r5)
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103406a()
            com.bytedance.im.core.model.Conversation r0 = r6.f81730g
            if (r0 == 0) goto L_0x007d
            java.lang.String r2 = r0.getConversationId()
        L_0x007d:
            java.lang.String r0 = "group_name_click"
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103478g(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatDetailActivity.m101543D():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r1.getRole() == com.bytedance.p263im.core.proto.GroupRole.OWNER.getValue()) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        if (r1.getRole() == com.bytedance.p263im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r0 = m101553l();
        kotlin.jvm.internal.C7573i.m23582a((java.lang.Object) r0, "mGroupNickName");
        r1 = r5.f81728A;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r1 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        r1 = r1.getMemberDisplayName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r0.setText(r1);
        r0 = com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a();
        r1 = r5.f81730g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r1 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r2 = r1.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r0.mo81802c(r2) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        m101566y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        m101565x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        return;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101564w() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e.m22071c()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p280ss.android.ugc.aweme.p313im.service.model.IMUser.fromUser(r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember> r1 = r5.f81745w
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x001a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r4 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember) r4
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.getUser()
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r0, r4)
            if (r4 == 0) goto L_0x001a
            r2.add(r3)
            goto L_0x001a
        L_0x0035:
            java.util.List r2 = (java.util.List) r2
            int r1 = r2.size()
            r3 = 1
            if (r1 != r3) goto L_0x00bb
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember) r1
            r5.f81728A = r1
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r1 = r5.f81728A
            if (r1 == 0) goto L_0x005d
            com.bytedance.im.core.model.Member r1 = r1.getMember()
            if (r1 == 0) goto L_0x005d
            int r1 = r1.getRole()
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.p263im.core.proto.GroupRole.OWNER
            int r2 = r2.getValue()
            if (r1 == r2) goto L_0x0073
        L_0x005d:
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r1 = r5.f81728A
            if (r1 == 0) goto L_0x00a6
            com.bytedance.im.core.model.Member r1 = r1.getMember()
            if (r1 == 0) goto L_0x00a6
            int r1 = r1.getRole()
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.p263im.core.proto.GroupRole.MANAGER
            int r2 = r2.getValue()
            if (r1 != r2) goto L_0x00a6
        L_0x0073:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m101553l()
            java.lang.String r1 = "mGroupNickName"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r1 = r5.f81728A
            r2 = 0
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = r1.getMemberDisplayName()
            goto L_0x0087
        L_0x0086:
            r1 = r2
        L_0x0087:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a()
            com.bytedance.im.core.model.Conversation r1 = r5.f81730g
            if (r1 == 0) goto L_0x0098
            java.lang.String r2 = r1.getConversationId()
        L_0x0098:
            boolean r0 = r0.mo81802c(r2)
            if (r0 == 0) goto L_0x00a2
            r5.m101566y()
            return
        L_0x00a2:
            r5.m101565x()
            return
        L_0x00a6:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r5.m101553l()
            java.lang.String r2 = "mGroupNickName"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r0 = r0.getDisplayName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            r5.m101566y()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatDetailActivity.m101564w():void");
    }

    /* renamed from: x */
    private final void m101565x() {
        String str;
        if (this.f81747y == null) {
            Conversation conversation = this.f81730g;
            if (conversation != null) {
                str = conversation.getConversationId();
            } else {
                str = null;
            }
            this.f81747y = new C31190b(str);
        }
        if (this.f81745w.size() >= 20) {
            ArrayList<C30753a> arrayList = this.f81746x;
            C31189a aVar = this.f81748z;
            if (aVar == null) {
                C7573i.m23583a("mAddMemberItem");
            }
            arrayList.set(18, aVar);
            ArrayList<C30753a> arrayList2 = this.f81746x;
            C31190b bVar = this.f81747y;
            if (bVar == null) {
                C7573i.m23580a();
            }
            arrayList2.set(19, bVar);
        } else if (this.f81745w.size() >= 19) {
            ArrayList<C30753a> arrayList3 = this.f81746x;
            C31189a aVar2 = this.f81748z;
            if (aVar2 == null) {
                C7573i.m23583a("mAddMemberItem");
            }
            arrayList3.set(18, aVar2);
            ArrayList<C30753a> arrayList4 = this.f81746x;
            C31190b bVar2 = this.f81747y;
            if (bVar2 == null) {
                C7573i.m23580a();
            }
            arrayList4.add(bVar2);
        } else {
            ArrayList<C30753a> arrayList5 = this.f81746x;
            C31189a aVar3 = this.f81748z;
            if (aVar3 == null) {
                C7573i.m23583a("mAddMemberItem");
            }
            arrayList5.add(aVar3);
            ArrayList<C30753a> arrayList6 = this.f81746x;
            C31190b bVar3 = this.f81747y;
            if (bVar3 == null) {
                C7573i.m23580a();
            }
            arrayList6.add(bVar3);
        }
        MemberListAdapter memberListAdapter = this.f81744v;
        if (memberListAdapter == null) {
            C7573i.m23583a("mAvatarListAdapter");
        }
        memberListAdapter.mo81668a((List<? extends C30753a>) this.f81746x);
    }

    /* renamed from: g */
    public final void mo81595g() {
        super.mo81595g();
        OnClickListener onClickListener = this;
        m101558q().setOnClickListener(onClickListener);
        m101551j().setOnClickListener(onClickListener);
        m101560s().setOnClickListener(onClickListener);
        m101559r().setOnClickListener(onClickListener);
        m101562u().setOnClickListener(onClickListener);
        m101556o().setOnClickListener(onClickListener);
        m101557p().setOnClickListener(onClickListener);
        mo81587a().setOnTitlebarClickListener(new C31153d(this));
        C6425b bVar = this.f81618e;
        if (bVar != null) {
            bVar.mo15565a((C6433e) new C31154e(this));
        }
        Context context = this;
        C31878ax.m103575a(C0683b.m2912c(context, R.color.ac4), C0683b.m2912c(context, R.color.t9), m101560s(), m101561t(), m101558q(), m101559r(), m101562u());
        C31882a.m103579n().mo82725a(m101551j(), m101556o(), m101557p());
    }

    /* renamed from: a */
    private final void m101548a(List<IMMember> list) {
        this.f81745w.clear();
        this.f81745w.addAll(list);
    }

    /* renamed from: a */
    private final void m101546a(Intent intent) {
        String str;
        boolean z;
        if (intent != null) {
            str = intent.getStringExtra("editInfo");
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            DmtTextView k = m101552k();
            C7573i.m23582a((Object) k, "mGroupNameView");
            k.setText(charSequence);
        }
    }

    /* renamed from: b */
    private final void m101549b(int i) {
        Conversation conversation = this.f81730g;
        if (conversation != null && conversation.getConversationId() != null) {
            Context context = this;
            Conversation conversation2 = this.f81730g;
            if (conversation2 == null) {
                C7573i.m23580a();
            }
            String conversationId = conversation2.getConversationId();
            if (conversationId == null) {
                C7573i.m23580a();
            }
            new GroupInvitePasswordDialog(context, conversationId, i).show();
        }
    }

    /* renamed from: a */
    private final void m101547a(ArrayList<IMMember> arrayList) {
        this.f81746x.clear();
        if (arrayList.size() <= 20) {
            this.f81746x.addAll(arrayList);
        } else {
            this.f81746x.addAll(arrayList.subList(0, 20));
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        super.onClick(view);
        if (C7573i.m23585a((Object) view, (Object) m101558q())) {
            m101545F();
        } else if (C7573i.m23585a((Object) view, (Object) m101551j())) {
            m101542C();
        } else if (C7573i.m23585a((Object) view, (Object) m101560s())) {
            m101543D();
        } else if (C7573i.m23585a((Object) view, (Object) m101559r())) {
            m101544E();
        } else {
            String str = null;
            if (C7573i.m23585a((Object) view, (Object) m101556o())) {
                m101549b(3);
                C31858ad.m103406a();
                Conversation conversation = this.f81730g;
                if (conversation != null) {
                    str = conversation.getConversationId();
                }
                C31858ad.m103478g(str, "group_qq_invite_click");
            } else if (C7573i.m23585a((Object) view, (Object) m101557p())) {
                m101549b(1);
                C31858ad.m103406a();
                Conversation conversation2 = this.f81730g;
                if (conversation2 != null) {
                    str = conversation2.getConversationId();
                }
                C31858ad.m103478g(str, "group_wx_invite_click");
            } else {
                if (C7573i.m23585a((Object) view, (Object) m101562u())) {
                    m101541B();
                    C31858ad.m103406a();
                    Conversation conversation3 = this.f81730g;
                    if (conversation3 != null) {
                        str = conversation3.getConversationId();
                    }
                    C31858ad.m103499n(str);
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 222) {
            m101546a(intent);
        }
    }

    /* renamed from: a */
    public final void mo81641a(String str, Integer num, boolean z) {
        StringBuilder sb = new StringBuilder("GroupChatDetailActivity toastOrEnterAnnouncementEdit: ");
        sb.append(num);
        sb.append(", ");
        sb.append(z);
        C6921a.m21555a(sb.toString());
        int value = GroupRole.OWNER.getValue();
        if (num != null && value == num.intValue()) {
            C31133a.m101525a(this, str, "");
        } else {
            C10761a.m31399c((Context) this, (int) R.string.a0z).mo25750a();
        }
    }
}
