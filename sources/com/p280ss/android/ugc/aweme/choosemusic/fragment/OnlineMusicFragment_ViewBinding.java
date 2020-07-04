package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.choosemusic.view.StarTcmItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.OnlineMusicFragment_ViewBinding */
public class OnlineMusicFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private OnlineMusicFragment f63233a;

    public void unbind() {
        OnlineMusicFragment onlineMusicFragment = this.f63233a;
        if (onlineMusicFragment != null) {
            this.f63233a = null;
            onlineMusicFragment.mRelativeSearch = null;
            onlineMusicFragment.mLinearSearch = null;
            onlineMusicFragment.mSearchTextView = null;
            onlineMusicFragment.mCancelSearch = null;
            onlineMusicFragment.mStatusView = null;
            onlineMusicFragment.mSearchEditTextContainer = null;
            onlineMusicFragment.mListViewBackground = null;
            onlineMusicFragment.mSearchEditView = null;
            onlineMusicFragment.mBackView = null;
            onlineMusicFragment.mSkipView = null;
            onlineMusicFragment.mSearchBg = null;
            onlineMusicFragment.mSearchLayout = null;
            onlineMusicFragment.mMainLayout = null;
            onlineMusicFragment.txtClickRecommend = null;
            onlineMusicFragment.llRecommendMusic = null;
            onlineMusicFragment.starTcmItem = null;
            onlineMusicFragment.cancelChooseMusicContainer = null;
            onlineMusicFragment.currentChooseMusicNameTv = null;
            onlineMusicFragment.cancelCurrentChooseMusicTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public OnlineMusicFragment_ViewBinding(OnlineMusicFragment onlineMusicFragment, View view) {
        this.f63233a = onlineMusicFragment;
        onlineMusicFragment.mRelativeSearch = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cux, "field 'mRelativeSearch'", LinearLayout.class);
        onlineMusicFragment.mLinearSearch = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bsa, "field 'mLinearSearch'", LinearLayout.class);
        onlineMusicFragment.mSearchTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.e1a, "field 'mSearchTextView'", TextView.class);
        onlineMusicFragment.mCancelSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.e1c, "field 'mCancelSearch'", TextView.class);
        onlineMusicFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
        onlineMusicFragment.mSearchEditTextContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cuz, "field 'mSearchEditTextContainer'", LinearLayout.class);
        onlineMusicFragment.mListViewBackground = Utils.findRequiredView(view, R.id.brs, "field 'mListViewBackground'");
        onlineMusicFragment.mSearchEditView = (EditText) Utils.findRequiredViewAsType(view, R.id.e1_, "field 'mSearchEditView'", EditText.class);
        onlineMusicFragment.mBackView = Utils.findRequiredView(view, R.id.jo, "field 'mBackView'");
        onlineMusicFragment.mSkipView = Utils.findRequiredView(view, R.id.d7k, "field 'mSkipView'");
        onlineMusicFragment.mSearchBg = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cuy, "field 'mSearchBg'", RelativeLayout.class);
        onlineMusicFragment.mSearchLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.a25, "field 'mSearchLayout'", LinearLayout.class);
        onlineMusicFragment.mMainLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.a26, "field 'mMainLayout'", FrameLayout.class);
        onlineMusicFragment.txtClickRecommend = (TextView) Utils.findRequiredViewAsType(view, R.id.x0, "field 'txtClickRecommend'", TextView.class);
        onlineMusicFragment.llRecommendMusic = Utils.findRequiredView(view, R.id.cp9, "field 'llRecommendMusic'");
        onlineMusicFragment.starTcmItem = (StarTcmItem) Utils.findRequiredViewAsType(view, R.id.b58, "field 'starTcmItem'", StarTcmItem.class);
        onlineMusicFragment.cancelChooseMusicContainer = Utils.findRequiredView(view, R.id.su, "field 'cancelChooseMusicContainer'");
        onlineMusicFragment.currentChooseMusicNameTv = (TextView) Utils.findRequiredViewAsType(view, R.id.a5g, "field 'currentChooseMusicNameTv'", TextView.class);
        onlineMusicFragment.cancelCurrentChooseMusicTv = Utils.findRequiredView(view, R.id.sv, "field 'cancelCurrentChooseMusicTv'");
    }
}
