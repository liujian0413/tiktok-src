package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31887b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.o */
public final class C31050o {

    /* renamed from: a */
    private Message f81494a;

    /* renamed from: b */
    private Animation f81495b;

    /* renamed from: c */
    private ImageView f81496c;

    /* renamed from: d */
    private OnAttachStateChangeListener f81497d;

    /* renamed from: c */
    private void m101313c() {
        if (this.f81496c != null) {
            C31887b.m103598a(this.f81496c);
            this.f81496c.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m101314d() {
        if (this.f81496c != null) {
            C31887b.m103598a(this.f81496c);
            this.f81496c.setImageResource(R.drawable.b5o);
            this.f81496c.setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m101315e() {
        if (this.f81497d == null) {
            this.f81497d = new OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                }

                public final void onViewAttachedToWindow(View view) {
                    C31050o.this.mo81520a();
                }
            };
        }
        this.f81496c.removeOnAttachStateChangeListener(this.f81497d);
        this.f81496c.addOnAttachStateChangeListener(this.f81497d);
    }

    /* renamed from: b */
    private void m101312b() {
        if (this.f81495b == null) {
            this.f81495b = C31887b.m103596a(800, null);
        }
        if (this.f81496c != null) {
            this.f81496c.setImageResource(R.drawable.ag6);
            this.f81496c.setVisibility(0);
            C31887b.m103598a(this.f81496c);
            this.f81496c.startAnimation(this.f81495b);
        }
    }

    /* renamed from: a */
    public final void mo81520a() {
        if (this.f81494a != null) {
            this.f81496c.setClickable(true);
            int msgStatus = this.f81494a.getMsgStatus();
            if (msgStatus != 5) {
                switch (msgStatus) {
                    case 0:
                        this.f81496c.setClickable(false);
                        m101312b();
                        return;
                    case 1:
                        this.f81496c.setClickable(false);
                        m101312b();
                        return;
                    case 2:
                        break;
                    case 3:
                        m101314d();
                        return;
                }
            }
            m101313c();
        }
    }

    public C31050o(ImageView imageView) {
        this.f81496c = imageView;
        m101315e();
    }

    /* renamed from: a */
    public final void mo81521a(Message message) {
        this.f81496c.setTag(50331648, Integer.valueOf(6));
        this.f81496c.setTag(67108864, message);
        this.f81494a = message;
        mo81520a();
    }
}
