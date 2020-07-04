package com.p280ss.android.ugc.aweme.qrcode.p1499v2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.medialib.camera.C19663e;
import com.p280ss.android.medialib.model.Enigma;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.p884qr.ScanSettings;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.net.C25706a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.qrcode.BaseScanQRCodeActivity;
import com.p280ss.android.ugc.aweme.qrcode.model.C37085e;
import com.p280ss.android.ugc.aweme.qrcode.model.C37086f;
import com.p280ss.android.ugc.aweme.qrcode.p1495ab.QRCodeABManager;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37024c;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37032f;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37052n.C37053a;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37052n.C37054b;
import com.p280ss.android.ugc.aweme.qrcode.p1497c.C37056a;
import com.p280ss.android.ugc.aweme.qrcode.p1497c.C37058b;
import com.p280ss.android.ugc.aweme.qrcode.p1497c.C37058b.C37059a;
import com.p280ss.android.ugc.aweme.qrcode.p1497c.C37060c;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.qrcode.view.C37122b;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.aweme.settings.CouponVerificationListSettings;
import com.p280ss.android.ugc.aweme.share.command.C38012e;
import com.p280ss.android.vesdk.C45252ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2 */
public class ScanQRCodeActivityV2 extends BaseScanQRCodeActivity implements OnClickListener, C36039m, C37053a {

    /* renamed from: A */
    private TextView f97077A;

    /* renamed from: B */
    private boolean f97078B;

    /* renamed from: C */
    private boolean f97079C;

    /* renamed from: D */
    private TextView f97080D;

    /* renamed from: E */
    private ImageView f97081E;

    /* renamed from: F */
    private TextView f97082F;

    /* renamed from: G */
    private TextView f97083G;

    /* renamed from: H */
    private TextView f97084H;

    /* renamed from: I */
    private FrameLayout f97085I;

    /* renamed from: J */
    private RelativeLayout f97086J;

    /* renamed from: K */
    private boolean f97087K;

    /* renamed from: L */
    private C37122b f97088L;

    /* renamed from: g */
    public boolean f97089g;

    /* renamed from: h */
    SurfaceView f97090h;

    /* renamed from: i */
    public C37058b f97091i;

    /* renamed from: j */
    public C37054b f97092j;

    /* renamed from: k */
    public C37024c f97093k;

    /* renamed from: l */
    public C37086f f97094l;

    /* renamed from: m */
    public C37085e f97095m;

    /* renamed from: n */
    public boolean f97096n;

    /* renamed from: o */
    public boolean f97097o;

    /* renamed from: p */
    public boolean f97098p;

    /* renamed from: q */
    public boolean f97099q;

    /* renamed from: r */
    public LinearLayout f97100r;

    /* renamed from: s */
    public RemoteImageView f97101s;

    /* renamed from: t */
    public GestureDetector f97102t;

    /* renamed from: u */
    public ScaleGestureDetector f97103u;

    /* renamed from: v */
    public float f97104v = 1.0f;

    /* renamed from: w */
    C37059a f97105w = new C37059a() {
        /* renamed from: a */
        public final void mo93520a(int i) {
            if (ScanQRCodeActivityV2.this.f97099q && ScanQRCodeActivityV2.this.f97092j != null) {
                ScanQRCodeActivityV2.this.f97092j.mo93464a(ScanQRCodeActivityV2.this.f97096n, i, -1);
            }
            if (ScanQRCodeActivityV2.this.f97096n && ScanQRCodeActivityV2.this.f97091i != null) {
                ScanQRCodeActivityV2.this.f97091i.mo93517c();
            }
            ScanQRCodeActivityV2.this.f97096n = false;
        }

        /* renamed from: a */
        public final void mo93521a(EnigmaResult enigmaResult) {
            if (ScanQRCodeActivityV2.this.f97099q && !ScanQRCodeActivityV2.this.f97098p && ScanQRCodeActivityV2.this.f97092j != null) {
                if (enigmaResult != null && enigmaResult.getResult() != null && enigmaResult.getResult().length > 0) {
                    ScanQRCodeActivityV2.this.f97098p = true;
                    Enigma[] result = enigmaResult.getResult();
                    if (ScanQRCodeActivityV2.this.f97089g) {
                        Intent intent = new Intent();
                        intent.putExtra("scan_code_result", result[0].getText());
                        intent.putExtra("scan_code_type", result[0].getType());
                        ScanQRCodeActivityV2.this.setResult(-1, intent);
                        ScanQRCodeActivityV2.this.finish();
                        return;
                    }
                    ScanQRCodeActivityV2.this.f97092j.mo93465a(ScanQRCodeActivityV2.this.f97096n, result[0].getType(), result[0].getText(), ScanQRCodeActivityV2.this.f96919f);
                } else if (!(enigmaResult == null || ScanQRCodeActivityV2.this.f97091i == null)) {
                    ScanQRCodeActivityV2.this.f97091i.mo93511a(enigmaResult.zoomFactor);
                }
            }
            ScanQRCodeActivityV2.this.f97096n = false;
        }
    };

    /* renamed from: x */
    C1944a f97106x = new C37110c(this);

    /* renamed from: y */
    private C37032f f97107y;

    /* renamed from: z */
    private C35999a f97108z;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2$a */
    class C37106a extends SimpleOnGestureListener {

        /* renamed from: b */
        private final float f97125b;

        /* renamed from: c */
        private long f97126c;

        private C37106a() {
            this.f97125b = 0.03f;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ScanQRCodeActivityV2.this.f97091i == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f97126c < 500) {
                return false;
            }
            this.f97126c = currentTimeMillis;
            if (ScanQRCodeActivityV2.this.f97104v > 1.0f) {
                while (ScanQRCodeActivityV2.this.f97104v > 1.0f) {
                    ScanQRCodeActivityV2.this.f97104v -= 0.03f;
                    ScanQRCodeActivityV2.this.f97091i.mo93511a(ScanQRCodeActivityV2.this.f97104v);
                }
            } else {
                while (ScanQRCodeActivityV2.this.f97104v < 3.0f) {
                    ScanQRCodeActivityV2.this.f97104v += 0.03f;
                    ScanQRCodeActivityV2.this.f97091i.mo93511a(ScanQRCodeActivityV2.this.f97104v);
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2$b */
    class C37107b implements OnScaleGestureListener {

        /* renamed from: b */
        private final float f97128b;

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        private C37107b() {
            this.f97128b = 0.05f;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (ScanQRCodeActivityV2.this.f97091i == null || scaleGestureDetector == null) {
                return false;
            }
            if (scaleGestureDetector.getScaleFactor() >= 1.0f && ScanQRCodeActivityV2.this.f97104v <= 3.0f) {
                ScanQRCodeActivityV2.this.f97104v += 0.05f;
            } else if (ScanQRCodeActivityV2.this.f97104v >= 1.0f) {
                ScanQRCodeActivityV2.this.f97104v -= 0.05f;
            }
            ScanQRCodeActivityV2.this.f97091i.mo93511a(ScanQRCodeActivityV2.this.f97104v);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onCreate", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo93500a(boolean z) {
        int b = (int) C9738o.m28708b((Context) this, 21.0f);
        if (z) {
            this.f96915b.setTitle((int) R.string.dj7);
            this.f96915b.getEndText().setVisibility(8);
            this.f97082F.setText(R.string.dgz);
            C23323e.m76503a(this.f97101s, (int) R.drawable.azm);
            this.f97100r.setAlpha(0.0f);
            if (this.f97095m != null && !TextUtils.isEmpty(this.f97095m.f97042b)) {
                this.f97083G.setText(this.f97095m.f97042b);
            }
            this.f97083G.setVisibility(0);
            this.f97083G.setAlpha(0.0f);
            this.f97084H.setVisibility(4);
            this.f96914a.setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f97085I, "scaleX", new float[]{1.0f, 1.16f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f97085I, "scaleY", new float[]{1.0f, 1.16f});
            ofFloat.addUpdateListener(new C37112e(this));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f97077A, "translationY", new float[]{0.0f, (float) b});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f97100r, "alpha", new float[]{0.0f, 1.0f});
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f97083G, "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
            animatorSet.play(ofFloat4).with(ofFloat5).after(ofFloat2);
            animatorSet.setDuration(300);
            animatorSet.start();
            return;
        }
        this.f96915b.setTitle((CharSequence) m119268o());
        this.f96915b.getEndText().setVisibility(0);
        this.f97082F.setText(R.string.bbs);
        if (this.f97095m == null || this.f97095m.f97041a == null) {
            C23323e.m76503a(this.f97101s, (int) R.drawable.ah0);
        } else {
            C23323e.m76524b(this.f97101s, this.f97095m.f97041a);
        }
        this.f97100r.setAlpha(0.0f);
        this.f97083G.setVisibility(8);
        this.f97084H.setVisibility(0);
        this.f96914a.setVisibility(0);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f97085I, "scaleX", new float[]{1.16f, 1.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f97085I, "scaleY", new float[]{1.16f, 1.0f});
        ofFloat6.addUpdateListener(new C37113f(this));
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f97077A, "translationY", new float[]{(float) b, 0.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f97100r, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat6).with(ofFloat7).with(ofFloat8);
        animatorSet2.play(ofFloat9).after(ofFloat7);
        animatorSet2.setDuration(200);
        animatorSet2.start();
    }

    /* renamed from: e */
    public final void mo93504e() {
        this.f97081E.clearAnimation();
    }

    /* renamed from: k */
    public final void mo93559k() {
        this.f97108z.mo91614b(2);
    }

    /* renamed from: c */
    public final void mo93502c() {
        C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.f97091i != null) {
                        ScanQRCodeActivityV2.this.f97091i.mo93518d();
                    }
                }
                return null;
            }
        });
    }

    /* renamed from: i */
    public final void mo93509i() {
        C23485m.m77117a(new C37111d(this), 4000);
    }

    /* renamed from: o */
    private String m119268o() {
        if (this.f96919f != 3) {
            return getString(R.string.dj3);
        }
        return getString(R.string.dj8);
    }

    /* renamed from: p */
    private String m119269p() {
        if (this.f96919f != 3) {
            return getString(R.string.g2);
        }
        return getString(R.string.fni);
    }

    /* renamed from: q */
    private String m119270q() {
        if (this.f96919f != 3) {
            return getString(R.string.cj7);
        }
        return getString(R.string.cqe);
    }

    /* renamed from: r */
    private void m119271r() {
        this.f97094l = new C37086f();
        this.f97094l.addNotifyListener(new C25678f() {
            /* renamed from: a */
            public final void mo57296a(Exception exc) {
            }

            /* renamed from: b */
            public final void mo56977b() {
                ScanQRCodeActivityV2.this.f97095m = (C37085e) ScanQRCodeActivityV2.this.f97094l.mData;
                if (ScanQRCodeActivityV2.this.f97095m != null && ScanQRCodeActivityV2.this.f97095m.status_code == 0 && !TimeLockRuler.isTeenModeON()) {
                    ScanQRCodeActivityV2.this.f97100r.setVisibility(0);
                    if (ScanQRCodeActivityV2.this.f97095m.f97041a == null) {
                        C23323e.m76503a(ScanQRCodeActivityV2.this.f97101s, (int) R.drawable.ah0);
                    } else {
                        C23323e.m76524b(ScanQRCodeActivityV2.this.f97101s, ScanQRCodeActivityV2.this.f97095m.f97041a);
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "qr_code_scan");
                    C6907h.m21524a("show_variable_entrance", (Map) hashMap);
                }
            }
        });
        this.f97094l.mo93537a();
    }

    /* renamed from: s */
    private void m119272s() {
        C23487o.m77149b((Activity) this);
        if (VERSION.SDK_INT >= 19) {
            this.f96917d.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
    }

    /* renamed from: v */
    private void m119275v() {
        if (this.f97091i != null) {
            this.f97091i.mo93516b();
        }
        this.f97078B = false;
        this.f97077A.setAlpha(0.8f);
        this.f97077A.setText(R.string.bz4);
    }

    /* renamed from: w */
    private void m119276w() {
        if (this.f97091i != null) {
            this.f97091i.mo93510a();
        }
        this.f97078B = true;
        this.f97077A.setAlpha(1.0f);
        this.f97077A.setText(R.string.bz3);
    }

    /* renamed from: g */
    public final void mo93507g() {
        if (this.f96916c != null && this.f96916c.isShowing()) {
            this.f96916c.dismiss();
        }
    }

    /* renamed from: h */
    public final void mo93508h() {
        this.f97098p = false;
        this.f97079C = false;
        if (this.f97091i != null) {
            this.f97091i.mo93515a(true, this.f97092j.mo93461a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo93560l() {
        this.f97092j.mo93467d();
        m119274u();
        this.f97091i.mo93515a(true, this.f97092j.mo93461a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo93562n() {
        this.f97098p = false;
        this.f97079C = false;
        if (this.f97091i != null) {
            this.f97091i.mo93515a(true, this.f97092j.mo93461a());
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f97078B) {
            m119275v();
        }
        this.f97090h.setVisibility(4);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onResume", true);
        C38012e.m121339a(false);
        super.onResume();
        this.f97090h.setVisibility(0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2", "onResume", false);
    }

    /* renamed from: u */
    private void m119274u() {
        if (this.f97092j == this.f97107y) {
            this.f97091i.mo93513a(this.f97105w);
            MessageCenter.removeListener(this.f97106x);
            return;
        }
        if (this.f97092j == this.f97093k) {
            this.f97091i.mo93513a((C37059a) null);
            MessageCenter.addListener(this.f97106x);
        }
    }

    /* renamed from: d */
    public final void mo93503d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.f97081E.getHeight()), (float) (this.f97085I.getHeight() - C23486n.m77122a(20.0d)));
        translateAnimation.setDuration(2000);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(1);
        translateAnimation.setFillAfter(false);
        translateAnimation.setInterpolator(new LinearInterpolator());
        this.f97081E.startAnimation(translateAnimation);
    }

    /* renamed from: f */
    public final void mo93505f() {
        if (this.f96916c == null) {
            this.f96916c = C37121a.m119327a(this, "");
            this.f96916c.setIndeterminate(false);
            return;
        }
        if (!this.f96916c.isShowing()) {
            this.f96916c.show();
            this.f96916c.mo93590a();
        }
    }

    /* renamed from: j */
    public final void mo93558j() {
        this.f97098p = false;
        this.f97079C = false;
        if (C6384b.m19835a().mo15292a(QRCodeABManager.class, true, "update_enigma_scanner", C6384b.m19835a().mo15295d().update_enigma_scanner, false)) {
            this.f97091i = new C37060c(this, this.f97090h.getHolder());
        } else {
            this.f97091i = new C37056a();
        }
        m119274u();
    }

    /* renamed from: m */
    public final void mo93561m() {
        if (!this.f97087K) {
            C37122b bVar = new C37122b(this, (float) this.f97085I.getLeft(), (float) this.f97085I.getTop(), (float) this.f97085I.getRight(), (float) this.f97085I.getBottom());
            this.f97088L = bVar;
            this.f97086J.addView(this.f97088L, 2);
            this.f97087K = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f97092j != null) {
            this.f97092j.mo93466c();
        }
        if (this.f97108z != null) {
            this.f97108z.mo91617g();
            this.f97108z.f94183c = null;
        }
        this.f97092j = null;
        if (this.f97106x != null) {
            MessageCenter.removeListener(this.f97106x);
        }
        C1592h.m7853a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                if (ScanQRCodeActivityV2.this.f97091i != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        if (ScanQRCodeActivityV2.this.f97091i != null) {
                            ScanQRCodeActivityV2.this.f97091i.mo93518d();
                            ScanQRCodeActivityV2.this.f97091i.mo93519e();
                            ScanQRCodeActivityV2.this.f97091i.mo93513a((C37059a) null);
                            ScanQRCodeActivityV2.this.f97091i = null;
                        }
                    }
                }
                return null;
            }
        });
        if (this.f97102t != null) {
            this.f97102t.setOnDoubleTapListener(null);
        }
    }

    /* renamed from: t */
    private void m119273t() {
        if (this.f97092j == this.f97107y) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "qr_code_scan");
            C6907h.m21524a("click_variable_entrance", (Map) hashMap);
            final C1606i iVar = new C1606i();
            ((IAVService) ServiceManager.get().getService(IAVService.class)).fetchResourcesNeededByRequirements(C37024c.m119060b(), new IFetchResourcesListener() {
                public final void onFailed(Exception exc) {
                    iVar.mo6902b(exc);
                }

                public final void onSuccess(String[] strArr) {
                    iVar.mo6903b(null);
                }
            });
            iVar.f6010a.mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Void, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<Void> hVar) throws Exception {
                    if (ScanQRCodeActivityV2.this.f97092j == null) {
                        return null;
                    }
                    if (hVar.mo6889d()) {
                        C10761a.m31392b((Context) ScanQRCodeActivityV2.this, (int) R.string.b29, 0).mo25750a();
                        return null;
                    }
                    ScanQRCodeActivityV2.this.f97092j = ScanQRCodeActivityV2.this.f97093k;
                    ScanQRCodeActivityV2.this.mo93560l();
                    return null;
                }
            }, C1592h.f5958b);
        } else if (this.f97092j == this.f97093k) {
            this.f97092j = this.f97107y;
            mo93560l();
        }
        if (this.f97078B) {
            m119275v();
        }
    }

    /* renamed from: a */
    public final void mo93418a() {
        super.mo93418a();
        this.f97089g = getIntent().getBooleanExtra("is_kill_self_after_scan", false);
        this.f97097o = false;
        this.f97090h = (SurfaceView) findViewById(R.id.ddp);
        this.f97077A = (TextView) findViewById(R.id.dwt);
        this.f97080D = (TextView) findViewById(R.id.drp);
        this.f97081E = (ImageView) findViewById(R.id.cyk);
        this.f97100r = (LinearLayout) findViewById(R.id.bqq);
        this.f97082F = (TextView) findViewById(R.id.drk);
        this.f97101s = (RemoteImageView) findViewById(R.id.b73);
        this.f97083G = (TextView) findViewById(R.id.dxo);
        this.f97084H = (TextView) findViewById(R.id.e07);
        this.f97085I = (FrameLayout) findViewById(R.id.amx);
        this.f97086J = (RelativeLayout) findViewById(R.id.cws);
        this.f97100r.setOnClickListener(this);
        if (C6399b.m19946v()) {
            this.f96915b.getBackBtn().setImageResource(R.drawable.a3o);
        }
        this.f97090h.getHolder().addCallback(new Callback() {
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                ScanQRCodeActivityV2.this.mo93504e();
                synchronized (this) {
                    ScanQRCodeActivityV2.this.f97097o = false;
                }
                if (ScanQRCodeActivityV2.this.f97091i != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        if (ScanQRCodeActivityV2.this.f97091i != null) {
                            ScanQRCodeActivityV2.this.f97091i.mo93518d();
                            ScanQRCodeActivityV2.this.f97091i.mo93519e();
                        }
                    }
                }
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                synchronized (this) {
                    ScanQRCodeActivityV2.this.f97097o = true;
                }
                if (ScanQRCodeActivityV2.this.f97091i == null) {
                    ScanQRCodeActivityV2.this.mo93558j();
                }
                if (ScanQRCodeActivityV2.this.f97092j != null) {
                    ScanQRCodeActivityV2.this.f97091i.mo93515a(true, ScanQRCodeActivityV2.this.f97092j.mo93461a());
                } else {
                    ScanQRCodeActivityV2.this.f97091i.mo93515a(true, 65536);
                }
                ScanQRCodeActivityV2.this.bG_();
                ScanQRCodeActivityV2.this.mo93503d();
                ScanQRCodeActivityV2.this.mo93561m();
            }
        });
        this.f96915b.mo25878b(false);
        this.f96915b.getEndText().setTextColor(getResources().getColor(R.color.lt));
        m119272s();
    }

    public final void bG_() {
        if (this.f97091i == null) {
            mo93558j();
        }
        this.f97079C = false;
        final C19663e eVar = new C19663e(C6399b.m19921a(), 1);
        final ScanSettings scanSettings = new ScanSettings();
        scanSettings.width = 1280;
        scanSettings.height = 720;
        float b = (float) C23482j.m77098b(this);
        float a = (float) C23482j.m77095a(this);
        scanSettings.detectRectLeft = this.f97085I.getX() / b;
        scanSettings.detectRectTop = this.f97085I.getY() / a;
        scanSettings.detectRectWidth = ((float) this.f97085I.getWidth()) / b;
        scanSettings.detectRectHeight = ((float) this.f97085I.getHeight()) / a;
        scanSettings.detectRequirement = this.f97092j.mo93461a();
        scanSettings.buildChainFlag = 1;
        scanSettings.enableDetectRect = true;
        C45252ac.m142761a(((IAVService) ServiceManager.get().getService(IAVService.class)).provideResourceFinder());
        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.f97091i != null && ScanQRCodeActivityV2.this.f97097o) {
                        ScanQRCodeActivityV2.this.f97091i.mo93512a(ScanQRCodeActivityV2.this, eVar, ScanQRCodeActivityV2.this.f97090h.getHolder(), scanSettings);
                    }
                }
                return null;
            }
        }, (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Object, Object>() {
            public final Object then(C1592h<Object> hVar) throws Exception {
                synchronized (ScanQRCodeActivityV2.this) {
                    if (ScanQRCodeActivityV2.this.f97091i != null && !ScanQRCodeActivityV2.this.f97097o) {
                        ScanQRCodeActivityV2.this.f97091i.mo93518d();
                    }
                }
                return null;
            }
        }, (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Object, Object>() {
            public final Object then(C1592h<Object> hVar) throws Exception {
                ScanQRCodeActivityV2.this.f97102t = new GestureDetector(ScanQRCodeActivityV2.this, new C37106a());
                ScanQRCodeActivityV2.this.f97103u = new ScaleGestureDetector(ScanQRCodeActivityV2.this, new C37107b());
                return null;
            }
        }, C1592h.f5958b);
    }

    /* renamed from: b */
    private void m119267b(Bundle bundle) {
        this.f97107y = new C37032f(this, this);
        this.f97107y.mo93478a(bundle);
        this.f97093k = new C37024c(this, this);
        this.f97092j = this.f97107y;
        this.f97092j.mo93467d();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f97102t == null || this.f97103u == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f97102t.onTouchEvent(motionEvent)) {
            return true;
        }
        return this.f97103u.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo93499a(int i) {
        if (this.f97090h != null) {
            this.f97090h.postDelayed(new Runnable() {
                public final void run() {
                    if (!ScanQRCodeActivityV2.this.isFinishing()) {
                        ScanQRCodeActivityV2.this.finish();
                    }
                }
            }, (long) i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo93557b(ValueAnimator valueAnimator) {
        if (this.f97088L != null) {
            this.f97088L.mo93597a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        super.onClick(view);
        int id = view.getId();
        if (id != R.id.dwt) {
            if (id == R.id.bqq) {
                m119273t();
            }
        } else if (this.f97078B) {
            m119275v();
        } else {
            m119276w();
        }
    }

    @C7709l
    public void onNetStateChangeEvent(C25706a aVar) {
        if (isViewValid()) {
            if (C6900g.m21454b().mo16943d()) {
                this.f97080D.setVisibility(8);
                this.f97099q = true;
                return;
            }
            this.f97080D.setVisibility(0);
            this.f97099q = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93556a(ValueAnimator valueAnimator) {
        if (this.f97088L != null) {
            this.f97088L.mo93597a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: a */
    public final void mo93419a(Bundle bundle) {
        super.mo93419a(bundle);
        this.f96914a.setOnClickListener(this);
        this.f96914a.setText(m119270q());
        this.f96915b.setTitle((CharSequence) m119268o());
        this.f96915b.setEndText((CharSequence) m119269p());
        this.f96915b.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: a */
            public final void mo25895a(View view) {
                ScanQRCodeActivityV2.this.finish();
            }

            /* renamed from: b */
            public final void mo25896b(View view) {
                if (ScanQRCodeActivityV2.this.f96919f != 3) {
                    ScanQRCodeActivityV2.this.mo93559k();
                    return;
                }
                C7195s.m22438a().mo18682a(C10292j.m30480a().mo25015a(CouponVerificationListSettings.class, "coupon_verification_list", C6384b.m19835a().mo15294c().getCouponVerificationList()));
            }
        });
        mo93558j();
        m119267b(bundle);
        this.f97108z = new C35999a();
        this.f97108z.f94183c = this;
        this.f97108z.mo80250b(this, null);
        this.f97077A.setOnClickListener(this);
        if (C6900g.m21454b().mo16943d()) {
            this.f97080D.setVisibility(8);
            this.f97099q = true;
        } else {
            this.f97099q = false;
        }
        if (this.f96919f != 3) {
            m119271r();
        }
        MessageCenter.init();
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        if (this.f97091i == null) {
            mo93558j();
        }
        ScanSettings scanSettings = new ScanSettings();
        scanSettings.width = 1280;
        scanSettings.height = 720;
        scanSettings.buildChainFlag = 1;
        scanSettings.detectModelDir = "";
        this.f97096n = true;
        this.f97091i.mo93514a(str, scanSettings, 1000);
    }

    /* renamed from: a */
    public static void m119265a(Context context, int i) {
        Intent intent = new Intent(context, ScanQRCodeActivityV2.class);
        intent.putExtra("scan_page_from", i);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m119266a(Context context, boolean z) {
        Intent intent = new Intent(context, ScanQRCodeActivityV2.class);
        intent.putExtra("enter_from", z);
        context.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f97092j != null) {
            this.f97092j.mo93462a(i, i2, intent);
        }
        if (!this.f97108z.mo80249a(i, i2, intent)) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93555a(int i, int i2, int i3, String str) {
        if (((long) i) == 26 && this.f97095m != null && !C6307b.m19566a((Collection<T>) this.f97095m.f97043c) && this.f97095m.f97043c.contains(str) && !this.f97079C && this.f97099q && this.f97092j != null) {
            this.f97092j.mo93465a(this.f97096n, i, str, this.f96919f);
            this.f97079C = true;
        }
    }
}
