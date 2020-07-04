package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.arch.C23071a;
import com.p280ss.android.ugc.aweme.arch.C23071a.C23072a;
import com.p280ss.android.ugc.aweme.arch.C23074c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1090d.C23853a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23880a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C33951d;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33915a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment */
public abstract class BaseMusicListFragment<T> extends AmeBaseFragment implements C0053p<C23083a>, C23072a<T>, C23844b, C33746f<C23822c>, C33951d {

    /* renamed from: e */
    protected C23880a f63046e;

    /* renamed from: f */
    protected MusicModel f63047f;

    /* renamed from: g */
    public boolean f63048g = true;

    /* renamed from: h */
    protected C23853a f63049h;

    /* renamed from: i */
    public DataCenter f63050i;

    /* renamed from: j */
    protected C23074c<T> f63051j;

    /* renamed from: k */
    protected int f63052k;

    /* renamed from: l */
    private C23071a f63053l;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo61994a(MusicModel musicModel, Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C23074c<T> mo61998b(View view);

    /* renamed from: f */
    public final MusicModel mo61999f() {
        return this.f63047f;
    }

    /* renamed from: g */
    public final int mo62000g() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo62004n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo62005o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo62007p();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61997a(String str, MusicModel musicModel, String str2, Activity activity) {
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_model", musicModel);
        intent.putExtra("music_origin", str2);
        if (this.f63052k == 1) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(activity, intent);
            activity.finish();
            return;
        }
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: k */
    public final Activity mo62001k() {
        return getActivity();
    }

    /* renamed from: l */
    public final boolean mo62002l() {
        return isViewValid();
    }

    /* renamed from: m */
    public C1262a mo62003m() {
        if (this.f63051j != null) {
            return this.f63051j.mo60125d();
        }
        return null;
    }

    public void onResume() {
        super.onResume();
        if (this.f63046e != null) {
            this.f63046e.f88733m = false;
        }
    }

    /* renamed from: a */
    public void mo60113a() {
        this.f63049h = new C23853a(getContext(), this.f63050i);
    }

    /* renamed from: e */
    public DataCenter mo60117e() {
        if (this.f63050i == null) {
            this.f63050i = DataCenter.m75849a(C23087c.m75886a((Fragment) this), (C0043i) this);
        }
        this.f63050i.mo60132a("music_collect_status", (C0053p<C23083a>) this);
        return this.f63050i;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f63046e != null) {
            this.f63046e.mo61971a();
            this.f63046e.mo61976d();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f63046e != null) {
            this.f63046e.mo61971a();
            this.f63046e.f88733m = true;
        }
        C1262a m = mo62003m();
        if (m instanceof MusicAdapter) {
            ((MusicAdapter) m).al_();
        }
    }

    /* renamed from: i */
    private void mo62039i() {
        this.f63046e = new C23880a(this);
        this.f63046e.mo61975c();
        this.f63046e.mo86672a(this.f63052k);
        C1262a m = mo62003m();
        if (m instanceof MusicAdapter) {
            this.f63046e.f63023c = ((MusicAdapter) m).f62922e;
        }
    }

    /* renamed from: a */
    public final void mo61920a(C34026a aVar) {
        this.f63046e.f88729i = aVar;
    }

    /* renamed from: a */
    public final C23074c<T> mo60112a(View view) {
        this.f63051j = mo61998b(view);
        return this.f63051j;
    }

    /* renamed from: b */
    public final void mo61923b(MusicModel musicModel) {
        this.f63046e.f88730j = mo62005o();
        this.f63046e.mo86680b(musicModel, mo62004n());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getArguments() != null) {
            i = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f63052k = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo61995a(C23822c cVar) {
        String str = cVar.f62885b;
        MusicModel musicModel = cVar.f62884a;
        if ("follow_type".equals(str)) {
            this.f63049h.mo61938a(musicModel, musicModel.getMusicId(), 1, cVar.f62886c, cVar.f62887d);
            return;
        }
        if ("unfollow_type".equals(str)) {
            this.f63049h.mo61938a(musicModel, musicModel.getMusicId(), 0, cVar.f62886c, cVar.f62887d);
        }
    }

    @C7709l(mo20401b = true)
    public void onMusicCollectEvent(C33769d dVar) {
        if (this.f63050i != null && dVar != null && "music_detail".equals(dVar.f88126c)) {
            C23820a aVar = new C23820a(0, dVar.f88124a, -1, -1, dVar.f88125b);
            this.f63050i.mo60134a("music_collect_status", (Object) aVar);
        }
    }

    /* renamed from: a */
    public final void mo61921a(MusicModel musicModel) {
        if (this.f63046e != null) {
            this.f63046e.mo61971a();
        }
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        char c;
        int i;
        int i2;
        CollectionType collectionType;
        if (aVar != null) {
            String str = aVar.f60948a;
            if (str.hashCode() == -1635157503 && str.equals("music_collect_status")) {
                c = 0;
            } else {
                c = 65535;
            }
            if (c == 0) {
                C23820a aVar2 = (C23820a) aVar.mo60161a();
                if (!(this.f63051j == null || this.f63051j.mo60125d() == null)) {
                    List a = this.f63051j.mo60125d().mo62312a();
                    if (!C6307b.m19566a((Collection<T>) a)) {
                        if (aVar2.f62878a == 1) {
                            if (a.size() > aVar2.f62880c) {
                                this.f63051j.mo60125d().notifyItemChanged(aVar2.f62880c);
                            }
                        } else if (aVar2.f62880c == -1) {
                            MusicModel a2 = C23889d.m78216a(a, aVar2.f62882e.getMusicId());
                            if (a2 != null) {
                                if (aVar2.f62881d == 1) {
                                    collectionType = CollectionType.COLLECTED;
                                } else {
                                    collectionType = CollectionType.NOT_COLLECTED;
                                }
                                a2.setCollectionType(collectionType);
                                int indexOf = a.indexOf(a2);
                                if (indexOf >= 0 && indexOf < a.size()) {
                                    this.f63051j.mo60125d().notifyItemChanged(indexOf);
                                }
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (this.mUserVisibleHint) {
                    if (aVar2.f62878a == 1) {
                        FragmentActivity activity = getActivity();
                        if (aVar2.f62881d == 1) {
                            i2 = R.string.a5x;
                        } else {
                            i2 = R.string.we;
                        }
                        C10761a.m31399c((Context) activity, i2).mo25750a();
                        return;
                    }
                    FragmentActivity activity2 = getActivity();
                    if (aVar2.f62881d == 1) {
                        i = R.string.a63;
                    } else {
                        i = R.string.wf;
                    }
                    C10761a.m31383a((Context) activity2, i).mo25750a();
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f63053l == null) {
            this.f63053l = new C23071a(this, this);
        }
        this.f63053l.mo60111a(view, bundle);
        mo62039i();
    }

    /* renamed from: a */
    public final void mo61922a(MusicModel musicModel, C23819a aVar) {
        this.f63047f = musicModel;
        if (this.f63048g) {
            this.f63046e.mo86674a(musicModel, mo62004n());
        } else {
            this.f63046e.mo86680b(musicModel, mo62004n());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo62007p(), viewGroup, false);
    }

    /* renamed from: a */
    public final void mo61996a(final String str, final MusicModel musicModel, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
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
            if (musicModel.getMusic() == null || musicModel.getMusic().getChallenge() == null) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
            } else {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(musicModel.getMusic().getChallenge());
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(musicModel);
            mo61997a(str, musicModel, str2, activity);
        }
    }
}
