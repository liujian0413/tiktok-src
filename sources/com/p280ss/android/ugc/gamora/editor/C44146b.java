package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.imported.C32067c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39313a;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39314b;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import dmt.p1861av.video.VEPreviewMusicParams;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.editor.b */
public final class C44146b extends C44016ai {

    /* renamed from: k */
    private AVMusic f114151k;

    /* renamed from: l */
    private boolean f114152l;

    /* renamed from: m */
    private String f114153m = this.f113885b.musicId;

    /* renamed from: n */
    private String f114154n = this.f113885b.mMusicOrigin;

    /* renamed from: o */
    private final EditMusicViewModel f114155o;

    /* renamed from: com.ss.android.ugc.gamora.editor.b$a */
    public static final class C44147a implements C39313a {

        /* renamed from: a */
        final /* synthetic */ C44146b f114156a;

        /* renamed from: b */
        final /* synthetic */ AVMusic f114157b;

        /* renamed from: a */
        public final void mo96524a(AVMusicWaveBean aVMusicWaveBean) {
            this.f114156a.f113891h.mo106288a(aVMusicWaveBean, this.f114157b.duration, 0);
        }

        C44147a(C44146b bVar, AVMusic aVMusic) {
            this.f114156a = bVar;
            this.f114157b = aVMusic;
        }
    }

    /* renamed from: a */
    public final void mo106510a() {
        super.mo106510a();
        m139719g();
        this.f114153m = "";
        this.f114154n = "";
        this.f114152l = false;
    }

    /* renamed from: b */
    public final int mo106516b() {
        if (this.f114152l) {
            Integer b = C35563c.f93246i.mo103867e().mo103929p().mo103934b();
            if (b != null) {
                return b.intValue();
            }
        }
        return -1;
    }

    /* renamed from: g */
    private final void m139719g() {
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
        String a = C32067c.m104094a(publishService.getCurMusic());
        C7573i.m23582a((Object) a, "MusicModelUtils.getMusic…ublishService().curMusic)");
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.f121606a = null;
        vEPreviewMusicParams.f121607b = 0;
        vEPreviewMusicParams.f121611f = a;
        vEPreviewMusicParams.f121608c = 0;
        vEPreviewMusicParams.f121609d = 0;
        IAVPublishService publishService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        C7573i.m23582a((Object) publishService2, "ServiceManager.get().get…ss.java).publishService()");
        if (publishService2.getCurMusic() != null) {
            IAVPublishService publishService3 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
            C7573i.m23582a((Object) publishService3, "ServiceManager.get().get…ss.java).publishService()");
            AVMusic curMusic = publishService3.getCurMusic();
            C7573i.m23582a((Object) curMusic, "ServiceManager.get().get…publishService().curMusic");
            vEPreviewMusicParams.f121612g = curMusic.getPreviewStartTime();
        }
        C0052o e = this.f113887d.mo119513e();
        C7573i.m23582a((Object) e, "mViewModel.previewMusicParams");
        e.setValue(vEPreviewMusicParams);
        this.f113888e = this.f113885b.mMusicPath;
        this.f113885b.mMusicPath = null;
        this.f113885b.musicId = a;
        this.f113885b.mMusicStart = 0;
        mo106515a(this.f113884a.mo106444a(this.f113885b.mMusicPath));
        mo106517b(false);
        this.f113885b.musicVolume = 0.5f;
        this.f114151k = null;
    }

    /* renamed from: a */
    public final void mo106515a(boolean z) {
        this.f114155o.mo106301a(z);
    }

    /* renamed from: a */
    public final void mo106511a(AVMusic aVMusic, boolean z) {
        super.mo106511a(aVMusic, z);
        if (z) {
            EditMusicViewModel editMusicViewModel = this.f114155o;
            if (aVMusic == null) {
                C7573i.m23580a();
            }
            editMusicViewModel.mo106300a(aVMusic);
        }
    }

    public C44146b(FragmentActivity fragmentActivity, C44021aj ajVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(ajVar, "musicCallback");
        super(fragmentActivity, ajVar);
        JediViewModel a = C36113b.m116288a(fragmentActivity).mo91871a(EditMusicViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…sicViewModel::class.java)");
        this.f114155o = (EditMusicViewModel) a;
    }

    /* renamed from: a */
    public final void mo106514a(String str, String str2) {
        super.mo106514a(str, str2);
        this.f114153m = C32067c.m104094a(C39360dw.m125725a().mo97931b());
        this.f114154n = str2;
        this.f114152l = false;
        this.f114151k = C39360dw.m125725a().mo97931b();
    }

    /* renamed from: a */
    public final void mo106513a(String str, AVMusic aVMusic, boolean z) {
        mo106515a(this.f113884a.mo106444a(str));
        if (aVMusic == null) {
            C39360dw.m125725a().mo97928a((AVMusic) null);
            m139719g();
            this.f114151k = null;
            this.f114152l = false;
            return;
        }
        long j = aVMusic.f99664id;
        AVMusic aVMusic2 = this.f114151k;
        if (aVMusic2 == null || j != aVMusic2.f99664id) {
            C39360dw.m125725a().mo97928a(aVMusic);
            m139718a(str, z, aVMusic);
            this.f114152l = true;
            if (C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic) && C39360dw.m125725a().mo97931b() != null) {
                AVMusic b = C39360dw.m125725a().mo97931b();
                if (b == null) {
                    C7573i.m23580a();
                }
                if (b.shootDuration > 0) {
                    EditMusicCutViewModel editMusicCutViewModel = this.f113891h;
                    AVMusic b2 = C39360dw.m125725a().mo97931b();
                    if (b2 == null) {
                        C7573i.m23580a();
                    }
                    editMusicCutViewModel.mo106287a(Math.min(b2.shootDuration, this.f113884a.mo106435J()));
                }
            }
            if (aVMusic.getMusicWaveData() != null) {
                AVMusicWaveBean a = C39312e.m125621a(aVMusic);
                EditMusicCutViewModel editMusicCutViewModel2 = this.f113891h;
                if (a == null) {
                    C7573i.m23580a();
                }
                editMusicCutViewModel2.mo106288a(a, aVMusic.duration, 0);
                return;
            }
            if (str != null) {
                C39314b.m125637a().mo97877a(str, (C39313a) new C44147a(this, aVMusic));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0222  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m139718a(java.lang.String r11, boolean r12, com.p280ss.android.ugc.aweme.shortvideo.AVMusic r13) {
        /*
            r10 = this;
            android.support.v4.app.FragmentActivity r0 = r10.f113892i
            com.ss.android.ugc.gamora.a.a r0 = com.p280ss.android.ugc.gamora.p1486a.C36113b.m116288a(r0)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel> r1 = com.p280ss.android.ugc.gamora.editor.EditLyricStickerViewModel.class
            com.bytedance.jedi.arch.JediViewModel r0 = r0.mo91871a(r1)
            java.lang.String r1 = "JediViewModelProviders.o…kerViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.gamora.editor.EditLyricStickerViewModel r0 = (com.p280ss.android.ugc.gamora.editor.EditLyricStickerViewModel) r0
            r0.mo106275g()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            java.lang.String r1 = "ServiceManager.get().get…ss.java).publishService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.getCurMusic()
            java.lang.String r0 = com.p280ss.android.ugc.aweme.imported.C32067c.m104094a(r0)
            java.lang.String r1 = "MusicModelUtils.getMusic…ublishService().curMusic)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            dmt.av.video.VEPreviewMusicParams r1 = new dmt.av.video.VEPreviewMusicParams
            r1.<init>()
            r1.f121606a = r11
            r2 = 0
            r1.f121607b = r2
            r1.f121611f = r0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r4 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r3 = r3.getService(r4)
            com.ss.android.ugc.aweme.services.IAVService r3 = (com.p280ss.android.ugc.aweme.services.IAVService) r3
            com.ss.android.ugc.aweme.services.video.IAVPublishService r3 = r3.publishService()
            java.lang.String r4 = "ServiceManager.get().get…ss.java).publishService()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.getCurMusic()
            if (r3 == 0) goto L_0x0083
            com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r4 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r3 = r3.getService(r4)
            com.ss.android.ugc.aweme.services.IAVService r3 = (com.p280ss.android.ugc.aweme.services.IAVService) r3
            com.ss.android.ugc.aweme.services.video.IAVPublishService r3 = r3.publishService()
            java.lang.String r4 = "ServiceManager.get().get…ss.java).publishService()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.getCurMusic()
            java.lang.String r4 = "ServiceManager.get().get…publishService().curMusic"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            float r3 = r3.getPreviewStartTime()
            r1.f121612g = r3
        L_0x0083:
            int r8 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r11, r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136538a(r3)
            int r3 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r11, r3)
            r1.f121608c = r3
            com.ss.android.ugc.aweme.property.AVAB r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r4 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r3 = r3.mo93305a(r4)
            if (r3 == 0) goto L_0x00ea
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 == 0) goto L_0x00ea
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 != 0) goto L_0x00b4
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b4:
            int r3 = r3.getShootDuration()
            if (r3 <= 0) goto L_0x00ea
            int r3 = r1.f121608c
            com.ss.android.ugc.aweme.shortvideo.dw r4 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r4 = r4.mo97931b()
            if (r4 != 0) goto L_0x00c9
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00c9:
            int r4 = r4.getShootDuration()
            int r3 = r3 - r4
            int r3 = java.lang.Math.abs(r3)
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00ea
            com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
            if (r3 != 0) goto L_0x00e3
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00e3:
            int r3 = r3.getShootDuration()
            r1.f121609d = r3
            goto L_0x00ee
        L_0x00ea:
            int r3 = r1.f121608c
            r1.f121609d = r3
        L_0x00ee:
            dmt.av.video.VEVideoPublishEditViewModel r3 = r10.f113887d
            android.arch.lifecycle.o r3 = r3.mo119513e()
            java.lang.String r4 = "mViewModel.previewMusicParams"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
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
            com.ss.android.ugc.aweme.property.AVAB r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r4 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r3 = r3.mo93305a(r4)
            r4 = 60000(0xea60, float:8.4078E-41)
            if (r3 == 0) goto L_0x012a
            int r3 = r1.f121609d
            if (r3 <= 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            int r1 = r1.f121609d
            int r1 = java.lang.Math.min(r1, r4)
            r3.mMusicEnd = r1
            goto L_0x0134
        L_0x012a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r10.f113885b
            int r1 = r1.f121608c
            int r1 = java.lang.Math.min(r1, r4)
            r3.mMusicEnd = r1
        L_0x0134:
            java.lang.String r1 = r10.f114153m
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0147
            boolean r1 = r1.equals(r0)
            if (r1 != r5) goto L_0x0147
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            java.lang.String r13 = r10.f114154n
            r12.mMusicOrigin = r13
            goto L_0x016e
        L_0x0147:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r10.f113885b
            if (r12 == 0) goto L_0x014e
            java.lang.String r6 = "edit_page_recommend"
            goto L_0x0150
        L_0x014e:
            java.lang.String r6 = "edit_page_recommend_favorite"
        L_0x0150:
            r1.mMusicOrigin = r6
            if (r12 == 0) goto L_0x016e
            if (r13 == 0) goto L_0x016e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            com.ss.android.ugc.aweme.common.LogPbBean r1 = r13.getLogPb()
            if (r1 == 0) goto L_0x0163
            java.lang.String r1 = r1.getImprId()
            goto L_0x0164
        L_0x0163:
            r1 = r3
        L_0x0164:
            r12.aiMusicLogPbImprId = r1
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            int r13 = r13.getComeFromForMod()
            r12.comFrom = r13
        L_0x016e:
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f113884a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r13 = r10.f113885b
            java.lang.String r13 = r13.mMusicPath
            r12.mo106444a(r13)
            r10.mo106517b(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            r12.mCurMusicLength = r8
            com.ss.android.ugc.gamora.editor.EditViewModel r12 = r10.f113884a
            int r12 = r12.mo106435J()
            if (r12 <= r8) goto L_0x0189
            r10.mo106515a(r2)
        L_0x0189:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            r13 = 1056964608(0x3f000000, float:0.5)
            r12.musicVolume = r13
            com.ss.android.ugc.gamora.editor.EditVolumeViewModel r12 = r10.f113890g
            r1 = 50
            r12.mo106475a(r1)
            dmt.av.video.VEVideoPublishEditViewModel r12 = r10.f113887d
            android.arch.lifecycle.o r12 = r12.mo119521m()
            java.lang.String r1 = "mViewModel.volumeChangeOpLiveData"
            kotlin.jvm.internal.C7573i.m23582a(r12, r1)
            com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r13 = com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r13)
            r12.setValue(r13)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            boolean r12 = r12.isMvThemeVideoType()
            if (r12 == 0) goto L_0x020f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r12 = r12.mvCreateVideoData
            int r12 = r12.mvType
            if (r12 != r5) goto L_0x020f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r12 = r12.mvCreateVideoData
            java.util.List<java.lang.String> r12 = r12.musicIds
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L_0x01fa
            com.ss.android.ugc.gamora.editor.EditViewModel r11 = r10.f113884a
            android.arch.lifecycle.o r11 = r11.mo106448i()
            java.lang.Object r11 = r11.getValue()
            com.ss.android.ugc.asve.b.d r11 = (com.p280ss.android.ugc.asve.p754b.C15389d) r11
            if (r11 == 0) goto L_0x01d6
            com.ss.android.vesdk.VEMVAudioInfo r3 = r11.mo38847g()
        L_0x01d6:
            if (r3 == 0) goto L_0x0244
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f113885b
            int r12 = r3.trimIn
            r11.mMusicStart = r12
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = r10.f113885b
            int r12 = r3.trimOut
            int r12 = java.lang.Math.min(r12, r4)
            r11.mMusicEnd = r12
            com.ss.android.ugc.gamora.editor.aj r4 = r10.f113893j
            java.lang.String r5 = r3.path
            java.lang.String r11 = "it.path"
            kotlin.jvm.internal.C7573i.m23582a(r5, r11)
            int r6 = r3.trimIn
            int r7 = r3.trimOut
            r9 = 1
            r4.mo106522a(r5, r6, r7, r8, r9)
            goto L_0x0244
        L_0x01fa:
            com.ss.android.ugc.gamora.editor.aj r4 = r10.f113893j
            if (r11 != 0) goto L_0x0201
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0201:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            int r6 = r12.mMusicStart
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12 = r10.f113885b
            int r7 = r12.mMusicEnd
            r9 = 1
            r5 = r11
            r4.mo106522a(r5, r6, r7, r8, r9)
            goto L_0x0244
        L_0x020f:
            android.support.v4.app.FragmentActivity r11 = r10.f113892i
            android.arch.lifecycle.Lifecycle r11 = r11.getLifecycle()
            java.lang.String r12 = "activity.lifecycle"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            android.arch.lifecycle.Lifecycle$State r11 = r11.mo54a()
            android.arch.lifecycle.Lifecycle$State r12 = android.arch.lifecycle.Lifecycle.State.RESUMED
            if (r11 != r12) goto L_0x0244
            dmt.av.video.VEVideoPublishEditViewModel r11 = r10.f113887d
            android.arch.lifecycle.o r11 = r11.mo119519k()
            java.lang.String r12 = "mViewModel.previewControlLiveData"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            dmt.av.video.v r12 = dmt.p1861av.video.C47516v.m148297b()
            r11.setValue(r12)
            r12 = 0
            dmt.av.video.v r12 = dmt.p1861av.video.C47516v.m148298b(r12)
            r11.setValue(r12)
            dmt.av.video.v r12 = dmt.p1861av.video.C47516v.m148295a()
            r11.setValue(r12)
        L_0x0244:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r11 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r12 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r11 = r11.getService(r12)
            com.ss.android.ugc.aweme.services.IAVService r11 = (com.p280ss.android.ugc.aweme.services.IAVService) r11
            com.ss.android.ugc.aweme.services.video.IAVPublishService r11 = r11.publishService()
            java.lang.String r12 = "ServiceManager.get().get…ss.java).publishService()"
            kotlin.jvm.internal.C7573i.m23582a(r11, r12)
            com.ss.android.ugc.aweme.shortvideo.AVMusic r11 = r11.getCurMusic()
            r10.f114151k = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44146b.m139718a(java.lang.String, boolean, com.ss.android.ugc.aweme.shortvideo.AVMusic):void");
    }
}
