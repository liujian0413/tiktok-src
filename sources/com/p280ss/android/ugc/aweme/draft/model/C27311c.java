package com.p280ss.android.ugc.aweme.draft.model;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.effect.EffectListModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.p280ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39695d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p280ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.draft.model.c */
public final class C27311c {

    /* renamed from: A */
    public int f72013A;

    /* renamed from: B */
    public EffectListModel f72014B;

    /* renamed from: C */
    public long f72015C;

    /* renamed from: D */
    public int f72016D;

    /* renamed from: E */
    public String f72017E;
    @C6593c(mo15949a = "time")

    /* renamed from: F */
    public long f72018F;

    /* renamed from: G */
    public String f72019G;

    /* renamed from: H */
    public int f72020H;

    /* renamed from: I */
    public int f72021I;

    /* renamed from: J */
    public String f72022J;

    /* renamed from: K */
    public String f72023K;

    /* renamed from: L */
    float[] f72024L;

    /* renamed from: M */
    public String f72025M;

    /* renamed from: N */
    public int f72026N;

    /* renamed from: O */
    public float f72027O;

    /* renamed from: P */
    public String f72028P;

    /* renamed from: Q */
    public String f72029Q;

    /* renamed from: R */
    int f72030R;

    /* renamed from: S */
    public C27310b f72031S = new C27310b();
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public int f72032a;
    @C6593c(mo15949a = "aweme")

    /* renamed from: b */
    public C27309a f72033b;
    @C6593c(mo15949a = "photoMovieContext")

    /* renamed from: c */
    public PhotoMovieContext f72034c;

    /* renamed from: d */
    public String f72035d;

    /* renamed from: e */
    public AVMusic f72036e;

    /* renamed from: f */
    String f72037f;

    /* renamed from: g */
    public String f72038g;

    /* renamed from: h */
    public String f72039h;

    /* renamed from: i */
    public int f72040i;

    /* renamed from: j */
    public int f72041j;

    /* renamed from: k */
    public int f72042k;

    /* renamed from: l */
    public int f72043l;

    /* renamed from: m */
    public int f72044m;

    /* renamed from: n */
    public int f72045n;

    /* renamed from: o */
    public String f72046o;

    /* renamed from: p */
    public String f72047p;

    /* renamed from: q */
    public UrlModel f72048q;

    /* renamed from: r */
    public int f72049r;

    /* renamed from: s */
    public String f72050s;

    /* renamed from: t */
    public int f72051t;

    /* renamed from: u */
    public int f72052u;

    /* renamed from: v */
    public int f72053v;

    /* renamed from: w */
    public boolean f72054w;

    /* renamed from: x */
    public boolean f72055x;

    /* renamed from: y */
    public int f72056y = -1;

    /* renamed from: z */
    public long f72057z;

    /* renamed from: a */
    public final void mo70207a(String str) {
        this.f72031S.f72009w = str;
    }

    /* renamed from: a */
    public final void mo70211a(boolean z) {
        if (this.f72031S != null) {
            this.f72031S.f71981ar = z;
        }
    }

    /* renamed from: a */
    public final void mo70208a(ArrayList<ImportVideoInfo> arrayList) {
        this.f72031S.f71965ab = arrayList;
    }

    /* renamed from: a */
    public final void mo70210a(Map<String, Object> map) {
        this.f72031S.f71967ad = map;
    }

    /* renamed from: a */
    public final void mo70204a(ReactionParams reactionParams) {
        this.f72031S.f71996j = reactionParams;
    }

    /* renamed from: a */
    public final void mo70202a(ExtractFramesModel extractFramesModel) {
        this.f72031S.f72008v = extractFramesModel;
    }

    /* renamed from: a */
    public final void mo70201a(AVUploadSaveModel aVUploadSaveModel) {
        this.f72031S.f72010x = aVUploadSaveModel;
    }

    /* renamed from: a */
    public final void mo70198a(MicroAppModel microAppModel) {
        this.f72031S.f71938B = microAppModel;
    }

    /* renamed from: a */
    public final void mo70209a(List<String> list) {
        this.f72031S.f71940D = list;
    }

    /* renamed from: a */
    public final void mo70203a(SocialModel socialModel) {
        this.f72031S.f71943G = socialModel;
    }

    /* renamed from: a */
    public final void mo70196a(MvCreateVideoData mvCreateVideoData) {
        this.f72031S.f71946J = mvCreateVideoData;
    }

    /* renamed from: a */
    public final void mo70206a(StatusCreateVideoData statusCreateVideoData) {
        this.f72031S.f71947K = statusCreateVideoData;
    }

    /* renamed from: a */
    public final void mo70197a(AVUploadMiscInfoStruct aVUploadMiscInfoStruct) {
        this.f72031S.f71948L = aVUploadMiscInfoStruct;
    }

    /* renamed from: a */
    public final void mo70199a(EditPreviewInfo editPreviewInfo) {
        this.f72031S.f71974ak = editPreviewInfo;
    }

    /* renamed from: a */
    public final void mo70195a(StickerChallenge stickerChallenge) {
        this.f72031S.f71966ac = stickerChallenge;
    }

    /* renamed from: a */
    public final void mo70200a(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        this.f72031S.f71984au = multiEditVideoStatusRecordData;
    }

    /* renamed from: a */
    public final void mo70205a(StickPointData stickPointData) {
        this.f72031S.f71986aw = stickPointData;
    }

    /* renamed from: aw */
    private List<DraftVideoSegment> m89409aw() {
        return this.f72031S.f71973aj;
    }

    /* renamed from: ay */
    private String m89411ay() {
        return this.f72031S.f71987ax;
    }

    /* renamed from: A */
    public final boolean mo70159A() {
        return this.f72031S.f71992f;
    }

    /* renamed from: B */
    public final int mo70160B() {
        return this.f72031S.f71994h;
    }

    /* renamed from: C */
    public final int mo70161C() {
        return this.f72031S.f71995i;
    }

    /* renamed from: D */
    public final String mo70162D() {
        return this.f72031S.f71990d;
    }

    /* renamed from: G */
    public final ExtractFramesModel mo70165G() {
        return this.f72031S.f72008v;
    }

    /* renamed from: H */
    public final AVUploadSaveModel mo70166H() {
        return this.f72031S.f72010x;
    }

    /* renamed from: I */
    public final String mo70167I() {
        return this.f72031S.f72007u;
    }

    /* renamed from: J */
    public final String mo70168J() {
        return this.f72031S.f71997k;
    }

    /* renamed from: L */
    public final MicroAppModel mo70170L() {
        return this.f72031S.f71938B;
    }

    /* renamed from: M */
    public final int mo70171M() {
        return this.f72031S.f71939C;
    }

    /* renamed from: N */
    public final List<String> mo70172N() {
        return this.f72031S.f71940D;
    }

    /* renamed from: O */
    public final boolean mo70173O() {
        return this.f72031S.f71941E;
    }

    /* renamed from: P */
    public final SocialModel mo70174P() {
        return this.f72031S.f71943G;
    }

    /* renamed from: Q */
    public final MvCreateVideoData mo70175Q() {
        return this.f72031S.f71946J;
    }

    /* renamed from: R */
    public final StatusCreateVideoData mo70176R() {
        return this.f72031S.f71947K;
    }

    /* renamed from: Y */
    public final AVUploadMiscInfoStruct mo70183Y() {
        return this.f72031S.f71948L;
    }

    /* renamed from: Z */
    public final boolean mo70184Z() {
        return this.f72031S.f71969af;
    }

    /* renamed from: a */
    public final VideoCategoryParam mo70185a() {
        return this.f72031S.f71960X;
    }

    /* renamed from: aa */
    public final boolean mo70212aa() {
        return this.f72031S.f71985av;
    }

    /* renamed from: ab */
    public final String mo70213ab() {
        return this.f72031S.f71979ap;
    }

    /* renamed from: ad */
    public final boolean mo70215ad() {
        return this.f72031S.f71949M;
    }

    /* renamed from: ae */
    public final String mo70216ae() {
        return this.f72031S.f71950N;
    }

    /* renamed from: af */
    public final C27318e mo70217af() {
        return this.f72031S.f71953Q;
    }

    /* renamed from: ah */
    public final AudioRecorderParam mo70219ah() {
        return this.f72031S.f71968ae;
    }

    /* renamed from: ai */
    public final String mo70220ai() {
        return this.f72031S.f71961Y;
    }

    /* renamed from: al */
    public final boolean mo70223al() {
        return this.f72031S.f72012z;
    }

    /* renamed from: am */
    public final int mo70224am() {
        return this.f72031S.f71937A;
    }

    /* renamed from: an */
    public final MultiEditVideoStatusRecordData mo70225an() {
        return this.f72031S.f71984au;
    }

    /* renamed from: ao */
    public final StickerChallenge mo70226ao() {
        return this.f72031S.f71966ac;
    }

    /* renamed from: ap */
    public final List<String> mo70227ap() {
        return this.f72031S.f71971ah;
    }

    /* renamed from: aq */
    public final float mo70228aq() {
        return this.f72031S.f71978ao;
    }

    /* renamed from: ar */
    public final int mo70229ar() {
        return this.f72031S.f71980aq;
    }

    /* renamed from: as */
    public final String mo70230as() {
        return this.f72031S.f71982as;
    }

    /* renamed from: at */
    public final boolean mo70231at() {
        return this.f72031S.f71983at;
    }

    /* renamed from: au */
    public final StickPointData mo70232au() {
        return this.f72031S.f71986aw;
    }

    /* renamed from: b */
    public final String mo70233b() {
        return this.f72031S.f72009w;
    }

    /* renamed from: d */
    public final String mo70244d() {
        return this.f72031S.f71970ag;
    }

    /* renamed from: e */
    public final int mo70248e() {
        return this.f72031S.f71954R;
    }

    /* renamed from: f */
    public final int mo70252f() {
        return this.f72031S.f71955S;
    }

    /* renamed from: g */
    public final int mo70256g() {
        return this.f72031S.f71956T;
    }

    /* renamed from: h */
    public final int mo70260h() {
        return this.f72031S.f71957U;
    }

    /* renamed from: k */
    public final DefaultSelectStickerPoi mo70272k() {
        return this.f72031S.f71945I;
    }

    /* renamed from: l */
    public final String mo70275l() {
        return this.f72031S.f71952P;
    }

    /* renamed from: n */
    public final int mo70281n() {
        return this.f72031S.f71942F;
    }

    /* renamed from: o */
    public final String mo70284o() {
        return this.f72031S.f71962Z;
    }

    /* renamed from: p */
    public final int mo70287p() {
        return this.f72031S.f71964aa;
    }

    /* renamed from: q */
    public final ArrayList<ImportVideoInfo> mo70290q() {
        return this.f72031S.f71965ab;
    }

    /* renamed from: s */
    public final int mo70295s() {
        return this.f72031S.f71977an;
    }

    /* renamed from: t */
    public final Map<String, Object> mo70297t() {
        return this.f72031S.f71967ad;
    }

    /* renamed from: u */
    public final int mo70299u() {
        return this.f72031S.f71988b;
    }

    /* renamed from: v */
    public final int mo70300v() {
        return this.f72031S.f71963a;
    }

    /* renamed from: w */
    public final String mo70301w() {
        return this.f72031S.f71999m;
    }

    /* renamed from: x */
    public final boolean mo70302x() {
        return this.f72031S.f71993g;
    }

    /* renamed from: z */
    public final int mo70304z() {
        return this.f72031S.f71991e;
    }

    /* renamed from: az */
    private void m89412az() {
        C7276d.m22822e(m89411ay());
        C7276d.m22816c(m89411ay());
    }

    /* renamed from: E */
    public final ReactionParams mo70163E() {
        if (this.f72031S != null) {
            return this.f72031S.f71996j;
        }
        return null;
    }

    /* renamed from: F */
    public final boolean mo70164F() {
        if (this.f72031S != null) {
            return this.f72031S.f71998l;
        }
        return false;
    }

    /* renamed from: K */
    public final InfoStickerModel mo70169K() {
        if (this.f72031S != null) {
            return this.f72031S.f72011y;
        }
        return null;
    }

    /* renamed from: S */
    public final boolean mo70177S() {
        if (mo70175Q() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo70178T() {
        if (mo70176R() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final String mo70180V() {
        if (mo70175Q() == null) {
            return null;
        }
        return mo70175Q().videoCoverImgPath;
    }

    /* renamed from: X */
    public final String mo70182X() {
        if (mo70225an() == null) {
            return null;
        }
        return mo70225an().coverImagePath;
    }

    /* renamed from: ag */
    public final C27320g mo70218ag() {
        if (this.f72031S != null) {
            return this.f72031S.f71959W;
        }
        return null;
    }

    /* renamed from: i */
    public final int mo70264i() {
        if (this.f72031S == null) {
            return 0;
        }
        return this.f72031S.f71958V;
    }

    /* renamed from: r */
    public final int mo70293r() {
        return this.f72031S.f71976am;
    }

    /* renamed from: U */
    public final boolean mo70179U() {
        if (mo70225an() == null || !mo70225an().isSupportMultiEdit) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public final String mo70181W() {
        if (mo70176R() == null) {
            return null;
        }
        return mo70176R().getVideoCoverImgPath();
    }

    /* renamed from: aj */
    public final String mo70221aj() {
        if (TextUtils.isEmpty(this.f72035d)) {
            this.f72035d = mo70303y();
        }
        return this.f72035d;
    }

    /* renamed from: y */
    public final String mo70303y() {
        String str = this.f72031S.f71989c;
        if (TextUtils.isEmpty(str)) {
            return UUID.randomUUID().toString();
        }
        return str;
    }

    /* renamed from: av */
    private C27319f m89408av() {
        C27319f fVar = this.f72031S.f71972ai;
        if (fVar != null && this.f72031S.f71973aj != null && !this.f72031S.f71973aj.isEmpty() && !new File(((DraftVideoSegment) fVar.f72071c.get(0)).f71929h).exists()) {
            fVar.mo70314a(this.f72031S.f71973aj);
            C41530am.m132280a("draftOpt==>getDraftPreviewConfigure,using copy video segment");
        }
        return fVar;
    }

    /* renamed from: ax */
    private void m89410ax() {
        InfoStickerModel K = mo70169K();
        if (K != null && !C6307b.m19566a((Collection<T>) K.stickers)) {
            for (StickerItemModel stickerItemModel : K.stickers) {
                if (stickerItemModel.isPin) {
                    C7276d.m22816c(stickerItemModel.pinAlgorithmFile);
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo70271j() {
        if (this.f72031S == null || !this.f72031S.f71981ar) {
            return false;
        }
        return true;
    }

    /* renamed from: ak */
    public final List<EditVideoSegment> mo70222ak() {
        if (this.f72031S.f71975al != null) {
            return this.f72031S.f71975al;
        }
        if (m89409aw() == null || m89409aw().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DraftVideoSegment a : m89409aw()) {
            arrayList.add(C39692a.m127020a(a));
        }
        mo70237b((List<EditVideoSegment>) arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo70243c() {
        if (this.f72053v == 0 || this.f72053v == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo70278m() {
        if (this.f72034c != null) {
            C7276d.m22816c(this.f72034c.mFinalVideoTmpPath);
        } else {
            C39692a.m127024a(mo70214ac(), mo70215ad());
            List<EditVideoSegment> ak = mo70222ak();
            if (ak != null && !ak.isEmpty()) {
                for (EditVideoSegment editVideoSegment : ak) {
                    if (editVideoSegment != null) {
                        C7276d.m22816c(editVideoSegment.getVideoPath());
                        C7276d.m22816c(editVideoSegment.getAudioPath());
                    }
                }
            }
        }
        if (mo70219ah() != null && !TextUtils.isEmpty(mo70219ah().getAudioUrl())) {
            C7276d.m22816c(mo70219ah().getAudioUrl());
            C7276d.m22816c(mo70219ah().getAudioUrlWithoutDraft());
        }
        m89410ax();
        m89412az();
    }

    /* renamed from: ac */
    public final EditPreviewInfo mo70214ac() {
        EditPreviewInfo editPreviewInfo;
        if (this.f72031S.f71974ak != null) {
            EditPreviewInfo editPreviewInfo2 = this.f72031S.f71974ak;
            if (mo70222ak() != null && !mo70222ak().isEmpty()) {
                if (mo70222ak().size() < editPreviewInfo2.getVideoList().size()) {
                    return editPreviewInfo2;
                }
                for (int i = 0; i < editPreviewInfo2.getVideoList().size(); i++) {
                    if (!new File(((EditVideoSegment) editPreviewInfo2.getVideoList().get(i)).getVideoPath()).exists()) {
                        editPreviewInfo2.getVideoList().set(i, mo70222ak().get(i));
                    }
                }
            }
            mo70199a(editPreviewInfo2);
            return editPreviewInfo2;
        }
        C27319f av = m89408av();
        if (av != null) {
            editPreviewInfo = C39692a.m127019a(av);
        } else {
            editPreviewInfo = new C39695d().mo99058a(new EditVideoSegment(this.f72037f, this.f72039h, C39692a.m127021a(this.f72037f)));
            if (!TextUtils.isEmpty(this.f72046o)) {
                editPreviewInfo.setReverseVideoArray(new String[]{this.f72046o});
            }
        }
        mo70199a(editPreviewInfo);
        return editPreviewInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeDraft{id=");
        sb.append(this.f72032a);
        sb.append(", aweme=");
        sb.append(this.f72033b);
        sb.append(", photoMovieContext=");
        sb.append(this.f72034c);
        sb.append(", musicModel=");
        sb.append(this.f72036e);
        sb.append(", videoPath='");
        sb.append(this.f72037f);
        sb.append('\'');
        sb.append(", musicPath='");
        sb.append(this.f72038g);
        sb.append('\'');
        sb.append(", voicePath='");
        sb.append(this.f72039h);
        sb.append('\'');
        sb.append(", videoVolume=");
        sb.append(this.f72040i);
        sb.append(", musicVolume=");
        sb.append(this.f72041j);
        sb.append(", filter=");
        sb.append(this.f72042k);
        sb.append(", musicStart=");
        sb.append(this.f72043l);
        sb.append(", effect=");
        sb.append(this.f72044m);
        sb.append(", origin=");
        sb.append(this.f72045n);
        sb.append(", mReversePath='");
        sb.append(this.f72046o);
        sb.append('\'');
        sb.append(", videoSpeed='");
        sb.append(this.f72047p);
        sb.append('\'');
        sb.append(", audioTrack=");
        sb.append(this.f72048q);
        sb.append(", fiterLabel='");
        sb.append(this.f72050s);
        sb.append('\'');
        sb.append(", cameraPos=");
        sb.append(this.f72051t);
        sb.append(", useBeauty=");
        sb.append(this.f72052u);
        sb.append(", type=");
        sb.append(this.f72053v);
        sb.append(", isWidthDivider=");
        sb.append(this.f72055x);
        sb.append(", privateVideo=");
        sb.append(this.f72013A);
        sb.append(", mEffectListModel=");
        sb.append(this.f72014B);
        sb.append(", maxDuration=");
        sb.append(this.f72015C);
        sb.append(", faceBeauty=");
        sb.append(this.f72016D);
        sb.append(", userId='");
        sb.append(this.f72017E);
        sb.append('\'');
        sb.append(", time=");
        sb.append(this.f72018F);
        sb.append(", videoSegmentsDesc='");
        sb.append(this.f72019G);
        sb.append('\'');
        sb.append(", hardEncode=");
        sb.append(this.f72020H);
        sb.append(", specialPoints=");
        sb.append(this.f72021I);
        sb.append(", stickerPath='");
        sb.append(this.f72022J);
        sb.append('\'');
        sb.append(", stickerID='");
        sb.append(this.f72023K);
        sb.append('\'');
        sb.append(", volumeTaps=");
        sb.append(Arrays.toString(this.f72024L));
        sb.append(", musicEffectSegments='");
        sb.append(this.f72025M);
        sb.append('\'');
        sb.append(", newVersion=");
        sb.append(this.f72026N);
        sb.append(", customCoverStart=");
        sb.append(this.f72027O);
        sb.append(", duetFrom='");
        sb.append(this.f72028P);
        sb.append('\'');
        sb.append(", syncPlatforms='");
        sb.append(this.f72029Q);
        sb.append('\'');
        sb.append(", from='");
        sb.append(this.f72030R);
        sb.append('\'');
        sb.append(", extras=");
        sb.append(this.f72031S);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C27311c mo70186a(float f) {
        this.f72027O = f;
        return this;
    }

    /* renamed from: g */
    public final C27311c mo70257g(int i) {
        this.f72026N = i;
        return this;
    }

    /* renamed from: r */
    private void m89413r(String str) {
        this.f72031S.f71961Y = str;
    }

    /* renamed from: c */
    public final void mo70239c(int i) {
        this.f72031S.f71956T = i;
    }

    /* renamed from: i */
    public final void mo70265i(int i) {
        this.f72031S.f71964aa = i;
    }

    /* renamed from: j */
    public final void mo70268j(int i) {
        this.f72031S.f71976am = i;
    }

    /* renamed from: m */
    public final void mo70279m(int i) {
        this.f72031S.f71963a = i;
    }

    /* renamed from: a */
    public final void mo70187a(int i) {
        this.f72031S.f71954R = i;
    }

    /* renamed from: b */
    public final void mo70234b(float f) {
        this.f72031S.f71978ao = f;
    }

    /* renamed from: c */
    public final void mo70240c(String str) {
        this.f72037f = str;
        if (this.f72031S != null) {
            this.f72031S.f71951O = str;
        }
    }

    /* renamed from: d */
    public final void mo70245d(int i) {
        this.f72031S.f71957U = i;
    }

    /* renamed from: e */
    public final void mo70250e(String str) {
        this.f72031S.f71952P = str;
    }

    /* renamed from: f */
    public final void mo70253f(int i) {
        if (this.f72031S != null) {
            this.f72031S.f71958V = i;
        }
    }

    /* renamed from: g */
    public final C27311c mo70258g(String str) {
        this.f72025M = str;
        return this;
    }

    /* renamed from: h */
    public final void mo70261h(int i) {
        this.f72031S.f71942F = i;
    }

    /* renamed from: j */
    public final void mo70269j(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "edit_draft";
        }
        this.f72031S.f71990d = str;
    }

    /* renamed from: k */
    public final void mo70273k(int i) {
        this.f72031S.f71977an = i;
    }

    /* renamed from: l */
    public final void mo70276l(int i) {
        this.f72031S.f71988b = i;
    }

    /* renamed from: m */
    public final void mo70280m(String str) {
        this.f72031S.f72003q = str;
    }

    /* renamed from: n */
    public final void mo70282n(int i) {
        this.f72031S.f71994h = i;
    }

    /* renamed from: o */
    public final void mo70285o(int i) {
        this.f72031S.f71995i = i;
    }

    /* renamed from: p */
    public final void mo70288p(int i) {
        this.f72031S.f71991e = i;
    }

    /* renamed from: q */
    public final void mo70291q(int i) {
        this.f72031S.f71939C = i;
    }

    /* renamed from: s */
    public final void mo70296s(int i) {
        this.f72031S.f71980aq = i;
    }

    /* renamed from: a */
    public final void mo70188a(AudioRecorderParam audioRecorderParam) {
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom(audioRecorderParam);
        audioRecorderParam2.setAudioUrl(audioRecorderParam2.getDraftAudioUrl());
        audioRecorderParam2.setExtraUrl("");
        this.f72031S.f71968ae = audioRecorderParam2;
    }

    /* renamed from: b */
    public final void mo70235b(int i) {
        this.f72031S.f71955S = i;
    }

    /* renamed from: c */
    public final void mo70241c(List<String> list) {
        this.f72031S.f71971ah = list;
    }

    /* renamed from: d */
    public final void mo70247d(boolean z) {
        this.f72031S.f71998l = z;
    }

    /* renamed from: e */
    public final void mo70249e(int i) {
        this.f72042k = i;
        m89413r(((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74857a(i).mo74978b());
    }

    /* renamed from: f */
    public final void mo70254f(String str) {
        this.f72031S.f71962Z = str;
    }

    /* renamed from: g */
    public final void mo70259g(boolean z) {
        this.f72031S.f71985av = z;
    }

    /* renamed from: h */
    public final void mo70262h(String str) {
        this.f72031S.f71999m = str;
    }

    /* renamed from: i */
    public final void mo70266i(String str) {
        this.f72031S.f71989c = str;
    }

    /* renamed from: j */
    public final void mo70270j(boolean z) {
        this.f72031S.f71983at = z;
    }

    /* renamed from: k */
    public final void mo70274k(String str) {
        this.f72031S.f72007u = str;
    }

    /* renamed from: l */
    public final void mo70277l(String str) {
        this.f72031S.f71997k = str;
    }

    /* renamed from: n */
    public final void mo70283n(String str) {
        C27310b bVar = this.f72031S;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        bVar.mo70155a(str);
    }

    /* renamed from: o */
    public final void mo70286o(String str) {
        this.f72031S.f71950N = str;
    }

    /* renamed from: p */
    public final void mo70289p(String str) {
        this.f72031S.f71982as = str;
    }

    /* renamed from: q */
    public final void mo70292q(String str) {
        this.f72031S.f71987ax = str;
    }

    /* renamed from: r */
    public final void mo70294r(int i) {
        this.f72031S.f71937A = i;
    }

    /* renamed from: a */
    public final void mo70189a(DefaultSelectStickerPoi defaultSelectStickerPoi) {
        this.f72031S.f71945I = defaultSelectStickerPoi;
    }

    /* renamed from: b */
    public final void mo70236b(String str) {
        this.f72031S.f71970ag = str;
    }

    /* renamed from: c */
    public final void mo70242c(boolean z) {
        this.f72031S.f71992f = z;
    }

    /* renamed from: d */
    public final void mo70246d(String str) {
        C6600e retrofitFactoryGson = ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().getRetrofitFactoryGson();
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) retrofitFactoryGson.mo15974a(str, PhotoMovieContext.class);
        if (photoMovieContext != null) {
            if (photoMovieContext.mImageList == null) {
                photoMovieContext = PhotoMovieContext.convertFromOld((PhotoMovieContextOld) retrofitFactoryGson.mo15974a(str, PhotoMovieContextOld.class));
            }
            this.f72034c = photoMovieContext;
        }
    }

    /* renamed from: e */
    public final void mo70251e(boolean z) {
        this.f72031S.f71941E = z;
    }

    /* renamed from: f */
    public final void mo70255f(boolean z) {
        this.f72031S.f71969af = z;
    }

    /* renamed from: h */
    public final void mo70263h(boolean z) {
        this.f72031S.f71949M = z;
    }

    /* renamed from: i */
    public final void mo70267i(boolean z) {
        this.f72031S.f72012z = z;
    }

    /* renamed from: a */
    public final void mo70190a(VideoCategoryParam videoCategoryParam) {
        this.f72031S.f71960X = videoCategoryParam;
    }

    /* renamed from: b */
    public final void mo70237b(List<EditVideoSegment> list) {
        this.f72031S.f71975al = list;
    }

    /* renamed from: a */
    public final void mo70191a(C27310b bVar) {
        this.f72031S = bVar;
        if (this.f72031S != null && !TextUtils.isEmpty(this.f72031S.f71951O)) {
            this.f72037f = this.f72031S.f71951O;
        }
    }

    /* renamed from: b */
    public final void mo70238b(boolean z) {
        this.f72031S.f71993g = z;
    }

    /* renamed from: a */
    public final void mo70192a(C27318e eVar) {
        this.f72031S.f71953Q = eVar;
    }

    /* renamed from: a */
    public final void mo70193a(C27320g gVar) {
        this.f72031S.f71959W = gVar;
    }

    /* renamed from: a */
    public final void mo70194a(InfoStickerModel infoStickerModel) {
        this.f72031S.f72011y = infoStickerModel;
    }
}
