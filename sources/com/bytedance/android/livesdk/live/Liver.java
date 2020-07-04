package com.bytedance.android.livesdk.live;

public abstract class Liver {

    public enum LTYPE {
        VIEWER(0),
        KSYBROADCASTER(1),
        AIVSPBROADCAST(2),
        LIVEBROADCAST(3);
        
        public int value;

        private LTYPE(int i) {
            this.value = i;
        }
    }

    public enum LiveMessage {
        LIVER_UPDATE_QOS_INFO,
        BROADCAST_START_FAILED,
        BROADCAST_START_SUCCESS,
        BROADCAST_ENCODE_FRAME_THRESHOLD,
        BROADCAST_AUTH_FAILED,
        BROADCAST_ENCODE_FAILED,
        BROADCAST_NETWORK_NOT_GOOD,
        BROADCAST_NETWORK_NO_WORK,
        BROADCAST_OPEN_URL_FIAL,
        BROADCAST_PUSH_STREAM_TIMEOUT,
        BROADCAST_OPEN_CAMWRA_FAIL,
        BROADCAST_OPEN_CODEC_FAIL,
        BROADCAST_UNKNOW_ERROR,
        BROADCAST_INIT_DONE,
        BROADCAST_LOG_TIME,
        PLAYER_VIDEO_SIZE_CHANGE,
        PLAYER_PREPARED_PLAY,
        PLAYER_COMPLETE_PLAY,
        PLAYER_SEEK_COMPLETE,
        PLAYER_MEDIA_ERROR,
        PLAYER_MEDIA_INFO,
        PLAYER_MEDIA_UPDATE_BUFFER_ROGRESS,
        PLAYER_MEDIA_DEFAULT_ERROR,
        PLAYER_DISPLAYED_PLAY,
        BROADCAST_LOG_STATE_CHANGED,
        PLAYER_MEDIA_CAN_HORIZONTAL,
        BROADCAST_PUSH_STREAM_RATIO_CHANGED,
        BROADCAST_PUSH_STREAM_ENCODE_FAILED;

        public static LiveMessage valueOf(int i) {
            if (i < 0 || i >= values().length) {
                return values()[12];
            }
            return values()[i];
        }
    }

    public enum Operation {
        SetBroadcastSwitchCamera,
        SetBroadcastSwitchFlash,
        SetBroadcastFrameRote,
        SetBroadcastBaseVideoBitrate,
        SetBroadcastMinVideoBitrate,
        SetBroadcastMaxVideoBitrate,
        SetBroadcastAudioBitrate,
        SetBroadcastLandscape,
        SetBroadcastVideoResolution,
        SetPlayerBufferTimeMax,
        SetPlayerPlayingOnBackground,
        SetPlayerVolume,
        GetPlayerVideoSize,
        GetBRoadcastKeyIsFrontCamera,
        SetBitrateDebug
    }

    public enum StateChangedMessage {
        OPEN_LIVER_SUCESS,
        CREATE_MEDIA_CODEC_FAIL,
        OPEN_UIRL_FAIL,
        SEND_BUFFER_ERROR,
        OPEN_CODER_ERROR,
        CHANGE_VIDEO_SIZE,
        CONNECTION_ERROR,
        CHANGE_VIDEO_RATE,
        CHANGE_VIDEO_BITRATE,
        COMPLETE_LIVER_ERROR,
        SDK_UNKNOWN_ERROR;

        public static StateChangedMessage valueOf(int i) {
            if (i >= 0 && i < values().length) {
                return values()[i];
            }
            return values()[values().length - 1];
        }
    }
}
