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

/* renamed from: com.ss.ugc.aweme.proto.EditHintV2 */
final class EditHintV2 extends Message<EditHintV2, Builder> {
    public static final ProtoAdapter<EditHintV2> ADAPTER = new ProtoAdapter_EditHintV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String hint;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String language;

    /* renamed from: com.ss.ugc.aweme.proto.EditHintV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<EditHintV2, Builder> {
        public String hint;
        public String language;

        public final EditHintV2 build() {
            return new EditHintV2(this.language, this.hint, super.buildUnknownFields());
        }

        public final Builder hint(String str) {
            this.hint = str;
            return this;
        }

        public final Builder language(String str) {
            this.language = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.EditHintV2$ProtoAdapter_EditHintV2 */
    static final class ProtoAdapter_EditHintV2 extends ProtoAdapter<EditHintV2> {
        public ProtoAdapter_EditHintV2() {
            super(FieldEncoding.LENGTH_DELIMITED, EditHintV2.class);
        }

        public final int encodedSize(EditHintV2 editHintV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, editHintV2.language) + ProtoAdapter.STRING.encodedSizeWithTag(2, editHintV2.hint) + editHintV2.unknownFields().size();
        }

        public final EditHintV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.language((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.hint((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, EditHintV2 editHintV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, editHintV2.language);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, editHintV2.hint);
            protoWriter.writeBytes(editHintV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.language = this.language;
        builder.hint = this.hint;
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
        if (this.language != null) {
            i = this.language.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.hint != null) {
            i3 = this.hint.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        if (this.hint != null) {
            sb.append(", hint=");
            sb.append(this.hint);
        }
        StringBuilder replace = sb.replace(0, 2, "EditHintV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EditHintV2)) {
            return false;
        }
        EditHintV2 editHintV2 = (EditHintV2) obj;
        if (!unknownFields().equals(editHintV2.unknownFields()) || !Internal.equals(this.language, editHintV2.language) || !Internal.equals(this.hint, editHintV2.hint)) {
            return false;
        }
        return true;
    }

    public EditHintV2(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public EditHintV2(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.language = str;
        this.hint = str2;
    }
}
