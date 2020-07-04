package com.p280ss.android.ugc.aweme.favorites;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.FavoriteListActivity_ViewBinding */
public class FavoriteListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FavoriteListActivity f73001a;

    public void unbind() {
        FavoriteListActivity favoriteListActivity = this.f73001a;
        if (favoriteListActivity != null) {
            this.f73001a = null;
            favoriteListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FavoriteListActivity_ViewBinding(FavoriteListActivity favoriteListActivity, View view) {
        this.f73001a = favoriteListActivity;
        favoriteListActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
    }
}
