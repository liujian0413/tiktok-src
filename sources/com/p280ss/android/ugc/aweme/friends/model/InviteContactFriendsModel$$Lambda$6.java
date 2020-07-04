package com.p280ss.android.ugc.aweme.friends.model;

import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$6 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$6 implements Callable {
    private final InviteContactFriendsModel arg$1;
    private final IFetchShareConfigCallback arg$2;

    InviteContactFriendsModel$$Lambda$6(InviteContactFriendsModel inviteContactFriendsModel, IFetchShareConfigCallback iFetchShareConfigCallback) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = iFetchShareConfigCallback;
    }

    public final Object call() {
        return this.arg$1.lambda$fetchShareConfig$8$InviteContactFriendsModel(this.arg$2);
    }
}
