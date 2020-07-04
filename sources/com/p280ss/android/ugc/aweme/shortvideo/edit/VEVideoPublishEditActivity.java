package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.scene.C12596e;
import com.bytedance.scene.C12597f;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12640l;
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.p642b.C12583b;
import com.bytedance.scene.p642b.C12584c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ttve.model.MVInfoBean;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.asve.p756d.C15450d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.filter.C29197ac;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29297h;
import com.p280ss.android.ugc.aweme.filter.model.C29321a;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.port.p1479in.C35538ah.C35540b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C38576cg;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q.C39780a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39558aj;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1560a.C39396a;
import com.p280ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39326d;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39329g;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39331i;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.AudioFocusManager;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41387m;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordPermissionActivity;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40229a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40687ah;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40692b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40414d;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p280ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41524ag;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41545b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.tools.C42130a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42608f;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.gamora.editor.C44082av;
import com.p280ss.android.ugc.gamora.editor.C44167bc;
import com.p280ss.android.ugc.gamora.editor.C44269cg;
import com.p280ss.android.ugc.gamora.editor.C44317cv;
import com.p280ss.android.ugc.gamora.editor.EditCornerViewModel;
import com.p280ss.android.ugc.gamora.editor.EditFilterViewModel;
import com.p280ss.android.ugc.gamora.editor.EditGestureViewModel;
import com.p280ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p280ss.android.ugc.gamora.editor.EditMusicViewModel;
import com.p280ss.android.ugc.gamora.editor.EditPreviewViewModel;
import com.p280ss.android.ugc.gamora.editor.EditStickerViewModel;
import com.p280ss.android.ugc.gamora.editor.EditTextStickerViewModel;
import com.p280ss.android.ugc.gamora.editor.EditToolbarViewModel;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.editor.p1743b.C44148a;
import com.p280ss.android.ugc.gamora.editor.p1743b.C44148a.C44159a;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47466l;
import dmt.p1861av.video.C47514t;
import dmt.p1861av.video.C47520y;
import dmt.p1861av.video.CompileProbeViewModel;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.p357a.C7561a;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity */
public class VEVideoPublishEditActivity extends AmeActivity implements C23258e, C41387m, C44159a {

    /* renamed from: a */
    public static String f102286a = "VEVideoPublishEditActivity";

    /* renamed from: A */
    private boolean f102287A;

    /* renamed from: B */
    private C40687ah f102288B = new C40687ah(this);

    /* renamed from: C */
    private List<C23254a> f102289C = new ArrayList();

    /* renamed from: D */
    private boolean f102290D;

    /* renamed from: E */
    private C44167bc f102291E;

    /* renamed from: F */
    private C39396a f102292F = new C39396a();

    /* renamed from: G */
    private Boolean f102293G;

    /* renamed from: H */
    private C44317cv f102294H = new C44317cv();

    /* renamed from: b */
    protected ViewGroup f102295b;

    /* renamed from: c */
    protected AVMusic f102296c;

    /* renamed from: d */
    protected boolean f102297d;

    /* renamed from: e */
    public boolean f102298e;

    /* renamed from: f */
    protected boolean f102299f;

    /* renamed from: g */
    protected VEVideoPublishEditViewModel f102300g;

    /* renamed from: h */
    protected VideoPublishEditModel f102301h;

    /* renamed from: i */
    public C39504az f102302i;

    /* renamed from: j */
    protected EditPreviewViewModel f102303j;

    /* renamed from: k */
    protected EditViewModel f102304k;

    /* renamed from: l */
    protected C44269cg f102305l;

    /* renamed from: m */
    protected EditToolbarViewModel f102306m;

    /* renamed from: n */
    protected EditTextStickerViewModel f102307n;

    /* renamed from: o */
    protected EditStickerViewModel f102308o;

    /* renamed from: p */
    protected EditCornerViewModel f102309p;

    /* renamed from: q */
    protected EditGestureViewModel f102310q;

    /* renamed from: r */
    protected EditFilterViewModel f102311r;

    /* renamed from: s */
    protected EditLyricStickerViewModel f102312s;

    /* renamed from: t */
    protected EditMusicViewModel f102313t;

    /* renamed from: u */
    protected CompileProbeViewModel f102314u;

    /* renamed from: v */
    protected C44082av f102315v;

    /* renamed from: w */
    public C29230az f102316w;

    /* renamed from: x */
    public C29296g f102317x = null;

    /* renamed from: y */
    private int f102318y;

    /* renamed from: z */
    private boolean f102319z;

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final VEVideoPublishEditActivity mo98081e() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo98086g() {
        this.f102290D = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo98088i() {
        this.f102298e = true;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo98090k() {
        this.f102298e = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo98091l() {
        this.f102290D = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C12629j mo98063a(ClassLoader classLoader, String str, Bundle bundle) {
        if (TextUtils.equals(C44082av.class.getName(), str)) {
            return this.f102315v;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98071a(String str, String str2) {
        this.f102301h.mUploadPath = str;
        C40229a.m128552a().put(str2, str);
        TextUtils.isEmpty(this.f102301h.commerceData);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98073a(Pair pair) {
        m125847a(((Boolean) pair.getFirst()).booleanValue(), ((Boolean) pair.getSecond()).booleanValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98068a(C15389d dVar) {
        if (dVar != null) {
            this.f102301h.setVideoLength(dVar.mo38860l());
            if (this.f102301h.isMvThemeVideoType()) {
                MVInfoBean e = dVar.mo38840e();
                if (e.width > 0 && e.height > 0) {
                    EditVideoSegment editVideoSegment = (EditVideoSegment) this.f102301h.getPreviewInfo().getVideoList().get(0);
                    List videoList = this.f102301h.getPreviewInfo().getVideoList();
                    String videoPath = editVideoSegment.getVideoPath();
                    String audioPath = editVideoSegment.getAudioPath();
                    VideoFileInfo videoFileInfo = new VideoFileInfo(e.width, e.height, (long) dVar.mo38860l(), 30);
                    videoList.set(0, editVideoSegment.copy(videoPath, audioPath, videoFileInfo));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98074a(C7581n nVar) throws Exception {
        m125839A();
        this.f102314u.mo119463a().mo106489a();
        this.f102315v.mo106600a(this.f102297d, this.f102319z, (Runnable) new C39409al(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98070a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            this.f102300g.mo119511c().setValue(C47466l.m148179a(true, this.f102301h.isReviewVideo(), this.f102301h.veAudioEffectParam));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98072a(Void voidR) {
        C6921a.m21555a("receive prepare done event in edit page presist");
        if (mo98077c() != null && this.f102301h.infoStickerModel != null) {
            SubtitleModule.m131123a(this.f102301h.infoStickerModel, (AbstractMap<Integer, StickerItemModel>) SubtitleModule.m131124ab());
            SubtitleModule.m131121a(mo98077c(), C35563c.f93238a, this.f102301h, SubtitleModule.m131124ab());
        }
    }

    /* renamed from: a */
    public final void mo98065a(int i) {
        this.f102295b.setBackgroundColor(i);
        this.f102303j.mo106320a(i);
    }

    /* renamed from: a */
    public final void mo98064a() {
        if (C39805en.m127445a()) {
            C39558aj.m126339a(this.f102301h.videoWidth(), this.f102301h.videoHeight());
            this.f102304k.mo106456q();
            switch (C39804em.f103457a) {
                case 1:
                case 4:
                    m125846a(true);
                    m125849b(true);
                    return;
                case 2:
                case 5:
                    m125846a(false);
                    m125849b(true);
                    return;
                case 3:
                case 6:
                    m125846a(true);
                    m125849b(false);
                    return;
                default:
                    m125846a(false);
                    m125849b(false);
                    return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98069a(AVChallenge aVChallenge) {
        if (aVChallenge != null) {
            if (this.f102301h.challenges == null) {
                this.f102301h.challenges = new ArrayList();
            }
            this.f102301h.challenges.add(aVChallenge);
        }
    }

    /* renamed from: a */
    public final Intent mo98062a(VideoPublishEditModel videoPublishEditModel) {
        if (m125848b(videoPublishEditModel).isSegmentsNotValid()) {
            m125841a((int) R.string.fpa, (int) R.string.w_, (int) R.string.bbe);
            return null;
        }
        Intent intent = new Intent(this, VideoRecordPermissionActivity.class);
        intent.putExtra("draft_to_edit_from", this.f102318y);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.veCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", videoPublishEditModel.veCherEffectParam);
        }
        intent.putExtra("restore", 1);
        intent.putExtra("workspace", videoPublishEditModel.mWorkspace);
        intent.putExtra("translation_type", 3);
        intent.putExtra("video_edit_model", videoPublishEditModel);
        intent.putExtra("path", videoPublishEditModel.mMusicPath);
        intent.putExtra("creation_id", videoPublishEditModel.creationId);
        intent.putExtra("draft_id", videoPublishEditModel.draftId);
        C33242an.m107315a("video_post_page");
        videoPublishEditModel.removeChallengeFromTitleAndStruct(this.f102288B.mo100872c());
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.structList);
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        intent.putExtra("extra_av_navigation_bar_height", C39805en.m127451d(this));
        if (videoPublishEditModel.hasRetake() || (videoPublishEditModel.multiEditVideoRecordData != null && videoPublishEditModel.multiEditVideoRecordData.isSupportMultiEdit)) {
            m125844a(intent, videoPublishEditModel.multiEditVideoRecordData);
        }
        return intent;
    }

    /* renamed from: a */
    public final void mo98067a(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        startActivity(intent);
        C39360dw.m125725a().mo97936f();
        C39360dw.m125725a().mo97929a((Collection<AVChallenge>) videoPublishEditModel.challenges);
        C39360dw.m125725a().mo97933c();
        C39500av.m126135a((Context) this, this.f102301h);
        finish();
    }

    /* renamed from: A */
    private void m125839A() {
        this.f102315v.mo106577L().mo106705ad();
    }

    /* renamed from: c */
    public final C15389d mo98077c() {
        return (C15389d) this.f102304k.mo106448i().getValue();
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.ayd);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ C7581n mo98089j() {
        runOnUiThread(new C39407aj(this));
        return null;
    }

    public void onPause() {
        this.f102294H.mo106788a(Event.ON_PAUSE);
        UploadSpeedProbe.m132152b();
        super.onPause();
    }

    public void onStop() {
        this.f102294H.mo106788a(Event.ON_STOP);
        super.onStop();
    }

    /* renamed from: m */
    private void m125851m() {
        if (this.f102301h.isMvThemeVideoType()) {
            f102286a = "MV";
        } else {
            f102286a = "VEVideoPublishEditActivity";
        }
    }

    /* renamed from: o */
    private boolean m125853o() {
        return ((Boolean) this.f102300g.mo119526r().getValue()).booleanValue();
    }

    /* renamed from: p */
    private boolean m125854p() {
        return ((Boolean) this.f102300g.mo119527s().getValue()).booleanValue();
    }

    /* renamed from: r */
    private void m125856r() {
        if (this.f102293G.booleanValue()) {
            this.f102300g.mo119517i().observe(this, new C0053p<C29321a>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onChanged(C29321a aVar) {
                    if (aVar != null) {
                        C29296g gVar = aVar.f77314b;
                        if (VEVideoPublishEditActivity.this.f102317x == null) {
                            VEVideoPublishEditActivity.this.f102317x = gVar;
                            return;
                        }
                        C15389d c = VEVideoPublishEditActivity.this.mo98077c();
                        if (!(VEVideoPublishEditActivity.this.f102317x.f77266a == gVar.f77266a || c == null)) {
                            C29230az azVar = VEVideoPublishEditActivity.this.f102316w;
                            c.getClass();
                            C6907h.m21524a("adjust_filter_complete", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").mo59973a("creation_id", VEVideoPublishEditActivity.this.f102301h.creationId).mo59973a("shoot_way", VEVideoPublishEditActivity.this.f102301h.mShootWay).mo59970a("draft_id", VEVideoPublishEditActivity.this.f102301h.draftId).mo59970a("filter_id", gVar.f77266a).mo59973a("filter_name", gVar.f77267b).mo59972a("value", (Object) Float.valueOf(C29297h.m96116a(gVar, azVar, C39418au.m125909a(c)))).f60753a);
                            VEVideoPublishEditActivity.this.f102317x = gVar;
                        }
                    }
                }
            });
        }
    }

    /* renamed from: x */
    private boolean m125862x() {
        if (this.f102301h.veAudioRecorderParam == null || (!this.f102301h.veAudioRecorderParam.hasRecord() && this.f102301h.veAudioRecorderParam.getNeedOriginalSound())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo88338b() {
        return this.f102299f;
    }

    /* renamed from: f */
    public final Map mo98083f() {
        HashMap hashMap = new HashMap();
        if (this.f102301h != null) {
            hashMap.put("creation_id", this.f102301h.creationId);
        }
        return hashMap;
    }

    /* renamed from: q */
    private void m125855q() {
        if (!((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isEnableVideoEditActivityUploadSpeedProbe()) {
            return;
        }
        if (C29958a.m98225a((Context) this) || (C29958a.m98226b(this) && C35563c.f93257t.mo83280a())) {
            UploadSpeedProbe.m132145a(getApplicationContext());
        }
    }

    /* renamed from: u */
    private void m125859u() {
        if (getIntent().hasExtra("extra_share_context")) {
            ShareContext shareContext = (ShareContext) getIntent().getSerializableExtra("extra_share_context");
            if (shareContext != null && C35563c.f93259v.mo83150a(shareContext) && shareContext.mTargetSceneType == 1) {
                C35563c.f93259v.mo83147a(this, shareContext, "Sharing canceled", 20013);
            }
        }
    }

    /* renamed from: v */
    private void m125860v() {
        new C10741a(this).mo25649a((int) R.string.pu).mo25657b((int) R.string.pt).mo25658b((int) R.string.w_, (OnClickListener) new C39399ab(this)).mo25650a((int) R.string.pq, (OnClickListener) new C39400ac(this)).mo25656a().mo25637a();
    }

    /* renamed from: w */
    private void m125861w() {
        new C10741a(this).mo25657b((int) R.string.ox).mo25661b(getString(R.string.w_), (OnClickListener) new C39401ad(this)).mo25654a(getString(R.string.vj), (OnClickListener) new C39402ae(this)).mo25656a().mo25637a();
    }

    /* renamed from: d */
    public final boolean mo98080d() {
        if (!this.f102290D || (this.f102301h.isMvThemeVideoType() && !C35563c.f93231M.mo93305a(Property.EnableEditPageMVMemoryOpt))) {
            return false;
        }
        return true;
    }

    public void finish() {
        m125850c(false);
        if (this.f102301h.commerceData != null) {
            C7705c.m23799a().mo20394d(new C39329g(this.f102301h.commerceData));
        }
        overridePendingTransition(0, R.anim.t);
        super.finish();
    }

    public Resources getResources() {
        if (!this.f102287A) {
            C41524ag.m132264b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    public void onStart() {
        this.f102294H.mo106788a(Event.ON_START);
        super.onStart();
        if (!TextUtils.isEmpty(this.f102301h.mMusicPath) && this.f102301h.mCurMusicLength <= 0) {
            this.f102301h.mCurMusicLength = C35563c.f93246i.mo103862b(this.f102301h.mMusicPath);
        }
        C39500av.m126147d(this.f102301h);
    }

    /* renamed from: n */
    private void m125852n() {
        this.f102304k.mo106450k().observe(this, new C39408ak(this));
        this.f102304k.mo106448i().observe(this, new C39410am(this));
        this.f102305l.mo106758a(this.f102304k, (C7326g<C7581n>) new C39411an<C7581n>(this));
        this.f102305l.mo106759b(this.f102304k, new C39412ao(this));
        this.f102300g.mo119523o().observe(mo98081e(), new C39413ap(this));
        this.f102303j.mo106325j().observe(this, new C39414aq(this));
    }

    /* renamed from: t */
    private C39786w<Integer, Integer, Integer> m125858t() {
        if (this.f102301h.mIsFromDraft && (this.f102301h.mFromMultiCut || this.f102301h.mFromCut)) {
            return C39786w.m127396a(Integer.valueOf(R.string.dau), Integer.valueOf(R.string.w_), Integer.valueOf(R.string.bbe));
        }
        if (this.f102301h.mFromMultiCut || this.f102301h.mFromCut) {
            return C39786w.m127396a(Integer.valueOf(R.string.fpc), Integer.valueOf(R.string.w_), Integer.valueOf(R.string.bbe));
        }
        return C39786w.m127396a(Integer.valueOf(R.string.fpa), Integer.valueOf(R.string.w_), Integer.valueOf(R.string.bbe));
    }

    /* renamed from: y */
    private boolean m125863y() {
        boolean z;
        if (this.f102301h.isStatusVideoType()) {
            z = this.f102315v.mo106618ap();
        } else if (this.f102315v.mo106577L().mo106707af() || this.f102301h.hasInfoStickers()) {
            z = true;
        } else {
            z = false;
        }
        if (!C6311g.m19574b(this.f102301h.mEffectList) && this.f102301h.mTimeEffect == null && !m125862x() && !this.f102301h.isChangeMultiEditData() && !z) {
            return true;
        }
        new C10741a(this).mo25649a((int) R.string.dh1).mo25657b((int) R.string.dh0).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.ah1, (OnClickListener) new C39403af(this)).mo25656a().mo25637a().show();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo98087h() {
        C7276d.m22810b(new File(C39810eq.f103469e));
        C7276d.m22811b(this.f102301h.uniqueVideoSessionDir(C39810eq.f103480p), C39810eq.f103469e);
        if (this.f102301h.isMultiVideoEdit()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f102301h.uniqueVideoSessionDir(C39810eq.f103470f));
            sb.append(File.separator);
            C39702d.m127063a(sb.toString(), C39810eq.f103469e, this.f102301h, (C7561a<C7581n>) new C39405ah<C7581n>(this));
        } else {
            C7276d.m22815c(this.f102301h.uniqueVideoSessionDir(C39810eq.f103470f), C39810eq.f103469e);
            C6726a.m20844b(new C39406ai(this));
        }
        if (this.f102301h.containBackgroundVideo) {
            C40414d.m129227b(this.f102301h);
        }
    }

    public void onDestroy() {
        this.f102294H.mo106788a(Event.ON_DESTROY);
        super.onDestroy();
        C35563c.f93246i.mo103848a((C42608f) null);
        C35563c.f93246i.mo103867e().mo103930q();
        C35563c.f93250m.mo83217a((C35540b) null, (FragmentActivity) null, true);
        m125850c(false);
        C42039d.m133620a().mo103240f();
        if (C35563c.f93231M.mo93305a(Property.EnableSubtitleRecognition)) {
            this.f102303j.mo106325j().removeObservers(this);
            if (mo98077c() != null) {
                SubtitleModule.m131120a(mo98077c());
            }
        }
        if (EditViewModel.m139162E()) {
            C35563c.f93246i.mo103867e().mo103921a(null);
            C35563c.f93246i.mo103867e().mo103925i();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", true);
        this.f102287A = true;
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C41524ag.m132262a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", false);
            return;
        }
        this.f102294H.mo106788a(Event.ON_RESUME);
        super.onResume();
        C41545b.m132307a().mo102190c("av_video_edit");
        this.f102290D = false;
        m125855q();
        C41524ag.m132262a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onResume", false);
    }

    /* renamed from: z */
    private void m125864z() {
        this.f102315v.mo106577L().mo106708ag();
        C39360dw.m125725a().mo97928a(this.f102296c);
        if (this.f102301h.mIsFromDraft) {
            this.f102301h.mMusicPath = this.f102315v.f114061u.mo106520e();
            if (!this.f102301h.mUseMusicBeforeEdit) {
                this.f102301h.mWorkspace.mo96318f();
                C39360dw.m125725a().mo97928a((AVMusic) null);
            }
            if (!this.f102298e) {
                C10761a.m31409e(getApplicationContext(), (int) R.string.b6l).mo25750a();
                return;
            }
            if (!C7276d.m22812b(this.f102301h.mStickerPath)) {
                this.f102301h.mStickerPath = null;
                this.f102301h.mStickerID = "";
            }
            Intent a = mo98062a(this.f102301h);
            if (a != null) {
                mo98067a(a, this.f102301h);
            }
        } else if (this.f102301h.hasRetake()) {
            Intent intent = new Intent(this, VideoRecordNewActivity.class);
            m125844a(intent, this.f102301h.multiEditVideoRecordData);
            C39360dw.m125725a().mo97928a(this.f102301h.getOriginalRecordMusic());
            startActivity(intent);
            finish();
        } else {
            C39500av.m126159o(this.f102301h);
            C39360dw.m125725a().mo97936f();
            C39360dw.m125725a().mo97929a((Collection<AVChallenge>) this.f102301h.challenges);
            C39360dw.m125725a().mo97933c();
            m125859u();
            finish();
        }
    }

    /* renamed from: s */
    private boolean m125857s() {
        this.f102314u.mo119463a().mo106489a();
        C39500av.m126166v(this.f102301h);
        if (this.f102301h.recordMode != 1 && (!C6319n.m19593a(this.f102301h.getDuetFrom()) || this.f102304k.mo106462x())) {
            m125859u();
            finish();
            return true;
        } else if (C39526e.m126243a(this.f102301h) != null) {
            C39786w a = C39786w.m127396a(Integer.valueOf(R.string.dat), Integer.valueOf(R.string.w_), Integer.valueOf(R.string.afn));
            m125841a(((Integer) a.f103419a).intValue(), ((Integer) a.f103420b).intValue(), ((Integer) a.f103421c).intValue());
            return false;
        } else if (this.f102301h.recordMode == 1) {
            if (this.f102301h.mIsFromDraft) {
                C39786w a2 = C39786w.m127396a(Integer.valueOf(R.string.dau), Integer.valueOf(R.string.w_), Integer.valueOf(R.string.bbe));
                m125841a(((Integer) a2.f103419a).intValue(), ((Integer) a2.f103420b).intValue(), ((Integer) a2.f103421c).intValue());
                return false;
            }
            m125860v();
            return false;
        } else if (this.f102301h.mOrigin == 0 && this.f102301h.mIsFromDraft) {
            m125861w();
            return false;
        } else if ((this.f102301h.isMvThemeVideoType() || this.f102301h.isStatusVideoType()) && this.f102301h.mIsFromDraft) {
            m125861w();
            return false;
        } else if (this.f102301h.mFromCut || this.f102301h.mOrigin == 0 || this.f102301h.mFromMultiCut) {
            C39786w t = m125858t();
            m125841a(((Integer) t.f103419a).intValue(), ((Integer) t.f103420b).intValue(), ((Integer) t.f103421c).intValue());
            return false;
        } else {
            if (m125863y()) {
                m125864z();
            }
            return false;
        }
    }

    /* renamed from: c */
    private void m125850c(boolean z) {
        this.f102299f = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98076b(C7581n nVar) throws Exception {
        m125857s();
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C39326d dVar) {
        finish();
    }

    /* renamed from: a */
    public final void mo60525a(C23254a aVar) {
        this.f102289C.add(aVar);
    }

    /* renamed from: b */
    public final void mo60526b(C23254a aVar) {
        this.f102289C.remove(aVar);
    }

    /* renamed from: b */
    private static RecordScene m125848b(VideoPublishEditModel videoPublishEditModel) {
        RecordScene audioTrack = new RecordScene().musicPath(videoPublishEditModel.mMusicPath).musicStart(videoPublishEditModel.mMusicStart).faceBeauty(videoPublishEditModel.mFaceBeauty).videoSegment(videoPublishEditModel.mVideoSegmentsDesc).hardEncode(videoPublishEditModel.mHardEncode).mp4Path(videoPublishEditModel.videoPath()).maxDuration(videoPublishEditModel.maxDuration).audioTrack(videoPublishEditModel.audioTrack);
        C39360dw.m125725a().f102253h = audioTrack;
        return audioTrack;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (!C15450d.m45249a()) {
            C15450d.m45248a(C35563c.f93231M.mo93305a(Property.EditorSceneLazyInit));
            StringBuilder sb = new StringBuilder("ASVEPerformance EditorSceneLazyInit : ");
            sb.append(C15450d.m45250b());
            C41530am.m132285d(sb.toString());
        }
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.f102304k.mo106457r()) {
                this.f102291E.mo99225a();
                return;
            }
            HashSet hashSet = null;
            if (this.f102301h.isReviewVideo() && !this.f102301h.mIsFromDraft) {
                hashSet = new HashSet();
                hashSet.add("music");
            }
            C39779q.m127361a((C39780a) this.f102291E, (Set<String>) hashSet);
        }
    }

    /* renamed from: b */
    private void m125849b(boolean z) {
        int i;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.cp);
        EditCornerViewModel editCornerViewModel = this.f102309p;
        int i2 = 0;
        if (z) {
            i = dimensionPixelSize;
        } else {
            i = 0;
        }
        editCornerViewModel.mo106199b(i);
        EditToolbarViewModel editToolbarViewModel = this.f102306m;
        if (!z) {
            i2 = (int) C9738o.m28708b((Context) this, 20.0f);
        }
        editToolbarViewModel.mo106412b(i2);
        this.f102306m.mo106417c(dimensionPixelSize);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C39331i iVar) {
        this.f102301h.title = iVar.f102164a;
        this.f102301h.structList = iVar.f102165b;
        this.f102301h.isPrivate = iVar.f102166c;
        this.f102301h.poiId = iVar.f102167d;
        this.f102301h.challenges = iVar.f102169f;
        this.f102301h.commentSetting = iVar.f102170g;
        this.f102301h.defaultSelectStickerPoi = iVar.f102168e;
        this.f102301h.compileProbeResult = iVar.f102173j;
        this.f102301h.commerceData = iVar.f102174k;
        this.f102301h.allowDownloadSetting = iVar.f102175l;
        this.f102301h.microAppId = null;
        this.f102301h.microAppModel = null;
        this.f102301h.videoCategory = iVar.f102176m;
        iVar.f102171h.mo97889a(this.f102301h);
    }

    /* renamed from: a */
    private VideoPublishEditModel m125840a(Intent intent) {
        this.f102301h = new C39502ax("VEVideoPublishEditActivity").mo98354a(intent);
        this.f102301h.setNewVersion(C35563c.f93224F.mo70090e().mo90403b());
        this.f102297d = intent.getBooleanExtra("is_from_sys_share", false);
        this.f102318y = intent.getIntExtra("draft_to_edit_from", 0);
        this.f102300g.mo119509a(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f102301h.getFilterIndex()), true);
        AVMusic b = C39360dw.m125725a().mo97931b();
        this.f102296c = b;
        if (b != null) {
            this.f102301h.musicId = b.getMusicId();
            this.f102301h.previewStartTime = b.getPreviewStartTime();
            this.f102301h.isCommerceMusic = b.isCommerceMusic();
            this.f102301h.isOriginalSound = b.isOriginalSound();
            this.f102301h.mId3Album = b.getAlbum();
            this.f102301h.mId3Title = b.getName();
            this.f102301h.mId3Author = b.getSinger();
            this.f102301h.mMusicType = C35563c.f93246i.mo103860a(b.getMusicType()) ? 1 : 0;
        }
        if (this.f102301h.mIsFromDraft) {
            this.f102298e = false;
            C42130a.m134090a().execute(new C39415ar(this));
        }
        if (this.f102301h.recordMode == 1 && !this.f102301h.mIsFromDraft) {
            this.f102301h.mMusicPath = null;
        }
        this.f102301h.pic2VideoSource = intent.getStringExtra("picture_source");
        String stringExtra = intent.getStringExtra("extra_festival_external_challenge_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            new C40692b(this, stringExtra).mo100874a(new C39416as(this));
        }
        return this.f102301h;
    }

    /* renamed from: a */
    private void m125845a(C12604b bVar) {
        bVar.mo30929a((C12584c) new C12583b() {

            /* renamed from: a */
            boolean f102320a;

            /* renamed from: a */
            public final void mo30857a(final C12629j jVar) {
                super.mo30857a(jVar);
                if (jVar instanceof C44148a) {
                    jVar.getLifecycle().mo55a(new C0042h() {
                        @C0054q(mo125a = Event.ON_START)
                        public void onStart() {
                            jVar.getLifecycle().mo56b(this);
                            VEVideoPublishEditActivity.this.f102315v.f114051k.mo99151a(VEVideoPublishEditActivity.this.mo98077c());
                            if (!C393911.this.f102320a) {
                                if (VEVideoPublishEditActivity.this.f102301h.mIsFromDraft && VEVideoPublishEditActivity.this.f102301h.mTimeEffect != null && VEVideoPublishEditActivity.this.f102301h.mTimeEffect.getKey().equals("1")) {
                                    C15389d c = VEVideoPublishEditActivity.this.mo98077c();
                                    if (c != null) {
                                        if (!VEVideoPublishEditActivity.this.f102301h.isFastImport) {
                                            c.mo38821b(VEVideoPublishEditActivity.this.f102301h.getPreviewInfo().getReverseVideoArray());
                                        } else {
                                            c.mo38793a(VEVideoPublishEditActivity.this.f102301h.getPreviewInfo().getReverseVideoArray(), VEVideoPublishEditActivity.this.f102301h.getPreviewInfo().getReverseAudioArray());
                                            c.mo38802a(VEVideoPublishEditActivity.this.f102301h.getPreviewInfo().getTempVideoArray());
                                        }
                                        c.mo38839e(true);
                                        if (VEVideoPublishEditActivity.this.f102301h.isFastImport) {
                                            VEVideoPublishEditActivity.this.f102300g.mo119521m().setValue(VEVolumeChangeOp.ofVoice(VEVideoPublishEditActivity.this.f102301h.voiceVolume));
                                        }
                                        c.mo38879v();
                                    }
                                }
                                C393911.this.f102320a = true;
                            }
                        }
                    });
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C7581n mo98095a(C12629j jVar, Integer num) {
                C39804em.m127430a(jVar.f33523b, (Context) VEVideoPublishEditActivity.this.mo98081e(), VEVideoPublishEditActivity.this.f102302i.mo98355c(), VEVideoPublishEditActivity.this.f102302i.mo98356d());
                VEVideoPublishEditActivity.this.mo98064a();
                return null;
            }

            /* renamed from: a */
            public final void mo30858a(C12629j jVar, Bundle bundle) {
                C47520y yVar;
                super.mo30858a(jVar, bundle);
                if (jVar instanceof C44148a) {
                    if (!C39805en.m127445a()) {
                        C39804em.m127439b(jVar.f33523b, VEVideoPublishEditActivity.this.f102302i.mo98355c(), VEVideoPublishEditActivity.this.f102302i.mo98356d());
                    } else {
                        C39804em.m127430a(jVar.f33523b, (Context) VEVideoPublishEditActivity.this.mo98081e(), VEVideoPublishEditActivity.this.f102302i.mo98355c(), VEVideoPublishEditActivity.this.f102302i.mo98356d());
                        VEVideoPublishEditActivity.this.mo98064a();
                        new C38576cg(VEVideoPublishEditActivity.this.mo98081e()).mo96555a(new C39417at(this, jVar));
                    }
                    if (VEVideoPublishEditActivity.this.f102301h.mTimeEffect != null) {
                        String key = VEVideoPublishEditActivity.this.f102301h.mTimeEffect.getKey();
                        char c = 65535;
                        switch (key.hashCode()) {
                            case 48:
                                if (key.equals("0")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 49:
                                if (key.equals("1")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 50:
                                if (key.equals("2")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 51:
                                if (key.equals("3")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                yVar = C47520y.m148314a();
                                break;
                            case 1:
                                yVar = C47520y.m148315a((long) VEVideoPublishEditActivity.this.f102301h.mTimeEffect.getEndPoint());
                                break;
                            case 2:
                                yVar = C47520y.m148317b((long) VEVideoPublishEditActivity.this.f102301h.mTimeEffect.getEndPoint());
                                break;
                            case 3:
                                yVar = C47520y.m148316b();
                                break;
                            default:
                                throw new AssertionError();
                        }
                        VEVideoPublishEditActivity.this.f102300g.mo119520l().setValue(yVar);
                    }
                }
            }
        }, true);
    }

    /* renamed from: a */
    private void m125846a(boolean z) {
        int i;
        int c = C39805en.m127450c(this);
        EditCornerViewModel editCornerViewModel = this.f102309p;
        if (z) {
            i = c;
        } else {
            i = 0;
        }
        editCornerViewModel.mo106197a(i);
        this.f102306m.mo106406a(c);
        this.f102304k.mo106445b(c);
        this.f102308o.mo106362a(Integer.valueOf(c));
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onCreate", true);
        this.f102294H.mo106788a(Event.ON_CREATE);
        super.onCreate(bundle);
        C41545b.m132307a().mo102189b("av_video_edit");
        if (VERSION.SDK_INT >= 21) {
            getWindow().setSharedElementReenterTransition(new AutoTransition());
            getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        setContentView((int) R.layout.fd);
        m125850c(true);
        if (getIntent() == null) {
            finish();
        }
        this.f102293G = Boolean.valueOf(C35563c.f93231M.mo93305a(Property.EnableFilterIntensityJust));
        this.f102300g = (VEVideoPublishEditViewModel) C0069x.m159a((FragmentActivity) this).mo147a(VEVideoPublishEditViewModel.class);
        this.f102301h = m125840a(getIntent());
        if (!this.f102301h.isPreviewInfoValid()) {
            C41530am.m132283b("VideoEditPage finish because of null EditPreviewInfo");
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onCreate", false);
            return;
        }
        m125851m();
        this.f102303j = (EditPreviewViewModel) C36113b.m116288a(this).mo91871a(EditPreviewViewModel.class);
        this.f102304k = (EditViewModel) C36113b.m116288a(this).mo91871a(EditViewModel.class);
        this.f102304k.mo106441a(this.f102301h);
        this.f102304k.mo106442a(this.f102288B);
        this.f102316w = C29197ac.m95828a(f102286a);
        this.f102304k.mo106437L().setValue(this.f102316w);
        this.f102306m = (EditToolbarViewModel) C36113b.m116288a(this).mo91871a(EditToolbarViewModel.class);
        this.f102307n = (EditTextStickerViewModel) C36113b.m116288a(this).mo91871a(EditTextStickerViewModel.class);
        this.f102308o = (EditStickerViewModel) C36113b.m116288a(this).mo91871a(EditStickerViewModel.class);
        this.f102309p = (EditCornerViewModel) C36113b.m116288a(this).mo91871a(EditCornerViewModel.class);
        this.f102310q = (EditGestureViewModel) C36113b.m116288a(this).mo91871a(EditGestureViewModel.class);
        this.f102311r = (EditFilterViewModel) C36113b.m116288a(this).mo91871a(EditFilterViewModel.class);
        this.f102312s = (EditLyricStickerViewModel) C36113b.m116288a(this).mo91871a(EditLyricStickerViewModel.class);
        this.f102313t = (EditMusicViewModel) C36113b.m116288a(this).mo91871a(EditMusicViewModel.class);
        this.f102314u = (CompileProbeViewModel) C0069x.m159a((FragmentActivity) this).mo147a(CompileProbeViewModel.class);
        this.f102305l = new C44269cg(getLifecycle());
        this.f102291E = new C44167bc(this.f102304k, this.f102306m);
        this.f102302i = C39512ba.m126206a(this.f102301h, false);
        this.f102304k.f113783e = this.f102302i;
        StringBuilder sb = new StringBuilder("VEVideoPublishEditActivity filter_id_list:");
        sb.append(this.f102301h.mCurFilterIds);
        sb.append(" prop_list:");
        sb.append(this.f102301h.mStickerID);
        sb.append(" effect_list:");
        sb.append(this.f102301h.getEditEffectList());
        sb.append(" info_sticker_list:");
        sb.append(this.f102301h.getInfoStickerList());
        C41530am.m132285d(sb.toString());
        this.f102319z = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        if (this.f102301h.mEffectList != null) {
            C47514t.m148293a(this.f102301h.mEffectList, this.f102300g.mo119518j());
        }
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        if (C39805en.m127445a()) {
            getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            C39805en.m127444a((Activity) this);
            if (VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
        }
        m125852n();
        this.f102315v = new C44082av();
        this.f102315v.f114063w = this.f102294H;
        this.f102315v.mo106593a(this.f102288B);
        C12596e a = C12597f.m36512a(this, C44082av.class).mo30880a((int) R.id.cuv).mo30881a((C12640l) new C39789y(this)).mo30882a(false).mo30879a();
        this.f102295b = (ViewGroup) findViewById(R.id.cuv);
        m125845a(a.mo30865a());
        if (C39805en.m127445a()) {
            mo98064a();
            mo98065a(getResources().getColor(R.color.fs));
        }
        if (this.f102301h.mIsFromDraft && this.f102301h.getNewVersion() != C35563c.f93224F.mo70090e().mo90403b()) {
            C41530am.m132284c("enter ve_edit_page with old version draft");
        }
        C39500av.m126137a(this.f102301h, getIntent());
        getLifecycle().mo55a(AudioFocusManager.m131309a(this));
        if (C39360dw.m125725a().mo97931b() != null) {
            if (C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic)) {
                this.f102301h.mCurMusicLength = C39360dw.m125725a().mo97931b().getPresenterDuration();
            } else {
                this.f102301h.mCurMusicLength = C39360dw.m125725a().mo97931b().getDuration();
            }
        }
        if (EditViewModel.m139162E()) {
            this.f102292F.mo98210a(this, this.f102301h);
            C35563c.f93246i.mo103867e().mo103924b(new C39790z(this));
        }
        m125856r();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98066a(DialogInterface dialogInterface, int i) {
        m125864z();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo98078c(DialogInterface dialogInterface, int i) {
        m125859u();
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98075b(DialogInterface dialogInterface, int i) {
        this.f102315v.mo106601a(true, this.f102297d, this.f102319z, (Runnable) new C39404ag(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo98082e(DialogInterface dialogInterface, int i) {
        if (this.f102301h.recordMode == 1) {
            C39500av.m126157m(this.f102301h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo98079d(DialogInterface dialogInterface, int i) {
        if (this.f102301h.recordMode == 1) {
            C39500av.m126158n(this.f102301h);
        }
        m125859u();
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo98084f(DialogInterface dialogInterface, int i) {
        C35563c.f93253p.mo90376a();
        C39360dw.m125725a().mo97928a(this.f102296c);
        C39360dw.m125725a().mo97934d();
        m125859u();
        finish();
    }

    /* renamed from: a */
    private static void m125844a(Intent intent, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        intent.putParcelableArrayListExtra("original_segments", multiEditVideoStatusRecordData.originalSegments);
        intent.putExtra("original_music_start", multiEditVideoStatusRecordData.originalMusicStart);
        intent.putExtra("retake_shoot_mode", 2);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (C23254a a : this.f102289C) {
            if (a.mo60522a(i, keyEvent)) {
                return true;
            }
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        Fragment a2 = getSupportFragmentManager().mo2642a((int) R.id.cuv);
        if (a2 != null) {
            getSupportFragmentManager().mo2645a().mo2587a(a2).mo2604c();
            return true;
        }
        m125857s();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0192  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m125847a(boolean r7, boolean r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L_0x0037
            boolean r8 = r6.m125853o()
            if (r8 == 0) goto L_0x0016
            com.ss.android.ugc.gamora.editor.EditStickerViewModel r8 = r6.f102308o
            android.arch.lifecycle.o r8 = r8.mo29069f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.setValue(r0)
            goto L_0x0037
        L_0x0016:
            boolean r8 = r6.m125854p()
            if (r8 == 0) goto L_0x002a
            com.ss.android.ugc.gamora.editor.EditStickerViewModel r8 = r6.f102308o
            android.arch.lifecycle.o r8 = r8.mo106363g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.setValue(r0)
            goto L_0x0037
        L_0x002a:
            com.ss.android.ugc.gamora.editor.EditStickerViewModel r8 = r6.f102308o
            android.arch.lifecycle.o r8 = r8.mo106364h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.setValue(r0)
        L_0x0037:
            if (r7 != 0) goto L_0x0041
            r6.m125839A()
            com.ss.android.ugc.gamora.editor.EditTextStickerViewModel r8 = r6.f102307n
            r8.mo29069f()
        L_0x0041:
            com.ss.android.ugc.gamora.editor.EditGestureViewModel r8 = r6.f102310q
            r8.mo106229a(r7)
            com.ss.android.ugc.gamora.editor.EditViewModel r8 = r6.f102304k
            boolean r8 = r8.mo106461w()
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r6.f102304k
            boolean r0 = r0.mo106462x()
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo106422d(r7)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo29069f()
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo106411a(r7)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f102301h
            boolean r1 = r1.isMvThemeVideoType()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x008a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f102301h
            boolean r1 = r1.isStickPointMode
            if (r1 != 0) goto L_0x008a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f102301h
            boolean r1 = r1.isReviewVideo()
            if (r1 == 0) goto L_0x007a
            goto L_0x008a
        L_0x007a:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f102301h
            boolean r1 = r1.mIsFromDraft
            if (r1 == 0) goto L_0x0090
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            if (r7 == 0) goto L_0x008c
            if (r8 != 0) goto L_0x008c
            if (r0 != 0) goto L_0x008c
            r4 = 1
            goto L_0x008d
        L_0x008a:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
        L_0x008c:
            r4 = 0
        L_0x008d:
            r1.mo106416b(r4)
        L_0x0090:
            boolean r1 = com.p280ss.android.ugc.gamora.editor.EditViewModel.m139162E()
            if (r1 == 0) goto L_0x00a6
            com.ss.android.ugc.gamora.editor.EditMusicViewModel r1 = r6.f102313t
            com.ss.android.ugc.gamora.editor.EditViewModel r4 = r6.f102304k
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r6.f102301h
            java.lang.String r5 = r5.mMusicPath
            boolean r4 = r4.mo106444a(r5)
            r1.mo106301a(r4)
            goto L_0x00d6
        L_0x00a6:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            com.ss.android.ugc.gamora.editor.EditViewModel r4 = r6.f102304k
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r6.f102301h
            java.lang.String r5 = r5.mMusicPath
            boolean r4 = r4.mo106444a(r5)
            r5 = 8
            r1.mo106407a(r5, r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            if (r7 == 0) goto L_0x00c1
            if (r8 != 0) goto L_0x00c1
            if (r0 != 0) goto L_0x00c1
            r4 = 1
            goto L_0x00c2
        L_0x00c1:
            r4 = 0
        L_0x00c2:
            r1.mo106424e(r5, r4)
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f102304k
            int r1 = r1.mo106435J()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f102301h
            int r4 = r4.mCurMusicLength
            if (r1 <= r4) goto L_0x00d6
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo106421d(r5, r3)
        L_0x00d6:
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f102304k
            boolean r1 = r1.mo106430C()
            r4 = 6
            if (r1 == 0) goto L_0x00e4
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo106424e(r4, r7)
        L_0x00e4:
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f102304k
            boolean r1 = r1.mo106430C()
            if (r1 == 0) goto L_0x0127
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f102304k
            boolean r1 = r1.mo106461w()
            if (r1 != 0) goto L_0x010c
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f102304k
            boolean r1 = r1.mo106462x()
            if (r1 != 0) goto L_0x010c
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f102304k
            boolean r1 = r1.mo106463y()
            if (r1 != 0) goto L_0x010c
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f102304k
            boolean r1 = r1.mo106434I()
            if (r1 == 0) goto L_0x0127
        L_0x010c:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f102301h
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r1.veAudioRecorderParam
            if (r1 == 0) goto L_0x0122
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r6.f102301h
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r1.veAudioRecorderParam
            boolean r1 = r1.hasRecord()
            if (r1 == 0) goto L_0x0122
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo106421d(r4, r2)
            goto L_0x0127
        L_0x0122:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo106421d(r4, r3)
        L_0x0127:
            com.ss.android.ugc.gamora.editor.EditViewModel r1 = r6.f102304k
            boolean r1 = r1.mo106428A()
            if (r1 == 0) goto L_0x0134
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo106421d(r2, r3)
        L_0x0134:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f102301h
            boolean r4 = r4.isStickPointMode
            r4 = r4 ^ r2
            r5 = 7
            r1.mo106407a(r5, r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            if (r7 == 0) goto L_0x0147
            if (r8 != 0) goto L_0x0147
            r4 = 1
            goto L_0x0148
        L_0x0147:
            r4 = 0
        L_0x0148:
            r1.mo106424e(r5, r4)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r4 = 9
            if (r7 == 0) goto L_0x0159
            boolean r5 = com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b.C39506a.m126193d()
            if (r5 == 0) goto L_0x0159
            r5 = 1
            goto L_0x015a
        L_0x0159:
            r5 = 0
        L_0x015a:
            r1.mo106424e(r4, r5)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r4 = 11
            if (r7 == 0) goto L_0x016d
            com.ss.android.ugc.gamora.editor.EditViewModel r5 = r6.f102304k
            boolean r5 = r5.mo106432G()
            if (r5 == 0) goto L_0x016d
            r5 = 1
            goto L_0x016e
        L_0x016d:
            r5 = 0
        L_0x016e:
            r1.mo106424e(r4, r5)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r4 = 5
            r1.mo106424e(r4, r7)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            r1.mo106419c(r7)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r1 = r6.f102306m
            if (r7 == 0) goto L_0x0186
            if (r8 != 0) goto L_0x0186
            if (r0 != 0) goto L_0x0186
            r8 = 1
            goto L_0x0187
        L_0x0186:
            r8 = 0
        L_0x0187:
            r1.mo106424e(r2, r8)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r8 = r6.f102306m
            r0 = 2
            r8.mo106424e(r0, r7)
            if (r7 != 0) goto L_0x0197
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r8 = r6.f102306m
            r8.mo106418c(r0, r3)
        L_0x0197:
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r8 = r6.f102306m
            r0 = 4
            if (r7 == 0) goto L_0x01a4
            boolean r1 = com.p280ss.android.ugc.gamora.editor.EditViewModel.m139163F()
            if (r1 == 0) goto L_0x01a4
            r1 = 1
            goto L_0x01a5
        L_0x01a4:
            r1 = 0
        L_0x01a5:
            r8.mo106424e(r0, r1)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r8 = r6.f102306m
            r0 = 3
            if (r7 == 0) goto L_0x01b4
            boolean r1 = com.p280ss.android.ugc.gamora.editor.EditViewModel.m139166u()
            if (r1 == 0) goto L_0x01b4
            goto L_0x01b5
        L_0x01b4:
            r2 = 0
        L_0x01b5:
            r8.mo106424e(r0, r2)
            com.ss.android.ugc.gamora.editor.EditToolbarViewModel r8 = r6.f102306m
            r0 = 12
            r8.mo106424e(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m125847a(boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m125843a(Context context, Intent intent, int i) {
        intent.setClass(context, VEVideoPublishEditActivity.class);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private void m125841a(int i, int i2, int i3) {
        new C10741a(this).mo25657b(i).mo25658b(i2, (OnClickListener) null).mo25650a(i3, (OnClickListener) new C39398aa(this)).mo25656a().mo25637a();
    }

    /* renamed from: a */
    public static void m125842a(Activity activity, Intent intent, int i) {
        intent.setClass(activity, VEVideoPublishEditActivity.class);
        activity.startActivityForResult(intent, intent.getIntExtra("extra_request_code", 1002));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f102315v.f114052l != null) {
            this.f102315v.f114052l.mo106775a(i, i2, intent);
        }
        if (i == 1002) {
            Intent intent2 = new Intent();
            if (!(intent == null || intent.getExtras() == null)) {
                String string = intent.getExtras().getString("publish result");
                StringBuilder sb = new StringBuilder("PublishEditActivity success");
                sb.append(string);
                intent2.putExtra("edit result", sb.toString());
                intent2.putExtras(intent.getExtras());
            }
            setResult(i2, intent2);
            if (i2 == -1) {
                finish();
            }
        }
    }
}
