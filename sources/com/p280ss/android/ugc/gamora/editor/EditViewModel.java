package com.p280ss.android.ugc.gamora.editor;

import android.arch.lifecycle.C0052o;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29238ba;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39504az;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40687ah;
import com.p280ss.android.ugc.aweme.utils.C43021cp;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel */
public final class EditViewModel extends BaseJediViewModel<EditState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f113781c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "veEditor", "getVeEditor()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "isSaveEffect", "isSaveEffect()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "showSetting", "getShowSetting()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "isSaveMultiEdit", "isSaveMultiEdit()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "isSaveAudioRecord", "isSaveAudioRecord()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "isSaveSubtitle", "isSaveSubtitle()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "enableEditPagePrompt", "getEnableEditPagePrompt()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "filterInternalDefaultIntensityGetter", "getFilterInternalDefaultIntensityGetter()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(EditViewModel.class), "filterIntensityStore", "getFilterIntensityStore()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    public VideoPublishEditModel f113782d;

    /* renamed from: e */
    public C39504az f113783e;

    /* renamed from: f */
    public C40687ah f113784f;

    /* renamed from: g */
    private final C7541d f113785g = C7546e.m23569a(C43959n.f113807a);

    /* renamed from: h */
    private final C7541d f113786h = C7546e.m23569a(C43951f.f113799a);

    /* renamed from: i */
    private final C7541d f113787i = C7546e.m23569a(C43957l.f113805a);

    /* renamed from: j */
    private final C7541d f113788j = C7546e.m23569a(C43952g.f113800a);

    /* renamed from: k */
    private final C7541d f113789k = C7546e.m23569a(C43950e.f113798a);

    /* renamed from: l */
    private final C7541d f113790l = C7546e.m23569a(C43953h.f113801a);

    /* renamed from: m */
    private final C7541d f113791m = C7546e.m23569a(C43947b.f113795a);

    /* renamed from: n */
    private final C7541d f113792n = C7546e.m23569a(C43949d.f113797a);

    /* renamed from: o */
    private final C7541d f113793o = C7546e.m23569a(C43948c.f113796a);

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$a */
    static final class C43946a extends Lambda implements C7562b<EditState, EditState> {

        /* renamed from: a */
        final /* synthetic */ int f113794a;

        C43946a(int i) {
            this.f113794a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditState invoke(EditState editState) {
            C7573i.m23587b(editState, "$receiver");
            return EditState.copy$default(editState, null, null, new C44409e(this.f113794a), null, null, null, 59, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$b */
    static final class C43947b extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C43947b f113795a = new C43947b();

        C43947b() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m139207a() {
            return C35563c.f93231M.mo93305a(Property.EditPagePrompt);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m139207a());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$c */
    static final class C43948c extends Lambda implements C7561a<C0052o<C29230az>> {

        /* renamed from: a */
        public static final C43948c f113796a = new C43948c();

        C43948c() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C29230az> m139208a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139208a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$d */
    static final class C43949d extends Lambda implements C7561a<C0052o<C29238ba>> {

        /* renamed from: a */
        public static final C43949d f113797a = new C43949d();

        C43949d() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C29238ba> m139209a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139209a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$e */
    static final class C43950e extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43950e f113798a = new C43950e();

        C43950e() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139210a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139210a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$f */
    static final class C43951f extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43951f f113799a = new C43951f();

        C43951f() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139211a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139211a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$g */
    static final class C43952g extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43952g f113800a = new C43952g();

        C43952g() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139212a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139212a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$h */
    static final class C43953h extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C43953h f113801a = new C43953h();

        C43953h() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Boolean> m139213a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139213a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$i */
    static final class C43954i extends Lambda implements C7562b<EditState, EditState> {

        /* renamed from: a */
        public static final C43954i f113802a = new C43954i();

        C43954i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139214a((EditState) obj);
        }

        /* renamed from: a */
        private static EditState m139214a(EditState editState) {
            C7573i.m23587b(editState, "$receiver");
            return EditState.copy$default(editState, null, new C44412h(), null, null, null, null, 61, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$j */
    static final class C43955j extends Lambda implements C7562b<EditState, EditState> {

        /* renamed from: a */
        public static final C43955j f113803a = new C43955j();

        C43955j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139215a((EditState) obj);
        }

        /* renamed from: a */
        private static EditState m139215a(EditState editState) {
            C7573i.m23587b(editState, "$receiver");
            return EditState.copy$default(editState, new C44412h(), null, null, null, null, null, 62, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$k */
    static final class C43956k extends Lambda implements C7562b<EditState, EditState> {

        /* renamed from: a */
        final /* synthetic */ int f113804a;

        C43956k(int i) {
            this.f113804a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EditState invoke(EditState editState) {
            C7573i.m23587b(editState, "$receiver");
            return EditState.copy$default(editState, null, null, null, null, Integer.valueOf(this.f113804a), null, 47, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$l */
    static final class C43957l extends Lambda implements C7561a<C0052o<Pair<? extends Boolean, ? extends Boolean>>> {

        /* renamed from: a */
        public static final C43957l f113805a = new C43957l();

        C43957l() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Pair<Boolean, Boolean>> m139217a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139217a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$m */
    static final class C43958m extends Lambda implements C7562b<EditState, EditState> {

        /* renamed from: a */
        public static final C43958m f113806a = new C43958m();

        C43958m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m139218a((EditState) obj);
        }

        /* renamed from: a */
        private static EditState m139218a(EditState editState) {
            C7573i.m23587b(editState, "$receiver");
            return EditState.copy$default(editState, null, null, null, null, null, new C44412h(), 31, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.EditViewModel$n */
    static final class C43959n extends Lambda implements C7561a<C0052o<C15389d>> {

        /* renamed from: a */
        public static final C43959n f113807a = new C43959n();

        C43959n() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C15389d> m139219a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m139219a();
        }
    }

    /* renamed from: K */
    public final C0052o<C29238ba> mo106436K() {
        return (C0052o) this.f113792n.getValue();
    }

    /* renamed from: L */
    public final C0052o<C29230az> mo106437L() {
        return (C0052o) this.f113793o.getValue();
    }

    /* renamed from: i */
    public final C0052o<C15389d> mo106448i() {
        return (C0052o) this.f113785g.getValue();
    }

    /* renamed from: j */
    public final C0052o<Boolean> mo106449j() {
        return (C0052o) this.f113786h.getValue();
    }

    /* renamed from: k */
    public final C0052o<Pair<Boolean, Boolean>> mo106450k() {
        return (C0052o) this.f113787i.getValue();
    }

    /* renamed from: n */
    public final C0052o<Boolean> mo106453n() {
        return (C0052o) this.f113788j.getValue();
    }

    /* renamed from: o */
    public final C0052o<Boolean> mo106454o() {
        return (C0052o) this.f113789k.getValue();
    }

    /* renamed from: p */
    public final C0052o<Boolean> mo106455p() {
        return (C0052o) this.f113790l.getValue();
    }

    /* renamed from: r */
    public final boolean mo106457r() {
        return ((Boolean) this.f113791m.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m139164O();
    }

    /* renamed from: l */
    public final void mo106451l() {
        mo29038c(C43955j.f113803a);
    }

    /* renamed from: m */
    public final void mo106452m() {
        mo29038c(C43954i.f113802a);
    }

    /* renamed from: q */
    public final void mo106456q() {
        mo29038c(C43958m.f113806a);
    }

    /* renamed from: E */
    public static boolean m139162E() {
        if (C35563c.f93231M.mo93306b(Property.RecommentMusicByAIPolicy) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m139163F() {
        return C35563c.f93231M.mo93305a(Property.EnableInfoSticker);
    }

    /* renamed from: O */
    private static EditState m139164O() {
        EditState editState = new EditState(null, null, null, null, null, null, 63, null);
        return editState;
    }

    /* renamed from: u */
    public static boolean m139166u() {
        if (C35563c.f93231M.mo93305a(Property.EnableTextStickerInMain)) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final boolean mo106428A() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel.isReviewVideo();
    }

    /* renamed from: B */
    public final boolean mo106429B() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel.isMultiVideoEditOldJudge();
    }

    /* renamed from: N */
    public final boolean mo106439N() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel.isMultiVideoEdit();
    }

    /* renamed from: f */
    public final VideoPublishEditModel mo29069f() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: g */
    public final C39504az mo106446g() {
        C39504az azVar = this.f113783e;
        if (azVar == null) {
            C7573i.m23583a("videoSizeProvider");
        }
        return azVar;
    }

    /* renamed from: h */
    public final C40687ah mo106447h() {
        C40687ah ahVar = this.f113784f;
        if (ahVar == null) {
            C7573i.m23583a("stickerChallengeManager");
        }
        return ahVar;
    }

    /* renamed from: s */
    public final boolean mo106458s() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel.isStatusVideoType();
    }

    /* renamed from: y */
    public final boolean mo106463y() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel.isMvThemeVideoType();
    }

    /* renamed from: z */
    public final boolean mo106464z() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        return videoPublishEditModel.isStickPointMode;
    }

    /* renamed from: D */
    public final boolean mo106431D() {
        if (!C35563c.f93231M.mo93305a(Property.EnableRecordConversion) || mo106459t() || mo106458s()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final boolean mo106433H() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (videoPublishEditModel.mOrigin == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean mo106438M() {
        int J = mo106435J();
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (J > videoPublishEditModel.mCurMusicLength) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo106459t() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (videoPublishEditModel.videoType == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo106460v() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (!videoPublishEditModel.mFromCut) {
            VideoPublishEditModel videoPublishEditModel2 = this.f113782d;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("publishEditModel");
            }
            if (!videoPublishEditModel2.mFromMultiCut) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public final boolean mo106461w() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (!C6319n.m19593a(videoPublishEditModel.getDuetFrom())) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final boolean mo106432G() {
        if (C35563c.f93231M.mo93305a(Property.EnableSubtitleRecognition) && !mo106463y() && !mo106459t() && !mo106458s() && !mo106461w() && !mo106462x()) {
            VideoPublishEditModel videoPublishEditModel = this.f113782d;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("publishEditModel");
            }
            if (!videoPublishEditModel.mUseMusicBeforeEdit) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0.getWavFile() != null) goto L_0x001c;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo106434I() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.f113782d
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            boolean r0 = r0.isFastImport
            if (r0 != 0) goto L_0x001c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.f113782d
            if (r0 != 0) goto L_0x0016
            java.lang.String r1 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0016:
            java.lang.String r0 = r0.getWavFile()
            if (r0 == 0) goto L_0x003b
        L_0x001c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.f113782d
            if (r0 != 0) goto L_0x0025
            java.lang.String r1 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0025:
            boolean r0 = r0.isMuted
            if (r0 != 0) goto L_0x003b
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.f113782d
            if (r0 != 0) goto L_0x0032
            java.lang.String r1 = "publishEditModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0032:
            boolean r0 = r0.isReviewVideo()
            if (r0 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r0 = 0
            return r0
        L_0x003b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.EditViewModel.mo106434I():boolean");
    }

    /* renamed from: J */
    public final int mo106435J() {
        if (C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic) || !C6399b.m19946v()) {
            Object value = mo106448i().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            return ((C15389d) value).mo38860l();
        }
        Object value2 = mo106448i().getValue();
        if (value2 == null) {
            C7573i.m23580a();
        }
        return Math.min(IAVService.MUSIC_LENGTH_FOR_COPYRIGHT, ((C15389d) value2).mo38860l());
    }

    /* renamed from: x */
    public final boolean mo106462x() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (videoPublishEditModel.getReactionParams() != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f113782d;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("publishEditModel");
            }
            if (!C6319n.m19593a(videoPublishEditModel2.getReactionParams().reactionFromId)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    private final boolean m139165P() {
        VideoPublishEditModel videoPublishEditModel = this.f113782d;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("publishEditModel");
        }
        if (videoPublishEditModel.mOrigin == 0) {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean forbidVoiceChangeOnEditPage = a.getForbidVoiceChangeOnEditPage();
            C7573i.m23582a((Object) forbidVoiceChangeOnEditPage, "SettingsReader.get().forbidVoiceChangeOnEditPage");
            if (forbidVoiceChangeOnEditPage.booleanValue()) {
                return false;
            }
        } else if (!mo106461w() && !mo106462x() && !mo106459t() && !mo106463y() && !mo106464z()) {
            return true;
        } else {
            IESSettingsProxy a2 = C30199h.m98861a();
            C7573i.m23582a((Object) a2, "SettingsReader.get()");
            Boolean forbidVoiceChangeOnEditPage2 = a2.getForbidVoiceChangeOnEditPage();
            C7573i.m23582a((Object) forbidVoiceChangeOnEditPage2, "SettingsReader.get().forbidVoiceChangeOnEditPage");
            if (forbidVoiceChangeOnEditPage2.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public final boolean mo106430C() {
        if (!C35563c.f93231M.mo93305a(Property.EnableVoiceConversion) || !m139165P() || mo106464z() || mo106458s() || ((mo106461w() || mo106462x() || mo106459t() || mo106463y() || mo106434I() || mo106464z()) && !mo106431D())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo106441a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "<set-?>");
        this.f113782d = videoPublishEditModel;
    }

    /* renamed from: a */
    public final void mo106440a(int i) {
        mo29038c(new C43946a(i));
    }

    /* renamed from: b */
    public final void mo106445b(int i) {
        mo29038c(new C43956k(i));
    }

    /* renamed from: a */
    public final void mo106442a(C40687ah ahVar) {
        C7573i.m23587b(ahVar, "<set-?>");
        this.f113784f = ahVar;
    }

    /* renamed from: a */
    public final boolean mo106444a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int a = C43021cp.m136536a(str, false);
        if (mo106461w() || mo106462x() || mo106464z() || mo106435J() >= a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo106443a(boolean z, boolean z2) {
        mo106450k().setValue(new Pair(Boolean.valueOf(z), Boolean.valueOf(z2)));
    }
}
