package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.SmartAvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.TagLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.LocationCellBViewHolder_ViewBinding */
public class LocationCellBViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocationCellBViewHolder f74001a;

    public void unbind() {
        LocationCellBViewHolder locationCellBViewHolder = this.f74001a;
        if (locationCellBViewHolder != null) {
            this.f74001a = null;
            locationCellBViewHolder.mAvHeadView = null;
            locationCellBViewHolder.mTvLocation = null;
            locationCellBViewHolder.txtDistance = null;
            locationCellBViewHolder.mTvName = null;
            locationCellBViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LocationCellBViewHolder_ViewBinding(LocationCellBViewHolder locationCellBViewHolder, View view) {
        this.f74001a = locationCellBViewHolder;
        locationCellBViewHolder.mAvHeadView = (SmartAvatarImageView) Utils.findRequiredViewAsType(view, R.id.ic, "field 'mAvHeadView'", SmartAvatarImageView.class);
        locationCellBViewHolder.mTvLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.buj, "field 'mTvLocation'", TextView.class);
        locationCellBViewHolder.txtDistance = (TextView) Utils.findRequiredViewAsType(view, R.id.e6k, "field 'txtDistance'", TextView.class);
        locationCellBViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, R.id.b45, "field 'mTvName'", TextView.class);
        locationCellBViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.dg3, "field 'tagLayout'", TagLayout.class);
    }
}
