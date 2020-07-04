package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23963h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33918d;
import com.p280ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43109eu;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder */
public class MusicItemViewHolder extends C1293v {

    /* renamed from: e */
    private static int f63379e;

    /* renamed from: a */
    public boolean f63380a;

    /* renamed from: b */
    protected Context f63381b;

    /* renamed from: c */
    public MusicModel f63382c;

    /* renamed from: d */
    public int f63383d;

    /* renamed from: f */
    private int f63384f;

    /* renamed from: g */
    private int f63385g;

    /* renamed from: h */
    private boolean f63386h;

    /* renamed from: i */
    private C23963h f63387i;

    /* renamed from: j */
    private C23819a f63388j;

    /* renamed from: k */
    private boolean f63389k;

    /* renamed from: l */
    private C33746f<C23822c> f63390l;

    /* renamed from: m */
    private int f63391m;
    CheckableImageView mIvMusicCollect;
    SmartImageView mIvMusicCover;
    ImageView mIvMusicDetail;
    ImageView mIvMusicMark;
    ImageView mIvPlayView;
    ImageView mIvUseToShoot;
    ViewGroup mLlItemContainer;
    ViewGroup mLlTitltContainer;
    ViewGroup mLlUseToShoot;
    RecyclerView mMusicTagsContainer;
    ImageView mOriginalTag;
    ViewGroup mRLCoverContainer;
    ViewGroup mRlUseContainer;
    View mSpaceView;
    TextView mTvMusicDuration;
    TextView mTvMusicName;
    TextView mTvMusicSinger;
    TextView mTvUseToShoot;

    /* renamed from: a */
    private static int m78695a(int i) {
        switch (i) {
            case 0:
                return R.drawable.b7r;
            case 1:
                return R.drawable.b7v;
            case 2:
                return R.drawable.b7w;
            case 3:
                return R.drawable.b7x;
            case 4:
                return R.drawable.b7y;
            case 5:
                return R.drawable.b7z;
            case 6:
                return R.drawable.b80;
            case 7:
                return R.drawable.b81;
            case 8:
                return R.drawable.b82;
            case 9:
                return R.drawable.b7s;
            case 10:
                return R.drawable.b7t;
            case 11:
                return R.drawable.b7u;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public final void mo62212a(MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, int i, int i2, int i3, C23819a aVar, boolean z4) {
        if (musicModel != null) {
            this.f63386h = z;
            this.f63383d = i3;
            this.f63385g = i2;
            this.f63388j = aVar;
            this.f63389k = z4;
            m78699a(musicModel, str, z2, z3, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62213a(String str, boolean z) {
        if (!TextUtils.isEmpty(this.f63382c.getName())) {
            this.mTvMusicName.setText(this.f63382c.getName());
            z = true;
        }
        if (!z) {
            this.mTvMusicName.setTextColor(this.f63381b.getResources().getColor(R.color.a6n));
            this.mTvMusicName.setText(!TextUtils.isEmpty(this.f63382c.getName()) ? this.f63382c.getName() : "");
        }
        if (!C6399b.m19944t()) {
            this.mTvMusicName.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(this.f63382c.getName()) || !this.f63382c.isOriginal()) {
            this.mOriginalTag.setVisibility(8);
        } else {
            this.mOriginalTag.setVisibility(0);
        }
        C33918d.f88507a.mo86581a(this.mTvMusicName, this.f63382c.getMusic(), true);
        this.mTvMusicSinger.setText(TextUtils.isEmpty(this.f63382c.getSinger()) ? this.f63381b.getString(R.string.fjo) : this.f63382c.getSinger());
        m78697a(this.mIvMusicCover, this.f63382c);
        if (this.f63382c.getMusicType() == MusicType.LOCAL) {
            this.mTvMusicDuration.setText(this.f63382c.getLocalMusicDuration());
        } else if (C33703a.m108723g()) {
            this.mTvMusicDuration.setText(C43109eu.m136730a(this.f63382c.getPresenterDuration()));
        } else {
            this.mTvMusicDuration.setText(C43109eu.m136730a(this.f63382c.getDuration()));
        }
        if (this.f63389k) {
            this.mTvMusicName.setTextColor(Color.parseColor("#e6ffffff"));
            this.mTvMusicSinger.setTextColor(Color.parseColor("#80ffffff"));
            this.mTvMusicDuration.setTextColor(Color.parseColor("#80ffffff"));
        }
    }

    /* renamed from: h */
    private void m78705h() {
        this.f63380a = !this.f63380a;
    }

    /* renamed from: c */
    public final void mo62216c() {
        this.itemView.setPadding(0, 0, 0, 0);
    }

    /* renamed from: g */
    public final void mo62220g() {
        boolean z = this.f63380a;
        C42961az.m136380a(new C33769d(z ? 1 : 0, this.f63382c));
    }

    /* renamed from: a */
    public final void mo62209a() {
        this.mLlItemContainer.setPadding(this.mLlItemContainer.getPaddingLeft(), 0, 0, 0);
    }

    /* renamed from: d */
    public final void mo62217d() {
        if (this.f63382c.getCollectionType() != null) {
            this.f63380a = CollectionType.COLLECTED.equals(this.f63382c.getCollectionType());
        }
        mo62219f();
    }

    /* renamed from: f */
    public final void mo62219f() {
        int i;
        CheckableImageView checkableImageView = this.mIvMusicCollect;
        if (this.f63380a) {
            i = R.drawable.a3w;
        } else if (this.f63389k) {
            i = R.drawable.as3;
        } else {
            i = R.drawable.a3x;
        }
        checkableImageView.setImageResource(i);
    }

    /* renamed from: e */
    public final void mo62218e() {
        String str;
        if (this.f63382c != null) {
            if (this.f63380a || C33784d.m108931a(this.f63382c, this.f63381b, true)) {
                if (this.f63390l != null) {
                    C33746f<C23822c> fVar = this.f63390l;
                    MusicModel musicModel = this.f63382c;
                    if (this.f63380a) {
                        str = "unfollow_type";
                    } else {
                        str = "follow_type";
                    }
                    fVar.mo61995a(new C23822c(musicModel, str, this.f63385g, this.f63383d));
                }
                m78705h();
                this.mIvMusicCollect.mo86446b();
            }
        }
    }

    /* renamed from: b */
    public final void mo62215b() {
        this.itemView.setPadding(0, 0, 0, 0);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mRLCoverContainer.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) C9738o.m28708b(this.f63381b, 2.0f);
        marginLayoutParams.topMargin = (int) C9738o.m28708b(this.f63381b, 2.0f);
        this.mRLCoverContainer.requestLayout();
        this.mSpaceView.setVisibility(8);
        ((MarginLayoutParams) this.mLlUseToShoot.getLayoutParams()).rightMargin = (int) C9738o.m28708b(this.f63381b, 8.0f);
        this.mLlUseToShoot.requestLayout();
    }

    /* renamed from: d */
    private void m78704d(boolean z) {
        if (!z) {
            m78701b(true);
        } else {
            m78703c(true);
        }
    }

    public void onClick(View view) {
        if (this.f63387i != null) {
            this.f63387i.mo61894a(this, view, this.f63382c, this.f63384f);
        }
    }

    /* renamed from: b */
    private void m78701b(boolean z) {
        if (this.mLlUseToShoot.getVisibility() != 8) {
            if (z) {
                this.mLlItemContainer.setClickable(false);
                int i = -f63379e;
                int b = (int) C9738o.m28708b(this.f63381b, 30.0f);
                if (C43127fh.m136806a(this.f63381b)) {
                    b = -b;
                }
                m78696a(0, (int) C34943c.f91127w, 1, 0, 0, i, 0, b, true);
                return;
            }
            this.mLlUseToShoot.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m78703c(boolean z) {
        if (this.mLlUseToShoot.getVisibility() != 0) {
            if (z) {
                this.mLlItemContainer.setClickable(false);
                int i = -f63379e;
                int b = (int) C9738o.m28708b(this.f63381b, 30.0f);
                if (C43127fh.m136806a(this.f63381b)) {
                    b = -b;
                }
                int i2 = b;
                this.mLlUseToShoot.setVisibility(0);
                if (C43127fh.m136806a(this.f63381b)) {
                    ((MarginLayoutParams) this.mRlUseContainer.getLayoutParams()).leftMargin = -f63379e;
                } else {
                    ((MarginLayoutParams) this.mRlUseContainer.getLayoutParams()).rightMargin = -f63379e;
                }
                m78696a(100, (int) C34943c.f91127w, 0, 1, i, 0, i2, 0, false);
                return;
            }
            this.mLlUseToShoot.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m78700a(boolean z) {
        this.mIvPlayView.clearAnimation();
        if (!z) {
            this.mIvPlayView.setVisibility(0);
            this.mIvPlayView.setImageResource(R.drawable.acy);
        } else if (this.f63382c != null) {
            if (this.f63382c.getMusicType() == MusicType.LOCAL) {
                this.mIvPlayView.setImageResource(R.drawable.ady);
            } else {
                if (this.f63382c.getMusicType() == MusicType.ONLINE) {
                    this.mIvPlayView.setVisibility(0);
                    this.mIvPlayView.setImageResource(R.drawable.ady);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62214a(boolean z, boolean z2) {
        m78702b(z, z2);
    }

    /* renamed from: a */
    public final void mo62210a(C23963h hVar, C33746f<C23822c> fVar) {
        this.f63387i = hVar;
        this.f63390l = fVar;
    }

    /* renamed from: a */
    protected static void m78697a(SmartImageView smartImageView, MusicModel musicModel) {
        smartImageView.post(new C24006c(musicModel, smartImageView));
    }

    public MusicItemViewHolder(View view, int i) {
        super(view);
        this.f63381b = view.getContext();
        this.f63391m = i;
        ButterKnife.bind((Object) this, view);
        if (C6399b.m19944t()) {
            this.mIvUseToShoot.setVisibility(0);
        } else {
            this.mTvUseToShoot.setVisibility(0);
        }
        if (f63379e <= 0) {
            this.mLlUseToShoot.measure(MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            f63379e = (int) (((float) this.mLlUseToShoot.getMeasuredWidth()) + C9738o.m28708b(this.f63381b, 8.0f));
        }
        this.mIvMusicCollect.setOnStateChangeListener(new C33833a() {
            /* renamed from: a */
            public final void mo61810a() {
                MusicItemViewHolder.this.mo62220g();
            }

            /* renamed from: a */
            public final void mo61811a(int i) {
                if (i == 1) {
                    MusicItemViewHolder.this.mo62219f();
                }
            }
        });
    }

    /* renamed from: b */
    private void m78702b(boolean z, boolean z2) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.bu);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.mIvPlayView.setImageResource(R.drawable.avi);
            this.mIvPlayView.startAnimation(loadAnimation);
            return;
        }
        this.mIvPlayView.clearAnimation();
        m78700a(z2);
        m78704d(z2);
    }

    /* renamed from: a */
    static final /* synthetic */ void m78698a(MusicModel musicModel, SmartImageView smartImageView) {
        if (musicModel != null) {
            C12139r rVar = null;
            if (musicModel.getMusic() != null) {
                if (musicModel.getMusic().getCoverMedium() != null) {
                    rVar = C12133n.m35299a(C23400r.m76741a(musicModel.getMusic().getCoverMedium()));
                } else if (musicModel.getMusic().getCoverLarge() != null) {
                    rVar = C12133n.m35299a(C23400r.m76741a(musicModel.getMusic().getCoverLarge()));
                }
            }
            if (rVar == null) {
                if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                    rVar = C12133n.m35301a(musicModel.getPicPremium());
                } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                    rVar = C12133n.m35301a(musicModel.getPicBig());
                } else {
                    rVar = C12133n.m35298a((int) R.drawable.a61);
                }
            }
            if (smartImageView.getMeasuredHeight() > 0 && smartImageView.getMeasuredWidth() > 0) {
                rVar.mo29836a(smartImageView.getMeasuredWidth(), smartImageView.getMeasuredHeight());
            }
            rVar.mo29853b(C43012cg.m136513a(301)).mo29845a("MusicItem").mo29844a((C12128i) smartImageView).mo29848a();
        }
    }

    /* renamed from: a */
    private void m78699a(MusicModel musicModel, String str, boolean z, boolean z2, int i) {
        int i2;
        ImageView imageView;
        this.f63382c = musicModel;
        this.f63384f = i;
        mo62217d();
        mo62213a(str, false);
        m78700a(z);
        if (z) {
            m78703c(false);
        } else {
            m78701b(false);
        }
        if (musicModel.getMusicType() == MusicType.LOCAL) {
            this.mIvMusicCollect.setVisibility(8);
            imageView = this.mIvMusicDetail;
        } else {
            this.mIvMusicCollect.setVisibility(0);
            boolean z3 = true;
            if (!C23889d.m78221b() || !(this.f63391m == 1 || this.f63391m == 2)) {
                z3 = false;
            }
            imageView = this.mIvMusicDetail;
            if (z3) {
                i2 = 0;
                imageView.setVisibility(i2);
                if (this.f63386h || this.f63383d >= 12) {
                    this.mIvMusicMark.setVisibility(8);
                } else {
                    this.mIvMusicMark.setVisibility(0);
                    int a = m78695a(this.f63383d);
                    if (a > 0) {
                        if (this.f63383d < 3) {
                            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mIvMusicMark.getLayoutParams();
                            marginLayoutParams.topMargin = (int) C9738o.m28708b(this.mIvMusicMark.getContext(), 0.0f);
                            marginLayoutParams.leftMargin = marginLayoutParams.topMargin;
                        } else {
                            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.mIvMusicMark.getLayoutParams();
                            marginLayoutParams2.topMargin = (int) C9738o.m28708b(this.mIvMusicMark.getContext(), 2.0f);
                            marginLayoutParams2.leftMargin = marginLayoutParams2.topMargin;
                        }
                        this.mIvMusicMark.setImageResource(a);
                    }
                }
                if (TextUtils.equals("search_music", this.f63388j.f62870a) && C6399b.m19944t()) {
                    if (this.f63382c != null && this.f63382c.getMusic() != null && this.f63382c.getMusic().getMusicTags() != null && this.f63382c.getMusic().getMusicTags().size() > 0) {
                        ((ISearchMusicDepentService) ServiceManager.get().getService(ISearchMusicDepentService.class)).showSearchMusicTags(this.mMusicTagsContainer, this.f63382c.getMusic().getMusicTags(), new OnClickListener() {
                            public final void onClick(View view) {
                                ClickInstrumentation.onClick(view);
                                MusicItemViewHolder.this.onClick(MusicItemViewHolder.this.mLlItemContainer);
                            }
                        });
                    } else if (this.mMusicTagsContainer != null) {
                        this.mMusicTagsContainer.setVisibility(8);
                        this.mMusicTagsContainer.removeAllViews();
                    }
                    ((ISearchMusicDepentService) ServiceManager.get().getService(ISearchMusicDepentService.class)).mobShowMusicCardEvent(this.f63388j.f62870a, this.f63382c, getAdapterPosition());
                    return;
                }
            }
        }
        i2 = 8;
        imageView.setVisibility(i2);
        if (this.f63386h) {
        }
        this.mIvMusicMark.setVisibility(8);
        if (TextUtils.equals("search_music", this.f63388j.f62870a)) {
        }
    }

    /* renamed from: a */
    public final void mo62211a(MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, int i, int i2, int i3, C23819a aVar) {
        mo62212a(musicModel, str, z, z2, false, 0, i2, i3, aVar, false);
    }

    /* renamed from: a */
    private void m78696a(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, final boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i4, i5}).setDuration(200);
        duration.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (C43127fh.m136806a(MusicItemViewHolder.this.f63381b)) {
                    ((MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).rightMargin = intValue;
                }
                MusicItemViewHolder.this.mRlUseContainer.requestLayout();
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                MusicItemViewHolder.this.mLlItemContainer.setClickable(true);
                if (z) {
                    MusicItemViewHolder.this.mLlUseToShoot.setVisibility(8);
                    if (C43127fh.m136806a(MusicItemViewHolder.this.f63381b)) {
                        ((MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).leftMargin = 0;
                        return;
                    }
                    ((MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).rightMargin = 0;
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
        this.mLlUseToShoot.startAnimation(animationSet);
        duration.start();
    }
}
