package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.support.p029v7.widget.AppCompatCheckBox;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p280ss.android.ugc.aweme.detail.p1167ui.FadeImageView;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment_ViewBinding */
public class KeyboardDialogFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private KeyboardDialogFragment f64191a;

    public void unbind() {
        KeyboardDialogFragment keyboardDialogFragment = this.f64191a;
        if (keyboardDialogFragment != null) {
            this.f64191a = null;
            keyboardDialogFragment.mContentLayout = null;
            keyboardDialogFragment.mInputLayout = null;
            keyboardDialogFragment.mSearchGifLayout = null;
            keyboardDialogFragment.mEditText = null;
            keyboardDialogFragment.mPublishView = null;
            keyboardDialogFragment.mCommentAtSearchLayout = null;
            keyboardDialogFragment.mAtView = null;
            keyboardDialogFragment.mEmojiView = null;
            keyboardDialogFragment.mGifEmojiLayout = null;
            keyboardDialogFragment.mGifEmoji = null;
            keyboardDialogFragment.mGifEmojiClear = null;
            keyboardDialogFragment.mCbForward = null;
            keyboardDialogFragment.mPanelContainer = null;
            keyboardDialogFragment.mMiniPanelContainer = null;
            keyboardDialogFragment.mOutWrapper = null;
            keyboardDialogFragment.mGifEmojiDrawingCache = null;
            keyboardDialogFragment.mGuideLayout = null;
            keyboardDialogFragment.mGuideText = null;
            keyboardDialogFragment.mRvSearch = null;
            keyboardDialogFragment.mCommentAtSearchLoadingView = null;
            keyboardDialogFragment.mErrorText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public KeyboardDialogFragment_ViewBinding(KeyboardDialogFragment keyboardDialogFragment, View view) {
        this.f64191a = keyboardDialogFragment;
        keyboardDialogFragment.mContentLayout = Utils.findRequiredView(view, R.id.bh2, "field 'mContentLayout'");
        keyboardDialogFragment.mInputLayout = Utils.findRequiredView(view, R.id.bhw, "field 'mInputLayout'");
        keyboardDialogFragment.mSearchGifLayout = Utils.findRequiredView(view, R.id.bjm, "field 'mSearchGifLayout'");
        keyboardDialogFragment.mEditText = (MentionEditText) Utils.findRequiredViewAsType(view, R.id.z8, "field 'mEditText'", MentionEditText.class);
        keyboardDialogFragment.mPublishView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.zo, "field 'mPublishView'", FadeImageView.class);
        keyboardDialogFragment.mCommentAtSearchLayout = (CommentAtSearchLayout) Utils.findRequiredViewAsType(view, R.id.sl, "field 'mCommentAtSearchLayout'", CommentAtSearchLayout.class);
        keyboardDialogFragment.mAtView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.ha, "field 'mAtView'", FadeImageView.class);
        keyboardDialogFragment.mEmojiView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.b8w, "field 'mEmojiView'", FadeImageView.class);
        keyboardDialogFragment.mGifEmojiLayout = Utils.findRequiredView(view, R.id.bhq, "field 'mGifEmojiLayout'");
        keyboardDialogFragment.mGifEmoji = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.aqf, "field 'mGifEmoji'", RemoteImageView.class);
        keyboardDialogFragment.mGifEmojiClear = Utils.findRequiredView(view, R.id.aqg, "field 'mGifEmojiClear'");
        keyboardDialogFragment.mCbForward = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.tm, "field 'mCbForward'", AppCompatCheckBox.class);
        keyboardDialogFragment.mPanelContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.c_6, "field 'mPanelContainer'", LinearLayout.class);
        keyboardDialogFragment.mMiniPanelContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.c_7, "field 'mMiniPanelContainer'", LinearLayout.class);
        keyboardDialogFragment.mOutWrapper = (MeasureLinearLayout) Utils.findRequiredViewAsType(view, R.id.c9o, "field 'mOutWrapper'", MeasureLinearLayout.class);
        keyboardDialogFragment.mGifEmojiDrawingCache = (ImageView) Utils.findRequiredViewAsType(view, R.id.aqh, "field 'mGifEmojiDrawingCache'", ImageView.class);
        keyboardDialogFragment.mGuideLayout = Utils.findRequiredView(view, R.id.bhr, "field 'mGuideLayout'");
        keyboardDialogFragment.mGuideText = (TextView) Utils.findRequiredViewAsType(view, R.id.dhq, "field 'mGuideText'", TextView.class);
        keyboardDialogFragment.mRvSearch = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cxo, "field 'mRvSearch'", RecyclerView.class);
        keyboardDialogFragment.mCommentAtSearchLoadingView = (CommentAtSearchLoadingView) Utils.findRequiredViewAsType(view, R.id.bu9, "field 'mCommentAtSearchLoadingView'", CommentAtSearchLoadingView.class);
        keyboardDialogFragment.mErrorText = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.du7, "field 'mErrorText'", DmtTextView.class);
    }
}
