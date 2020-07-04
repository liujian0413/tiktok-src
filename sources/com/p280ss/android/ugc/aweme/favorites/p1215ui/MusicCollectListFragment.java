package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.favorites.adapter.CollectMusicAdapter;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27748e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.model.MusicCategory;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y;
import com.p280ss.android.ugc.aweme.music.presenter.C33815m;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.MusicCollectListFragment */
public class MusicCollectListFragment extends BaseCollectListFragment implements C27748e, C33951d {

    /* renamed from: j */
    private C34018y f73279j;

    /* renamed from: k */
    private MusicModel f73280k;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo61994a(MusicModel musicModel, Exception exc) {
    }

    /* renamed from: f */
    public final MusicModel mo61999f() {
        return this.f73280k;
    }

    /* renamed from: k */
    public final Activity mo62001k() {
        return getActivity();
    }

    /* renamed from: l */
    public final boolean mo62002l() {
        return isViewValid();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final BaseAdapter mo71264n() {
        return new CollectMusicAdapter(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo71263m() {
        if (this.f73219i != null) {
            this.f73219i.mo66536a(new C33815m());
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f73279j != null) {
            this.f73279j.f88733m = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo71261g() {
        if (this.f73219i != null) {
            this.f73219i.mo56976a(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo71262i() {
        if (this.f73219i != null) {
            this.f73219i.mo56976a(Integer.valueOf(4));
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f73279j != null) {
            this.f73279j.mo61971a();
            this.f73279j.mo61976d();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f73279j != null) {
            this.f73279j.mo61971a();
            this.f73279j.f88733m = true;
        }
        if (this.f73215e != null) {
            ((CollectMusicAdapter) this.f73215e).mo71176f();
        }
    }

    public final void ae_() {
        super.ae_();
        if (!C6399b.m19944t()) {
            C6877n.m21407a("show_collect_empty", "", C6869c.m21381a().mo16887a("show_collect_empty_page", "profile").mo16888b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final View mo71268r() {
        if (getActivity() == null) {
            return null;
        }
        if (!C6399b.m19944t()) {
            return super.mo71268r();
        }
        C10805b bVar = new C10806a(getActivity()).mo25990b((int) R.string.b4q).mo25993c(R.string.b4o).mo25985a((int) R.drawable.ax0).f29135a;
        MtEmptyView a = MtEmptyView.m31657a(getContext());
        a.setStatus(bVar);
        return a;
    }

    /* renamed from: a */
    public final void mo71227a(MusicModel musicModel) {
        if (musicModel != null) {
            this.f73280k = musicModel;
            this.f73279j.mo86674a(musicModel, 1);
        }
    }

    /* renamed from: b */
    public final void mo71229b(MusicModel musicModel) {
        super.onPause();
        if (this.f73279j != null) {
            this.f73279j.mo61971a();
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v1/user/music/collect/?")) {
            C42961az.m136385f(aVar);
            mo71261g();
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && this.f73215e != null) {
            ((CollectMusicAdapter) this.f73215e).mo71176f();
        }
    }

    @C7709l
    public void onMusicCollectEvent(C33769d dVar) {
        if (isViewValid()) {
            List items = ((C25673a) this.f73219i.mo66539h()).getItems();
            MusicModel musicModel = dVar.f88125b;
            if (musicModel != null) {
                int size = items.size();
                Music music = musicModel.getMusic();
                if (music != null && music.getCollectStatus() != 1) {
                    if (!(this.f73219i == null || this.f73219i.mo66539h() == null || items == null || items.size() <= 0)) {
                        Iterator it = items.iterator();
                        while (it.hasNext()) {
                            Music music2 = (Music) it.next();
                            if (music2 != null && !TextUtils.isEmpty(music.getMid()) && music.getMid().equals(music2.getMid())) {
                                it.remove();
                            }
                        }
                    }
                    if (size != items.size()) {
                        this.f73215e.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f73279j.mo61975c();
    }

    /* renamed from: a */
    public final void mo71228a(MusicModel musicModel, int i) {
        if (this.f73279j != null) {
            this.f73279j.f88730j = "music_collection";
            this.f73279j.f88732l = i;
            this.f73279j.f88731k = new MusicCategory("favorite_song");
            this.f73279j.mo86680b(musicModel, 7);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73279j = new C34018y(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: a */
    public final void mo61996a(final String str, final MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (!C42973bg.m136427a(str) || musicModel == null) {
                C10761a.m31399c((Context) activity, (int) R.string.ch7).mo25750a();
                C6877n.m21444a("aweme_music_download_error_rate", 3, C6869c.m21381a().mo16885a("downloadStrategy", Integer.valueOf(((IMusicService) ServiceManager.get().getService(IMusicService.class)).getMusicDownloadStrategy())).mo16887a("musicPath", str).mo16888b());
                return;
            }
            final int checkAudioFile = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(str);
            if (checkAudioFile < 0) {
                C10761a.m31399c((Context) activity, (int) R.string.ch7).mo25750a();
                C1592h.m7853a((Callable<TResult>) new Callable<Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void call() {
                        C6877n.m21444a("aweme_music_download_error_rate", 4, C6869c.m21381a().mo16887a("musicPath", str).mo16885a("downloadStrategy", Integer.valueOf(((IMusicService) ServiceManager.get().getService(IMusicService.class)).getMusicDownloadStrategy())).mo16887a("fileLength", String.valueOf(new File(str).length())).mo16887a("fileUri", musicModel.getPath()).mo16887a("fileMagic", C42973bg.m136432d(str)).mo16887a("code", String.valueOf(checkAudioFile)).mo16888b());
                        return null;
                    }
                });
                return;
            }
            if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
            } else {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(musicModel.getMusic().getChallenge());
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(musicModel);
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            intent.putExtra("shoot_way", "collection_music");
            String uuid = UUID.randomUUID().toString();
            intent.putExtra("creation_id", uuid);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity((Activity) activity, intent);
            C6907h.m21524a("shoot", (Map) new C22984d().mo59973a("creation_id", uuid).mo59973a("enter_from", "personal_homepage").mo59973a("content_source", "shoot").mo59973a("shoot_way", "collection_music").mo59973a("music_id", musicModel.getMusicId()).f60753a);
        }
    }
}
