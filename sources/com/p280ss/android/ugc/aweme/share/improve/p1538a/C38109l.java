package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.DownloadMessageMonitorUtils;
import com.p280ss.android.ugc.aweme.app.DownloadMessageMonitorUtils.ForbidType;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25301by;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.C28687a;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28688a;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p280ss.android.ugc.aweme.share.AwemeACLStruct.ACLCommonStruct;
import com.p280ss.android.ugc.aweme.share.C38024d;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.expr.WhatsappStatusExperiment;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage;
import com.p280ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage.C38194b;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38351c;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38297d;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38301f;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38313l;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38315m;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38317n;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38329t;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38331u;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38337x;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38339y;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38345a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C42960ay;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.p1700d.C43211f;
import com.p280ss.android.ugc.trill.share.C45077a;
import com.p280ss.android.ugc.trill.share.base.C45083a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.l */
public final class C38109l implements C38389f {

    /* renamed from: a */
    public final C28519d f99189a = new C38116d(this);

    /* renamed from: b */
    public final Activity f99190b;

    /* renamed from: c */
    public final Aweme f99191c;

    /* renamed from: d */
    public final String f99192d;

    /* renamed from: e */
    public final boolean f99193e;

    /* renamed from: f */
    private final String f99194f;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.l$a */
    static final class C38110a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38109l f99195a;

        /* renamed from: b */
        final /* synthetic */ int f99196b;

        /* renamed from: c */
        final /* synthetic */ boolean f99197c;

        C38110a(C38109l lVar, int i, boolean z) {
            this.f99195a = lVar;
            this.f99196b = i;
            this.f99197c = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m121695a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m121695a() {
            C23364n.f61448a.mo60676a(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C38110a f99198a;

                {
                    this.f99198a = r1;
                }

                public final void run() {
                    this.f99198a.f99195a.m121682a(this.f99198a.f99195a.f99191c, this.f99198a.f99195a.f99190b, this.f99198a.f99196b, this.f99198a.f99195a.f99192d, this.f99198a.f99195a.f99189a, this.f99198a.f99197c, false);
                }
            }, 500);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.l$b */
    static final class C38112b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C38109l f99199a;

        C38112b(C38109l lVar) {
            this.f99199a = lVar;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m121696a());
        }

        /* renamed from: a */
        private boolean m121696a() {
            String str;
            String str2;
            String str3;
            String str4;
            if (this.f99199a.f99193e) {
                if (this.f99199a.f99189a != null) {
                    str = this.f99199a.f99189a.mo64928a(true);
                } else {
                    str = this.f99199a.f99192d;
                }
                if (C33230ac.m107222d(str)) {
                    C22984d a = C22984d.m75611a();
                    C22984d a2 = a.mo59973a("group_id", this.f99199a.f99191c.getAid()).mo59973a("enter_from", str);
                    String str5 = "download_type";
                    if (C28482e.m93606a(this.f99199a.f99191c)) {
                        str4 = "self";
                    } else {
                        str4 = "other";
                    }
                    a2.mo59973a(str5, str4).mo59973a("download_method", "click_download_icon");
                    if (C7573i.m23585a((Object) "homepage_country", (Object) this.f99199a.f99192d) && this.f99199a.f99191c.getAuthor() != null) {
                        User author = this.f99199a.f99191c.getAuthor();
                        C7573i.m23582a((Object) author, "aweme.author");
                        a.mo59973a("country_name", author.getRegion());
                    }
                    a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f99199a.f99191c)));
                    C6907h.m21528b("download", C33230ac.m107211a(a.f60753a));
                } else {
                    String str6 = "download";
                    C22984d a3 = new C22984d().mo59973a("group_id", this.f99199a.f99191c.getAid());
                    String str7 = "enter_from";
                    C28519d dVar = this.f99199a.f99189a;
                    if (dVar != null) {
                        str2 = dVar.mo64928a(true);
                    } else {
                        str2 = null;
                    }
                    C22984d a4 = a3.mo59973a(str7, str2).mo59973a("download_method", "click_download_icon");
                    String str8 = "download_type";
                    if (C28482e.m93606a(this.f99199a.f99191c)) {
                        str3 = "self";
                    } else {
                        str3 = "other";
                    }
                    C6907h.m21524a(str6, (Map) a4.mo59973a(str8, str3).f60753a);
                }
            }
            if (C6399b.m19947w() && C32326h.m104887i()) {
                C23339g h = C23338f.m76570h();
                if (h.mo60620a("japan_share_download_dot", -1) != 1) {
                    h.mo60629b("japan_share_download_dot", 1);
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.l$c */
    static final class C38113c<TTaskResult, TContinuationResult> implements C1591g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C38109l f99200a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f99201b;

        /* renamed from: c */
        final /* synthetic */ boolean f99202c;

        C38113c(C38109l lVar, SharePackage sharePackage, boolean z) {
            this.f99200a = lVar;
            this.f99201b = sharePackage;
            this.f99202c = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Boolean> hVar) {
            if (C43173w.m136926a((C1592h) hVar)) {
                final int i = this.f99201b.f20186l.getInt("page_type");
                C38082aj.m121566a(this.f99200a.f99190b, (C7561a<C7581n>) new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C38113c f99203a;

                    {
                        this.f99203a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m121698a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m121698a() {
                        C23364n.f61448a.mo60676a(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C381141 f99205a;

                            {
                                this.f99205a = r1;
                            }

                            public final void run() {
                                this.f99205a.f99203a.f99200a.m121682a(this.f99205a.f99203a.f99200a.f99191c, this.f99205a.f99203a.f99200a.f99190b, i, this.f99205a.f99203a.f99200a.f99192d, this.f99205a.f99203a.f99200a.f99189a, this.f99205a.f99203a.f99202c, false);
                            }
                        }, 500);
                    }
                });
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.l$d */
    static final class C38116d implements C28519d {

        /* renamed from: a */
        final /* synthetic */ C38109l f99206a;

        C38116d(C38109l lVar) {
            this.f99206a = lVar;
        }

        /* renamed from: a */
        public final String mo64928a(boolean z) {
            return this.f99206a.f99192d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.l$e */
    public static final class C38117e extends C28688a {

        /* renamed from: a */
        final /* synthetic */ C38109l f99207a;

        /* renamed from: b */
        final /* synthetic */ boolean f99208b;

        /* renamed from: c */
        final /* synthetic */ boolean f99209c;

        /* renamed from: d */
        final /* synthetic */ Aweme f99210d;

        /* renamed from: e */
        final /* synthetic */ String f99211e;

        /* renamed from: f */
        final /* synthetic */ Context f99212f;

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.l$e$a */
        public static final class C38118a implements C38345a {

            /* renamed from: a */
            final /* synthetic */ Activity f99213a;

            /* renamed from: a */
            public final Activity mo63025a() {
                return this.f99213a;
            }

            C38118a(Activity activity) {
                this.f99213a = activity;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.l$e$b */
        public static final class C38119b extends C38351c {

            /* renamed from: a */
            final /* synthetic */ C38118a f99214a;

            C38119b(C38118a aVar, C38343b bVar) {
                this.f99214a = aVar;
                super(bVar);
            }

            /* renamed from: a */
            public final boolean mo71406a(C38354f fVar, Context context) {
                C7573i.m23587b(fVar, C38347c.f99553h);
                C7573i.m23587b(context, "context");
                return new C38301f().mo71406a(fVar, context);
            }
        }

        /* renamed from: b */
        public final void mo63021b() {
            super.mo63021b();
            if (this.f99209c) {
                C6907h.m21524a("download_without_logo_status", (Map) new C22984d().mo59973a("download_result", "fail").mo59973a("group_id", this.f99210d.getAid()).mo59973a("author_id", C33230ac.m107205a(this.f99210d)).mo59973a("enter_from", this.f99211e).f60753a);
            }
        }

        /* renamed from: a */
        public final void mo63020a(String str) {
            String str2;
            if (!this.f99208b) {
                C45077a.m142190a("download", str, new File(str).exists());
            }
            if (this.f99209c) {
                String str3 = "download_without_logo_status";
                C22984d dVar = new C22984d();
                String str4 = "download_result";
                if (TextUtils.isEmpty(str)) {
                    str2 = "fail";
                } else {
                    str2 = "success";
                }
                C6907h.m21524a(str3, (Map) dVar.mo59973a(str4, str2).mo59973a("group_id", this.f99210d.getAid()).mo59973a("author_id", C33230ac.m107205a(this.f99210d)).mo59973a("enter_from", this.f99211e).f60753a);
            }
            if (!TextUtils.isEmpty(str)) {
                String path = new File(C38109l.m121685b(this.f99212f), new File(str).getName()).getPath();
                C7276d.m22820d(str, path);
                Context context = this.f99212f;
                C7573i.m23582a((Object) path, "destination");
                C38109l.m121681a(context, path);
                if (!this.f99208b) {
                    C7213d a = C7213d.m22500a();
                    C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
                    if (a.mo18819s()) {
                        Activity a2 = C38157b.m121903a(this.f99212f);
                        if (!a2.isFinishing()) {
                            DownloadedVideoSharePackage a3 = C38194b.m122003a(path, this.f99210d);
                            C38118a aVar = new C38118a(a2);
                            C38345a aVar2 = aVar;
                            C38382b a4 = new C38382b().mo95963a((C38343b) new C38119b(aVar, new C38297d(aVar2))).mo95963a((C38343b) new C38317n(aVar2)).mo95963a((C38343b) new C38337x());
                            switch (C6384b.m19835a().mo15287a(WhatsappStatusExperiment.class, true, "whatsapp_status_share_policy", C6384b.m19835a().mo15295d().whatsapp_status_share_policy, 0)) {
                                case 1:
                                    a4.mo95963a((C38343b) new C38339y(new C38337x().mo95736a()));
                                    break;
                                case 2:
                                    a4.mo95963a((C38343b) new C38339y(R.drawable.aul));
                                    break;
                            }
                            C38382b a5 = a4.mo95963a((C38343b) new C38331u()).mo95963a((C38343b) new C38315m()).mo95963a((C38343b) new C38313l());
                            String string = this.f99212f.getString(R.string.bfc);
                            C7573i.m23582a((Object) string, "context.getString(R.string.i18n_share_system)");
                            try {
                                CommonShareDialog commonShareDialog = new CommonShareDialog(a2, a5.mo95963a((C38343b) new C38329t(string)).mo95962a((int) R.string.dt3).mo95975b((int) R.string.w_).mo95977b(false).mo95964a((SharePackage) a3).mo95972a(), 0, 4, null);
                                commonShareDialog.show();
                            } catch (Exception unused) {
                            }
                        } else {
                            return;
                        }
                    }
                }
                if (mo73750c()) {
                    C43316v.m137450K().mo104946v();
                }
            }
        }

        C38117e(C38109l lVar, boolean z, boolean z2, Aweme aweme, String str, Context context, Context context2) {
            this.f99207a = lVar;
            this.f99208b = z;
            this.f99209c = z2;
            this.f99210d = aweme;
            this.f99211e = str;
            this.f99212f = context;
            super(context2);
        }
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.at2;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "save";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.dis;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f99191c.isPreventDownload() || this.f99191c.getDownloadStatus() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !C6399b.m19947w() || !C32326h.m104887i()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (C23338f.m76570h().mo60620a("japan_share_download_dot", -1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        boolean z;
        if (!C38037a.m121403a()) {
            return false;
        }
        if (this.f99191c.isPreventDownload() || this.f99191c.getDownloadStatus() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m121685b(Context context) {
        String a = C43211f.m137011a(context);
        C7573i.m23582a((Object) a, "VideoDownloadPathUtil.ge…ideoDownloadPath(context)");
        return a;
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    /* renamed from: a */
    public static void m121681a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            if (a.mo18819s()) {
                C10761a.m31384a(context, (int) R.string.fou, 1).mo25750a();
            } else {
                C10761a.m31384a(context, C43211f.m137010a(), 1).mo25750a();
            }
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            AwemeApplication.m21341a().sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    private final boolean m121684a(Aweme aweme, Context context) {
        if (aweme.getShareInfo() == null) {
            ACLCommonStruct a = AwemeACLStruct.m121220a();
            String string = context.getString(R.string.cjt);
            C7573i.m23582a((Object) string, "context.getString(R.string.network_ungeliable)");
            a.setToastMsg(string);
            C38024d.m121365a(this.f99192d, aweme);
            C10761a.m31399c(context, (int) R.string.cjt).mo25750a();
            return false;
        }
        AwemeStatus status = aweme.getStatus();
        if (status != null && status.isDelete()) {
            ACLCommonStruct a2 = AwemeACLStruct.m121220a();
            String string2 = context.getString(R.string.fo2);
            C7573i.m23582a((Object) string2, "context.getString(R.string.video_deleted)");
            a2.setToastMsg(string2);
            C38024d.m121365a(this.f99192d, aweme);
            C10761a.m31409e(context, (int) R.string.fo2).mo25750a();
            return false;
        } else if (C25301by.m83156e(aweme) || C25301by.m83157f(aweme)) {
            ACLCommonStruct a3 = AwemeACLStruct.m121220a();
            String string3 = context.getString(R.string.e3);
            C7573i.m23582a((Object) string3, "context.getString(R.string.ad_not_support)");
            a3.setToastMsg(string3);
            C38024d.m121365a(this.f99192d, aweme);
            C10761a.m31409e(context, (int) R.string.e3).mo25750a();
            return false;
        } else if (aweme.isPreventDownload()) {
            ACLCommonStruct a4 = AwemeACLStruct.m121220a();
            String string4 = context.getString(R.string.w6);
            C7573i.m23582a((Object) string4, "context.getString(R.stri…ot_save_due_to_copyright)");
            a4.setToastMsg(string4);
            C38024d.m121365a(this.f99192d, aweme);
            C10761a.m31410e(context, context.getResources().getString(R.string.w6)).mo25750a();
            return false;
        } else {
            C38024d.m121368b(this.f99192d);
            if (!C28687a.m94362a(context, aweme)) {
                return false;
            }
            if (aweme.getDownloadStatus() == 0) {
                return true;
            }
            AwemeACLStruct.m121220a().setShowType(3);
            C38024d.m121365a(this.f99192d, aweme);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        String str;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (!C38037a.m121403a()) {
            ACLCommonStruct a = AwemeACLStruct.m121220a();
            String string = context.getString(R.string.ae8);
            C7573i.m23582a((Object) string, "context.getString(R.stri…ommon_share_verification)");
            a.setToastMsg(string);
            C38024d.m121365a(this.f99192d, this.f99191c);
            C10761a.m31410e(context, context.getString(R.string.ae8, new Object[]{C38037a.m121404b()})).mo25750a();
            return;
        }
        Keva.getRepo("share_repo").storeBoolean("user_download_action", true);
        boolean b = C38082aj.m121571b(this.f99191c);
        if (m121684a(this.f99191c, context)) {
            if (b) {
                C38082aj.m121566a(this.f99190b, (C7561a<C7581n>) new C38110a<C7581n>(this, sharePackage.f20186l.getInt("page_type"), b));
                String str2 = "download";
                C22984d a2 = new C22984d().mo59973a("group_id", this.f99191c.getAid());
                String str3 = "download_type";
                if (C28482e.m93606a(this.f99191c)) {
                    str = "self";
                } else {
                    str = "other";
                }
                C6907h.m21524a(str2, (Map) a2.mo59973a(str3, str).mo59973a("enter_from", this.f99192d).mo59973a("download_method", "click_download_icon").f60753a);
                return;
            }
            C1592h.m7853a((Callable<TResult>) new C38112b<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C38113c<TResult,TContinuationResult>(this, sharePackage, b), C1592h.f5958b);
        }
    }

    public C38109l(Activity activity, Aweme aweme, String str, String str2, boolean z) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        C7573i.m23587b(str2, "downloadMethod");
        this.f99190b = activity;
        this.f99191c = aweme;
        this.f99192d = str;
        this.f99194f = str2;
        this.f99193e = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m121682a(Aweme aweme, Context context, int i, String str, C28519d dVar, boolean z, boolean z2) {
        C42960ay.m136379a();
        if (!C38120m.m121704a(context)) {
            C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
            DownloadMessageMonitorUtils.m74932a(ForbidType.NETWORK, aweme);
        } else if (C28482e.m93606a(aweme) || aweme.getStatus() == null || !aweme.getStatus().isPrivate()) {
            if (!(C6399b.m19946v() || aweme == null || aweme.getAuthor() == null)) {
                IAccountUserService f = C6861a.m21337f();
                User author = aweme.getAuthor();
                C7573i.m23582a((Object) author, "aweme.author");
                if (!f.isMe(author.getUid())) {
                    User author2 = aweme.getAuthor();
                    C7573i.m23582a((Object) author2, "aweme.author");
                    if (author2.isPreventDownload()) {
                        ACLCommonStruct a = AwemeACLStruct.m121220a();
                        String string = context.getString(R.string.apu);
                        C7573i.m23582a((Object) string, "context.getString(R.stri…disallow_download_videos)");
                        a.setToastMsg(string);
                        C38024d.m121365a(str, aweme);
                        C10761a.m31399c(context, (int) R.string.apu).mo25750a();
                        DownloadMessageMonitorUtils.m74932a(ForbidType.PREVENT_DOWNLOAD, aweme);
                        return;
                    }
                }
            }
            C45083a aVar = new C45083a(context, false, i, "download");
            aVar.f115856D = str;
            aVar.f115857E = this.f99194f;
            C38117e eVar = new C38117e(this, z, z2, aweme, str, context, context);
            aVar.f115884k = eVar;
            aVar.mo107632a(aweme);
            C38024d.m121365a(str, aweme);
        } else {
            ACLCommonStruct a2 = AwemeACLStruct.m121220a();
            String string2 = context.getString(R.string.fo1);
            C7573i.m23582a((Object) string2, "context.getString(R.stri…lete_and_download_failed)");
            a2.setToastMsg(string2);
            C38024d.m121365a(str, aweme);
            C10761a.m31399c(context, (int) R.string.fo1).mo25750a();
            DownloadMessageMonitorUtils.m74932a(ForbidType.PRIVATE, aweme);
        }
    }
}
