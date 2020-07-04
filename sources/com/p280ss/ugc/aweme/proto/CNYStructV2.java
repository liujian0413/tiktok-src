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

/* renamed from: com.ss.ugc.aweme.proto.CNYStructV2 */
public final class CNYStructV2 extends Message<CNYStructV2, Builder> {
    public static final ProtoAdapter<CNYStructV2> ADAPTER = new ProtoAdapter_CNYStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long end_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer feed_show_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String live_info;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long start_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean topview_valid;

    /* renamed from: com.ss.ugc.aweme.proto.CNYStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CNYStructV2, Builder> {
        public Long end_time;
        public Integer feed_show_time;
        public String live_info;
        public Long start_time;
        public Boolean topview_valid;

        public final CNYStructV2 build() {
            CNYStructV2 cNYStructV2 = new CNYStructV2(this.start_time, this.end_time, this.topview_valid, this.feed_show_time, this.live_info, super.buildUnknownFields());
            return cNYStructV2;
        }

        public final Builder end_time(Long l) {
            this.end_time = l;
            return this;
        }

        public final Builder feed_show_time(Integer num) {
            this.feed_show_time = num;
            return this;
        }

        public final Builder live_info(String str) {
            this.live_info = str;
            return this;
        }

        public final Builder start_time(Long l) {
            this.start_time = l;
            return this;
        }

        public final Builder topview_valid(Boolean bool) {
            this.topview_valid = bool;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CNYStructV2$ProtoAdapter_CNYStructV2 */
    static final class ProtoAdapter_CNYStructV2 extends ProtoAdapter<CNYStructV2> {
        public ProtoAdapter_CNYStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CNYStructV2.class);
        }

        public final int encodedSize(CNYStructV2 cNYStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, cNYStructV2.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(2, cNYStructV2.end_time) + ProtoAdapter.BOOL.encodedSizeWithTag(3, cNYStructV2.topview_valid) + ProtoAdapter.INT32.encodedSizeWithTag(4, cNYStructV2.feed_show_time) + ProtoAdapter.STRING.encodedSizeWithTag(5, cNYStructV2.live_info) + cNYStructV2.unknownFields().size();
        }

        public final CNYStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.start_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.end_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.topview_valid((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.feed_show_time((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.live_info((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CNYStructV2 cNYStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cNYStructV2.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, cNYStructV2.end_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, cNYStructV2.topview_valid);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, cNYStructV2.feed_show_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, cNYStructV2.live_info);
            protoWriter.writeBytes(cNYStructV2.unknownFields());
        }
    }

    public CNYStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.topview_valid = this.topview_valid;
        builder.feed_show_time = this.feed_show_time;
        builder.live_info = this.live_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.start_time != null) {
            i = this.start_time.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.end_time != null) {
            i2 = this.end_time.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.topview_valid != null) {
            i3 = this.topview_valid.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.feed_show_time != null) {
            i4 = this.feed_show_time.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.live_info != null) {
            i6 = this.live_info.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.topview_valid != null) {
            sb.append(", topview_valid=");
            sb.append(this.topview_valid);
        }
        if (this.feed_show_time != null) {
            sb.append(", feed_show_time=");
            sb.append(this.feed_show_time);
        }
        if (this.live_info != null) {
            sb.append(", live_info=");
            sb.append(this.live_info);
        }
        StringBuilder replace = sb.replace(0, 2, "CNYStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CNYStructV2)) {
            return false;
        }
        CNYStructV2 cNYStructV2 = (CNYStructV2) obj;
        if (!unknownFields().equals(cNYStructV2.unknownFields()) || !Internal.equals(this.start_time, cNYStructV2.start_time) || !Internal.equals(this.end_time, cNYStructV2.end_time) || !Internal.equals(this.topview_valid, cNYStructV2.topview_valid) || !Internal.equals(this.feed_show_time, cNYStructV2.feed_show_time) || !Internal.equals(this.live_info, cNYStructV2.live_info)) {
            return false;
        }
        return true;
    }

    public CNYStructV2(Long l, Long l2, Boolean bool, Integer num, String str) {
        this(l, l2, bool, num, str, ByteString.EMPTY);
    }

    public CNYStructV2(Long l, Long l2, Boolean bool, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.end_time = l2;
        this.topview_valid = bool;
        this.feed_show_time = num;
        this.live_info = str;
    }
}
