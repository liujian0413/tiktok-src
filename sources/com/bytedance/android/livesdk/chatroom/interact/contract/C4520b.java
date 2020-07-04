package com.bytedance.android.livesdk.chatroom.interact.contract;

import android.arch.lifecycle.C0043i;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.b */
public final class C4520b {

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.b$a */
    public interface C4521a {
        /* renamed from: a */
        void mo12348a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.b$b */
    public interface C4522b {
        /* renamed from: a */
        void mo12143a();

        /* renamed from: a */
        void mo12147a(View view);

        /* renamed from: b */
        android.view.View mo12148b();

        /* renamed from: c */
        Room mo12151c();

        /* renamed from: d */
        C0043i mo12153d();

        void dismiss();

        void setCancelable(boolean z);
    }
}
