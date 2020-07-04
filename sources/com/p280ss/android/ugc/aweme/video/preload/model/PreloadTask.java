package com.p280ss.android.ugc.aweme.video.preload.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadTask */
public class PreloadTask {
    public static final int BYTE_UNIT_NUMBER = 1024;
    public boolean alreadyPreload;
    @C6593c(mo15949a = "count")
    public int count = 1;
    @C6593c(mo15949a = "offset")
    public int offset;
    @C6593c(mo15949a = "download_progress")
    public int progress = 100;
    @C6593c(mo15949a = "size")
    private int size;

    public PreloadTask() {
    }

    public int getVideoPreloadSize() {
        if (this.size <= 0) {
            return 10485759;
        }
        return this.size * BYTE_UNIT_NUMBER;
    }

    public PreloadTask(int i, int i2) {
        this.count = i;
        this.size = i2;
    }
}
