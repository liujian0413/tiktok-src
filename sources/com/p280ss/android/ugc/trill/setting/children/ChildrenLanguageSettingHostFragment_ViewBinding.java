package com.p280ss.android.ugc.trill.setting.children;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenLanguageSettingHostFragment_ViewBinding */
public class ChildrenLanguageSettingHostFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChildrenLanguageSettingHostFragment f115824a;

    /* renamed from: b */
    private View f115825b;

    /* renamed from: c */
    private View f115826c;

    public void unbind() {
        ChildrenLanguageSettingHostFragment childrenLanguageSettingHostFragment = this.f115824a;
        if (childrenLanguageSettingHostFragment != null) {
            this.f115824a = null;
            childrenLanguageSettingHostFragment.mTitleLayout = null;
            childrenLanguageSettingHostFragment.mTitle = null;
            childrenLanguageSettingHostFragment.mChangeLanguageItem = null;
            this.f115825b.setOnClickListener(null);
            this.f115825b = null;
            this.f115826c.setOnClickListener(null);
            this.f115826c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChildrenLanguageSettingHostFragment_ViewBinding(final ChildrenLanguageSettingHostFragment childrenLanguageSettingHostFragment, View view) {
        this.f115824a = childrenLanguageSettingHostFragment;
        childrenLanguageSettingHostFragment.mTitleLayout = Utils.findRequiredView(view, R.id.dke, "field 'mTitleLayout'");
        childrenLanguageSettingHostFragment.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.uw, "field 'mChangeLanguageItem' and method 'changeLanguage'");
        childrenLanguageSettingHostFragment.mChangeLanguageItem = (CommonItemView) Utils.castView(findRequiredView, R.id.uw, "field 'mChangeLanguageItem'", CommonItemView.class);
        this.f115825b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                childrenLanguageSettingHostFragment.changeLanguage();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.jo, "method 'exit'");
        this.f115826c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                childrenLanguageSettingHostFragment.exit(view);
            }
        });
    }
}
