package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.internal.utils.C11433k;
import com.bytedance.p263im.core.internal.utils.C11433k.C11434a;
import com.bytedance.p263im.core.model.C11472n.C11474a;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.UserExtra;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.FriendChatDetailActivity.C31119a;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMessageList;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.UserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel */
public final class SingleChatPanel extends BaseChatPanel implements C11434a {

    /* renamed from: o */
    static final /* synthetic */ C7595j[] f80462o = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SingleChatPanel.class), "mFollowBarHelper", "getMFollowBarHelper()Lcom/ss/android/ugc/aweme/im/sdk/chat/FollowBarHelper;"))};

    /* renamed from: q */
    public static final C30726a f80463q = new C30726a(null);

    /* renamed from: p */
    public final SingleSessionInfo f80464p;

    /* renamed from: r */
    private final C11433k f80465r = new C11433k(this);

    /* renamed from: s */
    private final C7541d f80466s = C7546e.m23569a(new C30728c(this));

    /* renamed from: t */
    private final C30727b f80467t = new C30727b(new WeakReference(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$a */
    public static final class C30726a {
        private C30726a() {
        }

        public /* synthetic */ C30726a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$b */
    public static final class C30727b implements Runnable {

        /* renamed from: a */
        private final WeakReference<SingleChatPanel> f80468a;

        public final void run() {
            SingleChatPanel singleChatPanel = (SingleChatPanel) this.f80468a.get();
            if (singleChatPanel != null) {
                singleChatPanel.mo80496a(1, true);
            }
        }

        public C30727b(WeakReference<SingleChatPanel> weakReference) {
            C7573i.m23587b(weakReference, "chatPanel");
            this.f80468a = weakReference;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$c */
    static final class C30728c extends Lambda implements C7561a<C30743e> {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f80469a;

        C30728c(SingleChatPanel singleChatPanel) {
            this.f80469a = singleChatPanel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C30743e invoke() {
            return new C30743e(this.f80469a.f80335b, this.f80469a.f80464p.getFromUser());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleChatPanel$d */
    public static final class C30729d implements C31980a {

        /* renamed from: a */
        final /* synthetic */ SingleChatPanel f80470a;

        /* renamed from: a */
        public final void mo18096a() {
            this.f80470a.f80337d.finish();
            C31858ad.m103498m(this.f80470a.f80464p.getConversationId(), "private");
        }

        /* renamed from: b */
        public final void mo18097b() {
            IMUser fromUser = this.f80470a.f80464p.getFromUser();
            if (fromUser != null) {
                Activity activity = this.f80470a.f80337d;
                boolean z = true;
                if (this.f80470a.f80464p.getChatType() != 1) {
                    z = false;
                }
                C31119a.m101481a(activity, fromUser, z, this.f80470a.f80464p.isAuthorSupporterChat());
            }
        }

        C30729d(SingleChatPanel singleChatPanel) {
            this.f80470a = singleChatPanel;
        }
    }

    /* renamed from: g */
    private final C30743e m100096g() {
        return (C30743e) this.f80466s.getValue();
    }

    public final void onPause() {
        super.onPause();
        this.f80464p.getFromUser();
        mo80496a(2, false);
    }

    public final void onResume() {
        super.onResume();
        m100097h();
        this.f80464p.getFromUser();
        new StringBuilder("chat fragment resume, ext: ").append(this.f80464p.getChatExt());
        mo80496a(1, true);
    }

    /* renamed from: h */
    private final void m100097h() {
        IMUser fromUser = this.f80464p.getFromUser();
        if (fromUser != null) {
            if (fromUser.getFollowStatus() == 0 && !C7074e.m22067a(fromUser) && !UserExtra.isDisableShowFollowBar(fromUser.getUid()) && !this.f80464p.isAuthorSupporterChat()) {
                boolean z = true;
                if (this.f80464p.getSelectMsgType() != 1) {
                    C30743e g = m100096g();
                    if (this.f80464p.getEnterFrom() != 1) {
                        z = false;
                    }
                    g.f80502i = z;
                    m100096g().f80501h = this.f80464p.getFromUserId();
                    m100096g().mo80521a(fromUser.getUid());
                    m100096g().mo80520a(0);
                }
            }
            m100096g().mo80520a(8);
        }
    }

    /* renamed from: c */
    public final void mo80392c() {
        String str;
        long j;
        super.mo80392c();
        C31085i iVar = C31085i.f81578a;
        IMUser fromUser = this.f80464p.getFromUser();
        IMUser fromUser2 = this.f80464p.getFromUser();
        String str2 = null;
        if (fromUser2 != null) {
            str = fromUser2.getUid();
        } else {
            str = null;
        }
        String a = iVar.mo81568a(fromUser, str);
        Handler handler = this.f80465r;
        IMUser fromUser3 = this.f80464p.getFromUser();
        if (fromUser3 != null) {
            str2 = fromUser3.getUid();
        }
        C7077s.m22150a(handler, (CharSequence) str2, a, 1);
        if (this.f80464p.getChatType() == 1) {
            Handler handler2 = this.f80465r;
            IMUser fromUser4 = this.f80464p.getFromUser();
            if (fromUser4 != null) {
                String uid = fromUser4.getUid();
                if (uid != null) {
                    j = Long.parseLong(uid);
                    C7077s.m22149a(handler2, j, C31085i.f81578a.mo81570b(this.f80464p.getFromUser()), 0);
                }
            }
            j = 0;
            C7077s.m22149a(handler2, j, C31085i.f81578a.mo81570b(this.f80464p.getFromUser()), 0);
        }
    }

    /* renamed from: a */
    public final void mo80384a(C30985q qVar) {
        C7573i.m23587b(qVar, "messageObserver");
        super.mo80384a(qVar);
        qVar.f81113c = this.f80467t;
    }

    /* renamed from: a */
    public final void mo80386a(ImTextTitleBar imTextTitleBar) {
        String str;
        C7573i.m23587b(imTextTitleBar, "titleBar");
        super.mo80386a(imTextTitleBar);
        IMUser fromUser = this.f80464p.getFromUser();
        if (fromUser != null) {
            str = fromUser.getDisplayName();
        } else {
            str = null;
        }
        imTextTitleBar.setTitle(str);
        imTextTitleBar.setOnTitlebarClickListener(new C30729d(this));
    }

    /* renamed from: a */
    public final void mo27309a(Message message) {
        String str;
        C7573i.m23587b(message, "msg");
        Object obj = message.obj;
        if (obj != null) {
            switch (message.what) {
                case 0:
                    if (obj instanceof ApiServerException) {
                        C9738o.m28693a(C6399b.m19921a(), (int) R.string.br2);
                        return;
                    }
                    if (obj instanceof StrangerMessageList) {
                        mo80385a((StrangerMessageList) obj);
                    }
                    return;
                case 1:
                    if (!(obj instanceof ApiServerException)) {
                        if (obj instanceof UserStruct) {
                            User user = ((UserStruct) obj).getUser();
                            if (user != null) {
                                this.f80464p.setFromUser(IMUser.fromUser(user));
                                C6961d.m21657a().mo18026a(this.f80464p.getFromUser());
                                m100097h();
                                break;
                            } else {
                                C6921a.m21555a("IM Query User is null");
                                return;
                            }
                        }
                    } else if (((ApiServerException) obj).getErrorCode() == 2065) {
                        C6961d a = C6961d.m21657a();
                        IMUser fromUser = this.f80464p.getFromUser();
                        if (fromUser != null) {
                            str = fromUser.getUid();
                        } else {
                            str = null;
                        }
                        a.mo18031c(str);
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo80496a(int i, boolean z) {
        boolean z2;
        if (!C31915n.m103671a()) {
            IMUser fromUser = this.f80464p.getFromUser();
            if (fromUser != null) {
                CharSequence uid = fromUser.getUid();
                if (uid == null || uid.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (fromUser.getCommerceUserLevel() != 0 || fromUser.isWithCommerceEntry())) {
                    Conversation a = C6417a.m20015a().mo15530a(this.f80464p.getConversationId());
                    if (a != null && !a.isTemp()) {
                        C11474a a2 = new C11474a().mo27692a(i).mo27693a(a);
                        if (z && this.f80464p.getChatExt() != null) {
                            a2.mo27694a(this.f80464p.getChatExt());
                        }
                        a2.mo27695a();
                    }
                }
            }
        }
    }

    public SingleChatPanel(C0043i iVar, View view, SingleSessionInfo singleSessionInfo) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(singleSessionInfo, "currentSessionInfo");
        super(iVar, view, singleSessionInfo);
        this.f80464p = singleSessionInfo;
    }
}
