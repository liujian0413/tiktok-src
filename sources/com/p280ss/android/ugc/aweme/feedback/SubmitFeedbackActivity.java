package com.p280ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.sdk.app.C20112c;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p1076c.p1077a.C23623a;
import com.p280ss.android.ugc.aweme.p1685ug.C42687b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42916ad;
import com.p280ss.android.ugc.aweme.utils.C42974bh;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.aweme.utils.permission.C43155b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity */
public class SubmitFeedbackActivity extends AmeBaseActivity implements C6310a {

    /* renamed from: w */
    protected static final ColorFilter f76710w = new ColorMatrixColorFilter(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});

    /* renamed from: A */
    private TextView f76711A;

    /* renamed from: B */
    private C19936f f76712B;

    /* renamed from: C */
    private WeakReference<FeedbackThread2> f76713C;

    /* renamed from: D */
    private ColorFilter f76714D;

    /* renamed from: E */
    private boolean f76715E = true;

    /* renamed from: F */
    private boolean f76716F = false;

    /* renamed from: G */
    private boolean f76717G = false;

    /* renamed from: a */
    public EditText f76718a;

    /* renamed from: b */
    public String f76719b;

    /* renamed from: c */
    public C6309f f76720c = new C6309f(this);

    /* renamed from: d */
    public InputMethodManager f76721d;

    /* renamed from: e */
    public String f76722e;

    /* renamed from: q */
    public String f76723q;

    /* renamed from: r */
    public String f76724r;

    /* renamed from: s */
    public String f76725s;

    /* renamed from: t */
    public String f76726t;

    /* renamed from: u */
    public long f76727u;

    /* renamed from: v */
    protected String f76728v = "";

    /* renamed from: x */
    private EditText f76729x;

    /* renamed from: y */
    private ImageView f76730y;

    /* renamed from: z */
    private View f76731z;

    /* renamed from: a */
    public int mo58708a() {
        return R.layout.ajw;
    }

    /* renamed from: f */
    public final int mo60491f() {
        return R.color.aao;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: g */
    public final void mo60492g() {
        mo74493i();
        super.mo60492g();
    }

    public void onPostResume() {
        super.onPostResume();
        this.f76729x.postDelayed(new Runnable() {
            public final void run() {
                if (SubmitFeedbackActivity.this.f76718a.requestFocus() && SubmitFeedbackActivity.this.f76721d != null) {
                    SubmitFeedbackActivity.this.f76721d.showSoftInput(SubmitFeedbackActivity.this.f76718a, 1);
                }
            }
        }, 200);
    }

    /* renamed from: l */
    private void m95387l() {
        if (this.f76713C != null) {
            FeedbackThread2 feedbackThread2 = (FeedbackThread2) this.f76713C.get();
            if (feedbackThread2 != null) {
                feedbackThread2.mo74488a();
            }
            this.f76713C.clear();
            this.f76713C = null;
        }
    }

    /* renamed from: d */
    public final void mo59893d() {
        String[] stringArray = getResources().getStringArray(R.array.c);
        C11030a aVar = new C11030a(this);
        aVar.mo26643a((CharSequence[]) stringArray, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(SubmitFeedbackActivity.this.f76722e)) {
                    C10761a.m31399c((Context) SubmitFeedbackActivity.this, (int) R.string.djg).mo25750a();
                    return;
                }
                C6907h.m21524a("click_image_choose", (Map) C22984d.m75611a().mo59973a("enter_from", SubmitFeedbackActivity.this.f76726t).mo59973a("faq_id", SubmitFeedbackActivity.this.f76725s).mo59973a("type", "single").f60753a);
                SubmitFeedbackActivity.this.mo74493i();
                switch (i) {
                    case 0:
                        C22477b.m74364a(SubmitFeedbackActivity.this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C22480b() {
                            /* renamed from: a */
                            public final void mo53549a(String[] strArr, int[] iArr) {
                                if (strArr.length > 0 && iArr[0] == 0) {
                                    C6907h.m21524a("enter_image_choose", (Map) C22984d.m75611a().mo59973a("enter_from", SubmitFeedbackActivity.this.f76726t).mo59973a("faq_id", SubmitFeedbackActivity.this.f76725s).mo59973a("type", "single").f60753a);
                                    C19929d.m65758a(SubmitFeedbackActivity.this, null, 1003);
                                } else if (C6399b.m19944t()) {
                                    C43155b.m136878a(R.string.cn0, R.string.cmy, SubmitFeedbackActivity.this);
                                } else {
                                    C29115t.m95488a(Toast.makeText(SubmitFeedbackActivity.this, R.string.ct5, 0));
                                }
                            }
                        });
                        return;
                    case 1:
                        C22477b.m74364a(SubmitFeedbackActivity.this, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
                            /* renamed from: a */
                            public final void mo53549a(String[] strArr, int[] iArr) {
                                if (strArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                                    C6907h.m21524a("enter_image_choose", (Map) C22984d.m75611a().mo59973a("enter_from", SubmitFeedbackActivity.this.f76726t).mo59973a("faq_id", SubmitFeedbackActivity.this.f76725s).mo59973a("type", "single").f60753a);
                                    C42916ad.m136251a(SubmitFeedbackActivity.this, null, 1002, SubmitFeedbackActivity.this.f76722e, SubmitFeedbackActivity.this.f76724r);
                                } else if (C6399b.m19944t()) {
                                    C43155b.m136878a(R.string.cn0, R.string.cmy, SubmitFeedbackActivity.this);
                                } else {
                                    C29116u.m95489a(Toast.makeText(SubmitFeedbackActivity.this, R.string.ct5, 0));
                                }
                            }
                        });
                        break;
                }
            }
        });
        aVar.mo26649b();
    }

    /* renamed from: e */
    public final int mo60490e() {
        this.f76715E = getResources().getBoolean(R.bool.j);
        if (this.f76715E) {
            return 0;
        }
        return 2;
    }

    /* renamed from: i */
    public final void mo74493i() {
        if (this.f76721d != null) {
            this.f76721d.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public void setStatusBarColor() {
        if (!C6399b.m19944t()) {
            C43098ej.m136710a(this, getResources().getColor(R.color.a3z));
        }
    }

    /* renamed from: k */
    private void m95386k() {
        if (!TextUtils.isEmpty(this.f76719b)) {
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(this.f76719b, 50, 50);
            if (bitmapFromSD != null) {
                this.f76730y.setImageBitmap(bitmapFromSD);
                this.f76730y.setScaleType(ScaleType.FIT_XY);
                return;
            }
            this.f76719b = "";
        }
    }

    public void onBackPressed() {
        if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = C6776h.m20941a((Context) this, getPackageName());
            }
            if (intent != null) {
                finish();
                startActivity(intent);
                return;
            }
            setResult(0);
            finish();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f76729x != null) {
            this.f76728v = this.f76729x.getText().toString();
            Editor edit = C7285c.m22838a(this, "contact_info", 0).edit();
            edit.putString("contact_info", this.f76728v);
            C9721b.m28656a(edit);
        }
        m95387l();
        this.f76716F = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo58711c() {
        this.f61256m.setText(R.string.e9v);
        this.f61255l.setText(R.string.bxx);
        this.f61255l.setVisibility(0);
        this.f61255l.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SubmitFeedbackActivity.this.mo74494j();
                C23623a.m77524a();
            }
        });
        this.f76730y = (ImageView) findViewById(R.id.ay9);
        this.f76730y.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SubmitFeedbackActivity.this.mo59893d();
            }
        });
        this.f76718a = (EditText) findViewById(R.id.a1q);
        this.f76729x = (EditText) findViewById(R.id.a17);
        this.f76731z = findViewById(R.id.a24);
        this.f76711A = (TextView) findViewById(R.id.a18);
        this.f76729x.setText(this.f76728v);
        m95386k();
    }

    /* renamed from: b */
    public final void mo58710b() {
        super.mo58710b();
        Intent intent = getIntent();
        if (intent != null) {
            this.f76725s = intent.getStringExtra("feedback_id");
            this.f76726t = intent.getStringExtra("enter_from");
            this.f76719b = Uri.decode(intent.getStringExtra("img_url"));
            this.f76727u = intent.getLongExtra("roomId", 0);
        }
        if (this.f76717G) {
            this.f76726t = "rating_popup";
        }
        this.f76712B = C19936f.m65765a();
        this.f76721d = (InputMethodManager) getSystemService("input_method");
        File a = C7276d.m22802a("feedback");
        if (a != null) {
            this.f76722e = a.getPath();
        } else {
            this.f76722e = "";
        }
        this.f76724r = "camera.data";
        this.f76723q = "upload.data";
        C6907h.m21524a("enter_feedback_edit_page", (Map) new C22984d().mo59973a("faq_id", this.f76725s).mo59973a("page_type", "app").f60753a);
        mo58711c();
    }

    /* renamed from: h */
    public final void mo60493h() {
        super.mo60493h();
        if (this.f76715E) {
            Resources resources = getResources();
            int a = C20112c.m66309a(R.drawable.a0j, this.f61251h);
            int a2 = C20112c.m66309a(R.drawable.lt, this.f61251h);
            int a3 = C20112c.m66309a(R.drawable.ls, this.f61251h);
            int a4 = C20112c.m66309a(R.color.q5, this.f61251h);
            int a5 = C20112c.m66309a(R.color.q6, this.f61251h);
            int a6 = C20112c.m66309a(R.color.q0, this.f61251h);
            this.f76730y.setColorFilter(null);
            if (C6319n.m19593a(this.f76719b)) {
                this.f76730y.setImageResource(a);
            } else if (this.f61251h) {
                this.f76730y.setColorFilter(this.f76714D);
            }
            this.f76718a.setTextColor(resources.getColor(a4));
            this.f76729x.setTextColor(resources.getColor(a4));
            this.f76718a.setHintTextColor(resources.getColor(a5));
            this.f76729x.setHintTextColor(resources.getColor(a5));
            this.f76711A.setTextColor(resources.getColor(a6));
            C9738o.m28700a(this.f76731z, a2);
            C9738o.m28700a((View) this.f76729x, a3);
        }
    }

    /* renamed from: j */
    public final void mo74494j() {
        String str;
        if (!this.f76716F) {
            if (!C29117v.m95490a(this)) {
                C9738o.m28694a((Context) this, (int) R.drawable.wt, (int) R.string.dxn);
                return;
            }
            final String obj = this.f76718a.getText().toString();
            final String obj2 = this.f76729x.getText().toString();
            if (C6399b.m19944t()) {
                if (C6319n.m19593a(obj) || obj.length() < 2) {
                    C9738o.m28694a((Context) this, (int) R.drawable.wt, (int) R.string.bts);
                    this.f76718a.requestFocus();
                    return;
                }
            } else if (C6319n.m19593a(obj)) {
                C9738o.m28694a((Context) this, (int) R.drawable.wt, (int) R.string.bts);
                this.f76718a.requestFocus();
                return;
            } else if (m95384a(obj).length() < 6) {
                C9738o.m28694a((Context) this, (int) R.drawable.wt, (int) R.string.bts);
                this.f76718a.requestFocus();
                return;
            }
            this.f76716F = true;
            if (C6399b.m19944t() || C42974bh.m136433a(this, obj)) {
                if (this.f76727u != 0) {
                    str = "livesdk_click_send_feedback";
                } else {
                    str = "click_send_feedback";
                }
                C6907h.m21524a(str, (Map) C22984d.m75611a().mo59973a("enter_from", this.f76726t).mo59973a("faq_id", this.f76725s).mo59973a("uid", C21115b.m71197a().getCurUserId()).f60753a);
                if (!C6319n.m19593a(this.f76719b)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f76722e);
                    sb.append("/");
                    sb.append(this.f76723q);
                    if (!sb.toString().equals(this.f76719b)) {
                        new C6304f() {
                            public final void run() {
                                Bitmap rotateBitmap = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(SubmitFeedbackActivity.this.f76719b, 1000), BitmapUtils.readPictureDegree(SubmitFeedbackActivity.this.f76719b));
                                if (rotateBitmap != null) {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    rotateBitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
                                    BitmapUtils.saveImageData(byteArrayOutputStream.toByteArray(), SubmitFeedbackActivity.this.f76722e, SubmitFeedbackActivity.this.f76723q);
                                    SubmitFeedbackActivity submitFeedbackActivity = SubmitFeedbackActivity.this;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(SubmitFeedbackActivity.this.f76722e);
                                    sb.append("/");
                                    sb.append(SubmitFeedbackActivity.this.f76723q);
                                    submitFeedbackActivity.f76719b = sb.toString();
                                }
                                C29090q qVar = new C29090q();
                                qVar.f76819a = obj;
                                qVar.f76820b = obj2;
                                qVar.f76824f = SubmitFeedbackActivity.this.f76719b;
                                qVar.f76827i = C21558a.m72263a().mo57699b();
                                qVar.f76828j = C21115b.m71197a().getLastUid();
                                User curUser = C21115b.m71197a().getCurUser();
                                if (curUser != null) {
                                    qVar.f76829k = curUser.getSignature();
                                }
                                if (!TextUtils.isEmpty(SubmitFeedbackActivity.this.f76725s)) {
                                    qVar.f76825g = SubmitFeedbackActivity.this.f76725s;
                                }
                                if (SubmitFeedbackActivity.this.f76727u != 0) {
                                    qVar.f76830l = SubmitFeedbackActivity.this.f76727u;
                                }
                                Message obtainMessage = SubmitFeedbackActivity.this.f76720c.obtainMessage(10007);
                                obtainMessage.obj = qVar;
                                SubmitFeedbackActivity.this.f76720c.sendMessage(obtainMessage);
                            }
                        }.start();
                        return;
                    }
                }
                C29090q qVar = new C29090q();
                qVar.f76819a = obj;
                qVar.f76820b = obj2;
                qVar.f76824f = this.f76719b;
                qVar.f76827i = C21558a.m72263a().mo57699b();
                qVar.f76828j = C21115b.m71197a().getLastUid();
                if (!TextUtils.isEmpty(this.f76725s)) {
                    qVar.f76825g = this.f76725s;
                }
                User curUser = C21115b.m71197a().getCurUser();
                if (curUser != null) {
                    qVar.f76829k = curUser.getSignature();
                }
                if (this.f76727u != 0) {
                    qVar.f76830l = this.f76727u;
                }
                m95385a(qVar);
                return;
            }
            C9738o.m28694a((Context) this, (int) R.drawable.zf, (int) R.string.e_f);
        }
    }

    @C7709l(mo20401b = true)
    public void onDouyinPraiseFeedbackEvent(C42687b bVar) {
        if (!C6399b.m19944t()) {
            this.f76717G = true;
        }
    }

    /* renamed from: a */
    private static String m95384a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != ' ') {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private void m95385a(C29090q qVar) {
        FeedbackThread2 feedbackThread2 = new FeedbackThread2(this.f76720c, (Context) this, qVar);
        feedbackThread2.start();
        if (this.f76713C != null) {
            this.f76713C.clear();
            this.f76713C = null;
        }
        this.f76713C = new WeakReference<>(feedbackThread2);
    }

    public void handleMsg(Message message) {
        if (isViewValid()) {
            if (message.what == 10007) {
                if (message.obj instanceof C29090q) {
                    m95385a((C29090q) message.obj);
                }
                return;
            }
            this.f76716F = false;
            if (message.what == 10) {
                C6907h.m21524a("feedback_succeed", (Map) C22984d.m75611a().mo59973a("faq_id", this.f76725s).mo59970a("is_app", 1).f60753a);
                C9738o.m28694a((Context) this, (int) R.drawable.zf, (int) R.string.e_f);
                if (TextUtils.isEmpty(this.f76725s)) {
                    setResult(-1);
                    finish();
                    return;
                }
                Intent intent = new Intent(this, FeedbackActivity.class);
                intent.putExtra("feedback_id", this.f76725s);
                startActivity(intent);
                finish();
                return;
            }
            C9738o.m28711b((Context) this, (int) R.drawable.wt, getString(C19929d.m65752a(message.arg1)));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1003) {
            if (i2 == 0) {
                C6907h.m21524a("cancel_image_choose", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76726t).mo59973a("faq_id", this.f76725s).mo59973a("type", "single").f60753a);
            } else if (intent != null) {
                String a = C19929d.m65756a((Context) this, intent.getData());
                if (C6319n.m19593a(a)) {
                    C9738o.m28694a((Context) this, (int) R.drawable.wt, (int) R.string.cty);
                } else if (!new File(a).exists()) {
                    C9738o.m28694a((Context) this, (int) R.drawable.wt, (int) R.string.cty);
                } else {
                    this.f76719b = a;
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(this.f76719b, 50, 50), BitmapUtils.readPictureDegree(this.f76719b));
                    if (rotateBitmap != null) {
                        this.f76730y.setImageBitmap(rotateBitmap);
                        this.f76730y.setScaleType(ScaleType.FIT_XY);
                    } else {
                        this.f76719b = "";
                    }
                }
            }
        } else if (i != 1002) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == 0) {
            C6907h.m21524a("cancel_image_choose", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76726t).mo59973a("faq_id", this.f76725s).mo59973a("type", "single").f60753a);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f76722e);
            sb.append("/");
            sb.append(this.f76724r);
            this.f76719b = sb.toString();
            Bitmap rotateBitmap2 = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(this.f76719b, 50, 50), BitmapUtils.readPictureDegree(this.f76719b));
            if (rotateBitmap2 != null) {
                this.f76730y.setImageBitmap(rotateBitmap2);
                this.f76730y.setScaleType(ScaleType.FIT_XY);
            } else {
                this.f76719b = "";
            }
        }
    }
}
