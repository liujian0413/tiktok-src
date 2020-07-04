package com.p280ss.android.mobilelib;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.NetworkType;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.newmedia.p893d.C19930a;
import com.p280ss.android.sdk.app.C20113d;
import com.p280ss.android.sdk.app.C20113d.C20114a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.mobilelib.MobileApi */
public final class MobileApi {
    private WeakReference<Context> mContextRef;

    /* renamed from: com.ss.android.mobilelib.MobileApi$AbsHttpApiThread */
    static abstract class AbsHttpApiThread<T extends MobileQueryObj> extends C19930a {
        protected WeakReference<Context> mContextRef;
        private C6309f mHandler;
        private String mPath;
        private T mQueryObj;

        /* access modifiers changed from: protected */
        public abstract String execute(String str, Map<String, String> map) throws Exception;

        /* access modifiers changed from: protected */
        public abstract Map<String, String> getParams(T t);

        /* access modifiers changed from: protected */
        public abstract void parseData(JSONObject jSONObject, T t) throws Exception;

        public final void run() {
            boolean z;
            int i;
            try {
                z = executeRequest();
            } catch (Throwable th) {
                this.mQueryObj.mError = C19929d.m65753a((Context) this.mContextRef.get(), th);
                z = false;
            }
            if (this.mHandler != null) {
                C6309f fVar = this.mHandler;
                if (z) {
                    i = 10;
                } else {
                    i = 11;
                }
                Message obtainMessage = fVar.obtainMessage(i);
                obtainMessage.obj = this.mQueryObj;
                this.mHandler.sendMessage(obtainMessage);
            }
        }

        private boolean executeRequest() throws Exception {
            if (this.mContextRef.get() == null) {
                this.mQueryObj.mError = 18;
                return false;
            } else if (NetworkUtils.getNetworkType((Context) this.mContextRef.get()) == NetworkType.NONE) {
                this.mQueryObj.mError = 12;
                return false;
            } else {
                String execute = execute(this.mPath, getParams(this.mQueryObj));
                if (C6319n.m19593a(execute)) {
                    this.mQueryObj.mError = 18;
                    return false;
                }
                JSONObject jSONObject = new JSONObject(execute);
                String string = jSONObject.getString("message");
                if (!"success".equals(string)) {
                    if ("error".equals(string)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2 != null) {
                            if ("session_expired".equals(jSONObject2.optString("name"))) {
                                this.mQueryObj.mError = 105;
                                return false;
                            }
                            this.mQueryObj.mError = jSONObject2.optInt("error_code", this.mQueryObj.mError);
                            this.mQueryObj.mErrorMsg = jSONObject2.optString("description");
                            this.mQueryObj.mErrorCaptcha = jSONObject2.optString("captcha");
                            this.mQueryObj.mErrorAlert = jSONObject2.optString("alert_text");
                        }
                    }
                    return false;
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                if (jSONObject3 != null) {
                    parseData(jSONObject3, this.mQueryObj);
                }
                return true;
            }
        }

        public AbsHttpApiThread(Context context, C6309f fVar, String str, T t) {
            this.mContextRef = new WeakReference<>(context);
            this.mHandler = fVar;
            this.mQueryObj = t;
            this.mPath = str;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$AbsHttpGetApiThread */
    static abstract class AbsHttpGetApiThread<T extends MobileQueryObj> extends AbsHttpApiThread<T> {
        /* access modifiers changed from: protected */
        public final String execute(String str, Map<String, String> map) throws Exception {
            C19290j jVar = new C19290j(str);
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        jVar.mo51188a((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            return NetworkUtils.executeGet(204800, jVar.toString());
        }

        public AbsHttpGetApiThread(Context context, C6309f fVar, String str, T t) {
            super(context, fVar, str, t);
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$AbsPostApiThread */
    static abstract class AbsPostApiThread<T extends MobileQueryObj> extends AbsHttpApiThread<T> {
        /* access modifiers changed from: protected */
        public final String execute(String str, Map<String, String> map) throws Exception {
            ArrayList arrayList = new ArrayList();
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        arrayList.add(new C19565e((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            }
            return NetworkUtils.executePost(204800, str, (List<C19565e>) arrayList);
        }

        public AbsPostApiThread(Context context, C6309f fVar, String str, T t) {
            super(context, fVar, str, t);
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$BindMobileApiThread */
    static class BindMobileApiThread extends AbsPostApiThread<BindMobileQueryObj> {
        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, BindMobileQueryObj bindMobileQueryObj) {
        }

        /* access modifiers changed from: protected */
        public Map<String, String> getParams(BindMobileQueryObj bindMobileQueryObj) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(bindMobileQueryObj.mCaptcha)) {
                hashMap.put("captcha", bindMobileQueryObj.mCaptcha);
            }
            hashMap.put("code", C6319n.m19597d(bindMobileQueryObj.mCode));
            hashMap.put("mobile", C6319n.m19597d(bindMobileQueryObj.mMobile));
            hashMap.put("password", C6319n.m19597d(bindMobileQueryObj.mPassword));
            hashMap.put("mix_mode", "1");
            return hashMap;
        }

        public BindMobileApiThread(Context context, C6309f fVar, String str, String str2, String str3, String str4) {
            super(context, fVar, MobileApiPath.USER_BIND_MOBILE, new BindMobileQueryObj(str, str2, str3, str4));
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$BindMobileQueryObj */
    public static class BindMobileQueryObj extends MobileQueryObj {
        public String mCaptcha;
        public String mCode;
        public String mMobile;
        public String mPassword;

        public BindMobileQueryObj(String str, String str2, String str3, String str4) {
            super(10);
            this.mMobile = str;
            this.mCode = str2;
            this.mCaptcha = str4;
            this.mPassword = str3;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$ChangeMobileNumApiThread */
    static class ChangeMobileNumApiThread extends AbsPostApiThread<ChangeMobileNumQueryObj> {
        /* access modifiers changed from: protected */
        public Map<String, String> getParams(ChangeMobileNumQueryObj changeMobileNumQueryObj) {
            HashMap hashMap = new HashMap();
            hashMap.put("mobile", C6319n.m19597d(changeMobileNumQueryObj.mMobile));
            if (!TextUtils.isEmpty(changeMobileNumQueryObj.mCaptcha)) {
                hashMap.put("captcha", changeMobileNumQueryObj.mCaptcha);
            }
            hashMap.put("code", C6319n.m19597d(changeMobileNumQueryObj.mCode));
            hashMap.put("mix_mode", "1");
            return hashMap;
        }

        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, ChangeMobileNumQueryObj changeMobileNumQueryObj) {
            try {
                changeMobileNumQueryObj.mUserInfo = C20113d.m66310a(jSONObject);
            } catch (Exception e) {
                changeMobileNumQueryObj.mError = C19929d.m65753a((Context) this.mContextRef.get(), (Throwable) e);
            }
        }

        public ChangeMobileNumApiThread(Context context, C6309f fVar, String str, String str2, String str3) {
            super(context, fVar, MobileApiPath.USER_CHANGE_MOBILE, new ChangeMobileNumQueryObj(str, str2, str3));
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$ChangeMobileNumQueryObj */
    public static class ChangeMobileNumQueryObj extends MobileQueryObj {
        public String mCaptcha;
        public String mCode;
        public String mMobile;
        public C20114a mUserInfo;

        public ChangeMobileNumQueryObj(String str, String str2, String str3) {
            super(20);
            this.mMobile = str;
            this.mCaptcha = str3;
            this.mCode = str2;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$ChangePasswordApiThread */
    static class ChangePasswordApiThread extends AbsPostApiThread<ChangePasswordQueryObj> {
        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, ChangePasswordQueryObj changePasswordQueryObj) {
        }

        /* access modifiers changed from: protected */
        public Map<String, String> getParams(ChangePasswordQueryObj changePasswordQueryObj) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(changePasswordQueryObj.mCaptcha)) {
                hashMap.put("captcha", changePasswordQueryObj.mCaptcha);
            }
            hashMap.put("code", C6319n.m19597d(changePasswordQueryObj.mCode));
            hashMap.put("password", C6319n.m19597d(changePasswordQueryObj.mPassword));
            hashMap.put("mix_mode", "1");
            return hashMap;
        }

        public ChangePasswordApiThread(Context context, C6309f fVar, String str, String str2, String str3) {
            super(context, fVar, MobileApiPath.USER_CHANGE_PASSWORD, new ChangePasswordQueryObj(str, str2, str3));
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$ChangePasswordQueryObj */
    public static class ChangePasswordQueryObj extends MobileQueryObj {
        public String mCaptcha;
        public String mCode;
        public String mPassword;

        public ChangePasswordQueryObj(String str, String str2, String str3) {
            super(15);
            this.mCode = str;
            this.mPassword = str2;
            this.mCaptcha = str3;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$LoginApiThread */
    static class LoginApiThread extends AbsPostApiThread<LoginQueryObj> {
        /* access modifiers changed from: protected */
        public Map<String, String> getParams(LoginQueryObj loginQueryObj) {
            HashMap hashMap = new HashMap();
            hashMap.put("mobile", C6319n.m19597d(loginQueryObj.mMobile));
            if (!TextUtils.isEmpty(loginQueryObj.mCaptcha)) {
                hashMap.put("captcha", loginQueryObj.mCaptcha);
            }
            hashMap.put("password", C6319n.m19597d(loginQueryObj.mPassword));
            hashMap.put("mix_mode", "1");
            return hashMap;
        }

        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, LoginQueryObj loginQueryObj) {
            try {
                loginQueryObj.mUserInfo = C20113d.m66310a(jSONObject);
            } catch (Exception e) {
                loginQueryObj.mError = C19929d.m65753a((Context) this.mContextRef.get(), (Throwable) e);
            }
        }

        public LoginApiThread(Context context, C6309f fVar, String str, String str2, String str3) {
            super(context, fVar, MobileApiPath.USER_LOGIN, new LoginQueryObj(str, str2, str3));
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$LoginQueryObj */
    public static class LoginQueryObj extends MobileQueryObj {
        public String mCaptcha;
        public String mMobile;
        public String mPassword;
        public C20114a mUserInfo;

        public LoginQueryObj(String str, String str2, String str3) {
            super(7);
            this.mMobile = str;
            this.mPassword = str2;
            this.mCaptcha = str3;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$MobileQueryObj */
    public static abstract class MobileQueryObj {
        public int mError;
        public String mErrorAlert;
        public String mErrorCaptcha;
        public String mErrorMsg;
        public int mScenario;

        public boolean isNeedShowCaptcha() {
            if ((this.mError == 1101 || this.mError == 1102 || this.mError == 1103) && !TextUtils.isEmpty(this.mErrorCaptcha)) {
                return true;
            }
            return false;
        }

        public MobileQueryObj(int i) {
            this.mScenario = i;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$RefreshCaptchaApiThread */
    static class RefreshCaptchaApiThread extends AbsPostApiThread<RefreshCaptchaQueryObj> {
        /* access modifiers changed from: protected */
        public Map<String, String> getParams(RefreshCaptchaQueryObj refreshCaptchaQueryObj) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", String.valueOf(refreshCaptchaQueryObj.mScenario));
            return hashMap;
        }

        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, RefreshCaptchaQueryObj refreshCaptchaQueryObj) {
            refreshCaptchaQueryObj.mNewCaptcha = jSONObject.optString("captcha");
        }

        public RefreshCaptchaApiThread(Context context, C6309f fVar, int i) {
            super(context, fVar, MobileApiPath.USER_REFRESH_CAPTCHA, new RefreshCaptchaQueryObj(i));
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$RefreshCaptchaQueryObj */
    public static class RefreshCaptchaQueryObj extends MobileQueryObj {
        public String mNewCaptcha;

        public RefreshCaptchaQueryObj(int i) {
            super(i);
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$RegisterApiThread */
    static class RegisterApiThread extends AbsPostApiThread<RegisterQueryObj> {
        /* access modifiers changed from: protected */
        public Map<String, String> getParams(RegisterQueryObj registerQueryObj) {
            HashMap hashMap = new HashMap();
            hashMap.put("mobile", C6319n.m19597d(registerQueryObj.mMobile));
            hashMap.put("captcha", registerQueryObj.mCaptcha);
            hashMap.put("code", C6319n.m19597d(String.valueOf(registerQueryObj.mCode)));
            hashMap.put("password", C6319n.m19597d(registerQueryObj.mPassword));
            hashMap.put("type", C6319n.m19597d(String.valueOf(registerQueryObj.mScenario)));
            hashMap.put("mix_mode", "1");
            return hashMap;
        }

        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, RegisterQueryObj registerQueryObj) {
            try {
                registerQueryObj.mUserInfo = C20113d.m66310a(jSONObject);
            } catch (Exception e) {
                registerQueryObj.mError = C19929d.m65753a((Context) this.mContextRef.get(), (Throwable) e);
            }
        }

        public RegisterApiThread(Context context, C6309f fVar, String str, String str2, String str3, String str4) {
            super(context, fVar, MobileApiPath.USER_REGISTER, new RegisterQueryObj(str, str2, str3, str4));
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$RegisterQueryObj */
    public static class RegisterQueryObj extends MobileQueryObj {
        public String mCaptcha;
        public String mCode;
        public String mMobile;
        public String mPassword;
        public C20114a mUserInfo;

        public RegisterQueryObj(String str, String str2, String str3, String str4) {
            super(3);
            this.mMobile = str;
            this.mCode = str2;
            this.mCaptcha = str4;
            this.mPassword = str3;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$ResetPasswordApiThread */
    static class ResetPasswordApiThread extends AbsPostApiThread<ResetPasswordQueryObj> {
        /* access modifiers changed from: protected */
        public Map<String, String> getParams(ResetPasswordQueryObj resetPasswordQueryObj) {
            HashMap hashMap = new HashMap();
            hashMap.put("mobile", C6319n.m19597d(resetPasswordQueryObj.mMobile));
            if (!TextUtils.isEmpty(resetPasswordQueryObj.mCaptcha)) {
                hashMap.put("captcha", resetPasswordQueryObj.mCaptcha);
            }
            hashMap.put("code", C6319n.m19597d(resetPasswordQueryObj.mCode));
            hashMap.put("password", C6319n.m19597d(resetPasswordQueryObj.mPassword));
            hashMap.put("mix_mode", "1");
            return hashMap;
        }

        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, ResetPasswordQueryObj resetPasswordQueryObj) {
            try {
                resetPasswordQueryObj.mUserInfo = C20113d.m66310a(jSONObject);
            } catch (Exception e) {
                resetPasswordQueryObj.mError = C19929d.m65753a((Context) this.mContextRef.get(), (Throwable) e);
            }
        }

        public ResetPasswordApiThread(Context context, C6309f fVar, String str, String str2, String str3, String str4) {
            super(context, fVar, MobileApiPath.USER_RESET_PASSWORD, new ResetPasswordQueryObj(str, str2, str3, str4));
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$ResetPasswordQueryObj */
    public static class ResetPasswordQueryObj extends MobileQueryObj {
        public String mCaptcha;
        public String mCode;
        public String mMobile;
        public String mPassword;
        public C20114a mUserInfo;

        public ResetPasswordQueryObj(String str, String str2, String str3, String str4) {
            super(6);
            this.mMobile = str;
            this.mCode = str2;
            this.mPassword = str3;
            this.mCaptcha = str4;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$SendCodeApiThread */
    static class SendCodeApiThread extends AbsPostApiThread<SendCodeQueryObj> {
        /* access modifiers changed from: protected */
        public Map<String, String> getParams(SendCodeQueryObj sendCodeQueryObj) {
            HashMap hashMap = new HashMap();
            hashMap.put("mobile", C6319n.m19597d(sendCodeQueryObj.mMobile));
            if (!TextUtils.isEmpty(sendCodeQueryObj.mOldMobile)) {
                hashMap.put("old_mobile", C6319n.m19597d(sendCodeQueryObj.mOldMobile));
            }
            hashMap.put("captcha", sendCodeQueryObj.mCaptcha);
            hashMap.put("type", C6319n.m19597d(String.valueOf(sendCodeQueryObj.mType)));
            hashMap.put("mix_mode", "1");
            return hashMap;
        }

        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, SendCodeQueryObj sendCodeQueryObj) {
            sendCodeQueryObj.mResendTime = jSONObject.optInt("retry_time", 30);
        }

        public SendCodeApiThread(Context context, C6309f fVar, String str, String str2, int i) {
            super(context, fVar, MobileApiPath.USER_SEND_CODE, new SendCodeQueryObj(str, str2, i));
        }

        public SendCodeApiThread(Context context, C6309f fVar, String str, String str2, String str3, int i) {
            super(context, fVar, MobileApiPath.USER_SEND_CODE, new SendCodeQueryObj(str, str2, str3, i));
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$SendCodeQueryObj */
    public static class SendCodeQueryObj extends MobileQueryObj {
        public String mCaptcha;
        public String mMobile;
        public String mOldMobile;
        public int mResendTime;
        public int mType;

        public SendCodeQueryObj(String str, String str2, int i) {
            super(i);
            this.mMobile = str;
            this.mCaptcha = str2;
            this.mType = i;
            this.mResendTime = 30;
            this.mOldMobile = "";
        }

        public SendCodeQueryObj(String str, String str2, String str3, int i) {
            super(i);
            this.mMobile = str;
            this.mCaptcha = str3;
            this.mType = i;
            this.mResendTime = 30;
            this.mOldMobile = str2;
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$UnbindMobileApiThread */
    static class UnbindMobileApiThread extends AbsPostApiThread<UnbindMobileQueryObj> {
        /* access modifiers changed from: protected */
        public void parseData(JSONObject jSONObject, UnbindMobileQueryObj unbindMobileQueryObj) {
        }

        /* access modifiers changed from: protected */
        public Map<String, String> getParams(UnbindMobileQueryObj unbindMobileQueryObj) {
            return new HashMap();
        }

        public UnbindMobileApiThread(Context context, C6309f fVar) {
            super(context, fVar, MobileApiPath.USER_UNBIND_MOBILE, new UnbindMobileQueryObj());
        }
    }

    /* renamed from: com.ss.android.mobilelib.MobileApi$UnbindMobileQueryObj */
    public static class UnbindMobileQueryObj extends MobileQueryObj {
        public UnbindMobileQueryObj() {
            super(11);
        }
    }

    public MobileApi(Context context) {
        this.mContextRef = new WeakReference<>(context.getApplicationContext());
    }

    public final void unbindMobile(C6309f fVar) {
        new UnbindMobileApiThread((Context) this.mContextRef.get(), fVar).start();
    }

    public final void refreshCaptcha(C6309f fVar, int i) {
        new RefreshCaptchaApiThread((Context) this.mContextRef.get(), fVar, i).start();
    }

    public final void changeMobileNum(C6309f fVar, String str, String str2, String str3) {
        ChangeMobileNumApiThread changeMobileNumApiThread = new ChangeMobileNumApiThread((Context) this.mContextRef.get(), fVar, str, str2, str3);
        changeMobileNumApiThread.start();
    }

    public final void changePassword(C6309f fVar, String str, String str2, String str3) {
        ChangePasswordApiThread changePasswordApiThread = new ChangePasswordApiThread((Context) this.mContextRef.get(), fVar, str, str2, str3);
        changePasswordApiThread.start();
    }

    public final void login(C6309f fVar, String str, String str2, String str3) {
        LoginApiThread loginApiThread = new LoginApiThread((Context) this.mContextRef.get(), fVar, str, str2, str3);
        loginApiThread.start();
    }

    public final void sendCode(C6309f fVar, String str, String str2, int i) {
        SendCodeApiThread sendCodeApiThread = new SendCodeApiThread((Context) this.mContextRef.get(), fVar, str, str2, i);
        sendCodeApiThread.start();
    }

    public final void bindMobile(C6309f fVar, String str, String str2, String str3, String str4) {
        BindMobileApiThread bindMobileApiThread = new BindMobileApiThread((Context) this.mContextRef.get(), fVar, str, str2, str3, str4);
        bindMobileApiThread.start();
    }

    public final void register(C6309f fVar, String str, String str2, String str3, String str4) {
        RegisterApiThread registerApiThread = new RegisterApiThread((Context) this.mContextRef.get(), fVar, str, str2, str3, str4);
        registerApiThread.start();
    }

    public final void resetPassword(C6309f fVar, String str, String str2, String str3, String str4) {
        ResetPasswordApiThread resetPasswordApiThread = new ResetPasswordApiThread((Context) this.mContextRef.get(), fVar, str, str2, str3, str4);
        resetPasswordApiThread.start();
    }

    public final void sendCode(C6309f fVar, String str, String str2, String str3, int i) {
        SendCodeApiThread sendCodeApiThread = new SendCodeApiThread((Context) this.mContextRef.get(), fVar, str, str2, str3, i);
        sendCodeApiThread.start();
    }
}
