package com.p280ss.android.medialib.common;

import android.opengl.GLES20;
import com.C1642a;
import com.p280ss.android.vesdk.C45372t;

/* renamed from: com.ss.android.medialib.common.d */
public class C19707d {

    /* renamed from: a */
    public int f53443a = GLES20.glCreateProgram();

    /* renamed from: b */
    private C19708a f53444b;

    /* renamed from: c */
    private C19708a f53445c;

    /* renamed from: com.ss.android.medialib.common.d$a */
    public static class C19708a {

        /* renamed from: b */
        static final /* synthetic */ boolean f53446b = (!C19707d.class.desiredAssertionStatus());

        /* renamed from: a */
        public int f53447a;

        /* renamed from: c */
        private int f53448c;

        public C19708a() {
        }

        /* renamed from: a */
        public final void mo52410a() {
            if (this.f53447a != 0) {
                GLES20.glDeleteShader(this.f53447a);
                this.f53447a = 0;
            }
        }

        public C19708a(String str, int i) {
            m64980a(str, i);
        }

        /* renamed from: a */
        private static int m64979a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    C45372t.m143409d("ProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    return 0;
                }
            }
            return glCreateShader;
        }

        /* renamed from: a */
        private boolean m64980a(String str, int i) {
            this.f53448c = i;
            this.f53447a = m64979a(i, str);
            if (!f53446b && this.f53447a == 0) {
                throw new AssertionError("Shader Create Failed!");
            } else if (this.f53447a != 0) {
                return true;
            } else {
                C45372t.m143409d("ProgramObject", "glCreateShader Failed!...");
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo52409b() {
        GLES20.glUseProgram(this.f53443a);
    }

    /* renamed from: a */
    public final void mo52406a() {
        if (this.f53443a != 0) {
            GLES20.glDeleteProgram(this.f53443a);
            this.f53443a = 0;
        }
    }

    /* renamed from: a */
    public final int mo52405a(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f53443a, str);
        if (glGetUniformLocation < 0) {
            C45372t.m143409d("ProgramObject", C1642a.m8034a("uniform name %s does not exist", new Object[]{str}));
        }
        return glGetUniformLocation;
    }

    /* renamed from: a */
    public final void mo52407a(String str, int i) {
        GLES20.glBindAttribLocation(this.f53443a, 0, str);
    }

    /* renamed from: a */
    public final boolean mo52408a(String str, String str2) {
        return m64973a(str, str2, this.f53443a);
    }

    /* renamed from: a */
    private boolean m64973a(String str, String str2, int i) {
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        if (i == 0) {
            C45372t.m143409d("ProgramObject", "Invalid Program ID! Check if the context is binded!");
        }
        if (this.f53444b != null) {
            this.f53444b.mo52410a();
        }
        if (this.f53445c != null) {
            this.f53445c.mo52410a();
        }
        this.f53444b = new C19708a(str, 35633);
        this.f53445c = new C19708a(str2, 35632);
        GLES20.glAttachShader(i, this.f53444b.f53447a);
        GLES20.glAttachShader(i, this.f53445c.f53447a);
        C19702a.m64958a("AttachShaders...");
        GLES20.glLinkProgram(i);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        this.f53444b.mo52410a();
        this.f53445c.mo52410a();
        this.f53444b = null;
        this.f53445c = null;
        if (iArr[0] != 1) {
            C45372t.m143409d("ProgramObject", GLES20.glGetProgramInfoLog(i));
            return false;
        }
        if (!(this.f53443a == i || this.f53443a == 0)) {
            GLES20.glDeleteProgram(this.f53443a);
        }
        this.f53443a = i;
        return true;
    }
}
