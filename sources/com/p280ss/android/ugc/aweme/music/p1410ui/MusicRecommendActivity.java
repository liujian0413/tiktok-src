package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.C33762b.C33765a;
import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.dialog.C33955a;
import com.p280ss.android.ugc.aweme.music.p1410ui.dialog.C33955a.C33957a;
import com.p280ss.android.ugc.aweme.music.presenter.C33806h;
import com.p280ss.android.ugc.aweme.music.presenter.C33808i;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity */
public class MusicRecommendActivity extends AmeSSActivity implements C33960e {

    /* renamed from: a */
    public C33955a f88384a;

    /* renamed from: b */
    public C41654d f88385b;

    /* renamed from: c */
    public String f88386c;

    /* renamed from: d */
    public int f88387d;

    /* renamed from: e */
    ClickableSpan f88388e = new ClickableSpan() {
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(C0683b.m2912c(MusicRecommendActivity.this, R.color.a71));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            if (MusicRecommendActivity.this.f88384a == null) {
                MusicRecommendActivity.this.f88384a = new C33957a().mo86622a("https://api2.musical.ly/aweme/in_app/music_agreement/").mo86623a((Context) MusicRecommendActivity.this);
            }
            if (!MusicRecommendActivity.this.f88384a.isShowing()) {
                MusicRecommendActivity.this.f88384a.show();
            }
        }
    };
    EditText editSongLink;
    EditText editSongName;

    /* renamed from: f */
    public C33765a f88389f = new C33765a() {
        /* renamed from: a */
        public final void mo86185a(final int i) {
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    MusicRecommendActivity.this.f88385b.setProgress(i);
                }
            });
        }

        /* renamed from: a */
        public final void mo86186a(final String str, long j) {
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    MusicRecommendActivity.this.mo86524a(str);
                }
            });
        }

        /* renamed from: a */
        public final void mo86187a(String str, final Exception exc, long j) {
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    C10761a.m31399c((Context) MusicRecommendActivity.this, (int) R.string.ci2).mo25750a();
                    if (MusicRecommendActivity.this.isViewValid() && MusicRecommendActivity.this.isActive()) {
                        MusicRecommendActivity.this.f88385b.dismiss();
                    }
                }
            });
        }
    };

    /* renamed from: g */
    private C33808i f88390g;

    /* renamed from: h */
    private String f88391h;
    ImageView ivClickUpload;
    LinearLayout llClickForUpload;
    TextTitleBar mTitleBar;
    TextView tvContentAgreement;
    TextView txtClickUploadTv;

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* renamed from: b */
    public final void mo86525b() {
        C10761a.m31399c((Context) this, (int) R.string.ci2).mo25750a();
        this.f88385b.dismiss();
    }

    /* renamed from: c */
    public final void mo86526c() {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                try {
                    MusicApi.m108890a(MusicRecommendActivity.this.f88386c, MusicRecommendActivity.this.f88389f);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo86522a() {
        this.f88385b.setContentView(R.layout.a87);
        ((RelativeLayout) this.f88385b.findViewById(R.id.cwi)).setLayoutParams(new LayoutParams((int) C9738o.m28708b((Context) this, 140.0f), this.f88387d, 17));
        C6726a.m20843a(new Runnable() {
            public final void run() {
                MusicRecommendActivity.this.f88385b.dismiss();
                C10761a.m31383a((Context) MusicRecommendActivity.this, (int) R.string.e6y).mo25750a();
                MusicRecommendActivity.this.finish();
            }
        }, VETransitionFilterParam.TransitionDuration_DEFAULT);
    }

    /* renamed from: d */
    public final void mo86527d() {
        this.f88385b = C41654d.m132586b(this, getResources().getString(R.string.dvg));
        final View findViewById = this.f88385b.findViewById(R.id.cwi);
        if (findViewById != null) {
            findViewById.post(new Runnable() {
                public final void run() {
                    MusicRecommendActivity.this.f88387d = findViewById.getHeight();
                }
            });
        }
        this.f88385b.setOnDismissListener(new OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                MusicRecommendActivity.this.f88385b.setContentView(R.layout.a87);
            }
        });
    }

    /* renamed from: e */
    private void m109199e() {
        this.f88390g = new C33808i();
        this.f88390g.mo66536a(new C33806h());
        this.f88390g.mo66537a(this);
        SpannableString spannableString = new SpannableString(getString(R.string.agt));
        spannableString.setSpan(this.f88388e, 2, 10, 33);
        this.tvContentAgreement.setText(spannableString);
        this.tvContentAgreement.setMovementMethod(LinkMovementMethod.getInstance());
        this.tvContentAgreement.setHighlightColor(0);
        this.mTitleBar.setColorMode(0);
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: c */
            static final /* synthetic */ void m109206c(View view) {
                if (view != null) {
                    view.performLongClick();
                }
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                MusicRecommendActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo25896b(View view) {
                if (TextUtils.isEmpty(MusicRecommendActivity.this.editSongName.getText().toString())) {
                    C10761a.m31409e((Context) MusicRecommendActivity.this, (int) R.string.cv2).mo25750a();
                } else if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                    C32656f.m105744a((Activity) MusicRecommendActivity.this, "recommend_music", "click_music", (Bundle) null, (C23305g) new C33934aj(view));
                } else {
                    MusicRecommendActivity.this.mo86527d();
                    if (!TextUtils.isEmpty(MusicRecommendActivity.this.f88386c)) {
                        MusicRecommendActivity.this.mo86526c();
                    } else {
                        MusicRecommendActivity.this.mo86524a("");
                    }
                }
            }
        });
        this.llClickForUpload.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C33784d.m108926a((Activity) MusicRecommendActivity.this, 1);
                C6907h.onEvent(MobClick.obtain().setEventName("hand_in").setLabelName("recommend_music"));
            }
        });
        this.editSongName.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                MusicRecommendActivity.this.editSongName.setSelection(charSequence.length());
                MusicRecommendActivity.this.mo86523a(MusicRecommendActivity.this.editSongName, 50);
            }
        });
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(R.anim.s, 0);
        setContentView((int) R.layout.ef);
        m109199e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo86524a(String str) {
        String str2;
        int i;
        String obj = this.editSongName.getText().toString();
        String obj2 = this.editSongLink.getText().toString();
        if (!TextUtils.isEmpty(str)) {
            str2 = "";
            i = 1;
        } else {
            str2 = obj2;
            i = 2;
        }
        this.f88390g.mo56976a(Integer.valueOf(i), str, str2, obj);
    }

    /* renamed from: a */
    public final void mo86523a(EditText editText, int i) {
        Editable text = editText.getText();
        if (text.length() > 50) {
            C10761a.m31403c((Context) this, getString(R.string.c8q, new Object[]{"50"})).mo25750a();
            int selectionEnd = Selection.getSelectionEnd(text);
            editText.setText(text.toString().substring(0, 50));
            Editable text2 = editText.getText();
            if (selectionEnd > text2.length()) {
                selectionEnd = text2.length();
            }
            Selection.setSelection(text2, selectionEnd);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            this.f88391h = intent.getStringExtra("local_music_name");
            this.f88386c = intent.getStringExtra("local_music_path");
            this.editSongName.setText(this.f88391h);
            this.txtClickUploadTv.setText(this.f88391h);
            this.ivClickUpload.setImageResource(R.drawable.aj8);
            this.mTitleBar.getEndText().setTextColor(Color.parseColor("#fe2c55"));
        }
    }
}
