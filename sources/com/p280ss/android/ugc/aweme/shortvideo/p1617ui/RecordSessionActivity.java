package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.AmeActivity;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.RecordSessionActivity */
public abstract class RecordSessionActivity extends AmeActivity implements C41387m {

    /* renamed from: a */
    private boolean f107120a;

    /* renamed from: b */
    public final boolean mo88338b() {
        return this.f107120a;
    }

    public void finish() {
        mo101829a(false);
        super.finish();
    }

    public void onDestroy() {
        mo101829a(false);
        super.onDestroy();
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("video_shoot_page");
    }

    /* renamed from: a */
    private void mo101829a(boolean z) {
        this.f107120a = z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo101829a(true);
    }
}
