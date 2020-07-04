package com.p280ss.android.ugc.aweme.friends.model;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$searchKeyWord$2 */
final class AtFriendsViewModel$searchKeyWord$2<TTaskResult, TContinuationResult> implements C1591g<List<? extends IMUser>, C1592h<List<? extends IMUser>>> {
    final /* synthetic */ AtFriendsViewModel this$0;

    AtFriendsViewModel$searchKeyWord$2(AtFriendsViewModel atFriendsViewModel) {
        this.this$0 = atFriendsViewModel;
    }

    public final C1592h<List<IMUser>> then(C1592h<List<IMUser>> hVar) {
        C7573i.m23582a((Object) hVar, "task");
        if (!hVar.mo6889d() && !hVar.mo6887c()) {
            List list = (List) hVar.mo6890e();
            if (list != null) {
                this.this$0.latestSearchUsers.clear();
                this.this$0.latestSearchUsers.addAll(list);
            }
        }
        return hVar;
    }
}
