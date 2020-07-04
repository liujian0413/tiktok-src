package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39505b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42602b;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42605d;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42608f;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEMVAudioInfo;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.Collection;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.editor.ai */
public class C44016ai implements C44294cq {

    /* renamed from: a */
    public final EditViewModel f113884a;

    /* renamed from: b */
    public final VideoPublishEditModel f113885b = this.f113884a.mo29069f();

    /* renamed from: c */
    public final C39505b f113886c = new C39505b();

    /* renamed from: d */
    public final VEVideoPublishEditViewModel f113887d;

    /* renamed from: e */
    public String f113888e;

    /* renamed from: f */
    public final EditToolbarViewModel f113889f;

    /* renamed from: g */
    public final EditVolumeViewModel f113890g;

    /* renamed from: h */
    public final EditMusicCutViewModel f113891h;

    /* renamed from: i */
    public final FragmentActivity f113892i;

    /* renamed from: j */
    public final C44021aj f113893j;

    /* renamed from: com.ss.android.ugc.gamora.editor.ai$a */
    static final class C44017a implements C42602b {

        /* renamed from: a */
        final /* synthetic */ C44016ai f113894a;

        C44017a(C44016ai aiVar) {
            this.f113894a = aiVar;
        }

        /* renamed from: a */
        public final void mo104199a(AVMusic aVMusic, boolean z) {
            this.f113894a.mo106511a(aVMusic, z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ai$b */
    static final class C44018b implements C42602b {

        /* renamed from: a */
        final /* synthetic */ C44016ai f113895a;

        C44018b(C44016ai aiVar) {
            this.f113895a = aiVar;
        }

        /* renamed from: a */
        public final void mo104199a(AVMusic aVMusic, boolean z) {
            this.f113895a.mo106511a(aVMusic, z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ai$c */
    static final class C44019c extends Lambda implements C7562b<C42605d, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44016ai f113896a;

        C44019c(C44016ai aiVar) {
            this.f113896a = aiVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m139310a((C42605d) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139310a(C42605d dVar) {
            C7573i.m23587b(dVar, "result");
            JediViewModel a = C36113b.m116288a(this.f113896a.f113892i).mo91871a(EditLyricStickerViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java)");
            ((EditLyricStickerViewModel) a).mo106275g();
            this.f113896a.mo106512a(dVar);
            if (EditViewModel.m139162E()) {
                this.f113896a.f113893j.mo106523f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ai$d */
    static final class C44020d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44016ai f113897a;

        C44020d(C44016ai aiVar) {
            this.f113897a = aiVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m139311a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139311a() {
            this.f113897a.mo106519d();
            if (EditViewModel.m139162E()) {
                this.f113897a.f113893j.mo106523f();
            }
        }
    }

    /* renamed from: a */
    public void mo106513a(String str, AVMusic aVMusic, boolean z) {
    }

    /* renamed from: b */
    public int mo106516b() {
        return -1;
    }

    /* renamed from: e */
    public final String mo106520e() {
        return this.f113888e;
    }

    /* renamed from: d */
    public final void mo106519d() {
        C0052o k = this.f113887d.mo119519k();
        C7573i.m23582a((Object) k, "mViewModel.previewControlLiveData");
        k.setValue(C47516v.m148295a());
    }

    /* renamed from: a */
    public void mo106510a() {
        C0052o e = this.f113887d.mo119513e();
        C7573i.m23582a((Object) e, "mViewModel.previewMusicParams");
        e.setValue(new VEPreviewMusicParams());
        this.f113888e = this.f113885b.mMusicPath;
        this.f113885b.mMusicPath = null;
        this.f113885b.musicId = "";
        this.f113885b.previewStartTime = 0.0f;
        this.f113885b.isOriginalSound = false;
        this.f113885b.isCommerceMusic = false;
        this.f113885b.mMusicStart = 0;
        this.f113885b.mMusicOrigin = "";
        mo106515a(false);
        mo106517b(true);
        this.f113885b.musicVolume = 0.5f;
        C0052o k = this.f113887d.mo119519k();
        C7573i.m23582a((Object) k, "mViewModel.previewControlLiveData");
        k.setValue(C47516v.m148298b(0));
        k.setValue(C47516v.m148295a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106518c() {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f113885b
            java.lang.String r0 = r0.mStickerID
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0024
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = ","
            r4[r2] = r0
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.util.List r0 = kotlin.text.C7634n.m23768b(r3, r4, false, 0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = kotlin.collections.C7525m.m23504c(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            goto L_0x0025
        L_0x0024:
            r7 = r1
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f113885b
            java.util.List r0 = r0.challenges
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = kotlin.collections.C7525m.m23504c(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r0 = (com.p280ss.android.ugc.aweme.shortvideo.AVChallenge) r0
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = r0.cid
        L_0x0035:
            r8 = r1
            com.ss.android.ugc.aweme.shortvideo.edit.b r3 = r14.f113886c
            android.support.v4.app.FragmentActivity r0 = r14.f113892i
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            r5 = 110(0x6e, float:1.54E-43)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f113885b
            java.lang.String r6 = r0.mFirstStickerMusicIdsJson
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f113885b
            boolean r9 = r0.isAllowClearMusic()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f113885b
            java.lang.String r10 = r0.mShootWay
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r14.f113885b
            java.lang.String r11 = r0.creationId
            com.ss.android.ugc.gamora.editor.ai$c r0 = new com.ss.android.ugc.gamora.editor.ai$c
            r0.<init>(r14)
            r12 = r0
            kotlin.jvm.a.b r12 = (kotlin.jvm.p357a.C7562b) r12
            com.ss.android.ugc.gamora.editor.ai$d r0 = new com.ss.android.ugc.gamora.editor.ai$d
            r0.<init>(r14)
            r13 = r0
            kotlin.jvm.a.a r13 = (kotlin.jvm.p357a.C7561a) r13
            r3.mo98359a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44016ai.mo106518c():void");
    }

    /* renamed from: f */
    public final void mo106521f() {
        if (this.f113885b.isMvThemeVideoType()) {
            if (!C23477d.m77081a((Collection<T>) this.f113885b.mvCreateVideoData.musicIds)) {
                C35563c.f93246i.mo103848a((C42608f) C39360dw.m125725a()).mo103871a((C42602b) new C44017a(this)).mo103872a(this.f113885b.mvCreateVideoData.musicIds);
            }
        } else if (this.f113885b.isStatusVideoType() && !C23477d.m77081a((Collection<T>) this.f113885b.statusCreateVideoData.getMusicIds())) {
            C35563c.f93246i.mo103848a((C42608f) C39360dw.m125725a()).mo103871a((C42602b) new C44018b(this)).mo103872a(this.f113885b.statusCreateVideoData.getMusicIds());
        }
    }

    /* renamed from: a */
    public void mo106515a(boolean z) {
        this.f113889f.mo106407a(8, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo106517b(boolean z) {
        AVMusic b = C39360dw.m125725a().mo97931b();
        if (z) {
            b = null;
        }
        m139295a(b);
    }

    /* renamed from: a */
    private final void m139295a(AVMusic aVMusic) {
        if (aVMusic != null || this.f113885b.isReviewVideo()) {
            EditToolbarViewModel editToolbarViewModel = this.f113889f;
            Drawable a = C0683b.m2903a((Context) this.f113892i, (int) R.drawable.aq0);
            if (a == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) a, "ContextCompat.getDrawabl…edit_addmusic_complete)!!");
            editToolbarViewModel.mo106408a(a);
            return;
        }
        EditToolbarViewModel editToolbarViewModel2 = this.f113889f;
        Drawable a2 = C0683b.m2903a((Context) this.f113892i, (int) R.drawable.acz);
        if (a2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) a2, "ContextCompat.getDrawabl….drawable.ic_music_add)!!");
        editToolbarViewModel2.mo106408a(a2);
    }

    /* renamed from: a */
    public final void mo106512a(C42605d dVar) {
        C7573i.m23587b(dVar, "result");
        if (C7573i.m23585a((Object) dVar.f110761a, (Object) Boolean.valueOf(true))) {
            mo106510a();
            return;
        }
        if (!TextUtils.isEmpty(dVar.f110764d)) {
            mo106514a(dVar.f110764d, dVar.f110762b);
            if (dVar.f110763c != null) {
                AVMusicWaveBean a = C39312e.m125621a(dVar.f110763c);
                EditMusicCutViewModel editMusicCutViewModel = this.f113891h;
                AVMusic aVMusic = dVar.f110763c;
                if (aVMusic == null) {
                    C7573i.m23580a();
                }
                editMusicCutViewModel.mo106288a(a, aVMusic.getDuration(), 0);
            }
        }
    }

    public C44016ai(FragmentActivity fragmentActivity, C44021aj ajVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(ajVar, "musicCallback");
        this.f113892i = fragmentActivity;
        this.f113893j = ajVar;
        JediViewModel a = C36113b.m116288a(this.f113892i).mo91871a(EditViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
        this.f113884a = (EditViewModel) a;
        C0063u a2 = C0069x.m159a(this.f113892i).mo147a(VEVideoPublishEditViewModel.class);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java)");
        this.f113887d = (VEVideoPublishEditViewModel) a2;
        JediViewModel a3 = C36113b.m116288a(this.f113892i).mo91871a(EditToolbarViewModel.class);
        C7573i.m23582a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
        this.f113889f = (EditToolbarViewModel) a3;
        JediViewModel a4 = C36113b.m116288a(this.f113892i).mo91871a(EditVolumeViewModel.class);
        C7573i.m23582a((Object) a4, "JediViewModelProviders.o…umeViewModel::class.java)");
        this.f113890g = (EditVolumeViewModel) a4;
        JediViewModel a5 = C36113b.m116288a(this.f113892i).mo91871a(EditMusicCutViewModel.class);
        C7573i.m23582a((Object) a5, "JediViewModelProviders.o…CutViewModel::class.java)");
        this.f113891h = (EditMusicCutViewModel) a5;
    }

    /* renamed from: a */
    public void mo106511a(AVMusic aVMusic, boolean z) {
        VEMVAudioInfo vEMVAudioInfo;
        if (aVMusic != null && z) {
            this.f113885b.musicId = aVMusic.getMusicId();
            this.f113885b.previewStartTime = aVMusic.getPreviewStartTime();
            this.f113885b.isCommerceMusic = aVMusic.isCommerceMusic();
            this.f113885b.isOriginalSound = aVMusic.isOriginalSound();
            C15389d dVar = (C15389d) this.f113884a.mo106448i().getValue();
            if (dVar != null) {
                vEMVAudioInfo = dVar.mo38847g();
            } else {
                vEMVAudioInfo = null;
            }
            if (vEMVAudioInfo != null) {
                this.f113885b.mMusicStart = vEMVAudioInfo.trimIn;
                this.f113885b.mMusicEnd = vEMVAudioInfo.trimOut;
            } else {
                this.f113885b.mMusicStart = 0;
                if (C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic)) {
                    this.f113885b.mMusicEnd = Math.min(aVMusic.getPresenterDuration(), 60000);
                } else {
                    this.f113885b.mMusicEnd = Math.min(aVMusic.getDuration(), 60000);
                }
            }
            this.f113885b.mMusicOrigin = "edit_page_recommend";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo106514a(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            java.lang.String r0 = com.p280ss.android.ugc.aweme.imported.C32067c.m104094a(r0)
            java.lang.String r1 = "MusicModelUtils.getMusic…ger.inst().getCurMusic())"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            dmt.av.video.VEPreviewMusicParams r1 = new dmt.av.video.VEPreviewMusicParams
            r1.<init>()
            r1.f121606a = r11
            r2 = 0
            r1.f121607b = r2
            r1.f121611f = r0
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 != 0) goto L_0x0034
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0034:
            java.lang.String r4 = "PublishManager.inst().getCurMusic()!!"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            float r3 = r3.getPreviewStartTime()
            r1.f121612g = r3
        L_0x003f:
            int r8 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r11, r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136538a(r3)
            int r3 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r11, r3)
            r1.f121608c = r3
            com.ss.android.ugc.aweme.property.AVAB r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r4 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r3 = r3.mo93305a(r4)
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 != 0) goto L_0x0072
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0072:
            int r3 = r3.getShootDuration()
            if (r3 <= 0) goto L_0x00a6
            int r3 = r1.f121608c
            com.ss.android.ugc.aweme.shortvideo.dw r5 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r5 = r5.mo97931b()
            if (r5 != 0) goto L_0x0087
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0087:
            int r5 = r5.getShootDuration()
            int r3 = r3 - r5
            int r3 = java.lang.Math.abs(r3)
            if (r3 < r4) goto L_0x00a6
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 != 0) goto L_0x009f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x009f:
            int r3 = r3.getShootDuration()
            r1.f121609d = r3
            goto L_0x00aa
        L_0x00a6:
            int r3 = r1.f121608c
            r1.f121609d = r3
        L_0x00aa:
            dmt.av.video.VEVideoPublishEditViewModel r3 = r10.f113887d
            android.arch.lifecycle.o r3 = r3.mo119513e()
            java.lang.String r5 = "mViewModel.previewMusicParams"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            r3.setValue(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            java.lang.String r3 = r3.mMusicPath
            r10.f113888e = r3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            r3.mMusicPath = r11
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            r3.musicId = r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            r3.mMusicStart = r2
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 == 0) goto L_0x00e4
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r10.f113885b
            boolean r6 = r3.isCommerceMusic()
            r5.isCommerceMusic = r6
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r10.f113885b
            boolean r3 = r3.isOriginalSound()
            r5.isOriginalSound = r3
        L_0x00e4:
            com.ss.android.ugc.aweme.property.AVAB r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r5 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r3 = r3.mo93305a(r5)
            r5 = 60000(0xea60, float:8.4078E-41)
            if (r3 == 0) goto L_0x0100
            int r3 = r1.f121609d
            if (r3 <= 0) goto L_0x0100
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            int r6 = r1.f121609d
            int r5 = java.lang.Math.min(r6, r5)
            r3.mMusicEnd = r5
            goto L_0x010a
        L_0x0100:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            int r6 = r1.f121608c
            int r5 = java.lang.Math.min(r6, r5)
            r3.mMusicEnd = r5
        L_0x010a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            r3.mMusicOrigin = r12
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f113884a
            boolean r12 = r12.mo106461w()
            r3 = 1
            if (r12 != 0) goto L_0x012d
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f113884a
            boolean r12 = r12.mo106462x()
            if (r12 != 0) goto L_0x012d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            java.lang.String r12 = r12.mMusicPath
            if (r12 == 0) goto L_0x012d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            boolean r12 = r12.isStickPointMode
            if (r12 != 0) goto L_0x012d
            r12 = 1
            goto L_0x012e
        L_0x012d:
            r12 = 0
        L_0x012e:
            r10.mo106515a(r12)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            boolean r12 = r12.isMvThemeVideoType()
            if (r12 == 0) goto L_0x0156
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r12 = r12.mvCreateVideoData
            java.util.List<java.lang.String> r12 = r12.musicIds
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = com.p280ss.android.ugc.aweme.base.utils.C23477d.m77081a(r12)
            if (r12 != 0) goto L_0x0156
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r12 = r12.mvCreateVideoData
            java.util.List<java.lang.String> r12 = r12.musicIds
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L_0x0156
            r10.mo106515a(r2)
        L_0x0156:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            boolean r12 = r12.isStatusVideoType()
            if (r12 == 0) goto L_0x017f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r12 = r12.statusCreateVideoData
            java.util.List r12 = r12.getMusicIds()
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = com.p280ss.android.ugc.aweme.base.utils.C23477d.m77081a(r12)
            if (r12 != 0) goto L_0x017f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r12 = r12.statusCreateVideoData
            java.util.List r12 = r12.getMusicIds()
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L_0x017f
            r10.mo106515a(r2)
        L_0x017f:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            r12.mCurMusicLength = r8
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f113884a
            int r12 = r12.mo106435J()
            if (r12 <= r8) goto L_0x0192
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r12 = r10.f113889f
            r0 = 8
            r12.mo106421d(r0, r2)
        L_0x0192:
            r10.mo106517b(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            r0 = 1056964608(0x3f000000, float:0.5)
            r12.musicVolume = r0
            com.ss.android.ugc.gamora.editor.EditVolumeViewModel r12 = r10.f113890g
            r2 = 50
            r12.mo106475a(r2)
            dmt.av.video.VEVideoPublishEditViewModel r12 = r10.f113887d
            android.arch.lifecycle.o r12 = r12.mo119521m()
            java.lang.String r2 = "mViewModel.volumeChangeOpLiveData"
            kotlin.jvm.internal.C7573i.m23582a(r12, r2)
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r0 = com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r0)
            r12.setValue(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            boolean r12 = r12.isMvThemeVideoType()
            if (r12 == 0) goto L_0x01d9
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r12 = r12.mvCreateVideoData
            int r12 = r12.mvType
            if (r12 != r3) goto L_0x01d9
            com.ss.android.ugc.gamora.editor.aj r4 = r10.f113893j
            if (r11 != 0) goto L_0x01cb
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x01cb:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            int r6 = r12.mMusicStart
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            int r7 = r12.mMusicEnd
            r9 = 1
            r5 = r11
            r4.mo106522a(r5, r6, r7, r8, r9)
            return
        L_0x01d9:
            dmt.av.video.VEVideoPublishEditViewModel r11 = r10.f113887d
            android.arch.lifecycle.o r11 = r11.mo119519k()
            java.lang.String r12 = "mViewModel.previewControlLiveData"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            r2 = 0
            dmt.av.video.v r12 = dmt.p1861av.video.C47516v.m148298b(r2)
            r11.setValue(r12)
            dmt.av.video.v r12 = dmt.p1861av.video.C47516v.m148295a()
            r11.setValue(r12)
            com.ss.android.ugc.aweme.property.AVAB r11 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r12 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r11 = r11.mo93305a(r12)
            if (r11 == 0) goto L_0x0261
            com.ss.android.ugc.aweme.shortvideo.dw r11 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r11 = r11.mo97931b()
            if (r11 == 0) goto L_0x0261
            com.ss.android.ugc.aweme.shortvideo.dw r11 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r11 = r11.mo97931b()
            if (r11 != 0) goto L_0x0215
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0215:
            int r11 = r11.getShootDuration()
            if (r11 <= 0) goto L_0x0261
            int r11 = r1.f121608c
            com.ss.android.ugc.aweme.shortvideo.dw r12 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r12 = r12.mo97931b()
            if (r12 != 0) goto L_0x022a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x022a:
            int r12 = r12.getShootDuration()
            int r11 = r11 - r12
            int r11 = java.lang.Math.abs(r11)
            if (r11 < r4) goto L_0x0256
            com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r11 = r10.f113891h
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f113884a
            int r12 = r12.mo106435J()
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
            if (r0 != 0) goto L_0x024a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x024a:
            int r0 = r0.getShootDuration()
            int r12 = java.lang.Math.min(r12, r0)
            r11.mo106287a(r12)
            return
        L_0x0256:
            com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r11 = r10.f113891h
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f113884a
            int r12 = r12.mo106435J()
            r11.mo106287a(r12)
        L_0x0261:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44016ai.mo106514a(java.lang.String, java.lang.String):void");
    }
}
