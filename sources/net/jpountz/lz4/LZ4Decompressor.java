package net.jpountz.lz4;

public interface LZ4Decompressor {
    int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3);
}
