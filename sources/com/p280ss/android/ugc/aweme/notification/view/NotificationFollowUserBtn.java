package com.p280ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;

/* renamed from: com.ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn */
public class NotificationFollowUserBtn extends FollowUserBtn {
    public NotificationFollowUserBtn(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final int mo25768a(TextView textView) {
        if (C6399b.m19946v()) {
            return C34615d.m111860a(textView.getContext());
        }
        return super.mo25768a(textView);
    }

    public NotificationFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NotificationFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
