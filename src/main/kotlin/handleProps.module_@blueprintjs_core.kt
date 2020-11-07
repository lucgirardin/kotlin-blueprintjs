@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")


@file:JsModule("@blueprintjs/core")
package com.palantir.blueprintjs

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import React.CSSProperties

external object HandleType {
    var FULL: String /* "full" */
    var START: String /* "start" */
    var END: String /* "end" */
}

external object HandleInteractionKind {
    var LOCK: String /* "lock" */
    var PUSH: String /* "push" */
    var NONE: String /* "none" */
}

external interface IHandleProps : IProps {
    var value: Number
    var intentAfter: Any?
        get() = definedExternally
        set(value) = definedExternally
    var intentBefore: Any?
        get() = definedExternally
        set(value) = definedExternally
    var trackStyleAfter: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var trackStyleBefore: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var interactionKind: Any
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((newValue: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onRelease: ((newValue: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var type: Any
        get() = definedExternally
        set(value) = definedExternally
}