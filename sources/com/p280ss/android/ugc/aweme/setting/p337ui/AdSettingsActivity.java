package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.C1642a;
import com.bytedance.android.live.core.utils.C3408u;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.p280ss.android.ugc.aweme.net.CommonApi;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity */
public class AdSettingsActivity extends AmeActivity {

    /* renamed from: g */
    private static final int f98344g = 2130772068;

    /* renamed from: h */
    private static final int f98345h = 2130772079;

    /* renamed from: a */
    public CommonItemView f98346a;

    /* renamed from: b */
    public DmtLoadingDialog f98347b;

    /* renamed from: c */
    public DmtTextView f98348c;

    /* renamed from: d */
    public ImageView f98349d;

    /* renamed from: e */
    public boolean f98350e;

    /* renamed from: f */
    private View f98351f;

    /* renamed from: i */
    private Aweme f98352i;

    /* renamed from: j */
    private CommonApi f98353j;

    /* renamed from: k */
    private Button f98354k;

    /* renamed from: l */
    private String f98355l;

    /* renamed from: m */
    private C38090d f98356m = new C38090d();

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private void m120656b() {
        super.overridePendingTransition(R.anim.c4, 0);
    }

    /* renamed from: a */
    private void m120652a() {
        this.f98352i = C28479b.m93592a();
        C28479b.m93597b(this.f98352i);
    }

    public void finish() {
        super.finish();
        super.overridePendingTransition(0, R.anim.cf);
    }

    /* renamed from: c */
    private void m120657c() {
        this.f98351f.setOnClickListener(new C37873a(this));
        this.f98349d.setOnClickListener(new C37898b(this));
        this.f98346a.setOnClickListener(new C37899c(this));
        this.f98354k.setOnClickListener(new C37914d(this));
    }

    /* renamed from: d */
    private void m120658d() {
        m120659e();
        this.f98349d = (ImageView) findViewById(R.id.bc1);
        this.f98347b = new DmtLoadingDialog(this);
        this.f98347b.show();
        this.f98351f = findViewById(R.id.jn);
        this.f98346a = (CommonItemView) findViewById(R.id.d9);
        this.f98354k = (Button) findViewById(R.id.pb);
        m120655a(this.f98352i.getAid());
        this.f98349d.setVisibility(8);
        this.f98346a.setVisibility(8);
        this.f98348c.setVisibility(8);
    }

    /* renamed from: e */
    private void m120659e() {
        this.f98348c = (DmtTextView) findViewById(R.id.d8);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(R.string.dqx);
        String a = C1642a.m8034a(getString(R.string.dqw), new Object[]{string});
        int indexOf = a.indexOf(string);
        spannableStringBuilder.append(a);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                textPaint.setColor(AdSettingsActivity.this.getResources().getColor(R.color.a4p));
                textPaint.setFakeBoldText(true);
            }

            public final void onClick(View view) {
                try {
                    AdFeSettings adFeSettings = C30199h.m98861a().getAdFeSettings();
                    if (adFeSettings != null) {
                        String legalPage = adFeSettings.getLegalPage();
                        if (!TextUtils.isEmpty(legalPage)) {
                            C25371n.m83459a(view.getContext(), legalPage, AdSettingsActivity.this.getString(R.string.dr1));
                        }
                    }
                } catch (NullValueException unused) {
                }
            }
        }, indexOf, string.length() + indexOf, 33);
        this.f98348c.setMovementMethod(LinkMovementMethod.getInstance());
        this.f98348c.setText(spannableStringBuilder);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo95102d(View view) {
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95099a(View view) {
        this.f98356m.mo95724a(this.f98355l, (Context) this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo95101c(View view) {
        if (!this.f98346a.mo25778c()) {
            ImageView imageView = (ImageView) view;
            imageView.setSelected(!imageView.isSelected());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo95100b(View view) {
        boolean c = this.f98346a.mo25778c();
        if (!c) {
            if (this.f98349d.isSelected()) {
                m120654a(this.f98352i.getAid(), "1", c);
            }
        } else if (this.f98350e) {
            C10761a.m31400c(C6399b.m19921a(), (int) R.string.dqq, 1).mo25750a();
        } else {
            m120654a(this.f98352i.getAid(), "0", c);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", true);
        super.onCreate(bundle);
        m120656b();
        setContentView((int) R.layout.a7);
        this.f98353j = (CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CommonApi.class);
        this.f98355l = getIntent().getStringExtra("short_url");
        m120652a();
        m120658d();
        m120657c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", false);
    }

    /* renamed from: a */
    private boolean m120655a(String str) {
        if (TextUtils.isEmpty(str) && this.f98353j != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/commerce/item/auth/status/?item_id=");
        sb.append(str);
        this.f98353j.doGet(sb.toString()).enqueue(new C12474e<String>() {
            /* renamed from: a */
            public final void mo26464a(C12466b<String> bVar, Throwable th) {
                AdSettingsActivity.this.f98347b.dismiss();
                AdSettingsActivity.this.finish();
            }

            /* renamed from: a */
            public final void mo26463a(C12466b<String> bVar, C12534t<String> tVar) {
                boolean z = true;
                if (!(tVar == null || !tVar.mo30512c() || tVar.f33302b == null)) {
                    C6711m a = C3408u.m12667a((String) tVar.f33302b);
                    if (TextUtils.equals("1", AdSettingsActivity.m120651a(a, "auth_status"))) {
                        C6709k b = a.mo16149b("has_ad_plan");
                        if (b != null && b.mo16004h()) {
                            AdSettingsActivity.this.f98350e = true;
                        }
                        AdSettingsActivity.this.f98349d.setVisibility(0);
                        AdSettingsActivity.this.f98346a.setVisibility(0);
                        AdSettingsActivity.this.f98348c.setVisibility(0);
                        AdSettingsActivity.this.f98349d.setSelected(z);
                        AdSettingsActivity.this.f98346a.setChecked(z);
                        AdSettingsActivity.this.f98347b.dismiss();
                    }
                }
                z = false;
                AdSettingsActivity.this.f98349d.setVisibility(0);
                AdSettingsActivity.this.f98346a.setVisibility(0);
                AdSettingsActivity.this.f98348c.setVisibility(0);
                AdSettingsActivity.this.f98349d.setSelected(z);
                AdSettingsActivity.this.f98346a.setChecked(z);
                AdSettingsActivity.this.f98347b.dismiss();
            }
        });
        return false;
    }

    /* renamed from: a */
    public static String m120651a(C6711m mVar, String str) {
        if (mVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        C6709k b = mVar.mo16149b(str);
        if (b == null) {
            return null;
        }
        return b.mo15998c();
    }

    /* renamed from: a */
    public static void m120653a(Context context, Aweme aweme, String str) {
        Intent intent = new Intent(context, AdSettingsActivity.class);
        intent.putExtra("short_url", str);
        C28479b.m93593a(aweme);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private void m120654a(String str, String str2, final boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f98346a.setChecked(!z);
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f60502b);
            sb.append("/aweme/v1/commerce/item/auth/");
            String sb2 = sb.toString();
            HashMap hashMap = new HashMap(5);
            hashMap.put("item_id", str);
            hashMap.put("auth", str2);
            this.f98353j.doPost(sb2, hashMap).enqueue(new C12474e<String>() {
                /* renamed from: a */
                public final void mo26464a(C12466b<String> bVar, Throwable th) {
                    C10761a.m31410e(AdSettingsActivity.this.f98346a.getContext(), "Request Faild").mo25750a();
                    AdSettingsActivity.this.f98346a.setChecked(!z);
                }

                /* renamed from: a */
                public final void mo26463a(C12466b<String> bVar, C12534t<String> tVar) {
                    if (tVar != null && tVar.mo30512c() && tVar.f33302b != null) {
                        C6711m a = C3408u.m12667a((String) tVar.f33302b);
                        if (!TextUtils.isEmpty(AdSettingsActivity.m120651a(a, "status_msg"))) {
                            C10761a.m31410e(AdSettingsActivity.this.f98346a.getContext(), a.mo16149b("status_msg").mo15998c()).mo25750a();
                        }
                        String a2 = AdSettingsActivity.m120651a(a, "auth_status");
                        if (!TextUtils.isEmpty(a2)) {
                            AdSettingsActivity.this.f98346a.setChecked(TextUtils.equals("1", a2));
                        }
                    }
                }
            });
        }
    }
}
