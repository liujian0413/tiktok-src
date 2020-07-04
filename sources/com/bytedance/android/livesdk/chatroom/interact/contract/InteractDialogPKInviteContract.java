package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.C4508a;

public final class InteractDialogPKInviteContract {

    public static abstract class View extends com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View<C4509a> {
        /* renamed from: a */
        public abstract void mo12288a(int i);

        /* renamed from: a */
        public abstract void mo12289a(boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract$a */
    public static abstract class C4509a extends C4508a<View> {
        /* renamed from: a */
        public abstract void mo12290a(int i);

        /* renamed from: a */
        public abstract void mo12291a(int i, long j, long j2, User user);

        /* renamed from: a */
        public abstract void mo12292a(long j, long j2, long j3, long j4);

        /* renamed from: c */
        public abstract void mo12293c();

        /* renamed from: d */
        public abstract void mo12294d();

        protected C4509a(View view) {
            super(view);
        }
    }
}
