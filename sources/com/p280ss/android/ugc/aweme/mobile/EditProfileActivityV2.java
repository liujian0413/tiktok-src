package com.p280ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendFriendActivity;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33601b.C33602a;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33603c;
import com.p280ss.android.ugc.aweme.p1416n.C34033b;
import com.p280ss.android.ugc.aweme.profile.C36107z;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35668f;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43086eb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.GregorianCalendar;

/* renamed from: com.ss.android.ugc.aweme.mobile.EditProfileActivityV2 */
public class EditProfileActivityV2 extends AmeSSActivity implements C6310a, C36039m, C36046t {

    /* renamed from: a */
    public Dialog f87688a;

    /* renamed from: b */
    public C35999a f87689b;

    /* renamed from: c */
    public C6309f f87690c;

    /* renamed from: d */
    private C36107z f87691d;

    /* renamed from: e */
    private C33603c f87692e = new C33603c("profile");

    /* renamed from: f */
    private C36011ai f87693f;

    /* renamed from: g */
    private boolean f87694g;

    /* renamed from: h */
    private boolean f87695h;

    /* renamed from: i */
    private GregorianCalendar f87696i;

    /* renamed from: j */
    private DatePickerDialog f87697j;
    SmartImageView mAvatar;
    Button mBtnEnterAweme;
    EditText mUsernameEdit;
    TextView txtExtra;

    /* renamed from: a */
    public final void mo66089a(boolean z) {
    }

    public void onBackPressed() {
        mo85918c();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: g */
    private boolean m108472g() {
        if (this.f87689b == null || !this.f87695h) {
            return true;
        }
        this.f87689b.mo91615e();
        return false;
    }

    /* renamed from: a */
    public final void mo85916a() {
        if (C21115b.m71197a().hasUpdated()) {
            m108474i();
        } else {
            mo85919d();
        }
    }

    /* renamed from: f */
    private void m108471f() {
        boolean z;
        if (!C33605c.m108499a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
            return;
        }
        showProgressDialog(getString(R.string.c_o));
        boolean h = m108473h();
        if (!m108472g() || !h) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dismissProgressDialog();
        }
        C42961az.m136380a(new C35668f());
    }

    /* renamed from: h */
    private boolean m108473h() {
        String obj = this.mUsernameEdit.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            C10761a.m31409e((Context) this, (int) R.string.clp).mo25750a();
            dismissProgressDialog();
            return false;
        } else if (!obj.equals(C21115b.m71197a().getCurUser().getNickname())) {
            this.f87691d.f94395a = obj;
            return false;
        } else {
            this.f87691d.f94395a = "";
            return true;
        }
    }

    /* renamed from: b */
    public final void mo85917b() {
        if (TextUtils.isEmpty(this.mUsernameEdit.getText().toString().trim()) || !this.f87694g) {
            this.mBtnEnterAweme.setEnabled(false);
        } else {
            this.mBtnEnterAweme.setEnabled(true);
        }
    }

    /* renamed from: c */
    public final void mo85918c() {
        this.f87692e.mo85937a(this, "finish_no_name");
        this.f87692e.mo85937a(this, "default_name");
        if (C21115b.m71197a().getCurUser().isNeedRecommend()) {
            C33602a.m108492a((Activity) this).mo85935a(RecommendFriendActivity.class).mo85936a();
        }
        finish();
    }

    /* renamed from: d */
    public final void mo85919d() {
        if (isActive()) {
            if (this.f87688a == null) {
                C10741a aVar = new C10741a(this);
                aVar.mo25649a((int) R.string.c4c).mo25658b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C33604b.m108498a(EditProfileActivityV2.this.f87688a);
                    }
                }).mo25650a((int) R.string.ag2, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        EditProfileActivityV2.this.showProgressDialog(EditProfileActivityV2.this.getString(R.string.c4b));
                        C21115b.m71197a().queryUser(EditProfileActivityV2.this.f87690c);
                        C33597a.m108486a(EditProfileActivityV2.this.f87688a);
                    }
                });
                this.f87688a = aVar.mo25656a().mo25637a();
            }
            this.f87688a.show();
        }
    }

    /* renamed from: i */
    private void m108474i() {
        String trim = this.mUsernameEdit.getText().toString().trim();
        if (!this.f87694g && TextUtils.isEmpty(trim)) {
            C10761a.m31409e((Context) this, (int) R.string.dma).mo25750a();
        } else if (TextUtils.isEmpty(trim)) {
            C10761a.m31409e((Context) this, (int) R.string.dmo).mo25750a();
        } else if (!this.f87694g) {
            C10761a.m31409e((Context) this, (int) R.string.dm_).mo25750a();
        } else {
            KeyboardUtils.m77057c(this.mUsernameEdit);
            m108471f();
        }
    }

    /* renamed from: e */
    private void m108470e() {
        this.f87690c = new C6309f(Looper.getMainLooper(), this);
        this.f87691d = new C36107z();
        this.mBtnEnterAweme.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                EditProfileActivityV2.this.mo85916a();
            }
        });
        if (this.f87694g && C21115b.m71197a().hasUpdated()) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.gi);
            int a = (int) C43086eb.m136676a(this, 1, (float) C43086eb.m136678a((Context) this, (int) R.dimen.gi));
            C12133n.m35299a(C23400r.m76741a(C21115b.m71197a().getCurUser().getAvatarMedium())).mo29851b(a, a).mo29836a(dimensionPixelOffset, dimensionPixelOffset).mo29845a("EditProfileActivityV2").mo29844a((C12128i) this.mAvatar).mo29848a();
        }
        this.mAvatar.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C21115b.m71197a().hasUpdated()) {
                    EditProfileActivityV2.this.mo85919d();
                } else {
                    EditProfileActivityV2.this.f87689b.mo91611a(0);
                }
            }
        });
        this.f87693f = new C36011ai();
        this.f87693f.f94200a = this;
        if (!C21115b.m71197a().hasUpdated()) {
            C21115b.m71197a().queryUser(this.f87690c);
            showProgressDialog(getString(R.string.c4b));
        }
        this.f87689b = new C35999a();
        this.f87689b.f94183c = this;
        this.f87689b.mo80250b(this, null);
        this.txtExtra.setText(getString(R.string.dwj));
        this.txtExtra.setVisibility(0);
        this.txtExtra.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                EditProfileActivityV2.this.mo85918c();
            }
        });
        this.mUsernameEdit.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                EditProfileActivityV2.this.mo85917b();
            }
        });
        this.mBtnEnterAweme.setOnTouchListener(new C34033b(1.2f, 200, null));
        mo85917b();
        showImeOnce(this.mUsernameEdit);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("avatarset", this.f87694g);
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
        if (isViewValid()) {
            this.f87689b.mo91617g();
            if (this.f87693f == null || avatarUri == null) {
                C10761a.m31399c((Context) this, (int) R.string.d0).mo25750a();
                return;
            }
            this.f87691d.f94398d = avatarUri.uri;
            this.f87693f.mo91643a(this.f87691d.mo91866a());
        }
    }

    public void handleMsg(Message message) {
        if (!(message.obj instanceof Exception)) {
            if (message.obj instanceof User) {
                C21115b.m71197a().setCurUser((User) message.obj);
            }
            if (isViewValid()) {
                dismissProgressDialog();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bh);
        if (bundle != null) {
            this.f87694g = bundle.getBoolean("avatarset", false);
        }
        m108470e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
        if (isViewValid() && this.f87689b != null) {
            this.f87689b.mo91617g();
            if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                C19282c.m63182a(this, "profile_image_setting", "review_failure");
            }
            C22814a.m75245a(this, exc, R.string.d0);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r9v12, types: [android.view.ContextThemeWrapper] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void editBirthday(android.view.View r9) {
        /*
            r8 = this;
            boolean r9 = r8.isViewValid()
            if (r9 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r9 = r8.mUsernameEdit
            com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils.m77057c(r9)
            com.ss.android.ugc.aweme.IAccountUserService r9 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            com.ss.android.ugc.aweme.profile.model.User r9 = r9.getCurUser()
            if (r9 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.GregorianCalendar r0 = r8.f87696i
            if (r0 != 0) goto L_0x0028
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.<init>(r1)
            r8.f87696i = r0
        L_0x0028:
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.<init>(r1)
            r8.f87696i = r0
            java.lang.String r0 = r9.getBirthday()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = -1
            if (r0 == 0) goto L_0x0043
            r3 = r1
            goto L_0x004b
        L_0x0043:
            java.lang.String r9 = r9.getBirthday()
            long r3 = com.p280ss.android.ugc.aweme.utils.C43110ev.m136731a(r9)
        L_0x004b:
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x0059
            java.util.GregorianCalendar r9 = r8.f87696i
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            r9.setTimeInMillis(r3)
            goto L_0x0063
        L_0x0059:
            java.util.GregorianCalendar r9 = r8.f87696i
            r0 = 788889600000(0xb7ad7c0000, double:3.897632497214E-312)
            r9.setTimeInMillis(r0)
        L_0x0063:
            android.app.DatePickerDialog r9 = r8.f87697j
            if (r9 != 0) goto L_0x00bd
            boolean r9 = com.p280ss.android.ugc.aweme.utils.C43103en.m136722a()
            if (r9 == 0) goto L_0x0077
            android.view.ContextThemeWrapper r9 = new android.view.ContextThemeWrapper
            r0 = 16973939(0x1030073, float:2.4061222E-38)
            r9.<init>(r8, r0)
            r2 = r9
            goto L_0x0078
        L_0x0077:
            r2 = r8
        L_0x0078:
            android.app.DatePickerDialog r9 = new android.app.DatePickerDialog
            r3 = 2131886340(0x7f120104, float:1.9407256E38)
            r4 = 0
            java.util.GregorianCalendar r0 = r8.f87696i
            r1 = 1
            int r5 = r0.get(r1)
            java.util.GregorianCalendar r0 = r8.f87696i
            r1 = 2
            int r6 = r0.get(r1)
            java.util.GregorianCalendar r0 = r8.f87696i
            r1 = 5
            int r7 = r0.get(r1)
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f87697j = r9
            android.app.DatePickerDialog r9 = r8.f87697j
            r0 = -2
            r1 = 2131821361(0x7f110331, float:1.9275463E38)
            java.lang.String r1 = r8.getString(r1)
            com.ss.android.ugc.aweme.mobile.EditProfileActivityV2$5 r2 = new com.ss.android.ugc.aweme.mobile.EditProfileActivityV2$5
            r2.<init>()
            r9.setButton(r0, r1, r2)
            android.app.DatePickerDialog r9 = r8.f87697j
            r0 = -1
            r1 = 2131821366(0x7f110336, float:1.9275473E38)
            java.lang.String r1 = r8.getString(r1)
            com.ss.android.ugc.aweme.mobile.EditProfileActivityV2$6 r2 = new com.ss.android.ugc.aweme.mobile.EditProfileActivityV2$6
            r2.<init>()
            r9.setButton(r0, r1, r2)
        L_0x00bd:
            android.app.DatePickerDialog r9 = r8.f87697j
            r9.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mobile.EditProfileActivityV2.editBirthday(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
        this.f87695h = true;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        C13380c.m39172c().mo33181b(parse);
        int a = (int) C43086eb.m136676a(this, 1, getResources().getDimension(R.dimen.gi));
        C12133n.m35301a(parse.toString()).mo29836a(a, a).mo29845a("EditProfileActivityV2").mo29844a((C12128i) this.mAvatar).mo29848a();
        mo85917b();
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
        if (isViewValid()) {
            dismissProgressDialog();
            if (i == 112) {
                if (C21115b.m71197a().getCurUser().isNeedRecommend()) {
                    C33602a.m108492a((Activity) this).mo85935a(RecommendFriendActivity.class).mo85936a();
                }
                finish();
            } else if (i == 0) {
                this.f87692e.mo85937a(this, "register_finish");
                setResult(-1);
                finish();
            } else if (i == 4) {
                if (this.f87689b != null) {
                    this.f87689b.mo91617g();
                }
                this.f87694g = true;
                C10761a.m31383a((Context) this, (int) R.string.d1).mo25750a();
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.gi);
                int a = (int) C43086eb.m136676a(this, 1, (float) C43086eb.m136678a((Context) this, (int) R.dimen.gi));
                C12133n.m35299a(C23400r.m76741a(C21115b.m71197a().getCurUser().getAvatarMedium())).mo29851b(a, a).mo29836a(dimensionPixelOffset, dimensionPixelOffset).mo29845a("EditProfileActivityV2").mo29844a((C12128i) this.mAvatar).mo29848a();
                mo85917b();
            } else {
                C10761a.m31383a((Context) this, (int) R.string.cz).mo25750a();
            }
        }
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
        if (isViewValid() && this.f87693f != null) {
            dismissProgressDialog();
            if (i == 112) {
                mo85919d();
                return;
            }
            if (this.f87689b != null) {
                this.f87689b.mo91617g();
                if ((exc instanceof ApiServerException) && ((ApiServerException) exc).getErrorCode() == 20022) {
                    C19282c.m63182a(this, "profile_image_setting", "review_failure");
                }
            }
            C22814a.m75245a(this, exc, R.string.d80);
        }
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
        if (isViewValid()) {
            dismissProgressDialog();
            if (!TextUtils.isEmpty(str)) {
                C10761a.m31403c((Context) AwemeApplication.m21341a(), str).mo25750a();
                if (z) {
                    if (C21115b.m71197a().getCurUser().isNeedRecommend()) {
                        C33602a.m108492a((Activity) this).mo85935a(RecommendFriendActivity.class).mo85936a();
                    }
                    finish();
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f87689b == null || !this.f87689b.mo80249a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
