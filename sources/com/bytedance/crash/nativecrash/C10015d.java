package com.bytedance.crash.nativecrash;

import com.bytedance.crash.C9875d;
import com.bytedance.crash.p504l.C9984i;
import com.bytedance.crash.p504l.C9992m;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.crash.nativecrash.d */
public final class C10015d {

    /* renamed from: i */
    private static final Pattern f27264i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j */
    private static final Pattern f27265j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k */
    private static final Pattern f27266k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l */
    private static final Pattern f27267l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m */
    private static final Pattern f27268m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a */
    public String f27269a;

    /* renamed from: b */
    public String f27270b;

    /* renamed from: c */
    public String f27271c;

    /* renamed from: d */
    public String f27272d;

    /* renamed from: e */
    public String f27273e;

    /* renamed from: f */
    public String f27274f;

    /* renamed from: g */
    public Map<String, String> f27275g = new HashMap();

    /* renamed from: h */
    private String f27276h;

    /* renamed from: a */
    public final String mo24634a() {
        StringBuilder sb = new StringBuilder();
        if (this.f27273e != null) {
            sb.append(this.f27273e);
        }
        if (this.f27276h != null) {
            sb.append(this.f27276h);
        }
        if (this.f27274f != null) {
            sb.append(this.f27274f);
        }
        return sb.toString();
    }

    public C10015d(File file) {
        m29740b(C9992m.m29603d(file));
    }

    /* renamed from: a */
    public final void mo24635a(File file) {
        File d = C9992m.m29603d(file);
        if (d.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(d.getAbsoluteFile());
            sb.append(".old");
            d.renameTo(new File(sb.toString()));
        }
        NativeImpl.m29682a(file);
        m29740b(C9992m.m29603d(file));
    }

    /* renamed from: b */
    private void m29740b(File file) {
        if (file.exists() && file.length() != 0) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null || i >= 64) {
                            break;
                        }
                        if (this.f27269a == null && readLine.startsWith("pid: ")) {
                            Matcher matcher = f27264i.matcher(readLine);
                            if (matcher.find() && matcher.groupCount() == 4) {
                                this.f27269a = matcher.group(1);
                                this.f27270b = matcher.group(2);
                                this.f27272d = matcher.group(3);
                                this.f27271c = matcher.group(4);
                            }
                        } else if (this.f27273e == null && readLine.startsWith("signal ")) {
                            Matcher matcher2 = f27265j.matcher(readLine);
                            if (matcher2.find() && matcher2.groupCount() == 3) {
                                String replace = matcher2.group(1).replace(" ", "");
                                String replace2 = matcher2.group(2).replace(" ", "");
                                int indexOf = replace2.indexOf("frompid");
                                if (indexOf > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(replace2.substring(0, indexOf));
                                    sb.append(")");
                                    replace2 = sb.toString();
                                }
                                StringBuilder sb2 = new StringBuilder("Signal ");
                                sb2.append(replace);
                                sb2.append(", Code ");
                                sb2.append(replace2);
                                sb2.append("\n");
                                this.f27273e = sb2.toString();
                            }
                        } else if (this.f27276h == null && readLine.startsWith("Abort ")) {
                            Matcher matcher3 = f27266k.matcher(readLine);
                            if (matcher3.find() && matcher3.groupCount() == 1) {
                                StringBuilder sb3 = new StringBuilder("abort message: ");
                                sb3.append(matcher3.group(1));
                                sb3.append("\n");
                                this.f27276h = sb3.toString();
                            }
                        } else if (this.f27276h == null && readLine.startsWith("Crash ")) {
                            Matcher matcher4 = f27267l.matcher(readLine);
                            if (matcher4.find() && matcher4.groupCount() == 1) {
                                StringBuilder sb4 = new StringBuilder("crash message: ");
                                sb4.append(matcher4.group(1));
                                sb4.append("\n");
                                this.f27276h = sb4.toString();
                            }
                        } else if (this.f27274f != null || !readLine.startsWith("backtrace:")) {
                            if (this.f27275g.isEmpty() && readLine.startsWith("build id:")) {
                                while (true) {
                                    String readLine2 = bufferedReader2.readLine();
                                    if (readLine2 == null || !readLine2.contains("BuildId:")) {
                                        break;
                                    }
                                    Matcher matcher5 = f27268m.matcher(readLine2);
                                    if (matcher5.find()) {
                                        String group = matcher5.group(1);
                                        String group2 = matcher5.group(2);
                                        String group3 = matcher5.group(3);
                                        if (group.equals("data")) {
                                            this.f27275g.put(group2, group3);
                                        }
                                    }
                                }
                            }
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            while (true) {
                                String readLine3 = bufferedReader2.readLine();
                                if (readLine3 == null || !readLine3.startsWith("    #")) {
                                    i++;
                                    this.f27274f = sb5.toString();
                                } else {
                                    sb5.append(readLine3.substring(4));
                                    sb5.append(10);
                                }
                            }
                            i++;
                            this.f27274f = sb5.toString();
                        }
                        i++;
                    } catch (Throwable th) {
                        th = th;
                        C9984i.m29565a((Closeable) bufferedReader2);
                        throw th;
                    }
                }
                C9984i.m29565a((Closeable) bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
                C9984i.m29565a((Closeable) bufferedReader);
            }
        }
    }
}
