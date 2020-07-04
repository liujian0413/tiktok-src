package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.utility.R$styleable;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class AvatarIconView extends FrameLayout {

    /* renamed from: a */
    private ImageView f16872a;

    /* renamed from: b */
    private ImageView f16873b;

    /* renamed from: c */
    private ImageView f16874c;

    /* renamed from: d */
    private int f16875d;

    /* renamed from: e */
    private int f16876e;

    /* renamed from: f */
    private int f16877f;

    public AvatarIconView(Context context) {
        this(context, null);
    }

    public void setAvatar(int i) {
        C5343e.m17029a(this.f16872a, i);
    }

    public void setAvatar(ImageModel imageModel) {
        if (imageModel != null) {
            C5343e.m17045b(this.f16872a, imageModel, this.f16875d, this.f16875d, R.drawable.cdk);
        }
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (imageModel != null) {
            this.f16873b.setVisibility(0);
            C5343e.m17032a(this.f16873b, imageModel, this.f16876e, this.f16876e);
            return;
        }
        this.f16873b.setVisibility(8);
    }

    public void setIcon(ImageModel imageModel) {
        if (imageModel != null) {
            this.f16874c.setVisibility(0);
            C5343e.m17034a(this.f16874c, imageModel, this.f16877f, this.f16877f, -1);
            return;
        }
        this.f16874c.setVisibility(4);
    }

    public AvatarIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16875d = (int) C9738o.m28708b(context, 100.0f);
        this.f16877f = (int) C9738o.m28708b(context, 42.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AvatarIconView);
            this.f16875d = obtainStyledAttributes.getDimensionPixelSize(1, this.f16875d);
            this.f16876e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f16877f = obtainStyledAttributes.getDimensionPixelSize(2, this.f16877f);
            obtainStyledAttributes.recycle();
        }
        this.f16872a = new ImageView(context);
        LayoutParams layoutParams = new LayoutParams(this.f16875d, this.f16875d);
        layoutParams.gravity = 17;
        this.f16872a.setLayoutParams(layoutParams);
        addView(this.f16872a);
        this.f16873b = new ImageView(context);
        LayoutParams layoutParams2 = new LayoutParams(this.f16876e, this.f16876e);
        layoutParams2.gravity = 17;
        this.f16873b.setLayoutParams(layoutParams2);
        addView(this.f16873b);
        this.f16874c = new ImageView(context);
        LayoutParams layoutParams3 = new LayoutParams(this.f16877f, this.f16877f);
        layoutParams3.bottomMargin = (int) C9738o.m28708b(context, 3.0f);
        layoutParams3.rightMargin = (int) C9738o.m28708b(context, 2.0f);
        layoutParams3.gravity = 8388693;
        this.f16874c.setLayoutParams(layoutParams3);
        addView(this.f16874c);
        this.f16874c.setVisibility(4);
    }
}
