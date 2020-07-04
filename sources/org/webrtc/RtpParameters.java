package org.webrtc;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack.MediaType;

public class RtpParameters {
    public final List<Codec> codecs;
    public final List<Encoding> encodings;
    private final List<HeaderExtension> headerExtensions;
    private final Rtcp rtcp;
    public final String transactionId;

    public static class Codec {
        public Integer clockRate;
        MediaType kind;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int payloadType;

        /* access modifiers changed from: 0000 */
        public Integer getClockRate() {
            return this.clockRate;
        }

        /* access modifiers changed from: 0000 */
        public MediaType getKind() {
            return this.kind;
        }

        /* access modifiers changed from: 0000 */
        public String getName() {
            return this.name;
        }

        /* access modifiers changed from: 0000 */
        public Integer getNumChannels() {
            return this.numChannels;
        }

        /* access modifiers changed from: 0000 */
        public Map getParameters() {
            return this.parameters;
        }

        /* access modifiers changed from: 0000 */
        public int getPayloadType() {
            return this.payloadType;
        }

        Codec(int i, String str, MediaType mediaType, Integer num, Integer num2, Map<String, String> map) {
            this.payloadType = i;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
        }
    }

    public static class Encoding {
        public boolean active = true;
        public Integer maxBitrateBps;
        public Integer maxFramerate;
        public Integer minBitrateBps;
        public Integer numTemporalLayers;
        public Long ssrc;

        /* access modifiers changed from: 0000 */
        public boolean getActive() {
            return this.active;
        }

        /* access modifiers changed from: 0000 */
        public Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        /* access modifiers changed from: 0000 */
        public Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        /* access modifiers changed from: 0000 */
        public Integer getMinBitrateBps() {
            return this.minBitrateBps;
        }

        /* access modifiers changed from: 0000 */
        public Integer getNumTemporalLayers() {
            return this.numTemporalLayers;
        }

        /* access modifiers changed from: 0000 */
        public Long getSsrc() {
            return this.ssrc;
        }

        Encoding(boolean z, Integer num, Integer num2, Integer num3, Integer num4, Long l) {
            this.active = z;
            this.maxBitrateBps = num;
            this.minBitrateBps = num2;
            this.maxFramerate = num3;
            this.numTemporalLayers = num4;
            this.ssrc = l;
        }
    }

    public static class HeaderExtension {
        private final boolean encrypted;

        /* renamed from: id */
        private final int f123510id;
        private final String uri;

        public boolean getEncrypted() {
            return this.encrypted;
        }

        public int getId() {
            return this.f123510id;
        }

        public String getUri() {
            return this.uri;
        }

        HeaderExtension(String str, int i, boolean z) {
            this.uri = str;
            this.f123510id = i;
            this.encrypted = z;
        }
    }

    public static class Rtcp {
        private final String cname;
        private final boolean reducedSize;

        public String getCname() {
            return this.cname;
        }

        public boolean getReducedSize() {
            return this.reducedSize;
        }

        Rtcp(String str, boolean z) {
            this.cname = str;
            this.reducedSize = z;
        }
    }

    /* access modifiers changed from: 0000 */
    public List<Codec> getCodecs() {
        return this.codecs;
    }

    /* access modifiers changed from: 0000 */
    public List<Encoding> getEncodings() {
        return this.encodings;
    }

    public List<HeaderExtension> getHeaderExtensions() {
        return this.headerExtensions;
    }

    public Rtcp getRtcp() {
        return this.rtcp;
    }

    /* access modifiers changed from: 0000 */
    public String getTransactionId() {
        return this.transactionId;
    }

    RtpParameters(String str, Rtcp rtcp2, List<HeaderExtension> list, List<Encoding> list2, List<Codec> list3) {
        this.transactionId = str;
        this.rtcp = rtcp2;
        this.headerExtensions = list;
        this.encodings = list2;
        this.codecs = list3;
    }
}
