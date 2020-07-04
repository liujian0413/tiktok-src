package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.content.Intent;
import android.os.Message;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11497af;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11592h.C11593a;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.arch.C23274b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.services.video.IVideoRecordEntranceService;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.music.ui.JediMusicDetailFragment */
public abstract class JediMusicDetailFragment extends AmeBaseFragment implements C6310a, C11497af<C23274b>, C11592h, C33970a {

    /* renamed from: e */
    public C41654d f88249e;

    /* renamed from: f */
    public C23274b f88250f = new C23274b();

    /* renamed from: g */
    public C6309f f88251g = new C6309f(this);

    /* renamed from: h */
    protected C33963h f88252h;

    /* renamed from: i */
    private String f88253i;

    /* renamed from: j */
    private String f88254j;

    /* renamed from: k */
    private HashMap f88255k;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.JediMusicDetailFragment$a */
    static final class C33840a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JediMusicDetailFragment f88256a;

        C33840a(JediMusicDetailFragment jediMusicDetailFragment) {
            this.f88256a = jediMusicDetailFragment;
        }

        public final void run() {
            C41654d dVar = this.f88256a.f88249e;
            if (dVar != null && dVar.isShowing()) {
                dVar.setProgress(100);
            }
            this.f88256a.mo86466i();
        }
    }

    /* renamed from: a */
    public View mo86459a(int i) {
        if (this.f88255k == null) {
            this.f88255k = new HashMap();
        }
        View view = (View) this.f88255k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88255k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo86461a(MusicModel musicModel) {
        C7573i.m23587b(musicModel, "musicModel");
    }

    /* renamed from: g */
    public abstract String mo86465g();

    public void handleMsg(Message message) {
        C7573i.m23587b(message, "msg");
    }

    /* renamed from: o */
    public void mo86471o() {
        if (this.f88255k != null) {
            this.f88255k.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo86471o();
    }

    /* renamed from: a */
    public final void mo86462a(String str, MusicModel musicModel) {
        C7573i.m23587b(str, "musicFile");
        C7573i.m23587b(musicModel, "musicModel");
        Music music = musicModel.getMusic();
        C7573i.m23582a((Object) music, "musicModel.music");
        if (music.getChallenge() != null) {
            IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
            Music music2 = musicModel.getMusic();
            C7573i.m23582a((Object) music2, "musicModel.music");
            publishService.addChallenge(music2.getChallenge());
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        }
        Intent intent = new Intent();
        intent.putExtra("path", str);
        intent.putExtra("music_origin", "single_song");
        if (musicModel.getMusicWaveBean() != null) {
            intent.putExtra("music_wave_data", musicModel.getMusicWaveBean());
        }
        IAVPublishService publishService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        C7573i.m23582a((Object) publishService2, "ServiceManager.get().get…ss.java).publishService()");
        if (C7573i.m23585a((Object) "direct_shoot", (Object) publishService2.getShootWay())) {
            IAVPublishService publishService3 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
            C7573i.m23582a((Object) publishService3, "ServiceManager.get().get…ss.java).publishService()");
            if (2 == publishService3.getMusicChooseType()) {
                String str2 = "extra_clear_dialog_show_needed";
                IAVPublishService publishService4 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                C7573i.m23582a((Object) publishService4, "ServiceManager.get().get…ss.java).publishService()");
                intent.putExtra(str2, publishService4.getCurMusic() != null);
            }
        }
        intent.putExtra("reverse_video_record_show_planD", true);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(musicModel);
        intent.putExtra("shoot_way", mo86465g());
        m109026a(intent);
        if (!TextUtils.isEmpty(this.f88254j)) {
            intent.putStringArrayListExtra("reuse_sticker_ids", C38275x.m122271b(this.f88254j));
            m109027b(intent);
        }
        C33242an.m107315a(mo86465g());
        intent.putExtra("translation_type", 3);
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        boolean isRecording = ((IAVService) service).isRecording();
        Object service2 = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service2, "ServiceManager.get().get…e(IAVService::class.java)");
        IVideoRecordEntranceService videoRecordEntranceService = ((IAVService) service2).getVideoRecordEntranceService();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        videoRecordEntranceService.startToolPermissionActivity(activity, intent, true, true, isRecording);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo86460a(C33963h hVar) {
        C7573i.m23587b(hVar, "<set-?>");
        this.f88252h = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public C11585f mo29191e() {
        return C11593a.m34077d(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11593a.m34068a(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C11593a.m34075b(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C11593a.m34078e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C11593a.m34076c(this);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0067b mo29056f() {
        return this.f88250f;
    }

    /* renamed from: l */
    public final boolean mo86469l() {
        return isAdded();
    }

    public final void bq_() {
        C6726a.m20844b(new C33840a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C33963h mo86470n() {
        C33963h hVar = this.f88252h;
        if (hVar == null) {
            C7573i.m23583a("mMusicDetailDownloadHelper");
        }
        return hVar;
    }

    /* renamed from: i */
    public final void mo86466i() {
        C41654d dVar = this.f88249e;
        if (dVar != null && dVar.isShowing()) {
            dVar.dismiss();
            this.f88249e = null;
        }
    }

    /* renamed from: k */
    public final void mo86468k() {
        this.f88249e = C41654d.m132586b(getActivity(), getString(R.string.ch6));
        C41654d dVar = this.f88249e;
        if (dVar != null) {
            dVar.setIndeterminate(false);
        }
    }

    /* renamed from: j */
    public final void mo86467j() {
        C32656f.m105747a((Fragment) this, mo86465g(), "click_music_shoot", C42914ab.m136242a().mo104633a("login_title", C6399b.m19921a().getString(R.string.dtg)).f111445a);
    }

    /* renamed from: a */
    private final void m109026a(Intent intent) {
        if (TextUtils.isEmpty(this.f88253i)) {
            this.f88253i = UUID.randomUUID().toString();
        }
        intent.putExtra("creation_id", this.f88253i);
    }

    /* renamed from: b */
    private final void m109027b(Intent intent) {
        IAVSettingsService avSettingsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService();
        C7573i.m23582a((Object) avSettingsService, "ServiceManager.get().get…java).avSettingsService()");
        if (avSettingsService.isOpenMusicRecordWithSticker()) {
            ArrayList b = C38275x.m122271b(this.f88254j);
            C7573i.m23582a((Object) b, "ReuseStickerHelper.convert(mStickerIds)");
            if (!b.isEmpty()) {
                intent.putExtra("music_reuse_sticker_id", (String) b.get(0));
            }
        }
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* renamed from: a_ */
    public final void mo86463a_(int i, int i2) {
        C41654d dVar = this.f88249e;
        if (dVar != null) {
            if (i > i2) {
                dVar.setProgress(i2);
            } else {
                dVar.setProgress(i);
            }
            if (i >= 98 && this.f88249e != null) {
                dVar.setCancelable(true);
            }
        }
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34069a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34070a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C11593a.m34072a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11593a.m34071a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C11593a.m34073a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
