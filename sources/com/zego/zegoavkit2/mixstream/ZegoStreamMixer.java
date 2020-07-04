package com.zego.zegoavkit2.mixstream;

public class ZegoStreamMixer {
    public void setCallback(IZegoMixStreamCallback iZegoMixStreamCallback) {
        ZegoMixStreamJNI.setCallback(iZegoMixStreamCallback);
    }

    public void setMixStreamExCallback(IZegoMixStreamExCallback iZegoMixStreamExCallback) {
        ZegoMixStreamJNI.setMixStreamExCallback(iZegoMixStreamExCallback);
    }

    public void setRelayCDNStateCallback(IZegoMixStreamRelayCDNCallback iZegoMixStreamRelayCDNCallback) {
        ZegoMixStreamJNI.setRelayCDNCallback(iZegoMixStreamRelayCDNCallback);
    }

    public void setSoundLevelInMixStreamCallback(IZegoSoundLevelInMixStreamCallback iZegoSoundLevelInMixStreamCallback) {
        ZegoMixStreamJNI.setSoundLevelInMixStreamCallback(iZegoSoundLevelInMixStreamCallback);
    }

    public boolean mixStream(ZegoCompleteMixStreamInfo zegoCompleteMixStreamInfo, int i) {
        return ZegoMixStreamJNI.mixStream(zegoCompleteMixStreamInfo, i);
    }

    public int mixStreamEx(ZegoMixStreamConfig zegoMixStreamConfig, String str) {
        if (str.length() == 0) {
            return -1;
        }
        if (zegoMixStreamConfig.inputStreamList != null && zegoMixStreamConfig.inputStreamList.length > 0) {
            for (ZegoMixStreamInfo zegoMixStreamInfo : zegoMixStreamConfig.inputStreamList) {
                if (zegoMixStreamInfo == null || zegoMixStreamInfo.streamID == null || zegoMixStreamInfo.streamID.length() <= 0 || zegoMixStreamInfo.streamID.length() > 512) {
                    return -1;
                }
            }
        }
        if (zegoMixStreamConfig.outputList != null && zegoMixStreamConfig.outputList.length > 0) {
            for (ZegoMixStreamOutput zegoMixStreamOutput : zegoMixStreamConfig.outputList) {
                if (zegoMixStreamOutput == null || zegoMixStreamOutput.target == null || zegoMixStreamOutput.target.length() <= 0 || zegoMixStreamOutput.target.length() > 512) {
                    return -1;
                }
            }
        }
        if (zegoMixStreamConfig.outputRateControlMode != 1 || (zegoMixStreamConfig.outputQuality > 0 && zegoMixStreamConfig.outputQuality <= 51)) {
            return ZegoMixStreamJNI.mixStreamEx(zegoMixStreamConfig, str);
        }
        return -1;
    }
}
