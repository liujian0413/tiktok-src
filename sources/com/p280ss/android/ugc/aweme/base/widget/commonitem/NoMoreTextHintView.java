package com.p280ss.android.ugc.aweme.base.widget.commonitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.mvvm.C23359d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.p1068a.C23508a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.widget.commonitem.NoMoreTextHintView */
public class NoMoreTextHintView implements C23359d<C23508a> {
    private TextView mView;

    public View getAndroidView() {
        return this.mView;
    }

    public void refresh() {
    }

    public NoMoreTextHintView(Context context) {
    }

    public void bind(C23508a aVar) {
        C23487o.m77145a(this.mView, (CharSequence) aVar.f62025a);
        if (aVar.f62026b != 0) {
            this.mView.setBackgroundColor(aVar.f62026b);
        }
    }

    public C23359d create(Context context, ViewGroup viewGroup) {
        this.mView = (TextView) LayoutInflater.from(context).inflate(R.layout.b5j, viewGroup, false);
        return this;
    }
}
