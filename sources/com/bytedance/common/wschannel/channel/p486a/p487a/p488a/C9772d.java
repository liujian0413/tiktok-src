package com.bytedance.common.wschannel.channel.p486a.p487a.p488a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import okhttp3.Response;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.a.d */
public class C9772d implements C9773e {

    /* renamed from: a */
    private final Context f26561a;

    /* renamed from: b */
    private int f26562b;

    /* renamed from: c */
    public void mo24198c() {
        this.f26562b = 0;
    }

    /* renamed from: b */
    public final long mo24197b() {
        return (long) ((Math.random() * 4500.0d) + 500.0d);
    }

    /* renamed from: a */
    public long mo24195a() {
        if (!m28807a(this.f26561a)) {
            return -1;
        }
        this.f26562b++;
        double min = (double) Math.min(((long) (1 << this.f26562b)) * DouPlusShareGuideExperiment.MIN_VALID_DURATION, 120000);
        double random = Math.random() * 10.0d * 1000.0d;
        Double.isNaN(min);
        return (long) (min + random);
    }

    C9772d(Context context) {
        this.f26561a = context;
    }

    /* renamed from: a */
    private static boolean m28807a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final long mo24196a(Response response) {
        long a = mo24195a();
        if (a == -1) {
            return -1;
        }
        if (response != null) {
            try {
                if (!response.isSuccessful()) {
                    int i = response.code;
                    if (i == 414 || i == 511 || i == 512) {
                        String header = response.header("Handshake-Options");
                        if (header != null) {
                            String[] split = header.split(";");
                            int length = split.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                String str = split[i2];
                                if (!TextUtils.isEmpty(str)) {
                                    String[] split2 = str.split("=");
                                    if ("reconnect-interval".equals(split2[0])) {
                                        try {
                                            a = 1000 * Long.parseLong(split2[1]);
                                            break;
                                        } catch (NumberFormatException unused) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return a;
    }
}
