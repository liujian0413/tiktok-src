package com.p280ss.android.ugc.aweme.mobile;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.mobile.EditProfileActivityV2_ViewBinding */
public class EditProfileActivityV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EditProfileActivityV2 f87706a;

    /* renamed from: b */
    private View f87707b;

    public void unbind() {
        EditProfileActivityV2 editProfileActivityV2 = this.f87706a;
        if (editProfileActivityV2 != null) {
            this.f87706a = null;
            editProfileActivityV2.mAvatar = null;
            editProfileActivityV2.mUsernameEdit = null;
            editProfileActivityV2.mBtnEnterAweme = null;
            editProfileActivityV2.txtExtra = null;
            this.f87707b.setOnClickListener(null);
            this.f87707b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EditProfileActivityV2_ViewBinding(final EditProfileActivityV2 editProfileActivityV2, View view) {
        this.f87706a = editProfileActivityV2;
        editProfileActivityV2.mAvatar = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.ic, "field 'mAvatar'", SmartImageView.class);
        editProfileActivityV2.mUsernameEdit = (EditText) Utils.findRequiredViewAsType(view, R.id.e_a, "field 'mUsernameEdit'", EditText.class);
        editProfileActivityV2.mBtnEnterAweme = (Button) Utils.findRequiredViewAsType(view, R.id.al5, "field 'mBtnEnterAweme'", Button.class);
        editProfileActivityV2.txtExtra = (TextView) Utils.findRequiredViewAsType(view, R.id.dhp, "field 'txtExtra'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.e6g, "method 'editBirthday'");
        this.f87707b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                editProfileActivityV2.editBirthday(view);
            }
        });
    }
}
