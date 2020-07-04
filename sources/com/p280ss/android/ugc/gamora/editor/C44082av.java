package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12640l;
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.group.ScenePlaceHolderView;
import com.p280ss.android.ttve.model.MVInfoBean;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.asve.p756d.C15450d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.effect.C27430i;
import com.p280ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.effect.p1200d.C27422a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.p1001al.C22490b;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35536ag;
import com.p280ss.android.ugc.aweme.port.p1479in.C35536ag.C35537a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.MusicWaveDataListener;
import com.p280ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39314b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39502ax;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39504az;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39537i;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39438b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39452g;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audiorecord.C39475c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39591h;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C39613e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.TextStickerCompileResult;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39701c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1570d.C39754a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a.C39507a;
import com.p280ss.android.ugc.aweme.shortvideo.music.C40079a.C40081b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.cover.C40154a;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.p1583a.C40093a;
import com.p280ss.android.ugc.aweme.shortvideo.net.C40199b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40687ah;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40696e.C40697a;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.C41064b;
import com.p280ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42046i;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42060b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42088k;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.editor.C44174bg.C44179b;
import com.p280ss.android.ugc.gamora.editor.C44299cu.C44301b;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.status.C44751c;
import com.p280ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47458g;
import dmt.p1861av.video.C47479s;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.av */
public final class C44082av extends C12604b implements C44021aj, C44396a {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f114017j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "previewScene", "getPreviewScene()Lcom/ss/android/ugc/gamora/editor/EditPreviewScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "titleBarScene", "getTitleBarScene()Lcom/ss/android/ugc/gamora/editor/EditTitlebarScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "bottomBarScene", "getBottomBarScene()Lcom/ss/android/ugc/gamora/editor/EditBottomBarScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "stickerDeleteScene", "getStickerDeleteScene()Lcom/ss/android/ugc/gamora/editor/EditStickerDeleteScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "gestureScene", "getGestureScene()Lcom/ss/android/ugc/gamora/editor/EditGestureScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "filterIndicatorScene", "getFilterIndicatorScene()Lcom/ss/android/ugc/gamora/editor/EditFilterIndicatorScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "cornerScene", "getCornerScene()Lcom/ss/android/ugc/gamora/editor/EditCornerScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "audioEffectScene", "getAudioEffectScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "filterScene", "getFilterScene()Lcom/ss/android/ugc/gamora/editor/EditFilterScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "stickerScene", "getStickerScene()Lcom/ss/android/ugc/gamora/editor/EditStickerScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "effectComponent", "getEffectComponent()Lcom/ss/android/ugc/aweme/effect/services/IEffectComponent;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "autoEnhanceScene", "getAutoEnhanceScene()Lcom/ss/android/ugc/gamora/editor/EditAutoEnhanceScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "stickerPanelScene", "getStickerPanelScene()Lcom/ss/android/ugc/gamora/editor/EditStickerPanelScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "volumeScene", "getVolumeScene()Lcom/ss/android/ugc/gamora/editor/EditVolumeScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "musicCutScene", "getMusicCutScene()Lcom/ss/android/ugc/gamora/editor/EditMusicCutScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "musicScene", "getMusicScene()Lcom/ss/android/ugc/gamora/editor/EditMusicScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "audioRecordScene", "getAudioRecordScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "subtitleScene", "getSubtitleScene()Lcom/ss/android/ugc/gamora/editor/EditSubtitleScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44082av.class), "editDebugInfo", "getEditDebugInfo()Lcom/ss/android/ugc/aweme/shortvideo/edit/EditorDebugInfo;"))};

    /* renamed from: x */
    public static final C44083a f114018x = new C44083a(null);

    /* renamed from: A */
    private final C7541d f114019A = C7546e.m23569a(new C44120e(this));

    /* renamed from: B */
    private final C7541d f114020B = C7546e.m23569a(new C44111ax(this));

    /* renamed from: C */
    private final C7541d f114021C = C7546e.m23569a(new C44129n(this));

    /* renamed from: D */
    private final C7541d f114022D = C7546e.m23569a(new C44127l(this));

    /* renamed from: E */
    private final C7541d f114023E = C7546e.m23569a(new C44124i(this));

    /* renamed from: F */
    private final C7541d f114024F = C7546e.m23569a(new C44114b(this));

    /* renamed from: G */
    private final C7541d f114025G = C7546e.m23569a(new C44128m(this));

    /* renamed from: H */
    private final C7541d f114026H = C7546e.m23569a(new C44113az(this));

    /* renamed from: I */
    private final C7541d f114027I = C7546e.m23569a(new C44126k(this));

    /* renamed from: J */
    private final C7541d f114028J = C7546e.m23569a(new C44119d(this));

    /* renamed from: K */
    private final C7541d f114029K = C7546e.m23569a(new C44112ay(this));

    /* renamed from: L */
    private final C7541d f114030L = C7546e.m23569a(new C44117bc(this));

    /* renamed from: M */
    private final C7541d f114031M = C7546e.m23569a(new C44096ak(this));

    /* renamed from: N */
    private final C7541d f114032N = C7546e.m23569a(new C44097al(this));

    /* renamed from: O */
    private final C7541d f114033O = C7546e.m23569a(new C44118c(this));

    /* renamed from: P */
    private final C7541d f114034P = C7546e.m23569a(new C44115ba(this));

    /* renamed from: Q */
    private EditPreviewViewModel f114035Q;

    /* renamed from: R */
    private EditAudioRecordModel f114036R;

    /* renamed from: S */
    private EditLyricStickerViewModel f114037S;

    /* renamed from: T */
    private EditCornerViewModel f114038T;

    /* renamed from: U */
    private EditStickerPanelViewModel f114039U;

    /* renamed from: V */
    private EditAudioEffectViewModel f114040V;

    /* renamed from: W */
    private EditFilterViewModel f114041W;

    /* renamed from: X */
    private EditAutoEnhanceViewModel f114042X;

    /* renamed from: Y */
    private EditAudioRecordModel f114043Y;

    /* renamed from: Z */
    private EditSubtitleViewModel f114044Z;

    /* renamed from: aa */
    private EditMusicViewModel f114045aa;

    /* renamed from: ab */
    private C40687ah f114046ab;

    /* renamed from: ac */
    private C39504az f114047ac;

    /* renamed from: ad */
    private C41653c f114048ad;

    /* renamed from: ae */
    private final C7541d f114049ae = C7546e.m23569a(C44125j.f114128a);

    /* renamed from: af */
    private StatusViewModel f114050af;

    /* renamed from: k */
    public final C39754a f114051k = new C39754a();

    /* renamed from: l */
    public C44299cu f114052l;

    /* renamed from: m */
    public VEVideoPublishEditViewModel f114053m;

    /* renamed from: n */
    public EditViewModel f114054n;

    /* renamed from: o */
    public EditToolbarViewModel f114055o;

    /* renamed from: p */
    public VideoPublishEditModel f114056p;

    /* renamed from: q */
    public EditStickerViewModel f114057q;

    /* renamed from: r */
    public EditMusicCutViewModel f114058r;

    /* renamed from: s */
    public DmtLoadingLayout f114059s;

    /* renamed from: t */
    public boolean f114060t;

    /* renamed from: u */
    public C44294cq f114061u;

    /* renamed from: v */
    public final C44362u f114062v = new C44362u();

    /* renamed from: w */
    public C44317cv f114063w;

    /* renamed from: y */
    private final C7541d f114064y = C7546e.m23569a(new C44108au(this));

    /* renamed from: z */
    private final C7541d f114065z = C7546e.m23569a(new C44116bb(this));

    /* renamed from: com.ss.android.ugc.gamora.editor.av$a */
    public static final class C44083a {
        private C44083a() {
        }

        public /* synthetic */ C44083a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$aa */
    static final class C44084aa extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114066a;

        /* renamed from: com.ss.android.ugc.gamora.editor.av$aa$a */
        static final class C44085a<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ MVInfoBean f114067a;

            /* renamed from: b */
            final /* synthetic */ C44084aa f114068b;

            C44085a(MVInfoBean mVInfoBean, C44084aa aaVar) {
                this.f114067a = mVInfoBean;
                this.f114068b = aaVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<StickerItemModel> call() {
                return C44751c.m141248a(this.f114068b.f114066a.mo106576J().mo96987K(), this.f114068b.f114066a.mo106576J().mo106567L(), this.f114067a);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.av$aa$b */
        static final class C44086b<TTaskResult, TContinuationResult> implements C1591g<List<? extends StickerItemModel>, Void> {

            /* renamed from: a */
            final /* synthetic */ C44084aa f114069a;

            C44086b(C44084aa aaVar) {
                this.f114069a = aaVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<List<StickerItemModel>> hVar) {
                C7573i.m23582a((Object) hVar, "task");
                List list = (List) hVar.mo6890e();
                if (list != null) {
                    this.f114069a.f114066a.mo106598a(list);
                }
                C44215br brVar = this.f114069a.f114066a.mo106577L().f114262m;
                if (brVar != null) {
                    brVar.mo30922I();
                }
                return null;
            }
        }

        C44084aa(C44082av avVar) {
            this.f114066a = avVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139657a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139657a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C6921a.m21555a("receive prepare done event in edit page");
            this.f114066a.mo106616an();
            C39537i Q = this.f114066a.mo106582Q();
            Context t = this.f114066a.mo31012t();
            if (t == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) t, "sceneContext!!");
            View view = this.f114066a.f33523b;
            C7573i.m23582a((Object) view, "view");
            ViewParent parent = view.getParent();
            if (parent != null) {
                Q.mo98397a(t, (ViewGroup) parent, C44082av.m139571b(this.f114066a).mo29069f().videoFps());
                if (C44082av.m139533a(this.f114066a).isStatusVideoType() && !C44082av.m139533a(this.f114066a).mIsFromDraft && C44082av.m139533a(this.f114066a).statusCreateVideoData.getStatusType() == 2) {
                    C15389d dVar = (C15389d) C44082av.m139571b(this.f114066a).mo106448i().getValue();
                    if (dVar != null) {
                        MVInfoBean e = dVar.mo38840e();
                        if (e != null) {
                            C1592h.m7853a((Callable<TResult>) new C44085a<TResult>(e, this)).mo6876a((C1591g<TResult, TContinuationResult>) new C44086b<TResult,TContinuationResult>(this), C1592h.f5958b);
                            return;
                        }
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ab */
    static final class C44087ab<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114070a;

        C44087ab(C44082av avVar) {
            this.f114070a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            this.f114070a.mo106587V();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ac */
    static final class C44088ac<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114071a;

        C44088ac(C44082av avVar) {
            this.f114071a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            this.f114071a.mo106588W();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ad */
    static final class C44089ad<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114072a;

        C44089ad(C44082av avVar) {
            this.f114072a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            this.f114072a.mo106589X();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ae */
    static final class C44090ae<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114073a;

        C44090ae(C44082av avVar) {
            this.f114073a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            int i;
            if (bool != null) {
                DmtLoadingLayout dmtLoadingLayout = this.f114073a.f114059s;
                if (dmtLoadingLayout != null) {
                    if (bool.booleanValue()) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    dmtLoadingLayout.setVisibility(i);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$af */
    static final class C44091af<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114074a;

        C44091af(C44082av avVar) {
            this.f114074a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                if (bool.booleanValue()) {
                    C44082av avVar = this.f114074a;
                    C44299cu cuVar = this.f114074a.f114052l;
                    if (cuVar == null) {
                        C7573i.m23580a();
                    }
                    avVar.mo30945d((C12629j) cuVar);
                } else {
                    C44082av avVar2 = this.f114074a;
                    C44299cu cuVar2 = this.f114074a.f114052l;
                    if (cuVar2 == null) {
                        C7573i.m23580a();
                    }
                    avVar2.mo30940c((C12629j) cuVar2);
                }
                C44299cu cuVar3 = this.f114074a.f114052l;
                if (cuVar3 != null) {
                    cuVar3.mo106777a(bool.booleanValue());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ag */
    static final class C44092ag<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114075a;

        C44092ag(C44082av avVar) {
            this.f114075a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C7573i.m23582a((Object) bool, "it");
                if (bool.booleanValue()) {
                    C44378z zVar = this.f114075a.mo106577L().f114261l;
                    if (zVar != null) {
                        C39591h G = zVar.mo30920G();
                        if (G != null) {
                            G.mo98628a(C44082av.m139533a(this.f114075a).infoStickerModel);
                        }
                    }
                } else {
                    C44378z zVar2 = this.f114075a.mo106577L().f114261l;
                    if (zVar2 != null) {
                        C39591h G2 = zVar2.mo30920G();
                        if (G2 != null) {
                            G2.mo98654b(true, false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ah */
    public static final class C44093ah implements C44301b {

        /* renamed from: a */
        final /* synthetic */ C44082av f114076a;

        C44093ah(C44082av avVar) {
            this.f114076a = avVar;
        }

        /* renamed from: a */
        public final void mo106626a(boolean z) {
            if (z) {
                C44215br brVar = this.f114076a.mo106577L().f114262m;
                if (brVar != null) {
                    brVar.mo106733a(false);
                }
            } else {
                C44215br brVar2 = this.f114076a.mo106577L().f114262m;
                if (brVar2 != null) {
                    brVar2.mo106713J();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ai */
    public static final class C44094ai implements C40697a {

        /* renamed from: a */
        final /* synthetic */ C44082av f114077a;

        public final void bU_() {
            this.f114077a.mo106577L().bU_();
        }

        /* renamed from: f */
        public final void mo100877f() {
            this.f114077a.mo106577L().mo100877f();
        }

        C44094ai(C44082av avVar) {
            this.f114077a = avVar;
        }

        /* renamed from: a */
        public final void mo100875a(Effect effect, String str) {
            C7573i.m23587b(effect, "effect");
            this.f114077a.mo106577L().mo100875a(effect, str);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$aj */
    static final class C44095aj extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114078a;

        C44095aj(C44082av avVar) {
            this.f114078a = avVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139669a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139669a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            switch (i) {
                case 1:
                    this.f114078a.mo106604ab();
                    return;
                case 2:
                    this.f114078a.mo106590Y();
                    return;
                case 3:
                    this.f114078a.mo106591Z();
                    return;
                case 4:
                    this.f114078a.mo106603aa();
                    return;
                case 5:
                    this.f114078a.mo106607ae();
                    return;
                case 6:
                    this.f114078a.mo106605ac();
                    return;
                case 7:
                    this.f114078a.mo106609ag();
                    return;
                case 8:
                    this.f114078a.mo106608af();
                    return;
                case 9:
                    this.f114078a.mo106611ai();
                    return;
                case 10:
                    this.f114078a.mo106612aj();
                    return;
                case 11:
                    this.f114078a.mo106614al();
                    return;
                case 12:
                    this.f114078a.mo106615am();
                    return;
                case 13:
                    this.f114078a.mo106606ad();
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ak */
    static final class C44096ak extends Lambda implements C7561a<C44022ak> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114079a;

        C44096ak(C44082av avVar) {
            this.f114079a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44022ak invoke() {
            C44022ak akVar = new C44022ak();
            akVar.mo106526a((C44021aj) this.f114079a);
            this.f114079a.mo30925a((int) R.id.bko, (C12629j) akVar, "EditMusicCutScene");
            return akVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$al */
    static final class C44097al extends Lambda implements C7561a<C44038al> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114080a;

        C44097al(C44082av avVar) {
            this.f114080a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44038al invoke() {
            C44038al alVar = new C44038al();
            this.f114080a.mo106594a(alVar);
            this.f114080a.mo30925a((int) R.id.bko, (C12629j) alVar, "MusicScene");
            return alVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$am */
    static final class C44098am implements C40093a {

        /* renamed from: a */
        final /* synthetic */ C44082av f114081a;

        /* renamed from: b */
        final /* synthetic */ boolean f114082b;

        /* renamed from: c */
        final /* synthetic */ boolean f114083c;

        /* renamed from: d */
        final /* synthetic */ Runnable f114084d;

        C44098am(C44082av avVar, boolean z, boolean z2, Runnable runnable) {
            this.f114081a = avVar;
            this.f114082b = z;
            this.f114083c = z2;
            this.f114084d = runnable;
        }

        /* renamed from: a */
        public final void mo96653a() {
            this.f114081a.mo106602a(false, this.f114082b, this.f114083c, this.f114084d, true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$an */
    static final class C44099an<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114085a;

        /* renamed from: b */
        final /* synthetic */ boolean f114086b;

        /* renamed from: c */
        final /* synthetic */ boolean f114087c;

        /* renamed from: d */
        final /* synthetic */ Runnable f114088d;

        C44099an(C44082av avVar, boolean z, boolean z2, Runnable runnable) {
            this.f114085a = avVar;
            this.f114086b = z;
            this.f114087c = z2;
            this.f114088d = runnable;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Void> hVar) {
            final List list;
            C15389d ar = this.f114085a.mo106620ar();
            if (ar != null) {
                list = C44751c.m141249a(C44082av.m139533a(this.f114085a).infoStickerModel, ar);
            } else {
                list = null;
            }
            new C40154a(this.f114085a.mo106620ar(), C44082av.m139533a(this.f114085a).statusCreateVideoData.getVideoCoverImgPath(), C44082av.m139533a(this.f114085a).statusCreateVideoData.getVideoCoverStartTime(), new C40093a(this) {

                /* renamed from: a */
                final /* synthetic */ C44099an f114089a;

                {
                    this.f114089a = r1;
                }

                /* renamed from: a */
                public final void mo96653a() {
                    List<Number> list = list;
                    if (list != null) {
                        for (Number intValue : list) {
                            int intValue2 = intValue.intValue();
                            C15389d ar = this.f114089a.f114085a.mo106620ar();
                            if (ar != null) {
                                ar.mo38843f(intValue2);
                            }
                        }
                    }
                    this.f114089a.f114085a.mo106602a(false, this.f114089a.f114086b, this.f114089a.f114087c, this.f114089a.f114088d, false);
                }
            });
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ao */
    static final class C44101ao<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114091a;

        C44101ao(C44082av avVar) {
            this.f114091a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C6921a.m21555a("receive FirstFrameVisible event in edit page");
            this.f114091a.mo106583R();
            this.f114091a.mo106584S();
            this.f114091a.mo106585T();
            this.f114091a.mo106586U();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ap */
    public static final class C44102ap implements Callable<Pair<Integer, AVMusicWaveBean>> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114092a;

        /* renamed from: b */
        final /* synthetic */ String f114093b;

        /* renamed from: c */
        final /* synthetic */ int f114094c;

        /* renamed from: d */
        final /* synthetic */ int f114095d;

        /* renamed from: e */
        final /* synthetic */ boolean f114096e;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<Integer, AVMusicWaveBean> call() {
            if (C44082av.m139571b(this.f114092a).mo106448i().getValue() == null) {
                return null;
            }
            Object value = C44082av.m139571b(this.f114092a).mo106448i().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            int a = ((C15389d) value).mo38781a(this.f114093b, this.f114094c, this.f114095d);
            Object value2 = C44082av.m139571b(this.f114092a).mo106448i().getValue();
            if (value2 == null) {
                C7573i.m23580a();
            }
            ((C15389d) value2).mo38879v();
            if (a < 0 || !this.f114096e) {
                return new Pair<>(Integer.valueOf(a), null);
            }
            return new Pair<>(Integer.valueOf(a), ((IAVService) ServiceManager.get().getService(IAVService.class)).getAvMusicWaveBean(this.f114093b, true, null));
        }

        C44102ap(C44082av avVar, String str, int i, int i2, boolean z) {
            this.f114092a = avVar;
            this.f114093b = str;
            this.f114094c = i;
            this.f114095d = i2;
            this.f114096e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$aq */
    public static final class C44103aq implements C1591g<Pair<Integer, AVMusicWaveBean>, Void> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114097a;

        /* renamed from: b */
        final /* synthetic */ String f114098b;

        /* renamed from: c */
        final /* synthetic */ boolean f114099c;

        /* renamed from: d */
        final /* synthetic */ int f114100d;

        /* renamed from: e */
        final /* synthetic */ int f114101e;

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x019d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(bolts.C1592h<android.util.Pair<java.lang.Integer, com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean>> r7) {
            /*
                r6 = this;
                com.ss.android.ugc.gamora.editor.av r0 = r6.f114097a
                r0.mo106621as()
                r0 = 0
                if (r7 != 0) goto L_0x0009
                return r0
            L_0x0009:
                java.lang.Object r1 = r7.mo6890e()
                android.util.Pair r1 = (android.util.Pair) r1
                boolean r2 = r7.mo6889d()
                if (r2 != 0) goto L_0x01a5
                boolean r7 = r7.mo6887c()
                if (r7 != 0) goto L_0x01a5
                if (r1 == 0) goto L_0x01a5
                java.lang.Object r7 = r1.first
                if (r7 == 0) goto L_0x01a5
                java.lang.Object r7 = r1.first
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r2 = 0
                int r7 = kotlin.jvm.internal.C7573i.m23576a(r7, r2)
                if (r7 >= 0) goto L_0x0032
                goto L_0x01a5
            L_0x0032:
                com.ss.android.ugc.gamora.editor.av r7 = r6.f114097a
                r3 = 1
                boolean r7 = r7.m139584g(false)
                if (r7 == 0) goto L_0x0051
                com.ss.android.ugc.gamora.editor.av r7 = r6.f114097a
                android.content.Context r7 = r7.mo31011s()
                com.ss.android.ugc.gamora.editor.av r3 = r6.f114097a
                r4 = 2131824985(0x7f111159, float:1.9282813E38)
                java.lang.String r3 = r3.mo30999a(r4)
                com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31387a(r7, r3)
                r7.mo25750a()
            L_0x0051:
                java.lang.Object r7 = r1.second
                com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r7 = (com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean) r7
                com.ss.android.ugc.gamora.editor.av r1 = r6.f114097a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44082av.m139571b(r1)
                android.arch.lifecycle.o r1 = r1.mo106448i()
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L_0x0066
                return r0
            L_0x0066:
                com.ss.android.ugc.gamora.editor.av r1 = r6.f114097a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44082av.m139571b(r1)
                android.arch.lifecycle.o r1 = r1.mo106448i()
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L_0x0079
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0079:
                com.ss.android.ugc.asve.b.d r1 = (com.p280ss.android.ugc.asve.p754b.C15389d) r1
                int r1 = r1.mo38860l()
                com.ss.android.ugc.aweme.property.AVAB r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
                com.ss.android.ugc.aweme.property.AVAB$Property r4 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
                boolean r3 = r3.mo93305a(r4)
                if (r3 == 0) goto L_0x00f4
                com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
                if (r3 == 0) goto L_0x00f4
                com.ss.android.ugc.aweme.shortvideo.dw r3 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r3.mo97931b()
                if (r3 != 0) goto L_0x00a0
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00a0:
                int r3 = r3.getShootDuration()
                if (r3 <= 0) goto L_0x00f4
                java.lang.String r3 = r6.f114098b
                int r3 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r3, r2)
                com.ss.android.ugc.aweme.shortvideo.dw r4 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r4 = r4.mo97931b()
                if (r4 != 0) goto L_0x00b9
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00b9:
                int r4 = r4.getShootDuration()
                int r4 = r3 - r4
                int r4 = java.lang.Math.abs(r4)
                r5 = 1000(0x3e8, float:1.401E-42)
                if (r4 < r5) goto L_0x00e6
                com.ss.android.ugc.gamora.editor.av r3 = r6.f114097a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r3 = com.p280ss.android.ugc.gamora.editor.C44082av.m139580e(r3)
                com.ss.android.ugc.aweme.shortvideo.dw r4 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r4 = r4.mo97931b()
                if (r4 != 0) goto L_0x00da
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00da:
                int r4 = r4.getShootDuration()
                int r4 = java.lang.Math.min(r1, r4)
                r3.mo106287a(r4)
                goto L_0x00fd
            L_0x00e6:
                com.ss.android.ugc.gamora.editor.av r4 = r6.f114097a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r4 = com.p280ss.android.ugc.gamora.editor.C44082av.m139580e(r4)
                int r3 = java.lang.Math.min(r1, r3)
                r4.mo106287a(r3)
                goto L_0x00fd
            L_0x00f4:
                com.ss.android.ugc.gamora.editor.av r3 = r6.f114097a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r3 = com.p280ss.android.ugc.gamora.editor.C44082av.m139580e(r3)
                r3.mo106287a(r1)
            L_0x00fd:
                boolean r3 = r6.f114099c
                if (r3 == 0) goto L_0x010c
                com.ss.android.ugc.gamora.editor.av r3 = r6.f114097a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r3 = com.p280ss.android.ugc.gamora.editor.C44082av.m139580e(r3)
                int r4 = r6.f114100d
                r3.mo106288a(r7, r4, r2)
            L_0x010c:
                com.ss.android.ugc.gamora.editor.av r7 = r6.f114097a
                android.app.Activity r7 = r7.f33526d_
                if (r7 == 0) goto L_0x019d
                android.support.v4.app.FragmentActivity r7 = (android.support.p022v4.app.FragmentActivity) r7
                android.arch.lifecycle.w r7 = android.arch.lifecycle.C0069x.m159a(r7)
                java.lang.Class<com.ss.android.ugc.aweme.effect.EditEffectVideoModel> r2 = com.p280ss.android.ugc.aweme.effect.EditEffectVideoModel.class
                android.arch.lifecycle.u r7 = r7.mo147a(r2)
                java.lang.String r2 = "ViewModelProviders.of(ac…ctVideoModel::class.java)"
                kotlin.jvm.internal.C7573i.m23582a(r7, r2)
                com.ss.android.ugc.aweme.effect.EditEffectVideoModel r7 = (com.p280ss.android.ugc.aweme.effect.EditEffectVideoModel) r7
                android.arch.lifecycle.o r7 = r7.mo70338d()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r7.setValue(r2)
                com.ss.android.ugc.gamora.editor.av r7 = r6.f114097a
                android.app.Activity r7 = r7.f33526d_
                if (r7 == 0) goto L_0x0195
                android.support.v4.app.FragmentActivity r7 = (android.support.p022v4.app.FragmentActivity) r7
                com.ss.android.ugc.gamora.a.a r7 = com.p280ss.android.ugc.gamora.p1486a.C36113b.m116288a(r7)
                java.lang.Class<com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel> r2 = com.p280ss.android.ugc.gamora.editor.EditInfoStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r7 = r7.mo91871a(r2)
                java.lang.String r2 = "JediViewModelProviders.o…kerViewModel::class.java)"
                kotlin.jvm.internal.C7573i.m23582a(r7, r2)
                com.ss.android.ugc.gamora.editor.EditInfoStickerViewModel r7 = (com.p280ss.android.ugc.gamora.editor.EditInfoStickerViewModel) r7
                r7.mo106246a(r1)
                com.ss.android.ugc.gamora.editor.av r7 = r6.f114097a
                android.arch.lifecycle.Lifecycle r7 = r7.getLifecycle()
                java.lang.String r1 = "lifecycle"
                kotlin.jvm.internal.C7573i.m23582a(r7, r1)
                android.arch.lifecycle.Lifecycle$State r7 = r7.mo54a()
                android.arch.lifecycle.Lifecycle$State r1 = android.arch.lifecycle.Lifecycle.State.RESUMED
                if (r7 != r1) goto L_0x017f
                com.ss.android.ugc.gamora.editor.av r7 = r6.f114097a
                dmt.av.video.VEVideoPublishEditViewModel r7 = com.p280ss.android.ugc.gamora.editor.C44082av.m139582f(r7)
                android.arch.lifecycle.o r7 = r7.mo119519k()
                java.lang.String r1 = "publishEditViewModel.getPreviewControlLiveData()"
                kotlin.jvm.internal.C7573i.m23582a(r7, r1)
                int r1 = r6.f114101e
                long r1 = (long) r1
                dmt.av.video.v r1 = dmt.p1861av.video.C47516v.m148298b(r1)
                r7.setValue(r1)
                dmt.av.video.v r1 = dmt.p1861av.video.C47516v.m148295a()
                r7.setValue(r1)
            L_0x017f:
                com.ss.android.ugc.gamora.editor.av r7 = r6.f114097a
                com.ss.android.ugc.gamora.editor.cq r7 = r7.mo106580O()
                com.ss.android.ugc.gamora.editor.av r1 = r6.f114097a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44082av.m139571b(r1)
                java.lang.String r2 = r6.f114098b
                boolean r1 = r1.mo106444a(r2)
                r7.mo106515a(r1)
                return r0
            L_0x0195:
                kotlin.TypeCastException r7 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r7.<init>(r0)
                throw r7
            L_0x019d:
                kotlin.TypeCastException r7 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
                r7.<init>(r0)
                throw r7
            L_0x01a5:
                com.ss.android.ugc.gamora.editor.av r7 = r6.f114097a
                android.content.Context r7 = r7.mo31011s()
                com.ss.android.ugc.gamora.editor.av r1 = r6.f114097a
                r2 = 2131824984(0x7f111158, float:1.9282811E38)
                java.lang.String r1 = r1.mo30999a(r2)
                com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r7, r1)
                r7.mo25750a()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44082av.C44103aq.then(bolts.h):java.lang.Void");
        }

        C44103aq(C44082av avVar, String str, boolean z, int i, int i2) {
            this.f114097a = avVar;
            this.f114098b = str;
            this.f114099c = z;
            this.f114100d = i;
            this.f114101e = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ar */
    static final class C44104ar implements C12640l {

        /* renamed from: a */
        final /* synthetic */ C44082av f114102a;

        C44104ar(C44082av avVar) {
            this.f114102a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C44066as mo31032a(ClassLoader classLoader, String str, Bundle bundle) {
            C7573i.m23587b(classLoader, "<anonymous parameter 0>");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            C44066as asVar = new C44066as();
            asVar.mo106569a(this.f114102a.mo106581P());
            return asVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$as */
    static final class C44105as implements C12640l {

        /* renamed from: a */
        final /* synthetic */ C44082av f114103a;

        C44105as(C44082av avVar) {
            this.f114103a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C44174bg mo31032a(ClassLoader classLoader, String str, Bundle bundle) {
            C7573i.m23587b(classLoader, "<anonymous parameter 0>");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            C44174bg bgVar = new C44174bg();
            bgVar.mo106700a(this.f114103a.f114062v);
            bgVar.mo106699a((C44295cr) this.f114103a.mo96987K());
            bgVar.f114253H = new C44179b(this) {

                /* renamed from: a */
                final /* synthetic */ C44105as f114104a;

                {
                    this.f114104a = r1;
                }
            };
            return bgVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$at */
    static final class C44107at implements C12640l {

        /* renamed from: a */
        final /* synthetic */ C44082av f114105a;

        C44107at(C44082av avVar) {
            this.f114105a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C44363v mo31032a(ClassLoader classLoader, String str, Bundle bundle) {
            C7573i.m23587b(classLoader, "<anonymous parameter 0>");
            C7573i.m23587b(str, "<anonymous parameter 1>");
            C44363v vVar = new C44363v();
            this.f114105a.mo106597a(vVar);
            return vVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$au */
    static final class C44108au extends Lambda implements C7561a<C44066as> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114106a;

        C44108au(C44082av avVar) {
            this.f114106a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44066as invoke() {
            C12629j a = this.f114106a.mo30924a("EditPreviewScene");
            if (a == null) {
                C7573i.m23580a();
            }
            return (C44066as) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$av */
    static final class C44109av implements MusicWaveDataListener {

        /* renamed from: a */
        final /* synthetic */ C44082av f114107a;

        /* renamed from: b */
        final /* synthetic */ int f114108b;

        C44109av(C44082av avVar, int i) {
            this.f114107a = avVar;
            this.f114108b = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFinish(java.lang.Object r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.property.AVAB r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
                com.ss.android.ugc.aweme.property.AVAB$Property r1 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
                boolean r0 = r0.mo93305a(r1)
                if (r0 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
                if (r0 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
                if (r0 != 0) goto L_0x0021
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0021:
                int r0 = r0.getShootDuration()
                if (r0 <= 0) goto L_0x0048
                com.ss.android.ugc.gamora.editor.av r0 = r3.f114107a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44082av.m139580e(r0)
                int r1 = r3.f114108b
                com.ss.android.ugc.aweme.shortvideo.dw r2 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r2 = r2.mo97931b()
                if (r2 != 0) goto L_0x003c
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x003c:
                int r2 = r2.getShootDuration()
                int r1 = java.lang.Math.min(r1, r2)
                r0.mo106287a(r1)
                goto L_0x0053
            L_0x0048:
                com.ss.android.ugc.gamora.editor.av r0 = r3.f114107a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44082av.m139580e(r0)
                int r1 = r3.f114108b
                r0.mo106287a(r1)
            L_0x0053:
                com.ss.android.ugc.gamora.editor.av r0 = r3.f114107a
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = com.p280ss.android.ugc.gamora.editor.C44082av.m139533a(r0)
                java.lang.String r0 = r0.mMusicPath
                r1 = 1
                int r0 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r0, r1)
                com.ss.android.ugc.gamora.editor.av r1 = r3.f114107a
                com.ss.android.ugc.gamora.editor.EditMusicCutViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44082av.m139580e(r1)
                if (r4 == 0) goto L_0x006f
                com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean r4 = (com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean) r4
                r2 = 0
                r1.mo106288a(r4, r0, r2)
                return
            L_0x006f:
                kotlin.TypeCastException r4 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44082av.C44109av.onFinish(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$aw */
    static final class C44110aw implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f114109a;

        C44110aw(OnClickListener onClickListener) {
            this.f114109a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            OnClickListener onClickListener = this.f114109a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ax */
    static final class C44111ax extends Lambda implements C7561a<C44168bd> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114110a;

        C44111ax(C44082av avVar) {
            this.f114110a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44168bd invoke() {
            C44168bd bdVar = new C44168bd();
            this.f114110a.mo30925a((int) R.id.acm, (C12629j) bdVar, "EditStickerDeleteScene");
            return bdVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ay */
    static final class C44112ay extends Lambda implements C7561a<C44170be> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114111a;

        C44112ay(C44082av avVar) {
            this.f114111a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44170be invoke() {
            C44170be beVar = new C44170be();
            this.f114111a.mo106595a(beVar);
            this.f114111a.mo30925a((int) R.id.bko, (C12629j) beVar, "EditStickerPanelScene");
            return beVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$az */
    static final class C44113az extends Lambda implements C7561a<C44174bg> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114112a;

        C44113az(C44082av avVar) {
            this.f114112a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44174bg invoke() {
            C12629j a = this.f114112a.mo30924a("EditStickerScene");
            if (a == null) {
                C7573i.m23580a();
            }
            return (C44174bg) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$b */
    static final class C44114b extends Lambda implements C7561a<C39452g> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114113a;

        C44114b(C44082av avVar) {
            this.f114113a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C39452g invoke() {
            C39452g gVar = new C39452g();
            this.f114113a.mo30925a((int) R.id.bko, (C12629j) gVar, "EditAudioEffectScene");
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$ba */
    static final class C44115ba extends Lambda implements C7561a<C44213bq> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114114a;

        C44115ba(C44082av avVar) {
            this.f114114a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44213bq invoke() {
            C44378z zVar = this.f114114a.mo106577L().f114261l;
            if (zVar == null) {
                C7573i.m23580a();
            }
            C44213bq bqVar = new C44213bq(zVar.mo30920G());
            this.f114114a.mo30925a((int) R.id.bko, (C12629j) bqVar, "EditSubtitleScene");
            return bqVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$bb */
    static final class C44116bb extends Lambda implements C7561a<C44229bt> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114115a;

        C44116bb(C44082av avVar) {
            this.f114115a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44229bt invoke() {
            C12629j a = this.f114115a.mo30924a("EditTitleBarScene");
            if (a == null) {
                C7573i.m23580a();
            }
            return (C44229bt) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$bc */
    static final class C44117bc extends Lambda implements C7561a<C44274cj> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114116a;

        C44117bc(C44082av avVar) {
            this.f114116a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44274cj invoke() {
            C44274cj cjVar = new C44274cj();
            this.f114116a.mo30925a((int) R.id.bko, (C12629j) cjVar, "EditVolumeScene");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$c */
    static final class C44118c extends Lambda implements C7561a<C39475c> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114117a;

        C44118c(C44082av avVar) {
            this.f114117a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C39475c invoke() {
            C39475c cVar = new C39475c();
            this.f114117a.mo30925a((int) R.id.bko, (C12629j) cVar, "EditAudioRecordScene");
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$d */
    static final class C44119d extends Lambda implements C7561a<C44318d> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114118a;

        C44119d(C44082av avVar) {
            this.f114118a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44318d invoke() {
            C44318d dVar = new C44318d();
            this.f114118a.mo106596a(dVar);
            this.f114118a.mo30925a((int) R.id.bko, (C12629j) dVar, "EditAutoEnhanceScene");
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$e */
    static final class C44120e extends Lambda implements C7561a<C44325g> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114119a;

        C44120e(C44082av avVar) {
            this.f114119a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44325g invoke() {
            C12629j a = this.f114119a.mo30924a("EditBottomBarScene");
            if (a == null) {
                C7573i.m23580a();
            }
            return (C44325g) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$f */
    public static final class C44121f implements C35537a {

        /* renamed from: a */
        final /* synthetic */ C44082av f114120a;

        C44121f(C44082av avVar) {
            this.f114120a = avVar;
        }

        /* renamed from: a */
        public final void mo90362a(String[] strArr, int[] iArr) {
            boolean z;
            if (!(strArr == null || iArr == null)) {
                boolean z2 = true;
                if (strArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (iArr.length != 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        if (iArr[0] == 0) {
                            this.f114120a.mo106613ak();
                            return;
                        }
                        Activity activity = this.f114120a.f33526d_;
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        C10761a.m31399c((Context) activity, (int) R.string.aj6).mo25750a();
                        return;
                    }
                }
            }
            Activity activity2 = this.f114120a.f33526d_;
            if (activity2 == null) {
                C7573i.m23580a();
            }
            C10761a.m31399c((Context) activity2, (int) R.string.aj6).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$g */
    static final class C44122g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44082av f114121a;

        C44122g(C44082av avVar) {
            this.f114121a = avVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f114121a.mo106622at();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$h */
    static final class C44123h<TTaskResult, TContinuationResult> implements C1591g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114122a;

        /* renamed from: b */
        final /* synthetic */ boolean f114123b;

        /* renamed from: c */
        final /* synthetic */ boolean f114124c;

        /* renamed from: d */
        final /* synthetic */ boolean f114125d;

        /* renamed from: e */
        final /* synthetic */ Runnable f114126e;

        C44123h(C44082av avVar, boolean z, boolean z2, boolean z3, Runnable runnable) {
            this.f114122a = avVar;
            this.f114123b = z;
            this.f114124c = z2;
            this.f114125d = z3;
            this.f114126e = runnable;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Void> hVar) {
            this.f114122a.mo106621as();
            if (this.f114123b) {
                C44082av.m139535a(C44082av.m139533a(this.f114122a));
                Activity activity = this.f114122a.f33526d_;
                if (activity != null) {
                    activity.finish();
                }
            } else {
                this.f114122a.mo106624b(this.f114124c, this.f114125d, this.f114126e);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$i */
    static final class C44124i extends Lambda implements C7561a<C44337l> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114127a;

        C44124i(C44082av avVar) {
            this.f114127a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44337l invoke() {
            C12629j a = this.f114127a.mo30924a("EditCornerScene");
            if (a == null) {
                C7573i.m23580a();
            }
            return (C44337l) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$j */
    static final class C44125j extends Lambda implements C7561a<C39537i> {

        /* renamed from: a */
        public static final C44125j f114128a = new C44125j();

        C44125j() {
            super(0);
        }

        /* renamed from: a */
        private static C39537i m139698a() {
            return new C39537i();
        }

        public final /* synthetic */ Object invoke() {
            return m139698a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$k */
    static final class C44126k extends Lambda implements C7561a<C27422a> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114129a;

        C44126k(C44082av avVar) {
            this.f114129a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27422a invoke() {
            C27422a a = C35574k.m114859a().mo70093h().mo70532a();
            Activity activity = this.f114129a.f33526d_;
            if (activity != null) {
                a.mo70496a(new C27430i((FragmentActivity) activity));
                this.f114129a.mo30925a((int) R.id.bko, a.mo70497b(), "EditEffectScene");
                return a;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$l */
    static final class C44127l extends Lambda implements C7561a<C44345p> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114130a;

        C44127l(C44082av avVar) {
            this.f114130a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44345p invoke() {
            C12629j a = this.f114130a.mo30924a("EditFilterIndicatorScene");
            if (a == null) {
                C7573i.m23580a();
            }
            return (C44345p) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$m */
    static final class C44128m extends Lambda implements C7561a<C44350r> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114131a;

        C44128m(C44082av avVar) {
            this.f114131a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44350r invoke() {
            C44350r rVar = new C44350r();
            this.f114131a.mo30925a((int) R.id.bko, (C12629j) rVar, "EditFilterScene");
            return rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$n */
    static final class C44129n extends Lambda implements C7561a<C44363v> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114132a;

        C44129n(C44082av avVar) {
            this.f114132a = avVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44363v invoke() {
            C12629j a = this.f114132a.mo30924a("EditGestureScene");
            if (a == null) {
                C7573i.m23580a();
            }
            return (C44363v) a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$o */
    static final class C44130o<TTaskResult, TContinuationResult> implements C1591g<C39613e, C39613e> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114133a;

        /* renamed from: b */
        final /* synthetic */ C44054ap f114134b;

        C44130o(C44082av avVar, C44054ap apVar) {
            this.f114133a = avVar;
            this.f114134b = apVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C39613e> hVar) {
            C39613e eVar = (C39613e) hVar.mo6890e();
            if (eVar != null) {
                C44054ap apVar = this.f114134b;
                if (apVar == null) {
                    C7573i.m23580a();
                }
                String Q = apVar.mo106553Q();
                String str = eVar.stickerPath;
                String str2 = "";
                int i = eVar.index;
                C15389d ar = this.f114133a.mo106620ar();
                if (ar == null) {
                    C7573i.m23580a();
                }
                StickerItemModel stickerItemModel = new StickerItemModel(Q, str, str2, i, false, 0, ar.mo38860l());
                stickerItemModel.type = 1;
                stickerItemModel.isImageStickerLayer = true;
                this.f114133a.mo106592a(stickerItemModel);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$p */
    static final class C44131p<TTaskResult, TContinuationResult> implements C1591g<C39613e, Void> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114135a;

        C44131p(C44082av avVar) {
            this.f114135a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C39613e> hVar) {
            this.f114135a.mo106619aq();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$q */
    static final class C44132q<TTaskResult, TContinuationResult> implements C1591g<List<? extends TextStickerCompileResult>, Void> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114136a;

        C44132q(C44082av avVar) {
            this.f114136a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<List<TextStickerCompileResult>> hVar) {
            int i;
            int l;
            for (TextStickerCompileResult textStickerCompileResult : (List) hVar.mo6890e()) {
                if (textStickerCompileResult != null) {
                    TextStickerData textStickerData = textStickerCompileResult.textStickerData;
                    String b = C42046i.m133660b().mo15979b((Object) textStickerData);
                    if (textStickerData.hasTimeData()) {
                        i = textStickerData.mStartTime;
                    } else {
                        i = 0;
                    }
                    if (textStickerData.hasTimeData()) {
                        l = textStickerData.mEndTime;
                    } else {
                        C15389d ar = this.f114136a.mo106620ar();
                        if (ar == null) {
                            C7573i.m23580a();
                        }
                        l = ar.mo38860l();
                    }
                    int i2 = l;
                    StringBuilder sb = new StringBuilder("text_sticker_");
                    sb.append(textStickerCompileResult.index);
                    StickerItemModel stickerItemModel = new StickerItemModel(sb.toString(), textStickerCompileResult.stickerPath, b, textStickerCompileResult.index, false, i, i2);
                    stickerItemModel.type = 2;
                    stickerItemModel.isImageStickerLayer = true;
                    this.f114136a.mo106592a(stickerItemModel);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$r */
    static final class C44133r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44082av f114137a;

        C44133r(C44082av avVar) {
            this.f114137a = avVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f114137a.mo106591Z();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$s */
    public static final class C44134s extends C42060b {

        /* renamed from: a */
        final /* synthetic */ C44082av f114138a;

        C44134s(C44082av avVar) {
            this.f114138a = avVar;
        }

        /* renamed from: e */
        public final boolean mo98462e(MotionEvent motionEvent) {
            return this.f114138a.mo106577L().mo106706ae();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$t */
    public static final class C44135t extends C34861a {

        /* renamed from: a */
        final /* synthetic */ C44082av f114139a;

        /* renamed from: d */
        public final void mo74768d() {
            if (this.f114139a.f114060t) {
                this.f114139a.f114060t = false;
                this.f114139a.mo106599a(false);
                return;
            }
            C44082av.m139571b(this.f114139a).mo106443a(true, false);
            if (!C44082av.m139571b(this.f114139a).mo106457r() && C44082av.m139576c(this.f114139a).f113758d.f114387c) {
                C44082av.m139576c(this.f114139a).mo106413b(1, true);
            }
        }

        C44135t(C44082av avVar) {
            this.f114139a = avVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$u */
    public static final class C44136u implements C40081b {

        /* renamed from: a */
        final /* synthetic */ C44082av f114140a;

        /* renamed from: b */
        final /* synthetic */ C44038al f114141b;

        /* renamed from: c */
        public final void mo99783c() {
        }

        /* renamed from: b */
        public final void mo99782b() {
            this.f114140a.mo106610ah();
        }

        /* renamed from: a */
        public final void mo99780a() {
            this.f114140a.mo106580O().mo106518c();
        }

        /* renamed from: d */
        public final void mo99784d() {
            if (C44082av.m139571b(this.f114140a).mo106435J() <= C44082av.m139533a(this.f114140a).mCurMusicLength) {
                this.f114140a.f114060t = true;
                this.f114141b.mo30921H();
                C44082av.m139578d(this.f114140a).mo106364h().setValue(Boolean.valueOf(false));
            }
        }

        C44136u(C44082av avVar, C44038al alVar) {
            this.f114140a = avVar;
            this.f114141b = alVar;
        }

        /* renamed from: a */
        public final void mo99781a(String str, AVMusic aVMusic, boolean z) {
            this.f114140a.mo106580O().mo106513a(str, aVMusic, z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$v */
    static final class C44137v<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114142a;

        C44137v(C44082av avVar) {
            this.f114142a = avVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            C44082av avVar = this.f114142a;
            if (bool == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) bool, "it!!");
            avVar.mo106623b(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$w */
    static final class C44138w extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114143a;

        C44138w(C44082av avVar) {
            this.f114143a = avVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139714a((C11585f) obj, (Boolean) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139714a(C11585f fVar, Boolean bool) {
            C7573i.m23587b(fVar, "$receiver");
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    this.f114143a.mo30945d((C12629j) this.f114143a.mo106579N());
                } else {
                    this.f114143a.mo30940c((C12629j) this.f114143a.mo106579N());
                }
                this.f114143a.mo106579N().mo98328a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$x */
    static final class C44139x extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114144a;

        C44139x(C44082av avVar) {
            this.f114144a = avVar;
            super(2);
        }

        /* renamed from: a */
        private void m139715a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            this.f114144a.mo106578M().mo106539L();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139715a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$y */
    static final class C44140y extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114145a;

        C44140y(C44082av avVar) {
            this.f114145a = avVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139716a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139716a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            View h_ = this.f114145a.mo31004h_(R.id.bko);
            C7573i.m23582a((Object) h_, "requireViewById<FrameLayout>(R.id.layout_viewstub)");
            FrameLayout frameLayout = (FrameLayout) h_;
            LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = i;
                frameLayout.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.av$z */
    static final class C44141z extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44082av f114146a;

        C44141z(C44082av avVar) {
            this.f114146a = avVar;
            super(2);
        }

        /* renamed from: a */
        private void m139717a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f114146a.mo106617ao();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139717a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: aA */
    private final C44350r m139539aA() {
        return (C44350r) this.f114025G.getValue();
    }

    /* renamed from: aB */
    private final C27422a m139540aB() {
        return (C27422a) this.f114027I.getValue();
    }

    /* renamed from: aC */
    private final C44318d m139541aC() {
        return (C44318d) this.f114028J.getValue();
    }

    /* renamed from: aD */
    private final C44170be m139542aD() {
        return (C44170be) this.f114029K.getValue();
    }

    /* renamed from: aE */
    private final C44274cj m139543aE() {
        return (C44274cj) this.f114030L.getValue();
    }

    /* renamed from: aF */
    private final C44022ak m139544aF() {
        return (C44022ak) this.f114031M.getValue();
    }

    /* renamed from: aG */
    private final C44213bq m139545aG() {
        return (C44213bq) this.f114034P.getValue();
    }

    /* renamed from: au */
    private final C44229bt m139565au() {
        return (C44229bt) this.f114065z.getValue();
    }

    /* renamed from: av */
    private final C44325g m139566av() {
        return (C44325g) this.f114019A.getValue();
    }

    /* renamed from: aw */
    private final C44363v m139567aw() {
        return (C44363v) this.f114021C.getValue();
    }

    /* renamed from: ax */
    private final C44345p m139568ax() {
        return (C44345p) this.f114022D.getValue();
    }

    /* renamed from: ay */
    private final C44337l m139569ay() {
        return (C44337l) this.f114023E.getValue();
    }

    /* renamed from: az */
    private final C39452g m139570az() {
        return (C39452g) this.f114024F.getValue();
    }

    /* renamed from: J */
    public final C44066as mo106576J() {
        return (C44066as) this.f114064y.getValue();
    }

    /* renamed from: K */
    public final C44168bd mo96987K() {
        return (C44168bd) this.f114020B.getValue();
    }

    /* renamed from: L */
    public final C44174bg mo106577L() {
        return (C44174bg) this.f114026H.getValue();
    }

    /* renamed from: M */
    public final C44038al mo106578M() {
        return (C44038al) this.f114032N.getValue();
    }

    /* renamed from: N */
    public final C39475c mo106579N() {
        return (C39475c) this.f114033O.getValue();
    }

    /* renamed from: Q */
    public final C39537i mo106582Q() {
        return (C39537i) this.f114049ae.getValue();
    }

    /* renamed from: T */
    public final void mo106585T() {
        m139556aR();
    }

    /* renamed from: a */
    public final void mo106601a(boolean z, boolean z2, boolean z3, Runnable runnable) {
        mo106602a(true, z2, z3, runnable, true);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
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
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo106593a(C40687ah ahVar) {
        C7573i.m23587b(ahVar, "stickerChallengeManager");
        this.f114046ab = ahVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        ScenePlaceHolderView scenePlaceHolderView = (ScenePlaceHolderView) mo31004h_(R.id.dke);
        scenePlaceHolderView.setSceneName(C44229bt.class.getName());
        scenePlaceHolderView.setSceneTag("EditTitleBarScene");
        ScenePlaceHolderView scenePlaceHolderView2 = (ScenePlaceHolderView) mo31004h_(R.id.cyr);
        scenePlaceHolderView2.setSceneName(C44325g.class.getName());
        scenePlaceHolderView2.setSceneTag("EditBottomBarScene");
        ScenePlaceHolderView scenePlaceHolderView3 = (ScenePlaceHolderView) mo31004h_(R.id.ac6);
        scenePlaceHolderView3.setSceneName(C44337l.class.getName());
        scenePlaceHolderView3.setSceneTag("EditCornerScene");
        ScenePlaceHolderView scenePlaceHolderView4 = (ScenePlaceHolderView) mo31004h_(R.id.ac7);
        scenePlaceHolderView4.setSceneName(C44345p.class.getName());
        scenePlaceHolderView4.setSceneTag("EditFilterIndicatorScene");
        ScenePlaceHolderView scenePlaceHolderView5 = (ScenePlaceHolderView) mo31004h_(R.id.ace);
        scenePlaceHolderView5.setSceneName(C44066as.class.getName());
        scenePlaceHolderView5.setSceneTag("EditPreviewScene");
        scenePlaceHolderView5.setSceneComponentFactory(new C44104ar(this));
        ScenePlaceHolderView scenePlaceHolderView6 = (ScenePlaceHolderView) mo31004h_(R.id.acl);
        scenePlaceHolderView6.setSceneName(C44174bg.class.getName());
        scenePlaceHolderView6.setSceneTag("EditStickerScene");
        scenePlaceHolderView6.setSceneComponentFactory(new C44105as(this));
        ScenePlaceHolderView scenePlaceHolderView7 = (ScenePlaceHolderView) mo31004h_(R.id.ebe);
        scenePlaceHolderView7.setSceneName(C44363v.class.getName());
        scenePlaceHolderView7.setSceneTag("EditGestureScene");
        scenePlaceHolderView7.setSceneComponentFactory(new C44107at(this));
    }

    /* renamed from: a */
    public final void mo106597a(C44363v vVar) {
        vVar.mo106806a(this.f114062v);
        vVar.mo30921H().mo106804d((C42060b) new C44134s(this));
    }

    /* renamed from: a */
    public final void mo106595a(C44170be beVar) {
        beVar.mo106677a((C40697a) new C44094ai(this));
    }

    /* renamed from: a */
    public final void mo106594a(C44038al alVar) {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        alVar.mo106543a(videoPublishEditModel);
        alVar.mo106541a((C34860g) new C44135t(this));
        alVar.f113947l = new C44136u(this, alVar);
    }

    /* renamed from: a */
    public final void mo106599a(boolean z) {
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        int J = editViewModel.mo106435J();
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (J <= videoPublishEditModel.mCurMusicLength) {
            m139577c(z);
        }
    }

    /* renamed from: a */
    public final void mo106596a(C44318d dVar) {
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditPreviewViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…iewViewModel::class.java)");
            dVar.mo106789a(((EditPreviewViewModel) a).mo106326k());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo106600a(boolean z, boolean z2, Runnable runnable) {
        C7573i.m23587b(runnable, "successCallback");
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            m139557aS();
            C15389d ar = mo106620ar();
            VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            String str = videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath;
            VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
            if (videoPublishEditModel3 == null) {
                C7573i.m23583a("mModel");
            }
            new C40154a(ar, str, videoPublishEditModel3.mvCreateVideoData.videoCoverStartTime, new C44098am(this, z, z2, runnable));
            return;
        }
        VideoPublishEditModel videoPublishEditModel4 = this.f114056p;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel4.isStatusVideoType()) {
            m139558aT();
            C1592h aV = m139560aV();
            if (aV != null) {
                aV.mo6875a((C1591g<TResult, TContinuationResult>) new C44099an<TResult,TContinuationResult>(this, z, z2, runnable));
            }
        } else {
            mo106602a(false, z, z2, runnable, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r3 == null) goto L_0x0039;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106602a(boolean r14, boolean r15, boolean r16, java.lang.Runnable r17, boolean r18) {
        /*
            r13 = this;
            r6 = r13
            java.lang.String r0 = "successCallback"
            r5 = r17
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            com.ss.android.ugc.gamora.editor.bg r0 = r13.mo106577L()
            com.ss.android.ugc.gamora.editor.z r0 = r0.f114261l
            com.ss.android.ugc.gamora.editor.bg r1 = r13.mo106577L()
            com.ss.android.ugc.gamora.editor.br r1 = r1.f114262m
            r13.m139537a(r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r6.f114056p
            if (r2 != 0) goto L_0x0020
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0020:
            boolean r2 = r2.isStatusVideoType()
            if (r2 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r6.f114056p
            if (r2 != 0) goto L_0x002f
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x002f:
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r2 = r2.statusCreateVideoData
            if (r1 == 0) goto L_0x0039
            java.lang.String r3 = r1.mo106722T()
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r3 = ""
        L_0x003b:
            r2.setUserText(r3)
        L_0x003e:
            com.ss.android.ugc.gamora.editor.bg r2 = r13.mo106577L()
            com.ss.android.ugc.gamora.editor.ap r2 = r2.f114263n
            com.ss.android.ugc.gamora.editor.bg r3 = r13.mo106577L()
            com.ss.android.ugc.gamora.editor.cn r3 = r3.f114264o
            com.ss.android.ugc.asve.b.d r4 = r13.mo106620ar()
            if (r4 != 0) goto L_0x0053
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0053:
            com.ss.android.ugc.aweme.shortvideo.edit.az r7 = r6.f114047ac
            if (r7 != 0) goto L_0x005c
            java.lang.String r8 = "mVideoSizeProvider"
            kotlin.jvm.internal.C7573i.m23583a(r8)
        L_0x005c:
            r8 = 4
            com.ss.android.ugc.aweme.shortvideo.edit.n[] r8 = new com.p280ss.android.ugc.aweme.shortvideo.edit.C39774n[r8]
            r9 = 0
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.shortvideo.edit.n r0 = r0.mo96987K()
            goto L_0x0068
        L_0x0067:
            r0 = r9
        L_0x0068:
            r10 = 0
            r8[r10] = r0
            if (r1 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.shortvideo.edit.n r0 = r1.mo106719Q()
            goto L_0x0073
        L_0x0072:
            r0 = r9
        L_0x0073:
            r1 = 1
            r8[r1] = r0
            if (r2 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.shortvideo.edit.n r0 = r2.mo106551O()
            goto L_0x007e
        L_0x007d:
            r0 = r9
        L_0x007e:
            r2 = 2
            r8[r2] = r0
            r0 = 3
            if (r3 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.shortvideo.edit.n r9 = r3.mo106760J()
        L_0x0088:
            r8[r0] = r9
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39783t.m127389a(r4, r7, r8)
            com.ss.android.ugc.aweme.shortvideo.edit.az r3 = r6.f114047ac
            if (r3 != 0) goto L_0x0097
            java.lang.String r4 = "mVideoSizeProvider"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0097:
            r3.mo98208a(r0)
            long r3 = java.lang.System.currentTimeMillis()
            bolts.h r0 = r13.m139559aU()
            if (r18 == 0) goto L_0x00b9
            bolts.h[] r7 = new bolts.C1592h[r2]
            r7[r10] = r0
            bolts.h r0 = r13.m139560aV()
            r7[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.util.Collection r0 = (java.util.Collection) r0
            bolts.h r0 = bolts.C1592h.m7862c(r0)
            goto L_0x00c7
        L_0x00b9:
            bolts.h[] r7 = new bolts.C1592h[r1]
            r7[r10] = r0
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.util.Collection r0 = (java.util.Collection) r0
            bolts.h r0 = bolts.C1592h.m7862c(r0)
        L_0x00c7:
            boolean r7 = r0.mo6882b()
            if (r7 != 0) goto L_0x00f2
            r13.m139561aW()
            bolts.h[] r2 = new bolts.C1592h[r2]
            r2[r10] = r0
            r7 = 0
            r9 = 500(0x1f4, double:2.47E-321)
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r3
            long r9 = r9 - r11
            long r3 = java.lang.Math.max(r7, r9)
            bolts.h r0 = bolts.C1592h.m7848a(r3)
            r2[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            bolts.h r0 = bolts.C1592h.m7862c(r0)
        L_0x00f2:
            r7 = r0
            com.ss.android.ugc.gamora.editor.av$h r8 = new com.ss.android.ugc.gamora.editor.av$h
            r0 = r8
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            bolts.g r8 = (bolts.C1591g) r8
            java.util.concurrent.Executor r0 = bolts.C1592h.f5958b
            r7.mo6876a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44082av.mo106602a(boolean, boolean, boolean, java.lang.Runnable, boolean):void");
    }

    /* renamed from: a */
    public final void mo106592a(StickerItemModel stickerItemModel) {
        if (C7276d.m22812b(stickerItemModel.path)) {
            VideoPublishEditModel videoPublishEditModel = this.f114056p;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("mModel");
            }
            if (!videoPublishEditModel.hasInfoStickers()) {
                VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
                if (videoPublishEditModel2 == null) {
                    C7573i.m23583a("mModel");
                }
                VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
                if (videoPublishEditModel3 == null) {
                    C7573i.m23583a("mModel");
                }
                videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
            }
            int i = 1;
            VideoPublishEditModel videoPublishEditModel4 = this.f114056p;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel4.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel5 = this.f114056p;
                if (videoPublishEditModel5 == null) {
                    C7573i.m23583a("mModel");
                }
                for (StickerItemModel stickerItemModel2 : videoPublishEditModel5.infoStickerModel.stickers) {
                    C7573i.m23582a((Object) stickerItemModel2, "item");
                    if (stickerItemModel2.isInfoSticker() && stickerItemModel2.layerWeight > i) {
                        i = stickerItemModel2.layerWeight;
                    }
                }
            }
            stickerItemModel.layerWeight += i;
            VideoPublishEditModel videoPublishEditModel6 = this.f114056p;
            if (videoPublishEditModel6 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel6.infoStickerModel.stickers.add(stickerItemModel);
        }
    }

    /* renamed from: a */
    public final void mo106598a(List<? extends StickerItemModel> list) {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (!videoPublishEditModel.hasInfoStickers()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
            if (videoPublishEditModel3 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
        }
        int i = 1;
        for (StickerItemModel stickerItemModel : list) {
            i++;
            stickerItemModel.layerWeight = i;
            VideoPublishEditModel videoPublishEditModel4 = this.f114056p;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel4.infoStickerModel.stickers.add(stickerItemModel);
        }
    }

    /* renamed from: a */
    public final void mo106522a(String str, int i, int i2, int i3, boolean z) {
        C7573i.m23587b(str, "path");
        m139561aW();
        C44102ap apVar = new C44102ap(this, str, i, i2, z);
        C1592h a = C1592h.m7853a((Callable<TResult>) apVar);
        C44103aq aqVar = new C44103aq(this, str, z, i3, i);
        a.mo6876a((C1591g<TResult, TContinuationResult>) aqVar, C1592h.f5958b);
    }

    /* access modifiers changed from: private */
    /* renamed from: bd */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: aq */
    public final void mo106619aq() {
        mo106577L().mo106704ac();
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: f */
    public final void mo106523f() {
        m139581e(false);
    }

    /* renamed from: aL */
    private final void m139550aL() {
        mo30945d((C12629j) m139542aD());
    }

    /* renamed from: aN */
    private final void m139552aN() {
        mo30925a((int) R.id.bko, (C12629j) this.f114051k, "MultiEditVideoScene");
    }

    /* renamed from: aR */
    private final void m139556aR() {
        if (C39507a.m126197d()) {
            mo30945d((C12629j) m139541aC());
        }
    }

    /* renamed from: B */
    public final void mo30994B() {
        super.mo30994B();
        C41514ab.m132244a().mo102175c();
    }

    /* renamed from: O */
    public final C44294cq mo106580O() {
        C44294cq cqVar = this.f114061u;
        if (cqVar == null) {
            C7573i.m23583a("musicController");
        }
        return cqVar;
    }

    /* renamed from: P */
    public final C44317cv mo106581P() {
        C44317cv cvVar = this.f114063w;
        if (cvVar == null) {
            C7573i.m23583a("veLifecycleOwner");
        }
        return cvVar;
    }

    /* renamed from: S */
    public final void mo106584S() {
        C44294cq cqVar = this.f114061u;
        if (cqVar == null) {
            C7573i.m23583a("musicController");
        }
        cqVar.mo106521f();
        m139555aQ();
    }

    /* renamed from: as */
    public final void mo106621as() {
        C41653c cVar = this.f114048ad;
        if (cVar != null) {
            cVar.dismiss();
        }
        this.f114048ad = null;
    }

    /* renamed from: aK */
    private final void m139549aK() {
        mo30945d((C12629j) m139543aE());
        m139543aE().mo30920G();
    }

    /* renamed from: aO */
    private final void m139553aO() {
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        mo91869c(editViewModel, C44166bb.f114233a, new C11672v(), new C44095aj(this));
    }

    /* renamed from: aQ */
    private final void m139555aQ() {
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        if (editViewModel.mo106430C()) {
            C39438b.f102396a.mo98271a();
        }
    }

    /* renamed from: aW */
    private final void m139561aW() {
        if (this.f114048ad == null) {
            C41653c a = C41653c.m132582a(this.f33526d_, mo31017x().getString(R.string.d5k));
            a.setIndeterminate(true);
            this.f114048ad = a;
        }
    }

    /* renamed from: V */
    public final void mo106587V() {
        m139583f(true);
        m139540aB().mo70499d();
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(true, false);
    }

    /* renamed from: W */
    public final void mo106588W() {
        EditAudioRecordModel editAudioRecordModel = this.f114036R;
        if (editAudioRecordModel == null) {
            C7573i.m23583a("mEditAudioRecordModel");
        }
        editAudioRecordModel.mo106171a(Boolean.valueOf(false));
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(true, false);
    }

    /* renamed from: ad */
    public final void mo106606ad() {
        if (m139563aY()) {
            m139534a((OnClickListener) new C44122g(this));
        } else {
            mo106622at();
        }
    }

    /* renamed from: ah */
    public final void mo106610ah() {
        mo106578M().mo30922I();
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        C39500av.m126164t(videoPublishEditModel);
    }

    /* renamed from: ak */
    public final void mo106613ak() {
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(false, false);
        EditAudioRecordModel editAudioRecordModel = this.f114036R;
        if (editAudioRecordModel == null) {
            C7573i.m23583a("mEditAudioRecordModel");
        }
        editAudioRecordModel.mo106171a(Boolean.valueOf(true));
    }

    /* renamed from: ao */
    public final void mo106617ao() {
        mo106577L().mo106694a(mo106576J().mo106566J(), mo106576J().mo96987K(), mo106576J().mo106567L());
    }

    /* renamed from: ar */
    public final C15389d mo106620ar() {
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return (C15389d) editViewModel.mo106448i().getValue();
    }

    /* renamed from: aI */
    private final void m139547aI() {
        mo30945d((C12629j) mo106576J());
        mo30945d((C12629j) m139565au());
        mo30945d((C12629j) m139566av());
        if (C39805en.m127445a()) {
            mo30945d((C12629j) m139569ay());
        }
    }

    /* renamed from: aS */
    private final void m139557aS() {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (TextUtils.isEmpty(videoPublishEditModel.mvCreateVideoData.videoCoverImgPath)) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath = C35563c.f93224F.mo70089d().mo90346a().mo90347a();
        }
    }

    /* renamed from: aT */
    private final void m139558aT() {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (TextUtils.isEmpty(videoPublishEditModel.statusCreateVideoData.getVideoCoverImgPath())) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel2.statusCreateVideoData.setVideoCoverImgPath(C35563c.f93224F.mo70089d().mo90346a().mo90347a());
        }
    }

    /* renamed from: ba */
    private final void m139572ba() {
        C39754a aVar = this.f114051k;
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        aVar.mo99153a(true, videoPublishEditModel);
        VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mModel");
        }
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel2.getCurMultiEditVideoRecordData();
        if (curMultiEditVideoRecordData == null) {
            C7573i.m23580a();
        }
        C15389d ar = mo106620ar();
        if (ar == null) {
            C7573i.m23580a();
        }
        curMultiEditVideoRecordData.preVideoDuration = ar.mo38860l();
    }

    /* renamed from: bb */
    private final void m139573bb() {
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(false, false);
        m139574bc();
        C39754a aVar = this.f114051k;
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        aVar.mo99152a(videoPublishEditModel);
        mo30945d((C12629j) this.f114051k);
        this.f114051k.mo99150a();
    }

    /* renamed from: R */
    public final void mo106583R() {
        mo30945d((C12629j) m139567aw());
        mo30945d((C12629j) m139568ax());
        mo30945d((C12629j) mo96987K());
        mo30945d((C12629j) mo106577L());
    }

    /* renamed from: X */
    public final void mo106589X() {
        m139583f(true);
        EditSubtitleViewModel editSubtitleViewModel = this.f114044Z;
        if (editSubtitleViewModel == null) {
            C7573i.m23583a("subtitleViewModel");
        }
        editSubtitleViewModel.mo106365a().setValue(Boolean.valueOf(false));
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(true, false);
    }

    /* renamed from: Z */
    public final void mo106591Z() {
        if (mo106577L().f114262m == null) {
            EditToolbarViewModel editToolbarViewModel = this.f114055o;
            if (editToolbarViewModel == null) {
                C7573i.m23583a("toolbarViewModel");
            }
            editToolbarViewModel.mo106424e(3, false);
            return;
        }
        mo106577L().mo106702aa();
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        C39500av.m126150f(editViewModel.mo29069f());
    }

    /* renamed from: ab */
    public final void mo106604ab() {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.isReviewVideo()) {
            C10761a.m31387a((Context) this.f33526d_, mo31017x().getString(R.string.dh8)).mo25750a();
            return;
        }
        if (this.f114054n == null) {
            C7573i.m23583a("editViewModel");
        }
        if (EditViewModel.m139162E()) {
            m139581e(true);
        } else {
            m139554aP();
        }
    }

    /* renamed from: ae */
    public final void mo106607ae() {
        mo30945d((C12629j) m139539aA());
        EditFilterViewModel editFilterViewModel = this.f114041W;
        if (editFilterViewModel == null) {
            C7573i.m23583a("filterViewModel");
        }
        editFilterViewModel.mo29069f();
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(false, false);
        EditViewModel editViewModel2 = this.f114054n;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        C39500av.m126152h(editViewModel2.mo29069f());
    }

    /* renamed from: af */
    public final void mo106608af() {
        EditStickerViewModel editStickerViewModel = this.f114057q;
        if (editStickerViewModel == null) {
            C7573i.m23583a("stickerViewModel");
        }
        editStickerViewModel.mo106364h().setValue(Boolean.valueOf(false));
        mo106599a(false);
        EditToolbarViewModel editToolbarViewModel = this.f114055o;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        editToolbarViewModel.mo29069f();
    }

    /* renamed from: am */
    public final void mo106615am() {
        m139551aM();
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(false, false);
        StatusViewModel statusViewModel = this.f114050af;
        if (statusViewModel == null) {
            C7573i.m23583a("mStatusModel");
        }
        statusViewModel.f113816a.setValue(Boolean.valueOf(true));
    }

    /* renamed from: at */
    public final void mo106622at() {
        m139573bb();
        m139572ba();
        int K = mo106576J().mo96987K();
        int L = mo106576J().mo106567L();
        if (mo106620ar() != null) {
            C15389d ar = mo106620ar();
            if (ar == null) {
                C7573i.m23580a();
            }
            VESize a = ar.mo38795a(K, L);
            if (a.f116385a > 0 && a.f116386b > 0) {
                C39701c.m127048b(K, L, a.f116385a, a.f116386b);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: aH */
    private final void m139546aH() {
        mo30945d((C12629j) mo106576J());
        mo30945d((C12629j) mo96987K());
        mo30945d((C12629j) m139565au());
        mo30945d((C12629j) m139566av());
        mo30945d((C12629j) m139567aw());
        mo30945d((C12629j) m139568ax());
        mo30945d((C12629j) m139569ay());
        mo30945d((C12629j) mo106577L());
        mo30945d((C12629j) m139570az());
        mo30945d((C12629j) m139539aA());
    }

    /* renamed from: aM */
    private final void m139551aM() {
        if (this.f114052l == null) {
            this.f114052l = new C44299cu();
            m139562aX();
            StatusViewModel statusViewModel = this.f114050af;
            if (statusViewModel == null) {
                C7573i.m23583a("mStatusModel");
            }
            C0043i iVar = this;
            statusViewModel.f113817b.observe(iVar, new C44090ae(this));
            C44299cu cuVar = this.f114052l;
            if (cuVar == null) {
                C7573i.m23580a();
            }
            mo30925a((int) R.id.ack, (C12629j) cuVar, "StatusBackgroundScene");
            StatusViewModel statusViewModel2 = this.f114050af;
            if (statusViewModel2 == null) {
                C7573i.m23583a("mStatusModel");
            }
            statusViewModel2.f113816a.observe(iVar, new C44091af(this));
            StatusViewModel statusViewModel3 = this.f114050af;
            if (statusViewModel3 == null) {
                C7573i.m23583a("mStatusModel");
            }
            statusViewModel3.f113818c.observe(iVar, new C44092ag(this));
            C44299cu cuVar2 = this.f114052l;
            if (cuVar2 != null) {
                cuVar2.f114481j = new C44093ah(this);
            }
        }
    }

    /* renamed from: aP */
    private final void m139554aP() {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.isStickPointMode) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            if (!videoPublishEditModel2.mIsFromDraft) {
                C10761a.m31387a((Context) this.f33526d_, mo31017x().getString(R.string.e1v)).mo25750a();
            }
            return;
        }
        mo106577L().mo106705ad();
        EditToolbarViewModel editToolbarViewModel = this.f114055o;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        editToolbarViewModel.mo29069f();
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114053m;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        C0052o k = vEVideoPublishEditViewModel.mo119519k();
        C7573i.m23582a((Object) k, "publishEditViewModel.previewControlLiveData");
        k.setValue(C47516v.m148297b());
        C44294cq cqVar = this.f114061u;
        if (cqVar == null) {
            C7573i.m23583a("musicController");
        }
        cqVar.mo106518c();
        VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        C39500av.m126155k(videoPublishEditModel3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* renamed from: aX */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m139562aX() {
        /*
            r3 = this;
            android.content.Context r0 = r3.mo31012t()
            if (r0 == 0) goto L_0x000c
            com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r1 = new com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout
            r1.<init>(r0)
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r3.f114059s = r1
            com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r0 = r3.f114059s
            if (r0 == 0) goto L_0x0018
            r1 = 8
            r0.setVisibility(r1)
        L_0x0018:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 17
            r0.gravity = r1
            android.content.Context r1 = r3.mo31012t()
            if (r1 == 0) goto L_0x0037
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0037
            r2 = 2131165452(0x7f07010c, float:1.7945122E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            int r1 = r1 / 2
            r0.bottomMargin = r1
            android.view.View r1 = r3.f33523b
            if (r1 == 0) goto L_0x004c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r2 = r3.f114059s
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r1.addView(r2, r0)
            return
        L_0x004c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44082av.m139562aX():void");
    }

    /* renamed from: aZ */
    private final void m139564aZ() {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel.veAudioEffectParam = null;
        VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel2.veAudioRecorderParam = null;
        VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel3.autoEnhanceOn = false;
        VideoPublishEditModel videoPublishEditModel4 = this.f114056p;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel4.mSelectedId = 0;
        VideoPublishEditModel videoPublishEditModel5 = this.f114056p;
        if (videoPublishEditModel5 == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel5.mTimeEffect = null;
        VideoPublishEditModel videoPublishEditModel6 = this.f114056p;
        if (videoPublishEditModel6 == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel6.mCurFilterIds = null;
    }

    /* renamed from: A */
    public final void mo30993A() {
        boolean z;
        super.mo30993A();
        C41514ab.m132244a().mo102172a(this.f33526d_, (ViewGroup) this.f33523b);
        if (this.f114054n == null) {
            C7573i.m23583a("editViewModel");
        }
        if (EditViewModel.m139162E()) {
            C44038al alVar = (C44038al) mo30924a("MusicScene");
            if (alVar != null) {
                z = alVar.mo106538J();
            } else {
                z = false;
            }
            EditViewModel editViewModel = this.f114054n;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            if (!editViewModel.mo106457r()) {
                EditToolbarViewModel editToolbarViewModel = this.f114055o;
                if (editToolbarViewModel == null) {
                    C7573i.m23583a("toolbarViewModel");
                }
                if (editToolbarViewModel.f113758d.f114387c && !z) {
                    EditToolbarViewModel editToolbarViewModel2 = this.f114055o;
                    if (editToolbarViewModel2 == null) {
                        C7573i.m23583a("toolbarViewModel");
                    }
                    editToolbarViewModel2.mo106413b(1, true);
                }
            }
        }
    }

    /* renamed from: Y */
    public final void mo106590Y() {
        m139583f(false);
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            C27422a aB = m139540aB();
            EditViewModel editViewModel = this.f114054n;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            Object value = editViewModel.mo106448i().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            aB.mo70500d(((C15389d) value).mo38860l());
        }
        m139540aB().mo70498c();
        EditViewModel editViewModel2 = this.f114054n;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel2.mo106443a(false, false);
        C39779q.m127364a("effect", true);
        EditViewModel editViewModel3 = this.f114054n;
        if (editViewModel3 == null) {
            C7573i.m23583a("editViewModel");
        }
        C39500av.m126149e(editViewModel3.mo29069f());
        EditToolbarViewModel editToolbarViewModel = this.f114055o;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        editToolbarViewModel.mo29069f();
    }

    /* renamed from: aa */
    public final void mo106603aa() {
        if (mo106577L().f114261l == null) {
            EditToolbarViewModel editToolbarViewModel = this.f114055o;
            if (editToolbarViewModel == null) {
                C7573i.m23583a("toolbarViewModel");
            }
            editToolbarViewModel.mo106424e(4, false);
            return;
        }
        if (!C6399b.m19944t()) {
            C35563c.f93246i.mo103867e().mo103928n();
        }
        EditStickerPanelViewModel editStickerPanelViewModel = this.f114039U;
        if (editStickerPanelViewModel == null) {
            C7573i.m23583a("stickerPanelViewModel");
        }
        editStickerPanelViewModel.mo106349a(true);
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(false, false);
        C39779q.m127364a("sticker", true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* renamed from: ag */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106609ag() {
        /*
            r2 = this;
            com.ss.android.ugc.gamora.editor.EditStickerViewModel r0 = r2.f114057q
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "stickerViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            android.arch.lifecycle.o r0 = r0.mo106364h()
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r2.f114054n
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x001e:
            boolean r0 = com.p280ss.android.ugc.gamora.editor.EditViewModel.m139162E()
            if (r0 == 0) goto L_0x0037
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r2.f114054n
            if (r0 != 0) goto L_0x002d
            java.lang.String r1 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x002d:
            boolean r0 = r0.mo106462x()
            if (r0 != 0) goto L_0x0037
            r2.mo106610ah()
            goto L_0x003a
        L_0x0037:
            r2.m139549aK()
        L_0x003a:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r0 = r2.f114055o
            if (r0 != 0) goto L_0x0043
            java.lang.String r1 = "toolbarViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0043:
            r0.mo29069f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44082av.mo106609ag():void");
    }

    /* renamed from: ai */
    public final void mo106611ai() {
        Drawable drawable;
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        boolean z = !videoPublishEditModel.autoEnhanceOn;
        EditToolbarViewModel editToolbarViewModel = this.f114055o;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        if (z) {
            Activity activity = this.f33526d_;
            if (activity == null) {
                C7573i.m23580a();
            }
            drawable = C0683b.m2903a((Context) activity, (int) R.drawable.ef);
            if (drawable == null) {
                C7573i.m23580a();
            }
        } else {
            Activity activity2 = this.f33526d_;
            if (activity2 == null) {
                C7573i.m23580a();
            }
            drawable = C0683b.m2903a((Context) activity2, (int) R.drawable.ed);
            if (drawable == null) {
                C7573i.m23580a();
            }
        }
        C7573i.m23582a((Object) drawable, "if (toStatus)\n          …c_auto_enhance_off_new)!!");
        editToolbarViewModel.mo106414b(drawable);
        EditAutoEnhanceViewModel editAutoEnhanceViewModel = this.f114042X;
        if (editAutoEnhanceViewModel == null) {
            C7573i.m23583a("autoEnhanceViewModel");
        }
        editAutoEnhanceViewModel.mo106186a(z);
        EditToolbarViewModel editToolbarViewModel2 = this.f114055o;
        if (editToolbarViewModel2 == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        editToolbarViewModel2.mo29069f();
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        C39500av.m126153i(editViewModel.mo29069f());
    }

    /* renamed from: aj */
    public final void mo106612aj() {
        C35536ag c = C35563c.f93224F.mo70088c();
        Activity activity = this.f33526d_;
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        if (c.mo90359b(activity) == 0) {
            mo106613ak();
            return;
        }
        C35536ag c2 = C35563c.f93224F.mo70088c();
        Activity activity2 = this.f33526d_;
        if (activity2 != null) {
            c2.mo90356a((FragmentActivity) activity2, new C44121f(this), "android.permission.RECORD_AUDIO");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[RETURN] */
    /* renamed from: ap */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo106618ap() {
        /*
            r5 = this;
            com.ss.android.ugc.gamora.editor.bg r0 = r5.mo106577L()
            com.ss.android.ugc.gamora.editor.br r0 = r0.f114262m
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.mo106722T()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r5.f114056p
            if (r1 != 0) goto L_0x0017
            java.lang.String r2 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0017:
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r1 = r1.statusCreateVideoData
            java.lang.String r1 = r1.getTemplateText()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x007f
            com.ss.android.ugc.gamora.editor.bg r0 = r5.mo106577L()
            com.ss.android.ugc.gamora.editor.ap r0 = r0.f114263n
            r2 = 0
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.mo106550N()
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x007f
            com.ss.android.ugc.gamora.editor.bg r0 = r5.mo106577L()
            com.ss.android.ugc.gamora.editor.cn r0 = r0.f114264o
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.mo106764O()
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 != 0) goto L_0x007f
            com.ss.android.ugc.gamora.editor.cu r0 = r5.f114052l
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.f114491t
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 != 0) goto L_0x007f
            com.ss.android.ugc.gamora.editor.bg r0 = r5.mo106577L()
            com.ss.android.ugc.gamora.editor.br r0 = r0.f114262m
            if (r0 == 0) goto L_0x0063
            java.util.List r0 = r0.mo106720R()
            if (r0 == 0) goto L_0x0063
            int r0 = r0.size()
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r5.f114056p
            if (r3 != 0) goto L_0x006d
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x006d:
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r3 = r3.infoStickerModel
            if (r3 == 0) goto L_0x007a
            java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r3 = r3.stickers
            if (r3 == 0) goto L_0x007a
            int r3 = r3.size()
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            if (r0 >= r3) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            return r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44082av.mo106618ap():boolean");
    }

    /* renamed from: aU */
    private final C1592h<Void> m139559aU() {
        C44054ap apVar = mo106577L().f114263n;
        C44284cn cnVar = mo106577L().f114264o;
        if (apVar == null || !apVar.mo106550N()) {
            C1592h<Void> a = C1592h.m7851a(null);
            C7573i.m23582a((Object) a, "Task.forResult(null)");
            if (cnVar == null) {
                return a;
            }
            mo106619aq();
            return a;
        }
        String P = apVar.mo106552P();
        C39504az azVar = this.f114047ac;
        if (azVar == null) {
            C7573i.m23583a("mVideoSizeProvider");
        }
        int c = azVar.mo98355c();
        C39504az azVar2 = this.f114047ac;
        if (azVar2 == null) {
            C7573i.m23583a("mVideoSizeProvider");
        }
        int d = azVar2.mo98356d();
        C15389d ar = mo106620ar();
        if (ar == null) {
            C7573i.m23580a();
        }
        int i = ar.mo38828c().f116385a;
        C15389d ar2 = mo106620ar();
        if (ar2 == null) {
            C7573i.m23580a();
        }
        C1592h<Void> a2 = apVar.mo106556a(P, c, d, i, ar2.mo38828c().f116386b).mo6886c(new C44130o(this, apVar), C1592h.f5958b).mo6876a((C1591g<TResult, TContinuationResult>) new C44131p<TResult,TContinuationResult>(this), C1592h.f5958b);
        C7573i.m23582a((Object) a2, "poiStickerScene!!\n      … Task.UI_THREAD_EXECUTOR)");
        return a2;
    }

    /* renamed from: aV */
    private final C1592h<Void> m139560aV() {
        C44215br brVar = mo106577L().f114262m;
        if (brVar == null || !brVar.mo106714L()) {
            C1592h<Void> a = C1592h.m7851a(null);
            C7573i.m23582a((Object) a, "Task.forResult(null)");
            return a;
        }
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        StringBuilder sb = new StringBuilder();
        Application application = C35563c.f93238a;
        C7573i.m23582a((Object) application, "AVEnv.application");
        sb.append(application.getFilesDir().toString());
        sb.append(File.separator);
        sb.append("effect");
        sb.append(File.separator);
        sb.append("text_stickers");
        sb.append(File.separator);
        sb.append(System.currentTimeMillis());
        sb.append(File.separator);
        String uniqueVideoSessionDir = videoPublishEditModel.uniqueVideoSessionDir(sb.toString());
        C7573i.m23582a((Object) uniqueVideoSessionDir, "draftDir");
        C39504az azVar = this.f114047ac;
        if (azVar == null) {
            C7573i.m23583a("mVideoSizeProvider");
        }
        int c = azVar.mo98355c();
        C39504az azVar2 = this.f114047ac;
        if (azVar2 == null) {
            C7573i.m23583a("mVideoSizeProvider");
        }
        int d = azVar2.mo98356d();
        C15389d ar = mo106620ar();
        if (ar == null) {
            C7573i.m23580a();
        }
        int i = ar.mo38828c().f116385a;
        C15389d ar2 = mo106620ar();
        if (ar2 == null) {
            C7573i.m23580a();
        }
        C1592h<Void> c2 = brVar.mo106723a(uniqueVideoSessionDir, c, d, i, ar2.mo38828c().f116386b).mo6886c(new C44132q(this), C1592h.f5958b);
        C7573i.m23582a((Object) c2, "textStickerScene!!\n     … Task.UI_THREAD_EXECUTOR)");
        return c2;
    }

    /* renamed from: bc */
    private final void m139574bc() {
        EditFilterViewModel editFilterViewModel = this.f114041W;
        if (editFilterViewModel == null) {
            C7573i.m23583a("filterViewModel");
        }
        editFilterViewModel.mo106216h().setValue(null);
        EditAudioEffectViewModel editAudioEffectViewModel = this.f114040V;
        if (editAudioEffectViewModel == null) {
            C7573i.m23583a("audioEffectViewModel");
        }
        editAudioEffectViewModel.mo106169a(new Object());
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (!videoPublishEditModel.autoEnhanceOn) {
            EditToolbarViewModel editToolbarViewModel = this.f114055o;
            if (editToolbarViewModel == null) {
                C7573i.m23583a("toolbarViewModel");
            }
            Activity activity = this.f33526d_;
            if (activity == null) {
                C7573i.m23580a();
            }
            Drawable a = C0683b.m2903a((Context) activity, (int) R.drawable.ed);
            if (a == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) a, "ContextCompat.getDrawabl…c_auto_enhance_off_new)!!");
            editToolbarViewModel.mo106414b(a);
            EditAutoEnhanceViewModel editAutoEnhanceViewModel = this.f114042X;
            if (editAutoEnhanceViewModel == null) {
                C7573i.m23583a("autoEnhanceViewModel");
            }
            editAutoEnhanceViewModel.mo106186a(false);
        }
        Activity activity2 = this.f33526d_;
        if (activity2 != null) {
            C0063u a2 = C0069x.m159a((FragmentActivity) activity2).mo147a(EditEffectVideoModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…ctVideoModel::class.java)");
            ((EditEffectVideoModel) a2).mo70342h().setValue(null);
            C41064b.m131233a().clear();
            m139584g(true);
            m139564aZ();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: U */
    public final void mo106586U() {
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        mo91868b(editViewModel, C44142aw.f114147a, new C11672v(), new C44140y(this));
        EditViewModel editViewModel2 = this.f114054n;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        mo91869c(editViewModel2, C44145az.f114150a, new C11672v(), new C44141z(this));
        EditPreviewViewModel editPreviewViewModel = this.f114035Q;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        mo91869c(editPreviewViewModel, C44165ba.f114232a, new C11672v(), new C44084aa(this));
        EditViewModel editViewModel3 = this.f114054n;
        if (editViewModel3 == null) {
            C7573i.m23583a("editViewModel");
        }
        C0043i iVar = this;
        editViewModel3.mo106449j().observe(iVar, new C44087ab(this));
        EditViewModel editViewModel4 = this.f114054n;
        if (editViewModel4 == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel4.mo106454o().observe(iVar, new C44088ac(this));
        EditViewModel editViewModel5 = this.f114054n;
        if (editViewModel5 == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel5.mo106455p().observe(iVar, new C44089ad(this));
        EditViewModel editViewModel6 = this.f114054n;
        if (editViewModel6 == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel6.mo106453n().observe(iVar, new C44137v(this));
        EditAudioRecordModel editAudioRecordModel = this.f114036R;
        if (editAudioRecordModel == null) {
            C7573i.m23583a("mEditAudioRecordModel");
        }
        mo29062a(editAudioRecordModel, C44143ax.f114148a, C11640h.m34110a(), new C44138w(this));
        EditLyricStickerViewModel editLyricStickerViewModel = this.f114037S;
        if (editLyricStickerViewModel == null) {
            C7573i.m23583a("mEditLyricStickerViewModel");
        }
        mo91869c(editLyricStickerViewModel, C44144ay.f114149a, new C11672v(), new C44139x(this));
        m139553aO();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r0.mo106434I() != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r0.veAudioRecorderParam.hasRecord() == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r0 = r3.f114040V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r0 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        kotlin.jvm.internal.C7573i.m23583a("audioEffectViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        r0.mo106170a(true);
        r0 = r3.f114054n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        if (r0 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        kotlin.jvm.internal.C7573i.m23583a("editViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r0.mo106443a(false, false);
        com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q.m127364a("voice", true);
        r0 = r3.f114054n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (r0 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        kotlin.jvm.internal.C7573i.m23583a("editViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av.m126151g(r0.mo29069f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        return;
     */
    /* renamed from: ac */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106605ac() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g r0 = r3.m139570az()
            com.bytedance.scene.j r0 = (com.bytedance.scene.C12629j) r0
            r3.mo30945d(r0)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r3.f114054n
            if (r0 != 0) goto L_0x0012
            java.lang.String r1 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0012:
            boolean r0 = r0.mo106461w()
            if (r0 != 0) goto L_0x0045
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r3.f114054n
            if (r0 != 0) goto L_0x0021
            java.lang.String r1 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0021:
            boolean r0 = r0.mo106463y()
            if (r0 != 0) goto L_0x0045
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r3.f114054n
            if (r0 != 0) goto L_0x0030
            java.lang.String r1 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0030:
            boolean r0 = r0.mo106462x()
            if (r0 != 0) goto L_0x0045
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r3.f114054n
            if (r0 != 0) goto L_0x003f
            java.lang.String r1 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x003f:
            boolean r0 = r0.mo106434I()
            if (r0 == 0) goto L_0x0064
        L_0x0045:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f114056p
            if (r0 != 0) goto L_0x004e
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x004e:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            if (r0 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.f114056p
            if (r0 != 0) goto L_0x005b
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x005b:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            boolean r0 = r0.hasRecord()
            if (r0 != 0) goto L_0x0064
            goto L_0x0094
        L_0x0064:
            com.ss.android.ugc.gamora.editor.EditAudioEffectViewModel r0 = r3.f114040V
            if (r0 != 0) goto L_0x006d
            java.lang.String r1 = "audioEffectViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x006d:
            r1 = 1
            r0.mo106170a(r1)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r3.f114054n
            if (r0 != 0) goto L_0x007a
            java.lang.String r2 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x007a:
            r2 = 0
            r0.mo106443a(r2, r2)
            java.lang.String r0 = "voice"
            com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q.m127364a(r0, r1)
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r3.f114054n
            if (r0 != 0) goto L_0x008c
            java.lang.String r1 = "editViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x008c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo29069f()
            com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av.m126151g(r0)
            return
        L_0x0094:
            android.app.Activity r0 = r3.f33526d_
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131822279(0x7f1106c7, float:1.9277325E38)
            com.bytedance.ies.dmt.ui.c.a r0 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r0, r1)
            r0.mo25750a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44082av.mo106605ac():void");
    }

    /* renamed from: al */
    public final void mo106614al() {
        if (mo106577L().f114261l == null) {
            EditToolbarViewModel editToolbarViewModel = this.f114055o;
            if (editToolbarViewModel == null) {
                C7573i.m23583a("toolbarViewModel");
            }
            editToolbarViewModel.mo106424e(11, false);
            return;
        }
        m139583f(false);
        mo30945d((C12629j) m139545aG());
        if (!m139545aG().mo101467Q() || C40199b.m128499a(this.f33526d_)) {
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114053m;
            if (vEVideoPublishEditViewModel == null) {
                C7573i.m23583a("publishEditViewModel");
            }
            C0052o r = vEVideoPublishEditViewModel.mo119526r();
            C7573i.m23582a((Object) r, "publishEditViewModel.inTimeEditView");
            r.setValue(Boolean.valueOf(true));
            EditSubtitleViewModel editSubtitleViewModel = this.f114044Z;
            if (editSubtitleViewModel == null) {
                C7573i.m23583a("subtitleViewModel");
            }
            editSubtitleViewModel.mo106365a().setValue(Boolean.valueOf(true));
            EditToolbarViewModel editToolbarViewModel2 = this.f114055o;
            if (editToolbarViewModel2 == null) {
                C7573i.m23583a("toolbarViewModel");
            }
            editToolbarViewModel2.mo29069f();
            EditViewModel editViewModel = this.f114054n;
            if (editViewModel == null) {
                C7573i.m23583a("editViewModel");
            }
            C39500av.m126154j(editViewModel.mo29069f());
            return;
        }
        C10761a.m31403c(mo31011s(), mo30999a((int) R.string.nj)).mo25750a();
    }

    /* renamed from: an */
    public final void mo106616an() {
        C41530am.m132280a("VEVideoPublishEditActivity initAllStickerModules");
        mo106577L().mo106689V();
        if (this.f114054n == null) {
            C7573i.m23583a("editViewModel");
        }
        if (EditViewModel.m139163F()) {
            m139550aL();
            mo106577L().mo106692Y();
            VideoPublishEditModel videoPublishEditModel = this.f114056p;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel.mIsFromDraft) {
                VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
                if (videoPublishEditModel2 == null) {
                    C7573i.m23583a("mModel");
                }
                if (videoPublishEditModel2.infoStickerModel != null) {
                    VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
                    if (videoPublishEditModel3 == null) {
                        C7573i.m23583a("mModel");
                    }
                    if (videoPublishEditModel3.infoStickerModel.hasLyricSticker()) {
                        mo106577L().mo106690W();
                    }
                }
            }
        }
        if (this.f114054n == null) {
            C7573i.m23583a("editViewModel");
        }
        if (EditViewModel.m139166u()) {
            mo106577L().mo106693Z();
            VideoPublishEditModel videoPublishEditModel4 = this.f114056p;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel4.isStatusVideoType()) {
                VideoPublishEditModel videoPublishEditModel5 = this.f114056p;
                if (videoPublishEditModel5 == null) {
                    C7573i.m23583a("mModel");
                }
                if (!videoPublishEditModel5.mIsFromDraft) {
                    VideoPublishEditModel videoPublishEditModel6 = this.f114056p;
                    if (videoPublishEditModel6 == null) {
                        C7573i.m23583a("mModel");
                    }
                    if (videoPublishEditModel6.statusCreateVideoData.getStatusType() == 1) {
                        C44215br brVar = mo106577L().f114262m;
                        if (brVar != null) {
                            brVar.mo106724a((View.OnClickListener) new C44133r(this));
                        }
                    }
                }
            }
        }
        EditToolbarViewModel editToolbarViewModel = this.f114055o;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        editToolbarViewModel.mo106424e(4, true);
        EditToolbarViewModel editToolbarViewModel2 = this.f114055o;
        if (editToolbarViewModel2 == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        editToolbarViewModel2.mo106424e(3, true);
        EditToolbarViewModel editToolbarViewModel3 = this.f114055o;
        if (editToolbarViewModel3 == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        editToolbarViewModel3.mo106424e(11, true);
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        if (editViewModel.mo106439N()) {
            VideoPublishEditModel videoPublishEditModel7 = this.f114056p;
            if (videoPublishEditModel7 == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel7.isRetakeVideo()) {
                m139572ba();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r0.veAudioRecorderParam.getNeedOriginalSound() == false) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081  */
    /* renamed from: aY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m139563aY() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114056p
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114056p
            if (r0 != 0) goto L_0x0018
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0018:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            boolean r0 = r0.hasRecord()
            if (r0 != 0) goto L_0x0031
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114056p
            if (r0 != 0) goto L_0x0029
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0029:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            boolean r0 = r0.getNeedOriginalSound()
            if (r0 != 0) goto L_0x0033
        L_0x0031:
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f114056p
            if (r3 != 0) goto L_0x003d
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x003d:
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r3 = r3.infoStickerModel
            if (r3 != 0) goto L_0x0043
            r3 = 0
            goto L_0x0052
        L_0x0043:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r9.f114056p
            if (r3 != 0) goto L_0x004c
            java.lang.String r4 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x004c:
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r3 = r3.infoStickerModel
            boolean r3 = r3.hasLyricSticker()
        L_0x0052:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f114056p
            if (r4 != 0) goto L_0x005b
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x005b:
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = r4.mTimeEffect
            if (r4 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f114056p
            if (r4 != 0) goto L_0x0068
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x0068:
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = r4.mTimeEffect
            java.lang.String r5 = "mModel.mTimeEffect"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r4 = r4.getKey()
            java.lang.String r5 = "0"
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r5)
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x007e
            r4 = 1
            goto L_0x007f
        L_0x007e:
            r4 = 0
        L_0x007f:
            if (r4 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f114056p
            if (r4 != 0) goto L_0x008a
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x008a:
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r4 = r4.mEffectList
            if (r4 == 0) goto L_0x00c1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L_0x009b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00be
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.ss.android.ugc.aweme.effect.EffectPointModel r7 = (com.p280ss.android.ugc.aweme.effect.EffectPointModel) r7
            java.lang.String r8 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            java.lang.String r7 = r7.getKey()
            java.lang.String r8 = "0"
            boolean r7 = kotlin.jvm.internal.C7573i.m23585a(r7, r8)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x009b
            r5.add(r6)
            goto L_0x009b
        L_0x00be:
            java.util.List r5 = (java.util.List) r5
            goto L_0x00c2
        L_0x00c1:
            r5 = 0
        L_0x00c2:
            boolean r4 = com.bytedance.common.utility.C6311g.m19574b(r5)
            if (r4 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r9.f114056p
            if (r4 != 0) goto L_0x00d1
            java.lang.String r5 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x00d1:
            boolean r4 = r4.hasInfoStickers()
            if (r4 != 0) goto L_0x012a
            com.ss.android.ugc.gamora.editor.bg r4 = r9.mo106577L()
            boolean r4 = r4.mo106707af()
            if (r4 != 0) goto L_0x012a
            if (r0 != 0) goto L_0x012a
            if (r3 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114056p
            if (r0 != 0) goto L_0x00ee
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00ee:
            int r0 = r0.mSelectedId
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114056p
            if (r0 != 0) goto L_0x00fb
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00fb:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r0.veAudioEffectParam
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114056p
            if (r0 != 0) goto L_0x0108
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0108:
            boolean r0 = r0.autoEnhanceOn
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114056p
            if (r0 != 0) goto L_0x0115
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0115:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.veAudioRecorderParam
            if (r0 != 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.f114056p
            if (r0 != 0) goto L_0x0122
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0122:
            boolean r0 = r0.hasSubtitle()
            if (r0 == 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            return r1
        L_0x012a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44082av.m139563aY():boolean");
    }

    /* renamed from: aJ */
    private final void m139548aJ() {
        C44294cq cqVar;
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f114054n = (EditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditPreviewViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…iewViewModel::class.java)");
                this.f114035Q = (EditPreviewViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditToolbarViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…barViewModel::class.java)");
                    this.f114055o = (EditToolbarViewModel) a3;
                    Activity activity4 = this.f33526d_;
                    if (activity4 != null) {
                        C0063u a4 = C0069x.m159a((FragmentActivity) activity4).mo147a(VEVideoPublishEditViewModel.class);
                        C7573i.m23582a((Object) a4, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                        this.f114053m = (VEVideoPublishEditViewModel) a4;
                        Activity activity5 = this.f33526d_;
                        if (activity5 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity5).mo91871a(EditAudioRecordModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…oRecordModel::class.java)");
                            this.f114036R = (EditAudioRecordModel) a5;
                            Activity activity6 = this.f33526d_;
                            if (activity6 != null) {
                                JediViewModel a6 = C36113b.m116288a((FragmentActivity) activity6).mo91871a(EditLyricStickerViewModel.class);
                                C7573i.m23582a((Object) a6, "JediViewModelProviders.o…kerViewModel::class.java)");
                                this.f114037S = (EditLyricStickerViewModel) a6;
                                Activity activity7 = this.f33526d_;
                                if (activity7 != null) {
                                    JediViewModel a7 = C36113b.m116288a((FragmentActivity) activity7).mo91871a(EditCornerViewModel.class);
                                    C7573i.m23582a((Object) a7, "JediViewModelProviders.o…nerViewModel::class.java)");
                                    this.f114038T = (EditCornerViewModel) a7;
                                    Activity activity8 = this.f33526d_;
                                    if (activity8 != null) {
                                        JediViewModel a8 = C36113b.m116288a((FragmentActivity) activity8).mo91871a(EditStickerPanelViewModel.class);
                                        C7573i.m23582a((Object) a8, "JediViewModelProviders.o…nelViewModel::class.java)");
                                        this.f114039U = (EditStickerPanelViewModel) a8;
                                        Activity activity9 = this.f33526d_;
                                        if (activity9 != null) {
                                            JediViewModel a9 = C36113b.m116288a((FragmentActivity) activity9).mo91871a(EditAudioEffectViewModel.class);
                                            C7573i.m23582a((Object) a9, "JediViewModelProviders.o…ectViewModel::class.java)");
                                            this.f114040V = (EditAudioEffectViewModel) a9;
                                            Activity activity10 = this.f33526d_;
                                            if (activity10 != null) {
                                                JediViewModel a10 = C36113b.m116288a((FragmentActivity) activity10).mo91871a(EditFilterViewModel.class);
                                                C7573i.m23582a((Object) a10, "JediViewModelProviders.o…terViewModel::class.java)");
                                                this.f114041W = (EditFilterViewModel) a10;
                                                Activity activity11 = this.f33526d_;
                                                if (activity11 != null) {
                                                    JediViewModel a11 = C36113b.m116288a((FragmentActivity) activity11).mo91871a(EditStickerViewModel.class);
                                                    C7573i.m23582a((Object) a11, "JediViewModelProviders.o…kerViewModel::class.java)");
                                                    this.f114057q = (EditStickerViewModel) a11;
                                                    Activity activity12 = this.f33526d_;
                                                    if (activity12 != null) {
                                                        JediViewModel a12 = C36113b.m116288a((FragmentActivity) activity12).mo91871a(EditAutoEnhanceViewModel.class);
                                                        C7573i.m23582a((Object) a12, "JediViewModelProviders.o…nceViewModel::class.java)");
                                                        this.f114042X = (EditAutoEnhanceViewModel) a12;
                                                        Activity activity13 = this.f33526d_;
                                                        if (activity13 != null) {
                                                            JediViewModel a13 = C36113b.m116288a((FragmentActivity) activity13).mo91871a(EditAudioRecordModel.class);
                                                            C7573i.m23582a((Object) a13, "JediViewModelProviders.o…oRecordModel::class.java)");
                                                            this.f114043Y = (EditAudioRecordModel) a13;
                                                            Activity activity14 = this.f33526d_;
                                                            if (activity14 != null) {
                                                                C0063u a14 = C0069x.m159a((FragmentActivity) activity14).mo147a(EditSubtitleViewModel.class);
                                                                C7573i.m23582a((Object) a14, "ViewModelProviders.of(ac…tleViewModel::class.java)");
                                                                this.f114044Z = (EditSubtitleViewModel) a14;
                                                                Activity activity15 = this.f33526d_;
                                                                if (activity15 != null) {
                                                                    JediViewModel a15 = C36113b.m116288a((FragmentActivity) activity15).mo91871a(EditMusicCutViewModel.class);
                                                                    C7573i.m23582a((Object) a15, "JediViewModelProviders.o…CutViewModel::class.java)");
                                                                    this.f114058r = (EditMusicCutViewModel) a15;
                                                                    Activity activity16 = this.f33526d_;
                                                                    if (activity16 != null) {
                                                                        JediViewModel a16 = C36113b.m116288a((FragmentActivity) activity16).mo91871a(EditMusicViewModel.class);
                                                                        C7573i.m23582a((Object) a16, "JediViewModelProviders.o…sicViewModel::class.java)");
                                                                        this.f114045aa = (EditMusicViewModel) a16;
                                                                        Activity activity17 = this.f33526d_;
                                                                        if (activity17 != null) {
                                                                            C0063u a17 = C0069x.m159a((FragmentActivity) activity17).mo147a(StatusViewModel.class);
                                                                            C7573i.m23582a((Object) a17, "ViewModelProviders.of(ac…tusViewModel::class.java)");
                                                                            this.f114050af = (StatusViewModel) a17;
                                                                            EditViewModel editViewModel = this.f114054n;
                                                                            if (editViewModel == null) {
                                                                                C7573i.m23583a("editViewModel");
                                                                            }
                                                                            this.f114056p = editViewModel.mo29069f();
                                                                            EditViewModel editViewModel2 = this.f114054n;
                                                                            if (editViewModel2 == null) {
                                                                                C7573i.m23583a("editViewModel");
                                                                            }
                                                                            this.f114047ac = editViewModel2.mo106446g();
                                                                            if (this.f114054n == null) {
                                                                                C7573i.m23583a("editViewModel");
                                                                            }
                                                                            if (EditViewModel.m139162E()) {
                                                                                Activity activity18 = this.f33526d_;
                                                                                if (activity18 != null) {
                                                                                    cqVar = new C44146b((FragmentActivity) activity18, this);
                                                                                } else {
                                                                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                                                }
                                                                            } else {
                                                                                Activity activity19 = this.f33526d_;
                                                                                if (activity19 != null) {
                                                                                    cqVar = new C44016ai((FragmentActivity) activity19, this);
                                                                                } else {
                                                                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                                                }
                                                                            }
                                                                            this.f114061u = cqVar;
                                                                            EditViewModel editViewModel3 = this.f114054n;
                                                                            if (editViewModel3 == null) {
                                                                                C7573i.m23583a("editViewModel");
                                                                            }
                                                                            if (editViewModel3.mo106439N()) {
                                                                                m139552aN();
                                                                                VideoPublishEditModel videoPublishEditModel = this.f114056p;
                                                                                if (videoPublishEditModel == null) {
                                                                                    C7573i.m23583a("mModel");
                                                                                }
                                                                                if (videoPublishEditModel.isRetakeVideo()) {
                                                                                    m139573bb();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                                    }
                                                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                                }
                                                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                            }
                                                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                        }
                                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                    }
                                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                                }
                                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                            }
                                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                        }
                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: c */
    private final void m139577c(boolean z) {
        m139544aF().mo106528b(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoPublishEditModel m139533a(C44082av avVar) {
        VideoPublishEditModel videoPublishEditModel = avVar.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditViewModel m139571b(C44082av avVar) {
        EditViewModel editViewModel = avVar.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        return editViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditToolbarViewModel m139576c(C44082av avVar) {
        EditToolbarViewModel editToolbarViewModel = avVar.f114055o;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        return editToolbarViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ EditStickerViewModel m139578d(C44082av avVar) {
        EditStickerViewModel editStickerViewModel = avVar.f114057q;
        if (editStickerViewModel == null) {
            C7573i.m23583a("stickerViewModel");
        }
        return editStickerViewModel;
    }

    /* renamed from: e */
    public static final /* synthetic */ EditMusicCutViewModel m139580e(C44082av avVar) {
        EditMusicCutViewModel editMusicCutViewModel = avVar.f114058r;
        if (editMusicCutViewModel == null) {
            C7573i.m23583a("musicCutVideoModel");
        }
        return editMusicCutViewModel;
    }

    /* renamed from: f */
    public static final /* synthetic */ VEVideoPublishEditViewModel m139582f(C44082av avVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = avVar.f114053m;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: f */
    private final void m139583f(boolean z) {
        if (C39805en.m127445a() && C6399b.m19946v()) {
            EditCornerViewModel editCornerViewModel = this.f114038T;
            if (editCornerViewModel == null) {
                C7573i.m23583a("cornerViewModel");
            }
            editCornerViewModel.mo106198a(z);
        }
    }

    /* renamed from: a */
    private final void m139534a(OnClickListener onClickListener) {
        new C10741a(this.f33526d_).mo25657b((int) R.string.axo).mo25658b((int) R.string.axp, (OnClickListener) null).mo25650a((int) R.string.axq, (OnClickListener) new C44110aw(onClickListener)).mo25656a().mo25637a().show();
    }

    /* renamed from: d */
    private final void m139579d(boolean z) {
        C44038al M = mo106578M();
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        M.mo106540a((C15389d) editViewModel.mo106448i().getValue());
        mo106578M().mo106544a(z);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        if (!C15450d.m45250b()) {
            m139546aH();
        } else {
            m139547aI();
        }
        m139548aJ();
        if (!C15450d.m45250b()) {
            mo106584S();
            mo106585T();
            mo106586U();
            return;
        }
        EditPreviewViewModel editPreviewViewModel = this.f114035Q;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        editPreviewViewModel.mo106322g().observe(this, new C44101ao(this));
    }

    /* renamed from: a */
    public static void m139535a(VideoPublishEditModel videoPublishEditModel) {
        C27311c a = new C39502ax("VEVideoPublishEditActivity").mo98353a(videoPublishEditModel);
        C7573i.m23582a((Object) a, "draft");
        a.f72018F = System.currentTimeMillis();
        C35563c.f93224F.mo70090e().mo90400a(a);
        C35574k.m114859a().mo70090e().mo90402a(a, false);
    }

    /* renamed from: a */
    private final void m139537a(C44215br brVar) {
        String str;
        if (brVar != null) {
            StringBuilder sb = new StringBuilder();
            List R = brVar.mo106720R();
            int size = R.size();
            for (int i = 0; i < size; i++) {
                TextStickerData data = ((C42088k) R.get(i)).getData();
                if (data == null) {
                    str = "";
                } else {
                    str = data.mFontType;
                }
                sb.append(str);
                if (i != R.size() - 1) {
                    sb.append(",");
                }
            }
            VideoPublishEditModel videoPublishEditModel = this.f114056p;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel.textTypes = sb.toString();
            return;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel2.textTypes = "";
    }

    /* renamed from: e */
    private final void m139581e(boolean z) {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.isStickPointMode) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            if (!videoPublishEditModel2.mIsFromDraft) {
                C10761a.m31387a((Context) this.f33526d_, mo31017x().getString(R.string.e1v)).mo25750a();
            }
            return;
        }
        EditToolbarViewModel editToolbarViewModel = this.f114055o;
        if (editToolbarViewModel == null) {
            C7573i.m23583a("toolbarViewModel");
        }
        editToolbarViewModel.mo106413b(1, false);
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        if (!editViewModel.mo106457r()) {
            EditToolbarViewModel editToolbarViewModel2 = this.f114055o;
            if (editToolbarViewModel2 == null) {
                C7573i.m23583a("toolbarViewModel");
            }
            if (editToolbarViewModel2.f113758d.f114385a) {
                EditToolbarViewModel editToolbarViewModel3 = this.f114055o;
                if (editToolbarViewModel3 == null) {
                    C7573i.m23583a("toolbarViewModel");
                }
                editToolbarViewModel3.f113758d.f114385a = false;
                C35563c.f93246i.mo103859a(true);
            }
        }
        EditViewModel editViewModel2 = this.f114054n;
        if (editViewModel2 == null) {
            C7573i.m23583a("editViewModel");
        }
        if (editViewModel2.mo106457r()) {
            C35563c.f93246i.mo103859a(true);
        }
        m139579d(z);
        EditViewModel editViewModel3 = this.f114054n;
        if (editViewModel3 == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel3.mo106443a(false, false);
        EditViewModel editViewModel4 = this.f114054n;
        if (editViewModel4 == null) {
            C7573i.m23583a("editViewModel");
        }
        int J = editViewModel4.mo106435J();
        VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        if (J > videoPublishEditModel3.mCurMusicLength) {
            C44294cq cqVar = this.f114061u;
            if (cqVar == null) {
                C7573i.m23583a("musicController");
            }
            cqVar.mo106515a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m139584g(boolean z) {
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.mTimeEffect == null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            if (C6311g.m19573a(videoPublishEditModel2.mEffectList)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
                if (videoPublishEditModel3 == null) {
                    C7573i.m23583a("mModel");
                }
                if (!videoPublishEditModel3.hasInfoStickers() && !mo106577L().mo106707af()) {
                    return false;
                }
            }
        }
        mo106577L().mo106703ab();
        mo106577L().mo106701a(z);
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114053m;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        ArrayList<EffectPointModel> arrayList = vEVideoPublishEditViewModel.f121664a;
        C7573i.m23582a((Object) arrayList, "publishEditViewModel.getEffectPointModelStack()");
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f114053m;
        if (vEVideoPublishEditViewModel2 == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        C47458g j = vEVideoPublishEditViewModel2.mo119518j();
        C7573i.m23582a((Object) j, "publishEditViewModel.getFilterEffectOpLiveData()");
        if (!C6311g.m19573a(arrayList)) {
            int[] iArr = new int[arrayList.size()];
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = ((EffectPointModel) arrayList.get(i)).getIndex();
            }
            j.setValue(C47479s.m148210b(iArr));
        }
        VideoPublishEditModel videoPublishEditModel4 = this.f114056p;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("mModel");
        }
        if (!C6311g.m19573a(videoPublishEditModel4.mEffectList)) {
            VideoPublishEditModel videoPublishEditModel5 = this.f114056p;
            if (videoPublishEditModel5 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel5.mEffectList.clear();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo106623b(boolean z) {
        EditViewModel editViewModel = this.f114054n;
        if (editViewModel == null) {
            C7573i.m23583a("editViewModel");
        }
        editViewModel.mo106443a(true, false);
        C39754a aVar = this.f114051k;
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        aVar.mo99153a(false, videoPublishEditModel);
        if (z) {
            VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel2.setUseMultiEdit();
            VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
            if (videoPublishEditModel3 == null) {
                C7573i.m23583a("mModel");
            }
            videoPublishEditModel3.mVideoCoverStartTm = 0.0f;
            VideoPublishEditModel videoPublishEditModel4 = this.f114056p;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("mModel");
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel4.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData == null) {
                C7573i.m23580a();
            }
            int i = curMultiEditVideoRecordData.preVideoDuration;
            C15389d ar = mo106620ar();
            if (ar == null) {
                C7573i.m23580a();
            }
            if (i != ar.mo38860l()) {
                C15389d ar2 = mo106620ar();
                if (ar2 == null) {
                    C7573i.m23580a();
                }
                int l = ar2.mo38860l();
                C39314b.m125637a().f102120e = l;
                IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                VideoPublishEditModel videoPublishEditModel5 = this.f114056p;
                if (videoPublishEditModel5 == null) {
                    C7573i.m23583a("mModel");
                }
                iAVService.getAvMusicWaveBean(videoPublishEditModel5.mMusicPath, false, new C44109av(this, l));
            }
        }
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditInfoStickerViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java)");
            EditInfoStickerViewModel editInfoStickerViewModel = (EditInfoStickerViewModel) a;
            C15389d ar3 = mo106620ar();
            if (ar3 == null) {
                C7573i.m23580a();
            }
            editInfoStickerViewModel.mo106246a(ar3.mo38860l());
            C44066as J = mo106576J();
            VideoPublishEditModel videoPublishEditModel6 = this.f114056p;
            if (videoPublishEditModel6 == null) {
                C7573i.m23583a("mModel");
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData2 = videoPublishEditModel6.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData2 == null) {
                C7573i.m23580a();
            }
            J.mo106571e(curMultiEditVideoRecordData2.musicIndex);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ais, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    public final void mo106624b(boolean z, boolean z2, Runnable runnable) {
        C35563c.f93245h.mo83207b();
        C39500av.m126143b();
        mo31015v().getIntent().getStringExtra("shoot_way");
        Intent intent = new Intent();
        Bundle extras = mo31015v().getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        VideoPublishEditModel videoPublishEditModel = this.f114056p;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel.setMultiEditChallenges();
        VideoPublishEditModel videoPublishEditModel2 = this.f114056p;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mModel");
        }
        videoPublishEditModel2.setMultiEditStickIds();
        ArrayList arrayList = new ArrayList();
        VideoPublishEditModel videoPublishEditModel3 = this.f114056p;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel3.challenges == null) {
            C40687ah ahVar = this.f114046ab;
            if (ahVar == null) {
                C7573i.m23583a("stickerChallengeManager");
            }
            if (!ahVar.mo100873d().isEmpty()) {
                C40687ah ahVar2 = this.f114046ab;
                if (ahVar2 == null) {
                    C7573i.m23583a("stickerChallengeManager");
                }
                arrayList.addAll(ahVar2.mo100873d());
            }
        }
        VideoPublishEditModel videoPublishEditModel4 = this.f114056p;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel4.challenges != null) {
            VideoPublishEditModel videoPublishEditModel5 = this.f114056p;
            if (videoPublishEditModel5 == null) {
                C7573i.m23583a("mModel");
            }
            arrayList.addAll(videoPublishEditModel5.challenges);
            C40687ah ahVar3 = this.f114046ab;
            if (ahVar3 == null) {
                C7573i.m23583a("stickerChallengeManager");
            }
            VideoPublishEditModel videoPublishEditModel6 = this.f114056p;
            if (videoPublishEditModel6 == null) {
                C7573i.m23583a("mModel");
            }
            ahVar3.mo100870a(videoPublishEditModel6.challenges);
        }
        VideoPublishEditModel videoPublishEditModel7 = this.f114056p;
        if (videoPublishEditModel7 == null) {
            C7573i.m23583a("mModel");
        }
        C40687ah ahVar4 = this.f114046ab;
        if (ahVar4 == null) {
            C7573i.m23583a("stickerChallengeManager");
        }
        videoPublishEditModel7.stickerChallenge = ahVar4.mo100871b();
        if (C39360dw.m125725a().mo97931b() != null) {
            AVMusic b = C39360dw.m125725a().mo97931b();
            if (b == null) {
                C7573i.m23580a();
            }
            AVChallenge aVChallenge = b.challenge;
            if (aVChallenge != null && !arrayList.contains(aVChallenge)) {
                arrayList.add(aVChallenge);
            }
        }
        VideoPublishEditModel videoPublishEditModel8 = this.f114056p;
        if (videoPublishEditModel8 == null) {
            C7573i.m23583a("mModel");
        }
        VideoPublishEditModel makeCopy = VideoPublishEditModel.makeCopy(videoPublishEditModel8);
        ArrayList<EffectPointModel> arrayList2 = makeCopy.mEffectList;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                EffectPointModel effectPointModel = (EffectPointModel) arrayList2.get(i);
                C7573i.m23582a((Object) effectPointModel, "model");
                if (effectPointModel.isFromEnd()) {
                    int endPoint = effectPointModel.getEndPoint();
                    int startPoint = effectPointModel.getStartPoint();
                    effectPointModel.setStartPoint(endPoint);
                    effectPointModel.setEndPoint(startPoint);
                    effectPointModel.setFromEnd(false);
                }
            }
        }
        IAVSettingsService avSettingsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService();
        C7573i.m23582a((Object) avSettingsService, "ServiceManager.get().get…java).avSettingsService()");
        if (avSettingsService.isEnableVideoEditActivityUploadSpeedProbe()) {
            makeCopy.uploadSpeedInfo = UploadSpeedProbe.m132144a();
        }
        BaseShortVideoContext baseShortVideoContext = makeCopy;
        C42311e.m134571a(C40005j.m127910a(baseShortVideoContext), C40005j.m127911b(baseShortVideoContext), Scene.EDIT, Scene.PUBLISH);
        String str = "args";
        if (makeCopy != null) {
            intent.putExtra(str, makeCopy);
            StringBuilder sb = new StringBuilder("GoPublishActivity from new edit page");
            sb.append(false);
            C42880h.m136156a(sb.toString());
            intent.putExtra("is_from_sys_share", z);
            intent.putExtra("challenge", arrayList);
            intent.putExtra("enter_record_from_other_platform", z2);
            String str2 = "edit_publish_session_end_together";
            Activity activity = this.f33526d_;
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            intent.putExtra(str2, activity.getIntent().getBooleanExtra("edit_publish_session_end_together", false));
            VideoPublishEditModel videoPublishEditModel9 = this.f114056p;
            if (videoPublishEditModel9 == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel9.isReviewVideo()) {
                intent.putExtra("review_video_fast_publish", !m139563aY());
            }
            C44294cq cqVar = this.f114061u;
            if (cqVar == null) {
                C7573i.m23583a("musicController");
            }
            int b2 = cqVar.mo106516b();
            if (b2 >= 0) {
                intent.putExtra("music_rec_type", b2);
            }
            runnable.run();
            if (z2) {
                C22490b a = C22488a.m74376a();
                Activity v = mo31015v();
                C7573i.m23582a((Object) v, "requireActivity()");
                a.mo59047a(v, intent, 1002);
                return;
            }
            C22490b a2 = C22488a.m74376a();
            Activity v2 = mo31015v();
            C7573i.m23582a((Object) v2, "requireActivity()");
            a2.mo59050a((Context) v2, intent);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.io.Serializable");
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }
}
