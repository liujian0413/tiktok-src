package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.arch.lifecycle.C0043i;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter.AtMemberAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter.GroupMemberFansAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter.GroupMemberSelectAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.adapter.GroupSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.BaseSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationMemberListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationMemberSelectListAdapter;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.e */
public final class C31774e {
    /* renamed from: a */
    public static BaseSelectListAdapter<IMContact> m103150a(C0043i iVar, int i) {
        C7573i.m23587b(iVar, "owner");
        switch (i) {
            case 0:
            case 4:
                return new RelationMemberListAdapter<>(iVar);
            case 1:
                return new RelationMemberSelectListAdapter<>(iVar);
            case 2:
            case 3:
                return new GroupSelectListAdapter<>(iVar);
            case 5:
                return new GroupMemberSelectAdapter<>(iVar);
            case 6:
                return new AtMemberAdapter<>(iVar);
            case 7:
                return new GroupMemberFansAdapter<>(iVar);
            default:
                return new RelationMemberListAdapter<>(iVar);
        }
    }
}
