package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12626i;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12640l;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment.C38650a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38892aa;
import com.p280ss.android.ugc.aweme.shortvideo.cut.scene.C38951an;
import com.p280ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39326d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.story.shootvideo.C42017d;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity */
public final class VECutVideoActivity extends AmeActivity {

    /* renamed from: b */
    public static final C38648a f100410b = new C38648a(null);

    /* renamed from: d */
    private static final String f100411d = VECutVideoActivity.class.getSimpleName();

    /* renamed from: a */
    public C38951an f100412a;

    /* renamed from: c */
    private CutVideoViewModel f100413c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity$a */
    public static final class C38648a {
        private C38648a() {
        }

        /* renamed from: a */
        public final void mo96676a(Context context, Intent intent) {
            m123460a(context, intent, -1);
        }

        public /* synthetic */ C38648a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m123460a(Context context, Intent intent, int i) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(intent, "intent");
            intent.setClass(context, VECutVideoActivity.class);
            if (i == -1 || !(context instanceof Activity)) {
                context.startActivity(intent);
            } else {
                ((Activity) context).startActivityForResult(intent, i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity$b */
    static final class C38649b implements C12640l {

        /* renamed from: a */
        final /* synthetic */ VECutVideoActivity f100414a;

        C38649b(VECutVideoActivity vECutVideoActivity) {
            this.f100414a = vECutVideoActivity;
        }

        /* renamed from: a */
        public final C12629j mo31032a(ClassLoader classLoader, String str, Bundle bundle) {
            C7573i.m23587b(classLoader, "<anonymous parameter 0>");
            C7573i.m23587b(str, "className");
            if (C7573i.m23585a((Object) C38951an.class.getName(), (Object) str)) {
                return VECutVideoActivity.m123455a(this.f100414a);
            }
            return null;
        }
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.ayd);
    }

    /* renamed from: a */
    private final void m123456a() {
        CutVideoViewModel cutVideoViewModel = this.f100413c;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        Serializable q = cutVideoViewModel.mo97164q();
        if (q == null) {
            return;
        }
        if (q != null) {
            startActivity(new Intent(this, (Class) q));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
    }

    public final void finish() {
        super.finish();
        if (C35563c.f93231M.mo93305a(Property.EnableCutVideoSceneRefactor)) {
            m123456a();
            return;
        }
        Fragment a = getSupportFragmentManager().mo2642a((int) R.id.cuv);
        if (a != null && (a instanceof VECutVideoFragment)) {
            ((VECutVideoFragment) a).mo96685I();
        }
    }

    public final void onBackPressed() {
        if (C35563c.f93231M.mo93305a(Property.EnableCutVideoSceneRefactor)) {
            CutVideoViewModel cutVideoViewModel = this.f100413c;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            cutVideoViewModel.mo29069f();
            return;
        }
        Fragment a = getSupportFragmentManager().mo2642a((int) R.id.cuv);
        if (a == null || !(a instanceof VECutVideoFragment)) {
            super.onBackPressed();
        } else {
            ((VECutVideoFragment) a).mo96679C();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C38951an m123455a(VECutVideoActivity vECutVideoActivity) {
        C38951an anVar = vECutVideoActivity.f100412a;
        if (anVar == null) {
            C7573i.m23583a("cutVideoRootScene");
        }
        return anVar;
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onEvent(C39326d dVar) {
        C7573i.m23587b(dVar, "event");
        finish();
    }

    /* renamed from: b */
    private final boolean m123458b(Bundle bundle) {
        if (!m123459c(bundle)) {
            return false;
        }
        this.f100412a = new C38951an();
        C12626i.m36626a((Activity) this, C38951an.class).mo30989a(false).mo30988a((C12640l) new C38649b(this)).mo30991b(false).mo30992c(false).mo30987a((int) R.id.cuv).mo30990a();
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (C35563c.f93231M.mo93305a(Property.EnableCutVideoSceneRefactor)) {
            CutVideoViewModel cutVideoViewModel = this.f100413c;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo97163p() && bundle != null) {
                String str = "workspace";
                CutVideoViewModel cutVideoViewModel2 = this.f100413c;
                if (cutVideoViewModel2 == null) {
                    C7573i.m23583a("cutVideoViewModel");
                }
                bundle.putParcelable(str, cutVideoViewModel2.mo97156h().f101006j);
            }
        }
    }

    /* renamed from: a */
    private final boolean m123457a(Bundle bundle) {
        List list;
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            ArrayList arrayList = new ArrayList();
            C33153d a = C33153d.m106972a();
            if (a != null) {
                list = a.mo84910c();
            } else {
                list = null;
            }
            if (list != null) {
                C33153d a2 = C33153d.m106972a();
                C7573i.m23582a((Object) a2, "MediaManager.instance()");
                arrayList = (ArrayList) a2.mo84910c();
            }
            String stringExtra = getIntent().getStringExtra("file_path");
            if (getIntent().hasExtra("open_sdk_import_media_list")) {
                arrayList = getIntent().getParcelableArrayListExtra("open_sdk_import_media_list");
                C7573i.m23582a((Object) arrayList, "intent.getParcelableArra…PEN_SDK_IMPORT_MEDIALIST)");
            }
            boolean z = false;
            if (!TextUtils.isEmpty(stringExtra) || !arrayList.isEmpty()) {
                String str = "is_multi_mode";
                if (arrayList.size() > 1) {
                    z = true;
                }
                bundle2.putBoolean(str, z);
                bundle2.putString("single_video_path", stringExtra);
                bundle2.putParcelableArrayList("multi_video_path_list", arrayList);
                bundle2.putParcelable("page_intent_data", getIntent());
                getSupportFragmentManager().mo2645a().mo2585a((int) R.id.cuv, (Fragment) C38650a.m123512a(bundle2)).mo2604c();
            } else {
                finish();
                return false;
            }
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        if (C7573i.m23585a((Object) "system_upload", (Object) getIntent().getStringExtra("shoot_way"))) {
            C39182e.m125095a(false);
            C39193g.m125128a(getIntent().getStringExtra("shoot_way"), getIntent().getStringExtra("creation_id"));
        }
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        if (C39805en.m127445a()) {
            VECutVideoActivity vECutVideoActivity = this;
            vECutVideoActivity.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            C39805en.m127444a((Activity) vECutVideoActivity);
            if (VERSION.SDK_INT >= 21) {
                Window window = vECutVideoActivity.getWindow();
                C7573i.m23582a((Object) window, "window");
                window.setNavigationBarColor(-16777216);
            }
        } else if (getIntent() == null || C42017d.m133561a(getIntent().getIntExtra("shoot_mode", -1))) {
            getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
        } else if (!C22911a.m75401a(this)) {
            C23487o.m77136a((Activity) this);
        }
        setContentView((int) R.layout.b8);
        JediViewModel a = C36113b.m116288a(this).mo91871a(CutVideoViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java)");
        this.f100413c = (CutVideoViewModel) a;
        if (C35563c.f93231M.mo93305a(Property.EnableCutVideoSceneRefactor)) {
            if (!m123458b(bundle)) {
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
                return;
            }
        } else if (!m123457a(bundle)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
    }

    /* renamed from: c */
    private final boolean m123459c(Bundle bundle) {
        List list;
        Workspace workspace;
        AVChallenge aVChallenge;
        C38892aa aaVar = new C38892aa();
        CutVideoViewModel cutVideoViewModel = this.f100413c;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        cutVideoViewModel.mo97154a(aaVar);
        ArrayList arrayList = new ArrayList();
        C33153d a = C33153d.m106972a();
        MicroAppModel microAppModel = null;
        if (a != null) {
            list = a.mo84910c();
        } else {
            list = null;
        }
        if (list != null) {
            C33153d a2 = C33153d.m106972a();
            C7573i.m23582a((Object) a2, "MediaManager.instance()");
            arrayList = (ArrayList) a2.mo84910c();
        }
        String stringExtra = getIntent().getStringExtra("file_path");
        if (getIntent().hasExtra("open_sdk_import_media_list")) {
            arrayList = getIntent().getParcelableArrayListExtra("open_sdk_import_media_list");
            C7573i.m23582a((Object) arrayList, "intent.getParcelableArra…PEN_SDK_IMPORT_MEDIALIST)");
        }
        if (!TextUtils.isEmpty(stringExtra) || !arrayList.isEmpty()) {
            aaVar.mo97167a(arrayList);
            aaVar.f100998b = stringExtra;
            aaVar.f100999c = C42017d.m133561a(getIntent().getIntExtra("shoot_mode", -1));
            aaVar.f101000d = getIntent().getLongExtra("min_duration", C39810eq.m127460a());
            if (bundle == null) {
                workspace = Workspace.m122801a();
            } else {
                workspace = (Workspace) bundle.getParcelable("workspace");
            }
            aaVar.f101006j = workspace;
            String stringExtra2 = getIntent().getStringExtra("path");
            if (!TextUtils.isEmpty(stringExtra2)) {
                Workspace workspace2 = aaVar.f101006j;
                if (workspace2 != null) {
                    workspace2.mo96312a(new File(stringExtra2));
                }
            }
            if (getIntent().getSerializableExtra("av_challenge") == null) {
                aVChallenge = null;
            } else {
                Serializable serializableExtra = getIntent().getSerializableExtra("av_challenge");
                if (serializableExtra != null) {
                    aVChallenge = (AVChallenge) serializableExtra;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVChallenge");
                }
            }
            aaVar.f101001e = aVChallenge;
            aaVar.f101002f = getIntent().getStringExtra("micro_app_id");
            if (getIntent().getSerializableExtra("micro_app_info") != null) {
                Serializable serializableExtra2 = getIntent().getSerializableExtra("micro_app_info");
                if (serializableExtra2 != null) {
                    microAppModel = (MicroAppModel) serializableExtra2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel");
                }
            }
            aaVar.f101003g = microAppModel;
            aaVar.f101004h = getIntent().getSerializableExtra("micro_app_class");
            aaVar.f101005i = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
            aaVar.f101007k = (ShareContext) getIntent().getSerializableExtra("extra_share_context");
            aaVar.f101008l = getIntent().getStringExtra("shoot_way");
            aaVar.f101009m = getIntent().getBooleanExtra("from_background_video", false);
            aaVar.f101010n = getIntent().getLongExtra("background_video_max_length", C40413c.f105051b);
            aaVar.f101011o = getIntent().getStringExtra("creation_id");
            return true;
        }
        finish();
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (C35563c.f93231M.mo93305a(Property.EnableCutVideoSceneRefactor)) {
            C38951an anVar = this.f100412a;
            if (anVar == null) {
                C7573i.m23583a("cutVideoRootScene");
            }
            anVar.mo97243a(i, i2, intent);
        } else {
            Fragment a = getSupportFragmentManager().mo2642a((int) R.id.cuv);
            if (a != null && (a instanceof VECutVideoFragment)) {
                a.onActivityResult(i, i2, intent);
            }
        }
        if (i == 1002) {
            Intent intent2 = new Intent();
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    C7573i.m23580a();
                }
                String string = extras.getString("edit result");
                String str = "record result";
                StringBuilder sb = new StringBuilder("RecordActivity return success ");
                if (string == null) {
                    C7573i.m23580a();
                }
                sb.append(string);
                intent2.putExtra(str, sb.toString());
            }
            setResult(-1, intent2);
            finish();
            return;
        }
        if (i == 4 && i2 == 7) {
            setResult(7, intent);
            finish();
        }
    }
}
