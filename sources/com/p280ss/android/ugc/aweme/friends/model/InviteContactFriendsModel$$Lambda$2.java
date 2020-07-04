package com.p280ss.android.ugc.aweme.friends.model;

import bolts.C1591g;
import bolts.C1592h;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$2 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$2 implements C1591g {
    private final InviteContactFriendsModel arg$1;
    private final AtomicReference arg$2;

    InviteContactFriendsModel$$Lambda$2(InviteContactFriendsModel inviteContactFriendsModel, AtomicReference atomicReference) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = atomicReference;
    }

    public final Object then(C1592h hVar) {
        return this.arg$1.lambda$uploadContacts$2$InviteContactFriendsModel(this.arg$2, hVar);
    }
}
