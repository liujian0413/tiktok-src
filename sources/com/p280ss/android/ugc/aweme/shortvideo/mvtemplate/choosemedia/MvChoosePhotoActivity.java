package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.support.p022v4.widget.Space;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23369a;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.photo.local.MediaTypeNavigator;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C40116b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40169b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40170c;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40177e;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.C40180a;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.C40182c;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.C45333p;
import com.p280ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity */
public class MvChoosePhotoActivity extends AmeActivity {

    /* renamed from: A */
    private MediaTypeNavigator f104191A;

    /* renamed from: B */
    private ViewPagerBottomSheetBehavior f104192B;

    /* renamed from: C */
    private int f104193C;

    /* renamed from: D */
    private int f104194D;

    /* renamed from: E */
    private int f104195E;

    /* renamed from: F */
    private int f104196F;

    /* renamed from: G */
    private Parcelable f104197G;

    /* renamed from: H */
    private int f104198H;

    /* renamed from: I */
    private boolean f104199I;

    /* renamed from: J */
    private boolean f104200J;

    /* renamed from: K */
    private String f104201K;

    /* renamed from: L */
    private long f104202L;

    /* renamed from: M */
    private long f104203M = -1;

    /* renamed from: N */
    private C40128b f104204N;

    /* renamed from: O */
    private C40116b f104205O;

    /* renamed from: P */
    private C40116b f104206P;

    /* renamed from: Q */
    private boolean f104207Q = true;

    /* renamed from: R */
    private long f104208R;

    /* renamed from: S */
    private long f104209S;

    /* renamed from: T */
    private C40129c f104210T;

    /* renamed from: a */
    public MvChoosePhotoFragment f104211a;

    /* renamed from: b */
    public ChooseVideoFragment f104212b;

    /* renamed from: c */
    public int f104213c;

    /* renamed from: d */
    public int f104214d;

    /* renamed from: e */
    public int f104215e;

    /* renamed from: f */
    public int f104216f;

    /* renamed from: g */
    public String f104217g;

    /* renamed from: h */
    public ArrayList<MediaModel> f104218h = new ArrayList<>();

    /* renamed from: i */
    public SdkExtraInfo f104219i;

    /* renamed from: j */
    public ShortVideoContext f104220j;

    /* renamed from: k */
    public int f104221k;

    /* renamed from: l */
    public int f104222l = -1;

    /* renamed from: m */
    public int f104223m = -1;

    /* renamed from: n */
    public int f104224n;

    /* renamed from: o */
    public int f104225o;

    /* renamed from: p */
    public List<MyMediaModel> f104226p;

    /* renamed from: q */
    public List<MyMediaModel> f104227q;

    /* renamed from: r */
    public int f104228r = 0;

    /* renamed from: s */
    public int f104229s = 0;

    /* renamed from: t */
    public C40180a f104230t;

    /* renamed from: u */
    public C45333p f104231u = new C45333p();

    /* renamed from: v */
    private TextView f104232v;

    /* renamed from: w */
    private DmtTextView f104233w;

    /* renamed from: x */
    private View f104234x;

    /* renamed from: y */
    private MvChooseAlbumFragment f104235y;

    /* renamed from: z */
    private ViewPager f104236z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$a */
    class C40107a extends FragmentPagerAdapter {
        public final int getCount() {
            return MvChoosePhotoActivity.this.f104221k;
        }

        /* renamed from: a */
        public final Fragment mo2423a(int i) {
            if (i == MvChoosePhotoActivity.this.f104222l) {
                return MvChoosePhotoActivity.this.f104212b;
            }
            return MvChoosePhotoActivity.this.f104211a;
        }

        C40107a(C0608j jVar) {
            super(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$b */
    public interface C40108b {
        /* renamed from: a */
        void mo99838a(boolean z);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo99821a(boolean z) {
        if (z) {
            int c = m128159c(this.f104218h.size());
            if (C40173d.f104443a.mo99939a(this.f104225o)) {
                c = this.f104230t.mo99930a(this.f104224n, this.f104225o);
            }
            if (c != 1 || this.f104210T == null) {
                this.f104210T = m128162d(c);
            }
            Intent intent = new Intent();
            intent.putExtra("key_choose_media_data", this.f104218h);
            intent.putExtra("key_mv_resource_zip_path", this.f104217g);
            intent.putExtra("key_select_mv_data", this.f104197G);
            intent.putExtra("key_short_video_context", this.f104220j);
            Bundle bundle = null;
            if (this.f104204N != null) {
                bundle = this.f104204N.mo99884a();
            }
            if (bundle != null) {
                intent.putExtra("key_extra_info", bundle);
            }
            this.f104210T.mo88198a(this.f104195E, -1, intent);
            m128168k();
            return;
        }
        finish();
        overridePendingTransition(0, R.anim.t);
    }

    /* renamed from: b */
    public final void mo99822b() {
        if (this.f104207Q) {
            this.f104209S = System.currentTimeMillis();
            this.f104207Q = false;
        }
    }

    /* renamed from: c */
    public final void mo99825c() {
        finish();
        overridePendingTransition(0, R.anim.t);
    }

    /* renamed from: j */
    private void m128167j() {
        this.f104205O = new C40116b() {
            /* renamed from: a */
            public final boolean mo99836a() {
                if (C40173d.f104443a.mo99939a(MvChoosePhotoActivity.this.f104225o)) {
                    if (MvChoosePhotoActivity.this.f104230t == null || C23477d.m77081a((Collection<T>) MvChoosePhotoActivity.this.f104230t.mo99933a()) || MvChoosePhotoActivity.this.f104230t.mo99933a().size() < MvChoosePhotoActivity.this.f104213c) {
                        return false;
                    }
                    return true;
                } else if (MvChoosePhotoActivity.this.f104228r >= MvChoosePhotoActivity.this.f104213c) {
                    return true;
                } else {
                    return false;
                }
            }

            /* renamed from: a */
            public final void mo99834a(MediaModel mediaModel) {
                if (mediaModel.f88164j < MvChoosePhotoActivity.this.f104216f || mediaModel.f88163i < MvChoosePhotoActivity.this.f104215e) {
                    C10761a.m31396b((Context) MvChoosePhotoActivity.this, MvChoosePhotoActivity.this.getResources().getString(R.string.cua), 0).mo25750a();
                    return;
                }
                MvChoosePhotoActivity.this.mo99822b();
                if (MvChoosePhotoActivity.this.f104225o != 3 || C40173d.m128357b(mediaModel.f88156b)) {
                    MvChoosePhotoActivity.this.f104218h.clear();
                    MvChoosePhotoActivity.this.f104218h.add(mediaModel);
                    MvChoosePhotoActivity.this.f104224n = 3;
                    MvChoosePhotoActivity.this.mo99821a(true);
                    return;
                }
                C10761a.m31396b((Context) MvChoosePhotoActivity.this, MvChoosePhotoActivity.this.getResources().getString(R.string.c8b), 0).mo25750a();
            }

            /* renamed from: a */
            public final void mo99835a(List<MyMediaModel> list) {
                int i;
                if (C23477d.m77081a((Collection<T>) list)) {
                    i = 0;
                } else {
                    i = list.size();
                }
                if (MvChoosePhotoActivity.this.f104228r < i) {
                    MvChoosePhotoActivity.m128156a("choose_upload_content");
                }
                MvChoosePhotoActivity.this.f104228r = i;
                MvChoosePhotoActivity.this.f104226p = list;
                MvChoosePhotoActivity.this.mo99820a(list);
            }

            /* renamed from: a */
            public final boolean mo99837a(String str) {
                if (MvChoosePhotoActivity.this.f104219i == null || !MvChoosePhotoActivity.this.f104219i.isLegal()) {
                    return true;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                MvChoosePhotoActivity.this.f104231u.mo108544a(MvChoosePhotoActivity.this.f104217g, str, MvChoosePhotoActivity.this.f104219i.getPl().getAlg(), (IDetectImageResultListener) new C40146s(atomicBoolean));
                if (!atomicBoolean.get()) {
                    MvChoosePhotoActivity.this.mo99817a();
                }
                return atomicBoolean.get();
            }

            /* renamed from: a */
            public final int mo99833a(MyMediaModel myMediaModel, boolean z) {
                MvChoosePhotoActivity.this.mo99822b();
                if (C40173d.f104443a.mo99939a(MvChoosePhotoActivity.this.f104225o) && myMediaModel != null) {
                    return MvChoosePhotoActivity.this.f104230t.mo99931a(myMediaModel, z, false);
                }
                if (C23477d.m77081a((Collection<T>) MvChoosePhotoActivity.this.f104226p)) {
                    return 1;
                }
                return MvChoosePhotoActivity.this.f104226p.size();
            }
        };
        this.f104206P = new C40116b() {
            /* renamed from: a */
            public final boolean mo99837a(String str) {
                return true;
            }

            /* renamed from: a */
            public final boolean mo99836a() {
                if (C40173d.f104443a.mo99939a(MvChoosePhotoActivity.this.f104225o)) {
                    if (MvChoosePhotoActivity.this.f104230t == null || C23477d.m77081a((Collection<T>) MvChoosePhotoActivity.this.f104230t.mo99933a()) || MvChoosePhotoActivity.this.f104230t.mo99933a().size() < MvChoosePhotoActivity.this.f104214d) {
                        return false;
                    }
                    return true;
                } else if (MvChoosePhotoActivity.this.f104229s >= MvChoosePhotoActivity.this.f104214d) {
                    return true;
                } else {
                    return false;
                }
            }

            /* renamed from: a */
            public final void mo99834a(MediaModel mediaModel) {
                MvChoosePhotoActivity.this.f104218h.clear();
                MvChoosePhotoActivity.this.f104218h.add(mediaModel);
                MvChoosePhotoActivity.this.f104224n = 2;
                MvChoosePhotoActivity.this.mo99822b();
                MvChoosePhotoActivity.this.mo99821a(true);
            }

            /* renamed from: a */
            public final void mo99835a(List<MyMediaModel> list) {
                int i;
                if (C23477d.m77081a((Collection<T>) list)) {
                    i = 0;
                } else {
                    i = list.size();
                }
                if (MvChoosePhotoActivity.this.f104229s < i) {
                    MvChoosePhotoActivity.m128158b(list);
                }
                MvChoosePhotoActivity.this.f104229s = i;
                MvChoosePhotoActivity.this.f104227q = list;
                MvChoosePhotoActivity.this.mo99820a(list);
            }

            /* renamed from: a */
            public final int mo99833a(MyMediaModel myMediaModel, boolean z) {
                MvChoosePhotoActivity.this.mo99822b();
                if (C40173d.f104443a.mo99939a(MvChoosePhotoActivity.this.f104225o) && myMediaModel != null) {
                    return MvChoosePhotoActivity.this.f104230t.mo99931a(myMediaModel, z, true);
                }
                if (C23477d.m77081a((Collection<T>) MvChoosePhotoActivity.this.f104227q)) {
                    return 1;
                }
                return MvChoosePhotoActivity.this.f104227q.size();
            }
        };
        this.f104211a.f104138g = this.f104205O;
        this.f104212b.mo99804a(this.f104206P);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo99827d() {
        this.f104218h.clear();
        this.f104218h.addAll(this.f104230t.mo99933a());
        mo99821a(true);
    }

    /* renamed from: g */
    private void m128164g() {
        this.f104192B = ViewPagerBottomSheetBehavior.m76628a(findViewById(R.id.a7r));
        this.f104192B.f61460k = new C23369a() {
            /* renamed from: a */
            public final void mo60691a(View view, float f) {
            }

            /* renamed from: a */
            public final void mo60692a(View view, int i) {
                if (i == 5) {
                    MvChoosePhotoActivity.this.finish();
                    MvChoosePhotoActivity.this.overridePendingTransition(0, 0);
                }
            }
        };
        this.f104192B.mo60679a(C23482j.m77095a(this) + C23482j.m77104e(this));
        this.f104192B.f61453d = true;
        this.f104192B.mo60680a(this.f104236z);
    }

    /* renamed from: k */
    private void m128168k() {
        C42962b.f111525a.mo104671a("upload_page_duration", C22984d.m75611a().mo59971a("first_selection_duration", System.currentTimeMillis() - this.f104209S).mo59971a("page_stay_duration", System.currentTimeMillis() - this.f104208R).f60753a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo99828e() {
        int measuredWidth = this.f104232v.getMeasuredWidth();
        this.f104233w.setMaxWidth((C23482j.m77098b(this) - (measuredWidth * 2)) - ((int) C9738o.m28708b((Context) this, 60.0f)));
        this.f104232v.setVisibility(8);
        this.f104232v.setTextSize(1, 17.0f);
    }

    /* renamed from: f */
    private void m128163f() {
        this.f104232v.setVisibility(0);
        if (C6399b.m19944t() && !"en".equals(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage())) {
            this.f104232v.setTextSize(1, 13.0f);
        }
        this.f104232v.setText(C1642a.m8034a(getString(R.string.bav), new Object[]{Integer.valueOf(12)}));
        this.f104232v.post(new C40141n(this));
    }

    /* renamed from: i */
    private void m128166i() {
        boolean z;
        this.f104211a.f104243o = this.f104201K;
        this.f104211a.mo99796a(this.f104213c);
        this.f104211a.f104244p = this.f104200J;
        MvChoosePhotoFragment mvChoosePhotoFragment = this.f104211a;
        boolean z2 = false;
        if (this.f104224n == 1) {
            z = true;
        } else {
            z = false;
        }
        mvChoosePhotoFragment.f104144m = z;
        this.f104212b.mo99796a(this.f104214d);
        this.f104212b.f104151q = this.f104199I;
        this.f104212b.f104153s = this.f104202L;
        MvChoosePhotoFragment mvChoosePhotoFragment2 = this.f104211a;
        if (this.f104224n == 1) {
            z2 = true;
        }
        mvChoosePhotoFragment2.f104144m = z2;
        ArrayList arrayList = new ArrayList();
        if (this.f104195E == 2) {
            Intent intent = getIntent();
            if (intent != null) {
                arrayList.addAll(intent.getStringArrayListExtra("key_selected_video_path"));
            }
            this.f104212b.mo99798a((List<String>) arrayList);
            this.f104211a.mo99798a((List<String>) arrayList);
        }
        this.f104233w.setText(getResources().getString(R.string.hs));
        Fragment a = getSupportFragmentManager().mo2644a("album_Fragment");
        if (a == null) {
            this.f104235y = new MvChooseAlbumFragment();
            getSupportFragmentManager().mo2645a().mo2586a(R.id.aoy, this.f104235y, "album_Fragment").mo2604c();
        } else {
            this.f104235y = (MvChooseAlbumFragment) a;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_support_flag", this.f104198H);
        this.f104235y.setArguments(bundle);
        findViewById(R.id.us).setOnClickListener(new C40143p(this));
        this.f104235y.f104178g = new C40144q(this);
        m128167j();
        if (this.f104195E != 2) {
            this.f104212b.mo99803a((C40108b) new C40145r(this));
        }
        if (C40173d.f104443a.mo99939a(this.f104225o)) {
            m128160c((List<String>) arrayList);
        }
    }

    /* renamed from: h */
    private void m128165h() {
        boolean z;
        Intent intent = getIntent();
        this.f104208R = System.currentTimeMillis();
        if (intent != null) {
            this.f104220j = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
            int i = 0;
            this.f104193C = intent.getIntExtra("key_photo_select_min_count", 0);
            this.f104213c = intent.getIntExtra("key_photo_select_max_count", 0);
            this.f104194D = intent.getIntExtra("key_video_select_min_count", 0);
            this.f104214d = intent.getIntExtra("key_video_select_max_count", 0);
            this.f104216f = intent.getIntExtra("upload_photo_min_height", 0);
            this.f104215e = intent.getIntExtra("upload_photo_min_width", 0);
            this.f104217g = intent.getStringExtra("key_mv_resource_zip_path");
            this.f104201K = intent.getStringExtra("key_mv_hint_text");
            this.f104197G = intent.getParcelableExtra("key_select_mv_data");
            this.f104202L = intent.getLongExtra("Key_min_duration", C39810eq.m127460a());
            this.f104203M = intent.getLongExtra("Key_max_duration", -1);
            this.f104225o = intent.getIntExtra("key_choose_scene", -1);
            this.f104195E = intent.getIntExtra("key_choose_request_code", -1);
            this.f104196F = intent.getIntExtra("key_start_activity_request_code", -1);
            if (this.f104225o == 2) {
                this.f104224n = 1;
                this.f104204N = new C40130d();
                String stringExtra = intent.getStringExtra("Key_challenge_id");
                if (stringExtra != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Key_challenge_id", stringExtra);
                    this.f104204N.mo99885a(bundle);
                }
            }
            if (this.f104225o == 3) {
                this.f104224n = 7;
            }
            if (this.f104225o == 4) {
                this.f104224n = 8;
            }
            this.f104198H = intent.getIntExtra("key_support_flag", -1);
            this.f104199I = intent.getBooleanExtra("Key_enable_multi_video", false);
            if ((this.f104198H & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f104200J = z;
            if ((this.f104198H & 4) != 0) {
                this.f104222l = 0;
                this.f104221k++;
            }
            if (!((this.f104198H & 1) == 0 && (this.f104198H & 2) == 0)) {
                this.f104221k++;
                if (this.f104222l == 0) {
                    i = 1;
                }
                this.f104223m = i;
            }
            String stringExtra2 = intent.getStringExtra("key_sdk_extra_data");
            if (!TextUtils.isEmpty(stringExtra2)) {
                this.f104219i = (SdkExtraInfo) C35563c.f93239b.mo15974a(stringExtra2, SdkExtraInfo.class);
                this.f104219i.setMvAlgorithmHint(intent.getStringExtra("key_mv_algorithm_hint"));
            }
        }
    }

    /* renamed from: a */
    public final void mo99817a() {
        new C10741a(this).mo25653a(getResources().getString(R.string.e9k)).mo25660b(this.f104219i.getMvAlgorithmHint()).mo25654a(getResources().getString(R.string.afn), (OnClickListener) null).mo25656a().mo25638b().show();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo99823b(View view) {
        mo99821a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo99826c(View view) {
        mo99821a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99818a(View view) {
        m128161c(!this.f104235y.f104181j);
    }

    /* renamed from: b */
    private static String m128157b(int i) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.edp);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m128158b(List<MyMediaModel> list) {
        long j = 0;
        if (!C23477d.m77081a((Collection<T>) list)) {
            for (MyMediaModel myMediaModel : list) {
                if (myMediaModel != null) {
                    j += myMediaModel.f88159e;
                }
            }
        }
        C6907h.m21524a("choose_upload_content", (Map) C22984d.m75611a().mo59973a("content_type", "sound_sync").mo59973a("upload_type", "multiple_content").mo59971a("duration_ms", j).f60753a);
    }

    /* renamed from: c */
    private int m128159c(int i) {
        if (this.f104224n != 1) {
            int currentItem = this.f104236z.getCurrentItem();
            if (currentItem == this.f104222l) {
                if (this.f104225o == 1) {
                    this.f104224n = 6;
                } else {
                    this.f104224n = 2;
                }
            } else if (currentItem == this.f104223m) {
                if (this.f104225o == 1) {
                    this.f104224n = 5;
                } else {
                    this.f104224n = 3;
                }
            }
            if (this.f104224n == 3 && (i > 1 || (this.f104198H & 1) == 0)) {
                this.f104224n = 4;
            }
        }
        return this.f104224n;
    }

    /* renamed from: d */
    private C40129c m128162d(int i) {
        int i2;
        if (this.f104225o == 3) {
            i = 7;
        }
        if (this.f104225o == 4) {
            i2 = 8;
        } else {
            i2 = i;
        }
        return ((IMediaChosenResultProcessFactory) ServiceManager.get().getService(IMediaChosenResultProcessFactory.class)).create(this, i2, this.f104202L, this.f104203M);
    }

    /* renamed from: a */
    private void m128153a(int i) {
        String str;
        if (m128159c(i) == 4) {
            if (C6399b.m19944t() && !"en".equals(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage())) {
                this.f104232v.setTextSize(1, 13.0f);
            }
            str = getResources().getString(R.string.bav);
        } else {
            this.f104232v.setTextSize(1, 17.0f);
            str = getResources().getString(R.string.dcb);
        }
        this.f104232v.setText(C1642a.m8034a(str, new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: c */
    private void m128160c(List<String> list) {
        boolean z;
        this.f104230t = new C40170c();
        this.f104230t.mo99934a(findViewById(R.id.bzm));
        C40169b bVar = new C40169b();
        boolean z2 = false;
        if (list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        bVar.f104417d = z;
        if (this.f104224n == 1) {
            z2 = true;
        }
        bVar.f104416c = z2;
        bVar.f104419f = this.f104211a;
        bVar.f104418e = this.f104212b;
        bVar.f104420g = this.f104201K;
        bVar.f104421h = this.f104193C;
        bVar.f104422i = this.f104194D;
        bVar.mo99929a(list);
        bVar.f104415b = new C40142o(this);
        bVar.f104414a = new C40182c() {
            /* renamed from: a */
            public final void mo99830a(int i, int i2) {
            }

            /* renamed from: a */
            public final void mo99831a(MyMediaModel myMediaModel) {
            }

            /* renamed from: a */
            public final void mo99832a(MyMediaModel myMediaModel, View view) {
                if (myMediaModel != null && C7276d.m22812b(myMediaModel.f88156b)) {
                    if (myMediaModel.mo86201c()) {
                        MvChoosePhotoActivity.this.f104212b.mo99807a((MediaModel) myMediaModel, view);
                        return;
                    }
                    Context context = view.getContext();
                    StringBuilder sb = new StringBuilder("file://");
                    sb.append(myMediaModel.f88156b);
                    String sb2 = sb.toString();
                    C35563c.f93240c.mo83126a((Activity) context, view, (((float) C9738o.m28691a(context)) * 1.0f) / ((float) C9738o.m28709b(context)), sb2);
                }
            }
        };
        this.f104230t.mo99935a(bVar);
        this.f104199I = true;
        this.f104200J = true;
        this.f104211a.f104243o = null;
        if (this.f104220j != null) {
            C40177e.m128368a(this.f104220j.f99787w, this.f104220j.f99788x);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo99824b(boolean z) {
        String str;
        String str2;
        String str3;
        String str4 = "change_upload_mode";
        C22984d a = C22984d.m75611a();
        String str5 = "creation_id";
        if (this.f104220j != null) {
            str = this.f104220j.f99787w;
        } else {
            str = "";
        }
        C22984d a2 = a.mo59973a(str5, str);
        String str6 = "shoot_way";
        if (this.f104220j != null) {
            str2 = this.f104220j.f99788x;
        } else {
            str2 = "";
        }
        C22984d a3 = a2.mo59973a(str6, str2);
        String str7 = "to_status";
        if (z) {
            str3 = "multiple";
        } else {
            str3 = "single";
        }
        C6907h.m21524a(str4, (Map) a3.mo59973a(str7, str3).f60753a);
    }

    /* renamed from: a */
    public static void m128156a(String str) {
        C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("content_source", "upload").mo59973a("content_type", "mv").mo59973a("upload_type", "multiple_content").f60753a);
    }

    /* renamed from: c */
    private void m128161c(boolean z) {
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f104234x, "rotation", new float[]{0.0f, 180.0f});
            ofFloat.setDuration(300);
            ofFloat.start();
        } else {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f104234x, "rotation", new float[]{180.0f, 0.0f});
            ofFloat2.setDuration(300);
            ofFloat2.start();
        }
        this.f104235y.mo99814a(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.s, 0);
        setContentView((int) R.layout.dj);
        m128165h();
        this.f104232v = (TextView) findViewById(R.id.dqc);
        this.f104233w = (DmtTextView) findViewById(R.id.e3f);
        this.f104234x = findViewById(R.id.bcy);
        this.f104232v.setOnClickListener(new C40138k(this));
        findViewById(R.id.dke).setOnClickListener(C40139l.f104339a);
        findViewById(R.id.jo).setOnClickListener(new C40140m(this));
        m128163f();
        ((Space) findViewById(R.id.d8v)).setMinimumHeight(C39805en.m127450c(this));
        this.f104236z = (ViewPager) findViewById(R.id.edp);
        this.f104191A = (MediaTypeNavigator) findViewById(R.id.bxn);
        if (this.f104221k == 1) {
            this.f104191A.setVisibility(8);
        }
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a(m128157b(this.f104223m));
        if (a == null) {
            this.f104211a = new MvChoosePhotoFragment();
        } else {
            this.f104211a = (MvChoosePhotoFragment) a;
        }
        Fragment a2 = supportFragmentManager.mo2644a(m128157b(this.f104222l));
        if (a2 == null) {
            this.f104212b = new ChooseVideoFragment();
        } else {
            this.f104212b = (ChooseVideoFragment) a2;
        }
        this.f104212b.f104154t = this.f104225o;
        this.f104236z.setAdapter(new C40107a(getSupportFragmentManager()));
        this.f104236z.addOnPageChangeListener(new SimpleOnPageChangeListener() {
            public final void onPageSelected(int i) {
                String str = "";
                if (i == MvChoosePhotoActivity.this.f104222l) {
                    MvChoosePhotoActivity.this.mo99820a(MvChoosePhotoActivity.this.f104227q);
                    str = "video";
                } else if (i == MvChoosePhotoActivity.this.f104223m) {
                    MvChoosePhotoActivity.this.mo99820a(MvChoosePhotoActivity.this.f104226p);
                    str = "photo";
                }
                if (MvChoosePhotoActivity.this.f104220j != null) {
                    C6907h.m21524a("click_upload_tab", (Map) C22984d.m75611a().mo59973a("creation_id", MvChoosePhotoActivity.this.f104220j.f99787w).mo59973a("shoot_way", MvChoosePhotoActivity.this.f104220j.f99788x).mo59973a("tab_name", str).f60753a);
                }
            }
        });
        this.f104191A.setupWithViewPager(this.f104236z);
        ImageView tabIndicator = this.f104191A.getTabIndicator();
        if (tabIndicator != null) {
            tabIndicator.setBackgroundColor(getResources().getColor(R.color.a12));
        }
        m128164g();
        m128166i();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo99820a(List<MyMediaModel> list) {
        if (C40173d.f104443a.mo99939a(this.f104225o)) {
            this.f104232v.setVisibility(8);
        } else if (C23477d.m77081a((Collection<T>) list)) {
            this.f104232v.setVisibility(8);
        } else {
            int size = list.size();
            this.f104232v.setVisibility(0);
            m128153a(size);
            int currentItem = this.f104236z.getCurrentItem();
            int i = this.f104193C;
            if (currentItem == this.f104222l) {
                i = this.f104194D;
            }
            if (size < i) {
                this.f104232v.setTextColor(getResources().getColor(R.color.a7b));
                this.f104232v.setClickable(false);
            } else {
                this.f104232v.setTextColor(getResources().getColor(R.color.a79));
                this.f104232v.setClickable(true);
            }
            this.f104218h.clear();
            this.f104218h.addAll(list);
            if (C40173d.f104443a.mo99939a(this.f104225o)) {
                this.f104232v.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public static void m128154a(Activity activity, Bundle bundle, int i) {
        Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", 10001);
        activity.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f104196F && (this.f104225o != 4 || i2 == -1)) {
            setResult(i2, intent);
            finish();
        }
    }

    /* renamed from: a */
    public static void m128155a(Activity activity, Bundle bundle, int i, int i2) {
        Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("key_choose_request_code", i);
        intent.putExtra("key_start_activity_request_code", i2);
        activity.startActivityForResult(intent, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99819a(C40109a aVar, boolean z, int i, boolean z2) {
        if (aVar != null) {
            if (!(this.f104223m == -1 || (i & 8) == 0)) {
                this.f104211a.mo99799a(aVar.f104255b, z2);
            }
            if (!(this.f104222l == -1 || (i & 16) == 0)) {
                this.f104212b.mo99799a(aVar.f104256c, z2);
            }
            if (!TextUtils.isEmpty(aVar.f104254a)) {
                this.f104233w.setText(aVar.f104254a);
            }
        }
        if (z) {
            m128161c(false);
            m128156a("select_photo_album");
        }
    }
}
