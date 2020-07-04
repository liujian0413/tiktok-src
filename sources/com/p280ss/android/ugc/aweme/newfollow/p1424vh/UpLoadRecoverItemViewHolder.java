package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.graphics.Bitmap;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.draft.model.C27312d;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.model.C34149f;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.C34167a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39327e;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.UpLoadRecoverItemViewHolder */
public class UpLoadRecoverItemViewHolder extends C1293v {

    /* renamed from: a */
    private FragmentActivity f89376a;
    RemoteImageView mCoverImage;
    ImageView mIvClose;
    ImageView mIvRefresh;
    ProgressBar mProgressBar;
    TextView mTextView;

    /* renamed from: a */
    private void m110851a(C34149f fVar) {
        C27312d.m89561a(fVar.f88992a, new OnVideoCoverCallback() {
            public final void onGetVideoCoverFailed(int i) {
            }

            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                if (UpLoadRecoverItemViewHolder.this.mCoverImage != null) {
                    UpLoadRecoverItemViewHolder.this.mCoverImage.setImageDrawable(new C34167a(bitmap));
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo87025a(FollowFeed followFeed) {
        if (followFeed instanceof C34149f) {
            C34149f fVar = (C34149f) followFeed;
            this.mProgressBar.setVisibility(8);
            this.mTextView.setText(this.f89376a.getString(R.string.ou));
            m110851a(fVar);
            this.mIvClose.setVisibility(0);
            this.mIvClose.setOnClickListener(new C34290s(fVar));
            this.mIvRefresh.setVisibility(0);
            this.mIvRefresh.setOnClickListener(new C34291t(this, fVar));
        }
    }

    public UpLoadRecoverItemViewHolder(View view, FragmentActivity fragmentActivity) {
        super(view);
        this.f89376a = fragmentActivity;
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: b */
    static final /* synthetic */ void m110852b(C34149f fVar, View view) {
        C42961az.m136380a(new C39327e(false));
        C6907h.m21524a("publish_retry", (Map) C22984d.m75611a().mo59973a("action_type", "cancel").mo59973a("creation_id", fVar.f88992a.mo70303y()).f60753a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87026a(C34149f fVar, View view) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().publishFromDraft(this.f89376a, fVar.f88992a);
        C42961az.m136380a(new C39327e(false));
        C6907h.m21524a("publish_retry", (Map) C22984d.m75611a().mo59973a("action_type", "publish").mo59973a("creation_id", fVar.f88992a.mo70303y()).f60753a);
    }
}
