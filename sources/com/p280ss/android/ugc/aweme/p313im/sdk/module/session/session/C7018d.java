package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.StrangerListActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.d */
public final class C7018d extends C7020e {
    private C7018d() {
    }

    /* renamed from: b */
    public final int mo18115b() {
        return 2;
    }

    public final String bf_() {
        return "stranger_1";
    }

    /* renamed from: a */
    public final C32013b mo18114a() {
        return new C32013b() {
            /* renamed from: a */
            public final void mo18117a(Context context, C7102a aVar, int i) {
                if (i == 1) {
                    StrangerListActivity.m102492a(context);
                    C7018d.m21838f();
                    C31858ad.m103406a().mo82717j("stranger");
                }
            }
        };
    }

    /* renamed from: f */
    public static void m21838f() {
        C0688e.m2941a(C6399b.m19921a()).mo2839a(new Intent("message_stranger_mark_read_action"));
    }

    /* renamed from: a */
    public static C7018d m21837a(C7020e eVar) {
        C7018d dVar = new C7018d();
        dVar.f19944h = eVar.f19944h;
        dVar.f19943g = eVar.f19943g;
        dVar.mo18368a(eVar.f19945i);
        return dVar;
    }

    /* renamed from: a */
    public static C7018d m21836a(Bundle bundle) {
        long j;
        C7018d dVar = new C7018d();
        long j2 = bundle.getLong("last_create_time");
        String string = bundle.getString("from_user_name");
        String string2 = bundle.getString("from_user_content");
        int i = bundle.getInt("from_user_msg_type");
        int i2 = bundle.getInt("unread_count");
        boolean z = bundle.getBoolean("is_recalled");
        String string3 = bundle.getString("from_user_id");
        if (TextUtils.isEmpty(string3)) {
            j = 0;
        } else {
            j = Long.parseLong(string3);
        }
        dVar.f19944h = MessageViewType.content(i, string2, z, j).getMsgHint();
        dVar.mo18368a(j2);
        dVar.f19946j = i2;
        dVar.f19943g = string;
        return dVar;
    }
}
