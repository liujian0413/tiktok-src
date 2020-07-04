package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarBorderView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive */
public class AvatarImageWithLive extends RelativeLayout {

    /* renamed from: a */
    private SmartAvatarBorderView f75580a;

    /* renamed from: b */
    private ImageView f75581b;

    public SmartAvatarBorderView getAvatarImageView() {
        return this.f75580a;
    }

    private LayoutParams getAvatarLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    private LayoutParams getLiveLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(m94426a(32), m94426a(13));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        layoutParams.topMargin = m94426a(1);
        return layoutParams;
    }

    /* renamed from: a */
    private void m94427a() {
        this.f75580a = new SmartAvatarBorderView(getContext());
        if (C6399b.m19946v()) {
            ((C13438a) this.f75580a.getHierarchy()).mo32891a((int) R.color.a5q, C13423b.f35599g);
        }
        addView(this.f75580a, getAvatarLayoutParams());
        this.f75581b = new ImageView(getContext());
        this.f75581b.setVisibility(8);
        addView(this.f75581b, getLiveLayoutParams());
    }

    public AvatarImageWithLive(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m94426a(int i) {
        return (int) C9738o.m28708b(getContext(), (float) i);
    }

    public void setBorderColor(int i) {
        if (this.f75580a != null) {
            this.f75580a.setBorderColor(i);
        }
    }

    /* renamed from: a */
    public final void mo73766a(boolean z) {
        if (!z) {
            this.f75581b.setVisibility(8);
            return;
        }
        this.f75581b.setVisibility(0);
        try {
            this.f75581b.setImageDrawable(getResources().getDrawable(R.drawable.a3l));
        } catch (NotFoundException unused) {
        }
    }

    public AvatarImageWithLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageWithLive(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m94427a();
    }
}
