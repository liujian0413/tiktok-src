package com.p280ss.avframework.livestreamv2.utils;

import android.util.AndroidRuntimeException;
import com.p280ss.avframework.utils.AVLog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.utils.FileUtils */
public class FileUtils {

    /* renamed from: com.ss.avframework.livestreamv2.utils.FileUtils$File */
    public static class File {
        private FileOutputStream mFileOutputStream;
        private String mName;

        public String name() {
            return this.mName;
        }

        public void close() {
            try {
                this.mFileOutputStream.close();
            } catch (IOException unused) {
            }
        }

        public void write(Buffer buffer) {
            if (buffer instanceof ByteBuffer) {
                write((ByteBuffer) buffer);
                return;
            }
            throw new AndroidRuntimeException("Unsupport");
        }

        public void write(ByteBuffer byteBuffer) {
            byteBuffer.position(0);
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.get(bArr);
            write(bArr);
        }

        public void write(byte[] bArr) {
            try {
                this.mFileOutputStream.write(bArr);
                this.mFileOutputStream.flush();
            } catch (IOException e) {
                throw new AndroidRuntimeException(e.getMessage());
            }
        }

        public File(FileOutputStream fileOutputStream, String str) {
            StringBuilder sb = new StringBuilder("Open write file ");
            sb.append(str);
            AVLog.m143700w("Utils.File", sb.toString());
            this.mFileOutputStream = fileOutputStream;
            this.mName = str;
        }
    }

    public static File CreateWriteFile(String str) {
        try {
            return new File(new FileOutputStream(new java.io.File(str)), str);
        } catch (FileNotFoundException e) {
            throw new AndroidRuntimeException(e.getMessage());
        }
    }
}
