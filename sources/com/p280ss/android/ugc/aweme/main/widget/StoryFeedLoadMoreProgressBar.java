package com.p280ss.android.ugc.aweme.main.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.mvvm.C23359d;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.IViewDefault;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.p1068a.C23509b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.widget.StoryFeedLoadMoreProgressBar */
public class StoryFeedLoadMoreProgressBar extends IViewDefault<C23509b> {
    private Context mContext;

    public StoryFeedLoadMoreProgressBar(Context context) {
        super(context);
        this.mContext = context;
    }

    public void bind(C23509b bVar) {
        if (bVar.f62027a != 0) {
            this.mView.setBackgroundColor(bVar.f62027a);
        }
    }

    public C23359d create(Context context, ViewGroup viewGroup) {
        this.mView = LayoutInflater.from(this.mContext).inflate(R.layout.b5f, viewGroup, false);
        return this;
    }
}
