package com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b */
public final class C31257b {

    /* renamed from: a */
    public static final C31257b f81941a = new C31257b();

    private C31257b() {
    }

    /* renamed from: a */
    private static void m101860a(Context context) {
        C7573i.m23587b(context, "context");
        C10761a.m31399c(context, (int) R.string.bna).mo25750a();
    }

    /* renamed from: a */
    public static final void m101861a(Context context, C11438g gVar) {
        boolean z;
        C7573i.m23587b(context, "context");
        if (gVar != null) {
            CharSequence charSequence = gVar.f30960e;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                GroupCheckMsg groupCheckMsg = (GroupCheckMsg) C31913m.m103667a(gVar.f30960e, GroupCheckMsg.class);
                if (groupCheckMsg != null) {
                    CharSequence statusMsg = groupCheckMsg.getStatusMsg();
                    if (statusMsg == null || statusMsg.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        C10761a.m31403c(context, groupCheckMsg.getStatusMsg()).mo25750a();
                        return;
                    }
                }
                m101860a(context);
                return;
            }
        }
        m101860a(context);
    }

    /* renamed from: a */
    public static final void m101862a(Context context, String str, Runnable runnable) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Conversation a = new C6425b(str).mo15562a();
            C7573i.m23582a((Object) a, "ConversationModel(conversationId).conversation");
            if (a.isMember() && !C31256a.m101859a(str)) {
                runnable.run();
                return;
            }
        }
        C10761a.m31399c(context, (int) R.string.bnu).mo25750a();
    }
}
