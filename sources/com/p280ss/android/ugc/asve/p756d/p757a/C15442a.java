package com.p280ss.android.ugc.asve.p756d.p757a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.d.a.a */
public abstract class C15442a {

    /* renamed from: h */
    public static final C15443a f39733h = new C15443a(null);

    /* renamed from: a */
    public MotionEvent f39734a;

    /* renamed from: b */
    public MotionEvent f39735b;

    /* renamed from: c */
    public float f39736c;

    /* renamed from: d */
    public float f39737d;

    /* renamed from: e */
    public boolean f39738e;

    /* renamed from: f */
    public long f39739f;

    /* renamed from: g */
    public final Context f39740g;

    /* renamed from: com.ss.android.ugc.asve.d.a.a$a */
    public static final class C15443a {
        private C15443a() {
        }

        public /* synthetic */ C15443a(C7571f fVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38992a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo38994b(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38991a() {
        if (this.f39734a != null) {
            MotionEvent motionEvent = this.f39734a;
            if (motionEvent == null) {
                C7573i.m23580a();
            }
            motionEvent.recycle();
            this.f39734a = null;
        }
        if (this.f39735b != null) {
            MotionEvent motionEvent2 = this.f39735b;
            if (motionEvent2 == null) {
                C7573i.m23580a();
            }
            motionEvent2.recycle();
            this.f39735b = null;
        }
        this.f39738e = false;
    }

    public C15442a(Context context) {
        C7573i.m23587b(context, "mContext");
        this.f39740g = context;
    }

    /* renamed from: a */
    public final boolean mo38993a(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (!this.f39738e) {
            mo38992a(action, motionEvent);
        } else {
            mo38994b(action, motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo38995b(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "curr");
        MotionEvent motionEvent2 = this.f39734a;
        if (this.f39735b != null) {
            MotionEvent motionEvent3 = this.f39735b;
            if (motionEvent3 == null) {
                C7573i.m23580a();
            }
            motionEvent3.recycle();
            this.f39735b = null;
        }
        this.f39735b = MotionEvent.obtain(motionEvent);
        long eventTime = motionEvent.getEventTime();
        if (motionEvent2 == null) {
            C7573i.m23580a();
        }
        this.f39739f = eventTime - motionEvent2.getEventTime();
        this.f39736c = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f39737d = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
