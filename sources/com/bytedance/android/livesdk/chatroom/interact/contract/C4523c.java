package com.bytedance.android.livesdk.chatroom.interact.contract;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.common.C5858d;
import com.bytedance.android.livesdk.common.C5859e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.c */
public final class C4523c {

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.c$a */
    public static abstract class C4524a extends C5858d<C4525b> {
        /* renamed from: a */
        public abstract User mo12351a();

        /* renamed from: a */
        public abstract void mo12352a(int i);

        /* renamed from: a */
        public abstract void mo12353a(long j);

        /* renamed from: a */
        public abstract void mo12354a(C4854e eVar);

        /* renamed from: b */
        public abstract Room mo12355b();

        /* renamed from: c */
        public abstract long mo12356c();

        /* renamed from: d */
        public abstract int mo12357d();

        /* renamed from: e */
        public abstract boolean mo12358e();

        /* renamed from: g */
        public abstract C4854e mo12359g();

        /* renamed from: h_ */
        public abstract boolean mo12360h_();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.c$b */
    public interface C4525b extends C5859e {
        /* renamed from: a */
        void mo12361a(int i, boolean z);

        /* renamed from: a */
        void mo12362a(long j);

        /* renamed from: a */
        void mo12363a(User user);

        /* renamed from: a */
        void mo12364a(boolean z);

        /* renamed from: b */
        void mo12365b(boolean z);

        void setVisibility(boolean z);
    }
}
