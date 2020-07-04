package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28688a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1048ax.C23139a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.permission.C43155b;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.trill.share.base.C45083a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.u */
public final class C38131u implements C38389f {

    /* renamed from: a */
    public final Aweme f99228a;

    /* renamed from: b */
    public final String f99229b;

    /* renamed from: c */
    private final int f99230c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.u$a */
    public static final class C38132a extends C28688a {

        /* renamed from: a */
        final /* synthetic */ C38131u f99231a;

        /* renamed from: b */
        final /* synthetic */ Context f99232b;

        /* renamed from: b */
        public final void mo63021b() {
            super.mo63021b();
            C6907h.m21524a("download_without_logo_status", (Map) new C22984d().mo59973a("download_result", "fail").mo59973a("group_id", this.f99231a.f99228a.getAid()).mo59973a("author_id", C33230ac.m107205a(this.f99231a.f99228a)).mo59973a("enter_from", this.f99231a.f99229b).f60753a);
        }

        /* renamed from: a */
        public final void mo63020a(String str) {
            String str2;
            C7573i.m23587b(str, "path");
            String str3 = "download_without_logo_status";
            C22984d dVar = new C22984d();
            String str4 = "download_result";
            CharSequence charSequence = str;
            if (TextUtils.isEmpty(charSequence)) {
                str2 = "fail";
            } else {
                str2 = "success";
            }
            C6907h.m21524a(str3, (Map) dVar.mo59973a(str4, str2).mo59973a("group_id", this.f99231a.f99228a.getAid()).mo59973a("author_id", C33230ac.m107205a(this.f99231a.f99228a)).mo59973a("enter_from", this.f99231a.f99229b).f60753a);
            if (!TextUtils.isEmpty(charSequence)) {
                String path = new File(C23139a.m76055a(this.f99232b), new File(str).getName()).getPath();
                C7276d.m22820d(str, path);
                C7573i.m23582a((Object) path, "destination");
                C38131u.m121772a(path, this.f99232b);
                if (mo73750c()) {
                    C43316v.m137450K().mo104946v();
                }
            }
        }

        C38132a(C38131u uVar, Context context, Context context2) {
            this.f99231a = uVar;
            this.f99232b = context;
            super(context2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.u$b */
    static final class C38133b implements C22480b {

        /* renamed from: a */
        final /* synthetic */ C38131u f99233a;

        /* renamed from: b */
        final /* synthetic */ C45083a f99234b;

        /* renamed from: c */
        final /* synthetic */ Context f99235c;

        C38133b(C38131u uVar, C45083a aVar, Context context) {
            this.f99233a = uVar;
            this.f99234b = aVar;
            this.f99235c = context;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0) {
                if (iArr[0] == 0) {
                    this.f99234b.mo107634a(this.f99233a.f99228a, true);
                } else {
                    C43155b.m136878a(R.string.cn0, R.string.cmz, C38157b.m121903a(this.f99235c));
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.mb;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "save_no_watermark";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.div;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
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
    public static void m121772a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            C10761a.m31384a(context, (int) R.string.fot, 1).mo25750a();
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            AwemeApplication.m21341a().sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        C6907h.m21524a("download_without_logo", (Map) new C22984d().mo59973a("action_type", "click").mo59973a("group_id", this.f99228a.getAid()).mo59973a("author_id", C33230ac.m107205a(this.f99228a)).mo59973a("enter_from", this.f99229b).f60753a);
        C45083a aVar = new C45083a(context, false, this.f99230c, "download_no_watermark");
        aVar.f115884k = new C38132a(this, context, context);
        if (C43162f.m136888c(C38157b.m121903a(context)) == 0) {
            aVar.mo107634a(this.f99228a, true);
            return;
        }
        C22477b.m74364a(C38157b.m121903a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C38133b(this, aVar, context));
    }

    public C38131u(Aweme aweme, String str, int i) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        this.f99228a = aweme;
        this.f99229b = str;
        this.f99230c = i;
    }
}
