package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EncryptedVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.CircleProgressTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.video.h */
public final class C30976h {

    /* renamed from: a */
    public Message f81092a;

    /* renamed from: b */
    public CircleProgressTextView f81093b;

    /* renamed from: c */
    private ImageView f81094c;

    /* renamed from: d */
    private ImageView f81095d;

    /* renamed from: e */
    private C30966a f81096e;

    /* renamed from: f */
    private OnAttachStateChangeListener f81097f;

    /* renamed from: b */
    private void m100795b() {
        C30973g.f81089f.mo81364c(this.f81092a);
        this.f81095d.setVisibility(0);
        this.f81093b.setVisibility(8);
    }

    /* renamed from: c */
    private void m100796c() {
        if (this.f81097f == null) {
            this.f81097f = new OnAttachStateChangeListener() {
                public final void onViewAttachedToWindow(View view) {
                    C30976h.this.mo81366a();
                }

                public final void onViewDetachedFromWindow(View view) {
                    C30973g.f81089f.mo81364c(C30976h.this.f81092a);
                }
            };
        }
        this.f81093b.removeOnAttachStateChangeListener(this.f81097f);
        this.f81093b.addOnAttachStateChangeListener(this.f81097f);
    }

    /* renamed from: d */
    private void m100797d() {
        if (this.f81096e == null) {
            this.f81096e = new C30966a() {
                /* renamed from: a */
                public final void mo18257a() {
                    C30976h.this.f81093b.setProgress(1.0d);
                }

                /* renamed from: a */
                public final void mo18258a(double d) {
                    C30976h.this.f81093b.setProgress(d);
                }

                /* renamed from: a */
                public final void mo18259a(String str) {
                    C30976h.this.f81093b.setProgress(0.0d);
                }

                /* renamed from: a */
                public final void mo18261a(Throwable th) {
                    C30976h.this.f81093b.setProgress(0.0d);
                }

                /* renamed from: a */
                public final void mo81355a(String str, EncryptedVideoContent encryptedVideoContent, EncryptUrlModel encryptUrlModel) {
                    C30976h.this.f81093b.setProgress(1.0d);
                }
            };
        }
        C30973g.f81089f.mo81363a(this.f81092a, this.f81096e);
    }

    /* renamed from: a */
    public final void mo81366a() {
        if (this.f81092a != null) {
            int msgStatus = this.f81092a.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f81093b.setVisibility(0);
                        this.f81095d.setVisibility(8);
                        this.f81094c.setVisibility(8);
                        this.f81093b.setProgress(0.0d);
                        m100797d();
                        return;
                    case 1:
                        this.f81094c.setVisibility(8);
                        m100795b();
                        return;
                    case 2:
                        break;
                    case 3:
                        this.f81094c.setVisibility(0);
                        m100795b();
                        return;
                }
            }
            this.f81094c.setVisibility(8);
            m100795b();
        }
    }

    /* renamed from: a */
    public final void mo81367a(Message message) {
        this.f81092a = message;
        mo81366a();
    }

    public C30976h(CircleProgressTextView circleProgressTextView, ImageView imageView, ImageView imageView2) {
        this.f81095d = imageView;
        this.f81093b = circleProgressTextView;
        this.f81094c = imageView2;
        m100796c();
    }
}
