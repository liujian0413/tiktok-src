package com.zego.p1851ve;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import java.nio.ByteBuffer;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.zego.ve.AudioDevice */
public class AudioDevice {
    protected int _NativeOutputSampleRate = 44100;
    protected OnAudioFocusChangeListener _audioFocusChangeListener = null;
    protected AudioManager _audioManager;
    protected int _audio_source = 7;
    protected ByteBuffer _capBuf = ByteBuffer.allocateDirect(1920);
    protected AudioRecord _capDev;
    protected int _capProfile;
    protected int _capSampleRate = 32000;
    protected int[] _capSampleRateTable = {32000, 16000, 8000};
    protected Context _context;
    protected int _deviceManufacturer;
    protected final int _frameSizeMs = 20;
    protected int _framesPerBuffer = 256;
    protected Handler _handler = new Handler(Looper.getMainLooper());
    protected boolean _isCalling = false;
    protected AtomicBoolean _isListening = new AtomicBoolean(false);
    protected int _mode = 3;
    protected PhoneStateListener _phoneStateListener = null;
    protected long _pthis;
    protected ByteBuffer _rndBuf = ByteBuffer.allocateDirect(3840);
    protected byte[] _rndBufArray = new byte[3840];
    protected AudioTrack _rndDev;
    protected int _rndSampleRate;
    protected Object _routingChangedListener;
    protected int _stream_type;

    public static native void onAudioFocusChange(long j, int i);

    public static native void onInterruptionBegin(long j);

    public static native void onInterruptionEnd(long j);

    public int GetDeviceManufacturer() {
        return this._deviceManufacturer;
    }

    public int GetOutputFramePerBuffer() {
        return this._framesPerBuffer;
    }

    public int GetPlayoutSampleRate() {
        return this._rndSampleRate;
    }

    public int GetRecordingSampleRate() {
        return this._capSampleRate;
    }

    public int InitRndDevMono() {
        return InitRndDev(4);
    }

    public int InitRndDevStereo() {
        return InitRndDev(12);
    }

    public int StopCapDev() {
        try {
            this._capDev.stop();
        } catch (Exception unused) {
        }
        return 0;
    }

    public int StopRndDev() {
        try {
            this._rndDev.stop();
        } catch (Exception unused) {
        }
        return 0;
    }

    private void initPhoneStateListener() {
        this._handler.post(new Runnable() {
            public void run() {
                AudioDevice.this._isCalling = false;
                AudioDevice.this._phoneStateListener = new PhoneStateListener() {
                    public void onCallStateChanged(int i, String str) {
                        super.onCallStateChanged(i, str);
                        if (AudioDevice.this._pthis != 0 && AudioDevice.this._isListening.get()) {
                            switch (i) {
                                case 0:
                                    if (AudioDevice.this._isCalling) {
                                        AudioDevice.this._isCalling = false;
                                        AudioDevice.onInterruptionEnd(AudioDevice.this._pthis);
                                        return;
                                    }
                                    break;
                                case 1:
                                    AudioDevice.this._isCalling = true;
                                    AudioDevice.onInterruptionBegin(AudioDevice.this._pthis);
                                    return;
                                case 2:
                                    AudioDevice.this._isCalling = true;
                                    AudioDevice.onInterruptionBegin(AudioDevice.this._pthis);
                                    break;
                            }
                        }
                    }
                };
                try {
                    ((TelephonyManager) AudioDevice.this._context.getSystemService("phone")).listen(AudioDevice.this._phoneStateListener, 32);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("initPhoneStateListener failed, ");
                    sb.append(th);
                    Log.m147739e("device", sb.toString());
                    AudioDevice.this._phoneStateListener = null;
                }
            }
        });
    }

    private boolean isSupportRoutingChangedListener() {
        if (VERSION.SDK_INT > 23) {
            return true;
        }
        return false;
    }

    private void uninitAudioFocusChangeListener() {
        try {
            if (this._audioFocusChangeListener != null) {
                this._audioManager.abandonAudioFocus(this._audioFocusChangeListener);
                this._audioFocusChangeListener = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void uninitPhoneStateListener() {
        this._handler.post(new Runnable() {
            public void run() {
                try {
                    if (AudioDevice.this._phoneStateListener != null) {
                        ((TelephonyManager) AudioDevice.this._context.getSystemService("phone")).listen(AudioDevice.this._phoneStateListener, 0);
                        AudioDevice.this._phoneStateListener = null;
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("uninitPhoneStateListener failed, ");
                    sb.append(th);
                    Log.m147739e("device", sb.toString());
                }
            }
        });
    }

    public int CheckPermission() {
        if (PermissionChecker.checkSelfPermission(this._context, "android.permission.RECORD_AUDIO")) {
            return 1;
        }
        return 0;
    }

    public int SetThreadUrgentPriority() {
        try {
            Process.setThreadPriority(-19);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public int StartRndDev() {
        if (this._rndDev == null) {
            return -1;
        }
        try {
            this._rndDev.play();
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public int StartCapDev() {
        if (this._capDev == null) {
            return -1;
        }
        try {
            this._capDev.startRecording();
            if (this._capDev.getRecordingState() != 3) {
                return -3;
            }
            return 0;
        } catch (Exception unused) {
            return -2;
        }
    }

    public int Uninit() {
        uninitAudioFocusChangeListener();
        uninitPhoneStateListener();
        if (this._audioManager != null) {
            try {
                this._audioManager.setMode(0);
            } catch (Exception unused) {
            }
        }
        this._isListening.set(false);
        this._pthis = 0;
        return 0;
    }

    public int UninitCapDev() {
        if (this._capDev != null) {
            try {
                if (isSupportRoutingChangedListener()) {
                    this._capDev.removeOnRoutingChangedListener((RoutingChangedListener) this._routingChangedListener);
                }
                this._capDev.release();
                this._capDev = null;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int UninitRndDev() {
        if (this._rndDev != null) {
            try {
                if (isSupportRoutingChangedListener()) {
                    this._rndDev.removeOnRoutingChangedListener((RoutingChangedListener) this._routingChangedListener);
                }
                this._rndDev.release();
                this._rndDev = null;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public int SupportHWKaraokeLowlatency() {
        if (VERSION.SDK_INT < 17) {
            return -1;
        }
        if (!"true".equals(this._audioManager.getProperty("android.media.property.SUPPORT_HWKARAOKE_EFFECT")) || !this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency")) {
            return -1;
        }
        return 0;
    }

    public int SupportVivoKaraokeLowlatency() {
        StringTokenizer stringTokenizer = new StringTokenizer(this._audioManager.getParameters("vivo_ktv_mic_type"), "=");
        if (stringTokenizer.countTokens() == 2 && stringTokenizer.nextToken().equals("vivo_ktv_mic_type")) {
            int parseInt = Integer.parseInt(stringTokenizer.nextToken());
            if ((parseInt == 1 || parseInt == 0) && VERSION.SDK_INT >= 27) {
                return 0;
            }
        }
        return -1;
    }

    public AudioDevice() {
        if (VERSION.SDK_INT >= 11) {
            this._mode = 3;
            this._audio_source = 7;
            this._stream_type = 0;
            return;
        }
        this._mode = 2;
        this._audio_source = 0;
        this._stream_type = 0;
    }

    private void initAudioFocusChangeListener() {
        String str;
        this._audioFocusChangeListener = new OnAudioFocusChangeListener() {
            public void onAudioFocusChange(int i) {
                if (AudioDevice.this._pthis != 0 && AudioDevice.this._isListening.get()) {
                    AudioDevice.onAudioFocusChange(AudioDevice.this._pthis, i);
                }
            }
        };
        try {
            int requestAudioFocus = this._audioManager.requestAudioFocus(this._audioFocusChangeListener, 0, 1);
            switch (requestAudioFocus) {
                case 0:
                    str = "FAILED";
                    break;
                case 1:
                    str = "GRANTED";
                    break;
                case 2:
                    str = "DELAYED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            StringBuilder sb = new StringBuilder("trace interruption request audio focus status: ");
            sb.append(requestAudioFocus);
            sb.append("(");
            sb.append(str);
            sb.append(")");
            Log.m147741i("device", sb.toString());
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("trace interruption request audio focus failed, ");
            sb2.append(th.getMessage());
            Log.m147739e("device", sb2.toString());
            this._audioManager.abandonAudioFocus(this._audioFocusChangeListener);
            this._audioFocusChangeListener = null;
        }
    }

    public int InitCapDev() {
        int i;
        if (this._capDev != null) {
            return 0;
        }
        int i2 = -1;
        if (this._capProfile != 0) {
            i = this._capProfile;
        } else if (this._audio_source == 7) {
            i = 1;
        } else {
            i = 0;
        }
        while (true) {
            if (i >= this._capSampleRateTable.length) {
                break;
            }
            this._capSampleRate = this._capSampleRateTable[i];
            int minBufferSize = AudioRecord.getMinBufferSize(this._capSampleRate, 16, 2);
            if (minBufferSize < this._capSampleRate) {
                minBufferSize = this._capSampleRate;
            }
            try {
                AudioRecord audioRecord = new AudioRecord(this._audio_source, this._capSampleRate, 16, 2, minBufferSize);
                this._capDev = audioRecord;
                if (this._capDev == null) {
                    i++;
                } else if (this._capDev.getState() == 1) {
                    if (isSupportRoutingChangedListener()) {
                        this._capDev.addOnRoutingChangedListener((RoutingChangedListener) this._routingChangedListener, null);
                    }
                    i2 = 0;
                } else {
                    Log.m147745w("device", "AudioRecord state is not AudioRecord.STATE_INITIALIZED\n");
                    this._capDev.release();
                    this._capDev = null;
                    i2 = 1;
                }
            } catch (Exception unused) {
            }
        }
        return i2;
    }

    public int SetAudioSource(int i) {
        this._audio_source = i;
        return 0;
    }

    public int SetCapProfile(int i) {
        this._capProfile = i;
        return 0;
    }

    public int SetStreamType(int i) {
        this._stream_type = i;
        return 0;
    }

    public int DoCap(int i) {
        try {
            return this._capDev.read(this._capBuf, i);
        } catch (Exception unused) {
            return -1;
        }
    }

    public int SetMode(int i) {
        this._mode = i;
        this._audioManager.setMode(this._mode);
        return 0;
    }

    public int DoRnd(int i) {
        try {
            this._rndBuf.rewind();
            int i2 = 0;
            this._rndBuf.get(this._rndBufArray, 0, this._rndBuf.capacity());
            if (this._rndDev != null) {
                i2 = this._rndDev.write(this._rndBufArray, 0, i);
            }
            return i2;
        } catch (Exception unused) {
            return -1;
        }
    }

    public int InitRndDev(int i) {
        if (this._rndDev != null) {
            return 0;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(this._rndSampleRate, i, 2) * 2;
        this._rndDev = createAudioTrack(minBufferSize, i);
        if (this._rndDev == null) {
            this._rndDev = createAudioTrack(minBufferSize, i);
        }
        if (this._rndDev == null) {
            return -1;
        }
        if (isSupportRoutingChangedListener()) {
            this._rndDev.addOnRoutingChangedListener((RoutingChangedListener) this._routingChangedListener, null);
        }
        return 0;
    }

    public int SetBluetoothScoOn(boolean z) {
        if (this._audioManager == null) {
            return 0;
        }
        if (z) {
            try {
                this._audioManager.startBluetoothSco();
                this._audioManager.setBluetoothScoOn(z);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("setBluetoothScoOn failed, ");
                sb.append(e.getMessage());
                Log.m147739e("device", sb.toString());
                return -1;
            }
        } else {
            this._audioManager.setBluetoothScoOn(z);
            this._audioManager.stopBluetoothSco();
        }
        return 0;
    }

    public int SetSpeakerphoneOn(int i) {
        boolean z;
        try {
            AudioManager audioManager = this._audioManager;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            audioManager.setSpeakerphoneOn(z);
            return 0;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("setSpeakerphoneOn failed, ");
            sb.append(e.getMessage());
            Log.m147739e("device", sb.toString());
            return -1;
        }
    }

    public int SetCaptureDevId(int i) {
        int i2;
        if (VERSION.SDK_INT < 23) {
            return 100;
        }
        int i3 = 1;
        AudioDeviceInfo[] devices = this._audioManager.getDevices(1);
        int i4 = 0;
        while (true) {
            if (i4 >= devices.length) {
                i4 = -1;
                break;
            } else if (i == devices[i4].getId()) {
                break;
            } else {
                i4++;
            }
        }
        if (-1 != i4) {
            i2 = devices[i4].getType();
            if (i2 != 7) {
                this._capDev.stop();
                this._capDev.setPreferredDevice(devices[i4]);
                this._capDev.startRecording();
            } else if (this._audioManager.isBluetoothScoOn()) {
                this._capDev.stop();
                this._capDev.setPreferredDevice(devices[i4]);
                this._capDev.startRecording();
            } else {
                i3 = 2;
            }
            i3 = 0;
        } else {
            this._capDev.stop();
            this._capDev.setPreferredDevice(null);
            this._capDev.startRecording();
            i2 = 0;
        }
        return (i2 << 16) | i3;
    }

    public int Init(long j) {
        if (this._context == null) {
            return -1;
        }
        this._pthis = j;
        try {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
            if (VERSION.SDK_INT >= 17) {
                String property = this._audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
                if (property != null) {
                    this._NativeOutputSampleRate = Integer.parseInt(property);
                }
                String property2 = this._audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
                if (property2 != null) {
                    this._framesPerBuffer = Integer.parseInt(property2);
                }
            }
            this._capSampleRate = 32000;
            this._rndSampleRate = this._NativeOutputSampleRate;
            String str = Build.MANUFACTURER;
            if ("HUAWEI".equals(str)) {
                this._deviceManufacturer = 1;
            } else if (str.trim().contains("vivo")) {
                this._deviceManufacturer = 2;
            } else if (str.trim().contains("OPPO")) {
                this._deviceManufacturer = 3;
            } else if (str.equals("Xiaomi") && Build.MODEL.equals("Redmi Note 5")) {
                this._deviceManufacturer = -1;
            }
            if (isSupportRoutingChangedListener()) {
                this._routingChangedListener = new RoutingChangedListener();
            }
            this._isListening.set(true);
            initPhoneStateListener();
            initAudioFocusChangeListener();
            return 0;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("getSystemService failed, ");
            sb.append(e.getMessage());
            Log.m147739e("device", sb.toString());
            return -1;
        }
    }

    public int SetRenderDevId(int i) {
        int i2;
        if (VERSION.SDK_INT < 23) {
            return 100;
        }
        int i3 = 2;
        AudioDeviceInfo[] devices = this._audioManager.getDevices(2);
        int i4 = 0;
        while (true) {
            if (i4 >= devices.length) {
                i4 = -1;
                break;
            } else if (i == devices[i4].getId()) {
                break;
            } else {
                i4++;
            }
        }
        if (-1 != i4) {
            i2 = devices[i4].getType();
            if (i2 == 7) {
                if (this._audioManager.isBluetoothScoOn()) {
                    this._rndDev.stop();
                    this._rndDev.setPreferredDevice(devices[i4]);
                    this._rndDev.play();
                }
            } else if (i2 != 8) {
                this._rndDev.stop();
                this._rndDev.setPreferredDevice(devices[i4]);
                this._rndDev.play();
            } else if (!this._audioManager.isBluetoothScoOn()) {
                this._rndDev.stop();
                this._rndDev.setPreferredDevice(devices[i4]);
                this._rndDev.play();
            } else {
                i3 = 3;
            }
            i3 = 0;
        } else {
            this._rndDev.stop();
            this._rndDev.setPreferredDevice(null);
            this._rndDev.play();
            i3 = 1;
            i2 = 0;
        }
        return (i2 << 16) | i3;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.AudioTrack createAudioTrack(int r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            android.media.AudioTrack r8 = new android.media.AudioTrack     // Catch:{ Exception -> 0x001b }
            int r2 = r9._stream_type     // Catch:{ Exception -> 0x001b }
            int r3 = r9._rndSampleRate     // Catch:{ Exception -> 0x001b }
            r5 = 2
            r7 = 1
            r1 = r8
            r4 = r11
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x001b }
            int r10 = r8.getState()     // Catch:{ Exception -> 0x001c }
            r11 = 1
            if (r10 != r11) goto L_0x0017
            goto L_0x0022
        L_0x0017:
            r8.release()     // Catch:{ Exception -> 0x001c }
            goto L_0x0023
        L_0x001b:
            r8 = r0
        L_0x001c:
            if (r8 == 0) goto L_0x0022
            r8.release()
            goto L_0x0023
        L_0x0022:
            r0 = r8
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.p1851ve.AudioDevice.createAudioTrack(int, int):android.media.AudioTrack");
    }
}
