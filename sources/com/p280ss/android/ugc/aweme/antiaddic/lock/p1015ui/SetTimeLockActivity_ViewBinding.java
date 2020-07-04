package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity_ViewBinding */
public class SetTimeLockActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SetTimeLockActivity f60187a;

    public void unbind() {
        SetTimeLockActivity setTimeLockActivity = this.f60187a;
        if (setTimeLockActivity != null) {
            this.f60187a = null;
            setTimeLockActivity.rootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SetTimeLockActivity_ViewBinding(SetTimeLockActivity setTimeLockActivity, View view) {
        this.f60187a = setTimeLockActivity;
        setTimeLockActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cwi, "field 'rootView'", ViewGroup.class);
    }
}
