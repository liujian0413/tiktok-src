package com.p280ss.android.ugc.effectmanager.common.p1729d;

import android.accounts.NetworkErrorException;
import com.p280ss.android.ugc.effectmanager.common.C43718c;
import com.p280ss.android.ugc.effectmanager.common.exception.MD5Exception;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.common.exception.UnzipException;
import com.p280ss.android.ugc.effectmanager.common.exception.UrlNotExistException;
import com.p280ss.android.ugc.effectmanager.common.model.NetException;
import com.p280ss.android.ugc.effectmanager.network.LinkErrorException;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.effectmanager.common.d.c */
public final class C43726c {

    /* renamed from: a */
    public int f113220a;

    /* renamed from: b */
    public String f113221b;

    /* renamed from: c */
    public Exception f113222c;

    /* renamed from: d */
    private String f113223d;

    /* renamed from: e */
    private String f113224e;

    /* renamed from: f */
    private String f113225f;

    public final String toString() {
        if (this.f113222c != null) {
            StringBuilder sb = new StringBuilder("ExceptionResult{errorCode=");
            sb.append(this.f113220a);
            sb.append(", msg='");
            sb.append(this.f113221b);
            sb.append('\'');
            sb.append(", requestUrl='");
            sb.append(this.f113223d);
            sb.append('\'');
            sb.append(", selectedHost='");
            sb.append(this.f113224e);
            sb.append('\'');
            sb.append(", remoteIp='");
            sb.append(this.f113225f);
            sb.append('\'');
            sb.append(", exception=");
            sb.append(this.f113222c.getMessage());
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("ExceptionResult{errorCode=");
        sb2.append(this.f113220a);
        sb2.append(", msg='");
        sb2.append(this.f113221b);
        sb2.append(", requestUrl='");
        sb2.append(this.f113223d);
        sb2.append('\'');
        sb2.append(", selectedHost='");
        sb2.append(this.f113224e);
        sb2.append('\'');
        sb2.append(", remoteIp='");
        sb2.append(this.f113225f);
        sb2.append('\'');
        sb2.append('}');
        return sb2.toString();
    }

    public C43726c(Exception exc) {
        this(exc, null, null, null);
    }

    public C43726c(int i) {
        this.f113220a = -1;
        this.f113220a = i;
        this.f113221b = C43718c.m138552a(i);
        this.f113222c = null;
    }

    public C43726c(int i, Exception exc) {
        this.f113220a = -1;
        this.f113220a = -1;
        this.f113221b = C43718c.m138552a(-1);
        this.f113222c = exc;
    }

    /* renamed from: a */
    public final void mo105767a(String str, String str2, String str3) {
        this.f113223d = str;
        this.f113224e = str2;
        this.f113225f = str3;
    }

    private C43726c(Exception exc, String str, String str2, String str3) {
        this.f113220a = -1;
        this.f113223d = null;
        this.f113224e = null;
        this.f113225f = null;
        this.f113222c = exc;
        if (exc instanceof NetException) {
            this.f113220a = ((NetException) exc).getStatus_code().intValue();
            this.f113221b = exc.getMessage();
        } else if (exc instanceof StatusCodeException) {
            this.f113220a = ((StatusCodeException) exc).getStatusCode();
            this.f113221b = exc.getMessage();
        } else if (exc instanceof JSONException) {
            this.f113220a = 10008;
            this.f113221b = exc.getMessage();
        } else if (exc instanceof NetworkErrorException) {
            this.f113220a = 10002;
            this.f113221b = exc.getMessage();
        } else if (exc instanceof UrlNotExistException) {
            this.f113220a = 10015;
            this.f113221b = exc.getMessage();
        } else if (exc instanceof UnzipException) {
            this.f113220a = 10013;
            this.f113221b = exc.getMessage();
        } else if (exc instanceof MD5Exception) {
            this.f113220a = 10010;
            this.f113221b = exc.getMessage();
        } else if (exc instanceof IOException) {
            this.f113220a = 10012;
            this.f113221b = exc.getMessage();
        } else if (exc instanceof LinkErrorException) {
            this.f113220a = 10016;
            this.f113221b = exc.getMessage();
        } else if (exc != null) {
            if ("network unavailable".equals(exc.getMessage())) {
                this.f113220a = 10011;
            } else {
                this.f113220a = 10005;
            }
            this.f113221b = exc.getMessage();
        } else {
            this.f113220a = 1;
            this.f113221b = C43718c.m138552a(this.f113220a);
        }
    }
}
