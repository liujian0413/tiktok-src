package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9044al;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.verify.ZhimaVerifyApi;
import com.bytedance.android.livesdk.verify.model.C9109a;
import com.bytedance.android.livesdk.verify.model.QueryZhimaStatusResponse;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class VerifyZhimaCreditMethod extends C11152c<JSONObject, Object> implements C0042h {
    private static final String TAG = "VerifyZhimaCreditMethod";
    public Activity activity;
    public boolean backFromAliPay;
    private ProgressDialog mProgressDialog;
    public String mZhimaToken;

    public void hideProgressDlg() {
        if (this.mProgressDialog != null && this.mProgressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
    }

    public void onTerminate() {
        if (this.activity instanceof AppCompatActivity) {
            ((AppCompatActivity) this.activity).getLifecycle().mo56b(this);
        }
    }

    public void jump2AliVerify() {
        AppCompatActivity appCompatActivity;
        showProgressDlg(this.activity);
        C7492s a = ((ZhimaVerifyApi) C9178j.m27302j().mo22373b().mo10440a(ZhimaVerifyApi.class)).zhimaVerify("snssdk1112://", "0").mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
        if (this.activity instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) this.activity;
        } else {
            appCompatActivity = null;
        }
        ((C3245ad) a.mo19297a((C7494t<T, ? extends R>) C3255e.m12295a((FragmentActivity) appCompatActivity))).mo10183a(new C7326g<C3479d<C9109a>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C3479d<C9109a> dVar) throws Exception {
                VerifyZhimaCreditMethod.this.hideProgressDlg();
                Intent intent = new Intent("android.intent.action.VIEW");
                StringBuilder sb = new StringBuilder("alipays://platformapi/startapp?appId=20000067&url=");
                sb.append(URLEncoder.encode(((C9109a) dVar.data).f24798e));
                intent.setData(Uri.parse(sb.toString()));
                VerifyZhimaCreditMethod.this.mZhimaToken = ((C9109a) dVar.data).f24799f;
                VerifyZhimaCreditMethod.this.backFromAliPay = true;
                VerifyZhimaCreditMethod.this.activity.startActivity(intent);
            }
        }, new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                VerifyZhimaCreditMethod.this.hideProgressDlg();
                C9076n.m27095a(VerifyZhimaCreditMethod.this.activity, th);
            }
        });
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        AppCompatActivity appCompatActivity;
        if (this.backFromAliPay) {
            C7492s a = ((ZhimaVerifyApi) C9178j.m27302j().mo22373b().mo10440a(ZhimaVerifyApi.class)).queryZhimaVerifyStatus(this.mZhimaToken).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
            if (this.activity instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) this.activity;
            } else {
                appCompatActivity = null;
            }
            ((C3245ad) a.mo19297a((C7494t<T, ? extends R>) C3255e.m12295a((FragmentActivity) appCompatActivity))).mo10183a(new C7326g<C3479d<QueryZhimaStatusResponse>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(final C3479d<QueryZhimaStatusResponse> dVar) throws Exception {
                    VerifyZhimaCreditMethod.this.backFromAliPay = false;
                    if (((QueryZhimaStatusResponse) dVar.data).getPassed()) {
                        C9049ap.m27022a((int) R.string.ff1);
                        C8443c.m25663a().mo21607a("credit_auth_success", new Object[0]);
                        HashMap hashMap = new HashMap();
                        hashMap.put("eventName", "credit_auth_success");
                        C8444d.m25673b().mo10001b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                    } else if (!TextUtils.isEmpty(((QueryZhimaStatusResponse) dVar.data).getFailedReason())) {
                        new C3534a(VerifyZhimaCreditMethod.this.activity).mo10648a((int) R.string.ei0).mo10660b((CharSequence) ((QueryZhimaStatusResponse) dVar.data).getFailedReason()).mo10656a(true).mo10659b((int) R.string.ecm, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("status", String.valueOf(((QueryZhimaStatusResponse) dVar.data).getStatusCode()));
                                hashMap.put("prompt", ((QueryZhimaStatusResponse) dVar.data).getFailedReason());
                                hashMap.put("action_type", "cancel");
                                C8443c.m25663a().mo21606a("credit_auth_fail", hashMap, new Object[0]);
                                hashMap.put("eventName", "credit_auth_fail");
                                C8444d.m25673b().mo10001b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                                dialogInterface.dismiss();
                            }
                        }).mo10649a((int) R.string.fbo, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("status", String.valueOf(((QueryZhimaStatusResponse) dVar.data).getStatusCode()));
                                hashMap.put("prompt", ((QueryZhimaStatusResponse) dVar.data).getFailedReason());
                                hashMap.put("action_type", "retry");
                                C8443c.m25663a().mo21606a("credit_auth_fail", hashMap, new Object[0]);
                                hashMap.put("eventName", "credit_auth_fail");
                                C8444d.m25673b().mo10001b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                                VerifyZhimaCreditMethod.this.jump2AliVerify();
                                dialogInterface.dismiss();
                            }
                        }).mo10657a().show();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("status", String.valueOf(((QueryZhimaStatusResponse) dVar.data).getStatusCode()));
                        hashMap2.put("prompt", ((QueryZhimaStatusResponse) dVar.data).getFailedReason());
                        C8443c.m25663a().mo21606a("credit_auth_fail", hashMap2, new Object[0]);
                        hashMap2.put("eventName", "credit_auth_fail");
                        C8444d.m25673b().mo10001b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap2);
                    }
                }
            }, new C7326g<Throwable>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    VerifyZhimaCreditMethod.this.backFromAliPay = false;
                    if (th instanceof ApiServerException) {
                        ApiServerException apiServerException = (ApiServerException) th;
                        if (apiServerException.getErrorCode() == 20207) {
                            String a = C3358ac.m12515a((int) R.string.f7x);
                            if (!TextUtils.isEmpty(apiServerException.getAlert())) {
                                a = apiServerException.getAlert();
                            } else if (!TextUtils.isEmpty(apiServerException.getErrorMsg())) {
                                a = apiServerException.getErrorMsg();
                            }
                            if (VerifyZhimaCreditMethod.this.activity != null) {
                                new C3534a(VerifyZhimaCreditMethod.this.activity).mo10648a((int) R.string.ei0).mo10660b((CharSequence) a).mo10656a(true).mo10659b((int) R.string.ecm, (OnClickListener) new OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("action_type", "cancel");
                                        C8443c.m25663a().mo21606a("artificial_auth_popup", hashMap, new Object[0]);
                                        hashMap.put("eventName", "artificial_auth_popup");
                                        C8444d.m25673b().mo10001b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                                        dialogInterface.dismiss();
                                    }
                                }).mo10649a((int) R.string.emy, (OnClickListener) new OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        TTLiveSDKContext.getHostService().mo22370k();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("action_type", "confirm");
                                        C8443c.m25663a().mo21606a("artificial_auth_popup", hashMap, new Object[0]);
                                        hashMap.put("eventName", "artificial_auth_popup");
                                        C8444d.m25673b().mo10001b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                                        dialogInterface.dismiss();
                                    }
                                }).mo10657a().show();
                                HashMap hashMap = new HashMap();
                                hashMap.put("status", "0");
                                String str = "prompt";
                                if (a == null) {
                                    a = "";
                                }
                                hashMap.put(str, a);
                                C8443c.m25663a().mo21606a("credit_auth_fail", hashMap, new Object[0]);
                                hashMap.put("eventName", "credit_auth_fail");
                                C8444d.m25673b().mo10001b(VerifyZhimaCreditMethod.TAG, (Map<String, ?>) hashMap);
                            }
                        }
                    }
                }
            });
            this.mZhimaToken = "";
        }
    }

    private static boolean hasAlipayInstalled(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("alipays://"));
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    public void showProgressDlg(Activity activity2) {
        if (activity2 != null && !activity2.isFinishing()) {
            this.mProgressDialog = C9044al.m27010a(activity2, "");
            if (this.mProgressDialog != null) {
                this.mProgressDialog.setCancelable(false);
                this.mProgressDialog.setCanceledOnTouchOutside(false);
            }
        }
    }

    public void invoke(JSONObject jSONObject, CallContext callContext) throws Exception {
        this.activity = C3384d.m12589a(callContext.f30265a);
        if (this.activity != null) {
            if (!hasAlipayInstalled(this.activity)) {
                new C3534a(this.activity).mo10648a((int) R.string.ei0).mo10658b((int) R.string.fg_).mo10649a((int) R.string.f3c, (OnClickListener) null).mo10657a().show();
                C8443c.m25663a().mo21607a("alipay_install_notification", new Object[0]);
                return;
            }
            jump2AliVerify();
        }
    }
}
