package com.p1848vk.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p1848vk.sdk.api.C47121c;
import com.p1848vk.sdk.dialogs.C47228a;
import com.p1848vk.sdk.dialogs.C47234b;
import com.p1848vk.sdk.p1849a.C47108b;
import com.p1848vk.sdk.p1849a.C47109c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.vk.sdk.VKServiceActivity */
public class VKServiceActivity extends Activity implements OnDismissListener {

    /* renamed from: com.vk.sdk.VKServiceActivity$VKServiceType */
    public enum VKServiceType {
        Authorization(10485),
        Captcha(14079),
        Validation(11477);
        
        private int outerCode;

        public final int getOuterCode() {
            return this.outerCode;
        }

        private VKServiceType(int i) {
            this.outerCode = i;
        }
    }

    /* renamed from: b */
    private VKServiceType m147277b() {
        return VKServiceType.valueOf(getIntent().getStringExtra("arg1"));
    }

    /* renamed from: c */
    private ArrayList<String> m147278c() {
        return getIntent().getStringArrayListExtra("arg2");
    }

    /* renamed from: a */
    public final long mo118378a() {
        return getIntent().getLongExtra("arg3", 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("arg4", false)) {
            VKSdk.m147249a((Context) this, 0, (String) null);
        }
        VKSdk.m147261a(getApplicationContext());
        switch (m147277b()) {
            case Authorization:
                Context applicationContext = getApplicationContext();
                Bundle bundle2 = new Bundle();
                bundle2.putString(C38347c.f99551f, VKSdk.m147271e());
                bundle2.putInt("client_id", VKSdk.m147263b());
                bundle2.putBoolean("revoke", true);
                bundle2.putString("scope", C47108b.m147300a((Collection<?>) m147278c(), ","));
                String[] a = C47109c.m147307a(applicationContext, "com.vkontakte.android");
                if (!C47109c.m147310b(applicationContext, "com.vkontakte.android") || !C47109c.m147312c(applicationContext, "com.vkontakte.android.action.SDK_AUTH") || a.length <= 0 || !a[0].equals("48761EEF50EE53AFC4CC9C5F10E6BDE7F8F5B82F")) {
                    new C47234b().mo118713a(this, bundle2, VKServiceType.Authorization.getOuterCode(), null);
                    return;
                } else if (bundle == null) {
                    Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH", null);
                    intent.setPackage("com.vkontakte.android");
                    intent.putExtras(bundle2);
                    startActivityForResult(intent, VKServiceType.Authorization.getOuterCode());
                    return;
                }
                break;
            case Captcha:
                C47121c cVar = (C47121c) C47217c.m147670a(mo118378a());
                if (cVar != null) {
                    new C47228a(cVar).mo118705a(this, this);
                    return;
                } else {
                    finish();
                    return;
                }
            case Validation:
                C47121c cVar2 = (C47121c) C47217c.m147670a(mo118378a());
                if (cVar2 == null) {
                    finish();
                    break;
                } else {
                    if (!TextUtils.isEmpty(cVar2.f120929j) && !cVar2.f120929j.contains("&ui=vk_sdk") && !cVar2.f120929j.contains("?ui=vk_sdk")) {
                        if (cVar2.f120929j.indexOf(63) > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(cVar2.f120929j);
                            sb.append("&ui=vk_sdk");
                            cVar2.f120929j = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(cVar2.f120929j);
                            sb2.append("?ui=vk_sdk");
                            cVar2.f120929j = sb2.toString();
                        }
                    }
                    new C47234b().mo118713a(this, new Bundle(), VKServiceType.Validation.getOuterCode(), cVar2);
                    return;
                }
        }
    }

    /* renamed from: a */
    private static Intent m147274a(Context context, VKServiceType vKServiceType) {
        Intent intent = new Intent(context, VKServiceActivity.class);
        intent.putExtra("arg1", vKServiceType.name());
        intent.putExtra("arg4", VKSdk.m147259a());
        return intent;
    }

    /* renamed from: a */
    static void m147275a(Activity activity, ArrayList<String> arrayList) {
        Intent a = m147274a(activity.getApplicationContext(), VKServiceType.Authorization);
        a.putStringArrayListExtra("arg2", arrayList);
        activity.startActivityForResult(a, VKServiceType.Authorization.getOuterCode());
    }

    /* renamed from: a */
    public final void mo118379a(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == VKServiceType.Authorization.getOuterCode() || i == VKServiceType.Validation.getOuterCode()) {
            VKSdk.m147262a((Context) this, i2, intent, (C47216b<C47106a>) new C47216b<C47106a>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo29992a(C47106a aVar) {
                    VKServiceActivity.this.setResult(-1);
                    VKServiceActivity.this.finish();
                }

                /* renamed from: a */
                public final void mo29991a(C47121c cVar) {
                    C47217c a = C47217c.m147670a(VKServiceActivity.this.mo118378a());
                    if (a instanceof C47121c) {
                        C47121c cVar2 = (C47121c) a;
                        if (cVar2.f120922c != null) {
                            cVar2.f120922c.mo118399g();
                            if (cVar2.f120922c.f120899h != null) {
                                cVar2.f120922c.f120899h.mo118376a(cVar);
                            }
                        }
                    }
                    if (cVar != null) {
                        VKServiceActivity.this.setResult(0, VKServiceActivity.this.getIntent().putExtra("vk_extra_error_id", cVar.mo118683a()));
                    } else {
                        VKServiceActivity.this.setResult(0);
                    }
                    VKServiceActivity.this.finish();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m147276a(Context context, C47121c cVar, VKServiceType vKServiceType) {
        Intent a = m147274a(context, vKServiceType);
        a.setFlags(268435456);
        a.putExtra("arg3", cVar.mo118683a());
        if (context != null) {
            context.startActivity(a);
        }
    }
}
