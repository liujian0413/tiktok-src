package com.p280ss.android.ugc.aweme.poi.p335ui.coupon;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.poi.widget.MerchantAvatarImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.GotCouponDialog_ViewBinding */
public class GotCouponDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GotCouponDialog f92521a;

    public void unbind() {
        GotCouponDialog gotCouponDialog = this.f92521a;
        if (gotCouponDialog != null) {
            this.f92521a = null;
            gotCouponDialog.headImageIv = null;
            gotCouponDialog.headImageIvBg = null;
            gotCouponDialog.vMask = null;
            gotCouponDialog.avatarImageView = null;
            gotCouponDialog.merchantNameTv = null;
            gotCouponDialog.tvCongrats = null;
            gotCouponDialog.tvISee = null;
            gotCouponDialog.tvTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GotCouponDialog_ViewBinding(GotCouponDialog gotCouponDialog, View view) {
        this.f92521a = gotCouponDialog;
        gotCouponDialog.headImageIv = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.aub, "field 'headImageIv'", RemoteImageView.class);
        gotCouponDialog.headImageIvBg = (ImageView) Utils.findRequiredViewAsType(view, R.id.auc, "field 'headImageIvBg'", ImageView.class);
        gotCouponDialog.vMask = Utils.findRequiredView(view, R.id.e_d, "field 'vMask'");
        gotCouponDialog.avatarImageView = (MerchantAvatarImageView) Utils.findRequiredViewAsType(view, R.id.j2, "field 'avatarImageView'", MerchantAvatarImageView.class);
        gotCouponDialog.merchantNameTv = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.by4, "field 'merchantNameTv'", DmtTextView.class);
        gotCouponDialog.tvCongrats = (TextView) Utils.findRequiredViewAsType(view, R.id.dsa, "field 'tvCongrats'", TextView.class);
        gotCouponDialog.tvISee = (TextView) Utils.findRequiredViewAsType(view, R.id.dw2, "field 'tvISee'", TextView.class);
        gotCouponDialog.tvTitle = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.e3f, "field 'tvTitle'", DmtTextView.class);
    }
}
