package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.OnAnimatedScrollListener;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c.C25696d;
import com.p280ss.android.ugc.aweme.discover.adapter.AnimatedListAdapter.C26373b;
import com.p280ss.android.ugc.aweme.discover.model.Category;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.PAGE;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.metrics.C33245aq;
import com.p280ss.android.ugc.aweme.metrics.C33273o;
import com.p280ss.android.ugc.aweme.metrics.C33277s;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryViewHolder */
public class CategoryViewHolder extends C1293v implements C25696d, C26373b {

    /* renamed from: a */
    public static final Category f69451a = new Category();

    /* renamed from: b */
    public final WrapLinearLayoutManager f69452b;

    /* renamed from: c */
    private Category f69453c;

    /* renamed from: d */
    private int f69454d;

    /* renamed from: e */
    private AnimatedListAdapter f69455e;

    /* renamed from: f */
    private OnAnimatedScrollListener f69456f = new OnAnimatedScrollListener();

    /* renamed from: g */
    private Context f69457g;

    /* renamed from: h */
    private View f69458h;
    View mCategoryCountView;
    RemoteImageView mIvType;
    RecyclerView mListView;
    View mRoot;
    TextView mTvCount;
    TextView mTvTitle;
    TextView mTvType;
    ImageView mViewDiscoverBg;
    ViewStub mViewStubPlaceHolder;

    /* renamed from: c */
    private static String m86771c(boolean z) {
        return z ? "cell_slide" : "cell_click";
    }

    /* renamed from: d */
    private static String m86773d(boolean z) {
        return z ? "into" : "header_click";
    }

    /* renamed from: d */
    private int m86772d() {
        return this.f69454d + 1;
    }

    /* renamed from: a */
    public final void mo67906a() {
        mo67932a(true);
    }

    /* renamed from: b */
    public final void mo67933b() {
        if (this.f69456f != null) {
            this.f69456f.mo61762a(this.mListView, false);
        }
    }

    /* renamed from: c */
    public final void mo67935c() {
        if (this.f69456f != null) {
            OnAnimatedScrollListener.m77861a(this.mListView);
        }
    }

    /* renamed from: b */
    public final void mo67934b(boolean z) {
        if (this.f69455e != null) {
            this.f69455e.f69412i = z;
        }
    }

    public CategoryViewHolder(View view) {
        super(view);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                CategoryViewHolder.this.mo67932a(false);
            }
        });
        this.f69457g = view.getContext();
        ButterKnife.bind((Object) this, view);
        int color = view.getContext().getResources().getColor(R.color.sj);
        this.f69452b = new WrapLinearLayoutManager(view.getContext(), 0, false);
        this.mListView.setLayoutManager(this.f69452b);
        this.mListView.mo5525a((C1272h) new DividerItemDecoration(color, (int) C9738o.m28708b(view.getContext(), 2.0f), 0));
        this.mListView.mo5528a((C1281m) this.f69456f);
        this.mListView.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C6907h.m21517a((Context) null, "cell_slide", "slide", 0, 0);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo67932a(boolean z) {
        String str;
        if (!C43122ff.m136767b() && this.f69453c != null) {
            Challenge challenge = this.f69453c.getChallenge();
            if (challenge != null) {
                String uuid = UUID.randomUUID().toString();
                if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).havePGCShow() || z || !challenge.isPgcshow()) {
                    C7195s a = C7195s.m22438a();
                    StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                    sb.append(challenge.getCid());
                    C7203u a2 = C7203u.m22460a(sb.toString()).mo18694a("enter_from", "discovery").mo18693a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).mo18694a("process_id", uuid);
                    String str2 = "is_commerce";
                    if (C25242ao.m82976b(challenge)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    a.mo18682a(a2.mo18694a(str2, str).mo18695a());
                    C6907h.m21524a("cell_click", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("tag_id", challenge.getCid()).mo59970a("client_order", m86772d()).f60753a);
                    C6907h.onEvent(MobClick.obtain().setEventName(m86771c(z)).setLabelName(m86773d(z)).setValue(challenge.getCid()).setJsonObject(new C6869c().mo16887a("cell_type", "challenge").mo16888b()));
                    if (this.f69453c.isAd()) {
                        if (z) {
                            C24976t.m82042a(this.f69457g, this.f69453c);
                        } else {
                            C24976t.m82175c(this.f69457g, this.f69453c);
                        }
                    }
                } else {
                    C23671a aVar = new C23671a();
                    aVar.setItems(new ArrayList());
                    C28503s.m93679a((C25673a) aVar);
                    C7195s a3 = C7195s.m22438a();
                    StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
                    sb2.append(((Aweme) this.f69453c.getItems().get(0)).getAid());
                    a3.mo18682a(C7203u.m22460a(sb2.toString()).mo18694a("refer", "discovery").mo18694a("video_from", "from_challenge").mo18694a("challenge_id", challenge.getCid()).mo18695a());
                }
                ((C33277s) new C33277s().mo85330f("discovery").mo85048a("click_discovery_cover")).mo85334k(challenge.getCid()).mo85335o(uuid).mo85252e();
                C28580o.m93830a(PAGE.CHALLENGE);
                return;
            }
            Music music = this.f69453c.getMusic();
            if (music != null) {
                if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(music.convertToMusicModel(), this.f69457g, true)) {
                    C6907h.m21524a("enter_music_detail_failed", (Map) new C22984d().mo59973a("group_id", "").mo59973a("author_id", "").mo59973a("music_id", music.getMid()).mo59973a("enter_from", "discovery").f60753a);
                    return;
                }
                C7195s a4 = C7195s.m22438a();
                StringBuilder sb3 = new StringBuilder("aweme://music/detail/");
                sb3.append(music.getMid());
                a4.mo18682a(sb3.toString());
                C6907h.m21524a("cell_click", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("music_id", music.getMid()).mo59970a("client_order", m86772d()).f60753a);
                C6907h.onEvent(MobClick.obtain().setEventName(m86771c(z)).setLabelName(m86773d(z)).setValue(String.valueOf(music.getMid())).setJsonObject(new C6869c().mo16887a("cell_type", "music").mo16888b()));
                ((C33273o) new C33273o().mo85298f("discovery").mo85301j(music.getMid()).mo85048a("click_discovery_cover")).mo85252e();
                C28580o.m93830a(PAGE.MUSICAL);
            }
        }
    }

    /* renamed from: a */
    public final void mo67931a(Category category, int i) {
        if (category != null) {
            if (f69451a == category) {
                if (this.f69458h == null) {
                    this.f69458h = this.mViewStubPlaceHolder.inflate();
                }
                C23487o.m77140a(this.f69458h, 0);
                C23487o.m77140a(this.mRoot, 8);
                return;
            }
            this.f69454d = i;
            C23487o.m77140a((View) this.mViewStubPlaceHolder, 8);
            C23487o.m77140a(this.mRoot, 0);
            if (C43122ff.m136767b()) {
                C23487o.m77140a(this.mCategoryCountView, 8);
            }
            this.f69453c = category;
            Challenge challenge = this.f69453c.getChallenge();
            Music music = this.f69453c.getMusic();
            if (this.f69455e == null) {
                this.f69455e = new AnimatedListAdapter();
                this.f69455e.f69409f = this.f69453c;
                View view = new View(this.f69457g);
                view.setLayoutParams(new LayoutParams((int) C9738o.m28708b(this.f69457g, 14.0f), -1));
                this.f69455e.mo61149c_(view);
                this.mListView.setAdapter(this.f69455e);
                this.f69455e.f69408e = this;
            }
            if (challenge != null) {
                this.mViewDiscoverBg.setVisibility(8);
                if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).havePGCShow() || !challenge.isPgcshow()) {
                    this.mIvType.setImageResource(R.drawable.ah_);
                    if (!TextUtils.isEmpty(category.getDesc())) {
                        this.mTvType.setText(category.getDesc());
                    } else {
                        this.mTvType.setVisibility(8);
                        ((ConstraintLayout.LayoutParams) this.mTvTitle.getLayoutParams()).topMargin = (int) C9738o.m28708b(this.f69457g, 20.0f);
                    }
                } else {
                    if (!(challenge.getAuthor() == null || challenge.getAuthor().getAvatarThumb() == null)) {
                        C23323e.m76524b(this.mIvType, challenge.getAuthor().getAvatarThumb());
                    }
                    this.mTvType.setText(this.f69457g.getString(R.string.cte));
                }
                this.mTvCount.setText(C30537o.m99738a(challenge.getDisplayCount()));
                this.mTvTitle.setText(challenge.getChallengeName());
                this.f69455e.f69411h = challenge.getCid();
                this.f69455e.f69410g = 2;
                if (this.f69453c.isAd()) {
                    this.f69455e.f69409f = category;
                }
            } else if (music != null) {
                this.mIvType.setImageResource(R.drawable.a6a);
                this.mViewDiscoverBg.setVisibility(8);
                this.mTvCount.setText(C30537o.m99738a((long) music.getUserCount()));
                this.mTvTitle.setText(music.getMusicName());
                if (!TextUtils.isEmpty(category.getDesc())) {
                    this.mTvType.setText(category.getDesc());
                } else {
                    this.mTvType.setVisibility(8);
                    ((ConstraintLayout.LayoutParams) this.mTvTitle.getLayoutParams()).topMargin = (int) C9738o.m28708b(this.f69457g, 20.0f);
                }
                this.f69455e.f69411h = String.valueOf(music.getId());
                this.f69455e.f69410g = 1;
            }
            this.f69455e.mo58045a(this.f69453c.getItems());
            try {
                this.f69452b.mo5417a(0, 0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo66587a(int i, Object obj, C1293v vVar, View view, int i2, int i3) {
        if (i2 == 0 && i3 != 0) {
            Category category = this.f69453c;
            if (category != null) {
                Challenge challenge = category.getChallenge();
                Music music = category.getMusic();
                if (challenge != null) {
                    C25242ao.m82975a(challenge.getSchema(), challenge.getCid());
                    C6907h.m21518a(this.mListView.getContext(), "show_challenge", "discovery", challenge.getCid(), 0);
                    new C33245aq().mo85124a("discovery").mo85125b(challenge.getCid()).mo85252e();
                    C6907h.m21524a("cell_show", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("tag_id", challenge.getCid()).mo59970a("client_order", m86772d()).f60753a);
                    if (this.f69453c.isAd()) {
                        C24976t.m82145b(this.f69457g, this.f69453c);
                    }
                } else if (music != null) {
                    C6907h.m21518a(this.mListView.getContext(), "show_music", "discovery", music.getMid(), 0);
                    C6907h.m21524a("cell_show", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("music_id", music.getMid()).mo59970a("client_order", m86772d()).f60753a);
                }
            }
        }
    }
}
