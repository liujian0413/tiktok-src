package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0892d;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.scene.C12626i;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12640l;
import com.bytedance.scene.C12642n;
import com.facebook.ads.AdError;
import com.google.common.base.C17457s;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p280ss.android.medialib.VideoSdkCore;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.p756d.C15454h;
import com.p280ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p280ss.android.ugc.asve.recorder.ASRecorder.Mode;
import com.p280ss.android.ugc.asve.recorder.C20778k;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.asve.sandbox.C21053p;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21062a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.SafeHandler;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategoryGender;
import com.p280ss.android.ugc.aweme.beauty.C23531b;
import com.p280ss.android.ugc.aweme.beauty.C23532c;
import com.p280ss.android.ugc.aweme.beauty.C23533d;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23539i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.effectplatform.C27482f;
import com.p280ss.android.ugc.aweme.effectplatform.C27484h;
import com.p280ss.android.ugc.aweme.effectplatform.C27491l;
import com.p280ss.android.ugc.aweme.effectplatform.C27495o;
import com.p280ss.android.ugc.aweme.effectplatform.C27498p;
import com.p280ss.android.ugc.aweme.filter.C29197ac;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29203a;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29204b;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29205c;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29206d;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29207e;
import com.p280ss.android.ugc.aweme.filter.C29230az;
import com.p280ss.android.ugc.aweme.filter.C29253bl;
import com.p280ss.android.ugc.aweme.filter.C29254bm;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29297h;
import com.p280ss.android.ugc.aweme.filter.CircleViewPager;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.internal.C35612d;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C38423ab;
import com.p280ss.android.ugc.aweme.shortvideo.C38425ac;
import com.p280ss.android.ugc.aweme.shortvideo.C38495au;
import com.p280ss.android.ugc.aweme.shortvideo.C38499aw;
import com.p280ss.android.ugc.aweme.shortvideo.C38530bh;
import com.p280ss.android.ugc.aweme.shortvideo.C38536bm;
import com.p280ss.android.ugc.aweme.shortvideo.C38576cg;
import com.p280ss.android.ugc.aweme.shortvideo.C39336dd;
import com.p280ss.android.ugc.aweme.shortvideo.C39356dt;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39808ep;
import com.p280ss.android.ugc.aweme.shortvideo.C39812es;
import com.p280ss.android.ugc.aweme.shortvideo.C39885fg;
import com.p280ss.android.ugc.aweme.shortvideo.C39887fh;
import com.p280ss.android.ugc.aweme.shortvideo.C39892fl;
import com.p280ss.android.ugc.aweme.shortvideo.C39898fp;
import com.p280ss.android.ugc.aweme.shortvideo.C39907fv;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.C39993h;
import com.p280ss.android.ugc.aweme.shortvideo.C39996i;
import com.p280ss.android.ugc.aweme.shortvideo.C40184n;
import com.p280ss.android.ugc.aweme.shortvideo.C41712z;
import com.p280ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.CurPlayVideoRecord;
import com.p280ss.android.ugc.aweme.shortvideo.RetakeViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38517a;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38519c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1555b.C39147a;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39313a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction.C39626a;
import com.p280ss.android.ugc.aweme.shortvideo.game.C39918a;
import com.p280ss.android.ugc.aweme.shortvideo.game.C39934k;
import com.p280ss.android.ugc.aweme.shortvideo.game.p1574a.C39922a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a.C39945a;
import com.p280ss.android.ugc.aweme.shortvideo.guide.ExtraParams;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.p1549a.C38465a;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38479d;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38555b;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38561g;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39329g;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i;
import com.p280ss.android.ugc.aweme.shortvideo.p1578i.C39998a;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40186a;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40190e;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.ChristmasCountDownDialog.C41132a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.EmbaddedWindowInfo.C41140a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.p1618a.C41239a;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40289a;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40305c;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40312g;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule.C40288a;
import com.p280ss.android.ugc.aweme.shortvideo.record.p1590a.C40295a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40499bk;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40500bl;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40501bm;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40531d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40995a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40997c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40994w.C40998d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.C40808p;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40407b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40414d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40956d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40969m;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.LatestClickedEffectViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41520af;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41524ag;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41536ap;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41545b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41558k;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41578z;
import com.p280ss.android.ugc.aweme.shortvideo.widget.ScreenSizeAspectFrameLayout;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.tools.C42135ab;
import com.p280ss.android.ugc.aweme.tools.C42137ad;
import com.p280ss.android.ugc.aweme.tools.C42140ag;
import com.p280ss.android.ugc.aweme.tools.C42141ah;
import com.p280ss.android.ugc.aweme.tools.C42145al;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42157ax;
import com.p280ss.android.ugc.aweme.tools.C42158ay;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42345j;
import com.p280ss.android.ugc.aweme.tools.C42346k;
import com.p280ss.android.ugc.aweme.tools.C42347l;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.aweme.tools.C42586v;
import com.p280ss.android.ugc.aweme.tools.C42588x;
import com.p280ss.android.ugc.aweme.tools.C42589y;
import com.p280ss.android.ugc.aweme.tools.C42590z;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g;
import com.p280ss.android.ugc.aweme.tools.extract.C42326j;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.utils.C42998c;
import com.p280ss.android.ugc.aweme.utils.C43063dm;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43758h;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.C44446ab;
import com.p280ss.android.ugc.gamora.recorder.C44643g;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.RecordViewState;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import com.p280ss.android.ugc.gamora.recorder.musiccut.C44691a;
import com.p280ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewModel;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordModeViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.p280ss.android.vesdk.C45252ac;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.C45382z.C45402m;
import com.p280ss.android.vesdk.runtime.C45362d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.p1863b.C47442a;
import dmt.p1861av.video.p1863b.C47443b;
import dmt.p1861av.video.p1863b.C47445d;
import dmt.p1861av.video.p1863b.C47450e;
import dmt.p1861av.video.superentrance.SuperEntranceActivity;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.p357a.C7562b;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity */
public class VideoRecordNewActivity extends RecordSessionActivity implements C23258e, C35612d, C42158ay {

    /* renamed from: A */
    public Effect f107260A;

    /* renamed from: B */
    public Serializable f107261B;

    /* renamed from: C */
    public boolean f107262C;

    /* renamed from: D */
    public C39934k f107263D;

    /* renamed from: E */
    public C42320g f107264E;

    /* renamed from: F */
    public String f107265F;

    /* renamed from: G */
    public boolean f107266G = false;

    /* renamed from: H */
    public C39382ed f107267H;

    /* renamed from: I */
    public C38517a f107268I;

    /* renamed from: J */
    public C38519c f107269J;

    /* renamed from: K */
    public boolean f107270K;

    /* renamed from: L */
    public boolean f107271L;

    /* renamed from: M */
    Effect f107272M;

    /* renamed from: N */
    public List<String> f107273N;

    /* renamed from: O */
    public SurfaceHolder f107274O;

    /* renamed from: P */
    public boolean f107275P;

    /* renamed from: Q */
    public boolean f107276Q = true;

    /* renamed from: R */
    public volatile boolean f107277R = true;

    /* renamed from: S */
    public boolean f107278S = false;

    /* renamed from: T */
    public boolean f107279T = false;

    /* renamed from: U */
    public C29230az f107280U;

    /* renamed from: V */
    public boolean f107281V;

    /* renamed from: W */
    public String f107282W = "";

    /* renamed from: X */
    public C29207e f107283X = new C29207e() {

        /* renamed from: b */
        private CircleViewPager f107366b;

        /* renamed from: a */
        public final CircleViewPager mo74809a() {
            if (this.f107366b == null) {
                RecyclerView recyclerView = (RecyclerView) VideoRecordNewActivity.this.findViewById(R.id.cqn);
                if (recyclerView != null) {
                    this.f107366b = (CircleViewPager) recyclerView.findViewById(R.id.ax6);
                }
            }
            if (this.f107366b == null) {
                this.f107366b = new CircleViewPager(VideoRecordNewActivity.this);
            }
            return this.f107366b;
        }
    };

    /* renamed from: Y */
    public C17457s<C40832n> f107284Y = new C17457s<C40832n>() {

        /* renamed from: a */
        C40832n f107375a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C40832n mo44946a() {
            if (this.f107375a == null) {
                this.f107375a = new C40407b(VideoRecordNewActivity.this, VideoRecordNewActivity.this.f107334t.getEffectController(), VideoRecordNewActivity.this.f107324j);
            }
            return this.f107375a;
        }
    };

    /* renamed from: Z */
    public C19622b f107285Z = new C41394p(this.f107320f, new C19622b() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo101874a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
            if (aSSimpleFaceInfoArr != null) {
                VideoRecordNewActivity.this.mo101831a(aSSimpleFaceInfoArr);
                int length = aSSimpleFaceInfoArr.length;
                int i = 0;
                while (i < length) {
                    ASSimpleFaceInfo aSSimpleFaceInfo = aSSimpleFaceInfoArr[i];
                    if (aSSimpleFaceInfo == null || aSSimpleFaceInfo.f56527a <= C35563c.f93230L.mo93345d(Property.MALE_PROB_THRESHOLD)) {
                        i++;
                    } else {
                        VideoRecordNewActivity.this.f107331q.mo99985a(true);
                        return;
                    }
                }
                VideoRecordNewActivity.this.f107331q.mo99985a(false);
            }
        }

        /* renamed from: a */
        public final void mo52204a(int i) {
            StringBuilder sb = new StringBuilder("onNativeInitCallBack() called with: ret = [");
            sb.append(i);
            sb.append("]");
            C42880h.m136156a(sb.toString());
            if (i < 0) {
                C10761a.m31403c(VideoRecordNewActivity.this.getApplicationContext(), VideoRecordNewActivity.this.getString(R.string.cjc, new Object[]{Integer.valueOf(i)})).mo25750a();
                C38505a.m123073a();
                StringBuilder sb2 = new StringBuilder("currentWidth:");
                sb2.append(VideoRecordNewActivity.this.f107317c);
                sb2.append("    currentHeight:");
                sb2.append(VideoRecordNewActivity.this.f107318d);
                sb2.append("      availableMem:");
                String sb3 = sb2.toString();
                try {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb3);
                    sb4.append(C42998c.m136487a(C35563c.f93238a));
                    sb4.append(" currentPIDMem:");
                    sb4.append(C42998c.m136488b(C35563c.f93238a.getApplicationContext()));
                    sb4.append("hasUsedMem:");
                    sb4.append(C42998c.m136489c(C35563c.f93238a.getApplicationContext()));
                    sb3 = sb4.toString();
                } catch (Exception unused) {
                }
                StringBuilder sb5 = new StringBuilder("init failed detail: ");
                sb5.append(sb3);
                C6921a.m21559a((Throwable) new Exception(sb5.toString()));
                C6893q.m21444a("aweme_sensetime_init_fail", 1, C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(i)).mo16887a("errorDesc", "").mo16887a("exception", sb3).mo16888b());
                StringBuilder sb6 = new StringBuilder("native init failed , ve result = ");
                sb6.append(i);
                C43072du.m136632a("camera_error", "3", sb6.toString());
                VideoRecordNewActivity.this.finish();
                return;
            }
            C6893q.m21444a("aweme_sensetime_init_fail", 0, (JSONObject) null);
            VideoRecordNewActivity.this.mo101852l().mo96168c(true);
            VideoRecordNewActivity.this.mo101852l().mo96174f(true);
            if (!C23536f.m77298a() || C35574k.m114859a().mo70099n().mo61329d()) {
                VideoRecordNewActivity.this.f107334t.getEffectController().mo56058a((C21062a) new C41329da(this));
            }
            VideoRecordNewActivity.this.f107331q.mo99989c(true);
            try {
                VideoRecordNewActivity.this.f107334t.setPreviewSizeRatio((((float) VideoRecordNewActivity.this.f107327m.mo100091j()) * 1.0f) / ((float) VideoRecordNewActivity.this.f107327m.mo100092k()));
            } catch (Exception unused2) {
            }
            VideoRecordNewActivity.this.f107334t.mo56252f(C35563c.f93230L.mo93342a(Property.UseLargeMattingModel));
            VideoRecordNewActivity.this.f107334t.setHandDetectLowpower(!C35563c.f93230L.mo93342a(Property.UseLargeGestureDetectModel));
        }

        /* renamed from: a */
        public final void mo52205a(int i, int i2) {
            StringBuilder sb = new StringBuilder("onNativeInitHardEncoderRetCallback() called with: isCPUEncode = [");
            sb.append(i);
            sb.append("]");
            C42880h.m136156a(sb.toString());
            C35563c.f93230L.mo93338a(Property.RecordUseSuccessRecordProfile, i2);
            if (VideoRecordNewActivity.this.f107286a.f99766b == 0) {
                VideoRecordNewActivity.this.f107286a.f99783s = i ^ 1;
                C38505a.m123086b(VideoRecordNewActivity.this.f107286a.f99783s);
            }
        }
    });

    /* renamed from: a */
    public ShortVideoContext f107286a;

    /* renamed from: aA */
    private C29206d f107287aA = new C29206d() {
        /* renamed from: a */
        public final void mo74807a() {
            VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) new C42137ad(0));
        }

        /* renamed from: b */
        public final void mo74808b() {
            C6907h.m21519a((Context) VideoRecordNewActivity.this, "filter_confirm", "shoot_page", "0", 0, VideoRecordNewActivity.this.mo101854n());
            VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) new C42137ad(4));
            if (VideoRecordNewActivity.this.f107281V) {
                C29296g g = ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74906g();
                C29230az azVar = VideoRecordNewActivity.this.f107280U;
                C40190e eVar = VideoRecordNewActivity.this.f107331q;
                eVar.getClass();
                C6907h.m21524a("adjust_filter_complete", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").mo59973a("creation_id", VideoRecordNewActivity.this.f107286a.f99787w).mo59973a("shoot_way", VideoRecordNewActivity.this.f107286a.f99788x).mo59970a("draft_id", VideoRecordNewActivity.this.f107286a.f99790z).mo59970a("filter_id", g.f77266a).mo59973a("filter_name", g.f77267b).mo59972a("value", (Object) Float.valueOf(C29297h.m96116a(g, azVar, C41335dg.m131906a(eVar)))).f60753a);
            }
        }
    };

    /* renamed from: aB */
    private int f107288aB = 0;

    /* renamed from: aC */
    private boolean f107289aC = false;

    /* renamed from: aa */
    public BeautyCategoryGender f107290aa = BeautyCategoryGender.FEMALE;

    /* renamed from: ab */
    public List<String> f107291ab = null;

    /* renamed from: ac */
    private List<C23255b> f107292ac = new ArrayList();

    /* renamed from: ad */
    private List<C23254a> f107293ad = new ArrayList();

    /* renamed from: ae */
    private boolean f107294ae = false;

    /* renamed from: af */
    private volatile boolean f107295af = true;

    /* renamed from: ag */
    private boolean f107296ag;

    /* renamed from: ah */
    private String f107297ah;

    /* renamed from: ai */
    private C40501bm f107298ai;

    /* renamed from: aj */
    private C12642n f107299aj;

    /* renamed from: ak */
    private boolean f107300ak = false;

    /* renamed from: al */
    private boolean f107301al = false;

    /* renamed from: am */
    private int f107302am = 0;

    /* renamed from: an */
    private int f107303an = 0;

    /* renamed from: ao */
    private FrameLayout f107304ao;

    /* renamed from: ap */
    private int f107305ap;

    /* renamed from: aq */
    private boolean f107306aq;

    /* renamed from: ar */
    private C41252ag f107307ar;

    /* renamed from: as */
    private C27482f f107308as;

    /* renamed from: at */
    private C44446ab f107309at;

    /* renamed from: au */
    private C29296g f107310au = null;

    /* renamed from: av */
    private String f107311av;

    /* renamed from: aw */
    private ArrayList<StickerWrapper> f107312aw = new ArrayList<>();

    /* renamed from: ax */
    private RecordZoomValueTextView f107313ax;

    /* renamed from: ay */
    private C29205c f107314ay = new C29205c() {
        /* renamed from: a */
        public final void mo74803a(float f) {
            int i;
            if (VideoRecordNewActivity.this.f107331q != null) {
                if (((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74906g() == null) {
                    i = 0;
                } else {
                    i = ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74906g().f77270e;
                }
                if (VideoRecordNewActivity.this.f107281V) {
                    VideoRecordNewActivity.this.f107331q.mo99984a(new C40186a(i), f, VideoRecordNewActivity.this.f107280U);
                } else {
                    VideoRecordNewActivity.this.f107331q.mo99983a(new C40186a(i), f);
                }
            }
            ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74906g();
        }

        /* renamed from: b */
        public final void mo74806b(C29296g gVar) {
            float f;
            if (C6399b.m19946v() && gVar.mo74976a().contains("normal")) {
                VideoRecordNewActivity.this.f107331q.mo99961a("");
            } else if (VideoRecordNewActivity.this.f107281V) {
                C29230az azVar = VideoRecordNewActivity.this.f107280U;
                C40190e eVar = VideoRecordNewActivity.this.f107331q;
                eVar.getClass();
                float a = C29297h.m96116a(gVar, azVar, C41333de.m131902a(eVar));
                VideoRecordNewActivity.this.f107331q.mo99962a(gVar.mo74978b(), a);
                VideoRecordNewActivity.this.f107286a.f99735aM = gVar.f77270e;
                VideoRecordNewActivity.this.f107286a.f99736aN = a;
            } else {
                VideoRecordNewActivity.this.f107331q.mo99961a(gVar.mo74978b());
            }
            if (VideoRecordNewActivity.this.f107286a.f99784t) {
                if (gVar.f77270e == 0) {
                    f = 0.35f;
                } else {
                    f = 0.0f;
                }
                VideoRecordNewActivity.this.f107331q.mo99987b(f);
            }
            ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74906g();
        }

        /* renamed from: a */
        public final void mo74804a(C29296g gVar) {
            if (!VideoRecordNewActivity.this.mo101852l().mo96173e()) {
                VideoRecordNewActivity.this.f107286a.f99720Y.add(gVar.f77268c);
                VideoRecordNewActivity.this.f107286a.f99721Z.add(String.valueOf(gVar.f77266a));
            }
            if (C23536f.m77298a()) {
                Iterator it = C35563c.f93224F.mo70097l().mo74949b().mo74966b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C29296g gVar2 = (C29296g) it.next();
                    if (gVar2.equals(gVar)) {
                        if (gVar2.f77276k) {
                            VideoRecordNewActivity.this.f107321g.mo96544a(VideoRecordNewActivity.this.f107327m.mo100087f(), gVar.f77270e);
                        } else {
                            gVar2.f77276k = true;
                        }
                    }
                }
            } else {
                VideoRecordNewActivity.this.f107321g.mo96544a(VideoRecordNewActivity.this.f107327m.mo100087f(), gVar.f77270e);
            }
            VideoRecordNewActivity.this.f107337w.mo103594a((Object) this, (C42155av) C42588x.m135308a(0.0f));
            C35563c.f93258u.mo83193a(gVar);
            if (VideoRecordNewActivity.this.f107281V) {
                VideoRecordNewActivity.this.onEventLastUsedFilterByCurrentFilter(gVar);
            }
        }

        /* renamed from: a */
        public final void mo74805a(C29296g gVar, int i) {
            if (!C6399b.m19946v() || !gVar.mo74976a().contains("normal")) {
                C40190e eVar = VideoRecordNewActivity.this.f107331q;
                eVar.getClass();
                VideoRecordNewActivity.this.f107331q.mo99962a(gVar.mo74978b(), C29297h.m96115a(gVar, i, C41334df.m131904a(eVar)));
                VideoRecordNewActivity.this.f107280U.mo74795a(gVar, i);
            }
        }
    };

    /* renamed from: az */
    private C29203a f107315az = new C29203a() {
        /* renamed from: a */
        public final void mo74798a() {
            VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42588x.m135310a(true));
        }

        /* renamed from: b */
        public final void mo74799b() {
            VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42588x.m135310a(false));
        }
    };

    /* renamed from: b */
    public double f107316b = 1.0d;

    /* renamed from: c */
    public int f107317c = 1280;

    /* renamed from: d */
    public int f107318d = 720;

    /* renamed from: e */
    public boolean f107319e;

    /* renamed from: f */
    public SafeHandler f107320f = new SafeHandler(this);

    /* renamed from: g */
    public C38555b f107321g = C38561g.m123243a();

    /* renamed from: h */
    public C40289a f107322h;

    /* renamed from: i */
    public C40499bk f107323i;

    /* renamed from: j */
    public C40994w f107324j;

    /* renamed from: k */
    public C40531d f107325k;

    /* renamed from: l */
    public C39374g f107326l;

    /* renamed from: m */
    public CameraModule f107327m;

    /* renamed from: n */
    public C40295a f107328n;

    /* renamed from: o */
    public C40305c f107329o;

    /* renamed from: p */
    public C39626a f107330p;

    /* renamed from: q */
    public C40190e f107331q;

    /* renamed from: r */
    public FrameLayout f107332r;

    /* renamed from: s */
    public ScreenSizeAspectFrameLayout f107333s;

    /* renamed from: t */
    public ASCameraView f107334t;

    /* renamed from: u */
    public SurfaceView f107335u;

    /* renamed from: v */
    public FrameLayout f107336v;

    /* renamed from: w */
    public C42156aw f107337w;

    /* renamed from: x */
    public C42156aw f107338x;

    /* renamed from: y */
    public boolean f107339y = true;

    /* renamed from: z */
    public List<String> f107340z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$a */
    public static class C41210a implements C21053p {

        /* renamed from: a */
        private WeakReference<VideoRecordNewActivity> f107380a;

        /* renamed from: a */
        public final void mo56768a() {
            if (this.f107380a != null) {
                VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) this.f107380a.get();
                if (videoRecordNewActivity != null) {
                    videoRecordNewActivity.mo101839c();
                }
            }
        }

        public C41210a(VideoRecordNewActivity videoRecordNewActivity) {
            this.f107380a = new WeakReference<>(videoRecordNewActivity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$b */
    public class C41211b implements Runnable {

        /* renamed from: a */
        ShortVideoContextViewModel f107381a = VideoRecordNewActivity.this.mo101852l();

        public final void run() {
            long j;
            boolean z;
            if (!VideoRecordNewActivity.this.mo101852l().mo96173e()) {
                long endFrameTimeUS = VideoRecordNewActivity.this.f107334t.getEndFrameTimeUS() / 1000;
                if (endFrameTimeUS <= 0) {
                    StringBuilder sb = new StringBuilder("VideoNewActivity UpdateProgressSegment duration = ");
                    sb.append(endFrameTimeUS);
                    C41530am.m132283b(sb.toString());
                }
                if (VideoRecordNewActivity.this.f107286a.f99751al == 1) {
                    j = TimeSpeedModelExtension.calculateRealTime(endFrameTimeUS, (double) RecordingSpeed.NORMAL.value()) + VideoRecordNewActivity.this.f107286a.mo96150k();
                } else {
                    j = TimeSpeedModelExtension.calculateRealTime(endFrameTimeUS, VideoRecordNewActivity.this.f107316b) + VideoRecordNewActivity.this.f107286a.mo96150k();
                }
                long a = this.f107381a.mo96161a();
                VideoRecordNewActivity.this.mo101813a((int) j);
                boolean z2 = false;
                if (C35563c.f93231M.mo93305a(AVAB.Property.DuetFixNewPlan) || C6399b.m19947w() ? j <= VideoRecordNewActivity.this.f107286a.mo96155p() : (VideoRecordNewActivity.this.f107286a.mo96144e() || VideoRecordNewActivity.this.f107286a.mo96142d()) && VideoRecordNewActivity.this.f107334t.getDataSourceVideoCompleteListener() != null ? !VideoRecordNewActivity.this.f107266G || j <= VideoRecordNewActivity.this.f107286a.mo96155p() : j <= VideoRecordNewActivity.this.f107286a.mo96155p()) {
                    z = false;
                } else {
                    z = true;
                }
                if (a > 0 && a < VideoRecordNewActivity.this.f107286a.mo96155p() && j > a) {
                    z2 = true;
                }
                if (z2 || z) {
                    if (z) {
                        VideoRecordNewActivity.this.f107286a.f99750ak = System.currentTimeMillis();
                    }
                    C42151ar arVar = new C42151ar();
                    VideoRecordNewActivity.this.f107338x.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) arVar);
                    VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) arVar);
                    if (z2) {
                        this.f107381a.mo96164a(0);
                    }
                    if (z) {
                        VideoRecordNewActivity.this.f107264E.mo103794a(true);
                        if (VideoRecordNewActivity.this.f107286a.f99779o) {
                            ((RecordModeViewModel) C36113b.m116288a(VideoRecordNewActivity.this).mo91871a(RecordModeViewModel.class)).mo107123a(2);
                        } else {
                            VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) new C42589y("record_full"));
                            VideoRecordNewActivity.this.mo101859p();
                        }
                    }
                    return;
                }
                VideoRecordNewActivity.this.mo101815a(endFrameTimeUS);
                VideoRecordNewActivity.this.f107320f.post(this);
            }
        }

        public C41211b() {
        }
    }

    /* renamed from: J */
    public final C42156aw mo97896J() {
        return this.f107338x;
    }

    /* renamed from: a */
    public final C40189d mo90423a() {
        return this.f107331q;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101814a(int i, float f) {
        this.f107313ax.post(new C41311cj(this, i, f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo101836b(LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null && liveDataWrapper.f88768b == STATUS.SUCCESS && liveDataWrapper.f88767a != null && ((Pair) liveDataWrapper.f88767a).getFirst() != null && ((Pair) liveDataWrapper.f88767a).getSecond() != null) {
            boolean booleanValue = ((Boolean) ((Pair) liveDataWrapper.f88767a).getFirst()).booleanValue();
            int intValue = ((Integer) ((Pair) liveDataWrapper.f88767a).getSecond()).intValue();
            boolean M = C44643g.m141004M();
            boolean z = false;
            boolean g = ((C35622l) C25682d.m84426a(this, C35622l.class)).mo60373g(false);
            if (booleanValue && M && !g) {
                z = true;
            }
            if (z) {
                C42590z zVar = new C42590z(intValue);
                if (this.f107337w != null) {
                    this.f107337w.mo103594a((Object) this, (C42155av) zVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101820a(LiveDataWrapper liveDataWrapper) {
        if (liveDataWrapper != null && liveDataWrapper.f88768b == STATUS.SUCCESS && liveDataWrapper.f88767a != null && ((Pair) liveDataWrapper.f88767a).getFirst() != null && ((Pair) liveDataWrapper.f88767a).getSecond() != null) {
            boolean booleanValue = ((Boolean) ((Pair) liveDataWrapper.f88767a).getFirst()).booleanValue();
            int intValue = ((Integer) ((Pair) liveDataWrapper.f88767a).getSecond()).intValue();
            if (booleanValue && C44643g.m141004M()) {
                C42590z zVar = new C42590z(intValue);
                if (this.f107337w != null) {
                    this.f107337w.mo103594a((Object) this, (C42155av) zVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C12629j mo101810a(ClassLoader classLoader, String str, Bundle bundle) {
        if (TextUtils.equals(C39336dd.class.getName(), str)) {
            return this.f107267H;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101826a(Boolean bool) {
        if (bool != null && bool.booleanValue() && !C23536f.m77298a()) {
            mo101840c(this.f107286a.f99784t);
        }
    }

    /* renamed from: a */
    public final void mo101830a(boolean z, boolean z2) {
        if (z) {
            C39804em.m127434a((View) this.f107335u, this.f107286a.f99773i, this.f107286a.f99774j);
            m131622f(false);
        }
        if (z2) {
            C39804em.m127431a(this.f107335u, this, this.f107286a.f99773i, this.f107286a.f99774j, this.f107302am);
            if (this.f107267H != null) {
                this.f107267H.mo97906c();
            }
            m131622f(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101818a(View view) {
        m131598ac();
    }

    /* renamed from: a */
    public final void mo101829a(boolean z) {
        this.f107325k.mo100602b();
        C42137ad adVar = new C42137ad(0);
        adVar.f109657b = false;
        this.f107337w.mo103594a((Object) this, (C42155av) adVar);
    }

    /* renamed from: b */
    public final void mo101837b(boolean z) {
        this.f107325k.mo100600a();
        if (!(this.f107267H == null || this.f107324j == null)) {
            mo101865u().mo101946a(this.f107324j.mo100301b());
        }
        C42137ad adVar = new C42137ad(4);
        adVar.f109657b = false;
        this.f107337w.mo103594a((Object) this, (C42155av) adVar);
        if (this.f107323i != null && this.f107324j.mo100301b() != null) {
            this.f107323i.mo100550a(this.f107324j.mo100301b());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101817a(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101816a(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101821a(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null) {
            this.f107286a.f99732aJ = C39312e.m125622a(aVMusicWaveBean);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101828a(List list, File file, int i) {
        if (i != 0) {
            runOnUiThread(new C41310ci(this, file, i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101833a(String[] strArr, double[] dArr, boolean[] zArr) {
        if (strArr == null) {
            this.f107286a.f99731aI = null;
        } else {
            this.f107286a.f99731aI = new ClientCherEffectParam(strArr, dArr, zArr);
        }
        C38505a.m123076a(this.f107286a.f99731aI);
    }

    /* renamed from: a */
    public final void mo101813a(int i) {
        if (!(this.f107330p == null || this.f107324j == null || this.f107324j.mo100301b() == null || !this.f107330p.mo98793a(i))) {
            FaceStickerBean b = this.f107324j.mo100301b();
            if (b != null) {
                ExtraParams extraParams = (ExtraParams) C35563c.f93220B.getRetrofitFactoryGson().mo15974a(b.getExtra(), ExtraParams.class);
                if (extraParams != null && extraParams.isUrlInteractionStickerValid()) {
                    m131594a(extraParams);
                    this.f107330p.f102945a = String.valueOf(b.getStickerId());
                    this.f107330p.mo98790a(i, extraParams);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo101822a(ShortVideoContext shortVideoContext) {
        if (this.f107330p != null) {
            this.f107330p.mo98791a(shortVideoContext);
        }
    }

    /* renamed from: a */
    public final void mo101815a(long j) {
        long j2;
        if (this.f107286a.f99779o) {
            j2 = this.f107286a.f99778n;
        } else {
            j2 = this.f107286a.f99777m;
        }
        if (j > 0) {
            j2 += TimeSpeedModelExtension.calculateRealTime(j, this.f107316b);
        }
        C42141ah a = C42141ah.m134103a(this.f107286a.mo96152m(), j2);
        if (this.f107337w != null) {
            this.f107337w.mo103594a((Object) this, (C42155av) a);
        }
        a.mo103576a();
    }

    /* renamed from: a */
    public final void mo101819a(C23255b bVar) {
        this.f107292ac.add(bVar);
    }

    /* renamed from: b */
    public final void mo101835b(C23255b bVar) {
        this.f107292ac.remove(bVar);
    }

    /* renamed from: a */
    public final void mo60525a(C23254a aVar) {
        this.f107293ad.add(aVar);
    }

    /* renamed from: a */
    public final void mo101831a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
        if (!this.f107289aC && C23536f.m77298a()) {
            int i = 0;
            if (aSSimpleFaceInfoArr == null || aSSimpleFaceInfoArr.length == 0) {
                this.f107288aB = 0;
                return;
            }
            this.f107288aB++;
            if (this.f107288aB == 6) {
                int length = aSSimpleFaceInfoArr.length;
                while (i < length) {
                    ASSimpleFaceInfo aSSimpleFaceInfo = aSSimpleFaceInfoArr[i];
                    if (aSSimpleFaceInfo == null || aSSimpleFaceInfo.f56527a > C35563c.f93230L.mo93345d(Property.MALE_PROB_THRESHOLD)) {
                        i++;
                    } else {
                        C23539i n = C35574k.m114859a().mo70099n();
                        C23532c cVar = new C23532c(BeautyCategoryGender.FEMALE, true, false, true, false);
                        n.mo61325a(cVar);
                        this.f107289aC = true;
                        this.f107290aa = BeautyCategoryGender.FEMALE;
                        return;
                    }
                }
                C23539i n2 = C35574k.m114859a().mo70099n();
                C23532c cVar2 = new C23532c(BeautyCategoryGender.MALE, true, false, true, false);
                n2.mo61325a(cVar2);
                this.f107289aC = true;
                this.f107290aa = BeautyCategoryGender.MALE;
            }
        }
    }

    /* renamed from: a */
    public final void mo101812a(float f, float f2) {
        if (this.f107327m.mo100079a((View) this.f107335u, f, f2)) {
            this.f107334t.mo56212a((int) f, (int) f2);
        }
    }

    /* renamed from: a */
    public final void mo101827a(String str) {
        this.f107278S = true;
        this.f107324j.mo100294a(str, null, (C43760j) new C43760j() {
            /* renamed from: a */
            public final void mo9281a(Effect effect, C43726c cVar) {
            }

            /* renamed from: b */
            public final void mo9282b(Effect effect) {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo101878a(EffectListResponse effectListResponse) {
                VideoRecordNewActivity.this.mo101824a(effectListResponse, new StringBuilder(), Boolean.valueOf(true));
            }

            /* renamed from: a */
            public final void mo9280a(Effect effect) {
                if (effect != null && !VideoRecordNewActivity.this.isFinishing() && !C40496bh.m129440a(effect)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(effect);
                    EffectListResponse effectListResponse = new EffectListResponse();
                    effectListResponse.data = arrayList;
                    if (VideoRecordNewActivity.this.f107277R) {
                        VideoRecordNewActivity.this.f107320f.postDelayed(new C41331dc(this, effectListResponse), 2000);
                    } else {
                        VideoRecordNewActivity.this.mo101824a(effectListResponse, new StringBuilder(), Boolean.valueOf(true));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo101824a(EffectListResponse effectListResponse, StringBuilder sb, Boolean bool) {
        this.f107273N = effectListResponse.url_prefix;
        Effect effect = this.f107260A;
        List<Effect> list = effectListResponse.data;
        if (!C6311g.m19573a(list) && !TextUtils.equals(this.f107297ah, "qrcode") && C40496bh.m129465j((Effect) list.get(0)) && !C40496bh.m129471p((Effect) list.get(0))) {
            list.remove(0);
        }
        if (!C6311g.m19573a(list)) {
            if (C6311g.m19574b(effectListResponse.collection)) {
                this.f107324j.mo100296a(effectListResponse.collection);
            }
            Iterator it = list.iterator();
            HashSet hashSet = new HashSet();
            while (it.hasNext()) {
                String parentId = ((Effect) it.next()).getParentId();
                if (!TextUtils.isEmpty(parentId) && !hashSet.add(parentId)) {
                    it.remove();
                }
            }
            if (!bool.booleanValue()) {
                m131620d(sb.toString());
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m131595a(list, i);
            }
            if ((!C40496bh.m129455d((Effect) list.get(0)) || !this.f107286a.mo96144e()) && (!C40496bh.m129457e((Effect) list.get(0)) || (!this.f107286a.mo96144e() && !this.f107286a.mo96142d()))) {
                if (bool.booleanValue()) {
                    Effect a = ((LatestClickedEffectViewModel) C0069x.m159a((FragmentActivity) this).mo147a(LatestClickedEffectViewModel.class)).mo101302a();
                    if (a == null || TextUtils.isEmpty(a.getEffectId()) || (!TextUtils.isEmpty(this.f107282W) && this.f107282W.equals(a.getEffectId()))) {
                        this.f107324j.mo100307c((Effect) list.get(0));
                    } else {
                        return;
                    }
                } else {
                    this.f107324j.mo100298a(list, effect != null);
                }
            }
            if (bool.booleanValue()) {
                effect = (Effect) list.get(0);
            }
            if (effect != null) {
                if (!bool.booleanValue()) {
                    this.f107282W = effect.getEffectId();
                }
                ((Effect) list.get(0)).setUnzipPath(effect.getUnzipPath());
                this.f107324j.mo100282a(C40376ag.m129117a(effect));
                ((CurUseStickerViewModel) C0069x.m159a((FragmentActivity) this).mo147a(CurUseStickerViewModel.class)).mo101275a(effect);
            }
            mo101823a((Effect) list.get(0));
        }
    }

    /* renamed from: a */
    public final void mo101823a(Effect effect) {
        if (C40496bh.m129465j(effect)) {
            C40956d.m130819a().mo101262a(effect);
            if (this.f107267H instanceof C39336dd) {
                ((C39336dd) this.f107267H).mo96987K();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101832a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            this.f107291ab = null;
            return;
        }
        this.f107291ab = new ArrayList();
        Collections.addAll(this.f107291ab, strArr);
    }

    /* renamed from: T */
    private C38519c m131581T() {
        return this.f107268I.f100115a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public final /* synthetic */ void mo101809C() {
        mo101815a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final /* synthetic */ void mo101869y() {
        m131592a((C12629j) this.f107267H);
    }

    /* renamed from: Y */
    private void m131586Y() {
        this.f107322h = new C40289a(this, C41298by.f107551a);
    }

    /* renamed from: d */
    public final LayoutParams mo101841d() {
        if (this.f107335u == null) {
            return null;
        }
        return (LayoutParams) this.f107335u.getLayoutParams();
    }

    /* renamed from: g */
    public final boolean mo101847g() {
        if (!this.f107279T || C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.ayd);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final ShortVideoContextViewModel mo101852l() {
        return (ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this).mo147a(ShortVideoContextViewModel.class);
    }

    /* renamed from: m */
    public final void mo101853m() {
        C42880h.m136156a("initMediaProcess() called");
        this.f107334t.mo56294n();
        m131599ad();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo101859p() {
        if (this.f107337w != null) {
            this.f107337w.mo103594a((Object) this, (C42155av) new C42140ag());
        }
    }

    /* renamed from: q */
    public final void mo101860q() {
        if (this.f107298ai != null) {
            this.f107298ai.mo100553a();
        }
    }

    /* renamed from: t */
    public final void mo101864t() {
        runOnUiThread(new C41306ce(this));
    }

    /* renamed from: u */
    public final C41252ag mo101865u() {
        if (this.f107307ar == null) {
            this.f107307ar = new C41252ag(this.f107267H);
        }
        return this.f107307ar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final /* synthetic */ void mo101867w() {
        if (this.f107334t != null) {
            this.f107334t.mo56217a((OnARTextContentCallback) new C41309ch(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final /* synthetic */ void mo101868x() {
        if (this.f107277R) {
            this.f107277R = false;
            C41530am.m132280a("VideoRecordNewActivity => addFragment by postDelay");
            mo101845e();
        }
    }

    /* renamed from: E */
    private void m131567E() {
        this.f107308as = new C27484h().mo70691a();
        this.f107308as.mo70688a(new IFetchResourcesListener() {
            public final void onFailed(Exception exc) {
            }

            public final void onSuccess(String[] strArr) {
                C27498p.m90140a(Arrays.asList(strArr));
            }
        });
    }

    /* renamed from: F */
    private void m131568F() {
        m131567E();
        if (C35563c.f93231M.mo93305a(AVAB.Property.PreFetchPopEffectModel)) {
            C27495o.m90135a();
        }
    }

    /* renamed from: G */
    private void m131569G() {
        this.f107334t = new ASCameraView(this);
        this.f107335u = new SurfaceView(this);
        this.f107334t.addView(this.f107335u);
    }

    /* renamed from: M */
    private void m131574M() {
        C39998a.m127889c().mo99451a().observe(this, new C41316co(this));
    }

    /* renamed from: N */
    private void m131575N() {
        C39998a.m127889c().mo99452a(this.f107260A).observe(this, new C41317cp(this));
    }

    /* renamed from: P */
    private void m131577P() {
        this.f107316b = 1.0d;
        mo101850j();
        C45252ac.m142757a();
        if (this.f107324j != null) {
            this.f107324j.mo100308c(false);
            this.f107324j.mo100321m();
        }
    }

    /* renamed from: Q */
    private void m131578Q() {
        this.f107263D = C39918a.m127695a(this, this.f107334t, (FrameLayout) findViewById(R.id.bhp), new C39922a() {
            /* renamed from: a */
            public final void mo99335a() {
                VideoRecordNewActivity.this.f107320f.post(new C41332dd(this));
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final /* synthetic */ void mo101881c() {
                VideoRecordNewActivity.this.findViewById(R.id.cq4).setVisibility(8);
                VideoRecordNewActivity.this.f107327m.mo100086e();
                VideoRecordNewActivity.this.mo101843d(true);
            }

            /* renamed from: b */
            public final void mo99336b() {
                if (!(VideoRecordNewActivity.this.getFragmentManager().findFragmentById(R.id.cq4) == null || VideoRecordNewActivity.this.f107324j == null || !VideoRecordNewActivity.this.f107324j.mo100314f())) {
                    VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) new C42137ad(0));
                }
                VideoRecordNewActivity.this.findViewById(R.id.cq4).setVisibility(0);
                VideoRecordNewActivity.this.mo101843d(false);
            }
        });
    }

    /* renamed from: V */
    private void m131583V() {
        this.f107324j.mo100316h();
        this.f107324j.mo100317i();
        this.f107324j.mo100318j();
        this.f107324j.mo100312e();
    }

    /* renamed from: ah */
    private void m131603ah() {
        if (this.f107286a.mo96142d()) {
            C42880h.m136156a("initDuet() called");
            this.f107286a.f99707L = C41140a.m131335a(this.f107286a.f99702G, this.f107286a.f99703H);
        }
    }

    /* renamed from: ak */
    private void m131606ak() {
        ((CurUseStickerViewModel) C0069x.m159a((FragmentActivity) this).mo147a(CurUseStickerViewModel.class)).mo101274a().observe(this, new C0053p<Effect>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Effect effect) {
                if (effect == null) {
                    VideoRecordNewActivity.this.mo101843d(false);
                } else if (C40496bh.m129448b("FaceMakeupV2", effect)) {
                    VideoRecordNewActivity.this.mo101843d(true);
                } else {
                    VideoRecordNewActivity.this.mo101843d(false);
                }
            }
        });
    }

    /* renamed from: al */
    private static void m131607al() {
        byte b;
        if (C35563c.f93230L.mo93342a(Property.EnableSdkLog)) {
            b = 15;
        } else {
            b = 7;
        }
        C45252ac.m142758a(b);
    }

    /* renamed from: am */
    private void m131608am() {
        C35622l lVar = (C35622l) C25682d.m84426a(this, C35622l.class);
        if (lVar != null && lVar.mo60369d(true)) {
            lVar.mo60371e(false);
        }
    }

    /* renamed from: an */
    private Effect m131609an() {
        if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            return (Effect) getIntent().getParcelableExtra("first_sticker");
        }
        return null;
    }

    /* renamed from: ao */
    private void m131610ao() {
        RecordControlViewModel recordControlViewModel = (RecordControlViewModel) C36113b.m116288a(this).mo91871a(RecordControlViewModel.class);
        if (recordControlViewModel != null) {
            recordControlViewModel.mo106965j();
        }
    }

    /* renamed from: c */
    public final void mo101839c() {
        try {
            runOnUiThread(new C41299bz(this));
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public final void mo101855o() {
        if (this.f107295af) {
            this.f107295af = false;
            m131619c(this.f107286a.f99713R);
            m131605aj();
        }
    }

    public void onPause() {
        super.onPause();
        mo101851k();
        this.f107301al = false;
        C41514ab.m132244a().mo102175c();
    }

    public void onStop() {
        super.onStop();
        if (this.f107335u != null) {
            this.f107335u.setVisibility(8);
        }
        mo101859p();
    }

    public void setStatusBarColor() {
        if (VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, Integer.MIN_VALUE);
        }
    }

    /* renamed from: v */
    public final float mo101866v() {
        C29296g g = ((C39377i) this.f107326l.mo74909j()).mo74906g();
        C29230az azVar = this.f107280U;
        C40190e eVar = this.f107331q;
        eVar.getClass();
        return C29297h.m96116a(g, azVar, C41307cf.m131888a(eVar));
    }

    /* renamed from: D */
    private void m131566D() {
        this.f107334t.mo56223a((C45362d) new C20778k(new C47442a(this.f107286a.f99775k)), this.f107286a.f99775k.mo96319g().getAbsolutePath());
        if (this.f107286a.f99779o) {
            this.f107334t.mo56227a((C7562b<? super Integer, C7581n>) new C41287bn<Object,C7581n>(this));
        }
    }

    /* renamed from: O */
    private String m131576O() {
        if (this.f107340z == null || this.f107340z.isEmpty()) {
            return "";
        }
        Iterator it = this.f107340z.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* renamed from: X */
    private void m131585X() {
        this.f107327m = new CameraModule(this, new C40288a() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C7581n mo101882a() {
                VideoRecordNewActivity.this.finish();
                return null;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ C7581n mo101883b() {
                VideoRecordNewActivity.this.finish();
                return null;
            }

            /* renamed from: a */
            public final void mo100099a(int i) {
                if (VideoRecordNewActivity.this.f107335u == null || VideoRecordNewActivity.this.f107335u.getVisibility() != 8) {
                    if (C43072du.m136640b()) {
                        C43072du.m136639b(false);
                        C43072du.m136637b("camera_success");
                    }
                    VideoRecordNewActivity.this.f107275P = true;
                    if (VideoRecordNewActivity.this.f107274O != null) {
                        VideoRecordNewActivity.this.mo101848h();
                    }
                    VideoRecordNewActivity.this.f107334t.setOnFrameAvailableListener(new C45393e() {
                        /* renamed from: a */
                        public final boolean mo56383a() {
                            return true;
                        }

                        /* renamed from: a */
                        public final void mo56382a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
                            String str;
                            C41530am.m132280a("VideoRecordNewActivity => OnFrameAvailable");
                            StringBuilder sb = new StringBuilder(" => asve OnFrameAvailable cost time: ");
                            sb.append(System.currentTimeMillis() - C15454h.m45259a());
                            sb.append("  mode is ");
                            if (C15454h.m45261b()) {
                                str = "sandbox ";
                            } else {
                                str = "normal";
                            }
                            sb.append(str);
                            C41545b.m132307a().mo102189b("av_video_record_init");
                            C43063dm.m136615b();
                            C41545b.m132307a().mo102190c("av_video_record_init");
                            VideoRecordNewActivity.this.f107334t.setOnFrameAvailableListener(null);
                            if (VideoRecordNewActivity.this.f107277R) {
                                VideoRecordNewActivity.this.f107277R = false;
                                C41530am.m132280a("VideoRecordNewActivity => addFragment Open Camera Frame Optimize");
                                VideoRecordNewActivity.this.f107320f.post(new C41327cz(VideoRecordNewActivity.this));
                            }
                            VideoRecordNewActivity.this.mo101861r();
                        }
                    });
                }
            }

            /* renamed from: b */
            public final void mo100102b(int i) {
                VideoRecordNewActivity.this.f107327m.mo100075a(0.0f);
                if (C23536f.m77298a()) {
                    C23539i n = C35574k.m114859a().mo70099n();
                    C23532c cVar = new C23532c(VideoRecordNewActivity.this.f107290aa, true, true, false, true);
                    n.mo61325a(cVar);
                    return;
                }
                ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74899b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(VideoRecordNewActivity.this.f107321g.mo96542a(VideoRecordNewActivity.this.f107327m.mo100087f())));
                LiveData b = VideoRecordNewActivity.this.f107326l.mo74898b();
                if (b.getValue() != null && !((Boolean) b.getValue()).booleanValue()) {
                    ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74897a(true);
                }
            }

            /* renamed from: a */
            public final void mo100100a(int i, int i2) {
                if (!VideoRecordNewActivity.this.f107319e) {
                    StringBuilder sb = new StringBuilder("w = ");
                    sb.append(i);
                    sb.append("   h = ");
                    sb.append(i2);
                    C6893q.m21447a("zoom_info_log", new C6869c().mo16887a("camera_preview_size", sb.toString()).mo16888b());
                    VideoRecordNewActivity.this.f107317c = i;
                    VideoRecordNewActivity.this.f107318d = i2;
                    if (!C47450e.m148163a()) {
                        VideoRecordNewActivity.this.mo101853m();
                    }
                    VideoRecordNewActivity.this.f107319e = true;
                }
            }

            /* renamed from: a */
            public final void mo100101a(int i, int i2, String str) {
                StringBuilder sb = new StringBuilder("onCameraOpenFailed : errorCode,");
                sb.append(i2);
                sb.append("msg :");
                sb.append(str);
                sb.append(" permission : ");
                sb.append(VideoRecordPermissionActivity.m131763a((Context) VideoRecordNewActivity.this));
                C43072du.m136632a("camera_error", "3", sb.toString());
                if (VideoRecordNewActivity.this.f107270K) {
                    VideoRecordNewActivity.this.mo101849i();
                } else {
                    C41520af.m132256a(VideoRecordNewActivity.this, new C41325cx(this), new C41326cy(this));
                }
            }
        }, new C41294bu(this), this.f107334t);
        getLifecycle().mo55a(this.f107327m);
        this.f107320f.postDelayed(new C41295bv(this), 2000);
    }

    /* renamed from: aa */
    private void m131596aa() {
        AVMusicWaveBean ab = m131597ab();
        if (ab != null) {
            this.f107286a.f99732aJ = C39312e.m125622a(ab);
            return;
        }
        if (this.f107286a.f99769e != null) {
            C39312e.m125623a().mo97877a(this.f107286a.f99769e, (C39313a) new C41302ca(this));
        }
    }

    /* renamed from: ac */
    private void m131598ac() {
        int f = this.f107327m.mo100087f();
        if (f == 0) {
            C42586v a = C42586v.m135306a();
            a.f110739b = false;
            this.f107338x.mo103594a((Object) this, (C42155av) a);
            return;
        }
        if (f == 1) {
            C42586v b = C42586v.m135307b();
            b.f110739b = false;
            this.f107338x.mo103594a((Object) this, (C42155av) b);
        }
    }

    /* renamed from: ae */
    private void m131600ae() {
        this.f107334t.mo56219a((OnCherEffectParmaCallback) new C41305cd(this));
        if (this.f107286a.f99731aI != null) {
            this.f107334t.mo56229a(this.f107286a.f99731aI.getMatrix(), this.f107286a.f99731aI.getDuration(), this.f107286a.f99731aI.getSegUseCher());
        }
    }

    /* renamed from: af */
    private void m131601af() {
        if (this.f107330p == null) {
            this.f107330p = new C39626a();
            if (this.f107286a != null && (this.f107286a.mo96142d() || this.f107286a.mo96144e())) {
                this.f107330p.f102946b = false;
            }
            if (!C6319n.m19593a(this.f107286a.f99754ao)) {
                this.f107330p.mo98792a(this.f107286a.f99754ao, (int) this.f107286a.f99777m);
            }
        }
    }

    /* renamed from: ai */
    private void m131604ai() {
        if (this.f107286a.mo96144e()) {
            C42880h.m136156a("initReaction() called");
            int b = C35563c.f93230L.mo93343b(Property.DefaultMicrophoneState);
            if (b == 3 || b == 2) {
                this.f107286a.f99708M = true;
            }
            if (this.f107328n == null) {
                this.f107328n = new C40295a(this, this.f107334t);
            }
            this.f107328n.mo100107a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final /* synthetic */ void mo101807A() {
        Intent intent = getIntent();
        intent.putExtra("shoot_way", "restore_crash");
        intent.putExtra("restore", 2);
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        finish();
        startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final /* synthetic */ void mo101808B() {
        if (this.f107334t.getMode() == Mode.DUET || this.f107334t.getMode() == Mode.REACTION) {
            this.f107266G = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f107334t.getMode());
        sb.append(" video complete callback");
        C6921a.m21555a(sb.toString());
    }

    /* renamed from: f */
    public final void mo101846f() {
        this.f107334t.mo56288i();
        this.f107334t.mo56299p();
        this.f107334t.mo56237b(this.f107285Z);
        this.f107319e = false;
        mo101852l().mo96168c(false);
        mo101852l().mo96174f(false);
    }

    public Resources getResources() {
        if (!this.f107294ae) {
            C41524ag.m132264b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    /* renamed from: h */
    public final void mo101848h() {
        C41530am.m132280a("VideoRecordNewActivity => previewCamera");
        m131584W();
        this.f107334t.setDetectionMode(C35563c.f93231M.mo93305a(AVAB.Property.EnableEffectParallelFwk));
        this.f107334t.mo56236b(this.f107335u.getHolder().getSurface(), Build.DEVICE, C41293bt.f107546a);
        mo101852l().mo96177g(true);
        this.f107270K = true;
    }

    /* renamed from: i */
    public final void mo101849i() {
        Dialog a = new C10741a(this).mo25649a((int) R.string.vv).mo25657b((int) R.string.vu).mo25658b((int) R.string.w_, (OnClickListener) new C41296bw(this)).mo25656a().mo25637a();
        if (VERSION.SDK_INT >= 17) {
            a.setOnDismissListener(new C41297bx(this));
        }
    }

    /* renamed from: k */
    public final boolean mo101851k() {
        C42880h.m136156a("forceStopRecord() called");
        if (!mo101852l().mo96173e() || mo101852l().mo96167b()) {
            C42151ar arVar = new C42151ar();
            this.f107338x.mo103594a((Object) this, (C42155av) arVar);
            this.f107337w.mo103594a((Object) this, (C42155av) arVar);
        }
        return true;
    }

    public void onStart() {
        super.onStart();
        this.f107335u.setVisibility(0);
        C35563c.f93224F.mo70097l().mo74949b().mo74963a();
        if (this.f107337w != null) {
            this.f107337w.mo103594a((Object) this, (C42155av) new C42585u(this.f107327m.mo100095n()));
        }
    }

    /* renamed from: s */
    public final Point mo101863s() {
        Point point = new Point();
        if (!(this.f107335u == null || this.f107335u.getLayoutParams() == null || !(this.f107335u.getLayoutParams() instanceof LayoutParams))) {
            LayoutParams layoutParams = (LayoutParams) this.f107335u.getLayoutParams();
            point.x = layoutParams.width;
            point.y = layoutParams.height;
        }
        return point;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final /* synthetic */ void mo101870z() {
        int i;
        Context applicationContext = getApplicationContext();
        int i2 = this.f107303an;
        this.f107303an = i2 + 1;
        if (i2 < 2) {
            i = R.string.dgw;
        } else {
            i = R.string.dgx;
        }
        C10761a.m31399c(applicationContext, i).mo25750a();
        C42151ar a = new C42151ar().mo103586a(1);
        this.f107338x.mo103594a((Object) this, (C42155av) a);
        this.f107337w.mo103594a((Object) this, (C42155av) a);
    }

    /* renamed from: H */
    private void m131570H() {
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        if (!C6399b.m19944t()) {
            C45252ac.m142771b(C35563c.f93230L.mo93346e(Property.EffectSdkConfigSettings));
        }
        this.f107286a.f99706K = C35563c.f93231M.mo93305a(AVAB.Property.EnableSingleSegmentConcatUseCopy);
        this.f107334t.f56141b = this;
        C47445d dVar = new C47445d(this, this.f107286a, C41558k.m132342a((Context) this), null, C41239a.m131841a(this));
        dVar.f121813b = new C41210a(this);
        this.f107334t.mo56221a((C15432h) dVar);
        this.f107334t.mo56254g(C35563c.f93224F.mo70091f().mo93342a(Property.EnableUseEffect));
        this.f107334t.setDataSourceVideoCompleteListener(new C41288bo(this));
    }

    /* renamed from: I */
    private void m131571I() {
        m131570H();
        this.f107331q = C40190e.m128431a(this.f107334t.getEffectController());
        m131586Y();
        m131587Z();
        m131585X();
        m131580S();
        m131621e(this.f107286a.f99784t);
        this.f107269J = m131581T();
        this.f107327m.mo100074a();
        if (C40312g.m128765c()) {
            this.f107334t.getCameraController().mo55938a((C45402m) new C41312ck(this));
        }
    }

    /* renamed from: K */
    private void m131572K() {
        if (C39805en.m127445a()) {
            C39805en.m127444a((Activity) this);
            if (VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
            getWindow().getDecorView().setBackgroundColor(-16777216);
            this.f107302am = getIntent().getIntExtra("extra_av_navigation_bar_height", C39805en.m127451d(this));
            C39804em.m127431a(this.f107335u, this, this.f107286a.f99773i, this.f107286a.f99774j, this.f107302am);
            new C38576cg(this, this.f107302am).mo96555a(new C41314cm(this));
            return;
        }
        C39804em.m127434a((View) this.f107335u, this.f107286a.f99773i, this.f107286a.f99774j);
    }

    /* renamed from: L */
    private void m131573L() {
        boolean z;
        if (this.f107286a != null && this.f107267H != null && this.f107267H.f102274D != null && C39998a.m127887a(this.f107286a.f99764ay, C44643g.m141003L())) {
            boolean equals = "direct_shoot".equals(this.f107286a.f99788x);
            if ("prop_reuse".equals(this.f107286a.f99788x) || "single_song".equals(this.f107286a.f99788x) || "prop_page".equals(this.f107286a.f99788x) || "challenge".equals(this.f107286a.f99788x)) {
                z = true;
            } else {
                z = false;
            }
            if (equals) {
                m131574M();
            }
            if (z) {
                m131575N();
            }
        }
    }

    /* renamed from: S */
    private void m131580S() {
        C412023 r0;
        C40190e eVar = this.f107331q;
        C29203a aVar = this.f107315az;
        C29206d dVar = this.f107287aA;
        C29205c cVar = this.f107314ay;
        C29253bl blVar = new C29253bl(this);
        boolean z = this.f107281V;
        if (this.f107281V) {
            r0 = new C29204b() {
                /* renamed from: c */
                public final float mo74802c(C29296g gVar) {
                    C40190e eVar = VideoRecordNewActivity.this.f107331q;
                    eVar.getClass();
                    return C29297h.m96119b(gVar, C41324cw.m131898a(eVar));
                }

                /* renamed from: a */
                public final int mo74800a(C29296g gVar) {
                    C29230az azVar = VideoRecordNewActivity.this.f107280U;
                    C40190e eVar = VideoRecordNewActivity.this.f107331q;
                    eVar.getClass();
                    return azVar.mo74794a(gVar, C41322cu.m131894a(eVar));
                }

                /* renamed from: b */
                public final int mo74801b(C29296g gVar) {
                    float f = gVar.f77275j;
                    C40190e eVar = VideoRecordNewActivity.this.f107331q;
                    eVar.getClass();
                    return C29297h.m96117a(gVar, f, C41323cv.m131896a(eVar));
                }
            };
        } else {
            r0 = null;
        }
        C29254bm bmVar = new C29254bm(this, this, eVar, aVar, dVar, cVar, blVar, z, r0);
        this.f107326l = bmVar;
        this.f107326l.mo74886a();
        ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this).mo147a(ShortVideoContextViewModel.class)).mo96181j().observe(this, new C41289bp(this));
    }

    /* renamed from: W */
    private void m131584W() {
        if (!this.f107286a.mo96141c()) {
            this.f107334t.mo56208a((Context) this, this.f107322h.mo100104a());
            return;
        }
        this.f107334t.setMusicPath(this.f107286a.f99775k.mo96317e().getPath());
        this.f107334t.mo56226a(this.f107286a.f99775k.mo96317e().getPath(), this.f107286a.mo96151l(), this.f107286a.mo96150k());
        this.f107334t.mo56208a((Context) this, this.f107322h.mo100104a());
    }

    /* renamed from: Z */
    private void m131587Z() {
        C39312e.m125623a().mo97875a((Context) this);
        RecordMusicCutViewModel recordMusicCutViewModel = (RecordMusicCutViewModel) C36113b.m116288a(this).mo91871a(RecordMusicCutViewModel.class);
        if (this.f107309at == null) {
            this.f107309at = new C44446ab(getLifecycle());
        }
        this.f107309at.mo106890a(recordMusicCutViewModel, (C7326g<C44691a>) new C7326g<C44691a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C44691a aVar) {
                ((RecordViewModel) C36113b.m116288a(VideoRecordNewActivity.this).mo91871a(RecordViewModel.class)).mo106839d(false);
                if (aVar != null) {
                    VideoRecordNewActivity.this.f107334t.mo56226a(VideoRecordNewActivity.this.f107286a.f99769e, (long) aVar.f115060a, VideoRecordNewActivity.this.f107286a.mo96150k());
                    if (aVar.f115060a != VideoRecordNewActivity.this.f107286a.f99770f) {
                        VideoRecordNewActivity.this.f107337w.mo103594a((Object) this, (C42155av) new C42153at(VideoRecordNewActivity.this.f107286a.f99745af, true));
                        VideoRecordNewActivity.this.f107338x.mo103594a((Object) this, (C42155av) new C42153at(VideoRecordNewActivity.this.f107286a.f99745af, true));
                    }
                    VideoRecordNewActivity.this.f107286a.f99770f = aVar.f115060a;
                    C38505a.m123080a(VideoRecordNewActivity.this.f107286a.f99769e, C39360dw.m125725a().mo97931b(), aVar.f115060a);
                    if (VideoRecordNewActivity.this.f107337w != null) {
                        VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) new C42135ab(VideoRecordNewActivity.this.f107286a.f99767c));
                        VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) new C42137ad(4));
                    }
                }
            }
        });
        AVMusic b = C39360dw.m125725a().mo97931b();
        if (b != null && b.getDuration() > 0) {
            this.f107286a.f99771g = b.getDuration();
        }
    }

    /* renamed from: ab */
    private AVMusicWaveBean m131597ab() {
        if (getIntent() != null) {
            AVMusicWaveBean a = C35563c.f93246i.mo103844a(getIntent().getSerializableExtra("music_wave_data"));
            if (a != null && C39312e.m125626a(a.getMusicWavePointArray())) {
                return a;
            }
            AVMusic b = C39360dw.m125725a().mo97931b();
            if (b != null && C39312e.m125626a(b.getMusicWaveData())) {
                AVMusicWaveBean b2 = C39312e.m125627b(b);
                if (b2 != null && C39312e.m125626a(b2.getMusicWavePointArray())) {
                    return b2;
                }
            }
        }
        return null;
    }

    /* renamed from: ad */
    private void m131599ad() {
        C42880h.m136156a("initFaceBeauty() called");
        this.f107334t.mo56209a();
        this.f107334t.mo56239b((C7562b<? super Integer, C7581n>) new C41303cb<Object,C7581n>(this));
        m131600ae();
        m131603ah();
        m131604ai();
        if (!this.f107286a.mo96152m().isEmpty()) {
            File g = this.f107286a.f99775k.mo96319g();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f107286a.f99776l.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                arrayList.add(new ASMediaSegment((long) timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()));
            }
            this.f107334t.getMediaController().mo55902a(arrayList, g.getPath(), this.f107286a.mo96156q(), this.f107286a.f99770f, new C41304cc(this, arrayList, g));
        }
    }

    /* renamed from: ag */
    private void m131602ag() {
        C42880h.m136156a("resetAllPlayStatus() called");
        this.f107286a.f99775k.mo96318f();
        this.f107286a.f99775k.mo96320h();
        C38505a.m123073a();
        for (int i = 0; i < this.f107286a.f99776l.size(); i++) {
            this.f107334t.mo56293m();
        }
        this.f107286a.f99776l.clear();
        this.f107286a.f99777m = 0;
        RecordViewModel recordViewModel = (RecordViewModel) C36113b.m116288a(this).mo91871a(RecordViewModel.class);
        Boolean musicCut = ((RecordViewState) recordViewModel.mo106825a(this)).getMusicCut();
        if (musicCut != null && musicCut.booleanValue()) {
            recordViewModel.mo106839d(false);
        }
        mo101815a(-1);
        this.f107266G = false;
    }

    /* renamed from: aj */
    private void m131605aj() {
        if (this.f107340z != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append((String) this.f107340z.get(0));
            int size = this.f107340z.size();
            for (int i = 1; i < size; i++) {
                sb.append(",");
                sb.append((String) this.f107340z.get(i));
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("scene", this.f107297ah);
            if (!TextUtils.isEmpty(this.f107265F)) {
                hashMap.put("grade_key", this.f107265F);
            }
            this.f107324j.mo100297a(this.f107340z, (Map<String, String>) hashMap, (C43758h) new C43758h() {
                /* renamed from: a */
                public final void mo101875a(C43726c cVar) {
                }

                /* renamed from: a */
                public final void mo101876a(final EffectListResponse effectListResponse) {
                    if (!VideoRecordNewActivity.this.f107278S) {
                        VideoRecordNewActivity.this.f107324j.mo100295a((String) VideoRecordNewActivity.this.f107340z.get(0), hashMap, true, new C43759i() {
                            /* renamed from: a */
                            public final void mo95925a(C43726c cVar) {
                            }

                            /* renamed from: a */
                            public final void mo95926a(List<Effect> list) {
                                if (VideoRecordNewActivity.this.f107277R) {
                                    VideoRecordNewActivity.this.f107320f.postDelayed(new C41330db(this, effectListResponse, sb), 2000);
                                } else {
                                    VideoRecordNewActivity.this.mo101824a(effectListResponse, sb, Boolean.valueOf(false));
                                }
                            }

                            /* access modifiers changed from: 0000 */
                            /* renamed from: a */
                            public final /* synthetic */ void mo101877a(EffectListResponse effectListResponse, StringBuilder sb) {
                                VideoRecordNewActivity.this.mo101824a(effectListResponse, sb, Boolean.valueOf(false));
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo101845e() {
        if (!isFinishing()) {
            C41530am.m132280a("addFragment PlanC");
            if (this.f107299aj != null) {
                this.f107299aj.mo30878b();
                this.f107299aj = null;
                ((ViewGroup) findViewById(R.id.cq4)).removeAllViews();
            }
            if (this.f107263D != null) {
                this.f107263D.mo99345d();
            }
            this.f107267H = m131588a(getIntent());
            this.f107267H.f102278H = new C41318cq(this);
            this.f107299aj = C12626i.m36626a((Activity) this, C39336dd.class).mo30989a(false).mo30988a((C12640l) new C41319cr(this)).mo30991b(false).mo30992c(false).mo30987a((int) R.id.cq4).mo30990a();
        }
    }

    public void finish() {
        String stringExtra = getIntent().getStringExtra("backurl");
        if (m131617b(getIntent())) {
            startActivity(new Intent(this, m131618c(getIntent())));
        }
        if (getIntent().getBooleanExtra("extra_enter_record_form_super_entrance", false)) {
            SuperEntranceActivity.m148212a(this, getIntent());
        }
        super.finish();
        if (this.f107337w != null) {
            mo101859p();
        }
        if (!TextUtils.isEmpty(stringExtra) && !m131617b(getIntent())) {
            m131616b(stringExtra);
        }
        C23256c.m76348b(this, 3);
    }

    /* renamed from: n */
    public final JSONObject mo101854n() {
        String str;
        C6869c a = C6869c.m21381a().mo16887a("creation_id", this.f107286a.f99787w).mo16887a("shoot_way", this.f107286a.f99788x).mo16887a("route", "1");
        String str2 = "is_photo";
        if (mo101852l().mo96169c()) {
            str = "1";
        } else {
            str = "0";
        }
        return a.mo16887a(str2, str).mo16887a("position", "shoot_page").mo16888b();
    }

    public void onDestroy() {
        super.onDestroy();
        C41363h.m131934a();
        m131608am();
        C39998a.m127889c().mo99453b();
        if (this.f107263D != null) {
            this.f107263D.mo99345d();
        }
        this.f107334t.setDataSourceVideoCompleteListener(null);
        C35563c.f93246i.mo103867e().mo103930q();
        this.f107267H = null;
        C7705c.m23799a().mo20393c((Object) this);
        C41514ab.m132244a().mo102174b();
        C43072du.m136646e();
        C35574k.m114859a().mo70099n().mo61325a(new C23532c());
        C39360dw.m125725a().mo97933c();
        C41253ah.m131871a(false);
    }

    /* renamed from: R */
    private C42156aw m131579R() {
        return new C42157ax().mo103596a((C42161ba) new C39887fh(this, this.f107334t)).mo103596a((C42161ba) new C39892fl(this, this.f107334t)).mo103596a((C42161ba) new C39993h(this)).mo103596a((C42161ba) new C39898fp(this, this.f107334t)).mo103596a((C42161ba) new C38499aw(this, this.f107334t)).mo103596a((C42161ba) new C38530bh(this)).mo103596a((C42161ba) new C38536bm(this)).mo103596a((C42161ba) new C41712z(this, this.f107334t)).mo103596a((C42161ba) new C40184n(this, this.f107334t)).mo103596a((C42161ba) new C38425ac(this)).mo103596a((C42161ba) new C39885fg(this, this.f107334t)).mo103596a((C42161ba) new C39996i(this)).mo103596a((C42161ba) new C38423ab(this)).mo103596a((C42161ba) new C39907fv(this)).mo103596a((C42161ba) new C39808ep(this)).mo103596a((C42161ba) new C39356dt(this, this.f107334t)).mo103598a(C7163a.m22363a()).mo103597a(new PrintWriter(new C0892d("VideoRecordNewActivity"))).mo103595a();
    }

    /* renamed from: U */
    private void m131582U() {
        this.f107325k = new C40531d(this);
        this.f107323i = new C40499bk(this, this.f107334t);
        StickerModule stickerModule = new StickerModule(this, this, this, "default", this.f107334t.getMediaController(), this.f107334t.getEffectController(), this.f107334t.getCameraController(), new C41243ad(this), new C40997c() {
            /* renamed from: f */
            public final void mo101323f(FaceStickerBean faceStickerBean) {
                VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42588x.m135309a((Object) new C40500bl(VideoRecordNewActivity.this, VideoRecordNewActivity.this.f107334t.getEffectController())));
                VideoRecordNewActivity.this.f107327m.mo100083b(false);
            }

            /* renamed from: g */
            public final void mo101324g(FaceStickerBean faceStickerBean) {
                if (VideoRecordNewActivity.this.f107327m.mo100087f() != 0) {
                    VideoRecordNewActivity.this.f107338x.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42586v.m135307b());
                }
                VideoRecordNewActivity.this.f107327m.mo100083b(true);
                VideoRecordNewActivity.this.f107327m.mo100077a(100);
            }

            /* renamed from: e */
            public final void mo101322e(FaceStickerBean faceStickerBean) {
                if (C6399b.m19946v()) {
                    VideoRecordNewActivity.this.f107339y = true;
                    VideoRecordNewActivity.this.mo101840c(VideoRecordNewActivity.this.f107286a.f99784t);
                }
                VideoRecordNewActivity.this.f107327m.mo100083b(false);
                if (!C23536f.m77298a()) {
                    VideoRecordNewActivity.this.f107269J.mo96497a(!faceStickerBean.getTags().contains("disable_reshape"), true);
                    VideoRecordNewActivity.this.f107271L = faceStickerBean.getTags().contains("disable_smooth");
                    VideoRecordNewActivity.this.f107269J.mo96503b(!VideoRecordNewActivity.this.f107271L, true);
                }
                faceStickerBean.getTags().contains("disable_beautify_filter");
                VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42588x.m135309a((Object) new C39945a()));
                VideoRecordNewActivity.this.f107263D.mo99341a(faceStickerBean);
            }

            /* renamed from: b */
            public final void mo101319b(FaceStickerBean faceStickerBean) {
                if (C6399b.m19946v()) {
                    VideoRecordNewActivity.this.f107339y = true;
                    VideoRecordNewActivity.this.mo101840c(VideoRecordNewActivity.this.f107286a.f99784t);
                }
                if (VideoRecordNewActivity.this.f107327m.mo100087f() != 0) {
                    VideoRecordNewActivity.this.f107338x.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42586v.m135307b());
                }
                VideoRecordNewActivity.this.f107327m.mo100083b(false);
                if (!C23536f.m77298a()) {
                    VideoRecordNewActivity.this.f107269J.mo96497a(false, true);
                    VideoRecordNewActivity.this.f107269J.mo96503b(false, true);
                }
                VideoRecordNewActivity.this.f107271L = true;
                if (VideoRecordNewActivity.this.f107286a.f99784t && !C23536f.m77298a()) {
                    VideoRecordNewActivity.this.mo101840c(false);
                    VideoRecordNewActivity.this.f107286a.f99784t = false;
                }
                Point s = VideoRecordNewActivity.this.mo101863s();
                VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42588x.m135309a((Object) new C38465a(faceStickerBean, VideoRecordNewActivity.this.f107334t.getEffectController()).mo96379a(s.x, s.y)));
            }

            /* renamed from: c */
            public final void mo101320c(FaceStickerBean faceStickerBean) {
                C42588x xVar;
                if (C6399b.m19946v()) {
                    VideoRecordNewActivity.this.f107339y = true;
                    VideoRecordNewActivity.this.mo101840c(VideoRecordNewActivity.this.f107286a.f99784t);
                }
                if (!VideoRecordNewActivity.this.f107286a.f99784t && !C23536f.m77298a()) {
                    VideoRecordNewActivity.this.mo101840c(true);
                    VideoRecordNewActivity.this.f107286a.f99784t = true;
                }
                VideoRecordNewActivity.this.f107327m.mo100083b(false);
                if (!C23536f.m77298a()) {
                    VideoRecordNewActivity.this.f107269J.mo96497a(!faceStickerBean.getTags().contains("disable_reshape"), true);
                    VideoRecordNewActivity.this.f107269J.mo96503b(!faceStickerBean.getTags().contains("disable_smooth"), true);
                }
                VideoRecordNewActivity.this.f107271L = false;
                if (VideoRecordNewActivity.this.f107337w != null) {
                    if (VideoRecordNewActivity.this.f107328n == null || C40496bh.m129444b(faceStickerBean)) {
                        Point s = VideoRecordNewActivity.this.mo101863s();
                        if (faceStickerBean.getTypes().contains("TouchGes")) {
                            xVar = C42588x.m135309a((Object) new C38465a(faceStickerBean, VideoRecordNewActivity.this.f107334t.getEffectController()).mo96379a(s.x, s.y));
                        } else {
                            xVar = C42588x.m135309a((Object) new C39945a());
                        }
                        VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) xVar);
                    } else {
                        VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42588x.m135309a((Object) VideoRecordNewActivity.this.f107328n.f104667b));
                    }
                }
            }

            /* renamed from: d */
            public final void mo101321d(FaceStickerBean faceStickerBean) {
                if (faceStickerBean.getTags() != null) {
                    if (C6399b.m19946v() && !C23536f.m77298a()) {
                        VideoRecordNewActivity.this.f107339y = false;
                        VideoRecordNewActivity.this.mo101840c(false);
                    }
                    VideoRecordNewActivity.this.f107327m.mo100083b(false);
                    if (!C23536f.m77298a()) {
                        VideoRecordNewActivity.this.f107269J.mo96497a(!faceStickerBean.getTags().contains("disable_reshape"), true);
                        VideoRecordNewActivity.this.f107271L = faceStickerBean.getTags().contains("disable_smooth");
                        VideoRecordNewActivity.this.f107269J.mo96503b(!VideoRecordNewActivity.this.f107271L, true);
                    }
                    faceStickerBean.getTags().contains("disable_beautify_filter");
                    if (VideoRecordNewActivity.this.f107328n != null) {
                        VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42588x.m135309a((Object) VideoRecordNewActivity.this.f107328n.f104667b));
                        return;
                    }
                    VideoRecordNewActivity.this.f107337w.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42588x.m135309a((Object) new C39945a()));
                }
            }

            /* renamed from: a */
            public final void mo101318a(FaceStickerBean faceStickerBean) {
                VideoRecordNewActivity.this.f107325k.mo100601a(faceStickerBean);
                if (C40496bh.m129441a("camera_front", faceStickerBean)) {
                    if (VideoRecordNewActivity.this.f107327m.mo100087f() != 1) {
                        VideoRecordNewActivity.this.f107338x.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42586v.m135306a());
                    }
                } else if (C40496bh.m129441a("camera_back", faceStickerBean) && VideoRecordNewActivity.this.f107327m.mo100087f() != 0) {
                    VideoRecordNewActivity.this.f107338x.mo103594a((Object) VideoRecordNewActivity.this, (C42155av) C42586v.m135307b());
                }
                if (faceStickerBean == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("AR")) {
                    ((RecordToolbarViewModel) C36113b.m116288a(VideoRecordNewActivity.this).mo91871a(RecordToolbarViewModel.class)).mo107183a(true);
                } else {
                    ((RecordToolbarViewModel) C36113b.m116288a(VideoRecordNewActivity.this).mo91871a(RecordToolbarViewModel.class)).mo107183a(false);
                }
                if (VideoRecordNewActivity.this.f107267H != null) {
                    if (faceStickerBean != FaceStickerBean.NONE && faceStickerBean.getTypes().contains("AR")) {
                        if (VideoRecordNewActivity.this.f107334t != null) {
                            VideoRecordNewActivity.this.f107334t.mo56224a(C38479d.m123016a(VideoRecordNewActivity.this));
                        }
                        if (VideoRecordNewActivity.this.f107323i != null) {
                            VideoRecordNewActivity.this.f107323i.mo100549a(0, VideoRecordNewActivity.this.f107267H.mo97904b(), VideoRecordNewActivity.this, (ViewGroup) VideoRecordNewActivity.this.f107267H.f33523b);
                        }
                    } else if (faceStickerBean != FaceStickerBean.NONE && C40496bh.m129444b(faceStickerBean)) {
                        if (VideoRecordNewActivity.this.f107334t != null) {
                            VideoRecordNewActivity.this.f107334t.mo56224a(C38479d.m123016a(VideoRecordNewActivity.this));
                        }
                        if (VideoRecordNewActivity.this.f107323i != null) {
                            VideoRecordNewActivity.this.f107323i.mo100549a(1, VideoRecordNewActivity.this.f107267H.mo97904b(), VideoRecordNewActivity.this, (ViewGroup) VideoRecordNewActivity.this.f107267H.f33523b);
                        }
                    } else if (VideoRecordNewActivity.this.f107323i != null) {
                        VideoRecordNewActivity.this.f107323i.mo100548a();
                    }
                    if (faceStickerBean == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("StabilizationOff")) {
                        if (!VideoRecordNewActivity.this.f107327m.f104644f.f55927a) {
                            VideoRecordNewActivity.this.f107327m.f104644f.mo55995b(VideoRecordNewActivity.this.f107267H.mo97961N());
                            VideoRecordNewActivity.this.f107267H.mo97896J().mo103594a((Object) VideoRecordNewActivity.this.f107267H, (C42155av) new C42585u(0));
                            VideoRecordNewActivity.this.f107267H.mo97963P().mo103594a((Object) VideoRecordNewActivity.this.f107267H, (C42155av) new C42585u(0));
                        }
                    } else if (VideoRecordNewActivity.this.f107327m.f104644f.f55927a) {
                        VideoRecordNewActivity.this.f107327m.f104644f.mo55991a(VideoRecordNewActivity.this.f107267H.mo97961N());
                        VideoRecordNewActivity.this.f107267H.mo97896J().mo103594a((Object) VideoRecordNewActivity.this.f107267H, (C42155av) new C42585u(0));
                        VideoRecordNewActivity.this.f107267H.mo97963P().mo103594a((Object) VideoRecordNewActivity.this.f107267H, (C42155av) new C42585u(0));
                    }
                    VideoRecordNewActivity.this.mo101865u().mo101947a(faceStickerBean, VideoRecordNewActivity.this.f107324j.mo100314f());
                }
            }
        }, new C41290bq(this), this.f107311av, this.f107312aw);
        this.f107324j = stickerModule;
        this.f107324j.mo100280a((C40998d) new C40998d() {
            /* renamed from: a */
            public final void mo100600a() {
                VideoRecordNewActivity.this.mo101837b(false);
            }

            /* renamed from: b */
            public final void mo100602b() {
                VideoRecordNewActivity.this.mo101829a(false);
            }
        });
        this.f107324j.mo100278a((C40995a) new C40995a() {
            /* renamed from: a */
            public final void mo101312a() {
                VideoRecordNewActivity.this.f107323i.mo100551b();
            }

            /* renamed from: b */
            public final void mo101313b() {
                VideoRecordNewActivity.this.f107323i.mo100552c();
                VideoRecordNewActivity.this.mo101855o();
            }
        });
        this.f107324j.mo100274a(this.f107263D);
        this.f107324j.mo100287a(this.f107264E);
        this.f107324j.mo100269a((View.OnClickListener) new C41291br(this));
        this.f107324j.mo100271a(this.f107284Y);
        List f = getSupportFragmentManager().mo2658f();
        if (C6311g.m19574b(f)) {
            List<Fragment> a = C41578z.m132409a(f, C41292bs.f107545a);
            if (C6311g.m19574b(a)) {
                C0633q a2 = getSupportFragmentManager().mo2645a();
                for (Fragment a3 : a) {
                    a2.mo2587a(a3);
                }
                a2.mo2606d();
            }
        }
    }

    /* renamed from: j */
    public final void mo101850j() {
        C42880h.m136156a("clearEdit() called");
        this.f107286a.f99775k.mo96320h();
        C38505a.m123073a();
        for (int i = 0; i < this.f107286a.mo96152m().size(); i++) {
            this.f107334t.mo56293m();
        }
        C7276d.m22810b(new File(this.f107286a.f99775k.mo96319g().getPath()));
        C40414d.m129229c(this.f107286a.mo96152m(), this.f107286a.f99782r);
        this.f107286a.mo96152m().clear();
        this.f107286a.mo96138a(0);
        if (!(this.f107264E == null || this.f107264E.mo103798e() == null || this.f107286a.f99766b == 1)) {
            C7276d.m22822e(this.f107264E.mo103798e().extractFramesDir);
            C7276d.m22816c(this.f107264E.mo103798e().extractFramesDir);
            this.f107264E.mo103790a();
        }
        this.f107266G = false;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", true);
        this.f107294ae = true;
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C41524ag.m132262a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
            return;
        }
        C41530am.m132280a("VideoRecordNewActivity => onResume start");
        super.onResume();
        this.f107301al = true;
        if (this.f107300ak) {
            C35563c.f93226H.mo90375a(this, C35563c.f93226H.mo90373a(), this.f107272M);
            this.f107300ak = false;
        }
        C6907h.m21524a("av_memory_log", (Map) C22984d.m75611a().mo59973a("creation_id", this.f107286a.f99787w).mo59973a("enter_from", this.f107286a.f99789y).mo59971a("dalvikPss", C41514ab.m132244a().f107964b).mo59971a("nativePss", C41514ab.m132244a().f107965c).mo59971a("otherPss", C41514ab.m132244a().f107967e).mo59971a("totalPss", C41514ab.m132244a().f107966d).f60753a);
        C41530am.m132280a("VideoRecordNewActivity => onResume end");
        C41514ab.m132244a().mo102172a(this, this.f107332r);
        if (this.f107286a != null) {
            this.f107334t.mo56289i(this.f107286a.mo96141c());
        }
        C41524ag.m132262a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
    }

    /* renamed from: r */
    public final void mo101861r() {
        if (!this.f107306aq) {
            this.f107306aq = true;
            C29296g a = C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f107321g.mo96542a(this.f107327m.mo100087f()));
            String str = "";
            String str2 = "";
            Effect an = m131609an();
            if (an != null) {
                str = an.getEffectId();
                str2 = an.getName();
            }
            long longExtra = getIntent().getLongExtra("extra_start_record_time", 0);
            long currentTimeMillis = System.currentTimeMillis() - longExtra;
            int intExtra = getIntent().getIntExtra("sdk_load_ve_so_status", -1);
            long longExtra2 = getIntent().getLongExtra("preload_ve_so_cost_time", -1);
            int intExtra2 = getIntent().getIntExtra("preload_ve_so_task_status", -1);
            boolean b = C47450e.m148164b();
            C6907h.m21524a("tool_performance_record_first_frame", (Map) C22984d.m75611a().mo59970a("sdk_load_ve_so_status", intExtra).mo59970a("preload_ve_so_task_status", intExtra2).mo59971a("preload_ve_so_cost_time", longExtra2).mo59971a("first_frame_duration", currentTimeMillis).mo59973a("shoot_way", this.f107286a.f99788x).mo59973a("enter_from", this.f107286a.f99789y).mo59973a("creation_id", this.f107286a.f99787w).mo59972a("cold_start", (Object) Boolean.valueOf(b)).mo59972a("is_sandbox", (Object) Boolean.valueOf(C41239a.m131841a(this))).mo59973a("camera_type", C41558k.m132345b(this.f107334t.getCurrentCameraType())).f60753a);
            C22984d a2 = C22984d.m75611a().mo59973a("creation_id", this.f107286a.f99787w).mo59973a("shoot_way", this.f107286a.f99788x).mo59970a("draft_id", this.f107286a.f99790z).mo59973a("filter_list", a.f77268c).mo59970a("filter_id_list", a.f77266a).mo59973a("enter_from", this.f107286a.f99789y).mo59973a("prop_id", m131576O()).mo59973a("mv_id", str).mo59973a("mv_name", str2).mo59972a("cold_start", (Object) Boolean.valueOf(b)).mo59971a("download_res_time", getIntent().getLongExtra("extra_start_record_download_res_time", 0)).mo59973a("camera_type", C41558k.m132345b(this.f107334t.getCurrentCameraType()));
            if (longExtra > 0 && currentTimeMillis > 0) {
                a2.mo59971a("duration", currentTimeMillis);
            }
            C6907h.m21524a("enter_video_shoot_page", (Map) a2.f60753a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m131590a(configuration);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C39329g gVar) {
        this.f107286a.f99757ar = gVar.f102157a;
    }

    /* renamed from: b */
    private static boolean m131617b(Intent intent) {
        if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static Class m131618c(Intent intent) {
        return (Class) intent.getSerializableExtra("micro_app_class");
    }

    /* renamed from: f */
    private void m131622f(boolean z) {
        if (this.f107267H != null) {
            this.f107267H.mo97903a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo101811a(Integer num) {
        m131612b(num.intValue());
        return C7581n.f20898a;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m131610ao();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("save_state_short_video_context", this.f107286a);
    }

    /* renamed from: a */
    private void m131590a(Configuration configuration) {
        if (this.f107305ap != configuration.screenWidthDp) {
            this.f107305ap = configuration.screenWidthDp;
            C39804em.m127430a((View) this.f107335u, (Context) this, this.f107286a.f99773i, this.f107286a.f99774j);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ C7581n m131611b(Integer num) {
        if (num.intValue() != 0) {
            StringBuilder sb = new StringBuilder("startPreviewAsync ret = ");
            sb.append(num);
            C41530am.m132283b(sb.toString());
        }
        return C7581n.f20898a;
    }

    /* renamed from: d */
    public final void mo101843d(boolean z) {
        if (!C23536f.m77298a()) {
            this.f107269J.mo96502b(z);
        }
    }

    /* renamed from: a */
    private C39382ed m131588a(Intent intent) {
        if (intent == null) {
            return new C39336dd(this.f107286a, getIntent(), this.f107334t);
        }
        C39336dd ddVar = new C39336dd(this.f107286a, intent, this.f107334t);
        ddVar.f102277G = this.f107327m.mo100081b();
        if (getIntent() != null) {
            Effect an = m131609an();
            if (an != null) {
                ddVar.f102276F = an;
            }
        }
        return ddVar;
    }

    /* renamed from: b */
    private void m131614b(ASCameraView aSCameraView) {
        this.f107298ai = new C40501bm(this, aSCameraView.getMediaController());
        this.f107298ai.mo100554b();
    }

    /* renamed from: c */
    private void m131619c(final String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            final HashMap hashMap = new HashMap();
            hashMap.put("scene", this.f107297ah);
            if (!TextUtils.isEmpty(this.f107265F)) {
                hashMap.put("grade_key", this.f107265F);
            }
            this.f107324j.mo100297a((List<String>) arrayList, (Map<String, String>) hashMap, (C43758h) new C43758h() {
                /* renamed from: a */
                public final void mo101875a(C43726c cVar) {
                    int i;
                    switch (cVar.f113220a) {
                        case AdError.CACHE_ERROR_CODE /*2002*/:
                        case AdError.INTERNAL_ERROR_2004 /*2004*/:
                            i = R.string.azh;
                            break;
                        case AdError.INTERNAL_ERROR_2003 /*2003*/:
                            i = R.string.aow;
                            break;
                        case AdError.INTERNAL_ERROR_2006 /*2006*/:
                            i = R.string.fjt;
                            break;
                        default:
                            i = R.string.b2s;
                            break;
                    }
                    C10761a.m31399c(VideoRecordNewActivity.this.getApplicationContext(), i).mo25750a();
                }

                /* renamed from: a */
                public final void mo101876a(EffectListResponse effectListResponse) {
                    boolean z;
                    VideoRecordNewActivity.this.f107273N = effectListResponse.url_prefix;
                    final List<Effect> list = effectListResponse.data;
                    if (!C6311g.m19573a(list) && !VideoRecordNewActivity.this.f107278S) {
                        if (VideoRecordNewActivity.this.f107286a.f99714S && ((!C40496bh.m129455d((Effect) list.get(0)) || !VideoRecordNewActivity.this.f107286a.mo96144e()) && (!C40496bh.m129457e((Effect) list.get(0)) || (!VideoRecordNewActivity.this.f107286a.mo96144e() && !VideoRecordNewActivity.this.f107286a.mo96142d())))) {
                            C40994w wVar = VideoRecordNewActivity.this.f107324j;
                            if (VideoRecordNewActivity.this.f107260A != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            wVar.mo100298a(list, z);
                        }
                        Effect effect = (Effect) list.get(0);
                        if (C40496bh.m129440a((Effect) list.get(0))) {
                            VideoRecordNewActivity.this.f107324j.mo100294a((String) effect.getChildren().get(0), hashMap, (C43760j) C27491l.m90122a((C43760j) new C43760j() {
                                /* renamed from: a */
                                public final void mo9281a(Effect effect, C43726c cVar) {
                                }

                                /* renamed from: b */
                                public final void mo9282b(Effect effect) {
                                }

                                /* renamed from: a */
                                public final void mo9280a(Effect effect) {
                                    VideoRecordNewActivity.this.f107324j.mo100288a((Effect) list.get(0));
                                    VideoRecordNewActivity.this.f107324j.mo100282a(C40376ag.m129117a(effect));
                                    if (effect != null) {
                                        VideoRecordNewActivity.this.f107282W = effect.getEffectId();
                                    }
                                    if (VideoRecordNewActivity.this.f107267H != null) {
                                        VideoRecordNewActivity.this.mo101865u().mo101947a(C40376ag.m129117a(effect), VideoRecordNewActivity.this.f107324j.mo100314f());
                                    }
                                }
                            }));
                        } else {
                            VideoRecordNewActivity.this.f107324j.mo100294a(str, hashMap, (C43760j) C27491l.m90122a((C43760j) new C43760j() {
                                /* renamed from: b */
                                public final void mo9282b(Effect effect) {
                                }

                                /* renamed from: a */
                                public final void mo9280a(Effect effect) {
                                    VideoRecordNewActivity.this.f107324j.mo100288a(effect);
                                    if (effect != null) {
                                        VideoRecordNewActivity.this.f107282W = effect.getEffectId();
                                    }
                                }

                                /* renamed from: a */
                                public final void mo9281a(Effect effect, C43726c cVar) {
                                    C10761a.m31399c(VideoRecordNewActivity.this.getApplicationContext(), (int) R.string.e1h).mo25750a();
                                    VideoRecordNewActivity.this.f107324j.mo100320l();
                                }
                            }));
                        }
                        VideoRecordNewActivity.this.mo101823a(effect);
                    }
                }
            });
        }
    }

    /* renamed from: e */
    private void m131621e(boolean z) {
        C23536f.m77301d();
        if (C23536f.m77299b()) {
            C35574k.m114859a().mo70099n().mo61323a();
        }
        if (!C23536f.m77298a()) {
            C40808p.m130417a((FragmentActivity) this);
        }
        C38517a aVar = new C38517a(this, this.f107331q, z, this.f107326l, this.f107321g, this.f107327m, this.f107290aa);
        this.f107268I = aVar;
        this.f107268I.mo96488a();
    }

    @C7709l(mo20401b = true)
    public void receiveToast(C40969m mVar) {
        if (TextUtils.equals(mVar.f106497a, UnLockSticker.STICKER_UNLOCKED)) {
            this.f107300ak = true;
            this.f107272M = mVar.f106498b;
            if (this.f107301al && !mVar.f106500d) {
                C35563c.f93226H.mo90375a(this, C35563c.f93226H.mo90373a(), mVar.f106498b);
                this.f107300ak = false;
            }
            C7705c.m23799a().mo20397g(mVar);
        }
    }

    /* renamed from: a */
    private void m131593a(ASCameraView aSCameraView) {
        this.f107264E = new C42326j(aSCameraView.getMediaController());
        if (this.f107286a != null) {
            this.f107264E.mo103791a(this.f107286a.f99748ai);
        }
        this.f107264E.mo103797d();
    }

    /* renamed from: b */
    private void m131612b(int i) {
        C6893q.m21447a("record", C6869c.m21381a().mo16887a("error", String.valueOf(i)).mo16888b());
        StringBuilder sb = new StringBuilder("running error , ve result = ");
        sb.append(i);
        C43072du.m136632a("record_error", "2", sb.toString());
        if (C35563c.f93230L.mo93342a(Property.EnableAutoRetryRecord)) {
            this.f107320f.post(new C41315cn(this));
        }
    }

    /* renamed from: d */
    private void m131620d(String str) {
        if (!TextUtils.isEmpty(getIntent().getStringExtra("event_shoot_event_track"))) {
            C6907h.m21524a("auto_prop_show", (Map) C22984d.m75611a().mo59973a("prop_id", str).mo59973a("creation_id", this.f107286a.f99787w).mo59973a("shoot_way", "direct_shoot").f60753a);
        } else {
            C6907h.m21524a("reuse_prop_release", (Map) C22984d.m75611a().mo59973a("prop_id", str).f60753a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ C7581n mo101838c(Integer num) {
        this.f107302am = num.intValue();
        if (this.f107267H == null || (!mo101847g() && (this.f107267H instanceof C39336dd) && ((C39336dd) this.f107267H).mo97911e())) {
            return null;
        }
        C39804em.m127431a(this.f107335u, this, this.f107286a.f99773i, this.f107286a.f99774j, num.intValue());
        if (mo101847g()) {
            this.f107267H.updateLiveBackgroundView();
        }
        this.f107267H.mo97906c();
        return null;
    }

    public void onEventLastUsedFilterByCurrentFilter(C29296g gVar) {
        if (this.f107310au != null) {
            C29296g gVar2 = this.f107310au;
            C29230az azVar = this.f107280U;
            C40190e eVar = this.f107331q;
            eVar.getClass();
            C6907h.m21524a("adjust_filter_complete", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").mo59973a("creation_id", this.f107286a.f99787w).mo59973a("shoot_way", this.f107286a.f99788x).mo59970a("draft_id", this.f107286a.f99790z).mo59970a("filter_id", this.f107310au.f77266a).mo59973a("filter_name", this.f107310au.f77267b).mo59972a("value", (Object) Float.valueOf(C29297h.m96116a(gVar2, azVar, C41308cg.m131890a(eVar)))).f60753a);
        }
        this.f107310au = gVar;
    }

    /* renamed from: a */
    private void m131591a(Bundle bundle) {
        if (bundle == null && this.f107286a.f99766b != 1 && "direct_shoot".equals(this.f107286a.f99788x)) {
            C6907h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("direct_shoot").setJsonObject(new C6909j().mo16966a("record_mode", "direct").mo16966a("group_id", CurPlayVideoRecord.INSTANCE.getVideoId()).mo16967a()));
        }
        if ("push".equals(this.f107286a.f99788x)) {
            C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", this.f107286a.f99787w).mo59973a("shoot_way", this.f107286a.f99788x).mo59973a("enter_from", this.f107286a.f99788x).mo59973a("enter_method", "").mo59973a("prop_id", this.f107286a.f99713R).f60753a);
        }
    }

    /* renamed from: c */
    public final void mo101840c(boolean z) {
        String str;
        float f;
        if (C23536f.m77298a()) {
            this.f107286a.f99784t = z;
        } else if (z && C6399b.m19946v() && C35563c.f93230L.mo93343b(Property.BeautificationMode) == 2) {
            return;
        } else {
            if (!this.f107339y) {
                C10761a.m31399c(getApplicationContext(), (int) R.string.ws).mo25750a();
                return;
            }
            this.f107286a.f99784t = z;
            this.f107331q.mo99988b(z);
            if (z) {
                float d = C35563c.f93230L.mo93345d(Property.UlikeSmoothDefaultValue);
                if (C35563c.f93230L.mo93342a(Property.UlikeBeautyDownloadEnable)) {
                    float a = C23533d.m77291a(5, "0");
                    if (a != -1.0f) {
                        this.f107331q.mo99955a(a);
                    }
                    float a2 = C23533d.m77291a(0, "0");
                    if (a2 != -1.0f) {
                        d = a2;
                    }
                }
                if (((C39377i) this.f107326l.mo74909j()).mo74906g().f77270e == 0) {
                    f = 0.35f;
                } else {
                    f = 0.0f;
                }
                if (C6399b.m19946v()) {
                    f = 0.0f;
                }
                this.f107331q.mo99956a(d, f);
                this.f107286a.f99785u = this.f107331q.f104465c;
            } else {
                this.f107286a.f99785u = -1;
            }
            ((C39377i) this.f107326l.mo74909j()).mo74903d(C35563c.f93224F.mo70097l().mo74949b().mo74962a(this.f107321g.mo96542a(this.f107327m.mo100087f())));
        }
        C42962b bVar = C42962b.f111525a;
        MobClick obtain = MobClick.obtain();
        if (z) {
            str = "prettify_on";
        } else {
            str = "prettify_off";
        }
        bVar.onEvent(obtain.setEventName(str).setLabelName("shoot_page").setJsonObject(mo101854n()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ C7581n mo101842d(Integer num) {
        if (this.f107286a == null || !this.f107286a.f99779o) {
            return null;
        }
        TimeSpeedModelExtension n = this.f107286a.mo96153n();
        if (n == null) {
            return null;
        }
        long duration = (long) n.getDuration();
        double speed = n.getSpeed();
        n.adjustDuration((long) num.intValue());
        ShortVideoContext shortVideoContext = this.f107286a;
        double k = (double) this.f107286a.mo96150k();
        double intValue = (double) (((long) num.intValue()) - duration);
        Double.isNaN(intValue);
        double d = intValue / speed;
        Double.isNaN(k);
        shortVideoContext.mo96138a((long) (k + d));
        runOnUiThread(new C41313cl(this));
        return null;
    }

    /* renamed from: a */
    private void m131592a(C12629j jVar) {
        boolean z;
        C41530am.m132280a("addFragment onFragmentActivityCreated PlanC");
        C41272b.m131875a(this.f107304ao);
        if (jVar instanceof C42158ay) {
            this.f107337w = ((C42158ay) jVar).mo97896J();
        }
        if (jVar instanceof C39382ed) {
            this.f107336v = (FrameLayout) findViewById(R.id.bj7);
            C41530am.m132280a("addFragment onFragmentActivityCreated initFilterModule");
            if (!C23536f.m77298a()) {
                ShortVideoContext shortVideoContext = this.f107286a;
                if (C35563c.f93230L.mo93343b(Property.BeautyModel) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                shortVideoContext.f99784t = z;
            }
            getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    if (C23536f.m77298a()) {
                        VideoRecordNewActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        return;
                    }
                    final int a = VideoRecordNewActivity.this.f107321g.mo96542a(VideoRecordNewActivity.this.f107327m.mo100087f());
                    if (a == -1) {
                        C35563c.f93230L.mo93341a(Property.DisableFilter, true);
                    }
                    VideoRecordNewActivity.this.f107326l.mo74902d();
                    if (C35563c.m114837d().mo74818a().getValue() == null || ((List) C35563c.m114837d().mo74818a().getValue()).size() <= a) {
                        C35563c.m114837d().mo74818a().observe(VideoRecordNewActivity.this, new C0053p<List<C29296g>>() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public void onChanged(List<C29296g> list) {
                                if (list != null && list.size() > a) {
                                    ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74899b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(VideoRecordNewActivity.this.f107321g.mo96542a(VideoRecordNewActivity.this.f107327m.mo100087f())));
                                    ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74890a(((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74906g());
                                    C35563c.m114837d().mo74818a().removeObserver(this);
                                }
                            }
                        });
                    } else {
                        ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74899b(C35563c.f93224F.mo70097l().mo74949b().mo74962a(VideoRecordNewActivity.this.f107321g.mo96542a(VideoRecordNewActivity.this.f107327m.mo100087f())));
                        ((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74890a(((C39377i) VideoRecordNewActivity.this.f107326l.mo74909j()).mo74906g());
                    }
                    VideoRecordNewActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
            m131583V();
            m131601af();
            m131596aa();
            this.f107329o = new C40305c(this, this.f107334t);
            m131606ak();
            m131573L();
            C42141ah a = C42141ah.m134103a(this.f107286a.mo96152m(), this.f107286a.mo96150k());
            this.f107337w.mo103594a((Object) this, (C42155av) a);
            a.mo103576a();
            this.f107337w.mo103594a((Object) this, (C42155av) new C42135ab(this.f107286a.f99767c));
            if (this.f107286a.f99779o) {
                RecordModeViewModel recordModeViewModel = (RecordModeViewModel) C36113b.m116288a(this).mo91871a(RecordModeViewModel.class);
                recordModeViewModel.mo107124a(this.f107286a.f99781q);
                recordModeViewModel.mo107123a(0);
                this.f107337w.mo103594a((Object) this, (C42155av) new C42145al());
            }
            if (this.f107286a.mo96142d() || this.f107286a.mo96144e()) {
                ((RecordToolbarViewModel) C36113b.m116288a(this).mo91871a(RecordToolbarViewModel.class)).mo107187d(false);
            }
            if (C35563c.f93259v.mo83153b()) {
                ChristmasCountDownDialog christmasCountDownDialog = new ChristmasCountDownDialog(this, new C41132a() {
                    /* renamed from: a */
                    public final void mo101600a(String str) {
                        VideoRecordNewActivity.this.mo101827a(str);
                    }
                });
                if (this.f107286a.f99766b == 0 && christmasCountDownDialog.mo101598b()) {
                    this.f107296ag = false;
                    christmasCountDownDialog.mo101597a(this.f107286a);
                }
            }
            if (this.f107296ag) {
                this.f107320f.post(new Runnable() {
                    public final void run() {
                        VideoRecordNewActivity.this.f107324j.mo100320l();
                    }
                });
            }
            mo101852l().mo96179h(true);
        }
    }

    /* renamed from: b */
    private void m131613b(Bundle bundle) {
        boolean z;
        boolean z2 = true;
        if (bundle != null) {
            this.f107286a = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f107286a == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C41530am.m132280a(sb.toString());
        }
        if (this.f107286a == null) {
            this.f107286a = C39812es.m127468a(getIntent());
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f107286a != null) {
                z2 = false;
            }
            sb2.append(z2);
            C41530am.m132280a(sb2.toString());
        }
        this.f107297ah = getIntent().getStringExtra("extra_sticker_from");
        this.f107265F = getIntent().getStringExtra("grade_key");
        this.f107262C = getIntent().getBooleanExtra("navigate_back_to_main", false);
        if ("challenge".equals(this.f107286a.f99788x)) {
            FaceStickerBean.sCurPropSource = "challenge";
        } else if ("scan".equals(this.f107286a.f99788x)) {
            FaceStickerBean.sCurPropSource = "qr_code";
        } else if ("prop".equals(this.f107286a.f99788x)) {
            FaceStickerBean.sCurPropSource = "homepage_prop_maker";
        }
        C39360dw.m125725a().f102249d = this.f107286a.f99788x;
        C38505a.m123079a(this.f107286a.f99787w);
        ShortVideoContextViewModel l = mo101852l();
        l.f99791a = this.f107286a;
        l.mo96163a(this.f107286a.f99719X);
        this.f107296ag = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.f107340z = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.f107260A = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.f107311av = getIntent().getStringExtra("update_effect_id");
        this.f107312aw = getIntent().getParcelableArrayListExtra("update_effect_extra");
        if (C30199h.m98861a().getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.f107286a.f99788x) && this.f107260A == null && (this.f107340z == null || this.f107340z.size() == 0)) {
            String b = C35563c.f93259v.mo83151b((Context) this);
            if (!TextUtils.isEmpty(b)) {
                this.f107340z = new ArrayList();
                this.f107340z.add(b);
            }
        }
        if (!TextUtils.isEmpty(getIntent().getStringExtra("task_id"))) {
            this.f107286a.f99757ar = C35563c.f93251n.mo83171a(this.f107286a.f99757ar, getIntent().getStringExtra("task_id"));
        }
        if (!TextUtils.isEmpty(getIntent().getStringExtra("star_atlas_object"))) {
            this.f107286a.f99757ar = C35563c.f93251n.mo83175b(this.f107286a.f99757ar, getIntent().getStringExtra("star_atlas_object"));
        }
        this.f107261B = getIntent().getSerializableExtra("sticker_music");
        String stringExtra = getIntent().getStringExtra("music_origin");
        if (stringExtra != null) {
            this.f107286a.f99772h = stringExtra;
        }
        C23531b.m77288d();
    }

    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", true);
        C38495au.m123049a();
        m131613b(bundle);
        this.f107280U = C29197ac.m95828a("VideoRecordNewActivity");
        this.f107281V = C35563c.f93231M.mo93305a(AVAB.Property.EnableFilterIntensityJust);
        m131569G();
        if (C47450e.m148163a()) {
            m131571I();
        }
        C41530am.m132280a("VideoRecordNewActivity => onCreate start");
        C39360dw.m125725a().f102254i = false;
        C41545b.m132307a().mo102189b("av_video_record_init");
        C35563c.f93224F.mo70097l().mo74949b().mo74963a();
        C42039d.m133620a().mo103230b((Context) this);
        super.onCreate(bundle);
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            C23256c.m76347a(this, 3);
        }
        getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        setContentView((int) R.layout.fe);
        this.f107313ax = (RecordZoomValueTextView) findViewById(R.id.cq9);
        if (C40312g.m128765c()) {
            this.f107313ax.setVisibility(0);
        } else {
            this.f107313ax.setVisibility(8);
        }
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.f107305ap = i;
        if (!C47443b.m148122a(this)) {
            C41530am.m132280a("RecordConditionCheck.check() false");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
            return;
        }
        C45252ac.m142757a();
        m131607al();
        this.f107332r = (FrameLayout) findViewById(R.id.cwi);
        this.f107333s = (ScreenSizeAspectFrameLayout) findViewById(R.id.bk9);
        this.f107333s.addView(this.f107334t);
        if (!C30538p.m99745a()) {
            if (C35563c.f93231M.mo93306b(AVAB.Property.EnableOpenGl3) == 1) {
                z = true;
            } else {
                z = false;
            }
            VideoSdkCore.enableGLES3(z);
        }
        if (!C47450e.m148163a()) {
            m131571I();
        }
        m131578Q();
        m131593a(this.f107334t);
        m131582U();
        m131614b(this.f107334t);
        m131568F();
        this.f107333s.setAdjustEnable(!this.f107286a.mo96142d());
        m131572K();
        this.f107335u.getHolder().addCallback(new Callback() {
            /* renamed from: a */
            static final /* synthetic */ C7581n m131686a(Integer num) {
                if (num.intValue() != 0) {
                    StringBuilder sb = new StringBuilder("stopPreviewAsync ret = ");
                    sb.append(num);
                    C41530am.m132283b(sb.toString());
                }
                return C7581n.f20898a;
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                VideoRecordNewActivity.this.f107327m.mo100093l();
                VideoRecordNewActivity.this.mo101851k();
                VideoRecordNewActivity.this.f107334t.mo56243c(C41321ct.f107581a);
                VideoRecordNewActivity.this.mo101846f();
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C41530am.m132280a("VideoRecordNewActivity => surfaceCreated");
                StringBuilder sb = new StringBuilder("w = ");
                sb.append(VideoRecordNewActivity.this.f107335u.getWidth());
                sb.append("   h = ");
                sb.append(VideoRecordNewActivity.this.f107335u.getHeight());
                C6893q.m21447a("zoom_info_log", new C6869c().mo16887a("camera_surface_view_size", sb.toString()).mo16888b());
                VideoRecordNewActivity.this.f107334t.mo56220a(VideoRecordNewActivity.this.f107285Z);
                if (C47450e.m148163a()) {
                    VideoRecordNewActivity.this.mo101853m();
                }
                VideoRecordNewActivity.this.f107334t.mo56216a(surfaceHolder.getSurface(), Build.DEVICE, C41320cs.f107580a);
                VideoRecordNewActivity.this.f107274O = surfaceHolder;
                if (VideoRecordNewActivity.this.f107276Q) {
                    VideoRecordNewActivity.this.f107276Q = false;
                    if (VideoRecordNewActivity.this.f107275P) {
                        VideoRecordNewActivity.this.mo101848h();
                    }
                } else {
                    VideoRecordNewActivity.this.f107327m.mo100074a();
                }
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C41530am.m132280a("VideoRecordNewActivity => surfaceChanged");
                if (C39805en.m127445a()) {
                    VideoRecordNewActivity.this.f107334t.mo56215a(surfaceHolder.getSurface());
                }
            }
        });
        this.f107338x = m131579R();
        m131591a(bundle);
        C35563c.f93240c.mo83130a("SHOOT");
        getLifecycle().mo55a(AudioFocusManager.m131309a(this));
        this.f107304ao = (FrameLayout) findViewById(R.id.bhp);
        C41272b.m131874a(this, this.f107304ao);
        C39779q.m127366a(true);
        C41530am.m132280a("VideoRecordNewActivity => onCreate end");
        C43072du.m136644d();
        C39147a.m124995a(null);
        C41253ah.m131871a(false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C41530am.m132280a("VideoRecordNewActivity onNewIntent");
        if (this.f107286a == null || !C47443b.m148122a(this)) {
            C41530am.m132280a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        boolean z = true;
        if (intExtra == 1) {
            C39812es.m127469a(intent, this.f107286a);
            m131566D();
            RecordModeViewModel recordModeViewModel = (RecordModeViewModel) C36113b.m116288a(this).mo91871a(RecordModeViewModel.class);
            recordModeViewModel.mo107124a(this.f107286a.f99781q);
            recordModeViewModel.mo107123a(0);
            if (this.f107337w != null) {
                this.f107337w.mo103594a((Object) this, (C42155av) new C42145al());
            }
            ((RetakeViewModel) C0069x.m159a((FragmentActivity) this).mo147a(RetakeViewModel.class)).f99693a.setValue(Boolean.valueOf(true));
        } else if (intExtra == 2) {
            C39812es.m127473b(intent, this.f107286a);
            m131566D();
            if (this.f107337w != null) {
                C42141ah a = C42141ah.m134103a(this.f107286a.mo96152m(), this.f107286a.mo96150k());
                this.f107337w.mo103594a((Object) this, (C42155av) a);
                a.mo103576a();
                this.f107337w.mo103594a((Object) this, (C42155av) new C42346k());
            }
            ((RetakeViewModel) C0069x.m159a((FragmentActivity) this).mo147a(RetakeViewModel.class)).f99693a.setValue(Boolean.valueOf(false));
        }
        if (this.f107286a.mo96149j() == null && this.f107338x != null) {
            this.f107338x.mo103594a((Object) this, (C42155av) new C42345j());
        }
        m131608am();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.f107262C = getIntent().getBooleanExtra("navigate_back_to_main", false);
        this.f107296ag = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            C41530am.m132280a("VideoRecordNewActivity isClear");
            setIntent(intent);
            if (getIntent().getIntExtra("translation_type", 0) == 3) {
                C23256c.m76347a(this, 3);
            }
            m131577P();
            C35563c.f93224F.mo70097l().mo74949b().mo74963a();
            m131613b((Bundle) null);
            mo101845e();
        } else if (this.f107286a == null) {
            m131613b((Bundle) null);
        }
        ShortVideoContext shortVideoContext = this.f107286a;
        if (!booleanExtra2 && this.f107286a.f99762aw == null) {
            z = false;
        }
        shortVideoContext.f99763ax = z;
        if (this.f107296ag && this.f107324j != null) {
            this.f107324j.mo100320l();
        }
    }

    /* renamed from: a */
    private void m131594a(ExtraParams extraParams) {
        if ((extraParams.getInteractionIcon() == null || !extraParams.getInteractionIcon().startsWith(WebKitApi.SCHEME_HTTP)) && !C6307b.m19566a((Collection<T>) this.f107273N)) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f107273N.get(0));
            sb.append(extraParams.getInteractionIcon());
            extraParams.setInteractionIcon(sb.toString());
        }
    }

    /* renamed from: b */
    private void m131616b(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals("__BACKURL__", str)) {
            try {
                Uri parse = Uri.parse(str);
                Intent intent = new Intent();
                intent.setData(parse);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
                startActivityIfNeeded(intent, -1);
                moveTaskToBack(true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo60526b(C23254a aVar) {
        this.f107293ad.remove(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo101834b(int i, float f) {
        this.f107313ax.mo101679a(i, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo101825a(File file, int i) {
        C6869c a = C6869c.m21381a().mo16885a("error_code", Integer.valueOf(i));
        a.mo16885a("segment_count", Integer.valueOf(this.f107286a.mo96152m().size()));
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f107286a.mo96152m().iterator();
        while (it.hasNext()) {
            sb.append(((TimeSpeedModelExtension) it.next()).getDuration());
            sb.append(",");
        }
        if (sb.length() == 0) {
            a.mo16887a("video_durations", "");
        } else {
            a.mo16887a("video_durations", sb.substring(0, sb.length() - 1));
        }
        a.mo16886a("total_duration", Long.valueOf(this.f107286a.f99777m));
        a.mo16887a("path", file.getPath());
        if (file.isDirectory()) {
            a.mo16887a("file_path", C41536ap.m132295a(file.list(), ","));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getIntent().getIntExtra("record_from", 0));
        a.mo16887a("enter_from", sb2.toString());
        C6893q.m21447a("aweme_draft_edit_error", a.mo16888b());
        m131602ag();
        if (this.f107286a.f99766b == 1) {
            C10761a.m31399c(getApplicationContext(), (int) R.string.foj).mo25750a();
            finish();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (C23254a a : this.f107293ad) {
            if (a.mo60522a(i, keyEvent)) {
                return true;
            }
        }
        if (i != 4 || this.f107337w == null) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!mo101852l().mo96173e()) {
            return true;
        }
        Boolean musicCut = ((RecordViewState) ((RecordViewModel) C36113b.m116288a(this).mo91871a(RecordViewModel.class)).mo106825a(this)).getMusicCut();
        if (musicCut != null && musicCut.booleanValue()) {
            ((RecordViewModel) C36113b.m116288a(this).mo91871a(RecordViewModel.class)).mo106839d(false);
            this.f107337w.mo103594a((Object) this, (C42155av) new C42137ad(4));
            return true;
        } else if (this.f107299aj != null && this.f107299aj.mo30877a()) {
            return true;
        } else {
            this.f107337w.mo103594a((Object) this, (C42155av) new C42347l("back_key"));
            return true;
        }
    }

    /* renamed from: a */
    private void m131595a(final List<Effect> list, final int i) {
        if (!TextUtils.isEmpty(((Effect) list.get(i)).getParentId())) {
            HashMap hashMap = new HashMap();
            hashMap.put("scene", this.f107297ah);
            if (!TextUtils.isEmpty(this.f107265F)) {
                hashMap.put("grade_key", this.f107265F);
            }
            this.f107324j.mo100295a(((Effect) list.get(i)).getParentId(), hashMap, false, new C43759i() {
                /* renamed from: a */
                public final void mo95925a(C43726c cVar) {
                }

                /* renamed from: a */
                public final void mo95926a(List<Effect> list) {
                    if (i == 0) {
                        VideoRecordNewActivity.this.f107324j.mo100302b((Effect) list.get(0));
                    }
                    if (!C6311g.m19573a(list)) {
                        list.set(i, list.get(0));
                    }
                }
            });
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (this.f107324j != null) {
            this.f107324j.mo100268a(i, i2, intent);
        }
        for (C23255b a : this.f107292ac) {
            if (a.mo60523a(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            if (this.f107286a == null || this.f107286a.f99762aw == null) {
                z = false;
            } else {
                z = true;
            }
            if (!(intent == null || intent.getExtras() == null || z)) {
                Intent intent2 = new Intent();
                intent2.setClass(this, C35563c.f93240c.mo83138e());
                intent2.addFlags(67108864);
                intent2.putExtras(intent.getExtras());
                startActivity(intent2);
            }
            finish();
        }
    }
}
