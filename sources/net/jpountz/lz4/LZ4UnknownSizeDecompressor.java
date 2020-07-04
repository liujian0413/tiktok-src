package net.jpountz.lz4;

public interface LZ4UnknownSizeDecompressor {
    int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);
}
