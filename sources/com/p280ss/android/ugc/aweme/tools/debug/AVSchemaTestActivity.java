package com.p280ss.android.ugc.aweme.tools.debug;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity */
public final class AVSchemaTestActivity extends AmeActivity {

    /* renamed from: a */
    public final String f109923a = "openRecord";

    /* renamed from: b */
    public final String f109924b = "studio/create";

    /* renamed from: c */
    public final String f109925c = "publishVideo";

    /* renamed from: d */
    public final String f109926d = C22909c.f60637a;

    /* renamed from: e */
    public final String f109927e = "aweme";

    /* renamed from: f */
    public String f109928f = mo103697a();

    /* renamed from: g */
    public String f109929g = this.f109924b;

    /* renamed from: h */
    public String f109930h = "";

    /* renamed from: i */
    public String f109931i = "";

    /* renamed from: j */
    public String f109932j = "";

    /* renamed from: k */
    private final String f109933k = "准备打开的链接是:";

    /* renamed from: l */
    private final String f109934l = "snssdk1128";

    /* renamed from: m */
    private final String f109935m = "snssdk1233";

    /* renamed from: n */
    private final String f109936n = "snssdk1180";

    /* renamed from: o */
    private String f109937o = "";

    /* renamed from: p */
    private HashMap f109938p;

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$a */
    public static abstract class C42251a implements TextWatcher {
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$b */
    public static final class C42252b extends C42251a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f109939a;

        C42252b(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f109939a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f109939a.f109931i = editable.toString();
                    EditText editText = (EditText) this.f109939a.mo103696a(R.id.aft);
                    C7573i.m23582a((Object) editText, "etMusic");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f109939a.mo103696a(R.id.f124313afu);
                    C7573i.m23582a((Object) editText2, "etSticker");
                    editText2.setEnabled(false);
                    this.f109939a.mo103699c();
                }
            }
            EditText editText3 = (EditText) this.f109939a.mo103696a(R.id.aft);
            C7573i.m23582a((Object) editText3, "etMusic");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f109939a.mo103696a(R.id.f124313afu);
            C7573i.m23582a((Object) editText4, "etSticker");
            editText4.setEnabled(true);
            this.f109939a.mo103699c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$c */
    public static final class C42253c extends C42251a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f109940a;

        C42253c(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f109940a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f109940a.f109930h = editable.toString();
                    EditText editText = (EditText) this.f109940a.mo103696a(R.id.aft);
                    C7573i.m23582a((Object) editText, "etMusic");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f109940a.mo103696a(R.id.afq);
                    C7573i.m23582a((Object) editText2, "etChallenge");
                    editText2.setEnabled(false);
                    this.f109940a.mo103699c();
                }
            }
            EditText editText3 = (EditText) this.f109940a.mo103696a(R.id.aft);
            C7573i.m23582a((Object) editText3, "etMusic");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f109940a.mo103696a(R.id.afq);
            C7573i.m23582a((Object) editText4, "etChallenge");
            editText4.setEnabled(true);
            this.f109940a.mo103699c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$d */
    public static final class C42254d extends C42251a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f109941a;

        C42254d(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f109941a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f109941a.f109932j = editable.toString();
                    EditText editText = (EditText) this.f109941a.mo103696a(R.id.afq);
                    C7573i.m23582a((Object) editText, "etChallenge");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f109941a.mo103696a(R.id.f124313afu);
                    C7573i.m23582a((Object) editText2, "etSticker");
                    editText2.setEnabled(false);
                    this.f109941a.mo103699c();
                }
            }
            EditText editText3 = (EditText) this.f109941a.mo103696a(R.id.afq);
            C7573i.m23582a((Object) editText3, "etChallenge");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f109941a.mo103696a(R.id.f124313afu);
            C7573i.m23582a((Object) editText4, "etSticker");
            editText4.setEnabled(true);
            this.f109941a.mo103699c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$e */
    public static final class C42255e extends C42251a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f109942a;

        C42255e(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f109942a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            this.f109942a.mo103699c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$f */
    static final class C42256f implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f109943a;

        C42256f(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f109943a = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.cnv) {
                this.f109943a.f109928f = this.f109943a.mo103697a();
            } else if (i == R.id.cnu) {
                this.f109943a.f109928f = this.f109943a.f109926d;
            } else if (i == R.id.cnt) {
                this.f109943a.f109928f = this.f109943a.f109927e;
            }
            this.f109943a.mo103699c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$g */
    static final class C42257g implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f109944a;

        C42257g(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f109944a = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.cny) {
                this.f109944a.f109929g = this.f109944a.f109924b;
            } else if (i == R.id.cnw) {
                this.f109944a.f109929g = this.f109944a.f109923a;
            } else if (i == R.id.cnx) {
                this.f109944a.f109929g = this.f109944a.f109925c;
            }
            this.f109944a.mo103699c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$h */
    static final class C42258h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f109945a;

        C42258h(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f109945a = aVSchemaTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String b = this.f109945a.mo103698b();
            if (C7634n.m23721b(b, this.f109945a.f109927e, false)) {
                C7195s.m22438a().mo18682a(b);
                return;
            }
            Intent intent = new Intent();
            intent.setData(Uri.parse(b));
            this.f109945a.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$i */
    static final class C42259i implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f109946a;

        C42259i(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f109946a = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f109946a.mo103699c();
        }
    }

    /* renamed from: a */
    public final View mo103696a(int i) {
        if (this.f109938p == null) {
            this.f109938p = new HashMap();
        }
        View view = (View) this.f109938p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f109938p.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final String mo103697a() {
        if (C6399b.m19946v()) {
            return this.f109935m;
        }
        if (C6399b.m19947w()) {
            return this.f109936n;
        }
        return this.f109934l;
    }

    /* renamed from: b */
    public final String mo103698b() {
        CheckBox checkBox = (CheckBox) mo103696a(R.id.tl);
        C7573i.m23582a((Object) checkBox, "cbUrl");
        if (!checkBox.isChecked()) {
            return m134396e();
        }
        EditText editText = (EditText) mo103696a(R.id.afv);
        C7573i.m23582a((Object) editText, "etUrl");
        return editText.getText().toString();
    }

    /* renamed from: c */
    public final void mo103699c() {
        TextView textView = (TextView) mo103696a(R.id.dq7);
        C7573i.m23582a((Object) textView, "tvUrl");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f109933k);
        sb.append(mo103698b());
        textView.setText(sb.toString());
    }

    /* renamed from: d */
    private final void m134395d() {
        ((EditText) mo103696a(R.id.afq)).addTextChangedListener(new C42252b(this));
        ((EditText) mo103696a(R.id.f124313afu)).addTextChangedListener(new C42253c(this));
        ((EditText) mo103696a(R.id.aft)).addTextChangedListener(new C42254d(this));
        ((EditText) mo103696a(R.id.afr)).addTextChangedListener(new C42255e(this));
        ((RadioGroup) mo103696a(R.id.cso)).setOnCheckedChangeListener(new C42256f(this));
        ((RadioGroup) mo103696a(R.id.csp)).setOnCheckedChangeListener(new C42257g(this));
        ((TextView) mo103696a(R.id.dq3)).setOnClickListener(new C42258h(this));
        ((CheckBox) mo103696a(R.id.tl)).setOnCheckedChangeListener(new C42259i(this));
    }

    /* renamed from: e */
    private final String m134396e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f109928f);
        sb.append("://");
        String sb2 = sb.toString();
        String str = this.f109929g;
        if (C7573i.m23585a((Object) str, (Object) this.f109924b)) {
            if (TextUtils.isEmpty(this.f109930h)) {
                return sb2;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f109929g);
            sb3.append("?type=use_sticker&sticker_id=");
            sb3.append(this.f109930h);
            String sb4 = sb3.toString();
            if (TextUtils.isEmpty(this.f109937o)) {
                return sb4;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append("&enter_from=");
            sb5.append(this.f109937o);
            return sb5.toString();
        } else if (C7573i.m23585a((Object) str, (Object) this.f109923a)) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb2);
            sb6.append(this.f109929g);
            sb6.append("?recordOrigin=system&");
            String sb7 = sb6.toString();
            if (!TextUtils.isEmpty(this.f109930h)) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(sb7);
                sb8.append("recordParam=sticker&id=");
                sb8.append(this.f109930h);
                return sb8.toString();
            } else if (!TextUtils.isEmpty(this.f109931i)) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb7);
                sb9.append("recordParam=challenge&id=");
                sb9.append(this.f109931i);
                return sb9.toString();
            } else if (TextUtils.isEmpty(this.f109932j)) {
                return sb7;
            } else {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb7);
                sb10.append("recordParam=music&id=");
                sb10.append(this.f109932j);
                return sb10.toString();
            }
        } else if (!C7573i.m23585a((Object) str, (Object) this.f109925c)) {
            return sb2;
        } else {
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb2);
            sb11.append(this.f109929g);
            sb11.append('?');
            return sb11.toString();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.af);
        m134395d();
        ((EditText) mo103696a(R.id.f124313afu)).setText("89604");
        RadioButton radioButton = (RadioButton) mo103696a(R.id.cnu);
        C7573i.m23582a((Object) radioButton, "rbLocal");
        radioButton.setChecked(true);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onCreate", false);
    }
}
