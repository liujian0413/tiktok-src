package com.bytedance.crash.event;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.crash.p493d.C9876a;
import com.bytedance.crash.p493d.p494a.C9877a;
import com.bytedance.crash.p504l.C9982g;
import com.bytedance.crash.p504l.C9995o;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.bytedance.crash.event.c */
public class C9891c implements C9894d<Event> {

    /* renamed from: a */
    private final File f26980a;

    /* renamed from: b */
    private volatile int f26981b = -1;

    /* renamed from: a */
    public final int mo24472a() {
        int i;
        if (this.f26981b == -1) {
            String[] list = this.f26980a.list(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return str.endsWith(".event");
                }
            });
            if (list == null) {
                i = 0;
            } else {
                i = list.length;
            }
            m29194a(i);
        }
        return this.f26981b;
    }

    /* renamed from: b */
    public final ArrayList<Event> mo24475b() {
        int i;
        File[] listFiles = this.f26980a.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.endsWith(".event");
            }
        });
        ArrayList<Event> arrayList = new ArrayList<>();
        if (listFiles == null) {
            i = 0;
        } else {
            i = listFiles.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Event a = m29193a(listFiles[i2].getAbsolutePath());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m29194a(int i) {
        synchronized (C9891c.class) {
            this.f26981b = i;
        }
    }

    C9891c(File file) {
        if (file != null) {
            this.f26980a = file;
        } else {
            this.f26980a = new File(Environment.getExternalStorageDirectory(), "monitorLog");
        }
    }

    /* renamed from: a */
    private static Event m29193a(String str) {
        if (!C9876a.m29132a().mo24442a(str)) {
            return C9887a.m29173a(str);
        }
        C9982g.m29548a(str);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo24473a(Event event) {
        if (event == null) {
            return false;
        }
        event.uuid = UUID.randomUUID().toString();
        String c = m29197c(event);
        if (!TextUtils.isEmpty(c)) {
            try {
                if (!this.f26980a.exists()) {
                    this.f26980a.mkdirs();
                }
                C9982g.m29543a(new File(c), event.toJSONObject(), false);
                m29194a(-1);
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m29196b(Event event) {
        String c = m29197c(event);
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        boolean a = C9982g.m29548a(c);
        if (!a) {
            C9876a.m29132a().mo24441a(C9877a.m29137a(c));
        }
        m29194a(-1);
        return a;
    }

    /* renamed from: c */
    private String m29197c(Event event) {
        if (event == null) {
            return null;
        }
        if (TextUtils.isEmpty(event.uuid)) {
            event.uuid = UUID.randomUUID().toString();
        }
        StringBuilder sb = new StringBuilder(event.crashType);
        sb.append("_");
        sb.append(event.event);
        sb.append("_");
        sb.append(event.uuid);
        sb.append(".event");
        return new File(this.f26980a, sb.toString()).getAbsolutePath();
    }

    /* renamed from: a */
    public final boolean mo24474a(List<Event> list) {
        if (C9995o.m29625a(list)) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < list.size(); i++) {
            if (!m29196b((Event) list.get(i))) {
                z = false;
            }
        }
        return z;
    }
}
