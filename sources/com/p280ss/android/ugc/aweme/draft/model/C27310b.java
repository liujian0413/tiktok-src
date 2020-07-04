package com.p280ss.android.ugc.aweme.draft.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.p280ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p280ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.draft.model.b */
public final class C27310b {
    @C6593c(mo15949a = "autoEnhanceType")

    /* renamed from: A */
    public int f71937A;
    @C6593c(mo15949a = "micro_app_info")

    /* renamed from: B */
    public MicroAppModel f71938B;
    @C6593c(mo15949a = "video_type")

    /* renamed from: C */
    public int f71939C;
    @C6593c(mo15949a = "texts")

    /* renamed from: D */
    public List<String> f71940D;
    @C6593c(mo15949a = "usePaint")

    /* renamed from: E */
    public boolean f71941E;
    @C6593c(mo15949a = "commentSetting")

    /* renamed from: F */
    public int f71942F;

    /* renamed from: G */
    public SocialModel f71943G;
    @C6593c(mo15949a = "firstStickerMusicIds")

    /* renamed from: H */
    public String f71944H;

    /* renamed from: I */
    public DefaultSelectStickerPoi f71945I;
    @C6593c(mo15949a = "mv_theme_create_video")

    /* renamed from: J */
    public MvCreateVideoData f71946J;
    @C6593c(mo15949a = "status_create_video")

    /* renamed from: K */
    public StatusCreateVideoData f71947K;
    @C6593c(mo15949a = "av_upload_misc_struct")

    /* renamed from: L */
    public AVUploadMiscInfoStruct f71948L;
    @C6593c(mo15949a = "is_fast_import")

    /* renamed from: M */
    public boolean f71949M;
    @C6593c(mo15949a = "fast_import_resolution")

    /* renamed from: N */
    public String f71950N;
    @C6593c(mo15949a = "draft_video_path")

    /* renamed from: O */
    public String f71951O;
    @C6593c(mo15949a = "videoCoverPath")

    /* renamed from: P */
    public String f71952P;
    @C6593c(mo15949a = "cher_effect_param")

    /* renamed from: Q */
    public C27318e f71953Q;
    @C6593c(mo15949a = "videoOutWidth")

    /* renamed from: R */
    public int f71954R;
    @C6593c(mo15949a = "videoOutHeight")

    /* renamed from: S */
    public int f71955S;
    @C6593c(mo15949a = "videoCanvasWidth")

    /* renamed from: T */
    public int f71956T;
    @C6593c(mo15949a = "videoCanvasHeight")

    /* renamed from: U */
    public int f71957U;

    /* renamed from: V */
    public int f71958V;
    @C6593c(mo15949a = "draft_ve_audio_effect_param")

    /* renamed from: W */
    public C27320g f71959W;
    @C6593c(mo15949a = "video_category")

    /* renamed from: X */
    public VideoCategoryParam f71960X;
    @C6593c(mo15949a = "filter_local_path")

    /* renamed from: Y */
    public String f71961Y;
    @C6593c(mo15949a = "camera_ids")

    /* renamed from: Z */
    public String f71962Z;
    @C6593c(mo15949a = "shootMode")

    /* renamed from: a */
    public int f71963a;
    @C6593c(mo15949a = "beauty_type")

    /* renamed from: aa */
    public int f71964aa;
    @C6593c(mo15949a = "import_video_infos")

    /* renamed from: ab */
    public ArrayList<ImportVideoInfo> f71965ab;
    @C6593c(mo15949a = "sticker_challenge")

    /* renamed from: ac */
    public StickerChallenge f71966ac;
    @C6593c(mo15949a = "video_part_metadata")

    /* renamed from: ad */
    public Map<String, ? extends Object> f71967ad;
    @C6593c(mo15949a = "audio_recorder_param")

    /* renamed from: ae */
    public AudioRecorderParam f71968ae;
    @C6593c(mo15949a = "is_stickpoint_mode")

    /* renamed from: af */
    public boolean f71969af;
    @C6593c(mo15949a = "upload_path")

    /* renamed from: ag */
    public String f71970ag;
    @C6593c(mo15949a = "face_id")

    /* renamed from: ah */
    public List<String> f71971ah;
    @C6593c(mo15949a = "draft_preview_configure")

    /* renamed from: ai */
    public C27319f f71972ai;
    @C6593c(mo15949a = "video_segments_copy")

    /* renamed from: aj */
    public List<DraftVideoSegment> f71973aj;
    @C6593c(mo15949a = "preview_info")

    /* renamed from: ak */
    public EditPreviewInfo f71974ak;
    @C6593c(mo15949a = "preview_video_list_copy")

    /* renamed from: al */
    public List<? extends EditVideoSegment> f71975al;
    @C6593c(mo15949a = "videoCount")

    /* renamed from: am */
    public int f71976am;
    @C6593c(mo15949a = "photoCount")

    /* renamed from: an */
    public int f71977an;
    @C6593c(mo15949a = "filter_intensity")

    /* renamed from: ao */
    public float f71978ao;
    @C6593c(mo15949a = "pic2VideoSource")

    /* renamed from: ap */
    public String f71979ap;
    @C6593c(mo15949a = "downloadSetting")

    /* renamed from: aq */
    public int f71980aq;
    @C6593c(mo15949a = "useMusicBeforeEdit")

    /* renamed from: ar */
    public boolean f71981ar;
    @C6593c(mo15949a = "review_video_id")

    /* renamed from: as */
    public String f71982as;
    @C6593c(mo15949a = "support_retake")

    /* renamed from: at */
    public boolean f71983at;
    @C6593c(mo15949a = "multi_edit_video_data")

    /* renamed from: au */
    public MultiEditVideoStatusRecordData f71984au;
    @C6593c(mo15949a = "containBackgroundVideo")

    /* renamed from: av */
    public boolean f71985av;
    @C6593c(mo15949a = "stick_point_data")

    /* renamed from: aw */
    public StickPointData f71986aw;
    @C6593c(mo15949a = "backGroundVideoDraftDir")

    /* renamed from: ax */
    public String f71987ax;
    @C6593c(mo15949a = "from")

    /* renamed from: b */
    public int f71988b;
    @C6593c(mo15949a = "creationId")

    /* renamed from: c */
    public String f71989c;
    @C6593c(mo15949a = "shootWay")

    /* renamed from: d */
    public String f71990d;
    @C6593c(mo15949a = "draftId")

    /* renamed from: e */
    public int f71991e;
    @C6593c(mo15949a = "isMultiVideo")

    /* renamed from: f */
    public boolean f71992f;
    @C6593c(mo15949a = "durationMode")

    /* renamed from: g */
    public boolean f71993g;
    @C6593c(mo15949a = "recordMode")

    /* renamed from: h */
    public int f71994h;
    @C6593c(mo15949a = "gameScore")

    /* renamed from: i */
    public int f71995i;
    @C6593c(mo15949a = "reactionParams")

    /* renamed from: j */
    public ReactionParams f71996j;
    @C6593c(mo15949a = "microAppId")

    /* renamed from: k */
    public String f71997k;
    @C6593c(mo15949a = "isMuted")

    /* renamed from: l */
    public boolean f71998l;
    @C6593c(mo15949a = "musicOrigin")

    /* renamed from: m */
    public String f71999m;
    @C6593c(mo15949a = "mainBusinessData")

    /* renamed from: n */
    public String f72000n;
    @C6593c(mo15949a = "socialData")

    /* renamed from: o */
    public String f72001o;
    @C6593c(mo15949a = "poiData")

    /* renamed from: p */
    public String f72002p;
    @C6593c(mo15949a = "commerceData")

    /* renamed from: q */
    public String f72003q;
    @C6593c(mo15949a = "ugData")

    /* renamed from: r */
    public String f72004r;
    @C6593c(mo15949a = "techData")

    /* renamed from: s */
    public String f72005s;
    @C6593c(mo15949a = "globalData")

    /* renamed from: t */
    public String f72006t;
    @C6593c(mo15949a = "poiId")

    /* renamed from: u */
    public String f72007u;
    @C6593c(mo15949a = "extractFramesModel")

    /* renamed from: v */
    public ExtractFramesModel f72008v;
    @C6593c(mo15949a = "filterId")

    /* renamed from: w */
    public String f72009w;
    @C6593c(mo15949a = "uploadSaveModel")

    /* renamed from: x */
    public AVUploadSaveModel f72010x;
    @C6593c(mo15949a = "infoStickerModel")

    /* renamed from: y */
    public InfoStickerModel f72011y;
    @C6593c(mo15949a = "autoEnhanceOn")

    /* renamed from: z */
    public boolean f72012z;

    public C27310b() {
        this(0, 0, null, null, 0, false, false, 0, 0, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, 0, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, 0, null, null, null, null, false, null, null, null, null, null, null, 0, 0, 0.0f, null, 0, false, null, false, null, false, null, null, -1, -1, 4095, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27310b) {
                C27310b bVar = (C27310b) obj;
                if (this.f71963a == bVar.f71963a) {
                    if ((this.f71988b == bVar.f71988b) && C7573i.m23585a((Object) this.f71989c, (Object) bVar.f71989c) && C7573i.m23585a((Object) this.f71990d, (Object) bVar.f71990d)) {
                        if (this.f71991e == bVar.f71991e) {
                            if (this.f71992f == bVar.f71992f) {
                                if (this.f71993g == bVar.f71993g) {
                                    if (this.f71994h == bVar.f71994h) {
                                        if ((this.f71995i == bVar.f71995i) && C7573i.m23585a((Object) this.f71996j, (Object) bVar.f71996j) && C7573i.m23585a((Object) this.f71997k, (Object) bVar.f71997k)) {
                                            if ((this.f71998l == bVar.f71998l) && C7573i.m23585a((Object) this.f71999m, (Object) bVar.f71999m) && C7573i.m23585a((Object) this.f72000n, (Object) bVar.f72000n) && C7573i.m23585a((Object) this.f72001o, (Object) bVar.f72001o) && C7573i.m23585a((Object) this.f72002p, (Object) bVar.f72002p) && C7573i.m23585a((Object) this.f72003q, (Object) bVar.f72003q) && C7573i.m23585a((Object) this.f72004r, (Object) bVar.f72004r) && C7573i.m23585a((Object) this.f72005s, (Object) bVar.f72005s) && C7573i.m23585a((Object) this.f72006t, (Object) bVar.f72006t) && C7573i.m23585a((Object) this.f72007u, (Object) bVar.f72007u) && C7573i.m23585a((Object) this.f72008v, (Object) bVar.f72008v) && C7573i.m23585a((Object) this.f72009w, (Object) bVar.f72009w) && C7573i.m23585a((Object) this.f72010x, (Object) bVar.f72010x) && C7573i.m23585a((Object) this.f72011y, (Object) bVar.f72011y)) {
                                                if (this.f72012z == bVar.f72012z) {
                                                    if ((this.f71937A == bVar.f71937A) && C7573i.m23585a((Object) this.f71938B, (Object) bVar.f71938B)) {
                                                        if ((this.f71939C == bVar.f71939C) && C7573i.m23585a((Object) this.f71940D, (Object) bVar.f71940D)) {
                                                            if (this.f71941E == bVar.f71941E) {
                                                                if ((this.f71942F == bVar.f71942F) && C7573i.m23585a((Object) this.f71943G, (Object) bVar.f71943G) && C7573i.m23585a((Object) this.f71944H, (Object) bVar.f71944H) && C7573i.m23585a((Object) this.f71945I, (Object) bVar.f71945I) && C7573i.m23585a((Object) this.f71946J, (Object) bVar.f71946J) && C7573i.m23585a((Object) this.f71947K, (Object) bVar.f71947K) && C7573i.m23585a((Object) this.f71948L, (Object) bVar.f71948L)) {
                                                                    if ((this.f71949M == bVar.f71949M) && C7573i.m23585a((Object) this.f71950N, (Object) bVar.f71950N) && C7573i.m23585a((Object) this.f71951O, (Object) bVar.f71951O) && C7573i.m23585a((Object) this.f71952P, (Object) bVar.f71952P) && C7573i.m23585a((Object) this.f71953Q, (Object) bVar.f71953Q)) {
                                                                        if (this.f71954R == bVar.f71954R) {
                                                                            if (this.f71955S == bVar.f71955S) {
                                                                                if (this.f71956T == bVar.f71956T) {
                                                                                    if (this.f71957U == bVar.f71957U) {
                                                                                        if ((this.f71958V == bVar.f71958V) && C7573i.m23585a((Object) this.f71959W, (Object) bVar.f71959W) && C7573i.m23585a((Object) this.f71960X, (Object) bVar.f71960X) && C7573i.m23585a((Object) this.f71961Y, (Object) bVar.f71961Y) && C7573i.m23585a((Object) this.f71962Z, (Object) bVar.f71962Z)) {
                                                                                            if ((this.f71964aa == bVar.f71964aa) && C7573i.m23585a((Object) this.f71965ab, (Object) bVar.f71965ab) && C7573i.m23585a((Object) this.f71966ac, (Object) bVar.f71966ac) && C7573i.m23585a((Object) this.f71967ad, (Object) bVar.f71967ad) && C7573i.m23585a((Object) this.f71968ae, (Object) bVar.f71968ae)) {
                                                                                                if ((this.f71969af == bVar.f71969af) && C7573i.m23585a((Object) this.f71970ag, (Object) bVar.f71970ag) && C7573i.m23585a((Object) this.f71971ah, (Object) bVar.f71971ah) && C7573i.m23585a((Object) this.f71972ai, (Object) bVar.f71972ai) && C7573i.m23585a((Object) this.f71973aj, (Object) bVar.f71973aj) && C7573i.m23585a((Object) this.f71974ak, (Object) bVar.f71974ak) && C7573i.m23585a((Object) this.f71975al, (Object) bVar.f71975al)) {
                                                                                                    if (this.f71976am == bVar.f71976am) {
                                                                                                        if ((this.f71977an == bVar.f71977an) && Float.compare(this.f71978ao, bVar.f71978ao) == 0 && C7573i.m23585a((Object) this.f71979ap, (Object) bVar.f71979ap)) {
                                                                                                            if (this.f71980aq == bVar.f71980aq) {
                                                                                                                if ((this.f71981ar == bVar.f71981ar) && C7573i.m23585a((Object) this.f71982as, (Object) bVar.f71982as)) {
                                                                                                                    if ((this.f71983at == bVar.f71983at) && C7573i.m23585a((Object) this.f71984au, (Object) bVar.f71984au)) {
                                                                                                                        if (!(this.f71985av == bVar.f71985av) || !C7573i.m23585a((Object) this.f71986aw, (Object) bVar.f71986aw) || !C7573i.m23585a((Object) this.f71987ax, (Object) bVar.f71987ax)) {
                                                                                                                            return false;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f71963a * 31) + this.f71988b) * 31;
        String str = this.f71989c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f71990d;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f71991e) * 31;
        boolean z = this.f71992f;
        if (z) {
            z = true;
        }
        int i3 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f71993g;
        if (z2) {
            z2 = true;
        }
        int i4 = (((((i3 + (z2 ? 1 : 0)) * 31) + this.f71994h) * 31) + this.f71995i) * 31;
        ReactionParams reactionParams = this.f71996j;
        int hashCode3 = (i4 + (reactionParams != null ? reactionParams.hashCode() : 0)) * 31;
        String str3 = this.f71997k;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z3 = this.f71998l;
        if (z3) {
            z3 = true;
        }
        int i5 = (hashCode4 + (z3 ? 1 : 0)) * 31;
        String str4 = this.f71999m;
        int hashCode5 = (i5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f72000n;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f72001o;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f72002p;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f72003q;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f72004r;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f72005s;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f72006t;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f72007u;
        int hashCode13 = (hashCode12 + (str12 != null ? str12.hashCode() : 0)) * 31;
        ExtractFramesModel extractFramesModel = this.f72008v;
        int hashCode14 = (hashCode13 + (extractFramesModel != null ? extractFramesModel.hashCode() : 0)) * 31;
        String str13 = this.f72009w;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.f72010x;
        int hashCode16 = (hashCode15 + (aVUploadSaveModel != null ? aVUploadSaveModel.hashCode() : 0)) * 31;
        InfoStickerModel infoStickerModel = this.f72011y;
        int hashCode17 = (hashCode16 + (infoStickerModel != null ? infoStickerModel.hashCode() : 0)) * 31;
        boolean z4 = this.f72012z;
        if (z4) {
            z4 = true;
        }
        int i6 = (((hashCode17 + (z4 ? 1 : 0)) * 31) + this.f71937A) * 31;
        MicroAppModel microAppModel = this.f71938B;
        int hashCode18 = (((i6 + (microAppModel != null ? microAppModel.hashCode() : 0)) * 31) + this.f71939C) * 31;
        List<String> list = this.f71940D;
        int hashCode19 = (hashCode18 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z5 = this.f71941E;
        if (z5) {
            z5 = true;
        }
        int i7 = (((hashCode19 + (z5 ? 1 : 0)) * 31) + this.f71942F) * 31;
        SocialModel socialModel = this.f71943G;
        int hashCode20 = (i7 + (socialModel != null ? socialModel.hashCode() : 0)) * 31;
        String str14 = this.f71944H;
        int hashCode21 = (hashCode20 + (str14 != null ? str14.hashCode() : 0)) * 31;
        DefaultSelectStickerPoi defaultSelectStickerPoi = this.f71945I;
        int hashCode22 = (hashCode21 + (defaultSelectStickerPoi != null ? defaultSelectStickerPoi.hashCode() : 0)) * 31;
        MvCreateVideoData mvCreateVideoData = this.f71946J;
        int hashCode23 = (hashCode22 + (mvCreateVideoData != null ? mvCreateVideoData.hashCode() : 0)) * 31;
        StatusCreateVideoData statusCreateVideoData = this.f71947K;
        int hashCode24 = (hashCode23 + (statusCreateVideoData != null ? statusCreateVideoData.hashCode() : 0)) * 31;
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = this.f71948L;
        int hashCode25 = (hashCode24 + (aVUploadMiscInfoStruct != null ? aVUploadMiscInfoStruct.hashCode() : 0)) * 31;
        boolean z6 = this.f71949M;
        if (z6) {
            z6 = true;
        }
        int i8 = (hashCode25 + (z6 ? 1 : 0)) * 31;
        String str15 = this.f71950N;
        int hashCode26 = (i8 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.f71951O;
        int hashCode27 = (hashCode26 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.f71952P;
        int hashCode28 = (hashCode27 + (str17 != null ? str17.hashCode() : 0)) * 31;
        C27318e eVar = this.f71953Q;
        int hashCode29 = (((((((((((hashCode28 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f71954R) * 31) + this.f71955S) * 31) + this.f71956T) * 31) + this.f71957U) * 31) + this.f71958V) * 31;
        C27320g gVar = this.f71959W;
        int hashCode30 = (hashCode29 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        VideoCategoryParam videoCategoryParam = this.f71960X;
        int hashCode31 = (hashCode30 + (videoCategoryParam != null ? videoCategoryParam.hashCode() : 0)) * 31;
        String str18 = this.f71961Y;
        int hashCode32 = (hashCode31 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.f71962Z;
        int hashCode33 = (((hashCode32 + (str19 != null ? str19.hashCode() : 0)) * 31) + this.f71964aa) * 31;
        ArrayList<ImportVideoInfo> arrayList = this.f71965ab;
        int hashCode34 = (hashCode33 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        StickerChallenge stickerChallenge = this.f71966ac;
        int hashCode35 = (hashCode34 + (stickerChallenge != null ? stickerChallenge.hashCode() : 0)) * 31;
        Map<String, ? extends Object> map = this.f71967ad;
        int hashCode36 = (hashCode35 + (map != null ? map.hashCode() : 0)) * 31;
        AudioRecorderParam audioRecorderParam = this.f71968ae;
        int hashCode37 = (hashCode36 + (audioRecorderParam != null ? audioRecorderParam.hashCode() : 0)) * 31;
        boolean z7 = this.f71969af;
        if (z7) {
            z7 = true;
        }
        int i9 = (hashCode37 + (z7 ? 1 : 0)) * 31;
        String str20 = this.f71970ag;
        int hashCode38 = (i9 + (str20 != null ? str20.hashCode() : 0)) * 31;
        List<String> list2 = this.f71971ah;
        int hashCode39 = (hashCode38 + (list2 != null ? list2.hashCode() : 0)) * 31;
        C27319f fVar = this.f71972ai;
        int hashCode40 = (hashCode39 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        List<DraftVideoSegment> list3 = this.f71973aj;
        int hashCode41 = (hashCode40 + (list3 != null ? list3.hashCode() : 0)) * 31;
        EditPreviewInfo editPreviewInfo = this.f71974ak;
        int hashCode42 = (hashCode41 + (editPreviewInfo != null ? editPreviewInfo.hashCode() : 0)) * 31;
        List<? extends EditVideoSegment> list4 = this.f71975al;
        int hashCode43 = (((((((hashCode42 + (list4 != null ? list4.hashCode() : 0)) * 31) + this.f71976am) * 31) + this.f71977an) * 31) + Float.floatToIntBits(this.f71978ao)) * 31;
        String str21 = this.f71979ap;
        int hashCode44 = (((hashCode43 + (str21 != null ? str21.hashCode() : 0)) * 31) + this.f71980aq) * 31;
        boolean z8 = this.f71981ar;
        if (z8) {
            z8 = true;
        }
        int i10 = (hashCode44 + (z8 ? 1 : 0)) * 31;
        String str22 = this.f71982as;
        int hashCode45 = (i10 + (str22 != null ? str22.hashCode() : 0)) * 31;
        boolean z9 = this.f71983at;
        if (z9) {
            z9 = true;
        }
        int i11 = (hashCode45 + (z9 ? 1 : 0)) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f71984au;
        int hashCode46 = (i11 + (multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.hashCode() : 0)) * 31;
        boolean z10 = this.f71985av;
        if (z10) {
            z10 = true;
        }
        int i12 = (hashCode46 + (z10 ? 1 : 0)) * 31;
        StickPointData stickPointData = this.f71986aw;
        int hashCode47 = (i12 + (stickPointData != null ? stickPointData.hashCode() : 0)) * 31;
        String str23 = this.f71987ax;
        if (str23 != null) {
            i2 = str23.hashCode();
        }
        return hashCode47 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AVDraftExtras(shootMode=");
        sb.append(this.f71963a);
        sb.append(", from=");
        sb.append(this.f71988b);
        sb.append(", creationId=");
        sb.append(this.f71989c);
        sb.append(", shootWay=");
        sb.append(this.f71990d);
        sb.append(", draftId=");
        sb.append(this.f71991e);
        sb.append(", isMultiVideo=");
        sb.append(this.f71992f);
        sb.append(", durationMode=");
        sb.append(this.f71993g);
        sb.append(", recordMode=");
        sb.append(this.f71994h);
        sb.append(", gameScore=");
        sb.append(this.f71995i);
        sb.append(", reactionParams=");
        sb.append(this.f71996j);
        sb.append(", microAppId=");
        sb.append(this.f71997k);
        sb.append(", isMuted=");
        sb.append(this.f71998l);
        sb.append(", musicOrigin=");
        sb.append(this.f71999m);
        sb.append(", mainBusinessData=");
        sb.append(this.f72000n);
        sb.append(", socialData=");
        sb.append(this.f72001o);
        sb.append(", poiData=");
        sb.append(this.f72002p);
        sb.append(", commerceData=");
        sb.append(this.f72003q);
        sb.append(", ugData=");
        sb.append(this.f72004r);
        sb.append(", techData=");
        sb.append(this.f72005s);
        sb.append(", globalData=");
        sb.append(this.f72006t);
        sb.append(", poiId=");
        sb.append(this.f72007u);
        sb.append(", extractFramesModel=");
        sb.append(this.f72008v);
        sb.append(", filterId=");
        sb.append(this.f72009w);
        sb.append(", uploadSaveModel=");
        sb.append(this.f72010x);
        sb.append(", infoStickerModel=");
        sb.append(this.f72011y);
        sb.append(", autoEnhanceOn=");
        sb.append(this.f72012z);
        sb.append(", autoEnhanceType=");
        sb.append(this.f71937A);
        sb.append(", microAppInfo=");
        sb.append(this.f71938B);
        sb.append(", videoType=");
        sb.append(this.f71939C);
        sb.append(", texts=");
        sb.append(this.f71940D);
        sb.append(", usePaint=");
        sb.append(this.f71941E);
        sb.append(", commentSetting=");
        sb.append(this.f71942F);
        sb.append(", socialModel=");
        sb.append(this.f71943G);
        sb.append(", firstStickerMusicIds=");
        sb.append(this.f71944H);
        sb.append(", defaultSelectStickerPoi=");
        sb.append(this.f71945I);
        sb.append(", mvCreateVideoData=");
        sb.append(this.f71946J);
        sb.append(", statusCreateVideoData=");
        sb.append(this.f71947K);
        sb.append(", avUploadMiscInfoStruct=");
        sb.append(this.f71948L);
        sb.append(", isFastImport=");
        sb.append(this.f71949M);
        sb.append(", fastImportResolution=");
        sb.append(this.f71950N);
        sb.append(", draftVideoPath=");
        sb.append(this.f71951O);
        sb.append(", videoCoverPath=");
        sb.append(this.f71952P);
        sb.append(", draftCherEffectParam=");
        sb.append(this.f71953Q);
        sb.append(", videoOutWidth=");
        sb.append(this.f71954R);
        sb.append(", videoOutHeight=");
        sb.append(this.f71955S);
        sb.append(", videoCanvasWidth=");
        sb.append(this.f71956T);
        sb.append(", videoCanvasHeight=");
        sb.append(this.f71957U);
        sb.append(", musicEnd=");
        sb.append(this.f71958V);
        sb.append(", draftVEAudioEffectParam=");
        sb.append(this.f71959W);
        sb.append(", videoCategory=");
        sb.append(this.f71960X);
        sb.append(", filterLocalPath=");
        sb.append(this.f71961Y);
        sb.append(", cameraIds=");
        sb.append(this.f71962Z);
        sb.append(", beautyType=");
        sb.append(this.f71964aa);
        sb.append(", importVideoInfos=");
        sb.append(this.f71965ab);
        sb.append(", stickerChallenge=");
        sb.append(this.f71966ac);
        sb.append(", videoPartMetadata=");
        sb.append(this.f71967ad);
        sb.append(", audioRecorderParam=");
        sb.append(this.f71968ae);
        sb.append(", isStickPointMode=");
        sb.append(this.f71969af);
        sb.append(", uploadPath=");
        sb.append(this.f71970ag);
        sb.append(", faceId=");
        sb.append(this.f71971ah);
        sb.append(", previewConfigure=");
        sb.append(this.f71972ai);
        sb.append(", videoSegmentsCopy=");
        sb.append(this.f71973aj);
        sb.append(", previewInfo=");
        sb.append(this.f71974ak);
        sb.append(", previewVideoListCopy=");
        sb.append(this.f71975al);
        sb.append(", videoCount=");
        sb.append(this.f71976am);
        sb.append(", photoCount=");
        sb.append(this.f71977an);
        sb.append(", filterIntensity=");
        sb.append(this.f71978ao);
        sb.append(", pic2VideoSource=");
        sb.append(this.f71979ap);
        sb.append(", downloadSetting=");
        sb.append(this.f71980aq);
        sb.append(", useMusicBeforeEdit=");
        sb.append(this.f71981ar);
        sb.append(", reviewVideoId=");
        sb.append(this.f71982as);
        sb.append(", supportRetake=");
        sb.append(this.f71983at);
        sb.append(", multiEditVideoData=");
        sb.append(this.f71984au);
        sb.append(", containBackgroundVideo=");
        sb.append(this.f71985av);
        sb.append(", stickPointData=");
        sb.append(this.f71986aw);
        sb.append(", backgroundVideoDraftDir=");
        sb.append(this.f71987ax);
        sb.append(")");
        return sb.toString();
    }

    private C27310b(int i, int i2, String str, String str2, int i3, boolean z, boolean z2, int i4, int i5, ReactionParams reactionParams, String str3, boolean z3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ExtractFramesModel extractFramesModel, String str13, AVUploadSaveModel aVUploadSaveModel, InfoStickerModel infoStickerModel, boolean z4, int i6, MicroAppModel microAppModel, int i7, List<String> list, boolean z5, int i8, SocialModel socialModel, String str14, DefaultSelectStickerPoi defaultSelectStickerPoi, MvCreateVideoData mvCreateVideoData, StatusCreateVideoData statusCreateVideoData, AVUploadMiscInfoStruct aVUploadMiscInfoStruct, boolean z6, String str15, String str16, String str17, C27318e eVar, int i9, int i10, int i11, int i12, int i13, C27320g gVar, VideoCategoryParam videoCategoryParam, String str18, String str19, int i14, ArrayList<ImportVideoInfo> arrayList, StickerChallenge stickerChallenge, Map<String, ? extends Object> map, AudioRecorderParam audioRecorderParam, boolean z7, String str20, List<String> list2, C27319f fVar, List<DraftVideoSegment> list3, EditPreviewInfo editPreviewInfo, List<? extends EditVideoSegment> list4, int i15, int i16, float f, String str21, int i17, boolean z8, String str22, boolean z9, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z10, StickPointData stickPointData, String str23) {
        String str24 = str21;
        C7573i.m23587b(str24, "pic2VideoSource");
        this.f71963a = i;
        this.f71988b = i2;
        this.f71989c = str;
        this.f71990d = str2;
        this.f71991e = i3;
        this.f71992f = z;
        this.f71993g = z2;
        this.f71994h = i4;
        this.f71995i = i5;
        this.f71996j = reactionParams;
        this.f71997k = str3;
        this.f71998l = z3;
        this.f71999m = str4;
        this.f72000n = str5;
        this.f72001o = str6;
        this.f72002p = str7;
        this.f72003q = str8;
        this.f72004r = str9;
        this.f72005s = str10;
        this.f72006t = str11;
        this.f72007u = str12;
        this.f72008v = extractFramesModel;
        this.f72009w = str13;
        this.f72010x = aVUploadSaveModel;
        this.f72011y = infoStickerModel;
        this.f72012z = z4;
        this.f71937A = i6;
        this.f71938B = microAppModel;
        this.f71939C = i7;
        this.f71940D = list;
        this.f71941E = z5;
        this.f71942F = i8;
        this.f71943G = socialModel;
        this.f71944H = str14;
        this.f71945I = defaultSelectStickerPoi;
        this.f71946J = mvCreateVideoData;
        this.f71947K = statusCreateVideoData;
        this.f71948L = aVUploadMiscInfoStruct;
        this.f71949M = z6;
        this.f71950N = str15;
        this.f71951O = str16;
        this.f71952P = str17;
        this.f71953Q = eVar;
        this.f71954R = i9;
        this.f71955S = i10;
        this.f71956T = i11;
        this.f71957U = i12;
        this.f71958V = i13;
        this.f71959W = gVar;
        this.f71960X = videoCategoryParam;
        this.f71961Y = str18;
        this.f71962Z = str19;
        this.f71964aa = i14;
        this.f71965ab = arrayList;
        this.f71966ac = stickerChallenge;
        this.f71967ad = map;
        this.f71968ae = audioRecorderParam;
        this.f71969af = z7;
        this.f71970ag = str20;
        this.f71971ah = list2;
        this.f71972ai = fVar;
        this.f71973aj = list3;
        this.f71974ak = editPreviewInfo;
        this.f71975al = list4;
        this.f71976am = i15;
        this.f71977an = i16;
        this.f71978ao = f;
        this.f71979ap = str24;
        this.f71980aq = i17;
        this.f71981ar = z8;
        this.f71982as = str22;
        this.f71983at = z9;
        this.f71984au = multiEditVideoStatusRecordData;
        this.f71985av = z10;
        this.f71986aw = stickPointData;
        this.f71987ax = str23;
    }

    private /* synthetic */ C27310b(int i, int i2, String str, String str2, int i3, boolean z, boolean z2, int i4, int i5, ReactionParams reactionParams, String str3, boolean z3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ExtractFramesModel extractFramesModel, String str13, AVUploadSaveModel aVUploadSaveModel, InfoStickerModel infoStickerModel, boolean z4, int i6, MicroAppModel microAppModel, int i7, List list, boolean z5, int i8, SocialModel socialModel, String str14, DefaultSelectStickerPoi defaultSelectStickerPoi, MvCreateVideoData mvCreateVideoData, StatusCreateVideoData statusCreateVideoData, AVUploadMiscInfoStruct aVUploadMiscInfoStruct, boolean z6, String str15, String str16, String str17, C27318e eVar, int i9, int i10, int i11, int i12, int i13, C27320g gVar, VideoCategoryParam videoCategoryParam, String str18, String str19, int i14, ArrayList arrayList, StickerChallenge stickerChallenge, Map map, AudioRecorderParam audioRecorderParam, boolean z7, String str20, List list2, C27319f fVar, List list3, EditPreviewInfo editPreviewInfo, List list4, int i15, int i16, float f, String str21, int i17, boolean z8, String str22, boolean z9, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z10, StickPointData stickPointData, String str23, int i18, int i19, int i20, C7571f fVar2) {
        this(0, 3, UUID.randomUUID().toString(), "", 0, false, false, 0, 0, null, null, false, "origin", null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, 0, null, false, 0, null, null, null, null, null, null, false, "720*1280", null, null, null, 0, 0, 0, 0, 0, null, null, null, null, -1, null, null, null, null, false, null, null, null, null, null, null, 0, 0, -1.0f, "", 0, false, null, true, null, false, null, null);
    }

    /* renamed from: a */
    public final void mo70155a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f71979ap = str;
    }
}
