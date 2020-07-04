package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity_ViewBinding */
public class MusicRecommendActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicRecommendActivity f88408a;

    public void unbind() {
        MusicRecommendActivity musicRecommendActivity = this.f88408a;
        if (musicRecommendActivity != null) {
            this.f88408a = null;
            musicRecommendActivity.txtClickUploadTv = null;
            musicRecommendActivity.llClickForUpload = null;
            musicRecommendActivity.tvContentAgreement = null;
            musicRecommendActivity.editSongLink = null;
            musicRecommendActivity.editSongName = null;
            musicRecommendActivity.ivClickUpload = null;
            musicRecommendActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicRecommendActivity_ViewBinding(MusicRecommendActivity musicRecommendActivity, View view) {
        this.f88408a = musicRecommendActivity;
        musicRecommendActivity.txtClickUploadTv = (TextView) Utils.findRequiredViewAsType(view, R.id.x3, "field 'txtClickUploadTv'", TextView.class);
        musicRecommendActivity.llClickForUpload = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.x2, "field 'llClickForUpload'", LinearLayout.class);
        musicRecommendActivity.tvContentAgreement = (TextView) Utils.findRequiredViewAsType(view, R.id.a27, "field 'tvContentAgreement'", TextView.class);
        musicRecommendActivity.editSongLink = (EditText) Utils.findRequiredViewAsType(view, R.id.d8r, "field 'editSongLink'", EditText.class);
        musicRecommendActivity.editSongName = (EditText) Utils.findRequiredViewAsType(view, R.id.d8s, "field 'editSongName'", EditText.class);
        musicRecommendActivity.ivClickUpload = (ImageView) Utils.findRequiredViewAsType(view, R.id.x1, "field 'ivClickUpload'", ImageView.class);
        musicRecommendActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
    }
}
