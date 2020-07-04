package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.C13300b;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13315l;
import com.facebook.common.memory.C13316a;
import com.facebook.common.memory.C13321f;
import com.facebook.common.util.C13336c;
import com.facebook.imagepipeline.p720g.C13647e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.decoder.e */
public final class C13632e {

    /* renamed from: a */
    public int f36239a = 0;

    /* renamed from: b */
    public int f36240b = 0;

    /* renamed from: c */
    public boolean f36241c;

    /* renamed from: d */
    private int f36242d = 0;

    /* renamed from: e */
    private int f36243e = 0;

    /* renamed from: f */
    private int f36244f = 0;

    /* renamed from: g */
    private int f36245g = 0;

    /* renamed from: h */
    private final C13316a f36246h;

    /* renamed from: a */
    private static boolean m40190a(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* renamed from: b */
    private void m40192b(int i) {
        if (this.f36245g > 0) {
            this.f36240b = i;
        }
        int i2 = this.f36245g;
        this.f36245g = i2 + 1;
        this.f36239a = i2;
    }

    public C13632e(C13316a aVar) {
        this.f36246h = (C13316a) C13307g.m38940a(aVar);
    }

    /* renamed from: a */
    public final boolean mo33249a(C13647e eVar) {
        if (this.f36242d == 6 || eVar.mo33281i() <= this.f36244f) {
            return false;
        }
        C13321f fVar = new C13321f(eVar.mo33274c(), (byte[]) this.f36246h.mo32581a(16384), this.f36246h);
        try {
            C13336c.m39029a(fVar, (long) this.f36244f);
            return m40191a((InputStream) fVar);
        } catch (IOException e) {
            C13315l.m38962b(e);
            return false;
        } finally {
            C13300b.m38927a(fVar);
        }
    }

    /* renamed from: a */
    private boolean m40191a(InputStream inputStream) {
        int i = this.f36239a;
        while (this.f36242d != 6) {
            try {
                int read = inputStream.read();
                if (read != -1) {
                    this.f36244f++;
                    if (this.f36241c) {
                        this.f36242d = 6;
                        this.f36241c = false;
                        return false;
                    }
                    switch (this.f36242d) {
                        case 0:
                            if (read != 255) {
                                this.f36242d = 6;
                                break;
                            } else {
                                this.f36242d = 1;
                                break;
                            }
                        case 1:
                            if (read != 216) {
                                this.f36242d = 6;
                                break;
                            } else {
                                this.f36242d = 2;
                                break;
                            }
                        case 2:
                            if (read != 255) {
                                break;
                            } else {
                                this.f36242d = 3;
                                break;
                            }
                        case 3:
                            if (read != 255) {
                                if (read != 0) {
                                    if (read != 217) {
                                        if (read == 218) {
                                            m40192b(this.f36244f - 2);
                                        }
                                        if (!m40190a(read)) {
                                            this.f36242d = 2;
                                            break;
                                        } else {
                                            this.f36242d = 4;
                                            break;
                                        }
                                    } else {
                                        this.f36241c = true;
                                        m40192b(this.f36244f - 2);
                                        this.f36242d = 2;
                                        break;
                                    }
                                } else {
                                    this.f36242d = 2;
                                    break;
                                }
                            } else {
                                this.f36242d = 3;
                                break;
                            }
                        case 4:
                            this.f36242d = 5;
                            break;
                        case 5:
                            int i2 = ((this.f36243e << 8) + read) - 2;
                            C13336c.m39029a(inputStream, (long) i2);
                            this.f36244f += i2;
                            this.f36242d = 2;
                            break;
                        default:
                            C13307g.m38947b(false);
                            break;
                    }
                    this.f36243e = read;
                } else if (this.f36242d != 6 || this.f36239a == i) {
                    return false;
                } else {
                    return true;
                }
            } catch (IOException e) {
                C13315l.m38962b(e);
            }
        }
        if (this.f36242d != 6) {
        }
        return false;
    }
}
