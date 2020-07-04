package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.Request */
public final class Request extends Message<Request, Builder> {
    public static final ProtoAdapter<Request> ADAPTER = new ProtoAdapter_Request();
    public static final Integer DEFAULT_CMD = Integer.valueOf(0);
    public static final Integer DEFAULT_CONFIG_ID = Integer.valueOf(0);
    public static final Integer DEFAULT_INBOX_TYPE = Integer.valueOf(0);
    public static final Refer DEFAULT_REFER = Refer.REFER_NOT_USED;
    public static final Long DEFAULT_SEQUENCE_ID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.RequestBody#ADAPTER", tag = 8)
    public final RequestBody body;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String build_number;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String channel;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer cmd;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 16)
    public final Integer config_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String device_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 11)
    public final String device_platform;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public final String device_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final Map<String, String> headers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer inbox_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public final String os_version;
    @WireField(adapter = "com.bytedance.im.core.proto.Refer#ADAPTER", tag = 5)
    public final Refer refer;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String sdk_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long sequence_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String token;
    @WireField(adapter = "com.bytedance.im.core.proto.TokenInfo#ADAPTER", tag = 17)
    public final TokenInfo token_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String version_code;

    /* renamed from: com.bytedance.im.core.proto.Request$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<Request, Builder> {
        public RequestBody body;
        public String build_number;
        public String channel;
        public Integer cmd;
        public Integer config_id;
        public String device_id;
        public String device_platform;
        public String device_type;
        public Map<String, String> headers = Internal.newMutableMap();
        public Integer inbox_type;
        public String os_version;
        public Refer refer;
        public String sdk_version;
        public Long sequence_id;
        public String token;
        public TokenInfo token_info;
        public String version_code;

        public final Request build() {
            Request request = new Request(this.cmd, this.sequence_id, this.sdk_version, this.token, this.refer, this.inbox_type, this.build_number, this.body, this.device_id, this.channel, this.device_platform, this.device_type, this.os_version, this.version_code, this.headers, this.config_id, this.token_info, super.buildUnknownFields());
            return request;
        }

        public final Builder body(RequestBody requestBody) {
            this.body = requestBody;
            return this;
        }

        public final Builder build_number(String str) {
            this.build_number = str;
            return this;
        }

        public final Builder channel(String str) {
            this.channel = str;
            return this;
        }

        public final Builder cmd(Integer num) {
            this.cmd = num;
            return this;
        }

        public final Builder config_id(Integer num) {
            this.config_id = num;
            return this;
        }

        public final Builder device_id(String str) {
            this.device_id = str;
            return this;
        }

        public final Builder device_platform(String str) {
            this.device_platform = str;
            return this;
        }

        public final Builder device_type(String str) {
            this.device_type = str;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder os_version(String str) {
            this.os_version = str;
            return this;
        }

        public final Builder refer(Refer refer2) {
            this.refer = refer2;
            return this;
        }

        public final Builder sdk_version(String str) {
            this.sdk_version = str;
            return this;
        }

        public final Builder sequence_id(Long l) {
            this.sequence_id = l;
            return this;
        }

        public final Builder token(String str) {
            this.token = str;
            return this;
        }

        public final Builder token_info(TokenInfo tokenInfo) {
            this.token_info = tokenInfo;
            return this;
        }

        public final Builder version_code(String str) {
            this.version_code = str;
            return this;
        }

        public final Builder headers(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.headers = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.Request$ProtoAdapter_Request */
    static final class ProtoAdapter_Request extends ProtoAdapter<Request> {
        private final ProtoAdapter<Map<String, String>> headers;

        public ProtoAdapter_Request() {
            super(FieldEncoding.LENGTH_DELIMITED, Request.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.headers = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final Request redact(Request request) {
            Builder newBuilder = request.newBuilder();
            if (newBuilder.body != null) {
                newBuilder.body = (RequestBody) RequestBody.ADAPTER.redact(newBuilder.body);
            }
            if (newBuilder.token_info != null) {
                newBuilder.token_info = (TokenInfo) TokenInfo.ADAPTER.redact(newBuilder.token_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(Request request) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, request.cmd) + ProtoAdapter.INT64.encodedSizeWithTag(2, request.sequence_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, request.sdk_version) + ProtoAdapter.STRING.encodedSizeWithTag(4, request.token) + Refer.ADAPTER.encodedSizeWithTag(5, request.refer) + ProtoAdapter.INT32.encodedSizeWithTag(6, request.inbox_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, request.build_number) + RequestBody.ADAPTER.encodedSizeWithTag(8, request.body) + ProtoAdapter.STRING.encodedSizeWithTag(9, request.device_id) + ProtoAdapter.STRING.encodedSizeWithTag(10, request.channel) + ProtoAdapter.STRING.encodedSizeWithTag(11, request.device_platform) + ProtoAdapter.STRING.encodedSizeWithTag(12, request.device_type) + ProtoAdapter.STRING.encodedSizeWithTag(13, request.os_version) + ProtoAdapter.STRING.encodedSizeWithTag(14, request.version_code) + this.headers.encodedSizeWithTag(15, request.headers) + ProtoAdapter.INT32.encodedSizeWithTag(16, request.config_id) + TokenInfo.ADAPTER.encodedSizeWithTag(17, request.token_info) + request.unknownFields().size();
        }

        public final Request decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cmd((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.sequence_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.sdk_version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.token((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            try {
                                builder.refer((Refer) Refer.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            builder.inbox_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.build_number((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.body((RequestBody) RequestBody.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.device_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.channel((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.device_platform((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.device_type((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.os_version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.version_code((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.headers.putAll((Map) this.headers.decode(protoReader));
                            break;
                        case 16:
                            builder.config_id((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 17:
                            builder.token_info((TokenInfo) TokenInfo.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, Request request) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, request.cmd);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, request.sequence_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, request.sdk_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, request.token);
            Refer.ADAPTER.encodeWithTag(protoWriter, 5, request.refer);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, request.inbox_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, request.build_number);
            RequestBody.ADAPTER.encodeWithTag(protoWriter, 8, request.body);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, request.device_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, request.channel);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, request.device_platform);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, request.device_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, request.os_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, request.version_code);
            this.headers.encodeWithTag(protoWriter, 15, request.headers);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 16, request.config_id);
            TokenInfo.ADAPTER.encodeWithTag(protoWriter, 17, request.token_info);
            protoWriter.writeBytes(request.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cmd = this.cmd;
        builder.sequence_id = this.sequence_id;
        builder.sdk_version = this.sdk_version;
        builder.token = this.token;
        builder.refer = this.refer;
        builder.inbox_type = this.inbox_type;
        builder.build_number = this.build_number;
        builder.body = this.body;
        builder.device_id = this.device_id;
        builder.channel = this.channel;
        builder.device_platform = this.device_platform;
        builder.device_type = this.device_type;
        builder.os_version = this.os_version;
        builder.version_code = this.version_code;
        builder.headers = Internal.copyOf("headers", this.headers);
        builder.config_id = this.config_id;
        builder.token_info = this.token_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.hashCode;
        if (i16 != 0) {
            return i16;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i17 = 0;
        if (this.cmd != null) {
            i = this.cmd.hashCode();
        } else {
            i = 0;
        }
        int i18 = (hashCode + i) * 37;
        if (this.sequence_id != null) {
            i2 = this.sequence_id.hashCode();
        } else {
            i2 = 0;
        }
        int i19 = (i18 + i2) * 37;
        if (this.sdk_version != null) {
            i3 = this.sdk_version.hashCode();
        } else {
            i3 = 0;
        }
        int i20 = (i19 + i3) * 37;
        if (this.token != null) {
            i4 = this.token.hashCode();
        } else {
            i4 = 0;
        }
        int i21 = (i20 + i4) * 37;
        if (this.refer != null) {
            i5 = this.refer.hashCode();
        } else {
            i5 = 0;
        }
        int i22 = (i21 + i5) * 37;
        if (this.inbox_type != null) {
            i6 = this.inbox_type.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (i22 + i6) * 37;
        if (this.build_number != null) {
            i7 = this.build_number.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 37;
        if (this.body != null) {
            i8 = this.body.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 37;
        if (this.device_id != null) {
            i9 = this.device_id.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 37;
        if (this.channel != null) {
            i10 = this.channel.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 37;
        if (this.device_platform != null) {
            i11 = this.device_platform.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 37;
        if (this.device_type != null) {
            i12 = this.device_type.hashCode();
        } else {
            i12 = 0;
        }
        int i29 = (i28 + i12) * 37;
        if (this.os_version != null) {
            i13 = this.os_version.hashCode();
        } else {
            i13 = 0;
        }
        int i30 = (i29 + i13) * 37;
        if (this.version_code != null) {
            i14 = this.version_code.hashCode();
        } else {
            i14 = 0;
        }
        int hashCode2 = (((i30 + i14) * 37) + this.headers.hashCode()) * 37;
        if (this.config_id != null) {
            i15 = this.config_id.hashCode();
        } else {
            i15 = 0;
        }
        int i31 = (hashCode2 + i15) * 37;
        if (this.token_info != null) {
            i17 = this.token_info.hashCode();
        }
        int i32 = i31 + i17;
        this.hashCode = i32;
        return i32;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        if (this.sdk_version != null) {
            sb.append(", sdk_version=");
            sb.append(this.sdk_version);
        }
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.refer != null) {
            sb.append(", refer=");
            sb.append(this.refer);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.build_number != null) {
            sb.append(", build_number=");
            sb.append(this.build_number);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.device_platform != null) {
            sb.append(", device_platform=");
            sb.append(this.device_platform);
        }
        if (this.device_type != null) {
            sb.append(", device_type=");
            sb.append(this.device_type);
        }
        if (this.os_version != null) {
            sb.append(", os_version=");
            sb.append(this.os_version);
        }
        if (this.version_code != null) {
            sb.append(", version_code=");
            sb.append(this.version_code);
        }
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.config_id != null) {
            sb.append(", config_id=");
            sb.append(this.config_id);
        }
        if (this.token_info != null) {
            sb.append(", token_info=");
            sb.append(this.token_info);
        }
        StringBuilder replace = sb.replace(0, 2, "Request{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        if (!unknownFields().equals(request.unknownFields()) || !Internal.equals(this.cmd, request.cmd) || !Internal.equals(this.sequence_id, request.sequence_id) || !Internal.equals(this.sdk_version, request.sdk_version) || !Internal.equals(this.token, request.token) || !Internal.equals(this.refer, request.refer) || !Internal.equals(this.inbox_type, request.inbox_type) || !Internal.equals(this.build_number, request.build_number) || !Internal.equals(this.body, request.body) || !Internal.equals(this.device_id, request.device_id) || !Internal.equals(this.channel, request.channel) || !Internal.equals(this.device_platform, request.device_platform) || !Internal.equals(this.device_type, request.device_type) || !Internal.equals(this.os_version, request.os_version) || !Internal.equals(this.version_code, request.version_code) || !this.headers.equals(request.headers) || !Internal.equals(this.config_id, request.config_id) || !Internal.equals(this.token_info, request.token_info)) {
            return false;
        }
        return true;
    }

    public Request(Integer num, Long l, String str, String str2, Refer refer2, Integer num2, String str3, RequestBody requestBody, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, Integer num3, TokenInfo tokenInfo) {
        this(num, l, str, str2, refer2, num2, str3, requestBody, str4, str5, str6, str7, str8, str9, map, num3, tokenInfo, ByteString.EMPTY);
    }

    public Request(Integer num, Long l, String str, String str2, Refer refer2, Integer num2, String str3, RequestBody requestBody, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, Integer num3, TokenInfo tokenInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd = num;
        this.sequence_id = l;
        this.sdk_version = str;
        this.token = str2;
        this.refer = refer2;
        this.inbox_type = num2;
        this.build_number = str3;
        this.body = requestBody;
        this.device_id = str4;
        this.channel = str5;
        this.device_platform = str6;
        this.device_type = str7;
        this.os_version = str8;
        this.version_code = str9;
        this.headers = Internal.immutableCopyOf("headers", map);
        this.config_id = num3;
        this.token_info = tokenInfo;
    }
}
