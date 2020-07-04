package com.p280ss.android.ugc.aweme.friends.model;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$1 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$1 implements Callable {
    private final InviteContactFriendsModel arg$1;
    private final AtomicReference arg$2;

    InviteContactFriendsModel$$Lambda$1(InviteContactFriendsModel inviteContactFriendsModel, AtomicReference atomicReference) {
        this.arg$1 = inviteContactFriendsModel;
        this.arg$2 = atomicReference;
    }

    public final Object call() {
        return this.arg$1.lambda$uploadContacts$1$InviteContactFriendsModel(this.arg$2);
    }
}
