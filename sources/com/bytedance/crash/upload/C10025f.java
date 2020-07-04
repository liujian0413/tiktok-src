package com.bytedance.crash.upload;

import com.bytedance.crash.p504l.C9982g;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.crash.upload.f */
public final class C10025f {

    /* renamed from: a */
    private final String f27289a;

    /* renamed from: b */
    private HttpURLConnection f27290b;

    /* renamed from: c */
    private String f27291c;

    /* renamed from: d */
    private boolean f27292d;

    /* renamed from: e */
    private DataOutputStream f27293e;

    /* renamed from: f */
    private C10030j f27294f;

    /* renamed from: a */
    public final String mo24648a() throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder("\r\n--");
        sb.append(this.f27289a);
        sb.append("--\r\n");
        byte[] bytes = sb.toString().getBytes();
        if (this.f27292d) {
            this.f27294f.write(bytes);
            this.f27294f.mo24660b();
            this.f27294f.mo24659a();
        } else {
            this.f27293e.write(bytes);
            this.f27293e.flush();
            this.f27293e.close();
        }
        int responseCode = this.f27290b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C10026g.m29793a(this.f27290b)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f27290b.disconnect();
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
    public final void mo24651a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f27289a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f27291c);
        sb.append("\r\n\r\n");
        sb.append(str2);
        sb.append("\r\n");
        try {
            if (this.f27292d) {
                this.f27294f.write(sb.toString().getBytes());
            } else {
                this.f27293e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public final void mo24649a(String str, File file) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f27289a);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"\r\n");
        sb.append("Content-Transfer-Encoding: binary\r\n");
        sb.append("\r\n");
        if (this.f27292d) {
            this.f27294f.write(sb.toString().getBytes());
        } else {
            this.f27293e.write(sb.toString().getBytes());
        }
        if (this.f27292d) {
            C9982g.m29544a((OutputStream) this.f27294f, file);
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                this.f27293e.write(bArr, 0, read);
            }
            fileInputStream.close();
        }
        if (this.f27292d) {
            this.f27294f.write("\r\n".getBytes());
            return;
        }
        this.f27293e.write(sb.toString().getBytes());
        this.f27293e.flush();
    }

    public C10025f(String str, String str2, boolean z) throws IOException {
        this.f27291c = str2;
        this.f27292d = z;
        StringBuilder sb = new StringBuilder("AAA");
        sb.append(System.currentTimeMillis());
        sb.append("AAA");
        this.f27289a = sb.toString();
        this.f27290b = (HttpURLConnection) new URL(str).openConnection();
        this.f27290b.setUseCaches(false);
        this.f27290b.setDoOutput(true);
        this.f27290b.setDoInput(true);
        this.f27290b.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder("multipart/form-data; boundary=");
        sb2.append(this.f27289a);
        C10026g.m29794a(this.f27290b, "Content-Type", sb2.toString());
        if (z) {
            C10026g.m29794a(this.f27290b, "Content-Encoding", "gzip");
            this.f27294f = new C10030j(this.f27290b.getOutputStream());
            return;
        }
        this.f27293e = new DataOutputStream(this.f27290b.getOutputStream());
    }

    /* renamed from: a */
    public final void mo24650a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f27289a);
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
        if (this.f27292d) {
            this.f27294f.write(sb.toString().getBytes());
        } else {
            this.f27293e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f27292d) {
                this.f27294f.write(bArr, 0, read);
            } else {
                this.f27293e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f27292d) {
            this.f27294f.write("\r\n".getBytes());
            return;
        }
        this.f27293e.write("\r\n".getBytes());
        this.f27293e.flush();
    }
}
