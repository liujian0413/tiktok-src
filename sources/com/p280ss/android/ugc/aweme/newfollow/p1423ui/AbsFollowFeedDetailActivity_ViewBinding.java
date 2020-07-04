package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p280ss.android.ugc.aweme.common.widget.DragView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity_ViewBinding */
public class AbsFollowFeedDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsFollowFeedDetailActivity f89013a;

    public void unbind() {
        AbsFollowFeedDetailActivity absFollowFeedDetailActivity = this.f89013a;
        if (absFollowFeedDetailActivity != null) {
            this.f89013a = null;
            absFollowFeedDetailActivity.mDragView = null;
            absFollowFeedDetailActivity.mDiggLayout = null;
            absFollowFeedDetailActivity.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsFollowFeedDetailActivity_ViewBinding(AbsFollowFeedDetailActivity absFollowFeedDetailActivity, View view) {
        this.f89013a = absFollowFeedDetailActivity;
        absFollowFeedDetailActivity.mDragView = (DragView) Utils.findRequiredViewAsType(view, R.id.a7y, "field 'mDragView'", DragView.class);
        absFollowFeedDetailActivity.mDiggLayout = (DiggLayout) Utils.findRequiredViewAsType(view, R.id.a8y, "field 'mDiggLayout'", DiggLayout.class);
        absFollowFeedDetailActivity.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cwi, "field 'mRootView'", ViewGroup.class);
    }
}
