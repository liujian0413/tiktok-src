package com.p280ss.ttuploader.net;

import android.os.Handler;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.ttuploader.TTUploadLog;
import com.p280ss.ttuploader.net.TTVNetClient.CompletionListener;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.net.HTTPDNS */
public class HTTPDNS extends BaseDNS {
    private static String mAliDNSServer = "https://203.107.1.4/131950/d?host=";
    private static String mGoogleDNSServer = "https://dns.google.com/resolve?name=";
    private static String mTTDNSServer = "https://dig.bdurl.net/q?host=";
    private int mHttpDNSType = 2;
    private Object mSource;
    private long mSourceId;

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        if (this.mHttpDNSType == 2) {
            sb.append(mTTDNSServer);
        } else if (this.mHttpDNSType == 1) {
            sb.append(mAliDNSServer);
        } else if (this.mHttpDNSType == 3) {
            sb.append(mGoogleDNSServer);
        }
        sb.append(this.mHostname);
        return sb.toString();
    }

    public void start() {
        String _getURL = _getURL();
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.mNetClient.startTask(_getURL, null, null, 0, new CompletionListener() {
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNS.this._handleResponse(jSONObject, error);
                }
            });
        } else {
            this.mNetClient.startTask(_getURL, null, new CompletionListener() {
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNS.this._handleResponse(jSONObject, error);
                }
            });
        }
    }

    private TTUploadDNSInfo parserResult(JSONObject jSONObject) {
        String str;
        long j;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "";
        int i = 60;
        if (this.mHttpDNSType == 2 || this.mHttpDNSType == 1) {
            JSONArray optJSONArray = jSONObject2.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                TTUploadLog.m144200d("HTTPDNS", C1642a.m8034a("no ips in json, type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
                return null;
            }
            if (jSONObject2.has("ttl")) {
                i = jSONObject2.optInt("ttl");
            }
            j = System.currentTimeMillis() + ((long) (i * 1000));
            String str3 = str2;
            str = null;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    str = optJSONArray.getString(i2);
                } catch (Exception unused) {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        sb.append(str);
                        str3 = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append(",");
                        sb2.append(str);
                        str3 = sb2.toString();
                    }
                }
            }
            str2 = str3;
        } else {
            j = 0;
            str = null;
        }
        if (this.mHttpDNSType == 3) {
            try {
                JSONArray jSONArray = jSONObject2.getJSONArray("Answer");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                    if (jSONObject3.has("type") && jSONObject3.getInt("type") == 1) {
                        if (jSONObject3.has("TTL")) {
                            i = jSONObject3.optInt("TTL");
                        }
                        if (jSONObject3.has("data")) {
                            str = jSONObject3.optString("data");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.isEmpty(str2)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str2);
                                sb3.append(str);
                                str2 = sb3.toString();
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str2);
                                sb4.append(",");
                                sb4.append(str);
                                str2 = sb4.toString();
                            }
                        }
                    }
                }
                j = System.currentTimeMillis() + ((long) (i * 1000));
            } catch (Exception unused2) {
                return null;
            }
        }
        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(this.mHttpDNSType, this.mHostname, str2, j, this.mId);
        return tTUploadDNSInfo;
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        TTUploadLog.m144200d("HTTPDNS", C1642a.m8034a("****http dns id:%s", new Object[]{this.mId}));
        TTUploadDNSInfo tTUploadDNSInfo = new TTUploadDNSInfo(this.mHttpDNSType, this.mHostname, null, 0, this.mId);
        if (error != null) {
            tTUploadDNSInfo.mErrorStr = error.errStr;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            TTUploadLog.m144200d("HTTPDNS", C1642a.m8034a("http dns json is empty type:%d", new Object[]{Integer.valueOf(this.mHttpDNSType)}));
        } else {
            TTUploadDNSInfo parserResult = parserResult(jSONObject);
            if (parserResult != null) {
                IPCache.getInstance().put(this.mHostname, parserResult);
                notifySuccess(parserResult);
                return;
            }
        }
        notifyError(tTUploadDNSInfo);
    }

    public HTTPDNS(String str, TTVNetClient tTVNetClient, int i, Handler handler) {
        super(str, tTVNetClient, handler);
        this.mHttpDNSType = i;
    }
}
