package com.p280ss.android.ugc.aweme.following.p1265ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendUserItemView;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.ConnectedRelationItemView */
public final class ConnectedRelationItemView extends RecommendUserItemView {
    public final int getLayoutResId() {
        return R.layout.a1k;
    }

    /* renamed from: a */
    public final void mo75741a(User user) {
        C7573i.m23587b(user, "user");
        super.mo75741a(user);
    }

    /* renamed from: b */
    public final void mo75743b(User user) {
        C7573i.m23587b(user, "user");
        super.mo75743b(user);
        getMBlockUserIv().setVisibility(8);
    }

    /* renamed from: a */
    public final void mo75740a(TextView textView, User user) {
        C7573i.m23587b(textView, "textView");
        C7573i.m23587b(user, "user");
        super.mo75740a(textView, user);
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo75742a(User user, int i) {
        C7573i.m23587b(user, "user");
        super.mo75742a(user, i);
        getMRemarkEdit().setVisibility(8);
    }

    public ConnectedRelationItemView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ ConnectedRelationItemView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
