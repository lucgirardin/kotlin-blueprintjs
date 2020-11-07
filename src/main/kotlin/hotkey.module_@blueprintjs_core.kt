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
import global.JSX.Element

external interface IHotkeyProps : IProps {
    var allowInInput: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var combo: String
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var global: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var group: String?
        get() = definedExternally
        set(value) = definedExternally
    var preventDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stopPropagation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    val onKeyDown: ((e: KeyboardEvent) -> Any)?
    val onKeyUp: ((e: KeyboardEvent) -> Any)?
}

external interface `T$31` {
    var allowInInput: Boolean
    var disabled: Boolean
    var global: Boolean
    var preventDefault: Boolean
    var stopPropagation: Boolean
}

external open class Hotkey(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IHotkeyProps> {
    override fun render(): Element
    override fun validateProps(props: IHotkeyProps)

    companion object {
        var displayName: String
        var defaultProps: `T$31`
    }
}