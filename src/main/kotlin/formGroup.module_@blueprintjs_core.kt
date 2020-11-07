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
import global.JSX.Element

external interface IFormGroupProps : IIntentProps, IProps {
    var contentClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var helperText: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var inline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var labelFor: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelInfo: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var style: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
}

external open class FormGroup(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IFormGroupProps> {
    override fun render(): Element
    open var getClassName: Any

    companion object {
        var displayName: String
    }
}