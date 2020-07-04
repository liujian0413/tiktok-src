package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter;
import com.p280ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter.C33798b;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity */
public class EditOriginMusicTitleActivity extends AmeSSActivity implements C33798b {

    /* renamed from: a */
    public static final String f88230a = "EditOriginMusicTitleActivity";

    /* renamed from: b */
    public static final int f88231b;
    ImageView backBtn;

    /* renamed from: c */
    public String f88232c;
    ImageButton clearBtn;

    /* renamed from: d */
    public String f88233d;
    Button doneBtn;

    /* renamed from: e */
    public EditOriginMusicTitlePresenter f88234e;

    /* renamed from: f */
    private final String f88235f = "[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+";
    EditText musicTitleEdt;

    /* renamed from: b */
    public final void mo86415b() {
        dismissProgressDialog();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        int i;
        if (C30538p.m99745a()) {
            i = 50;
        } else {
            i = 12;
        }
        f88231b = i;
    }

    /* renamed from: a */
    public final void mo86414a() {
        dismissProgressDialog();
        Intent intent = new Intent();
        intent.putExtra("MUSIC_TITLE", this.f88232c);
        setResult(-1, intent);
        finish();
    }

    public void setStatusBarColor() {
        boolean z;
        ImmersionBar with = ImmersionBar.with((Activity) this);
        if (C6399b.m19946v() || C7212bb.m22493a()) {
            z = true;
        } else {
            z = false;
        }
        with.statusBarDarkFont(z).statusBarColor((int) R.color.a3z).init();
    }

    /* renamed from: a */
    private static boolean m109022a(String str) {
        if (!Pattern.matches("[._ \\u0030-\\u0039\\u0041-\\u005A\\u005F\\u0061-\\u007A\\u00C0-\\u02B8\\u0370-\\u058F\\u0600-\\u077F\\u0900-\\u1DBF\\u1E00-\\u1FFF\\u2150-\\u218F\\u2C00-\\u2DDF\\u2E80-\\u2FDF\\u3040-\\u31FF\\u3400-\\u4DBF\\u4E00-\\uA6FF\\uA720-\\uABFF\\uAC00-\\uD7A3]+", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo86451a(boolean z) {
        int i;
        Drawable background = this.doneBtn.getBackground();
        if (z) {
            i = NormalGiftView.ALPHA_255;
        } else {
            i = NormalGiftView.MASK_TRANSLATE_VALUE;
        }
        background.setAlpha(i);
        this.doneBtn.setTextColor(getResources().getColor(R.color.lt));
        this.doneBtn.setEnabled(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bg);
        this.f88234e = new EditOriginMusicTitlePresenter(this);
        this.f88233d = getIntent().getStringExtra("MUSIC_TITLE");
        mo86451a(false);
        this.musicTitleEdt.setFilters(new InputFilter[]{new LengthFilter(f88231b)});
        this.musicTitleEdt.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() > 0) {
                    EditOriginMusicTitleActivity.this.mo86451a(true);
                    EditOriginMusicTitleActivity.this.clearBtn.setVisibility(0);
                    return;
                }
                EditOriginMusicTitleActivity.this.mo86451a(false);
                EditOriginMusicTitleActivity.this.clearBtn.setVisibility(4);
            }
        });
        findViewById(R.id.dal).setLayoutParams(new LayoutParams(-1, C10994a.m32204a((Context) this)));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity", "onCreate", false);
    }

    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.jo) {
            finish();
        } else if (id == R.id.a_8) {
            String trim = this.musicTitleEdt.getText().toString().trim().replaceAll("[ ]{2,}", " ").trim();
            if (m109022a(trim)) {
                C10761a.m31409e((Context) this, (int) R.string.axf).mo25750a();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("title", trim);
            } catch (JSONException unused) {
            }
            C6907h.onEvent(MobClick.obtain().setEventName("confirm_title").setLabelName("song_cover").setValue(this.f88233d).setJsonObject(jSONObject));
            C6907h.onEvent(MobClick.obtain().setEventName("original_title_change_alert").setLabelName("original_music"));
            this.f88232c = trim;
            new C11030a(this).mo26645b((int) R.string.afo).mo26635a((int) R.string.afn, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    EditOriginMusicTitleActivity.this.f88234e.mo86412a(EditOriginMusicTitleActivity.this.f88233d, EditOriginMusicTitleActivity.this.f88232c);
                    C6907h.onEvent(MobClick.obtain().setEventName("original_title_change_alert").setLabelName("confirm"));
                    EditOriginMusicTitleActivity.this.showProgressDialog();
                }
            }).mo26646b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo26642a(false).mo26649b();
        } else {
            if (id == R.id.wl) {
                this.musicTitleEdt.setText("");
            }
        }
    }
}
