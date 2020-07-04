package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.C4508a;
import com.bytedance.android.livesdk.chatroom.interact.model.C4817b;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class InteractDialogPKUserListContract {

    public static abstract class View extends com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View<C4515a> {
        /* renamed from: a */
        public abstract void mo12324a(C4817b bVar);

        /* renamed from: a */
        public abstract void mo12325a(Room room, RivalExtraInfo rivalExtraInfo, int i);

        /* renamed from: a */
        public abstract void mo12326a(Room room, Throwable th, RivalExtraInfo rivalExtraInfo, int i);

        /* renamed from: a */
        public abstract void mo12327a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKUserListContract$a */
    public static abstract class C4515a extends C4508a<View> {
        /* renamed from: a */
        public abstract void mo12328a(int i);

        /* renamed from: a */
        public abstract void mo12329a(Room room, long j, RivalExtraInfo rivalExtraInfo, int i, int i2);

        /* renamed from: a */
        public abstract void mo12330a(Room room, long j, String str, int i, int i2, RivalExtraInfo rivalExtraInfo, int i3);

        protected C4515a(View view) {
            super(view);
        }
    }
}
