package net.adoptopenjdk.api.v3.models

import org.eclipse.microprofile.openapi.annotations.enums.SchemaType
import org.eclipse.microprofile.openapi.annotations.media.Schema

@Schema(type = SchemaType.STRING, enumeration = ["jdk", "jre", "testimage", "debugimage", "staticlibs"], example = "jdk")
enum class ImageType : FileNameMatcher {
    jdk, jre, testimage, debugimage, staticlibs("static-libs");

    override lateinit var names: List<String>

    constructor(vararg alternativeNames: String) {
        setNames(name, alternativeNames.toList())
    }
}
