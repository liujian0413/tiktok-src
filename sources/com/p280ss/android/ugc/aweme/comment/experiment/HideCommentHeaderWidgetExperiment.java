package com.p280ss.android.ugc.aweme.comment.experiment;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "hide_comment_header_widget")
/* renamed from: com.ss.android.ugc.aweme.comment.experiment.HideCommentHeaderWidgetExperiment */
public final class HideCommentHeaderWidgetExperiment {
    @C6382b(mo15285a = true)
    public static final int DEFAULT = 0;
    public static final HideCommentHeaderWidgetExperiment INSTANCE = new HideCommentHeaderWidgetExperiment();
    @C6382b
    public static final int STYLE_HIDE_MICRO_APP = 1;
    @C6382b
    public static final int STYLE_HIDE_POI = 2;
    @C6382b
    public static final int STYLE_HIDE_SHOPPING_CART = 3;

    private HideCommentHeaderWidgetExperiment() {
    }
}
