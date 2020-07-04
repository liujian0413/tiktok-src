package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22983b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.service.C33830a;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.local.C43250b;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.PublishVideoJumpActivity */
public class PublishVideoJumpActivity extends AmeSSActivity implements C44849d {

    /* renamed from: a */
    public int f60369a;

    /* renamed from: b */
    public C41654d f60370b;

    /* renamed from: c */
    private String f60371c;

    /* renamed from: d */
    private String f60372d = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().cacheDir();

    /* renamed from: e */
    private Handler f60373e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private int f60374f;

    /* renamed from: g */
    private long f60375g;

    /* renamed from: h */
    private Runnable f60376h = new Runnable() {
        public final void run() {
            if (PublishVideoJumpActivity.this.f60370b != null) {
                C41654d dVar = PublishVideoJumpActivity.this.f60370b;
                int i = 100;
                if (PublishVideoJumpActivity.this.f60369a < 100) {
                    i = PublishVideoJumpActivity.this.f60369a;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* renamed from: i */
    private Uri f60377i;

    /* renamed from: j */
    private String f60378j;

    /* renamed from: k */
    private String f60379k;

    /* renamed from: l */
    private String f60380l;

    /* renamed from: m */
    private AVChallenge f60381m;

    /* renamed from: n */
    private String f60382n;

    /* renamed from: o */
    private String f60383o;

    /* renamed from: u */
    private PublishVideoJumpActivity m74945u() {
        return this;
    }

    /* renamed from: f */
    public final void mo59418f() {
    }

    public void finish() {
        super.finish();
    }

    /* renamed from: g */
    public final void mo59419g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo59426n() {
        if (this.f60374f == 0) {
            mo59416d();
        }
    }

    /* renamed from: s */
    private void m74943s() {
        runOnUiThread(new C22893bc(this));
    }

    /* renamed from: t */
    private void m74944t() {
        runOnUiThread(new C22894bd(this));
    }

    /* renamed from: w */
    private void m74947w() {
        C1592h.m7853a((Callable<TResult>) new C22896bf<TResult>(this));
    }

    /* renamed from: d */
    public final void mo59416d() {
        runOnUiThread(new C22895be(this));
    }

    /* renamed from: e */
    public final void mo59417e() {
        if (this.f60370b != null) {
            try {
                this.f60370b.dismiss();
            } catch (Exception unused) {
            }
            this.f60370b = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo59422j() {
        C9738o.m28710b(getApplicationContext(), (int) R.string.ig, 0);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        mo59417e();
        this.f60373e.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo59406a() {
        runOnUiThread(new C22885ay(this));
        mo59414b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ Void mo59420h() throws Exception {
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).fetchMusicDetail(this, this.f60380l, 1, null, new C33830a() {
            /* renamed from: a */
            public final void mo59431a(Exception exc) {
                PublishVideoJumpActivity.this.mo59416d();
            }

            /* renamed from: a */
            public final void mo59432a(String str, MusicModel musicModel) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setFakeMusic(musicModel);
                PublishVideoJumpActivity.this.mo59406a();
            }
        });
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo59421i() {
        C10761a.m31399c(getApplicationContext(), (int) R.string.avg).mo25750a();
        finish();
    }

    /* renamed from: p */
    private String m74940p() {
        for (C27311c cVar : ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().queryAllDraftList()) {
            if (this.f60378j.equals(cVar.mo70230as())) {
                return cVar.mo70221aj();
            }
        }
        return null;
    }

    /* renamed from: r */
    private boolean m74942r() {
        String[] strArr = {"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (C0683b.m2909b((Context) this, str) == -1 && !ActivityCompat.m2242a((Activity) this, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    private boolean m74946v() {
        if (!C7276d.m22826g()) {
            C10761a.m31399c(getApplicationContext(), (int) R.string.djg).mo25750a();
            return false;
        } else if (C7276d.m22827h() >= 20971520) {
            return true;
        } else {
            C10761a.m31399c(getApplicationContext(), (int) R.string.djh).mo25750a();
            return false;
        }
    }

    /* renamed from: b */
    public final void mo59414b() {
        if (m74938a((Context) this)) {
            this.f60373e.post(new C22886az(this));
        } else if (C43162f.m136886a()) {
            C22477b.m74364a(this, new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C22891ba(this));
        } else {
            this.f60373e.post(new Runnable() {
                public final void run() {
                    PublishVideoJumpActivity.this.mo59424l();
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo59424l() {
        final boolean r = m74942r();
        Dialog a = new C10741a(this).mo25657b((int) R.string.la).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                PublishVideoJumpActivity.this.finish();
            }
        }).mo25650a((int) R.string.afp, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (r) {
                    C42969bc.m136401a(PublishVideoJumpActivity.this);
                    PublishVideoJumpActivity.this.finish();
                    return;
                }
                PublishVideoJumpActivity.this.mo59414b();
            }
        }).mo25656a().mo25637a();
        a.setOnCancelListener(new C22892bb(this));
        C42951au.m136342a(a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo59423k() {
        C32656f.m105744a((Activity) m74945u(), "publish_video", "schema", C42914ab.m136242a().mo104633a("login_title", getString(R.string.d3i)).f111445a, (C23305g) new C23305g() {
            /* renamed from: a */
            public final void mo58663a() {
                PublishVideoJumpActivity.this.finish();
            }

            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
                PublishVideoJumpActivity.this.finish();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void mo59425m() {
        Intent intent = new Intent(this, ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoPublishActivity());
        intent.putExtra("video_id", this.f60378j);
        if (!TextUtils.isEmpty(this.f60383o)) {
            intent.putExtra("review_video_draft_primary_key", this.f60383o);
        } else {
            intent.putExtra("shoot_way", "review2019");
            intent.putExtra("creation_id", UUID.randomUUID().toString());
            intent.putExtra("id", this.f60380l);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f60381m);
            intent.putExtra("challenge", arrayList);
            intent.putExtra("video_path", this.f60371c);
            intent.putExtra("review_video_fast_publish", true);
        }
        startActivity(intent);
        finish();
    }

    /* renamed from: o */
    private void m74939o() {
        if (!C6861a.m21337f().isLogin() && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
            m74943s();
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() || ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            this.f60379k = this.f60377i.getQueryParameter("video_url");
            this.f60378j = this.f60377i.getQueryParameter("video_id");
            this.f60380l = this.f60377i.getQueryParameter("music_id");
            String queryParameter = this.f60377i.getQueryParameter("challenge_id");
            if (TextUtils.isEmpty(this.f60378j) || TextUtils.isEmpty(this.f60379k) || TextUtils.isEmpty(this.f60380l) || !m74946v()) {
                finish();
            } else if (!C22897bg.m75357a(C6399b.m19921a())) {
                C10761a.m31399c(getApplicationContext(), (int) R.string.fi2).mo25750a();
                finish();
            } else {
                if (this.f60370b == null) {
                    this.f60370b = C41654d.m132586b(this, getResources().getString(R.string.awk));
                }
                this.f60370b.setIndeterminate(false);
                this.f60370b.setProgress(0);
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74858a();
                String p = m74940p();
                if (!TextUtils.isEmpty(p)) {
                    this.f60383o = p;
                    mo59406a();
                    return;
                }
                ((IAVService) ServiceManager.get().getService(IAVService.class)).fetchChallengeDetail(queryParameter, null, 0, 0, new C22882av(this));
                String a = C6306c.m19561a(this.f60379k);
                this.f60382n = C6806b.m21144a().mo16627a(this.f60379k);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f60372d);
                sb.append(a);
                sb.append(".mp4");
                this.f60371c = sb.toString();
                if (!C7276d.m22812b(this.f60371c)) {
                    C7276d.m22803a(this.f60372d, false);
                }
                C43250b.m137222a(this.f60378j, new C44856a().mo107294a(this.f60382n).mo107298b(this.f60371c).mo107297a(), this);
                this.f60374f = 0;
                this.f60373e.postDelayed(new C22883aw(this), 60000);
            }
        } else {
            m74944t();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59409a(DialogInterface dialogInterface) {
        finish();
    }

    /* renamed from: a */
    public final void mo59407a(int i) {
        this.f60375g = System.currentTimeMillis();
    }

    /* renamed from: a */
    private static boolean m74938a(Context context) {
        int b = C43162f.m136887b(context);
        int c = C43162f.m136888c(context);
        if (b == 0 && c == 0) {
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        if (getIntent() != null) {
            this.f60377i = Uri.parse(getIntent().getStringExtra("route_uri"));
            if (!C6399b.m19944t()) {
                m74939o();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59410a(AVChallenge aVChallenge) {
        this.f60381m = aVChallenge;
    }

    /* renamed from: a */
    public final void mo59411a(C44850c cVar) {
        mo59416d();
        if (C22897bg.m75357a(AwemeApplication.m21341a())) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.f60382n);
                jSONObject.put("from", "publish_video");
            } catch (JSONException unused) {
            }
            C6877n.m21444a("aweme_download_error_rate", 1, jSONObject);
        }
        C22983b.m75609a("aweme_movie_download_log", "", cVar.f115335b, cVar.f115334a, this.f60382n, "publish_video");
    }

    /* renamed from: a */
    public final void mo59412a(String str) {
        if (str != null) {
            if (str.length() == 0) {
                StringBuilder sb = new StringBuilder("WaterMarkComposer download file size == 0: ");
                sb.append(this.f60382n);
                C6921a.m21559a((Throwable) new Exception(sb.toString()));
                mo59416d();
                return;
            }
            this.f60371c = str;
            m74947w();
        }
        if (C22897bg.m75357a(AwemeApplication.m21341a())) {
            C6877n.m21444a("aweme_download_error_rate", 0, new C6869c().mo16886a("duration", Long.valueOf(System.currentTimeMillis() - this.f60375g)).mo16887a("from", "publish_video").mo16888b());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59413a(String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length == 0 || strArr == null || strArr.length == 0) {
            C10761a.m31399c(getApplicationContext(), (int) R.string.avg).mo25750a();
            finish();
            return;
        }
        for (int i : iArr) {
            if (i == -1) {
                this.f60373e.post(new C22884ax(this));
                return;
            }
        }
        mo59425m();
    }

    /* renamed from: a */
    public final void mo59408a(int i, long j, long j2) {
        this.f60374f = i;
        this.f60369a = i;
        runOnUiThread(this.f60376h);
    }
}
