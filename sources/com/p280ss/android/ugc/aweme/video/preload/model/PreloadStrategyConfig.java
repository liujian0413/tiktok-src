package com.p280ss.android.ugc.aweme.video.preload.model;

import com.google.gson.p276a.C6593c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig */
public class PreloadStrategyConfig {
    @C6593c(mo15949a = "network_lower")
    private long networkLower;
    @C6593c(mo15949a = "network_upper")
    private long networkUpper;
    @C6593c(mo15949a = "tasks")
    public List<PreloadTask> tasks;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig$a */
    static class C7279a {

        /* renamed from: a */
        public static final PreloadStrategyConfig f20356a;

        static {
            PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
            f20356a = preloadStrategyConfig;
            preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask());
        }
    }

    public static PreloadStrategyConfig getDefault() {
        return C7279a.f20356a;
    }

    public long getNetworkLower() {
        return this.networkLower;
    }

    public long getNetworkUpper() {
        return this.networkUpper;
    }

    public List<PreloadTask> getTasks() {
        if (this.tasks == null) {
            this.tasks = Collections.emptyList();
        }
        return this.tasks;
    }

    public void clearFlag() {
        if (this.tasks != null) {
            for (PreloadTask preloadTask : this.tasks) {
                preloadTask.alreadyPreload = false;
            }
        }
    }

    public static PreloadStrategyConfig convertOldConfig(int i, int i2) {
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask(i, i2));
        return preloadStrategyConfig;
    }
}
