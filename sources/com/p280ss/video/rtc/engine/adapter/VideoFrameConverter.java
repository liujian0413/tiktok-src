package com.p280ss.video.rtc.engine.adapter;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrame.I420Buffer;

/* renamed from: com.ss.video.rtc.engine.adapter.VideoFrameConverter */
public class VideoFrameConverter {
    public static ByteBuffer convert2YUVByteBuffer(VideoFrame videoFrame) {
        I420Buffer i420Buffer;
        boolean z;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        if (videoFrame.getBuffer() instanceof JavaI420Buffer) {
            i420Buffer = (JavaI420Buffer) videoFrame.getBuffer();
            z = false;
        } else {
            I420Buffer i420 = videoFrame.getBuffer().toI420();
            videoFrame.getBuffer().release();
            i420Buffer = i420;
            z = true;
        }
        ByteBuffer convertRawYUV2ByteBuffer = convertRawYUV2ByteBuffer(i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV(), i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV(), width, height);
        if ((i420Buffer instanceof JavaI420Buffer) && z) {
            i420Buffer.release();
        }
        return convertRawYUV2ByteBuffer;
    }

    public static ByteBuffer convertRawYUV2ByteArray(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        byte[] bArr4 = bArr2;
        byte[] bArr5 = bArr3;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(bArr4.length);
        allocateDirect2.order(ByteOrder.nativeOrder());
        allocateDirect2.put(bArr2);
        allocateDirect2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(bArr5.length);
        allocateDirect3.order(ByteOrder.nativeOrder());
        allocateDirect3.put(bArr3);
        allocateDirect3.position(0);
        return convertRawYUV2ByteBuffer(allocateDirect, allocateDirect2, allocateDirect3, i, i2, i3, i4, i5);
    }

    public static ByteBuffer convertRawYUV2ByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i5 * i4) * 3) / 2;
        byteBuffer.position(0);
        byteBuffer2.position(0);
        byteBuffer3.position(0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i6);
        allocateDirect.order(ByteOrder.nativeOrder());
        ByteBuffer[] byteBufferArr = {byteBuffer, byteBuffer2, byteBuffer3};
        int[] iArr = {i, i2, i3};
        int i7 = (i4 + 1) / 2;
        int[] iArr2 = {i4, i7, i7};
        for (int i8 = 0; i8 < 3; i8++) {
            ByteBuffer byteBuffer4 = byteBufferArr[i8];
            int i9 = iArr[i8];
            int i10 = iArr2[i8];
            if (i9 == i10) {
                allocateDirect.put(byteBuffer4);
            } else {
                for (int i11 = 0; i11 < byteBuffer4.capacity(); i11 += i9) {
                    int i12 = i11 + i10;
                    if (i12 <= byteBuffer4.capacity()) {
                        byteBuffer4.limit(i12);
                        byteBuffer4.position(i11);
                        allocateDirect.put(byteBuffer4.slice());
                    }
                }
            }
        }
        allocateDirect.position(0);
        return allocateDirect;
    }
}
