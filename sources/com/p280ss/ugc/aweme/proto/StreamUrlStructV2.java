package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.StreamUrlStructV2 */
public final class StreamUrlStructV2 extends Message<StreamUrlStructV2, Builder> {
    public static final ProtoAdapter<StreamUrlStructV2> ADAPTER = new ProtoAdapter_StreamUrlStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)

    /* renamed from: id */
    public String f118752id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer provider;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String rtmp_pull_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String rtmp_push_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long sid;

    /* renamed from: com.ss.ugc.aweme.proto.StreamUrlStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<StreamUrlStructV2, Builder> {
        public String extra;

        /* renamed from: id */
        public String f118753id;
        public Integer provider;
        public String rtmp_pull_url;
        public String rtmp_push_url;
        public Long sid;

        public final StreamUrlStructV2 build() {
            StreamUrlStructV2 streamUrlStructV2 = new StreamUrlStructV2(this.sid, this.rtmp_pull_url, this.rtmp_push_url, this.provider, this.extra, this.f118753id, super.buildUnknownFields());
            return streamUrlStructV2;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        /* renamed from: id */
        public final Builder mo113692id(String str) {
            this.f118753id = str;
            return this;
        }

        public final Builder provider(Integer num) {
            this.provider = num;
            return this;
        }

        public final Builder rtmp_pull_url(String str) {
            this.rtmp_pull_url = str;
            return this;
        }

        public final Builder rtmp_push_url(String str) {
            this.rtmp_push_url = str;
            return this;
        }

        public final Builder sid(Long l) {
            this.sid = l;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.StreamUrlStructV2$ProtoAdapter_StreamUrlStructV2 */
    static final class ProtoAdapter_StreamUrlStructV2 extends ProtoAdapter<StreamUrlStructV2> {
        public ProtoAdapter_StreamUrlStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, StreamUrlStructV2.class);
        }

        public final int encodedSize(StreamUrlStructV2 streamUrlStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, streamUrlStructV2.sid) + ProtoAdapter.STRING.encodedSizeWithTag(2, streamUrlStructV2.rtmp_pull_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, streamUrlStructV2.rtmp_push_url) + ProtoAdapter.INT32.encodedSizeWithTag(4, streamUrlStructV2.provider) + ProtoAdapter.STRING.encodedSizeWithTag(5, streamUrlStructV2.extra) + ProtoAdapter.STRING.encodedSizeWithTag(6, streamUrlStructV2.f118752id) + streamUrlStructV2.unknownFields().size();
        }

        public final StreamUrlStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.sid((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.rtmp_pull_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.rtmp_push_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.provider((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.mo113692id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, StreamUrlStructV2 streamUrlStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, streamUrlStructV2.sid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, streamUrlStructV2.rtmp_pull_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, streamUrlStructV2.rtmp_push_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, streamUrlStructV2.provider);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, streamUrlStructV2.extra);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, streamUrlStructV2.f118752id);
            protoWriter.writeBytes(streamUrlStructV2.unknownFields());
        }
    }

    public StreamUrlStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.sid = this.sid;
        builder.rtmp_pull_url = this.rtmp_pull_url;
        builder.rtmp_push_url = this.rtmp_push_url;
        builder.provider = this.provider;
        builder.extra = this.extra;
        builder.f118753id = this.f118752id;
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
        if (this.sid != null) {
            i = this.sid.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.rtmp_pull_url != null) {
            i2 = this.rtmp_pull_url.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.rtmp_push_url != null) {
            i3 = this.rtmp_push_url.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.provider != null) {
            i4 = this.provider.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.extra != null) {
            i5 = this.extra.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.f118752id != null) {
            i7 = this.f118752id.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sid != null) {
            sb.append(", sid=");
            sb.append(this.sid);
        }
        if (this.rtmp_pull_url != null) {
            sb.append(", rtmp_pull_url=");
            sb.append(this.rtmp_pull_url);
        }
        if (this.rtmp_push_url != null) {
            sb.append(", rtmp_push_url=");
            sb.append(this.rtmp_push_url);
        }
        if (this.provider != null) {
            sb.append(", provider=");
            sb.append(this.provider);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.f118752id != null) {
            sb.append(", id=");
            sb.append(this.f118752id);
        }
        StringBuilder replace = sb.replace(0, 2, "StreamUrlStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamUrlStructV2)) {
            return false;
        }
        StreamUrlStructV2 streamUrlStructV2 = (StreamUrlStructV2) obj;
        if (!unknownFields().equals(streamUrlStructV2.unknownFields()) || !Internal.equals(this.sid, streamUrlStructV2.sid) || !Internal.equals(this.rtmp_pull_url, streamUrlStructV2.rtmp_pull_url) || !Internal.equals(this.rtmp_push_url, streamUrlStructV2.rtmp_push_url) || !Internal.equals(this.provider, streamUrlStructV2.provider) || !Internal.equals(this.extra, streamUrlStructV2.extra) || !Internal.equals(this.f118752id, streamUrlStructV2.f118752id)) {
            return false;
        }
        return true;
    }

    public StreamUrlStructV2(Long l, String str, String str2, Integer num, String str3, String str4) {
        this(l, str, str2, num, str3, str4, ByteString.EMPTY);
    }

    public StreamUrlStructV2(Long l, String str, String str2, Integer num, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sid = l;
        this.rtmp_pull_url = str;
        this.rtmp_push_url = str2;
        this.provider = num;
        this.extra = str3;
        this.f118752id = str4;
    }
}
