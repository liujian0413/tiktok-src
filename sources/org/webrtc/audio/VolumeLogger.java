package org.webrtc.audio;

import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

class VolumeLogger {
    public final AudioManager audioManager;
    private Timer timer;

    class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                StringBuilder sb = new StringBuilder("STREAM_RING stream volume: ");
                sb.append(VolumeLogger.this.audioManager.getStreamVolume(2));
                sb.append(" (max=");
                sb.append(this.maxRingVolume);
                sb.append(")");
                Logging.m150047d("VolumeLogger", sb.toString());
                return;
            }
            if (mode == 3) {
                StringBuilder sb2 = new StringBuilder("VOICE_CALL stream volume: ");
                sb2.append(VolumeLogger.this.audioManager.getStreamVolume(0));
                sb2.append(" (max=");
                sb2.append(this.maxVoiceCallVolume);
                sb2.append(")");
                Logging.m150047d("VolumeLogger", sb2.toString());
            }
        }

        LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }
    }

    public void stop() {
        StringBuilder sb = new StringBuilder("stop");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m150047d("VolumeLogger", sb.toString());
        if (this.timer != null) {
            this.timer.cancel();
            this.timer = null;
        }
    }

    public void start() {
        StringBuilder sb = new StringBuilder("start");
        sb.append(WebRtcAudioUtils.getThreadInfo());
        Logging.m150047d("VolumeLogger", sb.toString());
        if (this.timer == null) {
            StringBuilder sb2 = new StringBuilder("audio mode is: ");
            sb2.append(WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            Logging.m150047d("VolumeLogger", sb2.toString());
            this.timer = new Timer("WebRtcVolumeLevelLoggerThread");
            this.timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }
    }

    public VolumeLogger(AudioManager audioManager2) {
        this.audioManager = audioManager2;
    }
}
