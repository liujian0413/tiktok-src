package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.widget.DragView.C25731b;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPlayerProgressbar;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FollowFeedVideoContent */
public class FollowFeedVideoContent extends FrameLayout implements C25731b {

    /* renamed from: a */
    private C44962h f89039a;

    /* renamed from: b */
    private C25731b f89040b;
    public ViewGroup mContainer;
    public RemoteImageView mCover;
    public VideoPlayerProgressbar mProgressbar;

    public C25731b getListener() {
        return this.f89040b;
    }

    public C44962h getVideoSurfaceHolder() {
        return this.f89039a;
    }

    public void setListener(C25731b bVar) {
        this.f89040b = bVar;
    }

    public FollowFeedVideoContent(Context context) {
        super(context);
        m110110a(context);
    }

    /* renamed from: a */
    private void m110110a(Context context) {
        ButterKnife.bind((Object) this, LayoutInflater.from(context).inflate(R.layout.vu, this, true));
        this.f89039a = C44962h.m141886b(this.mContainer);
    }

    /* renamed from: a */
    public final void mo66670a(float f, float f2, float f3, float f4) {
        if (this.f89040b != null) {
            this.f89040b.mo66670a(f, f2, f3, f4);
        }
    }
}
