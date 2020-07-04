package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.C36107z;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PinchImageView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PreviewBoxView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.SwitchModeFrameLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.SwitchModeFrameLayout.C36656a;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.util.C36761s;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity */
public final class CropActivity extends AmeSSActivity implements C36039m, C36046t {

    /* renamed from: f */
    public static final C36133a f94552f = new C36133a(null);

    /* renamed from: a */
    public PinchImageView f94553a;

    /* renamed from: b */
    public PreviewBoxView f94554b;

    /* renamed from: c */
    public String f94555c;

    /* renamed from: d */
    public UrlModel f94556d;

    /* renamed from: e */
    public Rect f94557e;

    /* renamed from: g */
    private SwitchModeFrameLayout f94558g;

    /* renamed from: h */
    private DmtTextView f94559h;

    /* renamed from: i */
    private DmtTextView f94560i;

    /* renamed from: j */
    private TextTitleBar f94561j;

    /* renamed from: k */
    private View f94562k;

    /* renamed from: l */
    private DmtStatusView f94563l;

    /* renamed from: m */
    private C35999a f94564m;

    /* renamed from: n */
    private C36107z f94565n;

    /* renamed from: o */
    private C36011ai f94566o;

    /* renamed from: p */
    private Bitmap f94567p;

    /* renamed from: q */
    private C37121a f94568q;

    /* renamed from: r */
    private int f94569r;

    /* renamed from: s */
    private int f94570s;

    /* renamed from: t */
    private HashMap f94571t;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$a */
    public static final class C36133a {
        private C36133a() {
        }

        public /* synthetic */ C36133a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m116558a(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(str, "originalUrl");
            Intent intent = new Intent(activity, CropActivity.class);
            intent.putExtra("original_url", str);
            intent.putExtra("is_oval", z);
            intent.putExtra("rect_ratio", f);
            intent.putExtra("rect_margin", i);
            intent.putExtra("extra_min_width", i3);
            intent.putExtra("extra_min_height", i4);
            activity.startActivityForResult(intent, i2);
        }

        /* renamed from: a */
        public static void m116559a(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4) {
            C7573i.m23587b(fragment, "fragment");
            C7573i.m23587b(str, "originalUrl");
            Intent intent = new Intent(fragment.getContext(), CropActivity.class);
            intent.putExtra("original_url", str);
            intent.putExtra("is_oval", z);
            intent.putExtra("rect_ratio", f);
            intent.putExtra("rect_margin", i);
            intent.putExtra("extra_min_width", i3);
            intent.putExtra("extra_min_height", i4);
            fragment.startActivityForResult(intent, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$b */
    static final class C36134b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f94572a;

        C36134b(CropActivity cropActivity) {
            this.f94572a = cropActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (CropActivity.m116540a(this.f94572a).getPinchMode() == 0) {
                this.f94572a.setResult(0);
                this.f94572a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$c */
    static final class C36135c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f94573a;

        C36135c(CropActivity cropActivity) {
            this.f94573a = cropActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (CropActivity.m116540a(this.f94573a).getPinchMode() == 0) {
                C1592h.m7853a((Callable<TResult>) new Callable<String>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36135c f94574a;

                    {
                        this.f94574a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public String call() {
                        return this.f94574a.f94573a.mo91971b();
                    }
                }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<String, Void>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36135c f94575a;

                    {
                        this.f94575a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C1592h<String> hVar) {
                        C7573i.m23582a((Object) hVar, "task");
                        if (hVar.mo6882b() && !TextUtils.isEmpty((CharSequence) hVar.mo6890e())) {
                            if (C6399b.m19944t()) {
                                CropActivity cropActivity = this.f94575a.f94573a;
                                Object e = hVar.mo6890e();
                                C7573i.m23582a(e, "task.result");
                                cropActivity.mo91972b((String) e);
                            } else {
                                Intent intent = new Intent();
                                intent.setData(Uri.fromFile(new File((String) hVar.mo6890e())));
                                this.f94575a.f94573a.setResult(-1, intent);
                                this.f94575a.f94573a.finish();
                            }
                        }
                        return null;
                    }
                }, C1592h.f5958b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$d */
    static final class C36138d<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ CropActivity f94576a;

        C36138d(CropActivity cropActivity) {
            this.f94576a = cropActivity;
        }

        public final /* synthetic */ Object call() {
            m116562a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m116562a() {
            C10761a.m31399c((Context) this.f94576a, (int) R.string.cu9).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$e */
    static final class C36139e implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f94577a;

        C36139e(CropActivity cropActivity) {
            this.f94577a = cropActivity;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f94577a.f94557e == null) {
                this.f94577a.f94557e = CropActivity.m116541b(this.f94577a).getVisibleRect();
                CropActivity.m116540a(this.f94577a).setDisplayWindowRect(this.f94577a.f94557e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$f */
    public static final class C36140f extends C36656a {

        /* renamed from: a */
        final /* synthetic */ CropActivity f94578a;

        C36140f(CropActivity cropActivity) {
            this.f94578a = cropActivity;
        }

        /* renamed from: a */
        public final void mo91979a(MotionEvent motionEvent) {
            if (motionEvent == null || motionEvent.getAction() != 0) {
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    if (this.f94578a.f94557e == null) {
                        this.f94578a.f94557e = CropActivity.m116541b(this.f94578a).getVisibleRect();
                    }
                    CropActivity.m116541b(this.f94578a).mo92892a();
                }
                return;
            }
            CropActivity.m116541b(this.f94578a).mo92894b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$g */
    static final class C36141g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CropActivity f94579a;

        C36141g(CropActivity cropActivity) {
            this.f94579a = cropActivity;
        }

        public final void run() {
            CropActivity.m116541b(this.f94579a).mo92892a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$h */
    static final class C36142h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CropActivity f94580a;

        C36142h(CropActivity cropActivity) {
            this.f94580a = cropActivity;
        }

        public final void run() {
            this.f94580a.mo91970a();
            Intent intent = new Intent();
            intent.setData(Uri.fromFile(new File(this.f94580a.f94555c)));
            intent.putExtra("path", this.f94580a.f94556d);
            this.f94580a.setResult(-1, intent);
            this.f94580a.finish();
        }
    }

    /* renamed from: a */
    private View m116539a(int i) {
        if (this.f94571t == null) {
            this.f94571t = new HashMap();
        }
        View view = (View) this.f94571t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f94571t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
        if (z) {
            DmtStatusView dmtStatusView = this.f94563l;
            if (dmtStatusView == null) {
                C7573i.m23583a("mDmtStatusView");
            }
            dmtStatusView.setVisibility(8);
            m116545f();
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C10761a.m31403c((Context) this, str).mo25750a();
        }
    }

    public final void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        C37121a aVar = this.f94568q;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f94568q = null;
    }

    /* renamed from: a */
    public final void mo91970a() {
        if (this.f94568q != null) {
            C37121a aVar = this.f94568q;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (aVar.isShowing()) {
                try {
                    C37121a aVar2 = this.f94568q;
                    if (aVar2 != null) {
                        aVar2.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: d */
    private void m116543d() {
        this.f94564m = new C35999a();
        C35999a aVar = this.f94564m;
        if (aVar != null) {
            aVar.mo80250b(this, null);
        }
        C35999a aVar2 = this.f94564m;
        if (aVar2 != null) {
            aVar2.f94183c = this;
        }
        this.f94565n = new C36107z();
        this.f94566o = new C36011ai();
        C36011ai aiVar = this.f94566o;
        if (aiVar != null) {
            aiVar.f94200a = this;
        }
    }

    /* renamed from: f */
    private void m116545f() {
        if (this.f94568q != null) {
            C37121a aVar = this.f94568q;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (aVar.isShowing()) {
                C37121a aVar2 = this.f94568q;
                if (aVar2 != null) {
                    aVar2.setMessage(getString(R.string.fow));
                }
                C37121a aVar3 = this.f94568q;
                if (aVar3 != null) {
                    aVar3.mo93592b();
                }
                new Handler().postDelayed(new C36142h(this), 500);
            }
        }
    }

    /* renamed from: g */
    private final void m116546g() {
        if (VERSION.SDK_INT >= 19) {
            int a = C10994a.m32204a((Context) this);
            TextTitleBar textTitleBar = this.f94561j;
            if (textTitleBar == null) {
                C7573i.m23583a("mTitleBar");
            }
            LayoutParams layoutParams = textTitleBar.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).topMargin = a;
                TextTitleBar textTitleBar2 = this.f94561j;
                if (textTitleBar2 == null) {
                    C7573i.m23583a("mTitleBar");
                }
                textTitleBar2.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: e */
    private void m116544e() {
        if (this.f94568q == null) {
            this.f94568q = C37121a.m119327a(this, getString(R.string.fpg));
            C37121a aVar = this.f94568q;
            if (aVar != null) {
                aVar.setIndeterminate(false);
            }
            C37121a aVar2 = this.f94568q;
            if (aVar2 != null) {
                aVar2.mo93591a(getResources().getDrawable(R.drawable.un));
            }
        } else {
            C37121a aVar3 = this.f94568q;
            if (aVar3 == null) {
                C7573i.m23580a();
            }
            if (!aVar3.isShowing()) {
                C37121a aVar4 = this.f94568q;
                if (aVar4 != null) {
                    aVar4.show();
                }
                C37121a aVar5 = this.f94568q;
                if (aVar5 != null) {
                    aVar5.mo93590a();
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo91971b() {
        String str;
        File c = C36761s.m118497c();
        PinchImageView pinchImageView = this.f94553a;
        if (pinchImageView == null) {
            C7573i.m23583a("mCoverImage");
        }
        Bitmap bitmap = this.f94567p;
        if (bitmap == null) {
            C7573i.m23583a("originalBitmap");
        }
        Bitmap a = m116538a(pinchImageView, bitmap);
        if (a == null) {
            return null;
        }
        C7573i.m23582a((Object) c, "file");
        boolean saveBitmapToSD = BitmapUtils.saveBitmapToSD(a, c.getParent(), c.getName());
        StringBuilder sb = new StringBuilder("saveToFile:");
        if (saveBitmapToSD) {
            str = c.getAbsolutePath();
        } else {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        sb.append(str);
        if (saveBitmapToSD) {
            return c.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: h */
    private final void m116547h() {
        String stringExtra = getIntent().getStringExtra("original_url");
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            setResult(0);
            return;
        }
        int readPictureDegree = BitmapUtils.readPictureDegree(stringExtra);
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(stringExtra, 1080, 1080);
        if (bitmapFromSD == null) {
            finish();
            setResult(0);
            return;
        }
        Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmapFromSD, readPictureDegree);
        C7573i.m23582a((Object) rotateBitmap, "BitmapUtils.rotateBitmap(bitmap, degree)");
        this.f94567p = rotateBitmap;
        PinchImageView pinchImageView = this.f94553a;
        if (pinchImageView == null) {
            C7573i.m23583a("mCoverImage");
        }
        Bitmap bitmap = this.f94567p;
        if (bitmap == null) {
            C7573i.m23583a("originalBitmap");
        }
        pinchImageView.setImageBitmap(bitmap);
        PreviewBoxView previewBoxView = this.f94554b;
        if (previewBoxView == null) {
            C7573i.m23583a("mCoverWindow");
        }
        previewBoxView.addOnLayoutChangeListener(new C36139e(this));
        SwitchModeFrameLayout switchModeFrameLayout = this.f94558g;
        if (switchModeFrameLayout == null) {
            C7573i.m23583a("mCropContainer");
        }
        switchModeFrameLayout.setIntercepter(new C36140f(this));
        PreviewBoxView previewBoxView2 = this.f94554b;
        if (previewBoxView2 == null) {
            C7573i.m23583a("mCoverWindow");
        }
        previewBoxView2.postDelayed(new C36141g(this), 1000);
    }

    /* renamed from: c */
    private final void m116542c() {
        ConstraintLayout constraintLayout = (ConstraintLayout) m116539a((int) R.id.cwn);
        C7573i.m23582a((Object) constraintLayout, "root_layout");
        this.f94562k = constraintLayout;
        SwitchModeFrameLayout switchModeFrameLayout = (SwitchModeFrameLayout) m116539a((int) R.id.a59);
        C7573i.m23582a((Object) switchModeFrameLayout, "crop_container");
        this.f94558g = switchModeFrameLayout;
        PinchImageView pinchImageView = (PinchImageView) m116539a((int) R.id.b7x);
        C7573i.m23582a((Object) pinchImageView, "iv_cover");
        this.f94553a = pinchImageView;
        PreviewBoxView previewBoxView = (PreviewBoxView) m116539a((int) R.id.b84);
        C7573i.m23582a((Object) previewBoxView, "iv_cover_window");
        this.f94554b = previewBoxView;
        DmtTextView dmtTextView = (DmtTextView) m116539a((int) R.id.dr5);
        C7573i.m23582a((Object) dmtTextView, "tv_cancel");
        this.f94559h = dmtTextView;
        DmtTextView dmtTextView2 = (DmtTextView) m116539a((int) R.id.ds9);
        C7573i.m23582a((Object) dmtTextView2, "tv_confirm");
        this.f94560i = dmtTextView2;
        TextTitleBar textTitleBar = (TextTitleBar) m116539a((int) R.id.djz);
        C7573i.m23582a((Object) textTitleBar, "title_bar");
        this.f94561j = textTitleBar;
        DmtStatusView dmtStatusView = (DmtStatusView) m116539a((int) R.id.dav);
        C7573i.m23582a((Object) dmtStatusView, "status_view");
        this.f94563l = dmtStatusView;
        m116543d();
        boolean booleanExtra = getIntent().getBooleanExtra("is_oval", false);
        this.f94569r = getIntent().getIntExtra("extra_min_width", 0);
        if (this.f94569r == 0) {
            this.f94569r = 250;
        }
        this.f94570s = getIntent().getIntExtra("extra_min_height", 0);
        if (this.f94570s == 0) {
            this.f94570s = 250;
        }
        PreviewBoxView previewBoxView2 = this.f94554b;
        if (previewBoxView2 == null) {
            C7573i.m23583a("mCoverWindow");
        }
        previewBoxView2.mo92891a(booleanExtra ? 1 : 0).mo92890a(getIntent().getFloatExtra("rect_ratio", 1.0f)).mo92893b(getIntent().getIntExtra("rect_margin", 0));
        DmtTextView dmtTextView3 = this.f94559h;
        if (dmtTextView3 == null) {
            C7573i.m23583a("mCancel");
        }
        dmtTextView3.setOnClickListener(new C36134b(this));
        if (C6399b.m19944t()) {
            DmtTextView dmtTextView4 = this.f94560i;
            if (dmtTextView4 == null) {
                C7573i.m23583a("mConfirm");
            }
            dmtTextView4.setText(getString(R.string.ayk));
        }
        if (C6399b.m19946v()) {
            View view = this.f94562k;
            if (view == null) {
                C7573i.m23583a("mRootView");
            }
            view.setBackgroundColor(getResources().getColor(R.color.lt));
            DmtTextView dmtTextView5 = this.f94559h;
            if (dmtTextView5 == null) {
                C7573i.m23583a("mCancel");
            }
            dmtTextView5.setTextColor(getResources().getColor(R.color.lw));
            TextTitleBar textTitleBar2 = this.f94561j;
            if (textTitleBar2 == null) {
                C7573i.m23583a("mTitleBar");
            }
            textTitleBar2.setTitleColor(getResources().getColor(R.color.lw));
        } else {
            View view2 = this.f94562k;
            if (view2 == null) {
                C7573i.m23583a("mRootView");
            }
            view2.setBackgroundColor(getResources().getColor(R.color.lw));
            DmtTextView dmtTextView6 = this.f94559h;
            if (dmtTextView6 == null) {
                C7573i.m23583a("mCancel");
            }
            dmtTextView6.setTextColor(getResources().getColor(R.color.lt));
            TextTitleBar textTitleBar3 = this.f94561j;
            if (textTitleBar3 == null) {
                C7573i.m23583a("mTitleBar");
            }
            textTitleBar3.setTitleColor(getResources().getColor(R.color.lt));
        }
        DmtTextView dmtTextView7 = this.f94560i;
        if (dmtTextView7 == null) {
            C7573i.m23583a("mConfirm");
        }
        dmtTextView7.setOnClickListener(new C36135c(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ PinchImageView m116540a(CropActivity cropActivity) {
        PinchImageView pinchImageView = cropActivity.f94553a;
        if (pinchImageView == null) {
            C7573i.m23583a("mCoverImage");
        }
        return pinchImageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ PreviewBoxView m116541b(CropActivity cropActivity) {
        PreviewBoxView previewBoxView = cropActivity.f94554b;
        if (previewBoxView == null) {
            C7573i.m23583a("mCoverWindow");
        }
        return previewBoxView;
    }

    /* renamed from: b */
    public final void mo91972b(String str) {
        m116544e();
        this.f94555c = str;
        C35999a aVar = this.f94564m;
        if (aVar != null) {
            aVar.mo64749a(str);
        }
        C35999a aVar2 = this.f94564m;
        if (aVar2 != null) {
            aVar2.mo91615e();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.e7);
        m116542c();
        m116547h();
        m116546g();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        String str;
        C36107z zVar = this.f94565n;
        Map map = null;
        if (zVar != null) {
            if (avatarUri != null) {
                str = avatarUri.uri;
            } else {
                str = null;
            }
            zVar.f94398d = str;
        }
        C36011ai aiVar = this.f94566o;
        if (aiVar != null) {
            C36107z zVar2 = this.f94565n;
            if (zVar2 != null) {
                map = zVar2.mo91866a();
            }
            aiVar.mo91643a(map);
        }
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        C22814a.m75244a((Context) this, (Throwable) exc);
        DmtStatusView dmtStatusView = this.f94563l;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        dmtStatusView.setVisibility(8);
        mo91970a();
    }

    /* renamed from: a */
    private final Bitmap m116538a(PinchImageView pinchImageView, Bitmap bitmap) {
        RectF a = pinchImageView.mo92864a((RectF) null);
        if (this.f94557e == null) {
            return bitmap;
        }
        Rect rect = this.f94557e;
        if (rect == null) {
            C7573i.m23580a();
        }
        int width = (int) (((((float) rect.left) - a.left) / a.width()) * ((float) bitmap.getWidth()));
        Rect rect2 = this.f94557e;
        if (rect2 == null) {
            C7573i.m23580a();
        }
        int height = (int) (((((float) rect2.top) - a.top) / a.height()) * ((float) bitmap.getHeight()));
        Rect rect3 = this.f94557e;
        if (rect3 == null) {
            C7573i.m23580a();
        }
        int width2 = (int) ((((float) rect3.width()) / a.width()) * ((float) bitmap.getWidth()));
        Rect rect4 = this.f94557e;
        if (rect4 == null) {
            C7573i.m23580a();
        }
        int height2 = (int) ((((float) rect4.height()) / a.height()) * ((float) bitmap.getHeight()));
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if (width2 > bitmap.getWidth()) {
            width2 = bitmap.getWidth();
        }
        if (height2 > bitmap.getHeight()) {
            height2 = bitmap.getHeight();
        }
        if (width2 >= this.f94569r && height2 >= this.f94570s) {
            return Bitmap.createBitmap(bitmap, width, height, width2, height2);
        }
        C1592h.m7855a((Callable<TResult>) new C36138d<TResult>(this), C1592h.f5958b);
        return null;
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        UrlModel urlModel;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        this.f94556d = urlModel;
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        C22814a.m75244a((Context) this, (Throwable) exc);
        DmtStatusView dmtStatusView = this.f94563l;
        if (dmtStatusView == null) {
            C7573i.m23583a("mDmtStatusView");
        }
        dmtStatusView.setVisibility(8);
        mo91970a();
    }
}
