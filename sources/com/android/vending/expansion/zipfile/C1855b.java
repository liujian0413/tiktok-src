package com.android.vending.expansion.zipfile;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;
import java.util.zip.ZipFile;

/* renamed from: com.android.vending.expansion.zipfile.b */
public final class C1855b {

    /* renamed from: a */
    public HashMap<File, ZipFile> f6661a = new HashMap<>();

    /* renamed from: b */
    ByteBuffer f6662b = ByteBuffer.allocate(4);

    /* renamed from: c */
    private HashMap<String, C1856a> f6663c = new HashMap<>();

    /* renamed from: com.android.vending.expansion.zipfile.b$a */
    public static final class C1856a {

        /* renamed from: a */
        public final File f6664a;

        /* renamed from: b */
        public final String f6665b;

        /* renamed from: c */
        public final String f6666c;

        /* renamed from: d */
        public long f6667d;

        /* renamed from: e */
        public int f6668e;

        /* renamed from: f */
        public long f6669f;

        /* renamed from: g */
        public long f6670g;

        /* renamed from: h */
        public long f6671h;

        /* renamed from: i */
        public long f6672i;

        /* renamed from: j */
        public long f6673j = -1;

        /* renamed from: a */
        public final AssetFileDescriptor mo7377a() {
            if (this.f6668e == 0) {
                try {
                    AssetFileDescriptor assetFileDescriptor = new AssetFileDescriptor(ParcelFileDescriptor.open(this.f6664a, 268435456), this.f6673j, this.f6672i);
                    return assetFileDescriptor;
                } catch (FileNotFoundException unused) {
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo7378a(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer) throws IOException {
            long j = this.f6667d;
            try {
                randomAccessFile.seek(j);
                randomAccessFile.readFully(byteBuffer.array());
                if (byteBuffer.getInt(0) == 67324752) {
                    this.f6673j = j + 30 + ((long) (byteBuffer.getShort(26) & 65535)) + ((long) (byteBuffer.getShort(28) & 65535));
                    return;
                }
                throw new IOException();
            } catch (FileNotFoundException unused) {
            } catch (IOException unused2) {
            }
        }

        public C1856a(String str, File file, String str2) {
            this.f6665b = str2;
            this.f6666c = str;
            this.f6664a = file;
        }
    }

    /* renamed from: a */
    private static int m8626a(int i) {
        return ((i & NormalGiftView.ALPHA_255) << 24) + ((65280 & i) << 8) + ((16711680 & i) >>> 8) + ((i >>> 24) & NormalGiftView.ALPHA_255);
    }

    /* renamed from: a */
    private static int m8627a(RandomAccessFile randomAccessFile) throws EOFException, IOException {
        return m8626a(randomAccessFile.readInt());
    }

    public C1855b(String str) throws IOException {
        mo7376b(str);
    }

    /* renamed from: a */
    public final AssetFileDescriptor mo7375a(String str) {
        C1856a aVar = (C1856a) this.f6663c.get(str);
        if (aVar != null) {
            return aVar.mo7377a();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7376b(String str) throws IOException {
        String str2 = str;
        File file = new File(str2);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        long length = randomAccessFile.length();
        if (length >= 22) {
            long j = 65557;
            if (65557 > length) {
                j = length;
            }
            randomAccessFile.seek(0);
            int a = m8627a(randomAccessFile);
            if (a == 101010256) {
                throw new IOException();
            } else if (a == 67324752) {
                randomAccessFile.seek(length - j);
                ByteBuffer allocate = ByteBuffer.allocate((int) j);
                byte[] array = allocate.array();
                randomAccessFile.readFully(array);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                int length2 = array.length - 22;
                while (length2 >= 0 && (array[length2] != 80 || allocate.getInt(length2) != 101010256)) {
                    length2--;
                }
                short s = allocate.getShort(length2 + 8);
                long j2 = ((long) allocate.getInt(length2 + 12)) & 4294967295L;
                long j3 = ((long) allocate.getInt(length2 + 16)) & 4294967295L;
                if (j3 + j2 > length) {
                    throw new IOException();
                } else if (s != 0) {
                    MappedByteBuffer map = randomAccessFile.getChannel().map(MapMode.READ_ONLY, j3, j2);
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    short s2 = 65535;
                    byte[] bArr = new byte[65535];
                    ByteBuffer allocate2 = ByteBuffer.allocate(30);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < s) {
                        if (map.getInt(i3) == 33639248) {
                            short s3 = map.getShort(i3 + 28) & s2;
                            short s4 = map.getShort(i3 + 30) & s2;
                            short s5 = map.getShort(i3 + 32) & s2;
                            map.position(i3 + 46);
                            map.get(bArr, i, s3);
                            map.position(i);
                            String str3 = new String(bArr, i, s3);
                            C1856a aVar = new C1856a(str2, file, str3);
                            aVar.f6668e = map.getShort(i3 + 10) & s2;
                            byte[] bArr2 = bArr;
                            aVar.f6669f = ((long) map.getInt(i3 + 12)) & 4294967295L;
                            aVar.f6670g = map.getLong(i3 + 16) & 4294967295L;
                            aVar.f6671h = map.getLong(i3 + 20) & 4294967295L;
                            aVar.f6672i = map.getLong(i3 + 24) & 4294967295L;
                            aVar.f6667d = ((long) map.getInt(i3 + 42)) & 4294967295L;
                            allocate2.clear();
                            aVar.mo7378a(randomAccessFile, allocate2);
                            this.f6663c.put(str3, aVar);
                            i3 += s3 + 46 + s4 + s5;
                            i2++;
                            bArr = bArr2;
                            s2 = 65535;
                            i = 0;
                        } else {
                            throw new IOException();
                        }
                    }
                } else {
                    throw new IOException();
                }
            } else {
                throw new IOException();
            }
        } else {
            throw new IOException();
        }
    }
}
