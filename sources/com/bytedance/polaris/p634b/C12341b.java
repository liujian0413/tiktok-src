package com.bytedance.polaris.p634b;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: com.bytedance.polaris.b.b */
public final class C12341b {

    /* renamed from: a */
    private static C12341b f32765a;

    /* renamed from: b */
    private final Properties f32766b = new Properties();

    /* renamed from: a */
    public static C12341b m35840a() throws IOException {
        if (f32765a == null) {
            f32765a = new C12341b();
        }
        return f32765a;
    }

    private C12341b() throws IOException {
        this.f32766b.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
    }

    /* renamed from: a */
    public final String mo30185a(String str) {
        return this.f32766b.getProperty(str);
    }
}
