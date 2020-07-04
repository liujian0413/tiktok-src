package com.p280ss.android.ugc.aweme.image;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.utils.C43024cs;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.k */
final class C32044k {

    /* renamed from: a */
    private Map<String, String> f83826a = new ConcurrentHashMap();

    C32044k() {
    }

    /* renamed from: a */
    private static byte[] m104053a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo83016a(String str) {
        String str2;
        boolean z = true;
        if (str.contains("%%secretKey=")) {
            str2 = str.substring(0, str.indexOf("%%secretKey="));
            String substring = str.substring(str.lastIndexOf("=") + 1, str.length());
            if (!TextUtils.isEmpty(substring)) {
                this.f83826a.put(str2, substring);
            }
        } else {
            str2 = str;
            z = false;
        }
        if ((z || str.contains("secretKey")) && (str.length() == str2.length() || str2.contains("secretKey"))) {
            m104052a(str, str2, Boolean.valueOf(z));
        }
        return str2;
    }

    /* renamed from: a */
    private static void m104052a(String str, String str2, Boolean bool) {
        StringBuilder sb = new StringBuilder("ImageEncryptUtils parse failed: rawUrl=");
        sb.append(str);
        sb.append(", parseUrl=");
        sb.append(str2);
        sb.append(", contain=");
        sb.append(bool);
        C6921a.m21555a(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", "secret_key_parse_error");
            jSONObject.put("raw_url", str);
            jSONObject.put("parse_url", str2);
            jSONObject.put("is_contain", bool.booleanValue() ? 1 : 0);
            C6379c.m19826a("im_error_event", jSONObject);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Pair<InputStream, Long> mo83015a(InputStream inputStream, String str, long j) throws Exception {
        if (this.f83826a.containsKey(str)) {
            String str2 = (String) this.f83826a.get(str);
            try {
                byte[] a = m104053a(inputStream);
                if (a != null) {
                    Pair a2 = C43024cs.m136544a(a, str2);
                    j = (long) ((Integer) a2.second).intValue();
                    inputStream = new ByteArrayInputStream((byte[]) a2.first);
                }
            } finally {
                this.f83826a.remove(str);
            }
        }
        return new Pair<>(inputStream, Long.valueOf(j));
    }
}
