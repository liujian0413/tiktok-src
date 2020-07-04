package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p1843tt.appbrandimpl.C46580d;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.asve.recorder.C20778k;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39313a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39695d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39700b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p280ss.android.ugc.aweme.shortvideo.model.StickerPoiUtilsKt;
import com.p280ss.android.ugc.aweme.shortvideo.music.C40088b;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.EmbaddedWindowInfo;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.StickerPoi;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.tools.C42148ao;
import com.p280ss.android.ugc.aweme.tools.C42151ar;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42582r;
import com.p280ss.android.ugc.aweme.tools.C42589y;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.utils.C43009cd;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.VERecordData.VERecordSegmentData;
import com.p280ss.android.vesdk.runtime.C45362d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.p1863b.C47442a;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory */
public class GoNextFactoryFactory implements C0042h {

    /* renamed from: a */
    C41654d f99668a;

    /* renamed from: b */
    C39382ed f99669b;

    /* renamed from: c */
    ShortVideoContextViewModel f99670c = ((ShortVideoContextViewModel) C0069x.m159a(this.f99669b.mo97962O()).mo147a(ShortVideoContextViewModel.class));

    /* renamed from: d */
    long f99671d;

    /* renamed from: e */
    int f99672e;

    /* renamed from: f */
    int f99673f;

    /* renamed from: g */
    private ASCameraView f99674g;

    /* renamed from: h */
    private String f99675h;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo96092a() {
        ShortVideoContext shortVideoContext = this.f99670c.f99791a;
        if (shortVideoContext.f99779o) {
            return false;
        }
        long a = C39810eq.m127460a();
        if (shortVideoContext.mo96144e()) {
            a = shortVideoContext.f99767c;
        }
        if (shortVideoContext.mo96150k() < a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo96090a(C42156aw awVar) {
        this.f99671d = System.currentTimeMillis();
        awVar.mo103594a((Object) this.f99669b, (C42155av) new C42148ao());
    }

    /* renamed from: a */
    public final void mo96091a(C42582r rVar, AVMusicWaveBean aVMusicWaveBean, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        C42582r rVar2 = rVar;
        AVMusicWaveBean aVMusicWaveBean2 = aVMusicWaveBean;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = multiEditVideoStatusRecordData;
        int i = rVar2.f110733d;
        String str = rVar2.f110731b;
        String str2 = rVar2.f110732c;
        StringBuilder sb = new StringBuilder("onConcatFinished:");
        sb.append(i);
        C6921a.m21555a(sb.toString());
        ShortVideoContext shortVideoContext = this.f99670c.f99791a;
        if (i >= 0) {
            C6893q.m21444a("aweme_concat_success_rate", 0, (JSONObject) null);
            VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) this.f99669b.f33526d_;
            shortVideoContext.f99748ai = videoRecordNewActivity.f107264E.mo103798e();
            C19282c.m63184a(this.f99669b.mo97961N(), "pv_video_edit", "take_video", 0, 0, this.f99669b.mo97966S());
            m122641a((Context) this.f99669b.f33526d_, shortVideoContext);
            videoRecordNewActivity.mo101822a(shortVideoContext);
            Intent a = m122636a(this.f99670c, videoRecordNewActivity.f107327m.mo100087f(), videoRecordNewActivity);
            String str3 = str;
            C6893q.m21447a("type_av_record_concat_time", C6869c.m21381a().mo16886a("duration", Long.valueOf(System.currentTimeMillis() - this.f99671d)).mo16887a("type", "record").mo16888b());
            boolean z = C35563c.f93231M.mo93306b(Property.RecommentMusicByAIPolicy) != 0;
            boolean z2 = z && ("direct_shoot".equals(shortVideoContext.f99788x) || "prop_page".equals(shortVideoContext.f99788x) || "challenge".equals(shortVideoContext.f99788x) || "draft_again".equals(shortVideoContext.f99788x) || "prop_reuse".equals(shortVideoContext.f99788x) || "collection_music".equals(shortVideoContext.f99788x) || "restore_crash".equals(shortVideoContext.f99788x) || "single_song".equals(shortVideoContext.f99788x) || "mp_record".equals(shortVideoContext.f99788x));
            if (aVMusicWaveBean2 != null) {
                a.putExtra("music_wave_data", aVMusicWaveBean2);
            }
            if (z) {
                MicroAppModel microAppModel = shortVideoContext.f99762aw;
                if (microAppModel != null) {
                    this.f99675h = microAppModel.getAppId();
                }
                C35563c.f93246i.mo103867e().mo103920a(shortVideoContext.f99748ai, z2, shortVideoContext.f99787w, this.f99675h);
                if (C40088b.m128104a() == 2) {
                    C35563c.f93246i.mo103864c();
                }
            }
            if (multiEditVideoStatusRecordData2 != null) {
                ShortVideoSegments o = shortVideoContext.mo96154o();
                if (shortVideoContext.f99779o) {
                    multiEditVideoStatusRecordData2.editSegments = o;
                    multiEditVideoStatusRecordData2.isMultiEditRetake = true;
                } else {
                    multiEditVideoStatusRecordData2.originalSegments = o;
                    multiEditVideoStatusRecordData2.isMultiEditRetake = false;
                    multiEditVideoStatusRecordData2.recordMusic = C39360dw.m125725a().mo97931b();
                    multiEditVideoStatusRecordData2.originalMusicStart = shortVideoContext.f99770f;
                }
                a.putExtra("extra_multi_edit_video_data", multiEditVideoStatusRecordData2);
            }
            a.putExtra("extra_edit_preview_info", new C39695d().mo99058a(new EditVideoSegment(str3, str2, C39692a.m127021a(str3))));
            if (C43072du.m136643c() && !C43072du.m136636a()) {
                C43072du.m136642c(false);
                C43072du.m136637b("record_success");
            }
            if (shortVideoContext.f99763ax) {
                VEVideoPublishEditActivity.m125842a((Activity) videoRecordNewActivity, a, 1);
            } else {
                VEVideoPublishEditActivity.m125843a((Context) videoRecordNewActivity, a, 1);
            }
            this.f99670c.mo96172e(false);
            this.f99668a.dismiss();
            this.f99668a = null;
            return;
        }
        boolean exists = str != null ? new File(str).exists() : false;
        boolean exists2 = str2 != null ? new File(str2).exists() : false;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f99670c.f99791a.f99775k.mo96319g());
        sb2.append("1_frag_v");
        File file = new File(sb2.toString());
        C6893q.m21444a("aweme_concat_success_rate", 1, C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(i)).mo16887a("videoPath", str).mo16887a("audioPath", str2).mo16887a("videoFileExists", String.valueOf(exists)).mo16887a("audioFileExists", String.valueOf(exists2)).mo16887a("firstSegmentPath", String.valueOf(file.exists())).mo16887a("firstSegmentLength", String.valueOf(file.length())).mo16887a("hardEncode", String.valueOf(shortVideoContext.f99783s)).mo16888b());
        String a2 = this.f99669b.mo31000a((int) R.string.afm, Integer.valueOf(i));
        if (i == -10021 || i == -2000) {
            a2 = this.f99669b.mo30999a((int) R.string.at0);
        }
        C10761a.m31403c(this.f99669b.mo97961N(), a2).mo25750a();
        this.f99670c.mo96172e(false);
        StringBuilder sb3 = new StringBuilder("concat failed , ve result = ");
        sb3.append(rVar2.f110733d);
        C43072du.m136632a("record_error", "2", sb3.toString());
    }

    /* renamed from: b */
    public final C42161ba mo96093b() {
        return new C42161ba() {
            /* renamed from: a */
            public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
                if (type != C42589y.class) {
                    return null;
                }
                return new C42159az<T>() {
                    /* renamed from: a */
                    public final void mo96096a(Object obj, T t) {
                        if (!GoNextFactoryFactory.this.f99670c.mo96175f()) {
                            if (GoNextFactoryFactory.this.mo96092a()) {
                                if (!GoNextFactoryFactory.this.f99670c.f99791a.mo96142d() && !GoNextFactoryFactory.this.f99670c.f99791a.mo96144e()) {
                                    C10761a.m31409e(GoNextFactoryFactory.this.f99669b.mo97961N(), (int) R.string.fp9).mo25750a();
                                    C19282c.m63184a(GoNextFactoryFactory.this.f99669b.mo97961N(), "tip_show", "short_clip", 0, 0, GoNextFactoryFactory.this.f99669b.mo97966S());
                                }
                                C43072du.m136632a("record_error", "3", "is short");
                                return;
                            }
                            GoNextFactoryFactory.this.f99670c.mo96172e(true);
                            GoNextFactoryFactory.this.f99668a = C41654d.m132586b(GoNextFactoryFactory.this.f99669b.mo97961N(), GoNextFactoryFactory.this.f99669b.mo30999a((int) R.string.dtv));
                            GoNextFactoryFactory.this.f99668a.setIndeterminate(true);
                            if (!C39805en.m127445a() && !C22911a.m75401a(GoNextFactoryFactory.this.f99669b.mo97961N())) {
                                C23487o.m77138a((Dialog) GoNextFactoryFactory.this.f99668a);
                            }
                            C42962b.f111525a.onEvent(MobClick.obtain().setEventName("finish").setLabelName("shoot_page").setJsonObject(GoNextFactoryFactory.this.f99669b.mo97966S()));
                            GoNextFactoryFactory.this.mo96090a(GoNextFactoryFactory.this.f99669b.mo97963P());
                            GoNextFactoryFactory.this.f99672e++;
                        }
                    }
                };
            }
        };
    }

    /* renamed from: c */
    public final C42161ba mo96094c() {
        return new C42161ba() {
            /* renamed from: a */
            public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
                if (type != C42582r.class) {
                    return null;
                }
                return new C42159az<T>() {
                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ MultiEditVideoStatusRecordData mo96097a(ShortVideoContext shortVideoContext) throws Exception {
                        if (!C39702d.m127065a()) {
                            return null;
                        }
                        C39700b.m127031a(shortVideoContext);
                        return GoNextFactoryFactory.this.mo96089a(shortVideoContext);
                    }

                    /* renamed from: a */
                    public final void mo96096a(Object obj, T t) {
                        if (!GoNextFactoryFactory.this.f99669b.mo97969V()) {
                            ShortVideoContext shortVideoContext = GoNextFactoryFactory.this.f99670c.f99791a;
                            shortVideoContext.f99749aj = System.currentTimeMillis();
                            C42151ar arVar = new C42151ar();
                            GoNextFactoryFactory.this.f99669b.mo97896J().mo103594a((Object) this, (C42155av) arVar);
                            GoNextFactoryFactory.this.f99669b.mo97963P().mo103594a((Object) this, (C42155av) arVar);
                            C42582r rVar = (C42582r) t;
                            GoNextFactoryFactory.this.f99673f++;
                            C39312e.m125625a(shortVideoContext.f99769e, 7, (C39313a) new C38540bo(this, shortVideoContext, rVar));
                        }
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ void mo96099a(ShortVideoContext shortVideoContext, C42582r rVar, AVMusicWaveBean aVMusicWaveBean) {
                        C1592h.m7853a((Callable<TResult>) new C38541bp<TResult>(this, shortVideoContext)).mo6876a((C1591g<TResult, TContinuationResult>) new C38542bq<TResult,TContinuationResult>(this, rVar, aVMusicWaveBean), C1592h.f5958b);
                    }

                    /* access modifiers changed from: 0000 */
                    /* renamed from: a */
                    public final /* synthetic */ Object mo96098a(C42582r rVar, AVMusicWaveBean aVMusicWaveBean, C1592h hVar) throws Exception {
                        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
                        try {
                            GoNextFactoryFactory.this.f99668a.dismiss();
                            GoNextFactoryFactory goNextFactoryFactory = GoNextFactoryFactory.this;
                            if (hVar == null) {
                                multiEditVideoStatusRecordData = null;
                            } else {
                                multiEditVideoStatusRecordData = (MultiEditVideoStatusRecordData) hVar.mo6890e();
                            }
                            goNextFactoryFactory.mo96091a(rVar, aVMusicWaveBean, multiEditVideoStatusRecordData);
                            return null;
                        } catch (NullPointerException unused) {
                            StringBuilder sb = new StringBuilder("concat count = ");
                            sb.append(GoNextFactoryFactory.this.f99672e);
                            sb.append(", concat finished count = ");
                            sb.append(GoNextFactoryFactory.this.f99673f);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                };
            }
        };
    }

    /* renamed from: a */
    private static String m122639a(User user) {
        if (!C6399b.m19946v()) {
            return user.getNickname();
        }
        if (TextUtils.isEmpty(user.getUniqueId())) {
            return user.getShortId();
        }
        return user.getUniqueId();
    }

    /* renamed from: c */
    private static void m122644c(ShortVideoContext shortVideoContext) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = shortVideoContext.mo96154o().iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (timeSpeedModelExtension.getFaceId() != null) {
                linkedHashSet.add(timeSpeedModelExtension.getFaceId());
            }
        }
        shortVideoContext.f99734aL.clear();
        shortVideoContext.f99734aL.addAll(linkedHashSet);
    }

    /* renamed from: b */
    private static void m122643b(ShortVideoContext shortVideoContext) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = shortVideoContext.mo96154o().iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (timeSpeedModelExtension.getBubbleTexts() != null) {
                linkedHashSet.addAll(timeSpeedModelExtension.getBubbleTexts());
            }
            if (timeSpeedModelExtension.getARTexts() != null) {
                linkedHashSet2.addAll(timeSpeedModelExtension.getARTexts());
            }
        }
        shortVideoContext.f99728aF.addAll(linkedHashSet);
        shortVideoContext.f99727aE.addAll(linkedHashSet2);
    }

    /* renamed from: a */
    private static boolean m122642a(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (arrayList == null) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((TimeSpeedModelExtension) it.next()).isSupportRetake()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final MultiEditVideoStatusRecordData mo96089a(ShortVideoContext shortVideoContext) {
        boolean z;
        if (this.f99674g.mo56295o()) {
            this.f99674g.mo56292l();
        }
        C20778k kVar = new C20778k(new C47442a(shortVideoContext.f99775k));
        boolean z2 = false;
        if (shortVideoContext.mo96149j() != null) {
            z = true;
        } else {
            z = false;
        }
        VERecordData a = VERecordData.m142680a((C45362d) kVar, z);
        RetakeVideoContext retakeVideoContext = shortVideoContext.f99781q;
        if (!(retakeVideoContext == null || retakeVideoContext.f99690d == null)) {
            int i = retakeVideoContext.f99689c;
            VERecordData vERecordData = retakeVideoContext.f99690d;
            vERecordData.mo108049a(i, a);
            a = vERecordData;
        }
        a.f116373d = shortVideoContext.f99775k.mo96314c().getAbsolutePath();
        a.f116374e = shortVideoContext.f99775k.mo96315d().getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        if (C6311g.m19574b(a.f116371b)) {
            for (VERecordSegmentData vERecordSegmentData : a.f116371b) {
                StringBuilder sb2 = new StringBuilder("{ In:");
                sb2.append(vERecordSegmentData.f116380f);
                sb2.append(", Out:");
                sb2.append(vERecordSegmentData.f116381g);
                sb2.append(", VideoLength:");
                sb2.append(vERecordSegmentData.f116377c);
                sb2.append("}");
                sb.append(sb2.toString());
                if (vERecordSegmentData.f116377c <= 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(shortVideoContext.f99775k.mo96319g().getAbsolutePath());
                    sb3.append(File.separator);
                    sb3.append("data.txt");
                    sb.append(C7276d.m22824f(sb3.toString()));
                }
            }
        }
        StringBuilder sb4 = new StringBuilder("MultiEditLog: segmentData: ");
        sb4.append(sb.toString());
        C41530am.m132283b(sb4.toString());
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        if (!(shortVideoContext.f99781q == null || shortVideoContext.f99781q.f99691e == null)) {
            multiEditVideoStatusRecordData = shortVideoContext.f99781q.f99691e;
        }
        MultiEditVideoRecordData convertData = MultiEditVideoRecordData.convertData(a, shortVideoContext.f99775k.mo96319g().getAbsolutePath());
        List<EmbaddedWindowInfo> list = null;
        if (convertData == null) {
            return null;
        }
        if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null) {
            if (convertData.segmentDataList.size() != multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList.size()) {
                multiEditVideoStatusRecordData.segmentSizeChange = true;
            }
            convertData = C39702d.m127066b(convertData, multiEditVideoStatusRecordData.curMultiEditVideoRecordData);
            if (convertData == null) {
                return null;
            }
        }
        if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
            if (convertData.segmentDataList.size() == 1) {
                z2 = true;
            }
            convertData.isSingleVideo = z2;
            multiEditVideoStatusRecordData.originMultiEditRecordData = convertData.cloneData();
        }
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = convertData;
        Context N = this.f99669b.mo97961N();
        String path = shortVideoContext.f99775k.mo96314c().getPath();
        Integer valueOf = Integer.valueOf((int) shortVideoContext.f99777m);
        Integer valueOf2 = Integer.valueOf(shortVideoContext.f99773i);
        Integer valueOf3 = Integer.valueOf(shortVideoContext.f99774j);
        if (shortVideoContext.mo96142d()) {
            list = shortVideoContext.f99707L;
        }
        multiEditVideoStatusRecordData.videoMetaData = C38566l.m123252a(true, false, N, path, valueOf, valueOf2, valueOf3, list);
        return multiEditVideoStatusRecordData;
    }

    /* renamed from: a */
    public static Intent m122635a(ShortVideoContextViewModel shortVideoContextViewModel, int i) {
        return m122636a(shortVideoContextViewModel, i, (VideoRecordNewActivity) null);
    }

    public GoNextFactoryFactory(C39382ed edVar, ASCameraView aSCameraView) {
        this.f99669b = edVar;
        this.f99674g = aSCameraView;
        this.f99669b.getLifecycle().mo55a(this);
    }

    /* renamed from: a */
    private static List<AVChallenge> m122640a(ArrayList<TimeSpeedModelExtension> arrayList, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C39360dw.m125725a().f102247b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
            if (timeSpeedModelExtension.getHashtag() != null && !TextUtils.isEmpty(timeSpeedModelExtension.getHashtag().cid)) {
                linkedHashSet.add(timeSpeedModelExtension.getHashtag());
            } else if (timeSpeedModelExtension.getHashtag() != null) {
                AVChallenge hashtag = timeSpeedModelExtension.getHashtag();
                StringBuilder sb = new StringBuilder("try to add challenge, but cid is null ,name:");
                sb.append(hashtag.challengeName);
                sb.append(",stickerId:");
                sb.append(hashtag.stickerId);
                C41530am.m132283b(sb.toString());
            }
        }
        linkedHashSet.removeAll(Collections.singleton(null));
        if (z) {
            linkedHashSet.removeAll(C39360dw.m125725a().f102247b);
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: a */
    private static void m122641a(Context context, ShortVideoContext shortVideoContext) {
        String str;
        int i;
        int i2;
        AVTextExtraStruct aVTextExtraStruct;
        if (TextUtils.isEmpty(shortVideoContext.f99709N)) {
            if (shortVideoContext.mo96144e()) {
                StringBuilder sb = new StringBuilder("@");
                sb.append(m122639a(shortVideoContext.f99705J.reactionFromAuthor));
                String sb2 = sb.toString();
                String string = context.getString(R.string.db_, new Object[]{sb2});
                if (string.endsWith(sb2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    sb3.append(" ");
                    string = sb3.toString();
                }
                int indexOf = string.indexOf(sb2);
                int length = sb2.length() + indexOf;
                ArrayList arrayList = new ArrayList();
                arrayList.add(m122638a(indexOf, length, shortVideoContext.f99705J.reactionFromAuthor.getUid(), shortVideoContext.f99705J.reactionFromId));
                shortVideoContext.f99710O = arrayList;
                shortVideoContext.f99709N = string;
            } else if (shortVideoContext.mo96142d()) {
                String str2 = "";
                if (shortVideoContext.f99751al == 1) {
                    String a = m122639a(shortVideoContext.f99697B);
                    str = context.getString(R.string.om, new Object[]{a});
                    i2 = str.indexOf(a) - 1;
                    i = i2 + 1 + a.length();
                } else {
                    StringBuilder sb4 = new StringBuilder("@");
                    sb4.append(m122639a(shortVideoContext.f99697B));
                    String sb5 = sb4.toString();
                    str = context.getString(R.string.awh, new Object[]{sb5});
                    if (str.endsWith(sb5)) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str);
                        sb6.append(" ");
                        str = sb6.toString();
                    }
                    if (!TextUtils.isEmpty(shortVideoContext.f99698C)) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str);
                        sb7.append("#");
                        sb7.append(shortVideoContext.f99698C);
                        sb7.append(" ");
                        str = sb7.toString();
                    }
                    i2 = str.indexOf(sb5);
                    i = i2 + sb5.length();
                    str2 = shortVideoContext.f99699D;
                }
                ArrayList arrayList2 = new ArrayList();
                if (str2 == null || shortVideoContext.f99697B == null) {
                    aVTextExtraStruct = m122637a(i2, i, shortVideoContext.f99697B.getUid());
                } else {
                    aVTextExtraStruct = m122638a(i2, i, shortVideoContext.f99697B.getUid(), str2);
                }
                arrayList2.add(aVTextExtraStruct);
                shortVideoContext.f99710O = arrayList2;
                shortVideoContext.f99709N = str;
            } else if (shortVideoContext.f99762aw == null || TextUtils.isEmpty(shortVideoContext.f99762aw.getExtra())) {
                if (!C6307b.m19566a((Collection<T>) shortVideoContext.f99716U)) {
                    StringBuilder sb8 = new StringBuilder();
                    Iterator it = shortVideoContext.f99716U.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        sb8.append("#");
                        sb8.append(str3);
                        sb8.append(" ");
                    }
                    shortVideoContext.f99709N = sb8.toString();
                }
            } else {
                C46580d dVar = (C46580d) C35563c.f93239b.mo15974a(shortVideoContext.f99762aw.getExtra(), C46580d.class);
                if (dVar != null && !C6307b.m19566a((Collection<T>) dVar.f120064a)) {
                    StringBuilder sb9 = new StringBuilder();
                    for (String str4 : dVar.f120064a) {
                        sb9.append("#");
                        sb9.append(str4);
                        sb9.append(" ");
                    }
                    shortVideoContext.f99709N = sb9.toString();
                }
            }
        }
    }

    /* renamed from: a */
    private static AVTextExtraStruct m122637a(int i, int i2, String str) {
        return m122638a(i, i2, str, "");
    }

    /* renamed from: a */
    private static Intent m122636a(ShortVideoContextViewModel shortVideoContextViewModel, int i, VideoRecordNewActivity videoRecordNewActivity) {
        Serializable serializable;
        boolean z;
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f99791a;
        Workspace workspace = shortVideoContextViewModel.f99791a.f99775k;
        ShortVideoSegments o = shortVideoContext.mo96154o();
        Intent intent = new Intent();
        intent.putExtra("workspace", workspace);
        if (shortVideoContext.mo96141c()) {
            intent.putExtra("music_start", shortVideoContext.f99770f);
        }
        intent.putExtra("face_beauty", C35563c.f93230L.mo93343b(AVSettings.Property.BeautyModel));
        intent.putExtra("filter_id", 0);
        intent.putExtra("extra_record_video_selected_filter_index", shortVideoContext.f99735aM);
        intent.putExtra("extra_record_video_selected_filter_intensity", shortVideoContext.f99736aN);
        boolean z2 = true;
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", true);
        intent.putExtra("video_segment", ShortVideoContext.m122681a((ArrayList<TimeSpeedModelExtension>) o));
        intent.putExtra("hard_encode", shortVideoContext.f99783s);
        intent.putExtra("restore", shortVideoContext.f99766b);
        intent.putExtra("camera", i);
        intent.putExtra("filter_lables", shortVideoContext.f99720Y.toString());
        intent.putExtra("filter_ids", shortVideoContext.f99721Z.toString());
        intent.putExtra("smooth_skin_labels", shortVideoContext.f99740aa.toString());
        intent.putExtra("smooth_reshape_labels", shortVideoContext.f99741ab.toString());
        intent.putExtra("smooth_tanning_labels", shortVideoContext.f99743ad.toString());
        intent.putExtra("smooth_eyes_labels", shortVideoContext.f99742ac.toString());
        intent.putExtra("extra_aweme_speed", RecordScene.getSpeedStringByModel(o));
        intent.putExtra("extra_av_camera_ids", RecordScene.getCameraIdsStringByModel(o));
        intent.putExtra("extra_beauty_type", shortVideoContext.f99785u);
        intent.putExtra("extra_video_record_metadata", C43009cd.m136508a(shortVideoContext.f99786v));
        intent.putExtra("extra_is_change_speed", RecordScene.isChangeSpeed(o));
        intent.putExtra("sticker_id", RecordScene.getStickerIdsByModel(o));
        intent.putExtra("prop_info", RecordScene.getStickerInfo(o));
        intent.putExtra("first_sticker_music_ids", RecordScene.getFirstStickerMusicIds(o));
        intent.putExtra("shoot_way", shortVideoContext.f99788x);
        intent.putExtra("creation_id", shortVideoContext.f99787w);
        intent.putExtra("poi_struct_in_tools_line", shortVideoContext.f99704I);
        StickerPoi findLastDoorplateLevelPoi = StickerPoiUtilsKt.findLastDoorplateLevelPoi(o);
        String str = "default_select_sticker_poi";
        if (findLastDoorplateLevelPoi == null) {
            serializable = null;
        } else {
            serializable = new DefaultSelectStickerPoi(findLastDoorplateLevelPoi);
        }
        intent.putExtra(str, serializable);
        C42311e.m134569a(intent, C40005j.m127914b(shortVideoContext), Scene.RECORD, Scene.EDIT);
        intent.putExtra("draft_id", shortVideoContext.f99790z);
        intent.putExtra("max_duration", shortVideoContext.f99767c);
        intent.putExtra("wav_form", shortVideoContext.f99768d);
        intent.putExtra("origin", 1);
        intent.putExtra("challenge", (Serializable) m122640a((ArrayList<TimeSpeedModelExtension>) o, shortVideoContext.f99712Q));
        intent.putExtra("task_id", shortVideoContext.f99715T);
        intent.putExtra("tag_id", shortVideoContext.f99718W);
        intent.putExtra("challenge_names", shortVideoContext.f99716U);
        intent.putExtra("video_title", shortVideoContext.f99709N);
        intent.putExtra("struct_list", (Serializable) shortVideoContext.f99710O);
        intent.putExtra("is_rivate", shortVideoContext.f99711P);
        intent.putExtra("duet_from", shortVideoContext.f99699D);
        intent.putExtra("duet_author", shortVideoContext.f99697B);
        intent.putExtra("duet_hash_tag", shortVideoContext.f99698C);
        intent.putExtra("shoot_mode", shortVideoContext.f99719X);
        intent.putExtra("duration_mode", shortVideoContext.f99745af);
        intent.putExtra("record_mode", shortVideoContext.f99751al);
        intent.putExtra("record_game_score", shortVideoContext.f99752am);
        intent.putExtra("reaction_params", shortVideoContext.f99705J);
        intent.putExtra("is_muted", shortVideoContext.f99708M);
        intent.putExtra("music_origin", shortVideoContext.f99772h);
        intent.putExtra("extract_model", shortVideoContext.f99748ai);
        intent.putExtra("micro_app_info", shortVideoContext.f99762aw);
        String str2 = "enter_record_from_other_platform";
        if (videoRecordNewActivity == null || !shortVideoContext.f99763ax) {
            z = false;
        } else {
            z = true;
        }
        intent.putExtra(str2, z);
        String str3 = "back_to_main_after_publish";
        if (shortVideoContext.f99762aw != null) {
            z2 = false;
        }
        intent.putExtra(str3, z2);
        intent.putExtra("extra_import_compile_cost_time", shortVideoContext.f99749aj - shortVideoContext.f99750ak);
        intent.putExtra("extra_start_enter_edit_page", shortVideoContext.f99750ak);
        if (shortVideoContext.f99724aB != null) {
            intent.putExtra("story_festival_model", shortVideoContext.f99724aB);
        }
        m122643b(shortVideoContext);
        m122644c(shortVideoContext);
        if (!C23477d.m77081a((Collection<T>) shortVideoContext.f99727aE)) {
            intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.f99727aE);
        }
        if (!C23477d.m77081a((Collection<T>) shortVideoContext.f99728aF)) {
            intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.f99728aF);
        }
        if (!C23477d.m77081a((Collection<T>) shortVideoContext.f99733aK)) {
            intent.putIntegerArrayListExtra("extra_countdown_mode", shortVideoContext.f99733aK);
        }
        intent.putExtra("av_et_parameter", shortVideoContext.mo96148i());
        if (shortVideoContext.f99725aC != null) {
            intent.putExtra("extra_mention_user_model", shortVideoContext.f99725aC);
        }
        intent.putExtra("enter_from", shortVideoContext.f99789y);
        intent.putExtra("send_to_user_head", shortVideoContext.f99726aD);
        if (shortVideoContext.f99730aH != null) {
            intent.putExtra("extra_draft_transform_model", shortVideoContext.f99730aH);
        }
        if (shortVideoContext.f99731aI != null) {
            intent.putExtra("extra_ve_cher_effect_param", shortVideoContext.f99731aI);
        }
        intent.putStringArrayListExtra("extra_face_id", shortVideoContext.f99734aL);
        StringBuilder sb = new StringBuilder();
        if (!C23477d.m77081a((Collection<T>) shortVideoContext.f99738aP)) {
            Iterator it = shortVideoContext.f99738aP.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(",");
                }
                sb.append(str4);
            }
        }
        intent.putExtra("picture_source", sb.toString());
        intent.putExtra("contain_backgroundvideo", shortVideoContext.mo96157r());
        shortVideoContext.f99737aO = 0;
        intent.putExtra("use_music_before_edit", shortVideoContext.mo96141c());
        intent.putExtra("support_retake", m122642a((ArrayList<TimeSpeedModelExtension>) o));
        return intent;
    }

    /* renamed from: a */
    private static AVTextExtraStruct m122638a(int i, int i2, String str, String str2) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setAtUserType("");
        aVTextExtraStruct.setType(0);
        aVTextExtraStruct.setStart(i);
        aVTextExtraStruct.setEnd(i2);
        aVTextExtraStruct.setUserId(str);
        aVTextExtraStruct.setAwemeId(str2);
        return aVTextExtraStruct;
    }
}
