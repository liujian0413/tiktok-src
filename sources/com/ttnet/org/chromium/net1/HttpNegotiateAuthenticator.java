package com.ttnet.org.chromium.net1;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import com.ttnet.org.chromium.base1.ApplicationStatus;
import com.ttnet.org.chromium.base1.ContextUtils;
import com.ttnet.org.chromium.base1.Log;
import com.ttnet.org.chromium.base1.ThreadUtils;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import java.io.IOException;

@JNINamespace("net::android")
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final String mAccountType;
    private Bundle mSpnegoContext;

    class GetAccountsCallback implements AccountManagerCallback<Account[]> {
        private final RequestData mRequestData;

        public void run(AccountManagerFuture<Account[]> accountManagerFuture) {
            try {
                Account[] accountArr = (Account[]) accountManagerFuture.getResult();
                if (accountArr.length == 0) {
                    Log.m22901w("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.mRequestData.nativeResultObject, -341, null);
                } else if (accountArr.length > 1) {
                    Log.m22901w("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(accountArr.length));
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.mRequestData.nativeResultObject, -341, null);
                } else if (HttpNegotiateAuthenticator.this.lacksPermission(ContextUtils.getApplicationContext(), "android.permission.USE_CREDENTIALS", true)) {
                    Log.m22891e("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.mRequestData.nativeResultObject, -343, null);
                } else {
                    this.mRequestData.account = accountArr[0];
                    this.mRequestData.accountManager.getAuthToken(this.mRequestData.account, this.mRequestData.authTokenType, this.mRequestData.options, true, new GetTokenCallback(this.mRequestData), new Handler(ThreadUtils.getUiThreadLooper()));
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.m22901w("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
                HttpNegotiateAuthenticator.this.nativeSetResult(this.mRequestData.nativeResultObject, -9, null);
            }
        }

        public GetAccountsCallback(RequestData requestData) {
            this.mRequestData = requestData;
        }
    }

    class GetTokenCallback implements AccountManagerCallback<Bundle> {
        public final RequestData mRequestData;

        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            try {
                Bundle bundle = (Bundle) accountManagerFuture.getResult();
                if (bundle.containsKey("intent")) {
                    final Context applicationContext = ContextUtils.getApplicationContext();
                    applicationContext.registerReceiver(new BroadcastReceiver() {
                        public void onReceive(Context context, Intent intent) {
                            applicationContext.unregisterReceiver(this);
                            GetTokenCallback.this.mRequestData.accountManager.getAuthToken(GetTokenCallback.this.mRequestData.account, GetTokenCallback.this.mRequestData.authTokenType, GetTokenCallback.this.mRequestData.options, true, new GetTokenCallback(GetTokenCallback.this.mRequestData), null);
                        }
                    }, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                    return;
                }
                HttpNegotiateAuthenticator.this.processResult(bundle, this.mRequestData);
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.m22901w("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                HttpNegotiateAuthenticator.this.nativeSetResult(this.mRequestData.nativeResultObject, -9, null);
            }
        }

        public GetTokenCallback(RequestData requestData) {
            this.mRequestData = requestData;
        }
    }

    static class RequestData {
        public Account account;
        public AccountManager accountManager;
        public String authTokenType;
        public long nativeResultObject;
        public Bundle options;

        RequestData() {
        }
    }

    /* access modifiers changed from: 0000 */
    public native void nativeSetResult(long j, int i, String str);

    protected HttpNegotiateAuthenticator(String str) {
        this.mAccountType = str;
    }

    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    public void processResult(Bundle bundle, RequestData requestData) {
        this.mSpnegoContext = bundle.getBundle("spnegoContext");
        int i = -9;
        switch (bundle.getInt("spnegoResult", 1)) {
            case 0:
                i = 0;
                break;
            case 2:
                i = -3;
                break;
            case 3:
                i = -342;
                break;
            case 4:
                i = -320;
                break;
            case 5:
                i = -338;
                break;
            case 6:
                i = -339;
                break;
            case 7:
                i = -341;
                break;
            case 8:
                i = -344;
                break;
            case 9:
                i = -329;
                break;
        }
        nativeSetResult(requestData.nativeResultObject, i, bundle.getString("authtoken"));
    }

    /* access modifiers changed from: 0000 */
    public boolean lacksPermission(Context context, String str, boolean z) {
        if ((!z || VERSION.SDK_INT < 23) && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return true;
        }
        return false;
    }

    private void requestTokenWithoutActivity(Context context, RequestData requestData, String[] strArr) {
        if (lacksPermission(context, "android.permission.GET_ACCOUNTS", true)) {
            Log.m22891e("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
            nativeSetResult(requestData.nativeResultObject, -343, null);
            return;
        }
        requestData.accountManager.getAccountsByTypeAndFeatures(this.mAccountType, strArr, new GetAccountsCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
    }

    private void requestTokenWithActivity(Context context, Activity activity, RequestData requestData, String[] strArr) {
        boolean z;
        String str;
        if (VERSION.SDK_INT < 23) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "android.permission.MANAGE_ACCOUNTS";
        } else {
            str = "android.permission.GET_ACCOUNTS";
        }
        if (lacksPermission(context, str, z)) {
            Log.m22891e("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", str);
            nativeSetResult(requestData.nativeResultObject, -343, null);
            return;
        }
        requestData.accountManager.getAuthTokenByFeatures(this.mAccountType, requestData.authTokenType, strArr, activity, null, requestData.options, new GetTokenCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
    }

    /* access modifiers changed from: 0000 */
    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context applicationContext = ContextUtils.getApplicationContext();
        RequestData requestData = new RequestData();
        StringBuilder sb = new StringBuilder("SPNEGO:HOSTBASED:");
        sb.append(str);
        requestData.authTokenType = sb.toString();
        requestData.accountManager = AccountManager.get(applicationContext);
        requestData.nativeResultObject = j;
        String[] strArr = {"SPNEGO"};
        requestData.options = new Bundle();
        if (str2 != null) {
            requestData.options.putString("incomingAuthToken", str2);
        }
        if (this.mSpnegoContext != null) {
            requestData.options.putBundle("spnegoContext", this.mSpnegoContext);
        }
        requestData.options.putBoolean("canDelegate", z);
        Activity lastTrackedFocusedActivity = ApplicationStatus.getLastTrackedFocusedActivity();
        if (lastTrackedFocusedActivity == null) {
            requestTokenWithoutActivity(applicationContext, requestData, strArr);
        } else {
            requestTokenWithActivity(applicationContext, lastTrackedFocusedActivity, requestData, strArr);
        }
    }
}
