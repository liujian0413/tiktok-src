package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AboutActivity_ViewBinding */
public class AboutActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AboutActivity f98336a;

    /* renamed from: b */
    private View f98337b;

    public void unbind() {
        AboutActivity aboutActivity = this.f98336a;
        if (aboutActivity != null) {
            this.f98336a = null;
            aboutActivity.mVersionView = null;
            aboutActivity.mVisitWebsite = null;
            aboutActivity.mCopyEmail = null;
            this.f98337b.setOnClickListener(null);
            this.f98337b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AboutActivity_ViewBinding(final AboutActivity aboutActivity, View view) {
        this.f98336a = aboutActivity;
        aboutActivity.mVersionView = (TextView) Utils.findRequiredViewAsType(view, R.id.e_s, "field 'mVersionView'", TextView.class);
        aboutActivity.mVisitWebsite = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.edx, "field 'mVisitWebsite'", CommonItemView.class);
        aboutActivity.mCopyEmail = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a2z, "field 'mCopyEmail'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "method 'exit'");
        this.f98337b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                aboutActivity.exit(view);
            }
        });
    }
}
