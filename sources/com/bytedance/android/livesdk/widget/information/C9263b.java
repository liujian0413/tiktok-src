package com.bytedance.android.livesdk.widget.information;

import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.widget.information.b */
public final class C9263b extends RelativeLayout implements OnMessageListener {

    /* renamed from: b */
    public static final C9264a f25423b = new C9264a(null);

    /* renamed from: f */
    private static final String f25424f = C9263b.class.getSimpleName();

    /* renamed from: g */
    private static final int f25425g = 4;

    /* renamed from: h */
    private static final int f25426h = f25426h;

    /* renamed from: i */
    private static final int f25427i = 50;

    /* renamed from: a */
    public int f25428a;

    /* renamed from: c */
    private int f25429c;

    /* renamed from: d */
    private int f25430d;

    /* renamed from: e */
    private Room f25431e;

    /* renamed from: com.bytedance.android.livesdk.widget.information.b$a */
    public static final class C9264a {
        private C9264a() {
        }

        public /* synthetic */ C9264a(C7571f fVar) {
            this();
        }
    }

    public final void setRoom(Room room) {
        C7573i.m23587b(room, "room");
        this.f25431e = room;
    }

    public final void onMessage(IMessage iMessage) {
        C7573i.m23587b(iMessage, "message");
        if ((iMessage instanceof C8680m) || (iMessage instanceof C8548cj)) {
            if (this.f25430d < f25426h) {
                this.f25430d++;
            }
        } else if ((iMessage instanceof C8514bj) && this.f25429c < f25426h) {
            this.f25429c++;
        }
    }
}
