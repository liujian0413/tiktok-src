package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.Response */
public final class Response extends Message<Response, Builder> {
    public static final ProtoAdapter<Response> ADAPTER = new ProtoAdapter_Response();
    public static final Integer DEFAULT_CMD = Integer.valueOf(0);
    public static final Integer DEFAULT_INBOX_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_SEQUENCE_ID = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS_CODE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.ResponseBody#ADAPTER", tag = 6)
    public final ResponseBody body;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer cmd;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String error_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final Map<String, String> headers;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer inbox_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String log_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long sequence_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer status_code;

    /* renamed from: com.bytedance.im.core.proto.Response$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<Response, Builder> {
        public ResponseBody body;
        public Integer cmd;
        public String error_desc;
        public Map<String, String> headers = Internal.newMutableMap();
        public Integer inbox_type;
        public String log_id;
        public Long sequence_id;
        public Integer status_code;

        public final Response build() {
            Response response = new Response(this.cmd, this.sequence_id, this.status_code, this.error_desc, this.inbox_type, this.body, this.log_id, this.headers, super.buildUnknownFields());
            return response;
        }

        public final Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public final Builder cmd(Integer num) {
            this.cmd = num;
            return this;
        }

        public final Builder error_desc(String str) {
            this.error_desc = str;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder log_id(String str) {
            this.log_id = str;
            return this;
        }

        public final Builder sequence_id(Long l) {
            this.sequence_id = l;
            return this;
        }

        public final Builder status_code(Integer num) {
            this.status_code = num;
            return this;
        }

        public final Builder headers(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.headers = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.Response$ProtoAdapter_Response */
    static final class ProtoAdapter_Response extends ProtoAdapter<Response> {
        private final ProtoAdapter<Map<String, String>> headers;

        public ProtoAdapter_Response() {
            super(FieldEncoding.LENGTH_DELIMITED, Response.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.headers = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final Response redact(Response response) {
            Builder newBuilder = response.newBuilder();
            if (newBuilder.body != null) {
                newBuilder.body = (ResponseBody) ResponseBody.ADAPTER.redact(newBuilder.body);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(Response response) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, response.cmd) + ProtoAdapter.INT64.encodedSizeWithTag(2, response.sequence_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, response.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, response.error_desc) + ProtoAdapter.INT32.encodedSizeWithTag(5, response.inbox_type) + ResponseBody.ADAPTER.encodedSizeWithTag(6, response.body) + ProtoAdapter.STRING.encodedSizeWithTag(7, response.log_id) + this.headers.encodedSizeWithTag(8, response.headers) + response.unknownFields().size();
        }

        public final Response decode(ProtoReader protoReader) throws IOException {
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
                            builder.status_code((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.error_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.inbox_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.body((ResponseBody) ResponseBody.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.log_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.headers.putAll((Map) this.headers.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, Response response) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, response.cmd);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, response.sequence_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, response.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, response.error_desc);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, response.inbox_type);
            ResponseBody.ADAPTER.encodeWithTag(protoWriter, 6, response.body);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, response.log_id);
            this.headers.encodeWithTag(protoWriter, 8, response.headers);
            protoWriter.writeBytes(response.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cmd = this.cmd;
        builder.sequence_id = this.sequence_id;
        builder.status_code = this.status_code;
        builder.error_desc = this.error_desc;
        builder.inbox_type = this.inbox_type;
        builder.body = this.body;
        builder.log_id = this.log_id;
        builder.headers = Internal.copyOf("headers", this.headers);
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
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i8 = 0;
        if (this.cmd != null) {
            i = this.cmd.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.sequence_id != null) {
            i2 = this.sequence_id.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.status_code != null) {
            i3 = this.status_code.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.error_desc != null) {
            i4 = this.error_desc.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.inbox_type != null) {
            i5 = this.inbox_type.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.body != null) {
            i6 = this.body.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.log_id != null) {
            i8 = this.log_id.hashCode();
        }
        int hashCode2 = ((i14 + i8) * 37) + this.headers.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
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
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        if (this.error_desc != null) {
            sb.append(", error_desc=");
            sb.append(this.error_desc);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.log_id != null) {
            sb.append(", log_id=");
            sb.append(this.log_id);
        }
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        StringBuilder replace = sb.replace(0, 2, "Response{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        if (!unknownFields().equals(response.unknownFields()) || !Internal.equals(this.cmd, response.cmd) || !Internal.equals(this.sequence_id, response.sequence_id) || !Internal.equals(this.status_code, response.status_code) || !Internal.equals(this.error_desc, response.error_desc) || !Internal.equals(this.inbox_type, response.inbox_type) || !Internal.equals(this.body, response.body) || !Internal.equals(this.log_id, response.log_id) || !this.headers.equals(response.headers)) {
            return false;
        }
        return true;
    }

    public Response(Integer num, Long l, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map) {
        this(num, l, num2, str, num3, responseBody, str2, map, ByteString.EMPTY);
    }

    public Response(Integer num, Long l, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd = num;
        this.sequence_id = l;
        this.status_code = num2;
        this.error_desc = str;
        this.inbox_type = num3;
        this.body = responseBody;
        this.log_id = str2;
        this.headers = Internal.immutableCopyOf("headers", map);
    }
}
