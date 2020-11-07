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
import React.ButtonHTMLAttributes
import React.AnchorHTMLAttributes

external open class Button(props: P, context: Any = definedExternally) : AbstractButton<ButtonHTMLAttributes<HTMLButtonElement>> {
    override var buttonRef: dynamic /* HTMLButtonElement? | IRefObject<HTMLButtonElement>? */
    open var handleRef: dynamic /* IRefObject<HTMLButtonElement> | (ref: HTMLButtonElement?) -> Unit */
    override fun render(): Element

    companion object {
        var displayName: String
    }
}

external open class AnchorButton(props: P, context: Any = definedExternally) : AbstractButton<AnchorHTMLAttributes<HTMLAnchorElement>> {
    override var buttonRef: dynamic /* HTMLAnchorElement? | IRefObject<HTMLAnchorElement>? */
    open var handleRef: dynamic /* IRefObject<HTMLAnchorElement> | (ref: HTMLAnchorElement?) -> Unit */
    override fun render(): Element

    companion object {
        var displayName: String
    }
}