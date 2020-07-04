package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import bolts.C1591g;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PinchImageView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PreviewBoxView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PreviewBoxView.C36616a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.SwitchModeFrameLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.SwitchModeFrameLayout.C36656a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36000aa;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36038l;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.profile.util.C36761s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity */
public class ProfileCoverCropActivity extends AmeSSActivity implements C6310a, C36038l, C36046t {

    /* renamed from: a */
    public Rect f94975a;

    /* renamed from: b */
    public Runnable f94976b = new C36404cr(this);

    /* renamed from: c */
    public boolean f94977c = true;

    /* renamed from: d */
    private Bitmap f94978d;

    /* renamed from: e */
    private boolean f94979e;

    /* renamed from: f */
    private boolean f94980f;

    /* renamed from: g */
    private C36000aa f94981g;

    /* renamed from: h */
    private C36011ai f94982h;

    /* renamed from: i */
    private int f94983i;

    /* renamed from: j */
    private int f94984j;

    /* renamed from: k */
    private float f94985k = 0.0f;
    DmtTextView mCancel;
    DmtTextView mConfirm;
    PinchImageView mCoverImage;
    PreviewBoxView mCoverWindow;
    SwitchModeFrameLayout mCropContainer;
    ImageView mFakeShelter;
    View mFakeShelterTop;
    DmtStatusView mStatusView;
    View mTitleBar;

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: a */
    public final void mo91696a(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.setVisibility(8);
            C22814a.m75245a(this, exc, R.string.d81);
            C6921a.m21559a((Throwable) exc);
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (isViewValid() && this.f94982h != null) {
            this.mStatusView.setVisibility(8);
            C22814a.m75245a(this, exc, R.string.d80);
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        if (isViewValid()) {
            if (this.mStatusView != null) {
                this.mStatusView.mo25939d();
            }
            if (!TextUtils.isEmpty(str)) {
                C10761a.m31403c((Context) AwemeApplication.m21341a(), str).mo25750a();
                if (z) {
                    finish();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92193b() {
        this.mCoverWindow.mo92892a();
    }

    /* renamed from: d */
    private void m117044d() {
        if (VERSION.SDK_INT >= 19) {
            ((MarginLayoutParams) this.mTitleBar.getLayoutParams()).topMargin = C10994a.m32204a((Context) this);
            this.mTitleBar.requestLayout();
        }
    }

    /* renamed from: f */
    private static float m117046f() {
        int i;
        int a = C9738o.m28691a(C6399b.m19921a());
        if (a * 2 <= C9738o.m28709b(C6399b.m19921a())) {
            i = C21085a.m71116a(C6399b.m19921a());
        } else {
            i = 0;
        }
        return ((((float) C9738o.m28691a(C6399b.m19921a())) / 3.0f) + (((float) i) / 2.0f)) / ((float) a);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public String mo92194c() {
        File b = C36761s.m118496b();
        if (BitmapUtils.saveBitmapToSD(m117042a(this.mCoverImage, this.f94978d), b.getParent(), b.getName())) {
            return b.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: e */
    private void m117045e() {
        String stringExtra = getIntent().getStringExtra("cover_url");
        this.f94984j = getIntent().getIntExtra("cover_source", 0);
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        this.f94983i = (int) (((float) C9738o.m28709b((Context) this)) * 0.3f);
        this.f94978d = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(stringExtra, 1080, 1080), BitmapUtils.readPictureDegree(stringExtra));
        this.mCoverImage.setImageBitmap(this.f94978d);
        this.mFakeShelter.setImageResource(R.drawable.ard);
        if (!C6399b.m19944t() || C6399b.m19947w()) {
            this.mFakeShelterTop.setVisibility(0);
        }
        this.mCoverWindow.setTopOffset(this.f94983i);
        this.mCoverWindow.f96083c = new C36616a() {
            /* renamed from: a */
            public final void mo92197a() {
                ProfileCoverCropActivity.this.mFakeShelter.setAlpha(0.0f);
                ProfileCoverCropActivity.this.mFakeShelterTop.setAlpha(0.0f);
            }

            /* renamed from: a */
            public final void mo92198a(float f) {
                ProfileCoverCropActivity.this.mo92191a();
                ProfileCoverCropActivity.this.mFakeShelter.setAlpha(f);
                ProfileCoverCropActivity.this.mFakeShelterTop.setAlpha(f / 2.0f);
            }
        };
        this.mCropContainer.setIntercepter(new C36656a() {
            /* renamed from: a */
            public final void mo91979a(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    ProfileCoverCropActivity.this.mCoverWindow.mo92894b();
                    if (ProfileCoverCropActivity.this.f94977c) {
                        ProfileCoverCropActivity.this.mCoverWindow.removeCallbacks(ProfileCoverCropActivity.this.f94976b);
                        ProfileCoverCropActivity.this.f94977c = false;
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (ProfileCoverCropActivity.this.f94975a == null) {
                        ProfileCoverCropActivity.this.f94975a = ProfileCoverCropActivity.this.mCoverWindow.getVisibleRect();
                    }
                    ProfileCoverCropActivity.this.mCoverWindow.mo92892a();
                }
            }
        });
        this.mCoverWindow.addOnLayoutChangeListener(new C36405cs(this));
        this.mStatusView.setBuilder(C10803a.m31631a((Context) this));
        this.mCoverWindow.postDelayed(this.f94976b, 1000);
    }

    /* renamed from: a */
    public final void mo92191a() {
        if (this.f94985k == 0.0f) {
            this.f94985k = m117046f();
        }
        if (!this.f94979e && this.f94975a != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mFakeShelter.getLayoutParams();
            int b = (int) C9738o.m28708b(this.mCoverWindow.getContext(), 16.0f);
            float width = (((float) this.f94983i) + (((float) this.f94975a.width()) * this.f94985k)) - C9738o.m28708b((Context) this, 16.0f);
            if (!C6399b.m19944t() || C6399b.m19947w()) {
                width += (((float) this.f94975a.height()) - (((float) this.f94975a.width()) * this.f94985k)) / 2.0f;
            }
            marginLayoutParams.setMargins(b, (int) width, b, 0);
            this.mFakeShelter.setLayoutParams(marginLayoutParams);
            this.mFakeShelter.requestLayout();
            this.f94979e = true;
        }
        if (!this.f94980f && this.f94975a != null) {
            MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.mFakeShelterTop.getLayoutParams();
            int b2 = (int) C9738o.m28708b(this.mCoverWindow.getContext(), 16.0f);
            marginLayoutParams2.height = (int) ((((float) this.f94975a.height()) - (((float) this.f94975a.width()) * this.f94985k)) / 2.0f);
            marginLayoutParams2.setMargins(b2, this.f94983i, b2, 0);
            this.mFakeShelterTop.setLayoutParams(marginLayoutParams2);
            this.mFakeShelterTop.requestLayout();
            this.f94979e = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo92190a(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            this.f94981g.mo91618a((String) hVar.mo6890e());
        }
        return null;
    }

    public void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            C22814a.m75245a(this, (Exception) message.obj, R.string.d80);
            return;
        }
        if (message.obj instanceof User) {
            C21115b.m71197a().setCurUser((User) message.obj);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.e7);
        ButterKnife.bind((Activity) this);
        m117045e();
        this.f94981g = new C36000aa();
        this.f94981g.f94188b = this;
        this.f94982h = new C36011ai();
        this.f94982h.f94200a = this;
        m117044d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onCreate", false);
    }

    public void onViewClicked(View view) {
        if (this.mCoverImage.getPinchMode() == 0) {
            int id = view.getId();
            if (id == R.id.dr5) {
                finish();
                return;
            }
            if (id == R.id.ds9) {
                if (this.f94984j == 2) {
                    C6907h.m21524a("replace_profile_cover_finish", (Map) new C22984d().mo59973a("enter_method", "sys_album").f60753a);
                } else if (this.f94984j == 1) {
                    C6907h.m21524a("replace_profile_cover_finish", (Map) new C22984d().mo59973a("enter_method", "camera").f60753a);
                }
                this.mStatusView.mo25942f();
                C1592h.m7853a((Callable<TResult>) new C36406ct<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C36407cu<TResult,TContinuationResult>(this), C1592h.f5958b);
            }
        }
    }

    /* renamed from: a */
    public final void mo91695a(AvatarUri avatarUri) {
        if (this.f94982h == null || avatarUri == null) {
            this.mStatusView.setVisibility(8);
            C10761a.m31399c((Context) this, (int) R.string.d81).mo25750a();
            return;
        }
        this.f94982h.mo91642a(avatarUri.uri, this.f94984j);
    }

    /* renamed from: a */
    private Bitmap m117042a(PinchImageView pinchImageView, Bitmap bitmap) {
        RectF a = pinchImageView.mo92864a((RectF) null);
        if (this.f94975a == null) {
            return bitmap;
        }
        int width = (int) (((((float) this.f94975a.left) - a.left) / a.width()) * ((float) bitmap.getWidth()));
        int height = (int) (((((float) this.f94975a.top) - a.top) / a.height()) * ((float) bitmap.getHeight()));
        int width2 = (int) ((((float) this.f94975a.width()) / a.width()) * ((float) bitmap.getWidth()));
        int height2 = (int) ((((float) this.f94975a.height()) / a.height()) * ((float) bitmap.getHeight()));
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
        return Bitmap.createBitmap(bitmap, width, height, width2, height2);
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        if (isViewValid()) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.d7m).mo25750a();
            this.mStatusView.setVisibility(8);
            C21115b.m71197a().queryUser(new C6309f(Looper.getMainLooper(), this));
        }
    }

    /* renamed from: a */
    public static void m117043a(Context context, String str, int i) {
        Intent intent = new Intent(context, ProfileCoverCropActivity.class);
        intent.putExtra("cover_url", str);
        intent.putExtra("cover_source", i);
        context.startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92192a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f94975a == null) {
            this.f94975a = this.mCoverWindow.getVisibleRect();
            this.mCoverImage.setDisplayWindowRect(this.f94975a);
        }
    }
}
