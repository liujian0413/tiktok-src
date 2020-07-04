package com.bytedance.android.livesdk.coupon;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5596au;
import com.bytedance.android.livesdk.commerce.coupon.C5843a;
import com.bytedance.android.livesdk.coupon.C5873e.C5874a;
import com.bytedance.android.livesdk.p397k.C8349c;
import com.bytedance.android.livesdk.p397k.C8362l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

public final class LiveCouponWidget extends LiveRecyclableWidget implements OnClickListener, C5874a, C9302a {

    /* renamed from: a */
    private final int f17335a = 100;

    /* renamed from: b */
    private final C9301a f17336b = new C9301a(Looper.getMainLooper(), this);

    /* renamed from: c */
    private C5882f f17337c;

    /* renamed from: d */
    private C5843a f17338d;

    /* renamed from: e */
    private LottieAnimationView f17339e;

    /* renamed from: f */
    private View f17340f;

    /* renamed from: g */
    private Room f17341g;

    /* renamed from: h */
    private boolean f17342h;

    /* renamed from: i */
    private C5873e f17343i;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public final int getLayoutId() {
        return R.layout.ama;
    }

    public final void onUnload() {
        C5873e eVar = this.f17343i;
        if (eVar != null) {
            eVar.mo8963a();
        }
        m18356a();
    }

    /* renamed from: a */
    private final void m18356a() {
        LottieAnimationView lottieAnimationView = this.f17339e;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        View view = this.f17340f;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    private final void m18358b() {
        String str;
        if (this.f17337c != null) {
            Handler handler = this.f17336b;
            C5882f fVar = this.f17337c;
            if (fVar != null) {
                str = fVar.f17410a;
            } else {
                str = null;
            }
            C8349c.m25447a(handler, str, 5, this.f17335a);
        }
    }

    /* renamed from: b */
    public final void mo14407b(boolean z) {
        if (!z) {
            m18356a();
        }
    }

    /* renamed from: a */
    public final void mo14405a(C5882f fVar) {
        this.f17337c = fVar;
        if (this.f17342h) {
            m18358b();
        }
    }

    public final void onClick(View view) {
        if (view != null && view.getId() == R.id.x5) {
            C5873e eVar = this.f17343i;
            if (eVar != null) {
                eVar.mo14413b();
            }
        }
    }

    /* renamed from: a */
    private final void m18357a(C8362l lVar) {
        if (lVar != null && lVar.f22919a == 5) {
            C5843a aVar = this.f17338d;
            if (aVar != null) {
                aVar.mo14349a(lVar, this.f17339e, true);
            }
            View view = this.f17340f;
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.f17343i != null) {
                C5873e.m18369a("livesdk_coupon_show", new String[0]);
            }
        }
    }

    public final void onInit(Object[] objArr) {
        this.f17339e = (LottieAnimationView) this.contentView.findViewById(R.id.a45);
        this.f17340f = this.contentView.findViewById(R.id.x5);
        View view = this.f17340f;
        if (view != null) {
            view.setOnClickListener(this);
        }
        Context context = this.context;
        C7573i.m23582a((Object) context, "context");
        this.f17343i = new C5873e(context, false);
    }

    public final void onLoad(Object[] objArr) {
        long j;
        C5843a aVar = null;
        this.f17341g = (Room) this.dataCenter.get("data_room", null);
        C5873e eVar = this.f17343i;
        if (eVar != null) {
            Room room = this.f17341g;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            eVar.f17386c = j;
        }
        C5873e eVar2 = this.f17343i;
        if (eVar2 != null) {
            eVar2.mo9142a((C5874a) this);
        }
        C5873e eVar3 = this.f17343i;
        if (eVar3 != null) {
            aVar = eVar3.f17387d;
        }
        this.f17338d = aVar;
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        Integer num;
        Object obj = null;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        if (message != null) {
            obj = message.obj;
        }
        int i = this.f17335a;
        if (num != null && num.intValue() == i && (obj instanceof C8362l)) {
            m18357a((C8362l) obj);
        }
    }

    /* renamed from: a */
    public final void mo14406a(boolean z) {
        if (z) {
            this.f17342h = true;
            m18358b();
            return;
        }
        this.f17342h = false;
        m18356a();
    }
}
