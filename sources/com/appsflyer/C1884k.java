package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.k */
final class C1884k extends AsyncTask<String, Void, String> {

    /* renamed from: ʻ */
    private WeakReference<Context> f6819;

    /* renamed from: ʼ */
    private boolean f6820;

    /* renamed from: ʽ */
    private boolean f6821;

    /* renamed from: ˊ */
    private boolean f6822;

    /* renamed from: ˋ */
    Map<String, String> f6823;

    /* renamed from: ˎ */
    private boolean f6824;

    /* renamed from: ˏ */
    private String f6825 = "";

    /* renamed from: ॱ */
    String f6826;

    /* renamed from: ॱॱ */
    private URL f6827;

    /* renamed from: ᐝ */
    public HttpURLConnection f6828;

    /* access modifiers changed from: protected */
    public final void onCancelled() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final void mo7491() {
        this.f6821 = false;
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f6826 == null) {
            this.f6826 = new JSONObject(this.f6823).toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ॱ */
    public final void onPostExecute(String str) {
        if (this.f6822) {
            AFLogger.afInfoLog("Connection error: ".concat(String.valueOf(str)));
        } else {
            AFLogger.afInfoLog("Connection call succeeded: ".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ॱ */
    public final String doInBackground(String... strArr) {
        String str;
        if (this.f6824) {
            return null;
        }
        try {
            this.f6827 = new URL(strArr[0]);
            if (this.f6821) {
                C1899s.m8812().mo7517(this.f6827.toString(), this.f6826);
                int length = this.f6826.getBytes("UTF-8").length;
                StringBuilder sb = new StringBuilder("call = ");
                sb.append(this.f6827);
                sb.append("; size = ");
                sb.append(length);
                sb.append(" byte");
                if (length > 1) {
                    str = "s";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append("; body = ");
                sb.append(this.f6826);
                C18754.m8758(sb.toString());
            }
            this.f6828 = (HttpURLConnection) this.f6827.openConnection();
            this.f6828.setReadTimeout(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
            this.f6828.setConnectTimeout(VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT);
            this.f6828.setRequestMethod("POST");
            this.f6828.setDoInput(true);
            this.f6828.setDoOutput(true);
            this.f6828.setRequestProperty("Content-Type", "application/json");
            OutputStream outputStream = this.f6828.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(this.f6826);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            this.f6828.connect();
            int responseCode = this.f6828.getResponseCode();
            if (this.f6820) {
                AppsFlyerLib.getInstance();
                this.f6825 = AppsFlyerLib.m8674(this.f6828);
            }
            if (this.f6821) {
                C1899s.m8812().mo7516(this.f6827.toString(), responseCode, this.f6825);
            }
            if (responseCode == 200) {
                AFLogger.afInfoLog("Status 200 ok");
                Context context = (Context) this.f6819.get();
                if (this.f6827.toString().startsWith(ServerConfigHandler.getUrl(AppsFlyerLib.f6694)) && context != null) {
                    Editor edit = C7285c.m22838a(context, "appsflyer-data", 0).edit();
                    edit.putBoolean("sentRegisterRequestToAF", true);
                    edit.apply();
                    AFLogger.afDebugLog("Successfully registered for Uninstall Tracking");
                }
            } else {
                this.f6822 = true;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Error while calling ");
            sb2.append(this.f6827.toString());
            AFLogger.afErrorLog(sb2.toString(), th);
            this.f6822 = true;
        }
        return this.f6825;
    }

    C1884k(Context context, boolean z) {
        this.f6819 = new WeakReference<>(context);
        this.f6821 = true;
        this.f6820 = true;
        this.f6824 = z;
    }
}
