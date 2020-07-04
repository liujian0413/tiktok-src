package com.bytedance.android.livesdk.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.view.C0991u;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.effect.video.p389b.C8074a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftUserInfoView extends ConstraintLayout {

    /* renamed from: g */
    private ImageView f25006g;

    /* renamed from: h */
    private ImageView f25007h;

    /* renamed from: i */
    private TextView f25008i;

    /* renamed from: j */
    private TextView f25009j;

    /* renamed from: k */
    private HSImageView f25010k;

    /* renamed from: l */
    private ObjectAnimator f25011l;

    /* renamed from: m */
    private AnimatorSet f25012m;

    /* renamed from: n */
    private AnimatorSet f25013n;

    /* renamed from: o */
    private long f25014o;

    private int getLayoutResource() {
        return R.layout.awm;
    }

    public long getUserId() {
        return this.f25014o;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m27353d();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    public final void mo20986c() {
        if (C0991u.m4170G(this)) {
            setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void mo20984b() {
        if (C0991u.m4170G(this)) {
            if (this.f25012m == null) {
                this.f25012m = C8074a.m24771a(this);
            }
            if (!this.f25012m.isRunning()) {
                this.f25012m.start();
            }
        }
    }

    /* renamed from: d */
    private void m27353d() {
        this.f25006g.setImageDrawable(null);
        this.f25007h.setImageDrawable(null);
        this.f25008i.setText(null);
        this.f25009j.setText(null);
        this.f25010k.setImageDrawable(null);
        if (this.f25011l != null) {
            this.f25011l.cancel();
        }
        if (this.f25012m != null) {
            this.f25012m.cancel();
        }
        if (this.f25013n != null) {
            this.f25013n.cancel();
        }
    }

    public void setUserId(long j) {
        this.f25014o = j;
    }

    public GiftUserInfoView(Context context) {
        super(context);
        m27352a(context);
    }

    public void setDescriptionText(String str) {
        this.f25009j.setText(str);
    }

    public void setDescriptionTextColor(int i) {
        this.f25009j.setTextColor(i);
    }

    public void setSpannable(Spannable spannable) {
        this.f25009j.setText(spannable);
    }

    public void setUserNameText(String str) {
        this.f25008i.setText(str);
    }

    public void setUserNameTextColor(int i) {
        this.f25008i.setTextColor(i);
    }

    public void setAvatarImage(ImageModel imageModel) {
        if (imageModel != null) {
            C5343e.m17031a(this.f25006g, imageModel, (int) R.drawable.cce);
        }
    }

    public void setHonorImage(ImageModel imageModel) {
        if (imageModel != null) {
            C5343e.m17043b(this.f25007h, imageModel);
        }
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (imageModel == null) {
            this.f25010k.setVisibility(4);
            return;
        }
        this.f25010k.setVisibility(0);
        C5343e.m17030a((ImageView) this.f25010k, imageModel);
    }

    /* renamed from: a */
    public final void mo22442a(long j) {
        int i;
        boolean z = false;
        if (this.f25009j.getLayout() != null) {
            i = ((int) this.f25009j.getLayout().getLineWidth(0)) - ((this.f25009j.getWidth() - this.f25009j.getCompoundPaddingRight()) - this.f25009j.getCompoundPaddingLeft());
            if (i > 0) {
                z = true;
            }
        } else {
            i = 0;
        }
        if (z) {
            this.f25009j.postDelayed(new C9240d(this, i), j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo20985b(int i) {
        if (this.f25009j.getScrollX() != 0 && C3519c.m12965a(getContext())) {
            i = this.f25009j.getScrollX() - i;
        }
        this.f25011l = ObjectAnimator.ofInt(this.f25009j, "scrollX", new int[]{i}).setDuration(2000);
        this.f25011l.setInterpolator(new LinearInterpolator());
        this.f25011l.start();
    }

    /* renamed from: a */
    private void m27352a(Context context) {
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        this.f25006g = (ImageView) findViewById(R.id.j2);
        this.f25007h = (ImageView) findViewById(R.id.avy);
        this.f25008i = (TextView) findViewById(R.id.e9t);
        this.f25009j = (TextView) findViewById(R.id.a7p);
        this.f25010k = (HSImageView) findViewById(R.id.b65);
    }

    public GiftUserInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m27352a(context);
    }

    public GiftUserInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m27352a(context);
    }
}
