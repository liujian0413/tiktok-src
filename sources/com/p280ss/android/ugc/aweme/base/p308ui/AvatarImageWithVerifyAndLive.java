package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerifyAndLive */
public class AvatarImageWithVerifyAndLive extends AvatarImageWithVerify {

    /* renamed from: f */
    private ImageView f61661f;

    private LayoutParams getLiveLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(m76799a(41), m76799a(17));
        layoutParams.gravity = 49;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60894a() {
        super.mo60894a();
        LayoutParams liveLayoutParams = getLiveLayoutParams();
        this.f61661f = new ImageView(getContext());
        try {
            this.f61661f.setImageDrawable(getResources().getDrawable(R.drawable.a3l));
        } catch (NotFoundException unused) {
        }
        this.f61661f.setVisibility(8);
        addView(this.f61661f, liveLayoutParams);
    }

    public AvatarImageWithVerifyAndLive(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m76799a(int i) {
        return (int) C9738o.m28708b(getContext(), (float) i);
    }

    /* renamed from: a */
    public final void mo60905a(boolean z) {
        if (!z) {
            this.f61661f.setVisibility(8);
        } else {
            this.f61661f.setVisibility(0);
        }
    }

    public AvatarImageWithVerifyAndLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageWithVerifyAndLive(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
