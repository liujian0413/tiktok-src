package com.p280ss.android.ugc.aweme.i18n.musically.cut;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity_ViewBinding */
public class AvatarChooseActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AvatarChooseActivity f80112a;

    public void unbind() {
        AvatarChooseActivity avatarChooseActivity = this.f80112a;
        if (avatarChooseActivity != null) {
            this.f80112a = null;
            avatarChooseActivity.mStatusBarView = null;
            avatarChooseActivity.mTitleView = null;
            avatarChooseActivity.mBackBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AvatarChooseActivity_ViewBinding(AvatarChooseActivity avatarChooseActivity, View view) {
        this.f80112a = avatarChooseActivity;
        avatarChooseActivity.mStatusBarView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBarView'");
        avatarChooseActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitleView'", TextView.class);
        avatarChooseActivity.mBackBtn = Utils.findRequiredView(view, R.id.jo, "field 'mBackBtn'");
    }
}
