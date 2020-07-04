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

/* renamed from: com.ss.ugc.aweme.proto.AnnouncementStructV2 */
public final class AnnouncementStructV2 extends Message<AnnouncementStructV2, Builder> {
    public static final ProtoAdapter<AnnouncementStructV2> ADAPTER = new ProtoAdapter_AnnouncementStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String body;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;

    /* renamed from: com.ss.ugc.aweme.proto.AnnouncementStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AnnouncementStructV2, Builder> {
        public String body;
        public String title;

        public final AnnouncementStructV2 build() {
            return new AnnouncementStructV2(this.title, this.body, super.buildUnknownFields());
        }

        public final Builder body(String str) {
            this.body = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnnouncementStructV2$ProtoAdapter_AnnouncementStructV2 */
    static final class ProtoAdapter_AnnouncementStructV2 extends ProtoAdapter<AnnouncementStructV2> {
        public ProtoAdapter_AnnouncementStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnnouncementStructV2.class);
        }

        public final int encodedSize(AnnouncementStructV2 announcementStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, announcementStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, announcementStructV2.body) + announcementStructV2.unknownFields().size();
        }

        public final AnnouncementStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.body((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AnnouncementStructV2 announcementStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, announcementStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, announcementStructV2.body);
            protoWriter.writeBytes(announcementStructV2.unknownFields());
        }
    }

    public AnnouncementStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.body = this.body;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.title != null) {
            i = this.title.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.body != null) {
            i3 = this.body.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        StringBuilder replace = sb.replace(0, 2, "AnnouncementStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnnouncementStructV2)) {
            return false;
        }
        AnnouncementStructV2 announcementStructV2 = (AnnouncementStructV2) obj;
        if (!unknownFields().equals(announcementStructV2.unknownFields()) || !Internal.equals(this.title, announcementStructV2.title) || !Internal.equals(this.body, announcementStructV2.body)) {
            return false;
        }
        return true;
    }

    public AnnouncementStructV2(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public AnnouncementStructV2(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.body = str2;
    }
}
