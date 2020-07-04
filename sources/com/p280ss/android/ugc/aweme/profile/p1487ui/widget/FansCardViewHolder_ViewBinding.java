package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.FansCardViewHolder_ViewBinding */
public class FansCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FansCardViewHolder f96039a;

    public void unbind() {
        FansCardViewHolder fansCardViewHolder = this.f96039a;
        if (fansCardViewHolder != null) {
            this.f96039a = null;
            fansCardViewHolder.txtFansCount = null;
            fansCardViewHolder.ivFansPlatform = null;
            fansCardViewHolder.txtPlatform = null;
            fansCardViewHolder.ivDetailFans = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FansCardViewHolder_ViewBinding(FansCardViewHolder fansCardViewHolder, View view) {
        this.f96039a = fansCardViewHolder;
        fansCardViewHolder.txtFansCount = (TextView) Utils.findRequiredViewAsType(view, R.id.aia, "field 'txtFansCount'", TextView.class);
        fansCardViewHolder.ivFansPlatform = (CircleImageView) Utils.findRequiredViewAsType(view, R.id.aim, "field 'ivFansPlatform'", CircleImageView.class);
        fansCardViewHolder.txtPlatform = (TextView) Utils.findRequiredViewAsType(view, R.id.cca, "field 'txtPlatform'", TextView.class);
        fansCardViewHolder.ivDetailFans = (ImageView) Utils.findRequiredViewAsType(view, R.id.a7x, "field 'ivDetailFans'", ImageView.class);
    }
}
