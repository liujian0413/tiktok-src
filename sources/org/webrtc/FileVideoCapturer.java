package org.webrtc;

import android.content.Context;
import android.os.SystemClock;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class FileVideoCapturer implements VideoCapturer {
    private CapturerObserver capturerObserver;
    private final TimerTask tickTask = new TimerTask() {
        public void run() {
            FileVideoCapturer.this.tick();
        }
    };
    private final Timer timer = new Timer();
    private final VideoReader videoReader;

    interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    static class VideoReaderY4M implements VideoReader {
        private static final int FRAME_DELIMETER_LENGTH = 6;
        private final int frameHeight;
        private final int frameWidth;
        private final RandomAccessFile mediaFile;
        private final FileChannel mediaFileChannel = this.mediaFile.getChannel();
        private final long videoStart;

        public void close() {
            try {
                this.mediaFile.close();
            } catch (IOException e) {
                Logging.m150049e("VideoReaderY4M", "Problem closing file", e);
            }
        }

        public VideoFrame getNextFrame() {
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            allocate.getStrideY();
            allocate.getStrideU();
            allocate.getStrideV();
            try {
                ByteBuffer allocate2 = ByteBuffer.allocate(FRAME_DELIMETER_LENGTH);
                if (this.mediaFileChannel.read(allocate2) < FRAME_DELIMETER_LENGTH) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(allocate2) < FRAME_DELIMETER_LENGTH) {
                        throw new RuntimeException("Error looping video");
                    }
                }
                String str = new String(allocate2.array(), Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new VideoFrame(allocate, 0, nanos);
                }
                StringBuilder sb = new StringBuilder("Frames should be delimited by FRAME plus newline, found delimter was: '");
                sb.append(str);
                sb.append("'");
                throw new RuntimeException(sb.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public VideoReaderY4M(String str) throws IOException {
            String[] split;
            this.mediaFile = new RandomAccessFile(str, "r");
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = this.mediaFile.read();
                if (read == -1) {
                    StringBuilder sb2 = new StringBuilder("Found end of file before end of header for file: ");
                    sb2.append(str);
                    throw new RuntimeException(sb2.toString());
                } else if (read != 10) {
                    sb.append((char) read);
                } else {
                    this.videoStart = this.mediaFileChannel.position();
                    String str2 = "";
                    int i = 0;
                    int i2 = 0;
                    for (String str3 : sb.toString().split("[ ]")) {
                        char charAt = str3.charAt(0);
                        if (charAt == 'C') {
                            str2 = str3.substring(1);
                        } else if (charAt == 'H') {
                            i2 = Integer.parseInt(str3.substring(1));
                        } else if (charAt == 'W') {
                            i = Integer.parseInt(str3.substring(1));
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("Color space: ");
                    sb3.append(str2);
                    Logging.m150047d("VideoReaderY4M", sb3.toString());
                    if (!str2.equals("420") && !str2.equals("420mpeg2")) {
                        throw new IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                    } else if (i % 2 == 1 || i2 % 2 == 1) {
                        throw new IllegalArgumentException("Does not support odd width or height");
                    } else {
                        this.frameWidth = i;
                        this.frameHeight = i2;
                        StringBuilder sb4 = new StringBuilder("frame dim: (");
                        sb4.append(i);
                        sb4.append(", ");
                        sb4.append(i2);
                        sb4.append(")");
                        Logging.m150047d("VideoReaderY4M", sb4.toString());
                        return;
                    }
                }
            }
        }
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
    }

    public boolean isScreencast() {
        return false;
    }

    public void dispose() {
        this.videoReader.close();
    }

    public void stopCapture() throws InterruptedException {
        this.timer.cancel();
    }

    public void tick() {
        VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }

    public FileVideoCapturer(String str) throws IOException {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Could not open video file: ");
            sb.append(str);
            Logging.m150047d("FileVideoCapturer", sb.toString());
            throw e;
        }
    }

    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver2) {
        this.capturerObserver = capturerObserver2;
    }

    public void startCapture(int i, int i2, int i3) {
        this.timer.schedule(this.tickTask, 0, (long) (1000 / i3));
    }
}
