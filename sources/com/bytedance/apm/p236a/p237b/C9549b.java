package com.bytedance.apm.p236a.p237b;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.b */
public final class C9549b {

    /* renamed from: a */
    private final String f26131a;

    /* renamed from: b */
    private HttpURLConnection f26132b;

    /* renamed from: c */
    private String f26133c;

    /* renamed from: d */
    private boolean f26134d = false;

    /* renamed from: e */
    private DataOutputStream f26135e;

    /* renamed from: f */
    private GZIPOutputStream f26136f;

    /* renamed from: a */
    public final String mo23657a() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder("\r\n--");
        sb.append(this.f26131a);
        sb.append("--\r\n");
        byte[] bytes = sb.toString().getBytes();
        if (this.f26134d) {
            this.f26136f.write(bytes);
            this.f26136f.finish();
            this.f26136f.close();
        } else {
            this.f26135e.write(bytes);
            this.f26135e.flush();
            this.f26135e.close();
        }
        int responseCode = this.f26132b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C9550c.m28303a(this.f26132b)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f26132b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            for (String append : arrayList) {
                sb2.append(append);
            }
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("Server returned non-OK status: ");
        sb3.append(responseCode);
        throw new IOException(sb3.toString());
    }

    /* renamed from: a */
    public final void mo23660a(JSONObject jSONObject) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f26131a);
        sb.append("\r\nContent-Disposition: form-data; name=\"params.txt\"; filetype=\"common_params\"; logtype=\"env\"; filename=\"params.txt\"\r\n");
        sb.append("Content-Type: text/plain\r\n");
        sb.append("\r\n");
        if (this.f26134d) {
            this.f26136f.write(sb.toString().getBytes());
        } else {
            this.f26135e.write(sb.toString().getBytes());
        }
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("defaultData", "none commonParams");
            } catch (JSONException unused) {
            }
            str = jSONObject2.toString();
        }
        if (this.f26134d) {
            this.f26136f.write(str.getBytes());
        } else {
            this.f26135e.write(str.getBytes());
        }
        if (this.f26134d) {
            this.f26136f.write("\r\n".getBytes());
            return;
        }
        this.f26135e.write("\r\n".getBytes());
        this.f26135e.flush();
    }

    /* renamed from: a */
    public final void mo23659a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f26131a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f26133c);
        sb.append("\r\n\r\n");
        sb.append(str2);
        sb.append("\r\n");
        try {
            if (this.f26134d) {
                this.f26136f.write(sb.toString().getBytes());
            } else {
                this.f26135e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
    }

    public C9549b(String str, String str2, boolean z) throws IOException {
        this.f26133c = str2;
        StringBuilder sb = new StringBuilder("AAA");
        sb.append(System.currentTimeMillis());
        sb.append("AAA");
        this.f26131a = sb.toString();
        this.f26132b = (HttpURLConnection) new URL(str).openConnection();
        this.f26132b.setUseCaches(false);
        this.f26132b.setDoOutput(true);
        this.f26132b.setDoInput(true);
        this.f26132b.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder("multipart/form-data; boundary=");
        sb2.append(this.f26131a);
        C9550c.m28304a(this.f26132b, "Content-Type", sb2.toString());
        this.f26135e = new DataOutputStream(this.f26132b.getOutputStream());
    }

    /* renamed from: a */
    public final void mo23658a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f26131a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Entry entry : map.entrySet()) {
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append("=\"");
            sb.append((String) entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary");
        sb.append("\r\n\r\n");
        if (this.f26134d) {
            this.f26136f.write(sb.toString().getBytes());
        } else {
            this.f26135e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f26134d) {
                this.f26136f.write(bArr, 0, read);
            } else {
                this.f26135e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f26134d) {
            this.f26136f.write("\r\n".getBytes());
            return;
        }
        this.f26135e.write("\r\n".getBytes());
        this.f26135e.flush();
    }
}
