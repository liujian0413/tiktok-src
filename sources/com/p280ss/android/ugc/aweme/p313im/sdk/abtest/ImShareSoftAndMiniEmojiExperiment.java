package com.p280ss.android.ugc.aweme.p313im.sdk.abtest;

import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "im_share_auto_display_keyboard_and_emoji")
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperiment */
public final class ImShareSoftAndMiniEmojiExperiment {
    @C6382b
    private static final int EXPERIMENT_1 = 1;
    @C6382b
    private static final int EXPERIMENT_2 = 2;
    @C6382b
    private static final int EXPERIMENT_3 = 3;
    public static final ImShareSoftAndMiniEmojiExperiment INSTANCE = new ImShareSoftAndMiniEmojiExperiment();
    @C6382b(mo15285a = true)
    private static final int ONLINE = 0;

    private ImShareSoftAndMiniEmojiExperiment() {
    }

    public final int getEXPERIMENT_1() {
        return EXPERIMENT_1;
    }

    public final int getEXPERIMENT_2() {
        return EXPERIMENT_2;
    }

    public final int getEXPERIMENT_3() {
        return EXPERIMENT_3;
    }

    public final int getONLINE() {
        return ONLINE;
    }

    public final boolean showMiniEmojiPanel() {
        int e = C6937c.f19628b.mo17970e();
        if (e == EXPERIMENT_2 || e == EXPERIMENT_3) {
            return true;
        }
        return false;
    }

    public final boolean showSoftInputWhenClickAvatar() {
        int e = C6937c.f19628b.mo17970e();
        if (e == EXPERIMENT_1 || e == EXPERIMENT_3) {
            return true;
        }
        return false;
    }
}
