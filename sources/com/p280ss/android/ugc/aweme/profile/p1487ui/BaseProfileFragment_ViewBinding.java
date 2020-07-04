package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment_ViewBinding */
public class BaseProfileFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseProfileFragment f94541a;

    public void unbind() {
        BaseProfileFragment baseProfileFragment = this.f94541a;
        if (baseProfileFragment != null) {
            this.f94541a = null;
            baseProfileFragment.mStatusView = null;
            baseProfileFragment.mScrollableLayout = null;
            baseProfileFragment.mTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseProfileFragment_ViewBinding(BaseProfileFragment baseProfileFragment, View view) {
        this.f94541a = baseProfileFragment;
        baseProfileFragment.mStatusView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusView'");
        baseProfileFragment.mScrollableLayout = (DampScrollableLayout) Utils.findRequiredViewAsType(view, R.id.czg, "field 'mScrollableLayout'", DampScrollableLayout.class);
        baseProfileFragment.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
    }
}
