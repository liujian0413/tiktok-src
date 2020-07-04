package com.p280ss.android.ugc.aweme.p313im.sdk.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.C6433e;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Member;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.C30753a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.adapter.MemberListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.C31189a;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.C31190b;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.p1322a.C31180a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31080b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity */
public final class GroupChatMembersActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81769a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatMembersActivity.class), "mTitleBar", "getMTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatMembersActivity.class), "mAvatarListView", "getMAvatarListView()Landroid/support/v7/widget/RecyclerView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatMembersActivity.class), "mClearSearchImage", "getMClearSearchImage()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupChatMembersActivity.class), "mSearchMemberEdit", "getMSearchMemberEdit()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;"))};

    /* renamed from: g */
    public static final C31170a f81770g = new C31170a(null);

    /* renamed from: b */
    public GridLayoutManager f81771b;

    /* renamed from: c */
    public LinearLayoutManager f81772c;

    /* renamed from: d */
    public MemberListAdapter f81773d;

    /* renamed from: e */
    public ArrayList<C30753a> f81774e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<IMMember> f81775f = new ArrayList<>();

    /* renamed from: h */
    private final C7541d f81776h = C7546e.m23569a(new C31179j(this));

    /* renamed from: i */
    private final C7541d f81777i = C7546e.m23569a(new C31176g(this));

    /* renamed from: j */
    private final C7541d f81778j = C7546e.m23569a(new C31177h(this));

    /* renamed from: k */
    private final C7541d f81779k = C7546e.m23569a(new C31178i(this));

    /* renamed from: l */
    private C6425b f81780l;

    /* renamed from: m */
    private Conversation f81781m;

    /* renamed from: n */
    private C31190b f81782n;

    /* renamed from: o */
    private C31189a f81783o;

    /* renamed from: p */
    private IMMember f81784p;

    /* renamed from: q */
    private HashMap f81785q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$a */
    public static final class C31170a {
        private C31170a() {
        }

        public /* synthetic */ C31170a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m101614a(Context context, Conversation conversation) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(conversation, "conversation");
            Intent intent = new Intent(context, GroupChatMembersActivity.class);
            intent.putExtra("conversation", conversation);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$b */
    public static final class C31171b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81786a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C31171b(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81786a = groupChatMembersActivity;
        }

        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                RecyclerView a = this.f81786a.mo81646a();
                C7573i.m23582a((Object) a, "mAvatarListView");
                a.setLayoutManager(GroupChatMembersActivity.m101599a(this.f81786a));
                GroupChatMembersActivity.m101600b(this.f81786a).mo81668a((List<? extends C30753a>) this.f81786a.f81774e);
                ImageView b = this.f81786a.mo81648b();
                C7573i.m23582a((Object) b, "mClearSearchImage");
                b.setVisibility(8);
                return;
            }
            List a2 = C31180a.m101624a((List<IMMember>) this.f81786a.f81775f, String.valueOf(editable));
            if (this.f81786a.f81772c == null) {
                this.f81786a.f81772c = new LinearLayoutManager(this.f81786a);
                LinearLayoutManager linearLayoutManager = this.f81786a.f81772c;
                if (linearLayoutManager == null) {
                    C7573i.m23580a();
                }
                linearLayoutManager.mo5427b(1);
            }
            RecyclerView a3 = this.f81786a.mo81646a();
            C7573i.m23582a((Object) a3, "mAvatarListView");
            a3.setLayoutManager(this.f81786a.f81772c);
            GroupChatMembersActivity.m101600b(this.f81786a).mo81669a(a2, String.valueOf(editable));
            ImageView b2 = this.f81786a.mo81648b();
            C7573i.m23582a((Object) b2, "mClearSearchImage");
            b2.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$c */
    public static final class C31172c implements C31980a {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81787a;

        /* renamed from: b */
        public final void mo18097b() {
        }

        /* renamed from: a */
        public final void mo18096a() {
            this.f81787a.finish();
        }

        C31172c(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81787a = groupChatMembersActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$d */
    static final class C31173d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81788a;

        C31173d(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81788a = groupChatMembersActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f81788a.mo81649c().setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$e */
    public static final class C31174e extends C31080b {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81789a;

        C31174e(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81789a = groupChatMembersActivity;
        }

        /* renamed from: a */
        public final void mo15537a(List<Member> list) {
            super.mo15537a(list);
            this.f81789a.mo81650d();
        }

        /* renamed from: b */
        public final void mo15540b(Conversation conversation) {
            super.mo15540b(conversation);
            this.f81789a.mo81650d();
        }

        /* renamed from: b */
        public final void mo15542b(List<Member> list) {
            super.mo15542b(list);
            this.f81789a.mo81650d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$f */
    static final class C31175f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81790a;

        C31175f(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81790a = groupChatMembersActivity;
        }

        public final void run() {
            RecyclerView a = this.f81790a.mo81646a();
            C7573i.m23582a((Object) a, "mAvatarListView");
            a.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$g */
    static final class C31176g extends Lambda implements C7561a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81791a;

        C31176g(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81791a = groupChatMembersActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecyclerView invoke() {
            return (RecyclerView) this.f81791a.mo81647a((int) R.id.cxc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$h */
    static final class C31177h extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81792a;

        C31177h(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81792a = groupChatMembersActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f81792a.mo81647a((int) R.id.b7f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$i */
    static final class C31178i extends Lambda implements C7561a<DmtEditText> {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81793a;

        C31178i(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81793a = groupChatMembersActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtEditText invoke() {
            return (DmtEditText) this.f81793a.mo81647a((int) R.id.ago);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$j */
    static final class C31179j extends Lambda implements C7561a<ImTextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f81794a;

        C31179j(GroupChatMembersActivity groupChatMembersActivity) {
            this.f81794a = groupChatMembersActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImTextTitleBar invoke() {
            return (ImTextTitleBar) this.f81794a.mo81647a((int) R.id.djz);
        }
    }

    /* renamed from: e */
    private final ImTextTitleBar m101601e() {
        return (ImTextTitleBar) this.f81776h.getValue();
    }

    /* renamed from: a */
    public final RecyclerView mo81646a() {
        return (RecyclerView) this.f81777i.getValue();
    }

    /* renamed from: a */
    public final View mo81647a(int i) {
        if (this.f81785q == null) {
            this.f81785q = new HashMap();
        }
        View view = (View) this.f81785q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81785q.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final ImageView mo81648b() {
        return (ImageView) this.f81778j.getValue();
    }

    /* renamed from: c */
    public final DmtEditText mo81649c() {
        return (DmtEditText) this.f81779k.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void onDestroy() {
        super.onDestroy();
        C6425b bVar = this.f81780l;
        if (bVar != null) {
            bVar.mo15572b();
        }
    }

    /* renamed from: h */
    private final void m101604h() {
        m101601e().setTitle(getString(R.string.bks, new Object[]{Integer.valueOf(this.f81775f.size())}));
    }

    /* renamed from: k */
    private final void m101607k() {
        ArrayList<C30753a> arrayList = this.f81774e;
        C31189a aVar = this.f81783o;
        if (aVar == null) {
            C7573i.m23583a("mAddMemberItem");
        }
        arrayList.add(aVar);
        MemberListAdapter memberListAdapter = this.f81773d;
        if (memberListAdapter == null) {
            C7573i.m23583a("mAvatarListAdapter");
        }
        memberListAdapter.mo81668a((List<? extends C30753a>) this.f81774e);
    }

    /* renamed from: j */
    private final void m101606j() {
        String str;
        if (this.f81782n == null) {
            Conversation conversation = this.f81781m;
            if (conversation != null) {
                str = conversation.getConversationId();
            } else {
                str = null;
            }
            this.f81782n = new C31190b(str);
        }
        ArrayList<C30753a> arrayList = this.f81774e;
        C31189a aVar = this.f81783o;
        if (aVar == null) {
            C7573i.m23583a("mAddMemberItem");
        }
        arrayList.add(aVar);
        ArrayList<C30753a> arrayList2 = this.f81774e;
        C31190b bVar = this.f81782n;
        if (bVar == null) {
            C7573i.m23580a();
        }
        arrayList2.add(bVar);
        MemberListAdapter memberListAdapter = this.f81773d;
        if (memberListAdapter == null) {
            C7573i.m23583a("mAvatarListAdapter");
        }
        memberListAdapter.mo81668a((List<? extends C30753a>) this.f81774e);
    }

    /* renamed from: l */
    private final void m101608l() {
        mo81649c().addTextChangedListener(new C31171b(this));
        m101601e().setOnTitlebarClickListener(new C31172c(this));
        mo81648b().setOnClickListener(new C31173d(this));
        C6425b bVar = this.f81780l;
        if (bVar != null) {
            bVar.mo15565a((C6433e) new C31174e(this));
        }
    }

    /* renamed from: d */
    public final void mo81650d() {
        C31243a a = C31244a.m101818a();
        Conversation conversation = this.f81781m;
        if (conversation == null) {
            C7573i.m23580a();
        }
        String conversationId = conversation.getConversationId();
        C7573i.m23582a((Object) conversationId, "mConversation!!.conversationId");
        List b = a.mo81799b(conversationId);
        if (b != null) {
            this.f81774e.clear();
            this.f81775f.clear();
            Collection collection = b;
            this.f81774e.addAll(collection);
            this.f81775f.addAll(collection);
            m101605i();
            m101604h();
        }
    }

    /* renamed from: f */
    private final void m101602f() {
        Serializable serializable;
        CharSequence charSequence;
        boolean z;
        String str;
        Intent intent = getIntent();
        String str2 = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("conversation");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f81781m = (Conversation) serializable;
            Conversation conversation = this.f81781m;
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
            Conversation conversation2 = this.f81781m;
            if (conversation2 != null) {
                str = conversation2.getConversationId();
            } else {
                str = null;
            }
            this.f81780l = new C6425b(str);
            Conversation conversation3 = this.f81781m;
            if (conversation3 != null) {
                str2 = conversation3.getConversationId();
            }
            this.f81783o = new C31189a(str2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.im.core.model.Conversation");
    }

    /* renamed from: g */
    private final void m101603g() {
        this.f81771b = new GridLayoutManager(this, 5);
        RecyclerView a = mo81646a();
        C7573i.m23582a((Object) a, "mAvatarListView");
        GridLayoutManager gridLayoutManager = this.f81771b;
        if (gridLayoutManager == null) {
            C7573i.m23583a("viewMemberLayoutManager");
        }
        a.setLayoutManager(gridLayoutManager);
        mo81646a().setItemViewCacheSize(25);
        this.f81773d = new MemberListAdapter(this.f81775f);
        RecyclerView a2 = mo81646a();
        C7573i.m23582a((Object) a2, "mAvatarListView");
        MemberListAdapter memberListAdapter = this.f81773d;
        if (memberListAdapter == null) {
            C7573i.m23583a("mAvatarListAdapter");
        }
        a2.setAdapter(memberListAdapter);
        mo81646a().postDelayed(new C31175f(this), 400);
        mo81650d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r0.getRole() == com.bytedance.p263im.core.proto.GroupRole.OWNER.getValue()) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        if (r0.getRole() == com.bytedance.p263im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r0 = com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a();
        r1 = r5.f81781m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r1 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r1 = r1.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r0.mo81802c(r1) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        m101606j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101605i() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e.m22071c()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p280ss.android.ugc.aweme.p313im.service.model.IMUser.fromUser(r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember> r1 = r5.f81775f
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
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L_0x008e
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r0 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember) r0
            r5.f81784p = r0
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r0 = r5.f81784p
            if (r0 == 0) goto L_0x005d
            com.bytedance.im.core.model.Member r0 = r0.getMember()
            if (r0 == 0) goto L_0x005d
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.p263im.core.proto.GroupRole.OWNER
            int r1 = r1.getValue()
            if (r0 == r1) goto L_0x0073
        L_0x005d:
            com.ss.android.ugc.aweme.im.sdk.chat.group.model.IMMember r0 = r5.f81784p
            if (r0 == 0) goto L_0x008b
            com.bytedance.im.core.model.Member r0 = r0.getMember()
            if (r0 == 0) goto L_0x008b
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.p263im.core.proto.GroupRole.MANAGER
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x008b
        L_0x0073:
            com.ss.android.ugc.aweme.im.sdk.group.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a()
            com.bytedance.im.core.model.Conversation r1 = r5.f81781m
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = r1.getConversationId()
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            boolean r0 = r0.mo81802c(r1)
            if (r0 != 0) goto L_0x008b
            r5.m101606j()
            return
        L_0x008b:
            r5.m101607k()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatMembersActivity.m101605i():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ GridLayoutManager m101599a(GroupChatMembersActivity groupChatMembersActivity) {
        GridLayoutManager gridLayoutManager = groupChatMembersActivity.f81771b;
        if (gridLayoutManager == null) {
            C7573i.m23583a("viewMemberLayoutManager");
        }
        return gridLayoutManager;
    }

    /* renamed from: b */
    public static final /* synthetic */ MemberListAdapter m101600b(GroupChatMembersActivity groupChatMembersActivity) {
        MemberListAdapter memberListAdapter = groupChatMembersActivity.f81773d;
        if (memberListAdapter == null) {
            C7573i.m23583a("mAvatarListAdapter");
        }
        return memberListAdapter;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c1);
        C6956a.m21633b().setupStatusBar(this);
        m101602f();
        m101603g();
        m101608l();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onCreate", false);
    }
}
