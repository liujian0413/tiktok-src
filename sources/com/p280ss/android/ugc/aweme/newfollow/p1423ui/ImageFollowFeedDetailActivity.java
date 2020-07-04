package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity */
public class ImageFollowFeedDetailActivity extends AbsFollowFeedDetailActivity<RemoteImageView> implements OnClickListener {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo86844f() {
        return R.layout.bo;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.ImageFollowFeedDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo86849k() {
        this.mDragView.mo66639a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public RemoteImageView mo86848j() {
        this.f88994a = new RemoteImageView(this);
        ((RemoteImageView) this.f88994a).setOnClickListener(this);
        m110122b();
        return (RemoteImageView) this.f88994a;
    }

    /* renamed from: b */
    private void m110122b() {
        Aweme n = mo86852n();
        if (n != null) {
            List imageInfos = n.getImageInfos();
            if (imageInfos != null && !imageInfos.isEmpty()) {
                ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                if (imageInfo != null) {
                    C23323e.m76524b((RemoteImageView) this.f88994a, imageInfo.getLabelLarge());
                }
            }
        }
    }
}
