package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.BaseDiscoveryAndSearchFragment_ViewBinding */
public class BaseDiscoveryAndSearchFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseDiscoveryAndSearchFragment f70902a;

    public void unbind() {
        BaseDiscoveryAndSearchFragment baseDiscoveryAndSearchFragment = this.f70902a;
        if (baseDiscoveryAndSearchFragment != null) {
            this.f70902a = null;
            baseDiscoveryAndSearchFragment.mGapStatusBar = null;
            baseDiscoveryAndSearchFragment.mSearchInputView = null;
            baseDiscoveryAndSearchFragment.mBtnClear = null;
            baseDiscoveryAndSearchFragment.mTvSearch = null;
            baseDiscoveryAndSearchFragment.mBackView = null;
            baseDiscoveryAndSearchFragment.mBottomContainer = null;
            baseDiscoveryAndSearchFragment.mIntermediateView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseDiscoveryAndSearchFragment_ViewBinding(BaseDiscoveryAndSearchFragment baseDiscoveryAndSearchFragment, View view) {
        this.f70902a = baseDiscoveryAndSearchFragment;
        baseDiscoveryAndSearchFragment.mGapStatusBar = Utils.findRequiredView(view, R.id.aq1, "field 'mGapStatusBar'");
        baseDiscoveryAndSearchFragment.mSearchInputView = (EditText) Utils.findRequiredViewAsType(view, R.id.agn, "field 'mSearchInputView'", EditText.class);
        baseDiscoveryAndSearchFragment.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, R.id.pw, "field 'mBtnClear'", ImageButton.class);
        baseDiscoveryAndSearchFragment.mTvSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.e1h, "field 'mTvSearch'", TextView.class);
        baseDiscoveryAndSearchFragment.mBackView = (ImageView) Utils.findRequiredViewAsType(view, R.id.jr, "field 'mBackView'", ImageView.class);
        baseDiscoveryAndSearchFragment.mBottomContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.aoy, "field 'mBottomContainer'", FrameLayout.class);
        baseDiscoveryAndSearchFragment.mIntermediateView = (SearchIntermediateView) Utils.findRequiredViewAsType(view, R.id.d11, "field 'mIntermediateView'", SearchIntermediateView.class);
    }
}
