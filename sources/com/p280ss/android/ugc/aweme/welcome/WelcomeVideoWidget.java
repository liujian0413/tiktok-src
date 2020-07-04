package com.p280ss.android.ugc.aweme.welcome;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p1358l.C32270a;
import com.p280ss.android.ugc.aweme.utils.C42971be;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.p1699c.C43202b;
import com.p280ss.android.ugc.aweme.welcome.C43544b.C43546b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import kotlin.C7581n;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47940f;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47951a;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48093bb;

/* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeVideoWidget */
public final class WelcomeVideoWidget extends Widget implements C43546b {

    /* renamed from: a */
    public final int f112734a = 10;

    /* renamed from: i */
    public String f112735i = "welcome_screen_video4.mp4";

    /* renamed from: j */
    public String f112736j;

    /* renamed from: k */
    public boolean f112737k;

    /* renamed from: l */
    private RemoteImageView f112738l;

    /* renamed from: m */
    private View f112739m;

    /* renamed from: n */
    private C43544b f112740n;

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeVideoWidget$a */
    static final class C43541a extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        int f112741a;

        /* renamed from: b */
        final /* synthetic */ C47919b f112742b;

        /* renamed from: c */
        final /* synthetic */ WelcomeVideoWidget f112743c;

        /* renamed from: d */
        private C48056ad f112744d;

        C43541a(C47919b bVar, C47919b bVar2, WelcomeVideoWidget welcomeVideoWidget) {
            this.f112742b = bVar;
            this.f112743c = welcomeVideoWidget;
            super(2, bVar2);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C43541a aVar = new C43541a(this.f112742b, bVar, this.f112743c);
            aVar.f112744d = (C48056ad) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C43541a) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f112741a == 0) {
                Context context = this.f112743c.f60919b;
                String str = this.f112743c.f112735i;
                File externalCacheDir = C6399b.m19921a().getExternalCacheDir();
                C7573i.m23582a((Object) externalCacheDir, "AppContextManager.getApp…ontext().externalCacheDir");
                C42971be.m136415a(context, str, externalCacheDir.getAbsolutePath());
                this.f112742b.resumeWith(Result.m150902constructorimpl(C47951a.m148882a(true)));
                return C7581n.f20898a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C7540d(mo19421b = "WelcomeVideoWidget.kt", mo19422c = {52}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.welcome.WelcomeVideoWidget$onBindView$1")
    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeVideoWidget$b */
    static final class C43542b extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f112745a;

        /* renamed from: b */
        Object f112746b;

        /* renamed from: c */
        int f112747c;

        /* renamed from: d */
        final /* synthetic */ WelcomeVideoWidget f112748d;

        /* renamed from: e */
        final /* synthetic */ View f112749e;

        /* renamed from: f */
        private C48056ad f112750f;

        C43542b(WelcomeVideoWidget welcomeVideoWidget, View view, C47919b bVar) {
            this.f112748d = welcomeVideoWidget;
            this.f112749e = view;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C43542b bVar2 = new C43542b(this.f112748d, this.f112749e, bVar);
            bVar2.f112750f = (C48056ad) obj;
            return bVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C43542b) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            WelcomeVideoWidget welcomeVideoWidget;
            Object a = C47948a.m148881a();
            switch (this.f112747c) {
                case 0:
                    C48056ad adVar = this.f112750f;
                    WelcomeVideoWidget welcomeVideoWidget2 = this.f112748d;
                    WelcomeVideoWidget welcomeVideoWidget3 = this.f112748d;
                    this.f112745a = adVar;
                    this.f112746b = welcomeVideoWidget2;
                    this.f112747c = 1;
                    obj = welcomeVideoWidget3.mo105449a((C47919b<? super Boolean>) this);
                    if (obj != a) {
                        welcomeVideoWidget = welcomeVideoWidget2;
                        break;
                    } else {
                        return a;
                    }
                case 1:
                    welcomeVideoWidget = (WelcomeVideoWidget) this.f112746b;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            welcomeVideoWidget.f112737k = ((Boolean) obj).booleanValue();
            if (this.f112748d.f112737k) {
                this.f112748d.mo105451b(this.f112749e);
            } else {
                this.f112748d.mo105450a((ViewGroup) this.f112749e);
            }
            return C7581n.f20898a;
        }
    }

    /* renamed from: a */
    private boolean m138030a() {
        if (C42973bg.m136421a() > ((long) this.f112734a)) {
            return true;
        }
        return false;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f112737k) {
            C43544b bVar = this.f112740n;
            if (bVar == null) {
                C7573i.m23583a("mWelcomeVideoHolder");
            }
            if (bVar != null) {
                bVar.mo105458f();
            }
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.f112737k) {
            C43544b bVar = this.f112740n;
            if (bVar == null) {
                C7573i.m23583a("mWelcomeVideoHolder");
            }
            if (bVar != null) {
                bVar.mo105457e();
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f112737k) {
            C43544b bVar = this.f112740n;
            if (bVar == null) {
                C7573i.m23583a("mWelcomeVideoHolder");
            }
            if (bVar != null) {
                bVar.mo105456d();
            }
        }
    }

    public WelcomeVideoWidget() {
        String str;
        Context a = C6399b.m19921a();
        if (a.getExternalCacheDir() == null) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            File externalCacheDir = a.getExternalCacheDir();
            C7573i.m23582a((Object) externalCacheDir, "externalCacheDir");
            sb.append(externalCacheDir.getAbsolutePath());
            sb.append(File.separator);
            sb.append(this.f112735i);
            str = sb.toString();
        }
        this.f112736j = str;
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        super.mo60146a(view);
        LayoutInflater from = LayoutInflater.from(this.f60919b);
        if (view != null) {
            from.inflate(R.layout.b5l, (ViewGroup) view);
            C48145g.m149385a(C48093bb.f122957a, C32270a.m104791a(), null, new C43542b(this, view, null), 2, null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo105449a(C47919b<? super Boolean> bVar) {
        C47940f fVar = new C47940f(C47948a.m148878a(bVar));
        C47919b bVar2 = fVar;
        if (TextUtils.isEmpty(this.f112736j)) {
            bVar2.resumeWith(Result.m150902constructorimpl(C47951a.m148882a(false)));
        } else if (C42973bg.m136427a(this.f112736j)) {
            bVar2.resumeWith(Result.m150902constructorimpl(C47951a.m148882a(true)));
        } else if (!m138030a()) {
            bVar2.resumeWith(Result.m150902constructorimpl(C47951a.m148882a(false)));
        } else {
            C48145g.m149385a(C48093bb.f122957a, null, null, new C43541a(bVar2, null, this), 3, null);
        }
        Object a = fVar.mo120151a();
        if (a == C47948a.m148881a()) {
            C47955f.m148891c(bVar);
        }
        return a;
    }

    /* renamed from: b */
    public final void mo105451b(View view) {
        View findViewById = view.findViewById(R.id.eac);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.video_container)");
        this.f112739m = findViewById;
        View view2 = this.f112739m;
        if (view2 == null) {
            C7573i.m23583a("mVideoContainer");
        }
        this.f112740n = new C43544b(view2, this);
        C43544b bVar = this.f112740n;
        if (bVar == null) {
            C7573i.m23583a("mWelcomeVideoHolder");
        }
        bVar.mo105453a(C43202b.f111848a.mo104869a(this.f112736j), true);
        C43544b bVar2 = this.f112740n;
        if (bVar2 == null) {
            C7573i.m23583a("mWelcomeVideoHolder");
        }
        bVar2.mo105455c();
    }

    /* renamed from: a */
    public final void mo105450a(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R.id.daf);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.static_cover)");
        this.f112738l = (RemoteImageView) findViewById;
        RemoteImageView remoteImageView = this.f112738l;
        if (remoteImageView == null) {
            C7573i.m23583a("mStaticCover");
        }
        remoteImageView.setVisibility(0);
        RemoteImageView remoteImageView2 = this.f112738l;
        if (remoteImageView2 == null) {
            C7573i.m23583a("mStaticCover");
        }
        C23323e.m76503a(remoteImageView2, (int) R.drawable.f124312com);
    }
}
