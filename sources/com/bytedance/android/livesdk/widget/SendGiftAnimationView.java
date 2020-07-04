package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class SendGiftAnimationView extends RelativeLayout implements C6310a {

    /* renamed from: a */
    public Context f25193a;

    /* renamed from: b */
    public TextView f25194b;

    /* renamed from: c */
    private TextView f25195c;

    /* renamed from: d */
    private HSImageView f25196d;

    /* renamed from: e */
    private TextView f25197e;

    /* renamed from: f */
    private Handler f25198f;

    /* renamed from: g */
    private Pair<Float, Animator> f25199g;

    /* renamed from: com.bytedance.android.livesdk.widget.SendGiftAnimationView$a */
    public static class C9216a {
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    public final void mo22587a() {
        this.f25198f.removeCallbacksAndMessages(null);
        this.f25194b.setText(R.string.fc6);
    }

    /* renamed from: b */
    private void m27430b() {
        View.inflate(this.f25193a, R.layout.as3, this);
        this.f25195c = (TextView) findViewById(R.id.c33);
        this.f25196d = (HSImageView) findViewById(R.id.a4g);
        this.f25197e = (TextView) findViewById(R.id.a8j);
        this.f25194b = (TextView) findViewById(R.id.a_6);
    }

    public SendGiftAnimationView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo22588a(float f) {
        if (this.f25199g == null || this.f25199g.second == null || this.f25199g.first == null || ((Float) this.f25199g.first).floatValue() != f) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, f, 1.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, f, 1.0f});
            this.f25199g = new Pair<>(Float.valueOf(f), ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2}));
            ((Animator) this.f25199g.second).setDuration(200);
        }
        ((Animator) this.f25199g.second).start();
    }

    /* renamed from: a */
    public final void mo22589a(C8149d dVar) {
        if (dVar != null) {
            if (dVar.f22240k != 0) {
                this.f25195c.setTextColor(dVar.f22240k);
            } else {
                this.f25195c.setTextColor(this.f25193a.getResources().getColor(R.color.as5));
            }
            this.f25195c.setText(dVar.f22230a);
            if (dVar.f22241l != 0) {
                this.f25197e.setTextColor(dVar.f22241l);
            } else {
                this.f25197e.setTextColor(this.f25193a.getResources().getColor(R.color.am7));
            }
            if ((5 == dVar.f22234e || dVar.f22235f != 0) && !(5 == dVar.f22234e && dVar.f22243n == 0)) {
                C9738o.m28712b((View) this.f25197e, 0);
            } else {
                C9738o.m28712b((View) this.f25197e, 4);
            }
            if (5 == dVar.f22234e) {
                this.f25197e.setText(this.f25193a.getString(R.string.ehd, new Object[]{Integer.valueOf(dVar.f22243n)}));
            } else {
                this.f25197e.setText(this.f25193a.getString(R.string.ehf, new Object[]{Integer.valueOf(dVar.f22235f)}));
            }
            C5343e.m17038a(this.f25196d, dVar.f22231b);
        }
    }

    public SendGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SendGiftAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25193a = context;
        this.f25198f = new C6309f(Looper.getMainLooper(), this);
        m27430b();
    }
}
