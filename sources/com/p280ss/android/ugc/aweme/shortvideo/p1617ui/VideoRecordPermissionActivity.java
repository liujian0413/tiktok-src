package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.google.common.base.C17454q;
import com.google.gson.C6600e;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21164d;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVNationalTask;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39379ea;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p280ss.android.ugc.aweme.shortvideo.TaskAnchorInfo;
import com.p280ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40374af;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40517g;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1603e.C40557c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1604f.C40569b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.C40900a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect.C40901b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41524ag;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41545b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C43051dc;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.superentrance.C47494a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity */
public class VideoRecordPermissionActivity extends AbsActivity {

    /* renamed from: a */
    C17454q f107383a;

    /* renamed from: b */
    private ToolSafeHandler f107384b = new ToolSafeHandler(this);

    /* renamed from: c */
    private boolean f107385c = false;

    /* renamed from: d */
    private boolean f107386d = false;

    /* renamed from: e */
    private TaskAnchorInfo f107387e = null;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo101887a() {
        boolean booleanExtra = getIntent().getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra) {
            C43072du.m136632a("camera_error", "2", "recording");
            finish();
        } else if (C35563c.m114836c()) {
            C10761a.m31399c(getApplicationContext(), (int) R.string.ddw).mo25750a();
            C43072du.m136632a("camera_error", "2", "living");
            finish();
        } else if (!m131768b(getIntent()) || !C35563c.m114832a()) {
            IStoryRecordService iStoryRecordService = (IStoryRecordService) ServiceManager.get().getService(IStoryRecordService.class);
            if ((!m131765a(getIntent()) && !m131768b(getIntent()) && C35563c.m114832a() && !booleanExtra2) || (iStoryRecordService != null && iStoryRecordService.isStoryRecording())) {
                C6893q.m21447a("record", C6869c.m21381a().mo16887a("event", "isRecording").mo16887a("user_info", C35563c.m114835b()).mo16888b());
                if (m131773i()) {
                    C10761a.m31399c(getApplicationContext(), (int) R.string.ddw).mo25750a();
                    C43072du.m136632a("camera_error", "2", "recording");
                } else {
                    C10761a.m31399c(getApplicationContext(), (int) R.string.b9m).mo25750a();
                    C43072du.m136632a("camera_error", "2", "recording");
                }
                finish();
            } else if (!C39360dw.m125725a().mo97930a((Context) this)) {
                C6893q.m21447a("record", C6869c.m21381a().mo16887a("event", "isPublishing").mo16888b());
                C43072du.m136632a("camera_error", "2", "publishing");
                finish();
            } else {
                mo101890b();
            }
        } else {
            C43072du.m136632a("camera_error", "2", "recording");
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101889a(String[] strArr, int[] iArr) {
        C47494a.m148230a(strArr, iArr);
        if (iArr == null || iArr.length == 0 || strArr == null || strArr.length == 0) {
            m131771e();
            return;
        }
        for (int i : iArr) {
            if (i == -1) {
                this.f107384b.mo102164a(new C41339dk(this));
                return;
            }
        }
        mo101894h();
    }

    /* renamed from: a */
    public static boolean m131765a(Intent intent) {
        return intent != null && "main".equals(intent.getStringExtra("from"));
    }

    /* renamed from: a */
    public static boolean m131763a(Context context) {
        return C35563c.f93224F.mo70088c().mo90359b(context) == 0 && C35563c.f93224F.mo70088c().mo90354a(context) == 0 && C35563c.f93224F.mo70088c().mo90360c(context) == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo101888a(DialogInterface dialogInterface) {
        m131771e();
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C1592h mo101885a(String str, C1592h hVar) throws Exception {
        if (!hVar.mo6887c() && !hVar.mo6889d()) {
            return C1592h.m7851a(hVar.mo6890e());
        }
        if (hVar.mo6889d() && hVar.mo6891f() != null && TextUtils.isEmpty(str)) {
            C10761a.m31403c((Context) this, hVar.mo6891f().getMessage()).mo25750a();
        }
        return C1592h.m7851a(new Bundle());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo101886a(C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6887c()) {
            m131767b(null);
        } else {
            m131767b((List) hVar.mo6890e());
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[SYNTHETIC, Splitter:B:23:0x0057] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper> m131759a(java.util.List<java.lang.String> r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = com.bytedance.common.utility.C6311g.m19573a(r6)
            if (r1 == 0) goto L_0x000c
            return r0
        L_0x000c:
            java.util.Iterator r6 = r6.iterator()
        L_0x0010:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            com.google.gson.stream.a r3 = new com.google.gson.stream.a     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x005b, all -> 0x0053 }
            com.ss.android.ugc.aweme.port.in.n r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            com.google.gson.e r1 = r1.mo70085S()     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r4 = com.p280ss.android.ugc.effectmanager.effect.model.Effect.class
            java.lang.Object r1 = r1.mo15972a(r3, r4)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.p280ss.android.ugc.effectmanager.effect.model.Effect) r1     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            if (r1 != 0) goto L_0x0044
        L_0x003e:
            r3.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0010
        L_0x0042:
            goto L_0x0010
        L_0x0044:
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r1 = com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper.m129064a(r1, r2, r2)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r2 = 1
            r1.f104910c = r2     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r0.add(r1)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            goto L_0x003e
        L_0x004f:
            r6 = move-exception
            goto L_0x0055
        L_0x0051:
            r2 = r3
            goto L_0x005b
        L_0x0053:
            r6 = move-exception
            r3 = r2
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            r3.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            throw r6
        L_0x005b:
            if (r2 == 0) goto L_0x0010
            r2.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0010
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordPermissionActivity.m131759a(java.util.List):java.util.ArrayList");
    }

    /* renamed from: a */
    private static void m131761a(Context context, String str, final Bundle bundle, final C1606i<Bundle> iVar) {
        new C40557c(new EffectPlatform(context, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient())).mo100631a(str, "", (C43760j) new C43760j() {
            /* renamed from: b */
            public final void mo9282b(Effect effect) {
            }

            /* renamed from: a */
            public final void mo9280a(Effect effect) {
                bundle.putParcelable("first_sticker", effect);
                if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                    String a = C40374af.m129112a((String) effect.getMusic().get(0));
                    if (!TextUtils.isEmpty(a)) {
                        bundle.putString("path", a);
                    }
                }
                iVar.mo6900a(bundle);
            }

            /* renamed from: a */
            public final void mo9281a(Effect effect, C43726c cVar) {
                iVar.mo6899a(cVar.f113222c);
            }
        });
    }

    /* renamed from: a */
    public static boolean m131764a(Context context, Intent intent) {
        if (!C35563c.m114832a() || !intent.getBooleanExtra("extra_clear_dialog_show_needed", true)) {
            return false;
        }
        C10741a a = new C10741a(context).mo25649a((int) R.string.dlm);
        if (C6399b.m19944t()) {
            a.mo25657b((int) R.string.dll);
        }
        a.mo25658b((int) R.string.w_, C41346dr.f107619a).mo25650a((int) R.string.afn, (OnClickListener) new C41347ds(context, intent)).mo25656a().mo25637a();
        return true;
    }

    /* renamed from: e */
    public static void m131771e() {
        C43072du.m136631a("camera_error", "1");
    }

    public void onStart() {
        super.onStart();
        this.f107385c = true;
    }

    public void onStop() {
        super.onStop();
        this.f107385c = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void mo101894h() {
        C35563c.f93228J.mo90366a(this, true, new C35547a() {
            public final void onSuccess() {
                VideoRecordPermissionActivity.this.mo101891c();
            }
        });
    }

    public void onPause() {
        super.onPause();
        C43051dc.f111647a = getClass();
    }

    /* renamed from: i */
    private static boolean m131773i() {
        C21164d dVar = C35563c.f93260w;
        if (dVar == null || dVar.mo57092e() == null) {
            return false;
        }
        return dVar.mo57092e().mo58570m();
    }

    /* renamed from: j */
    private boolean m131774j() {
        String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (C35563c.f93224F.mo70088c().mo90355a((Context) this, str) == -1 && !C35563c.f93224F.mo70088c().mo90358a((Activity) this, str)) {
                return true;
            }
        }
        return false;
    }

    public Resources getResources() {
        if (!this.f107386d) {
            C41524ag.m132264b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    /* renamed from: c */
    public final void mo101891c() {
        C41545b.m132307a().mo102189b("av_video_record_init");
        if (isFinishing() || this.mStatusDestroyed || (VERSION.SDK_INT >= 17 && isDestroyed())) {
            C43072du.m136631a("camera_error", "2");
            return;
        }
        C6726a.m20842a(C41340dl.f107606a);
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        m131775k();
        if (C35563c.f93245h.mo83212d()) {
            C35563c.f93245h.mo83208b(getApplicationContext());
        }
    }

    /* renamed from: d */
    public final void mo101893g() {
        final boolean j = m131774j();
        Dialog a = new C10741a(this).mo25657b((int) R.string.l_).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                VideoRecordPermissionActivity.m131771e();
                VideoRecordPermissionActivity.this.finish();
            }
        }).mo25650a((int) R.string.afp, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (j) {
                    C35563c.f93224F.mo70088c().mo90361d(VideoRecordPermissionActivity.this);
                    VideoRecordPermissionActivity.this.finish();
                    return;
                }
                VideoRecordPermissionActivity.this.mo101890b();
            }
        }).mo25656a().mo25637a();
        a.setOnCancelListener(new C41341dm(this));
        C42951au.m136342a(a);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", true);
        this.f107386d = true;
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C41524ag.m132262a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", false);
            return;
        }
        super.onResume();
        C41524ag.m132262a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", false);
    }

    /* renamed from: b */
    public final void mo101890b() {
        if (m131763a((Context) this)) {
            this.f107384b.mo102164a(new C41336dh(this));
        } else if (C35563c.f93224F.mo70088c().mo90357a()) {
            C47494a.m148229a((Context) this);
            C35563c.f93224F.mo70088c().mo90356a(this, new C41337di(this), "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            this.f107384b.mo102164a(new Runnable() {
                public final void run() {
                    VideoRecordPermissionActivity.this.mo101893g();
                }
            });
        }
    }

    /* renamed from: k */
    private void m131775k() {
        this.f107383a = C17454q.m58004b();
        C41545b.m132307a().mo102189b("av_video_record_init");
        String stringExtra = getIntent().getStringExtra("first_face_sticker");
        String stringExtra2 = getIntent().getStringExtra("music_reuse_sticker_id");
        String stringExtra3 = getIntent().getStringExtra("challenge_id");
        String stringExtra4 = getIntent().getStringExtra("music_id");
        String stringExtra5 = getIntent().getStringExtra("extra_bind_mv_id");
        String stringExtra6 = getIntent().getStringExtra("direct_use_sticker_music");
        String stringExtra7 = getIntent().getStringExtra("poi_struct_in_tools_line");
        String stringExtra8 = getIntent().getStringExtra("shoot_way");
        if (getIntent().getBooleanExtra("enter_record_from_other_platform", false) || !TextUtils.equals(stringExtra8, "task_platform")) {
            C39360dw.m125725a().mo97933c();
        }
        AVNationalTask aVNationalTask = C39360dw.m125725a().f102248c;
        if (aVNationalTask != null && TextUtils.equals(stringExtra8, "task_platform")) {
            C39360dw.m125725a().f102249d = stringExtra8;
            if (!C6307b.m19566a((Collection<T>) aVNationalTask.getMvIds()) && !TextUtils.isEmpty((CharSequence) aVNationalTask.getMvIds().get(0))) {
                stringExtra5 = (String) aVNationalTask.getMvIds().get(0);
            }
            if (!C6307b.m19566a((Collection<T>) aVNationalTask.getConnectMusic()) && !TextUtils.isEmpty(((AVMusic) aVNationalTask.getConnectMusic().get(0)).mid)) {
                stringExtra4 = ((AVMusic) aVNationalTask.getConnectMusic().get(0)).mid;
                getIntent().putExtra("is_forced_music_from_show_way", "task_platform");
            }
            if (aVNationalTask.getAnchor() != null) {
                this.f107387e = aVNationalTask.getAnchor();
            }
        }
        if (!TextUtils.isEmpty(stringExtra7)) {
            C38505a.m123087b(stringExtra7);
        }
        ArrayList arrayList = new ArrayList();
        C41342dn dnVar = new C41342dn(this, stringExtra);
        if (!TextUtils.isEmpty(stringExtra)) {
            arrayList.add(m131754a((Context) this, stringExtra, "cold_start").mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) dnVar));
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            arrayList.add(m131751a((Context) this, stringExtra2).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) dnVar));
        }
        if (!TextUtils.isEmpty(stringExtra5)) {
            arrayList.add(m131770d(this, stringExtra5).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) dnVar));
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            arrayList.add(m131769c(this, stringExtra3).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) dnVar));
        }
        if (!TextUtils.isEmpty(stringExtra4)) {
            arrayList.add(m131752a((Context) this, stringExtra4, 2).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) dnVar));
        }
        if (!TextUtils.isEmpty(stringExtra6)) {
            arrayList.add(m131752a((Context) this, stringExtra6, 2).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) dnVar));
        }
        if (C6311g.m19573a(arrayList)) {
            m131767b(null);
        } else {
            C1592h.m7858b((Collection<? extends C1592h<TResult>>) arrayList).mo6876a((C1591g<TResult, TContinuationResult>) new C41343do<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: b */
    public static boolean m131768b(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("enter_record_from_other_platform", false)) {
            return false;
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        if (m131768b(intent)) {
            mo101890b();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        C41545b.m132307a().mo102188a("av_video_record_init");
        if (C39379ea.m125809a()) {
            C35563c.f93260w.mo57085a((Activity) this, "", "schema_record", (Bundle) null, (C21165a) new C21165a() {
                /* renamed from: a */
                public final void mo57093a() {
                    VideoRecordPermissionActivity.this.mo101887a();
                }

                /* renamed from: b */
                public final void mo57094b() {
                    C43072du.m136632a("camera_error", "2", "need login");
                    VideoRecordPermissionActivity.this.finish();
                }
            });
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
            return;
        }
        mo101887a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m131755a(TaskAnchorInfo taskAnchorInfo) {
        if (taskAnchorInfo == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("anchor_business_type", taskAnchorInfo.getType());
            jSONObject.put("anchor_title", taskAnchorInfo.getTitle());
            jSONObject.put("anchor_content", taskAnchorInfo.getContent());
            jSONObject.put("anchor_id", taskAnchorInfo.getId());
            jSONObject.put(C22912d.f60642b, taskAnchorInfo.getOpenUrl());
            jSONObject.put("mp_url", taskAnchorInfo.getMpUrl());
            jSONObject.put("web_url", taskAnchorInfo.getWebUrl());
            jSONObject.put("source", 3);
            jSONObject.put("anchor_icon", new JSONObject(new C6600e().mo15979b((Object) taskAnchorInfo.getIcon())));
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    private void m131767b(List<Bundle> list) {
        if (C41253ah.m131872a()) {
            C35563c.m114830a(VideoRecordNewActivity.class);
        } else {
            C41253ah.m131870a("");
        }
        long a = this.f107383a.mo44941a(TimeUnit.MILLISECONDS);
        C41545b.m132307a().mo102189b("av_video_record_init");
        Intent intent = new Intent(this, VideoRecordNewActivity.class);
        boolean booleanExtra = getIntent().getBooleanExtra("show_no_splash_ad", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        String stringExtra = getIntent().getStringExtra("is_forced_music_from_show_way");
        int intExtra = getIntent().getIntExtra("draft_to_edit_from", 0);
        if (booleanExtra3) {
            C39360dw.m125725a().mo97928a((AVMusic) null);
            C39360dw.m125725a().mo97936f();
        }
        if (booleanExtra) {
            C35563c.f93240c.mo83133a(true);
        }
        if (this.f107387e != null) {
            intent.putExtra("commerce_data_in_tools_line", m131755a(this.f107387e));
        }
        intent.putExtra("sticker_pannel_show", booleanExtra2);
        intent.putExtra("enter_record_from_other_platform", booleanExtra3);
        intent.putExtra("draft_to_edit_from", intExtra);
        intent.putExtra("star_atlas_object", getIntent().getStringExtra("star_atlas_object"));
        if (!TextUtils.isEmpty(stringExtra)) {
            intent.putExtra("is_forced_music_from_show_way", stringExtra);
        }
        if (list != null) {
            for (Bundle putExtras : list) {
                intent.putExtras(putExtras);
            }
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        if (!TextUtils.isEmpty(getIntent().getStringExtra("micro_app_class"))) {
            intent.putExtra("micro_app_class", getIntent().getStringExtra("micro_app_class"));
        }
        TextUtils.isEmpty(intent.getStringExtra("shoot_way"));
        if (TextUtils.isEmpty(intent.getStringExtra("creation_id"))) {
            intent.putExtra("creation_id", UUID.randomUUID().toString());
        }
        intent.putExtra("extra_start_record_time", intent.getLongExtra("extra_start_record_time", System.currentTimeMillis()));
        intent.putExtra("extra_start_record_download_res_time", a);
        TTUploaderService.m122753a();
        startActivity(intent);
        finish();
    }

    /* renamed from: a */
    public static C1592h<Bundle> m131751a(Context context, String str) {
        return m131754a(context, str, "");
    }

    /* renamed from: c */
    public static C1592h<Bundle> m131769c(Context context, String str) {
        C1606i iVar = new C1606i();
        C1592h.m7853a((Callable<TResult>) new C41345dq<TResult>(str, context, iVar));
        return iVar.f6010a;
    }

    /* renamed from: d */
    public static C1592h<Bundle> m131770d(Context context, final String str) {
        final C1606i iVar = new C1606i();
        if (TextUtils.isEmpty(str)) {
            iVar.mo6900a(new Bundle());
            return iVar.f6010a;
        }
        new EffectPlatform(context, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient()).mo70630a(str, "", (C43760j) new C43760j() {
            /* renamed from: b */
            public final void mo9282b(Effect effect) {
            }

            /* renamed from: a */
            public final void mo9280a(Effect effect) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("reuse_mvtheme_enter", true);
                bundle.putString("extra_bind_mv_id", str);
                bundle.putParcelable("first_sticker", effect);
                iVar.mo6900a(bundle);
            }

            /* renamed from: a */
            public final void mo9281a(Effect effect, C43726c cVar) {
                Exception exc = cVar.f113222c;
                if (exc == null) {
                    exc = new Exception("downloadBindMovieEffect Failed");
                }
                iVar.mo6899a(exc);
            }
        });
        return iVar.f6010a;
    }

    /* renamed from: b */
    public static C1592h<Bundle> m131766b(final Context context, String str) {
        final C1606i iVar = new C1606i();
        if (TextUtils.isEmpty(str)) {
            iVar.mo6900a(new Bundle());
            return iVar.f6010a;
        }
        EffectPlatform effectPlatform = new EffectPlatform(context, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
        if (context instanceof C0043i) {
            effectPlatform.mo70619a((C0043i) context);
        }
        final C41653c a = C41653c.m132582a(context, context.getResources().getString(R.string.dy2));
        effectPlatform.mo70630a(str, "", (C43760j) new C43760j() {
            /* renamed from: b */
            public final void mo9282b(Effect effect) {
            }

            /* renamed from: a */
            public final void mo9280a(Effect effect) {
                if (effect == null || TextUtils.isEmpty(effect.getId()) || !C40517g.m129535b(effect.getId())) {
                    C42951au.m136343b(a);
                    iVar.mo6900a(new Bundle());
                    return;
                }
                VideoRecordPermissionActivity.m131753a(context, effect.getId(), iVar, a);
            }

            /* renamed from: a */
            public final void mo9281a(Effect effect, C43726c cVar) {
                C42951au.m136343b(a);
                iVar.mo6900a(new Bundle());
            }
        });
        return iVar.f6010a;
    }

    /* renamed from: a */
    public static C1592h<Bundle> m131752a(Context context, String str, int i) {
        C1606i iVar = new C1606i();
        C41654d b = C41654d.m132586b(context, context.getResources().getString(R.string.dy2));
        b.setIndeterminate(false);
        C41338dj djVar = new C41338dj(context, str, b, 2, iVar);
        C1592h.m7853a((Callable<TResult>) djVar);
        return iVar.f6010a;
    }

    /* renamed from: a */
    public static C1592h<Bundle> m131754a(Context context, String str, String str2) {
        String[] split;
        C1606i iVar = new C1606i();
        ArrayList arrayList = new ArrayList();
        for (String str3 : str.split(",")) {
            if (!arrayList.contains(str3)) {
                arrayList.add(str3);
            }
        }
        if (C6311g.m19573a(arrayList)) {
            iVar.mo6900a(new Bundle());
            return iVar.f6010a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("reuse_sticker_ids", arrayList);
        bundle.putString("event_shoot_event_track", str2);
        m131761a(context, (String) arrayList.get(0), bundle, iVar);
        return iVar.f6010a;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m131757a(String str, Context context, C1606i iVar) throws Exception {
        try {
            AVChallenge a = C35563c.f93241d.mo83165a(str, 0, false);
            C39360dw.m125725a().mo97927a(a);
            C38505a.m123090c(RecordScene.challenge2str(a));
            Bundle bundle = new Bundle();
            bundle.putSerializable("challenge", a);
            if (a == null || a.getStickerId() == null) {
                iVar.mo6900a(bundle);
            } else {
                m131761a(context, a.getStickerId(), bundle, iVar);
            }
        } catch (Exception e) {
            iVar.mo6899a(e);
        }
        return null;
    }

    /* renamed from: a */
    public static C1592h<Bundle> m131753a(Context context, String str, C1606i<Bundle> iVar, C41653c cVar) {
        Map b = C40517g.m129534b();
        if (b.get(str) == null) {
            iVar.mo6900a(new Bundle());
            C42951au.m136343b(cVar);
            return iVar.f6010a;
        }
        C41344dp dpVar = new C41344dp(b, str, iVar, cVar, context);
        C1592h.m7853a((Callable<TResult>) dpVar);
        return iVar.f6010a;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m131758a(Map map, final String str, final C1606i iVar, final C41653c cVar, Context context) throws Exception {
        final ArrayList a = m131759a((List) map.get(str));
        if (a.isEmpty()) {
            iVar.mo6900a(new Bundle());
            C42951au.m136343b(cVar);
            return null;
        }
        EffectPlatform effectPlatform = new EffectPlatform(context, C35563c.f93245h.mo83209c(), C35563c.f93220B.getOKHttpClient());
        if (context instanceof C0043i) {
            effectPlatform.mo70619a((C0043i) context);
        }
        C412186 r12 = new C40901b() {
            /* renamed from: a */
            public final void mo100340a(C43726c cVar) {
                C42951au.m136343b(cVar);
                iVar.mo6899a(cVar.f113222c);
            }

            /* renamed from: a */
            public final void mo100343a(List<StickerWrapper> list, ResourceListModel resourceListModel) {
                C42951au.m136343b(cVar);
                if (C6311g.m19573a(list)) {
                    iVar.mo6900a(new Bundle());
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("update_effect_id", str);
                bundle.putParcelableArrayList("update_effect_extra", new ArrayList(list));
                iVar.mo6900a(bundle);
            }

            /* renamed from: a */
            public final void mo100341a(String str, Effect effect, ResourceListModel resourceListModel) {
                C40569b.m129696a(str, effect, (List<StickerWrapper>) a, 0, resourceListModel, (C40900a) this);
            }

            /* renamed from: a */
            public final void mo100342a(String str, List<StickerWrapper> list, StickerWrapper stickerWrapper, Exception exc) {
                C42951au.m136343b(cVar);
                if (C6311g.m19573a(list)) {
                    iVar.mo6900a(new Bundle());
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("update_effect_id", str);
                bundle.putParcelableArrayList("update_effect_extra", new ArrayList(list));
                iVar.mo6900a(bundle);
            }
        };
        C40569b.m129693a();
        for (int i = 0; i < a.size(); i++) {
            C40569b.m129694a(effectPlatform, str, (StickerWrapper) a.get(i), i, (List<StickerWrapper>) a, (C40900a) r12);
        }
        return null;
    }
}
