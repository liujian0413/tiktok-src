package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.stream.p141a.C2947a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2948a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2952e;
import com.bytedance.android.livesdk.chatroom.event.C4456z;
import com.bytedance.android.livesdk.chatroom.event.C4456z.C4457a;

/* renamed from: com.bytedance.android.live.broadcast.effect.r */
public final class C2651r {

    /* renamed from: a */
    private C2952e f8461a = new C2952e();

    public C2651r(C2947a aVar) {
        aVar.mo9677a((C2948a) this.f8461a);
    }

    public final void onEvent(C4456z zVar) {
        if (zVar != null) {
            int i = zVar.f12923a;
            C4457a aVar = zVar.f12924b;
            switch (i) {
                case 201:
                    m10805a(aVar.f12926b, aVar.f12927c, aVar.f12925a);
                    return;
                case 202:
                    m10807b(aVar.f12926b, aVar.f12927c, aVar.f12925a);
                    return;
                case 203:
                    m10804a(aVar.f12926b, aVar.f12927c, aVar.f12928d, aVar.f12929e, aVar.f12930f);
                    return;
                case 204:
                    m10803a(aVar.f12926b, aVar.f12927c);
                    return;
                case 205:
                    m10806b(aVar.f12931g, aVar.f12930f);
                    return;
                case 206:
                    m10808c(aVar.f12926b, aVar.f12927c);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m10803a(float f, float f2) {
        if (this.f8461a != null) {
            this.f8461a.mo9716b(f, f2);
        }
    }

    /* renamed from: b */
    private void m10806b(float f, float f2) {
        if (this.f8461a != null) {
            this.f8461a.mo9718c(f, f2);
        }
    }

    /* renamed from: c */
    private void m10808c(float f, float f2) {
        if (this.f8461a != null) {
            this.f8461a.mo9713a(f, f2);
        }
    }

    /* renamed from: b */
    private void m10807b(float f, float f2, int i) {
        if (this.f8461a != null) {
            this.f8461a.mo9717b(f, f2, i);
        }
    }

    /* renamed from: a */
    private void m10805a(float f, float f2, int i) {
        if (this.f8461a != null) {
            this.f8461a.mo9715a(f, f2, i);
        }
    }

    /* renamed from: a */
    private void m10804a(float f, float f2, float f3, float f4, float f5) {
        if (this.f8461a != null) {
            this.f8461a.mo9714a(f, f2, f3, f4, f5);
        }
    }
}
