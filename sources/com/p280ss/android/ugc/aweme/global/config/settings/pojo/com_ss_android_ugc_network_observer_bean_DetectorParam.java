package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_network_observer_bean_DetectorParam */
public final class com_ss_android_ugc_network_observer_bean_DetectorParam extends Message<com_ss_android_ugc_network_observer_bean_DetectorParam, Builder> {
    public static final DefaultValueProtoAdapter<com_ss_android_ugc_network_observer_bean_DetectorParam> ADAPTER = new C30216x91bb22e9();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 150858468)
    public final Integer black_timeout;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 102678453)
    public final Integer dns_timeout;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 111624426)
    public final Integer frequency_limit;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 215737240)
    public final Integer ping_timeout;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 33044104)
    public final Integer start_timeout;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 205763963)
    public final List<String> target_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 204948227)
    public final Integer tcp_timeout;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_network_observer_bean_DetectorParam$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<com_ss_android_ugc_network_observer_bean_DetectorParam, Builder> {
        public Integer black_timeout;
        public Integer dns_timeout;
        public Integer frequency_limit;
        public Integer ping_timeout;
        public Integer start_timeout;
        public List<String> target_list = Internal.newMutableList();
        public Integer tcp_timeout;

        public final com_ss_android_ugc_network_observer_bean_DetectorParam build() {
            com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam = new com_ss_android_ugc_network_observer_bean_DetectorParam(this.start_timeout, this.dns_timeout, this.ping_timeout, this.tcp_timeout, this.black_timeout, this.frequency_limit, this.target_list, super.buildUnknownFields());
            return com_ss_android_ugc_network_observer_bean_detectorparam;
        }

        public final Builder black_timeout(Integer num) {
            this.black_timeout = num;
            return this;
        }

        public final Builder dns_timeout(Integer num) {
            this.dns_timeout = num;
            return this;
        }

        public final Builder frequency_limit(Integer num) {
            this.frequency_limit = num;
            return this;
        }

        public final Builder ping_timeout(Integer num) {
            this.ping_timeout = num;
            return this;
        }

        public final Builder start_timeout(Integer num) {
            this.start_timeout = num;
            return this;
        }

        public final Builder tcp_timeout(Integer num) {
            this.tcp_timeout = num;
            return this;
        }

        public final Builder target_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.target_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_network_observer_bean_DetectorParam$ProtoAdapter_com_ss_android_ugc_network_observer_bean_DetectorParam */
    static final class C30216x91bb22e9 extends DefaultValueProtoAdapter<com_ss_android_ugc_network_observer_bean_DetectorParam> {
        public final com_ss_android_ugc_network_observer_bean_DetectorParam redact(com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam) {
            return com_ss_android_ugc_network_observer_bean_detectorparam;
        }

        public C30216x91bb22e9() {
            super(FieldEncoding.LENGTH_DELIMITED, com_ss_android_ugc_network_observer_bean_DetectorParam.class);
        }

        public final com_ss_android_ugc_network_observer_bean_DetectorParam decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (com_ss_android_ugc_network_observer_bean_DetectorParam) null);
        }

        public final int encodedSize(com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam) {
            return ProtoAdapter.INT32.encodedSizeWithTag(33044104, com_ss_android_ugc_network_observer_bean_detectorparam.start_timeout) + ProtoAdapter.INT32.encodedSizeWithTag(102678453, com_ss_android_ugc_network_observer_bean_detectorparam.dns_timeout) + ProtoAdapter.INT32.encodedSizeWithTag(215737240, com_ss_android_ugc_network_observer_bean_detectorparam.ping_timeout) + ProtoAdapter.INT32.encodedSizeWithTag(204948227, com_ss_android_ugc_network_observer_bean_detectorparam.tcp_timeout) + ProtoAdapter.INT32.encodedSizeWithTag(150858468, com_ss_android_ugc_network_observer_bean_detectorparam.black_timeout) + ProtoAdapter.INT32.encodedSizeWithTag(111624426, com_ss_android_ugc_network_observer_bean_detectorparam.frequency_limit) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(205763963, com_ss_android_ugc_network_observer_bean_detectorparam.target_list) + com_ss_android_ugc_network_observer_bean_detectorparam.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 33044104, com_ss_android_ugc_network_observer_bean_detectorparam.start_timeout);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 102678453, com_ss_android_ugc_network_observer_bean_detectorparam.dns_timeout);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 215737240, com_ss_android_ugc_network_observer_bean_detectorparam.ping_timeout);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 204948227, com_ss_android_ugc_network_observer_bean_detectorparam.tcp_timeout);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 150858468, com_ss_android_ugc_network_observer_bean_detectorparam.black_timeout);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 111624426, com_ss_android_ugc_network_observer_bean_detectorparam.frequency_limit);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 205763963, com_ss_android_ugc_network_observer_bean_detectorparam.target_list);
            protoWriter.writeBytes(com_ss_android_ugc_network_observer_bean_detectorparam.unknownFields());
        }

        public final com_ss_android_ugc_network_observer_bean_DetectorParam decode(ProtoReader protoReader, com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam) throws IOException {
            Builder builder;
            com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam2 = (com_ss_android_ugc_network_observer_bean_DetectorParam) C10938a.m32097a().mo26425a(com_ss_android_ugc_network_observer_bean_DetectorParam.class, com_ss_android_ugc_network_observer_bean_detectorparam);
            if (com_ss_android_ugc_network_observer_bean_detectorparam2 != null) {
                builder = com_ss_android_ugc_network_observer_bean_detectorparam2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 33044104:
                            builder.start_timeout((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 102678453:
                            builder.dns_timeout((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 111624426:
                            builder.frequency_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 150858468:
                            builder.black_timeout((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 204948227:
                            builder.tcp_timeout((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 205763963:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 215737240:
                            builder.ping_timeout((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (com_ss_android_ugc_network_observer_bean_detectorparam2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.target_list = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getTargetList() {
        return this.target_list;
    }

    public final Integer getBlackTimeout() throws NullValueException {
        if (this.black_timeout != null) {
            return this.black_timeout;
        }
        throw new NullValueException();
    }

    public final Integer getDnsTimeout() throws NullValueException {
        if (this.dns_timeout != null) {
            return this.dns_timeout;
        }
        throw new NullValueException();
    }

    public final Integer getFrequencyLimit() throws NullValueException {
        if (this.frequency_limit != null) {
            return this.frequency_limit;
        }
        throw new NullValueException();
    }

    public final Integer getPingTimeout() throws NullValueException {
        if (this.ping_timeout != null) {
            return this.ping_timeout;
        }
        throw new NullValueException();
    }

    public final Integer getStartTimeout() throws NullValueException {
        if (this.start_timeout != null) {
            return this.start_timeout;
        }
        throw new NullValueException();
    }

    public final Integer getTcpTimeout() throws NullValueException {
        if (this.tcp_timeout != null) {
            return this.tcp_timeout;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.start_timeout = this.start_timeout;
        builder.dns_timeout = this.dns_timeout;
        builder.ping_timeout = this.ping_timeout;
        builder.tcp_timeout = this.tcp_timeout;
        builder.black_timeout = this.black_timeout;
        builder.frequency_limit = this.frequency_limit;
        builder.target_list = Internal.copyOf("target_list", this.target_list);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.start_timeout != null) {
            i = this.start_timeout.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.dns_timeout != null) {
            i2 = this.dns_timeout.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.ping_timeout != null) {
            i3 = this.ping_timeout.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.tcp_timeout != null) {
            i4 = this.tcp_timeout.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.black_timeout != null) {
            i5 = this.black_timeout.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.frequency_limit != null) {
            i7 = this.frequency_limit.hashCode();
        }
        int hashCode2 = ((i12 + i7) * 37) + this.target_list.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start_timeout != null) {
            sb.append(", start_timeout=");
            sb.append(this.start_timeout);
        }
        if (this.dns_timeout != null) {
            sb.append(", dns_timeout=");
            sb.append(this.dns_timeout);
        }
        if (this.ping_timeout != null) {
            sb.append(", ping_timeout=");
            sb.append(this.ping_timeout);
        }
        if (this.tcp_timeout != null) {
            sb.append(", tcp_timeout=");
            sb.append(this.tcp_timeout);
        }
        if (this.black_timeout != null) {
            sb.append(", black_timeout=");
            sb.append(this.black_timeout);
        }
        if (this.frequency_limit != null) {
            sb.append(", frequency_limit=");
            sb.append(this.frequency_limit);
        }
        if (!this.target_list.isEmpty()) {
            sb.append(", target_list=");
            sb.append(this.target_list);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_network_observer_bean_DetectorParam{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com_ss_android_ugc_network_observer_bean_DetectorParam)) {
            return false;
        }
        com_ss_android_ugc_network_observer_bean_DetectorParam com_ss_android_ugc_network_observer_bean_detectorparam = (com_ss_android_ugc_network_observer_bean_DetectorParam) obj;
        if (!unknownFields().equals(com_ss_android_ugc_network_observer_bean_detectorparam.unknownFields()) || !Internal.equals(this.start_timeout, com_ss_android_ugc_network_observer_bean_detectorparam.start_timeout) || !Internal.equals(this.dns_timeout, com_ss_android_ugc_network_observer_bean_detectorparam.dns_timeout) || !Internal.equals(this.ping_timeout, com_ss_android_ugc_network_observer_bean_detectorparam.ping_timeout) || !Internal.equals(this.tcp_timeout, com_ss_android_ugc_network_observer_bean_detectorparam.tcp_timeout) || !Internal.equals(this.black_timeout, com_ss_android_ugc_network_observer_bean_detectorparam.black_timeout) || !Internal.equals(this.frequency_limit, com_ss_android_ugc_network_observer_bean_detectorparam.frequency_limit) || !this.target_list.equals(com_ss_android_ugc_network_observer_bean_detectorparam.target_list)) {
            return false;
        }
        return true;
    }

    public com_ss_android_ugc_network_observer_bean_DetectorParam(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List<String> list) {
        this(num, num2, num3, num4, num5, num6, list, ByteString.EMPTY);
    }

    public com_ss_android_ugc_network_observer_bean_DetectorParam(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_timeout = num;
        this.dns_timeout = num2;
        this.ping_timeout = num3;
        this.tcp_timeout = num4;
        this.black_timeout = num5;
        this.frequency_limit = num6;
        this.target_list = Internal.immutableCopyOf("target_list", list);
    }
}
