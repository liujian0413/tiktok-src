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

/* renamed from: com.ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2 */
public final class WebcastRoomFeedCellStructV2 extends Message<WebcastRoomFeedCellStructV2, Builder> {
    public static final ProtoAdapter<WebcastRoomFeedCellStructV2> ADAPTER = new ProtoAdapter_WebcastRoomFeedCellStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String distance;
    @WireField(adapter = "com.ss.ugc.aweme.proto.FansStructV2#ADAPTER", tag = 3)
    public FansStructV2 fans_struct;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 6)
    public UrlStructV2 icon;
    @WireField(adapter = "com.ss.ugc.aweme.proto.WebcastRoomStructV2#ADAPTER", tag = 1)
    public WebcastRoomStructV2 room;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String tag;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 5)
    public Long tag_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer type;

    /* renamed from: com.ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<WebcastRoomFeedCellStructV2, Builder> {
        public String distance;
        public FansStructV2 fans_struct;
        public UrlStructV2 icon;
        public WebcastRoomStructV2 room;
        public String tag;
        public Long tag_id;
        public Integer type;

        public final WebcastRoomFeedCellStructV2 build() {
            WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2 = new WebcastRoomFeedCellStructV2(this.room, this.type, this.fans_struct, this.tag, this.tag_id, this.icon, this.distance, super.buildUnknownFields());
            return webcastRoomFeedCellStructV2;
        }

        public final Builder distance(String str) {
            this.distance = str;
            return this;
        }

        public final Builder fans_struct(FansStructV2 fansStructV2) {
            this.fans_struct = fansStructV2;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder room(WebcastRoomStructV2 webcastRoomStructV2) {
            this.room = webcastRoomStructV2;
            return this;
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final Builder tag_id(Long l) {
            this.tag_id = l;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.WebcastRoomFeedCellStructV2$ProtoAdapter_WebcastRoomFeedCellStructV2 */
    static final class ProtoAdapter_WebcastRoomFeedCellStructV2 extends ProtoAdapter<WebcastRoomFeedCellStructV2> {
        public ProtoAdapter_WebcastRoomFeedCellStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, WebcastRoomFeedCellStructV2.class);
        }

        public final int encodedSize(WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2) {
            return WebcastRoomStructV2.ADAPTER.encodedSizeWithTag(1, webcastRoomFeedCellStructV2.room) + ProtoAdapter.INT32.encodedSizeWithTag(2, webcastRoomFeedCellStructV2.type) + FansStructV2.ADAPTER.encodedSizeWithTag(3, webcastRoomFeedCellStructV2.fans_struct) + ProtoAdapter.STRING.encodedSizeWithTag(4, webcastRoomFeedCellStructV2.tag) + ProtoAdapter.INT64.encodedSizeWithTag(5, webcastRoomFeedCellStructV2.tag_id) + UrlStructV2.ADAPTER.encodedSizeWithTag(6, webcastRoomFeedCellStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(7, webcastRoomFeedCellStructV2.distance) + webcastRoomFeedCellStructV2.unknownFields().size();
        }

        public final WebcastRoomFeedCellStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.room((WebcastRoomStructV2) WebcastRoomStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.fans_struct((FansStructV2) FansStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.tag((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.tag_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.icon((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.distance((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2) throws IOException {
            WebcastRoomStructV2.ADAPTER.encodeWithTag(protoWriter, 1, webcastRoomFeedCellStructV2.room);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, webcastRoomFeedCellStructV2.type);
            FansStructV2.ADAPTER.encodeWithTag(protoWriter, 3, webcastRoomFeedCellStructV2.fans_struct);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, webcastRoomFeedCellStructV2.tag);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, webcastRoomFeedCellStructV2.tag_id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 6, webcastRoomFeedCellStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, webcastRoomFeedCellStructV2.distance);
            protoWriter.writeBytes(webcastRoomFeedCellStructV2.unknownFields());
        }
    }

    public WebcastRoomFeedCellStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.room = this.room;
        builder.type = this.type;
        builder.fans_struct = this.fans_struct;
        builder.tag = this.tag;
        builder.tag_id = this.tag_id;
        builder.icon = this.icon;
        builder.distance = this.distance;
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
        if (this.room != null) {
            i = this.room.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.type != null) {
            i2 = this.type.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.fans_struct != null) {
            i3 = this.fans_struct.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.tag != null) {
            i4 = this.tag.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.tag_id != null) {
            i5 = this.tag_id.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.icon != null) {
            i6 = this.icon.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.distance != null) {
            i8 = this.distance.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.room != null) {
            sb.append(", room=");
            sb.append(this.room);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.fans_struct != null) {
            sb.append(", fans_struct=");
            sb.append(this.fans_struct);
        }
        if (this.tag != null) {
            sb.append(", tag=");
            sb.append(this.tag);
        }
        if (this.tag_id != null) {
            sb.append(", tag_id=");
            sb.append(this.tag_id);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.distance != null) {
            sb.append(", distance=");
            sb.append(this.distance);
        }
        StringBuilder replace = sb.replace(0, 2, "WebcastRoomFeedCellStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebcastRoomFeedCellStructV2)) {
            return false;
        }
        WebcastRoomFeedCellStructV2 webcastRoomFeedCellStructV2 = (WebcastRoomFeedCellStructV2) obj;
        if (!unknownFields().equals(webcastRoomFeedCellStructV2.unknownFields()) || !Internal.equals(this.room, webcastRoomFeedCellStructV2.room) || !Internal.equals(this.type, webcastRoomFeedCellStructV2.type) || !Internal.equals(this.fans_struct, webcastRoomFeedCellStructV2.fans_struct) || !Internal.equals(this.tag, webcastRoomFeedCellStructV2.tag) || !Internal.equals(this.tag_id, webcastRoomFeedCellStructV2.tag_id) || !Internal.equals(this.icon, webcastRoomFeedCellStructV2.icon) || !Internal.equals(this.distance, webcastRoomFeedCellStructV2.distance)) {
            return false;
        }
        return true;
    }

    public WebcastRoomFeedCellStructV2(WebcastRoomStructV2 webcastRoomStructV2, Integer num, FansStructV2 fansStructV2, String str, Long l, UrlStructV2 urlStructV2, String str2) {
        this(webcastRoomStructV2, num, fansStructV2, str, l, urlStructV2, str2, ByteString.EMPTY);
    }

    public WebcastRoomFeedCellStructV2(WebcastRoomStructV2 webcastRoomStructV2, Integer num, FansStructV2 fansStructV2, String str, Long l, UrlStructV2 urlStructV2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room = webcastRoomStructV2;
        this.type = num;
        this.fans_struct = fansStructV2;
        this.tag = str;
        this.tag_id = l;
        this.icon = urlStructV2;
        this.distance = str2;
    }
}
