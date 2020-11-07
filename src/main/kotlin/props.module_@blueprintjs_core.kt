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
import React.HTMLAttributes
import React.InputHTMLAttributes
import React.MouseEvent__1
import React.FormEventHandler

external var DISPLAYNAME_PREFIX: Any

typealias HTMLDivProps = HTMLAttributes<HTMLDivElement>

typealias HTMLInputProps = InputHTMLAttributes<HTMLInputElement>

external interface IProps {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IIntentProps {
    var intent: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IActionProps : IIntentProps, IProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* Any | JSX.Element? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var onClick: ((event: MouseEvent__1<HTMLElement>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var text: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ILinkProps {
    var href: String?
        get() = definedExternally
        set(value) = definedExternally
    var target: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IControlledProps {
    var defaultValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: FormEventHandler<HTMLElement>?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IElementRefProps<E : HTMLElement> {
    var elementRef: dynamic /* IRefObject<E>? | IRefCallback<E>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOptionProps : IProps {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external fun removeNonHTMLProps(props: Json, invalidProps: Array<String> = definedExternally, shouldMerge: Boolean = definedExternally): Json