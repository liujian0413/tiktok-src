package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseVideoRedEnvelopeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommonRedEnvelopeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupAnnouncementContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30736d;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31517b;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.IMBaseSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.IMBaseSession.Status;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31087k;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.C6966a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31871aq;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a */
public final class C31482a {
    /* renamed from: a */
    public static C7102a m102378a(Conversation conversation) {
        return m102379a(conversation, false);
    }

    /* renamed from: a */
    private static C7102a m102379a(Conversation conversation, boolean z) {
        if (conversation == null) {
            return null;
        }
        if (conversation.isSingleChat()) {
            return m102383b(conversation, false);
        }
        if (conversation.isGroupChat()) {
            return m102384c(conversation, false);
        }
        return null;
    }

    /* renamed from: a */
    public static String m102380a(BaseContent baseContent, Message message) {
        if (baseContent instanceof StoryReplyContent) {
            return StoryReplyContent.wrapMessageHint(message, baseContent.getMsgHint());
        }
        if ((baseContent instanceof CommonRedEnvelopeContent) || (baseContent instanceof BaseVideoRedEnvelopeContent)) {
            return C30736d.m100131a(message, baseContent.getMsgHint());
        }
        return baseContent.getMsgHint();
    }

    /* renamed from: b */
    private static C7102a m102383b(Conversation conversation, boolean z) {
        Message lastMessage = conversation.getLastMessage();
        if (lastMessage == null || C6425b.m20074a(conversation.getConversationId()) <= 0) {
            return null;
        }
        ChatSession chatSession = new ChatSession();
        chatSession.f19941e = conversation.getConversationId();
        if (!z) {
            chatSession.f19948l = C31871aq.m103559a(conversation);
        }
        chatSession.f19794b = C30733a.m100117b(conversation);
        chatSession.f19946j = (int) conversation.getUnreadCount();
        long createdAt = lastMessage.getCreatedAt();
        if (!z && conversation.isStickTop()) {
            createdAt = Math.max(createdAt, conversation.getUpdatedTime());
        }
        chatSession.mo18368a(createdAt);
        if (13 == lastMessage.getMsgType()) {
            chatSession.f19802c = Status.SUCCESS;
        } else {
            chatSession.f19802c = IMBaseSession.m21834a(lastMessage.getMsgStatus());
        }
        BaseContent content = MessageViewType.content(lastMessage);
        if (content != null) {
            chatSession.f19944h = m102380a(content, lastMessage);
        }
        if (lastMessage.getMsgType() == 7 || lastMessage.getMsgType() == 52) {
            chatSession.f19951o = true;
        }
        return chatSession;
    }

    /* renamed from: c */
    private static C7102a m102384c(Conversation conversation, boolean z) {
        Message lastMessage = conversation.getLastMessage();
        String str = null;
        if (lastMessage == null) {
            return null;
        }
        C31517b bVar = new C31517b();
        bVar.f19941e = conversation.getConversationId();
        if (!z) {
            bVar.f19948l = C31871aq.m103559a(conversation);
        }
        bVar.f19946j = (int) conversation.getUnreadCount();
        long createdAt = lastMessage.getCreatedAt();
        if (!z && conversation.isStickTop()) {
            createdAt = Math.max(createdAt, conversation.getUpdatedTime());
        }
        bVar.mo18368a(createdAt);
        if (conversation.getCoreInfo() != null) {
            str = conversation.getCoreInfo().getIcon();
        }
        bVar.f19942f = str;
        if (13 == lastMessage.getMsgType()) {
            bVar.f19802c = Status.SUCCESS;
        } else {
            bVar.f19802c = IMBaseSession.m21834a(lastMessage.getMsgStatus());
        }
        BaseContent content = MessageViewType.content(lastMessage);
        if (content != null) {
            bVar.f19944h = m102381a(bVar, content, lastMessage);
        }
        if (lastMessage.getMsgType() == 7 || lastMessage.getMsgType() == 52) {
            bVar.f19951o = true;
        }
        if (lastMessage.getMsgType() == 1001 && content != null) {
            Map ext = lastMessage.getExt();
            if (ext == null) {
                ext = new HashMap();
            }
            if (!ext.containsKey("group_notice_show")) {
                ext.put("group_notice_show", "show");
                lastMessage.setExt(ext);
                lastMessage.setContent(C31913m.m103668a(content));
                C31863ai.m103529a(lastMessage);
            }
        }
        if (conversation.getCoreInfo() == null || TextUtils.isEmpty(conversation.getCoreInfo().getName())) {
            bVar.f19943g = C6399b.m19921a().getString(R.string.bk6);
        } else {
            bVar.f19943g = conversation.getCoreInfo().getName();
        }
        return bVar;
    }

    /* renamed from: a */
    private static String m102381a(C31517b bVar, BaseContent baseContent, Message message) {
        StringBuilder sb = new StringBuilder();
        if (message.isRecalled()) {
            IMUser a = C6961d.m21657a().mo18019a((String) message.getExt().get("s:recall_uid"));
            if (!message.isSelf() && a != null) {
                sb.append(a.getDisplayName());
                sb.append(": ");
            }
            if (C31863ai.m103540g(message)) {
                sb.append(C6399b.m19921a().getResources().getString(R.string.bms));
            } else if (message.isSelf()) {
                sb.append(baseContent.getMsgHint());
            } else {
                sb.append(C6399b.m19921a().getResources().getString(R.string.bmv));
            }
        } else {
            IMUser a2 = C6961d.m21657a().mo18019a(String.valueOf(message.getSender()));
            if (!(message.isSelf() || message.getMsgType() == 1002 || message.getMsgType() == 1001)) {
                if (a2 != null) {
                    sb.append(a2.getDisplayName());
                    sb.append(": ");
                } else if (bVar.f82514a <= 0) {
                    bVar.f82514a = 1;
                    C6961d.m21657a().mo18020a(String.valueOf(message.getSender()), (C6966a) new C31484b(bVar, baseContent, message));
                }
            }
            if (baseContent instanceof StoryReplyContent) {
                sb.append(StoryReplyContent.wrapMessageHint(message, baseContent.getMsgHint()));
            } else if ((baseContent instanceof CommonRedEnvelopeContent) || (baseContent instanceof BaseVideoRedEnvelopeContent)) {
                sb.append(C30736d.m100131a(message, baseContent.getMsgHint()));
            } else {
                sb.append(baseContent.getMsgHint());
            }
            if (baseContent instanceof GroupAnnouncementContent) {
                sb = new StringBuilder();
                sb.append(baseContent.getMsgHint());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static final /* synthetic */ void m102382a(C31517b bVar, BaseContent baseContent, Message message, IMUser iMUser) {
        if (iMUser != null) {
            String a = m102381a(bVar, baseContent, message);
            bVar.f19944h = a;
            C7705c.m23799a().mo20394d(new C31087k(bVar.bf_(), a));
        }
    }
}
