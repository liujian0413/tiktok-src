package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.util.C6292i;
import com.bytedance.scene.group.C12620d;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20719d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p280ss.android.ugc.aweme.port.internal.C35612d;
import com.p280ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a.C39945a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.p1549a.C38466b;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38490n.C38492b;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40187b;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C41021z;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.impl.StickerViewServiceImpl;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.C42137ad;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42158ay;
import com.p280ss.android.ugc.aweme.tools.C42570p;
import com.p280ss.android.ugc.aweme.tools.C42586v;
import com.p280ss.android.ugc.aweme.tools.C42588x;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.C44643g;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.p280ss.android.ugc.gamora.recorder.exit.RecordExitViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ed */
public abstract class C39382ed extends C12620d implements IRecordingOperationPanel, C42158ay {

    /* renamed from: A */
    public static final String f102271A = "ed";

    /* renamed from: B */
    public View f102272B;

    /* renamed from: C */
    protected DefaultGesturePresenter f102273C;

    /* renamed from: D */
    public C44643g f102274D;

    /* renamed from: E */
    public boolean f102275E;

    /* renamed from: F */
    public Effect f102276F;

    /* renamed from: G */
    public C20719d f102277G;

    /* renamed from: H */
    public Runnable f102278H;

    /* renamed from: j */
    private C42156aw f102279j;

    /* renamed from: k */
    private ShortVideoContextViewModel f102280k;

    /* renamed from: l */
    private C39863fe f102281l;

    /* renamed from: J */
    public C42156aw mo97896J() {
        return null;
    }

    /* renamed from: N */
    public final Context mo97961N() {
        return this.f33526d_;
    }

    /* renamed from: a */
    public void mo97903a(boolean z) {
    }

    /* renamed from: b */
    public C38492b mo97904b() {
        return null;
    }

    /* renamed from: b */
    public void mo97905b(boolean z) {
    }

    /* renamed from: c */
    public void mo97906c() {
    }

    /* renamed from: c */
    public void mo97907c(boolean z) {
    }

    /* renamed from: d */
    public void mo97908d() {
    }

    /* renamed from: O */
    public final FragmentActivity mo97962O() {
        return (FragmentActivity) this.f33526d_;
    }

    /* renamed from: R */
    public final ShortVideoContext mo97965R() {
        return mo97964Q().f99791a;
    }

    /* renamed from: I */
    public final void mo30922I() {
        super.mo30922I();
        if (this.f102278H != null) {
            this.f102278H.run();
        }
    }

    /* renamed from: V */
    public final boolean mo97969V() {
        return getLifecycle().mo54a().equals(State.DESTROYED);
    }

    public void closeRecording() {
        mo97963P().mo103594a((Object) this, (C42155av) new C42570p());
    }

    public C0608j fragmentManager() {
        return mo97962O().getSupportFragmentManager();
    }

    /* renamed from: P */
    public final C42156aw mo97963P() {
        if (this.f102279j == null) {
            this.f102279j = ((C42158ay) mo97961N()).mo97896J();
        }
        return this.f102279j;
    }

    /* renamed from: Q */
    public final ShortVideoContextViewModel mo97964Q() {
        if (this.f102280k == null) {
            this.f102280k = (ShortVideoContextViewModel) C0069x.m159a(mo97962O()).mo147a(ShortVideoContextViewModel.class);
        }
        return this.f102280k;
    }

    /* renamed from: S */
    public final JSONObject mo97966S() {
        if (this.f33526d_ instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) this.f33526d_).mo101854n();
        }
        return new JSONObject();
    }

    /* renamed from: T */
    public final FaceStickerBean mo97967T() {
        if (this.f33526d_ instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) this.f33526d_).f107324j.mo100301b();
        }
        return FaceStickerBean.NONE;
    }

    public RemoteImageView backgroundView() {
        if (this.f33523b != null) {
            return (RemoteImageView) this.f33523b.findViewById(R.id.cq_);
        }
        return null;
    }

    public C40187b filterModule() {
        if (!(this.f33526d_ instanceof VideoRecordNewActivity) || !(((VideoRecordNewActivity) this.f33526d_).f107326l instanceof C40187b)) {
            return null;
        }
        return (C40187b) ((VideoRecordNewActivity) this.f33526d_).f107326l;
    }

    public int getCameraPos() {
        if (VERSION.SDK_INT < 19) {
            return 0;
        }
        Activity activity = this.f33526d_;
        activity.getClass();
        return ((VideoRecordNewActivity) activity).f107327m.mo100087f();
    }

    public C40189d videoRecorder() {
        if (this.f33526d_ instanceof C35612d) {
            return ((C35612d) this.f33526d_).mo90423a();
        }
        return null;
    }

    public void updateLiveBackgroundView() {
        RemoteImageView backgroundView = backgroundView();
        LayoutParams d = ((VideoRecordNewActivity) this.f33526d_).mo101841d();
        if (backgroundView != null && d != null) {
            LayoutParams layoutParams = (LayoutParams) backgroundView.getLayoutParams();
            layoutParams.width = d.width;
            layoutParams.height = d.height;
            layoutParams.topMargin = d.topMargin;
            layoutParams.bottomMargin = d.bottomMargin;
            backgroundView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: U */
    public final C43868d mo97968U() {
        final VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) this.f33526d_;
        C43868d dVar = new C43868d();
        dVar.mo106132a((IRecordingOperationPanel) this);
        dVar.mo106138a(mo97896J());
        dVar.mo106143b(videoRecordNewActivity.f107338x);
        dVar.mo106127a(mo97962O());
        dVar.mo106133a(mo97964Q().f99791a);
        dVar.mo106129a(videoRecordNewActivity.f107334t.getMediaController());
        dVar.mo106137a(videoRecordNewActivity.f107327m);
        dVar.mo106140a((C7541d<? extends C40994w>) new C7541d<C40994w>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C40994w getValue() {
                return videoRecordNewActivity.f107324j;
            }

            public final boolean isInitialized() {
                if (videoRecordNewActivity.f107324j != null) {
                    return true;
                }
                return false;
            }
        });
        dVar.mo106134a(videoRecordNewActivity.f107269J);
        dVar.mo106131a(videoRecordNewActivity.f107327m.mo100081b());
        dVar.mo106130a(videoRecordNewActivity.f107327m.f104644f);
        videoRecordNewActivity.getClass();
        dVar.mo106128a(C39791ee.m127408a(videoRecordNewActivity));
        dVar.f113659m = this.f102276F;
        dVar.mo106135a(videoRecordNewActivity.f107326l);
        dVar.mo106136a(videoRecordNewActivity.f107331q);
        dVar.mo106139a("VideoRecordNewActivity");
        dVar.mo106142b(videoRecordNewActivity.f107284Y);
        return dVar;
    }

    /* renamed from: f */
    public final void mo97970f(boolean z) {
        mo97909d(z);
        mo97905b(z);
        mo97907c(z);
    }

    public void onHidePanel(String str) {
        if ("livestreaming".equals(str)) {
            C42137ad adVar = new C42137ad(4);
            adVar.f109657b = true;
            mo97896J().mo103594a((Object) mo97961N(), (C42155av) adVar);
        }
    }

    public void onShowPanel(String str) {
        if ("livestreaming".equals(str)) {
            C42137ad adVar = new C42137ad(0);
            adVar.f109657b = true;
            mo97896J().mo103594a((Object) mo97961N(), (C42155av) adVar);
        }
    }

    public void setCameraPos(int i) {
        C42586v vVar;
        if (i == 1) {
            vVar = C42586v.m135306a();
        } else {
            vVar = C42586v.m135307b();
        }
        mo97963P().mo103594a((Object) this, (C42155av) vVar);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        this.f102281l = new C39863fe(getLifecycle());
        this.f102281l.mo99291a((RecordViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordViewModel.class), (C7326g<Boolean>) new C7326g<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                C39382ed.this.mo97970f(bool.booleanValue());
            }
        });
    }

    /* renamed from: d */
    public void mo97909d(boolean z) {
        if (!(this.f102272B == null || this.f33526d_ == null)) {
            RecordExitViewModel recordExitViewModel = (RecordExitViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordExitViewModel.class);
            RecordChooseMusicViewModel recordChooseMusicViewModel = (RecordChooseMusicViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordChooseMusicViewModel.class);
            int i = 4;
            if (this.f102275E) {
                this.f102272B.setVisibility(4);
                recordExitViewModel.mo107066a(true);
                recordChooseMusicViewModel.mo106933d(true);
                return;
            }
            if (z) {
                i = 0;
            }
            this.f102272B.setVisibility(i);
            recordExitViewModel.mo107066a(z);
            recordChooseMusicViewModel.mo106933d(z);
        }
    }

    public void onGameStickerChosen(FaceSticker faceSticker, String str) {
        if (this.f33526d_ != null && (this.f33526d_ instanceof VideoRecordNewActivity)) {
            mo97896J().mo103594a((Object) this.f33526d_, (C42155av) C42588x.m135309a((Object) new C39945a()));
        }
    }

    public void onStickerCancel(FaceSticker faceSticker, String str) {
        if (this.f33526d_ != null && (this.f33526d_ instanceof VideoRecordNewActivity)) {
            mo97896J().mo103594a((Object) this.f33526d_, (C42155av) C42588x.m135309a((Object) new C39945a()));
        }
    }

    public void onStickerChosen(FaceSticker faceSticker, String str) {
        if (this.f33526d_ != null && (this.f33526d_ instanceof VideoRecordNewActivity) && "livestreaming".equals(str)) {
            if (!C6292i.m19525a(faceSticker.tags) && faceSticker.tags.contains("transfer_touch")) {
                mo97896J().mo103594a((Object) this.f33526d_, (C42155av) C42588x.m135309a((Object) new C41021z(this.f33526d_, videoRecorder())));
            } else if (!C6292i.m19525a(faceSticker.types) && faceSticker.types.contains("AR")) {
                Point s = ((VideoRecordNewActivity) this.f33526d_).mo101863s();
                mo97896J().mo103594a((Object) this.f33526d_, (C42155av) C42588x.m135309a((Object) new C38466b(StickerViewServiceImpl.toFaceSticker(faceSticker), videoRecorder()).mo96394a(s.x, s.y)));
            } else if (C6292i.m19525a(faceSticker.types) || !faceSticker.types.contains("TouchGes")) {
                mo97896J().mo103594a((Object) this.f33526d_, (C42155av) C42588x.m135309a((Object) new C39945a()));
            } else {
                Point s2 = ((VideoRecordNewActivity) this.f33526d_).mo101863s();
                mo97896J().mo103594a((Object) this.f33526d_, (C42155av) C42588x.m135309a((Object) new C38466b(StickerViewServiceImpl.toFaceSticker(faceSticker), videoRecorder()).mo96394a(s2.x, s2.y)));
            }
        }
    }
}
