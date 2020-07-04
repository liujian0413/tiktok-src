package com.p280ss.android.ugc.aweme.i18n.settings.blacklist;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.setting.p337ui.BlackListActivity_ViewBinding;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListActivity_ViewBinding */
public class MusBlackListActivity_ViewBinding extends BlackListActivity_ViewBinding {

    /* renamed from: a */
    private MusBlackListActivity f80240a;

    public void unbind() {
        MusBlackListActivity musBlackListActivity = this.f80240a;
        if (musBlackListActivity != null) {
            this.f80240a = null;
            musBlackListActivity.mRecyclerView = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusBlackListActivity_ViewBinding(MusBlackListActivity musBlackListActivity, View view) {
        super(musBlackListActivity, view);
        this.f80240a = musBlackListActivity;
        musBlackListActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.mo, "field 'mRecyclerView'", RecyclerView.class);
    }
}
