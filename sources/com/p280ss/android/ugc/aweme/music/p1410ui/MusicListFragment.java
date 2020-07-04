package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23969n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.music.adapter.C33743c;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.p280ss.android.ugc.aweme.music.adapter.MusicMixAdapter.Style;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicCategory;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.music.p1408b.C33768c;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1408b.C33770e;
import com.p280ss.android.ugc.aweme.music.p1409c.C33783c;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.presenter.C33801c;
import com.p280ss.android.ugc.aweme.music.presenter.C33805g;
import com.p280ss.android.ugc.aweme.music.presenter.C33812l;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListFragment */
public class MusicListFragment extends AmeBaseFragment implements C6905a, C33743c, C33746f<C33770e>, C33801c, C33805g, C33951d {

    /* renamed from: n */
    private static final String f88363n = "com.ss.android.ugc.aweme.music.ui.MusicListFragment";

    /* renamed from: e */
    public MusicCategory f88364e;

    /* renamed from: f */
    public C0052o<RecyclerView> f88365f = new C0052o<>();

    /* renamed from: g */
    public MusicMixAdapter f88366g;

    /* renamed from: h */
    public C34018y f88367h;

    /* renamed from: i */
    public C33868b f88368i;

    /* renamed from: j */
    public int f88369j;

    /* renamed from: k */
    public boolean f88370k = true;

    /* renamed from: l */
    protected C23969n f88371l;

    /* renamed from: m */
    public C33867a f88372m;
    public RecyclerView mListView;
    DmtStatusView mStatusView;

    /* renamed from: o */
    private String f88373o = "popular_song";

    /* renamed from: p */
    private String f88374p;

    /* renamed from: q */
    private int f88375q;

    /* renamed from: r */
    private C33812l f88376r;

    /* renamed from: s */
    private Style f88377s;

    /* renamed from: t */
    private List<MusicModel> f88378t = new ArrayList();

    /* renamed from: u */
    private List<Music> f88379u = new ArrayList();

    /* renamed from: v */
    private boolean f88380v = false;

    /* renamed from: w */
    private boolean f88381w = false;

    /* renamed from: x */
    private MusicModel f88382x;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListFragment$a */
    public interface C33867a {
        /* renamed from: a */
        void mo62095a();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicListFragment$b */
    public interface C33868b {
        /* renamed from: a */
        void mo62086a(MusicListFragment musicListFragment, String str, MusicModel musicModel, String str2);
    }

    /* renamed from: Y_ */
    public boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public void mo62046a(MusicCollectionItem musicCollectionItem) {
    }

    /* renamed from: a */
    public final void mo61994a(MusicModel musicModel, Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo86515e() {
        return R.layout.p4;
    }

    /* renamed from: f */
    public final MusicModel mo61999f() {
        return this.f88382x;
    }

    /* renamed from: n */
    public final int mo86519n() {
        return this.f88375q;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo86513a(Map<String, List<C33757h>> map, int i) {
        if (isViewValid()) {
            if (map == null) {
                C10761a.m31399c(getContext(), (int) R.string.cjm).mo25750a();
                if (mo86545o()) {
                    this.mStatusView.mo25944h();
                }
                return;
            }
            if (this.mListView != null) {
                this.mListView.setVisibility(0);
            }
            this.mStatusView.mo25939d();
            if (this.f88366g != null) {
                this.f88366g.mo86135a(map, i);
            }
            this.f88369j = i;
        }
    }

    /* renamed from: a */
    public final void mo86512a(List<Music> list, int i) {
        if (isViewValid()) {
            if (list == null) {
                C10761a.m31399c(getContext(), (int) R.string.cjm).mo25750a();
                if (mo86545o()) {
                    this.mStatusView.mo25944h();
                }
            } else if (list.isEmpty()) {
                this.mStatusView.mo25943g();
            } else {
                this.f88379u = list;
                if (this.mListView != null) {
                    this.mListView.setVisibility(0);
                }
                this.mStatusView.mo25939d();
                this.f88378t.clear();
                this.f88379u = list;
                for (Music music : list) {
                    if (music != null) {
                        MusicModel convertToMusicModel = music.convertToMusicModel();
                        convertToMusicModel.setDataType(1);
                        this.f88378t.add(convertToMusicModel);
                    }
                }
                if (this.f88366g != null) {
                    this.f88366g.mo86133a(this.f88378t, i);
                }
                this.f88369j = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo61996a(String str, MusicModel musicModel, String str2) {
        if (this.f88372m != null) {
            this.f88368i.mo62086a(this, str, musicModel, str2);
        }
    }

    /* renamed from: a */
    public final void mo62047a(Exception exc) {
        C6921a.m21559a((Throwable) exc);
    }

    public final void bd_() {
        if (!this.f88381w) {
            mo86518m();
        }
    }

    /* renamed from: k */
    public final Activity mo62001k() {
        return getActivity();
    }

    /* renamed from: l */
    public final boolean mo62002l() {
        return isViewValid();
    }

    /* renamed from: o */
    private boolean mo86545o() {
        if (this.f88369j != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo86516g() {
        if (this.f88366g != null) {
            this.f88366g.mo86137f();
        }
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("music_library_list");
    }

    /* renamed from: j */
    public final void mo86517j() {
        if (this.f88367h != null) {
            this.f88367h.mo61971a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo86518m() {
        if (this.f88372m != null) {
            this.f88372m.mo62095a();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        mo86517j();
        this.f88367h.mo61976d();
    }

    public void onResume() {
        super.onResume();
        this.f88367h.f88733m = false;
    }

    /* renamed from: d */
    private void m109173d() {
        this.f88381w = true;
        this.f88371l = new C23969n(new C33931ag(this), 10);
        this.f88371l.mo62184a(this.mListView);
    }

    public void onPause() {
        super.onPause();
        if (this.f88366g != null) {
            this.f88366g.mo86137f();
        }
        if (this.f88367h != null) {
            this.f88367h.mo61971a();
        }
        C33783c.m108916a().pause();
        this.f88367h.f88733m = true;
    }

    /* renamed from: a */
    private void m109172a() {
        this.f88365f.setValue(this.mListView);
        MusicMixAdapter musicMixAdapter = new MusicMixAdapter(this, this, this, this.f88375q, this.f88380v);
        this.f88366g = musicMixAdapter;
        this.f88366g.f88006n = this.f88377s;
        this.mListView.setVisibility(8);
        this.f88366g.mo66516d(true);
        if (C6399b.m19944t()) {
            this.f88366g.f67550q = getResources().getColor(R.color.l0);
        } else {
            this.f88366g.f67550q = getResources().getColor(R.color.lz);
        }
        this.f88366g.f67552s = "music_list";
        this.f88367h.mo61975c();
        this.f88367h.mo86672a(this.f88375q);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f88366g.mo66504a((C6905a) this);
        this.mListView.setAdapter(this.f88366g);
        m109173d();
        this.f88376r = new C33812l(getActivity());
        this.f88376r.mo66537a(this);
        this.mStatusView.setBuilder(C10803a.m31631a((Context) getActivity()).mo25964b(new C10806a(getActivity()).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).f29135a).mo25961a(m109169a(getActivity().getString(R.string.fid))).mo25965c(0));
        if (!mo86545o()) {
            this.mStatusView.mo25939d();
        } else if (C33932ah.m109378a(getActivity())) {
            this.mStatusView.mo25942f();
        } else {
            this.mStatusView.mo25944h();
        }
    }

    /* renamed from: b */
    public final void mo86424b(MusicModel musicModel) {
        mo86517j();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    private C10805b m109169a(String str) {
        return new C10806a(getActivity()).mo25990b((int) R.string.bzv).mo25991b(str).f29135a;
    }

    @C7709l(mo20401b = true)
    public void onMobMusicTypeEvent(C33768c cVar) {
        String str = cVar.f88123a;
        if (str == null) {
            this.f88373o = this.f88374p;
        } else if (this.f88374p == null) {
            this.f88373o = str;
            this.f88374p = this.f88373o;
        } else {
            this.f88374p = this.f88373o;
            this.f88373o = str;
        }
    }

    @C7709l(mo20401b = true)
    public void onMusicCollectEvent(C33769d dVar) {
        MusicModel musicModel = dVar.f88125b;
        if (musicModel != null) {
            Music a = C33784d.m108919a(this.f88379u, musicModel.getMusicId());
            if (a != null) {
                a.setCollectStatus(dVar.f88124a);
                int indexOf = this.f88379u.indexOf(a);
                MusicMixAdapter musicMixAdapter = this.f88366g;
                if (musicMixAdapter != null) {
                    musicMixAdapter.notifyItemChanged(indexOf);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo61995a(C33770e eVar) {
        String str;
        String str2;
        String str3 = eVar.f88128b;
        MusicModel musicModel = eVar.f88127a;
        if (musicModel != null) {
            FragmentActivity activity = getActivity();
            if (activity == null || !"upload_local_music".equals(str3)) {
                String str4 = null;
                String str5 = this.mTag;
                String str6 = "";
                if (str5 != null) {
                    if (str5.equals("album_list_tag")) {
                        str4 = "album";
                    } else if (str5.equals("search_result_list_tag")) {
                        str4 = "search_music";
                    }
                }
                if ("follow_type".equals(str3)) {
                    str6 = "favourite_song";
                    this.f88376r.mo56976a(Integer.valueOf(1), musicModel.getMusicId(), Integer.valueOf(1));
                } else if ("unfollow_type".equals(str3)) {
                    str6 = "cancel_favourite_song";
                    this.f88376r.mo56976a(Integer.valueOf(1), musicModel.getMusicId(), Integer.valueOf(0));
                }
                if (str4 != null && !TextUtils.isEmpty(str6)) {
                    if (TextUtils.equals(str4, "search_music")) {
                        C22984d a = C22984d.m75611a();
                        a.mo59973a("music_id", musicModel.getMusicId()).mo59973a("enter_from", "search_music").mo59973a("search_keyword", C33784d.m108920a()).mo59973a("log_pb", new C6600e().mo15979b((Object) musicModel.getLogPb()));
                        C6907h.m21525a(str6, C33933ai.m109379a(a.f60753a));
                        return;
                    }
                    C6907h.m21524a(str6, (Map) C22984d.m75611a().mo59973a("enter_from", str4).mo59973a("music_id", musicModel.getMusicId()).f60753a);
                }
                return;
            }
            Intent intent = new Intent();
            String str7 = "local_music_name";
            if (eVar.f88127a == null) {
                str = "";
            } else {
                str = eVar.f88127a.getName();
            }
            intent.putExtra(str7, str);
            String str8 = "local_music_path";
            if (eVar.f88127a == null) {
                str2 = "";
            } else {
                str2 = eVar.f88127a.getPath();
            }
            intent.putExtra(str8, str2);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    /* renamed from: a */
    public final void mo86422a(MusicModel musicModel) {
        this.f88382x = musicModel;
        if (this.f88370k) {
            this.f88367h.f88731k = this.f88364e;
            this.f88367h.mo86674a(musicModel, this.f88369j);
            return;
        }
        this.f88367h.mo86680b(musicModel, this.f88369j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86510a(int i, int i2) {
        mo86518m();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m109172a();
    }

    /* renamed from: a */
    public static MusicListFragment m109170a(int i, Style style) {
        MusicListFragment musicListFragment = new MusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle.putSerializable("music_style", style);
        musicListFragment.setArguments(bundle);
        return musicListFragment;
    }

    /* renamed from: b */
    public final void mo86514b(List<MusicModel> list, int i) {
        if (isViewValid() && this.f88366g != null) {
            this.f88366g.mo86133a(list, 2);
            this.f88369j = 2;
            this.mListView.setVisibility(0);
            if (mo86545o()) {
                if (C6311g.m19573a(list)) {
                    this.mStatusView.mo25943g();
                } else {
                    this.mStatusView.mo25939d();
                }
            }
            this.f88366g.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo86423a(MusicModel musicModel, int i) {
        this.f88367h.f88730j = this.f88373o;
        this.f88367h.f88732l = i;
        this.f88367h.f88731k = this.f88364e;
        this.f88367h.mo86680b(musicModel, this.f88369j);
    }

    /* renamed from: a */
    public static MusicListFragment m109171a(int i, Style style, boolean z) {
        MusicListFragment musicListFragment = new MusicListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        bundle.putSerializable("music_style", style);
        bundle.putBoolean("show_local_music", z);
        musicListFragment.setArguments(bundle);
        return musicListFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo86515e(), viewGroup, false);
        this.f88367h = new C34018y(this);
        if (getArguments() != null) {
            this.f88375q = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.f88377s = (Style) getArguments().getSerializable("music_style");
            if (getArguments().containsKey("show_local_music")) {
                this.f88380v = getArguments().getBoolean("show_local_music", false);
            }
        } else {
            this.f88375q = 0;
        }
        return inflate;
    }
}
