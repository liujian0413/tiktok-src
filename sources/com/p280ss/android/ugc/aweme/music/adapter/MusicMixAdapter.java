package com.p280ss.android.ugc.aweme.music.adapter;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.common.adapter.C25648b;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33730a;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33731b;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33732c;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33733d;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33734e;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33735f;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33736g;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33737h;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33738i;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33739j;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33740k;
import com.p280ss.android.ugc.aweme.music.adapter.p1407a.C33741l;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33754e;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33758i;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33759j;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33760k;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.music.p1408b.C33770e;
import com.p280ss.android.ugc.aweme.music.p1409c.C33783c;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.presenter.C33805g;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter */
public class MusicMixAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: A */
    private C25648b<List<C33757h>> f87986A;

    /* renamed from: B */
    private C33740k f87987B;

    /* renamed from: C */
    private C33730a f87988C;

    /* renamed from: D */
    private boolean f87989D;

    /* renamed from: E */
    private C33744d f87990E = new C33744d() {
        /* renamed from: a */
        public final void mo62273a(C1293v vVar, View view, MusicModel musicModel) {
            String str;
            if (musicModel != null) {
                if (view.getId() == R.id.cuo) {
                    if (musicModel.getMusicType() == MusicType.LOCAL && MusicMixAdapter.this.f88007w == 5) {
                        if (MusicMixAdapter.this.f88005m != null) {
                            C33770e eVar = new C33770e(musicModel, "upload_local_music");
                            eVar.f88127a = musicModel;
                            MusicMixAdapter.this.f88005m.mo61995a(eVar);
                        }
                    } else if (C33784d.m108931a(musicModel, view.getContext(), true)) {
                        if (!(MusicMixAdapter.this.f87993a == null || vVar == null)) {
                            MusicMixAdapter.this.f87993a.mo86423a(musicModel, vVar.getLayoutPosition() - MusicMixAdapter.this.mo86130a());
                        }
                        if (musicModel.isChallengeMusic()) {
                            C6907h.m21524a("click_music", (Map) C22984d.m75611a().mo59973a("music_id", musicModel.getMusicId()).mo59973a("enter_from", "challenge_bonding").f60753a);
                        }
                    }
                } else if (view.getId() == R.id.bss) {
                    if (!C33745e.m108880a(view.getContext())) {
                        C10761a.m31399c(view.getContext(), (int) R.string.cjs).mo25750a();
                    } else if (MusicMixAdapter.this.f88002j != vVar.getAdapterPosition()) {
                        if (MusicMixAdapter.this.f87993a != null) {
                            MusicMixAdapter.this.mo86137f();
                            if (musicModel.getMusicType() == MusicType.LOCAL) {
                                MusicMixAdapter.this.mo86131a((MusicUnitViewHolder) vVar, musicModel);
                            } else {
                                MusicMixAdapter.this.f87993a.mo86422a(musicModel);
                            }
                            ((MusicUnitViewHolder) vVar).mo86150a(true);
                            MusicMixAdapter.this.f88002j = vVar.getAdapterPosition();
                        }
                        JSONObject jSONObject = null;
                        String searchKeyWords = musicModel.getSearchKeyWords();
                        musicModel.getName();
                        if (MusicMixAdapter.this.f88007w == 2) {
                            jSONObject = C6869c.m21381a().mo16887a("search_keyword", searchKeyWords).mo16887a("song_position", "search_result").mo16888b();
                        }
                        if (!C6319n.m19593a(musicModel.getSongId())) {
                            C6907h.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("success").setValue(musicModel.getSongId()).setJsonObject(jSONObject));
                            C6907h.m21518a(view.getContext(), "music_play", "music_library_homepage", musicModel.getSongId(), 0);
                        } else if (!C6319n.m19593a(musicModel.getMusicId())) {
                            C6907h.m21518a(view.getContext(), "music_play", "music_library_homepage", musicModel.getMusicId(), 0);
                            C6907h.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("success").setValue(musicModel.getMusicId()).setJsonObject(jSONObject));
                        }
                        if (musicModel.getMusicType() == MusicType.LOCAL) {
                            str = "local_music";
                        } else {
                            str = MusicMixAdapter.m108730c(MusicMixAdapter.this.f88007w);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C6907h.m21524a("click_music", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("music_id", musicModel.getMusicId()).f60753a);
                        }
                    } else if (MusicMixAdapter.this.f87993a != null) {
                        MusicMixAdapter.this.mo86137f();
                    }
                }
            }
        }
    };

    /* renamed from: F */
    private C33742b f87991F = new C33742b() {
        /* renamed from: a */
        public final void mo86140a(C1293v vVar) {
            MusicMixAdapter.this.mo86134a(MusicMixAdapter.this.f87999g, false);
            MusicMixAdapter.this.f87998f.put("showless_data", new ArrayList());
            MusicMixAdapter.this.mo86135a(MusicMixAdapter.this.f87998f, MusicMixAdapter.this.f88007w);
        }
    };

    /* renamed from: G */
    private C33729a f87992G = new C33729a() {
        /* renamed from: a */
        public final void mo86141a(C1293v vVar) {
            MusicMixAdapter.this.mo86134a(MusicMixAdapter.this.f87999g, true);
            MusicMixAdapter.this.f87997e.clear();
            MusicMixAdapter.this.f87997e.add(new C33759j());
            MusicMixAdapter.this.f87998f.put("showless_data", MusicMixAdapter.this.f87997e);
            MusicMixAdapter.this.mo86135a(MusicMixAdapter.this.f87998f, MusicMixAdapter.this.f88007w);
        }

        /* renamed from: a */
        public final void mo86142a(C1293v vVar, MusicCollectionItem musicCollectionItem) {
            if (MusicMixAdapter.this.f87994b != null) {
                MusicMixAdapter.this.f87994b.mo62046a(musicCollectionItem);
            }
        }
    };

    /* renamed from: a */
    public C33805g f87993a;

    /* renamed from: b */
    public C33743c f87994b;

    /* renamed from: c */
    public Challenge f87995c;

    /* renamed from: d */
    public List<C33757h> f87996d = new ArrayList();

    /* renamed from: e */
    public List<C33757h> f87997e = new ArrayList();

    /* renamed from: f */
    public Map<String, List<C33757h>> f87998f;

    /* renamed from: g */
    public List<MusicCollectionItem> f87999g = new ArrayList();

    /* renamed from: h */
    public boolean f88000h = true;

    /* renamed from: i */
    int f88001i = 0;

    /* renamed from: j */
    int f88002j = -1;

    /* renamed from: k */
    public int f88003k = -1;

    /* renamed from: l */
    RecyclerView f88004l;

    /* renamed from: m */
    public C33746f<C33770e> f88005m;

    /* renamed from: n */
    public Style f88006n;

    /* renamed from: w */
    public int f88007w;

    /* renamed from: x */
    private String f88008x;

    /* renamed from: y */
    private List<C33757h> f88009y = new ArrayList();

    /* renamed from: z */
    private int f88010z = 1;

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter$Style */
    public enum Style {
        BtnConfirmAndShoot,
        BtnConfirm
    }

    /* renamed from: c */
    public static String m108730c(int i) {
        switch (i) {
            case 0:
                return "songchart";
            case 1:
                return "favorite_song";
            case 2:
                return "search_music";
            case 3:
                return "album";
            default:
                return "";
        }
    }

    /* renamed from: c */
    public final int mo60557c() {
        return this.f87996d.size();
    }

    /* renamed from: g */
    private Style m108731g() {
        if (this.f88006n != null) {
            return this.f88006n;
        }
        return Style.BtnConfirmAndShoot;
    }

    /* renamed from: k */
    private void m108733k() {
        int i = 0;
        for (C33757h hVar : this.f87996d) {
            if (hVar instanceof C33760k) {
                this.f88003k = i;
                return;
            }
            i++;
        }
    }

    /* renamed from: a */
    public final int mo86130a() {
        int i = 0;
        if (this.f87998f == null) {
            return 0;
        }
        List list = (List) this.f87998f.get("tab_data");
        if (!C6307b.m19566a((Collection<T>) list)) {
            i = list.size();
        }
        return (this.f87996d.size() - i) + 1;
    }

    /* renamed from: f */
    public final void mo86137f() {
        MediaPlayer a = C33783c.m108916a();
        if (this.f88002j != -1) {
            C1293v f = this.f88004l.mo5575f(this.f88002j);
            if (f instanceof MusicUnitViewHolder) {
                ((MusicUnitViewHolder) f).mo86150a(false);
            }
            this.f88002j = -1;
        }
        if (a != null && a.isPlaying()) {
            a.pause();
        }
        this.f87993a.mo86424b(null);
    }

    /* renamed from: j */
    private void m108732j() {
        this.f87986A.mo66524a((C25647a<T>) new C33731b<T>(this.f87995c));
        C33730a aVar = new C33730a(this.f87990E, this.f88007w, m108731g(), this.f88005m, this.f88010z);
        this.f87988C = aVar;
        this.f87986A.mo66524a((C25647a<T>) this.f87988C);
        this.f87986A.mo66524a((C25647a<T>) new C33732c<T>(this.f87992G));
        this.f87986A.mo66524a((C25647a<T>) new C33733d<T>(this.f87992G));
        this.f87986A.mo66524a((C25647a<T>) new C33741l<T>(this.f87991F));
        this.f87986A.mo66524a((C25647a<T>) new C33739j<T>(this.f87989D));
        this.f87986A.mo66524a((C25647a<T>) new C33734e<T>());
        C33740k kVar = new C33740k(this.f87990E, this.f88007w, m108731g(), this.f88005m, this.f88010z);
        this.f87987B = kVar;
        this.f87986A.mo66524a((C25647a<T>) this.f87987B);
        this.f87986A.mo66524a((C25647a<T>) new C33737h<T>());
        this.f87986A.mo66524a((C25647a<T>) new C33736g<T>());
        this.f87986A.mo66524a((C25647a<T>) new C33738i<T>(16.0f));
        this.f87986A.mo66524a((C25647a<T>) new C33735f<T>());
    }

    /* renamed from: a */
    public final void mo86132a(String str) {
        this.f88008x = str;
        if (this.f87987B != null) {
            this.f87987B.f88097a = str;
        }
    }

    /* renamed from: b */
    public final int mo86136b(int i) {
        int a = mo58029a(i);
        if (a == 2 || a == 3) {
            return 1;
        }
        return 4;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f87986A != null) {
            this.f87986A.mo66526a(recyclerView);
        }
        this.f88004l = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        if (this.f87986A != null) {
            this.f87986A.mo66530b(recyclerView);
        }
        this.f88004l = null;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (this.f87996d.size() > i) {
            return this.f87986A.mo66521a(this.f87996d, i);
        }
        return super.mo58029a(i);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return this.f87986A.mo66522a(viewGroup, i);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (this.f87988C != null) {
            this.f87988C.f88085c = this.f88002j;
        }
        if (this.f87987B != null) {
            this.f87987B.f88099c = this.f88002j;
        }
        this.f87986A.mo66527a(this.f87996d, i, vVar);
    }

    /* renamed from: a */
    public final void mo86131a(final MusicUnitViewHolder musicUnitViewHolder, MusicModel musicModel) {
        MediaPlayer a = C33783c.m108916a();
        try {
            a.reset();
            a.setDataSource(musicModel.getPath());
            a.setAudioStreamType(3);
            a.prepareAsync();
            a.setOnPreparedListener(new OnPreparedListener() {
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                    musicUnitViewHolder.mo86150a(true);
                }
            });
            a.setOnErrorListener(new OnErrorListener() {
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    C33783c.m108917b();
                    return false;
                }
            });
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public final void mo86133a(List<MusicModel> list, int i) {
        this.f87996d.clear();
        if (!list.isEmpty() && i == 5) {
            this.f87996d.add(new C33754e());
        }
        this.f87996d.addAll(list);
        this.f88007w = i;
        if (this.f87987B != null) {
            this.f87987B.mo86169a(this.f88007w);
        }
        if (this.f87988C != null) {
            this.f87988C.mo86167a(this.f88007w);
        }
        m108733k();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo86134a(List<MusicCollectionItem> list, boolean z) {
        int i;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        this.f88001i = i;
        this.f87999g = list;
        this.f88009y.clear();
        this.f88009y.addAll(list);
        if (!z) {
            this.f88009y = this.f88009y.subList(0, 7);
        }
        C33758i iVar = new C33758i();
        iVar.f88108a = this.f88001i - this.f88009y.size();
        if (this.f88001i - this.f88009y.size() > 0) {
            this.f88009y.add(iVar);
        }
    }

    /* renamed from: a */
    public final void mo86135a(Map<String, List<C33757h>> map, int i) {
        this.f87998f = map;
        map.put("collection", this.f88009y);
        this.f87996d = C33784d.m108925a(map);
        this.f88007w = i;
        if (this.f87987B != null) {
            this.f87987B.mo86169a(this.f88007w);
        }
        if (this.f87988C != null) {
            this.f87988C.mo86167a(this.f88007w);
        }
        m108733k();
        notifyDataSetChanged();
    }

    public MusicMixAdapter(C33805g gVar, C33743c cVar, C33746f<C33770e> fVar, int i, boolean z) {
        this.f87993a = gVar;
        this.f87994b = cVar;
        this.f88005m = fVar;
        this.f87986A = new C25648b<>();
        this.f88010z = i;
        this.f87989D = z;
        m108732j();
        registerAdapterDataObserver(new C1264c() {
            /* renamed from: a */
            public final void mo5721a() {
            }

            /* renamed from: a */
            public final void mo5722a(int i, int i2) {
                MusicMixAdapter.this.mo86137f();
            }

            /* renamed from: b */
            public final void mo5725b(int i, int i2) {
                MusicMixAdapter.this.mo86137f();
            }

            /* renamed from: c */
            public final void mo5726c(int i, int i2) {
                MusicMixAdapter.this.mo86137f();
            }

            /* renamed from: a */
            public final void mo5723a(int i, int i2, int i3) {
                MusicMixAdapter.this.mo86137f();
            }

            /* renamed from: a */
            public final void mo5724a(int i, int i2, Object obj) {
                MusicMixAdapter.this.mo86137f();
            }
        });
    }
}
