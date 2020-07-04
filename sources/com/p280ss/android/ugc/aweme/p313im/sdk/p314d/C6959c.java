package com.p280ss.android.ugc.aweme.p313im.sdk.p314d;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31891bc;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.c */
public final class C6959c {

    /* renamed from: a */
    public static final C6959c f19667a = new C6959c();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.c$a */
    static final class C6960a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ IMContact f19668a;

        /* renamed from: b */
        final /* synthetic */ String f19669b;

        C6960a(IMContact iMContact, String str) {
            this.f19668a = iMContact;
            this.f19669b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m21656a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m21656a() {
            IMUser a = C6961d.m21661a(this.f19668a);
            if (a != null) {
                C31085i.f81578a.mo81571c(a.getUid());
                C31891bc.m103605a(a.getUid());
                C31858ad.m103406a();
                C31858ad.m103469e(a.getUid(), this.f19669b, "click_contact_head");
            }
        }
    }

    private C6959c() {
    }

    /* renamed from: a */
    public static final List<String> m21650a(List<IMContact> list) {
        C7573i.m23587b(list, "contactList");
        Object[] array = list.toArray(new IMContact[0]);
        if (array != null) {
            return m21651a((IMContact[]) array);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static final String m21649a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "contact");
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        if (!(iMContact instanceof IMUser)) {
            return null;
        }
        String uid = ((IMUser) iMContact).getUid();
        C7573i.m23582a((Object) uid, "contact.uid");
        return C6425b.m20076a(Long.parseLong(uid));
    }

    /* renamed from: b */
    public static final String m21654b(IMContact iMContact) {
        C7573i.m23587b(iMContact, "contact");
        if (iMContact instanceof IMUser) {
            return ((IMUser) iMContact).getUid();
        }
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == C11203a.f30380a) {
                return String.valueOf(C6425b.m20074a(iMConversation.getConversationId()));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final IMContact m21648a(Conversation conversation) {
        C7573i.m23587b(conversation, "conversation");
        if (conversation.getConversationType() == C11203a.f30380a) {
            IMUser b = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(conversation.getConversationId())));
            if (b != null) {
                return b;
            }
            return null;
        }
        IMConversation iMConversation = new IMConversation();
        iMConversation.setConversationType(conversation.getConversationType());
        iMConversation.setConversationId(conversation.getConversationId());
        iMConversation.setConversationMemberCount(conversation.getMemberCount());
        ConversationCoreInfo coreInfo = conversation.getCoreInfo();
        if (coreInfo != null) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(Collections.singletonList(coreInfo.getIcon()));
            iMConversation.setConversationAvatar(urlModel);
            iMConversation.setConversationName(coreInfo.getName());
        }
        return iMConversation;
    }

    /* renamed from: a */
    public static final List<String> m21651a(IMContact[] iMContactArr) {
        C7573i.m23587b(iMContactArr, "contactArray");
        ArrayList arrayList = new ArrayList();
        for (IMConversation iMConversation : iMContactArr) {
            if (iMConversation instanceof IMConversation) {
                arrayList.add(iMConversation.getConversationId());
            } else if (iMConversation instanceof IMUser) {
                String uid = ((IMUser) iMConversation).getUid();
                C7573i.m23582a((Object) uid, "contact.uid");
                arrayList.add(C6425b.m20076a(Long.parseLong(uid)));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final void m21655b(Context context, IMContact iMContact, C7561a<C7581n> aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(iMContact, "contact");
        C7573i.m23587b(aVar, "defaultAction");
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == C11203a.f30381b) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 6);
                ChatRoomActivity.m21596a(context, iMConversation.getConversationId(), 3, bundle);
                C31858ad.m103406a();
                C31858ad.m103432a(iMConversation.getConversationId(), "", "group", "share_toast", "");
                return;
            }
        }
        aVar.invoke();
    }

    /* renamed from: a */
    public static final void m21652a(Context context, IMContact iMContact, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(iMContact, "contact");
        C7573i.m23587b(str, "enterFrom");
        m21653a(context, iMContact, (C7561a<C7581n>) new C6960a<C7581n>(iMContact, str));
    }

    /* renamed from: a */
    public static final void m21653a(Context context, IMContact iMContact, C7561a<C7581n> aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(iMContact, "contact");
        C7573i.m23587b(aVar, "defaultAction");
        if (!(iMContact instanceof IMConversation) || ((IMConversation) iMContact).getConversationType() != C11203a.f30381b) {
            aVar.invoke();
        } else {
            C10761a.m31409e(context, (int) R.string.brv).mo25750a();
        }
    }
}
