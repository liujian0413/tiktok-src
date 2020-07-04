package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import android.view.View;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j */
public final class C28952j extends C28955l {

    /* renamed from: a */
    public final C28933a f76292a;

    /* renamed from: b */
    public final IMContact f76293b;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j$a */
    static final class C28953a<T> implements C6892b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C28952j f76294a;

        C28953a(C28952j jVar) {
            this.f76294a = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(Boolean bool) {
            String str;
            String string = this.f76294a.f76292a.f76273d.f20186l.getString("enter_from");
            if (string == null) {
                string = "";
            }
            C22984d a = C22984d.m75611a().mo59973a("enter_from", string).mo59973a("platform", "chat");
            String str2 = "group_id";
            Aweme aweme = this.f76294a.f76297e;
            String str3 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C22984d a2 = a.mo59973a(str2, str);
            String str4 = "author_id";
            Aweme aweme2 = this.f76294a.f76297e;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            }
            Map<String, String> map = a2.mo59973a(str4, str3).mo59973a("conversation_id", C30553b.m99810g().getIMContactConversationId(this.f76294a.f76293b)).mo59973a("to_user_id", C30553b.m99810g().getIMContactUserId(this.f76294a.f76293b)).mo59973a("chat_type", C28952j.m95188a(this.f76294a.f76293b)).mo59970a("chat_cnt", 1).mo59970a("is_with_text", 0).mo59973a("enter_method", "long_press").f60753a;
            C6907h.m21524a("share_video_to_chat", (Map) map);
            C6907h.m21524a("share_video_success", (Map) map);
        }
    }

    /* renamed from: a */
    public final void mo74231a(View view) {
        C7573i.m23587b(view, "v");
        C30553b.m99810g().shareSingleMsg(view.getContext(), this.f76293b, this.f76292a.f76273d, new C28953a(this));
    }

    /* renamed from: a */
    public static String m95188a(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (iMContact instanceof IMConversation) {
            switch (((IMConversation) iMContact).getConversationType()) {
                case 1:
                    return "private";
                case 2:
                    return "group";
            }
        }
        return "";
    }

    public C28952j(C28933a aVar, IMContact iMContact) {
        C7573i.m23587b(aVar, "actionsManager");
        C7573i.m23587b(iMContact, "contact");
        super(aVar);
        this.f76292a = aVar;
        this.f76293b = iMContact;
    }
}
