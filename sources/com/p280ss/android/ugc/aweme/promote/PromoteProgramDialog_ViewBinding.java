package com.p280ss.android.ugc.aweme.promote;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramDialog_ViewBinding */
public class PromoteProgramDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PromoteProgramDialog f96755a;

    public void unbind() {
        PromoteProgramDialog promoteProgramDialog = this.f96755a;
        if (promoteProgramDialog != null) {
            this.f96755a = null;
            promoteProgramDialog.mTvTitle = null;
            promoteProgramDialog.mTvMsg = null;
            promoteProgramDialog.mTvProtocol = null;
            promoteProgramDialog.mBtnJoin = null;
            promoteProgramDialog.mBtnNext = null;
            promoteProgramDialog.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PromoteProgramDialog_ViewBinding(PromoteProgramDialog promoteProgramDialog, View view) {
        this.f96755a = promoteProgramDialog;
        promoteProgramDialog.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.e3f, "field 'mTvTitle'", TextView.class);
        promoteProgramDialog.mTvMsg = (TextView) Utils.findRequiredViewAsType(view, R.id.dy4, "field 'mTvMsg'", TextView.class);
        promoteProgramDialog.mTvProtocol = (TextView) Utils.findRequiredViewAsType(view, R.id.e05, "field 'mTvProtocol'", TextView.class);
        promoteProgramDialog.mBtnJoin = Utils.findRequiredView(view, R.id.qh, "field 'mBtnJoin'");
        promoteProgramDialog.mBtnNext = Utils.findRequiredView(view, R.id.qz, "field 'mBtnNext'");
        promoteProgramDialog.mRootView = Utils.findRequiredView(view, R.id.cwi, "field 'mRootView'");
        promoteProgramDialog.mStrRegular = view.getContext().getResources().getString(R.string.d8m);
    }
}
