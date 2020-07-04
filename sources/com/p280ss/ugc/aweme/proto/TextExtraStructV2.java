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

/* renamed from: com.ss.ugc.aweme.proto.TextExtraStructV2 */
public final class TextExtraStructV2 extends Message<TextExtraStructV2, Builder> {
    public static final ProtoAdapter<TextExtraStructV2> ADAPTER = new ProtoAdapter_TextExtraStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public String aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer end;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String hashTagName;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String hashtag_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String hashtag_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public Boolean is_commerce;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public String sec_uid;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer start;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String user_id;

    /* renamed from: com.ss.ugc.aweme.proto.TextExtraStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<TextExtraStructV2, Builder> {
        public String aweme_id;
        public Integer end;
        public String hashTagName;
        public String hashtag_id;
        public String hashtag_name;
        public Boolean is_commerce;
        public String sec_uid;
        public Integer start;
        public Integer type;
        public String user_id;

        public final TextExtraStructV2 build() {
            TextExtraStructV2 textExtraStructV2 = new TextExtraStructV2(this.start, this.end, this.user_id, this.type, this.hashtag_name, this.hashtag_id, this.is_commerce, this.hashTagName, this.sec_uid, this.aweme_id, super.buildUnknownFields());
            return textExtraStructV2;
        }

        public final Builder aweme_id(String str) {
            this.aweme_id = str;
            return this;
        }

        public final Builder end(Integer num) {
            this.end = num;
            return this;
        }

        public final Builder hashTagName(String str) {
            this.hashTagName = str;
            return this;
        }

        public final Builder hashtag_id(String str) {
            this.hashtag_id = str;
            return this;
        }

        public final Builder hashtag_name(String str) {
            this.hashtag_name = str;
            return this;
        }

        public final Builder is_commerce(Boolean bool) {
            this.is_commerce = bool;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder start(Integer num) {
            this.start = num;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder user_id(String str) {
            this.user_id = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.TextExtraStructV2$ProtoAdapter_TextExtraStructV2 */
    static final class ProtoAdapter_TextExtraStructV2 extends ProtoAdapter<TextExtraStructV2> {
        public ProtoAdapter_TextExtraStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, TextExtraStructV2.class);
        }

        public final int encodedSize(TextExtraStructV2 textExtraStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, textExtraStructV2.start) + ProtoAdapter.INT32.encodedSizeWithTag(2, textExtraStructV2.end) + ProtoAdapter.STRING.encodedSizeWithTag(3, textExtraStructV2.user_id) + ProtoAdapter.INT32.encodedSizeWithTag(4, textExtraStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(5, textExtraStructV2.hashtag_name) + ProtoAdapter.STRING.encodedSizeWithTag(6, textExtraStructV2.hashtag_id) + ProtoAdapter.BOOL.encodedSizeWithTag(7, textExtraStructV2.is_commerce) + ProtoAdapter.STRING.encodedSizeWithTag(8, textExtraStructV2.hashTagName) + ProtoAdapter.STRING.encodedSizeWithTag(9, textExtraStructV2.sec_uid) + ProtoAdapter.STRING.encodedSizeWithTag(10, textExtraStructV2.aweme_id) + textExtraStructV2.unknownFields().size();
        }

        public final TextExtraStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.start((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.end((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.user_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.hashtag_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.hashtag_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.is_commerce((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 8:
                            builder.hashTagName((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.sec_uid((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.aweme_id((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, TextExtraStructV2 textExtraStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, textExtraStructV2.start);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, textExtraStructV2.end);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, textExtraStructV2.user_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, textExtraStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, textExtraStructV2.hashtag_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, textExtraStructV2.hashtag_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, textExtraStructV2.is_commerce);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, textExtraStructV2.hashTagName);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, textExtraStructV2.sec_uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, textExtraStructV2.aweme_id);
            protoWriter.writeBytes(textExtraStructV2.unknownFields());
        }
    }

    public TextExtraStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.start = this.start;
        builder.end = this.end;
        builder.user_id = this.user_id;
        builder.type = this.type;
        builder.hashtag_name = this.hashtag_name;
        builder.hashtag_id = this.hashtag_id;
        builder.is_commerce = this.is_commerce;
        builder.hashTagName = this.hashTagName;
        builder.sec_uid = this.sec_uid;
        builder.aweme_id = this.aweme_id;
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
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i11 = 0;
        if (this.start != null) {
            i = this.start.hashCode();
        } else {
            i = 0;
        }
        int i12 = (hashCode + i) * 37;
        if (this.end != null) {
            i2 = this.end.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 37;
        if (this.user_id != null) {
            i3 = this.user_id.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 37;
        if (this.type != null) {
            i4 = this.type.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 37;
        if (this.hashtag_name != null) {
            i5 = this.hashtag_name.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 37;
        if (this.hashtag_id != null) {
            i6 = this.hashtag_id.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 37;
        if (this.is_commerce != null) {
            i7 = this.is_commerce.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 37;
        if (this.hashTagName != null) {
            i8 = this.hashTagName.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 37;
        if (this.sec_uid != null) {
            i9 = this.sec_uid.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 37;
        if (this.aweme_id != null) {
            i11 = this.aweme_id.hashCode();
        }
        int i21 = i20 + i11;
        this.hashCode = i21;
        return i21;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.start != null) {
            sb.append(", start=");
            sb.append(this.start);
        }
        if (this.end != null) {
            sb.append(", end=");
            sb.append(this.end);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.hashtag_name != null) {
            sb.append(", hashtag_name=");
            sb.append(this.hashtag_name);
        }
        if (this.hashtag_id != null) {
            sb.append(", hashtag_id=");
            sb.append(this.hashtag_id);
        }
        if (this.is_commerce != null) {
            sb.append(", is_commerce=");
            sb.append(this.is_commerce);
        }
        if (this.hashTagName != null) {
            sb.append(", hashTagName=");
            sb.append(this.hashTagName);
        }
        if (this.sec_uid != null) {
            sb.append(", sec_uid=");
            sb.append(this.sec_uid);
        }
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        StringBuilder replace = sb.replace(0, 2, "TextExtraStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextExtraStructV2)) {
            return false;
        }
        TextExtraStructV2 textExtraStructV2 = (TextExtraStructV2) obj;
        if (!unknownFields().equals(textExtraStructV2.unknownFields()) || !Internal.equals(this.start, textExtraStructV2.start) || !Internal.equals(this.end, textExtraStructV2.end) || !Internal.equals(this.user_id, textExtraStructV2.user_id) || !Internal.equals(this.type, textExtraStructV2.type) || !Internal.equals(this.hashtag_name, textExtraStructV2.hashtag_name) || !Internal.equals(this.hashtag_id, textExtraStructV2.hashtag_id) || !Internal.equals(this.is_commerce, textExtraStructV2.is_commerce) || !Internal.equals(this.hashTagName, textExtraStructV2.hashTagName) || !Internal.equals(this.sec_uid, textExtraStructV2.sec_uid) || !Internal.equals(this.aweme_id, textExtraStructV2.aweme_id)) {
            return false;
        }
        return true;
    }

    public TextExtraStructV2(Integer num, Integer num2, String str, Integer num3, String str2, String str3, Boolean bool, String str4, String str5, String str6) {
        this(num, num2, str, num3, str2, str3, bool, str4, str5, str6, ByteString.EMPTY);
    }

    public TextExtraStructV2(Integer num, Integer num2, String str, Integer num3, String str2, String str3, Boolean bool, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start = num;
        this.end = num2;
        this.user_id = str;
        this.type = num3;
        this.hashtag_name = str2;
        this.hashtag_id = str3;
        this.is_commerce = bool;
        this.hashTagName = str4;
        this.sec_uid = str5;
        this.aweme_id = str6;
    }
}
