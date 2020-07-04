package com.p280ss.android.ugc.asve.sandbox;

import android.view.SurfaceHolder;
import com.p280ss.android.ugc.asve.constant.ASCameraHardwareSupportLevel;
import com.p280ss.android.ugc.asve.constant.ASCameraHardwareSupportLevel.C15402a;
import com.p280ss.android.ugc.asve.constant.ASCameraType;
import com.p280ss.android.ugc.asve.constant.ASCameraType.C15403a;
import com.p280ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING;
import com.p280ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING.C15405a;
import com.p280ss.android.ugc.asve.constant.AS_ENCODE_PROFILE;
import com.p280ss.android.ugc.asve.constant.AS_ENCODE_PROFILE.C15406a;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.context.C15424d;
import com.p280ss.android.ugc.asve.context.C15428f;
import com.p280ss.android.ugc.asve.context.C15430g;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.recorder.C20733d;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxCameraContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxCodecContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxDuetContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxReactionContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxWorkspaceProviderWrapper;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.c */
public final class C20983c implements C15432h {

    /* renamed from: a */
    public C21053p f56366a;

    /* renamed from: b */
    public final ASSandBoxRecorderContextWrapper f56367b;

    /* renamed from: c */
    private final boolean f56368c;

    /* renamed from: d */
    private final C20733d f56369d = new C20988e(this);

    /* renamed from: e */
    private final C15422c f56370e = new C20984a(this);

    /* renamed from: f */
    private final C15424d f56371f = new C20985b(this);

    /* renamed from: g */
    private final C15430g f56372g = new C20987d(this);

    /* renamed from: h */
    private final C15428f f56373h = new C20986c(this);

    /* renamed from: i */
    private final Pair<Integer, Integer> f56374i = new Pair<>(Integer.valueOf(this.f56367b.f56519g), Integer.valueOf(this.f56367b.f56520h));

    /* renamed from: j */
    private final boolean f56375j = this.f56367b.f56521i;

    /* renamed from: k */
    private final boolean f56376k = this.f56367b.f56522j;

    /* renamed from: l */
    private final boolean f56377l = this.f56367b.f56523k;

    /* renamed from: m */
    private final boolean f56378m = this.f56367b.f56526n;

    /* renamed from: n */
    private final boolean f56379n = this.f56367b.f56524l;

    /* renamed from: o */
    private final boolean f56380o = this.f56367b.f56525m;

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$a */
    public static final class C20984a implements C15422c {

        /* renamed from: a */
        final /* synthetic */ C20983c f56381a;

        /* renamed from: b */
        private final AS_CAMERA_LENS_FACING f56382b;

        /* renamed from: c */
        private final ASCameraType f56383c;

        /* renamed from: d */
        private final ASCameraHardwareSupportLevel f56384d;

        /* renamed from: e */
        private final boolean f56385e;

        /* renamed from: f */
        private final byte f56386f;

        /* renamed from: g */
        private final boolean f56387g;

        /* renamed from: h */
        private final int[] f56388h;

        /* renamed from: a */
        public final AS_CAMERA_LENS_FACING mo38910a() {
            return this.f56382b;
        }

        /* renamed from: b */
        public final ASCameraType mo38911b() {
            return this.f56383c;
        }

        /* renamed from: c */
        public final ASCameraHardwareSupportLevel mo38912c() {
            return this.f56384d;
        }

        /* renamed from: d */
        public final boolean mo38913d() {
            return this.f56385e;
        }

        /* renamed from: e */
        public final byte mo38914e() {
            return this.f56386f;
        }

        /* renamed from: f */
        public final boolean mo38915f() {
            return this.f56387g;
        }

        /* renamed from: g */
        public final int mo38916g() {
            return R.drawable.a0t;
        }

        /* renamed from: h */
        public final int[] mo38917h() {
            return this.f56388h;
        }

        C20984a(C20983c cVar) {
            this.f56381a = cVar;
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper = cVar.f56367b.f56513a;
            C7573i.m23582a((Object) sandBoxCameraContextWrapper, "recorderContext.sandBoxCameraContextWrapper");
            this.f56382b = C15405a.m45057a(sandBoxCameraContextWrapper.f56550a);
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper2 = cVar.f56367b.f56513a;
            C7573i.m23582a((Object) sandBoxCameraContextWrapper2, "recorderContext.sandBoxCameraContextWrapper");
            this.f56383c = C15403a.m45053a(sandBoxCameraContextWrapper2.f56551b);
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper3 = cVar.f56367b.f56513a;
            C7573i.m23582a((Object) sandBoxCameraContextWrapper3, "recorderContext.sandBoxCameraContextWrapper");
            this.f56384d = C15402a.m45051a(sandBoxCameraContextWrapper3.f56552c);
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper4 = cVar.f56367b.f56513a;
            C7573i.m23582a((Object) sandBoxCameraContextWrapper4, "recorderContext.sandBoxCameraContextWrapper");
            this.f56385e = sandBoxCameraContextWrapper4.f56553d;
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper5 = cVar.f56367b.f56513a;
            C7573i.m23582a((Object) sandBoxCameraContextWrapper5, "recorderContext.sandBoxCameraContextWrapper");
            this.f56386f = (byte) sandBoxCameraContextWrapper5.f56554e;
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper6 = cVar.f56367b.f56513a;
            C7573i.m23582a((Object) sandBoxCameraContextWrapper6, "recorderContext.sandBoxCameraContextWrapper");
            this.f56387g = sandBoxCameraContextWrapper6.f56555f;
            SandBoxCameraContextWrapper sandBoxCameraContextWrapper7 = cVar.f56367b.f56513a;
            C7573i.m23582a((Object) sandBoxCameraContextWrapper7, "recorderContext.sandBoxCameraContextWrapper");
            int[] iArr = sandBoxCameraContextWrapper7.f56556g;
            C7573i.m23582a((Object) iArr, "recorderContext.sandBoxC…ContextWrapper.renderSize");
            this.f56388h = iArr;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$b */
    public static final class C20985b implements C15424d {

        /* renamed from: a */
        final /* synthetic */ C20983c f56389a;

        /* renamed from: b */
        private final boolean f56390b;

        /* renamed from: c */
        private final boolean f56391c;

        /* renamed from: d */
        private final float f56392d;

        /* renamed from: e */
        private final float f56393e;

        /* renamed from: f */
        private final AS_ENCODE_PROFILE f56394f;

        /* renamed from: g */
        private final int f56395g;

        /* renamed from: h */
        private final boolean f56396h;

        /* renamed from: i */
        private final String f56397i;

        /* renamed from: a */
        public final float mo38935a() {
            return this.f56392d;
        }

        /* renamed from: b */
        public final boolean mo38936b() {
            return this.f56391c;
        }

        /* renamed from: c */
        public final float mo38937c() {
            return this.f56393e;
        }

        /* renamed from: d */
        public final boolean mo38938d() {
            return this.f56390b;
        }

        /* renamed from: e */
        public final int mo38939e() {
            return this.f56395g;
        }

        /* renamed from: f */
        public final AS_ENCODE_PROFILE mo38940f() {
            return this.f56394f;
        }

        /* renamed from: g */
        public final boolean mo38941g() {
            return this.f56396h;
        }

        /* renamed from: h */
        public final String mo38942h() {
            return this.f56397i;
        }

        C20985b(C20983c cVar) {
            this.f56389a = cVar;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper = cVar.f56367b.f56514b;
            C7573i.m23582a((Object) sandBoxCodecContextWrapper, "recorderContext.sandBoxCodecContextWrapper");
            this.f56390b = sandBoxCodecContextWrapper.f56560d;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper2 = cVar.f56367b.f56514b;
            C7573i.m23582a((Object) sandBoxCodecContextWrapper2, "recorderContext.sandBoxCodecContextWrapper");
            this.f56391c = sandBoxCodecContextWrapper2.f56558b;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper3 = cVar.f56367b.f56514b;
            C7573i.m23582a((Object) sandBoxCodecContextWrapper3, "recorderContext.sandBoxCodecContextWrapper");
            this.f56392d = sandBoxCodecContextWrapper3.f56557a;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper4 = cVar.f56367b.f56514b;
            C7573i.m23582a((Object) sandBoxCodecContextWrapper4, "recorderContext.sandBoxCodecContextWrapper");
            this.f56393e = sandBoxCodecContextWrapper4.f56559c;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper5 = cVar.f56367b.f56514b;
            C7573i.m23582a((Object) sandBoxCodecContextWrapper5, "recorderContext.sandBoxCodecContextWrapper");
            this.f56394f = C15406a.m45059a(sandBoxCodecContextWrapper5.f56562f);
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper6 = cVar.f56367b.f56514b;
            C7573i.m23582a((Object) sandBoxCodecContextWrapper6, "recorderContext.sandBoxCodecContextWrapper");
            this.f56395g = sandBoxCodecContextWrapper6.f56561e;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper7 = cVar.f56367b.f56514b;
            C7573i.m23582a((Object) sandBoxCodecContextWrapper7, "recorderContext.sandBoxCodecContextWrapper");
            this.f56396h = sandBoxCodecContextWrapper7.f56563g;
            SandBoxCodecContextWrapper sandBoxCodecContextWrapper8 = cVar.f56367b.f56514b;
            C7573i.m23582a((Object) sandBoxCodecContextWrapper8, "recorderContext.sandBoxCodecContextWrapper");
            this.f56397i = sandBoxCodecContextWrapper8.f56564h;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$c */
    public static final class C20986c implements C15428f {

        /* renamed from: a */
        final /* synthetic */ C20983c f56398a;

        /* renamed from: b */
        private final boolean f56399b;

        /* renamed from: c */
        private final String f56400c;

        /* renamed from: d */
        private final String f56401d;

        /* renamed from: e */
        private final int f56402e;

        /* renamed from: f */
        private final int f56403f;

        /* renamed from: a */
        public final boolean mo38970a() {
            return this.f56399b;
        }

        /* renamed from: b */
        public final String mo38971b() {
            return this.f56400c;
        }

        /* renamed from: c */
        public final String mo38972c() {
            return this.f56401d;
        }

        /* renamed from: d */
        public final int mo38973d() {
            return this.f56402e;
        }

        /* renamed from: e */
        public final int mo38974e() {
            return this.f56403f;
        }

        C20986c(C20983c cVar) {
            this.f56398a = cVar;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper = cVar.f56367b.f56517e;
            C7573i.m23582a((Object) sandBoxDuetContextWrapper, "recorderContext.sandBoxDuetContextWrapper");
            this.f56399b = sandBoxDuetContextWrapper.f56565a;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper2 = cVar.f56367b.f56517e;
            C7573i.m23582a((Object) sandBoxDuetContextWrapper2, "recorderContext.sandBoxDuetContextWrapper");
            this.f56400c = sandBoxDuetContextWrapper2.f56566b;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper3 = cVar.f56367b.f56517e;
            C7573i.m23582a((Object) sandBoxDuetContextWrapper3, "recorderContext.sandBoxDuetContextWrapper");
            this.f56401d = sandBoxDuetContextWrapper3.f56567c;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper4 = cVar.f56367b.f56517e;
            C7573i.m23582a((Object) sandBoxDuetContextWrapper4, "recorderContext.sandBoxDuetContextWrapper");
            this.f56402e = sandBoxDuetContextWrapper4.f56568d;
            SandBoxDuetContextWrapper sandBoxDuetContextWrapper5 = cVar.f56367b.f56517e;
            C7573i.m23582a((Object) sandBoxDuetContextWrapper5, "recorderContext.sandBoxDuetContextWrapper");
            this.f56403f = sandBoxDuetContextWrapper5.f56569e;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$d */
    public static final class C20987d implements C15430g {

        /* renamed from: a */
        final /* synthetic */ C20983c f56404a;

        /* renamed from: b */
        private final String f56405b;

        /* renamed from: c */
        private final String f56406c;

        /* renamed from: d */
        private final float f56407d;

        /* renamed from: e */
        private final boolean f56408e;

        /* renamed from: f */
        private final int f56409f;

        /* renamed from: g */
        private final int f56410g;

        /* renamed from: h */
        private final int f56411h;

        /* renamed from: a */
        public final String mo38975a() {
            return this.f56405b;
        }

        /* renamed from: b */
        public final String mo38976b() {
            return this.f56406c;
        }

        /* renamed from: c */
        public final float mo38977c() {
            return this.f56407d;
        }

        /* renamed from: d */
        public final boolean mo38978d() {
            return this.f56408e;
        }

        /* renamed from: e */
        public final int mo38979e() {
            return this.f56409f;
        }

        /* renamed from: f */
        public final int mo38980f() {
            return this.f56410g;
        }

        /* renamed from: g */
        public final int mo38981g() {
            return this.f56411h;
        }

        C20987d(C20983c cVar) {
            this.f56404a = cVar;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper = cVar.f56367b.f56516d;
            C7573i.m23582a((Object) sandBoxReactionContextWrapper, "recorderContext.sandBoxReactionContextWrapper");
            this.f56405b = sandBoxReactionContextWrapper.f56570a;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper2 = cVar.f56367b.f56516d;
            C7573i.m23582a((Object) sandBoxReactionContextWrapper2, "recorderContext.sandBoxReactionContextWrapper");
            this.f56406c = sandBoxReactionContextWrapper2.f56571b;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper3 = cVar.f56367b.f56516d;
            C7573i.m23582a((Object) sandBoxReactionContextWrapper3, "recorderContext.sandBoxReactionContextWrapper");
            this.f56407d = sandBoxReactionContextWrapper3.f56572c;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper4 = cVar.f56367b.f56516d;
            C7573i.m23582a((Object) sandBoxReactionContextWrapper4, "recorderContext.sandBoxReactionContextWrapper");
            this.f56408e = sandBoxReactionContextWrapper4.f56573d;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper5 = cVar.f56367b.f56516d;
            C7573i.m23582a((Object) sandBoxReactionContextWrapper5, "recorderContext.sandBoxReactionContextWrapper");
            this.f56409f = sandBoxReactionContextWrapper5.f56574e;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper6 = cVar.f56367b.f56516d;
            C7573i.m23582a((Object) sandBoxReactionContextWrapper6, "recorderContext.sandBoxReactionContextWrapper");
            this.f56410g = sandBoxReactionContextWrapper6.f56575f;
            SandBoxReactionContextWrapper sandBoxReactionContextWrapper7 = cVar.f56367b.f56516d;
            C7573i.m23582a((Object) sandBoxReactionContextWrapper7, "recorderContext.sandBoxReactionContextWrapper");
            this.f56411h = sandBoxReactionContextWrapper7.f56576g;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.c$e */
    public static final class C20988e implements C20733d {

        /* renamed from: a */
        final /* synthetic */ C20983c f56412a;

        /* renamed from: b */
        private final File f56413b;

        /* renamed from: c */
        private final File f56414c;

        /* renamed from: d */
        private final File f56415d;

        /* renamed from: e */
        private final File f56416e;

        /* renamed from: f */
        private final File f56417f;

        /* renamed from: a */
        public final File mo38982a() {
            return this.f56414c;
        }

        /* renamed from: b */
        public final File mo38984b() {
            return this.f56415d;
        }

        /* renamed from: c */
        public final File mo38986c() {
            return this.f56416e;
        }

        /* renamed from: d */
        public final File mo38987d() {
            return this.f56417f;
        }

        /* renamed from: e */
        public final File mo38988e() {
            return this.f56413b;
        }

        /* renamed from: a */
        public final String mo38983a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(File.separator);
            sb.append(i);
            sb.append(".mp4");
            return sb.toString();
        }

        /* renamed from: b */
        public final String mo38985b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(File.separator);
            sb.append(i);
            sb.append(".wav");
            return sb.toString();
        }

        C20988e(C20983c cVar) {
            this.f56412a = cVar;
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper = cVar.f56367b.f56515c;
            C7573i.m23582a((Object) sandBoxWorkspaceProviderWrapper, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56413b = new File(sandBoxWorkspaceProviderWrapper.f56577a);
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper2 = cVar.f56367b.f56515c;
            C7573i.m23582a((Object) sandBoxWorkspaceProviderWrapper2, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56414c = new File(sandBoxWorkspaceProviderWrapper2.f56577a);
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper3 = cVar.f56367b.f56515c;
            C7573i.m23582a((Object) sandBoxWorkspaceProviderWrapper3, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56415d = new File(sandBoxWorkspaceProviderWrapper3.f56578b);
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper4 = cVar.f56367b.f56515c;
            C7573i.m23582a((Object) sandBoxWorkspaceProviderWrapper4, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56416e = new File(sandBoxWorkspaceProviderWrapper4.f56579c);
            SandBoxWorkspaceProviderWrapper sandBoxWorkspaceProviderWrapper5 = cVar.f56367b.f56515c;
            C7573i.m23582a((Object) sandBoxWorkspaceProviderWrapper5, "recorderContext.sandBoxWorkspaceProviderWrapper");
            this.f56417f = new File(sandBoxWorkspaceProviderWrapper5.f56580d);
        }
    }

    /* renamed from: a */
    public final Boolean mo38918a() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo38919b() {
        return false;
    }

    /* renamed from: c */
    public final SurfaceHolder mo38920c() {
        return null;
    }

    /* renamed from: d */
    public final C20733d mo38921d() {
        return this.f56369d;
    }

    /* renamed from: e */
    public final Pair<Integer, Integer> mo38922e() {
        return this.f56374i;
    }

    /* renamed from: f */
    public final boolean mo38923f() {
        return this.f56375j;
    }

    /* renamed from: g */
    public final boolean mo38924g() {
        return this.f56376k;
    }

    /* renamed from: h */
    public final boolean mo38925h() {
        return this.f56379n;
    }

    /* renamed from: i */
    public final boolean mo38926i() {
        return this.f56380o;
    }

    /* renamed from: j */
    public final C15428f mo38927j() {
        return this.f56373h;
    }

    /* renamed from: k */
    public final C15430g mo38928k() {
        return this.f56372g;
    }

    /* renamed from: l */
    public final C15424d mo38929l() {
        return this.f56371f;
    }

    /* renamed from: m */
    public final C15422c mo38930m() {
        return this.f56370e;
    }

    /* renamed from: n */
    public final boolean mo38931n() {
        return this.f56368c;
    }

    /* renamed from: o */
    public final C21053p mo38932o() {
        return this.f56366a;
    }

    /* renamed from: p */
    public final boolean mo38933p() {
        return this.f56377l;
    }

    /* renamed from: q */
    public final boolean mo38934q() {
        return this.f56378m;
    }

    public C20983c(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) {
        C7573i.m23587b(aSSandBoxRecorderContextWrapper, "recorderContext");
        this.f56367b = aSSandBoxRecorderContextWrapper;
    }
}
