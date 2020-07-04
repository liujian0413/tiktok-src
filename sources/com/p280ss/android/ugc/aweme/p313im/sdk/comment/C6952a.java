package com.p280ss.android.ugc.aweme.p313im.sdk.comment;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.CommentContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.comment.ImCommentReplyDialog.C31064a;
import com.p280ss.android.ugc.aweme.p313im.sdk.comment.ImCommentReplyDialog.C31065b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7105b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.comment.a */
public final class C6952a {
    /* renamed from: a */
    public static void m21628a(final Context context, final C7105b bVar) {
        new C31065b(context).mo81544a(bVar).mo81546b(new C31064a() {
            /* renamed from: a */
            public final void mo18005a(final String str) {
                new C6928b(context, new C6943d() {
                    public final void sendMsg() {
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(CommentContent.obtain(bVar));
                        arrayList.add(TextContent.obtain(str));
                        C7058be.m21980a().mo18270b(bVar.f19966h.getUid(), (List) arrayList);
                        C10761a.m31400c(context, (int) R.string.bpe, 1).mo25750a();
                    }
                }).sendMsg();
            }
        }).mo81543a((C31064a) new C31064a() {
            /* renamed from: a */
            public final void mo18005a(String str) {
            }
        }).mo81545a().show();
    }
}
