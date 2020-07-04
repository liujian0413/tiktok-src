package com.p280ss.android.ugc.aweme.discover.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commerce.C24425b;
import com.p280ss.android.ugc.aweme.commerce.service.models.DiscoveryTopGoods;
import com.p280ss.android.ugc.aweme.commerce.service.p1110d.C24440a;
import com.p280ss.android.ugc.aweme.commerce.service.p1110d.C24441b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.base.C26593b;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26678c;
import com.p280ss.android.ugc.aweme.discover.model.RankingListCover;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27009an;
import com.p280ss.android.ugc.aweme.discover.widget.RankScrollView;
import com.p280ss.android.ugc.aweme.discover.widget.RankScrollView.C27271a;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.model.Brand;
import com.p280ss.android.ugc.aweme.music.model.BrandBillboard;
import com.p280ss.android.ugc.aweme.music.model.BrandCategory;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C43018cm;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.RankingListCoverViewHolder */
public class RankingListCoverViewHolder extends C1293v {

    /* renamed from: a */
    public Fragment f69559a;

    /* renamed from: b */
    public TextView f69560b;

    /* renamed from: c */
    public TextView f69561c;

    /* renamed from: d */
    public CircleImageView f69562d;

    /* renamed from: e */
    public AnimatorSet f69563e;

    /* renamed from: f */
    public int f69564f;

    /* renamed from: g */
    private RankScrollView f69565g;

    /* renamed from: h */
    private View f69566h;

    /* renamed from: i */
    private TextView f69567i;

    /* renamed from: j */
    private TextView f69568j;

    /* renamed from: k */
    private TextView f69569k;

    /* renamed from: l */
    private RemoteImageView f69570l;

    /* renamed from: m */
    private Rect f69571m;
    View mMusicContainer;
    RemoteImageView mMusicHeaderView;
    TextView mMusicName;
    RemoteImageView mStarBackground;
    View mStarContainer;
    CircleImageView mStarHeaderView;
    TextView mStarName;

    /* renamed from: n */
    private boolean f69572n;

    /* renamed from: o */
    private boolean f69573o;

    /* renamed from: p */
    private View f69574p;

    /* renamed from: q */
    private LinearLayout f69575q;

    /* renamed from: r */
    private boolean f69576r;

    /* renamed from: s */
    private ObjectAnimator f69577s;

    /* renamed from: t */
    private Rect f69578t;

    /* renamed from: u */
    private boolean f69579u;

    /* renamed from: v */
    private C27271a f69580v;

    /* renamed from: w */
    private RankingListCover f69581w;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo68001c() {
        this.f69573o = false;
    }

    /* renamed from: a */
    public final void mo67999a(RankingListCover rankingListCover) {
        if (rankingListCover != null && rankingListCover != this.f69581w) {
            this.f69581w = rankingListCover;
            m86910a(rankingListCover.getTopStar());
            m86909a(rankingListCover.getTopMusic());
            if (this.f69576r) {
                this.f69580v = new C26504u(this);
                m86907a(rankingListCover.getTopGoods());
                m86908a(rankingListCover.getTopBrand());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67998a(int i) {
        if (!this.f69573o && this.f69572n && this.f69566h != null && this.f69566h.getVisibility() == 0 && this.f69571m != null) {
            this.f69566h.getGlobalVisibleRect(this.f69571m);
            if (this.f69571m.right < C23482j.m77098b(this.itemView.getContext())) {
                this.f69572n = false;
                C6907h.m21524a("show_hot_list_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
            }
        }
        if (!this.f69573o && this.f69579u && this.f69574p != null && this.f69574p.getVisibility() == 0 && this.f69578t != null) {
            this.f69574p.getGlobalVisibleRect(this.f69578t);
            if (this.f69578t.right < C23482j.m77098b(this.itemView.getContext())) {
                this.f69579u = false;
                C6907h.m21524a("show_brand_list_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo68002d() {
        this.f69565g.setSmoothScrollingEnabled(false);
        this.f69565g.fullScroll(66);
        this.f69565g.setSmoothScrollingEnabled(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo68000b() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f69565g, "scrollX", new int[]{0});
        ofInt.setDuration(200);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
        this.f69565g.postDelayed(new C26505v(this), 2000);
    }

    /* renamed from: g */
    private void m86915g() {
        if (VERSION.SDK_INT >= 21) {
            this.mStarContainer.setOutlineProvider(new C43070ds((int) C9738o.m28708b(this.itemView.getContext(), 4.0f)));
            this.mStarContainer.setClipToOutline(true);
            this.mMusicContainer.setOutlineProvider(new C43070ds((int) C9738o.m28708b(this.itemView.getContext(), 4.0f)));
            this.mMusicContainer.setClipToOutline(true);
            if (this.f69576r) {
                this.f69566h.setOutlineProvider(new C43070ds((int) C9738o.m28708b(this.itemView.getContext(), 4.0f)));
                this.f69566h.setClipToOutline(true);
                this.f69574p.setOutlineProvider(new C43070ds((int) C9738o.m28708b(this.itemView.getContext(), 4.0f)));
                this.f69574p.setClipToOutline(true);
            }
        }
    }

    /* renamed from: e */
    private void m86913e() {
        this.f69576r = true;
        this.f69565g = (RankScrollView) this.itemView.findViewById(R.id.de_);
        C24440a a = C24441b.m80369a(this.itemView.getContext());
        if (a == null || a.mo60416a(true)) {
            a.mo60418b(false);
            this.f69573o = true;
            this.f69565g.post(new C26502s(this));
            this.f69565g.postDelayed(new C26503t(this), 2000);
        }
        this.f69566h = this.itemView.findViewById(R.id.cub);
        this.f69574p = this.itemView.findViewById(R.id.cu_);
        int b = (C23482j.m77098b(this.itemView.getContext()) * 168) / 375;
        ((LayoutParams) this.f69566h.getLayoutParams()).width = b;
        ((LayoutParams) this.mStarContainer.getLayoutParams()).width = b;
        ((LayoutParams) this.mMusicContainer.getLayoutParams()).width = b;
        ((LayoutParams) this.f69574p.getLayoutParams()).width = b;
        this.f69567i = (TextView) this.itemView.findViewById(R.id.e3j);
        this.f69568j = (TextView) this.itemView.findViewById(R.id.e3v);
        this.f69569k = (TextView) this.itemView.findViewById(R.id.dv6);
        this.f69570l = (RemoteImageView) this.itemView.findViewById(R.id.b9w);
        this.f69575q = (LinearLayout) this.itemView.findViewById(R.id.bqh);
        this.f69560b = (TextView) this.itemView.findViewById(R.id.e3u);
        this.f69561c = (TextView) this.itemView.findViewById(R.id.dqz);
        this.f69562d = (CircleImageView) this.itemView.findViewById(R.id.b9v);
    }

    /* renamed from: f */
    private void m86914f() {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.mo32884a(true);
        ((C13438a) this.mStarHeaderView.getHierarchy()).mo32897a(roundingParams);
        ((C13438a) this.mStarHeaderView.getHierarchy()).mo32896a(C13423b.f35599g);
        if (((Integer) SharePrefCache.inst().getHitRankActivityStatus().mo59877d()).intValue() != 0) {
            String str = (String) SharePrefCache.inst().getHitRankActivityStarBackground().mo59877d();
            if (!TextUtils.isEmpty(str)) {
                C26593b.m87366a(this.mStarBackground, str);
            }
        }
        RoundingParams roundingParams2 = new RoundingParams();
        roundingParams2.mo32879a(C9738o.m28708b(this.itemView.getContext(), 4.0f));
        ((C13438a) this.mMusicHeaderView.getHierarchy()).mo32897a(roundingParams2);
        ((C13438a) this.mMusicHeaderView.getHierarchy()).mo32896a(C13423b.f35599g);
        if (this.f69576r) {
            ((C13438a) this.f69570l.getHierarchy()).mo32897a(roundingParams2);
            ((C13438a) this.f69570l.getHierarchy()).mo32896a(C13423b.f35599g);
            ((C13438a) this.f69562d.getHierarchy()).mo32897a(roundingParams);
            ((C13438a) this.f69562d.getHierarchy()).mo32896a(C13423b.f35599g);
        }
    }

    /* renamed from: a */
    public final void mo67997a() {
        if (this.f69563e != null) {
            this.f69563e.cancel();
            this.f69563e = null;
        }
        if (this.f69577s != null) {
            this.f69577s.cancel();
            this.f69577s = null;
        }
    }

    /* renamed from: a */
    private void m86909a(Music music) {
        if (music != null) {
            C26593b.m87365a(this.mMusicHeaderView, music.getCoverThumb());
            this.mMusicName.setText(music.getMusicName());
        }
    }

    /* renamed from: a */
    private void m86910a(User user) {
        if (user == null) {
            this.mStarContainer.setVisibility(8);
            return;
        }
        C26593b.m87365a((RemoteImageView) this.mStarHeaderView, user.getAvatarThumb());
        this.mStarName.setText(user.getNickname());
    }

    /* renamed from: a */
    private void m86907a(final DiscoveryTopGoods discoveryTopGoods) {
        if (discoveryTopGoods == null) {
            this.f69566h.setVisibility(8);
            return;
        }
        this.f69566h.setVisibility(0);
        this.f69565g.setOnScrollListener(this.f69580v);
        C26593b.m87365a(this.f69570l, discoveryTopGoods.getPromotionImage());
        this.f69567i.setText(discoveryTopGoods.getTitle());
        this.f69569k.setText(discoveryTopGoods.getPromotionTitle());
        this.f69568j.setText(discoveryTopGoods.getCategory());
        this.f69566h.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C6907h.m21524a("click_hot_list_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
                if (C21115b.m71197a().isLogin()) {
                    String h5Url = discoveryTopGoods.getH5Url();
                    if (!C26535x.m87233a(RankingListCoverViewHolder.this.itemView.getContext()) || TextUtils.isEmpty(h5Url)) {
                        C10761a.m31399c(RankingListCoverViewHolder.this.itemView.getContext(), (int) R.string.cjs).mo25750a();
                        return;
                    }
                    C24425b.m80324a(h5Url, C43018cm.m136527a("entrance_location", "fullscreen_card"), RankingListCoverViewHolder.this.itemView.getContext());
                } else if (RankingListCoverViewHolder.this.f69559a != null) {
                    C32656f.m105749a(RankingListCoverViewHolder.this.f69559a, "discovery", "click_open_url", (C23305g) new C23305g() {
                        /* renamed from: a */
                        public final void mo58664a(Bundle bundle) {
                        }

                        /* renamed from: a */
                        public final void mo58663a() {
                            String h5Url = discoveryTopGoods.getH5Url();
                            if (!C26534w.m87232a(RankingListCoverViewHolder.this.itemView.getContext()) || TextUtils.isEmpty(h5Url)) {
                                C10761a.m31399c(RankingListCoverViewHolder.this.itemView.getContext(), (int) R.string.cjs).mo25750a();
                            } else {
                                C24425b.m80324a(h5Url, C43018cm.m136527a("entrance_location", "fullscreen_card"), RankingListCoverViewHolder.this.itemView.getContext());
                            }
                        }
                    });
                } else {
                    C10761a.m31399c(RankingListCoverViewHolder.this.itemView.getContext(), (int) R.string.cjs).mo25750a();
                }
            }
        });
    }

    /* renamed from: a */
    private void m86908a(BrandBillboard brandBillboard) {
        if (brandBillboard == null) {
            this.f69574p.setVisibility(8);
            return;
        }
        this.f69574p.setVisibility(0);
        this.f69565g.setOnScrollListener(this.f69580v);
        if (this.f69577s == null && this.f69563e == null) {
            List categoryList = brandBillboard.getCategoryList();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (m86912a(categoryList, arrayList, arrayList2, 0, 0, 0)) {
                m86911a(categoryList, arrayList, arrayList2, 0);
                this.f69574p.setOnTouchListener(new C27009an() {
                    /* renamed from: b */
                    public final void mo67959b(View view, MotionEvent motionEvent) {
                        String uri = C33786f.m108941a((String) SharePrefCache.inst().getBrandScheme().mo59877d()).mo86195a("brand_category_id", String.valueOf(RankingListCoverViewHolder.this.f69564f)).mo86194a().toString();
                        C6907h.m21524a("click_brand_list_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
                        if (!TextUtils.isEmpty(uri)) {
                            C7195s.m22438a().mo18682a(uri);
                        }
                    }
                });
            }
        }
    }

    public RankingListCoverViewHolder(View view, boolean z) {
        this(view, false, null);
    }

    public RankingListCoverViewHolder(final View view, boolean z, Fragment fragment) {
        super(view);
        this.f69571m = new Rect();
        this.f69572n = true;
        this.f69573o = false;
        this.f69578t = new Rect();
        this.f69579u = true;
        this.f69559a = fragment;
        ButterKnife.bind((Object) this, view);
        this.mStarContainer.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C6907h.m21524a("enter_star_board", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
                C7195s.m22438a().mo18682a(C26678c.m87643a("discovery"));
            }
        });
        this.mMusicContainer.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                C6907h.m21524a("enter_music_leaderboard", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").mo59970a("scene_id", 1001).f60753a);
                view.getContext();
            }
        });
        if (z) {
            m86913e();
        }
        m86914f();
        m86915g();
    }

    /* renamed from: a */
    private void m86911a(final List<BrandCategory> list, final List<Brand> list2, final List<String> list3, int i) {
        this.f69577s = ObjectAnimator.ofFloat(this.f69575q, "alpha", new float[]{1.0f, 1.0f});
        this.f69577s.setDuration(2000);
        this.f69577s.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f69575q, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(180);
        ofFloat.setStartDelay(2000);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f69575q, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f69575q, "translationY", new float[]{(float) C23486n.m77122a(8.0d), 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat3});
        animatorSet.setDuration(250);
        animatorSet.setInterpolator(new LinearInterpolator());
        this.f69563e = new AnimatorSet();
        this.f69563e.playSequentially(new Animator[]{animatorSet, ofFloat});
        this.f69564f = ((BrandCategory) list.get(0)).getId();
        this.f69563e.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            int f69589a = 1;

            /* renamed from: f */
            private boolean f69594f;

            public final void onAnimationCancel(Animator animator) {
                this.f69594f = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f69594f && RankingListCoverViewHolder.this.f69563e != null) {
                    RankingListCoverViewHolder.this.f69563e.start();
                }
            }

            public final void onAnimationStart(Animator animator) {
                if (((Brand) list2.get(this.f69589a)).getLogoUrl() == null) {
                    RankingListCoverViewHolder.this.f69562d.setImageResource(R.drawable.b95);
                } else {
                    C26593b.m87365a((RemoteImageView) RankingListCoverViewHolder.this.f69562d, ((Brand) list2.get(this.f69589a)).getLogoUrl());
                }
                RankingListCoverViewHolder.this.f69561c.setText(((Brand) list2.get(this.f69589a)).getName());
                RankingListCoverViewHolder.this.f69560b.setText(C1642a.m8034a(C23481i.m77091b(R.string.uc), new Object[]{list3.get(this.f69589a)}));
                RankingListCoverViewHolder.this.f69564f = ((BrandCategory) list.get(this.f69589a)).getId();
                this.f69589a = (this.f69589a + 1) % list2.size();
            }
        });
        this.f69577s.addListener(new AnimatorListenerAdapter() {

            /* renamed from: b */
            private boolean f69596b;

            public final void onAnimationCancel(Animator animator) {
                this.f69596b = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.f69596b && RankingListCoverViewHolder.this.f69563e != null) {
                    RankingListCoverViewHolder.this.f69563e.start();
                }
            }
        });
        this.f69577s.start();
    }

    /* renamed from: a */
    private boolean m86912a(List<BrandCategory> list, List<Brand> list2, List<String> list3, int i, int i2, int i3) {
        for (BrandCategory brandCategory : list) {
            if (brandCategory.getBrandList() != null) {
                list2.add(brandCategory.getBrandList().get(0));
            }
            list3.add(brandCategory.getName());
        }
        if (list2.size() == 0) {
            return false;
        }
        if (((Brand) list2.get(0)).getLogoUrl() == null) {
            this.f69562d.setImageResource(R.drawable.b95);
        } else {
            C26593b.m87365a((RemoteImageView) this.f69562d, ((Brand) list2.get(0)).getLogoUrl());
        }
        this.f69561c.setText(((Brand) list2.get(0)).getName());
        this.f69560b.setText(C1642a.m8034a(C23481i.m77091b(R.string.uc), new Object[]{list3.get(0)}));
        return true;
    }
}
