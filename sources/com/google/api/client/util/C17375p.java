package com.google.api.client.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.util.p */
public final class C17375p extends ByteArrayOutputStream {

    /* renamed from: a */
    public final int f48316a;

    /* renamed from: b */
    private int f48317b;

    /* renamed from: c */
    private boolean f48318c;

    /* renamed from: d */
    private final Level f48319d;

    /* renamed from: e */
    private final Logger f48320e;

    public final synchronized void close() throws IOException {
        if (!this.f48318c) {
            if (this.f48317b != 0) {
                StringBuilder sb = new StringBuilder("Total: ");
                m57839a(sb, this.f48317b);
                if (this.count != 0 && this.count < this.f48317b) {
                    sb.append(" (logging first ");
                    m57839a(sb, this.count);
                    sb.append(")");
                }
                this.f48320e.config(sb.toString());
                if (this.count != 0) {
                    this.f48320e.log(this.f48319d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.f48318c = true;
        }
    }

    public final synchronized void write(int i) {
        C17384w.m57850a(!this.f48318c);
        this.f48317b++;
        if (this.count < this.f48316a) {
            super.write(i);
        }
    }

    /* renamed from: a */
    private static void m57839a(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format((long) i));
        sb.append(" bytes");
    }

    public C17375p(Logger logger, Level level, int i) {
        boolean z;
        this.f48320e = (Logger) C17384w.m57847a(logger);
        this.f48319d = (Level) C17384w.m57847a(level);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57850a(z);
        this.f48316a = i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        C17384w.m57850a(!this.f48318c);
        this.f48317b += i2;
        if (this.count < this.f48316a) {
            int i3 = this.count + i2;
            if (i3 > this.f48316a) {
                i2 += this.f48316a - i3;
            }
            super.write(bArr, i, i2);
        }
    }
}
