package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30963v;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.CircleProgressTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.i */
public final class C31033i {

    /* renamed from: a */
    public Message f81459a;

    /* renamed from: b */
    public CircleProgressTextView f81460b;

    /* renamed from: c */
    private ImageView f81461c;

    /* renamed from: d */
    private C30981y f81462d;

    /* renamed from: e */
    private OnAttachStateChangeListener f81463e;

    /* renamed from: b */
    private void m101277b() {
        if (this.f81463e == null) {
            this.f81463e = new OnAttachStateChangeListener() {
                public final void onViewAttachedToWindow(View view) {
                    C31033i.this.mo81500a();
                }

                public final void onViewDetachedFromWindow(View view) {
                    C30963v.m100755a().mo81332a(C31033i.this.f81459a);
                }
            };
        }
        this.f81460b.removeOnAttachStateChangeListener(this.f81463e);
        this.f81460b.addOnAttachStateChangeListener(this.f81463e);
    }

    /* renamed from: c */
    private void m101278c() {
        if (this.f81462d == null) {
            this.f81462d = new C30981y() {
                /* renamed from: a */
                public final void mo18257a() {
                    C31033i.this.f81460b.setProgress(1.0d);
                }

                /* renamed from: a */
                public final void mo18258a(double d) {
                    C31033i.this.f81460b.setProgress(d);
                }

                /* renamed from: a */
                public final void mo18259a(String str) {
                    C31033i.this.f81460b.setProgress(0.0d);
                }

                /* renamed from: a */
                public final void mo18261a(Throwable th) {
                    C31033i.this.f81460b.setProgress(0.0d);
                }

                /* renamed from: a */
                public final void mo18260a(String str, UrlModel urlModel) {
                    C31033i.this.f81460b.setProgress(1.0d);
                }
            };
        }
        C30963v.m100755a().mo81333a(this.f81459a, this.f81462d);
    }

    /* renamed from: a */
    public final void mo81500a() {
        if (this.f81459a != null) {
            int msgStatus = this.f81459a.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f81460b.setVisibility(0);
                        this.f81461c.setVisibility(8);
                        this.f81460b.setProgress(0.0d);
                        m101278c();
                        return;
                    case 1:
                        C30963v.m100755a().mo81332a(this.f81459a);
                        this.f81460b.setVisibility(8);
                        this.f81461c.setVisibility(8);
                        return;
                    case 2:
                        break;
                    case 3:
                        C30963v.m100755a().mo81332a(this.f81459a);
                        this.f81461c.setVisibility(0);
                        this.f81460b.setVisibility(8);
                        return;
                }
            }
            C30963v.m100755a().mo81332a(this.f81459a);
            this.f81460b.setVisibility(8);
            this.f81461c.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo81501a(Message message) {
        this.f81459a = message;
        mo81500a();
    }

    public C31033i(CircleProgressTextView circleProgressTextView, ImageView imageView) {
        this.f81460b = circleProgressTextView;
        this.f81461c = imageView;
        m101277b();
    }
}
