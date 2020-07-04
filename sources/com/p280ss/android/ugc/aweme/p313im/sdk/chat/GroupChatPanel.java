package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.model.ConversationSettingInfo;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.Message.C6416a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SayHelloContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.GroupChatDetailActivity.C31149a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31256a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupTipsDialog.C31293a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31872ar;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel */
public final class GroupChatPanel extends BaseChatPanel {

    /* renamed from: p */
    public static final C30611a f80380p = new C30611a(null);

    /* renamed from: o */
    public final GroupSessionInfo f80381o;

    /* renamed from: q */
    private final StringBuilder f80382q = new StringBuilder();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$a */
    public static final class C30611a {
        private C30611a() {
        }

        public /* synthetic */ C30611a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$b */
    public static final class C30612b implements C11195b<Conversation> {
        C30612b() {
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18089a(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$c */
    static final class C30613c extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f80383a;

        C30613c(GroupChatPanel groupChatPanel) {
            this.f80383a = groupChatPanel;
            super(1);
        }

        /* renamed from: a */
        private void m99977a(int i) {
            this.f80383a.f80381o.setGroupRole(i);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m99977a(((Number) obj).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$d */
    static final class C30614d<T> implements C6892b<List<Emoji>> {

        /* renamed from: a */
        final /* synthetic */ Conversation f80384a;

        /* renamed from: b */
        final /* synthetic */ GroupChatPanel f80385b;

        C30614d(Conversation conversation, GroupChatPanel groupChatPanel) {
            this.f80384a = conversation;
            this.f80385b = groupChatPanel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(List<Emoji> list) {
            boolean z;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                GroupChatPanel.m99968a(this.f80384a, list);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$e */
    static final class C30615e extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f80386a;

        /* renamed from: b */
        final /* synthetic */ GroupCheckMsg f80387b;

        C30615e(GroupChatPanel groupChatPanel, GroupCheckMsg groupCheckMsg) {
            this.f80386a = groupChatPanel;
            this.f80387b = groupCheckMsg;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m99979a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m99979a(View view) {
            C7573i.m23587b(view, "it");
            List invalidMembers = this.f80387b.getInvalidMembers();
            if (invalidMembers != null) {
                C31244a.m101818a();
                String conversationId = this.f80386a.f80381o.getConversationId();
                Iterable<IMUser> iterable = invalidMembers;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (IMUser uid : iterable) {
                    arrayList.add(uid.getUid());
                }
                C31243a.m101802c(conversationId, (List) arrayList);
            }
            C10761a.m31387a(this.f80386a.f80336c, C6399b.m19921a().getResources().getString(R.string.bkp)).mo25750a();
            C31858ad.m103435a("start", "group_agree", this.f80387b.getInvalidMembers(), "confirm");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$f */
    static final class C30616f extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupCheckMsg f80388a;

        C30616f(GroupCheckMsg groupCheckMsg) {
            this.f80388a = groupCheckMsg;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m99980a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m99980a(View view) {
            C7573i.m23587b(view, "it");
            C31858ad.m103435a("start", "group_agree", this.f80388a.getInvalidMembers(), "cancel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$g */
    public static final class C30617g implements C31980a {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f80389a;

        /* renamed from: b */
        final /* synthetic */ Conversation f80390b;

        /* renamed from: a */
        public final void mo18096a() {
            this.f80389a.f80337d.finish();
            C31858ad.m103498m(this.f80389a.f80381o.getConversationId(), "group");
        }

        /* renamed from: b */
        public final void mo18097b() {
            Conversation conversation = this.f80390b;
            if (conversation != null) {
                if (!conversation.isMember()) {
                    C10761a.m31399c((Context) this.f80389a.f80337d, (int) R.string.bon).mo25750a();
                } else if (C31256a.m101858a(conversation)) {
                    C10761a.m31399c((Context) this.f80389a.f80337d, (int) R.string.bk0).mo25750a();
                } else {
                    C31149a.m101575a(this.f80389a.f80337d, conversation);
                }
            }
        }

        C30617g(GroupChatPanel groupChatPanel, Conversation conversation) {
            this.f80389a = groupChatPanel;
            this.f80390b = conversation;
        }
    }

    public final void onResume() {
        super.onResume();
        Conversation a = C6417a.m20015a().mo15530a(this.f80381o.getConversationId());
        if (a != null) {
            C31244a.m101818a();
            C31243a.m101801c(a);
        }
    }

    public final void onStop() {
        super.onStop();
        Conversation a = C6417a.m20015a().mo15530a(this.f80381o.getConversationId());
        if (a != null) {
            C31244a.m101818a();
            C31243a.m101801c(a);
        }
    }

    /* renamed from: b */
    public final void mo80390b() {
        super.mo80390b();
        C31244a.m101818a().mo81799b(this.f80381o.getConversationId());
        C31244a.m101818a();
        C31243a.m101797a(this.f80381o.getConversationId(), C7074e.m22069b().toString(), (C7562b<? super Integer, C7581n>) new C30613c<Object,C7581n>(this));
        GroupCheckMsg groupCheckMessage = this.f80381o.getGroupCheckMessage();
        if (groupCheckMessage != null) {
            m99969a(groupCheckMessage);
        }
    }

    /* renamed from: c */
    public final void mo80392c() {
        super.mo80392c();
        Conversation a = C6417a.m20015a().mo15530a(this.f80381o.getConversationId());
        if (a != null && m99970a(a)) {
            C7077s.m22154a((C6892b<List<Emoji>>) new C30614d<List<Emoji>>(a, this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 == null) goto L_0x0016;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m99970a(com.bytedance.p263im.core.model.Conversation r2) {
        /*
            com.bytedance.im.core.model.ConversationSettingInfo r0 = r2.getSettingInfo()
            if (r0 == 0) goto L_0x0016
            java.util.Map r0 = r0.getExt()
            if (r0 == 0) goto L_0x0016
            java.lang.String r1 = "a:s_awe_greet_msg"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0026
        L_0x0016:
            java.util.Map r0 = r2.getLocalExt()
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = "a:s_awe_greet_msg"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            boolean r2 = r2.isMember()
            if (r2 == 0) goto L_0x003a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r2 = "1"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            if (r2 != 0) goto L_0x003a
            r2 = 1
            return r2
        L_0x003a:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.GroupChatPanel.m99970a(com.bytedance.im.core.model.Conversation):boolean");
    }

    /* renamed from: a */
    private final void m99969a(GroupCheckMsg groupCheckMsg) {
        boolean z;
        Context context = this.f80336c;
        C7573i.m23582a((Object) context, "mContext");
        C31293a b = new C31293a(context).mo81876b(new C30615e(this, groupCheckMsg));
        List<IMUser> invalidMembers = groupCheckMsg.getInvalidMembers();
        if (invalidMembers != null) {
            StringBuilder sb = new StringBuilder();
            for (IMUser iMUser : invalidMembers) {
                IMUser a = C6961d.m21657a().mo18019a(iMUser.getUid());
                if (a != null) {
                    sb.append(a.getDisplayName());
                    sb.append("、");
                    if (a != null) {
                    }
                }
                sb.append(iMUser.getDisplayName());
                sb.append("、");
            }
            if (sb.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.setLength(sb.length() - 1);
            }
            if (invalidMembers.size() > 1) {
                C6399b.m19921a().getResources().getString(R.string.bkn, new Object[]{sb.toString(), Integer.valueOf(invalidMembers.size())});
            } else {
                C6399b.m19921a().getResources().getString(R.string.bkm, new Object[]{sb.toString()});
            }
            b.f82021a = C6399b.m19921a().getResources().getString(R.string.bkm, new Object[]{sb.toString()});
        }
        b.f82022b = C6399b.m19921a().getResources().getString(R.string.bki);
        b.mo81874a(new C30616f(groupCheckMsg)).mo81875a().show();
    }

    /* renamed from: a */
    public final void mo80386a(ImTextTitleBar imTextTitleBar) {
        int i;
        String str;
        C7573i.m23587b(imTextTitleBar, "titleBar");
        super.mo80386a(imTextTitleBar);
        Conversation a = C6417a.m20015a().mo15530a(this.f80381o.getConversationId());
        C6417a a2 = C6417a.m20015a();
        C7573i.m23582a((Object) a2, "ConversationListModel.inst()");
        Map e = a2.mo15549e();
        if (e != null) {
            i = e.size();
        } else {
            i = 0;
        }
        this.f80382q.append(i);
        this.f80382q.append(" ");
        if (a == null) {
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("conversation_id", this.f80381o.getConversationId());
            String sb = this.f80382q.toString();
            C7573i.m23582a((Object) sb, "mLogBuilder.toString()");
            int length = sb.length();
            if (length > 200) {
                String str2 = "tag";
                int i2 = length - 200;
                if (sb != null) {
                    String substring = sb.substring(i2, length);
                    C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    linkedHashMap.put(str2, substring);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                linkedHashMap.put("tag", sb);
            }
            linkedHashMap.put("error", String.valueOf(this.f80381o.getEnterFrom()));
            C7074e.m22070b("empty_conversation", linkedHashMap);
        }
        if (a != null) {
            ConversationCoreInfo coreInfo = a.getCoreInfo();
            if (coreInfo != null) {
                String name = coreInfo.getName();
                if (name != null) {
                    str = C31872ar.m103562a(name, 15);
                } else {
                    str = null;
                }
                imTextTitleBar.setTitle(str);
            }
            imTextTitleBar.setTitleCount(C6399b.m19921a().getString(R.string.bkr, new Object[]{Integer.valueOf(a.getMemberCount())}));
            if (!a.isMember() || C31256a.m101858a(a)) {
                View rightView = imTextTitleBar.getRightView();
                C7573i.m23582a((Object) rightView, "titleBar.rightView");
                rightView.setVisibility(8);
            } else {
                View rightView2 = imTextTitleBar.getRightView();
                C7573i.m23582a((Object) rightView2, "titleBar.rightView");
                rightView2.setVisibility(0);
            }
        }
        imTextTitleBar.setOnTitlebarClickListener(new C30617g(this, a));
    }

    /* renamed from: a */
    public static void m99968a(Conversation conversation, List<? extends Emoji> list) {
        boolean z;
        SayHelloContent sayHelloContent = new SayHelloContent();
        sayHelloContent.setEmoji(list);
        Message a = new C6416a().mo15526a(conversation).mo15525a(1002).mo15527a(C31913m.m103668a(sayHelloContent)).mo15528a();
        C7573i.m23582a((Object) a, "it");
        a.setMsgStatus(2);
        C31863ai.m103533b(a);
        Map localExt = conversation.getLocalExt();
        if (localExt == null) {
            localExt = new LinkedHashMap();
        }
        localExt.put("a:s_awe_greet_msg", "1");
        conversation.setLocalExt(localExt);
        Map map = null;
        C6425b.m20077a(conversation.getConversationId(), localExt, (Runnable) null);
        C6425b bVar = new C6425b(conversation.getConversationId());
        ConversationSettingInfo settingInfo = conversation.getSettingInfo();
        if (settingInfo != null) {
            Map ext = settingInfo.getExt();
            if (ext != null) {
                map = C7507ae.m23402c(ext);
            }
        }
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            map = new LinkedHashMap();
        }
        map.put("a:s_awe_greet_msg", "1");
        ConversationSettingInfo settingInfo2 = conversation.getSettingInfo();
        if (settingInfo2 != null) {
            settingInfo2.setExt(map);
        }
        bVar.mo15569a(map, (C11195b) new C30612b());
    }

    public GroupChatPanel(C0043i iVar, View view, GroupSessionInfo groupSessionInfo) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(groupSessionInfo, "groupSessionInfo");
        super(iVar, view, groupSessionInfo);
        this.f80381o = groupSessionInfo;
    }

    /* renamed from: a */
    public final void mo80382a(int i, int i2, Intent intent) {
        Object obj;
        super.mo80382a(i, i2, intent);
        if (i == 223) {
            Object obj2 = null;
            if (intent != null) {
                obj = intent.getSerializableExtra("key_at_member");
            } else {
                obj = null;
            }
            if (obj instanceof IMUser) {
                obj2 = obj;
            }
            IMUser iMUser = (IMUser) obj2;
            if (iMUser != null) {
                String nickName = iMUser.getNickName();
                C7573i.m23582a((Object) nickName, "this.nickName");
                String uid = iMUser.getUid();
                C7573i.m23582a((Object) uid, "uid");
                mo80387a(nickName, uid);
                if (iMUser != null) {
                    return;
                }
            }
            mo80387a("", "");
        }
    }
}
