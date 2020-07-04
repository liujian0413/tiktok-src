package com.p280ss.android.ugc.trill.setting;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.LanguageSettingHostFragment_ViewBinding */
public class LanguageSettingHostFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LanguageSettingHostFragment f115799a;

    /* renamed from: b */
    private View f115800b;

    public void unbind() {
        LanguageSettingHostFragment languageSettingHostFragment = this.f115799a;
        if (languageSettingHostFragment != null) {
            this.f115799a = null;
            languageSettingHostFragment.mTitleLayout = null;
            languageSettingHostFragment.mTitle = null;
            languageSettingHostFragment.mChangeLanguageItem = null;
            this.f115800b.setOnClickListener(null);
            this.f115800b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LanguageSettingHostFragment_ViewBinding(final LanguageSettingHostFragment languageSettingHostFragment, View view) {
        this.f115799a = languageSettingHostFragment;
        languageSettingHostFragment.mTitleLayout = Utils.findRequiredView(view, R.id.dke, "field 'mTitleLayout'");
        languageSettingHostFragment.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        languageSettingHostFragment.mChangeLanguageItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.uw, "field 'mChangeLanguageItem'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "method 'exit'");
        this.f115800b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                languageSettingHostFragment.exit(view);
            }
        });
    }
}
