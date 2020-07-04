package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.os.Bundle;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ae */
public final class C31859ae {

    /* renamed from: a */
    public static final C31859ae f83324a = new C31859ae();

    private C31859ae() {
    }

    /* renamed from: a */
    public static final void m103516a() {
        C6907h.onEventV3("index_bar_click");
    }

    /* renamed from: a */
    public static void m103518a(Conversation conversation, String str) {
        String str2;
        C22984d dVar;
        C7573i.m23587b(conversation, "conversation");
        C7573i.m23587b(str, "readStatus");
        String str3 = "message_read_status";
        C22984d a = C22984d.m75611a().mo59973a("conversation_id", conversation.getConversationId());
        String str4 = "chat_type";
        if (conversation.isGroupChat()) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        C22984d a2 = a.mo59973a(str4, str2);
        if (!conversation.isGroupChat()) {
            dVar = a2;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.mo59971a("to_user_id", C6425b.m20074a(conversation.getConversationId()));
        }
        C6907h.m21524a(str3, (Map) a2.mo59973a("read_status", str).f60753a);
    }

    /* renamed from: a */
    public static final void m103517a(Bundle bundle, String str, boolean z) {
        String str2;
        C7573i.m23587b(bundle, "shareExtra");
        C7573i.m23587b(str, "conversationId");
        String str3 = "share_video_success";
        C22984d a = C22984d.m75611a().mo59973a("platform", "chat").mo59973a("group_id", bundle.getString("aid")).mo59973a("author_id", bundle.getString("author_id")).mo59973a("enter_from", bundle.getString("enter_from")).mo59973a("conversation_id", str);
        String str4 = "chat_type";
        if (z) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("enter_method", "more_button").f60753a);
    }

    /* renamed from: a */
    public static final void m103519a(SharePackage sharePackage, String str, List<IMContact> list) {
        int i;
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(list, "contactList");
        String str2 = "share_video_to_chat";
        C22984d a = C22984d.m75611a().mo59973a("platform", "chat").mo59973a("group_id", sharePackage.f20186l.getString("aid")).mo59973a("author_id", sharePackage.f20186l.getString("author_id")).mo59973a("enter_from", sharePackage.f20186l.getString("enter_from")).mo59973a("conversation_id", C6959c.m21650a(list).toString()).mo59970a("chat_cnt", list.size());
        String str3 = "is_with_text";
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        C6907h.m21524a(str2, (Map) a.mo59970a(str3, i ^ 1).mo59973a("enter_method", "more_button").f60753a);
    }
}
