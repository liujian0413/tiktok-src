package org.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Arrays;
import org.webrtc.Logging;

final class WebRtcAudioUtils {
    WebRtcAudioUtils() {
    }

    private static String deviceTypeToString(int i) {
        switch (i) {
            case 0:
                return "TYPE_UNKNOWN";
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    static String modeToString(int i) {
        switch (i) {
            case 0:
                return "MODE_NORMAL";
            case 1:
                return "MODE_RINGTONE";
            case 2:
                return "MODE_IN_CALL";
            case 3:
                return "MODE_IN_COMMUNICATION";
            default:
                return "MODE_INVALID";
        }
    }

    private static String streamTypeToString(int i) {
        switch (i) {
            case 0:
                return "STREAM_VOICE_CALL";
            case 1:
                return "STREAM_SYSTEM";
            case 2:
                return "STREAM_RING";
            case 3:
                return "STREAM_MUSIC";
            case 4:
                return "STREAM_ALARM";
            case 5:
                return "STREAM_NOTIFICATION";
            default:
                return "STREAM_INVALID";
        }
    }

    public static boolean runningOnEmulator() {
        if (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic_")) {
            return false;
        }
        return true;
    }

    public static String getThreadInfo() {
        StringBuilder sb = new StringBuilder("@[name=");
        sb.append(Thread.currentThread().getName());
        sb.append(", id=");
        sb.append(Thread.currentThread().getId());
        sb.append("]");
        return sb.toString();
    }

    private static boolean hasMicrophone(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        return audioManager.isVolumeFixed();
    }

    static void logDeviceInfo(String str) {
        StringBuilder sb = new StringBuilder("Android SDK: ");
        sb.append(VERSION.SDK_INT);
        sb.append(", Release: ");
        sb.append(VERSION.RELEASE);
        sb.append(", Brand: ");
        sb.append(Build.BRAND);
        sb.append(", Device: ");
        sb.append(Build.DEVICE);
        sb.append(", Id: ");
        sb.append(Build.ID);
        sb.append(", Hardware: ");
        sb.append(Build.HARDWARE);
        sb.append(", Manufacturer: ");
        sb.append(Build.MANUFACTURER);
        sb.append(", Model: ");
        sb.append(Build.MODEL);
        sb.append(", Product: ");
        sb.append(Build.PRODUCT);
        Logging.m150047d(str, sb.toString());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.m150047d(str, "Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        StringBuilder sb = new StringBuilder("  fixed volume=");
        sb.append(isVolumeFixed);
        Logging.m150047d(str, sb.toString());
        if (!isVolumeFixed) {
            for (int i = 0; i < 6; i++) {
                int i2 = iArr[i];
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder("  ");
                sb3.append(streamTypeToString(i2));
                sb3.append(": ");
                sb2.append(sb3.toString());
                sb2.append("volume=");
                sb2.append(audioManager.getStreamVolume(i2));
                sb2.append(", max=");
                sb2.append(audioManager.getStreamMaxVolume(i2));
                logIsStreamMute(str, audioManager, i2, sb2);
                Logging.m150047d(str, sb2.toString());
            }
        }
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        String str2;
        if (VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            if (devices.length != 0) {
                Logging.m150047d(str, "Audio Devices: ");
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  ");
                    sb.append(deviceTypeToString(audioDeviceInfo.getType()));
                    if (audioDeviceInfo.isSource()) {
                        str2 = "(in): ";
                    } else {
                        str2 = "(out): ";
                    }
                    sb.append(str2);
                    if (audioDeviceInfo.getChannelCounts().length > 0) {
                        sb.append("channels=");
                        sb.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                        sb.append(", ");
                    }
                    if (audioDeviceInfo.getEncodings().length > 0) {
                        sb.append("encodings=");
                        sb.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                        sb.append(", ");
                    }
                    if (audioDeviceInfo.getSampleRates().length > 0) {
                        sb.append("sample rates=");
                        sb.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                        sb.append(", ");
                    }
                    sb.append("id=");
                    sb.append(audioDeviceInfo.getId());
                    Logging.m150047d(str, sb.toString());
                }
            }
        }
    }

    static void logAudioState(String str, Context context, AudioManager audioManager) {
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        StringBuilder sb = new StringBuilder("Audio State: audio mode: ");
        sb.append(modeToString(audioManager.getMode()));
        sb.append(", has mic: ");
        sb.append(hasMicrophone(context));
        sb.append(", mic muted: ");
        sb.append(audioManager.isMicrophoneMute());
        sb.append(", music active: ");
        sb.append(audioManager.isMusicActive());
        sb.append(", speakerphone: ");
        sb.append(audioManager.isSpeakerphoneOn());
        sb.append(", BT SCO: ");
        sb.append(audioManager.isBluetoothScoOn());
        Logging.m150047d(str, sb.toString());
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        if (VERSION.SDK_INT >= 23) {
            sb.append(", muted=");
            sb.append(audioManager.isStreamMute(i));
        }
    }
}
