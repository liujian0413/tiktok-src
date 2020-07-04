package com.p280ss.android.ugc.aweme.music.adapter;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27747d;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27748e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.OriginMusicViewHolder;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.OriginMusicAdapter */
public class OriginMusicAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: a */
    public C27748e f88054a;

    /* renamed from: b */
    int f88055b = -1;

    /* renamed from: c */
    public String f88056c;

    /* renamed from: d */
    public int f88057d;

    /* renamed from: e */
    public String f88058e;

    /* renamed from: f */
    private RecyclerView f88059f;

    /* renamed from: g */
    private List<MusicModel> f88060g = new ArrayList();

    /* renamed from: h */
    private C27747d f88061h = new C27747d() {
        /* renamed from: a */
        public final void mo71177a(C1293v vVar, View view, MusicModel musicModel) {
            String str;
            if (musicModel != null && view != null && view.getContext() != null) {
                if (view.getId() == R.id.cuo) {
                    if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(musicModel, view.getContext(), true)) {
                        if (!C21115b.m71197a().isLogin() && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
                            C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a((Activity) view.getContext()).mo56859a());
                            C6907h.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_music_shoot"));
                        } else if (OriginMusicAdapter.this.f88054a != null) {
                            OriginMusicAdapter.this.f88054a.mo71228a(musicModel, vVar.getLayoutPosition());
                            MobClick value = MobClick.obtain().setEventName("shoot").setLabelName("single_song").setValue(musicModel.getMusicId());
                            C6869c cVar = new C6869c();
                            String str2 = "enter_from";
                            if (TextUtils.equals(C21115b.m71197a().getCurUserId(), OriginMusicAdapter.this.f88056c)) {
                                str = "personal_homepage";
                            } else {
                                str = "others_homepage";
                            }
                            C6907h.onEvent(value.setJsonObject(cVar.mo16887a(str2, str).mo16888b()));
                            C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("shoot_way", "single_song").mo59973a("music_id", musicModel.getMusicId()).f60753a);
                        }
                    }
                } else if (view.getId() == R.id.bss) {
                    C6907h.m21524a("play_music", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage_list").mo59973a("previous_page", OriginMusicAdapter.this.f88058e).mo59973a("music_id", musicModel.getMusicId()).mo59973a("enter_method", "personal_list").f60753a);
                    if (!C33747g.m108882a(view.getContext())) {
                        C10761a.m31399c(view.getContext(), (int) R.string.cjs).mo25750a();
                    } else if (OriginMusicAdapter.this.f88055b == vVar.getAdapterPosition()) {
                        if (OriginMusicAdapter.this.f88054a != null) {
                            OriginMusicAdapter.this.mo86155a();
                        }
                    } else if (OriginMusicAdapter.this.f88054a != null) {
                        OriginMusicAdapter.this.mo86155a();
                        OriginMusicAdapter.this.f88054a.mo71227a(musicModel);
                        ((OriginMusicViewHolder) vVar).mo86072a(true);
                        OriginMusicAdapter.this.f88055b = vVar.getAdapterPosition();
                    }
                }
            }
        }
    };

    /* renamed from: c */
    public final int mo60557c() {
        return this.f88060g.size();
    }

    /* renamed from: a */
    public final void mo86155a() {
        if (this.f88055b != -1) {
            C1293v f = this.f88059f.mo5575f(this.f88055b);
            if (f instanceof OriginMusicViewHolder) {
                ((OriginMusicViewHolder) f).mo86072a(false);
            }
            this.f88055b = -1;
        }
        this.f88054a.mo71229b(null);
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        return super.mo58029a(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f88059f = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f88059f = null;
    }

    /* renamed from: a */
    public final void mo86156a(List<MusicModel> list) {
        this.f88060g.clear();
        this.f88060g.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo86157b(List<MusicModel> list) {
        this.f88060g.clear();
        this.f88060g.addAll(list);
        if (this.f67566v) {
            notifyItemRangeChanged(this.f88057d - 1, getItemCount() - this.f88057d);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeChanged(this.f88057d, getItemCount() - this.f88057d);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new OriginMusicViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0_, viewGroup, false), this.f88061h, this.f88058e);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        boolean z;
        if (vVar instanceof OriginMusicViewHolder) {
            OriginMusicViewHolder originMusicViewHolder = (OriginMusicViewHolder) vVar;
            MusicModel musicModel = (MusicModel) this.f88060g.get(i);
            if (i == this.f88055b) {
                z = true;
            } else {
                z = false;
            }
            originMusicViewHolder.mo86071a(musicModel, z);
        }
    }

    public OriginMusicAdapter(C27748e eVar, String str, String str2) {
        this.f88054a = eVar;
        this.f88056c = str;
        this.f88058e = str2;
        registerAdapterDataObserver(new C1264c() {
            /* renamed from: a */
            public final void mo5721a() {
                OriginMusicAdapter.this.f88057d = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.mo86155a();
            }

            /* renamed from: b */
            public final void mo5725b(int i, int i2) {
                OriginMusicAdapter.this.f88057d = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.mo86155a();
            }

            /* renamed from: c */
            public final void mo5726c(int i, int i2) {
                OriginMusicAdapter.this.f88057d = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.mo86155a();
            }

            /* renamed from: a */
            public final void mo5722a(int i, int i2) {
                OriginMusicAdapter.this.f88057d = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.mo86155a();
            }

            /* renamed from: a */
            public final void mo5723a(int i, int i2, int i3) {
                OriginMusicAdapter.this.f88057d = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.mo86155a();
            }

            /* renamed from: a */
            public final void mo5724a(int i, int i2, Object obj) {
                OriginMusicAdapter.this.f88057d = OriginMusicAdapter.this.getItemCount();
                OriginMusicAdapter.this.mo86155a();
            }
        });
    }
}
