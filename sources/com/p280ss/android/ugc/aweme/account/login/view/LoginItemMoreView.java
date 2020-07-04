package com.p280ss.android.ugc.aweme.account.login.view;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.account.views.AutoRTLImageView;
import com.p280ss.android.ugc.aweme.base.mvvm.C23359d;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.C23363c;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.LoginItemMoreView */
public class LoginItemMoreView extends IViewDefault<C23363c> {
    public ImageView mImageView;

    public LoginItemMoreView(Context context) {
        super(context);
    }

    public void bind(C23363c cVar) {
        this.mView.setOnClickListener(cVar.f61447b);
    }

    public C23359d create(Context context, ViewGroup viewGroup) {
        this.mImageView = new AutoRTLImageView(context);
        int b = (int) C9738o.m28708b(context, 36.0f);
        int b2 = (int) C9738o.m28708b(context, 8.0f);
        this.mImageView.setLayoutParams(new LayoutParams(b, C23481i.m77094e(R.dimen.ii)));
        this.mImageView.setPadding(b2, b2, b2, b2);
        this.mImageView.setImageResource(R.drawable.aik);
        this.mImageView.setScaleType(ScaleType.CENTER);
        this.mView = this.mImageView;
        this.mView.setOnTouchListener(new C34032a(0.5f, 150, null));
        return this;
    }
}
