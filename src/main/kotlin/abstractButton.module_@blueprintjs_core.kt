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
import React.FocusEvent
import React.KeyboardEvent
import global.JSX.Element
import React.HTMLAttributes

external interface IButtonProps : IActionProps, IElementRefProps<Any> {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alignText: Any?
        get() = definedExternally
        set(value) = definedExternally
    var fill: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var loading: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minimal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var outlined: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rightIcon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var small: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "submit" | "reset" | "button" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface IButtonState {
    var isActive: Boolean
}

external interface `T$24` {
    var className: String
    var disabled: dynamic /* Any | Any */
        get() = definedExternally
        set(value) = definedExternally
    var onBlur: (e: FocusEvent<Any>) -> Unit
    var onClick: Any
    var onKeyDown: (e: KeyboardEvent<Any>) -> Unit
    var onKeyUp: (e: KeyboardEvent<Any>) -> Unit
    var tabIndex: dynamic /* Number? | Any */
        get() = definedExternally
        set(value) = definedExternally
}

external open class AbstractButton<H : HTMLAttributes<HTMLElement>>(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<IButtonProps /* IButtonProps & H */, IButtonState> {
    open var buttonRef: dynamic /* HTMLElement? | IRefObject<HTMLElement>? */
    open var currentKeyDown: Any
    override fun render(): Element
    open fun getCommonButtonProps(): `T$24`
    open var handleKeyDown: (e: KeyboardEvent<Any>) -> Unit
    open var handleKeyUp: (e: KeyboardEvent<Any>) -> Unit
    open var handleBlur: (e: FocusEvent<Any>) -> Unit
    open fun renderChildren(): dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
}