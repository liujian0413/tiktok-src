package com.p280ss.android.ugc.aweme.music.adapter;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ShowLessViewHolder_ViewBinding */
public class ShowLessViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ShowLessViewHolder f88066a;

    public void unbind() {
        ShowLessViewHolder showLessViewHolder = this.f88066a;
        if (showLessViewHolder != null) {
            this.f88066a = null;
            showLessViewHolder.tvShowLess = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ShowLessViewHolder_ViewBinding(ShowLessViewHolder showLessViewHolder, View view) {
        this.f88066a = showLessViewHolder;
        showLessViewHolder.tvShowLess = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.e1y, "field 'tvShowLess'", LinearLayout.class);
    }
}
