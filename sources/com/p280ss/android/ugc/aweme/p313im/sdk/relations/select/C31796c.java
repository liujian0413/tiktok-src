package com.p280ss.android.ugc.aweme.p313im.sdk.relations.select;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.AtMemberFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupCreateFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupListFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberAddFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberFansFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.GroupMemberRemoveFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationMemberSelectFragment;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c */
public final class C31796c {
    /* renamed from: a */
    public static Fragment m103226a(int i) {
        switch (i) {
            case 0:
                return new GroupCreateFragment();
            case 1:
                return new RelationMemberSelectFragment();
            case 2:
            case 3:
                return new GroupListFragment();
            case 4:
                return new GroupMemberAddFragment();
            case 5:
                return new GroupMemberRemoveFragment();
            case 6:
                return new AtMemberFragment();
            case 7:
                return new GroupMemberFansFragment();
            default:
                return new GroupCreateFragment();
        }
    }
}
