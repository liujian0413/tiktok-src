package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27747d;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a.C27753a;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MusicCollectViewHolder */
public class MusicCollectViewHolder extends C1293v implements OnClickListener, C27753a {

    /* renamed from: a */
    private C27747d f73355a;

    /* renamed from: b */
    private Context f73356b;

    /* renamed from: c */
    private Music f73357c;
    RemoteImageView mCoverView;
    TextView mMusicDuration;
    TextView mNameView;
    RelativeLayout mOkView;
    ImageView mOriginalTag;
    ImageView mPlayView;
    ProgressBar mProgressBarView;
    RelativeLayout mRightView;
    TextView mSingerView;
    LinearLayout mTopView;
    LinearLayout musicItemll;

    /* renamed from: a */
    public final void mo71237a() {
        if (this.f73357c != null) {
            C27752a.m90983c(1, this.f73357c.getMid());
        }
    }

    /* renamed from: a */
    public final void mo71307a(boolean z) {
        m91228b(z);
    }

    /* renamed from: b */
    private void m91228b(boolean z) {
        if (z) {
            this.mOkView.setVisibility(0);
            this.mPlayView.setImageResource(R.drawable.ady);
            this.mProgressBarView.setVisibility(8);
            return;
        }
        this.mOkView.setVisibility(8);
        this.mProgressBarView.setVisibility(8);
        this.mPlayView.setVisibility(0);
        this.mPlayView.setImageResource(R.drawable.ael);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.c1c) {
            C27754b.m90994a(view.getContext(), this.f73357c, "collection_music", "");
        }
        if (!(this.f73355a == null || this.f73357c == null)) {
            this.f73355a.mo71177a(this, view, this.f73357c.convertToMusicModel());
        }
        if (this.f73357c != null) {
            C27752a.m90986d(this.f73357c.getMid(), "collection_music", "");
        }
    }

    public MusicCollectViewHolder(View view, C27747d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f73356b = view.getContext();
        this.f73355a = dVar;
    }

    /* renamed from: a */
    public final void mo71306a(Music music, boolean z) {
        String str;
        if (music != null) {
            this.f73357c = music;
            if (music.getCoverMedium() != null && music.getCoverMedium().getUrlList() != null && music.getCoverMedium().getUrlList().size() > 0) {
                C23323e.m76514a(this.mCoverView, (String) this.f73357c.getCoverMedium().getUrlList().get(0));
            } else if (music.getCoverThumb() != null && music.getCoverThumb().getUrlList() != null && music.getCoverThumb().getUrlList().size() > 0) {
                C23323e.m76514a(this.mCoverView, (String) this.f73357c.getCoverThumb().getUrlList().get(0));
            } else if (music.getCoverLarge() == null || music.getCoverLarge().getUrlList() == null || music.getCoverLarge().getUrlList().size() <= 0) {
                C23323e.m76503a(this.mCoverView, (int) R.drawable.b73);
            } else {
                C23323e.m76514a(this.mCoverView, (String) this.f73357c.getCoverLarge().getUrlList().get(0));
            }
            TextView textView = this.mSingerView;
            if (TextUtils.isEmpty(this.f73357c.getAuthorName())) {
                str = this.itemView.getResources().getString(R.string.fjo);
            } else {
                str = this.f73357c.getAuthorName();
            }
            textView.setText(str);
            this.mNameView.setText(this.f73357c.getMusicName());
            if (TextUtils.isEmpty(this.f73357c.getMusicName()) || !music.isOriginMusic()) {
                this.mOriginalTag.setVisibility(8);
            } else {
                this.mOriginalTag.setVisibility(0);
            }
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).attachPartnerTag(this.mNameView, music, C6399b.m19946v());
            if (C6384b.m19835a().mo15292a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", C6384b.m19835a().mo15295d().remove_15s_cap_music, true)) {
                this.mMusicDuration.setText(C33784d.m108921a(this.f73357c.getPresenterDuration() * 1000));
            } else {
                this.mMusicDuration.setText(C33784d.m108921a(this.f73357c.getDuration() * 1000));
            }
            this.mProgressBarView.setVisibility(8);
            m91228b(z);
            mo71237a();
        }
    }
}
