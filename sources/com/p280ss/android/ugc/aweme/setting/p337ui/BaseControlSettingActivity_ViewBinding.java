package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BaseControlSettingActivity_ViewBinding */
public class BaseControlSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseControlSettingActivity f98364a;

    /* renamed from: b */
    private View f98365b;

    public void unbind() {
        BaseControlSettingActivity baseControlSettingActivity = this.f98364a;
        if (baseControlSettingActivity != null) {
            this.f98364a = null;
            baseControlSettingActivity.mTitle = null;
            baseControlSettingActivity.mEveryoneItem = null;
            baseControlSettingActivity.mFriendsItem = null;
            baseControlSettingActivity.mOffItem = null;
            baseControlSettingActivity.mTipsView = null;
            this.f98365b.setOnClickListener(null);
            this.f98365b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseControlSettingActivity_ViewBinding(final BaseControlSettingActivity baseControlSettingActivity, View view) {
        this.f98364a = baseControlSettingActivity;
        baseControlSettingActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        baseControlSettingActivity.mEveryoneItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.agw, "field 'mEveryoneItem'", CommonItemView.class);
        baseControlSettingActivity.mFriendsItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.api, "field 'mFriendsItem'", CommonItemView.class);
        baseControlSettingActivity.mOffItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c7y, "field 'mOffItem'", CommonItemView.class);
        baseControlSettingActivity.mTipsView = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.djp, "field 'mTipsView'", DmtTextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "method 'back'");
        this.f98365b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseControlSettingActivity.back();
            }
        });
    }
}
