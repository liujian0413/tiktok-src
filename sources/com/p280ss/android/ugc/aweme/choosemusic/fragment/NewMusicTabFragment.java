package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23847e;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23853a;
import com.p280ss.android.ugc.aweme.choosemusic.p1091e.C23877a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23880a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23880a.C23886a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C25763a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33915a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment */
public class NewMusicTabFragment extends AmeBaseFragment implements C0053p<C23083a>, C23844b, C23847e, C25763a, C25766a, C33746f<C23822c>, C33951d {

    /* renamed from: g */
    public static final String f63147g;

    /* renamed from: A */
    private Music f63148A;

    /* renamed from: B */
    private boolean f63149B;

    /* renamed from: C */
    private boolean f63150C;

    /* renamed from: e */
    public C23933i f63151e;

    /* renamed from: f */
    protected C23877a f63152f;

    /* renamed from: h */
    protected DataCenter f63153h;

    /* renamed from: i */
    public MusicModel f63154i;

    /* renamed from: j */
    public DiscoverMusicFragment f63155j;

    /* renamed from: k */
    public CollectMusicFragment f63156k;

    /* renamed from: l */
    public LocalMusicTabFragment f63157l;

    /* renamed from: m */
    protected C23880a f63158m;
    DmtStatusView mDmtStatusView;
    ScrollableLayout mScrollableLayout;
    ViewPager mVpFragmentContainer;
    View mVwDivideLine;

    /* renamed from: n */
    protected C23853a f63159n;

    /* renamed from: o */
    public boolean f63160o;

    /* renamed from: p */
    private WidgetManager f63161p;

    /* renamed from: q */
    private int f63162q;

    /* renamed from: r */
    private MusicBannerWidget f63163r;

    /* renamed from: s */
    private String f63164s;

    /* renamed from: t */
    private String f63165t;
    DmtTabLayout tabLayout;

    /* renamed from: u */
    private String f63166u;

    /* renamed from: v */
    private boolean f63167v;

    /* renamed from: w */
    private int f63168w;

    /* renamed from: x */
    private int f63169x;

    /* renamed from: y */
    private boolean f63170y = true;

    /* renamed from: z */
    private String f63171z = "popular_song";

    /* renamed from: E */
    private void m78446E() {
        mo62074i();
    }

    /* renamed from: Y_ */
    public boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public void mo62063a() {
        mo62071d();
    }

    /* renamed from: a */
    public final void mo61994a(MusicModel musicModel, Exception exc) {
    }

    /* renamed from: f */
    public MusicModel mo61999f() {
        return this.f63154i;
    }

    /* renamed from: p */
    public int mo62079p() {
        return this.f63168w;
    }

    /* renamed from: r */
    public boolean mo62081r() {
        return false;
    }

    /* renamed from: a */
    public void mo62069a(boolean z) {
        this.f63149B = true;
    }

    /* renamed from: a */
    public void mo61922a(MusicModel musicModel, C23819a aVar) {
        this.f63154i = musicModel;
        if (this.f63170y) {
            this.f63158m.f63023c = aVar;
            if (aVar != null && aVar.f62877h) {
                this.f63153h.mo60134a("last_play_music_id", (Object) musicModel.getMusicId());
            }
            this.f63158m.mo61973a(musicModel, this.f63169x, false);
            return;
        }
        this.f63158m.mo86680b(musicModel, this.f63169x);
    }

    /* renamed from: a */
    public void mo61996a(final String str, final MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (!C42973bg.m136427a(str) || musicModel == null) {
            C10761a.m31399c((Context) activity, (int) R.string.ch7).mo25750a();
            C6893q.m21444a("aweme_music_download_error_rate", 3, C6869c.m21381a().mo16885a("downloadStrategy", Integer.valueOf(C33915a.m109326a())).mo16887a("musicPath", str).mo16887a("fileUri", musicModel.getPath()).mo16887a("hostname", C33784d.m108935c(musicModel.getPath())).mo16888b());
            return;
        }
        final int checkAudioFile = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str);
        if (checkAudioFile < 0) {
            C10761a.m31399c((Context) activity, (int) R.string.ch7).mo25750a();
            C1592h.m7853a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    C6893q.m21444a("aweme_music_download_error_rate", 4, C6869c.m21381a().mo16885a("downloadStrategy", Integer.valueOf(C33915a.m109326a())).mo16887a("musicPath", str).mo16887a("fileLength", String.valueOf(new File(str).length())).mo16887a("fileUri", musicModel.getPath()).mo16887a("hostname", C33784d.m108935c(musicModel.getPath())).mo16887a("fileMagic", C42973bg.m136432d(str)).mo16887a("code", String.valueOf(checkAudioFile)).mo16888b());
                    return null;
                }
            });
            return;
        }
        Intent intent = new Intent();
        if (musicModel.getMusicType() == MusicType.LOCAL) {
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
        } else {
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
        }
        if (mo62079p() == 0 || mo62079p() == 2) {
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        intent.putExtra("shoot_way", getArguments().getString("shoot_way"));
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
    }

    /* renamed from: k */
    public Activity mo62001k() {
        return getActivity();
    }

    /* renamed from: l */
    public boolean mo62002l() {
        return isViewValid();
    }

    /* renamed from: A */
    private boolean m78443A() {
        Fragment fragment = this.mParentFragment;
        if (fragment instanceof ChooseMusicFragment) {
            return ((ChooseMusicFragment) fragment).f63063f;
        }
        return false;
    }

    /* renamed from: B */
    private void m78444B() {
        mo62073g();
        m78445D();
        this.mScrollableLayout.setVisibility(0);
    }

    /* renamed from: t */
    private static boolean m78452t() {
        if (C33703a.m108720d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private FragmentPagerAdapter m78453u() {
        return new FragmentPagerAdapter(getChildFragmentManager()) {

            /* renamed from: b */
            private final int[] f63174b = {R.string.ard, R.string.chu, R.string.chw};

            /* renamed from: c */
            private final int[] f63175c = {R.string.ard, R.string.chu, R.string.chx};

            public final int getCount() {
                return 3;
            }

            /* renamed from: a */
            public final Fragment mo2423a(int i) {
                if (i == 0) {
                    return NewMusicTabFragment.this.f63155j;
                }
                if (i == 1) {
                    return NewMusicTabFragment.this.f63156k;
                }
                if (NewMusicTabFragment.this.f63157l != null) {
                    return NewMusicTabFragment.this.f63157l;
                }
                throw new IllegalStateException("LocalMusicFragment must not be null!");
            }

            public final CharSequence getPageTitle(int i) {
                if (NewMusicTabFragment.this.f63160o) {
                    return NewMusicTabFragment.this.getResources().getString(this.f63175c[i]);
                }
                return NewMusicTabFragment.this.getResources().getString(this.f63174b[i]);
            }
        };
    }

    /* renamed from: v */
    private FragmentPagerAdapter m78454v() {
        return new FragmentPagerAdapter(getChildFragmentManager()) {

            /* renamed from: b */
            private final int[] f63177b = {R.string.ard, R.string.chu};

            public final int getCount() {
                return 2;
            }

            /* renamed from: a */
            public final Fragment mo2423a(int i) {
                if (i == 0) {
                    return NewMusicTabFragment.this.f63155j;
                }
                return NewMusicTabFragment.this.f63156k;
            }

            public final CharSequence getPageTitle(int i) {
                return NewMusicTabFragment.this.getResources().getString(this.f63177b[i]);
            }
        };
    }

    /* renamed from: e */
    public final void mo62072e() {
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.mo25942f();
        }
    }

    /* renamed from: g */
    public final void mo62073g() {
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.mo25939d();
        }
    }

    /* renamed from: i */
    public final void mo62074i() {
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.mo25944h();
        }
    }

    /* renamed from: m */
    public void mo62075m() {
        if (this.f63158m != null) {
            this.f63158m.mo61971a();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f63158m != null) {
            this.f63158m.f88733m = false;
        }
    }

    static {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.ama);
        sb.append(":");
        f63147g = sb.toString();
    }

    /* renamed from: D */
    private void m78445D() {
        Fragment fragment = this.mParentFragment;
        if (fragment instanceof ChooseMusicFragment) {
            ChooseMusicFragment chooseMusicFragment = (ChooseMusicFragment) fragment;
            if (chooseMusicFragment.isViewValid()) {
                chooseMusicFragment.mo62012d();
            }
        }
    }

    /* renamed from: s */
    private static boolean m78451s() {
        boolean z;
        boolean z2 = false;
        try {
            z = C30199h.m98861a().getEnableLocalMusicEntrance().booleanValue();
        } catch (NullValueException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C33703a.m108720d() != 0) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: w */
    private void m78455w() {
        Activity k = mo62001k();
        if (k instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) k).f62891c;
            if (viewPagerBottomSheetBehavior != null) {
                viewPagerBottomSheetBehavior.mo60680a(this.mVpFragmentContainer);
            }
        }
    }

    /* renamed from: x */
    private void m78456x() {
        if (C6399b.m19944t()) {
            this.mScrollableLayout.setTabsMarginTop(C23486n.m77122a(44.0d));
        } else {
            this.mScrollableLayout.setTabsMarginTop(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo62071d() {
        mo62072e();
        if (this.f63164s != null) {
            this.f63159n.mo61940a(this.f63164s, false, this.f63165t, this.f63148A);
        } else {
            this.f63159n.mo61941a(false, this.f63165t, this.f63148A, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo62077o() {
        C1262a n = mo62076n();
        if (n != null) {
            if (n instanceof MusicAdapter) {
                ((MusicAdapter) n).al_();
                return;
            }
            if (n instanceof DiscoverWidgetAdapter) {
                ((DiscoverWidgetAdapter) n).ak_();
            }
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f63158m != null) {
            this.f63158m.mo61971a();
            this.f63158m.mo61976d();
        }
        if (this.f63152f != null) {
            this.f63152f.dismiss();
        }
    }

    /* renamed from: z */
    private void m78458z() {
        this.mDmtStatusView.setBuilder(C10803a.m31631a(getContext()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C23944t(this)).mo25965c(0));
    }

    /* renamed from: j */
    public final View mo61750j() {
        if (this.f63162q == 0) {
            return this.f63155j.mo61750j();
        }
        if (this.f63162q == 1) {
            return this.f63156k.mo61750j();
        }
        if (this.f63162q == 2) {
            return this.f63157l.mo61750j();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    /* renamed from: n */
    public C1262a mo62076n() {
        if (this.f63162q == 0) {
            return this.f63155j.f63093g;
        }
        if (this.f63162q == 1) {
            return this.f63156k.mo62003m();
        }
        if (this.f63162q == 2) {
            return this.f63157l.mo62003m();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    public void onPause() {
        super.onPause();
        if (this.f63158m != null) {
            this.f63158m.mo61971a();
            this.f63158m.f88733m = true;
        }
        this.f63153h.mo60134a("music_position", (Object) Integer.valueOf(-1));
        this.f63153h.mo60134a("music_index", (Object) Integer.valueOf(-1));
    }

    /* renamed from: q */
    public final void mo62080q() {
        if (this.mScrollableLayout != null && this.mScrollableLayout.getParent() != null) {
            int measuredHeight = ((View) this.mScrollableLayout.getParent()).getMeasuredHeight();
            this.f63155j.mo62032a((measuredHeight + this.mScrollableLayout.getCurScrollY()) - this.mScrollableLayout.getChildAt(0).getMeasuredHeight());
        }
    }

    /* renamed from: F */
    private void m78447F() {
        if (isViewValid()) {
            RecyclerView recyclerView = null;
            if (this.f63162q == 0) {
                recyclerView = (RecyclerView) this.f63155j.mo61750j();
            } else if (this.f63162q == 1) {
                recyclerView = (RecyclerView) this.f63156k.mo61750j();
            }
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                if (childCount == 0) {
                    this.mScrollableLayout.mo66866a();
                    this.mScrollableLayout.setMaxScrollHeight(0);
                    return;
                }
                View g = recyclerView.getLayoutManager().mo5788g(childCount - 1);
                int childCount2 = this.mScrollableLayout.getChildCount();
                if (childCount2 >= 2 && g != null) {
                    this.mScrollableLayout.setMaxScrollHeight(((recyclerView.getTop() + g.getBottom()) + this.mScrollableLayout.getChildAt(childCount2 - 1).getTop()) - ((View) this.mScrollableLayout.getParent()).getMeasuredHeight());
                }
            }
        }
    }

    /* renamed from: y */
    private void m78457y() {
        this.tabLayout.setCustomTabViewResId(R.layout.ze);
        this.tabLayout.setTabMode(0);
        this.tabLayout.setAutoFillWhenScrollable(true);
        this.tabLayout.setupWithViewPager(this.mVpFragmentContainer);
        LinearLayout linearLayout = (LinearLayout) this.tabLayout.getChildAt(0);
        linearLayout.setShowDividers(2);
        linearLayout.setDividerDrawable(C0683b.m2903a(getContext(), (int) R.drawable.cof));
        linearLayout.setDividerPadding(C23486n.m77122a(16.0d));
        this.tabLayout.setOnTabClickListener(new C23943s(this));
        if (C6399b.m19944t()) {
            this.tabLayout.setSelectedTabIndicatorHeight(C23486n.m77122a(2.0d));
        } else {
            this.tabLayout.setSelectedTabIndicatorHeight(0);
        }
        this.tabLayout.mo26058a((C10820c) new C10820c() {
            /* renamed from: b */
            public final void mo26116b(C10825f fVar) {
                int i = fVar.f29291e;
                if (i == 1 && NewMusicTabFragment.this.f63152f != null) {
                    NewMusicTabFragment.this.f63152f.dismiss();
                }
                C23888c.m78196b(i);
                NewMusicTabFragment.this.mo62077o();
                NewMusicTabFragment.this.mo62070b(i);
            }
        });
        this.tabLayout.mo26066b(this.f63162q).mo26137a();
    }

    /* renamed from: c */
    public void mo61926c(int i) {
        this.f63169x = i;
    }

    /* renamed from: b */
    private FragmentPagerAdapter m78449b(boolean z) {
        if (z) {
            return m78453u();
        }
        return m78454v();
    }

    /* renamed from: c */
    private void m78450c(MusicModel musicModel) {
        this.f63152f.mo61968a(this.tabLayout.mo26066b(1).f29294h, musicModel);
    }

    /* renamed from: a */
    public void mo62064a(int i) {
        this.f63169x = 0;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.f63162q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62065a(View view) {
        mo62071d();
    }

    /* renamed from: a */
    public void mo61995a(C23822c cVar) {
        String str = cVar.f62885b;
        MusicModel musicModel = cVar.f62884a;
        if ("follow_type".equals(str)) {
            this.f63159n.mo61938a(musicModel, musicModel.getMusicId(), 1, cVar.f62886c, cVar.f62887d);
            return;
        }
        if ("unfollow_type".equals(str)) {
            this.f63159n.mo61938a(musicModel, musicModel.getMusicId(), 0, cVar.f62886c, cVar.f62887d);
        }
    }

    /* renamed from: b */
    public void mo61923b(MusicModel musicModel) {
        this.f63158m.f88730j = this.f63171z;
        this.f63158m.mo86680b(musicModel, this.f63169x);
    }

    @C7709l(mo20401b = true)
    public void onMusicCollectEvent(C33769d dVar) {
        if (this.f63153h != null && dVar != null && "music_detail".equals(dVar.f88126c)) {
            C23820a aVar = new C23820a(0, dVar.f88124a, -1, -1, dVar.f88125b);
            this.f63153h.mo60134a("music_collect_status", (Object) aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62070b(int i) {
        if (i == 1) {
            this.f63159n.mo61948d(0, 20);
            this.mVpFragmentContainer.setCurrentItem(1);
            this.mScrollableLayout.getHelper().f68075b = this.f63156k;
        } else if (i == 0) {
            this.mVpFragmentContainer.setCurrentItem(0);
            this.mScrollableLayout.getHelper().f68075b = this.f63155j;
        } else if (i == 2) {
            this.mVpFragmentContainer.setCurrentItem(2);
            this.mScrollableLayout.getHelper().f68075b = this.f63157l;
        }
        this.f63162q = i;
        switch (this.f63162q) {
            case 0:
                this.f63169x = 0;
                return;
            case 1:
                this.f63169x = 1;
                return;
            case 2:
                this.f63169x = 6;
                break;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (getArguments() != null && arguments.containsKey("challenge")) {
            this.f63164s = arguments.getString("challenge");
        }
        Music music = null;
        this.f63165t = arguments.getString("first_sticker_music_ids", null);
        int i = 0;
        this.f63167v = arguments.getBoolean("is_busi_sticker", false);
        this.f63166u = arguments.getString("first_sticker_id", null);
        if (arguments != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        }
        this.f63168w = i;
        if (arguments != null) {
            music = (Music) arguments.getSerializable("sticker_music");
        }
        this.f63148A = music;
        this.f63150C = m78451s();
        this.f63160o = m78452t();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62066a(C10825f fVar) {
        Bundle bundle;
        if (fVar.f29291e == 1) {
            String string = getString(R.string.b4m);
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                String str = "";
                String str2 = "click_my_music";
                if (C30538p.m99745a()) {
                    bundle = null;
                } else {
                    bundle = C42914ab.m136242a().mo104633a("login_title", string).f111445a;
                }
                C32656f.m105747a((Fragment) this, str, str2, bundle);
                return;
            }
        }
        fVar.mo26137a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.f60948a
            int r1 = r0.hashCode()
            r2 = -2080369200(0xffffffff840015d0, float:-1.5056343E-36)
            r3 = 1
            if (r1 == r2) goto L_0x003a
            r2 = -1833731743(0xffffffff92b37961, float:-1.132641E-27)
            if (r1 == r2) goto L_0x0030
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            if (r1 == r2) goto L_0x0026
            r2 = -1322093457(0xffffffffb132746f, float:-2.5968594E-9)
            if (r1 == r2) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            java.lang.String r1 = "play_compeleted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
            r0 = 3
            goto L_0x0045
        L_0x0026:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
            r0 = 2
            goto L_0x0045
        L_0x0030:
            java.lang.String r1 = "data_banner"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x003a:
            java.lang.String r1 = "pick_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = -1
        L_0x0045:
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x007c;
                case 2: goto L_0x005b;
                case 3: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x009d
        L_0x0049:
            android.support.v7.widget.RecyclerView$a r5 = r4.mo62076n()
            boolean r5 = r5 instanceof com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter
            if (r5 == 0) goto L_0x009d
            android.support.v7.widget.RecyclerView$a r5 = r4.mo62076n()
            com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter r5 = (com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter) r5
            r5.al_()
            goto L_0x009d
        L_0x005b:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x009d
            boolean r0 = r4.m78443A()
            if (r0 == 0) goto L_0x0068
            return
        L_0x0068:
            java.lang.Object r5 = r5.mo60161a()
            com.ss.android.ugc.aweme.choosemusic.a.a r5 = (com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a) r5
            int r0 = r5.f62881d
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r5.f62882e
            int r5 = r5.f62878a
            if (r0 != r3) goto L_0x007b
            if (r5 != 0) goto L_0x007b
            r4.m78450c(r1)
        L_0x007b:
            return
        L_0x007c:
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r5 = r4.mScrollableLayout
            com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment$5 r0 = new com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment$5
            r0.<init>()
            r1 = 100
            r5.postDelayed(r0, r1)
            return
        L_0x0089:
            java.lang.Object r5 = r5.mo60161a()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x0099
            r4.m78446E()
            return
        L_0x0099:
            r4.m78444B()
            return
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* renamed from: a */
    public void mo61920a(C34026a aVar) {
        this.f63158m.f88729i = aVar;
    }

    /* renamed from: a */
    public void mo61921a(MusicModel musicModel) {
        mo62075m();
    }

    /* renamed from: a */
    public void mo61694a(float f, float f2) {
        m78447F();
    }

    /* renamed from: b */
    public void mo61702b(int i, int i2) {
        if (this.f63151e != null) {
            if (i != 0) {
                this.f63151e.mo62104b();
            } else {
                this.f63151e.mo62103a();
            }
        }
        mo62080q();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.p9, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.mScrollableLayout.setVisibility(4);
        this.mScrollableLayout.setOnScrollListener(this);
        m78458z();
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("KEY_CURRENT_TAB", 0);
        }
        this.f63162q = i;
        this.f63153h = DataCenter.m75849a(C0069x.m157a((Fragment) this), (C0043i) this);
        this.f63153h.mo60132a("pick_status", (C0053p<C23083a>) this).mo60132a("data_banner", (C0053p<C23083a>) this).mo60132a("play_compeleted", (C0053p<C23083a>) this).mo60132a("music_collect_status", (C0053p<C23083a>) this);
        this.f63153h.mo60134a("key_choose_music_type", (Object) Integer.valueOf(this.f63168w));
        this.f63153h.mo60134a("sticker_id", (Object) this.f63166u);
        this.f63153h.mo60134a("challenge_id", (Object) this.f63164s);
        this.f63153h.mo60134a("mvtheme_music_type", (Object) Boolean.valueOf(this.f63149B));
        this.f63153h.mo60134a("is_busi_sticker", (Object) Boolean.valueOf(this.f63167v));
        this.f63161p = WidgetManager.m75867a((Fragment) this, inflate);
        this.f63161p.mo60153a(this.f63153h);
        this.f63163r = new MusicBannerWidget();
        this.f63159n = new C23853a(getContext(), this.f63153h);
        this.f63161p.mo60157b(R.id.br6, this.f63163r);
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f63147g);
        sb.append(0);
        this.f63155j = (DiscoverMusicFragment) childFragmentManager.mo2644a(sb.toString());
        if (this.f63155j == null) {
            this.f63155j = DiscoverMusicFragment.m78306a(this.f63168w, this.f63164s);
        }
        this.f63155j.f63091e = this.f63153h;
        this.f63155j.f63092f = this.f63161p;
        this.f63155j.f63095i = this.f63159n;
        this.f63155j.mo62034a((C23844b) this);
        this.f63155j.mo62035a((C23847e) this);
        this.f63155j.mo62036a((C33746f<C23822c>) this);
        C0608j childFragmentManager2 = getChildFragmentManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f63147g);
        sb2.append(1);
        this.f63156k = (CollectMusicFragment) childFragmentManager2.mo2644a(sb2.toString());
        if (this.f63156k == null) {
            this.f63156k = CollectMusicFragment.m78281a(this.f63168w, this.f63164s);
        }
        this.f63156k.f63050i = this.f63153h;
        this.f63156k.f63088l = this;
        if (this.f63150C) {
            this.f63157l = LocalMusicTabFragment.m78346a(this.f63168w);
        }
        this.f63158m = new C23880a(this, new C23886a() {
            /* renamed from: a */
            public final void mo61983a() {
                if (NewMusicTabFragment.this.f63154i != null) {
                    NewMusicTabFragment.this.f63153h.mo60134a("play_compeleted", (Object) NewMusicTabFragment.this.f63154i.getMusicId());
                }
            }

            /* renamed from: a */
            public final void mo61984a(int i, int i2) {
                if (NewMusicTabFragment.this.f63154i != null) {
                    NewMusicTabFragment.this.f63153h.mo60134a("play_error", (Object) NewMusicTabFragment.this.f63154i.getMusicId());
                }
            }
        });
        this.f63158m.mo61975c();
        this.f63158m.mo86672a(this.f63168w);
        this.f63152f = new C23877a(getContext());
        if (this.f63150C) {
            this.mVpFragmentContainer.setOffscreenPageLimit(3);
        } else {
            this.mVpFragmentContainer.setOffscreenPageLimit(2);
        }
        this.mVpFragmentContainer.setAdapter(m78449b(this.f63150C));
        m78457y();
        m78456x();
        mo62070b(this.f63162q);
        mo62063a();
        m78455w();
        return inflate;
    }

    /* renamed from: a */
    public static NewMusicTabFragment m78448a(int i, String str, Music music, String str2, String str3, boolean z, boolean z2, boolean z3) {
        NewMusicTabFragment newMusicTabFragment;
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("challenge", str);
        }
        if (music != null) {
            bundle.putSerializable("sticker_music", music);
        }
        if (str2 != null) {
            bundle.putString("first_sticker_music_ids", str2);
        }
        if (str3 != null) {
            bundle.putString("first_sticker_id", str3);
        }
        bundle.putBoolean("is_busi_sticker", z);
        bundle.putBoolean("show_lyric_tip", z3);
        if (z2) {
            newMusicTabFragment = new NewMusicWithLyricTabFragment();
        } else {
            newMusicTabFragment = new NewMusicTabFragment();
        }
        newMusicTabFragment.setArguments(bundle);
        return newMusicTabFragment;
    }
}
