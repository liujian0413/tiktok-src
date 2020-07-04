package com.p280ss.android.ugc.effectmanager.common.p1726a;

import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.c */
public class C43705c implements C43719a {

    /* renamed from: a */
    public C43834g f113165a;

    /* renamed from: b */
    public File f113166b;

    /* renamed from: a */
    private File mo105730a() {
        if (this.f113166b == null) {
            return this.f113165a.f113519j;
        }
        return this.f113166b;
    }

    public C43705c(C43834g gVar) {
        this.f113165a = gVar;
        this.f113166b = gVar.f113519j;
    }

    /* renamed from: d */
    public boolean mo105737d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo105730a());
        sb.append(File.separator);
        sb.append(str);
        return C43733e.m138597a(sb.toString());
    }

    /* renamed from: a */
    public String mo105729a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo105730a());
        sb.append(File.separator);
        sb.append(str);
        String sb2 = sb.toString();
        synchronized (C43705c.class) {
            String c = C43733e.m138600c(sb2);
            if (!TextUtils.isEmpty(c)) {
                return c;
            }
            String str2 = "";
            return str2;
        }
    }

    /* renamed from: b */
    public InputStream mo105735b(String str) {
        InputStream d;
        StringBuilder sb = new StringBuilder();
        sb.append(mo105730a());
        sb.append(File.separator);
        sb.append(str);
        String sb2 = sb.toString();
        synchronized (C43705c.class) {
            d = C43733e.m138602d(sb2);
        }
        return d;
    }

    /* renamed from: c */
    public boolean mo105736c(String str) {
        boolean b;
        synchronized (C43705c.class) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo105730a());
            sb.append(File.separator);
            sb.append(str);
            b = C43733e.m138599b(sb.toString());
        }
        return b;
    }

    /* renamed from: a */
    public void mo105734a(final Pattern pattern) {
        synchronized (C43705c.class) {
            for (File delete : mo105730a().listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return pattern.matcher(str).matches();
                }
            })) {
                delete.delete();
            }
        }
    }

    /* renamed from: a */
    public void mo105732a(String str, String str2) {
        synchronized (C43705c.class) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo105730a());
            sb.append(File.separator);
            sb.append(str);
            C43733e.m138595a(str2, sb.toString());
        }
    }
}
