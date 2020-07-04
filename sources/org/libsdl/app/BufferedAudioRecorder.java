package org.libsdl.app;

import android.media.AudioRecord;
import com.p280ss.android.medialib.p879a.C19617a;
import com.p280ss.android.medialib.presenter.C19764d.C19778a;
import com.p280ss.android.vesdk.C45372t;

public class BufferedAudioRecorder {
    protected static int channelConfigOffset = -1;
    protected static int[] channelConfigSuggested = {12, 16, 1};
    protected static int sampleRateOffset = -1;
    protected static int[] sampleRateSuggested = {44100, 8000, 11025, 16000, 22050};
    AudioRecord audio;
    final int audioFormat = 2;
    int audioSource = 1;
    int bufferSizeInBytes;
    int channelConfig = -1;
    private final int encodeChannels;
    private final int encodeSampleRate;
    boolean isRecording;
    boolean isStopPCMCallback;
    boolean isStopped;
    C19617a mProcessThread;
    public C19778a mStateCallback;
    AudioRecorderInterfaceExt presenter;
    int sampleRateInHz = -1;

    class AudioRecorderRunnable implements Runnable {
        private double speed;
        boolean startFeeding;

        public void run() {
            byte[] bArr = new byte[BufferedAudioRecorder.this.bufferSizeInBytes];
            BufferedAudioRecorder.this.isStopped = false;
            BufferedAudioRecorder.this.isStopPCMCallback = false;
            BufferedAudioRecorder.this.mProcessThread = new C19617a(BufferedAudioRecorder.this.presenter, BufferedAudioRecorder.this.presenter);
            BufferedAudioRecorder.this.mProcessThread.mo52191a();
            if (this.startFeeding) {
                BufferedAudioRecorder.this.mProcessThread.mo52192a(BufferedAudioRecorder.this.sampleRateInHz, BufferedAudioRecorder.this.getChannelCount(BufferedAudioRecorder.this.channelConfig), this.speed);
            }
            try {
                if (BufferedAudioRecorder.this.audio != null && BufferedAudioRecorder.this.audio.getState() != 0) {
                    BufferedAudioRecorder.this.audio.startRecording();
                    if (BufferedAudioRecorder.this.audio == null || BufferedAudioRecorder.this.audio.getRecordingState() == 3) {
                        int i = 0;
                        boolean z = false;
                        while (BufferedAudioRecorder.this.isRecording) {
                            if (BufferedAudioRecorder.this.audio != null) {
                                i = BufferedAudioRecorder.this.audio.read(bArr, 0, BufferedAudioRecorder.this.bufferSizeInBytes);
                            }
                            if (-3 == i) {
                                StringBuilder sb = new StringBuilder("bad audio buffer len ");
                                sb.append(i);
                                C45372t.m143409d("BufferedAudioRecorder", sb.toString());
                            } else if (i > 0) {
                                try {
                                    if (BufferedAudioRecorder.this.isRecording && !BufferedAudioRecorder.this.isStopPCMCallback) {
                                        BufferedAudioRecorder.this.presenter.addPCMData(bArr, i);
                                    }
                                    if (BufferedAudioRecorder.this.mProcessThread.mo52196c() && !BufferedAudioRecorder.this.isStopped) {
                                        BufferedAudioRecorder.this.mProcessThread.mo52193a(bArr, i);
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                if (!(BufferedAudioRecorder.this.audio == null || BufferedAudioRecorder.this.audio.getRecordingState() == 3 || z)) {
                                    z = true;
                                    BufferedAudioRecorder.this.presenter.recordStatus(false);
                                }
                                Thread.sleep(50);
                            }
                        }
                        return;
                    }
                    BufferedAudioRecorder.this.presenter.recordStatus(false);
                    C45372t.m143409d("BufferedAudioRecorder", "audio starRecording failed! Stop immediately!");
                    BufferedAudioRecorder.this.unInit();
                }
            } catch (Exception e) {
                try {
                    if (BufferedAudioRecorder.this.audio != null) {
                        BufferedAudioRecorder.this.audio.release();
                    }
                } catch (Exception unused2) {
                }
                BufferedAudioRecorder.this.audio = null;
                StringBuilder sb2 = new StringBuilder("audio recording failed!");
                sb2.append(e);
                C45372t.m143409d("BufferedAudioRecorder", sb2.toString());
            }
        }

        public AudioRecorderRunnable(double d, boolean z) {
            this.speed = d;
            this.startFeeding = z;
        }
    }

    public int getChannelCount(int i) {
        return 16 == i ? 1 : 2;
    }

    public void discard() {
        if (this.mProcessThread != null) {
            this.mProcessThread.mo52198e();
        }
    }

    public void markRecordStop() {
        synchronized (this) {
            this.isStopped = true;
        }
    }

    public void waitUtilAudioProcessDone() {
        if (this.mProcessThread != null) {
            this.mProcessThread.mo52197d();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.audio != null) {
            try {
                if (this.audio.getState() != 0) {
                    this.audio.stop();
                }
                this.audio.release();
            } catch (Exception unused) {
            }
            this.audio = null;
        }
        super.finalize();
    }

    public synchronized boolean isProcessing() {
        boolean z;
        if (this.mProcessThread == null || !this.mProcessThread.mo52196c()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean stopRecording() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isRecording     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return r1
        L_0x0008:
            r3.isRecording = r1     // Catch:{ all -> 0x0031 }
            android.media.AudioRecord r0 = r3.audio     // Catch:{ all -> 0x0031 }
            r1 = 1
            if (r0 == 0) goto L_0x001f
            android.media.AudioRecord r0 = r3.audio     // Catch:{ all -> 0x0031 }
            int r0 = r0.getState()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0026
            if (r0 == r1) goto L_0x0026
            android.media.AudioRecord r0 = r3.audio     // Catch:{ all -> 0x0031 }
            r0.stop()     // Catch:{ all -> 0x0031 }
            goto L_0x0026
        L_0x001f:
            java.lang.String r0 = "BufferedAudioRecorder"
            java.lang.String r2 = "未启动音频模块但调用stopRecording"
            com.p280ss.android.vesdk.C45372t.m143409d(r0, r2)     // Catch:{ all -> 0x0031 }
        L_0x0026:
            com.ss.android.medialib.a.a r0 = r3.mProcessThread     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            com.ss.android.medialib.a.a r0 = r3.mProcessThread     // Catch:{ all -> 0x0031 }
            r0.mo52199f()     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return r1
        L_0x0031:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.stopRecording():boolean");
    }

    public void unInit() {
        if (this.isRecording) {
            stopRecording();
        }
        synchronized (this) {
            if (this.audio != null) {
                try {
                    int state = this.audio.getState();
                    if (!(state == 0 || state == 1)) {
                        this.audio.stop();
                    }
                    this.audio.release();
                } catch (Exception unused) {
                }
                this.audio = null;
            }
        }
        C45372t.m143403a("BufferedAudioRecorder", "unInit()");
    }

    public boolean stopFeeding() {
        C45372t.m143403a("BufferedAudioRecorder", "stopFeeding() called");
        if (this.isRecording && this.audio == null) {
            C45372t.m143409d("BufferedAudioRecorder", "stopFeeding: 状态异常，重置状态");
            this.isRecording = false;
            this.isStopped = true;
            if (this.mProcessThread != null) {
                this.mProcessThread.mo52199f();
            }
            return false;
        } else if (!this.isRecording || this.mProcessThread == null) {
            C45372t.m143409d("BufferedAudioRecorder", "stopFeeding 失败，请先调用startRecording");
            return false;
        } else if (!this.mProcessThread.mo52196c()) {
            C45372t.m143409d("BufferedAudioRecorder", "stopFeeding 失败，请先startFeeding再stopFeeding");
            return false;
        } else {
            this.mProcessThread.mo52194b();
            return true;
        }
    }

    public void setAudioRecordStateCallack(C19778a aVar) {
        this.mStateCallback = aVar;
    }

    public void stopPCMCallback(boolean z) {
        synchronized (this) {
            this.isStopPCMCallback = z;
        }
    }

    public boolean startFeeding(double d) {
        StringBuilder sb = new StringBuilder("startFeeding() called with: speed = [");
        sb.append(d);
        sb.append("]");
        C45372t.m143403a("BufferedAudioRecorder", sb.toString());
        if (!this.isRecording || this.mProcessThread == null) {
            C45372t.m143407c("BufferedAudioRecorder", "startFeeding 录音未启动，将先启动startRecording");
            startRecording(d, true);
            return true;
        } else if (this.mProcessThread.mo52196c()) {
            C45372t.m143407c("BufferedAudioRecorder", "startFeeding 失败，已经调用过一次了");
            return false;
        } else {
            this.isStopped = false;
            this.isStopPCMCallback = false;
            this.mProcessThread.mo52192a(this.sampleRateInHz, getChannelCount(this.channelConfig), d);
            return true;
        }
    }

    public void init(int i) {
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        this.audioSource = i;
        if (this.audio != null) {
            C45372t.m143409d("BufferedAudioRecorder", "second time audio init(), skip");
            return;
        }
        int i6 = 2;
        int i7 = -1;
        try {
            if (!(channelConfigOffset == -1 || sampleRateOffset == -1)) {
                this.channelConfig = channelConfigSuggested[channelConfigOffset];
                this.sampleRateInHz = sampleRateSuggested[sampleRateOffset];
                this.bufferSizeInBytes = AudioRecord.getMinBufferSize(this.sampleRateInHz, this.channelConfig, 2);
                AudioRecord audioRecord = new AudioRecord(i, this.sampleRateInHz, this.channelConfig, 2, this.bufferSizeInBytes);
                this.audio = audioRecord;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("使用预设配置");
            sb.append(channelConfigOffset);
            sb.append(",");
            sb.append(sampleRateOffset);
            sb.append("实例化audio recorder失败，重新测试配置。");
            sb.append(e);
            C45372t.m143409d("BufferedAudioRecorder", sb.toString());
            this.audio = null;
            this.presenter.lackPermission();
        }
        int i8 = 1;
        if (this.audio == null) {
            channelConfigOffset = -1;
            int[] iArr2 = channelConfigSuggested;
            int length = iArr2.length;
            int i9 = 0;
            boolean z = false;
            while (i9 < length) {
                this.channelConfig = iArr2[i9];
                channelConfigOffset++;
                sampleRateOffset = i7;
                int[] iArr3 = sampleRateSuggested;
                int length2 = iArr3.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i2 = i9;
                        break;
                    }
                    int i11 = iArr3[i10];
                    sampleRateOffset++;
                    try {
                        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i11, this.channelConfig, i6);
                        StringBuilder sb2 = new StringBuilder("试用hz ");
                        sb2.append(i11);
                        sb2.append(" ");
                        sb2.append(this.channelConfig);
                        sb2.append(" 2");
                        C45372t.m143409d("BufferedAudioRecorder", sb2.toString());
                        if (this.bufferSizeInBytes > 0) {
                            this.sampleRateInHz = i11;
                            int i12 = this.channelConfig;
                            r2 = r2;
                            i5 = i11;
                            i3 = i10;
                            i4 = length2;
                            int i13 = i12;
                            iArr = iArr3;
                            i2 = i9;
                            try {
                                AudioRecord audioRecord2 = new AudioRecord(i, this.sampleRateInHz, i13, 2, this.bufferSizeInBytes);
                                this.audio = audioRecord2;
                                z = true;
                                break;
                            } catch (Exception e2) {
                                e = e2;
                                this.sampleRateInHz = 0;
                                this.audio = null;
                                StringBuilder sb3 = new StringBuilder("apply audio record sample rate ");
                                sb3.append(i5);
                                sb3.append(" failed: ");
                                sb3.append(e.getMessage());
                                C45372t.m143409d("BufferedAudioRecorder", sb3.toString());
                                sampleRateOffset++;
                                i10 = i3 + 1;
                                length2 = i4;
                                i9 = i2;
                                iArr3 = iArr;
                                i6 = 2;
                            }
                        } else {
                            int i14 = i11;
                            i3 = i10;
                            i4 = length2;
                            iArr = iArr3;
                            i2 = i9;
                            sampleRateOffset++;
                            i10 = i3 + 1;
                            length2 = i4;
                            i9 = i2;
                            iArr3 = iArr;
                            i6 = 2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i5 = i11;
                        i3 = i10;
                        i4 = length2;
                        iArr = iArr3;
                        i2 = i9;
                        this.sampleRateInHz = 0;
                        this.audio = null;
                        StringBuilder sb32 = new StringBuilder("apply audio record sample rate ");
                        sb32.append(i5);
                        sb32.append(" failed: ");
                        sb32.append(e.getMessage());
                        C45372t.m143409d("BufferedAudioRecorder", sb32.toString());
                        sampleRateOffset++;
                        i10 = i3 + 1;
                        length2 = i4;
                        i9 = i2;
                        iArr3 = iArr;
                        i6 = 2;
                    }
                }
                if (z) {
                    break;
                }
                i9 = i2 + 1;
                i6 = 2;
                i7 = -1;
            }
        }
        if (this.sampleRateInHz <= 0) {
            StringBuilder sb4 = new StringBuilder("!Init audio recorder failed, hz ");
            sb4.append(this.sampleRateInHz);
            C45372t.m143409d("BufferedAudioRecorder", sb4.toString());
            return;
        }
        if (this.channelConfig != 16) {
            i8 = 2;
        }
        this.presenter.initAudioConfig(this.sampleRateInHz, i8, this.encodeSampleRate, this.encodeChannels);
        StringBuilder sb5 = new StringBuilder("Init audio recorder succeed, apply audio record sample rate ");
        sb5.append(this.sampleRateInHz);
        sb5.append(" channels ");
        sb5.append(i8);
        sb5.append(" buffer ");
        sb5.append(this.bufferSizeInBytes);
        sb5.append(" state ");
        sb5.append(this.audio.getState());
        sb5.append(" encodeSampleRate ");
        sb5.append(this.encodeSampleRate);
        sb5.append(" encodeChannels ");
        sb5.append(this.encodeChannels);
        C45372t.m143403a("BufferedAudioRecorder", sb5.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startRecording(double r3, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "BufferedAudioRecorder"
            java.lang.String r1 = "startRecording() called"
            com.p280ss.android.vesdk.C45372t.m143403a(r0, r1)
            monitor-enter(r2)
            boolean r0 = r2.isRecording     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "BufferedAudioRecorder"
            java.lang.String r1 = "recorder is started"
            com.p280ss.android.vesdk.C45372t.m143407c(r0, r1)     // Catch:{ all -> 0x005f }
            if (r5 == 0) goto L_0x0018
            r2.startFeeding(r3)     // Catch:{ all -> 0x005f }
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            return
        L_0x001a:
            android.media.AudioRecord r0 = r2.audio     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0030
            int r0 = r2.audioSource     // Catch:{ all -> 0x005f }
            r2.init(r0)     // Catch:{ all -> 0x005f }
            android.media.AudioRecord r0 = r2.audio     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0030
            java.lang.String r3 = "BufferedAudioRecorder"
            java.lang.String r4 = "recorder is null"
            com.p280ss.android.vesdk.C45372t.m143409d(r3, r4)     // Catch:{ all -> 0x005f }
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            return
        L_0x0030:
            r0 = 1
            r2.isRecording = r0     // Catch:{ all -> 0x005f }
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ OutOfMemoryError -> 0x0042 }
            org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable r1 = new org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable     // Catch:{ OutOfMemoryError -> 0x0042 }
            r1.<init>(r3, r5)     // Catch:{ OutOfMemoryError -> 0x0042 }
            r0.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x0042 }
            r0.start()     // Catch:{ OutOfMemoryError -> 0x0042 }
            return
        L_0x0042:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x004e }
        L_0x004e:
            java.lang.System.runFinalization()
            java.lang.Thread r0 = new java.lang.Thread
            org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable r1 = new org.libsdl.app.BufferedAudioRecorder$AudioRecorderRunnable
            r1.<init>(r3, r5)
            r0.<init>(r1)
            r0.start()
            return
        L_0x005f:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.BufferedAudioRecorder.startRecording(double, boolean):void");
    }

    public BufferedAudioRecorder(AudioRecorderInterfaceExt audioRecorderInterfaceExt, int i, int i2) {
        this.presenter = audioRecorderInterfaceExt;
        this.encodeSampleRate = i;
        this.encodeChannels = i2;
    }
}
