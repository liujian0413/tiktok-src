package com.p280ss.avframework.opengl;

import android.opengl.GLES20;
import com.p280ss.avframework.utils.AVLog;
import java.nio.FloatBuffer;

/* renamed from: com.ss.avframework.opengl.GlShader */
public class GlShader {
    private int program = GLES20.glCreateProgram();

    public void release() {
        AVLog.m143696d("GlShader", "Deleting shader.");
        if (this.program != -1) {
            GLES20.glDeleteProgram(this.program);
            this.program = -1;
        }
    }

    public void useProgram() {
        if (this.program != -1) {
            GLES20.glUseProgram(this.program);
            GlUtil.checkNoGLES2Error("glUseProgram");
            return;
        }
        throw new RuntimeException("The program has been released");
    }

    public int getAttribLocation(String str) {
        if (this.program != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.program, str);
            if (glGetAttribLocation >= 0) {
                return glGetAttribLocation;
            }
            StringBuilder sb = new StringBuilder("Could not locate '");
            sb.append(str);
            sb.append("' in program");
            throw new RuntimeException(sb.toString());
        }
        throw new RuntimeException("The program has been released");
    }

    public int getUniformLocation(String str) {
        if (this.program != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.program, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            StringBuilder sb = new StringBuilder("Could not locate uniform '");
            sb.append(str);
            sb.append("' in program");
            throw new RuntimeException(sb.toString());
        }
        throw new RuntimeException("The program has been released");
    }

    private static int compileShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                GlUtil.checkNoGLES2Error("compileShader");
                return glCreateShader;
            }
            StringBuilder sb = new StringBuilder("Could not compile shader ");
            sb.append(i);
            sb.append(":");
            sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
            AVLog.m143697e("GlShader", sb.toString());
            throw new RuntimeException(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        StringBuilder sb2 = new StringBuilder("glCreateShader() failed. GLES20 error: ");
        sb2.append(GLES20.glGetError());
        throw new RuntimeException(sb2.toString());
    }

    public GlShader(String str, String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        if (this.program != 0) {
            GLES20.glAttachShader(this.program, compileShader);
            GLES20.glAttachShader(this.program, compileShader2);
            GLES20.glLinkProgram(this.program);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(compileShader);
                GLES20.glDeleteShader(compileShader2);
                GlUtil.checkNoGLES2Error("Creating GlShader");
                return;
            }
            StringBuilder sb = new StringBuilder("Could not link program: ");
            sb.append(GLES20.glGetProgramInfoLog(this.program));
            AVLog.m143697e("GlShader", sb.toString());
            throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
        }
        StringBuilder sb2 = new StringBuilder("glCreateProgram() failed. GLES20 error: ");
        sb2.append(GLES20.glGetError());
        throw new RuntimeException(sb2.toString());
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i, 0, floatBuffer);
    }

    public void setVertexAttribArray(String str, int i, int i2, FloatBuffer floatBuffer) {
        if (this.program != -1) {
            int attribLocation = getAttribLocation(str);
            GLES20.glEnableVertexAttribArray(attribLocation);
            GLES20.glVertexAttribPointer(attribLocation, i, 5126, false, i2, floatBuffer);
            GlUtil.checkNoGLES2Error("setVertexAttribArray");
            return;
        }
        throw new RuntimeException("The program has been released");
    }
}
