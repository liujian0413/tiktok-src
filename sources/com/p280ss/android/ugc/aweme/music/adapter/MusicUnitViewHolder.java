package com.p280ss.android.ugc.aweme.music.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1408b.C33770e;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33933ai;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder */
public class MusicUnitViewHolder extends C1293v {

    /* renamed from: b */
    private static int f88027b;

    /* renamed from: a */
    public MusicModel f88028a;

    /* renamed from: c */
    private Context f88029c;

    /* renamed from: d */
    private C33744d f88030d;
    View divider;

    /* renamed from: e */
    private boolean f88031e;

    /* renamed from: f */
    private Context f88032f;

    /* renamed from: g */
    private int f88033g;

    /* renamed from: h */
    private String f88034h;

    /* renamed from: i */
    private C33746f<C33770e> f88035i;
    LinearLayout ivCollectFrame;
    ImageView ivDetail;
    CheckableImageView ivMusicCollect;
    ImageView ivOriginMusicMark;

    /* renamed from: j */
    private int f88036j;
    RemoteImageView mCoverView;
    TextView mDurationView;
    TextView mNameView;
    LinearLayout mOkView;
    ImageView mPlayView;
    ProgressBar mProgressBarView;
    RelativeLayout mRightView;
    TextView mSingerView;
    LinearLayout mTopView;
    LinearLayout musicDetailContainer;
    LinearLayout musicItemll;

    /* renamed from: a */
    private static String m108761a(int i) {
        return i == 0 ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    /* renamed from: b */
    private static String m108764b(int i) {
        if (i == 0) {
            return "music_library_hot";
        }
        if (i == 1) {
            return "music_library_mine";
        }
        if (i == 2) {
            return "music_library_search";
        }
        if (i == 3) {
            return "music_library_list";
        }
        return null;
    }

    /* renamed from: e */
    private void m108772e() {
        this.f88031e = !this.f88031e;
    }

    /* renamed from: b */
    public final void mo86151b() {
        boolean z = this.f88031e;
        C42961az.m136380a(new C33769d(z ? 1 : 0, this.f88028a));
    }

    /* renamed from: d */
    private void m108770d() {
        String str;
        if (this.f88028a != null && C33784d.m108931a(this.f88028a, this.f88032f, true)) {
            if (this.f88035i != null) {
                C33746f<C33770e> fVar = this.f88035i;
                MusicModel musicModel = this.f88028a;
                if (this.f88031e) {
                    str = "unfollow_type";
                } else {
                    str = "follow_type";
                }
                fVar.mo61995a(new C33770e(musicModel, str));
            }
            m108772e();
            m108773f();
            this.ivMusicCollect.mo86446b();
        }
    }

    /* renamed from: a */
    public final void mo86147a() {
        int i;
        CheckableImageView checkableImageView = this.ivMusicCollect;
        if (this.f88031e) {
            i = R.drawable.a3w;
        } else {
            i = R.drawable.a3x;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: f */
    private void m108773f() {
        String str;
        MobClick obtain = MobClick.obtain();
        if (this.f88031e) {
            str = "collection_music";
        } else {
            str = "collection_music_cancel";
        }
        MobClick extValueLong = obtain.setEventName(str).setLabelName(m108764b(this.f88033g)).setValue(String.valueOf(this.f88028a.getMusicId())).setExtValueLong(0);
        if (!TextUtils.isEmpty(this.f88034h)) {
            extValueLong.setJsonObject(C6869c.m21381a().mo16887a("search_keyword", this.f88034h).mo16888b());
        }
        C6907h.onEvent(extValueLong);
    }

    /* renamed from: c */
    private void m108768c() {
        MobClick value = MobClick.obtain().setEventName("music_detail").setLabelName(m108764b(this.f88033g)).setValue(this.f88028a.getMusicId());
        if (!TextUtils.isEmpty(this.f88034h)) {
            value.setJsonObject(C6869c.m21381a().mo16887a("search_keyword", this.f88034h).mo16888b());
        }
        C6907h.onEvent(value);
        if (C6399b.m19946v()) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append(m108764b(this.f88033g));
            hashMap.put("enter_from", sb.toString());
            hashMap.put("music_id", this.f88028a.getMusicId());
            hashMap.put("enter_method", "click_cover");
            hashMap.put("play_mode", "normal");
            C6759a.m20910a("enter_music_detail", C33933ai.m109379a(hashMap));
        }
    }

    /* renamed from: a */
    public final void mo86150a(boolean z) {
        m108767b(z);
    }

    /* renamed from: c */
    private void m108769c(boolean z) {
        this.musicItemll.setClickable(false);
        m108762a(0, C34943c.f91127w, 1, 0, 0, -f88027b, 0, (int) C9738o.m28708b(this.f88029c, 30.0f), true);
    }

    /* renamed from: b */
    private void m108765b(MusicModel musicModel) {
        if (musicModel.getCollectionType() != null) {
            this.f88031e = CollectionType.COLLECTED.equals(musicModel.getCollectionType());
        }
        mo86147a();
    }

    /* renamed from: d */
    private void m108771d(boolean z) {
        this.musicItemll.setClickable(false);
        int i = -f88027b;
        int b = (int) C9738o.m28708b(this.f88029c, 30.0f);
        this.mOkView.setVisibility(0);
        if (C43127fh.m136806a(C6399b.m19921a())) {
            ((MarginLayoutParams) this.ivCollectFrame.getLayoutParams()).leftMargin = -f88027b;
        } else {
            ((MarginLayoutParams) this.ivCollectFrame.getLayoutParams()).rightMargin = -f88027b;
        }
        m108762a(100, C34943c.f91127w, 0, 1, i, 0, b, 0, false);
    }

    /* renamed from: b */
    private void m108767b(boolean z) {
        if (z) {
            m108771d(true);
            if (this.f88028a.getMusicType() == MusicType.LOCAL) {
                this.mPlayView.setImageResource(R.drawable.ady);
                this.mProgressBarView.setVisibility(8);
            } else if (this.f88028a.getMusicType() == MusicType.ONLINE) {
                if (z) {
                    this.mPlayView.setVisibility(0);
                    this.mPlayView.setImageResource(R.drawable.ady);
                    this.mProgressBarView.setVisibility(8);
                    return;
                }
                this.mPlayView.setVisibility(8);
                this.mProgressBarView.setVisibility(0);
            } else if (z) {
                this.mPlayView.setVisibility(0);
                this.mPlayView.setImageResource(R.drawable.ady);
                this.mProgressBarView.setVisibility(8);
            } else {
                this.mPlayView.setVisibility(8);
                this.mProgressBarView.setVisibility(0);
            }
        } else {
            if (this.mOkView.getVisibility() == 0) {
                m108769c(true);
            }
            this.mProgressBarView.setVisibility(8);
            this.mPlayView.setVisibility(0);
            this.mPlayView.setImageResource(R.drawable.acy);
        }
    }

    /* renamed from: a */
    public final void mo86148a(MusicModel musicModel) {
        if (this.f88028a != null && this.mPlayView != null && musicModel != null && TextUtils.equals(this.f88028a.getPath(), musicModel.getPath())) {
            this.mPlayView.setImageResource(R.drawable.acy);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.y3) {
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                C32656f.m105742a(C6405d.m19984g(), m108761a(this.f88033g), "click_favorite_music");
                return;
            }
            m108770d();
        } else if (id == R.id.c1d) {
            if (this.f88028a != null && this.f88028a.getMusicStatus() == 0 && this.f88028a.getMusic() != null) {
                String offlineDesc = this.f88028a.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.f88032f.getString(R.string.chd);
                }
                C10761a.m31410e(view.getContext(), offlineDesc).mo25750a();
                return;
            } else if (this.f88028a != null) {
                if (C33784d.m108931a(this.f88028a, this.itemView.getContext(), true)) {
                    C7195s a = C7195s.m22438a();
                    StringBuilder sb = new StringBuilder("aweme://music/detail/");
                    sb.append(this.f88028a.getMusicId());
                    a.mo18682a(sb.toString());
                    m108768c();
                } else {
                    return;
                }
            }
        }
        if (this.f88030d != null) {
            this.f88030d.mo62273a(this, view, this.f88028a);
        }
    }

    /* renamed from: a */
    private void m108763a(String str, boolean z) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(this.f88028a.getName()) && !TextUtils.isEmpty(str)) {
            int indexOf = this.f88028a.getName().indexOf(str);
            if (indexOf > 0) {
                SpannableString spannableString = new SpannableString(this.f88028a.getName());
                spannableString.setSpan(new ForegroundColorSpan(this.itemView.getResources().getColor(R.color.a71)), indexOf, str.length() + indexOf, 17);
                this.mNameView.setText(spannableString);
                z = true;
            }
        }
        if (!z) {
            this.mNameView.setTextColor(this.itemView.getResources().getColor(R.color.a6n));
            TextView textView = this.mNameView;
            if (!TextUtils.isEmpty(this.f88028a.getName())) {
                str3 = this.f88028a.getName();
            } else {
                str3 = "";
            }
            textView.setText(str3);
        }
        if (this.f88028a.getMusicType() == MusicType.LOCAL) {
            this.mDurationView.setText(this.f88028a.getLocalMusicDuration());
        } else {
            if (C33703a.m108723g()) {
                this.mDurationView.setText(C33784d.m108921a(this.f88028a.getPresenterDuration()));
            } else {
                this.mDurationView.setText(C33784d.m108921a(this.f88028a.getDuration()));
            }
            if (this.f88028a.getDuration() > 0) {
                this.mDurationView.setVisibility(0);
            } else {
                this.mDurationView.setVisibility(8);
            }
        }
        TextView textView2 = this.mSingerView;
        if (TextUtils.isEmpty(this.f88028a.getSinger())) {
            str2 = this.itemView.getResources().getString(R.string.fjo);
        } else {
            str2 = this.f88028a.getSinger();
        }
        textView2.setText(str2);
        if (!TextUtils.isEmpty(this.f88028a.getPicPremium())) {
            C23323e.m76514a(this.mCoverView, this.f88028a.getPicPremium());
        } else if (!TextUtils.isEmpty(this.f88028a.getPicBig())) {
            C23323e.m76514a(this.mCoverView, this.f88028a.getPicBig());
        } else {
            C23323e.m76503a(this.mCoverView, (int) R.drawable.a61);
        }
        if (this.f88028a.isOriginal()) {
            this.ivOriginMusicMark.setVisibility(8);
            Drawable drawable = this.itemView.getContext().getResources().getDrawable(R.drawable.ad9);
            drawable.setBounds(0, 0, (int) C9738o.m28708b(this.itemView.getContext(), 16.0f), (int) C9738o.m28708b(this.itemView.getContext(), 16.0f));
            this.mNameView.setCompoundDrawables(drawable, null, null, null);
            this.mNameView.setCompoundDrawablePadding((int) C9738o.m28708b(this.itemView.getContext(), 2.0f));
            return;
        }
        this.mNameView.setCompoundDrawables(null, null, null, null);
        this.ivOriginMusicMark.setVisibility(8);
    }

    /* renamed from: b */
    private void m108766b(MusicModel musicModel, String str, boolean z, int i) {
        this.f88028a = musicModel;
        this.f88033g = i;
        this.f88034h = str;
        m108765b(musicModel);
        boolean z2 = false;
        m108763a(str, false);
        m108767b(z);
        int i2 = 8;
        if (musicModel.isChallengeMusic()) {
            this.musicDetailContainer.setVisibility(8);
        }
        if (musicModel.getMusicType() == MusicType.LOCAL) {
            this.ivMusicCollect.setVisibility(8);
        } else {
            this.ivMusicCollect.setVisibility(0);
        }
        LinearLayout linearLayout = this.musicDetailContainer;
        if (this.f88036j == 1) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        LinearLayout linearLayout2 = this.musicDetailContainer;
        if (this.f88036j == 1) {
            z2 = true;
        }
        linearLayout2.setEnabled(z2);
        this.ivMusicCollect.setOnStateChangeListener(new C33833a() {
            /* renamed from: a */
            public final void mo61810a() {
                MusicUnitViewHolder.this.mo86151b();
            }

            /* renamed from: a */
            public final void mo61811a(int i) {
                if (i == 1) {
                    MusicUnitViewHolder.this.mo86147a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo86149a(MusicModel musicModel, String str, boolean z, int i) {
        if (musicModel != null) {
            m108766b(musicModel, str, z, i);
            C6907h.m21518a(this.mTopView.getContext(), "show_music", m108761a(i), musicModel.getMusicId(), 0);
            C6906g.m21515a("client_show", C22984d.m75611a().mo59973a("enter_from", "popular_song").mo59973a("music_id", "123321").mo59973a(C38347c.f99553h, "music").f60753a);
        }
    }

    public MusicUnitViewHolder(View view, C33744d dVar, int i, Style style, C33746f<C33770e> fVar) {
        super(view);
        this.f88029c = view.getContext();
        this.f88030d = dVar;
        this.f88035i = fVar;
        ButterKnife.bind((Object) this, view);
        this.f88032f = view.getContext();
        this.f88036j = i;
        style.ordinal();
        if (f88027b <= 0) {
            this.mOkView.measure(MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            f88027b = (int) (((float) this.mOkView.getMeasuredWidth()) + C9738o.m28708b(this.f88029c, 8.0f));
        }
    }

    /* renamed from: a */
    private void m108762a(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i4, i5}).setDuration(200);
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C43127fh.m136806a(C6399b.m19921a())) {
                    ((MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).rightMargin = intValue;
                }
                MusicUnitViewHolder.this.ivCollectFrame.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                MusicUnitViewHolder.this.musicItemll.setClickable(true);
                if (z) {
                    MusicUnitViewHolder.this.mOkView.setVisibility(8);
                    if (C43127fh.m136806a(C6399b.m19921a())) {
                        ((MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).leftMargin = 0;
                        return;
                    }
                    ((MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).rightMargin = 0;
                }
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation((float) i2, (float) i3);
        TranslateAnimation translateAnimation = new TranslateAnimation((float) i6, (float) i7, 0.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(100);
        animationSet.setStartOffset(j);
        this.mOkView.startAnimation(animationSet);
        duration.start();
    }
}
