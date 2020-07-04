package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.p022v4.app.ActivityCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.facebook.binaryresource.C13231a;
import com.facebook.binaryresource.C13232b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p716c.C13577j;
import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.activity.C22368a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23365o;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeAvatarModifyActivity.C23706a;
import com.p280ss.android.ugc.aweme.commercialize.model.C24995f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25226ag;
import com.p280ss.android.ugc.aweme.commercialize.views.StateDmtTextView;
import com.p280ss.android.ugc.aweme.commercialize.views.StateDmtTextView.C25510a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1288h.C30220b;
import com.p280ss.android.ugc.aweme.p1288h.C30221c;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.share.command.C38012e;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43150p;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils.ZoomInfo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity */
public class HeaderDetailActivity extends AmeActivity implements C36039m, C36046t {

    /* renamed from: a */
    public static final String f94641a;
    View avatarDecoPanel;
    RemoteImageView avatorImage;

    /* renamed from: b */
    public Bitmap f94642b;
    View bgView;

    /* renamed from: c */
    public User f94643c;

    /* renamed from: d */
    private ZoomInfo f94644d;

    /* renamed from: e */
    private View f94645e;
    TextView editText;

    /* renamed from: f */
    private float f94646f;
    FixedRatioFrameLayout fixedRatioFrame;

    /* renamed from: g */
    private boolean f94647g = true;

    /* renamed from: h */
    private boolean f94648h = true;

    /* renamed from: i */
    private Challenge f94649i;

    /* renamed from: j */
    private String[] f94650j;

    /* renamed from: k */
    private ImageRequest[] f94651k;

    /* renamed from: l */
    private C35999a f94652l;

    /* renamed from: m */
    private C36011ai f94653m;
    RelativeLayout mDecoActivityContainer;
    DmtTextView mDecoActivityText;
    TextView mDecoHintView;
    StateDmtTextView mDecoTextView;
    ImageView mDownloadView;
    View mMore;
    RemoteImageView mNewYearDecoratorImage;
    RelativeLayout mNewYearLayoutContainer;
    DmtTextView mNewYearText;
    View mTitleBar;

    /* renamed from: n */
    private boolean f94654n;

    /* renamed from: o */
    private String f94655o;

    /* renamed from: p */
    private ObjectAnimator f94656p;
    ImageView progressBar;
    View progressBarBg;
    ViewGroup rootView;
    RemoteImageView userAvatar;

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo80266a() {
        return false;
    }

    public void onBackClick() {
        onBackPressed();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        this.f94652l.mo91617g();
        if (avatarUri == null) {
            C10761a.m31399c((Context) this, (int) R.string.d0).mo25750a();
            return;
        }
        this.f94653m.mo91648d(avatarUri.uri);
        StringBuilder sb = new StringBuilder("file://");
        sb.append(this.f94655o);
        Uri parse = Uri.parse(sb.toString());
        C13380c.m39172c().mo33181b(parse);
        m116639a(this.userAvatar, false, parse.toString());
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        if (isViewValid() && this.f94652l != null) {
            this.f94652l.mo91617g();
            if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                C19282c.m63182a(this, "profile_image_setting", "review_failure");
            }
            C22814a.m75245a(this, exc, R.string.d0);
        }
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        this.f94654n = true;
        if (i == 4) {
            if (user.getAvatarMedium() != null) {
                m116639a(this.userAvatar, false, (String[]) user.getAvatarMedium().getUrlList().toArray(new String[user.getAvatarMedium().getUrlList().size()]));
            } else {
                C23323e.m76524b(this.userAvatar, user.getAvatarMedium());
            }
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.d7m).mo25750a();
        }
        if (this.f94652l != null) {
            this.f94652l.mo91617g();
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (isViewValid() && this.f94653m != null && this.f94652l != null) {
            if (4 == i) {
                this.f94652l.mo91617g();
                if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                    C19282c.m63182a(this, "profile_image_setting", "review_failure");
                }
            }
            if (i != 116) {
                C22814a.m75245a(this, exc, R.string.d80);
            }
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        if (isViewValid()) {
            this.f94652l.mo91617g();
            if (!TextUtils.isEmpty(str)) {
                C10761a.m31403c((Context) AwemeApplication.m21341a(), str).mo25750a();
                if (z) {
                    finish();
                }
            }
        }
    }

    public void editProfile() {
        this.f94652l.mo91611a(0);
    }

    public void onMoreClick() {
        C23706a.m77709a(this, this.f94649i);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.ah);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f94656p != null) {
            this.f94656p.cancel();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/DCIM/Camera/");
        f94641a = sb.toString();
    }

    /* renamed from: f */
    private boolean m116646f() {
        if (this.f94652l == null || !this.f94654n) {
            return true;
        }
        this.f94654n = false;
        this.f94652l.mo91615e();
        return false;
    }

    /* renamed from: b */
    public final String mo92011b() {
        ImageRequest[] imageRequestArr;
        if (C23477d.m77082a((T[]) this.f94651k)) {
            return "";
        }
        for (ImageRequest imageRequest : this.f94651k) {
            if (imageRequest != null) {
                String a = m116633a(imageRequest);
                if (!TextUtils.isEmpty(a)) {
                    return a;
                }
            }
        }
        return "";
    }

    public void saveBitmap() {
        this.progressBar.setVisibility(0);
        this.progressBarBg.setVisibility(0);
        this.mDownloadView.setVisibility(8);
        showLoadAnim(this.progressBar);
        C23365o.m74364a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
            /* renamed from: a */
            public final void mo53549a(String[] strArr, int[] iArr) {
                if (iArr.length > 0) {
                    if (iArr[0] == -1) {
                        if (!ActivityCompat.m2242a((Activity) HeaderDetailActivity.this, strArr[0])) {
                            C42951au.m136341a(HeaderDetailActivity.this, R.string.lb, R.string.w_, null, R.string.afp, new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    C42969bc.m136401a(HeaderDetailActivity.this);
                                }
                            }).show();
                        }
                        HeaderDetailActivity.this.progressBar.clearAnimation();
                        HeaderDetailActivity.this.progressBar.setVisibility(8);
                        HeaderDetailActivity.this.progressBarBg.setVisibility(8);
                        HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                    } else if (iArr[0] == 0) {
                        C6726a.m20842a(new Runnable() {
                            public final void run() {
                                String str;
                                if (HeaderDetailActivity.this.f94643c != null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(HeaderDetailActivity.this.f94643c.getUid());
                                    sb.append("_avatar.png");
                                    str = sb.toString();
                                } else {
                                    str = "avatar.png";
                                }
                                HeaderDetailActivity.this.f94642b = BitmapUtils.getBitmapFromSD(HeaderDetailActivity.this.mo92011b());
                                if (BitmapUtils.saveBitmapToSD(HeaderDetailActivity.this.f94642b, HeaderDetailActivity.f94641a, str)) {
                                    HeaderDetailActivity headerDetailActivity = HeaderDetailActivity.this;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(HeaderDetailActivity.f94641a);
                                    sb2.append(str);
                                    C38012e.m121343b(headerDetailActivity, sb2.toString());
                                    HeaderDetailActivity headerDetailActivity2 = HeaderDetailActivity.this;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(HeaderDetailActivity.f94641a);
                                    sb3.append(str);
                                    headerDetailActivity2.mo92014c(sb3.toString());
                                    HeaderDetailActivity headerDetailActivity3 = HeaderDetailActivity.this;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(HeaderDetailActivity.f94641a);
                                    sb4.append(str);
                                    headerDetailActivity3.mo92013b(sb4.toString());
                                    C6726a.m20844b(new Runnable() {
                                        public final void run() {
                                            C10761a.m31383a((Context) HeaderDetailActivity.this, (int) R.string.dir).mo25750a();
                                            HeaderDetailActivity.this.progressBar.clearAnimation();
                                            HeaderDetailActivity.this.progressBar.setVisibility(8);
                                            HeaderDetailActivity.this.progressBarBg.setVisibility(8);
                                            HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                                        }
                                    });
                                    return;
                                }
                                C6726a.m20844b(new Runnable() {
                                    public final void run() {
                                        C10761a.m31399c((Context) HeaderDetailActivity.this, (int) R.string.did).mo25750a();
                                        HeaderDetailActivity.this.progressBar.clearAnimation();
                                        HeaderDetailActivity.this.progressBar.setVisibility(8);
                                        HeaderDetailActivity.this.progressBarBg.setVisibility(8);
                                        HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                                    }
                                });
                            }
                        });
                    }
                }
            }
        });
    }

    /* renamed from: c */
    private void m116641c() {
        if (!C22368a.m74067d()) {
            this.avatarDecoPanel.setVisibility(0);
            if (!C43122ff.m136787r(this.f94643c) && !C22368a.f59676b.mo58795b()) {
                boolean isLogin = C6861a.m21337f().isLogin();
                boolean c = C22368a.m74066c();
                if (!isLogin || !c) {
                    this.mDecoTextView.setVisibility(8);
                    this.mNewYearLayoutContainer.setVisibility(0);
                    this.mNewYearLayoutContainer.setOnClickListener(new C36338aj(this));
                    this.mNewYearText.setText("许心愿获同款头像挂件");
                    C24995f.m82306a(this.f94643c, this.mNewYearDecoratorImage);
                } else {
                    this.mDecoTextView.setVisibility(8);
                    this.mNewYearLayoutContainer.setVisibility(0);
                    this.mNewYearLayoutContainer.setOnClickListener(new C36339ak(this));
                    this.mNewYearText.setText("设置同款头像挂件");
                    C24995f.m82306a(this.f94643c, this.mNewYearDecoratorImage);
                }
            }
            this.mDecoTextView.setOnStateChangedListener(new C25510a() {

                /* renamed from: b */
                private ViewPropertyAnimator f94660b;

                /* renamed from: c */
                private boolean f94661c = HeaderDetailActivity.this.mDecoTextView.isPressed();

                /* renamed from: a */
                public final void mo66257a() {
                    float f;
                    boolean isPressed = HeaderDetailActivity.this.mDecoTextView.isPressed();
                    if (this.f94661c != isPressed) {
                        this.f94661c = isPressed;
                        if (this.f94660b != null) {
                            this.f94660b.cancel();
                            this.f94660b = null;
                        }
                        ViewPropertyAnimator animate = HeaderDetailActivity.this.mDecoTextView.animate();
                        if (isPressed) {
                            f = 0.75f;
                        } else {
                            f = 1.0f;
                        }
                        this.f94660b = animate.alpha(f).setDuration(150);
                        this.f94660b.start();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    private void m116643d() {
        if (!C6861a.m21337f().isLogin()) {
            C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a((Activity) this).mo56859a());
        } else if (C22368a.m74066c() || C22368a.m74065a() == null) {
            C25226ag.m82938a(this, this.f94643c, "others_homepage");
            finish();
        } else {
            SmartRouter.buildRoute((Context) this, "aweme://webview/").withParam("url", Uri.parse(C22368a.m74065a().f59688g).buildUpon().appendQueryParameter("uid", C6861a.m21337f().getCurUserId()).build().toString()).open();
            finish();
        }
    }

    /* renamed from: e */
    private void m116644e() {
        this.f94644d = (ZoomInfo) getIntent().getParcelableExtra("extra_zoom_info");
        this.f94650j = getIntent().getStringArrayExtra("uri");
        this.f94646f = getIntent().getFloatExtra("wh_ratio", 1.0f);
        this.f94643c = (User) getIntent().getSerializableExtra("share_info");
        boolean z = true;
        this.f94647g = getIntent().getBooleanExtra("enable_download_img", true);
        Intent intent = getIntent();
        String str = "enable_edit_img";
        if (this.f94643c == null || !C6861a.m21337f().isMe(this.f94643c.getUid())) {
            z = false;
        }
        this.f94648h = intent.getBooleanExtra(str, z);
        this.f94649i = (Challenge) getIntent().getSerializableExtra("challenge_info");
    }

    public void onSetSameClicked() {
        if (C6399b.m19944t() || C43122ff.m136787r(this.f94643c) || !C24995f.m82308a(this.f94643c)) {
            if (C29132a.m95560a()) {
                C30221c g = C29132a.m95572g();
                if (g != null) {
                    C30220b bVar = g.f79519i;
                    if (bVar != null) {
                        String str = bVar.f79510c;
                        if (!TextUtils.isEmpty(str)) {
                            C29135b.m95580a((Context) this, str);
                            C6907h.m21524a("enter_activity_page", (Map) new C22984d().mo59973a("enter_from", "head").f60753a);
                            if (C29132a.m95560a()) {
                                C6907h.m21524a("xmas_photo_activity_click", (Map) new C22984d().mo59973a("enter_from", "others_homepage").mo59973a("gen", "donation").mo59973a("to_user_id", this.f94643c.getUid()).f60753a);
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            return;
        }
        C25226ag.m82938a(this, this.f94643c, "others_homepage");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92010a(View view) {
        m116643d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo92012b(View view) {
        m116643d();
    }

    /* renamed from: b */
    private static boolean m116640b(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        return C13622l.m40095a().mo33207c().mo32467d(C13577j.m39966a().mo33116c(imageRequest, null));
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        this.f94654n = true;
        this.f94655o = str;
        m116646f();
    }

    /* renamed from: c */
    public final void mo92014c(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    private String m116633a(ImageRequest imageRequest) {
        String str = "";
        if (imageRequest == null) {
            return str;
        }
        if (m116640b(imageRequest)) {
            C13231a a = C13622l.m40095a().mo33207c().mo32459a(C13577j.m39966a().mo33116c(imageRequest, null));
            if (a != null) {
                File file = ((C13232b) a).f35057a;
                if (file != null) {
                    str = file.getAbsolutePath();
                }
            }
        }
        return str;
    }

    /* renamed from: d */
    private ImageRequest m116642d(String str) {
        C13595c cVar = new C13595c();
        cVar.mo33153a(Config.RGB_565);
        cVar.mo33154a(false);
        ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33467a(new C13594b(cVar));
        int[] e = m116645e(str);
        if (e != null && e[0] > 0 && e[1] > 0) {
            a.mo33468a(new C13596d(e[0], e[1]));
        }
        return a.mo33476b();
    }

    public void showLoadAnim(final View view) {
        this.f94656p = ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, 360.0f});
        this.f94656p.setDuration(600);
        this.f94656p.setRepeatCount(-1);
        this.f94656p.setInterpolator(new LinearInterpolator());
        this.f94656p.start();
        this.f94656p.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
                view.setAlpha(0.0f);
                view.setRotation(0.0f);
                view.setVisibility(0);
            }
        });
    }

    /* renamed from: a */
    private static String m116634a(List<String> list) {
        C13606i c = C13380c.m39172c();
        for (String str : list) {
            if (c.mo33184c(Uri.parse(str))) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo92013b(String str) {
        String str2 = Build.BRAND;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().equals("vivo")) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            sb.append("/相机/");
            sb.append(new File(str).getName());
            String sb2 = sb.toString();
            C7276d.m22820d(str, sb2);
            StringBuilder sb3 = new StringBuilder("vivo: ");
            sb3.append(sb2);
            C6921a.m21555a(sb3.toString());
            mo92014c(sb2);
        }
    }

    /* renamed from: e */
    private static int[] m116645e(String str) {
        int i;
        Uri parse = Uri.parse(str);
        if (!C7276d.m22812b(parse.getPath())) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(parse.getPath(), options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i2 > 720 || i3 > 1280) {
            int i4 = i2 >> 1;
            int i5 = i3 >> 1;
            i = 1;
            while (i4 / i > 720 && i5 / i > 1280) {
                i <<= 1;
            }
        } else {
            i = 1;
        }
        return new int[]{i2 >> i, i3 >> i};
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c8);
        ButterKnife.bind((Activity) this);
        overridePendingTransition(R.anim.ag, R.anim.ah);
        this.f94645e = findViewById(16908290);
        m116644e();
        this.fixedRatioFrame.setWhRatio(this.f94646f);
        ((C13438a) this.userAvatar.getHierarchy()).mo32896a(C13423b.f35595c);
        m116639a(this.userAvatar, true, this.f94650j);
        this.f94652l = new C35999a();
        this.f94652l.f94183c = this;
        this.f94652l.mo80250b(this, null);
        this.f94653m = new C36011ai();
        this.f94653m.f94200a = this;
        this.rootView.setBackgroundColor(-16777216);
        this.rootView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (HeaderDetailActivity.this.mTitleBar.getVisibility() != 0) {
                    HeaderDetailActivity.this.onBackPressed();
                }
            }
        });
        if (this.f94647g) {
            this.mDownloadView.setVisibility(0);
            this.bgView.setVisibility(0);
        }
        int i = 8;
        if (!C6399b.m19944t() && !C43122ff.m136787r(this.f94643c) && C24995f.m82308a(this.f94643c)) {
            m116641c();
        } else if (C29132a.m95560a() && this.f94643c != null && !C43122ff.m136787r(this.f94643c) && this.f94649i == null && this.f94643c.isActivityUser()) {
            m116641c();
            this.mDecoTextView.setVisibility(8);
            this.mDecoActivityContainer.setVisibility(0);
            this.mDecoActivityContainer.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    HeaderDetailActivity.this.onSetSameClicked();
                }
            });
            C30221c g = C29132a.m95572g();
            if (!(g == null || g.f79519i == null)) {
                this.mDecoActivityText.setText(g.f79519i.f79509b);
                this.mDecoHintView.setText(g.f79519i.f79508a);
                this.avatorImage.setImageDrawable(C29125d.m95531j());
            }
        }
        if (this.f94648h && !C43122ff.m136767b()) {
            this.editText.setVisibility(0);
        }
        if (this.f94649i != null) {
            this.mTitleBar.setVisibility(0);
            if (!C21115b.m71197a().isLogin() || this.f94649i.getDisplayCount() < 500000 || this.f94649i.isCommerce()) {
                z = false;
            }
            View view = this.mMore;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m116635a(Activity activity, Bundle bundle) {
        if (activity != null) {
            Class<HeaderDetailActivity> headerDetailActivity = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getHeaderDetailActivity();
            if (headerDetailActivity == null) {
                headerDetailActivity = HeaderDetailActivity.class;
            }
            Intent intent = new Intent(activity, headerDetailActivity);
            intent.putExtras(bundle);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f94652l.mo80249a(i, i2, intent)) {
        }
    }

    /* renamed from: a */
    private void m116639a(RemoteImageView remoteImageView, boolean z, String... strArr) {
        String str;
        if (remoteImageView != null) {
            ArrayList arrayList = new ArrayList();
            if (!C23477d.m77082a((T[]) strArr)) {
                for (String str2 : strArr) {
                    if (!C6319n.m19593a(str2)) {
                        arrayList.add(m116642d(str2));
                    }
                }
            }
            Object obj = null;
            if (z) {
                UrlModel b = C43150p.m136858b(this.f94643c);
                if (b != null) {
                    str = m116634a(b.getUrlList());
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    obj = m116642d(str);
                }
                if (C23477d.m77081a((Collection<T>) arrayList)) {
                    C23323e.m76503a(remoteImageView, (int) R.drawable.a_j);
                    return;
                }
            }
            this.f94651k = new ImageRequest[arrayList.size()];
            C13382e eVar = (C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32746a((REQUEST[]) arrayList.toArray(this.f94651k))).mo32729b(remoteImageView.getController())).mo32751c(mo80266a());
            if (obj != null) {
                eVar.mo32750c(obj);
            }
            remoteImageView.setController(eVar.mo32730f());
        }
    }

    /* renamed from: a */
    private static void m116637a(Activity activity, View view, User user, boolean z) {
        UrlModel i = C43122ff.m136778i(user);
        if (i != null && C23477d.m77083b(i.getUrlList())) {
            int size = i.getUrlList().size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = (String) i.getUrlList().get(i2);
            }
            m116636a(activity, view, 1.0f, user, z, null, strArr);
        }
    }

    /* renamed from: a */
    public static void m116638a(Activity activity, View view, User user, boolean z, int i) {
        if (user != null) {
            user.setXmasUnlockCount(i);
        }
        m116637a(activity, view, user, z);
    }

    /* renamed from: a */
    public static void m116636a(Activity activity, View view, float f, User user, boolean z, Challenge challenge, String... strArr) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.m136228a(view));
        bundle.putStringArray("uri", strArr);
        bundle.putFloat("wh_ratio", f);
        bundle.putBoolean("enable_download_img", z);
        if (user != null) {
            bundle.putSerializable("share_info", user);
        }
        m116635a(activity, bundle);
    }
}
