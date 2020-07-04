package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31644f.C31645a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.h */
public final class C31657h extends C31644f<Conversation, IMContact> {

    /* renamed from: a */
    public static final C31659b f82875a = new C31659b(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.h$a */
    public static final class C31658a extends C31645a<C31657h, Conversation, IMContact> {

        /* renamed from: a */
        public final C31657h f82876a = new C31657h();

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C31657h mo82428b() {
            return this.f82876a;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C31644f mo82427a() {
            return this.f82876a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.h$b */
    public static final class C31659b {
        private C31659b() {
        }

        /* renamed from: a */
        public static C31658a m102879a() {
            return new C31658a();
        }

        public /* synthetic */ C31659b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.h$c */
    static final /* synthetic */ class C31660c extends FunctionReference implements C7562b<Conversation, IMContact> {
        C31660c(C31657h hVar) {
            super(1, hVar);
        }

        public final String getName() {
            return "convert";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C31657h.class);
        }

        public final String getSignature() {
            return "convert(Lcom/bytedance/im/core/model/Conversation;)Lcom/ss/android/ugc/aweme/im/service/model/IMContact;";
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public IMContact invoke(Conversation conversation) {
            C7573i.m23587b(conversation, "p1");
            return ((C31657h) this.receiver).mo82444a(conversation);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C7562b<Conversation, IMContact> mo82421g() {
        return new C31660c<>(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final List<Conversation> mo82422h() {
        C6417a a = C6417a.m20015a();
        C7573i.m23582a((Object) a, "ConversationListModel.inst()");
        return a.mo15547d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final List<Conversation> mo82423i() {
        throw new UnsupportedOperationException("Recent not support load more");
    }

    /* renamed from: a */
    public final IMContact mo82444a(Conversation conversation) {
        IMContact c;
        if (conversation.isSingleChat()) {
            c = m102870b(conversation);
        } else {
            c = m102871c(conversation);
        }
        return c;
    }

    /* renamed from: b */
    private static IMUser m102870b(Conversation conversation) {
        long a = C6425b.m20074a(conversation.getConversationId());
        if (a <= 0) {
            return null;
        }
        IMUser b = C6961d.m21657a().mo18029b(String.valueOf(a));
        if (b == null) {
            return null;
        }
        b.setStickTop(conversation.isStickTop());
        b.setType(1);
        return b;
    }

    /* renamed from: c */
    private static IMConversation m102871c(Conversation conversation) {
        boolean z;
        String str;
        IMConversation iMConversation = new IMConversation();
        iMConversation.setConversationId(conversation.getConversationId());
        iMConversation.setConversationType(conversation.getConversationType());
        iMConversation.setConversationMemberCount(conversation.getMemberCount());
        iMConversation.setStickTop(conversation.isStickTop());
        ConversationCoreInfo coreInfo = conversation.getCoreInfo();
        if (coreInfo != null) {
            CharSequence icon = coreInfo.getIcon();
            boolean z2 = false;
            if (icon == null || icon.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(C7525m.m23457a(coreInfo.getIcon()));
                iMConversation.setConversationAvatar(urlModel);
            }
            CharSequence name = coreInfo.getName();
            if (name == null || name.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str = C6399b.m19921a().getString(R.string.brv);
            } else {
                str = coreInfo.getName();
            }
            iMConversation.setConversationName(str);
        }
        iMConversation.setType(1);
        return iMConversation;
    }
}
