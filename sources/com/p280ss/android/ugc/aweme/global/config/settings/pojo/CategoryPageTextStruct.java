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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryPageTextStruct */
public final class CategoryPageTextStruct extends Message<CategoryPageTextStruct, Builder> {
    public static final DefaultValueProtoAdapter<CategoryPageTextStruct> ADAPTER = new ProtoAdapter_CategoryPageTextStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String description;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryPageTextStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CategoryPageTextStruct, Builder> {
        public String description;
        public String title;

        public final CategoryPageTextStruct build() {
            return new CategoryPageTextStruct(this.title, this.description, super.buildUnknownFields());
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryPageTextStruct$ProtoAdapter_CategoryPageTextStruct */
    static final class ProtoAdapter_CategoryPageTextStruct extends DefaultValueProtoAdapter<CategoryPageTextStruct> {
        public final CategoryPageTextStruct redact(CategoryPageTextStruct categoryPageTextStruct) {
            return categoryPageTextStruct;
        }

        public ProtoAdapter_CategoryPageTextStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, CategoryPageTextStruct.class);
        }

        public final CategoryPageTextStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (CategoryPageTextStruct) null);
        }

        public final int encodedSize(CategoryPageTextStruct categoryPageTextStruct) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, categoryPageTextStruct.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, categoryPageTextStruct.description) + categoryPageTextStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, CategoryPageTextStruct categoryPageTextStruct) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, categoryPageTextStruct.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, categoryPageTextStruct.description);
            protoWriter.writeBytes(categoryPageTextStruct.unknownFields());
        }

        public final CategoryPageTextStruct decode(ProtoReader protoReader, CategoryPageTextStruct categoryPageTextStruct) throws IOException {
            Builder builder;
            CategoryPageTextStruct categoryPageTextStruct2 = (CategoryPageTextStruct) C10938a.m32097a().mo26425a(CategoryPageTextStruct.class, categoryPageTextStruct);
            if (categoryPageTextStruct2 != null) {
                builder = categoryPageTextStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.description((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (categoryPageTextStruct2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getDescription() throws NullValueException {
        if (this.description != null) {
            return this.description;
        }
        throw new NullValueException();
    }

    public final String getTitle() throws NullValueException {
        if (this.title != null) {
            return this.title;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.description = this.description;
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
        if (this.description != null) {
            i3 = this.description.hashCode();
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
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        StringBuilder replace = sb.replace(0, 2, "CategoryPageTextStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryPageTextStruct)) {
            return false;
        }
        CategoryPageTextStruct categoryPageTextStruct = (CategoryPageTextStruct) obj;
        if (!unknownFields().equals(categoryPageTextStruct.unknownFields()) || !Internal.equals(this.title, categoryPageTextStruct.title) || !Internal.equals(this.description, categoryPageTextStruct.description)) {
            return false;
        }
        return true;
    }

    public CategoryPageTextStruct(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CategoryPageTextStruct(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.description = str2;
    }
}
