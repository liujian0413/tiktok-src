package org.webrtc;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid.CaptureFormat;
import org.webrtc.CameraVideoCapturer.CameraEventsHandler;

public interface CameraEnumerator {
    CameraVideoCapturer createCapturer(String str, CameraEventsHandler cameraEventsHandler);

    String[] getDeviceNames();

    List<CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
