package com.p280ss.android.ugc.aweme.storage.constants;

/* renamed from: com.ss.android.ugc.aweme.storage.constants.ShortVideoStage */
public enum ShortVideoStage {
    SHOOT(0),
    VIDEOEDIT(1),
    VIDEOCUT(2),
    PUBLISH(3);
    
    private final int stage;

    public final int getStage() {
        return this.stage;
    }

    private ShortVideoStage(int i) {
        this.stage = i;
    }
}
