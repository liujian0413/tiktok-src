package com.p280ss.android.ugc.aweme.shortvideo.reaction;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.medialib.FFMpegManager.C19611a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.download.C22968d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.detail.api.DetailApi;
import com.p280ss.android.ugc.aweme.experiment.ToolsUseDownloaderExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.React;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.services.ISDKService.VideoSplitMessage;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a.C40266a;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a.C40270c;
import com.p280ss.android.ugc.aweme.shortvideo.reaction.p1589a.C40272e;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.local.C43250b;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a */
public final class C40259a {

    /* renamed from: a */
    public Activity f104588a;

    /* renamed from: b */
    public Aweme f104589b;

    /* renamed from: c */
    public Aweme f104590c;

    /* renamed from: d */
    public Aweme f104591d;

    /* renamed from: e */
    public boolean f104592e;

    /* renamed from: f */
    public String f104593f;

    /* renamed from: g */
    public String f104594g;

    /* renamed from: h */
    public String f104595h;

    /* renamed from: i */
    public int f104596i;

    /* renamed from: j */
    public C41654d f104597j;

    /* renamed from: k */
    public AlertDialog f104598k;

    /* renamed from: l */
    public Runnable f104599l = new Runnable() {
        public final void run() {
            if (C40259a.this.f104597j != null) {
                C41654d dVar = C40259a.this.f104597j;
                int i = 100;
                if (C40259a.this.f104596i < 100) {
                    i = C40259a.this.f104596i;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* renamed from: m */
    private React f104600m;

    /* renamed from: n */
    private String f104601n = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().cacheDir();

    /* renamed from: o */
    private String f104602o;

    /* renamed from: p */
    private String f104603p;

    /* renamed from: q */
    private boolean f104604q = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableDuetReactVEEditor();

    /* renamed from: r */
    private C0052o<VideoSplitMessage> f104605r = new C0052o<>();

    /* renamed from: s */
    private int f104606s;

    /* renamed from: t */
    private int f104607t;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a$a */
    class C40263a implements OnClickListener {
        private C40263a() {
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (view.getId() == R.id.cod) {
                C40259a.this.f104590c = C40259a.this.f104591d;
                C40259a.this.f104592e = true;
            } else if (view.getId() == R.id.coe) {
                C40259a.this.f104590c = C40259a.this.f104589b;
            }
            C40259a.this.f104598k.dismiss();
            String str2 = "click_react";
            C22984d a = C22984d.m75611a().mo59973a("group_id", C40259a.this.f104590c.getAid()).mo59973a("origin_group_id", C40259a.this.f104591d.getAid()).mo59973a("enter_from", C40259a.this.f104593f);
            String str3 = "react_mode";
            if (view.getId() == R.id.cod) {
                str = "from_react_origin";
            } else {
                str = "from_react_react";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
            C40259a.this.mo100049a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a$b */
    class C40264b implements OnClickListener {
        private C40264b() {
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            C40259a.this.f104598k.dismiss();
            if (view.getId() != R.id.cod || !C40259a.this.f104591d.getStatus().isDelete()) {
                C10761a.m31399c(C40259a.this.f104588a.getApplicationContext(), (int) R.string.dbb).mo25750a();
            } else {
                C10761a.m31399c(C40259a.this.f104588a.getApplicationContext(), (int) R.string.dbc).mo25750a();
            }
            String str3 = "click_react";
            C22984d a = C22984d.m75611a().mo59973a("group_id", C40259a.this.f104589b.getAid()).mo59973a("origin_group_id", C40259a.this.f104591d.getAid()).mo59973a("enter_from", C40259a.this.f104593f);
            String str4 = "react_mode";
            if (view.getId() == R.id.cod) {
                str = "from_react_origin";
            } else {
                str = "from_react_react";
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str).f60753a);
            String str5 = "react_fail";
            C22984d a2 = C22984d.m75611a().mo59973a("group_id", C40259a.this.f104589b.getAid()).mo59973a("origin_group_id", C40259a.this.f104591d.getAid());
            String str6 = "react_mode";
            if (view.getId() == R.id.cod) {
                str2 = "from_react_origin";
            } else {
                str2 = "from_react_react";
            }
            C6907h.m21524a(str5, (Map) a2.mo59973a(str6, str2).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a$c */
    class C40265c extends C40270c {
        /* renamed from: a */
        public final void mo59411a(C44850c cVar) {
            super.mo59411a(cVar);
            C40259a.this.mo100056d();
        }

        /* renamed from: a */
        public final void mo59412a(String str) {
            super.mo59412a(str);
            if (str != null) {
                if (str.length() == 0) {
                    C40259a.this.mo100056d();
                    StringBuilder sb = new StringBuilder("WaterMarkComposer download file size == 0: ");
                    sb.append(C40259a.this.f104594g);
                    C6921a.m21559a((Throwable) new Exception(sb.toString()));
                    return;
                }
                C40259a.this.f104595h = str;
                C40259a.this.mo100055c();
            }
        }

        C40265c(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: a */
        public final void mo59408a(int i, long j, long j2) {
            super.mo59408a(i, j, j2);
            if (C40259a.this.f104588a != null) {
                C40259a.this.f104596i = i;
                C6726a.m20844b(C40259a.this.f104599l);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100053a(Object obj) {
        if (obj == null || !(obj instanceof MusicWaveBean)) {
            m128626b(null);
        } else {
            m128626b((MusicWaveBean) obj);
        }
    }

    /* renamed from: o */
    private void m128632o() {
        if (this.f104597j != null) {
            try {
                this.f104597j.dismiss();
            } catch (Exception unused) {
            }
        }
        this.f104597j = null;
    }

    /* renamed from: d */
    public final void mo100056d() {
        C1592h.m7855a((Callable<TResult>) new C40282i<TResult>(this), C1592h.f5958b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ React mo100060h() throws Exception {
        return DetailApi.m85568a(this.f104589b.getAid());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ Object mo100061i() throws Exception {
        this.f104605r.observe((C0043i) this.f104588a, new C40283j(this));
        return null;
    }

    /* renamed from: c */
    public final void mo100055c() {
        C6726a.m20844b(new C40278e(this));
        C6726a.m20842a(new C40279f(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo100058f() {
        if (!C7276d.m22812b(this.f104602o) || !C7276d.m22812b(this.f104603p)) {
            m128625a(this.f104604q);
        } else {
            m128630m();
        }
    }

    /* renamed from: j */
    private static boolean m128627j() {
        if (!C7276d.m22826g()) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.djg).mo25750a();
            return false;
        } else if (C7276d.m22827h() >= 20971520) {
            return true;
        } else {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.djh).mo25750a();
            return false;
        }
    }

    /* renamed from: l */
    private void m128629l() {
        C43250b.m137222a(this.f104590c.getAid(), new C44856a().mo107294a(this.f104594g).mo107298b(this.f104595h).mo107297a(), new C40265c(this.f104594g, this.f104593f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ Void mo100057e() throws Exception {
        if (this.f104588a != null) {
            if (!C40284k.m128673a(C6399b.m19921a())) {
                m128632o();
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjt).mo25750a();
            } else {
                m128632o();
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.avg).mo25750a();
            }
        }
        return null;
    }

    /* renamed from: n */
    private ReactionParams m128631n() {
        Aweme aweme;
        ReactionParams reactionParams = new ReactionParams();
        reactionParams.videoPath = this.f104602o;
        reactionParams.wavPath = this.f104603p;
        reactionParams.videoWidth = this.f104606s;
        reactionParams.videoHeight = this.f104607t;
        reactionParams.reactionViewId = this.f104589b.getAid();
        if (this.f104591d == null) {
            aweme = this.f104589b;
        } else {
            aweme = this.f104591d;
        }
        reactionParams.reactionOriginId = aweme.getAid();
        reactionParams.reactionFromId = this.f104590c.getAid();
        reactionParams.reactionFromAuthor = this.f104590c.getAuthor();
        reactionParams.nonReacted = this.f104592e;
        return reactionParams;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo100059g() {
        String str;
        m128632o();
        this.f104597j = C41654d.m132586b(this.f104588a, this.f104588a.getResources().getString(R.string.dtv));
        this.f104597j.setIndeterminate(true);
        if (C6399b.m19928c()) {
            Activity activity = this.f104588a;
            StringBuilder sb = new StringBuilder("Is ");
            if (this.f104604q) {
                str = "using";
            } else {
                str = "not using";
            }
            sb.append(str);
            sb.append(" veeditor");
            C10761a.m31403c((Context) activity, sb.toString()).mo25750a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        if (r0 == null) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m128630m() {
        /*
            r10 = this;
            android.app.Activity r0 = r10.f104588a
            if (r0 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            r1 = 0
            r0.setCurMusic(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            r0.removeChallenges()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f104590c
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L_0x0050
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r2 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.f104590c
            com.ss.android.ugc.aweme.music.model.Music r2 = r2.getMusic()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r2.convertToMusicModel()
            r0.setCurMusic(r2)
        L_0x0050:
            int r0 = r10.f104606s
            if (r0 == 0) goto L_0x0058
            int r0 = r10.f104607t
            if (r0 != 0) goto L_0x008e
        L_0x0058:
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x0082, all -> 0x007d }
            r0.<init>()     // Catch:{ Exception -> 0x0082, all -> 0x007d }
            java.lang.String r1 = r10.f104602o     // Catch:{ Exception -> 0x007b }
            r0.setDataSource(r1)     // Catch:{ Exception -> 0x007b }
            r1 = 18
            java.lang.String r1 = r0.extractMetadata(r1)     // Catch:{ Exception -> 0x007b }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x007b }
            r10.f104606s = r1     // Catch:{ Exception -> 0x007b }
            r1 = 19
            java.lang.String r1 = r0.extractMetadata(r1)     // Catch:{ Exception -> 0x007b }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x007b }
            r10.f104607t = r1     // Catch:{ Exception -> 0x007b }
            goto L_0x008b
        L_0x007b:
            r1 = move-exception
            goto L_0x0086
        L_0x007d:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x00ac
        L_0x0082:
            r0 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x0086:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x008e
        L_0x008b:
            r0.release()
        L_0x008e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            r1 = r0
            com.ss.android.ugc.aweme.services.IAVService r1 = (com.p280ss.android.ugc.aweme.services.IAVService) r1
            java.lang.String r2 = r10.f104603p
            r3 = 4
            r4 = 0
            r5 = 0
            r6 = -1
            com.ss.android.ugc.aweme.shortvideo.reaction.g r8 = new com.ss.android.ugc.aweme.shortvideo.reaction.g
            r8.<init>(r10)
            r1.getMusicWaveBean(r2, r3, r4, r5, r6, r8)
            return
        L_0x00ab:
            r1 = move-exception
        L_0x00ac:
            if (r0 == 0) goto L_0x00b1
            r0.release()
        L_0x00b1:
            throw r1
        L_0x00b2:
            r10.mo100056d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.reaction.C40259a.m128630m():void");
    }

    /* renamed from: b */
    public final void mo100054b() {
        VideoUrlModel playAddrH264 = this.f104590c.getVideo().getPlayAddrH264();
        if (playAddrH264 != null && !C6307b.m19566a((Collection<T>) playAddrH264.getUrlList())) {
            this.f104594g = C22968d.m75564a(this.f104590c, C6806b.m21144a().mo16627a((String) playAddrH264.getUrlList().get(0)));
            String a = C6306c.m19561a(playAddrH264.getBitRatedRatioUri());
            StringBuilder sb = new StringBuilder();
            sb.append(this.f104601n);
            sb.append(a);
            sb.append(".mp4");
            this.f104595h = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f104601n);
            sb2.append("temp_");
            sb2.append(a);
            sb2.append(".mp4");
            this.f104602o = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f104601n);
            sb3.append("temp_");
            sb3.append(a);
            sb3.append(".wav");
            this.f104603p = sb3.toString();
            if (C7276d.m22812b(this.f104595h)) {
                mo100055c();
                return;
            }
            C7276d.m22803a(this.f104601n, false);
            if (this.f104597j == null) {
                this.f104597j = C41654d.m132586b(this.f104588a, this.f104588a.getResources().getString(R.string.awk));
            }
            this.f104597j.setIndeterminate(false);
            this.f104597j.setProgress(0);
            if (C6384b.m19835a().mo15292a(ToolsUseDownloaderExperiment.class, true, "tools_use_downloader", C6384b.m19835a().mo15295d().tools_use_downloader, false)) {
                String str = this.f104601n;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(a);
                sb4.append(".mp4");
                m128624a(str, sb4.toString());
                return;
            }
            m128629l();
        }
    }

    /* renamed from: k */
    private void m128628k() {
        if (this.f104600m.getOrigin() == null) {
            this.f104591d = this.f104589b;
            this.f104590c = this.f104589b;
            this.f104592e = true;
            if (this.f104600m.getReactable() || C6861a.m21337f().isMe(this.f104590c.getAuthor().getUid())) {
                C6907h.m21524a("click_react", (Map) C22984d.m75611a().mo59973a("group_id", this.f104590c.getAid()).mo59973a("origin_group_id", this.f104591d.getAid()).mo59973a("enter_from", this.f104593f).mo59973a("react_mode", "from_origin").f60753a);
                mo100049a();
                return;
            }
            C6907h.m21524a("react_fail", (Map) C22984d.m75611a().mo59973a("group_id", this.f104590c.getAid()).mo59973a("origin_group_id", this.f104591d.getAid()).mo59973a("react_mode", "from_origin").f60753a);
            C10761a.m31409e(this.f104588a.getApplicationContext(), (int) R.string.dbb).mo25750a();
            m128632o();
            return;
        }
        this.f104591d = this.f104600m.getOrigin();
        Builder builder = new Builder(this.f104588a);
        View inflate = this.f104588a.getLayoutInflater().inflate(R.layout.b42, null);
        builder.setView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.cod);
        TextView textView2 = (TextView) inflate.findViewById(R.id.coe);
        C40263a aVar = new C40263a();
        C40264b bVar = new C40264b();
        if (this.f104600m.getReactionPermission(this.f104589b, this.f104591d) != 0) {
            C6907h.m21524a("react_choice_show", (Map) C22984d.m75611a().mo59973a("group_id", this.f104589b.getAid()).mo59973a("origin_group_id", this.f104591d.getAid()).mo59973a("enter_from", this.f104593f).f60753a);
        }
        switch (this.f104600m.getReactionPermission(this.f104589b, this.f104591d)) {
            case 0:
                C6907h.m21524a("react_fail", (Map) C22984d.m75611a().mo59973a("group_id", this.f104589b.getAid()).mo59973a("origin_group_id", this.f104591d.getAid()).mo59973a("react_mode", "from_react").f60753a);
                C10761a.m31409e(this.f104588a.getApplicationContext(), (int) R.string.dbb).mo25750a();
                m128632o();
                return;
            case 1:
                textView.setOnClickListener(aVar);
                textView2.setOnClickListener(bVar);
                this.f104598k = builder.create();
                this.f104598k.show();
                return;
            case 2:
                textView.setOnClickListener(bVar);
                textView2.setOnClickListener(aVar);
                this.f104598k = builder.create();
                this.f104598k.show();
                break;
            case 3:
                textView.setOnClickListener(aVar);
                textView2.setOnClickListener(aVar);
                this.f104598k = builder.create();
                this.f104598k.show();
                return;
        }
    }

    /* renamed from: a */
    public final void mo100049a() {
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getShortVideoPluginService().mo90366a(this.f104588a, true, new C35547a() {
            public final void onSuccess() {
                C40259a.this.mo100054b();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100051a(VideoSplitMessage videoSplitMessage) {
        m128630m();
    }

    /* renamed from: b */
    private void m128626b(MusicWaveBean musicWaveBean) {
        C6726a.m20844b(new C40281h(this, musicWaveBean));
    }

    /* renamed from: a */
    private static int m128623a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return ((int) Math.round((d * 1.0d) / 16.0d)) * 16;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo100048a(C1592h hVar) throws Exception {
        m128632o();
        if (hVar.mo6889d()) {
            mo100056d();
        } else {
            this.f104600m = (React) hVar.mo6890e();
            m128628k();
        }
        return null;
    }

    /* renamed from: a */
    private void m128625a(boolean z) {
        if (z) {
            int[] iArr = new int[11];
            VEUtils.getVideoFileInfo(this.f104595h, iArr);
            this.f104606s = m128623a(iArr[0]);
            this.f104607t = m128623a(iArr[1]);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().split(this.f104601n, this.f104595h, this.f104603p, this.f104602o, this.f104606s, this.f104607t, iArr[7], 1000, this.f104605r);
            return;
        }
        int[] a = FFMpegManager.m64569a().mo51828a(this.f104595h);
        FFMpegManager.m64569a().mo51829b();
        if (a[0] != 0) {
            mo100056d();
            return;
        }
        this.f104606s = m128623a(a[2] / 2);
        this.f104607t = m128623a(a[3] / 2);
        C19611a aVar = new C19611a();
        aVar.f53066o = this.f104606s;
        aVar.f53067p = this.f104607t;
        aVar.f53054c = this.f104603p;
        aVar.f53052a = this.f104595h;
        aVar.f53053b = this.f104602o;
        aVar.f53057f = C9738o.m28691a((Context) this.f104588a);
        aVar.f53055d = 0;
        aVar.f53056e = (long) a[1];
        aVar.f53061j = 0;
        aVar.f53065n = 1000;
        aVar.f53072u = true;
        if (FFMpegManager.m64569a().mo51824a(aVar) == 0) {
            m128630m();
        } else {
            mo100056d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100052a(MusicWaveBean musicWaveBean) {
        m128632o();
        String uuid = UUID.randomUUID().toString();
        C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", uuid).mo59973a("shoot_way", "react").mo59970a("_staging_flag", C6399b.m19946v() ^ true ? 1 : 0).mo59973a("group_id", this.f104589b.getAid()).f60753a);
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "react");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("music_origin", "react");
        if (musicWaveBean != null) {
            intent.putExtra("music_wave_data", musicWaveBean);
        }
        if (this.f104589b.hasStickerID()) {
            intent.putStringArrayListExtra("reuse_sticker_ids", C38275x.m122271b(this.f104589b.getStickerIDs()));
        }
        C33242an.m107315a(this.f104593f);
        intent.putExtra("reaction_params", m128631n());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).startToolPermissionActivity(this.f104588a, intent);
        String str = "";
        if (!(this.f104590c.getAuthor() == null && this.f104590c.getAuthor().getUid() == null)) {
            str = this.f104590c.getAuthor().getUid();
        }
        C6907h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("react").setValue(this.f104589b.getAid()).setExtValueString(str));
    }

    /* renamed from: a */
    private void m128624a(String str, String str2) {
        C40266a.m128655a(this.f104590c.getAid(), this.f104594g, str, str2, new C40272e(this.f104594g, this.f104593f) {
            /* renamed from: a */
            public final void mo99266a(String str, String str2) {
                super.mo99266a(str, str2);
                if (new File(str2).length() == 0) {
                    C40259a.this.mo100056d();
                    StringBuilder sb = new StringBuilder("WaterMarkComposer download file size == 0: ");
                    sb.append(C40259a.this.f104594g);
                    C6921a.m21559a((Throwable) new Exception(sb.toString()));
                    return;
                }
                C40259a.this.f104595h = str2;
                C40259a.this.mo100055c();
            }

            /* renamed from: a */
            public final void mo99265a(Exception exc, String str, Integer num) {
                super.mo99265a(exc, str, num);
                C40259a.this.mo100056d();
            }

            /* renamed from: a */
            public final void mo99264a(int i, long j, long j2) {
                super.mo99264a(i, j, j2);
                if (C40259a.this.f104588a != null) {
                    C40259a.this.f104596i = i;
                    C6726a.m20844b(C40259a.this.f104599l);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo100050a(Activity activity, Aweme aweme, String str) {
        this.f104588a = activity;
        this.f104589b = aweme;
        this.f104593f = str;
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null && iAVService.needLoginBeforeRecord()) {
            C32656f.m105743a(activity, str, "click_react_button", C42914ab.m136242a().mo104633a("login_title", activity.getString(R.string.dtg)).f111445a);
        } else if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            C9738o.m28710b(C6399b.m19921a(), (int) R.string.ig, 0);
        } else if (this.f104589b != null && this.f104589b.getAuthor() != null && m128627j()) {
            if (!C40284k.m128673a(C6399b.m19921a())) {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjt).mo25750a();
                return;
            }
            C1592h.m7855a((Callable<TResult>) new C40275b<TResult>(this), C1592h.f5958b);
            this.f104597j = C41654d.m132586b(this.f104588a, this.f104588a.getResources().getString(R.string.awk));
            this.f104597j.setIndeterminate(true);
            C1592h.m7853a((Callable<TResult>) new C40276c<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C40277d<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }
}
