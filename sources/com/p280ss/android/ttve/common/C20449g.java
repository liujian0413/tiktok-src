package com.p280ss.android.ttve.common;

import android.opengl.GLES20;
import com.p280ss.android.vesdk.C45372t;

/* renamed from: com.ss.android.ttve.common.g */
public final class C20449g {

    /* renamed from: a */
    public int f55222a = GLES20.glCreateProgram();

    /* renamed from: b */
    private C20450a f55223b;

    /* renamed from: c */
    private C20450a f55224c;

    /* renamed from: com.ss.android.ttve.common.g$a */
    public static class C20450a {

        /* renamed from: a */
        public int f55225a;

        /* renamed from: b */
        private int f55226b;

        public C20450a() {
        }

        /* renamed from: a */
        public final void mo55047a() {
            if (this.f55225a != 0) {
                GLES20.glDeleteShader(this.f55225a);
                this.f55225a = 0;
            }
        }

        public C20450a(String str, int i) {
            m67847a(str, i);
        }

        /* renamed from: a */
        private boolean m67847a(String str, int i) {
            this.f55226b = i;
            this.f55225a = m67846a(i, str);
            if (this.f55225a == 0) {
                throw new AssertionError("Shader Create Failed!");
            } else if (this.f55225a != 0) {
                return true;
            } else {
                C45372t.m143409d("TEProgramObject", "glCreateShader Failed!...");
                return false;
            }
        }

        /* renamed from: a */
        private static int m67846a(int i, String str) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder sb = new StringBuilder("before glCreateShader, glError: ");
                sb.append(glGetError);
                C45372t.m143409d("TEProgramObject", sb.toString());
            }
            int glCreateShader = GLES20.glCreateShader(i);
            int glGetError2 = GLES20.glGetError();
            if (glGetError2 != 0) {
                StringBuilder sb2 = new StringBuilder("after glCreateShader, glError: ");
                sb2.append(glGetError2);
                C45372t.m143409d("TEProgramObject", sb2.toString());
            }
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int glGetError3 = GLES20.glGetError();
                if (glGetError3 != 0) {
                    StringBuilder sb3 = new StringBuilder("after glCompileShader, glError: ");
                    sb3.append(glGetError3);
                    C45372t.m143409d("TEProgramObject", sb3.toString());
                }
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    C45372t.m143409d("TEProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    return 0;
                }
            }
            return glCreateShader;
        }
    }

    /* renamed from: b */
    public final void mo55046b() {
        GLES20.glUseProgram(this.f55222a);
    }

    /* renamed from: a */
    public final void mo55043a() {
        if (this.f55222a != 0) {
            GLES20.glDeleteProgram(this.f55222a);
            this.f55222a = 0;
        }
    }

    /* renamed from: a */
    public final int mo55042a(String str) {
        return GLES20.glGetUniformLocation(this.f55222a, str);
    }

    /* renamed from: a */
    public final void mo55044a(String str, int i) {
        GLES20.glBindAttribLocation(this.f55222a, 0, str);
    }

    /* renamed from: a */
    public final boolean mo55045a(String str, String str2) {
        return m67840a(str, str2, this.f55222a);
    }

    /* renamed from: a */
    private boolean m67840a(String str, String str2, int i) {
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        if (this.f55223b != null) {
            this.f55223b.mo55047a();
        }
        if (this.f55224c != null) {
            this.f55224c.mo55047a();
        }
        this.f55223b = new C20450a(str, 35633);
        this.f55224c = new C20450a(str2, 35632);
        GLES20.glAttachShader(i, this.f55223b.f55225a);
        GLES20.glAttachShader(i, this.f55224c.f55225a);
        C20444b.m67836a("AttachShaders...");
        GLES20.glLinkProgram(i);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        this.f55223b.mo55047a();
        this.f55224c.mo55047a();
        this.f55223b = null;
        this.f55224c = null;
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(i);
            return false;
        }
        if (!(this.f55222a == i || this.f55222a == 0)) {
            GLES20.glDeleteProgram(this.f55222a);
        }
        this.f55222a = i;
        return true;
    }
}
