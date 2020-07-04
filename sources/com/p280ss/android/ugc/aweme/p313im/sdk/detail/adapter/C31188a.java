package com.p280ss.android.ugc.aweme.p313im.sdk.detail.adapter;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberSelectActivity.C31242a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationSelectActivity;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.adapter.a */
public final class C31188a {
    /* renamed from: a */
    public static final void m101657a(int i, String str, int i2) {
        Activity g = C6405d.m19984g();
        if (g != null) {
            if (i2 == 220) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_member_list_type", i);
                bundle.putString("session_id", str);
                RelationSelectActivity.m21880a(g, bundle, i2);
                return;
            }
            if (i2 == 221) {
                C31242a.m101792a(g, i, str, i2);
            }
        }
    }
}
