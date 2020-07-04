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
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.DiscoverWidgetAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23853a;
import com.p280ss.android.ugc.aweme.choosemusic.p1091e.C23877a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23880a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23880a.C23886a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33915a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicWithLyricTabFragment */
public class NewMusicWithLyricTabFragment extends NewMusicTabFragment {

    /* renamed from: A */
    private boolean f63185A = true;

    /* renamed from: B */
    private String f63186B = "popular_song";

    /* renamed from: C */
    private Music f63187C;

    /* renamed from: D */
    private boolean f63188D;

    /* renamed from: E */
    private boolean f63189E;

    /* renamed from: F */
    private boolean f63190F;

    /* renamed from: G */
    private boolean f63191G;
    FrameLayout mFrameLayout;
    TextView mTextView;
    ViewPager mVpFragmentContainer;

    /* renamed from: p */
    public MusicModel f63192p;

    /* renamed from: q */
    public LyricMusicListFragment f63193q;

    /* renamed from: r */
    protected C23853a f63194r;

    /* renamed from: s */
    private WidgetManager f63195s;

    /* renamed from: t */
    private int f63196t;

    /* renamed from: u */
    private String f63197u;

    /* renamed from: v */
    private String f63198v;

    /* renamed from: w */
    private String f63199w;

    /* renamed from: x */
    private boolean f63200x;

    /* renamed from: y */
    private int f63201y;

    /* renamed from: z */
    private int f63202z;

    /* renamed from: z */
    private void m78506z() {
        mo62074i();
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo62063a() {
        mo62071d();
    }

    /* renamed from: a */
    public final void mo61694a(float f, float f2) {
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
    }

    /* renamed from: f */
    public final MusicModel mo61999f() {
        return this.f63192p;
    }

    /* renamed from: p */
    public final int mo62079p() {
        return this.f63201y;
    }

    /* renamed from: r */
    public final boolean mo62081r() {
        return false;
    }

    /* renamed from: a */
    public final void mo62069a(boolean z) {
        this.f63188D = true;
    }

    /* renamed from: k */
    public final Activity mo62001k() {
        return getActivity();
    }

    /* renamed from: l */
    public final boolean mo62002l() {
        return isViewValid();
    }

    /* renamed from: t */
    private static boolean m78500t() {
        if (C33703a.m108720d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private FragmentPagerAdapter m78501u() {
        return new FragmentPagerAdapter(getChildFragmentManager()) {
            public final int getCount() {
                return 1;
            }

            /* renamed from: a */
            public final Fragment mo2423a(int i) {
                return NewMusicWithLyricTabFragment.this.f63193q;
            }
        };
    }

    /* renamed from: v */
    private FragmentPagerAdapter m78502v() {
        return new FragmentPagerAdapter(getChildFragmentManager()) {
            public final int getCount() {
                return 1;
            }

            /* renamed from: a */
            public final Fragment mo2423a(int i) {
                return NewMusicWithLyricTabFragment.this.f63193q;
            }
        };
    }

    /* renamed from: y */
    private void m78505y() {
        mo62073g();
        this.mFrameLayout.setVisibility(0);
    }

    /* renamed from: m */
    public final void mo62075m() {
        if (this.f63158m != null) {
            this.f63158m.mo61971a();
        }
        mo62077o();
    }

    /* renamed from: s */
    private static boolean m78499s() {
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
    private void m78503w() {
        Activity k = mo62001k();
        if (k instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) k).f62891c;
            if (viewPagerBottomSheetBehavior != null) {
                viewPagerBottomSheetBehavior.mo60680a(this.mVpFragmentContainer);
            }
        }
    }

    /* renamed from: x */
    private void m78504x() {
        LayoutParams layoutParams = (LayoutParams) this.mFrameLayout.getLayoutParams();
        if (C6399b.m19944t()) {
            layoutParams.topMargin = C23486n.m77122a(44.0d);
        } else {
            layoutParams.topMargin = 0;
        }
        this.mFrameLayout.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62071d() {
        mo62072e();
        if (this.f63197u != null) {
            this.f63194r.mo61940a(this.f63197u, false, this.f63198v, this.f63187C);
        } else {
            this.f63194r.mo61941a(false, this.f63198v, this.f63187C, false);
        }
    }

    /* renamed from: n */
    public final C1262a mo62076n() {
        if (this.f63196t == 0) {
            return this.f63193q.mo62003m();
        }
        throw new IllegalStateException("Just has one type of View.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo62077o() {
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

    /* renamed from: c */
    public final void mo61926c(int i) {
        this.f63202z = i;
    }

    /* renamed from: b */
    private FragmentPagerAdapter m78498b(boolean z) {
        if (z) {
            return m78501u();
        }
        return m78502v();
    }

    /* renamed from: a */
    public final void mo62064a(int i) {
        this.f63202z = 0;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.f63196t);
    }

    /* renamed from: a */
    public final void mo61920a(C34026a aVar) {
        this.f63158m.f88729i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62070b(int i) {
        if (i == 0) {
            this.mVpFragmentContainer.setCurrentItem(0);
        }
        this.f63196t = i;
        if (this.f63196t == 0) {
            this.f63202z = 0;
        }
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        char c;
        String str = aVar.f60948a;
        if (str.hashCode() == -2080369200 && str.equals("pick_status")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c == 0) {
            if (((Integer) aVar.mo60161a()).intValue() == 1) {
                m78506z();
                return;
            }
            m78505y();
        }
    }

    /* renamed from: b */
    public final void mo61923b(MusicModel musicModel) {
        this.f63158m.f88730j = this.f63186B;
        this.f63158m.mo86680b(musicModel, this.f63202z);
    }

    @C7709l(mo20401b = true)
    public void onMusicCollectEvent(C33769d dVar) {
        if (this.f63153h != null && dVar != null && "music_detail".equals(dVar.f88126c)) {
            C23820a aVar = new C23820a(0, dVar.f88124a, -1, -1, dVar.f88125b);
            this.f63153h.mo60134a("music_collect_status", (Object) aVar);
        }
    }

    /* renamed from: a */
    public final void mo61995a(C23822c cVar) {
        String str = cVar.f62885b;
        MusicModel musicModel = cVar.f62884a;
        if ("follow_type".equals(str)) {
            this.f63194r.mo61938a(musicModel, musicModel.getMusicId(), 1, cVar.f62886c, cVar.f62887d);
            return;
        }
        if ("unfollow_type".equals(str)) {
            this.f63194r.mo61938a(musicModel, musicModel.getMusicId(), 0, cVar.f62886c, cVar.f62887d);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("challenge")) {
            this.f63197u = arguments.getString("challenge");
        }
        Music music = null;
        this.f63198v = arguments.getString("first_sticker_music_ids", null);
        boolean z = false;
        this.f63200x = arguments.getBoolean("is_busi_sticker", false);
        this.f63199w = arguments.getString("first_sticker_id", null);
        if (arguments != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 0;
        }
        this.f63201y = i;
        if (arguments != null) {
            music = (Music) arguments.getSerializable("sticker_music");
        }
        this.f63187C = music;
        if (arguments != null && arguments.getBoolean("show_lyric_tip", false)) {
            z = true;
        }
        this.f63191G = z;
        this.f63189E = m78499s();
        this.f63190F = m78500t();
    }

    /* renamed from: a */
    public final void mo61921a(MusicModel musicModel) {
        mo62075m();
    }

    /* renamed from: a */
    public final void mo61922a(MusicModel musicModel, C23819a aVar) {
        this.f63192p = musicModel;
        if (this.f63185A) {
            this.f63158m.f63023c = aVar;
            if (aVar != null && aVar.f62877h) {
                this.f63153h.mo60134a("last_play_music_id", (Object) musicModel.getMusicId());
            }
            this.f63158m.mo61973a(musicModel, this.f63202z, false);
            return;
        }
        this.f63158m.mo86680b(musicModel, this.f63202z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.p_, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.mFrameLayout.setVisibility(4);
        TextView textView = this.mTextView;
        if (!this.f63191G) {
            i = 8;
        }
        textView.setVisibility(i);
        this.f63153h = DataCenter.m75849a(C0069x.m157a((Fragment) this), (C0043i) this);
        this.f63153h.mo60132a("pick_status", (C0053p<C23083a>) this).mo60132a("music_collect_status", (C0053p<C23083a>) this);
        this.f63153h.mo60134a("key_choose_music_type", (Object) Integer.valueOf(this.f63201y));
        this.f63153h.mo60134a("sticker_id", (Object) this.f63199w);
        this.f63153h.mo60134a("challenge_id", (Object) this.f63197u);
        this.f63153h.mo60134a("mvtheme_music_type", (Object) Boolean.valueOf(this.f63188D));
        this.f63153h.mo60134a("is_busi_sticker", (Object) Boolean.valueOf(this.f63200x));
        this.f63195s = WidgetManager.m75867a((Fragment) this, inflate);
        this.f63195s.mo60153a(this.f63153h);
        this.f63194r = new C23853a(getContext(), this.f63153h);
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.cp0);
        sb.append(":0");
        this.f63193q = (LyricMusicListFragment) childFragmentManager.mo2644a(sb.toString());
        if (this.f63193q == null) {
            this.f63193q = (LyricMusicListFragment) LyricMusicListFragment.m78367a(this.f63201y);
        }
        this.f63158m = new C23880a(this, new C23886a() {
            /* renamed from: a */
            public final void mo61983a() {
                if (NewMusicWithLyricTabFragment.this.f63192p != null) {
                    NewMusicWithLyricTabFragment.this.f63153h.mo60134a("play_compeleted", (Object) NewMusicWithLyricTabFragment.this.f63192p.getMusicId());
                }
            }

            /* renamed from: a */
            public final void mo61984a(int i, int i2) {
                if (NewMusicWithLyricTabFragment.this.f63192p != null) {
                    NewMusicWithLyricTabFragment.this.f63153h.mo60134a("play_error", (Object) NewMusicWithLyricTabFragment.this.f63192p.getMusicId());
                }
            }
        });
        this.f63158m.mo61975c();
        this.f63158m.mo86672a(this.f63201y);
        this.f63152f = new C23877a(getContext());
        boolean z = this.f63189E;
        this.mVpFragmentContainer.setOffscreenPageLimit(1);
        this.mVpFragmentContainer.setAdapter(m78498b(this.f63189E));
        m78504x();
        mo62070b(this.f63196t);
        mo62063a();
        m78503w();
        return inflate;
    }

    /* renamed from: a */
    public final void mo61996a(final String str, final MusicModel musicModel, String str2) {
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
}
