package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.C4508a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class InteractDialogPKMatchContract {

    public static abstract class View extends com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View<C4510a> {
        /* renamed from: a */
        public abstract void mo12295a(int i);

        /* renamed from: a */
        public abstract void mo12296a(Room room, int i);

        /* renamed from: a */
        public abstract void mo12297a(String str);

        /* renamed from: a */
        public abstract void mo12298a(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKMatchContract$a */
    public static abstract class C4510a extends C4508a<View> {
        /* renamed from: a */
        public abstract void mo12299a(int i);

        /* renamed from: a */
        public abstract void mo12300a(long j);

        /* renamed from: a */
        public abstract void mo12301a(Room room, long j, String str, int i, int i2);

        /* renamed from: c */
        public abstract void mo12302c();

        /* renamed from: d */
        public abstract void mo12303d();

        /* renamed from: e */
        public abstract boolean mo12304e();

        protected C4510a(View view) {
            super(view);
        }
    }
}
