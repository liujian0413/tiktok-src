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

/* renamed from: com.ss.ugc.aweme.proto.AwemeAnchorStructV2 */
public final class AwemeAnchorStructV2 extends Message<AwemeAnchorStructV2, Builder> {
    public static final ProtoAdapter<AwemeAnchorStructV2> ADAPTER = new ProtoAdapter_AwemeAnchorStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 99)
    public String extra;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)

    /* renamed from: id */
    public String f118738id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String mp_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String web_url;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeAnchorStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeAnchorStructV2, Builder> {
        public String extra;
        public UrlStructV2 icon;

        /* renamed from: id */
        public String f118739id;
        public String mp_url;
        public String open_url;
        public String title;
        public Integer type;
        public String web_url;

        public final AwemeAnchorStructV2 build() {
            AwemeAnchorStructV2 awemeAnchorStructV2 = new AwemeAnchorStructV2(this.type, this.f118739id, this.icon, this.title, this.open_url, this.web_url, this.mp_url, this.extra, super.buildUnknownFields());
            return awemeAnchorStructV2;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        /* renamed from: id */
        public final Builder mo112574id(String str) {
            this.f118739id = str;
            return this;
        }

        public final Builder mp_url(String str) {
            this.mp_url = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeAnchorStructV2$ProtoAdapter_AwemeAnchorStructV2 */
    static final class ProtoAdapter_AwemeAnchorStructV2 extends ProtoAdapter<AwemeAnchorStructV2> {
        public ProtoAdapter_AwemeAnchorStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeAnchorStructV2.class);
        }

        public final int encodedSize(AwemeAnchorStructV2 awemeAnchorStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, awemeAnchorStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeAnchorStructV2.f118738id) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, awemeAnchorStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(4, awemeAnchorStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(5, awemeAnchorStructV2.open_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, awemeAnchorStructV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(7, awemeAnchorStructV2.mp_url) + ProtoAdapter.STRING.encodedSizeWithTag(99, awemeAnchorStructV2.extra) + awemeAnchorStructV2.unknownFields().size();
        }

        public final AwemeAnchorStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 99) {
                    switch (nextTag) {
                        case 1:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.mo112574id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.icon((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.open_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.mp_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, AwemeAnchorStructV2 awemeAnchorStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, awemeAnchorStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeAnchorStructV2.f118738id);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, awemeAnchorStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, awemeAnchorStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, awemeAnchorStructV2.open_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, awemeAnchorStructV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, awemeAnchorStructV2.mp_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 99, awemeAnchorStructV2.extra);
            protoWriter.writeBytes(awemeAnchorStructV2.unknownFields());
        }
    }

    public AwemeAnchorStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.f118739id = this.f118738id;
        builder.icon = this.icon;
        builder.title = this.title;
        builder.open_url = this.open_url;
        builder.web_url = this.web_url;
        builder.mp_url = this.mp_url;
        builder.extra = this.extra;
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
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i9 = 0;
        if (this.type != null) {
            i = this.type.hashCode();
        } else {
            i = 0;
        }
        int i10 = (hashCode + i) * 37;
        if (this.f118738id != null) {
            i2 = this.f118738id.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 37;
        if (this.icon != null) {
            i3 = this.icon.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        if (this.title != null) {
            i4 = this.title.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        if (this.open_url != null) {
            i5 = this.open_url.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        if (this.web_url != null) {
            i6 = this.web_url.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        if (this.mp_url != null) {
            i7 = this.mp_url.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.extra != null) {
            i9 = this.extra.hashCode();
        }
        int i17 = i16 + i9;
        this.hashCode = i17;
        return i17;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.f118738id != null) {
            sb.append(", id=");
            sb.append(this.f118738id);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        if (this.web_url != null) {
            sb.append(", web_url=");
            sb.append(this.web_url);
        }
        if (this.mp_url != null) {
            sb.append(", mp_url=");
            sb.append(this.mp_url);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeAnchorStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeAnchorStructV2)) {
            return false;
        }
        AwemeAnchorStructV2 awemeAnchorStructV2 = (AwemeAnchorStructV2) obj;
        if (!unknownFields().equals(awemeAnchorStructV2.unknownFields()) || !Internal.equals(this.type, awemeAnchorStructV2.type) || !Internal.equals(this.f118738id, awemeAnchorStructV2.f118738id) || !Internal.equals(this.icon, awemeAnchorStructV2.icon) || !Internal.equals(this.title, awemeAnchorStructV2.title) || !Internal.equals(this.open_url, awemeAnchorStructV2.open_url) || !Internal.equals(this.web_url, awemeAnchorStructV2.web_url) || !Internal.equals(this.mp_url, awemeAnchorStructV2.mp_url) || !Internal.equals(this.extra, awemeAnchorStructV2.extra)) {
            return false;
        }
        return true;
    }

    public AwemeAnchorStructV2(Integer num, String str, UrlStructV2 urlStructV2, String str2, String str3, String str4, String str5, String str6) {
        this(num, str, urlStructV2, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public AwemeAnchorStructV2(Integer num, String str, UrlStructV2 urlStructV2, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.f118738id = str;
        this.icon = urlStructV2;
        this.title = str2;
        this.open_url = str3;
        this.web_url = str4;
        this.mp_url = str5;
        this.extra = str6;
    }
}
