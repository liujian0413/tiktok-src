package com.zego.zegoavkit2.mixstream;

import android.os.Handler;
import android.os.Looper;
import com.zego.zegoavkit2.entities.ZegoStreamRelayCDNInfo;
import java.util.ArrayList;
import java.util.HashMap;

public final class ZegoMixStreamJNI {
    public static IZegoMixStreamCallback mCallback;
    public static IZegoMixStreamExCallback mExCallback;
    public static IZegoMixStreamRelayCDNCallback mRelayCDNCallback;
    private static IZegoSoundLevelInMixStreamCallback mSoundLevelCallback;

    public static native boolean mixStream(ZegoCompleteMixStreamInfo zegoCompleteMixStreamInfo, int i);

    public static native int mixStreamEx(ZegoMixStreamConfig zegoMixStreamConfig, String str);

    private static native void setMixStreamCallback(boolean z);

    private static native void setMixStreamExCallback(boolean z);

    private static native void setSoundLevelInMixStreamCallback(boolean z);

    public static void setRelayCDNCallback(IZegoMixStreamRelayCDNCallback iZegoMixStreamRelayCDNCallback) {
        mRelayCDNCallback = iZegoMixStreamRelayCDNCallback;
    }

    public static void onSoundLevelInMixStreamCallback(ArrayList<ZegoSoundLevelInMixStreamInfo> arrayList) {
        if (mSoundLevelCallback != null) {
            mSoundLevelCallback.onSoundLevelInMixStream(arrayList);
        }
    }

    public static void setCallback(IZegoMixStreamCallback iZegoMixStreamCallback) {
        boolean z;
        mCallback = iZegoMixStreamCallback;
        if (iZegoMixStreamCallback == null) {
            z = false;
        } else {
            z = true;
        }
        setMixStreamCallback(z);
    }

    public static void setMixStreamExCallback(IZegoMixStreamExCallback iZegoMixStreamExCallback) {
        boolean z;
        mExCallback = iZegoMixStreamExCallback;
        if (iZegoMixStreamExCallback == null) {
            z = false;
        } else {
            z = true;
        }
        setMixStreamExCallback(z);
    }

    public static void setSoundLevelInMixStreamCallback(IZegoSoundLevelInMixStreamCallback iZegoSoundLevelInMixStreamCallback) {
        boolean z;
        mSoundLevelCallback = iZegoSoundLevelInMixStreamCallback;
        if (iZegoSoundLevelInMixStreamCallback == null) {
            z = false;
        } else {
            z = true;
        }
        setSoundLevelInMixStreamCallback(z);
    }

    public static void onMixStreamRelayCDNStateUpdate(final ZegoStreamRelayCDNInfo[] zegoStreamRelayCDNInfoArr, final String str) {
        if (mRelayCDNCallback != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    if (ZegoMixStreamJNI.mRelayCDNCallback != null) {
                        ZegoMixStreamJNI.mRelayCDNCallback.onMixStreamRelayCDNStateUpdate(zegoStreamRelayCDNInfoArr, str);
                    }
                }
            });
        }
    }

    public static void onMixStreamConfigUpdate(final int i, final String str, final HashMap<String, Object> hashMap) {
        if (mCallback != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    if (ZegoMixStreamJNI.mCallback != null) {
                        ZegoMixStreamJNI.mCallback.onMixStreamConfigUpdate(i, str, hashMap);
                    }
                }
            });
        }
    }

    public static void onMixStreamExConfigUpdate(final int i, final String str, final ZegoMixStreamResultEx zegoMixStreamResultEx) {
        if (mExCallback != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    if (ZegoMixStreamJNI.mExCallback != null) {
                        ZegoMixStreamJNI.mExCallback.onMixStreamExConfigUpdate(i, str, zegoMixStreamResultEx);
                    }
                }
            });
        }
    }
}
