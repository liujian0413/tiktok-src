package com.p280ss.android.ugc.aweme.i18n.musically.cut;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity_ViewBinding */
public class AvatarCutActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AvatarCutActivity f80174a;

    public void unbind() {
        AvatarCutActivity avatarCutActivity = this.f80174a;
        if (avatarCutActivity != null) {
            this.f80174a = null;
            avatarCutActivity.mStatusBarView = null;
            avatarCutActivity.mSurfaceViewWrapper = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AvatarCutActivity_ViewBinding(AvatarCutActivity avatarCutActivity, View view) {
        this.f80174a = avatarCutActivity;
        avatarCutActivity.mStatusBarView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBarView'");
        avatarCutActivity.mSurfaceViewWrapper = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ddt, "field 'mSurfaceViewWrapper'", FrameLayout.class);
    }
}
