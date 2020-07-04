package com.bytedance.retrofit2.mime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TypedFile implements TypedInput, TypedOutput {
    private final File file;
    private final String mimeType;

    public File file() {
        return this.file;
    }

    public String mimeType() {
        return this.mimeType;
    }

    public String fileName() {
        return this.file.getName();
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    /* renamed from: in */
    public InputStream mo10444in() throws IOException {
        return new FileInputStream(this.file);
    }

    public long length() {
        return this.file.length();
    }

    public String md5Stub() {
        return this.file == null ? null : null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.file.getAbsolutePath());
        sb.append(" (");
        sb.append(mimeType());
        sb.append(")");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypedFile)) {
            return false;
        }
        return this.file.equals(((TypedFile) obj).file);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    public void moveTo(TypedFile typedFile) throws IOException {
        if (!mimeType().equals(typedFile.mimeType())) {
            throw new IOException("Type mismatch.");
        } else if (!this.file.renameTo(typedFile.file())) {
            throw new IOException("Rename failed!");
        }
    }

    public TypedFile(String str, File file2) {
        if (str == null) {
            str = "application/octet-stream";
        }
        if (file2 != null) {
            this.mimeType = str;
            this.file = file2;
            return;
        }
        throw new NullPointerException("file");
    }
}
