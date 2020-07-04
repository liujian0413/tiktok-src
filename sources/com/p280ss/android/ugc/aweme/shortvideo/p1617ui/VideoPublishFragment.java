package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0728b;
import android.support.p022v4.graphics.drawable.C0730d;
import android.support.p022v4.util.C0902i;
import android.text.InputFilter;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.asve.recorder.camera.p923a.C20705b;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20726i;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p1062f.C23337e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.effectplatform.C27484h;
import com.p280ss.android.ugc.aweme.effectplatform.C27495o;
import com.p280ss.android.ugc.aweme.effectplatform.C27498p;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.festival.C29130b;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.imported.C32066b;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p1001al.p1002a.C22489a;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35544ak.C35545a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35554aq.C35556b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o.C35579a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p280ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IPermissionAction;
import com.p280ss.android.ugc.aweme.services.publish.MobParam;
import com.p280ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.Publish;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.services.publish.SeedPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C38458ar;
import com.p280ss.android.ugc.aweme.shortvideo.C38543br;
import com.p280ss.android.ugc.aweme.shortvideo.C38581cj;
import com.p280ss.android.ugc.aweme.shortvideo.C39318cx;
import com.p280ss.android.ugc.aweme.shortvideo.C39319cy;
import com.p280ss.android.ugc.aweme.shortvideo.C39320cz;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39361dx;
import com.p280ss.android.ugc.aweme.shortvideo.C39799ej;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39955gf;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.C38417b;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39502ax;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39503ay;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39513bb;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.MainBusinessContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.presenter.C40213a;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40229a;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40230b;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40233e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40414d;
import com.p280ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41516ac;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41539as;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41554h;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41558k;
import com.p280ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.C41589a;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.C41593b;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42993bx;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;
import org.greenrobot.eventbus.C7705c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishFragment */
public class VideoPublishFragment extends Fragment implements C35542a, C38581cj {

    /* renamed from: A */
    private C41653c f107189A;

    /* renamed from: B */
    private long f107190B;

    /* renamed from: C */
    private long f107191C;

    /* renamed from: D */
    private CheckBox f107192D;

    /* renamed from: E */
    private FrameLayout f107193E;

    /* renamed from: F */
    private List<C0902i<Class<?>, IAVPublishExtension<?>>> f107194F = C35563c.f93257t.mo83275a(AVPublishContentType.Video);

    /* renamed from: G */
    private boolean f107195G;

    /* renamed from: H */
    private boolean f107196H;

    /* renamed from: I */
    private boolean f107197I;

    /* renamed from: J */
    private ShareContext f107198J;

    /* renamed from: K */
    private int f107199K = -1;

    /* renamed from: L */
    private boolean f107200L;

    /* renamed from: M */
    private boolean f107201M;

    /* renamed from: N */
    private C41589a f107202N;

    /* renamed from: a */
    CommonItemView f107203a;

    /* renamed from: b */
    CommonItemView f107204b;

    /* renamed from: c */
    C0052o f107205c = new C0052o();

    /* renamed from: d */
    C39320cz f107206d;

    /* renamed from: e */
    RelativeLayout f107207e;

    /* renamed from: f */
    View f107208f;

    /* renamed from: g */
    C40230b f107209g = new C40230b();

    /* renamed from: h */
    C39955gf f107210h;

    /* renamed from: i */
    LinearLayout f107211i;

    /* renamed from: j */
    C38543br f107212j;

    /* renamed from: k */
    RemoteImageView f107213k;

    /* renamed from: l */
    View f107214l;

    /* renamed from: m */
    View f107215m;

    /* renamed from: n */
    C39361dx f107216n;

    /* renamed from: o */
    C40233e f107217o;

    /* renamed from: p */
    VideoPublishEditModel f107218p;

    /* renamed from: q */
    public boolean f107219q;

    /* renamed from: r */
    public boolean f107220r;

    /* renamed from: s */
    public boolean f107221s;

    /* renamed from: t */
    public VideoCoverBitmapHolder f107222t;

    /* renamed from: u */
    public Bitmap f107223u;

    /* renamed from: v */
    OnTouchListener f107224v = new C41266au(this);

    /* renamed from: w */
    private PermissionSettingItem f107225w;

    /* renamed from: x */
    private View f107226x;

    /* renamed from: y */
    private View f107227y;

    /* renamed from: z */
    private HashTagMentionEditText f107228z;

    /* renamed from: a */
    private static String m131446a(int i) {
        switch (i) {
            case 1:
                return "local";
            case 2:
                return "instagram";
            case 3:
                return "instagram_story";
            default:
                switch (i) {
                    case 100:
                        return "helo";
                    case BaseNotice.HASHTAG /*101*/:
                        return "twitter";
                    default:
                        return "";
                }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo101782n() {
        this.f107219q = true;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101765a(final ExtensionDataRepo extensionDataRepo, final Integer num) {
        if (num != null) {
            if (extensionDataRepo.getUpdateAnchor().getValue() != null) {
                extensionDataRepo.setIPermissionAction(new IPermissionAction() {
                    public final void cancel() {
                        VideoPublishFragment.this.f107205c.setValue(Integer.valueOf(VideoPublishFragment.this.f107206d.mo97880a()));
                    }

                    public final void confirm() {
                        if (num.intValue() != 1) {
                            extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(true));
                        } else {
                            extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(false));
                            extensionDataRepo.getUpdateAnchor().setValue(null);
                        }
                        VideoPublishFragment.this.f107206d.mo97881a(num.intValue());
                    }
                });
                if (extensionDataRepo.getShowPermissionAction() != null && !((Boolean) extensionDataRepo.getShowPermissionAction().invoke(num)).booleanValue()) {
                    if (num.intValue() != 1) {
                        extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(true));
                    } else {
                        extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(false));
                    }
                    this.f107206d.mo97881a(num.intValue());
                }
            } else {
                if (num.intValue() != 1) {
                    extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(true));
                } else {
                    extensionDataRepo.getI18nPrivacy().setValue(Boolean.valueOf(false));
                }
                this.f107206d.mo97881a(num.intValue());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101766a(Integer num) {
        this.f107216n.mo97942a(num.intValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101764a(CompoundButton compoundButton, boolean z) {
        if (C6399b.m19945u() && z) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().cancelSynthetise(getContext());
        }
        C35563c.f93252o.mo83227c().mo83239a(Boolean.valueOf(z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101763a(View view) {
        if (!((Boolean) C35563c.f93252o.mo83228d().mo83238a()).booleanValue()) {
            C35563c.f93252o.mo83228d().mo83239a(Boolean.valueOf(true));
            new C10741a(getContext()).mo25649a((int) R.string.b_x).mo25657b((int) R.string.a3b).mo25650a((int) R.string.bxu, (OnClickListener) null).mo25656a().mo25637a();
            return;
        }
        mo101767a(true);
    }

    /* renamed from: a */
    public final void mo101762a() {
        this.f107210h.mo99388c();
        this.f107210h.f103766b.mo105254d();
        this.f107218p.title = this.f107210h.mo99390d();
        List e = this.f107210h.mo99391e();
        if (e != null) {
            this.f107218p.structList = e;
        }
        this.f107218p.isPrivate = ((Integer) this.f107205c.getValue()).intValue();
        if (this.f107209g.mo100022a() != null) {
            this.f107218p.challenges = new ArrayList();
            this.f107218p.challenges.add(this.f107209g.f104548a);
        } else {
            this.f107218p.challenges = null;
        }
        C39360dw.m125725a().mo97933c();
        PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f107194F, PoiPublishModel.class);
        if (poiPublishModel != null) {
            this.f107218p.poiId = poiPublishModel.getPoiContext();
        }
        if (this.f107217o != null) {
            this.f107218p.commentSetting = this.f107217o.mo100023a(this.f107203a);
            this.f107218p.allowDownloadSetting = this.f107217o.mo100030c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e2 A[LOOP:0: B:23:0x00dc->B:25:0x00e2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101767a(boolean r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.account.d r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93260w
            boolean r0 = r0.mo57090c()
            if (r0 != 0) goto L_0x000c
            r8.mo101774c()
            return
        L_0x000c:
            r0 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r8.f107218p     // Catch:{ JSONException -> 0x0028 }
            java.lang.String r2 = r2.commerceData     // Catch:{ JSONException -> 0x0028 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0028 }
            if (r2 != 0) goto L_0x0028
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0028 }
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r8.f107218p     // Catch:{ JSONException -> 0x0028 }
            java.lang.String r3 = r3.commerceData     // Catch:{ JSONException -> 0x0028 }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x0028 }
            java.lang.String r3 = "star_atlas_order_id"
            long r2 = r2.getLong(r3)     // Catch:{ JSONException -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r2 = r0
        L_0x0029:
            java.lang.String r4 = "save_draft"
            com.ss.android.ugc.aweme.app.g.d r5 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r6 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r8.f107218p
            java.lang.String r7 = r7.creationId
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r7)
            java.lang.String r6 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r8.f107218p
            java.lang.String r7 = r7.mShootWay
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r6, r7)
            java.lang.String r6 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r8.f107218p
            int r7 = r7.draftId
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59970a(r6, r7)
            java.lang.String r6 = "task_id"
            com.ss.android.ugc.aweme.app.g.d r2 = r5.mo59971a(r6, r2)
            java.lang.String r3 = "enter_from"
            java.lang.String r5 = "video_post_page"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r5)
            java.lang.String r3 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r8.f107218p
            java.lang.String r5 = m131458b(r5)
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r5)
            java.lang.String r3 = "content_type"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r8.f107218p
            boolean r5 = r5.isMvThemeVideoType()
            if (r5 == 0) goto L_0x0074
            java.lang.String r5 = "mv"
            goto L_0x0076
        L_0x0074:
            java.lang.String r5 = "video"
        L_0x0076:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r5)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r2)
            java.lang.String r2 = "save_draft"
            r8.mo101772b(r2)
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r2 == 0) goto L_0x00d0
            java.lang.String r2 = "drafts"
            com.ss.android.ugc.aweme.app.g.d r3 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = com.p280ss.android.ugc.aweme.metrics.C33242an.m107314a()
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r8.f107218p
            java.lang.String r5 = r5.mShootWay
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "enter_method"
            java.lang.String r5 = "click_next_button"
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r8.f107218p
            java.lang.String r5 = m131458b(r5)
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.lang.String r4 = "content_type"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r8.f107218p
            boolean r5 = r5.isMvThemeVideoType()
            if (r5 == 0) goto L_0x00c5
            java.lang.String r5 = "mv"
            goto L_0x00c7
        L_0x00c5:
            java.lang.String r5 = "video"
        L_0x00c7:
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r2, r3)
        L_0x00d0:
            r8.m131441E()
            r8.mo101762a()
            java.util.List<android.support.v4.util.i<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r2 = r8.f107194F
            java.util.Iterator r2 = r2.iterator()
        L_0x00dc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f6
            java.lang.Object r3 = r2.next()
            android.support.v4.util.i r3 = (android.support.p022v4.util.C0902i) r3
            S r3 = r3.f3155b
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r3 = (com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension) r3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r8.f107218p
            com.ss.android.ugc.aweme.services.publish.PublishOutput r4 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39503ay.m126179a(r4)
            r3.onSaveDraft(r4)
            goto L_0x00dc
        L_0x00f6:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r8.f107218p
            com.ss.android.ugc.aweme.draft.model.c r2 = r8.m131445a(r2)
            com.ss.android.ugc.aweme.port.in.n r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93224F
            com.ss.android.ugc.aweme.port.in.u r3 = r3.mo70090e()
            long r3 = r3.mo90400a(r2)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r6 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r5 = r5.getService(r6)
            com.ss.android.ugc.aweme.services.IAVService r5 = (com.p280ss.android.ugc.aweme.services.IAVService) r5
            com.ss.android.ugc.aweme.services.draft.IDraftService r5 = r5.draftService()
            r5.notifyDraftUpdate(r2)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x014a
            r8.m131460b(r2, r9)
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "publish"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "save"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            com.ss.android.ugc.aweme.common.j r1 = new com.ss.android.ugc.aweme.common.j
            r1.<init>()
            java.lang.String r3 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r8.f107218p
            java.lang.String r4 = r4.mShootWay
            com.ss.android.ugc.aweme.common.j r1 = r1.mo16966a(r3, r4)
            org.json.JSONObject r1 = r1.mo16967a()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r0)
        L_0x014a:
            r0 = 1
            if (r9 == 0) goto L_0x015d
            android.app.Application r9 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93238a
            r1 = 2131826358(0x7f1116b6, float:1.9285598E38)
            java.lang.String r1 = r8.getString(r1)
            com.bytedance.ies.dmt.ui.c.a r9 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31389a(r9, r1, r0, r0)
            r9.mo25750a()
        L_0x015d:
            com.ss.android.ugc.aweme.port.in.n r9 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.ss.android.ugc.aweme.port.in.u r9 = r9.mo70090e()
            r1 = 0
            r9.mo90402a(r2, r1)
            boolean r9 = r8.f107195G
            if (r9 != 0) goto L_0x01e3
            boolean r9 = r8.f107196H
            if (r9 != 0) goto L_0x01e3
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r2 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT"
            r9.putExtra(r2, r0)
            com.ss.android.ugc.aweme.common.ShareContext r2 = r8.f107198J
            if (r2 == 0) goto L_0x018c
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r8.f107218p
            boolean r2 = r2.mIsFromDraft
            if (r2 != 0) goto L_0x018c
            java.lang.String r2 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG"
            com.ss.android.ugc.aweme.common.ShareContext r3 = r8.f107198J
            r9.putExtra(r2, r3)
        L_0x018c:
            com.ss.android.ugc.aweme.property.AVAB r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r3 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableOptimizePublishContainerActivityNotInStack
            boolean r2 = r2.mo93305a(r3)
            if (r2 == 0) goto L_0x01a3
            com.ss.android.ugc.aweme.port.in.o r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93240c
            boolean r2 = r2.mo83139f()
            if (r2 != 0) goto L_0x01a3
            java.lang.String r2 = "enable_optimize_main_not_in_stack"
            r9.putExtra(r2, r0)
        L_0x01a3:
            com.ss.android.ugc.aweme.port.in.n r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.ss.android.ugc.aweme.port.in.l r0 = r0.mo70110y()
            boolean r0 = r0.mo83122g()
            if (r0 == 0) goto L_0x01c3
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.f107218p
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L_0x01c3
            com.ss.android.ugc.aweme.shortvideo.d.d r9 = new com.ss.android.ugc.aweme.shortvideo.d.d
            r9.<init>()
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r9)
            r8.m131476v()
            goto L_0x01d8
        L_0x01c3:
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r9.addFlags(r0)
            android.support.v4.app.FragmentActivity r0 = r8.getActivity()
            com.ss.android.ugc.aweme.port.in.o r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93240c
            java.lang.Class r2 = r2.mo83137d()
            r9.setClass(r0, r2)
            r8.startActivity(r9)
        L_0x01d8:
            android.support.v4.app.FragmentActivity r9 = r8.getActivity()
            r0 = 2130771987(0x7f010013, float:1.714708E38)
            r9.overridePendingTransition(r1, r0)
            return
        L_0x01e3:
            boolean r9 = r8.f107196H
            if (r9 == 0) goto L_0x01ef
            com.ss.android.ugc.aweme.shortvideo.d.d r9 = new com.ss.android.ugc.aweme.shortvideo.d.d
            r9.<init>()
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r9)
        L_0x01ef:
            r8.m131476v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPublishFragment.mo101767a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo101760a(C1592h hVar) throws Exception {
        m131437A();
        m131439C();
        m131438B();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo101761a(C27311c cVar, boolean z) throws Exception {
        if (this.f107218p.mIsFromDraft) {
            if (cVar.mo70222ak() == null || cVar.mo70222ak().isEmpty()) {
                C41530am.m132280a("draftOpt==>try copy video data when the copySegment is empty for old draft created by fast import");
                C39526e.m126248a(this.f107218p.getPreviewInfo(), cVar, (C7561a<C7581n>) new C41274ba<C7581n>(cVar));
            } else {
                C41530am.m132280a("don't copy draft dir");
            }
            return null;
        }
        C41530am.m132280a("copy draft dir");
        Workspace a = C38417b.m122844a(this.f107218p);
        if (this.f107218p.isMultiVideoEdit()) {
            C39702d dVar = C39702d.f103208a;
            String str = C39810eq.f103469e;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f107218p.uniqueVideoSessionDir(C39810eq.f103470f));
            sb.append(File.separator);
            dVar.mo99074a(str, sb.toString(), cVar, (C7561a<C7581n>) new C41275bb<C7581n>(cVar, z, a));
        } else {
            a.mo96311a(C41276bc.f107528a);
        }
        if (this.f107218p.isFastImport) {
            C39526e.m126248a(this.f107218p.getPreviewInfo(), cVar, (C7561a<C7581n>) new C41277bd<C7581n>(cVar));
        } else if (C39526e.m126249b(this.f107218p)) {
            C29130b festivalPublishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).festivalPublishService();
            if (festivalPublishService != null) {
                festivalPublishService.mo74592a(this.f107218p.getPreviewInfo(), cVar, (C7561a<C7581n>) new C41278be<C7581n>(cVar));
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo101769a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        C0728b a = C0730d.m3126a(getResources(), createBitmap);
        a.mo2890a(C9738o.m28708b((Context) C35563c.f93238a, 4.0f));
        this.f107213k.setImageDrawable(a);
        if (TextUtils.isEmpty(this.f107218p.multiEditVideoRecordData.coverImagePath)) {
            this.f107218p.multiEditVideoRecordData.coverImagePath = C39702d.m127067b();
        }
        C39702d.m127061a(createBitmap, this.f107218p.multiEditVideoRecordData.coverImagePath);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo101768a(View view, MotionEvent motionEvent) {
        C39513bb.m126207a(getActivity());
        return false;
    }

    /* renamed from: a */
    private boolean m131455a(User user) {
        if (user == null) {
            return false;
        }
        return this.f107210h.mo99385a(user);
    }

    /* renamed from: a */
    public final void mo88231a(String str) {
        if (this.f107218p != null) {
            this.f107218p.commerceData = str;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m131454a(PermissionSettingItem permissionSettingItem, Activity activity, C23339g gVar, String str) {
        if (permissionSettingItem.getVisibility() == 0 && !activity.isFinishing()) {
            View findViewById = permissionSettingItem.findViewById(R.id.ck2);
            if (findViewById != null) {
                C10751a a = new C10752a(activity).mo25738b((int) R.string.b_u).mo25740c(activity.getResources().getColor(R.color.at5)).mo25731a(3000).mo25736a(true).mo25737a();
                a.mo25717a(findViewById, 48, ((float) (a.mo25724d() - findViewById.getMeasuredWidth())) - C9738o.m28708b((Context) activity, 28.0f), (findViewById.getMeasuredWidth() - a.mo25724d()) + ((int) C9738o.m28708b((Context) activity, 20.0f)));
                gVar.mo60634b(str, true);
            }
        }
    }

    /* renamed from: e */
    public final String mo88235e() {
        return this.f107210h.mo99390d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ C7581n mo101781m() {
        m131477w();
        return null;
    }

    /* renamed from: C */
    private void m131439C() {
        if (this.f107218p.containBackgroundVideo) {
            C40414d.m129223a(this.f107218p);
        }
    }

    /* renamed from: u */
    private void m131475u() {
        this.f107202N.mo102218a(this.f107218p.videoCategory);
    }

    /* renamed from: d */
    public final String mo88234d() {
        if (this.f107218p == null) {
            return null;
        }
        return this.f107218p.commerceData;
    }

    /* renamed from: g */
    public final void mo88237g() {
        if (this.f107218p != null) {
            this.f107218p.microAppModel = null;
        }
    }

    /* renamed from: l */
    public final boolean mo101780l() {
        if (this.f107218p == null || !this.f107218p.isPoiOrderRate()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private void m131469o() {
        if (this.f107218p.isReviewVideo() || this.f107218p.mIsFromDraft) {
            m131470p();
        }
    }

    /* renamed from: q */
    private void m131471q() {
        StringBuilder sb = new StringBuilder("VideoPublish finishPrepareEffectPlatform:");
        sb.append(this.f107189A);
        C41530am.m132285d(sb.toString());
        if (this.f107189A != null) {
            this.f107189A.dismiss();
            this.f107189A = null;
        }
    }

    /* renamed from: r */
    private static Boolean m131472r() {
        boolean z;
        AVMusic b = C39360dw.m125725a().mo97931b();
        if (b == null || !b.isPreventDownload()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: s */
    private void m131473s() {
        C22200c e = C35563c.f93260w.mo57092e();
        if (e != null && e.mo58561d()) {
            this.f107216n.f102257a.mo83253d().setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m131476v() {
        Intent intent = new Intent();
        intent.putExtra("publish result", "PublishActivity success");
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    /* renamed from: f */
    public final boolean mo88236f() {
        if (this.f107218p == null || (TextUtils.isEmpty(this.f107218p.microAppId) && this.f107218p.microAppModel == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final String mo101779k() {
        if (this.f107218p.getAvetParameter() != null) {
            return this.f107218p.getAvetParameter().getStoryShootEntrance();
        }
        return "";
    }

    /* renamed from: E */
    private void m131441E() {
        this.f107218p.setMainBusinessData(MainBusinessContext.updateSDKShareContextWhenSaveOrPost(this.f107218p.mIsFromDraft, this.f107218p.getMainBusinessData()));
        this.f107198J = (ShareContext) C35563c.f93239b.mo15974a(MainBusinessContext.getShareContext(this.f107218p.getMainBusinessContext()), ShareContext.class);
    }

    /* renamed from: F */
    private void m131442F() {
        if (C6399b.m19947w() && !this.f107218p.mIsFromDraft) {
            this.f107205c.setValue(Integer.valueOf(m131456b(C35563c.f93231M.mo93306b(Property.DefaultPublishPrivacyType))));
        }
    }

    /* renamed from: G */
    private HashMap<String, String> m131443G() {
        if (this.f107218p == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("creation_id", this.f107218p.creationId);
        hashMap.put("enter_from", "video_post_page");
        hashMap.put("content_type", "video");
        hashMap.put("shoot_way", this.f107218p.mShootWay);
        return hashMap;
    }

    /* renamed from: H */
    private String m131444H() {
        if (this.f107218p.isMvThemeVideoType()) {
            return "mv";
        }
        if (this.f107218p.isStatusVideoType()) {
            return "status";
        }
        if (this.f107218p.isStickPointMode) {
            return "sound_sync";
        }
        return "video";
    }

    /* renamed from: x */
    private void m131478x() {
        C6907h.m21524a("performance_publish", (Map) new C22984d().mo59973a("creation_id", this.f107218p.creationId).mo59973a("content_type", m131444H()).mo59970a("video_type", 0).mo59970a("video_upload_type", this.f107200L ? 1 : 0).f60753a);
    }

    /* renamed from: y */
    private void m131479y() {
        if (m131480z()) {
            Intent intent = new Intent();
            Bundle b = m131457b(true);
            if (C35563c.f93231M.mo93305a(Property.UploadOptimizeForPie)) {
                intent.putExtra("publish_bundle", b);
            } else {
                intent.putExtras(b);
            }
            intent.putExtra("synthetise_only", true);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().processPublish(getActivity(), intent);
        }
    }

    /* renamed from: h */
    public final void mo101776h() {
        if (C6399b.m19946v()) {
            IAVPrivacySettingService iAVPrivacySettingService = C35563c.f93223E;
            if (iAVPrivacySettingService.needShowPrivacyConfirmationDialog(getActivity())) {
                iAVPrivacySettingService.showPrivacyConfirmationDialog(getActivity(), new C41286bm(this));
                return;
            }
        }
        m131477w();
    }

    public void onResume() {
        FragmentInstrumentation.onResume(this);
        super.onResume();
        C41530am.m132280a("PublishDurationMonitor VideoPublishFragment onResume");
        for (C0902i iVar : this.f107194F) {
            ((IAVPublishExtension) iVar.f3155b).onResume();
        }
    }

    /* renamed from: A */
    private void m131437A() {
        if (this.f107218p.veAudioRecorderParam != null && this.f107218p.veAudioRecorderParam.hasRecord()) {
            if (!this.f107218p.veAudioRecorderParam.getAudioUrl().equals(this.f107218p.veAudioRecorderParam.getDraftAudioUrl())) {
                C7276d.m22820d(this.f107218p.veAudioRecorderParam.getAudioUrl(), this.f107218p.veAudioRecorderParam.getDraftAudioUrl());
            } else {
                return;
            }
        }
        if (this.f107218p.veAudioRecorderParam != null && !TextUtils.isEmpty(this.f107218p.veAudioRecorderParam.getExtraUrl())) {
            C7276d.m22816c(this.f107218p.veAudioRecorderParam.getExtraUrl());
        }
    }

    /* renamed from: B */
    private void m131438B() {
        String str = this.f107218p.infoStickerModel.infoStickerDraftDir;
        if (this.f107218p.hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.f107218p.infoStickerModel.stickers) {
                if (!stickerItemModel.isSubtitle() && !stickerItemModel.isSubtitleRule()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(File.separator);
                    sb.append(new File(stickerItemModel.path).getName());
                    String sb2 = sb.toString();
                    if (!stickerItemModel.isInfoSticker()) {
                        C7276d.m22820d(stickerItemModel.path, sb2);
                    } else if (!C7276d.m22812b(sb2)) {
                        String str2 = stickerItemModel.path;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append(File.separator);
                        C7276d.m22815c(str2, sb3.toString());
                    }
                }
            }
        }
    }

    /* renamed from: t */
    private void m131474t() {
        boolean a = C35563c.f93231M.mo93305a(Property.UseNewPublishShareDescription);
        if (C6399b.m19947w() && a) {
            this.f107216n.f102257a.mo83250a(getString(R.string.dt_));
        }
        boolean z = true;
        try {
            if (!C30199h.m98861a().getSilentShareConfigurable().booleanValue() || a) {
                z = false;
            }
        } catch (NullValueException unused) {
            z = true ^ a;
        }
        if (C6399b.m19944t() && z) {
            this.f107216n.f102257a.mo83250a(getString(R.string.ds1));
        }
        if (!C41554h.m132329a()) {
            this.f107216n.f102257a.mo83253d().setAlpha(0.34f);
        }
    }

    /* renamed from: z */
    private boolean m131480z() {
        if (!C35563c.f93231M.mo93305a(Property.EnableMVThemePreUpload) && this.f107218p.isMvThemeVideoType()) {
            return false;
        }
        if (C35563c.f93231M.mo93305a(Property.QuietlySynthetic) && !C35563c.f93231M.mo93305a(Property.EnableParallelSynthesizeUpload)) {
            return true;
        }
        if (!C35563c.f93231M.mo93305a(Property.EnableParallelSynthesizeUpload) || !C36964i.m118921a(getContext())) {
            return false;
        }
        if (C29958a.m98225a(getContext())) {
            return true;
        }
        if (!C29958a.m98226b(getContext()) || !C35563c.f93257t.mo83280a()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo101774c() {
        Bundle bundle;
        if (getActivity().getIntent().getBooleanExtra("is_from_sys_share", false)) {
            C6907h.m21524a("login_notify", (Map) C22984d.m75611a().mo59973a("enter_from", "video_edit_page").f60753a);
        }
        String string = getString(R.string.d3i);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().cancelSynthetise(getContext());
        C21164d dVar = C35563c.f93260w;
        String str = "video_edit_page";
        String str2 = "click_shoot";
        if (C30538p.m99745a()) {
            bundle = null;
        } else {
            bundle = C42914ab.m136242a().mo104633a("login_title", string).f111445a;
        }
        dVar.mo57086a((Fragment) this, str, str2, bundle, (C21165a) new C21165a() {
            /* renamed from: b */
            public final void mo57094b() {
            }

            /* renamed from: a */
            public final void mo57093a() {
                if (VideoPublishFragment.this.f107217o != null) {
                    VideoPublishFragment.this.f107217o.mo100031d();
                }
            }
        });
    }

    /* renamed from: j */
    public final void mo101778j() {
        String str;
        String str2 = "click_preview_entrance";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f107218p.creationId).mo59973a("enter_from", "video_post_page").mo59973a("shoot_way", this.f107218p.mShootWay).mo59973a("shoot_entrance", mo101779k()).mo59973a("content_source", m131458b(this.f107218p));
        String str3 = "content_type";
        if (this.f107218p.isMvThemeVideoType()) {
            str = "mv";
        } else {
            str = "video";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("route", "1").f60753a);
    }

    public void onDestroyView() {
        boolean z;
        m131450a(getView(), (OnTouchListener) null);
        if (!this.f107197I) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().cancelSynthetise(getContext());
        }
        super.onDestroyView();
        if (this.f107216n != null) {
            this.f107216n.mo97947c();
        } else {
            StringBuilder sb = new StringBuilder("syncModule is null and the fragment's view is null?:->");
            if (getView() == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C42880h.m136156a(sb.toString());
        }
        for (C0902i iVar : this.f107194F) {
            ((IAVPublishExtension) iVar.f3155b).onDestroy();
        }
        C41514ab.m132244a().mo102175c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo101777i() {
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.f107197I = true;
            if (!this.f107195G) {
                getActivity().finish();
            }
            C35563c.f93240c.mo83129a(getActivity(), this.f107218p.mStickerID);
            for (C0902i iVar : this.f107194F) {
                ((IAVPublishExtension) iVar.f3155b).onPublish(C39503ay.m126179a(this.f107218p));
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().startPublish(getActivity(), m131457b(false));
            if (this.f107218p.isSaveLocal()) {
                C6907h.m21524a("download", (Map) new C22984d().mo59970a("scene_id", (int) LiveRoomStruct.ROOM_LONGTIME_NO_NET).mo59973a("group_id", "").mo59973a("enter_from", "video_post_page").mo59973a("download_type", "self").mo59973a("download_method", "download_with_publish").f60753a);
            }
            mo101772b("publish");
            C6907h.onEvent(MobClick.obtain().setEventName("publish").setLabelName("submit"));
        }
    }

    /* renamed from: D */
    private void m131440D() {
        boolean z;
        int i;
        if (this.f107218p.isMvThemeVideoType()) {
            String str = this.f107218p.mvCreateVideoData.videoCoverImgPath;
            if (C7276d.m22812b(str)) {
                C23323e.m76514a(this.f107213k, Uri.fromFile(new File(str)).toString());
            }
        } else if (this.f107218p.isStatusVideoType()) {
            String videoCoverImgPath = this.f107218p.statusCreateVideoData.getVideoCoverImgPath();
            if (C7276d.m22812b(videoCoverImgPath)) {
                C23323e.m76514a(this.f107213k, Uri.fromFile(new File(videoCoverImgPath)).toString());
            }
        } else if (this.f107218p.isMultiVideoEdit()) {
            VERecordData convertData = this.f107218p.getCurMultiEditVideoRecordData().convertData();
            Pair playInOutTime = this.f107218p.getCurMultiEditVideoRecordData().getPlayInOutTime();
            convertData.mo108048a((long) (((Integer) playInOutTime.first).intValue() * 1000), (long) (((Integer) playInOutTime.second).intValue() * 1000));
            int i2 = (int) (this.f107218p.mVideoCoverStartTm * 1000.0f);
            if (this.f107218p.isUseTimeReverseEffect()) {
                i = (((Integer) playInOutTime.second).intValue() - ((Integer) playInOutTime.first).intValue()) - i2;
            } else {
                i = i2;
            }
            VEUtils.getVideoThumb(convertData, i, 720, 1280, false, new C41270ay(this));
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.f107218p.mEffectList != null) {
                arrayList.addAll(this.f107218p.mEffectList);
            }
            if (this.f107218p.mTimeEffect != null) {
                arrayList.add(this.f107218p.mTimeEffect);
                if (this.f107218p.mTimeEffect.getKey().equals("1")) {
                    z = true;
                    C40213a.m128526a(arrayList, C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f107218p.getFilterIndex()).mo74978b(), this.f107218p.mSelectedFilterIntensity, (int) (this.f107218p.mVideoCoverStartTm * 1000.0f), z, this.f107218p.getPreviewInfo(), this.f107218p.getVideoCoverPath(), new OnVideoCoverCallback() {
                        public final void onGetVideoCoverFailed(int i) {
                            C9738o.m28693a((Context) C35563c.f93238a, (int) R.string.csd);
                        }

                        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                            if (VideoPublishFragment.this.f107213k != null && VideoPublishFragment.this.getContext() != null) {
                                C0728b a = C0730d.m3126a(VideoPublishFragment.this.getResources(), bitmap);
                                a.mo2890a(C9738o.m28708b((Context) C35563c.f93238a, 4.0f));
                                VideoPublishFragment.this.f107213k.setImageDrawable(a);
                                VideoPublishFragment.this.f107223u = bitmap;
                            }
                        }
                    });
                }
            }
            z = false;
            C40213a.m128526a(arrayList, C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f107218p.getFilterIndex()).mo74978b(), this.f107218p.mSelectedFilterIntensity, (int) (this.f107218p.mVideoCoverStartTm * 1000.0f), z, this.f107218p.getPreviewInfo(), this.f107218p.getVideoCoverPath(), new OnVideoCoverCallback() {
                public final void onGetVideoCoverFailed(int i) {
                    C9738o.m28693a((Context) C35563c.f93238a, (int) R.string.csd);
                }

                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    if (VideoPublishFragment.this.f107213k != null && VideoPublishFragment.this.getContext() != null) {
                        C0728b a = C0730d.m3126a(VideoPublishFragment.this.getResources(), bitmap);
                        a.mo2890a(C9738o.m28708b((Context) C35563c.f93238a, 4.0f));
                        VideoPublishFragment.this.f107213k.setImageDrawable(a);
                        VideoPublishFragment.this.f107223u = bitmap;
                    }
                }
            });
        }
    }

    /* renamed from: p */
    private void m131470p() {
        final C1606i iVar = new C1606i();
        this.f107189A = C41653c.m132582a(getActivity(), getString(R.string.dga));
        StringBuilder sb = new StringBuilder("VideoPublish prepareEffectPlatformImpl:");
        sb.append(this.f107189A);
        C41530am.m132285d(sb.toString());
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        if (this.f107218p.mEffectList == null || this.f107218p.mEffectList.isEmpty()) {
            C41530am.m132285d("ignore fetch specialfilter because of empty effects");
            iVar.mo6900a(null);
        } else {
            HashSet hashSet = new HashSet();
            Iterator it = this.f107218p.mEffectList.iterator();
            while (it.hasNext()) {
                EffectPointModel effectPointModel = (EffectPointModel) it.next();
                if (!C7276d.m22812b(effectPointModel.getResDir())) {
                    hashSet.add(effectPointModel.getKey());
                }
            }
            if (!hashSet.isEmpty()) {
                EffectPlatform effectPlatform = new EffectPlatform(getActivity(), C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
                effectPlatform.mo70619a((C0043i) this);
                effectPlatform.mo70639a((List<String>) new ArrayList<String>(hashSet), null, true, (C43759i) new C43759i() {
                    /* renamed from: a */
                    public final void mo95926a(List<Effect> list) {
                        C41530am.m132285d("uniformFetchList onSuccess");
                        iVar.mo6900a(null);
                    }

                    /* renamed from: a */
                    public final void mo95925a(C43726c cVar) {
                        StringBuilder sb = new StringBuilder("uniformFetchList fail : ");
                        sb.append(cVar.toString());
                        C41530am.m132283b(sb.toString());
                        iVar.mo6900a(null);
                    }
                });
            } else {
                C41530am.m132285d("All effects needn't download");
                iVar.mo6900a(null);
            }
        }
        C1592h a = C1592h.m7851a(null);
        final C1606i iVar2 = new C1606i();
        if (C35563c.f93231M.mo93306b(Property.ShowAutoImproveButtonInEditPage) != 1 || !this.f107218p.isReviewVideo() || this.f107218p.mIsFromDraft) {
            iVar2.mo6900a(null);
        } else {
            new C27484h().mo70691a().mo70688a(new IFetchResourcesListener() {
                public final void onFailed(Exception exc) {
                    StringBuilder sb = new StringBuilder("fetchRequirement fail : ");
                    sb.append(exc.toString());
                    C41530am.m132283b(sb.toString());
                    iVar2.mo6900a(null);
                }

                public final void onSuccess(String[] strArr) {
                    C41530am.m132285d("fetchRequirement onSuccess");
                    C27498p.m90140a(Arrays.asList(strArr));
                    iVar2.mo6900a(null);
                }
            });
            if (C35563c.f93231M.mo93305a(Property.PreFetchPopEffectModel)) {
                C27495o.m90135a();
            }
        }
        C1592h.m7862c((Collection<? extends C1592h<?>>) C17795bu.m59146a((E[]) new C1592h[]{a, iVar.f6010a, iVar2.f6010a})).mo6876a((C1591g<TResult, TContinuationResult>) new C41267av<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: b */
    public final void mo101771b() {
        for (C0902i iVar : this.f107194F) {
            ((IAVPublishExtension) iVar.f3155b).onBackPressed(C39503ay.m126179a(this.f107218p));
        }
    }

    /* renamed from: w */
    private void m131477w() {
        String str;
        String str2;
        if (!C41593b.m132438a(this.f107218p) || this.f107218p.videoCategory != null) {
            this.f107191C = SystemClock.uptimeMillis();
            if (C35563c.f93260w.mo57088a()) {
                C6893q.m21447a("aweme_child_mode_publish", null);
            }
            m131441E();
            PoiPublishModel poiPublishModel = (PoiPublishModel) AVPublishExtensionUtils.findModel(this.f107194F, PoiPublishModel.class);
            if (TextUtils.isEmpty(this.f107218p.musicId)) {
                str = "";
            } else {
                str = this.f107218p.musicId;
            }
            if (TextUtils.isEmpty(str)) {
                AVMusic b = C39360dw.m125725a().mo97931b();
                if (b == null) {
                    str = "";
                } else {
                    str = b.getMusicId();
                }
            }
            if (this.f107218p != null && !TextUtils.isEmpty(str) && "edit_page_recommend".equals(this.f107218p.mMusicOrigin) && 1 == this.f107218p.comFrom) {
                C6907h.m21524a("jarvis_item_click", (Map) C22984d.m75611a().mo59973a("item_id", str).mo59973a("channel_id", C41516ac.m132252a()).mo59973a("req_id", this.f107218p.aiMusicLogPbImprId).f60753a);
            }
            m131451a(poiPublishModel);
            m131478x();
            C6893q.m21447a("aweme_publish_stay_time", C6869c.m21381a().mo16886a("stay_time", Long.valueOf(System.currentTimeMillis() - this.f107190B)).mo16888b());
            this.f107210h.mo99388c();
            this.f107218p.title = this.f107210h.mo99390d();
            List e = this.f107210h.mo99391e();
            if (e == null) {
                this.f107218p.structList = new ArrayList();
            } else {
                this.f107218p.structList = e;
            }
            GoodsPublishModel goodsPublishModel = (GoodsPublishModel) AVPublishExtensionUtils.findModel(this.f107194F, GoodsPublishModel.class);
            if (goodsPublishModel != null && !TextUtils.isEmpty(goodsPublishModel.getGoodsDraftId())) {
                this.f107218p.shopDraftId = goodsPublishModel.getGoodsDraftId();
            }
            if (poiPublishModel != null) {
                this.f107218p.poiId = poiPublishModel.getPoiContext();
                this.f107218p.latitude = poiPublishModel.getLatitude();
                this.f107218p.longitude = poiPublishModel.getLongitude();
            }
            this.f107218p.isPrivate = ((Integer) this.f107205c.getValue()).intValue();
            if (TextUtils.isEmpty(this.f107218p.mOutputFile)) {
                Workspace a = C38417b.m122844a(this.f107218p);
                this.f107218p.mOutputFile = a.mo96322j().getPath();
            }
            C22200c e2 = C35563c.f93260w.mo57092e();
            VideoPublishEditModel videoPublishEditModel = this.f107218p;
            if (e2 != null) {
                str2 = e2.mo58565h();
            } else {
                str2 = "";
            }
            videoPublishEditModel.city = str2;
            this.f107218p.commentSetting = this.f107217o.mo100023a(this.f107203a);
            this.f107218p.reactDuetSetting = this.f107217o.mo100029b(this.f107204b);
            this.f107217o.mo100027a((BaseShortVideoContext) this.f107218p);
            this.f107218p.challenges = null;
            this.f107218p.mSaveModel = C39799ej.m127418a(this.f107218p.mSaveModel, this.f107216n.mo97946b());
            if (this.f107218p.mSaveModel != null) {
                this.f107218p.mSaveModel.setSaveToAlbum(this.f107217o.mo100028a());
                this.f107218p.mSaveModel.setSaveToAppPathInsteadOfAlbum(this.f107217o.f104554e);
                this.f107218p.mSaveModel.setEnableSilentEnhancement(C40233e.m128568f());
            }
            C27311c a2 = m131445a(this.f107218p);
            C35563c.f93224F.mo70090e().mo90400a(a2);
            m131460b(a2, false);
            C39360dw.m125725a().f102251f = a2.mo70221aj();
            C35574k.m114859a().mo70090e().mo90402a(a2, true);
            C35563c.f93224F.mo70089d().mo90346a().mo90350b(a2);
            int a3 = C41539as.m132299a();
            if (this.f107218p != null && this.f107218p.reactionParams == null) {
                C41539as.m132300a(a3 + 1);
            } else if (a3 < 3) {
                C41539as.m132300a(0);
            }
            if (VERSION.SDK_INT < 18 || C35563c.f93247j.mo83116a() || C6399b.m19946v() || C35563c.f93247j.mo83117b()) {
                mo101777i();
                return;
            }
            ((ViewGroup) getActivity().getWindow().getDecorView()).getOverlay().add(this.f107213k);
            float b2 = C9738o.m28708b((Context) getActivity(), 96.0f) / ((float) this.f107213k.getMeasuredHeight());
            this.f107213k.animate().translationY((-this.f107213k.getY()) + ((float) C23482j.m77101d())).translationX(-C9738o.m28708b((Context) getActivity(), 5.0f)).scaleX(C9738o.m28708b((Context) getActivity(), 76.0f) / ((float) this.f107213k.getMeasuredWidth())).scaleY(b2).alpha(0.0f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    VideoPublishFragment.this.mo101777i();
                }

                public final void onAnimationStart(Animator animator) {
                    VideoPublishFragment.this.getActivity().findViewById(16908290).setVisibility(4);
                }
            }).start();
            return;
        }
        C10761a.m31383a(getContext(), (int) R.string.a47).mo25750a();
    }

    /* renamed from: a */
    public final void mo88367a(Object obj) {
        this.f107219q = true;
    }

    /* renamed from: a */
    static final /* synthetic */ void m131452a(Workspace workspace) {
        workspace.mo96321i();
        C38505a.m123073a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo101770b(C1592h hVar) throws Exception {
        m131471q();
        return null;
    }

    /* renamed from: b */
    private static String m131458b(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return null;
        }
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            return "upload";
        }
        return "shoot";
    }

    /* renamed from: c */
    private String m131461c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(this.f107218p.commerceData).getString("task_id");
            }
        } catch (JSONException unused) {
        }
        return "";
    }

    /* renamed from: d */
    private void m131466d(View view) {
        if (C41593b.m132438a(this.f107218p)) {
            this.f107202N = new C41593b(requireActivity(), this.f107218p.videoCategory, this.f107218p.getAvetParameter(), view);
        }
    }

    /* renamed from: e */
    private void m131467e(View view) {
        view.findViewById(R.id.vs).setOnClickListener(new C42993bx(600) {
            /* renamed from: a */
            private void m131512a() {
                C6907h.m21524a("click_cover_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", VideoPublishFragment.this.f107218p.creationId).mo59973a("enter_from", "video_post_page").mo59973a("shoot_way", VideoPublishFragment.this.f107218p.mShootWay).mo59973a("shoot_entrance", VideoPublishFragment.this.mo101779k()).mo59973a("content_type", VideoPublishFragment.this.f107218p.getAvetParameter().getContentType()).mo59973a("content_source", VideoPublishFragment.this.f107218p.getAvetParameter().getContentSource()).f60753a);
                VideoPublishFragment.this.f107221s = true;
            }

            /* renamed from: a */
            public final void mo101783a(View view) {
                m131512a();
                if (C35563c.f93230L.mo93342a(AVSettings.Property.IsLowMemoryMachine)) {
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().cancelSynthetise(VideoPublishFragment.this.getContext());
                }
                ChooseCoverActivity.m132418a(VideoPublishFragment.this.getActivity(), VideoPublishFragment.this.f107218p, 4);
            }
        });
    }

    /* renamed from: a */
    private C27311c m131445a(VideoPublishEditModel videoPublishEditModel) {
        C35545a b = C35563c.f93252o.mo83224b();
        boolean z = true;
        if (this.f107218p.isPrivate() != 1) {
            z = false;
        }
        b.mo83239a(Boolean.valueOf(z));
        videoPublishEditModel.mSyncPlatforms = this.f107216n.mo97941a();
        C39361dx.m125745a(videoPublishEditModel.mSyncPlatforms, 0);
        C27311c a = new C39502ax("VideoPublishFragment").mo98353a(videoPublishEditModel);
        a.f72018F = System.currentTimeMillis();
        return a;
    }

    /* renamed from: b */
    private int m131456b(int i) {
        int intValue = ((Integer) this.f107205c.getValue()).intValue();
        switch (i) {
            case 0:
                break;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                IPublishPermissionCache iPublishPermissionCache = (IPublishPermissionCache) C25682d.m84426a(C35563c.f93238a, IPublishPermissionCache.class);
                if (iPublishPermissionCache != null) {
                    return iPublishPermissionCache.getPublishPermission(0);
                }
                break;
            default:
                return intValue;
        }
        return 0;
    }

    /* renamed from: c */
    private static void m131463c(int i) {
        if (C35563c.f93231M.mo93306b(Property.DefaultPublishPrivacyType) == 3) {
            IPublishPermissionCache iPublishPermissionCache = (IPublishPermissionCache) C25682d.m84426a(C35563c.f93238a, IPublishPermissionCache.class);
            if (iPublishPermissionCache != null) {
                iPublishPermissionCache.setPublishPermission(i);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f107200L = C35563c.f93231M.mo93305a(Property.EnableParallelSynthesizeUpload);
        this.f107190B = System.currentTimeMillis();
        this.f107197I = false;
        m131479y();
        if (bundle == null) {
            C39318cx.m125643a(this.f107218p.videoWidth(), this.f107218p.videoHeight(), C36964i.m118929e(), 0.0f, C35563c.f93230L.mo93342a(AVSettings.Property.SyntheticHardCode)).mo97879a();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f107206d.mo97883a(bundle);
        for (C0902i iVar : this.f107194F) {
            ((IAVPublishExtension) iVar.f3155b).onSaveInstanceState(bundle);
        }
        bundle.putSerializable("challenge", this.f107209g.f104548a);
        bundle.putBoolean("contentModified", this.f107219q);
    }

    /* renamed from: d */
    private String m131464d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String[] split = str.split(";");
            StringBuilder sb = new StringBuilder();
            for (String parseInt : split) {
                String a = m131446a(Integer.parseInt(parseInt));
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    sb.append(",");
                }
            }
            String sb2 = sb.toString();
            if (sb2.endsWith(",")) {
                sb2 = sb2.substring(0, sb2.length() - 1);
            }
            return sb2;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    private Bundle m131457b(boolean z) {
        this.f107218p.mSaveModel = C39799ej.m127419a(this.f107218p.mSaveModel, this.f107216n.mo97946b(), z, this.f107217o);
        C42311e.m134571a(C40005j.m127910a((BaseShortVideoContext) this.f107218p), C40005j.m127911b((BaseShortVideoContext) this.f107218p), Scene.PUBLISH, Scene.SEND_REQUEST);
        this.f107218p.userClickPublishTime = this.f107191C;
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", this.f107218p);
        bundle.putString("shoot_way", this.f107218p.mShootWay);
        bundle.putBoolean("enter_record_from_other_platform", this.f107195G);
        bundle.putInt("publish_private_state", this.f107218p.isPrivate());
        bundle.putBoolean("parallel_synthesize_upload", this.f107200L);
        if (this.f107201M) {
            bundle.putBoolean("review_video_fast_publish", true);
        }
        StringBuilder sb = new StringBuilder("isFastPublish=");
        sb.append(this.f107201M);
        C41530am.m132280a(sb.toString());
        StringBuilder sb2 = new StringBuilder("VideoPublishService.createBundleParams()  bundle=");
        sb2.append(bundle);
        C42880h.m136156a(sb2.toString());
        StringBuilder sb3 = new StringBuilder("VideoPublishService.createBundleParams()  bundle=");
        sb3.append(bundle);
        C6907h.m21524a("av_video_memory", (Map) C22984d.m75611a().mo59973a("log", sb3.toString()).f60753a);
        Publish.PublishBundle = bundle;
        return bundle;
    }

    /* renamed from: d */
    private void m131465d(int i) {
        String str;
        String str2 = "public";
        switch (i) {
            case 0:
                str2 = "public";
                break;
            case 1:
                str2 = "private";
                break;
            case 2:
                str2 = "friends";
                break;
        }
        String str3 = "select_privacy_setting";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f107218p.creationId).mo59973a("shoot_way", this.f107218p.mShootWay).mo59973a("content_source", m131458b(this.f107218p));
        String str4 = "content_type";
        if (this.f107218p.isMvThemeVideoType()) {
            str = "mv";
        } else {
            str = "video";
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str).mo59973a("enter_from", "video_post_page").mo59973a("to_status", str2).f60753a);
    }

    /* renamed from: f */
    private void m131468f(View view) {
        if (C35563c.f93260w.mo57088a()) {
            for (C0902i iVar : this.f107194F) {
                ((IAVPublishExtension) iVar.f3155b).onEnterChildrenMode();
            }
            this.f107203a.setVisibility(8);
            this.f107204b.setVisibility(8);
            this.f107225w.setVisibility(8);
            this.f107226x.setVisibility(8);
            this.f107227y.setVisibility(8);
            this.f107208f.setVisibility(8);
            View findViewById = view.findViewById(R.id.vm);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C41285bl(this));
            if (!(this.f107216n == null || this.f107216n.f102257a == null)) {
                this.f107216n.f102257a.mo83253d().setVisibility(8);
                this.f107217o.mo100032e();
            }
            this.f107228z.setHint(R.string.a3d);
            this.f107228z.setMentionTextColor(C0683b.m2912c(getContext(), R.color.a4z));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo101775c(View view) {
        String str;
        String str2 = "click_privacy_setting";
        C22984d a = C22984d.m75611a().mo59973a("creation_id", this.f107218p.creationId).mo59973a("enter_from", "video_post_page");
        String str3 = "content_type";
        if (this.f107218p.isMvThemeVideoType()) {
            str = "mv";
        } else {
            str = "video";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("content_source", this.f107218p.getAvetParameter().getContentSource()).mo59973a("shoot_way", this.f107218p.mShootWay).f60753a);
    }

    /* renamed from: b */
    public final void mo101772b(String str) {
        C6907h.m21524a("leave_post_page", (Map) new C22984d().mo59973a("enter_from", "video_post_page").mo59973a("shoot_way", this.f107218p.mShootWay).mo59973a("creation_id", this.f107218p.creationId).mo59973a("leave_action", str).mo59970a("is_enter_cover", this.f107221s ? 1 : 0).mo59970a("is_enter_preview", this.f107220r ? 1 : 0).mo59970a("is_content_modified", this.f107219q ? 1 : 0).mo59971a("duration", System.currentTimeMillis() - this.f107190B).f60753a);
    }

    /* renamed from: a */
    private void m131451a(PoiPublishModel poiPublishModel) {
        String str;
        String str2;
        String str3;
        AVPublishExtensionUtils.findModel(this.f107194F, SeedPublishModel.class);
        C22984d a = C22984d.m75611a().mo59973a("filter_list", this.f107218p.mCurFilterLabels).mo59973a("filter_id_list", this.f107218p.mCurFilterIds).mo59973a("creation_id", this.f107218p.creationId).mo59973a("shoot_way", this.f107218p.mShootWay).mo59970a("draft_id", this.f107218p.draftId);
        String str4 = "music_selected_from";
        if (this.f107218p.mMusicOrigin == null) {
            str = "original";
        } else {
            str = this.f107218p.mMusicOrigin;
        }
        C22984d a2 = a.mo59973a(str4, str).mo59973a("content_source", m131458b(this.f107218p)).mo59973a("content_type", m131444H()).mo59973a("prop_list", this.f107218p.mStickerID).mo59973a("prop_selected_from", this.f107218p.getPropSource()).mo59973a("effect_list", this.f107218p.getEditEffectList()).mo59973a("info_sticker_list", this.f107218p.getInfoStickerList()).mo59973a("enter_from", "video_post_page").mo59973a("camera_type", C41558k.m132344b()).mo59970a("camera_level", C35563c.f93230L.mo93343b(AVSettings.Property.RecordCameraCompatLevel));
        String str5 = "is_wide_angle";
        if (C20726i.m68884a(getContext())) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C22984d a3 = a2.mo59973a(str5, str2);
        String str6 = "is_anti_shake";
        if (C20705b.m68749a(getContext(), C35563c.f93230L.mo93343b(AVSettings.Property.ShakeFreeWhiteList))) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        C22984d a4 = a3.mo59973a(str6, str3).mo59973a("share_to", m131464d(this.f107216n.mo97941a())).mo59970a("fast_import_fail", this.f107218p.fastImportErrorCode).mo59973a("from_group_id", C38458ar.m122943a()).mo59970a("file_fps", this.f107218p.getPreviewInfo().videoFps());
        if (this.f107199K >= 0) {
            a4.mo59970a("music_rec_type", this.f107199K);
        }
        if (this.f107218p.videoCategory != null) {
            a4.mo59970a("type", this.f107218p.videoCategory.getCategoryIndex()).mo59973a("type_name", this.f107218p.videoCategory.getCategoryName());
        }
        if (this.f107218p.mMusicShowRank > 0) {
            a4.mo59970a("music_show_rank", this.f107218p.mMusicShowRank);
        }
        if (!TextUtils.isEmpty(this.f107218p.mBindMvId)) {
            a4.mo59973a("mv_id", this.f107218p.mBindMvId);
        }
        if (!TextUtils.isEmpty(this.f107218p.nationalTaskId)) {
            a4.mo59973a("task_id", this.f107218p.nationalTaskId);
        } else if (!TextUtils.isEmpty(m131461c(this.f107218p.commerceData))) {
            a4.mo59973a("task_id", m131461c(this.f107218p.commerceData));
        }
        if (!TextUtils.isEmpty(this.f107218p.tagId)) {
            a4.mo59973a("tag_id", this.f107218p.tagId);
        }
        try {
            InputFilter[] filters = this.f107228z.getFilters();
            if (filters != null && filters.length > 0) {
                C32066b bVar = (C32066b) filters[0];
                a4.mo59970a("hit_caption_limit", bVar.f83868a ? 1 : 0);
                bVar.mo83032a();
                if (this.f107228z.getText() != null) {
                    this.f107218p.mentionEditTextLength = this.f107228z.getText().length();
                }
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(this.f107218p.pic2VideoSource)) {
            StringBuilder sb = new StringBuilder();
            String[] split = this.f107218p.pic2VideoSource.split(",");
            if (!C23477d.m77082a((T[]) split)) {
                for (String str7 : split) {
                    if (!str7.isEmpty()) {
                        if (sb.length() != 0) {
                            sb.append(",");
                        }
                        sb.append(str7);
                    }
                }
                if (!TextUtils.isEmpty(sb)) {
                    a4.mo59973a("picture_source", sb.toString());
                }
            }
        }
        if (!TextUtils.isEmpty(C41253ah.m131873b())) {
            a4.mo59973a("tutorial_item_id", C41253ah.m131873b());
        }
        Map<String, String> map = a4.f60753a;
        if (poiPublishModel != null) {
            map.putAll(poiPublishModel.getMobParams());
            this.f107218p.poiServerMobParam = poiPublishModel.getServerMobParams();
        }
        C6907h.m21524a("publish", (Map) map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo101773b(View view) {
        C10761a.m31384a(getContext(), (int) R.string.diu, 0).mo25750a();
        return false;
    }

    /* renamed from: b */
    private void m131460b(C27311c cVar, boolean z) {
        C1592h.m7859b((Callable<TResult>) new C41269ax<TResult>(this, cVar, z)).mo6876a((C1591g<TResult, TContinuationResult>) new C41268aw<TResult,TContinuationResult>(this), (Executor) C1592h.f5957a);
    }

    /* renamed from: a */
    private void m131450a(View view, OnTouchListener onTouchListener) {
        if (view.getId() != R.id.h_) {
            if (!(view instanceof EditText)) {
                view.setOnTouchListener(onTouchListener);
            }
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    m131450a(viewGroup.getChildAt(i), onTouchListener);
                    i++;
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
            getActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        m131450a(view, this.f107224v);
        Bundle arguments = getArguments();
        this.f107199K = arguments.getInt("music_rec_type", -1);
        this.f107218p = (VideoPublishEditModel) arguments.getSerializable("args");
        if (this.f107218p == null || this.f107218p.isPreviewInfoValid()) {
            this.f107195G = arguments.getBoolean("enter_record_from_other_platform", false);
            this.f107196H = arguments.getBoolean("edit_publish_session_end_together", false);
            StringBuilder sb = new StringBuilder("VideoPublishFragment filter_id_list:");
            sb.append(this.f107218p.mCurFilterIds);
            sb.append(" prop_list:");
            sb.append(this.f107218p.mStickerID);
            sb.append(" effect_list:");
            sb.append(this.f107218p.getEditEffectList());
            sb.append(" info_sticker_list:");
            sb.append(this.f107218p.getInfoStickerList());
            C41530am.m132285d(sb.toString());
            this.f107201M = arguments.getBoolean("review_video_fast_publish", false);
            m131449a(view, bundle);
            m131469o();
            C39513bb.m126207a(getActivity());
            this.f107212j.mo96526a(this, true, C38543br.f100166a, C40229a.m128551a(this.f107218p));
            return;
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
        C41530am.m132283b("VideoPublishPage finish because of null EditPreviewInfo");
    }

    /* renamed from: a */
    public static void m131453a(PermissionSettingItem permissionSettingItem, Activity activity) {
        boolean z;
        String str;
        if (permissionSettingItem != null && permissionSettingItem.getVisibility() == 0 && activity != null) {
            if (!C6399b.m19947w() || !C35563c.f93231M.mo93305a(Property.CanShowPublishFriendGuide)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C23339g a = C23337e.m76561a(C35563c.f93238a, C35563c.f93252o.mo83222a());
                C22200c e = C35563c.f93260w.mo57092e();
                if (e == null || TextUtils.isEmpty(e.mo58560c())) {
                    str = "friends_only_uid_none";
                } else {
                    StringBuilder sb = new StringBuilder("friends_only_uid_");
                    sb.append(e.mo58560c());
                    str = sb.toString();
                }
                if (!a.mo60627a(str, false)) {
                    permissionSettingItem.postDelayed(new C41271az(permissionSettingItem, activity, a, str), 500);
                }
            }
        }
    }

    /* renamed from: a */
    private void m131449a(View view, Bundle bundle) {
        boolean z;
        View view2 = view;
        Bundle bundle2 = bundle;
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) C0069x.m157a((Fragment) this).mo147a(ExtensionDataRepo.class);
        this.f107218p.videoPath();
        if (this.f107218p.mTimeEffect != null && this.f107218p.mTimeEffect.getKey().equals("1") && !TextUtils.isEmpty(this.f107218p.reverseVideoPath())) {
            this.f107218p.reverseVideoPath();
        }
        this.f107225w = (PermissionSettingItem) view2.findViewById(R.id.cag);
        this.f107225w.mo101645a(new C41279bf(this));
        this.f107206d = C39320cz.m125645a(this, this.f107225w, 0);
        this.f107206d.mo97884a((C39319cy) new C39319cy() {
        });
        m131453a(this.f107225w, (Activity) getActivity());
        this.f107205c.observe(this, new C41280bg(this, extensionDataRepo));
        m131466d(view);
        this.f107207e = (RelativeLayout) view2.findViewById(R.id.ns);
        this.f107208f = view2.findViewById(R.id.abb);
        this.f107211i = (LinearLayout) view2.findViewById(R.id.bjq);
        this.f107203a = (CommonItemView) view2.findViewById(R.id.zp);
        this.f107226x = view2.findViewById(R.id.h_);
        this.f107227y = view2.findViewById(R.id.h9);
        this.f107228z = (HashTagMentionEditText) view2.findViewById(R.id.acs);
        this.f107228z.requestFocus();
        this.f107210h = C39955gf.m127822a(this, this.f107228z, this.f107226x, this.f107227y, 0);
        this.f107212j = C38543br.m123188a(this.f107210h, view2);
        this.f107210h.mo99377a();
        this.f107213k = (RemoteImageView) view2.findViewById(R.id.ay5);
        this.f107213k.setScaleType(ScaleType.CENTER_CROP);
        m131440D();
        this.f107213k.setOnClickListener(new C42993bx(600) {
            /* renamed from: a */
            public final void mo101783a(View view) {
                Bitmap bitmap;
                ArrayList arrayList = new ArrayList();
                if (VideoPublishFragment.this.f107218p.mEffectList != null) {
                    arrayList.addAll(VideoPublishFragment.this.f107218p.mEffectList);
                }
                if (VideoPublishFragment.this.f107218p.mTimeEffect != null) {
                    arrayList.add(VideoPublishFragment.this.f107218p.mTimeEffect);
                    VideoPublishFragment.this.f107218p.mTimeEffect.getKey().equals("1");
                }
                VideoPublishFragment.this.f107222t = new VideoCoverBitmapHolder();
                VideoPublishFragment.this.getLifecycle().mo55a(VideoPublishFragment.this.f107222t);
                if (VideoPublishFragment.this.f107223u != null) {
                    bitmap = VideoPublishFragment.this.f107223u;
                } else {
                    bitmap = VideoPublishFragment.this.f107213k.getDrawingCache();
                }
                VideoCoverBitmapHolder.m131308a(bitmap);
                VEVideoPublishPreviewActivity.m131388a((Activity) VideoPublishFragment.this.getActivity(), (ImageView) VideoPublishFragment.this.f107213k, VideoPublishFragment.this.f107218p);
                VideoPublishFragment.this.f107220r = true;
                C6907h.onEvent(MobClick.obtain().setEventName("preview_cover").setLabelName("edit_page"));
                VideoPublishFragment.this.mo101778j();
            }
        });
        m131467e(view);
        DmtTextView dmtTextView = (DmtTextView) this.f107208f.findViewById(R.id.cls);
        boolean a = C35563c.f93231M.mo93305a(Property.UseNewPublishShareDescription);
        if (C6399b.m19947w() && a && dmtTextView != null) {
            dmtTextView.setText(R.string.dt1);
        }
        this.f107214l = this.f107208f.findViewById(R.id.clr);
        this.f107214l.setOnClickListener(new C42939as(1000) {
            /* renamed from: a */
            public final void mo70606a(View view) {
                C41530am.m132280a("PublishDurationMonitor MANUAL_START");
                C43072du.m136630a("upload_start");
                if (!C35563c.f93260w.mo57090c()) {
                    C43072du.m136632a("upload_error", "2", "need login");
                    VideoPublishFragment.this.mo101774c();
                } else if (C35563c.f93260w.mo57089b()) {
                    C43072du.m136632a("upload_error", "2", "teen forbid");
                    C10761a.m31409e(VideoPublishFragment.this.getContext(), (int) R.string.e5p).mo25750a();
                } else {
                    VideoPublishFragment.this.f107210h.mo99389c("publish");
                    C7705c.m23799a().mo20394d(new C22489a(true));
                    if (((Integer) VideoPublishFragment.this.f107205c.getValue()).intValue() == 1) {
                        VideoPublishFragment.this.mo101776h();
                    } else {
                        C35563c.f93240c.mo83127a(VideoPublishFragment.this.getContext(), (C35579a) new C35579a() {
                            /* renamed from: a */
                            public final void mo88243a() {
                                C43072du.m136632a("upload_error", "2", "manual cancel");
                                C10761a.m31405c(VideoPublishFragment.this.getContext().getApplicationContext(), VideoPublishFragment.this.getString(R.string.sm), 1, 2).mo25750a();
                                VideoPublishFragment.this.mo101767a(false);
                                C7705c.m23799a().mo20394d(new C22489a(false));
                            }

                            /* renamed from: a */
                            public final void mo88244a(boolean z) {
                                if (z) {
                                    VideoPublishFragment.this.f107205c.setValue(Integer.valueOf(1));
                                }
                                VideoPublishFragment.this.mo101776h();
                            }
                        });
                    }
                }
            }
        });
        this.f107215m = this.f107208f.findViewById(R.id.ab8);
        this.f107215m.setOnClickListener(new C42939as(1000) {
            /* renamed from: a */
            public final void mo70606a(View view) {
                VideoPublishFragment.this.mo101767a(true);
            }
        });
        List list = this.f107218p.challenges;
        if (list != null && !list.isEmpty()) {
            this.f107209g.f104548a = (AVChallenge) list.get(0);
        }
        C35545a b = C35563c.f93252o.mo83224b();
        if (this.f107218p.isPrivate == 1) {
            z = true;
        } else {
            z = false;
        }
        b.mo83239a(Boolean.valueOf(z));
        this.f107205c.setValue(Integer.valueOf(this.f107218p.isPrivate));
        m131442F();
        if (this.f107218p.title != null && this.f107218p.title.trim().isEmpty()) {
            this.f107218p.title = this.f107218p.title.trim();
        }
        this.f107210h.mo99386b(this.f107218p.title);
        this.f107210h.mo99383a(this.f107218p.creationId);
        if (this.f107218p.isDuet()) {
            this.f107210h.mo99378a(1);
        } else if (this.f107218p.isReaction()) {
            this.f107210h.mo99378a(2);
        }
        this.f107210h.mo99387b(this.f107218p.structList);
        this.f107210h.mo99384a(this.f107218p.challenges);
        if (this.f107218p.stickerChallenge != null && !this.f107218p.stickerChallenge.infoStickerChallenges().isEmpty()) {
            Collection<AVChallenge> infoStickerChallenges = this.f107218p.stickerChallenge.infoStickerChallenges();
            ArrayList arrayList = new ArrayList();
            if (this.f107218p.challenges == null || this.f107218p.challenges.isEmpty()) {
                arrayList.addAll(infoStickerChallenges);
            } else {
                for (AVChallenge aVChallenge : infoStickerChallenges) {
                    if (aVChallenge != null && !this.f107218p.challenges.contains(aVChallenge)) {
                        arrayList.add(aVChallenge);
                    }
                }
            }
            this.f107210h.mo99384a((List<AVChallenge>) arrayList);
        }
        if (this.f107218p.mentionUserModel != null) {
            List<User> transform = this.f107218p.mentionUserModel.transform();
            if (transform != null && !transform.isEmpty()) {
                for (User a2 : transform) {
                    m131455a(a2);
                }
            }
        }
        this.f107210h.f103766b.mo102272a(true);
        if (bundle2 != null) {
            this.f107209g.f104548a = (AVChallenge) bundle2.getSerializable("challenge");
            this.f107205c.setValue(Integer.valueOf(bundle2.getInt("permission")));
            this.f107219q = bundle2.getBoolean("contentModified");
        }
        for (C0902i iVar : this.f107194F) {
            IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) iVar.f3155b;
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.ahj);
            AVPublishContentType aVPublishContentType = AVPublishContentType.Video;
            PublishOutput a3 = C39503ay.m126179a(this.f107218p);
            ExtensionMisc extensionMisc = new ExtensionMisc(this.f107218p.poiData, this.f107218p.defaultSelectStickerPoi, this.f107218p.poiId, this.f107218p.microAppModel, this, extensionDataRepo, new MobParam("video_post_page", this.f107218p.mShootWay, this.f107218p.creationId));
            iAVPublishExtension.onCreate(this, linearLayout, bundle, aVPublishContentType, a3, extensionMisc, new C41281bh(this));
        }
        for (C0902i iVar2 : this.f107194F) {
            ((IAVPublishExtension) iVar2.f3155b).onCreateFinish();
        }
        this.f107204b = (CommonItemView) view2.findViewById(R.id.coa);
        this.f107217o = new C40233e(this, this.f107218p.mIsFromDraft, 5);
        this.f107217o.mo100025a(this.f107211i);
        this.f107217o.mo100026a(this.f107211i, this.f107218p, m131443G(), this.f107218p.creationId, this.f107204b, this.f107203a);
        this.f107216n = C39361dx.m125744a((Fragment) this, view2, 1);
        if (m131472r().booleanValue()) {
            this.f107216n.f102257a.mo83248a(1, false);
            this.f107216n.f102257a.mo83247a(1, (C35556b) new C41282bi(this));
        }
        this.f107216n.mo97945a(this.f107218p.mShootWay);
        m131474t();
        this.f107216n.mo97944a(this.f107218p);
        this.f107205c.observe(this, new C41283bj(this));
        this.f107210h.mo99380a((C38581cj) this);
        this.f107192D = (CheckBox) view2.findViewById(R.id.vj);
        this.f107193E = (FrameLayout) view2.findViewById(R.id.amw);
        if (C30538p.m99745a() || !C36964i.m118940p()) {
            this.f107193E.setVisibility(8);
        } else {
            this.f107192D.setChecked(((Boolean) C35563c.f93252o.mo83227c().mo83238a()).booleanValue());
            this.f107192D.setOnCheckedChangeListener(new C41284bk(this));
        }
        m131473s();
        m131468f(view);
    }

    /* renamed from: a */
    static final /* synthetic */ C7581n m131448a(C27311c cVar, boolean z, Workspace workspace) {
        C35563c.f93224F.mo70090e().mo90404b(cVar);
        if (z) {
            workspace.mo96321i();
        }
        C38505a.m123073a();
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.rw, viewGroup, false);
        C41514ab.m132244a().mo102172a(getActivity(), (ViewGroup) inflate.findViewById(R.id.ac5));
        return inflate;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (C0902i iVar : this.f107194F) {
            ((IAVPublishExtension) iVar.f3155b).onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (C0902i iVar : this.f107194F) {
            ((IAVPublishExtension) iVar.f3155b).onActivityResult(i, i2, intent);
        }
        this.f107216n.mo97943a(i, i2, intent);
        if (i == 1) {
            if (i2 != -1) {
                this.f107209g.f104548a = null;
            } else if (intent != null) {
                this.f107209g.f104548a = (AVChallenge) intent.getSerializableExtra("challenge");
            }
            this.f107219q = true;
        }
        if (i == 2 && i2 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("extra.PERMISSION", 0);
            m131463c(intExtra);
            m131465d(intExtra);
            this.f107205c.setValue(Integer.valueOf(intent.getIntExtra("extra.PERMISSION", 0)));
            this.f107219q = true;
            C6907h.onEvent(MobClick.obtain().setEventName("scope_control").setLabelName("edit_page").setJsonObject(new C6909j().mo16966a("to_status", C34788e.m112188a(intExtra)).mo16967a()));
        }
        if (i == 3 && i2 == -1) {
            this.f107210h.mo99379a(intent);
            this.f107219q = true;
        }
        if (i == 4 && i2 == -1) {
            if (C35563c.f93230L.mo93342a(AVSettings.Property.IsLowMemoryMachine) && ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().checkIsAlreadyPublished(getContext())) {
                m131479y();
            }
            if (!(intent == null || intent.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT") == null)) {
                this.f107218p = (VideoPublishEditModel) intent.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
                m131440D();
            }
        }
        if (6 == i && -1 == i2 && intent != null && this.f107218p != null) {
            this.f107218p.videoCategory = (VideoCategoryParam) intent.getParcelableExtra("KEY_VIDEO_CATEGORY_CHOOSE_RESULT");
            m131475u();
        }
        if (this.f107217o != null) {
            this.f107217o.mo100024a(i, i2, intent);
        }
    }
}
