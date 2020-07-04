package com.p280ss.android.ugc.aweme.account.login.view;

import android.content.Context;
import android.support.p029v7.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a;
import com.p280ss.android.ugc.aweme.base.mvvm.C23359d;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.LoginItemView */
public class LoginItemView extends IViewDefault<C22162a> {
    public ImageView mImageView;

    public LoginItemView(Context context) {
        super(context);
    }

    public void bind(C22162a aVar) {
        this.mImageView.setImageResource(aVar.f59214a);
        this.mImageView.setOnClickListener(aVar.f59215b);
    }

    public C23359d create(Context context, ViewGroup viewGroup) {
        this.mImageView = new AppCompatImageView(context);
        int e = C23481i.m77094e(R.dimen.ii);
        this.mImageView.setLayoutParams(new LayoutParams(e, e));
        this.mView = this.mImageView;
        return this;
    }
}
