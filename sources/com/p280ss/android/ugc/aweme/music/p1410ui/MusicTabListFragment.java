package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.p1385g.C33020g;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.music.adapter.C33743c;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33750a;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33752c;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33753d;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33754e;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33755f;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33756g;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33760k;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicCategory;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33766a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33768c;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1408b.C33770e;
import com.p280ss.android.ugc.aweme.music.p1408b.C33773h;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicListFragment.C33867a;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicListFragment.C33868b;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33915a;
import com.p280ss.android.ugc.aweme.music.presenter.C33802d;
import com.p280ss.android.ugc.aweme.music.presenter.C33815m;
import com.p280ss.android.ugc.aweme.music.presenter.C33817n;
import com.p280ss.android.ugc.aweme.music.presenter.C33824q;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabListFragment */
public class MusicTabListFragment extends MusicListFragment implements C25675c<Music>, C33743c, C33802d, C33868b {

    /* renamed from: A */
    private static final String f88409A = "com.ss.android.ugc.aweme.music.ui.MusicTabListFragment";

    /* renamed from: B */
    private C25674b<C33824q> f88410B;

    /* renamed from: C */
    private C25674b<C33815m> f88411C;

    /* renamed from: D */
    private boolean f88412D;

    /* renamed from: E */
    private boolean f88413E;

    /* renamed from: F */
    private C33817n f88414F;

    /* renamed from: G */
    private int f88415G;

    /* renamed from: H */
    private MusicTabView f88416H;

    /* renamed from: J */
    private List<Music> f88417J = new ArrayList();

    /* renamed from: K */
    private List<C33757h> f88418K = new ArrayList();

    /* renamed from: L */
    private List<C33757h> f88419L = new ArrayList();

    /* renamed from: M */
    private List<C33757h> f88420M = new ArrayList();

    /* renamed from: N */
    private GridLayoutManager f88421N;

    /* renamed from: n */
    public int f88422n;

    /* renamed from: o */
    public String f88423o;

    /* renamed from: p */
    public List<C33757h> f88424p = new ArrayList();

    /* renamed from: q */
    public List<MusicModel> f88425q = new ArrayList();

    /* renamed from: r */
    public boolean f88426r = false;

    /* renamed from: s */
    public Map<String, List<C33757h>> f88427s = new LinkedHashMap();

    /* renamed from: t */
    public boolean f88428t = false;

    /* renamed from: u */
    int f88429u = -1;

    /* renamed from: v */
    public int f88430v = -1;

    /* renamed from: w */
    boolean f88431w = false;

    /* renamed from: x */
    public Music f88432x;

    /* renamed from: y */
    C1592h<Challenge> f88433y;

    /* renamed from: z */
    C1592h<Music> f88434z;

    /* renamed from: S_ */
    public final void mo59098S_() {
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<Music> list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo86515e() {
        return R.layout.r7;
    }

    /* renamed from: a */
    public final void mo62046a(MusicCollectionItem musicCollectionItem) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, MusicListActivity.class);
            intent.putExtra("mc_id", musicCollectionItem.mcId);
            intent.putExtra("title_name", musicCollectionItem.mcName);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.f88415G);
            intent.putExtra("translation_type", 3);
            C42961az.m136381b(new C33768c("song_category"));
            startActivityForResult(intent, 1);
            C23888c.m78193a(musicCollectionItem.mcName, "click_category_list", "", "change_music_page", musicCollectionItem.mcId);
        }
    }

    /* renamed from: a */
    public final void mo86418a(List<MusicCollectionItem> list) {
        if (isViewValid()) {
            MusicMixAdapter musicMixAdapter = this.f88366g;
            if (musicMixAdapter != null) {
                this.f88420M.clear();
                if (!C6307b.m19566a((Collection<T>) list)) {
                    this.f88420M.addAll(list);
                }
                this.f88427s.put("collection", this.f88420M);
                boolean z = list == null || list.size() <= 8;
                if (!C6307b.m19566a((Collection<T>) list)) {
                    musicMixAdapter.mo86134a(list, z);
                }
                C1592h w = m109226w();
                if (w.mo6882b() && !w.mo6889d()) {
                    Challenge challenge = null;
                    if (w.mo6890e() != null) {
                        challenge = (Challenge) w.mo6890e();
                    }
                    mo86542a(challenge);
                }
                m109213B();
            }
        }
    }

    /* renamed from: a */
    public final void mo62086a(MusicListFragment musicListFragment, final String str, final MusicModel musicModel, String str2) {
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
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (!TextUtils.isEmpty(this.f88423o)) {
            C1592h w = m109226w();
            if (w.mo6882b() && !w.mo6889d()) {
                Challenge challenge = null;
                if (w.mo6890e() != null) {
                    challenge = (Challenge) w.mo6890e();
                }
                if (challenge != null) {
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(challenge);
                }
            }
        }
        if (mo86519n() == 0 || mo86519n() == 2) {
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        String string = getArguments().getString("shoot_way");
        if (string == null) {
            string = m109229z() ? "popular_song" : "collection_music";
        }
        if (this.f88422n != 2) {
            C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("shoot_way", string).mo59973a("music_id", musicModel.getMusicId()).mo59973a("group_id", C33242an.m107316b()).f60753a);
        }
        intent.putExtra("shoot_way", string);
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
    }

    /* renamed from: a */
    public final boolean mo86543a(int i) {
        int i2 = this.f88366g.f88003k;
        return i2 != -1 && i >= i2;
    }

    /* renamed from: z */
    private boolean m109229z() {
        if (this.f88422n == 0) {
            return true;
        }
        return false;
    }

    public void onStop() {
        super.onStop();
        m109216F();
    }

    /* renamed from: t */
    public final void mo86552t() {
        this.f88416H.mo86558a();
        this.f88428t = true;
    }

    /* renamed from: u */
    public final void mo86553u() {
        this.f88416H.mo86560b();
        this.f88428t = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final /* synthetic */ Music mo86554v() throws Exception {
        return MusicApi.m108887a(this.f88432x.getMid(), 0).music;
    }

    /* renamed from: G */
    private static boolean m109217G() {
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
    private C1592h<Challenge> m109226w() {
        if (this.f88433y == null) {
            if (this.f88423o != null) {
                this.f88433y = C1592h.m7853a((Callable<TResult>) new Callable<Challenge>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Challenge call() throws Exception {
                        return ((C33020g) ServiceManager.get().getService(C33020g.class)).mo60013a(MusicTabListFragment.this.f88423o, 0, false);
                    }
                });
            } else {
                this.f88433y = C1592h.m7851a(null);
            }
        }
        return this.f88433y;
    }

    /* renamed from: y */
    private C33817n m109228y() {
        if (this.f88414F == null) {
            this.f88414F = new C33817n();
            this.f88414F.mo66537a(this);
        }
        return this.f88414F;
    }

    public final void aD_() {
        if (isViewValid() && this.f88366g != null) {
            this.f88366g.ag_();
        }
    }

    /* renamed from: o */
    public final C25674b<C33815m> mo86545o() {
        if (this.f88411C == null) {
            this.f88411C = new C25674b<>();
            this.f88411C.mo66537a(this);
            this.f88411C.mo66536a(new C33815m());
        }
        return this.f88411C;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f88414F != null) {
            this.f88414F.mo59134U_();
        }
        if (this.f88411C != null) {
            this.f88411C.mo59134U_();
        }
        if (this.f88410B != null) {
            this.f88410B.mo59134U_();
        }
    }

    /* renamed from: p */
    public final C25674b<C33824q> mo86548p() {
        if (this.f88410B == null) {
            this.f88410B = new C25674b<>();
            this.f88410B.mo66537a(this);
            this.f88410B.mo66536a(new C33824q());
        }
        return this.f88410B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final void mo86549q() {
        m109212A();
        C1592h.m7853a((Callable<TResult>) new Callable<List<MusicModel>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<MusicModel> call() throws Exception {
                ArrayList arrayList = new ArrayList();
                C33784d.m108923a((Context) MusicTabListFragment.this.getActivity(), (List<MusicModel>) arrayList);
                return arrayList;
            }
        }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<List<MusicModel>, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<List<MusicModel>> hVar) throws Exception {
                MusicTabListFragment.this.f88426r = true;
                if (MusicTabListFragment.this.getActivity() == null) {
                    MusicTabListFragment.this.mo86551s();
                    return null;
                } else if (hVar.mo6889d()) {
                    MusicTabListFragment.this.mo86551s();
                    return null;
                } else {
                    if (!hVar.mo6882b()) {
                        MusicTabListFragment.this.mo86551s();
                    } else if (MusicTabListFragment.this.f88422n != 2) {
                        return null;
                    } else {
                        MusicTabListFragment.this.f88425q = (List) hVar.mo6890e();
                        MusicTabListFragment.this.mo86550r();
                    }
                    return null;
                }
            }
        }, C1592h.f5958b);
    }

    /* renamed from: A */
    private void m109212A() {
        this.f88424p.clear();
        this.f88424p.add(new C33755f());
        this.f88424p.add(new C33760k());
        this.f88424p.add(new C33752c());
        this.f88427s.put("tab_data", this.f88424p);
        mo86513a(this.f88427s, 6);
    }

    /* renamed from: B */
    private void m109213B() {
        mo86517j();
        m109214D();
        if (!this.f88412D) {
            mo86548p().mo56976a(Integer.valueOf(1));
            return;
        }
        m109225d(((C33824q) this.f88410B.mo66539h()).getItems(), ((C33824q) this.f88410B.mo66539h()).isHasMore());
    }

    /* renamed from: D */
    private void m109214D() {
        for (Music music : this.f88417J) {
            if (((C33815m) mo86545o().mo66539h()).getItems().contains(music) && music.getCollectStatus() != 1) {
                mo86545o().mo66569a((Object) music);
            }
        }
    }

    /* renamed from: E */
    private void m109215E() {
        mo86517j();
        if (!C30538p.m99745a() || ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
            m109212A();
            mo86545o().mo56976a(Integer.valueOf(1));
            return;
        }
        ae_();
    }

    /* renamed from: F */
    private void m109216F() {
        MusicModel f = mo61999f();
        if (this.f88366g != null) {
            for (int i = 0; i < this.mListView.getChildCount(); i++) {
                C1293v b = this.mListView.mo5539b(this.mListView.getChildAt(i));
                if (b instanceof MusicUnitViewHolder) {
                    ((MusicUnitViewHolder) b).mo86148a(f);
                }
            }
        }
    }

    /* renamed from: x */
    private C1592h<Music> m109227x() {
        if (this.f88434z == null) {
            if (this.f88432x != null) {
                if (TextUtils.isEmpty(this.f88432x.getMid())) {
                    C33784d.m108933b();
                }
                this.f88434z = C1592h.m7853a((Callable<TResult>) new C33935ak<TResult>(this));
            } else {
                this.f88434z = C1592h.m7851a(null);
            }
        }
        return this.f88434z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo86518m() {
        boolean z;
        if (this.f88422n == 0) {
            z = ((C33824q) mo86548p().mo66539h()).isHasMore();
        } else if (this.f88422n == 1) {
            z = ((C33815m) mo86545o().mo66539h()).isHasMore();
        } else {
            z = false;
        }
        if (z) {
            super.mo86518m();
        }
    }

    /* renamed from: s */
    public final void mo86551s() {
        this.f88424p.clear();
        this.f88424p.add(new C33755f());
        this.f88424p.add(new C33760k());
        this.f88424p.add(new C33752c());
        this.f88427s.put("tab_data", this.f88424p);
        mo86513a(this.f88427s, 6);
    }

    public final void ae_() {
        m109222a(true);
        MusicMixAdapter musicMixAdapter = this.f88366g;
        m109225d(new ArrayList(), false);
        if (musicMixAdapter != null) {
            if (this.f88422n != 1) {
                musicMixAdapter.mo66506d(R.string.am0);
                musicMixAdapter.ah_();
            } else if (C6399b.m19944t()) {
                this.f88418K.clear();
                this.f88418K.add(new C33756g());
                this.f88427s.put("favorite_empty_data", this.f88418K);
                mo86513a(this.f88427s, 1);
                musicMixAdapter.mo66506d(R.string.dvr);
            } else {
                musicMixAdapter.mo66506d(R.string.cm1);
                musicMixAdapter.ah_();
            }
        }
    }

    /* renamed from: r */
    public final void mo86550r() {
        this.f88424p.clear();
        MusicMixAdapter musicMixAdapter = this.f88366g;
        this.f88424p.add(new C33755f());
        if (C6307b.m19566a((Collection<T>) this.f88425q)) {
            this.f88424p.add(new C33760k());
            this.f88424p.add(new C33753d());
            musicMixAdapter.ai_();
        } else {
            this.f88424p.add(new C33760k());
            this.f88424p.add(new C33754e());
            this.f88424p.addAll(this.f88425q);
            if (musicMixAdapter != null) {
                musicMixAdapter.mo66506d(R.string.am0);
            }
        }
        this.f88427s.put("tab_data", this.f88424p);
        mo86513a(this.f88427s, 6);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f88368i = this;
    }

    /* renamed from: a */
    private void m109222a(boolean z) {
        if (this.f88422n == 0) {
            this.f88412D = z;
            return;
        }
        if (this.f88422n == 1) {
            this.f88413E = z;
        }
    }

    /* renamed from: b */
    private void m109223b(int i) {
        if (i != -1) {
            this.f88421N.mo5417a(i, 0);
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        m109222a(false);
        if (this.f88422n == 1 && this.mStatusView != null) {
            this.mListView.setVisibility(4);
            this.mStatusView.mo25944h();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid() && this.f88366g != null) {
            this.f88366g.mo66507h();
        }
    }

    /* renamed from: d */
    public final void mo86419d(Exception exc) {
        if (getContext() != null) {
            C10761a.m31399c(getContext(), (int) R.string.dxt).mo25750a();
        }
    }

    @C7709l
    public void onCheckLoginStateEvent(C33766a aVar) {
        Bundle bundle;
        if (aVar != null && aVar.f88121a) {
            String string = getString(R.string.b4m);
            String str = "";
            String str2 = "click_my_music";
            if (C30538p.m99745a()) {
                bundle = null;
            } else {
                bundle = C42914ab.m136242a().mo104633a("login_title", string).f111445a;
            }
            C32656f.m105747a((Fragment) this, str, str2, bundle);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        Music music;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("challenge")) {
            this.f88423o = arguments.getString("challenge");
        }
        if (arguments != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 0;
        }
        this.f88415G = i;
        if (arguments != null) {
            music = (Music) arguments.getSerializable("sticker_music");
        } else {
            music = null;
        }
        this.f88432x = music;
    }

    /* renamed from: b */
    public final void mo86544b(List<Music> list) {
        if (!C6311g.m19573a(list)) {
            MusicMixAdapter musicMixAdapter = this.f88366g;
            this.f88419L.clear();
            if (musicMixAdapter != null) {
                for (Music music : list) {
                    if (music != null) {
                        MusicModel convertToMusicModel = music.convertToMusicModel();
                        convertToMusicModel.setChallengeUserCount(music.getUserCount());
                        convertToMusicModel.setChallengeMusic(true);
                        convertToMusicModel.setDataType(0);
                        this.f88419L.add(convertToMusicModel);
                    }
                }
            }
        }
    }

    @C7709l
    public void onMusicCollectEvent(C33769d dVar) {
        if (isViewValid()) {
            MusicModel musicModel = dVar.f88125b;
            if (musicModel != null) {
                Music music = musicModel.getMusic();
                if (music != null) {
                    int i = dVar.f88124a;
                    music.setCollectStatus(i);
                    if (m109226w().mo6882b() && !m109226w().mo6889d()) {
                        Challenge challenge = null;
                        if (m109226w().mo6890e() != null) {
                            challenge = (Challenge) m109226w().mo6890e();
                        }
                        m109219a(challenge, music, i);
                    }
                    m109221a(music, i);
                    m109224b(music, i);
                }
            }
        }
    }

    /* renamed from: a */
    private void m109220a(MusicMixAdapter musicMixAdapter) {
        if (this.f88428t && this.f88431w) {
            int i = -1;
            if (this.f88422n == 1) {
                i = musicMixAdapter.f88003k;
            } else if (this.f88422n == 0) {
                i = Math.max(musicMixAdapter.f88003k, this.f88429u);
            } else if (this.f88422n == 2) {
                i = Math.max(musicMixAdapter.f88003k, this.f88430v);
            }
            m109223b(i);
        }
        this.f88431w = false;
    }

    @C7709l
    public void onSwitchMusicFragmentEvent(C33773h hVar) {
        this.f88427s.put("favorite_empty_data", new ArrayList());
        this.f88422n = hVar.f88131a;
        this.f88416H.mo86561b(this.f88422n);
        this.f88431w = true;
        this.f88366g.ai_();
        if (this.f88366g != null) {
            this.f88366g.mo86137f();
        }
        if (this.f88371l != null) {
            this.f88371l.mo62183a();
        }
        if (hVar.f88131a == 0) {
            this.f88364e = new MusicCategory("music_library_hot");
            mo86548p().mo66537a(this);
            mo86545o().mo66537a(null);
            m109213B();
        } else if (hVar.f88131a == 1) {
            this.f88364e = new MusicCategory("favourite_song");
            mo86548p().mo66537a(null);
            mo86545o().mo66537a(this);
            m109215E();
        } else {
            if (hVar.f88131a == 2) {
                this.f88364e = new MusicCategory("local_music");
                mo86548p().mo66537a(null);
                mo86545o().mo66537a(null);
                if (this.f88426r) {
                    mo86550r();
                } else if (C0683b.m2909b((Context) getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    mo86549q();
                } else {
                    C22477b.m74364a(getActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
                        /* renamed from: a */
                        public final void mo53549a(String[] strArr, int[] iArr) {
                            if (iArr[0] == 0) {
                                MusicTabListFragment.this.mo86549q();
                                return;
                            }
                            MusicMixAdapter musicMixAdapter = MusicTabListFragment.this.f88366g;
                            MusicTabListFragment.this.f88424p.clear();
                            MusicTabListFragment.this.f88424p.add(new C33755f());
                            MusicTabListFragment.this.f88424p.add(new C33760k());
                            MusicTabListFragment.this.f88424p.add(new C33753d());
                            musicMixAdapter.ai_();
                            MusicTabListFragment.this.f88427s.put("tab_data", MusicTabListFragment.this.f88424p);
                            MusicTabListFragment.this.mo86513a(MusicTabListFragment.this.f88427s, 6);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo86542a(Challenge challenge) {
        if (challenge != null) {
            MusicMixAdapter musicMixAdapter = this.f88366g;
            this.f88419L.clear();
            this.f88419L.add(new C33750a());
            if (musicMixAdapter != null) {
                musicMixAdapter.f87995c = challenge;
                if (!(challenge.getConnectMusics() == null || challenge.getConnectMusics().size() == 0)) {
                    for (Music music : challenge.getConnectMusics()) {
                        MusicModel convertToMusicModel = music.convertToMusicModel();
                        convertToMusicModel.setChallengeUserCount(music.getUserCount());
                        convertToMusicModel.setChallengeMusic(true);
                        convertToMusicModel.setDataType(0);
                        this.f88419L.add(convertToMusicModel);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61995a(C33770e eVar) {
        String str;
        String str2;
        String str3;
        super.mo61995a(eVar);
        MusicModel musicModel = eVar.f88127a;
        String str4 = eVar.f88128b;
        switch (this.f88422n) {
            case 0:
                str = "songchart";
                break;
            case 1:
                str = "favorite_song";
                break;
            case 2:
                str = "save_local";
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            if ("follow_type".equals(str4)) {
                String str5 = "favourite_song";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", str);
                String str6 = "music_id";
                if (musicModel != null) {
                    str3 = musicModel.getMusicId();
                } else {
                    str3 = "";
                }
                C6907h.m21524a(str5, (Map) a.mo59973a(str6, str3).f60753a);
            } else if ("unfollow_type".equals(str4)) {
                String str7 = "cancel_favourite_song";
                C22984d a2 = C22984d.m75611a().mo59973a("enter_from", str);
                String str8 = "music_id";
                if (musicModel != null) {
                    str2 = musicModel.getMusicId();
                } else {
                    str2 = "";
                }
                C6907h.m21524a(str7, (Map) a2.mo59973a(str8, str2).f60753a);
            }
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Music> list, boolean z) {
        m109222a(true);
        if (isViewValid()) {
            m109225d(list, z);
        }
    }

    /* renamed from: b */
    private void m109224b(Music music, int i) {
        List items = ((C33824q) mo86548p().mo66539h()).getItems();
        Music a = C33784d.m108919a(items, music.getMid());
        int indexOf = items.indexOf(music);
        int a2 = this.f88366g.mo86130a();
        if (a != null) {
            a.setCollectStatus(i);
            if (m109229z()) {
                this.f88366g.notifyItemChanged(a2 + indexOf);
            }
        }
    }

    /* renamed from: d */
    private void m109225d(List<Music> list, boolean z) {
        this.f88424p.clear();
        this.f88424p.add(new C33755f());
        this.f88424p.add(new C33760k());
        if (m109229z()) {
            this.f88424p.addAll(this.f88419L);
        }
        this.f88424p = C33784d.m108924a(list, this.f88424p);
        this.f88427s.put("tab_data", this.f88424p);
        mo86512a(list, m109229z() ^ true ? 1 : 0);
        MusicMixAdapter musicMixAdapter = this.f88366g;
        if (C6399b.m19944t()) {
            musicMixAdapter.f67550q = getResources().getColor(R.color.l0);
        }
        if (musicMixAdapter != null) {
            mo86513a(this.f88427s, m109229z() ^ true ? 1 : 0);
            if (!z) {
                musicMixAdapter.ah_();
                musicMixAdapter.mo66506d(R.string.am0);
            } else {
                musicMixAdapter.ai_();
            }
            m109220a(musicMixAdapter);
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<Music> list, boolean z) {
        if (isViewValid()) {
            m109225d(list, z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m109228y().mo56976a(new Object[0]);
        this.f88421N = new WrapGridLayoutManager(getContext(), 4);
        this.mListView.setLayoutManager(this.f88421N);
        this.f88421N.f4721g = new C1241a() {
            /* renamed from: a */
            public final int mo5386a(int i) {
                return MusicTabListFragment.this.f88366g.mo86136b(i);
            }
        };
        this.f88416H = new MusicTabView(view.findViewById(R.id.bka), m109217G());
        this.f88416H.mo86561b(0);
        this.mListView.mo5528a((C1281m) new C1281m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                int f = RecyclerView.m5892f(recyclerView.getChildAt(0));
                if (MusicTabListFragment.this.f88428t) {
                    if (MusicTabListFragment.this.f88422n == 0) {
                        MusicTabListFragment.this.f88429u = f;
                    } else if (MusicTabListFragment.this.f88422n == 2) {
                        MusicTabListFragment.this.f88430v = f;
                    }
                }
            }
        });
        this.mListView.mo5525a((C1272h) new C1272h() {
            public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
                super.onDrawOver(canvas, recyclerView, sVar);
                int f = RecyclerView.m5892f(recyclerView.getChildAt(0));
                if (f != -1) {
                    if (MusicTabListFragment.this.mo86543a(f)) {
                        MusicTabListFragment.this.mo86552t();
                    } else {
                        MusicTabListFragment.this.mo86553u();
                    }
                }
            }
        });
        this.f88427s.put("collection", new ArrayList());
        this.f88427s.put("showless_data", new ArrayList());
        this.f88427s.put("tab_data", new ArrayList());
        this.f88427s.put("favorite_empty_data", new ArrayList());
        this.f88372m = new C33867a() {
            /* renamed from: a */
            public final void mo62095a() {
                if (MusicTabListFragment.this.isViewValid()) {
                    if (MusicTabListFragment.this.f88422n == 0) {
                        MusicTabListFragment.this.mo86548p().mo56976a(Integer.valueOf(4));
                    } else if (MusicTabListFragment.this.f88422n == 1) {
                        MusicTabListFragment.this.mo86545o().mo56976a(Integer.valueOf(4));
                    }
                }
            }
        };
        m109226w().mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Challenge, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<Challenge> hVar) throws Exception {
                Challenge challenge;
                if (!hVar.mo6889d()) {
                    if (hVar.mo6890e() != null) {
                        challenge = (Challenge) hVar.mo6890e();
                    } else {
                        challenge = null;
                    }
                    MusicTabListFragment.this.mo86542a(challenge);
                }
                return null;
            }
        }, C1592h.f5958b);
        m109227x().mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Music, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<Music> hVar) throws Exception {
                if (!hVar.mo6889d()) {
                    Music music = MusicTabListFragment.this.f88432x;
                    if (hVar.mo6890e() != null) {
                        music = (Music) hVar.mo6890e();
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(music);
                    MusicTabListFragment.this.mo86544b((List<Music>) arrayList);
                }
                return null;
            }
        }, C1592h.f5958b);
        this.f88364e = new MusicCategory("music_library_hot");
    }

    /* renamed from: a */
    private void m109221a(Music music, int i) {
        List items = ((C33815m) mo86545o().mo66539h()).getItems();
        Music a = C33784d.m108919a(items, music.getMid());
        int indexOf = items.indexOf(music);
        int a2 = this.f88366g.mo86130a();
        if (i == 1) {
            if (a == null) {
                music.setCollectStatus(i);
                items.add(0, music);
            } else {
                a.setCollectStatus(i);
            }
            if (!m109229z()) {
                this.f88366g.notifyDataSetChanged();
            }
        } else if (a != null) {
            a.setCollectStatus(i);
            if (!m109229z()) {
                this.f88417J.add(a);
            } else {
                mo86545o().mo66569a((Object) a);
            }
            this.f88366g.notifyItemChanged(a2 + indexOf);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    /* renamed from: a */
    private void m109219a(Challenge challenge, Music music, int i) {
        if (challenge != null && challenge.getConnectMusics() != null) {
            Music a = C33784d.m108919a(challenge.getConnectMusics(), music.getMid());
            if (!(challenge == null || challenge.getConnectMusics() == null || a == null)) {
                a.setCollectStatus(i);
                mo86542a(challenge);
            }
        }
    }

    /* renamed from: a */
    public static MusicTabListFragment m109218a(int i, String str, Music music, Style style, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("challenge", str);
        }
        if (music != null) {
            bundle.putSerializable("sticker_music", music);
        }
        bundle.putSerializable("music_style", style);
        bundle.putBoolean("show_local_music", z);
        MusicTabListFragment musicTabListFragment = new MusicTabListFragment();
        musicTabListFragment.setArguments(bundle);
        return musicTabListFragment;
    }
}
