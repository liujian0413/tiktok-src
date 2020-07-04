package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.ugc.appcontext.C6399b;

@C6381a(mo15284a = "interction_button_style")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.VideoInteractionExperiment */
public interface VideoInteractionExperiment {
    @C6382b(mo15285a = true)
    public static final int DEFAULT = 0;
    public static final String DEFAULT_COMMENT_TEXT = "评论";
    public static final String DEFAULT_DIGG_TEXT = "赞";
    public static final String DEFAULT_SHARE_TEXT = "分享";
    @C6382b
    public static final int DISPLAY_TEXT = 1;
    public static final boolean NEED_SHOW_TEXT;

    static {
        boolean z = true;
        if (!C6399b.m19945u() || C6384b.m19835a().mo15287a(VideoInteractionExperiment.class, true, "interction_button_style", C6384b.m19835a().mo15295d().interction_button_style, 0) != 1) {
            z = false;
        }
        NEED_SHOW_TEXT = z;
    }
}
