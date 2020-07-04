package com.p280ss.android.ugc.aweme.music;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.helper.C26656d;
import com.p280ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27747d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.hotsearch.p1296d.C30361a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.OriginMusicViewHolder */
public class OriginMusicViewHolder extends C1293v {

    /* renamed from: a */
    public MusicModel f87884a;

    /* renamed from: b */
    public boolean f87885b;

    /* renamed from: c */
    private C27747d f87886c;

    /* renamed from: d */
    private Context f87887d;

    /* renamed from: e */
    private String f87888e;
    ImageView ivDetail;
    RemoteImageView mCoverView;
    TextView mDurationView;
    CheckableImageView mIvMusicCollect;
    TextView mNameView;
    RelativeLayout mOkView;
    ImageView mPlayView;
    ProgressBar mProgressBarView;
    ConstraintLayout mRightView;
    TextView mTagView;
    LinearLayout mTopView;
    TextView mTvConfirm;
    LinearLayout musicItemll;
    TextView txtUserCount;

    /* renamed from: g */
    private void m108663g() {
        boolean z = this.f87885b;
        C42961az.m136380a(new C33769d(z ? 1 : 0, this.f87884a));
    }

    /* renamed from: c */
    private void m108659c() {
        if (this.f87884a.getCollectionType() != null) {
            this.f87885b = CollectionType.COLLECTED.equals(this.f87884a.getCollectionType());
        }
        mo86069a();
    }

    /* renamed from: a */
    public final void mo86069a() {
        int i;
        CheckableImageView checkableImageView = this.mIvMusicCollect;
        if (this.f87885b) {
            i = R.drawable.a3w;
        } else {
            i = R.drawable.ann;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: b */
    private void m108656b() {
        if (C6399b.m19946v()) {
            this.musicItemll.setBackground(C0683b.m2903a(this.musicItemll.getContext(), (int) R.drawable.jj));
        } else {
            this.musicItemll.setBackground(C0683b.m2903a(this.musicItemll.getContext(), (int) R.drawable.jk));
        }
    }

    /* renamed from: e */
    private void m108661e() {
        if (this.f87884a != null && ((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(this.f87884a, this.itemView.getContext(), true)) {
            m108662f();
            m108663g();
            this.mIvMusicCollect.mo86446b();
        }
    }

    /* renamed from: f */
    private void m108662f() {
        this.f87885b = !this.f87885b;
        if (this.f87885b) {
            C6907h.m21524a("favourite_song", (Map) new C22984d().mo59973a("enter_from", "personal_homepage_list").mo59973a("previous_page", this.f87888e).mo59973a("music_id", this.f87884a.getMusicId()).mo59973a("enter_method", "personal_list").f60753a);
        } else {
            C6907h.m21524a("cancel_favourite_song", (Map) new C22984d().mo59973a("enter_from", "personal_homepage_list").mo59973a("previous_page", this.f87888e).mo59973a("music_id", this.f87884a.getMusicId()).mo59973a("enter_method", "personal_list").f60753a);
        }
    }

    /* renamed from: d */
    private void m108660d() {
        String str;
        String str2;
        if (!TextUtils.isEmpty(this.f87884a.getName())) {
            str = this.f87884a.getName();
        } else {
            str = "";
        }
        int i = 4;
        if (C6399b.m19944t() || this.f87884a.getMusic() == null || this.f87884a.getMusic().getBillboardRank() <= 0 || this.f87884a.getMusic().getBillboardRank() > 30) {
            this.mTagView.setVisibility(8);
            this.mNameView.setText(str);
        } else if (C26656d.m87588b() || this.f87884a.getMusic().getBillboardType() <= 0) {
            this.mTagView.setVisibility(0);
            String str3 = "T";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
            if (this.f87884a.getMusic().getBillboardType() <= 0 || this.f87884a.getMusic().getWeeklyBillInfo() == null) {
                str2 = this.mNameView.getResources().getString(R.string.chj);
            } else {
                str2 = C1642a.m8034a(this.mNameView.getResources().getString(R.string.chk), new Object[]{Integer.valueOf(this.f87884a.getMusic().getWeeklyBillInfo().getEditionNo())});
            }
            spannableStringBuilder.setSpan(new C30361a(this.f87884a.getMusic().getBillboardRank(), str2, 4), 0, str3.length(), 33);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                public final void onClick(View view) {
                    C6907h.m21524a("enter_music_leaderboard", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59970a("scene_id", 1001).f60753a);
                    String str = "aweme://search/trending?type=2";
                    if (OriginMusicViewHolder.this.f87884a.getMusic().getBillboardType() != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("&edition_uid=");
                        sb.append(OriginMusicViewHolder.this.f87884a.getMusic().getWeeklyBillInfo().getUid());
                        str = sb.toString();
                    }
                    C7195s.m22438a().mo18682a(str);
                }
            }, 0, str3.length(), 33);
            this.mTagView.setMovementMethod(LinkMovementMethod.getInstance());
            this.mTagView.setText(spannableStringBuilder);
            this.mNameView.setText(str);
        } else {
            return;
        }
        if (this.f87884a.getMusic().isOriginMusic()) {
            Drawable drawable = this.itemView.getContext().getResources().getDrawable(R.drawable.ad9);
            drawable.setBounds(0, 0, (int) C9738o.m28708b(this.itemView.getContext(), 16.0f), (int) C9738o.m28708b(this.itemView.getContext(), 16.0f));
            this.mNameView.setCompoundDrawables(drawable, null, null, null);
            this.mNameView.setCompoundDrawablePadding((int) C9738o.m28708b(this.itemView.getContext(), 2.0f));
        } else {
            this.mNameView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        this.mIvMusicCollect.setOnClickListener(new C33793g(this));
        this.txtUserCount.setText(this.f87887d.getString(R.string.cri, new Object[]{Integer.valueOf(this.f87884a.getUserCount())}));
        if (C6384b.m19835a().mo15292a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", C6384b.m19835a().mo15295d().remove_15s_cap_music, true)) {
            this.mDurationView.setText(((IMusicService) ServiceManager.get().getService(IMusicService.class)).formatVideoDuration(this.f87884a.getPresenterDuration()));
            TextView textView = this.mDurationView;
            if (this.f87884a.getPresenterDuration() > 0) {
                i = 0;
            }
            textView.setVisibility(i);
        } else {
            this.mDurationView.setText(((IMusicService) ServiceManager.get().getService(IMusicService.class)).formatVideoDuration(this.f87884a.getDuration()));
            TextView textView2 = this.mDurationView;
            if (this.f87884a.getDuration() > 0) {
                i = 0;
            }
            textView2.setVisibility(i);
        }
        if (!TextUtils.isEmpty(this.f87884a.getPicPremium())) {
            C23323e.m76514a(this.mCoverView, this.f87884a.getPicPremium());
        } else if (!TextUtils.isEmpty(this.f87884a.getPicBig())) {
            C23323e.m76514a(this.mCoverView, this.f87884a.getPicBig());
        } else {
            C23323e.m76503a(this.mCoverView, (int) R.drawable.a61);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86070a(View view) {
        m108661e();
    }

    /* renamed from: a */
    public final void mo86072a(boolean z) {
        m108658b(z);
    }

    /* renamed from: b */
    private void m108658b(boolean z) {
        if (z) {
            this.mOkView.setVisibility(0);
            this.mPlayView.setVisibility(0);
            this.mPlayView.setImageResource(R.drawable.afn);
            this.mProgressBarView.setVisibility(8);
            C6907h.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(this.f87884a.getMusicId()));
            return;
        }
        this.mOkView.setVisibility(8);
        this.mProgressBarView.setVisibility(8);
        this.mPlayView.setVisibility(0);
        this.mPlayView.setImageResource(R.drawable.afo);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.c1c) {
            if (this.f87884a != null && this.f87884a.getMusicStatus() == 0 && this.f87884a.getMusic() != null) {
                String offlineDesc = this.f87884a.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.f87887d.getString(R.string.chd);
                }
                C10761a.m31410e(view.getContext(), offlineDesc).mo25750a();
                return;
            } else if (this.f87884a != null) {
                C6907h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("personal_homepage_list").setValue(this.f87884a.getMusicId()));
                C6907h.m21524a("enter_music_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage_list").mo59973a("group_id", "").mo59973a("music_id", this.f87884a.getMusicId()).mo59973a("previous_page", this.f87888e).mo59973a("enter_method", "personal_list").f60753a);
                if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(this.f87884a, this.itemView.getContext(), true)) {
                    C6907h.m21524a("enter_music_detail_failed", (Map) new C22984d().mo59973a("group_id", "").mo59973a("author_id", "").mo59973a("music_id", this.f87884a.getMusicId()).mo59973a("enter_from", "personal_homepage_list").f60753a);
                    return;
                }
                C7195s a = C7195s.m22438a();
                StringBuilder sb = new StringBuilder("aweme://music/detail/");
                sb.append(this.f87884a.getMusicId());
                a.mo18682a(sb.toString());
            }
        } else if (id == R.id.cuo) {
            this.mPlayView.setImageResource(R.drawable.afo);
        }
        if (this.f87886c != null) {
            this.f87886c.mo71177a(this, view, this.f87884a);
        }
    }

    /* renamed from: a */
    public final void mo86071a(MusicModel musicModel, boolean z) {
        if (musicModel != null) {
            m108657b(musicModel, z);
        }
    }

    /* renamed from: b */
    private void m108657b(MusicModel musicModel, boolean z) {
        this.f87884a = musicModel;
        m108656b();
        m108660d();
        m108658b(z);
        m108659c();
    }

    public OriginMusicViewHolder(View view, C27747d dVar, String str) {
        super(view);
        this.f87886c = dVar;
        this.f87888e = str;
        ButterKnife.bind((Object) this, view);
        this.f87887d = view.getContext();
        this.mIvMusicCollect.setOnStateChangeListener(new C33833a() {
            /* renamed from: a */
            public final void mo61810a() {
            }

            /* renamed from: a */
            public final void mo61811a(int i) {
                if (i == 1) {
                    OriginMusicViewHolder.this.mo86069a();
                }
            }
        });
        this.mIvMusicCollect.setVisibility(0);
    }
}
