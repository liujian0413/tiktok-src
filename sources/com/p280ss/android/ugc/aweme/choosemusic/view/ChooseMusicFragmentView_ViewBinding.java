package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicFragmentView_ViewBinding */
public class ChooseMusicFragmentView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChooseMusicFragmentView f63282a;

    public void unbind() {
        ChooseMusicFragmentView chooseMusicFragmentView = this.f63282a;
        if (chooseMusicFragmentView != null) {
            this.f63282a = null;
            chooseMusicFragmentView.mRelativeSearch = null;
            chooseMusicFragmentView.mLinearSearch = null;
            chooseMusicFragmentView.mSearchTextView = null;
            chooseMusicFragmentView.mCancelSearch = null;
            chooseMusicFragmentView.mSearchEditTextContainer = null;
            chooseMusicFragmentView.mSearchEditView = null;
            chooseMusicFragmentView.mBackView = null;
            chooseMusicFragmentView.mSkipView = null;
            chooseMusicFragmentView.starTcmItem = null;
            chooseMusicFragmentView.mSearchLayout = null;
            chooseMusicFragmentView.mMainLayout = null;
            chooseMusicFragmentView.txtClickRecommend = null;
            chooseMusicFragmentView.mClearView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChooseMusicFragmentView_ViewBinding(ChooseMusicFragmentView chooseMusicFragmentView, View view) {
        this.f63282a = chooseMusicFragmentView;
        chooseMusicFragmentView.mRelativeSearch = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cux, "field 'mRelativeSearch'", LinearLayout.class);
        chooseMusicFragmentView.mLinearSearch = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bsa, "field 'mLinearSearch'", LinearLayout.class);
        chooseMusicFragmentView.mSearchTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.e1a, "field 'mSearchTextView'", TextView.class);
        chooseMusicFragmentView.mCancelSearch = (TextView) Utils.findRequiredViewAsType(view, R.id.e1c, "field 'mCancelSearch'", TextView.class);
        chooseMusicFragmentView.mSearchEditTextContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cuz, "field 'mSearchEditTextContainer'", LinearLayout.class);
        chooseMusicFragmentView.mSearchEditView = (EditText) Utils.findRequiredViewAsType(view, R.id.e1_, "field 'mSearchEditView'", EditText.class);
        chooseMusicFragmentView.mBackView = Utils.findRequiredView(view, R.id.jo, "field 'mBackView'");
        chooseMusicFragmentView.mSkipView = Utils.findRequiredView(view, R.id.d7k, "field 'mSkipView'");
        chooseMusicFragmentView.starTcmItem = (StarTcmItem) Utils.findRequiredViewAsType(view, R.id.b58, "field 'starTcmItem'", StarTcmItem.class);
        chooseMusicFragmentView.mSearchLayout = (SearchResultView) Utils.findRequiredViewAsType(view, R.id.a25, "field 'mSearchLayout'", SearchResultView.class);
        chooseMusicFragmentView.mMainLayout = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.a26, "field 'mMainLayout'", FrameLayout.class);
        chooseMusicFragmentView.txtClickRecommend = (TextView) Utils.findRequiredViewAsType(view, R.id.x0, "field 'txtClickRecommend'", TextView.class);
        chooseMusicFragmentView.mClearView = (ImageView) Utils.findRequiredViewAsType(view, R.id.b7c, "field 'mClearView'", ImageView.class);
    }
}
