package com.p280ss.android.ugc.aweme.friends.model;

import com.p280ss.android.ugc.aweme.friends.invite.SmgSettingsModel;
import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$$Lambda$7 */
final /* synthetic */ class InviteContactFriendsModel$$Lambda$7 implements Runnable {
    private final IFetchShareConfigCallback arg$1;
    private final SmgSettingsModel arg$2;

    InviteContactFriendsModel$$Lambda$7(IFetchShareConfigCallback iFetchShareConfigCallback, SmgSettingsModel smgSettingsModel) {
        this.arg$1 = iFetchShareConfigCallback;
        this.arg$2 = smgSettingsModel;
    }

    public final void run() {
        InviteContactFriendsModel.lambda$null$7$InviteContactFriendsModel(this.arg$1, this.arg$2);
    }
}
