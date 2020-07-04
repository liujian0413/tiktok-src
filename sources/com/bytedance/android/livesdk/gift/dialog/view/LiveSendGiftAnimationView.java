package com.bytedance.android.livesdk.gift.dialog.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveSendGiftAnimationView extends FrameLayout {

    /* renamed from: a */
    private Context f21406a;

    /* renamed from: b */
    private Pair<Float, Animator> f21407b;

    /* renamed from: c */
    private HSImageView f21408c;

    /* renamed from: d */
    private TextView f21409d;

    /* renamed from: e */
    private TextView f21410e;

    /* renamed from: f */
    private GiftViewModel f21411f;

    /* renamed from: a */
    private void m24286a() {
        View.inflate(this.f21406a, R.layout.aln, this);
        this.f21408c = (HSImageView) findViewById(R.id.ar5);
        this.f21409d = (TextView) findViewById(R.id.a8j);
        this.f21410e = (TextView) findViewById(R.id.d2s);
    }

    public void setViewModel(GiftViewModel giftViewModel) {
        this.f21411f = giftViewModel;
    }

    public LiveSendGiftAnimationView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo20754a(String str) {
        this.f21409d.setText(str);
    }

    /* renamed from: a */
    public final void mo20752a(float f) {
        if (this.f21407b == null || this.f21407b.second == null || this.f21407b.first == null || ((Float) this.f21407b.first).floatValue() != 1.08f) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 1.08f, 1.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 1.08f, 1.0f});
            this.f21407b = new Pair<>(Float.valueOf(1.08f), ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2}));
            ((Animator) this.f21407b.second).setDuration(200);
        }
        ((Animator) this.f21407b.second).start();
    }

    public LiveSendGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveSendGiftAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21406a = context;
        m24286a();
    }

    /* renamed from: a */
    public final void mo20753a(ImageModel imageModel, String str, int i, String str2) {
        C5343e.m17038a(this.f21408c, imageModel);
        this.f21409d.setText(str);
        this.f21409d.setTextColor(i);
        this.f21410e.setText(str2);
    }
}
