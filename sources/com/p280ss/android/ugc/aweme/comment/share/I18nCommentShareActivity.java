package com.p280ss.android.ugc.aweme.comment.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentShareActivity;
import com.p280ss.android.ugc.aweme.comment.p1103ui.CommentShareActivity.C24271a;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage.C24225b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38293b;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38295c;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38297d;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38305h;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38307i;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38309j;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38313l;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38327s;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38337x;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38341z;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38345a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38350d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.C38379c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity */
public final class I18nCommentShareActivity extends CommentShareActivity {

    /* renamed from: a */
    public static final C24235a f63963a = new C24235a(null);

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity$a */
    public static final class C24235a {
        private C24235a() {
        }

        public /* synthetic */ C24235a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static List<String> m79609a(C38345a aVar) {
            C7573i.m23587b(aVar, "activityProvider");
            ArrayList arrayList = new ArrayList();
            if (C6399b.m19946v()) {
                arrayList.add(new C38297d(aVar).mo95739b());
            }
            arrayList.add(new C38327s().mo95739b());
            arrayList.add(new C38307i().mo95739b());
            arrayList.add(new C38309j().mo95739b());
            arrayList.add(new C38337x().mo95739b());
            arrayList.add(new C38295c().mo95739b());
            arrayList.add(new C38341z().mo95739b());
            arrayList.add(new C38305h().mo95739b());
            arrayList.add(new C38293b().mo95739b());
            arrayList.add(new C38313l().mo95739b());
            return arrayList;
        }

        /* renamed from: a */
        public static boolean m79610a(Activity activity, Aweme aweme, Comment comment, int i, String str) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(aweme, "currentAweme");
            C7573i.m23587b(comment, "comment");
            C7573i.m23587b(str, "enterForm");
            C24271a.m79876a(str);
            Intent intent = new Intent(activity, I18nCommentShareActivity.class);
            intent.putExtra("CURRENT_AWEME_FOR_COMMENT", aweme);
            intent.putExtra("CURRENT_COMMENT", comment);
            intent.putExtra("COMMENT_VIEW_HEIGHT", i);
            activity.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity$b */
    public static final class C24236b implements C38379c {

        /* renamed from: a */
        final /* synthetic */ I18nCommentShareActivity f63964a;

        /* renamed from: b */
        final /* synthetic */ I18nCommentAwemeSharePackage f63965b;

        /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity$b$a */
        static final class C24237a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C24236b f63966a;

            /* renamed from: b */
            final /* synthetic */ C38343b f63967b;

            C24237a(C24236b bVar, C38343b bVar2) {
                this.f63966a = bVar;
                this.f63967b = bVar2;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m79612a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m79612a() {
                this.f63966a.f63964a.mo59893d();
                if (!this.f63966a.f63965b.mo18861a(this.f63967b, (Context) this.f63966a.f63964a)) {
                    this.f63967b.mo71406a(this.f63966a.f63965b.mo18860a(this.f63967b), (Context) this.f63966a.f63964a);
                }
            }
        }

        /* renamed from: a */
        public final void mo63024a(C38343b bVar) {
            String str;
            C7573i.m23587b(bVar, "channel");
            String str2 = "share_comment_offsite";
            C22984d a = C22984d.m75611a().mo59973a("author_id", this.f63964a.mo63113k().getAuthorUid()).mo59973a("group_id", this.f63964a.mo63113k().getAid()).mo59973a("enter_from", C24271a.m79875a());
            String str3 = "comment_id";
            Comment comment = this.f63964a.f64098C;
            if (comment != null) {
                str = comment.getCid();
            } else {
                str = null;
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("platform", bVar.mo95739b()).f60753a);
            C24220a.m79551a().checkDownloadStoragePermission(this.f63964a, new C24237a(this, bVar));
        }

        C24236b(I18nCommentShareActivity i18nCommentShareActivity, I18nCommentAwemeSharePackage i18nCommentAwemeSharePackage) {
            this.f63964a = i18nCommentShareActivity;
            this.f63965b = i18nCommentAwemeSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity$c */
    public static final class C24238c implements C38345a {

        /* renamed from: a */
        final /* synthetic */ I18nCommentShareActivity f63968a;

        /* renamed from: a */
        public final Activity mo63025a() {
            return this.f63968a;
        }

        C24238c(I18nCommentShareActivity i18nCommentShareActivity) {
            this.f63968a = i18nCommentShareActivity;
        }
    }

    /* renamed from: a */
    public static final boolean m79606a(Activity activity, Aweme aweme, Comment comment, int i, String str) {
        return C24235a.m79610a(activity, aweme, comment, i, str);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.share.I18nCommentShareActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    public final void mo59893d() {
        mo63121s().mo63012a();
        mo63112j().setVisibility(8);
        mo63111i().setVisibility(8);
        this.f64101F = true;
    }

    /* renamed from: c */
    public final void mo58711c() {
        I18nCommentAwemeSharePackage a = C24225b.m79592a(mo63113k(), this, 3, C24271a.m79875a());
        Comment comment = this.f64098C;
        if (comment != null) {
            a.mo63013a(comment);
        }
        C24238c cVar = new C24238c(this);
        C38382b a2 = new C38382b().mo95977b(false).mo95971a(true).mo95964a((SharePackage) a);
        C24220a.m79551a().injectConfig(a2, false);
        a2.mo95976b(C24220a.m79551a().getServerControlChannelOrder());
        C38380c a3 = a2.mo95972a();
        Iterator it = a3.f99628a.iterator();
        List a4 = C24235a.m79609a(cVar);
        if (a3.f99631d) {
            while (it.hasNext()) {
                C38343b bVar = (C38343b) it.next();
                Context context = this;
                if (!bVar.mo95743a(context) || !a4.contains(bVar.mo95739b())) {
                    it.remove();
                } else if ((bVar instanceof C38297d) && !C38350d.m122525a(context, "com.facebook.katana")) {
                    it.remove();
                }
            }
        }
        mo63114l().mo95959a(a3.f99628a);
        mo63114l().mo95958a((C38379c) new C24236b(this, a));
    }
}
