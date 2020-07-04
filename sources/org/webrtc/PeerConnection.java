package org.webrtc;

import com.bytedance.webrtc.TrackInitParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.webrtc.DataChannel.Init;
import org.webrtc.MediaStreamTrack.MediaType;
import org.webrtc.RtpTransceiver.RtpTransceiverInit;

public class PeerConnection {
    private final List<MediaStream> localStreams;
    private final long nativePeerConnection;
    private List<RtpReceiver> receivers;
    private List<RtpSender> senders;
    private List<RtpTransceiver> transceivers;

    public enum AdapterType {
        UNKNOWN,
        ETHERNET,
        WIFI,
        CELLULAR,
        VPN,
        LOOPBACK
    }

    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        static IceConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        static IceGatheringState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public static class IceServer {
        public final String hostname;
        public final String password;
        public final List<String> tlsAlpnProtocols;
        public final TlsCertPolicy tlsCertPolicy;
        public final List<String> tlsEllipticCurves;
        public final String uri;
        public final List<String> urls;
        public final String username;

        public static class Builder {
            private String hostname;
            private String password;
            private List<String> tlsAlpnProtocols;
            private TlsCertPolicy tlsCertPolicy;
            private List<String> tlsEllipticCurves;
            private final List<String> urls;
            private String username;

            public IceServer createIceServer() {
                IceServer iceServer = new IceServer((String) this.urls.get(0), this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves);
                return iceServer;
            }

            public Builder setHostname(String str) {
                this.hostname = str;
                return this;
            }

            public Builder setPassword(String str) {
                this.password = str;
                return this;
            }

            public Builder setTlsAlpnProtocols(List<String> list) {
                this.tlsAlpnProtocols = list;
                return this;
            }

            public Builder setTlsCertPolicy(TlsCertPolicy tlsCertPolicy2) {
                this.tlsCertPolicy = tlsCertPolicy2;
                return this;
            }

            public Builder setTlsEllipticCurves(List<String> list) {
                this.tlsEllipticCurves = list;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }

            private Builder(List<String> list) {
                this.username = "";
                this.password = "";
                this.tlsCertPolicy = TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.hostname = "";
                if (list == null || list.isEmpty()) {
                    StringBuilder sb = new StringBuilder("urls == null || urls.isEmpty(): ");
                    sb.append(list);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.urls = list;
            }
        }

        /* access modifiers changed from: 0000 */
        public String getHostname() {
            return this.hostname;
        }

        /* access modifiers changed from: 0000 */
        public String getPassword() {
            return this.password;
        }

        /* access modifiers changed from: 0000 */
        public List<String> getTlsAlpnProtocols() {
            return this.tlsAlpnProtocols;
        }

        /* access modifiers changed from: 0000 */
        public TlsCertPolicy getTlsCertPolicy() {
            return this.tlsCertPolicy;
        }

        /* access modifiers changed from: 0000 */
        public List<String> getTlsEllipticCurves() {
            return this.tlsEllipticCurves;
        }

        /* access modifiers changed from: 0000 */
        public List<String> getUrls() {
            return this.urls;
        }

        /* access modifiers changed from: 0000 */
        public String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.uri, this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves});
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.urls);
            sb.append(" [");
            sb.append(this.username);
            sb.append(":");
            sb.append(this.password);
            sb.append("] [");
            sb.append(this.tlsCertPolicy);
            sb.append("] [");
            sb.append(this.hostname);
            sb.append("] [");
            sb.append(this.tlsAlpnProtocols);
            sb.append("] [");
            sb.append(this.tlsEllipticCurves);
            sb.append("]");
            return sb.toString();
        }

        public IceServer(String str) {
            this(str, "", "");
        }

        public static Builder builder(List<String> list) {
            return new Builder(list);
        }

        public static Builder builder(String str) {
            return new Builder(Collections.singletonList(str));
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IceServer)) {
                return false;
            }
            IceServer iceServer = (IceServer) obj;
            if (!this.uri.equals(iceServer.uri) || !this.urls.equals(iceServer.urls) || !this.username.equals(iceServer.username) || !this.password.equals(iceServer.password) || !this.tlsCertPolicy.equals(iceServer.tlsCertPolicy) || !this.hostname.equals(iceServer.hostname) || !this.tlsAlpnProtocols.equals(iceServer.tlsAlpnProtocols) || !this.tlsEllipticCurves.equals(iceServer.tlsEllipticCurves)) {
                return false;
            }
            return true;
        }

        public IceServer(String str, String str2, String str3) {
            this(str, str2, str3, TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy2) {
            this(str, str2, str3, tlsCertPolicy2, "");
        }

        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy2, String str4) {
            this(str, Collections.singletonList(str), str2, str3, tlsCertPolicy2, str4, null, null);
        }

        private IceServer(String str, List<String> list, String str2, String str3, TlsCertPolicy tlsCertPolicy2, String str4, List<String> list2, List<String> list3) {
            if (str == null || list == null || list.isEmpty()) {
                throw new IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
            }
            for (String str5 : list) {
                if (str5 == null) {
                    StringBuilder sb = new StringBuilder("urls element is null: ");
                    sb.append(list);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("username == null");
            } else if (str3 == null) {
                throw new IllegalArgumentException("password == null");
            } else if (str4 != null) {
                this.uri = str;
                this.urls = list;
                this.username = str2;
                this.password = str3;
                this.tlsCertPolicy = tlsCertPolicy2;
                this.hostname = str4;
                this.tlsAlpnProtocols = list2;
                this.tlsEllipticCurves = list3;
            } else {
                throw new IllegalArgumentException("hostname == null");
            }
        }
    }

    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    public static class IntervalRange {
        private final int max;
        private final int min;

        public int getMax() {
            return this.max;
        }

        public int getMin() {
            return this.min;
        }

        public IntervalRange(int i, int i2) {
            this.min = i;
            this.max = i2;
        }
    }

    public enum KeyType {
        RSA,
        ECDSA
    }

    public interface Observer {
        void onAddStream(MediaStream mediaStream);

        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        void onConnectionChange(PeerConnectionState peerConnectionState);

        void onDataChannel(DataChannel dataChannel);

        void onIceCandidate(IceCandidate iceCandidate);

        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        void onIceConnectionChange(IceConnectionState iceConnectionState);

        void onIceConnectionReceivingChange(boolean z);

        void onIceGatheringChange(IceGatheringState iceGatheringState);

        void onRemoveStream(MediaStream mediaStream);

        void onRenegotiationNeeded();

        void onSignalingChange(SignalingState signalingState);

        void onTrack(RtpTransceiver rtpTransceiver);
    }

    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        static PeerConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public static class RTCConfiguration {
        public boolean activeResetSrtpParams;
        public boolean audioJitterBufferFastAccelerate;
        public int audioJitterBufferMaxPackets;
        public BundlePolicy bundlePolicy = BundlePolicy.BALANCED;
        public CandidateNetworkPolicy candidateNetworkPolicy = CandidateNetworkPolicy.ALL;
        public RtcCertificatePem certificate;
        public Boolean combinedAudioVideoBwe;
        public String connectionId;
        public ContinualGatheringPolicy continualGatheringPolicy;
        public CryptoOptions cryptoOptions;
        public boolean disableIPv6OnWifi;
        public boolean disableIpv6;
        public boolean enableCpuOveruseDetection;
        public boolean enableDscp;
        public Boolean enableDtlsSrtp;
        public boolean enableRtpDataChannel;
        public int iceBackupCandidatePairPingInterval;
        public int iceCandidatePoolSize;
        public Integer iceCheckIntervalStrongConnectivityMs;
        public Integer iceCheckIntervalWeakConnectivityMs;
        public Integer iceCheckMinInterval;
        public int iceConnectionReceivingTimeout;
        public IntervalRange iceRegatherIntervalRange;
        public List<IceServer> iceServers;
        public IceTransportsType iceTransportsType = IceTransportsType.ALL;
        public Integer iceUnwritableMinChecks;
        public Integer iceUnwritableTimeMs;
        public KeyType keyType;
        public int maxIPv6Networks;
        public AdapterType networkPreference;
        public boolean presumeWritableWhenFullyRelayed;
        public boolean pruneTurnPorts;
        public RtcpMuxPolicy rtcpMuxPolicy = RtcpMuxPolicy.REQUIRE;
        public Integer screencastMinBitrate;
        public SdpSemantics sdpSemantics;
        public Integer stunCandidateKeepaliveIntervalMs;
        public boolean suspendBelowMinBitrate;
        public TcpCandidatePolicy tcpCandidatePolicy = TcpCandidatePolicy.ENABLED;
        public TurnCustomizer turnCustomizer;
        public boolean useMediaTransport;
        public boolean useMediaTransportForDataChannels;
        public String userId;

        /* access modifiers changed from: 0000 */
        public boolean getActiveResetSrtpParams() {
            return this.activeResetSrtpParams;
        }

        /* access modifiers changed from: 0000 */
        public boolean getAudioJitterBufferFastAccelerate() {
            return this.audioJitterBufferFastAccelerate;
        }

        /* access modifiers changed from: 0000 */
        public int getAudioJitterBufferMaxPackets() {
            return this.audioJitterBufferMaxPackets;
        }

        /* access modifiers changed from: 0000 */
        public BundlePolicy getBundlePolicy() {
            return this.bundlePolicy;
        }

        /* access modifiers changed from: 0000 */
        public CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.candidateNetworkPolicy;
        }

        /* access modifiers changed from: 0000 */
        public RtcCertificatePem getCertificate() {
            return this.certificate;
        }

        /* access modifiers changed from: 0000 */
        public Boolean getCombinedAudioVideoBwe() {
            return this.combinedAudioVideoBwe;
        }

        /* access modifiers changed from: 0000 */
        public String getConnectionId() {
            return this.connectionId;
        }

        /* access modifiers changed from: 0000 */
        public ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.continualGatheringPolicy;
        }

        /* access modifiers changed from: 0000 */
        public CryptoOptions getCryptoOptions() {
            return this.cryptoOptions;
        }

        /* access modifiers changed from: 0000 */
        public boolean getDisableIPv6OnWifi() {
            return this.disableIPv6OnWifi;
        }

        /* access modifiers changed from: 0000 */
        public boolean getDisableIpv6() {
            return this.disableIpv6;
        }

        /* access modifiers changed from: 0000 */
        public boolean getEnableCpuOveruseDetection() {
            return this.enableCpuOveruseDetection;
        }

        /* access modifiers changed from: 0000 */
        public boolean getEnableDscp() {
            return this.enableDscp;
        }

        /* access modifiers changed from: 0000 */
        public Boolean getEnableDtlsSrtp() {
            return this.enableDtlsSrtp;
        }

        /* access modifiers changed from: 0000 */
        public boolean getEnableRtpDataChannel() {
            return this.enableRtpDataChannel;
        }

        /* access modifiers changed from: 0000 */
        public int getIceBackupCandidatePairPingInterval() {
            return this.iceBackupCandidatePairPingInterval;
        }

        /* access modifiers changed from: 0000 */
        public int getIceCandidatePoolSize() {
            return this.iceCandidatePoolSize;
        }

        /* access modifiers changed from: 0000 */
        public Integer getIceCheckIntervalStrongConnectivity() {
            return this.iceCheckIntervalStrongConnectivityMs;
        }

        /* access modifiers changed from: 0000 */
        public Integer getIceCheckIntervalWeakConnectivity() {
            return this.iceCheckIntervalWeakConnectivityMs;
        }

        /* access modifiers changed from: 0000 */
        public Integer getIceCheckMinInterval() {
            return this.iceCheckMinInterval;
        }

        /* access modifiers changed from: 0000 */
        public int getIceConnectionReceivingTimeout() {
            return this.iceConnectionReceivingTimeout;
        }

        /* access modifiers changed from: 0000 */
        public IntervalRange getIceRegatherIntervalRange() {
            return this.iceRegatherIntervalRange;
        }

        /* access modifiers changed from: 0000 */
        public List<IceServer> getIceServers() {
            return this.iceServers;
        }

        /* access modifiers changed from: 0000 */
        public IceTransportsType getIceTransportsType() {
            return this.iceTransportsType;
        }

        /* access modifiers changed from: 0000 */
        public Integer getIceUnwritableMinChecks() {
            return this.iceUnwritableMinChecks;
        }

        /* access modifiers changed from: 0000 */
        public Integer getIceUnwritableTimeout() {
            return this.iceUnwritableTimeMs;
        }

        /* access modifiers changed from: 0000 */
        public KeyType getKeyType() {
            return this.keyType;
        }

        /* access modifiers changed from: 0000 */
        public int getMaxIPv6Networks() {
            return this.maxIPv6Networks;
        }

        /* access modifiers changed from: 0000 */
        public AdapterType getNetworkPreference() {
            return this.networkPreference;
        }

        /* access modifiers changed from: 0000 */
        public boolean getPresumeWritableWhenFullyRelayed() {
            return this.presumeWritableWhenFullyRelayed;
        }

        /* access modifiers changed from: 0000 */
        public boolean getPruneTurnPorts() {
            return this.pruneTurnPorts;
        }

        /* access modifiers changed from: 0000 */
        public RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.rtcpMuxPolicy;
        }

        /* access modifiers changed from: 0000 */
        public Integer getScreencastMinBitrate() {
            return this.screencastMinBitrate;
        }

        /* access modifiers changed from: 0000 */
        public SdpSemantics getSdpSemantics() {
            return this.sdpSemantics;
        }

        /* access modifiers changed from: 0000 */
        public Integer getStunCandidateKeepaliveInterval() {
            return this.stunCandidateKeepaliveIntervalMs;
        }

        /* access modifiers changed from: 0000 */
        public boolean getSuspendBelowMinBitrate() {
            return this.suspendBelowMinBitrate;
        }

        /* access modifiers changed from: 0000 */
        public TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.tcpCandidatePolicy;
        }

        /* access modifiers changed from: 0000 */
        public TurnCustomizer getTurnCustomizer() {
            return this.turnCustomizer;
        }

        /* access modifiers changed from: 0000 */
        public boolean getUseMediaTransport() {
            return this.useMediaTransport;
        }

        /* access modifiers changed from: 0000 */
        public boolean getUseMediaTransportForDataChannels() {
            return this.useMediaTransportForDataChannels;
        }

        /* access modifiers changed from: 0000 */
        public String getUserId() {
            return this.userId;
        }

        public RTCConfiguration(List<IceServer> list) {
            this.iceServers = list;
            this.audioJitterBufferMaxPackets = 50;
            this.iceConnectionReceivingTimeout = -1;
            this.iceBackupCandidatePairPingInterval = -1;
            this.keyType = KeyType.ECDSA;
            this.continualGatheringPolicy = ContinualGatheringPolicy.GATHER_ONCE;
            this.maxIPv6Networks = 5;
            this.enableCpuOveruseDetection = true;
            this.networkPreference = AdapterType.UNKNOWN;
            this.sdpSemantics = SdpSemantics.PLAN_B;
            this.connectionId = "";
            this.userId = "";
        }
    }

    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        static SignalingState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    private native boolean nativeAddIceCandidate(String str, int i, String str2);

    private native boolean nativeAddLocalStream(long j);

    private native RtpSender nativeAddTrack(long j, List<String> list);

    private native RtpSender nativeAddTrackWithParams(long j, long j2, List<String> list);

    private native RtpTransceiver nativeAddTransceiverOfType(MediaType mediaType, RtpTransceiverInit rtpTransceiverInit);

    private native RtpTransceiver nativeAddTransceiverWithTrack(long j, RtpTransceiverInit rtpTransceiverInit);

    private native void nativeClose();

    private native PeerConnectionState nativeConnectionState();

    private native void nativeCreateAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private native DataChannel nativeCreateDataChannel(String str, Init init);

    private native void nativeCreateOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private static native long nativeCreatePeerConnectionObserver(Observer observer);

    private native RtpSender nativeCreateSender(String str, String str2);

    private static native void nativeFreeOwnedPeerConnection(long j);

    private native RtcCertificatePem nativeGetCertificate();

    private native SessionDescription nativeGetLocalDescription();

    private native long nativeGetNativePeerConnection();

    private native List<RtpReceiver> nativeGetReceivers();

    private native SessionDescription nativeGetRemoteDescription();

    private native List<RtpSender> nativeGetSenders();

    private native List<RtpTransceiver> nativeGetTransceivers();

    private native IceConnectionState nativeIceConnectionState();

    private native IceGatheringState nativeIceGatheringState();

    private native void nativeNewGetStats(RTCStatsCollectorCallback rTCStatsCollectorCallback);

    private native boolean nativeOldGetStats(StatsObserver statsObserver, long j);

    private native boolean nativeRemoveIceCandidates(IceCandidate[] iceCandidateArr);

    private native void nativeRemoveLocalStream(long j);

    private native boolean nativeRemoveTrack(long j);

    private native void nativeSetAudioPlayout(boolean z);

    private native void nativeSetAudioRecording(boolean z);

    private native boolean nativeSetBitrate(Integer num, Integer num2, Integer num3);

    private native boolean nativeSetConfiguration(RTCConfiguration rTCConfiguration);

    private native void nativeSetLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native void nativeSetRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native SignalingState nativeSignalingState();

    private native boolean nativeStartRtcEventLog(int i, int i2);

    private native void nativeStopRtcEventLog();

    public void close() {
        nativeClose();
    }

    /* access modifiers changed from: 0000 */
    public long getNativeOwnedPeerConnection() {
        return this.nativePeerConnection;
    }

    public void stopRtcEventLog() {
        nativeStopRtcEventLog();
    }

    public PeerConnectionState connectionState() {
        return nativeConnectionState();
    }

    public RtcCertificatePem getCertificate() {
        return nativeGetCertificate();
    }

    public SessionDescription getLocalDescription() {
        return nativeGetLocalDescription();
    }

    public long getNativePeerConnection() {
        return nativeGetNativePeerConnection();
    }

    public SessionDescription getRemoteDescription() {
        return nativeGetRemoteDescription();
    }

    public IceConnectionState iceConnectionState() {
        return nativeIceConnectionState();
    }

    public IceGatheringState iceGatheringState() {
        return nativeIceGatheringState();
    }

    public SignalingState signalingState() {
        return nativeSignalingState();
    }

    public List<RtpReceiver> getReceivers() {
        for (RtpReceiver dispose : this.receivers) {
            dispose.dispose();
        }
        this.receivers = nativeGetReceivers();
        return Collections.unmodifiableList(this.receivers);
    }

    public List<RtpSender> getSenders() {
        for (RtpSender dispose : this.senders) {
            dispose.dispose();
        }
        this.senders = nativeGetSenders();
        return Collections.unmodifiableList(this.senders);
    }

    public List<RtpTransceiver> getTransceivers() {
        for (RtpTransceiver dispose : this.transceivers) {
            dispose.dispose();
        }
        this.transceivers = nativeGetTransceivers();
        return Collections.unmodifiableList(this.transceivers);
    }

    public void dispose() {
        close();
        for (MediaStream mediaStream : this.localStreams) {
            nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
            mediaStream.dispose();
        }
        this.localStreams.clear();
        for (RtpSender dispose : this.senders) {
            dispose.dispose();
        }
        this.senders.clear();
        for (RtpReceiver dispose2 : this.receivers) {
            dispose2.dispose();
        }
        for (RtpTransceiver dispose3 : this.transceivers) {
            dispose3.dispose();
        }
        this.transceivers.clear();
        this.receivers.clear();
        nativeFreeOwnedPeerConnection(this.nativePeerConnection);
    }

    public void getStats(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        nativeNewGetStats(rTCStatsCollectorCallback);
    }

    public void setAudioPlayout(boolean z) {
        nativeSetAudioPlayout(z);
    }

    public void setAudioRecording(boolean z) {
        nativeSetAudioRecording(z);
    }

    public PeerConnection(NativePeerConnectionFactory nativePeerConnectionFactory) {
        this(nativePeerConnectionFactory.createNativePeerConnection());
    }

    public static long createNativePeerConnectionObserver(Observer observer) {
        return nativeCreatePeerConnectionObserver(observer);
    }

    public boolean removeIceCandidates(IceCandidate[] iceCandidateArr) {
        return nativeRemoveIceCandidates(iceCandidateArr);
    }

    public boolean setConfiguration(RTCConfiguration rTCConfiguration) {
        return nativeSetConfiguration(rTCConfiguration);
    }

    public boolean addIceCandidate(IceCandidate iceCandidate) {
        return nativeAddIceCandidate(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp);
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack) {
        return addTrack(mediaStreamTrack, Collections.emptyList());
    }

    public RtpTransceiver addTransceiver(MediaType mediaType) {
        return addTransceiver(mediaType, new RtpTransceiverInit());
    }

    public void removeStream(MediaStream mediaStream) {
        nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
        this.localStreams.remove(mediaStream);
    }

    public boolean addStream(MediaStream mediaStream) {
        if (!nativeAddLocalStream(mediaStream.getNativeMediaStream())) {
            return false;
        }
        this.localStreams.add(mediaStream);
        return true;
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack) {
        return addTransceiver(mediaStreamTrack, new RtpTransceiverInit());
    }

    public boolean removeTrack(RtpSender rtpSender) {
        if (rtpSender != null) {
            return nativeRemoveTrack(rtpSender.getNativeRtpSender());
        }
        throw new NullPointerException("No RtpSender specified for removeTrack.");
    }

    PeerConnection(long j) {
        this.localStreams = new ArrayList();
        this.senders = new ArrayList();
        this.receivers = new ArrayList();
        this.transceivers = new ArrayList();
        this.nativePeerConnection = j;
    }

    public void createAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateAnswer(sdpObserver, mediaConstraints);
    }

    public void createOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateOffer(sdpObserver, mediaConstraints);
    }

    public void setLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetLocalDescription(sdpObserver, sessionDescription);
    }

    public void setRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetRemoteDescription(sdpObserver, sessionDescription);
    }

    public DataChannel createDataChannel(String str, Init init) {
        return nativeCreateDataChannel(str, init);
    }

    public boolean startRtcEventLog(int i, int i2) {
        return nativeStartRtcEventLog(i, i2);
    }

    public RtpSender createSender(String str, String str2) {
        RtpSender nativeCreateSender = nativeCreateSender(str, str2);
        if (nativeCreateSender != null) {
            this.senders.add(nativeCreateSender);
        }
        return nativeCreateSender;
    }

    public boolean getStats(StatsObserver statsObserver, MediaStreamTrack mediaStreamTrack) {
        long j;
        if (mediaStreamTrack == null) {
            j = 0;
        } else {
            j = mediaStreamTrack.getNativeMediaStreamTrack();
        }
        return nativeOldGetStats(statsObserver, j);
    }

    public RtpTransceiver addTransceiver(MediaType mediaType, RtpTransceiverInit rtpTransceiverInit) {
        if (mediaType != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiverInit();
            }
            RtpTransceiver nativeAddTransceiverOfType = nativeAddTransceiverOfType(mediaType, rtpTransceiverInit);
            if (nativeAddTransceiverOfType != null) {
                this.transceivers.add(nativeAddTransceiverOfType);
                return nativeAddTransceiverOfType;
            }
            throw new IllegalStateException("C++ addTransceiver failed.");
        }
        throw new NullPointerException("No MediaType specified for addTransceiver.");
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack, List<String> list) {
        if (mediaStreamTrack == null || list == null) {
            throw new NullPointerException("No MediaStreamTrack specified in addTrack.");
        }
        RtpSender nativeAddTrack = nativeAddTrack(mediaStreamTrack.getNativeMediaStreamTrack(), list);
        if (nativeAddTrack != null) {
            this.senders.add(nativeAddTrack);
            return nativeAddTrack;
        }
        throw new IllegalStateException("C++ addTrack failed.");
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack, RtpTransceiverInit rtpTransceiverInit) {
        if (mediaStreamTrack != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiverInit();
            }
            RtpTransceiver nativeAddTransceiverWithTrack = nativeAddTransceiverWithTrack(mediaStreamTrack.getNativeMediaStreamTrack(), rtpTransceiverInit);
            if (nativeAddTransceiverWithTrack != null) {
                this.transceivers.add(nativeAddTransceiverWithTrack);
                return nativeAddTransceiverWithTrack;
            }
            throw new IllegalStateException("C++ addTransceiver failed.");
        }
        throw new NullPointerException("No MediaStreamTrack specified for addTransceiver.");
    }

    public boolean setBitrate(Integer num, Integer num2, Integer num3) {
        return nativeSetBitrate(num, num2, num3);
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack, TrackInitParameters trackInitParameters, List<String> list) {
        if (mediaStreamTrack == null || trackInitParameters == null || list == null) {
            throw new NullPointerException("No MediaStreamTrack specified in addTrack.");
        }
        RtpSender nativeAddTrackWithParams = nativeAddTrackWithParams(mediaStreamTrack.getNativeMediaStreamTrack(), trackInitParameters.getNativeParameters(), list);
        if (nativeAddTrackWithParams != null) {
            this.senders.add(nativeAddTrackWithParams);
            return nativeAddTrackWithParams;
        }
        throw new IllegalStateException("C++ addTrack failed.");
    }
}
